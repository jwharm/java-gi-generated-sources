package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class HarfBuzz {
    
    public static final int AAT_LAYOUT_NO_SELECTOR_INDEX = 65535;

    public static final int BUFFER_REPLACEMENT_CODEPOINT_DEFAULT = 65533;

    public static final int FEATURE_GLOBAL_START = 0;

    public static final int OT_LAYOUT_DEFAULT_LANGUAGE_INDEX = 65535;

    public static final int OT_LAYOUT_NO_FEATURE_INDEX = 65535;

    public static final int OT_LAYOUT_NO_SCRIPT_INDEX = 65535;

    public static final int OT_MAX_TAGS_PER_LANGUAGE = 3;

    public static final int OT_MAX_TAGS_PER_SCRIPT = 3;

    public static final int UNICODE_MAX = 1114111;

    public static final int UNICODE_MAX_DECOMPOSITION_LEN = 19;

    public static final int VERSION_MAJOR = 4;

    public static final int VERSION_MICRO = 0;

    public static final int VERSION_MINOR = 0;

    public static final java.lang.String VERSION_STRING = "4.0.0";

    /**
     * Fetches the name identifier of the specified feature type in the face's {@code name} table.
     */
    public static OtNameIdT aatLayoutFeatureTypeGetNameId(FaceT face, AatLayoutFeatureTypeT featureType) {
        var RESULT = gtk_h.hb_aat_layout_feature_type_get_name_id(face.handle(), featureType.getValue());
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Fetches a list of the selectors available for the specified feature in the given face.
     * <p>
     * If upon return, {@code default_index} is set to {@code HB_AAT_LAYOUT_NO_SELECTOR_INDEX}, then
     * the feature type is non-exclusive.  Otherwise, {@code default_index} is the index of
     * the selector that is selected by default.
     */
    public static int aatLayoutFeatureTypeGetSelectorInfos(FaceT face, AatLayoutFeatureTypeT featureType, int startOffset, PointerInteger selectorCount, AatLayoutFeatureSelectorInfoT[] selectors, PointerInteger defaultIndex) {
        var RESULT = gtk_h.hb_aat_layout_feature_type_get_selector_infos(face.handle(), featureType.getValue(), startOffset, selectorCount.handle(), Interop.allocateNativeArray(selectors).handle(), defaultIndex.handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of the AAT feature types included in the specified face.
     */
    public static int aatLayoutGetFeatureTypes(FaceT face, int startOffset, PointerInteger featureCount, AatLayoutFeatureTypeT[] features) {
        var RESULT = gtk_h.hb_aat_layout_get_feature_types(face.handle(), startOffset, featureCount.handle(), Interop.allocateNativeArray(AatLayoutFeatureTypeT.getValues(features)).handle());
        return RESULT;
    }
    
    /**
     * Tests whether the specified face includes any positioning information
     * in the {@code kerx} table.
     * <p>
     * &lt;note>Note: does not examine the `GPOS` table.</note&gt;
     */
    public static BoolT aatLayoutHasPositioning(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_positioning(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any substitutions in the
     * {@code morx} or {@code mort} tables.
     * <p>
     * &lt;note>Note: does not examine the `GSUB` table.</note&gt;
     */
    public static BoolT aatLayoutHasSubstitution(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_substitution(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any tracking information
     * in the {@code trak} table.
     */
    public static BoolT aatLayoutHasTracking(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_tracking(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes a writable copy of {@code blob}.
     */
    public static BlobT blobCopyWritableOrFail(BlobT blob) {
        var RESULT = gtk_h.hb_blob_copy_writable_or_fail(blob.handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFile(java.lang.String fileName) {
        var RESULT = gtk_h.hb_blob_create_from_file(Interop.allocateNativeString(fileName).handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFileOrFail(java.lang.String fileName) {
        var RESULT = gtk_h.hb_blob_create_from_file_or_fail(Interop.allocateNativeString(fileName).handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns a blob that represents a range of bytes in {@code parent}.  The new
     * blob is always created with {@code HB_MEMORY_MODE_READONLY}, meaning that it
     * will never modify data in the parent blob.  The parent data is not
     * expected to be modified, and will result in undefined behavior if it
     * is.
     * <p>
     * Makes {@code parent} immutable.
     */
    public static BlobT blobCreateSubBlob(BlobT parent, int offset, int length) {
        var RESULT = gtk_h.hb_blob_create_sub_blob(parent.handle(), offset, length);
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on {@code blob}, and if it reaches zero, destroys
     * {@code blob}, freeing all memory, possibly calling the destroy-callback the blob
     * was created for if it has not been called already.
     * <p>
     * See TODO:link object types for more information.
     */
    public static void blobDestroy(BlobT blob) {
        gtk_h.hb_blob_destroy(blob.handle());
    }
    
    /**
     * Fetches the data from a blob.
     */
    public static PointerIterator<java.lang.String> blobGetData(BlobT blob, PointerInteger length) {
        var RESULT = gtk_h.hb_blob_get_data(blob.handle(), length.handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Tries to make blob data writable (possibly copying it) and
     * return pointer to data.
     * <p>
     * Fails if blob has been made immutable, or if memory allocation
     * fails.
     */
    public static PointerIterator<java.lang.String> blobGetDataWritable(BlobT blob, PointerInteger length) {
        var RESULT = gtk_h.hb_blob_get_data_writable(blob.handle(), length.handle());
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Returns the singleton empty blob.
     * <p>
     * See TODO:link object types for more information.
     */
    public static BlobT blobGetEmpty() {
        var RESULT = gtk_h.hb_blob_get_empty();
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the length of a blob's data.
     */
    public static int blobGetLength(BlobT blob) {
        var RESULT = gtk_h.hb_blob_get_length(blob.handle());
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static java.lang.foreign.MemoryAddress blobGetUserData(BlobT blob, UserDataKeyT key) {
        var RESULT = gtk_h.hb_blob_get_user_data(blob.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether a blob is immutable.
     */
    public static BoolT blobIsImmutable(BlobT blob) {
        var RESULT = gtk_h.hb_blob_is_immutable(blob.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes a blob immutable.
     */
    public static void blobMakeImmutable(BlobT blob) {
        gtk_h.hb_blob_make_immutable(blob.handle());
    }
    
    /**
     * Increases the reference count on {@code blob}.
     * <p>
     * See TODO:link object types for more information.
     */
    public static BlobT blobReference(BlobT blob) {
        var RESULT = gtk_h.hb_blob_reference(blob.handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Appends a character with the Unicode value of {@code codepoint} to {@code buffer}, and
     * gives it the initial cluster value of {@code cluster}. Clusters can be any thing
     * the client wants, they are usually used to refer to the index of the
     * character in the input text stream and are output in
     * {@link glyph_info_t}.cluster field.
     * <p>
     * This function does not check the validity of {@code codepoint}, it is up to the
     * caller to ensure it is a valid Unicode code point.
     */
    public static void bufferAdd(BufferT buffer, CodepointT codepoint, int cluster) {
        gtk_h.hb_buffer_add(buffer.handle(), codepoint.getValue(), cluster);
    }
    
    /**
     * Appends characters from {@code text} array to {@code buffer}. The {@code item_offset} is the
     * position of the first character from {@code text} that will be appended, and
     * {@code item_length} is the number of character. When shaping part of a larger text
     * (e.g. a run of text from a paragraph), instead of passing just the substring
     * corresponding to the run, it is preferable to pass the whole
     * paragraph and specify the run start and length as {@code item_offset} and
     * {@code item_length}, respectively, to give HarfBuzz the full context to be able,
     * for example, to do cross-run Arabic shaping or properly handle combining
     * marks at stat of run.
     * <p>
     * This function does not check the validity of {@code text}, it is up to the caller
     * to ensure it contains a valid Unicode code points.
     */
    public static void bufferAddCodepoints(BufferT buffer, CodepointT[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_codepoints(buffer.handle(), Interop.allocateNativeArray(CodepointT.getIntegerValues(text)).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
     * Unicode code points that can fit in 8-bit strings.
     * <p>
     * &lt;note>Has nothing to do with non-Unicode Latin-1 encoding.</note&gt;
     */
    public static void bufferAddLatin1(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_latin1(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-16 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf16(BufferT buffer, short[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf16(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-32 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf32(BufferT buffer, int[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf32(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-8 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf8(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf8(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * Check if allocating memory for the buffer succeeded.
     */
    public static BoolT bufferAllocationSuccessful(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_allocation_successful(buffer.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Append (part of) contents of another buffer to this buffer.
     */
    public static void bufferAppend(BufferT buffer, BufferT source, int start, int end) {
        gtk_h.hb_buffer_append(buffer.handle(), source.handle(), start, end);
    }
    
    /**
     * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
     * the replacement code point.
     */
    public static void bufferClearContents(BufferT buffer) {
        gtk_h.hb_buffer_clear_contents(buffer.handle());
    }
    
    /**
     * Creates a new {@link buffer_t} with all properties to defaults.
     */
    public static BufferT bufferCreate() {
        var RESULT = gtk_h.hb_buffer_create();
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link buffer_t}, similar to hb_buffer_create(). The only
     * difference is that the buffer is configured similarly to {@code src}.
     */
    public static BufferT bufferCreateSimilar(BufferT src) {
        var RESULT = gtk_h.hb_buffer_create_similar(src.handle());
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Deserializes glyphs {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_glyphs().
     */
    public static BoolT bufferDeserializeGlyphs(BufferT buffer, java.lang.String[] buf, int bufLen, java.lang.String[] endPtr, FontT font, BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_deserialize_glyphs(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, Interop.allocateNativeArray(endPtr).handle(), font.handle(), format.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Deserializes Unicode {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_unicode().
     */
    public static BoolT bufferDeserializeUnicode(BufferT buffer, java.lang.String[] buf, int bufLen, java.lang.String[] endPtr, BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_deserialize_unicode(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, Interop.allocateNativeArray(endPtr).handle(), format.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Deallocate the {@code buffer}.
     * Decreases the reference count on {@code buffer} by one. If the result is zero, then
     * {@code buffer} and all associated resources are freed. See hb_buffer_reference().
     */
    public static void bufferDestroy(BufferT buffer) {
        gtk_h.hb_buffer_destroy(buffer.handle());
    }
    
    /**
     * If dottedcircle_glyph is (hb_codepoint_t) -1 then {@code HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT}
     * and {@code HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT} are never returned.  This should be used by most
     * callers if just comparing two buffers is needed.
     */
    public static BufferDiffFlagsT bufferDiff(BufferT buffer, BufferT reference, CodepointT dottedcircleGlyph, int positionFuzz) {
        var RESULT = gtk_h.hb_buffer_diff(buffer.handle(), reference.handle(), dottedcircleGlyph.getValue(), positionFuzz);
        return new BufferDiffFlagsT(RESULT);
    }
    
    /**
     * Fetches the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static BufferClusterLevelT bufferGetClusterLevel(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_cluster_level(buffer.handle());
        return new BufferClusterLevelT(RESULT);
    }
    
    /**
     * Fetches the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static BufferContentTypeT bufferGetContentType(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_content_type(buffer.handle());
        return new BufferContentTypeT(RESULT);
    }
    
    /**
     * See hb_buffer_set_direction()
     */
    public static DirectionT bufferGetDirection(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_direction(buffer.handle());
        return new DirectionT(RESULT);
    }
    
    /**
     * Fetches an empty {@link buffer_t}.
     */
    public static BufferT bufferGetEmpty() {
        var RESULT = gtk_h.hb_buffer_get_empty();
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the {@link buffer_flags_t} of {@code buffer}.
     */
    public static BufferFlagsT bufferGetFlags(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_flags(buffer.handle());
        return new BufferFlagsT(RESULT);
    }
    
    /**
     * Returns {@code buffer} glyph information array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     */
    public static PointerIterator<GlyphInfoT> bufferGetGlyphInfos(BufferT buffer, PointerInteger length) {
        var RESULT = gtk_h.hb_buffer_get_glyph_infos(buffer.handle(), length.handle());
        return new PointerProxy<GlyphInfoT>(RESULT, GlyphInfoT.class).iterator();
    }
    
    /**
     * Returns {@code buffer} glyph position array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     * <p>
     * If buffer did not have positions before, the positions will be
     * initialized to zeros, unless this function is called from
     * within a buffer message callback (see hb_buffer_set_message_func()),
     * in which case {@code null} is returned.
     */
    public static PointerIterator<GlyphPositionT> bufferGetGlyphPositions(BufferT buffer, PointerInteger length) {
        var RESULT = gtk_h.hb_buffer_get_glyph_positions(buffer.handle(), length.handle());
        return new PointerProxy<GlyphPositionT>(RESULT, GlyphPositionT.class).iterator();
    }
    
    /**
     * See hb_buffer_set_invisible_glyph().
     */
    public static CodepointT bufferGetInvisibleGlyph(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_invisible_glyph(buffer.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * See hb_buffer_set_language().
     */
    public static LanguageT bufferGetLanguage(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_language(buffer.handle());
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the number of items in the buffer.
     */
    public static int bufferGetLength(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_length(buffer.handle());
        return RESULT;
    }
    
    /**
     * See hb_buffer_set_not_found_glyph().
     */
    public static CodepointT bufferGetNotFoundGlyph(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_not_found_glyph(buffer.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * Fetches the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     */
    public static CodepointT bufferGetReplacementCodepoint(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_replacement_codepoint(buffer.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * Fetches the script of {@code buffer}.
     */
    public static ScriptT bufferGetScript(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_script(buffer.handle());
        return new ScriptT(RESULT);
    }
    
    /**
     * Sets {@code props} to the {@link segment_properties_t} of {@code buffer}.
     */
    public static void bufferGetSegmentProperties(BufferT buffer, SegmentPropertiesT props) {
        gtk_h.hb_buffer_get_segment_properties(buffer.handle(), props.handle());
    }
    
    /**
     * Fetches the Unicode-functions structure of a buffer.
     */
    public static UnicodeFuncsT bufferGetUnicodeFuncs(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_unicode_funcs(buffer.handle());
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified buffer.
     */
    public static java.lang.foreign.MemoryAddress bufferGetUserData(BufferT buffer, UserDataKeyT key) {
        var RESULT = gtk_h.hb_buffer_get_user_data(buffer.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Sets unset buffer segment properties based on buffer Unicode
     * contents.  If buffer is not empty, it must have content type
     * {@code HB_BUFFER_CONTENT_TYPE_UNICODE}.
     * <p>
     * If buffer script is not set (ie. is {@code HB_SCRIPT_INVALID}), it
     * will be set to the Unicode script of the first character in
     * the buffer that has a script other than {@code HB_SCRIPT_COMMON},
     * {@code HB_SCRIPT_INHERITED}, and {@code HB_SCRIPT_UNKNOWN}.
     * <p>
     * Next, if buffer direction is not set (ie. is {@code HB_DIRECTION_INVALID}),
     * it will be set to the natural horizontal direction of the
     * buffer script as returned by hb_script_get_horizontal_direction().
     * If hb_script_get_horizontal_direction() returns {@code HB_DIRECTION_INVALID},
     * then {@code HB_DIRECTION_LTR} is used.
     * <p>
     * Finally, if buffer language is not set (ie. is {@code HB_LANGUAGE_INVALID}),
     * it will be set to the process's default language as returned by
     * hb_language_get_default().  This may change in the future by
     * taking buffer script into consideration when choosing a language.
     * Note that hb_language_get_default() is NOT threadsafe the first time
     * it is called.  See documentation for that function for details.
     */
    public static void bufferGuessSegmentProperties(BufferT buffer) {
        gtk_h.hb_buffer_guess_segment_properties(buffer.handle());
    }
    
    /**
     * Returns whether {@code buffer} has glyph position data.
     * A buffer gains position data when hb_buffer_get_glyph_positions() is called on it,
     * and cleared of position data when hb_buffer_clear_contents() is called.
     */
    public static BoolT bufferHasPositions(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_has_positions(buffer.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Reorders a glyph buffer to have canonical in-cluster glyph order / position.
     * The resulting clusters should behave identical to pre-reordering clusters.
     * <p>
     * &lt;note>This has nothing to do with Unicode normalization.</note&gt;
     */
    public static void bufferNormalizeGlyphs(BufferT buffer) {
        gtk_h.hb_buffer_normalize_glyphs(buffer.handle());
    }
    
    /**
     * Pre allocates memory for {@code buffer} to fit at least {@code size} number of items.
     */
    public static BoolT bufferPreAllocate(BufferT buffer, int size) {
        var RESULT = gtk_h.hb_buffer_pre_allocate(buffer.handle(), size);
        return new BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on {@code buffer} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_buffer_destroy() is made.
     */
    public static BufferT bufferReference(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_reference(buffer.handle());
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Resets the buffer to its initial status, as if it was just newly created
     * with hb_buffer_create().
     */
    public static void bufferReset(BufferT buffer) {
        gtk_h.hb_buffer_reset(buffer.handle());
    }
    
    /**
     * Reverses buffer contents.
     */
    public static void bufferReverse(BufferT buffer) {
        gtk_h.hb_buffer_reverse(buffer.handle());
    }
    
    /**
     * Reverses buffer clusters.  That is, the buffer contents are
     * reversed, then each cluster (consecutive items having the
     * same cluster number) are reversed again.
     */
    public static void bufferReverseClusters(BufferT buffer) {
        gtk_h.hb_buffer_reverse_clusters(buffer.handle());
    }
    
    /**
     * Reverses buffer contents between {@code start} and {@code end}.
     */
    public static void bufferReverseRange(BufferT buffer, int start, int end) {
        gtk_h.hb_buffer_reverse_range(buffer.handle(), start, end);
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its content, whether
     * Unicode codepoints or glyph identifiers and positioning information. This is
     * useful for showing the contents of the buffer, for example during debugging.
     * See the documentation of hb_buffer_serialize_unicode() and
     * hb_buffer_serialize_glyphs() for a description of the output format.
     */
    public static int bufferSerialize(BufferT buffer, int start, int end, byte[] buf, int bufSize, PointerInteger bufConsumed, FontT font, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        var RESULT = gtk_h.hb_buffer_serialize(buffer.handle(), start, end, Interop.allocateNativeArray(buf).handle(), bufSize, bufConsumed.handle(), font.handle(), format.getValue(), flags.getValue());
        return RESULT;
    }
    
    /**
     * Parses a string into an {@link buffer_serialize_format_t}. Does not check if
     * {@code str} is a valid buffer serialization format, use
     * hb_buffer_serialize_list_formats() to get the list of supported formats.
     */
    public static BufferSerializeFormatT bufferSerializeFormatFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_buffer_serialize_format_from_string(Interop.allocateNativeArray(str).handle(), len);
        return new BufferSerializeFormatT(RESULT);
    }
    
    /**
     * Converts {@code format} to the string corresponding it, or {@code null} if it is not a valid
     * {@link buffer_serialize_format_t}.
     */
    public static java.lang.String bufferSerializeFormatToString(BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_serialize_format_to_string(format.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its glyph content,
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * <p>
     * <h2>text</h2>
     * A human-readable, plain text format.
     * The serialized glyphs will look something like:
     * <p>
     * <pre>{@code 
     * [uni0651=0@518,0+0|uni0628=0+1897]
     * }</pre>
     * <p>
     * <ul>
     * <li>The serialized glyphs are delimited with {@code [} and {@code ]}.
     * <li>Glyphs are separated with {@code |}
     * <li>Each glyph starts with glyph name, or glyph index if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES} flag is set. Then,
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set, {@code =} then {@link glyph_info_t}.cluster.
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS} is not set, the {@link glyph_position_t} in the format:
     * <li>If both {@link glyph_position_t}.x_offset and {@link glyph_position_t}.y_offset are not 0, {@code @x_offset,y_offset}. Then,
     * <li>{@code +x_advance}, then {@code ,y_advance} if {@link glyph_position_t}.y_advance is not 0. Then,
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS} is set, the {@link glyph_extents_t} in the format {@code <x_bearing,y_bearing,width,height>}
     * </ul>
     * <p>
     * <h2>json</h2>
     * A machine-readable, structured format.
     * The serialized glyphs will look something like:
     * <p>
     * <pre>{@code 
     * [{"g":"uni0651","cl":0,"dx":518,"dy":0,"ax":0,"ay":0},
     * {"g":"uni0628","cl":0,"dx":0,"dy":0,"ax":1897,"ay":0}]
     * }</pre>
     * <p>
     * Each glyph is a JSON object, with the following properties:
     * <ul>
     * <li>{@code g}: the glyph name or glyph index if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES} flag is set.
     * <li>{@code cl}: {@link glyph_info_t}.cluster if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set.
     * <li>{@code dx},{@code dy},{@code ax},{@code ay}: {@link glyph_position_t}.x_offset, {@link glyph_position_t}.y_offset,
     *    {@link glyph_position_t}.x_advance and {@link glyph_position_t}.y_advance
     *    respectively, if {@code HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS} is not set.
     * <li>{@code xb},{@code yb},{@code w},{@code h}: {@link glyph_extents_t}.x_bearing, {@link glyph_extents_t}.y_bearing,
     *    {@link glyph_extents_t}.width and {@link glyph_extents_t}.height respectively if
     *    {@code HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS} is set.
     */
    public static int bufferSerializeGlyphs(BufferT buffer, int start, int end, byte[] buf, int bufSize, PointerInteger bufConsumed, FontT font, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        var RESULT = gtk_h.hb_buffer_serialize_glyphs(buffer.handle(), start, end, Interop.allocateNativeArray(buf).handle(), bufSize, bufConsumed.handle(), font.handle(), format.getValue(), flags.getValue());
        return RESULT;
    }
    
    /**
     * Returns a list of supported buffer serialization formats.
     */
    public static PointerIterator<java.lang.String> bufferSerializeListFormats() {
        var RESULT = gtk_h.hb_buffer_serialize_list_formats();
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its content,
     * when the buffer contains Unicode codepoints (i.e., before shaping). This is
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * <p>
     * <h2>text</h2>
     * A human-readable, plain text format.
     * The serialized codepoints will look something like:
     * <p>
     * <pre>{@code 
     *  <U+0651=0|U+0628=1>
     * }</pre>
     * <p>
     * <ul>
     * <li>Glyphs are separated with {@code |}
     * <li>Unicode codepoints are expressed as zero-padded four (or more)
     *   digit hexadecimal numbers preceded by {@code U+}
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set, the cluster
     *   will be indicated with a {@code =} then {@link glyph_info_t}.cluster.
     * </ul>
     * <p>
     * <h2>json</h2>
     * A machine-readable, structured format.
     * The serialized codepoints will be a list of objects with the following
     * properties:
     * <ul>
     * <li>{@code u}: the Unicode codepoint as a decimal integer
     * <li>{@code cl}: {@link glyph_info_t}.cluster if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set.
     * </ul>
     * <p>
     * For example:
     * <p>
     * <pre>{@code 
     * [{u:1617,cl:0},{u:1576,cl:1}]
     * }</pre>
     */
    public static int bufferSerializeUnicode(BufferT buffer, int start, int end, byte[] buf, int bufSize, PointerInteger bufConsumed, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        var RESULT = gtk_h.hb_buffer_serialize_unicode(buffer.handle(), start, end, Interop.allocateNativeArray(buf).handle(), bufSize, bufConsumed.handle(), format.getValue(), flags.getValue());
        return RESULT;
    }
    
    /**
     * Sets the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static void bufferSetClusterLevel(BufferT buffer, BufferClusterLevelT clusterLevel) {
        gtk_h.hb_buffer_set_cluster_level(buffer.handle(), clusterLevel.getValue());
    }
    
    /**
     * Sets the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static void bufferSetContentType(BufferT buffer, BufferContentTypeT contentType) {
        gtk_h.hb_buffer_set_content_type(buffer.handle(), contentType.getValue());
    }
    
    /**
     * Set the text flow direction of the buffer. No shaping can happen without
     * setting {@code buffer} direction, and it controls the visual direction for the
     * output glyphs; for RTL direction the glyphs will be reversed. Many layout
     * features depend on the proper setting of the direction, for example,
     * reversing RTL text before shaping, then shaping with LTR direction is not
     * the same as keeping the text in logical order and shaping with RTL
     * direction.
     */
    public static void bufferSetDirection(BufferT buffer, DirectionT direction) {
        gtk_h.hb_buffer_set_direction(buffer.handle(), direction.getValue());
    }
    
    /**
     * Sets {@code buffer} flags to {@code flags}. See {@link buffer_flags_t}.
     */
    public static void bufferSetFlags(BufferT buffer, BufferFlagsT flags) {
        gtk_h.hb_buffer_set_flags(buffer.handle(), flags.getValue());
    }
    
    /**
     * Sets the {@link codepoint_t} that replaces invisible characters in
     * the shaping result.  If set to zero (default), the glyph for the
     * U+0020 SPACE character is used.  Otherwise, this value is used
     * verbatim.
     */
    public static void bufferSetInvisibleGlyph(BufferT buffer, CodepointT invisible) {
        gtk_h.hb_buffer_set_invisible_glyph(buffer.handle(), invisible.getValue());
    }
    
    /**
     * Sets the language of {@code buffer} to {@code language}.
     * <p>
     * Languages are crucial for selecting which OpenType feature to apply to the
     * buffer which can result in applying language-specific behaviour. Languages
     * are orthogonal to the scripts, and though they are related, they are
     * different concepts and should not be confused with each other.
     * <p>
     * Use hb_language_from_string() to convert from BCP 47 language tags to
     * {@link language_t}.
     */
    public static void bufferSetLanguage(BufferT buffer, LanguageT language) {
        gtk_h.hb_buffer_set_language(buffer.handle(), language.handle());
    }
    
    /**
     * Similar to hb_buffer_pre_allocate(), but clears any new items added at the
     * end.
     */
    public static BoolT bufferSetLength(BufferT buffer, int length) {
        var RESULT = gtk_h.hb_buffer_set_length(buffer.handle(), length);
        return new BoolT(RESULT);
    }
    
    /**
     * Sets the {@link codepoint_t} that replaces characters not found in
     * the font during shaping.
     * <p>
     * The not-found glyph defaults to zero, sometimes knows as the
     * ".notdef" glyph.  This API allows for differentiating the two.
     */
    public static void bufferSetNotFoundGlyph(BufferT buffer, CodepointT notFound) {
        gtk_h.hb_buffer_set_not_found_glyph(buffer.handle(), notFound.getValue());
    }
    
    /**
     * Sets the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     * <p>
     * Default is {@code HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT}.
     */
    public static void bufferSetReplacementCodepoint(BufferT buffer, CodepointT replacement) {
        gtk_h.hb_buffer_set_replacement_codepoint(buffer.handle(), replacement.getValue());
    }
    
    /**
     * Sets the script of {@code buffer} to {@code script}.
     * <p>
     * Script is crucial for choosing the proper shaping behaviour for scripts that
     * require it (e.g. Arabic) and the which OpenType features defined in the font
     * to be applied.
     * <p>
     * You can pass one of the predefined {@link script_t} values, or use
     * hb_script_from_string() or hb_script_from_iso15924_tag() to get the
     * corresponding script from an ISO 15924 script tag.
     */
    public static void bufferSetScript(BufferT buffer, ScriptT script) {
        gtk_h.hb_buffer_set_script(buffer.handle(), script.getValue());
    }
    
    /**
     * Sets the segment properties of the buffer, a shortcut for calling
     * hb_buffer_set_direction(), hb_buffer_set_script() and
     * hb_buffer_set_language() individually.
     */
    public static void bufferSetSegmentProperties(BufferT buffer, SegmentPropertiesT props) {
        gtk_h.hb_buffer_set_segment_properties(buffer.handle(), props.handle());
    }
    
    /**
     * Sets the Unicode-functions structure of a buffer to
     * {@code unicode_funcs}.
     */
    public static void bufferSetUnicodeFuncs(BufferT buffer, UnicodeFuncsT unicodeFuncs) {
        gtk_h.hb_buffer_set_unicode_funcs(buffer.handle(), unicodeFuncs.handle());
    }
    
    /**
     * Fetches the alpha channel of the given {@code color}.
     */
    public static byte colorGetAlpha(ColorT color) {
        var RESULT = gtk_h.hb_color_get_alpha(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the blue channel of the given {@code color}.
     */
    public static byte colorGetBlue(ColorT color) {
        var RESULT = gtk_h.hb_color_get_blue(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the green channel of the given {@code color}.
     */
    public static byte colorGetGreen(ColorT color) {
        var RESULT = gtk_h.hb_color_get_green(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the red channel of the given {@code color}.
     */
    public static byte colorGetRed(ColorT color) {
        var RESULT = gtk_h.hb_color_get_red(color.getValue());
        return RESULT;
    }
    
    /**
     * Converts a string to an {@link direction_t}.
     * <p>
     * Matching is loose and applies only to the first letter. For
     * examples, "LTR" and "left-to-right" will both return {@code HB_DIRECTION_LTR}.
     * <p>
     * Unmatched strings will return {@code HB_DIRECTION_INVALID}.
     */
    public static DirectionT directionFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_direction_from_string(Interop.allocateNativeArray(str).handle(), len);
        return new DirectionT(RESULT);
    }
    
    /**
     * Converts an {@link direction_t} to a string.
     */
    public static java.lang.String directionToString(DirectionT direction) {
        var RESULT = gtk_h.hb_direction_to_string(direction.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Perform a "close-path" draw operation.
     */
    public static void drawClosePath(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st) {
        gtk_h.hb_draw_close_path(dfuncs.handle(), drawData, st.handle());
    }
    
    /**
     * Perform a "cubic-to" draw operation.
     */
    public static void drawCubicTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY) {
        gtk_h.hb_draw_cubic_to(dfuncs.handle(), drawData, st.handle(), control1X, control1Y, control2X, control2Y, toX, toY);
    }
    
    /**
     * Creates a new draw callbacks object.
     */
    public static DrawFuncsT drawFuncsCreate() {
        var RESULT = gtk_h.hb_draw_funcs_create();
        return new DrawFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Deallocate the {@code dfuncs}.
     * Decreases the reference count on {@code dfuncs} by one. If the result is zero, then
     * {@code dfuncs} and all associated resources are freed. See hb_draw_funcs_reference().
     */
    public static void drawFuncsDestroy(DrawFuncsT dfuncs) {
        gtk_h.hb_draw_funcs_destroy(dfuncs.handle());
    }
    
    /**
     * Checks whether {@code dfuncs} is immutable.
     */
    public static BoolT drawFuncsIsImmutable(DrawFuncsT dfuncs) {
        var RESULT = gtk_h.hb_draw_funcs_is_immutable(dfuncs.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes {@code dfuncs} object immutable.
     */
    public static void drawFuncsMakeImmutable(DrawFuncsT dfuncs) {
        gtk_h.hb_draw_funcs_make_immutable(dfuncs.handle());
    }
    
    /**
     * Increases the reference count on {@code dfuncs} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_draw_funcs_destroy() is made.
     */
    public static DrawFuncsT drawFuncsReference(DrawFuncsT dfuncs) {
        var RESULT = gtk_h.hb_draw_funcs_reference(dfuncs.handle());
        return new DrawFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Perform a "line-to" draw operation.
     */
    public static void drawLineTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        gtk_h.hb_draw_line_to(dfuncs.handle(), drawData, st.handle(), toX, toY);
    }
    
    /**
     * Perform a "move-to" draw operation.
     */
    public static void drawMoveTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        gtk_h.hb_draw_move_to(dfuncs.handle(), drawData, st.handle(), toX, toY);
    }
    
    /**
     * Perform a "quadratic-to" draw operation.
     */
    public static void drawQuadraticTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY) {
        gtk_h.hb_draw_quadratic_to(dfuncs.handle(), drawData, st.handle(), controlX, controlY, toX, toY);
    }
    
    /**
     * Add table for {@code tag} with data provided by {@code blob} to the face.  {@code face} must
     * be created using hb_face_builder_create().
     */
    public static BoolT faceBuilderAddTable(FaceT face, TagT tag, BlobT blob) {
        var RESULT = gtk_h.hb_face_builder_add_table(face.handle(), tag.getValue(), blob.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Creates a {@link face_t} that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     */
    public static FaceT faceBuilderCreate() {
        var RESULT = gtk_h.hb_face_builder_create();
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Collects all of the Unicode characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectUnicodes(FaceT face, SetT out) {
        gtk_h.hb_face_collect_unicodes(face.handle(), out.handle());
    }
    
    /**
     * Collects all Unicode "Variation Selector" characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectVariationSelectors(FaceT face, SetT out) {
        gtk_h.hb_face_collect_variation_selectors(face.handle(), out.handle());
    }
    
    /**
     * Collects all Unicode characters for {@code variation_selector} covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectVariationUnicodes(FaceT face, CodepointT variationSelector, SetT out) {
        gtk_h.hb_face_collect_variation_unicodes(face.handle(), variationSelector.getValue(), out.handle());
    }
    
    /**
     * Fetches the number of faces in a blob.
     */
    public static int faceCount(BlobT blob) {
        var RESULT = gtk_h.hb_face_count(blob.handle());
        return RESULT;
    }
    
    /**
     * Constructs a new face object from the specified blob and
     * a face index into that blob.
     * <p>
     * The face index is used for blobs of file formats such as TTC and
     * and DFont that can contain more than one face.  Face indices within
     * such collections are zero-based.
     * <p>
     * &lt;note&gt;Note: If the blob font format is not a collection, {@code index}
     * is ignored.  Otherwise, only the lower 16-bits of {@code index} are used.
     * The unmodified {@code index} can be accessed via hb_face_get_index().&lt;/note&gt;
     * <p>
     * &lt;note&gt;Note: The high 16-bits of {@code index}, if non-zero, are used by
     * hb_font_create() to load named-instances in variable fonts.  See
     * hb_font_create() for details.&lt;/note&gt;
     */
    public static FaceT faceCreate(BlobT blob, int index) {
        var RESULT = gtk_h.hb_face_create(blob.handle(), index);
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on a face object. When the
     * reference count reaches zero, the face is destroyed,
     * freeing all memory.
     */
    public static void faceDestroy(FaceT face) {
        gtk_h.hb_face_destroy(face.handle());
    }
    
    /**
     * Fetches the singleton empty face object.
     */
    public static FaceT faceGetEmpty() {
        var RESULT = gtk_h.hb_face_get_empty();
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the glyph-count value of the specified face object.
     */
    public static int faceGetGlyphCount(FaceT face) {
        var RESULT = gtk_h.hb_face_get_glyph_count(face.handle());
        return RESULT;
    }
    
    /**
     * Fetches the face-index corresponding to the given face.
     * <p>
     * &lt;note>Note: face indices within a collection are zero-based.</note&gt;
     */
    public static int faceGetIndex(FaceT face) {
        var RESULT = gtk_h.hb_face_get_index(face.handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of all table tags for a face, if possible. The list returned will
     * begin at the offset provided
     */
    public static int faceGetTableTags(FaceT face, int startOffset, PointerInteger tableCount, TagT[] tableTags) {
        var RESULT = gtk_h.hb_face_get_table_tags(face.handle(), startOffset, tableCount.handle(), Interop.allocateNativeArray(TagT.getIntegerValues(tableTags)).handle());
        return RESULT;
    }
    
    /**
     * Fetches the units-per-em (upem) value of the specified face object.
     */
    public static int faceGetUpem(FaceT face) {
        var RESULT = gtk_h.hb_face_get_upem(face.handle());
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified face object.
     */
    public static java.lang.foreign.MemoryAddress faceGetUserData(FaceT face, UserDataKeyT key) {
        var RESULT = gtk_h.hb_face_get_user_data(face.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether the given face object is immutable.
     */
    public static BoolT faceIsImmutable(FaceT face) {
        var RESULT = gtk_h.hb_face_is_immutable(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes the given face object immutable.
     */
    public static void faceMakeImmutable(FaceT face) {
        gtk_h.hb_face_make_immutable(face.handle());
    }
    
    /**
     * Increases the reference count on a face object.
     */
    public static FaceT faceReference(FaceT face) {
        var RESULT = gtk_h.hb_face_reference(face.handle());
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     */
    public static BlobT faceReferenceBlob(FaceT face) {
        var RESULT = gtk_h.hb_face_reference_blob(face.handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches a reference to the specified table within
     * the specified face.
     */
    public static BlobT faceReferenceTable(FaceT face, TagT tag) {
        var RESULT = gtk_h.hb_face_reference_table(face.handle(), tag.getValue());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets the glyph count for a face object to the specified value.
     */
    public static void faceSetGlyphCount(FaceT face, int glyphCount) {
        gtk_h.hb_face_set_glyph_count(face.handle(), glyphCount);
    }
    
    /**
     * Assigns the specified face-index to {@code face}. Fails if the
     * face is immutable.
     * <p>
     * &lt;note&gt;Note: changing the index has no effect on the face itself
     * This only changes the value returned by hb_face_get_index().&lt;/note&gt;
     */
    public static void faceSetIndex(FaceT face, int index) {
        gtk_h.hb_face_set_index(face.handle(), index);
    }
    
    /**
     * Sets the units-per-em (upem) for a face object to the specified value.
     */
    public static void faceSetUpem(FaceT face, int upem) {
        gtk_h.hb_face_set_upem(face.handle(), upem);
    }
    
    /**
     * Parses a string into a {@link feature_t}.
     * <p>
     * The format for specifying feature strings follows. All valid CSS
     * font-feature-settings values other than 'normal' and the global values are
     * also accepted, though not documented below. CSS string escapes are not
     * supported.
     * <p>
     * The range indices refer to the positions between Unicode characters. The
     * position before the first character is always 0.
     * <p>
     * The format is Python-esque.  Here is how it all works:
     * <p>
     * &lt;informaltable pgwide='1' align='left' frame='none'&gt;
     * &lt;tgroup cols='5'&gt;
     * &lt;thead&gt;
     * &lt;row><entry>Syntax</entry>    <entry>Value</entry> <entry>Start</entry> <entry>End</entry></row&gt;
     * &lt;/thead&gt;
     * &lt;tbody&gt;
     * &lt;row><entry>Setting value:</entry></row&gt;
     * &lt;row><entry>kern</entry>      <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row&gt;
     * &lt;row><entry>+kern</entry>     <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row&gt;
     * &lt;row><entry>-kern</entry>     <entry>0</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature off</entry></row&gt;
     * &lt;row><entry>kern=0</entry>    <entry>0</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature off</entry></row&gt;
     * &lt;row><entry>kern=1</entry>    <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row&gt;
     * &lt;row><entry>aalt=2</entry>    <entry>2</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Choose 2nd alternate</entry></row&gt;
     * &lt;row><entry>Setting index:</entry></row&gt;
     * &lt;row><entry>kern[]</entry>    <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row&gt;
     * &lt;row><entry>kern[:]</entry>   <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row&gt;
     * &lt;row><entry>kern[5:]</entry>  <entry>1</entry>     <entry>5</entry>      <entry>∞</entry>   <entry>Turn feature on, partial</entry></row&gt;
     * &lt;row><entry>kern[:5]</entry>  <entry>1</entry>     <entry>0</entry>      <entry>5</entry>   <entry>Turn feature on, partial</entry></row&gt;
     * &lt;row><entry>kern[3:5]</entry> <entry>1</entry>     <entry>3</entry>      <entry>5</entry>   <entry>Turn feature on, range</entry></row&gt;
     * &lt;row><entry>kern[3]</entry>   <entry>1</entry>     <entry>3</entry>      <entry>3+1</entry> <entry>Turn feature on, single char</entry></row&gt;
     * &lt;row><entry>Mixing it all:</entry></row&gt;
     * &lt;row><entry>aalt[3:5]=2</entry> <entry>2</entry>   <entry>3</entry>      <entry>5</entry>   <entry>Turn 2nd alternate on for range</entry></row&gt;
     * &lt;/tbody&gt;
     * &lt;/tgroup&gt;
     * &lt;/informaltable&gt;
     */
    public static BoolT featureFromString(byte[] str, int len, FeatureT feature) {
        var RESULT = gtk_h.hb_feature_from_string(Interop.allocateNativeArray(str).handle(), len, feature.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Converts a {@link feature_t} into a {@code null}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static void featureToString(FeatureT feature, java.lang.String[] buf, int size) {
        gtk_h.hb_feature_to_string(feature.handle(), Interop.allocateNativeArray(buf).handle(), size);
    }
    
    /**
     * Adds the origin coordinates to an (X,Y) point coordinate, in
     * the specified glyph ID in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontAddGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        gtk_h.hb_font_add_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
    }
    
    /**
     * Constructs a new font object from the specified face.
     * <p>
     * &lt;note&gt;Note: If {@code face}'s index value (as passed to hb_face_create()
     * has non-zero top 16-bits, those bits minus one are passed to
     * hb_font_set_var_named_instance(), effectively loading a named-instance
     * of a variable font, instead of the default-instance.  This allows
     * specifying which named-instance to load by default when creating the
     * face.&lt;/note&gt;
     */
    public static FontT fontCreate(FaceT face) {
        var RESULT = gtk_h.hb_font_create(face.handle());
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Constructs a sub-font font object from the specified {@code parent} font,
     * replicating the parent's properties.
     */
    public static FontT fontCreateSubFont(FontT parent) {
        var RESULT = gtk_h.hb_font_create_sub_font(parent.handle());
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on the given font object. When the
     * reference count reaches zero, the font is destroyed,
     * freeing all memory.
     */
    public static void fontDestroy(FontT font) {
        gtk_h.hb_font_destroy(font.handle());
    }
    
    /**
     * Creates a new {@link font_funcs_t} structure of font functions.
     */
    public static FontFuncsT fontFuncsCreate() {
        var RESULT = gtk_h.hb_font_funcs_create();
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on a font-functions structure. When
     * the reference count reaches zero, the font-functions structure is
     * destroyed, freeing all memory.
     */
    public static void fontFuncsDestroy(FontFuncsT ffuncs) {
        gtk_h.hb_font_funcs_destroy(ffuncs.handle());
    }
    
    /**
     * Fetches an empty font-functions structure.
     */
    public static FontFuncsT fontFuncsGetEmpty() {
        var RESULT = gtk_h.hb_font_funcs_get_empty();
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static java.lang.foreign.MemoryAddress fontFuncsGetUserData(FontFuncsT ffuncs, UserDataKeyT key) {
        var RESULT = gtk_h.hb_font_funcs_get_user_data(ffuncs.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether a font-functions structure is immutable.
     */
    public static BoolT fontFuncsIsImmutable(FontFuncsT ffuncs) {
        var RESULT = gtk_h.hb_font_funcs_is_immutable(ffuncs.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes a font-functions structure immutable.
     */
    public static void fontFuncsMakeImmutable(FontFuncsT ffuncs) {
        gtk_h.hb_font_funcs_make_immutable(ffuncs.handle());
    }
    
    /**
     * Increases the reference count on a font-functions structure.
     */
    public static FontFuncsT fontFuncsReference(FontFuncsT ffuncs) {
        var RESULT = gtk_h.hb_font_funcs_reference(ffuncs.handle());
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the empty font object.
     */
    public static FontT fontGetEmpty() {
        var RESULT = gtk_h.hb_font_get_empty();
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the extents for a font in a text segment of the
     * specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetExtentsForDirection(FontT font, DirectionT direction, FontExtentsT extents) {
        gtk_h.hb_font_get_extents_for_direction(font.handle(), direction.getValue(), extents.handle());
    }
    
    /**
     * Fetches the face associated with the specified font object.
     */
    public static FaceT fontGetFace(FontT font) {
        var RESULT = gtk_h.hb_font_get_face(font.handle());
        return new FaceT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Fetches the glyph ID for a Unicode code point in the specified
     * font, with an optional variation selector.
     * <p>
     * If {@code variation_selector} is 0, calls hb_font_get_nominal_glyph();
     * otherwise calls hb_font_get_variation_glyph().
     */
    public static BoolT fontGetGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        var RESULT = gtk_h.hb_font_get_glyph(font.handle(), unicode.getValue(), variationSelector.getValue(), new PointerInteger(glyph.getValue()).handle());
        glyph.setValue(glyphPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the advance for a glyph ID from the specified font,
     * in a text segment of the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetGlyphAdvanceForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        gtk_h.hb_font_get_glyph_advance_for_direction(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, in a text segment of the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetGlyphAdvancesForDirection(FontT font, DirectionT direction, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        PointerInteger firstAdvancePOINTER = new PointerInteger(firstAdvance.getValue());
        gtk_h.hb_font_get_glyph_advances_for_direction(font.handle(), direction.getValue(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
        firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.setValue(firstAdvancePOINTER.get());
    }
    
    /**
     * Fetches the (x,y) coordinates of a specified contour-point index
     * in the specified glyph, within the specified font.
     */
    public static BoolT fontGetGlyphContourPoint(FontT font, CodepointT glyph, int pointIndex, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        var RESULT = gtk_h.hb_font_get_glyph_contour_point(font.handle(), glyph.getValue(), pointIndex, new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of a specified contour-point index
     * in the specified glyph ID in the specified font, with respect
     * to the origin in a text segment in the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static BoolT fontGetGlyphContourPointForOrigin(FontT font, CodepointT glyph, int pointIndex, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        var RESULT = gtk_h.hb_font_get_glyph_contour_point_for_origin(font.handle(), glyph.getValue(), pointIndex, direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the {@link glyph_extents_t} data for a glyph ID
     * in the specified font.
     */
    public static BoolT fontGetGlyphExtents(FontT font, CodepointT glyph, GlyphExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_glyph_extents(font.handle(), glyph.getValue(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the {@link glyph_extents_t} data for a glyph ID
     * in the specified font, with respect to the origin in
     * a text segment in the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static BoolT fontGetGlyphExtentsForOrigin(FontT font, CodepointT glyph, DirectionT direction, GlyphExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_glyph_extents_for_origin(font.handle(), glyph.getValue(), direction.getValue(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID that corresponds to a name string in the specified {@code font}.
     * <p>
     * &lt;note>Note: @len == -1 means the name string is null-terminated.</note&gt;
     */
    public static BoolT fontGetGlyphFromName(FontT font, java.lang.String[] name, int len, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        var RESULT = gtk_h.hb_font_get_glyph_from_name(font.handle(), Interop.allocateNativeArray(name).handle(), len, new PointerInteger(glyph.getValue()).handle());
        glyph.setValue(glyphPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for horizontal text segments.
     */
    public static PositionT fontGetGlyphHAdvance(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_glyph_h_advance(font.handle(), glyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for horizontal text segments.
     */
    public static void fontGetGlyphHAdvances(FontT font, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        PointerInteger firstAdvancePOINTER = new PointerInteger(firstAdvance.getValue());
        gtk_h.hb_font_get_glyph_h_advances(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
        firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.setValue(firstAdvancePOINTER.get());
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in
     * the specified font, for horizontal text segments.
     * <p>
     * &lt;note&gt;It handles legacy kerning only (as returned by the corresponding
     * {@link font_funcs_t} function).&lt;/note&gt;
     */
    public static PositionT fontGetGlyphHKerning(FontT font, CodepointT leftGlyph, CodepointT rightGlyph) {
        var RESULT = gtk_h.hb_font_get_glyph_h_kerning(font.handle(), leftGlyph.getValue(), rightGlyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for horizontal text segments.
     */
    public static BoolT fontGetGlyphHOrigin(FontT font, CodepointT glyph, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        var RESULT = gtk_h.hb_font_get_glyph_h_origin(font.handle(), glyph.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetGlyphKerningForDirection(FontT font, CodepointT firstGlyph, CodepointT secondGlyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        gtk_h.hb_font_get_glyph_kerning_for_direction(font.handle(), firstGlyph.getValue(), secondGlyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
    }
    
    /**
     * Fetches the glyph-name string for a glyph ID in the specified {@code font}.
     */
    public static BoolT fontGetGlyphName(FontT font, CodepointT glyph, java.lang.String[] name, int size) {
        var RESULT = gtk_h.hb_font_get_glyph_name(font.handle(), glyph.getValue(), Interop.allocateNativeArray(name).handle(), size);
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph in
     * the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        gtk_h.hb_font_get_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
    }
    
    /**
     * Fetches the glyph shape that corresponds to a glyph in the specified {@code font}.
     * The shape is returned by way of calls to the callsbacks of the {@code dfuncs}
     * objects, with {@code draw_data} passed to them.
     */
    public static void fontGetGlyphShape(FontT font, CodepointT glyph, DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData) {
        gtk_h.hb_font_get_glyph_shape(font.handle(), glyph.getValue(), dfuncs.handle(), drawData);
    }
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for vertical text segments.
     */
    public static PositionT fontGetGlyphVAdvance(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_glyph_v_advance(font.handle(), glyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for vertical text segments.
     */
    public static void fontGetGlyphVAdvances(FontT font, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        PointerInteger firstAdvancePOINTER = new PointerInteger(firstAdvance.getValue());
        gtk_h.hb_font_get_glyph_v_advances(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
        firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.setValue(firstAdvancePOINTER.get());
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for vertical text segments.
     */
    public static BoolT fontGetGlyphVOrigin(FontT font, CodepointT glyph, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        var RESULT = gtk_h.hb_font_get_glyph_v_origin(font.handle(), glyph.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the extents for a specified font, for horizontal
     * text segments.
     */
    public static BoolT fontGetHExtents(FontT font, FontExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_h_extents(font.handle(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the nominal glyph ID for a Unicode code point in the
     * specified font.
     * <p>
     * This version of the function should not be used to fetch glyph IDs
     * for code points modified by variation selectors. For variation-selector
     * support, user hb_font_get_variation_glyph() or use hb_font_get_glyph().
     */
    public static BoolT fontGetNominalGlyph(FontT font, CodepointT unicode, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        var RESULT = gtk_h.hb_font_get_nominal_glyph(font.handle(), unicode.getValue(), new PointerInteger(glyph.getValue()).handle());
        glyph.setValue(glyphPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
     * IDs must be returned in a {@link codepoint_t} output parameter.
     */
    public static int fontGetNominalGlyphs(FontT font, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride) {
        PointerInteger firstUnicodePOINTER = new PointerInteger(firstUnicode.getValue());
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        var RESULT = gtk_h.hb_font_get_nominal_glyphs(font.handle(), count, new PointerInteger(firstUnicode.getValue()).handle(), unicodeStride, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride);
        firstUnicode.setValue(firstUnicodePOINTER.get());
        firstGlyph.setValue(firstGlyphPOINTER.get());
        return RESULT;
    }
    
    /**
     * Fetches the parent font of {@code font}.
     */
    public static FontT fontGetParent(FontT font) {
        var RESULT = gtk_h.hb_font_get_parent(font.handle());
        return new FontT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Fetches the horizontal and vertical points-per-em (ppem) of a font.
     */
    public static void fontGetPpem(FontT font, PointerInteger xPpem, PointerInteger yPpem) {
        gtk_h.hb_font_get_ppem(font.handle(), xPpem.handle(), yPpem.handle());
    }
    
    /**
     * Fetches the "point size" of a font. Used in CoreText to
     * implement optical sizing.
     */
    public static float fontGetPtem(FontT font) {
        var RESULT = gtk_h.hb_font_get_ptem(font.handle());
        return RESULT;
    }
    
    /**
     * Fetches the horizontal and vertical scale of a font.
     */
    public static void fontGetScale(FontT font, PointerInteger xScale, PointerInteger yScale) {
        gtk_h.hb_font_get_scale(font.handle(), xScale.handle(), yScale.handle());
    }
    
    /**
     * Fetches the "synthetic slant" of a font.
     */
    public static float fontGetSyntheticSlant(FontT font) {
        var RESULT = gtk_h.hb_font_get_synthetic_slant(font.handle());
        return RESULT;
    }
    
    /**
     * Fetches the user-data object associated with the specified key,
     * attached to the specified font object.
     */
    public static java.lang.foreign.MemoryAddress fontGetUserData(FontT font, UserDataKeyT key) {
        var RESULT = gtk_h.hb_font_get_user_data(font.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Fetches the extents for a specified font, for vertical
     * text segments.
     */
    public static BoolT fontGetVExtents(FontT font, FontExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_v_extents(font.handle(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the list of variation coordinates (in design-space units) currently
     * set on a font.
     * <p>
     * Note that this returned array may only contain values for some
     * (or none) of the axes; omitted axes effectively have their default
     * values.
     * <p>
     * Return value is valid as long as variation coordinates of the font
     * are not modified.
     */
    public static PointerFloat fontGetVarCoordsDesign(FontT font, PointerInteger length) {
        var RESULT = gtk_h.hb_font_get_var_coords_design(font.handle(), length.handle());
        return new PointerFloat(RESULT);
    }
    
    /**
     * Fetches the list of normalized variation coordinates currently
     * set on a font.
     * <p>
     * Note that this returned array may only contain values for some
     * (or none) of the axes; omitted axes effectively have zero values.
     * <p>
     * Return value is valid as long as variation coordinates of the font
     * are not modified.
     */
    public static PointerInteger fontGetVarCoordsNormalized(FontT font, PointerInteger length) {
        var RESULT = gtk_h.hb_font_get_var_coords_normalized(font.handle(), length.handle());
        return new PointerInteger(RESULT);
    }
    
    /**
     * Fetches the glyph ID for a Unicode code point when followed by
     * by the specified variation-selector code point, in the specified
     * font.
     */
    public static BoolT fontGetVariationGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        var RESULT = gtk_h.hb_font_get_variation_glyph(font.handle(), unicode.getValue(), variationSelector.getValue(), new PointerInteger(glyph.getValue()).handle());
        glyph.setValue(glyphPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID from {@code font} that matches the specified string.
     * Strings of the format {@code gidDDD} or {@code uniUUUU} are parsed automatically.
     * <p>
     * &lt;note>Note: @len == -1 means the string is null-terminated.</note&gt;
     */
    public static BoolT fontGlyphFromString(FontT font, byte[] s, int len, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        var RESULT = gtk_h.hb_font_glyph_from_string(font.handle(), Interop.allocateNativeArray(s).handle(), len, new PointerInteger(glyph.getValue()).handle());
        glyph.setValue(glyphPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the name of the specified glyph ID in {@code font} and returns
     * it in string @s.
     * <p>
     * If the glyph ID has no name in {@code font}, a string of the form {@code gidDDD} is
     * generated, with {@code DDD} being the glyph ID.
     */
    public static void fontGlyphToString(FontT font, CodepointT glyph, java.lang.String[] s, int size) {
        gtk_h.hb_font_glyph_to_string(font.handle(), glyph.getValue(), Interop.allocateNativeArray(s).handle(), size);
    }
    
    /**
     * Tests whether a font object is immutable.
     */
    public static BoolT fontIsImmutable(FontT font) {
        var RESULT = gtk_h.hb_font_is_immutable(font.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes {@code font} immutable.
     */
    public static void fontMakeImmutable(FontT font) {
        gtk_h.hb_font_make_immutable(font.handle());
    }
    
    /**
     * Increases the reference count on the given font object.
     */
    public static FontT fontReference(FontT font) {
        var RESULT = gtk_h.hb_font_reference(font.handle());
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets {@code face} as the font-face value of {@code font}.
     */
    public static void fontSetFace(FontT font, FaceT face) {
        gtk_h.hb_font_set_face(font.handle(), face.handle());
    }
    
    /**
     * Sets the parent font of {@code font}.
     */
    public static void fontSetParent(FontT font, FontT parent) {
        gtk_h.hb_font_set_parent(font.handle(), parent.handle());
    }
    
    /**
     * Sets the horizontal and vertical pixels-per-em (ppem) of a font.
     */
    public static void fontSetPpem(FontT font, int xPpem, int yPpem) {
        gtk_h.hb_font_set_ppem(font.handle(), xPpem, yPpem);
    }
    
    /**
     * Sets the "point size" of a font. Set to zero to unset.
     * Used in CoreText to implement optical sizing.
     * <p>
     * &lt;note>Note: There are 72 points in an inch.</note&gt;
     */
    public static void fontSetPtem(FontT font, float ptem) {
        gtk_h.hb_font_set_ptem(font.handle(), ptem);
    }
    
    /**
     * Sets the horizontal and vertical scale of a font.
     */
    public static void fontSetScale(FontT font, int xScale, int yScale) {
        gtk_h.hb_font_set_scale(font.handle(), xScale, yScale);
    }
    
    /**
     * Sets the "synthetic slant" of a font.  By default is zero.
     * Synthetic slant is the graphical skew applied to the font
     * at rendering time.
     * <p>
     * HarfBuzz needs to know this value to adjust shaping results,
     * metrics, and style values to match the slanted rendering.
     * <p>
     * &lt;note&gt;Note: The glyph shape fetched via the
     * hb_font_get_glyph_shape() is slanted to reflect this value
     * as well.&lt;/note&gt;
     * <p>
     * &lt;note&gt;Note: The slant value is a ratio.  For example, a
     * 20% slant would be represented as a 0.2 value.&lt;/note&gt;
     */
    public static void fontSetSyntheticSlant(FontT font, float slant) {
        gtk_h.hb_font_set_synthetic_slant(font.handle(), slant);
    }
    
    /**
     * Applies a list of variation coordinates (in design-space units)
     * to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code coords} will be effectively set to their
     * default values.
     */
    public static void fontSetVarCoordsDesign(FontT font, float[] coords, int coordsLength) {
        gtk_h.hb_font_set_var_coords_design(font.handle(), Interop.allocateNativeArray(coords).handle(), coordsLength);
    }
    
    /**
     * Applies a list of variation coordinates (in normalized units)
     * to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code coords} will be effectively set to their
     * default values.
     * <p>
     * &lt;note>Note: Coordinates should be normalized to 2.14.</note&gt;
     */
    public static void fontSetVarCoordsNormalized(FontT font, int[] coords, int coordsLength) {
        gtk_h.hb_font_set_var_coords_normalized(font.handle(), Interop.allocateNativeArray(coords).handle(), coordsLength);
    }
    
    /**
     * Sets design coords of a font from a named instance index.
     */
    public static void fontSetVarNamedInstance(FontT font, int instanceIndex) {
        gtk_h.hb_font_set_var_named_instance(font.handle(), instanceIndex);
    }
    
    /**
     * Applies a list of font-variation settings to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code variations} will be effectively set to their
     * default values.
     */
    public static void fontSetVariations(FontT font, VariationT[] variations, int variationsLength) {
        gtk_h.hb_font_set_variations(font.handle(), Interop.allocateNativeArray(variations).handle(), variationsLength);
    }
    
    /**
     * Subtracts the origin coordinates from an (X,Y) point coordinate,
     * in the specified glyph ID in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontSubtractGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        gtk_h.hb_font_subtract_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
        x.setValue(xPOINTER.get());
        y.setValue(yPOINTER.get());
    }
    
    /**
     * Refreshes the state of {@code font} when the underlying FT_Face has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the FT_Face.
     */
    public static void ftFontChanged(FontT font) {
        gtk_h.hb_ft_font_changed(font.handle());
    }
    
    /**
     * Fetches the FT_Load_Glyph load flags of the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static int ftFontGetLoadFlags(FontT font) {
        var RESULT = gtk_h.hb_ft_font_get_load_flags(font.handle());
        return RESULT;
    }
    
    /**
     * Configures the font-functions structure of the specified
     * {@link font_t} font object to use FreeType font functions.
     * <p>
     * In particular, you can use this function to configure an
     * existing {@link face_t} face object for use with FreeType font
     * functions even if that {@link face_t} face object was initially
     * created with hb_face_create(), and therefore was not
     * initially configured to use FreeType font functions.
     * <p>
     * An {@link face_t} face object created with hb_ft_face_create()
     * is preconfigured for FreeType font functions and does not
     * require this function to be used.
     * <p>
     * &lt;note&gt;Note: Internally, this function creates an FT_Face.
     * &lt;/note&gt;
     */
    public static void ftFontSetFuncs(FontT font) {
        gtk_h.hb_ft_font_set_funcs(font.handle());
    }
    
    /**
     * Sets the FT_Load_Glyph load flags for the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static void ftFontSetLoadFlags(FontT font, int loadFlags) {
        gtk_h.hb_ft_font_set_load_flags(font.handle(), loadFlags);
    }
    
    /**
     * Releases an FT_Face previously obtained with hb_ft_font_lock_face().
     */
    public static void ftFontUnlockFace(FontT font) {
        gtk_h.hb_ft_font_unlock_face(font.handle());
    }
    
    /**
     * Creates an {@link blob_t} blob from the specified
     * GBytes data structure.
     */
    public static BlobT glibBlobCreate(org.gtk.glib.Bytes gbytes) {
        var RESULT = gtk_h.hb_glib_blob_create(gbytes.handle());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     */
    public static UnicodeFuncsT glibGetUnicodeFuncs() {
        var RESULT = gtk_h.hb_glib_get_unicode_funcs();
        return new UnicodeFuncsT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Fetches the GUnicodeScript identifier that corresponds to the
     * specified {@link script_t} script.
     */
    public static org.gtk.glib.UnicodeScript glibScriptFromScript(ScriptT script) {
        var RESULT = gtk_h.hb_glib_script_from_script(script.getValue());
        return new org.gtk.glib.UnicodeScript(RESULT);
    }
    
    /**
     * Fetches the {@link script_t} script that corresponds to the
     * specified GUnicodeScript identifier.
     */
    public static ScriptT glibScriptToScript(org.gtk.glib.UnicodeScript script) {
        var RESULT = gtk_h.hb_glib_script_to_script(script.getValue());
        return new ScriptT(RESULT);
    }
    
    /**
     * Returns glyph flags encoded within a {@link glyph_info_t}.
     */
    public static GlyphFlagsT glyphInfoGetGlyphFlags(GlyphInfoT info) {
        var RESULT = gtk_h.hb_glyph_info_get_glyph_flags(info.handle());
        return new GlyphFlagsT(RESULT);
    }
    
    /**
     * Converts {@code str} representing a BCP 47 language tag to the corresponding
     * {@link language_t}.
     */
    public static LanguageT languageFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_language_from_string(Interop.allocateNativeArray(str).handle(), len);
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Fetch the default language from current locale.
     * <p>
     * &lt;note&gt;Note that the first time this function is called, it calls
     * "setlocale (LC_CTYPE, nullptr)" to fetch current locale.  The underlying
     * setlocale function is, in many implementations, NOT threadsafe.  To avoid
     * problems, call this function once before multiple threads can call it.
     * This function is only used from hb_buffer_guess_segment_properties() by
     * HarfBuzz itself.&lt;/note&gt;
     */
    public static LanguageT languageGetDefault() {
        var RESULT = gtk_h.hb_language_get_default();
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Converts an {@link language_t} to a string.
     */
    public static java.lang.String languageToString(LanguageT language) {
        var RESULT = gtk_h.hb_language_to_string(language.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static BoolT mapAllocationSuccessful(MapT map) {
        var RESULT = gtk_h.hb_map_allocation_successful(map.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Clears out the contents of {@code map}.
     */
    public static void mapClear(MapT map) {
        gtk_h.hb_map_clear(map.handle());
    }
    
    /**
     * Creates a new, initially empty map.
     */
    public static MapT mapCreate() {
        var RESULT = gtk_h.hb_map_create();
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Removes {@code key} and its stored value from {@code map}.
     */
    public static void mapDel(MapT map, CodepointT key) {
        gtk_h.hb_map_del(map.handle(), key.getValue());
    }
    
    /**
     * Decreases the reference count on a map. When
     * the reference count reaches zero, the map is
     * destroyed, freeing all memory.
     */
    public static void mapDestroy(MapT map) {
        gtk_h.hb_map_destroy(map.handle());
    }
    
    /**
     * Fetches the value stored for {@code key} in {@code map}.
     */
    public static CodepointT mapGet(MapT map, CodepointT key) {
        var RESULT = gtk_h.hb_map_get(map.handle(), key.getValue());
        return new CodepointT(RESULT);
    }
    
    /**
     * Fetches the singleton empty {@link map_t}.
     */
    public static MapT mapGetEmpty() {
        var RESULT = gtk_h.hb_map_get_empty();
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the number of key-value pairs in the map.
     */
    public static int mapGetPopulation(MapT map) {
        var RESULT = gtk_h.hb_map_get_population(map.handle());
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified map.
     */
    public static java.lang.foreign.MemoryAddress mapGetUserData(MapT map, UserDataKeyT key) {
        var RESULT = gtk_h.hb_map_get_user_data(map.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether {@code key} is an element of {@code map}.
     */
    public static BoolT mapHas(MapT map, CodepointT key) {
        var RESULT = gtk_h.hb_map_has(map.handle(), key.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code map} is empty (contains no elements).
     */
    public static BoolT mapIsEmpty(MapT map) {
        var RESULT = gtk_h.hb_map_is_empty(map.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on a map.
     */
    public static MapT mapReference(MapT map) {
        var RESULT = gtk_h.hb_map_reference(map.handle());
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Stores {@code key}:{@code value} in the map.
     */
    public static void mapSet(MapT map, CodepointT key, CodepointT value) {
        gtk_h.hb_map_set(map.handle(), key.getValue(), value.getValue());
    }
    
    /**
     * Fetches a list of all color layers for the specified glyph index in the specified
     * face. The list returned will begin at the offset provided.
     */
    public static int otColorGlyphGetLayers(FaceT face, CodepointT glyph, int startOffset, PointerInteger layerCount, OtColorLayerT[] layers) {
        var RESULT = gtk_h.hb_ot_color_glyph_get_layers(face.handle(), glyph.getValue(), startOffset, layerCount.handle(), Interop.allocateNativeArray(layers).handle());
        return RESULT;
    }
    
    /**
     * Fetches the PNG image for a glyph. This function takes a font object, not a face object,
     * as input. To get an optimally sized PNG blob, the UPEM value must be set on the {@code font}
     * object. If UPEM is unset, the blob returned will be the largest PNG available.
     * <p>
     * If the glyph has no PNG image, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferencePng(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_color_glyph_reference_png(font.handle(), glyph.getValue());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the SVG document for a glyph. The blob may be either plain text or gzip-encoded.
     * <p>
     * If the glyph has no SVG document, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferenceSvg(FaceT face, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_color_glyph_reference_svg(face.handle(), glyph.getValue());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Tests whether a face includes any {@code COLR} color layers.
     */
    public static BoolT otColorHasLayers(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_layers(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes a {@code CPAL} color-palette table.
     */
    public static BoolT otColorHasPalettes(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_palettes(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face has PNG glyph images (either in {@code CBDT} or {@code sbix} tables).
     */
    public static BoolT otColorHasPng(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_png(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes any {@code SVG} glyph images.
     */
    public static BoolT otColorHasSvg(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_svg(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the specified color in a face's {@code CPAL} color palette.
     * <p>
     * Display names can be generic (e.g., "Background") or specific
     * (e.g., "Eye color").
     */
    public static OtNameIdT otColorPaletteColorGetNameId(FaceT face, int colorIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_color_get_name_id(face.handle(), colorIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Fetches a list of the colors in a color palette.
     * <p>
     * After calling this function, {@code colors} will be filled with the palette
     * colors. If {@code colors} is NULL, the function will just return the number
     * of total colors without storing any actual colors; this can be used
     * for allocating a buffer of suitable size before calling
     * hb_ot_color_palette_get_colors() a second time.
     */
    public static int otColorPaletteGetColors(FaceT face, int paletteIndex, int startOffset, PointerInteger colorCount, ColorT[] colors) {
        var RESULT = gtk_h.hb_ot_color_palette_get_colors(face.handle(), paletteIndex, startOffset, colorCount.handle(), Interop.allocateNativeArray(ColorT.getIntegerValues(colors)).handle());
        return RESULT;
    }
    
    /**
     * Fetches the number of color palettes in a face.
     */
    public static int otColorPaletteGetCount(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_palette_get_count(face.handle());
        return RESULT;
    }
    
    /**
     * Fetches the flags defined for a color palette.
     */
    public static OtColorPaletteFlagsT otColorPaletteGetFlags(FaceT face, int paletteIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_get_flags(face.handle(), paletteIndex);
        return new OtColorPaletteFlagsT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * a {@code CPAL} color palette.
     * <p>
     * Palette display names can be generic (e.g., "Default") or provide
     * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
     */
    public static OtNameIdT otColorPaletteGetNameId(FaceT face, int paletteIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_get_name_id(face.handle(), paletteIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Sets the font functions to use when working with {@code font}.
     */
    public static void otFontSetFuncs(FontT font) {
        gtk_h.hb_ot_font_set_funcs(font.handle());
    }
    
    /**
     * Fetches a list of all feature indexes in the specified face's GSUB table
     * or GPOS table, underneath the specified scripts, languages, and features.
     * If no list of scripts is provided, all scripts will be queried. If no list
     * of languages is provided, all languages will be queried. If no list of
     * features is provided, all features will be queried.
     */
    public static void otLayoutCollectFeatures(FaceT face, TagT tableTag, TagT scripts, TagT languages, TagT features, SetT featureIndexes) {
        PointerInteger scriptsPOINTER = new PointerInteger(scripts.getValue());
        PointerInteger languagesPOINTER = new PointerInteger(languages.getValue());
        PointerInteger featuresPOINTER = new PointerInteger(features.getValue());
        gtk_h.hb_ot_layout_collect_features(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), featureIndexes.handle());
        scripts.setValue(scriptsPOINTER.get());
        languages.setValue(languagesPOINTER.get());
        features.setValue(featuresPOINTER.get());
    }
    
    /**
     * Fetches a list of all feature-lookup indexes in the specified face's GSUB
     * table or GPOS table, underneath the specified scripts, languages, and
     * features. If no list of scripts is provided, all scripts will be queried.
     * If no list of languages is provided, all languages will be queried. If no
     * list of features is provided, all features will be queried.
     */
    public static void otLayoutCollectLookups(FaceT face, TagT tableTag, TagT scripts, TagT languages, TagT features, SetT lookupIndexes) {
        PointerInteger scriptsPOINTER = new PointerInteger(scripts.getValue());
        PointerInteger languagesPOINTER = new PointerInteger(languages.getValue());
        PointerInteger featuresPOINTER = new PointerInteger(features.getValue());
        gtk_h.hb_ot_layout_collect_lookups(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), lookupIndexes.handle());
        scripts.setValue(scriptsPOINTER.get());
        languages.setValue(languagesPOINTER.get());
        features.setValue(featuresPOINTER.get());
    }
    
    /**
     * Fetches a list of the characters defined as having a variant under the specified
     * "Character Variant" ("cvXX") feature tag.
     */
    public static int otLayoutFeatureGetCharacters(FaceT face, TagT tableTag, int featureIndex, int startOffset, PointerInteger charCount, CodepointT[] characters) {
        var RESULT = gtk_h.hb_ot_layout_feature_get_characters(face.handle(), tableTag.getValue(), featureIndex, startOffset, charCount.handle(), Interop.allocateNativeArray(CodepointT.getIntegerValues(characters)).handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table. The list returned will
     * begin at the offset provided.
     */
    public static int otLayoutFeatureGetLookups(FaceT face, TagT tableTag, int featureIndex, int startOffset, PointerInteger lookupCount, int[] lookupIndexes) {
        var RESULT = gtk_h.hb_ot_layout_feature_get_lookups(face.handle(), tableTag.getValue(), featureIndex, startOffset, lookupCount.handle(), Interop.allocateNativeArray(lookupIndexes).handle());
        return RESULT;
    }
    
    /**
     * Fetches name indices from feature parameters for "Stylistic Set" ('ssXX') or
     * "Character Variant" ('cvXX') features.
     */
    public static BoolT otLayoutFeatureGetNameIds(FaceT face, TagT tableTag, int featureIndex, OtNameIdT labelId, OtNameIdT tooltipId, OtNameIdT sampleId, PointerInteger numNamedParameters, OtNameIdT firstParamId) {
        PointerInteger labelIdPOINTER = new PointerInteger(labelId.getValue());
        PointerInteger tooltipIdPOINTER = new PointerInteger(tooltipId.getValue());
        PointerInteger sampleIdPOINTER = new PointerInteger(sampleId.getValue());
        PointerInteger firstParamIdPOINTER = new PointerInteger(firstParamId.getValue());
        var RESULT = gtk_h.hb_ot_layout_feature_get_name_ids(face.handle(), tableTag.getValue(), featureIndex, new PointerInteger(labelId.getValue()).handle(), new PointerInteger(tooltipId.getValue()).handle(), new PointerInteger(sampleId.getValue()).handle(), numNamedParameters.handle(), new PointerInteger(firstParamId.getValue()).handle());
        labelId.setValue(labelIdPOINTER.get());
        tooltipId.setValue(tooltipIdPOINTER.get());
        sampleId.setValue(sampleIdPOINTER.get());
        firstParamId.setValue(firstParamIdPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table, enabled at the specified
     * variations index. The list returned will begin at the offset provided.
     */
    public static int otLayoutFeatureWithVariationsGetLookups(FaceT face, TagT tableTag, int featureIndex, int variationsIndex, int startOffset, PointerInteger lookupCount, int[] lookupIndexes) {
        var RESULT = gtk_h.hb_ot_layout_feature_with_variations_get_lookups(face.handle(), tableTag.getValue(), featureIndex, variationsIndex, startOffset, lookupCount.handle(), Interop.allocateNativeArray(lookupIndexes).handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of all attachment points for the specified glyph in the GDEF
     * table of the face. The list returned will begin at the offset provided.
     * <p>
     * Useful if the client program wishes to cache the list.
     */
    public static int otLayoutGetAttachPoints(FaceT face, CodepointT glyph, int startOffset, PointerInteger pointCount, int[] pointArray) {
        var RESULT = gtk_h.hb_ot_layout_get_attach_points(face.handle(), glyph.getValue(), startOffset, pointCount.handle(), Interop.allocateNativeArray(pointArray).handle());
        return RESULT;
    }
    
    /**
     * Fetches a baseline value from the face.
     */
    public static BoolT otLayoutGetBaseline(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        PointerInteger coordPOINTER = new PointerInteger(coord.getValue());
        var RESULT = gtk_h.hb_ot_layout_get_baseline(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), new PointerInteger(coord.getValue()).handle());
        coord.setValue(coordPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a baseline value from the face, and synthesizes
     * it if the font does not have it.
     */
    public static void otLayoutGetBaselineWithFallback(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        PointerInteger coordPOINTER = new PointerInteger(coord.getValue());
        gtk_h.hb_ot_layout_get_baseline_with_fallback(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), new PointerInteger(coord.getValue()).handle());
        coord.setValue(coordPOINTER.get());
    }
    
    /**
     * Fetches the GDEF class of the requested glyph in the specified face.
     */
    public static OtLayoutGlyphClassT otLayoutGetGlyphClass(FaceT face, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_layout_get_glyph_class(face.handle(), glyph.getValue());
        return new OtLayoutGlyphClassT(RESULT);
    }
    
    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     */
    public static void otLayoutGetGlyphsInClass(FaceT face, OtLayoutGlyphClassT klass, SetT glyphs) {
        gtk_h.hb_ot_layout_get_glyphs_in_class(face.handle(), klass.getValue(), glyphs.handle());
    }
    
    /**
     * Fetches the dominant horizontal baseline tag used by {@code script}.
     */
    public static OtLayoutBaselineTagT otLayoutGetHorizontalBaselineTagForScript(ScriptT script) {
        var RESULT = gtk_h.hb_ot_layout_get_horizontal_baseline_tag_for_script(script.getValue());
        return new OtLayoutBaselineTagT(RESULT);
    }
    
    /**
     * Fetches a list of the caret positions defined for a ligature glyph in the GDEF
     * table of the font. The list returned will begin at the offset provided.
     * <p>
     * Note that a ligature that is formed from n characters will have n-1
     * caret positions. The first character is not represented in the array,
     * since its caret position is the glyph position.
     * <p>
     * The positions returned by this function are 'unshaped', and will have to
     * be fixed up for kerning that may be applied to the ligature glyph.
     */
    public static int otLayoutGetLigatureCarets(FontT font, DirectionT direction, CodepointT glyph, int startOffset, PointerInteger caretCount, PositionT[] caretArray) {
        var RESULT = gtk_h.hb_ot_layout_get_ligature_carets(font.handle(), direction.getValue(), glyph.getValue(), startOffset, caretCount.handle(), Interop.allocateNativeArray(PositionT.getIntegerValues(caretArray)).handle());
        return RESULT;
    }
    
    /**
     * Fetches optical-size feature data (i.e., the {@code size} feature from GPOS). Note that
     * the subfamily_id and the subfamily name string (accessible via the subfamily_name_id)
     * as used here are defined as pertaining only to fonts within a font family that differ
     * specifically in their respective size ranges; other ways to differentiate fonts within
     * a subfamily are not covered by the {@code size} feature.
     * <p>
     * For more information on this distinction, see the [{@code size} feature documentation](
     * https://docs.microsoft.com/en-us/typography/opentype/spec/features_pt{@code tag}-size).
     */
    public static BoolT otLayoutGetSizeParams(FaceT face, PointerInteger designSize, PointerInteger subfamilyId, OtNameIdT subfamilyNameId, PointerInteger rangeStart, PointerInteger rangeEnd) {
        PointerInteger subfamilyNameIdPOINTER = new PointerInteger(subfamilyNameId.getValue());
        var RESULT = gtk_h.hb_ot_layout_get_size_params(face.handle(), designSize.handle(), subfamilyId.handle(), new PointerInteger(subfamilyNameId.getValue()).handle(), rangeStart.handle(), rangeEnd.handle());
        subfamilyNameId.setValue(subfamilyNameIdPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face has any glyph classes defined in its GDEF table.
     */
    public static BoolT otLayoutHasGlyphClasses(FaceT face) {
        var RESULT = gtk_h.hb_ot_layout_has_glyph_classes(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any GPOS positioning.
     */
    public static BoolT otLayoutHasPositioning(FaceT face) {
        var RESULT = gtk_h.hb_ot_layout_has_positioning(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any GSUB substitutions.
     */
    public static BoolT otLayoutHasSubstitution(FaceT face) {
        var RESULT = gtk_h.hb_ot_layout_has_substitution(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the index of a given feature tag in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageFindFeature(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, TagT featureTag, PointerInteger featureIndex) {
        var RESULT = gtk_h.hb_ot_layout_language_find_feature(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureTag.getValue(), featureIndex.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureIndexes(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, int startOffset, PointerInteger featureCount, int[] featureIndexes) {
        var RESULT = gtk_h.hb_ot_layout_language_get_feature_indexes(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, featureCount.handle(), Interop.allocateNativeArray(featureIndexes).handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureTags(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, int startOffset, PointerInteger featureCount, TagT[] featureTags) {
        var RESULT = gtk_h.hb_ot_layout_language_get_feature_tags(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, featureCount.handle(), Interop.allocateNativeArray(TagT.getIntegerValues(featureTags)).handle());
        return RESULT;
    }
    
    /**
     * Fetches the tag of a requested feature index in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageGetRequiredFeature(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, PointerInteger featureIndex, TagT featureTag) {
        PointerInteger featureTagPOINTER = new PointerInteger(featureTag.getValue());
        var RESULT = gtk_h.hb_ot_layout_language_get_required_feature(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureIndex.handle(), new PointerInteger(featureTag.getValue()).handle());
        featureTag.setValue(featureTagPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the index of a requested feature in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageGetRequiredFeatureIndex(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, PointerInteger featureIndex) {
        var RESULT = gtk_h.hb_ot_layout_language_get_required_feature_index(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureIndex.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all glyphs affected by the specified lookup in the
     * specified face's GSUB table or GPOS table.
     */
    public static void otLayoutLookupCollectGlyphs(FaceT face, TagT tableTag, int lookupIndex, SetT glyphsBefore, SetT glyphsInput, SetT glyphsAfter, SetT glyphsOutput) {
        gtk_h.hb_ot_layout_lookup_collect_glyphs(face.handle(), tableTag.getValue(), lookupIndex, glyphsBefore.handle(), glyphsInput.handle(), glyphsAfter.handle(), glyphsOutput.handle());
    }
    
    /**
     * Fetches alternates of a glyph from a given GSUB lookup index.
     */
    public static int otLayoutLookupGetGlyphAlternates(FaceT face, int lookupIndex, CodepointT glyph, int startOffset, PointerInteger alternateCount, CodepointT[] alternateGlyphs) {
        var RESULT = gtk_h.hb_ot_layout_lookup_get_glyph_alternates(face.handle(), lookupIndex, glyph.getValue(), startOffset, alternateCount.handle(), Interop.allocateNativeArray(CodepointT.getIntegerValues(alternateGlyphs)).handle());
        return RESULT;
    }
    
    /**
     * Compute the transitive closure of glyphs needed for a
     * specified lookup.
     */
    public static void otLayoutLookupSubstituteClosure(FaceT face, int lookupIndex, SetT glyphs) {
        gtk_h.hb_ot_layout_lookup_substitute_closure(face.handle(), lookupIndex, glyphs.handle());
    }
    
    /**
     * Tests whether a specified lookup in the specified face would
     * trigger a substitution on the given glyph sequence.
     */
    public static BoolT otLayoutLookupWouldSubstitute(FaceT face, int lookupIndex, CodepointT glyphs, int glyphsLength, BoolT zeroContext) {
        PointerInteger glyphsPOINTER = new PointerInteger(glyphs.getValue());
        var RESULT = gtk_h.hb_ot_layout_lookup_would_substitute(face.handle(), lookupIndex, new PointerInteger(glyphs.getValue()).handle(), glyphsLength, zeroContext.getValue());
        glyphs.setValue(glyphsPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Compute the transitive closure of glyphs needed for all of the
     * provided lookups.
     */
    public static void otLayoutLookupsSubstituteClosure(FaceT face, SetT lookups, SetT glyphs) {
        gtk_h.hb_ot_layout_lookups_substitute_closure(face.handle(), lookups.handle(), glyphs.handle());
    }
    
    /**
     * Fetches a list of language tags in the given face's GSUB or GPOS table, underneath
     * the specified script index. The list returned will begin at the offset provided.
     */
    public static int otLayoutScriptGetLanguageTags(FaceT face, TagT tableTag, int scriptIndex, int startOffset, PointerInteger languageCount, TagT[] languageTags) {
        var RESULT = gtk_h.hb_ot_layout_script_get_language_tags(face.handle(), tableTag.getValue(), scriptIndex, startOffset, languageCount.handle(), Interop.allocateNativeArray(TagT.getIntegerValues(languageTags)).handle());
        return RESULT;
    }
    
    /**
     * Fetches the index of the first language tag fom {@code language_tags} that is present
     * in the specified face's GSUB or GPOS table, underneath the specified script
     * index.
     * <p>
     * If none of the given language tags is found, {@code false} is returned and
     * {@code language_index} is set to the default language index.
     */
    public static BoolT otLayoutScriptSelectLanguage(FaceT face, TagT tableTag, int scriptIndex, int languageCount, TagT languageTags, PointerInteger languageIndex) {
        PointerInteger languageTagsPOINTER = new PointerInteger(languageTags.getValue());
        var RESULT = gtk_h.hb_ot_layout_script_select_language(face.handle(), tableTag.getValue(), scriptIndex, languageCount, new PointerInteger(languageTags.getValue()).handle(), languageIndex.handle());
        languageTags.setValue(languageTagsPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Deprecated since 2.0.0
     */
    public static BoolT otLayoutTableChooseScript(FaceT face, TagT tableTag, TagT scriptTags, PointerInteger scriptIndex, TagT chosenScript) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        PointerInteger chosenScriptPOINTER = new PointerInteger(chosenScript.getValue());
        var RESULT = gtk_h.hb_ot_layout_table_choose_script(face.handle(), tableTag.getValue(), new PointerInteger(scriptTags.getValue()).handle(), scriptIndex.handle(), new PointerInteger(chosenScript.getValue()).handle());
        scriptTags.setValue(scriptTagsPOINTER.get());
        chosenScript.setValue(chosenScriptPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a list of feature variations in the specified face's GSUB table
     * or GPOS table, at the specified variation coordinates.
     */
    public static BoolT otLayoutTableFindFeatureVariations(FaceT face, TagT tableTag, PointerInteger coords, int numCoords, PointerInteger variationsIndex) {
        var RESULT = gtk_h.hb_ot_layout_table_find_feature_variations(face.handle(), tableTag.getValue(), coords.handle(), numCoords, variationsIndex.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the index if a given script tag in the specified face's GSUB table
     * or GPOS table.
     */
    public static BoolT otLayoutTableFindScript(FaceT face, TagT tableTag, TagT scriptTag, PointerInteger scriptIndex) {
        var RESULT = gtk_h.hb_ot_layout_table_find_script(face.handle(), tableTag.getValue(), scriptTag.getValue(), scriptIndex.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all feature tags in the given face's GSUB or GPOS table.
     */
    public static int otLayoutTableGetFeatureTags(FaceT face, TagT tableTag, int startOffset, PointerInteger featureCount, TagT[] featureTags) {
        var RESULT = gtk_h.hb_ot_layout_table_get_feature_tags(face.handle(), tableTag.getValue(), startOffset, featureCount.handle(), Interop.allocateNativeArray(TagT.getIntegerValues(featureTags)).handle());
        return RESULT;
    }
    
    /**
     * Fetches the total number of lookups enumerated in the specified
     * face's GSUB table or GPOS table.
     */
    public static int otLayoutTableGetLookupCount(FaceT face, TagT tableTag) {
        var RESULT = gtk_h.hb_ot_layout_table_get_lookup_count(face.handle(), tableTag.getValue());
        return RESULT;
    }
    
    /**
     * Fetches a list of all scripts enumerated in the specified face's GSUB table
     * or GPOS table. The list returned will begin at the offset provided.
     */
    public static int otLayoutTableGetScriptTags(FaceT face, TagT tableTag, int startOffset, PointerInteger scriptCount, TagT[] scriptTags) {
        var RESULT = gtk_h.hb_ot_layout_table_get_script_tags(face.handle(), tableTag.getValue(), startOffset, scriptCount.handle(), Interop.allocateNativeArray(TagT.getIntegerValues(scriptTags)).handle());
        return RESULT;
    }
    
    /**
     * Selects an OpenType script for {@code table_tag} from the {@code script_tags} array.
     * <p>
     * If the table does not have any of the requested scripts, then {@code DFLT},
     * {@code dflt}, and {@code latn} tags are tried in that order. If the table still does not
     * have any of these scripts, {@code script_index} and {@code chosen_script} are set to
     * {@code HB_OT_LAYOUT_NO_SCRIPT_INDEX}.
     */
    public static BoolT otLayoutTableSelectScript(FaceT face, TagT tableTag, int scriptCount, TagT scriptTags, PointerInteger scriptIndex, TagT chosenScript) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        PointerInteger chosenScriptPOINTER = new PointerInteger(chosenScript.getValue());
        var RESULT = gtk_h.hb_ot_layout_table_select_script(face.handle(), tableTag.getValue(), scriptCount, new PointerInteger(scriptTags.getValue()).handle(), scriptIndex.handle(), new PointerInteger(chosenScript.getValue()).handle());
        scriptTags.setValue(scriptTagsPOINTER.get());
        chosenScript.setValue(chosenScriptPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the specified math constant. For most constants, the value returned
     * is an {@link position_t}.
     * <p>
     * However, if the requested constant is {@code HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN},
     * {@code HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN} or
     * {@code HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN}, then the return value is
     * an integer between 0 and 100 representing that percentage.
     */
    public static PositionT otMathGetConstant(FontT font, OtMathConstantT constant) {
        var RESULT = gtk_h.hb_ot_math_get_constant(font.handle(), constant.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the GlyphAssembly for the specified font, glyph index, and direction.
     * Returned are a list of {@link ot_math_glyph_part_t} glyph parts that can be
     * used to draw the glyph and an italics-correction value (if one is defined
     * in the font).
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link direction_t}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     */
    public static int otMathGetGlyphAssembly(FontT font, CodepointT glyph, DirectionT direction, int startOffset, PointerInteger partsCount, OtMathGlyphPartT[] parts, PositionT italicsCorrection) {
        PointerInteger italicsCorrectionPOINTER = new PointerInteger(italicsCorrection.getValue());
        var RESULT = gtk_h.hb_ot_math_get_glyph_assembly(font.handle(), glyph.getValue(), direction.getValue(), startOffset, partsCount.handle(), Interop.allocateNativeArray(parts).handle(), new PointerInteger(italicsCorrection.getValue()).handle());
        italicsCorrection.setValue(italicsCorrectionPOINTER.get());
        return RESULT;
    }
    
    /**
     * Fetches an italics-correction value (if one exists) for the specified
     * glyph index.
     */
    public static PositionT otMathGetGlyphItalicsCorrection(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_italics_correction(font.handle(), glyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the math kerning (cut-ins) value for the specified font, glyph index, and
     * {@code kern}.
     * <p>
     * If the MathKern table is found, the function examines it to find a height
     * value that is greater or equal to {@code correction_height}. If such a height
     * value is found, corresponding kerning value from the table is returned. If
     * no such height value is found, the last kerning value is returned.
     */
    public static PositionT otMathGetGlyphKerning(FontT font, CodepointT glyph, OtMathKernT kern, PositionT correctionHeight) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_kerning(font.handle(), glyph.getValue(), kern.getValue(), correctionHeight.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the raw MathKern (cut-in) data for the specified font, glyph index,
     * and {@code kern}. The corresponding list of kern values and correction heights is
     * returned as a list of {@link ot_math_kern_entry_t} structs.
     * <p>
     * See also {@code hb_ot_math_get_glyph_kerning}, which handles selecting the
     * appropriate kern value for a given correction height.
     * <p>
     * &lt;note>For a glyph with @n defined kern values (where @n &gt; 0), there are only
     * @n−1 defined correction heights, as each correction height defines a boundary
     * past which the next kern value should be selected. Therefore, only the
     * {@link ot_math_kern_entry_t}.kern_value of the uppermost {@link ot_math_kern_entry_t}
     * actually comes from the font; its corresponding
     * {@link ot_math_kern_entry_t}.max_correction_height is always set to
     * &lt;code>INT32_MAX</code>.</note&gt;
     */
    public static int otMathGetGlyphKernings(FontT font, CodepointT glyph, OtMathKernT kern, int startOffset, PointerInteger entriesCount, OtMathKernEntryT[] kernEntries) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_kernings(font.handle(), glyph.getValue(), kern.getValue(), startOffset, entriesCount.handle(), Interop.allocateNativeArray(kernEntries).handle());
        return RESULT;
    }
    
    /**
     * Fetches a top-accent-attachment value (if one exists) for the specified
     * glyph index.
     * <p>
     * For any glyph that does not have a top-accent-attachment value - that is,
     * a glyph not covered by the {@code MathTopAccentAttachment} table (or, when
     * {@code font} has no {@code MathTopAccentAttachment} table or no {@code MATH} table, any
     * glyph) - the function synthesizes a value, returning the position at
     * one-half the glyph's advance width.
     */
    public static PositionT otMathGetGlyphTopAccentAttachment(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_top_accent_attachment(font.handle(), glyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the MathGlyphConstruction for the specified font, glyph index, and
     * direction. The corresponding list of size variants is returned as a list of
     * {@link ot_math_glyph_variant_t} structs.
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link direction_t}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     */
    public static int otMathGetGlyphVariants(FontT font, CodepointT glyph, DirectionT direction, int startOffset, PointerInteger variantsCount, OtMathGlyphVariantT[] variants) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_variants(font.handle(), glyph.getValue(), direction.getValue(), startOffset, variantsCount.handle(), Interop.allocateNativeArray(variants).handle());
        return RESULT;
    }
    
    /**
     * Fetches the MathVariants table for the specified font and returns the
     * minimum overlap of connecting glyphs that are required to draw a glyph
     * assembly in the specified direction.
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link direction_t}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     */
    public static PositionT otMathGetMinConnectorOverlap(FontT font, DirectionT direction) {
        var RESULT = gtk_h.hb_ot_math_get_min_connector_overlap(font.handle(), direction.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Tests whether a face has a {@code MATH} table.
     */
    public static BoolT otMathHasData(FaceT face) {
        var RESULT = gtk_h.hb_ot_math_has_data(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the given glyph index is an extended shape in the face.
     */
    public static BoolT otMathIsGlyphExtendedShape(FaceT face, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_math_is_glyph_extended_shape(face.handle(), glyph.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches all available feature types.
     */
    public static int otMetaGetEntryTags(FaceT face, int startOffset, PointerInteger entriesCount, OtMetaTagT[] entries) {
        var RESULT = gtk_h.hb_ot_meta_get_entry_tags(face.handle(), startOffset, entriesCount.handle(), Interop.allocateNativeArray(OtMetaTagT.getValues(entries)).handle());
        return RESULT;
    }
    
    /**
     * It fetches metadata entry of a given tag from a font.
     */
    public static BlobT otMetaReferenceEntry(FaceT face, OtMetaTagT metaTag) {
        var RESULT = gtk_h.hb_ot_meta_reference_entry(face.handle(), metaTag.getValue());
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font}.
     */
    public static BoolT otMetricsGetPosition(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        PointerInteger positionPOINTER = new PointerInteger(position.getValue());
        var RESULT = gtk_h.hb_ot_metrics_get_position(font.handle(), metricsTag.getValue(), new PointerInteger(position.getValue()).handle());
        position.setValue(positionPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font},
     * and synthesizes a value if it the value is missing in the font.
     */
    public static void otMetricsGetPositionWithFallback(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        PointerInteger positionPOINTER = new PointerInteger(position.getValue());
        gtk_h.hb_ot_metrics_get_position_with_fallback(font.handle(), metricsTag.getValue(), new PointerInteger(position.getValue()).handle());
        position.setValue(positionPOINTER.get());
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font} with the
     * current font variation settings applied.
     */
    public static float otMetricsGetVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_variation(font.handle(), metricsTag.getValue());
        return RESULT;
    }
    
    /**
     * Fetches horizontal metrics value corresponding to {@code metrics_tag} from {@code font}
     * with the current font variation settings applied.
     */
    public static PositionT otMetricsGetXVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_x_variation(font.handle(), metricsTag.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches vertical metrics value corresponding to {@code metrics_tag} from {@code font} with
     * the current font variation settings applied.
     */
    public static PositionT otMetricsGetYVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_y_variation(font.handle(), metricsTag.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-16 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf16(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, short[] text) {
        var RESULT = gtk_h.hb_ot_name_get_utf16(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), Interop.allocateNativeArray(text).handle());
        return RESULT;
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-32 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf32(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, int[] text) {
        var RESULT = gtk_h.hb_ot_name_get_utf32(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), Interop.allocateNativeArray(text).handle());
        return RESULT;
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-8 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf8(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, java.lang.String[] text) {
        var RESULT = gtk_h.hb_ot_name_get_utf8(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), Interop.allocateNativeArray(text).handle());
        return RESULT;
    }
    
    /**
     * Enumerates all available name IDs and language combinations. Returned
     * array is owned by the {@code face} and should not be modified.  It can be
     * used as long as {@code face} is alive.
     */
    public static PointerIterator<OtNameEntryT> otNameListNames(FaceT face, PointerInteger numEntries) {
        var RESULT = gtk_h.hb_ot_name_list_names(face.handle(), numEntries.handle());
        return new PointerProxy<OtNameEntryT>(RESULT, OtNameEntryT.class).iterator();
    }
    
    /**
     * Computes the transitive closure of glyphs needed for a specified
     * input buffer under the given font and feature list. The closure is
     * computed as a set, not as a list.
     */
    public static void otShapeGlyphsClosure(FontT font, BufferT buffer, FeatureT[] features, int numFeatures, SetT glyphs) {
        gtk_h.hb_ot_shape_glyphs_closure(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures, glyphs.handle());
    }
    
    /**
     * Computes the complete set of GSUB or GPOS lookups that are applicable
     * under a given {@code shape_plan}.
     */
    public static void otShapePlanCollectLookups(ShapePlanT shapePlan, TagT tableTag, SetT lookupIndexes) {
        gtk_h.hb_ot_shape_plan_collect_lookups(shapePlan.handle(), tableTag.getValue(), lookupIndexes.handle());
    }
    
    public static TagT otTagFromLanguage(LanguageT language) {
        var RESULT = gtk_h.hb_ot_tag_from_language(language.handle());
        return new TagT(RESULT);
    }
    
    /**
     * Converts a language tag to an {@link language_t}.
     */
    public static LanguageT otTagToLanguage(TagT tag) {
        var RESULT = gtk_h.hb_ot_tag_to_language(tag.getValue());
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Converts a script tag to an {@link script_t}.
     */
    public static ScriptT otTagToScript(TagT tag) {
        var RESULT = gtk_h.hb_ot_tag_to_script(tag.getValue());
        return new ScriptT(RESULT);
    }
    
    public static void otTagsFromScript(ScriptT script, TagT scriptTag1, TagT scriptTag2) {
        PointerInteger scriptTag1POINTER = new PointerInteger(scriptTag1.getValue());
        PointerInteger scriptTag2POINTER = new PointerInteger(scriptTag2.getValue());
        gtk_h.hb_ot_tags_from_script(script.getValue(), new PointerInteger(scriptTag1.getValue()).handle(), new PointerInteger(scriptTag2.getValue()).handle());
        scriptTag1.setValue(scriptTag1POINTER.get());
        scriptTag2.setValue(scriptTag2POINTER.get());
    }
    
    /**
     * Converts an {@link script_t} and an {@link language_t} to script and language tags.
     */
    public static void otTagsFromScriptAndLanguage(ScriptT script, LanguageT language, PointerInteger scriptCount, TagT scriptTags, PointerInteger languageCount, TagT languageTags) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        PointerInteger languageTagsPOINTER = new PointerInteger(languageTags.getValue());
        gtk_h.hb_ot_tags_from_script_and_language(script.getValue(), language.handle(), scriptCount.handle(), new PointerInteger(scriptTags.getValue()).handle(), languageCount.handle(), new PointerInteger(languageTags.getValue()).handle());
        scriptTags.setValue(scriptTagsPOINTER.get());
        languageTags.setValue(languageTagsPOINTER.get());
    }
    
    /**
     * Converts a script tag and a language tag to an {@link script_t} and an
     * {@link language_t}.
     */
    public static void otTagsToScriptAndLanguage(TagT scriptTag, TagT languageTag, ScriptT script, LanguageT language) {
        gtk_h.hb_ot_tags_to_script_and_language(scriptTag.getValue(), languageTag.getValue(), new PointerInteger(script.getValue()).handle(), language.handle());
    }
    
    /**
     * Fetches the variation-axis information corresponding to the specified axis tag
     * in the specified face.
     */
    public static BoolT otVarFindAxisInfo(FaceT face, TagT axisTag, OtVarAxisInfoT axisInfo) {
        var RESULT = gtk_h.hb_ot_var_find_axis_info(face.handle(), axisTag.getValue(), axisInfo.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the number of OpenType variation axes included in the face.
     */
    public static int otVarGetAxisCount(FaceT face) {
        var RESULT = gtk_h.hb_ot_var_get_axis_count(face.handle());
        return RESULT;
    }
    
    /**
     * Fetches a list of all variation axes in the specified face. The list returned will begin
     * at the offset provided.
     */
    public static int otVarGetAxisInfos(FaceT face, int startOffset, PointerInteger axesCount, OtVarAxisInfoT[] axesArray) {
        var RESULT = gtk_h.hb_ot_var_get_axis_infos(face.handle(), startOffset, axesCount.handle(), Interop.allocateNativeArray(axesArray).handle());
        return RESULT;
    }
    
    /**
     * Fetches the number of named instances included in the face.
     */
    public static int otVarGetNamedInstanceCount(FaceT face) {
        var RESULT = gtk_h.hb_ot_var_get_named_instance_count(face.handle());
        return RESULT;
    }
    
    /**
     * Tests whether a face includes any OpenType variation data in the {@code fvar} table.
     */
    public static BoolT otVarHasData(FaceT face) {
        var RESULT = gtk_h.hb_ot_var_has_data(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the design-space coordinates corresponding to the given
     * named instance in the face.
     */
    public static int otVarNamedInstanceGetDesignCoords(FaceT face, int instanceIndex, PointerInteger coordsLength, float[] coords) {
        var RESULT = gtk_h.hb_ot_var_named_instance_get_design_coords(face.handle(), instanceIndex, coordsLength.handle(), Interop.allocateNativeArray(coords).handle());
        return RESULT;
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "PostScript name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetPostscriptNameId(FaceT face, int instanceIndex) {
        var RESULT = gtk_h.hb_ot_var_named_instance_get_postscript_name_id(face.handle(), instanceIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "Subfamily name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetSubfamilyNameId(FaceT face, int instanceIndex) {
        var RESULT = gtk_h.hb_ot_var_named_instance_get_subfamily_name_id(face.handle(), instanceIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Normalizes the given design-space coordinates. The minimum and maximum
     * values for the axis are mapped to the interval [-1,1], with the default
     * axis value mapped to 0.
     * <p>
     * The normalized values have 14 bits of fixed-point sub-integer precision as per
     * OpenType specification.
     * <p>
     * Any additional scaling defined in the face's {@code avar} table is also
     * applied, as described at https://docs.microsoft.com/en-us/typography/opentype/spec/avar
     */
    public static void otVarNormalizeCoords(FaceT face, int coordsLength, PointerFloat designCoords, PointerInteger normalizedCoords) {
        gtk_h.hb_ot_var_normalize_coords(face.handle(), coordsLength, designCoords.handle(), normalizedCoords.handle());
    }
    
    /**
     * Normalizes all of the coordinates in the given list of variation axes.
     */
    public static void otVarNormalizeVariations(FaceT face, VariationT variations, int variationsLength, int[] coords, int coordsLength) {
        gtk_h.hb_ot_var_normalize_variations(face.handle(), variations.handle(), variationsLength, Interop.allocateNativeArray(coords).handle(), coordsLength);
    }
    
    /**
     * Converts an ISO 15924 script tag to a corresponding {@link script_t}.
     */
    public static ScriptT scriptFromIso15924Tag(TagT tag) {
        var RESULT = gtk_h.hb_script_from_iso15924_tag(tag.getValue());
        return new ScriptT(RESULT);
    }
    
    /**
     * Converts a string {@code str} representing an ISO 15924 script tag to a
     * corresponding {@link script_t}. Shorthand for hb_tag_from_string() then
     * hb_script_from_iso15924_tag().
     */
    public static ScriptT scriptFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_script_from_string(Interop.allocateNativeArray(str).handle(), len);
        return new ScriptT(RESULT);
    }
    
    /**
     * Fetches the {@link direction_t} of a script when it is
     * set horizontally. All right-to-left scripts will return
     * {@code HB_DIRECTION_RTL}. All left-to-right scripts will return
     * {@code HB_DIRECTION_LTR}.  Scripts that can be written either
     * horizontally or vertically will return {@code HB_DIRECTION_INVALID}.
     * Unknown scripts will return {@code HB_DIRECTION_LTR}.
     */
    public static DirectionT scriptGetHorizontalDirection(ScriptT script) {
        var RESULT = gtk_h.hb_script_get_horizontal_direction(script.getValue());
        return new DirectionT(RESULT);
    }
    
    /**
     * Converts an {@link script_t} to a corresponding ISO 15924 script tag.
     */
    public static TagT scriptToIso15924Tag(ScriptT script) {
        var RESULT = gtk_h.hb_script_to_iso15924_tag(script.getValue());
        return new TagT(RESULT);
    }
    
    /**
     * Checks the equality of two {@link segment_properties_t}'s.
     */
    public static BoolT segmentPropertiesEqual(SegmentPropertiesT a, SegmentPropertiesT b) {
        var RESULT = gtk_h.hb_segment_properties_equal(a.handle(), b.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Creates a hash representing @p.
     */
    public static int segmentPropertiesHash(SegmentPropertiesT p) {
        var RESULT = gtk_h.hb_segment_properties_hash(p.handle());
        return RESULT;
    }
    
    /**
     * Fills in missing fields of @p from {@code src} in a considered manner.
     * <p>
     * First, if @p does not have direction set, direction is copied from {@code src}.
     * <p>
     * Next, if @p and {@code src} have the same direction (which can be unset), if @p
     * does not have script set, script is copied from {@code src}.
     * <p>
     * Finally, if @p and {@code src} have the same direction and script (which either
     * can be unset), if @p does not have language set, language is copied from
     * {@code src}.
     */
    public static void segmentPropertiesOverlay(SegmentPropertiesT p, SegmentPropertiesT src) {
        gtk_h.hb_segment_properties_overlay(p.handle(), src.handle());
    }
    
    /**
     * Adds {@code codepoint} to {@code set}.
     */
    public static void setAdd(SetT set, CodepointT codepoint) {
        gtk_h.hb_set_add(set.handle(), codepoint.getValue());
    }
    
    /**
     * Adds all of the elements from {@code first} to {@code last}
     * (inclusive) to {@code set}.
     */
    public static void setAddRange(SetT set, CodepointT first, CodepointT last) {
        gtk_h.hb_set_add_range(set.handle(), first.getValue(), last.getValue());
    }
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static BoolT setAllocationSuccessful(SetT set) {
        var RESULT = gtk_h.hb_set_allocation_successful(set.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Clears out the contents of a set.
     */
    public static void setClear(SetT set) {
        gtk_h.hb_set_clear(set.handle());
    }
    
    /**
     * Allocate a copy of {@code set}.
     */
    public static SetT setCopy(SetT set) {
        var RESULT = gtk_h.hb_set_copy(set.handle());
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a new, initially empty set.
     */
    public static SetT setCreate() {
        var RESULT = gtk_h.hb_set_create();
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Removes {@code codepoint} from {@code set}.
     */
    public static void setDel(SetT set, CodepointT codepoint) {
        gtk_h.hb_set_del(set.handle(), codepoint.getValue());
    }
    
    /**
     * Removes all of the elements from {@code first} to {@code last}
     * (inclusive) from {@code set}.
     * <p>
     * If {@code last} is {@code HB_SET_VALUE_INVALID}, then all values
     * greater than or equal to {@code first} are removed.
     */
    public static void setDelRange(SetT set, CodepointT first, CodepointT last) {
        gtk_h.hb_set_del_range(set.handle(), first.getValue(), last.getValue());
    }
    
    /**
     * Decreases the reference count on a set. When
     * the reference count reaches zero, the set is
     * destroyed, freeing all memory.
     */
    public static void setDestroy(SetT set) {
        gtk_h.hb_set_destroy(set.handle());
    }
    
    /**
     * Fetches the singleton empty {@link set_t}.
     */
    public static SetT setGetEmpty() {
        var RESULT = gtk_h.hb_set_get_empty();
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Finds the largest element in the set.
     */
    public static CodepointT setGetMax(SetT set) {
        var RESULT = gtk_h.hb_set_get_max(set.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * Finds the smallest element in the set.
     */
    public static CodepointT setGetMin(SetT set) {
        var RESULT = gtk_h.hb_set_get_min(set.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * Returns the number of elements in the set.
     */
    public static int setGetPopulation(SetT set) {
        var RESULT = gtk_h.hb_set_get_population(set.handle());
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified set.
     */
    public static java.lang.foreign.MemoryAddress setGetUserData(SetT set, UserDataKeyT key) {
        var RESULT = gtk_h.hb_set_get_user_data(set.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether {@code codepoint} belongs to {@code set}.
     */
    public static BoolT setHas(SetT set, CodepointT codepoint) {
        var RESULT = gtk_h.hb_set_has(set.handle(), codepoint.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes {@code set} the intersection of {@code set} and {@code other}.
     */
    public static void setIntersect(SetT set, SetT other) {
        gtk_h.hb_set_intersect(set.handle(), other.handle());
    }
    
    /**
     * Inverts the contents of {@code set}.
     */
    public static void setInvert(SetT set) {
        gtk_h.hb_set_invert(set.handle());
    }
    
    /**
     * Tests whether a set is empty (contains no elements).
     */
    public static BoolT setIsEmpty(SetT set) {
        var RESULT = gtk_h.hb_set_is_empty(set.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code set} and {@code other} are equal (contain the same
     * elements).
     */
    public static BoolT setIsEqual(SetT set, SetT other) {
        var RESULT = gtk_h.hb_set_is_equal(set.handle(), other.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code set} is a subset of {@code larger_set}.
     */
    public static BoolT setIsSubset(SetT set, SetT largerSet) {
        var RESULT = gtk_h.hb_set_is_subset(set.handle(), largerSet.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the next element in {@code set} that is greater than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setNext(SetT set, CodepointT codepoint) {
        PointerInteger codepointPOINTER = new PointerInteger(codepoint.getValue());
        var RESULT = gtk_h.hb_set_next(set.handle(), new PointerInteger(codepoint.getValue()).handle());
        codepoint.setValue(codepointPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the next consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code last} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setNextRange(SetT set, CodepointT first, CodepointT last) {
        PointerInteger firstPOINTER = new PointerInteger(first.getValue());
        PointerInteger lastPOINTER = new PointerInteger(last.getValue());
        var RESULT = gtk_h.hb_set_next_range(set.handle(), new PointerInteger(first.getValue()).handle(), new PointerInteger(last.getValue()).handle());
        first.setValue(firstPOINTER.get());
        last.setValue(lastPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the previous element in {@code set} that is lower than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setPrevious(SetT set, CodepointT codepoint) {
        PointerInteger codepointPOINTER = new PointerInteger(codepoint.getValue());
        var RESULT = gtk_h.hb_set_previous(set.handle(), new PointerInteger(codepoint.getValue()).handle());
        codepoint.setValue(codepointPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the previous consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code first} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setPreviousRange(SetT set, CodepointT first, CodepointT last) {
        PointerInteger firstPOINTER = new PointerInteger(first.getValue());
        PointerInteger lastPOINTER = new PointerInteger(last.getValue());
        var RESULT = gtk_h.hb_set_previous_range(set.handle(), new PointerInteger(first.getValue()).handle(), new PointerInteger(last.getValue()).handle());
        first.setValue(firstPOINTER.get());
        last.setValue(lastPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on a set.
     */
    public static SetT setReference(SetT set) {
        var RESULT = gtk_h.hb_set_reference(set.handle());
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Makes the contents of {@code set} equal to the contents of {@code other}.
     */
    public static void setSet(SetT set, SetT other) {
        gtk_h.hb_set_set(set.handle(), other.handle());
    }
    
    /**
     * Subtracts the contents of {@code other} from {@code set}.
     */
    public static void setSubtract(SetT set, SetT other) {
        gtk_h.hb_set_subtract(set.handle(), other.handle());
    }
    
    /**
     * Makes {@code set} the symmetric difference of {@code set}
     * and {@code other}.
     */
    public static void setSymmetricDifference(SetT set, SetT other) {
        gtk_h.hb_set_symmetric_difference(set.handle(), other.handle());
    }
    
    /**
     * Makes {@code set} the union of {@code set} and {@code other}.
     */
    public static void setUnion(SetT set, SetT other) {
        gtk_h.hb_set_union(set.handle(), other.handle());
    }
    
    /**
     * Shapes {@code buffer} using {@code font} turning its Unicode characters content to
     * positioned glyphs. If {@code features} is not {@code null}, it will be used to control the
     * features applied during shaping. If two {@code features} have the same tag but
     * overlapping ranges the value of the feature with the higher index takes
     * precedence.
     */
    public static void shape(FontT font, BufferT buffer, FeatureT[] features, int numFeatures) {
        gtk_h.hb_shape(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures);
    }
    
    /**
     * See hb_shape() for details. If {@code shaper_list} is not {@code null}, the specified
     * shapers will be used in the given order, otherwise the default shapers list
     * will be used.
     */
    public static BoolT shapeFull(FontT font, BufferT buffer, FeatureT[] features, int numFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_full(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Retrieves the list of shapers supported by HarfBuzz.
     */
    public static PointerIterator<java.lang.String> shapeListShapers() {
        var RESULT = gtk_h.hb_shape_list_shapers();
        return new PointerString(RESULT).iterator();
    }
    
    /**
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}.
     */
    public static ShapePlanT shapePlanCreate(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * The variable-font version of {@code hb_shape_plan_create}.
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}, plus the variation-space coordinates {@code coords}.
     */
    public static ShapePlanT shapePlanCreate2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create2(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(coords).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}.
     */
    public static ShapePlanT shapePlanCreateCached(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create_cached(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * The variable-font version of {@code hb_shape_plan_create_cached}.
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}, plus the
     * variation-space coordinates {@code coords}.
     */
    public static ShapePlanT shapePlanCreateCached2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create_cached2(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(coords).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on the given shaping plan. When the
     * reference count reaches zero, the shaping plan is destroyed,
     * freeing all memory.
     */
    public static void shapePlanDestroy(ShapePlanT shapePlan) {
        gtk_h.hb_shape_plan_destroy(shapePlan.handle());
    }
    
    /**
     * Executes the given shaping plan on the specified buffer, using
     * the given {@code font} and {@code features}.
     */
    public static BoolT shapePlanExecute(ShapePlanT shapePlan, FontT font, BufferT buffer, FeatureT[] features, int numFeatures) {
        var RESULT = gtk_h.hb_shape_plan_execute(shapePlan.handle(), font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures);
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the singleton empty shaping plan.
     */
    public static ShapePlanT shapePlanGetEmpty() {
        var RESULT = gtk_h.hb_shape_plan_get_empty();
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the shaper from a given shaping plan.
     */
    public static java.lang.String shapePlanGetShaper(ShapePlanT shapePlan) {
        var RESULT = gtk_h.hb_shape_plan_get_shaper(shapePlan.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified shaping plan.
     */
    public static java.lang.foreign.MemoryAddress shapePlanGetUserData(ShapePlanT shapePlan, UserDataKeyT key) {
        var RESULT = gtk_h.hb_shape_plan_get_user_data(shapePlan.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Increases the reference count on the given shaping plan.
     */
    public static ShapePlanT shapePlanReference(ShapePlanT shapePlan) {
        var RESULT = gtk_h.hb_shape_plan_reference(shapePlan.handle());
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Searches variation axes of a {@link font_t} object for a specific axis first,
     * if not set, then tries to get default style values from different
     * tables of the font.
     */
    public static float styleGetValue(FontT font, StyleTagT styleTag) {
        var RESULT = gtk_h.hb_style_get_value(font.handle(), styleTag.getValue());
        return RESULT;
    }
    
    /**
     * Converts a string into an {@link tag_t}. Valid tags
     * are four characters. Shorter input strings will be
     * padded with spaces. Longer input strings will be
     * truncated.
     */
    public static TagT tagFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_tag_from_string(Interop.allocateNativeArray(str).handle(), len);
        return new TagT(RESULT);
    }
    
    /**
     * Converts an {@link tag_t} to a string and returns it in {@code buf}.
     * Strings will be four characters long.
     */
    public static void tagToString(TagT tag, byte[] buf) {
        gtk_h.hb_tag_to_string(tag.getValue(), Interop.allocateNativeArray(buf).handle());
    }
    
    /**
     * Retrieves the Canonical Combining Class (ccc) property
     * of code point {@code unicode}.
     */
    public static UnicodeCombiningClassT unicodeCombiningClass(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_combining_class(ufuncs.handle(), unicode.getValue());
        return new UnicodeCombiningClassT(RESULT);
    }
    
    /**
     * Fetches the composition of a sequence of two Unicode
     * code points.
     * <p>
     * Calls the composition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     */
    public static BoolT unicodeCompose(UnicodeFuncsT ufuncs, CodepointT a, CodepointT b, CodepointT ab) {
        PointerInteger abPOINTER = new PointerInteger(ab.getValue());
        var RESULT = gtk_h.hb_unicode_compose(ufuncs.handle(), a.getValue(), b.getValue(), new PointerInteger(ab.getValue()).handle());
        ab.setValue(abPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the decomposition of a Unicode code point.
     * <p>
     * Calls the decomposition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     */
    public static BoolT unicodeDecompose(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b) {
        PointerInteger aPOINTER = new PointerInteger(a.getValue());
        PointerInteger bPOINTER = new PointerInteger(b.getValue());
        var RESULT = gtk_h.hb_unicode_decompose(ufuncs.handle(), ab.getValue(), new PointerInteger(a.getValue()).handle(), new PointerInteger(b.getValue()).handle());
        a.setValue(aPOINTER.get());
        b.setValue(bPOINTER.get());
        return new BoolT(RESULT);
    }
    
    /**
     * Creates a new {@link unicode_funcs_t} structure of Unicode functions.
     */
    public static UnicodeFuncsT unicodeFuncsCreate(UnicodeFuncsT parent) {
        var RESULT = gtk_h.hb_unicode_funcs_create(parent.handle());
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on a Unicode-functions structure. When
     * the reference count reaches zero, the Unicode-functions structure is
     * destroyed, freeing all memory.
     */
    public static void unicodeFuncsDestroy(UnicodeFuncsT ufuncs) {
        gtk_h.hb_unicode_funcs_destroy(ufuncs.handle());
    }
    
    /**
     * Fetches a pointer to the default Unicode-functions structure that is used
     * when no functions are explicitly set on {@link buffer_t}.
     */
    public static UnicodeFuncsT unicodeFuncsGetDefault() {
        var RESULT = gtk_h.hb_unicode_funcs_get_default();
        return new UnicodeFuncsT(Refcounted.get(RESULT, false));
    }
    
    /**
     * Fetches the singleton empty Unicode-functions structure.
     */
    public static UnicodeFuncsT unicodeFuncsGetEmpty() {
        var RESULT = gtk_h.hb_unicode_funcs_get_empty();
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the parent of the Unicode-functions structure
     * {@code ufuncs}.
     */
    public static UnicodeFuncsT unicodeFuncsGetParent(UnicodeFuncsT ufuncs) {
        var RESULT = gtk_h.hb_unicode_funcs_get_parent(ufuncs.handle());
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Fetches the user-data associated with the specified key,
     * attached to the specified Unicode-functions structure.
     */
    public static java.lang.foreign.MemoryAddress unicodeFuncsGetUserData(UnicodeFuncsT ufuncs, UserDataKeyT key) {
        var RESULT = gtk_h.hb_unicode_funcs_get_user_data(ufuncs.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether the specified Unicode-functions structure
     * is immutable.
     */
    public static BoolT unicodeFuncsIsImmutable(UnicodeFuncsT ufuncs) {
        var RESULT = gtk_h.hb_unicode_funcs_is_immutable(ufuncs.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes the specified Unicode-functions structure
     * immutable.
     */
    public static void unicodeFuncsMakeImmutable(UnicodeFuncsT ufuncs) {
        gtk_h.hb_unicode_funcs_make_immutable(ufuncs.handle());
    }
    
    /**
     * Increases the reference count on a Unicode-functions structure.
     */
    public static UnicodeFuncsT unicodeFuncsReference(UnicodeFuncsT ufuncs) {
        var RESULT = gtk_h.hb_unicode_funcs_reference(ufuncs.handle());
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    /**
     * Retrieves the General Category (gc) property
     * of code point {@code unicode}.
     */
    public static UnicodeGeneralCategoryT unicodeGeneralCategory(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_general_category(ufuncs.handle(), unicode.getValue());
        return new UnicodeGeneralCategoryT(RESULT);
    }
    
    /**
     * Retrieves the Bi-directional Mirroring Glyph code
     * point defined for code point {@code unicode}.
     */
    public static CodepointT unicodeMirroring(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_mirroring(ufuncs.handle(), unicode.getValue());
        return new CodepointT(RESULT);
    }
    
    /**
     * Retrieves the {@link script_t} script to which code
     * point {@code unicode} belongs.
     */
    public static ScriptT unicodeScript(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_script(ufuncs.handle(), unicode.getValue());
        return new ScriptT(RESULT);
    }
    
    /**
     * Parses a string into a {@link variation_t}.
     * <p>
     * The format for specifying variation settings follows. All valid CSS
     * font-variation-settings values other than 'normal' and 'inherited' are also
     * accepted, though, not documented below.
     * <p>
     * The format is a tag, optionally followed by an equals sign, followed by a
     * number. For example {@code wght=500}, or {@code slnt=-7.5}.
     */
    public static BoolT variationFromString(byte[] str, int len, VariationT variation) {
        var RESULT = gtk_h.hb_variation_from_string(Interop.allocateNativeArray(str).handle(), len, variation.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Converts an {@link variation_t} into a {@code null}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static void variationToString(VariationT variation, java.lang.String[] buf, int size) {
        gtk_h.hb_variation_to_string(variation.handle(), Interop.allocateNativeArray(buf).handle(), size);
    }
    
    /**
     * Returns library version as three integer components.
     */
    public static void version(PointerInteger major, PointerInteger minor, PointerInteger micro) {
        gtk_h.hb_version(major.handle(), minor.handle(), micro.handle());
    }
    
    /**
     * Tests the library version against a minimum value,
     * as three integer components.
     */
    public static BoolT versionAtleast(int major, int minor, int micro) {
        var RESULT = gtk_h.hb_version_atleast(major, minor, micro);
        return new BoolT(RESULT);
    }
    
    /**
     * Returns library version as a string with three components.
     */
    public static java.lang.String versionString() {
        var RESULT = gtk_h.hb_version_string();
        return RESULT.getUtf8String(0);
    }
    
}
