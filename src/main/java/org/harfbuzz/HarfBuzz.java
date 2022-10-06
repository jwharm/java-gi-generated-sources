package org.harfbuzz;

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

    static final MethodHandle hb_aat_layout_feature_type_get_name_id = Interop.downcallHandle(
        "hb_aat_layout_feature_type_get_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the name identifier of the specified feature type in the face's {@code name} table.
     */
    public static OtNameIdT aatLayoutFeatureTypeGetNameId(FaceT face, AatLayoutFeatureTypeT featureType) {
        try {
            var RESULT = (int) hb_aat_layout_feature_type_get_name_id.invokeExact(face.handle(), featureType.getValue());
            return new OtNameIdT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_aat_layout_feature_type_get_selector_infos = Interop.downcallHandle(
        "hb_aat_layout_feature_type_get_selector_infos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the selectors available for the specified feature in the given face.
     * <p>
     * If upon return, {@code default_index} is set to {@code HB_AAT_LAYOUT_NO_SELECTOR_INDEX}, then
     * the feature type is non-exclusive.  Otherwise, {@code default_index} is the index of
     * the selector that is selected by default.
     */
    public static int aatLayoutFeatureTypeGetSelectorInfos(FaceT face, AatLayoutFeatureTypeT featureType, int startOffset, PointerInteger selectorCount, PointerProxy<AatLayoutFeatureSelectorInfoT> selectors, PointerInteger defaultIndex) {
        try {
            var RESULT = (int) hb_aat_layout_feature_type_get_selector_infos.invokeExact(face.handle(), featureType.getValue(), startOffset, selectorCount.handle(), selectors.handle(), defaultIndex.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_aat_layout_get_feature_types = Interop.downcallHandle(
        "hb_aat_layout_get_feature_types",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the AAT feature types included in the specified face.
     */
    public static int aatLayoutGetFeatureTypes(FaceT face, int startOffset, PointerInteger featureCount, PointerEnumeration features) {
        try {
            var RESULT = (int) hb_aat_layout_get_feature_types.invokeExact(face.handle(), startOffset, featureCount.handle(), features.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_aat_layout_has_positioning = Interop.downcallHandle(
        "hb_aat_layout_has_positioning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any positioning information
     * in the {@code kerx} table.
     * <p>
     * &lt;note>Note: does not examine the `GPOS` table.</note&gt;
     */
    public static BoolT aatLayoutHasPositioning(FaceT face) {
        try {
            var RESULT = (int) hb_aat_layout_has_positioning.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_aat_layout_has_substitution = Interop.downcallHandle(
        "hb_aat_layout_has_substitution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any substitutions in the
     * {@code morx} or {@code mort} tables.
     * <p>
     * &lt;note>Note: does not examine the `GSUB` table.</note&gt;
     */
    public static BoolT aatLayoutHasSubstitution(FaceT face) {
        try {
            var RESULT = (int) hb_aat_layout_has_substitution.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_aat_layout_has_tracking = Interop.downcallHandle(
        "hb_aat_layout_has_tracking",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any tracking information
     * in the {@code trak} table.
     */
    public static BoolT aatLayoutHasTracking(FaceT face) {
        try {
            var RESULT = (int) hb_aat_layout_has_tracking.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_copy_writable_or_fail = Interop.downcallHandle(
        "hb_blob_copy_writable_or_fail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a writable copy of {@code blob}.
     */
    public static BlobT blobCopyWritableOrFail(BlobT blob) {
        try {
            var RESULT = (MemoryAddress) hb_blob_copy_writable_or_fail.invokeExact(blob.handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_create_from_file = Interop.downcallHandle(
        "hb_blob_create_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFile(java.lang.String fileName) {
        try {
            var RESULT = (MemoryAddress) hb_blob_create_from_file.invokeExact(Interop.allocateNativeString(fileName).handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_create_from_file_or_fail = Interop.downcallHandle(
        "hb_blob_create_from_file_or_fail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static BlobT blobCreateFromFileOrFail(java.lang.String fileName) {
        try {
            var RESULT = (MemoryAddress) hb_blob_create_from_file_or_fail.invokeExact(Interop.allocateNativeString(fileName).handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_create_sub_blob = Interop.downcallHandle(
        "hb_blob_create_sub_blob",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_blob_create_sub_blob.invokeExact(parent.handle(), offset, length);
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_destroy = Interop.downcallHandle(
        "hb_blob_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on {@code blob}, and if it reaches zero, destroys
     * {@code blob}, freeing all memory, possibly calling the destroy-callback the blob
     * was created for if it has not been called already.
     * <p>
     * See TODO:link object types for more information.
     */
    public static void blobDestroy(BlobT blob) {
        try {
            hb_blob_destroy.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_get_data = Interop.downcallHandle(
        "hb_blob_get_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the data from a blob.
     */
    public static PointerString blobGetData(BlobT blob, PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) hb_blob_get_data.invokeExact(blob.handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_get_data_writable = Interop.downcallHandle(
        "hb_blob_get_data_writable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to make blob data writable (possibly copying it) and
     * return pointer to data.
     * <p>
     * Fails if blob has been made immutable, or if memory allocation
     * fails.
     */
    public static PointerString blobGetDataWritable(BlobT blob, PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) hb_blob_get_data_writable.invokeExact(blob.handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_get_empty = Interop.downcallHandle(
        "hb_blob_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the singleton empty blob.
     * <p>
     * See TODO:link object types for more information.
     */
    public static BlobT blobGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_blob_get_empty.invokeExact();
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_get_length = Interop.downcallHandle(
        "hb_blob_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the length of a blob's data.
     */
    public static int blobGetLength(BlobT blob) {
        try {
            var RESULT = (int) hb_blob_get_length.invokeExact(blob.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_get_user_data = Interop.downcallHandle(
        "hb_blob_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static java.lang.foreign.MemoryAddress blobGetUserData(BlobT blob, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_blob_get_user_data.invokeExact(blob.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_is_immutable = Interop.downcallHandle(
        "hb_blob_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a blob is immutable.
     */
    public static BoolT blobIsImmutable(BlobT blob) {
        try {
            var RESULT = (int) hb_blob_is_immutable.invokeExact(blob.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_make_immutable = Interop.downcallHandle(
        "hb_blob_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a blob immutable.
     */
    public static void blobMakeImmutable(BlobT blob) {
        try {
            hb_blob_make_immutable.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_blob_reference = Interop.downcallHandle(
        "hb_blob_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code blob}.
     * <p>
     * See TODO:link object types for more information.
     */
    public static BlobT blobReference(BlobT blob) {
        try {
            var RESULT = (MemoryAddress) hb_blob_reference.invokeExact(blob.handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add = Interop.downcallHandle(
        "hb_buffer_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_buffer_add.invokeExact(buffer.handle(), codepoint.getValue(), cluster);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add_codepoints = Interop.downcallHandle(
        "hb_buffer_add_codepoints",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_buffer_add_codepoints.invokeExact(buffer.handle(), Interop.allocateNativeArray(CodepointT.getIntegerValues(text)).handle(), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add_latin1 = Interop.downcallHandle(
        "hb_buffer_add_latin1",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
     * Unicode code points that can fit in 8-bit strings.
     * <p>
     * &lt;note>Has nothing to do with non-Unicode Latin-1 encoding.</note&gt;
     */
    public static void bufferAddLatin1(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        try {
            hb_buffer_add_latin1.invokeExact(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add_utf16 = Interop.downcallHandle(
        "hb_buffer_add_utf16",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-16 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf16(BufferT buffer, short[] text, int textLength, int itemOffset, int itemLength) {
        try {
            hb_buffer_add_utf16.invokeExact(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add_utf32 = Interop.downcallHandle(
        "hb_buffer_add_utf32",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-32 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf32(BufferT buffer, int[] text, int textLength, int itemOffset, int itemLength) {
        try {
            hb_buffer_add_utf32.invokeExact(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_add_utf8 = Interop.downcallHandle(
        "hb_buffer_add_utf8",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-8 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static void bufferAddUtf8(BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        try {
            hb_buffer_add_utf8.invokeExact(buffer.handle(), Interop.allocateNativeArray(text).handle(), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_allocation_successful = Interop.downcallHandle(
        "hb_buffer_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if allocating memory for the buffer succeeded.
     */
    public static BoolT bufferAllocationSuccessful(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_allocation_successful.invokeExact(buffer.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_append = Interop.downcallHandle(
        "hb_buffer_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Append (part of) contents of another buffer to this buffer.
     */
    public static void bufferAppend(BufferT buffer, BufferT source, int start, int end) {
        try {
            hb_buffer_append.invokeExact(buffer.handle(), source.handle(), start, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_clear_contents = Interop.downcallHandle(
        "hb_buffer_clear_contents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
     * the replacement code point.
     */
    public static void bufferClearContents(BufferT buffer) {
        try {
            hb_buffer_clear_contents.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_create = Interop.downcallHandle(
        "hb_buffer_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link buffer_t} with all properties to defaults.
     */
    public static BufferT bufferCreate() {
        try {
            var RESULT = (MemoryAddress) hb_buffer_create.invokeExact();
            return new BufferT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_create_similar = Interop.downcallHandle(
        "hb_buffer_create_similar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link buffer_t}, similar to hb_buffer_create(). The only
     * difference is that the buffer is configured similarly to {@code src}.
     */
    public static BufferT bufferCreateSimilar(BufferT src) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_create_similar.invokeExact(src.handle());
            return new BufferT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_deserialize_glyphs = Interop.downcallHandle(
        "hb_buffer_deserialize_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deserializes glyphs {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_glyphs().
     */
    public static BoolT bufferDeserializeGlyphs(BufferT buffer, java.lang.String[] buf, int bufLen, PointerString endPtr, FontT font, BufferSerializeFormatT format) {
        try {
            var RESULT = (int) hb_buffer_deserialize_glyphs.invokeExact(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, endPtr.handle(), font.handle(), format.getValue());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_deserialize_unicode = Interop.downcallHandle(
        "hb_buffer_deserialize_unicode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deserializes Unicode {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_unicode().
     */
    public static BoolT bufferDeserializeUnicode(BufferT buffer, java.lang.String[] buf, int bufLen, PointerString endPtr, BufferSerializeFormatT format) {
        try {
            var RESULT = (int) hb_buffer_deserialize_unicode.invokeExact(buffer.handle(), Interop.allocateNativeArray(buf).handle(), bufLen, endPtr.handle(), format.getValue());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_destroy = Interop.downcallHandle(
        "hb_buffer_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Deallocate the {@code buffer}.
     * Decreases the reference count on {@code buffer} by one. If the result is zero, then
     * {@code buffer} and all associated resources are freed. See hb_buffer_reference().
     */
    public static void bufferDestroy(BufferT buffer) {
        try {
            hb_buffer_destroy.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_diff = Interop.downcallHandle(
        "hb_buffer_diff",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * If dottedcircle_glyph is (hb_codepoint_t) -1 then {@code HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT}
     * and {@code HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT} are never returned.  This should be used by most
     * callers if just comparing two buffers is needed.
     */
    public static BufferDiffFlagsT bufferDiff(BufferT buffer, BufferT reference, CodepointT dottedcircleGlyph, int positionFuzz) {
        try {
            var RESULT = (int) hb_buffer_diff.invokeExact(buffer.handle(), reference.handle(), dottedcircleGlyph.getValue(), positionFuzz);
            return new BufferDiffFlagsT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_cluster_level = Interop.downcallHandle(
        "hb_buffer_get_cluster_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static BufferClusterLevelT bufferGetClusterLevel(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_cluster_level.invokeExact(buffer.handle());
            return new BufferClusterLevelT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_content_type = Interop.downcallHandle(
        "hb_buffer_get_content_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static BufferContentTypeT bufferGetContentType(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_content_type.invokeExact(buffer.handle());
            return new BufferContentTypeT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_direction = Interop.downcallHandle(
        "hb_buffer_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_direction()
     */
    public static DirectionT bufferGetDirection(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_direction.invokeExact(buffer.handle());
            return new DirectionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_empty = Interop.downcallHandle(
        "hb_buffer_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches an empty {@link buffer_t}.
     */
    public static BufferT bufferGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_empty.invokeExact();
            return new BufferT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_flags = Interop.downcallHandle(
        "hb_buffer_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link buffer_flags_t} of {@code buffer}.
     */
    public static BufferFlagsT bufferGetFlags(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_flags.invokeExact(buffer.handle());
            return new BufferFlagsT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_glyph_infos = Interop.downcallHandle(
        "hb_buffer_get_glyph_infos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code buffer} glyph information array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     */
    public static PointerProxy<GlyphInfoT> bufferGetGlyphInfos(BufferT buffer, PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_glyph_infos.invokeExact(buffer.handle(), length.handle());
            return new PointerProxy<GlyphInfoT>(RESULT, GlyphInfoT.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_glyph_positions = Interop.downcallHandle(
        "hb_buffer_get_glyph_positions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code buffer} glyph position array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     * <p>
     * If buffer did not have positions before, the positions will be
     * initialized to zeros, unless this function is called from
     * within a buffer message callback (see hb_buffer_set_message_func()),
     * in which case {@code null} is returned.
     */
    public static PointerProxy<GlyphPositionT> bufferGetGlyphPositions(BufferT buffer, PointerInteger length) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_glyph_positions.invokeExact(buffer.handle(), length.handle());
            return new PointerProxy<GlyphPositionT>(RESULT, GlyphPositionT.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_invisible_glyph = Interop.downcallHandle(
        "hb_buffer_get_invisible_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_invisible_glyph().
     */
    public static CodepointT bufferGetInvisibleGlyph(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_invisible_glyph.invokeExact(buffer.handle());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_language = Interop.downcallHandle(
        "hb_buffer_get_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_language().
     */
    public static LanguageT bufferGetLanguage(BufferT buffer) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_language.invokeExact(buffer.handle());
            return new LanguageT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_length = Interop.downcallHandle(
        "hb_buffer_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of items in the buffer.
     */
    public static int bufferGetLength(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_length.invokeExact(buffer.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_not_found_glyph = Interop.downcallHandle(
        "hb_buffer_get_not_found_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_not_found_glyph().
     */
    public static CodepointT bufferGetNotFoundGlyph(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_not_found_glyph.invokeExact(buffer.handle());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_replacement_codepoint = Interop.downcallHandle(
        "hb_buffer_get_replacement_codepoint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     */
    public static CodepointT bufferGetReplacementCodepoint(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_replacement_codepoint.invokeExact(buffer.handle());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_script = Interop.downcallHandle(
        "hb_buffer_get_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the script of {@code buffer}.
     */
    public static ScriptT bufferGetScript(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_get_script.invokeExact(buffer.handle());
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_segment_properties = Interop.downcallHandle(
        "hb_buffer_get_segment_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code props} to the {@link segment_properties_t} of {@code buffer}.
     */
    public static void bufferGetSegmentProperties(BufferT buffer, SegmentPropertiesT props) {
        try {
            hb_buffer_get_segment_properties.invokeExact(buffer.handle(), props.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_unicode_funcs = Interop.downcallHandle(
        "hb_buffer_get_unicode_funcs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the Unicode-functions structure of a buffer.
     */
    public static UnicodeFuncsT bufferGetUnicodeFuncs(BufferT buffer) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_unicode_funcs.invokeExact(buffer.handle());
            return new UnicodeFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_get_user_data = Interop.downcallHandle(
        "hb_buffer_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified buffer.
     */
    public static java.lang.foreign.MemoryAddress bufferGetUserData(BufferT buffer, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_get_user_data.invokeExact(buffer.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_guess_segment_properties = Interop.downcallHandle(
        "hb_buffer_guess_segment_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_buffer_guess_segment_properties.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_has_positions = Interop.downcallHandle(
        "hb_buffer_has_positions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code buffer} has glyph position data.
     * A buffer gains position data when hb_buffer_get_glyph_positions() is called on it,
     * and cleared of position data when hb_buffer_clear_contents() is called.
     */
    public static BoolT bufferHasPositions(BufferT buffer) {
        try {
            var RESULT = (int) hb_buffer_has_positions.invokeExact(buffer.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_normalize_glyphs = Interop.downcallHandle(
        "hb_buffer_normalize_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders a glyph buffer to have canonical in-cluster glyph order / position.
     * The resulting clusters should behave identical to pre-reordering clusters.
     * <p>
     * &lt;note>This has nothing to do with Unicode normalization.</note&gt;
     */
    public static void bufferNormalizeGlyphs(BufferT buffer) {
        try {
            hb_buffer_normalize_glyphs.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_pre_allocate = Interop.downcallHandle(
        "hb_buffer_pre_allocate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pre allocates memory for {@code buffer} to fit at least {@code size} number of items.
     */
    public static BoolT bufferPreAllocate(BufferT buffer, int size) {
        try {
            var RESULT = (int) hb_buffer_pre_allocate.invokeExact(buffer.handle(), size);
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_reference = Interop.downcallHandle(
        "hb_buffer_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code buffer} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_buffer_destroy() is made.
     */
    public static BufferT bufferReference(BufferT buffer) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_reference.invokeExact(buffer.handle());
            return new BufferT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_reset = Interop.downcallHandle(
        "hb_buffer_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the buffer to its initial status, as if it was just newly created
     * with hb_buffer_create().
     */
    public static void bufferReset(BufferT buffer) {
        try {
            hb_buffer_reset.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_reverse = Interop.downcallHandle(
        "hb_buffer_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses buffer contents.
     */
    public static void bufferReverse(BufferT buffer) {
        try {
            hb_buffer_reverse.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_reverse_clusters = Interop.downcallHandle(
        "hb_buffer_reverse_clusters",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses buffer clusters.  That is, the buffer contents are
     * reversed, then each cluster (consecutive items having the
     * same cluster number) are reversed again.
     */
    public static void bufferReverseClusters(BufferT buffer) {
        try {
            hb_buffer_reverse_clusters.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_reverse_range = Interop.downcallHandle(
        "hb_buffer_reverse_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Reverses buffer contents between {@code start} and {@code end}.
     */
    public static void bufferReverseRange(BufferT buffer, int start, int end) {
        try {
            hb_buffer_reverse_range.invokeExact(buffer.handle(), start, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize = Interop.downcallHandle(
        "hb_buffer_serialize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Serializes {@code buffer} into a textual representation of its content, whether
     * Unicode codepoints or glyph identifiers and positioning information. This is
     * useful for showing the contents of the buffer, for example during debugging.
     * See the documentation of hb_buffer_serialize_unicode() and
     * hb_buffer_serialize_glyphs() for a description of the output format.
     */
    public static int bufferSerialize(BufferT buffer, int start, int end, PointerByte buf, int bufSize, PointerInteger bufConsumed, FontT font, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        try {
            var RESULT = (int) hb_buffer_serialize.invokeExact(buffer.handle(), start, end, buf.handle(), bufSize, bufConsumed.handle(), font.handle(), format.getValue(), flags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize_format_from_string = Interop.downcallHandle(
        "hb_buffer_serialize_format_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a string into an {@link buffer_serialize_format_t}. Does not check if
     * {@code str} is a valid buffer serialization format, use
     * hb_buffer_serialize_list_formats() to get the list of supported formats.
     */
    public static BufferSerializeFormatT bufferSerializeFormatFromString(byte[] str, int len) {
        try {
            var RESULT = (int) hb_buffer_serialize_format_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len);
            return new BufferSerializeFormatT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize_format_to_string = Interop.downcallHandle(
        "hb_buffer_serialize_format_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts {@code format} to the string corresponding it, or {@code null} if it is not a valid
     * {@link buffer_serialize_format_t}.
     */
    public static java.lang.String bufferSerializeFormatToString(BufferSerializeFormatT format) {
        try {
            var RESULT = (MemoryAddress) hb_buffer_serialize_format_to_string.invokeExact(format.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize_glyphs = Interop.downcallHandle(
        "hb_buffer_serialize_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public static int bufferSerializeGlyphs(BufferT buffer, int start, int end, PointerByte buf, int bufSize, PointerInteger bufConsumed, FontT font, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        try {
            var RESULT = (int) hb_buffer_serialize_glyphs.invokeExact(buffer.handle(), start, end, buf.handle(), bufSize, bufConsumed.handle(), font.handle(), format.getValue(), flags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize_list_formats = Interop.downcallHandle(
        "hb_buffer_serialize_list_formats",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Returns a list of supported buffer serialization formats.
     */
    public static PointerString bufferSerializeListFormats() {
        try {
            var RESULT = (MemoryAddress) hb_buffer_serialize_list_formats.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_serialize_unicode = Interop.downcallHandle(
        "hb_buffer_serialize_unicode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public static int bufferSerializeUnicode(BufferT buffer, int start, int end, PointerByte buf, int bufSize, PointerInteger bufConsumed, BufferSerializeFormatT format, BufferSerializeFlagsT flags) {
        try {
            var RESULT = (int) hb_buffer_serialize_unicode.invokeExact(buffer.handle(), start, end, buf.handle(), bufSize, bufConsumed.handle(), format.getValue(), flags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_cluster_level = Interop.downcallHandle(
        "hb_buffer_set_cluster_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static void bufferSetClusterLevel(BufferT buffer, BufferClusterLevelT clusterLevel) {
        try {
            hb_buffer_set_cluster_level.invokeExact(buffer.handle(), clusterLevel.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_content_type = Interop.downcallHandle(
        "hb_buffer_set_content_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static void bufferSetContentType(BufferT buffer, BufferContentTypeT contentType) {
        try {
            hb_buffer_set_content_type.invokeExact(buffer.handle(), contentType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_direction = Interop.downcallHandle(
        "hb_buffer_set_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_buffer_set_direction.invokeExact(buffer.handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_flags = Interop.downcallHandle(
        "hb_buffer_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code buffer} flags to {@code flags}. See {@link buffer_flags_t}.
     */
    public static void bufferSetFlags(BufferT buffer, BufferFlagsT flags) {
        try {
            hb_buffer_set_flags.invokeExact(buffer.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_invisible_glyph = Interop.downcallHandle(
        "hb_buffer_set_invisible_glyph",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link codepoint_t} that replaces invisible characters in
     * the shaping result.  If set to zero (default), the glyph for the
     * U+0020 SPACE character is used.  Otherwise, this value is used
     * verbatim.
     */
    public static void bufferSetInvisibleGlyph(BufferT buffer, CodepointT invisible) {
        try {
            hb_buffer_set_invisible_glyph.invokeExact(buffer.handle(), invisible.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_language = Interop.downcallHandle(
        "hb_buffer_set_language",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_buffer_set_language.invokeExact(buffer.handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_length = Interop.downcallHandle(
        "hb_buffer_set_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Similar to hb_buffer_pre_allocate(), but clears any new items added at the
     * end.
     */
    public static BoolT bufferSetLength(BufferT buffer, int length) {
        try {
            var RESULT = (int) hb_buffer_set_length.invokeExact(buffer.handle(), length);
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_not_found_glyph = Interop.downcallHandle(
        "hb_buffer_set_not_found_glyph",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link codepoint_t} that replaces characters not found in
     * the font during shaping.
     * <p>
     * The not-found glyph defaults to zero, sometimes knows as the
     * ".notdef" glyph.  This API allows for differentiating the two.
     */
    public static void bufferSetNotFoundGlyph(BufferT buffer, CodepointT notFound) {
        try {
            hb_buffer_set_not_found_glyph.invokeExact(buffer.handle(), notFound.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_replacement_codepoint = Interop.downcallHandle(
        "hb_buffer_set_replacement_codepoint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     * <p>
     * Default is {@code HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT}.
     */
    public static void bufferSetReplacementCodepoint(BufferT buffer, CodepointT replacement) {
        try {
            hb_buffer_set_replacement_codepoint.invokeExact(buffer.handle(), replacement.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_script = Interop.downcallHandle(
        "hb_buffer_set_script",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_buffer_set_script.invokeExact(buffer.handle(), script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_segment_properties = Interop.downcallHandle(
        "hb_buffer_set_segment_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the segment properties of the buffer, a shortcut for calling
     * hb_buffer_set_direction(), hb_buffer_set_script() and
     * hb_buffer_set_language() individually.
     */
    public static void bufferSetSegmentProperties(BufferT buffer, SegmentPropertiesT props) {
        try {
            hb_buffer_set_segment_properties.invokeExact(buffer.handle(), props.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_buffer_set_unicode_funcs = Interop.downcallHandle(
        "hb_buffer_set_unicode_funcs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the Unicode-functions structure of a buffer to
     * {@code unicode_funcs}.
     */
    public static void bufferSetUnicodeFuncs(BufferT buffer, UnicodeFuncsT unicodeFuncs) {
        try {
            hb_buffer_set_unicode_funcs.invokeExact(buffer.handle(), unicodeFuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_color_get_alpha = Interop.downcallHandle(
        "hb_color_get_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the alpha channel of the given {@code color}.
     */
    public static byte colorGetAlpha(ColorT color) {
        try {
            var RESULT = (byte) hb_color_get_alpha.invokeExact(color.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_color_get_blue = Interop.downcallHandle(
        "hb_color_get_blue",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the blue channel of the given {@code color}.
     */
    public static byte colorGetBlue(ColorT color) {
        try {
            var RESULT = (byte) hb_color_get_blue.invokeExact(color.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_color_get_green = Interop.downcallHandle(
        "hb_color_get_green",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the green channel of the given {@code color}.
     */
    public static byte colorGetGreen(ColorT color) {
        try {
            var RESULT = (byte) hb_color_get_green.invokeExact(color.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_color_get_red = Interop.downcallHandle(
        "hb_color_get_red",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the red channel of the given {@code color}.
     */
    public static byte colorGetRed(ColorT color) {
        try {
            var RESULT = (byte) hb_color_get_red.invokeExact(color.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_direction_from_string = Interop.downcallHandle(
        "hb_direction_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string to an {@link direction_t}.
     * <p>
     * Matching is loose and applies only to the first letter. For
     * examples, "LTR" and "left-to-right" will both return {@code HB_DIRECTION_LTR}.
     * <p>
     * Unmatched strings will return {@code HB_DIRECTION_INVALID}.
     */
    public static DirectionT directionFromString(byte[] str, int len) {
        try {
            var RESULT = (int) hb_direction_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len);
            return new DirectionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_direction_to_string = Interop.downcallHandle(
        "hb_direction_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link direction_t} to a string.
     */
    public static java.lang.String directionToString(DirectionT direction) {
        try {
            var RESULT = (MemoryAddress) hb_direction_to_string.invokeExact(direction.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_close_path = Interop.downcallHandle(
        "hb_draw_close_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Perform a "close-path" draw operation.
     */
    public static void drawClosePath(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st) {
        try {
            hb_draw_close_path.invokeExact(dfuncs.handle(), drawData, st.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_cubic_to = Interop.downcallHandle(
        "hb_draw_cubic_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "cubic-to" draw operation.
     */
    public static void drawCubicTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY) {
        try {
            hb_draw_cubic_to.invokeExact(dfuncs.handle(), drawData, st.handle(), control1X, control1Y, control2X, control2Y, toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_funcs_create = Interop.downcallHandle(
        "hb_draw_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new draw callbacks object.
     */
    public static DrawFuncsT drawFuncsCreate() {
        try {
            var RESULT = (MemoryAddress) hb_draw_funcs_create.invokeExact();
            return new DrawFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_funcs_destroy = Interop.downcallHandle(
        "hb_draw_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Deallocate the {@code dfuncs}.
     * Decreases the reference count on {@code dfuncs} by one. If the result is zero, then
     * {@code dfuncs} and all associated resources are freed. See hb_draw_funcs_reference().
     */
    public static void drawFuncsDestroy(DrawFuncsT dfuncs) {
        try {
            hb_draw_funcs_destroy.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_funcs_is_immutable = Interop.downcallHandle(
        "hb_draw_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code dfuncs} is immutable.
     */
    public static BoolT drawFuncsIsImmutable(DrawFuncsT dfuncs) {
        try {
            var RESULT = (int) hb_draw_funcs_is_immutable.invokeExact(dfuncs.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_funcs_make_immutable = Interop.downcallHandle(
        "hb_draw_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code dfuncs} object immutable.
     */
    public static void drawFuncsMakeImmutable(DrawFuncsT dfuncs) {
        try {
            hb_draw_funcs_make_immutable.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_funcs_reference = Interop.downcallHandle(
        "hb_draw_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code dfuncs} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_draw_funcs_destroy() is made.
     */
    public static DrawFuncsT drawFuncsReference(DrawFuncsT dfuncs) {
        try {
            var RESULT = (MemoryAddress) hb_draw_funcs_reference.invokeExact(dfuncs.handle());
            return new DrawFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_line_to = Interop.downcallHandle(
        "hb_draw_line_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "line-to" draw operation.
     */
    public static void drawLineTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        try {
            hb_draw_line_to.invokeExact(dfuncs.handle(), drawData, st.handle(), toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_move_to = Interop.downcallHandle(
        "hb_draw_move_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "move-to" draw operation.
     */
    public static void drawMoveTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float toX, float toY) {
        try {
            hb_draw_move_to.invokeExact(dfuncs.handle(), drawData, st.handle(), toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_draw_quadratic_to = Interop.downcallHandle(
        "hb_draw_quadratic_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "quadratic-to" draw operation.
     */
    public static void drawQuadraticTo(DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData, DrawStateT st, float controlX, float controlY, float toX, float toY) {
        try {
            hb_draw_quadratic_to.invokeExact(dfuncs.handle(), drawData, st.handle(), controlX, controlY, toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_builder_add_table = Interop.downcallHandle(
        "hb_face_builder_add_table",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Add table for {@code tag} with data provided by {@code blob} to the face.  {@code face} must
     * be created using hb_face_builder_create().
     */
    public static BoolT faceBuilderAddTable(FaceT face, TagT tag, BlobT blob) {
        try {
            var RESULT = (int) hb_face_builder_add_table.invokeExact(face.handle(), tag.getValue(), blob.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_builder_create = Interop.downcallHandle(
        "hb_face_builder_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link face_t} that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     */
    public static FaceT faceBuilderCreate() {
        try {
            var RESULT = (MemoryAddress) hb_face_builder_create.invokeExact();
            return new FaceT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_collect_unicodes = Interop.downcallHandle(
        "hb_face_collect_unicodes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all of the Unicode characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectUnicodes(FaceT face, SetT out) {
        try {
            hb_face_collect_unicodes.invokeExact(face.handle(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_collect_variation_selectors = Interop.downcallHandle(
        "hb_face_collect_variation_selectors",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all Unicode "Variation Selector" characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectVariationSelectors(FaceT face, SetT out) {
        try {
            hb_face_collect_variation_selectors.invokeExact(face.handle(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_collect_variation_unicodes = Interop.downcallHandle(
        "hb_face_collect_variation_unicodes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all Unicode characters for {@code variation_selector} covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static void faceCollectVariationUnicodes(FaceT face, CodepointT variationSelector, SetT out) {
        try {
            hb_face_collect_variation_unicodes.invokeExact(face.handle(), variationSelector.getValue(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_count = Interop.downcallHandle(
        "hb_face_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of faces in a blob.
     */
    public static int faceCount(BlobT blob) {
        try {
            var RESULT = (int) hb_face_count.invokeExact(blob.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_create = Interop.downcallHandle(
        "hb_face_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_face_create.invokeExact(blob.handle(), index);
            return new FaceT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_destroy = Interop.downcallHandle(
        "hb_face_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a face object. When the
     * reference count reaches zero, the face is destroyed,
     * freeing all memory.
     */
    public static void faceDestroy(FaceT face) {
        try {
            hb_face_destroy.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_empty = Interop.downcallHandle(
        "hb_face_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty face object.
     */
    public static FaceT faceGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_face_get_empty.invokeExact();
            return new FaceT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_glyph_count = Interop.downcallHandle(
        "hb_face_get_glyph_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph-count value of the specified face object.
     */
    public static int faceGetGlyphCount(FaceT face) {
        try {
            var RESULT = (int) hb_face_get_glyph_count.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_index = Interop.downcallHandle(
        "hb_face_get_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the face-index corresponding to the given face.
     * <p>
     * &lt;note>Note: face indices within a collection are zero-based.</note&gt;
     */
    public static int faceGetIndex(FaceT face) {
        try {
            var RESULT = (int) hb_face_get_index.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_table_tags = Interop.downcallHandle(
        "hb_face_get_table_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all table tags for a face, if possible. The list returned will
     * begin at the offset provided
     */
    public static int faceGetTableTags(FaceT face, int startOffset, PointerInteger tableCount, PointerInteger tableTags) {
        try {
            var RESULT = (int) hb_face_get_table_tags.invokeExact(face.handle(), startOffset, tableCount.handle(), tableTags.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_upem = Interop.downcallHandle(
        "hb_face_get_upem",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the units-per-em (upem) value of the specified face object.
     */
    public static int faceGetUpem(FaceT face) {
        try {
            var RESULT = (int) hb_face_get_upem.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_get_user_data = Interop.downcallHandle(
        "hb_face_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified face object.
     */
    public static java.lang.foreign.MemoryAddress faceGetUserData(FaceT face, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_face_get_user_data.invokeExact(face.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_is_immutable = Interop.downcallHandle(
        "hb_face_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the given face object is immutable.
     */
    public static BoolT faceIsImmutable(FaceT face) {
        try {
            var RESULT = (int) hb_face_is_immutable.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_make_immutable = Interop.downcallHandle(
        "hb_face_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the given face object immutable.
     */
    public static void faceMakeImmutable(FaceT face) {
        try {
            hb_face_make_immutable.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_reference = Interop.downcallHandle(
        "hb_face_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a face object.
     */
    public static FaceT faceReference(FaceT face) {
        try {
            var RESULT = (MemoryAddress) hb_face_reference.invokeExact(face.handle());
            return new FaceT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_reference_blob = Interop.downcallHandle(
        "hb_face_reference_blob",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     */
    public static BlobT faceReferenceBlob(FaceT face) {
        try {
            var RESULT = (MemoryAddress) hb_face_reference_blob.invokeExact(face.handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_reference_table = Interop.downcallHandle(
        "hb_face_reference_table",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches a reference to the specified table within
     * the specified face.
     */
    public static BlobT faceReferenceTable(FaceT face, TagT tag) {
        try {
            var RESULT = (MemoryAddress) hb_face_reference_table.invokeExact(face.handle(), tag.getValue());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_set_glyph_count = Interop.downcallHandle(
        "hb_face_set_glyph_count",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the glyph count for a face object to the specified value.
     */
    public static void faceSetGlyphCount(FaceT face, int glyphCount) {
        try {
            hb_face_set_glyph_count.invokeExact(face.handle(), glyphCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_set_index = Interop.downcallHandle(
        "hb_face_set_index",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Assigns the specified face-index to {@code face}. Fails if the
     * face is immutable.
     * <p>
     * &lt;note&gt;Note: changing the index has no effect on the face itself
     * This only changes the value returned by hb_face_get_index().&lt;/note&gt;
     */
    public static void faceSetIndex(FaceT face, int index) {
        try {
            hb_face_set_index.invokeExact(face.handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_face_set_upem = Interop.downcallHandle(
        "hb_face_set_upem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the units-per-em (upem) for a face object to the specified value.
     */
    public static void faceSetUpem(FaceT face, int upem) {
        try {
            hb_face_set_upem.invokeExact(face.handle(), upem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_feature_from_string = Interop.downcallHandle(
        "hb_feature_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_feature_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len, feature.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_feature_to_string = Interop.downcallHandle(
        "hb_feature_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a {@link feature_t} into a {@code null}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static void featureToString(FeatureT feature, PointerString buf, int size) {
        try {
            hb_feature_to_string.invokeExact(feature.handle(), buf.handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_add_glyph_origin_for_direction = Interop.downcallHandle(
        "hb_font_add_glyph_origin_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_font_add_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_create = Interop.downcallHandle(
        "hb_font_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_font_create.invokeExact(face.handle());
            return new FontT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_create_sub_font = Interop.downcallHandle(
        "hb_font_create_sub_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a sub-font font object from the specified {@code parent} font,
     * replicating the parent's properties.
     */
    public static FontT fontCreateSubFont(FontT parent) {
        try {
            var RESULT = (MemoryAddress) hb_font_create_sub_font.invokeExact(parent.handle());
            return new FontT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_destroy = Interop.downcallHandle(
        "hb_font_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on the given font object. When the
     * reference count reaches zero, the font is destroyed,
     * freeing all memory.
     */
    public static void fontDestroy(FontT font) {
        try {
            hb_font_destroy.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_create = Interop.downcallHandle(
        "hb_font_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link font_funcs_t} structure of font functions.
     */
    public static FontFuncsT fontFuncsCreate() {
        try {
            var RESULT = (MemoryAddress) hb_font_funcs_create.invokeExact();
            return new FontFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_destroy = Interop.downcallHandle(
        "hb_font_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a font-functions structure. When
     * the reference count reaches zero, the font-functions structure is
     * destroyed, freeing all memory.
     */
    public static void fontFuncsDestroy(FontFuncsT ffuncs) {
        try {
            hb_font_funcs_destroy.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_get_empty = Interop.downcallHandle(
        "hb_font_funcs_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches an empty font-functions structure.
     */
    public static FontFuncsT fontFuncsGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_font_funcs_get_empty.invokeExact();
            return new FontFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_get_user_data = Interop.downcallHandle(
        "hb_font_funcs_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static java.lang.foreign.MemoryAddress fontFuncsGetUserData(FontFuncsT ffuncs, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_font_funcs_get_user_data.invokeExact(ffuncs.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_is_immutable = Interop.downcallHandle(
        "hb_font_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a font-functions structure is immutable.
     */
    public static BoolT fontFuncsIsImmutable(FontFuncsT ffuncs) {
        try {
            var RESULT = (int) hb_font_funcs_is_immutable.invokeExact(ffuncs.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_make_immutable = Interop.downcallHandle(
        "hb_font_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a font-functions structure immutable.
     */
    public static void fontFuncsMakeImmutable(FontFuncsT ffuncs) {
        try {
            hb_font_funcs_make_immutable.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_funcs_reference = Interop.downcallHandle(
        "hb_font_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a font-functions structure.
     */
    public static FontFuncsT fontFuncsReference(FontFuncsT ffuncs) {
        try {
            var RESULT = (MemoryAddress) hb_font_funcs_reference.invokeExact(ffuncs.handle());
            return new FontFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_empty = Interop.downcallHandle(
        "hb_font_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the empty font object.
     */
    public static FontT fontGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_font_get_empty.invokeExact();
            return new FontT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_extents_for_direction = Interop.downcallHandle(
        "hb_font_get_extents_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the extents for a font in a text segment of the
     * specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetExtentsForDirection(FontT font, DirectionT direction, FontExtentsT extents) {
        try {
            hb_font_get_extents_for_direction.invokeExact(font.handle(), direction.getValue(), extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_face = Interop.downcallHandle(
        "hb_font_get_face",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the face associated with the specified font object.
     */
    public static FaceT fontGetFace(FontT font) {
        try {
            var RESULT = (MemoryAddress) hb_font_get_face.invokeExact(font.handle());
            return new FaceT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph = Interop.downcallHandle(
        "hb_font_get_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID for a Unicode code point in the specified
     * font, with an optional variation selector.
     * <p>
     * If {@code variation_selector} is 0, calls hb_font_get_nominal_glyph();
     * otherwise calls hb_font_get_variation_glyph().
     */
    public static BoolT fontGetGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        try {
            var RESULT = (int) hb_font_get_glyph.invokeExact(font.handle(), unicode.getValue(), variationSelector.getValue(), new PointerInteger(glyph.getValue()).handle());
            glyph.setValue(glyphPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_advance_for_direction = Interop.downcallHandle(
        "hb_font_get_glyph_advance_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_font_get_glyph_advance_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_advances_for_direction = Interop.downcallHandle(
        "hb_font_get_glyph_advances_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_font_get_glyph_advances_for_direction.invokeExact(font.handle(), direction.getValue(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
            firstGlyph.setValue(firstGlyphPOINTER.get());
            firstAdvance.setValue(firstAdvancePOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_contour_point = Interop.downcallHandle(
        "hb_font_get_glyph_contour_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (x,y) coordinates of a specified contour-point index
     * in the specified glyph, within the specified font.
     */
    public static BoolT fontGetGlyphContourPoint(FontT font, CodepointT glyph, int pointIndex, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        try {
            var RESULT = (int) hb_font_get_glyph_contour_point.invokeExact(font.handle(), glyph.getValue(), pointIndex, new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_contour_point_for_origin = Interop.downcallHandle(
        "hb_font_get_glyph_contour_point_for_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_font_get_glyph_contour_point_for_origin.invokeExact(font.handle(), glyph.getValue(), pointIndex, direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_extents = Interop.downcallHandle(
        "hb_font_get_glyph_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link glyph_extents_t} data for a glyph ID
     * in the specified font.
     */
    public static BoolT fontGetGlyphExtents(FontT font, CodepointT glyph, GlyphExtentsT extents) {
        try {
            var RESULT = (int) hb_font_get_glyph_extents.invokeExact(font.handle(), glyph.getValue(), extents.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_extents_for_origin = Interop.downcallHandle(
        "hb_font_get_glyph_extents_for_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link glyph_extents_t} data for a glyph ID
     * in the specified font, with respect to the origin in
     * a text segment in the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static BoolT fontGetGlyphExtentsForOrigin(FontT font, CodepointT glyph, DirectionT direction, GlyphExtentsT extents) {
        try {
            var RESULT = (int) hb_font_get_glyph_extents_for_origin.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), extents.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_from_name = Interop.downcallHandle(
        "hb_font_get_glyph_from_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID that corresponds to a name string in the specified {@code font}.
     * <p>
     * &lt;note>Note: @len == -1 means the name string is null-terminated.</note&gt;
     */
    public static BoolT fontGetGlyphFromName(FontT font, java.lang.String[] name, int len, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        try {
            var RESULT = (int) hb_font_get_glyph_from_name.invokeExact(font.handle(), Interop.allocateNativeArray(name).handle(), len, new PointerInteger(glyph.getValue()).handle());
            glyph.setValue(glyphPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_h_advance = Interop.downcallHandle(
        "hb_font_get_glyph_h_advance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for horizontal text segments.
     */
    public static PositionT fontGetGlyphHAdvance(FontT font, CodepointT glyph) {
        try {
            var RESULT = (int) hb_font_get_glyph_h_advance.invokeExact(font.handle(), glyph.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_h_advances = Interop.downcallHandle(
        "hb_font_get_glyph_h_advances",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for horizontal text segments.
     */
    public static void fontGetGlyphHAdvances(FontT font, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        PointerInteger firstAdvancePOINTER = new PointerInteger(firstAdvance.getValue());
        try {
            hb_font_get_glyph_h_advances.invokeExact(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
            firstGlyph.setValue(firstGlyphPOINTER.get());
            firstAdvance.setValue(firstAdvancePOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_h_kerning = Interop.downcallHandle(
        "hb_font_get_glyph_h_kerning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in
     * the specified font, for horizontal text segments.
     * <p>
     * &lt;note&gt;It handles legacy kerning only (as returned by the corresponding
     * {@link font_funcs_t} function).&lt;/note&gt;
     */
    public static PositionT fontGetGlyphHKerning(FontT font, CodepointT leftGlyph, CodepointT rightGlyph) {
        try {
            var RESULT = (int) hb_font_get_glyph_h_kerning.invokeExact(font.handle(), leftGlyph.getValue(), rightGlyph.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_h_origin = Interop.downcallHandle(
        "hb_font_get_glyph_h_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for horizontal text segments.
     */
    public static BoolT fontGetGlyphHOrigin(FontT font, CodepointT glyph, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        try {
            var RESULT = (int) hb_font_get_glyph_h_origin.invokeExact(font.handle(), glyph.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_kerning_for_direction = Interop.downcallHandle(
        "hb_font_get_glyph_kerning_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static void fontGetGlyphKerningForDirection(FontT font, CodepointT firstGlyph, CodepointT secondGlyph, DirectionT direction, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        try {
            hb_font_get_glyph_kerning_for_direction.invokeExact(font.handle(), firstGlyph.getValue(), secondGlyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_name = Interop.downcallHandle(
        "hb_font_get_glyph_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the glyph-name string for a glyph ID in the specified {@code font}.
     */
    public static BoolT fontGetGlyphName(FontT font, CodepointT glyph, PointerString name, int size) {
        try {
            var RESULT = (int) hb_font_get_glyph_name.invokeExact(font.handle(), glyph.getValue(), name.handle(), size);
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_origin_for_direction = Interop.downcallHandle(
        "hb_font_get_glyph_origin_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_font_get_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_shape = Interop.downcallHandle(
        "hb_font_get_glyph_shape",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph shape that corresponds to a glyph in the specified {@code font}.
     * The shape is returned by way of calls to the callsbacks of the {@code dfuncs}
     * objects, with {@code draw_data} passed to them.
     */
    public static void fontGetGlyphShape(FontT font, CodepointT glyph, DrawFuncsT dfuncs, java.lang.foreign.MemoryAddress drawData) {
        try {
            hb_font_get_glyph_shape.invokeExact(font.handle(), glyph.getValue(), dfuncs.handle(), drawData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_v_advance = Interop.downcallHandle(
        "hb_font_get_glyph_v_advance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for vertical text segments.
     */
    public static PositionT fontGetGlyphVAdvance(FontT font, CodepointT glyph) {
        try {
            var RESULT = (int) hb_font_get_glyph_v_advance.invokeExact(font.handle(), glyph.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_v_advances = Interop.downcallHandle(
        "hb_font_get_glyph_v_advances",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for vertical text segments.
     */
    public static void fontGetGlyphVAdvances(FontT font, int count, CodepointT firstGlyph, int glyphStride, PositionT firstAdvance, int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        PointerInteger firstAdvancePOINTER = new PointerInteger(firstAdvance.getValue());
        try {
            hb_font_get_glyph_v_advances.invokeExact(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, new PointerInteger(firstAdvance.getValue()).handle(), advanceStride);
            firstGlyph.setValue(firstGlyphPOINTER.get());
            firstAdvance.setValue(firstAdvancePOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_glyph_v_origin = Interop.downcallHandle(
        "hb_font_get_glyph_v_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for vertical text segments.
     */
    public static BoolT fontGetGlyphVOrigin(FontT font, CodepointT glyph, PositionT x, PositionT y) {
        PointerInteger xPOINTER = new PointerInteger(x.getValue());
        PointerInteger yPOINTER = new PointerInteger(y.getValue());
        try {
            var RESULT = (int) hb_font_get_glyph_v_origin.invokeExact(font.handle(), glyph.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_h_extents = Interop.downcallHandle(
        "hb_font_get_h_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the extents for a specified font, for horizontal
     * text segments.
     */
    public static BoolT fontGetHExtents(FontT font, FontExtentsT extents) {
        try {
            var RESULT = (int) hb_font_get_h_extents.invokeExact(font.handle(), extents.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_nominal_glyph = Interop.downcallHandle(
        "hb_font_get_nominal_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_font_get_nominal_glyph.invokeExact(font.handle(), unicode.getValue(), new PointerInteger(glyph.getValue()).handle());
            glyph.setValue(glyphPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_nominal_glyphs = Interop.downcallHandle(
        "hb_font_get_nominal_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
     * IDs must be returned in a {@link codepoint_t} output parameter.
     */
    public static int fontGetNominalGlyphs(FontT font, int count, CodepointT firstUnicode, int unicodeStride, CodepointT firstGlyph, int glyphStride) {
        PointerInteger firstUnicodePOINTER = new PointerInteger(firstUnicode.getValue());
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        try {
            var RESULT = (int) hb_font_get_nominal_glyphs.invokeExact(font.handle(), count, new PointerInteger(firstUnicode.getValue()).handle(), unicodeStride, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride);
            firstUnicode.setValue(firstUnicodePOINTER.get());
            firstGlyph.setValue(firstGlyphPOINTER.get());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_parent = Interop.downcallHandle(
        "hb_font_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the parent font of {@code font}.
     */
    public static FontT fontGetParent(FontT font) {
        try {
            var RESULT = (MemoryAddress) hb_font_get_parent.invokeExact(font.handle());
            return new FontT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_ppem = Interop.downcallHandle(
        "hb_font_get_ppem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the horizontal and vertical points-per-em (ppem) of a font.
     */
    public static void fontGetPpem(FontT font, PointerInteger xPpem, PointerInteger yPpem) {
        try {
            hb_font_get_ppem.invokeExact(font.handle(), xPpem.handle(), yPpem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_ptem = Interop.downcallHandle(
        "hb_font_get_ptem",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the "point size" of a font. Used in CoreText to
     * implement optical sizing.
     */
    public static float fontGetPtem(FontT font) {
        try {
            var RESULT = (float) hb_font_get_ptem.invokeExact(font.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_scale = Interop.downcallHandle(
        "hb_font_get_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the horizontal and vertical scale of a font.
     */
    public static void fontGetScale(FontT font, PointerInteger xScale, PointerInteger yScale) {
        try {
            hb_font_get_scale.invokeExact(font.handle(), xScale.handle(), yScale.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_synthetic_slant = Interop.downcallHandle(
        "hb_font_get_synthetic_slant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the "synthetic slant" of a font.
     */
    public static float fontGetSyntheticSlant(FontT font) {
        try {
            var RESULT = (float) hb_font_get_synthetic_slant.invokeExact(font.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_user_data = Interop.downcallHandle(
        "hb_font_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user-data object associated with the specified key,
     * attached to the specified font object.
     */
    public static java.lang.foreign.MemoryAddress fontGetUserData(FontT font, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_font_get_user_data.invokeExact(font.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_v_extents = Interop.downcallHandle(
        "hb_font_get_v_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the extents for a specified font, for vertical
     * text segments.
     */
    public static BoolT fontGetVExtents(FontT font, FontExtentsT extents) {
        try {
            var RESULT = (int) hb_font_get_v_extents.invokeExact(font.handle(), extents.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_var_coords_design = Interop.downcallHandle(
        "hb_font_get_var_coords_design",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_font_get_var_coords_design.invokeExact(font.handle(), length.handle());
            return new PointerFloat(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_var_coords_normalized = Interop.downcallHandle(
        "hb_font_get_var_coords_normalized",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_font_get_var_coords_normalized.invokeExact(font.handle(), length.handle());
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_get_variation_glyph = Interop.downcallHandle(
        "hb_font_get_variation_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID for a Unicode code point when followed by
     * by the specified variation-selector code point, in the specified
     * font.
     */
    public static BoolT fontGetVariationGlyph(FontT font, CodepointT unicode, CodepointT variationSelector, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        try {
            var RESULT = (int) hb_font_get_variation_glyph.invokeExact(font.handle(), unicode.getValue(), variationSelector.getValue(), new PointerInteger(glyph.getValue()).handle());
            glyph.setValue(glyphPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_glyph_from_string = Interop.downcallHandle(
        "hb_font_glyph_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID from {@code font} that matches the specified string.
     * Strings of the format {@code gidDDD} or {@code uniUUUU} are parsed automatically.
     * <p>
     * &lt;note>Note: @len == -1 means the string is null-terminated.</note&gt;
     */
    public static BoolT fontGlyphFromString(FontT font, byte[] s, int len, CodepointT glyph) {
        PointerInteger glyphPOINTER = new PointerInteger(glyph.getValue());
        try {
            var RESULT = (int) hb_font_glyph_from_string.invokeExact(font.handle(), Interop.allocateNativeArray(s).handle(), len, new PointerInteger(glyph.getValue()).handle());
            glyph.setValue(glyphPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_glyph_to_string = Interop.downcallHandle(
        "hb_font_glyph_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the name of the specified glyph ID in {@code font} and returns
     * it in string @s.
     * <p>
     * If the glyph ID has no name in {@code font}, a string of the form {@code gidDDD} is
     * generated, with {@code DDD} being the glyph ID.
     */
    public static void fontGlyphToString(FontT font, CodepointT glyph, PointerString s, int size) {
        try {
            hb_font_glyph_to_string.invokeExact(font.handle(), glyph.getValue(), s.handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_is_immutable = Interop.downcallHandle(
        "hb_font_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a font object is immutable.
     */
    public static BoolT fontIsImmutable(FontT font) {
        try {
            var RESULT = (int) hb_font_is_immutable.invokeExact(font.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_make_immutable = Interop.downcallHandle(
        "hb_font_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code font} immutable.
     */
    public static void fontMakeImmutable(FontT font) {
        try {
            hb_font_make_immutable.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_reference = Interop.downcallHandle(
        "hb_font_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on the given font object.
     */
    public static FontT fontReference(FontT font) {
        try {
            var RESULT = (MemoryAddress) hb_font_reference.invokeExact(font.handle());
            return new FontT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_face = Interop.downcallHandle(
        "hb_font_set_face",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code face} as the font-face value of {@code font}.
     */
    public static void fontSetFace(FontT font, FaceT face) {
        try {
            hb_font_set_face.invokeExact(font.handle(), face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_parent = Interop.downcallHandle(
        "hb_font_set_parent",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the parent font of {@code font}.
     */
    public static void fontSetParent(FontT font, FontT parent) {
        try {
            hb_font_set_parent.invokeExact(font.handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_ppem = Interop.downcallHandle(
        "hb_font_set_ppem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the horizontal and vertical pixels-per-em (ppem) of a font.
     */
    public static void fontSetPpem(FontT font, int xPpem, int yPpem) {
        try {
            hb_font_set_ppem.invokeExact(font.handle(), xPpem, yPpem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_ptem = Interop.downcallHandle(
        "hb_font_set_ptem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the "point size" of a font. Set to zero to unset.
     * Used in CoreText to implement optical sizing.
     * <p>
     * &lt;note>Note: There are 72 points in an inch.</note&gt;
     */
    public static void fontSetPtem(FontT font, float ptem) {
        try {
            hb_font_set_ptem.invokeExact(font.handle(), ptem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_scale = Interop.downcallHandle(
        "hb_font_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the horizontal and vertical scale of a font.
     */
    public static void fontSetScale(FontT font, int xScale, int yScale) {
        try {
            hb_font_set_scale.invokeExact(font.handle(), xScale, yScale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_synthetic_slant = Interop.downcallHandle(
        "hb_font_set_synthetic_slant",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
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
        try {
            hb_font_set_synthetic_slant.invokeExact(font.handle(), slant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_var_coords_design = Interop.downcallHandle(
        "hb_font_set_var_coords_design",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Applies a list of variation coordinates (in design-space units)
     * to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code coords} will be effectively set to their
     * default values.
     */
    public static void fontSetVarCoordsDesign(FontT font, float[] coords, int coordsLength) {
        try {
            hb_font_set_var_coords_design.invokeExact(font.handle(), Interop.allocateNativeArray(coords).handle(), coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_var_coords_normalized = Interop.downcallHandle(
        "hb_font_set_var_coords_normalized",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            hb_font_set_var_coords_normalized.invokeExact(font.handle(), Interop.allocateNativeArray(coords).handle(), coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_var_named_instance = Interop.downcallHandle(
        "hb_font_set_var_named_instance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets design coords of a font from a named instance index.
     */
    public static void fontSetVarNamedInstance(FontT font, int instanceIndex) {
        try {
            hb_font_set_var_named_instance.invokeExact(font.handle(), instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_set_variations = Interop.downcallHandle(
        "hb_font_set_variations",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Applies a list of font-variation settings to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code variations} will be effectively set to their
     * default values.
     */
    public static void fontSetVariations(FontT font, VariationT[] variations, int variationsLength) {
        try {
            hb_font_set_variations.invokeExact(font.handle(), Interop.allocateNativeArray(variations).handle(), variationsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_font_subtract_glyph_origin_for_direction = Interop.downcallHandle(
        "hb_font_subtract_glyph_origin_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_font_subtract_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), new PointerInteger(x.getValue()).handle(), new PointerInteger(y.getValue()).handle());
            x.setValue(xPOINTER.get());
            y.setValue(yPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ft_font_changed = Interop.downcallHandle(
        "hb_ft_font_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Refreshes the state of {@code font} when the underlying FT_Face has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the FT_Face.
     */
    public static void ftFontChanged(FontT font) {
        try {
            hb_ft_font_changed.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ft_font_get_load_flags = Interop.downcallHandle(
        "hb_ft_font_get_load_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the FT_Load_Glyph load flags of the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static int ftFontGetLoadFlags(FontT font) {
        try {
            var RESULT = (int) hb_ft_font_get_load_flags.invokeExact(font.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ft_font_set_funcs = Interop.downcallHandle(
        "hb_ft_font_set_funcs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_ft_font_set_funcs.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ft_font_set_load_flags = Interop.downcallHandle(
        "hb_ft_font_set_load_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the FT_Load_Glyph load flags for the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static void ftFontSetLoadFlags(FontT font, int loadFlags) {
        try {
            hb_ft_font_set_load_flags.invokeExact(font.handle(), loadFlags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ft_font_unlock_face = Interop.downcallHandle(
        "hb_ft_font_unlock_face",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases an FT_Face previously obtained with hb_ft_font_lock_face().
     */
    public static void ftFontUnlockFace(FontT font) {
        try {
            hb_ft_font_unlock_face.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_glib_blob_create = Interop.downcallHandle(
        "hb_glib_blob_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates an {@link blob_t} blob from the specified
     * GBytes data structure.
     */
    public static BlobT glibBlobCreate(org.gtk.glib.Bytes gbytes) {
        try {
            var RESULT = (MemoryAddress) hb_glib_blob_create.invokeExact(gbytes.handle());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_glib_get_unicode_funcs = Interop.downcallHandle(
        "hb_glib_get_unicode_funcs",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     */
    public static UnicodeFuncsT glibGetUnicodeFuncs() {
        try {
            var RESULT = (MemoryAddress) hb_glib_get_unicode_funcs.invokeExact();
            return new UnicodeFuncsT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_glib_script_from_script = Interop.downcallHandle(
        "hb_glib_script_from_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the GUnicodeScript identifier that corresponds to the
     * specified {@link script_t} script.
     */
    public static org.gtk.glib.UnicodeScript glibScriptFromScript(ScriptT script) {
        try {
            var RESULT = (int) hb_glib_script_from_script.invokeExact(script.getValue());
            return new org.gtk.glib.UnicodeScript(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_glib_script_to_script = Interop.downcallHandle(
        "hb_glib_script_to_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@link script_t} script that corresponds to the
     * specified GUnicodeScript identifier.
     */
    public static ScriptT glibScriptToScript(org.gtk.glib.UnicodeScript script) {
        try {
            var RESULT = (int) hb_glib_script_to_script.invokeExact(script.getValue());
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_glyph_info_get_glyph_flags = Interop.downcallHandle(
        "hb_glyph_info_get_glyph_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns glyph flags encoded within a {@link glyph_info_t}.
     */
    public static GlyphFlagsT glyphInfoGetGlyphFlags(GlyphInfoT info) {
        try {
            var RESULT = (int) hb_glyph_info_get_glyph_flags.invokeExact(info.handle());
            return new GlyphFlagsT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_language_from_string = Interop.downcallHandle(
        "hb_language_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts {@code str} representing a BCP 47 language tag to the corresponding
     * {@link language_t}.
     */
    public static LanguageT languageFromString(byte[] str, int len) {
        try {
            var RESULT = (MemoryAddress) hb_language_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len);
            return new LanguageT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_language_get_default = Interop.downcallHandle(
        "hb_language_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) hb_language_get_default.invokeExact();
            return new LanguageT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_language_to_string = Interop.downcallHandle(
        "hb_language_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link language_t} to a string.
     */
    public static java.lang.String languageToString(LanguageT language) {
        try {
            var RESULT = (MemoryAddress) hb_language_to_string.invokeExact(language.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_allocation_successful = Interop.downcallHandle(
        "hb_map_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static BoolT mapAllocationSuccessful(MapT map) {
        try {
            var RESULT = (int) hb_map_allocation_successful.invokeExact(map.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_clear = Interop.downcallHandle(
        "hb_map_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears out the contents of {@code map}.
     */
    public static void mapClear(MapT map) {
        try {
            hb_map_clear.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_create = Interop.downcallHandle(
        "hb_map_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new, initially empty map.
     */
    public static MapT mapCreate() {
        try {
            var RESULT = (MemoryAddress) hb_map_create.invokeExact();
            return new MapT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_del = Interop.downcallHandle(
        "hb_map_del",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes {@code key} and its stored value from {@code map}.
     */
    public static void mapDel(MapT map, CodepointT key) {
        try {
            hb_map_del.invokeExact(map.handle(), key.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_destroy = Interop.downcallHandle(
        "hb_map_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a map. When
     * the reference count reaches zero, the map is
     * destroyed, freeing all memory.
     */
    public static void mapDestroy(MapT map) {
        try {
            hb_map_destroy.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_get = Interop.downcallHandle(
        "hb_map_get",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the value stored for {@code key} in {@code map}.
     */
    public static CodepointT mapGet(MapT map, CodepointT key) {
        try {
            var RESULT = (int) hb_map_get.invokeExact(map.handle(), key.getValue());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_get_empty = Interop.downcallHandle(
        "hb_map_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty {@link map_t}.
     */
    public static MapT mapGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_map_get_empty.invokeExact();
            return new MapT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_get_population = Interop.downcallHandle(
        "hb_map_get_population",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of key-value pairs in the map.
     */
    public static int mapGetPopulation(MapT map) {
        try {
            var RESULT = (int) hb_map_get_population.invokeExact(map.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_get_user_data = Interop.downcallHandle(
        "hb_map_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified map.
     */
    public static java.lang.foreign.MemoryAddress mapGetUserData(MapT map, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_map_get_user_data.invokeExact(map.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_has = Interop.downcallHandle(
        "hb_map_has",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether {@code key} is an element of {@code map}.
     */
    public static BoolT mapHas(MapT map, CodepointT key) {
        try {
            var RESULT = (int) hb_map_has.invokeExact(map.handle(), key.getValue());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_is_empty = Interop.downcallHandle(
        "hb_map_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code map} is empty (contains no elements).
     */
    public static BoolT mapIsEmpty(MapT map) {
        try {
            var RESULT = (int) hb_map_is_empty.invokeExact(map.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_reference = Interop.downcallHandle(
        "hb_map_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a map.
     */
    public static MapT mapReference(MapT map) {
        try {
            var RESULT = (MemoryAddress) hb_map_reference.invokeExact(map.handle());
            return new MapT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_map_set = Interop.downcallHandle(
        "hb_map_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Stores {@code key}:{@code value} in the map.
     */
    public static void mapSet(MapT map, CodepointT key, CodepointT value) {
        try {
            hb_map_set.invokeExact(map.handle(), key.getValue(), value.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_glyph_get_layers = Interop.downcallHandle(
        "hb_ot_color_glyph_get_layers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all color layers for the specified glyph index in the specified
     * face. The list returned will begin at the offset provided.
     */
    public static int otColorGlyphGetLayers(FaceT face, CodepointT glyph, int startOffset, PointerInteger layerCount, PointerProxy<OtColorLayerT> layers) {
        try {
            var RESULT = (int) hb_ot_color_glyph_get_layers.invokeExact(face.handle(), glyph.getValue(), startOffset, layerCount.handle(), layers.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_glyph_reference_png = Interop.downcallHandle(
        "hb_ot_color_glyph_reference_png",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the PNG image for a glyph. This function takes a font object, not a face object,
     * as input. To get an optimally sized PNG blob, the UPEM value must be set on the {@code font}
     * object. If UPEM is unset, the blob returned will be the largest PNG available.
     * <p>
     * If the glyph has no PNG image, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferencePng(FontT font, CodepointT glyph) {
        try {
            var RESULT = (MemoryAddress) hb_ot_color_glyph_reference_png.invokeExact(font.handle(), glyph.getValue());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_glyph_reference_svg = Interop.downcallHandle(
        "hb_ot_color_glyph_reference_svg",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the SVG document for a glyph. The blob may be either plain text or gzip-encoded.
     * <p>
     * If the glyph has no SVG document, the singleton empty blob is returned.
     */
    public static BlobT otColorGlyphReferenceSvg(FaceT face, CodepointT glyph) {
        try {
            var RESULT = (MemoryAddress) hb_ot_color_glyph_reference_svg.invokeExact(face.handle(), glyph.getValue());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_has_layers = Interop.downcallHandle(
        "hb_ot_color_has_layers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any {@code COLR} color layers.
     */
    public static BoolT otColorHasLayers(FaceT face) {
        try {
            var RESULT = (int) hb_ot_color_has_layers.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_has_palettes = Interop.downcallHandle(
        "hb_ot_color_has_palettes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes a {@code CPAL} color-palette table.
     */
    public static BoolT otColorHasPalettes(FaceT face) {
        try {
            var RESULT = (int) hb_ot_color_has_palettes.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_has_png = Interop.downcallHandle(
        "hb_ot_color_has_png",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has PNG glyph images (either in {@code CBDT} or {@code sbix} tables).
     */
    public static BoolT otColorHasPng(FaceT face) {
        try {
            var RESULT = (int) hb_ot_color_has_png.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_has_svg = Interop.downcallHandle(
        "hb_ot_color_has_svg",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any {@code SVG} glyph images.
     */
    public static BoolT otColorHasSvg(FaceT face) {
        try {
            var RESULT = (int) hb_ot_color_has_svg.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_palette_color_get_name_id = Interop.downcallHandle(
        "hb_ot_color_palette_color_get_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the specified color in a face's {@code CPAL} color palette.
     * <p>
     * Display names can be generic (e.g., "Background") or specific
     * (e.g., "Eye color").
     */
    public static OtNameIdT otColorPaletteColorGetNameId(FaceT face, int colorIndex) {
        try {
            var RESULT = (int) hb_ot_color_palette_color_get_name_id.invokeExact(face.handle(), colorIndex);
            return new OtNameIdT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_palette_get_colors = Interop.downcallHandle(
        "hb_ot_color_palette_get_colors",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the colors in a color palette.
     * <p>
     * After calling this function, {@code colors} will be filled with the palette
     * colors. If {@code colors} is NULL, the function will just return the number
     * of total colors without storing any actual colors; this can be used
     * for allocating a buffer of suitable size before calling
     * hb_ot_color_palette_get_colors() a second time.
     */
    public static int otColorPaletteGetColors(FaceT face, int paletteIndex, int startOffset, PointerInteger colorCount, PointerInteger colors) {
        try {
            var RESULT = (int) hb_ot_color_palette_get_colors.invokeExact(face.handle(), paletteIndex, startOffset, colorCount.handle(), colors.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_palette_get_count = Interop.downcallHandle(
        "hb_ot_color_palette_get_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of color palettes in a face.
     */
    public static int otColorPaletteGetCount(FaceT face) {
        try {
            var RESULT = (int) hb_ot_color_palette_get_count.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_palette_get_flags = Interop.downcallHandle(
        "hb_ot_color_palette_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the flags defined for a color palette.
     */
    public static OtColorPaletteFlagsT otColorPaletteGetFlags(FaceT face, int paletteIndex) {
        try {
            var RESULT = (int) hb_ot_color_palette_get_flags.invokeExact(face.handle(), paletteIndex);
            return new OtColorPaletteFlagsT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_color_palette_get_name_id = Interop.downcallHandle(
        "hb_ot_color_palette_get_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * a {@code CPAL} color palette.
     * <p>
     * Palette display names can be generic (e.g., "Default") or provide
     * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
     */
    public static OtNameIdT otColorPaletteGetNameId(FaceT face, int paletteIndex) {
        try {
            var RESULT = (int) hb_ot_color_palette_get_name_id.invokeExact(face.handle(), paletteIndex);
            return new OtNameIdT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_font_set_funcs = Interop.downcallHandle(
        "hb_ot_font_set_funcs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the font functions to use when working with {@code font}.
     */
    public static void otFontSetFuncs(FontT font) {
        try {
            hb_ot_font_set_funcs.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_collect_features = Interop.downcallHandle(
        "hb_ot_layout_collect_features",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_ot_layout_collect_features.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), featureIndexes.handle());
            scripts.setValue(scriptsPOINTER.get());
            languages.setValue(languagesPOINTER.get());
            features.setValue(featuresPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_collect_lookups = Interop.downcallHandle(
        "hb_ot_layout_collect_lookups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_ot_layout_collect_lookups.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), lookupIndexes.handle());
            scripts.setValue(scriptsPOINTER.get());
            languages.setValue(languagesPOINTER.get());
            features.setValue(featuresPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_feature_get_characters = Interop.downcallHandle(
        "hb_ot_layout_feature_get_characters",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the characters defined as having a variant under the specified
     * "Character Variant" ("cvXX") feature tag.
     */
    public static int otLayoutFeatureGetCharacters(FaceT face, TagT tableTag, int featureIndex, int startOffset, PointerInteger charCount, PointerInteger characters) {
        try {
            var RESULT = (int) hb_ot_layout_feature_get_characters.invokeExact(face.handle(), tableTag.getValue(), featureIndex, startOffset, charCount.handle(), characters.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_feature_get_lookups = Interop.downcallHandle(
        "hb_ot_layout_feature_get_lookups",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table. The list returned will
     * begin at the offset provided.
     */
    public static int otLayoutFeatureGetLookups(FaceT face, TagT tableTag, int featureIndex, int startOffset, PointerInteger lookupCount, PointerInteger lookupIndexes) {
        try {
            var RESULT = (int) hb_ot_layout_feature_get_lookups.invokeExact(face.handle(), tableTag.getValue(), featureIndex, startOffset, lookupCount.handle(), lookupIndexes.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_feature_get_name_ids = Interop.downcallHandle(
        "hb_ot_layout_feature_get_name_ids",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches name indices from feature parameters for "Stylistic Set" ('ssXX') or
     * "Character Variant" ('cvXX') features.
     */
    public static BoolT otLayoutFeatureGetNameIds(FaceT face, TagT tableTag, int featureIndex, OtNameIdT labelId, OtNameIdT tooltipId, OtNameIdT sampleId, PointerInteger numNamedParameters, OtNameIdT firstParamId) {
        PointerInteger labelIdPOINTER = new PointerInteger(labelId.getValue());
        PointerInteger tooltipIdPOINTER = new PointerInteger(tooltipId.getValue());
        PointerInteger sampleIdPOINTER = new PointerInteger(sampleId.getValue());
        PointerInteger firstParamIdPOINTER = new PointerInteger(firstParamId.getValue());
        try {
            var RESULT = (int) hb_ot_layout_feature_get_name_ids.invokeExact(face.handle(), tableTag.getValue(), featureIndex, new PointerInteger(labelId.getValue()).handle(), new PointerInteger(tooltipId.getValue()).handle(), new PointerInteger(sampleId.getValue()).handle(), numNamedParameters.handle(), new PointerInteger(firstParamId.getValue()).handle());
            labelId.setValue(labelIdPOINTER.get());
            tooltipId.setValue(tooltipIdPOINTER.get());
            sampleId.setValue(sampleIdPOINTER.get());
            firstParamId.setValue(firstParamIdPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_feature_with_variations_get_lookups = Interop.downcallHandle(
        "hb_ot_layout_feature_with_variations_get_lookups",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table, enabled at the specified
     * variations index. The list returned will begin at the offset provided.
     */
    public static int otLayoutFeatureWithVariationsGetLookups(FaceT face, TagT tableTag, int featureIndex, int variationsIndex, int startOffset, PointerInteger lookupCount, PointerInteger lookupIndexes) {
        try {
            var RESULT = (int) hb_ot_layout_feature_with_variations_get_lookups.invokeExact(face.handle(), tableTag.getValue(), featureIndex, variationsIndex, startOffset, lookupCount.handle(), lookupIndexes.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_attach_points = Interop.downcallHandle(
        "hb_ot_layout_get_attach_points",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all attachment points for the specified glyph in the GDEF
     * table of the face. The list returned will begin at the offset provided.
     * <p>
     * Useful if the client program wishes to cache the list.
     */
    public static int otLayoutGetAttachPoints(FaceT face, CodepointT glyph, int startOffset, PointerInteger pointCount, PointerInteger pointArray) {
        try {
            var RESULT = (int) hb_ot_layout_get_attach_points.invokeExact(face.handle(), glyph.getValue(), startOffset, pointCount.handle(), pointArray.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_baseline = Interop.downcallHandle(
        "hb_ot_layout_get_baseline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a baseline value from the face.
     */
    public static BoolT otLayoutGetBaseline(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        PointerInteger coordPOINTER = new PointerInteger(coord.getValue());
        try {
            var RESULT = (int) hb_ot_layout_get_baseline.invokeExact(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), new PointerInteger(coord.getValue()).handle());
            coord.setValue(coordPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_baseline_with_fallback = Interop.downcallHandle(
        "hb_ot_layout_get_baseline_with_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a baseline value from the face, and synthesizes
     * it if the font does not have it.
     */
    public static void otLayoutGetBaselineWithFallback(FontT font, OtLayoutBaselineTagT baselineTag, DirectionT direction, TagT scriptTag, TagT languageTag, PositionT coord) {
        PointerInteger coordPOINTER = new PointerInteger(coord.getValue());
        try {
            hb_ot_layout_get_baseline_with_fallback.invokeExact(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), new PointerInteger(coord.getValue()).handle());
            coord.setValue(coordPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_glyph_class = Interop.downcallHandle(
        "hb_ot_layout_get_glyph_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the GDEF class of the requested glyph in the specified face.
     */
    public static OtLayoutGlyphClassT otLayoutGetGlyphClass(FaceT face, CodepointT glyph) {
        try {
            var RESULT = (int) hb_ot_layout_get_glyph_class.invokeExact(face.handle(), glyph.getValue());
            return new OtLayoutGlyphClassT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_glyphs_in_class = Interop.downcallHandle(
        "hb_ot_layout_get_glyphs_in_class",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     */
    public static void otLayoutGetGlyphsInClass(FaceT face, OtLayoutGlyphClassT klass, SetT glyphs) {
        try {
            hb_ot_layout_get_glyphs_in_class.invokeExact(face.handle(), klass.getValue(), glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_horizontal_baseline_tag_for_script = Interop.downcallHandle(
        "hb_ot_layout_get_horizontal_baseline_tag_for_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the dominant horizontal baseline tag used by {@code script}.
     */
    public static OtLayoutBaselineTagT otLayoutGetHorizontalBaselineTagForScript(ScriptT script) {
        try {
            var RESULT = (int) hb_ot_layout_get_horizontal_baseline_tag_for_script.invokeExact(script.getValue());
            return new OtLayoutBaselineTagT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_ligature_carets = Interop.downcallHandle(
        "hb_ot_layout_get_ligature_carets",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static int otLayoutGetLigatureCarets(FontT font, DirectionT direction, CodepointT glyph, int startOffset, PointerInteger caretCount, PointerInteger caretArray) {
        try {
            var RESULT = (int) hb_ot_layout_get_ligature_carets.invokeExact(font.handle(), direction.getValue(), glyph.getValue(), startOffset, caretCount.handle(), caretArray.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_get_size_params = Interop.downcallHandle(
        "hb_ot_layout_get_size_params",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_ot_layout_get_size_params.invokeExact(face.handle(), designSize.handle(), subfamilyId.handle(), new PointerInteger(subfamilyNameId.getValue()).handle(), rangeStart.handle(), rangeEnd.handle());
            subfamilyNameId.setValue(subfamilyNameIdPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_has_glyph_classes = Interop.downcallHandle(
        "hb_ot_layout_has_glyph_classes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has any glyph classes defined in its GDEF table.
     */
    public static BoolT otLayoutHasGlyphClasses(FaceT face) {
        try {
            var RESULT = (int) hb_ot_layout_has_glyph_classes.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_has_positioning = Interop.downcallHandle(
        "hb_ot_layout_has_positioning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any GPOS positioning.
     */
    public static BoolT otLayoutHasPositioning(FaceT face) {
        try {
            var RESULT = (int) hb_ot_layout_has_positioning.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_has_substitution = Interop.downcallHandle(
        "hb_ot_layout_has_substitution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any GSUB substitutions.
     */
    public static BoolT otLayoutHasSubstitution(FaceT face) {
        try {
            var RESULT = (int) hb_ot_layout_has_substitution.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_language_find_feature = Interop.downcallHandle(
        "hb_ot_layout_language_find_feature",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index of a given feature tag in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageFindFeature(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, TagT featureTag, PointerInteger featureIndex) {
        try {
            var RESULT = (int) hb_ot_layout_language_find_feature.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureTag.getValue(), featureIndex.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_language_get_feature_indexes = Interop.downcallHandle(
        "hb_ot_layout_language_get_feature_indexes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureIndexes(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, int startOffset, PointerInteger featureCount, PointerInteger featureIndexes) {
        try {
            var RESULT = (int) hb_ot_layout_language_get_feature_indexes.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, featureCount.handle(), featureIndexes.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_language_get_feature_tags = Interop.downcallHandle(
        "hb_ot_layout_language_get_feature_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureTags(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, int startOffset, PointerInteger featureCount, PointerInteger featureTags) {
        try {
            var RESULT = (int) hb_ot_layout_language_get_feature_tags.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, featureCount.handle(), featureTags.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_language_get_required_feature = Interop.downcallHandle(
        "hb_ot_layout_language_get_required_feature",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the tag of a requested feature index in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageGetRequiredFeature(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, PointerInteger featureIndex, TagT featureTag) {
        PointerInteger featureTagPOINTER = new PointerInteger(featureTag.getValue());
        try {
            var RESULT = (int) hb_ot_layout_language_get_required_feature.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureIndex.handle(), new PointerInteger(featureTag.getValue()).handle());
            featureTag.setValue(featureTagPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_language_get_required_feature_index = Interop.downcallHandle(
        "hb_ot_layout_language_get_required_feature_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index of a requested feature in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static BoolT otLayoutLanguageGetRequiredFeatureIndex(FaceT face, TagT tableTag, int scriptIndex, int languageIndex, PointerInteger featureIndex) {
        try {
            var RESULT = (int) hb_ot_layout_language_get_required_feature_index.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureIndex.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_lookup_collect_glyphs = Interop.downcallHandle(
        "hb_ot_layout_lookup_collect_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all glyphs affected by the specified lookup in the
     * specified face's GSUB table or GPOS table.
     */
    public static void otLayoutLookupCollectGlyphs(FaceT face, TagT tableTag, int lookupIndex, SetT glyphsBefore, SetT glyphsInput, SetT glyphsAfter, SetT glyphsOutput) {
        try {
            hb_ot_layout_lookup_collect_glyphs.invokeExact(face.handle(), tableTag.getValue(), lookupIndex, glyphsBefore.handle(), glyphsInput.handle(), glyphsAfter.handle(), glyphsOutput.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_lookup_get_glyph_alternates = Interop.downcallHandle(
        "hb_ot_layout_lookup_get_glyph_alternates",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches alternates of a glyph from a given GSUB lookup index.
     */
    public static int otLayoutLookupGetGlyphAlternates(FaceT face, int lookupIndex, CodepointT glyph, int startOffset, PointerInteger alternateCount, PointerInteger alternateGlyphs) {
        try {
            var RESULT = (int) hb_ot_layout_lookup_get_glyph_alternates.invokeExact(face.handle(), lookupIndex, glyph.getValue(), startOffset, alternateCount.handle(), alternateGlyphs.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_lookup_substitute_closure = Interop.downcallHandle(
        "hb_ot_layout_lookup_substitute_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the transitive closure of glyphs needed for a
     * specified lookup.
     */
    public static void otLayoutLookupSubstituteClosure(FaceT face, int lookupIndex, SetT glyphs) {
        try {
            hb_ot_layout_lookup_substitute_closure.invokeExact(face.handle(), lookupIndex, glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_lookup_would_substitute = Interop.downcallHandle(
        "hb_ot_layout_lookup_would_substitute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether a specified lookup in the specified face would
     * trigger a substitution on the given glyph sequence.
     */
    public static BoolT otLayoutLookupWouldSubstitute(FaceT face, int lookupIndex, CodepointT glyphs, int glyphsLength, BoolT zeroContext) {
        PointerInteger glyphsPOINTER = new PointerInteger(glyphs.getValue());
        try {
            var RESULT = (int) hb_ot_layout_lookup_would_substitute.invokeExact(face.handle(), lookupIndex, new PointerInteger(glyphs.getValue()).handle(), glyphsLength, zeroContext.getValue());
            glyphs.setValue(glyphsPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_lookups_substitute_closure = Interop.downcallHandle(
        "hb_ot_layout_lookups_substitute_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the transitive closure of glyphs needed for all of the
     * provided lookups.
     */
    public static void otLayoutLookupsSubstituteClosure(FaceT face, SetT lookups, SetT glyphs) {
        try {
            hb_ot_layout_lookups_substitute_closure.invokeExact(face.handle(), lookups.handle(), glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_script_get_language_tags = Interop.downcallHandle(
        "hb_ot_layout_script_get_language_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of language tags in the given face's GSUB or GPOS table, underneath
     * the specified script index. The list returned will begin at the offset provided.
     */
    public static int otLayoutScriptGetLanguageTags(FaceT face, TagT tableTag, int scriptIndex, int startOffset, PointerInteger languageCount, PointerInteger languageTags) {
        try {
            var RESULT = (int) hb_ot_layout_script_get_language_tags.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, startOffset, languageCount.handle(), languageTags.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_script_select_language = Interop.downcallHandle(
        "hb_ot_layout_script_select_language",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_ot_layout_script_select_language.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageCount, new PointerInteger(languageTags.getValue()).handle(), languageIndex.handle());
            languageTags.setValue(languageTagsPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_choose_script = Interop.downcallHandle(
        "hb_ot_layout_table_choose_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deprecated since 2.0.0
     */
    public static BoolT otLayoutTableChooseScript(FaceT face, TagT tableTag, TagT scriptTags, PointerInteger scriptIndex, TagT chosenScript) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        PointerInteger chosenScriptPOINTER = new PointerInteger(chosenScript.getValue());
        try {
            var RESULT = (int) hb_ot_layout_table_choose_script.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scriptTags.getValue()).handle(), scriptIndex.handle(), new PointerInteger(chosenScript.getValue()).handle());
            scriptTags.setValue(scriptTagsPOINTER.get());
            chosenScript.setValue(chosenScriptPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_find_feature_variations = Interop.downcallHandle(
        "hb_ot_layout_table_find_feature_variations",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of feature variations in the specified face's GSUB table
     * or GPOS table, at the specified variation coordinates.
     */
    public static BoolT otLayoutTableFindFeatureVariations(FaceT face, TagT tableTag, PointerInteger coords, int numCoords, PointerInteger variationsIndex) {
        try {
            var RESULT = (int) hb_ot_layout_table_find_feature_variations.invokeExact(face.handle(), tableTag.getValue(), coords.handle(), numCoords, variationsIndex.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_find_script = Interop.downcallHandle(
        "hb_ot_layout_table_find_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index if a given script tag in the specified face's GSUB table
     * or GPOS table.
     */
    public static BoolT otLayoutTableFindScript(FaceT face, TagT tableTag, TagT scriptTag, PointerInteger scriptIndex) {
        try {
            var RESULT = (int) hb_ot_layout_table_find_script.invokeExact(face.handle(), tableTag.getValue(), scriptTag.getValue(), scriptIndex.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_get_feature_tags = Interop.downcallHandle(
        "hb_ot_layout_table_get_feature_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all feature tags in the given face's GSUB or GPOS table.
     */
    public static int otLayoutTableGetFeatureTags(FaceT face, TagT tableTag, int startOffset, PointerInteger featureCount, PointerInteger featureTags) {
        try {
            var RESULT = (int) hb_ot_layout_table_get_feature_tags.invokeExact(face.handle(), tableTag.getValue(), startOffset, featureCount.handle(), featureTags.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_get_lookup_count = Interop.downcallHandle(
        "hb_ot_layout_table_get_lookup_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the total number of lookups enumerated in the specified
     * face's GSUB table or GPOS table.
     */
    public static int otLayoutTableGetLookupCount(FaceT face, TagT tableTag) {
        try {
            var RESULT = (int) hb_ot_layout_table_get_lookup_count.invokeExact(face.handle(), tableTag.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_get_script_tags = Interop.downcallHandle(
        "hb_ot_layout_table_get_script_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all scripts enumerated in the specified face's GSUB table
     * or GPOS table. The list returned will begin at the offset provided.
     */
    public static int otLayoutTableGetScriptTags(FaceT face, TagT tableTag, int startOffset, PointerInteger scriptCount, PointerInteger scriptTags) {
        try {
            var RESULT = (int) hb_ot_layout_table_get_script_tags.invokeExact(face.handle(), tableTag.getValue(), startOffset, scriptCount.handle(), scriptTags.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_layout_table_select_script = Interop.downcallHandle(
        "hb_ot_layout_table_select_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_ot_layout_table_select_script.invokeExact(face.handle(), tableTag.getValue(), scriptCount, new PointerInteger(scriptTags.getValue()).handle(), scriptIndex.handle(), new PointerInteger(chosenScript.getValue()).handle());
            scriptTags.setValue(scriptTagsPOINTER.get());
            chosenScript.setValue(chosenScriptPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_constant = Interop.downcallHandle(
        "hb_ot_math_get_constant",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) hb_ot_math_get_constant.invokeExact(font.handle(), constant.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_assembly = Interop.downcallHandle(
        "hb_ot_math_get_glyph_assembly",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static int otMathGetGlyphAssembly(FontT font, CodepointT glyph, DirectionT direction, int startOffset, PointerInteger partsCount, PointerProxy<OtMathGlyphPartT> parts, PositionT italicsCorrection) {
        PointerInteger italicsCorrectionPOINTER = new PointerInteger(italicsCorrection.getValue());
        try {
            var RESULT = (int) hb_ot_math_get_glyph_assembly.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), startOffset, partsCount.handle(), parts.handle(), new PointerInteger(italicsCorrection.getValue()).handle());
            italicsCorrection.setValue(italicsCorrectionPOINTER.get());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_italics_correction = Interop.downcallHandle(
        "hb_ot_math_get_glyph_italics_correction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches an italics-correction value (if one exists) for the specified
     * glyph index.
     */
    public static PositionT otMathGetGlyphItalicsCorrection(FontT font, CodepointT glyph) {
        try {
            var RESULT = (int) hb_ot_math_get_glyph_italics_correction.invokeExact(font.handle(), glyph.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_kerning = Interop.downcallHandle(
        "hb_ot_math_get_glyph_kerning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) hb_ot_math_get_glyph_kerning.invokeExact(font.handle(), glyph.getValue(), kern.getValue(), correctionHeight.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_kernings = Interop.downcallHandle(
        "hb_ot_math_get_glyph_kernings",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static int otMathGetGlyphKernings(FontT font, CodepointT glyph, OtMathKernT kern, int startOffset, PointerInteger entriesCount, PointerProxy<OtMathKernEntryT> kernEntries) {
        try {
            var RESULT = (int) hb_ot_math_get_glyph_kernings.invokeExact(font.handle(), glyph.getValue(), kern.getValue(), startOffset, entriesCount.handle(), kernEntries.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_top_accent_attachment = Interop.downcallHandle(
        "hb_ot_math_get_glyph_top_accent_attachment",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) hb_ot_math_get_glyph_top_accent_attachment.invokeExact(font.handle(), glyph.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_glyph_variants = Interop.downcallHandle(
        "hb_ot_math_get_glyph_variants",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public static int otMathGetGlyphVariants(FontT font, CodepointT glyph, DirectionT direction, int startOffset, PointerInteger variantsCount, PointerProxy<OtMathGlyphVariantT> variants) {
        try {
            var RESULT = (int) hb_ot_math_get_glyph_variants.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), startOffset, variantsCount.handle(), variants.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_get_min_connector_overlap = Interop.downcallHandle(
        "hb_ot_math_get_min_connector_overlap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            var RESULT = (int) hb_ot_math_get_min_connector_overlap.invokeExact(font.handle(), direction.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_has_data = Interop.downcallHandle(
        "hb_ot_math_has_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has a {@code MATH} table.
     */
    public static BoolT otMathHasData(FaceT face) {
        try {
            var RESULT = (int) hb_ot_math_has_data.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_math_is_glyph_extended_shape = Interop.downcallHandle(
        "hb_ot_math_is_glyph_extended_shape",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether the given glyph index is an extended shape in the face.
     */
    public static BoolT otMathIsGlyphExtendedShape(FaceT face, CodepointT glyph) {
        try {
            var RESULT = (int) hb_ot_math_is_glyph_extended_shape.invokeExact(face.handle(), glyph.getValue());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_meta_get_entry_tags = Interop.downcallHandle(
        "hb_ot_meta_get_entry_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches all available feature types.
     */
    public static int otMetaGetEntryTags(FaceT face, int startOffset, PointerInteger entriesCount, PointerEnumeration entries) {
        try {
            var RESULT = (int) hb_ot_meta_get_entry_tags.invokeExact(face.handle(), startOffset, entriesCount.handle(), entries.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_meta_reference_entry = Interop.downcallHandle(
        "hb_ot_meta_reference_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * It fetches metadata entry of a given tag from a font.
     */
    public static BlobT otMetaReferenceEntry(FaceT face, OtMetaTagT metaTag) {
        try {
            var RESULT = (MemoryAddress) hb_ot_meta_reference_entry.invokeExact(face.handle(), metaTag.getValue());
            return new BlobT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_metrics_get_position = Interop.downcallHandle(
        "hb_ot_metrics_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font}.
     */
    public static BoolT otMetricsGetPosition(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        PointerInteger positionPOINTER = new PointerInteger(position.getValue());
        try {
            var RESULT = (int) hb_ot_metrics_get_position.invokeExact(font.handle(), metricsTag.getValue(), new PointerInteger(position.getValue()).handle());
            position.setValue(positionPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_metrics_get_position_with_fallback = Interop.downcallHandle(
        "hb_ot_metrics_get_position_with_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font},
     * and synthesizes a value if it the value is missing in the font.
     */
    public static void otMetricsGetPositionWithFallback(FontT font, OtMetricsTagT metricsTag, PositionT position) {
        PointerInteger positionPOINTER = new PointerInteger(position.getValue());
        try {
            hb_ot_metrics_get_position_with_fallback.invokeExact(font.handle(), metricsTag.getValue(), new PointerInteger(position.getValue()).handle());
            position.setValue(positionPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_metrics_get_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font} with the
     * current font variation settings applied.
     */
    public static float otMetricsGetVariation(FontT font, OtMetricsTagT metricsTag) {
        try {
            var RESULT = (float) hb_ot_metrics_get_variation.invokeExact(font.handle(), metricsTag.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_metrics_get_x_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_x_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches horizontal metrics value corresponding to {@code metrics_tag} from {@code font}
     * with the current font variation settings applied.
     */
    public static PositionT otMetricsGetXVariation(FontT font, OtMetricsTagT metricsTag) {
        try {
            var RESULT = (int) hb_ot_metrics_get_x_variation.invokeExact(font.handle(), metricsTag.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_metrics_get_y_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_y_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches vertical metrics value corresponding to {@code metrics_tag} from {@code font} with
     * the current font variation settings applied.
     */
    public static PositionT otMetricsGetYVariation(FontT font, OtMetricsTagT metricsTag) {
        try {
            var RESULT = (int) hb_ot_metrics_get_y_variation.invokeExact(font.handle(), metricsTag.getValue());
            return new PositionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_name_get_utf16 = Interop.downcallHandle(
        "hb_ot_name_get_utf16",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-16 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf16(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, PointerShort text) {
        try {
            var RESULT = (int) hb_ot_name_get_utf16.invokeExact(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), text.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_name_get_utf32 = Interop.downcallHandle(
        "hb_ot_name_get_utf32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-32 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf32(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, PointerInteger text) {
        try {
            var RESULT = (int) hb_ot_name_get_utf32.invokeExact(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), text.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_name_get_utf8 = Interop.downcallHandle(
        "hb_ot_name_get_utf8",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-8 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf8(FaceT face, OtNameIdT nameId, LanguageT language, PointerInteger textSize, PointerString text) {
        try {
            var RESULT = (int) hb_ot_name_get_utf8.invokeExact(face.handle(), nameId.getValue(), language.handle(), textSize.handle(), text.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_name_list_names = Interop.downcallHandle(
        "hb_ot_name_list_names",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Enumerates all available name IDs and language combinations. Returned
     * array is owned by the {@code face} and should not be modified.  It can be
     * used as long as {@code face} is alive.
     */
    public static PointerProxy<OtNameEntryT> otNameListNames(FaceT face, PointerInteger numEntries) {
        try {
            var RESULT = (MemoryAddress) hb_ot_name_list_names.invokeExact(face.handle(), numEntries.handle());
            return new PointerProxy<OtNameEntryT>(RESULT, OtNameEntryT.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_shape_glyphs_closure = Interop.downcallHandle(
        "hb_ot_shape_glyphs_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the transitive closure of glyphs needed for a specified
     * input buffer under the given font and feature list. The closure is
     * computed as a set, not as a list.
     */
    public static void otShapeGlyphsClosure(FontT font, BufferT buffer, FeatureT[] features, int numFeatures, SetT glyphs) {
        try {
            hb_ot_shape_glyphs_closure.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures, glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_shape_plan_collect_lookups = Interop.downcallHandle(
        "hb_ot_shape_plan_collect_lookups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the complete set of GSUB or GPOS lookups that are applicable
     * under a given {@code shape_plan}.
     */
    public static void otShapePlanCollectLookups(ShapePlanT shapePlan, TagT tableTag, SetT lookupIndexes) {
        try {
            hb_ot_shape_plan_collect_lookups.invokeExact(shapePlan.handle(), tableTag.getValue(), lookupIndexes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tag_from_language = Interop.downcallHandle(
        "hb_ot_tag_from_language",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static TagT otTagFromLanguage(LanguageT language) {
        try {
            var RESULT = (int) hb_ot_tag_from_language.invokeExact(language.handle());
            return new TagT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tag_to_language = Interop.downcallHandle(
        "hb_ot_tag_to_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a language tag to an {@link language_t}.
     */
    public static LanguageT otTagToLanguage(TagT tag) {
        try {
            var RESULT = (MemoryAddress) hb_ot_tag_to_language.invokeExact(tag.getValue());
            return new LanguageT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tag_to_script = Interop.downcallHandle(
        "hb_ot_tag_to_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a script tag to an {@link script_t}.
     */
    public static ScriptT otTagToScript(TagT tag) {
        try {
            var RESULT = (int) hb_ot_tag_to_script.invokeExact(tag.getValue());
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tags_from_script = Interop.downcallHandle(
        "hb_ot_tags_from_script",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void otTagsFromScript(ScriptT script, TagT scriptTag1, TagT scriptTag2) {
        PointerInteger scriptTag1POINTER = new PointerInteger(scriptTag1.getValue());
        PointerInteger scriptTag2POINTER = new PointerInteger(scriptTag2.getValue());
        try {
            hb_ot_tags_from_script.invokeExact(script.getValue(), new PointerInteger(scriptTag1.getValue()).handle(), new PointerInteger(scriptTag2.getValue()).handle());
            scriptTag1.setValue(scriptTag1POINTER.get());
            scriptTag2.setValue(scriptTag2POINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tags_from_script_and_language = Interop.downcallHandle(
        "hb_ot_tags_from_script_and_language",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link script_t} and an {@link language_t} to script and language tags.
     */
    public static void otTagsFromScriptAndLanguage(ScriptT script, LanguageT language, PointerInteger scriptCount, TagT scriptTags, PointerInteger languageCount, TagT languageTags) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        PointerInteger languageTagsPOINTER = new PointerInteger(languageTags.getValue());
        try {
            hb_ot_tags_from_script_and_language.invokeExact(script.getValue(), language.handle(), scriptCount.handle(), new PointerInteger(scriptTags.getValue()).handle(), languageCount.handle(), new PointerInteger(languageTags.getValue()).handle());
            scriptTags.setValue(scriptTagsPOINTER.get());
            languageTags.setValue(languageTagsPOINTER.get());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_tags_to_script_and_language = Interop.downcallHandle(
        "hb_ot_tags_to_script_and_language",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a script tag and a language tag to an {@link script_t} and an
     * {@link language_t}.
     */
    public static void otTagsToScriptAndLanguage(TagT scriptTag, TagT languageTag, ScriptT script, LanguageT language) {
        try {
            hb_ot_tags_to_script_and_language.invokeExact(scriptTag.getValue(), languageTag.getValue(), new PointerInteger(script.getValue()).handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_find_axis_info = Interop.downcallHandle(
        "hb_ot_var_find_axis_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the variation-axis information corresponding to the specified axis tag
     * in the specified face.
     */
    public static BoolT otVarFindAxisInfo(FaceT face, TagT axisTag, OtVarAxisInfoT axisInfo) {
        try {
            var RESULT = (int) hb_ot_var_find_axis_info.invokeExact(face.handle(), axisTag.getValue(), axisInfo.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_get_axis_count = Interop.downcallHandle(
        "hb_ot_var_get_axis_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of OpenType variation axes included in the face.
     */
    public static int otVarGetAxisCount(FaceT face) {
        try {
            var RESULT = (int) hb_ot_var_get_axis_count.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_get_axis_infos = Interop.downcallHandle(
        "hb_ot_var_get_axis_infos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all variation axes in the specified face. The list returned will begin
     * at the offset provided.
     */
    public static int otVarGetAxisInfos(FaceT face, int startOffset, PointerInteger axesCount, PointerProxy<OtVarAxisInfoT> axesArray) {
        try {
            var RESULT = (int) hb_ot_var_get_axis_infos.invokeExact(face.handle(), startOffset, axesCount.handle(), axesArray.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_get_named_instance_count = Interop.downcallHandle(
        "hb_ot_var_get_named_instance_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of named instances included in the face.
     */
    public static int otVarGetNamedInstanceCount(FaceT face) {
        try {
            var RESULT = (int) hb_ot_var_get_named_instance_count.invokeExact(face.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_has_data = Interop.downcallHandle(
        "hb_ot_var_has_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any OpenType variation data in the {@code fvar} table.
     */
    public static BoolT otVarHasData(FaceT face) {
        try {
            var RESULT = (int) hb_ot_var_has_data.invokeExact(face.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_named_instance_get_design_coords = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_design_coords",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the design-space coordinates corresponding to the given
     * named instance in the face.
     */
    public static int otVarNamedInstanceGetDesignCoords(FaceT face, int instanceIndex, PointerInteger coordsLength, PointerFloat coords) {
        try {
            var RESULT = (int) hb_ot_var_named_instance_get_design_coords.invokeExact(face.handle(), instanceIndex, coordsLength.handle(), coords.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_named_instance_get_postscript_name_id = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_postscript_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "PostScript name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetPostscriptNameId(FaceT face, int instanceIndex) {
        try {
            var RESULT = (int) hb_ot_var_named_instance_get_postscript_name_id.invokeExact(face.handle(), instanceIndex);
            return new OtNameIdT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_named_instance_get_subfamily_name_id = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_subfamily_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "Subfamily name" defined for the given named instance in the face.
     */
    public static OtNameIdT otVarNamedInstanceGetSubfamilyNameId(FaceT face, int instanceIndex) {
        try {
            var RESULT = (int) hb_ot_var_named_instance_get_subfamily_name_id.invokeExact(face.handle(), instanceIndex);
            return new OtNameIdT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_normalize_coords = Interop.downcallHandle(
        "hb_ot_var_normalize_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_ot_var_normalize_coords.invokeExact(face.handle(), coordsLength, designCoords.handle(), normalizedCoords.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_ot_var_normalize_variations = Interop.downcallHandle(
        "hb_ot_var_normalize_variations",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Normalizes all of the coordinates in the given list of variation axes.
     */
    public static void otVarNormalizeVariations(FaceT face, VariationT variations, int variationsLength, PointerInteger coords, int coordsLength) {
        try {
            hb_ot_var_normalize_variations.invokeExact(face.handle(), variations.handle(), variationsLength, coords.handle(), coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_script_from_iso15924_tag = Interop.downcallHandle(
        "hb_script_from_iso15924_tag",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an ISO 15924 script tag to a corresponding {@link script_t}.
     */
    public static ScriptT scriptFromIso15924Tag(TagT tag) {
        try {
            var RESULT = (int) hb_script_from_iso15924_tag.invokeExact(tag.getValue());
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_script_from_string = Interop.downcallHandle(
        "hb_script_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string {@code str} representing an ISO 15924 script tag to a
     * corresponding {@link script_t}. Shorthand for hb_tag_from_string() then
     * hb_script_from_iso15924_tag().
     */
    public static ScriptT scriptFromString(byte[] str, int len) {
        try {
            var RESULT = (int) hb_script_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len);
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_script_get_horizontal_direction = Interop.downcallHandle(
        "hb_script_get_horizontal_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@link direction_t} of a script when it is
     * set horizontally. All right-to-left scripts will return
     * {@code HB_DIRECTION_RTL}. All left-to-right scripts will return
     * {@code HB_DIRECTION_LTR}.  Scripts that can be written either
     * horizontally or vertically will return {@code HB_DIRECTION_INVALID}.
     * Unknown scripts will return {@code HB_DIRECTION_LTR}.
     */
    public static DirectionT scriptGetHorizontalDirection(ScriptT script) {
        try {
            var RESULT = (int) hb_script_get_horizontal_direction.invokeExact(script.getValue());
            return new DirectionT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_script_to_iso15924_tag = Interop.downcallHandle(
        "hb_script_to_iso15924_tag",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link script_t} to a corresponding ISO 15924 script tag.
     */
    public static TagT scriptToIso15924Tag(ScriptT script) {
        try {
            var RESULT = (int) hb_script_to_iso15924_tag.invokeExact(script.getValue());
            return new TagT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_segment_properties_equal = Interop.downcallHandle(
        "hb_segment_properties_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks the equality of two {@link segment_properties_t}'s.
     */
    public static BoolT segmentPropertiesEqual(SegmentPropertiesT a, SegmentPropertiesT b) {
        try {
            var RESULT = (int) hb_segment_properties_equal.invokeExact(a.handle(), b.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_segment_properties_hash = Interop.downcallHandle(
        "hb_segment_properties_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a hash representing @p.
     */
    public static int segmentPropertiesHash(SegmentPropertiesT p) {
        try {
            var RESULT = (int) hb_segment_properties_hash.invokeExact(p.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_segment_properties_overlay = Interop.downcallHandle(
        "hb_segment_properties_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            hb_segment_properties_overlay.invokeExact(p.handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_add = Interop.downcallHandle(
        "hb_set_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code codepoint} to {@code set}.
     */
    public static void setAdd(SetT set, CodepointT codepoint) {
        try {
            hb_set_add.invokeExact(set.handle(), codepoint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_add_range = Interop.downcallHandle(
        "hb_set_add_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds all of the elements from {@code first} to {@code last}
     * (inclusive) to {@code set}.
     */
    public static void setAddRange(SetT set, CodepointT first, CodepointT last) {
        try {
            hb_set_add_range.invokeExact(set.handle(), first.getValue(), last.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_allocation_successful = Interop.downcallHandle(
        "hb_set_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static BoolT setAllocationSuccessful(SetT set) {
        try {
            var RESULT = (int) hb_set_allocation_successful.invokeExact(set.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_clear = Interop.downcallHandle(
        "hb_set_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears out the contents of a set.
     */
    public static void setClear(SetT set) {
        try {
            hb_set_clear.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_copy = Interop.downcallHandle(
        "hb_set_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocate a copy of {@code set}.
     */
    public static SetT setCopy(SetT set) {
        try {
            var RESULT = (MemoryAddress) hb_set_copy.invokeExact(set.handle());
            return new SetT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_create = Interop.downcallHandle(
        "hb_set_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new, initially empty set.
     */
    public static SetT setCreate() {
        try {
            var RESULT = (MemoryAddress) hb_set_create.invokeExact();
            return new SetT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_del = Interop.downcallHandle(
        "hb_set_del",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes {@code codepoint} from {@code set}.
     */
    public static void setDel(SetT set, CodepointT codepoint) {
        try {
            hb_set_del.invokeExact(set.handle(), codepoint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_del_range = Interop.downcallHandle(
        "hb_set_del_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes all of the elements from {@code first} to {@code last}
     * (inclusive) from {@code set}.
     * <p>
     * If {@code last} is {@code HB_SET_VALUE_INVALID}, then all values
     * greater than or equal to {@code first} are removed.
     */
    public static void setDelRange(SetT set, CodepointT first, CodepointT last) {
        try {
            hb_set_del_range.invokeExact(set.handle(), first.getValue(), last.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_destroy = Interop.downcallHandle(
        "hb_set_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a set. When
     * the reference count reaches zero, the set is
     * destroyed, freeing all memory.
     */
    public static void setDestroy(SetT set) {
        try {
            hb_set_destroy.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_get_empty = Interop.downcallHandle(
        "hb_set_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty {@link set_t}.
     */
    public static SetT setGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_set_get_empty.invokeExact();
            return new SetT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_get_max = Interop.downcallHandle(
        "hb_set_get_max",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the largest element in the set.
     */
    public static CodepointT setGetMax(SetT set) {
        try {
            var RESULT = (int) hb_set_get_max.invokeExact(set.handle());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_get_min = Interop.downcallHandle(
        "hb_set_get_min",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the smallest element in the set.
     */
    public static CodepointT setGetMin(SetT set) {
        try {
            var RESULT = (int) hb_set_get_min.invokeExact(set.handle());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_get_population = Interop.downcallHandle(
        "hb_set_get_population",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of elements in the set.
     */
    public static int setGetPopulation(SetT set) {
        try {
            var RESULT = (int) hb_set_get_population.invokeExact(set.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_get_user_data = Interop.downcallHandle(
        "hb_set_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified set.
     */
    public static java.lang.foreign.MemoryAddress setGetUserData(SetT set, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_set_get_user_data.invokeExact(set.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_has = Interop.downcallHandle(
        "hb_set_has",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether {@code codepoint} belongs to {@code set}.
     */
    public static BoolT setHas(SetT set, CodepointT codepoint) {
        try {
            var RESULT = (int) hb_set_has.invokeExact(set.handle(), codepoint.getValue());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_intersect = Interop.downcallHandle(
        "hb_set_intersect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the intersection of {@code set} and {@code other}.
     */
    public static void setIntersect(SetT set, SetT other) {
        try {
            hb_set_intersect.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_invert = Interop.downcallHandle(
        "hb_set_invert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts the contents of {@code set}.
     */
    public static void setInvert(SetT set) {
        try {
            hb_set_invert.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_is_empty = Interop.downcallHandle(
        "hb_set_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a set is empty (contains no elements).
     */
    public static BoolT setIsEmpty(SetT set) {
        try {
            var RESULT = (int) hb_set_is_empty.invokeExact(set.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_is_equal = Interop.downcallHandle(
        "hb_set_is_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code set} and {@code other} are equal (contain the same
     * elements).
     */
    public static BoolT setIsEqual(SetT set, SetT other) {
        try {
            var RESULT = (int) hb_set_is_equal.invokeExact(set.handle(), other.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_is_subset = Interop.downcallHandle(
        "hb_set_is_subset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code set} is a subset of {@code larger_set}.
     */
    public static BoolT setIsSubset(SetT set, SetT largerSet) {
        try {
            var RESULT = (int) hb_set_is_subset.invokeExact(set.handle(), largerSet.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_next = Interop.downcallHandle(
        "hb_set_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the next element in {@code set} that is greater than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setNext(SetT set, CodepointT codepoint) {
        PointerInteger codepointPOINTER = new PointerInteger(codepoint.getValue());
        try {
            var RESULT = (int) hb_set_next.invokeExact(set.handle(), new PointerInteger(codepoint.getValue()).handle());
            codepoint.setValue(codepointPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_next_range = Interop.downcallHandle(
        "hb_set_next_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the next consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code last} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setNextRange(SetT set, CodepointT first, CodepointT last) {
        PointerInteger firstPOINTER = new PointerInteger(first.getValue());
        PointerInteger lastPOINTER = new PointerInteger(last.getValue());
        try {
            var RESULT = (int) hb_set_next_range.invokeExact(set.handle(), new PointerInteger(first.getValue()).handle(), new PointerInteger(last.getValue()).handle());
            first.setValue(firstPOINTER.get());
            last.setValue(lastPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_previous = Interop.downcallHandle(
        "hb_set_previous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the previous element in {@code set} that is lower than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setPrevious(SetT set, CodepointT codepoint) {
        PointerInteger codepointPOINTER = new PointerInteger(codepoint.getValue());
        try {
            var RESULT = (int) hb_set_previous.invokeExact(set.handle(), new PointerInteger(codepoint.getValue()).handle());
            codepoint.setValue(codepointPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_previous_range = Interop.downcallHandle(
        "hb_set_previous_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the previous consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code first} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static BoolT setPreviousRange(SetT set, CodepointT first, CodepointT last) {
        PointerInteger firstPOINTER = new PointerInteger(first.getValue());
        PointerInteger lastPOINTER = new PointerInteger(last.getValue());
        try {
            var RESULT = (int) hb_set_previous_range.invokeExact(set.handle(), new PointerInteger(first.getValue()).handle(), new PointerInteger(last.getValue()).handle());
            first.setValue(firstPOINTER.get());
            last.setValue(lastPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_reference = Interop.downcallHandle(
        "hb_set_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a set.
     */
    public static SetT setReference(SetT set) {
        try {
            var RESULT = (MemoryAddress) hb_set_reference.invokeExact(set.handle());
            return new SetT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_set = Interop.downcallHandle(
        "hb_set_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the contents of {@code set} equal to the contents of {@code other}.
     */
    public static void setSet(SetT set, SetT other) {
        try {
            hb_set_set.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_subtract = Interop.downcallHandle(
        "hb_set_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts the contents of {@code other} from {@code set}.
     */
    public static void setSubtract(SetT set, SetT other) {
        try {
            hb_set_subtract.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_symmetric_difference = Interop.downcallHandle(
        "hb_set_symmetric_difference",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the symmetric difference of {@code set}
     * and {@code other}.
     */
    public static void setSymmetricDifference(SetT set, SetT other) {
        try {
            hb_set_symmetric_difference.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_set_union = Interop.downcallHandle(
        "hb_set_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the union of {@code set} and {@code other}.
     */
    public static void setUnion(SetT set, SetT other) {
        try {
            hb_set_union.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape = Interop.downcallHandle(
        "hb_shape",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Shapes {@code buffer} using {@code font} turning its Unicode characters content to
     * positioned glyphs. If {@code features} is not {@code null}, it will be used to control the
     * features applied during shaping. If two {@code features} have the same tag but
     * overlapping ranges the value of the feature with the higher index takes
     * precedence.
     */
    public static void shape(FontT font, BufferT buffer, FeatureT[] features, int numFeatures) {
        try {
            hb_shape.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_full = Interop.downcallHandle(
        "hb_shape_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_shape() for details. If {@code shaper_list} is not {@code null}, the specified
     * shapers will be used in the given order, otherwise the default shapers list
     * will be used.
     */
    public static BoolT shapeFull(FontT font, BufferT buffer, FeatureT[] features, int numFeatures, java.lang.String[] shaperList) {
        try {
            var RESULT = (int) hb_shape_full.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures, Interop.allocateNativeArray(shaperList).handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_list_shapers = Interop.downcallHandle(
        "hb_shape_list_shapers",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Retrieves the list of shapers supported by HarfBuzz.
     */
    public static PointerString shapeListShapers() {
        try {
            var RESULT = (MemoryAddress) hb_shape_list_shapers.invokeExact();
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_create = Interop.downcallHandle(
        "hb_shape_plan_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}.
     */
    public static ShapePlanT shapePlanCreate(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_create.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_create2 = Interop.downcallHandle(
        "hb_shape_plan_create2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The variable-font version of {@code hb_shape_plan_create}.
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}, plus the variation-space coordinates {@code coords}.
     */
    public static ShapePlanT shapePlanCreate2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_create2.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(coords).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_create_cached = Interop.downcallHandle(
        "hb_shape_plan_create_cached",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}.
     */
    public static ShapePlanT shapePlanCreateCached(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_create_cached.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(shaperList).handle());
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_create_cached2 = Interop.downcallHandle(
        "hb_shape_plan_create_cached2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The variable-font version of {@code hb_shape_plan_create_cached}.
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}, plus the
     * variation-space coordinates {@code coords}.
     */
    public static ShapePlanT shapePlanCreateCached2(FaceT face, SegmentPropertiesT props, FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_create_cached2.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures).handle(), numUserFeatures, Interop.allocateNativeArray(coords).handle(), numCoords, Interop.allocateNativeArray(shaperList).handle());
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_destroy = Interop.downcallHandle(
        "hb_shape_plan_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on the given shaping plan. When the
     * reference count reaches zero, the shaping plan is destroyed,
     * freeing all memory.
     */
    public static void shapePlanDestroy(ShapePlanT shapePlan) {
        try {
            hb_shape_plan_destroy.invokeExact(shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_execute = Interop.downcallHandle(
        "hb_shape_plan_execute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Executes the given shaping plan on the specified buffer, using
     * the given {@code font} and {@code features}.
     */
    public static BoolT shapePlanExecute(ShapePlanT shapePlan, FontT font, BufferT buffer, FeatureT[] features, int numFeatures) {
        try {
            var RESULT = (int) hb_shape_plan_execute.invokeExact(shapePlan.handle(), font.handle(), buffer.handle(), Interop.allocateNativeArray(features).handle(), numFeatures);
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_get_empty = Interop.downcallHandle(
        "hb_shape_plan_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty shaping plan.
     */
    public static ShapePlanT shapePlanGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_get_empty.invokeExact();
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_get_shaper = Interop.downcallHandle(
        "hb_shape_plan_get_shaper",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the shaper from a given shaping plan.
     */
    public static java.lang.String shapePlanGetShaper(ShapePlanT shapePlan) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_get_shaper.invokeExact(shapePlan.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_get_user_data = Interop.downcallHandle(
        "hb_shape_plan_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified shaping plan.
     */
    public static java.lang.foreign.MemoryAddress shapePlanGetUserData(ShapePlanT shapePlan, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_get_user_data.invokeExact(shapePlan.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_shape_plan_reference = Interop.downcallHandle(
        "hb_shape_plan_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on the given shaping plan.
     */
    public static ShapePlanT shapePlanReference(ShapePlanT shapePlan) {
        try {
            var RESULT = (MemoryAddress) hb_shape_plan_reference.invokeExact(shapePlan.handle());
            return new ShapePlanT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_style_get_value = Interop.downcallHandle(
        "hb_style_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Searches variation axes of a {@link font_t} object for a specific axis first,
     * if not set, then tries to get default style values from different
     * tables of the font.
     */
    public static float styleGetValue(FontT font, StyleTagT styleTag) {
        try {
            var RESULT = (float) hb_style_get_value.invokeExact(font.handle(), styleTag.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_tag_from_string = Interop.downcallHandle(
        "hb_tag_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string into an {@link tag_t}. Valid tags
     * are four characters. Shorter input strings will be
     * padded with spaces. Longer input strings will be
     * truncated.
     */
    public static TagT tagFromString(byte[] str, int len) {
        try {
            var RESULT = (int) hb_tag_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len);
            return new TagT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_tag_to_string = Interop.downcallHandle(
        "hb_tag_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link tag_t} to a string and returns it in {@code buf}.
     * Strings will be four characters long.
     */
    public static void tagToString(TagT tag, PointerByte buf) {
        try {
            hb_tag_to_string.invokeExact(tag.getValue(), buf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_combining_class = Interop.downcallHandle(
        "hb_unicode_combining_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the Canonical Combining Class (ccc) property
     * of code point {@code unicode}.
     */
    public static UnicodeCombiningClassT unicodeCombiningClass(UnicodeFuncsT ufuncs, CodepointT unicode) {
        try {
            var RESULT = (int) hb_unicode_combining_class.invokeExact(ufuncs.handle(), unicode.getValue());
            return new UnicodeCombiningClassT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_compose = Interop.downcallHandle(
        "hb_unicode_compose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the composition of a sequence of two Unicode
     * code points.
     * <p>
     * Calls the composition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     */
    public static BoolT unicodeCompose(UnicodeFuncsT ufuncs, CodepointT a, CodepointT b, CodepointT ab) {
        PointerInteger abPOINTER = new PointerInteger(ab.getValue());
        try {
            var RESULT = (int) hb_unicode_compose.invokeExact(ufuncs.handle(), a.getValue(), b.getValue(), new PointerInteger(ab.getValue()).handle());
            ab.setValue(abPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_decompose = Interop.downcallHandle(
        "hb_unicode_decompose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the decomposition of a Unicode code point.
     * <p>
     * Calls the decomposition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     */
    public static BoolT unicodeDecompose(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b) {
        PointerInteger aPOINTER = new PointerInteger(a.getValue());
        PointerInteger bPOINTER = new PointerInteger(b.getValue());
        try {
            var RESULT = (int) hb_unicode_decompose.invokeExact(ufuncs.handle(), ab.getValue(), new PointerInteger(a.getValue()).handle(), new PointerInteger(b.getValue()).handle());
            a.setValue(aPOINTER.get());
            b.setValue(bPOINTER.get());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_create = Interop.downcallHandle(
        "hb_unicode_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link unicode_funcs_t} structure of Unicode functions.
     */
    public static UnicodeFuncsT unicodeFuncsCreate(UnicodeFuncsT parent) {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_create.invokeExact(parent.handle());
            return new UnicodeFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_destroy = Interop.downcallHandle(
        "hb_unicode_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a Unicode-functions structure. When
     * the reference count reaches zero, the Unicode-functions structure is
     * destroyed, freeing all memory.
     */
    public static void unicodeFuncsDestroy(UnicodeFuncsT ufuncs) {
        try {
            hb_unicode_funcs_destroy.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_get_default = Interop.downcallHandle(
        "hb_unicode_funcs_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a pointer to the default Unicode-functions structure that is used
     * when no functions are explicitly set on {@link buffer_t}.
     */
    public static UnicodeFuncsT unicodeFuncsGetDefault() {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_get_default.invokeExact();
            return new UnicodeFuncsT(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_get_empty = Interop.downcallHandle(
        "hb_unicode_funcs_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty Unicode-functions structure.
     */
    public static UnicodeFuncsT unicodeFuncsGetEmpty() {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_get_empty.invokeExact();
            return new UnicodeFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_get_parent = Interop.downcallHandle(
        "hb_unicode_funcs_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the parent of the Unicode-functions structure
     * {@code ufuncs}.
     */
    public static UnicodeFuncsT unicodeFuncsGetParent(UnicodeFuncsT ufuncs) {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_get_parent.invokeExact(ufuncs.handle());
            return new UnicodeFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_get_user_data = Interop.downcallHandle(
        "hb_unicode_funcs_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user-data associated with the specified key,
     * attached to the specified Unicode-functions structure.
     */
    public static java.lang.foreign.MemoryAddress unicodeFuncsGetUserData(UnicodeFuncsT ufuncs, UserDataKeyT key) {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_get_user_data.invokeExact(ufuncs.handle(), key.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_is_immutable = Interop.downcallHandle(
        "hb_unicode_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified Unicode-functions structure
     * is immutable.
     */
    public static BoolT unicodeFuncsIsImmutable(UnicodeFuncsT ufuncs) {
        try {
            var RESULT = (int) hb_unicode_funcs_is_immutable.invokeExact(ufuncs.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_make_immutable = Interop.downcallHandle(
        "hb_unicode_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the specified Unicode-functions structure
     * immutable.
     */
    public static void unicodeFuncsMakeImmutable(UnicodeFuncsT ufuncs) {
        try {
            hb_unicode_funcs_make_immutable.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_funcs_reference = Interop.downcallHandle(
        "hb_unicode_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a Unicode-functions structure.
     */
    public static UnicodeFuncsT unicodeFuncsReference(UnicodeFuncsT ufuncs) {
        try {
            var RESULT = (MemoryAddress) hb_unicode_funcs_reference.invokeExact(ufuncs.handle());
            return new UnicodeFuncsT(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_general_category = Interop.downcallHandle(
        "hb_unicode_general_category",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the General Category (gc) property
     * of code point {@code unicode}.
     */
    public static UnicodeGeneralCategoryT unicodeGeneralCategory(UnicodeFuncsT ufuncs, CodepointT unicode) {
        try {
            var RESULT = (int) hb_unicode_general_category.invokeExact(ufuncs.handle(), unicode.getValue());
            return new UnicodeGeneralCategoryT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_mirroring = Interop.downcallHandle(
        "hb_unicode_mirroring",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the Bi-directional Mirroring Glyph code
     * point defined for code point {@code unicode}.
     */
    public static CodepointT unicodeMirroring(UnicodeFuncsT ufuncs, CodepointT unicode) {
        try {
            var RESULT = (int) hb_unicode_mirroring.invokeExact(ufuncs.handle(), unicode.getValue());
            return new CodepointT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_unicode_script = Interop.downcallHandle(
        "hb_unicode_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the {@link script_t} script to which code
     * point {@code unicode} belongs.
     */
    public static ScriptT unicodeScript(UnicodeFuncsT ufuncs, CodepointT unicode) {
        try {
            var RESULT = (int) hb_unicode_script.invokeExact(ufuncs.handle(), unicode.getValue());
            return new ScriptT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_variation_from_string = Interop.downcallHandle(
        "hb_variation_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) hb_variation_from_string.invokeExact(Interop.allocateNativeArray(str).handle(), len, variation.handle());
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_variation_to_string = Interop.downcallHandle(
        "hb_variation_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link variation_t} into a {@code null}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static void variationToString(VariationT variation, PointerString buf, int size) {
        try {
            hb_variation_to_string.invokeExact(variation.handle(), buf.handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_version = Interop.downcallHandle(
        "hb_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns library version as three integer components.
     */
    public static void version(PointerInteger major, PointerInteger minor, PointerInteger micro) {
        try {
            hb_version.invokeExact(major.handle(), minor.handle(), micro.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_version_atleast = Interop.downcallHandle(
        "hb_version_atleast",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests the library version against a minimum value,
     * as three integer components.
     */
    public static BoolT versionAtleast(int major, int minor, int micro) {
        try {
            var RESULT = (int) hb_version_atleast.invokeExact(major, minor, micro);
            return new BoolT(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle hb_version_string = Interop.downcallHandle(
        "hb_version_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns library version as a string with three components.
     */
    public static java.lang.String versionString() {
        try {
            var RESULT = (MemoryAddress) hb_version_string.invokeExact();
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
