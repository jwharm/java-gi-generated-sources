package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public final class HarfBuzz {
    
    /**
     * Fetches the name identifier of the specified feature type in the face's `name` table.
     */
    public static OtNameIdT aatLayoutFeatureTypeGetNameId(FaceT face, AatLayoutFeatureTypeT featureType) {
        var RESULT = gtk_h.hb_aat_layout_feature_type_get_name_id(face.handle(), featureType.getValue());
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any positioning information
     * in the `kerx` table.
     * 
     * <note>Note: does not examine the `GPOS` table.</note>
     */
    public static BoolT aatLayoutHasPositioning(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_positioning(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any substitutions in the
     * `morx` or `mort` tables.
     * 
     * <note>Note: does not examine the `GSUB` table.</note>
     */
    public static BoolT aatLayoutHasSubstitution(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_substitution(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any tracking information
     * in the `trak` table.
     */
    public static BoolT aatLayoutHasTracking(FaceT face) {
        var RESULT = gtk_h.hb_aat_layout_has_tracking(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes a writable copy of @blob.
     */
    public static BlobT blobCopyWritableOrFail(BlobT blob) {
        var RESULT = gtk_h.hb_blob_copy_writable_or_fail(blob.handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFile(java.lang.String fileName) {
        var RESULT = gtk_h.hb_blob_create_from_file(Interop.allocateNativeString(fileName).handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFileOrFail(java.lang.String fileName) {
        var RESULT = gtk_h.hb_blob_create_from_file_or_fail(Interop.allocateNativeString(fileName).handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Returns a blob that represents a range of bytes in @parent.  The new
     * blob is always created with #HB_MEMORY_MODE_READONLY, meaning that it
     * will never modify data in the parent blob.  The parent data is not
     * expected to be modified, and will result in undefined behavior if it
     * is.
     * 
     * Makes @parent immutable.
     */
    public static BlobT blobCreateSubBlob(BlobT parent, int offset, int length) {
        var RESULT = gtk_h.hb_blob_create_sub_blob(parent.handle(), offset, length);
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on @blob, and if it reaches zero, destroys
     * @blob, freeing all memory, possibly calling the destroy-callback the blob
     * was created for if it has not been called already.
     * 
     * See TODO:link object types for more information.
     */
    public static void blobDestroy(BlobT blob) {
        gtk_h.hb_blob_destroy(blob.handle());
    }
    
    /**
     * Returns the singleton empty blob.
     * 
     * See TODO:link object types for more information.
     */
    public static BlobT blobGetEmpty() {
        var RESULT = gtk_h.hb_blob_get_empty();
        return new BlobT(References.get(RESULT, true));
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
    public static jdk.incubator.foreign.MemoryAddress blobGetUserData(BlobT blob, UserDataKeyT key) {
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
     * Increases the reference count on @blob.
     * 
     * See TODO:link object types for more information.
     */
    public static BlobT blobReference(BlobT blob) {
        var RESULT = gtk_h.hb_blob_reference(blob.handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Appends a character with the Unicode value of @codepoint to @buffer, and
     * gives it the initial cluster value of @cluster. Clusters can be any thing
     * the client wants, they are usually used to refer to the index of the
     * character in the input text stream and are output in
     * #hb_glyph_info_t.cluster field.
     * 
     * This function does not check the validity of @codepoint, it is up to the
     * caller to ensure it is a valid Unicode code point.
     */
    public static void bufferAdd(BufferT buffer, CodepointT codepoint, int cluster) {
        gtk_h.hb_buffer_add(buffer.handle(), codepoint.getValue(), cluster);
    }
    
    /**
     * Appends characters from @text array to @buffer. The @item_offset is the
     * position of the first character from @text that will be appended, and
     * @item_length is the number of character. When shaping part of a larger text
     * (e.g. a run of text from a paragraph), instead of passing just the substring
     * corresponding to the run, it is preferable to pass the whole
     * paragraph and specify the run start and length as @item_offset and
     * @item_length, respectively, to give HarfBuzz the full context to be able,
     * for example, to do cross-run Arabic shaping or properly handle combining
     * marks at stat of run.
     * 
     * This function does not check the validity of @text, it is up to the caller
     * to ensure it contains a valid Unicode code points.
     */
    public static void bufferAddCodepoints(BufferT buffer, CodepointT[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_codepoints(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
     * Unicode code points that can fit in 8-bit strings.
     * 
     * <note>Has nothing to do with non-Unicode Latin-1 encoding.</note>
     */
    public static void bufferAddLatin1(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_latin1(buffer.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, text)).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * 
     * Replaces invalid UTF-16 characters with the @buffer replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf16(BufferT buffer, short[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf16(buffer.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_SHORT, text)).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * 
     * Replaces invalid UTF-32 characters with the @buffer replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf32(BufferT buffer, int[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf32(buffer.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, text)).handle(), textLength, itemOffset, itemLength);
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * 
     * Replaces invalid UTF-8 characters with the @buffer replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf8(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        gtk_h.hb_buffer_add_utf8(buffer.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, text)).handle(), textLength, itemOffset, itemLength);
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
     * Creates a new #hb_buffer_t with all properties to defaults.
     */
    public static BufferT bufferCreate() {
        var RESULT = gtk_h.hb_buffer_create();
        return new BufferT(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #hb_buffer_t, similar to hb_buffer_create(). The only
     * difference is that the buffer is configured similarly to @src.
     */
    public static BufferT bufferCreateSimilar(BufferT src) {
        var RESULT = gtk_h.hb_buffer_create_similar(src.handle());
        return new BufferT(References.get(RESULT, true));
    }
    
    /**
     * Deserializes glyphs @buffer from textual representation in the format
     * produced by hb_buffer_serialize_glyphs().
     */
    public static BoolT bufferDeserializeGlyphs(BufferT buffer, java.lang.String[] buf, int bufLen, java.lang.String[] endPtr, FontT font, BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_deserialize_glyphs(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, Interop.allocateNativeArray(endPtr).handle(), font.handle(), format.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Deserializes Unicode @buffer from textual representation in the format
     * produced by hb_buffer_serialize_unicode().
     */
    public static BoolT bufferDeserializeUnicode(BufferT buffer, java.lang.String[] buf, int bufLen, java.lang.String[] endPtr, BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_deserialize_unicode(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, Interop.allocateNativeArray(endPtr).handle(), format.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Deallocate the @buffer.
     * Decreases the reference count on @buffer by one. If the result is zero, then
     * @buffer and all associated resources are freed. See hb_buffer_reference().
     */
    public static void bufferDestroy(BufferT buffer) {
        gtk_h.hb_buffer_destroy(buffer.handle());
    }
    
    /**
     * If dottedcircle_glyph is (hb_codepoint_t) -1 then #HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT
     * and #HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT are never returned.  This should be used by most
     * callers if just comparing two buffers is needed.
     */
    public static int bufferDiff(BufferT buffer, BufferT reference, CodepointT dottedcircleGlyph, int positionFuzz) {
        var RESULT = gtk_h.hb_buffer_diff(buffer.handle(), reference.handle(), dottedcircleGlyph.getValue(), positionFuzz);
        return RESULT;
    }
    
    /**
     * Fetches the cluster level of a buffer. The #hb_buffer_cluster_level_t
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static BufferClusterLevelT bufferGetClusterLevel(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_cluster_level(buffer.handle());
        return BufferClusterLevelT.fromValue(RESULT);
    }
    
    /**
     * Fetches the type of @buffer contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static BufferContentTypeT bufferGetContentType(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_content_type(buffer.handle());
        return BufferContentTypeT.fromValue(RESULT);
    }
    
    /**
     * See hb_buffer_set_direction()
     */
    public static DirectionT bufferGetDirection(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_direction(buffer.handle());
        return DirectionT.fromValue(RESULT);
    }
    
    /**
     * Fetches an empty #hb_buffer_t.
     */
    public static BufferT bufferGetEmpty() {
        var RESULT = gtk_h.hb_buffer_get_empty();
        return new BufferT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the #hb_buffer_flags_t of @buffer.
     */
    public static int bufferGetFlags(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_flags(buffer.handle());
        return RESULT;
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
        return new LanguageT(References.get(RESULT, false));
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
     * Fetches the #hb_codepoint_t that replaces invalid entries for a given encoding
     * when adding text to @buffer.
     */
    public static CodepointT bufferGetReplacementCodepoint(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_replacement_codepoint(buffer.handle());
        return new CodepointT(RESULT);
    }
    
    /**
     * Fetches the script of @buffer.
     */
    public static ScriptT bufferGetScript(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_script(buffer.handle());
        return ScriptT.fromValue(RESULT);
    }
    
    /**
     * Sets @props to the #hb_segment_properties_t of @buffer.
     */
    public static void bufferGetSegmentProperties(BufferT buffer, SegmentPropertiesT props) {
        gtk_h.hb_buffer_get_segment_properties(buffer.handle(), props.handle());
    }
    
    /**
     * Fetches the Unicode-functions structure of a buffer.
     */
    public static UnicodeFuncsT bufferGetUnicodeFuncs(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_get_unicode_funcs(buffer.handle());
        return new UnicodeFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified buffer.
     */
    public static jdk.incubator.foreign.MemoryAddress bufferGetUserData(BufferT buffer, UserDataKeyT key) {
        var RESULT = gtk_h.hb_buffer_get_user_data(buffer.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Sets unset buffer segment properties based on buffer Unicode
     * contents.  If buffer is not empty, it must have content type
     * #HB_BUFFER_CONTENT_TYPE_UNICODE.
     * 
     * If buffer script is not set (ie. is #HB_SCRIPT_INVALID), it
     * will be set to the Unicode script of the first character in
     * the buffer that has a script other than #HB_SCRIPT_COMMON,
     * #HB_SCRIPT_INHERITED, and #HB_SCRIPT_UNKNOWN.
     * 
     * Next, if buffer direction is not set (ie. is #HB_DIRECTION_INVALID),
     * it will be set to the natural horizontal direction of the
     * buffer script as returned by hb_script_get_horizontal_direction().
     * If hb_script_get_horizontal_direction() returns #HB_DIRECTION_INVALID,
     * then #HB_DIRECTION_LTR is used.
     * 
     * Finally, if buffer language is not set (ie. is #HB_LANGUAGE_INVALID),
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
     * Returns whether @buffer has glyph position data.
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
     * 
     * <note>This has nothing to do with Unicode normalization.</note>
     */
    public static void bufferNormalizeGlyphs(BufferT buffer) {
        gtk_h.hb_buffer_normalize_glyphs(buffer.handle());
    }
    
    /**
     * Pre allocates memory for @buffer to fit at least @size number of items.
     */
    public static BoolT bufferPreAllocate(BufferT buffer, int size) {
        var RESULT = gtk_h.hb_buffer_pre_allocate(buffer.handle(), size);
        return new BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on @buffer by one. This prevents @buffer from
     * being destroyed until a matching call to hb_buffer_destroy() is made.
     */
    public static BufferT bufferReference(BufferT buffer) {
        var RESULT = gtk_h.hb_buffer_reference(buffer.handle());
        return new BufferT(References.get(RESULT, true));
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
     * Reverses buffer contents between @start and @end.
     */
    public static void bufferReverseRange(BufferT buffer, int start, int end) {
        gtk_h.hb_buffer_reverse_range(buffer.handle(), start, end);
    }
    
    /**
     * Parses a string into an #hb_buffer_serialize_format_t. Does not check if
     * @str is a valid buffer serialization format, use
     * hb_buffer_serialize_list_formats() to get the list of supported formats.
     */
    public static BufferSerializeFormatT bufferSerializeFormatFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_buffer_serialize_format_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len);
        return BufferSerializeFormatT.fromValue(RESULT);
    }
    
    /**
     * Converts @format to the string corresponding it, or %NULL if it is not a valid
     * #hb_buffer_serialize_format_t.
     */
    public static java.lang.String bufferSerializeFormatToString(BufferSerializeFormatT format) {
        var RESULT = gtk_h.hb_buffer_serialize_format_to_string(format.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the cluster level of a buffer. The #hb_buffer_cluster_level_t
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static void bufferSetClusterLevel(BufferT buffer, BufferClusterLevelT clusterLevel) {
        gtk_h.hb_buffer_set_cluster_level(buffer.handle(), clusterLevel.getValue());
    }
    
    /**
     * Sets the type of @buffer contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static void bufferSetContentType(BufferT buffer, BufferContentTypeT contentType) {
        gtk_h.hb_buffer_set_content_type(buffer.handle(), contentType.getValue());
    }
    
    /**
     * Set the text flow direction of the buffer. No shaping can happen without
     * setting @buffer direction, and it controls the visual direction for the
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
     * Sets @buffer flags to @flags. See #hb_buffer_flags_t.
     */
    public static void bufferSetFlags(BufferT buffer, int flags) {
        gtk_h.hb_buffer_set_flags(buffer.handle(), flags);
    }
    
    /**
     * Sets the #hb_codepoint_t that replaces invisible characters in
     * the shaping result.  If set to zero (default), the glyph for the
     * U+0020 SPACE character is used.  Otherwise, this value is used
     * verbatim.
     */
    public static void bufferSetInvisibleGlyph(BufferT buffer, CodepointT invisible) {
        gtk_h.hb_buffer_set_invisible_glyph(buffer.handle(), invisible.getValue());
    }
    
    /**
     * Sets the language of @buffer to @language.
     * 
     * Languages are crucial for selecting which OpenType feature to apply to the
     * buffer which can result in applying language-specific behaviour. Languages
     * are orthogonal to the scripts, and though they are related, they are
     * different concepts and should not be confused with each other.
     * 
     * Use hb_language_from_string() to convert from BCP 47 language tags to
     * #hb_language_t.
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
     * Sets the #hb_codepoint_t that replaces characters not found in
     * the font during shaping.
     * 
     * The not-found glyph defaults to zero, sometimes knows as the
     * ".notdef" glyph.  This API allows for differentiating the two.
     */
    public static void bufferSetNotFoundGlyph(BufferT buffer, CodepointT notFound) {
        gtk_h.hb_buffer_set_not_found_glyph(buffer.handle(), notFound.getValue());
    }
    
    /**
     * Sets the #hb_codepoint_t that replaces invalid entries for a given encoding
     * when adding text to @buffer.
     * 
     * Default is #HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT.
     */
    public static void bufferSetReplacementCodepoint(BufferT buffer, CodepointT replacement) {
        gtk_h.hb_buffer_set_replacement_codepoint(buffer.handle(), replacement.getValue());
    }
    
    /**
     * Sets the script of @buffer to @script.
     * 
     * Script is crucial for choosing the proper shaping behaviour for scripts that
     * require it (e.g. Arabic) and the which OpenType features defined in the font
     * to be applied.
     * 
     * You can pass one of the predefined #hb_script_t values, or use
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
     * @unicode_funcs.
     */
    public static void bufferSetUnicodeFuncs(BufferT buffer, UnicodeFuncsT unicodeFuncs) {
        gtk_h.hb_buffer_set_unicode_funcs(buffer.handle(), unicodeFuncs.handle());
    }
    
    /**
     * Fetches the alpha channel of the given @color.
     */
    public static byte colorGetAlpha(ColorT color) {
        var RESULT = gtk_h.hb_color_get_alpha(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the blue channel of the given @color.
     */
    public static byte colorGetBlue(ColorT color) {
        var RESULT = gtk_h.hb_color_get_blue(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the green channel of the given @color.
     */
    public static byte colorGetGreen(ColorT color) {
        var RESULT = gtk_h.hb_color_get_green(color.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the red channel of the given @color.
     */
    public static byte colorGetRed(ColorT color) {
        var RESULT = gtk_h.hb_color_get_red(color.getValue());
        return RESULT;
    }
    
    /**
     * Converts a string to an #hb_direction_t.
     * 
     * Matching is loose and applies only to the first letter. For
     * examples, "LTR" and "left-to-right" will both return #HB_DIRECTION_LTR.
     * 
     * Unmatched strings will return #HB_DIRECTION_INVALID.
     */
    public static DirectionT directionFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_direction_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len);
        return DirectionT.fromValue(RESULT);
    }
    
    /**
     * Converts an #hb_direction_t to a string.
     */
    public static java.lang.String directionToString(DirectionT direction) {
        var RESULT = gtk_h.hb_direction_to_string(direction.getValue());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Perform a "close-path" draw operation.
     */
    public static void drawClosePath(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st) {
        gtk_h.hb_draw_close_path(dfuncs.handle(), drawData, st.handle());
    }
    
    /**
     * Perform a "cubic-to" draw operation.
     */
    public static void drawCubicTo(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY) {
        gtk_h.hb_draw_cubic_to(dfuncs.handle(), drawData, st.handle(), control1X, control1Y, control2X, control2Y, toX, toY);
    }
    
    /**
     * Creates a new draw callbacks object.
     */
    public static DrawFuncsT drawFuncsCreate() {
        var RESULT = gtk_h.hb_draw_funcs_create();
        return new DrawFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Deallocate the @dfuncs.
     * Decreases the reference count on @dfuncs by one. If the result is zero, then
     * @dfuncs and all associated resources are freed. See hb_draw_funcs_reference().
     */
    public static void drawFuncsDestroy(DrawFuncsT dfuncs) {
        gtk_h.hb_draw_funcs_destroy(dfuncs.handle());
    }
    
    /**
     * Checks whether @dfuncs is immutable.
     */
    public static BoolT drawFuncsIsImmutable(DrawFuncsT dfuncs) {
        var RESULT = gtk_h.hb_draw_funcs_is_immutable(dfuncs.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes @dfuncs object immutable.
     */
    public static void drawFuncsMakeImmutable(DrawFuncsT dfuncs) {
        gtk_h.hb_draw_funcs_make_immutable(dfuncs.handle());
    }
    
    /**
     * Increases the reference count on @dfuncs by one. This prevents @buffer from
     * being destroyed until a matching call to hb_draw_funcs_destroy() is made.
     */
    public static DrawFuncsT drawFuncsReference(DrawFuncsT dfuncs) {
        var RESULT = gtk_h.hb_draw_funcs_reference(dfuncs.handle());
        return new DrawFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Perform a "line-to" draw operation.
     */
    public static void drawLineTo(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        gtk_h.hb_draw_line_to(dfuncs.handle(), drawData, st.handle(), toX, toY);
    }
    
    /**
     * Perform a "move-to" draw operation.
     */
    public static void drawMoveTo(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        gtk_h.hb_draw_move_to(dfuncs.handle(), drawData, st.handle(), toX, toY);
    }
    
    /**
     * Perform a "quadratic-to" draw operation.
     */
    public static void drawQuadraticTo(DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY) {
        gtk_h.hb_draw_quadratic_to(dfuncs.handle(), drawData, st.handle(), controlX, controlY, toX, toY);
    }
    
    /**
     * Add table for @tag with data provided by @blob to the face.  @face must
     * be created using hb_face_builder_create().
     */
    public static BoolT faceBuilderAddTable(FaceT face, TagT tag, BlobT blob) {
        var RESULT = gtk_h.hb_face_builder_add_table(face.handle(), tag.getValue(), blob.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Creates a #hb_face_t that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     */
    public static FaceT faceBuilderCreate() {
        var RESULT = gtk_h.hb_face_builder_create();
        return new FaceT(References.get(RESULT, true));
    }
    
    /**
     * Collects all of the Unicode characters covered by @face and adds
     * them to the #hb_set_t set @out.
     */
    public static void faceCollectUnicodes(FaceT face, SetT out) {
        gtk_h.hb_face_collect_unicodes(face.handle(), out.handle());
    }
    
    /**
     * Collects all Unicode "Variation Selector" characters covered by @face and adds
     * them to the #hb_set_t set @out.
     */
    public static void faceCollectVariationSelectors(FaceT face, SetT out) {
        gtk_h.hb_face_collect_variation_selectors(face.handle(), out.handle());
    }
    
    /**
     * Collects all Unicode characters for @variation_selector covered by @face and adds
     * them to the #hb_set_t set @out.
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
     * 
     * The face index is used for blobs of file formats such as TTC and
     * and DFont that can contain more than one face.  Face indices within
     * such collections are zero-based.
     * 
     * <note>Note: If the blob font format is not a collection, @index
     * is ignored.  Otherwise, only the lower 16-bits of @index are used.
     * The unmodified @index can be accessed via hb_face_get_index().</note>
     * 
     * <note>Note: The high 16-bits of @index, if non-zero, are used by
     * hb_font_create() to load named-instances in variable fonts.  See
     * hb_font_create() for details.</note>
     */
    public static FaceT faceCreate(BlobT blob, int index) {
        var RESULT = gtk_h.hb_face_create(blob.handle(), index);
        return new FaceT(References.get(RESULT, true));
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
        return new FaceT(References.get(RESULT, true));
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
     * 
     * <note>Note: face indices within a collection are zero-based.</note>
     */
    public static int faceGetIndex(FaceT face) {
        var RESULT = gtk_h.hb_face_get_index(face.handle());
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
    public static jdk.incubator.foreign.MemoryAddress faceGetUserData(FaceT face, UserDataKeyT key) {
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
        return new FaceT(References.get(RESULT, true));
    }
    
    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     */
    public static BlobT faceReferenceBlob(FaceT face) {
        var RESULT = gtk_h.hb_face_reference_blob(face.handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Fetches a reference to the specified table within
     * the specified face.
     */
    public static BlobT faceReferenceTable(FaceT face, TagT tag) {
        var RESULT = gtk_h.hb_face_reference_table(face.handle(), tag.getValue());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Sets the glyph count for a face object to the specified value.
     */
    public static void faceSetGlyphCount(FaceT face, int glyphCount) {
        gtk_h.hb_face_set_glyph_count(face.handle(), glyphCount);
    }
    
    /**
     * Assigns the specified face-index to @face. Fails if the
     * face is immutable.
     * 
     * <note>Note: changing the index has no effect on the face itself
     * This only changes the value returned by hb_face_get_index().</note>
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
     * Parses a string into a #hb_feature_t.
     * 
     * The format for specifying feature strings follows. All valid CSS
     * font-feature-settings values other than 'normal' and the global values are
     * also accepted, though not documented below. CSS string escapes are not
     * supported.
     * 
     * The range indices refer to the positions between Unicode characters. The
     * position before the first character is always 0.
     * 
     * The format is Python-esque.  Here is how it all works:
     * 
     * <informaltable pgwide='1' align='left' frame='none'>
     * <tgroup cols='5'>
     * <thead>
     * <row><entry>Syntax</entry>    <entry>Value</entry> <entry>Start</entry> <entry>End</entry></row>
     * </thead>
     * <tbody>
     * <row><entry>Setting value:</entry></row>
     * <row><entry>kern</entry>      <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row>
     * <row><entry>+kern</entry>     <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row>
     * <row><entry>-kern</entry>     <entry>0</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature off</entry></row>
     * <row><entry>kern=0</entry>    <entry>0</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature off</entry></row>
     * <row><entry>kern=1</entry>    <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row>
     * <row><entry>aalt=2</entry>    <entry>2</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Choose 2nd alternate</entry></row>
     * <row><entry>Setting index:</entry></row>
     * <row><entry>kern[]</entry>    <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row>
     * <row><entry>kern[:]</entry>   <entry>1</entry>     <entry>0</entry>      <entry>∞</entry>   <entry>Turn feature on</entry></row>
     * <row><entry>kern[5:]</entry>  <entry>1</entry>     <entry>5</entry>      <entry>∞</entry>   <entry>Turn feature on, partial</entry></row>
     * <row><entry>kern[:5]</entry>  <entry>1</entry>     <entry>0</entry>      <entry>5</entry>   <entry>Turn feature on, partial</entry></row>
     * <row><entry>kern[3:5]</entry> <entry>1</entry>     <entry>3</entry>      <entry>5</entry>   <entry>Turn feature on, range</entry></row>
     * <row><entry>kern[3]</entry>   <entry>1</entry>     <entry>3</entry>      <entry>3+1</entry> <entry>Turn feature on, single char</entry></row>
     * <row><entry>Mixing it all:</entry></row>
     * <row><entry>aalt[3:5]=2</entry> <entry>2</entry>   <entry>3</entry>      <entry>5</entry>   <entry>Turn 2nd alternate on for range</entry></row>
     * </tbody>
     * </tgroup>
     * </informaltable>
     */
    public static BoolT featureFromString(byte[] str, int len, FeatureT feature) {
        var RESULT = gtk_h.hb_feature_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len, feature.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Converts a #hb_feature_t into a %NULL-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for @buf, 128 bytes is more than enough.
     */
    public static void featureToString(FeatureT feature, java.lang.String[] buf, int size) {
        gtk_h.hb_feature_to_string(feature.handle(), Interop.allocateNativeArray(buf).handle(), size);
    }
    
    /**
     * Adds the origin coordinates to an (X,Y) point coordinate, in
     * the specified glyph ID in the specified font.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontAddGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        gtk_h.hb_font_add_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), x.getValue(), y.getValue());
    }
    
    /**
     * Constructs a new font object from the specified face.
     * 
     * <note>Note: If @face's index value (as passed to hb_face_create()
     * has non-zero top 16-bits, those bits minus one are passed to
     * hb_font_set_var_named_instance(), effectively loading a named-instance
     * of a variable font, instead of the default-instance.  This allows
     * specifying which named-instance to load by default when creating the
     * face.</note>
     */
    public static FontT fontCreate(FaceT face) {
        var RESULT = gtk_h.hb_font_create(face.handle());
        return new FontT(References.get(RESULT, true));
    }
    
    /**
     * Constructs a sub-font font object from the specified @parent font,
     * replicating the parent's properties.
     */
    public static FontT fontCreateSubFont(FontT parent) {
        var RESULT = gtk_h.hb_font_create_sub_font(parent.handle());
        return new FontT(References.get(RESULT, true));
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
     * Creates a new #hb_font_funcs_t structure of font functions.
     */
    public static FontFuncsT fontFuncsCreate() {
        var RESULT = gtk_h.hb_font_funcs_create();
        return new FontFuncsT(References.get(RESULT, true));
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
        return new FontFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static jdk.incubator.foreign.MemoryAddress fontFuncsGetUserData(FontFuncsT ffuncs, UserDataKeyT key) {
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
        return new FontFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the empty font object.
     */
    public static FontT fontGetEmpty() {
        var RESULT = gtk_h.hb_font_get_empty();
        return new FontT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the extents for a font in a text segment of the
     * specified direction.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontGetExtentsForDirection(FontT font, DirectionT direction, FontExtentsT extents) {
        gtk_h.hb_font_get_extents_for_direction(font.handle(), direction.getValue(), extents.handle());
    }
    
    /**
     * Fetches the face associated with the specified font object.
     */
    public static FaceT fontGetFace(FontT font) {
        var RESULT = gtk_h.hb_font_get_face(font.handle());
        return new FaceT(References.get(RESULT, false));
    }
    
    /**
     * Fetches the glyph ID for a Unicode code point in the specified
     * font, with an optional variation selector.
     * 
     * If @variation_selector is 0, calls hb_font_get_nominal_glyph();
     * otherwise calls hb_font_get_variation_glyph().
     */
    public static BoolT fontGetGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_glyph(font.handle(), unicode.getValue(), variationSelector.getValue(), glyph.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the advance for a glyph ID from the specified font,
     * in a text segment of the specified direction.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontGetGlyphAdvanceForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        gtk_h.hb_font_get_glyph_advance_for_direction(font.handle(), glyph.getValue(), direction.getValue(), x.getValue(), y.getValue());
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, in a text segment of the specified direction.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontGetGlyphAdvancesForDirection(FontT font, DirectionT direction, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        gtk_h.hb_font_get_glyph_advances_for_direction(font.handle(), direction.getValue(), count, firstGlyph.getValue(), glyphStride, firstAdvance.getValue(), advanceStride);
    }
    
    /**
     * Fetches the (x,y) coordinates of a specified contour-point index
     * in the specified glyph, within the specified font.
     */
    public static BoolT fontGetGlyphContourPoint(FontT font, CodepointT glyph, int pointIndex, PositionT x, PositionT y) {
        var RESULT = gtk_h.hb_font_get_glyph_contour_point(font.handle(), glyph.getValue(), pointIndex, x.getValue(), y.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of a specified contour-point index
     * in the specified glyph ID in the specified font, with respect
     * to the origin in a text segment in the specified direction.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static BoolT fontGetGlyphContourPointForOrigin(FontT font, CodepointT glyph, int pointIndex, DirectionT direction, PositionT x, PositionT y) {
        var RESULT = gtk_h.hb_font_get_glyph_contour_point_for_origin(font.handle(), glyph.getValue(), pointIndex, direction.getValue(), x.getValue(), y.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the #hb_glyph_extents_t data for a glyph ID
     * in the specified font.
     */
    public static BoolT fontGetGlyphExtents(FontT font, CodepointT glyph, GlyphExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_glyph_extents(font.handle(), glyph.getValue(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the #hb_glyph_extents_t data for a glyph ID
     * in the specified font, with respect to the origin in
     * a text segment in the specified direction.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static BoolT fontGetGlyphExtentsForOrigin(FontT font, CodepointT glyph, DirectionT direction, GlyphExtentsT extents) {
        var RESULT = gtk_h.hb_font_get_glyph_extents_for_origin(font.handle(), glyph.getValue(), direction.getValue(), extents.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID that corresponds to a name string in the specified @font.
     * 
     * <note>Note: @len == -1 means the name string is null-terminated.</note>
     */
    public static BoolT fontGetGlyphFromName(FontT font, java.lang.String[] name, int len, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_glyph_from_name(font.handle(), Interop.allocateNativeArray(name).handle(), len, glyph.getValue());
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
        gtk_h.hb_font_get_glyph_h_advances(font.handle(), count, firstGlyph.getValue(), glyphStride, firstAdvance.getValue(), advanceStride);
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in
     * the specified font, for horizontal text segments.
     * 
     * <note>It handles legacy kerning only (as returned by the corresponding
     * #hb_font_funcs_t function).</note>
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
        var RESULT = gtk_h.hb_font_get_glyph_h_origin(font.handle(), glyph.getValue(), x.getValue(), y.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in the specified font.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontGetGlyphKerningForDirection(FontT font, CodepointT firstGlyph, CodepointT secondGlyph, DirectionT direction, PositionT x, PositionT y) {
        gtk_h.hb_font_get_glyph_kerning_for_direction(font.handle(), firstGlyph.getValue(), secondGlyph.getValue(), direction.getValue(), x.getValue(), y.getValue());
    }
    
    /**
     * Fetches the glyph-name string for a glyph ID in the specified @font.
     */
    public static BoolT fontGetGlyphName(FontT font, CodepointT glyph, java.lang.String[] name, int size) {
        var RESULT = gtk_h.hb_font_get_glyph_name(font.handle(), glyph.getValue(), Interop.allocateNativeArray(name).handle(), size);
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph in
     * the specified font.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontGetGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        gtk_h.hb_font_get_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), x.getValue(), y.getValue());
    }
    
    /**
     * Fetches the glyph shape that corresponds to a glyph in the specified @font.
     * The shape is returned by way of calls to the callsbacks of the @dfuncs
     * objects, with @draw_data passed to them.
     */
    public static void fontGetGlyphShape(FontT font, CodepointT glyph, DrawFuncsT dfuncs, jdk.incubator.foreign.MemoryAddress drawData) {
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
        gtk_h.hb_font_get_glyph_v_advances(font.handle(), count, firstGlyph.getValue(), glyphStride, firstAdvance.getValue(), advanceStride);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for vertical text segments.
     */
    public static BoolT fontGetGlyphVOrigin(FontT font, CodepointT glyph, PositionT x, PositionT y) {
        var RESULT = gtk_h.hb_font_get_glyph_v_origin(font.handle(), glyph.getValue(), x.getValue(), y.getValue());
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
     * 
     * This version of the function should not be used to fetch glyph IDs
     * for code points modified by variation selectors. For variation-selector
     * support, user hb_font_get_variation_glyph() or use hb_font_get_glyph().
     */
    public static BoolT fontGetNominalGlyph(FontT font, CodepointT unicode, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_nominal_glyph(font.handle(), unicode.getValue(), glyph.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
     * IDs must be returned in a #hb_codepoint_t output parameter.
     */
    public static int fontGetNominalGlyphs(FontT font, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride) {
        var RESULT = gtk_h.hb_font_get_nominal_glyphs(font.handle(), count, firstUnicode.getValue(), unicodeStride, firstGlyph.getValue(), glyphStride);
        return RESULT;
    }
    
    /**
     * Fetches the parent font of @font.
     */
    public static FontT fontGetParent(FontT font) {
        var RESULT = gtk_h.hb_font_get_parent(font.handle());
        return new FontT(References.get(RESULT, false));
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
    public static jdk.incubator.foreign.MemoryAddress fontGetUserData(FontT font, UserDataKeyT key) {
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
     * Fetches the glyph ID for a Unicode code point when followed by
     * by the specified variation-selector code point, in the specified
     * font.
     */
    public static BoolT fontGetVariationGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_get_variation_glyph(font.handle(), unicode.getValue(), variationSelector.getValue(), glyph.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID from @font that matches the specified string.
     * Strings of the format `gidDDD` or `uniUUUU` are parsed automatically.
     * 
     * <note>Note: @len == -1 means the string is null-terminated.</note>
     */
    public static BoolT fontGlyphFromString(FontT font, byte[] s, int len, CodepointT glyph) {
        var RESULT = gtk_h.hb_font_glyph_from_string(font.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, s)).handle(), len, glyph.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the name of the specified glyph ID in @font and returns
     * it in string @s.
     * 
     * If the glyph ID has no name in @font, a string of the form `gidDDD` is
     * generated, with `DDD` being the glyph ID.
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
     * Makes @font immutable.
     */
    public static void fontMakeImmutable(FontT font) {
        gtk_h.hb_font_make_immutable(font.handle());
    }
    
    /**
     * Increases the reference count on the given font object.
     */
    public static FontT fontReference(FontT font) {
        var RESULT = gtk_h.hb_font_reference(font.handle());
        return new FontT(References.get(RESULT, true));
    }
    
    /**
     * Sets @face as the font-face value of @font.
     */
    public static void fontSetFace(FontT font, FaceT face) {
        gtk_h.hb_font_set_face(font.handle(), face.handle());
    }
    
    /**
     * Sets the parent font of @font.
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
     * 
     * <note>Note: There are 72 points in an inch.</note>
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
     * 
     * HarfBuzz needs to know this value to adjust shaping results,
     * metrics, and style values to match the slanted rendering.
     * 
     * <note>Note: The glyph shape fetched via the
     * hb_font_get_glyph_shape() is slanted to reflect this value
     * as well.</note>
     * 
     * <note>Note: The slant value is a ratio.  For example, a
     * 20% slant would be represented as a 0.2 value.</note>
     */
    public static void fontSetSyntheticSlant(FontT font, float slant) {
        gtk_h.hb_font_set_synthetic_slant(font.handle(), slant);
    }
    
    /**
     * Applies a list of variation coordinates (in design-space units)
     * to a font.
     * 
     * Note that this overrides all existing variations set on @font.
     * Axes not included in @coords will be effectively set to their
     * default values.
     */
    public static void fontSetVarCoordsDesign(FontT font, float[] coords, int coordsLength) {
        gtk_h.hb_font_set_var_coords_design(font.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, coords)).handle(), coordsLength);
    }
    
    /**
     * Applies a list of variation coordinates (in normalized units)
     * to a font.
     * 
     * Note that this overrides all existing variations set on @font.
     * Axes not included in @coords will be effectively set to their
     * default values.
     * 
     * <note>Note: Coordinates should be normalized to 2.14.</note>
     */
    public static void fontSetVarCoordsNormalized(FontT font, int[] coords, int coordsLength) {
        gtk_h.hb_font_set_var_coords_normalized(font.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, coords)).handle(), coordsLength);
    }
    
    /**
     * Sets design coords of a font from a named instance index.
     */
    public static void fontSetVarNamedInstance(FontT font, int instanceIndex) {
        gtk_h.hb_font_set_var_named_instance(font.handle(), instanceIndex);
    }
    
    /**
     * Applies a list of font-variation settings to a font.
     * 
     * Note that this overrides all existing variations set on @font.
     * Axes not included in @variations will be effectively set to their
     * default values.
     */
    public static void fontSetVariations(FontT font, VariationT[] variations, int variationsLength) {
        gtk_h.hb_font_set_variations(font.handle(), Interop.allocateNativeArray(variations).handle(), variationsLength);
    }
    
    /**
     * Subtracts the origin coordinates from an (X,Y) point coordinate,
     * in the specified glyph ID in the specified font.
     * 
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of @direction.
     */
    public static void fontSubtractGlyphOriginForDirection(FontT font, CodepointT glyph, DirectionT direction, PositionT x, PositionT y) {
        gtk_h.hb_font_subtract_glyph_origin_for_direction(font.handle(), glyph.getValue(), direction.getValue(), x.getValue(), y.getValue());
    }
    
    /**
     * Refreshes the state of @font when the underlying FT_Face has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the FT_Face.
     */
    public static void ftFontChanged(FontT font) {
        gtk_h.hb_ft_font_changed(font.handle());
    }
    
    /**
     * Fetches the FT_Load_Glyph load flags of the specified #hb_font_t.
     * 
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
     */
    public static int ftFontGetLoadFlags(FontT font) {
        var RESULT = gtk_h.hb_ft_font_get_load_flags(font.handle());
        return RESULT;
    }
    
    /**
     * Configures the font-functions structure of the specified
     * #hb_font_t font object to use FreeType font functions.
     * 
     * In particular, you can use this function to configure an
     * existing #hb_face_t face object for use with FreeType font
     * functions even if that #hb_face_t face object was initially
     * created with hb_face_create(), and therefore was not
     * initially configured to use FreeType font functions.
     * 
     * An #hb_face_t face object created with hb_ft_face_create()
     * is preconfigured for FreeType font functions and does not
     * require this function to be used.
     * 
     * <note>Note: Internally, this function creates an FT_Face.
     * </note>
     */
    public static void ftFontSetFuncs(FontT font) {
        gtk_h.hb_ft_font_set_funcs(font.handle());
    }
    
    /**
     * Sets the FT_Load_Glyph load flags for the specified #hb_font_t.
     * 
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html#ft_load_xxx
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
     * Creates an #hb_blob_t blob from the specified
     * GBytes data structure.
     */
    public static BlobT glibBlobCreate(org.gtk.glib.Bytes gbytes) {
        var RESULT = gtk_h.hb_glib_blob_create(gbytes.handle());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     */
    public static UnicodeFuncsT glibGetUnicodeFuncs() {
        var RESULT = gtk_h.hb_glib_get_unicode_funcs();
        return new UnicodeFuncsT(References.get(RESULT, false));
    }
    
    /**
     * Fetches the GUnicodeScript identifier that corresponds to the
     * specified #hb_script_t script.
     */
    public static org.gtk.glib.UnicodeScript glibScriptFromScript(ScriptT script) {
        var RESULT = gtk_h.hb_glib_script_from_script(script.getValue());
        return org.gtk.glib.UnicodeScript.fromValue(RESULT);
    }
    
    /**
     * Fetches the #hb_script_t script that corresponds to the
     * specified GUnicodeScript identifier.
     */
    public static ScriptT glibScriptToScript(org.gtk.glib.UnicodeScript script) {
        var RESULT = gtk_h.hb_glib_script_to_script(script.getValue());
        return ScriptT.fromValue(RESULT);
    }
    
    /**
     * Returns glyph flags encoded within a #hb_glyph_info_t.
     */
    public static int glyphInfoGetGlyphFlags(GlyphInfoT info) {
        var RESULT = gtk_h.hb_glyph_info_get_glyph_flags(info.handle());
        return RESULT;
    }
    
    /**
     * Converts @str representing a BCP 47 language tag to the corresponding
     * #hb_language_t.
     */
    public static LanguageT languageFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_language_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len);
        return new LanguageT(References.get(RESULT, false));
    }
    
    /**
     * Fetch the default language from current locale.
     * 
     * <note>Note that the first time this function is called, it calls
     * "setlocale (LC_CTYPE, nullptr)" to fetch current locale.  The underlying
     * setlocale function is, in many implementations, NOT threadsafe.  To avoid
     * problems, call this function once before multiple threads can call it.
     * This function is only used from hb_buffer_guess_segment_properties() by
     * HarfBuzz itself.</note>
     */
    public static LanguageT languageGetDefault() {
        var RESULT = gtk_h.hb_language_get_default();
        return new LanguageT(References.get(RESULT, false));
    }
    
    /**
     * Converts an #hb_language_t to a string.
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
     * Clears out the contents of @map.
     */
    public static void mapClear(MapT map) {
        gtk_h.hb_map_clear(map.handle());
    }
    
    /**
     * Creates a new, initially empty map.
     */
    public static MapT mapCreate() {
        var RESULT = gtk_h.hb_map_create();
        return new MapT(References.get(RESULT, true));
    }
    
    /**
     * Removes @key and its stored value from @map.
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
     * Fetches the value stored for @key in @map.
     */
    public static CodepointT mapGet(MapT map, CodepointT key) {
        var RESULT = gtk_h.hb_map_get(map.handle(), key.getValue());
        return new CodepointT(RESULT);
    }
    
    /**
     * Fetches the singleton empty #hb_map_t.
     */
    public static MapT mapGetEmpty() {
        var RESULT = gtk_h.hb_map_get_empty();
        return new MapT(References.get(RESULT, true));
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
    public static jdk.incubator.foreign.MemoryAddress mapGetUserData(MapT map, UserDataKeyT key) {
        var RESULT = gtk_h.hb_map_get_user_data(map.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether @key is an element of @map.
     */
    public static BoolT mapHas(MapT map, CodepointT key) {
        var RESULT = gtk_h.hb_map_has(map.handle(), key.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether @map is empty (contains no elements).
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
        return new MapT(References.get(RESULT, true));
    }
    
    /**
     * Stores @key:@value in the map.
     */
    public static void mapSet(MapT map, CodepointT key, CodepointT value) {
        gtk_h.hb_map_set(map.handle(), key.getValue(), value.getValue());
    }
    
    /**
     * Fetches the PNG image for a glyph. This function takes a font object, not a face object,
     * as input. To get an optimally sized PNG blob, the UPEM value must be set on the @font
     * object. If UPEM is unset, the blob returned will be the largest PNG available.
     * 
     * If the glyph has no PNG image, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferencePng(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_color_glyph_reference_png(font.handle(), glyph.getValue());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the SVG document for a glyph. The blob may be either plain text or gzip-encoded.
     * 
     * If the glyph has no SVG document, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferenceSvg(FaceT face, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_color_glyph_reference_svg(face.handle(), glyph.getValue());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Tests whether a face includes any `COLR` color layers.
     */
    public static BoolT otColorHasLayers(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_layers(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes a `CPAL` color-palette table.
     */
    public static BoolT otColorHasPalettes(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_palettes(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face has PNG glyph images (either in `CBDT` or `sbix` tables).
     */
    public static BoolT otColorHasPng(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_png(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes any `SVG` glyph images.
     */
    public static BoolT otColorHasSvg(FaceT face) {
        var RESULT = gtk_h.hb_ot_color_has_svg(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the `name` table Name ID that provides display names for
     * the specified color in a face's `CPAL` color palette.
     * 
     * Display names can be generic (e.g., "Background") or specific
     * (e.g., "Eye color").
     */
    public static OtNameIdT otColorPaletteColorGetNameId(FaceT face, int colorIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_color_get_name_id(face.handle(), colorIndex);
        return new OtNameIdT(RESULT);
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
    public static int otColorPaletteGetFlags(FaceT face, int paletteIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_get_flags(face.handle(), paletteIndex);
        return RESULT;
    }
    
    /**
     * Fetches the `name` table Name ID that provides display names for
     * a `CPAL` color palette.
     * 
     * Palette display names can be generic (e.g., "Default") or provide
     * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
     */
    public static OtNameIdT otColorPaletteGetNameId(FaceT face, int paletteIndex) {
        var RESULT = gtk_h.hb_ot_color_palette_get_name_id(face.handle(), paletteIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Sets the font functions to use when working with @font.
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
        gtk_h.hb_ot_layout_collect_features(face.handle(), tableTag.getValue(), scripts.getValue(), languages.getValue(), features.getValue(), featureIndexes.handle());
    }
    
    /**
     * Fetches a list of all feature-lookup indexes in the specified face's GSUB
     * table or GPOS table, underneath the specified scripts, languages, and
     * features. If no list of scripts is provided, all scripts will be queried.
     * If no list of languages is provided, all languages will be queried. If no
     * list of features is provided, all features will be queried.
     */
    public static void otLayoutCollectLookups(FaceT face, TagT tableTag, TagT scripts, TagT languages, TagT features, SetT lookupIndexes) {
        gtk_h.hb_ot_layout_collect_lookups(face.handle(), tableTag.getValue(), scripts.getValue(), languages.getValue(), features.getValue(), lookupIndexes.handle());
    }
    
    /**
     * Fetches a baseline value from the face.
     */
    public static BoolT otLayoutGetBaseline(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        var RESULT = gtk_h.hb_ot_layout_get_baseline(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), coord.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches a baseline value from the face, and synthesizes
     * it if the font does not have it.
     */
    public static void otLayoutGetBaselineWithFallback(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        gtk_h.hb_ot_layout_get_baseline_with_fallback(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), coord.getValue());
    }
    
    /**
     * Fetches the GDEF class of the requested glyph in the specified face.
     */
    public static OtLayoutGlyphClassT otLayoutGetGlyphClass(FaceT face, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_layout_get_glyph_class(face.handle(), glyph.getValue());
        return OtLayoutGlyphClassT.fromValue(RESULT);
    }
    
    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     */
    public static void otLayoutGetGlyphsInClass(FaceT face, OtLayoutGlyphClassT klass, SetT glyphs) {
        gtk_h.hb_ot_layout_get_glyphs_in_class(face.handle(), klass.getValue(), glyphs.handle());
    }
    
    /**
     * Fetches the dominant horizontal baseline tag used by @script.
     */
    public static OtLayoutBaselineTagT otLayoutGetHorizontalBaselineTagForScript(ScriptT script) {
        var RESULT = gtk_h.hb_ot_layout_get_horizontal_baseline_tag_for_script(script.getValue());
        return OtLayoutBaselineTagT.fromValue(RESULT);
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
     * Fetches a list of all glyphs affected by the specified lookup in the
     * specified face's GSUB table or GPOS table.
     */
    public static void otLayoutLookupCollectGlyphs(FaceT face, TagT tableTag, int lookupIndex, SetT glyphsBefore, SetT glyphsInput, SetT glyphsAfter, SetT glyphsOutput) {
        gtk_h.hb_ot_layout_lookup_collect_glyphs(face.handle(), tableTag.getValue(), lookupIndex, glyphsBefore.handle(), glyphsInput.handle(), glyphsAfter.handle(), glyphsOutput.handle());
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
        var RESULT = gtk_h.hb_ot_layout_lookup_would_substitute(face.handle(), lookupIndex, glyphs.getValue(), glyphsLength, zeroContext.getValue());
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
     * Fetches the total number of lookups enumerated in the specified
     * face's GSUB table or GPOS table.
     */
    public static int otLayoutTableGetLookupCount(FaceT face, TagT tableTag) {
        var RESULT = gtk_h.hb_ot_layout_table_get_lookup_count(face.handle(), tableTag.getValue());
        return RESULT;
    }
    
    /**
     * Fetches the specified math constant. For most constants, the value returned
     * is an #hb_position_t.
     * 
     * However, if the requested constant is #HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN,
     * #HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN or
     * #HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN, then the return value is
     * an integer between 0 and 100 representing that percentage.
     */
    public static PositionT otMathGetConstant(FontT font, OtMathConstantT constant) {
        var RESULT = gtk_h.hb_ot_math_get_constant(font.handle(), constant.getValue());
        return new PositionT(RESULT);
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
     * @kern.
     * 
     * If the MathKern table is found, the function examines it to find a height
     * value that is greater or equal to @correction_height. If such a height
     * value is found, corresponding kerning value from the table is returned. If
     * no such height value is found, the last kerning value is returned.
     */
    public static PositionT otMathGetGlyphKerning(FontT font, CodepointT glyph, OtMathKernT kern, PositionT correctionHeight) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_kerning(font.handle(), glyph.getValue(), kern.getValue(), correctionHeight.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches a top-accent-attachment value (if one exists) for the specified
     * glyph index.
     * 
     * For any glyph that does not have a top-accent-attachment value - that is,
     * a glyph not covered by the `MathTopAccentAttachment` table (or, when
     * @font has no `MathTopAccentAttachment` table or no `MATH` table, any
     * glyph) - the function synthesizes a value, returning the position at
     * one-half the glyph's advance width.
     */
    public static PositionT otMathGetGlyphTopAccentAttachment(FontT font, CodepointT glyph) {
        var RESULT = gtk_h.hb_ot_math_get_glyph_top_accent_attachment(font.handle(), glyph.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches the MathVariants table for the specified font and returns the
     * minimum overlap of connecting glyphs that are required to draw a glyph
     * assembly in the specified direction.
     * 
     * <note>The @direction parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all #hb_direction_t
     * values are accepted, only the result of #HB_DIRECTION_IS_HORIZONTAL is
     * considered.</note>
     */
    public static PositionT otMathGetMinConnectorOverlap(FontT font, DirectionT direction) {
        var RESULT = gtk_h.hb_ot_math_get_min_connector_overlap(font.handle(), direction.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Tests whether a face has a `MATH` table.
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
     * It fetches metadata entry of a given tag from a font.
     */
    public static BlobT otMetaReferenceEntry(FaceT face, OtMetaTagT metaTag) {
        var RESULT = gtk_h.hb_ot_meta_reference_entry(face.handle(), metaTag.getValue());
        return new BlobT(References.get(RESULT, true));
    }
    
    /**
     * Fetches metrics value corresponding to @metrics_tag from @font.
     */
    public static BoolT otMetricsGetPosition(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        var RESULT = gtk_h.hb_ot_metrics_get_position(font.handle(), metricsTag.getValue(), position.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches metrics value corresponding to @metrics_tag from @font,
     * and synthesizes a value if it the value is missing in the font.
     */
    public static void otMetricsGetPositionWithFallback(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        gtk_h.hb_ot_metrics_get_position_with_fallback(font.handle(), metricsTag.getValue(), position.getValue());
    }
    
    /**
     * Fetches metrics value corresponding to @metrics_tag from @font with the
     * current font variation settings applied.
     */
    public static float otMetricsGetVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_variation(font.handle(), metricsTag.getValue());
        return RESULT;
    }
    
    /**
     * Fetches horizontal metrics value corresponding to @metrics_tag from @font
     * with the current font variation settings applied.
     */
    public static PositionT otMetricsGetXVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_x_variation(font.handle(), metricsTag.getValue());
        return new PositionT(RESULT);
    }
    
    /**
     * Fetches vertical metrics value corresponding to @metrics_tag from @font with
     * the current font variation settings applied.
     */
    public static PositionT otMetricsGetYVariation(FontT font, OtMetricsTagT metricsTag) {
        var RESULT = gtk_h.hb_ot_metrics_get_y_variation(font.handle(), metricsTag.getValue());
        return new PositionT(RESULT);
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
     * under a given @shape_plan.
     */
    public static void otShapePlanCollectLookups(ShapePlanT shapePlan, TagT tableTag, SetT lookupIndexes) {
        gtk_h.hb_ot_shape_plan_collect_lookups(shapePlan.handle(), tableTag.getValue(), lookupIndexes.handle());
    }
    
    public static TagT otTagFromLanguage(LanguageT language) {
        var RESULT = gtk_h.hb_ot_tag_from_language(language.handle());
        return new TagT(RESULT);
    }
    
    /**
     * Converts a language tag to an #hb_language_t.
     */
    public static LanguageT otTagToLanguage(TagT tag) {
        var RESULT = gtk_h.hb_ot_tag_to_language(tag.getValue());
        return new LanguageT(References.get(RESULT, false));
    }
    
    /**
     * Converts a script tag to an #hb_script_t.
     */
    public static ScriptT otTagToScript(TagT tag) {
        var RESULT = gtk_h.hb_ot_tag_to_script(tag.getValue());
        return ScriptT.fromValue(RESULT);
    }
    
    public static void otTagsFromScript(ScriptT script, TagT scriptTag1, TagT scriptTag2) {
        gtk_h.hb_ot_tags_from_script(script.getValue(), scriptTag1.getValue(), scriptTag2.getValue());
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
     * Fetches the number of named instances included in the face.
     */
    public static int otVarGetNamedInstanceCount(FaceT face) {
        var RESULT = gtk_h.hb_ot_var_get_named_instance_count(face.handle());
        return RESULT;
    }
    
    /**
     * Tests whether a face includes any OpenType variation data in the `fvar` table.
     */
    public static BoolT otVarHasData(FaceT face) {
        var RESULT = gtk_h.hb_ot_var_has_data(face.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the `name` table Name ID that provides display names for
     * the "PostScript name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetPostscriptNameId(FaceT face, int instanceIndex) {
        var RESULT = gtk_h.hb_ot_var_named_instance_get_postscript_name_id(face.handle(), instanceIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Fetches the `name` table Name ID that provides display names for
     * the "Subfamily name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetSubfamilyNameId(FaceT face, int instanceIndex) {
        var RESULT = gtk_h.hb_ot_var_named_instance_get_subfamily_name_id(face.handle(), instanceIndex);
        return new OtNameIdT(RESULT);
    }
    
    /**
     * Normalizes all of the coordinates in the given list of variation axes.
     */
    public static void otVarNormalizeVariations(FaceT face, VariationT variations, int variationsLength, int[] coords, int coordsLength) {
        gtk_h.hb_ot_var_normalize_variations(face.handle(), variations.handle(), variationsLength, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, coords)).handle(), coordsLength);
    }
    
    /**
     * Converts an ISO 15924 script tag to a corresponding #hb_script_t.
     */
    public static ScriptT scriptFromIso15924Tag(TagT tag) {
        var RESULT = gtk_h.hb_script_from_iso15924_tag(tag.getValue());
        return ScriptT.fromValue(RESULT);
    }
    
    /**
     * Converts a string @str representing an ISO 15924 script tag to a
     * corresponding #hb_script_t. Shorthand for hb_tag_from_string() then
     * hb_script_from_iso15924_tag().
     */
    public static ScriptT scriptFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_script_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len);
        return ScriptT.fromValue(RESULT);
    }
    
    /**
     * Fetches the #hb_direction_t of a script when it is
     * set horizontally. All right-to-left scripts will return
     * #HB_DIRECTION_RTL. All left-to-right scripts will return
     * #HB_DIRECTION_LTR.  Scripts that can be written either
     * horizontally or vertically will return #HB_DIRECTION_INVALID.
     * Unknown scripts will return #HB_DIRECTION_LTR.
     */
    public static DirectionT scriptGetHorizontalDirection(ScriptT script) {
        var RESULT = gtk_h.hb_script_get_horizontal_direction(script.getValue());
        return DirectionT.fromValue(RESULT);
    }
    
    /**
     * Converts an #hb_script_t to a corresponding ISO 15924 script tag.
     */
    public static TagT scriptToIso15924Tag(ScriptT script) {
        var RESULT = gtk_h.hb_script_to_iso15924_tag(script.getValue());
        return new TagT(RESULT);
    }
    
    /**
     * Checks the equality of two #hb_segment_properties_t's.
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
     * Fills in missing fields of @p from @src in a considered manner.
     * 
     * First, if @p does not have direction set, direction is copied from @src.
     * 
     * Next, if @p and @src have the same direction (which can be unset), if @p
     * does not have script set, script is copied from @src.
     * 
     * Finally, if @p and @src have the same direction and script (which either
     * can be unset), if @p does not have language set, language is copied from
     * @src.
     */
    public static void segmentPropertiesOverlay(SegmentPropertiesT p, SegmentPropertiesT src) {
        gtk_h.hb_segment_properties_overlay(p.handle(), src.handle());
    }
    
    /**
     * Adds @codepoint to @set.
     */
    public static void setAdd(SetT set, CodepointT codepoint) {
        gtk_h.hb_set_add(set.handle(), codepoint.getValue());
    }
    
    /**
     * Adds all of the elements from @first to @last
     * (inclusive) to @set.
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
     * Allocate a copy of @set.
     */
    public static SetT setCopy(SetT set) {
        var RESULT = gtk_h.hb_set_copy(set.handle());
        return new SetT(References.get(RESULT, true));
    }
    
    /**
     * Creates a new, initially empty set.
     */
    public static SetT setCreate() {
        var RESULT = gtk_h.hb_set_create();
        return new SetT(References.get(RESULT, true));
    }
    
    /**
     * Removes @codepoint from @set.
     */
    public static void setDel(SetT set, CodepointT codepoint) {
        gtk_h.hb_set_del(set.handle(), codepoint.getValue());
    }
    
    /**
     * Removes all of the elements from @first to @last
     * (inclusive) from @set.
     * 
     * If @last is #HB_SET_VALUE_INVALID, then all values
     * greater than or equal to @first are removed.
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
     * Fetches the singleton empty #hb_set_t.
     */
    public static SetT setGetEmpty() {
        var RESULT = gtk_h.hb_set_get_empty();
        return new SetT(References.get(RESULT, true));
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
    public static jdk.incubator.foreign.MemoryAddress setGetUserData(SetT set, UserDataKeyT key) {
        var RESULT = gtk_h.hb_set_get_user_data(set.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Tests whether @codepoint belongs to @set.
     */
    public static BoolT setHas(SetT set, CodepointT codepoint) {
        var RESULT = gtk_h.hb_set_has(set.handle(), codepoint.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Makes @set the intersection of @set and @other.
     */
    public static void setIntersect(SetT set, SetT other) {
        gtk_h.hb_set_intersect(set.handle(), other.handle());
    }
    
    /**
     * Inverts the contents of @set.
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
     * Tests whether @set and @other are equal (contain the same
     * elements).
     */
    public static BoolT setIsEqual(SetT set, SetT other) {
        var RESULT = gtk_h.hb_set_is_equal(set.handle(), other.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Tests whether @set is a subset of @larger_set.
     */
    public static BoolT setIsSubset(SetT set, SetT largerSet) {
        var RESULT = gtk_h.hb_set_is_subset(set.handle(), largerSet.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the next element in @set that is greater than current value of @codepoint.
     * 
     * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
     */
    public static BoolT setNext(SetT set, CodepointT codepoint) {
        var RESULT = gtk_h.hb_set_next(set.handle(), codepoint.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the next consecutive range of elements in @set that
     * are greater than current value of @last.
     * 
     * Set @last to #HB_SET_VALUE_INVALID to get started.
     */
    public static BoolT setNextRange(SetT set, CodepointT first, CodepointT last) {
        var RESULT = gtk_h.hb_set_next_range(set.handle(), first.getValue(), last.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the previous element in @set that is lower than current value of @codepoint.
     * 
     * Set @codepoint to #HB_SET_VALUE_INVALID to get started.
     */
    public static BoolT setPrevious(SetT set, CodepointT codepoint) {
        var RESULT = gtk_h.hb_set_previous(set.handle(), codepoint.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the previous consecutive range of elements in @set that
     * are greater than current value of @last.
     * 
     * Set @first to #HB_SET_VALUE_INVALID to get started.
     */
    public static BoolT setPreviousRange(SetT set, CodepointT first, CodepointT last) {
        var RESULT = gtk_h.hb_set_previous_range(set.handle(), first.getValue(), last.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on a set.
     */
    public static SetT setReference(SetT set) {
        var RESULT = gtk_h.hb_set_reference(set.handle());
        return new SetT(References.get(RESULT, true));
    }
    
    /**
     * Makes the contents of @set equal to the contents of @other.
     */
    public static void setSet(SetT set, SetT other) {
        gtk_h.hb_set_set(set.handle(), other.handle());
    }
    
    /**
     * Subtracts the contents of @other from @set.
     */
    public static void setSubtract(SetT set, SetT other) {
        gtk_h.hb_set_subtract(set.handle(), other.handle());
    }
    
    /**
     * Makes @set the symmetric difference of @set
     * and @other.
     */
    public static void setSymmetricDifference(SetT set, SetT other) {
        gtk_h.hb_set_symmetric_difference(set.handle(), other.handle());
    }
    
    /**
     * Makes @set the union of @set and @other.
     */
    public static void setUnion(SetT set, SetT other) {
        gtk_h.hb_set_union(set.handle(), other.handle());
    }
    
    /**
     * Shapes @buffer using @font turning its Unicode characters content to
     * positioned glyphs. If @features is not %NULL, it will be used to control the
     * features applied during shaping. If two @features have the same tag but
     * overlapping ranges the value of the feature with the higher index takes
     * precedence.
     */
    public static void shape(FontT font, BufferT buffer, FeatureT[] features, int numFeatures) {
        gtk_h.hb_shape(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures);
    }
    
    /**
     * See hb_shape() for details. If @shaper_list is not %NULL, the specified
     * shapers will be used in the given order, otherwise the default shapers list
     * will be used.
     */
    public static BoolT shapeFull(FontT font, BufferT buffer, FeatureT[] features, int numFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_full(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Constructs a shaping plan for a combination of @face, @user_features, @props,
     * and @shaper_list.
     */
    public static ShapePlanT shapePlanCreate(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(References.get(RESULT, true));
    }
    
    /**
     * The variable-font version of #hb_shape_plan_create.
     * Constructs a shaping plan for a combination of @face, @user_features, @props,
     * and @shaper_list, plus the variation-space coordinates @coords.
     */
    public static ShapePlanT shapePlanCreate2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create2(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, coords)).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(References.get(RESULT, true));
    }
    
    /**
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of @face, @user_features, @props, and @shaper_list.
     */
    public static ShapePlanT shapePlanCreateCached(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create_cached(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(References.get(RESULT, true));
    }
    
    /**
     * The variable-font version of #hb_shape_plan_create_cached.
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of @face, @user_features, @props, and @shaper_list, plus the
     * variation-space coordinates @coords.
     */
    public static ShapePlanT shapePlanCreateCached2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        var RESULT = gtk_h.hb_shape_plan_create_cached2(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, coords)).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
        return new ShapePlanT(References.get(RESULT, true));
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
     * the given @font and @features.
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
        return new ShapePlanT(References.get(RESULT, true));
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
    public static jdk.incubator.foreign.MemoryAddress shapePlanGetUserData(ShapePlanT shapePlan, UserDataKeyT key) {
        var RESULT = gtk_h.hb_shape_plan_get_user_data(shapePlan.handle(), key.handle());
        return RESULT;
    }
    
    /**
     * Increases the reference count on the given shaping plan.
     */
    public static ShapePlanT shapePlanReference(ShapePlanT shapePlan) {
        var RESULT = gtk_h.hb_shape_plan_reference(shapePlan.handle());
        return new ShapePlanT(References.get(RESULT, true));
    }
    
    /**
     * Searches variation axes of a #hb_font_t object for a specific axis first,
     * if not set, then tries to get default style values from different
     * tables of the font.
     */
    public static float styleGetValue(FontT font, StyleTagT styleTag) {
        var RESULT = gtk_h.hb_style_get_value(font.handle(), styleTag.getValue());
        return RESULT;
    }
    
    /**
     * Converts a string into an #hb_tag_t. Valid tags
     * are four characters. Shorter input strings will be
     * padded with spaces. Longer input strings will be
     * truncated.
     */
    public static TagT tagFromString(byte[] str, int len) {
        var RESULT = gtk_h.hb_tag_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len);
        return new TagT(RESULT);
    }
    
    /**
     * Converts an #hb_tag_t to a string and returns it in @buf.
     * Strings will be four characters long.
     */
    public static void tagToString(TagT tag, byte[] buf) {
        gtk_h.hb_tag_to_string(tag.getValue(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, buf)).handle());
    }
    
    /**
     * Retrieves the Canonical Combining Class (ccc) property
     * of code point @unicode.
     */
    public static UnicodeCombiningClassT unicodeCombiningClass(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_combining_class(ufuncs.handle(), unicode.getValue());
        return UnicodeCombiningClassT.fromValue(RESULT);
    }
    
    /**
     * Fetches the composition of a sequence of two Unicode
     * code points.
     * 
     * Calls the composition function of the specified
     * Unicode-functions structure @ufuncs.
     */
    public static BoolT unicodeCompose(UnicodeFuncsT ufuncs, CodepointT a, CodepointT b, CodepointT ab) {
        var RESULT = gtk_h.hb_unicode_compose(ufuncs.handle(), a.getValue(), b.getValue(), ab.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Fetches the decomposition of a Unicode code point.
     * 
     * Calls the decomposition function of the specified
     * Unicode-functions structure @ufuncs.
     */
    public static BoolT unicodeDecompose(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b) {
        var RESULT = gtk_h.hb_unicode_decompose(ufuncs.handle(), ab.getValue(), a.getValue(), b.getValue());
        return new BoolT(RESULT);
    }
    
    /**
     * Creates a new #hb_unicode_funcs_t structure of Unicode functions.
     */
    public static UnicodeFuncsT unicodeFuncsCreate(UnicodeFuncsT parent) {
        var RESULT = gtk_h.hb_unicode_funcs_create(parent.handle());
        return new UnicodeFuncsT(References.get(RESULT, true));
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
     * when no functions are explicitly set on #hb_buffer_t.
     */
    public static UnicodeFuncsT unicodeFuncsGetDefault() {
        var RESULT = gtk_h.hb_unicode_funcs_get_default();
        return new UnicodeFuncsT(References.get(RESULT, false));
    }
    
    /**
     * Fetches the singleton empty Unicode-functions structure.
     */
    public static UnicodeFuncsT unicodeFuncsGetEmpty() {
        var RESULT = gtk_h.hb_unicode_funcs_get_empty();
        return new UnicodeFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the parent of the Unicode-functions structure
     * @ufuncs.
     */
    public static UnicodeFuncsT unicodeFuncsGetParent(UnicodeFuncsT ufuncs) {
        var RESULT = gtk_h.hb_unicode_funcs_get_parent(ufuncs.handle());
        return new UnicodeFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Fetches the user-data associated with the specified key,
     * attached to the specified Unicode-functions structure.
     */
    public static jdk.incubator.foreign.MemoryAddress unicodeFuncsGetUserData(UnicodeFuncsT ufuncs, UserDataKeyT key) {
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
        return new UnicodeFuncsT(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the General Category (gc) property
     * of code point @unicode.
     */
    public static UnicodeGeneralCategoryT unicodeGeneralCategory(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_general_category(ufuncs.handle(), unicode.getValue());
        return UnicodeGeneralCategoryT.fromValue(RESULT);
    }
    
    /**
     * Retrieves the Bi-directional Mirroring Glyph code
     * point defined for code point @unicode.
     */
    public static CodepointT unicodeMirroring(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_mirroring(ufuncs.handle(), unicode.getValue());
        return new CodepointT(RESULT);
    }
    
    /**
     * Retrieves the #hb_script_t script to which code
     * point @unicode belongs.
     */
    public static ScriptT unicodeScript(UnicodeFuncsT ufuncs, CodepointT unicode) {
        var RESULT = gtk_h.hb_unicode_script(ufuncs.handle(), unicode.getValue());
        return ScriptT.fromValue(RESULT);
    }
    
    /**
     * Parses a string into a #hb_variation_t.
     * 
     * The format for specifying variation settings follows. All valid CSS
     * font-variation-settings values other than 'normal' and 'inherited' are also
     * accepted, though, not documented below.
     * 
     * The format is a tag, optionally followed by an equals sign, followed by a
     * number. For example `wght=500`, or `slnt=-7.5`.
     */
    public static BoolT variationFromString(byte[] str, int len, VariationT variation) {
        var RESULT = gtk_h.hb_variation_from_string(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, str)).handle(), len, variation.handle());
        return new BoolT(RESULT);
    }
    
    /**
     * Converts an #hb_variation_t into a %NULL-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for @buf, 128 bytes is more than enough.
     */
    public static void variationToString(VariationT variation, java.lang.String[] buf, int size) {
        gtk_h.hb_variation_to_string(variation.handle(), Interop.allocateNativeArray(buf).handle(), size);
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