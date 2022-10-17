package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class HarfBuzz {
    
    /**
     * Used when getting or setting AAT feature selectors. Indicates that
     * there is no selector index corresponding to the selector of interest.
     */
    public static final int AAT_LAYOUT_NO_SELECTOR_INDEX = 65535;

    /**
     * The default code point for replacing invalid characters in a given encoding.
     * Set to U+FFFD REPLACEMENT CHARACTER.
     */
    public static final int BUFFER_REPLACEMENT_CODEPOINT_DEFAULT = 65533;

    /**
     * Special setting for {@link feature_t}.start to apply the feature from the start
     * of the buffer.
     */
    public static final int FEATURE_GLOBAL_START = 0;

    /**
     * Unset {@link map_t} value.
     */
    /**
     * Special value for language index indicating default or unsupported language.
     */
    public static final int OT_LAYOUT_DEFAULT_LANGUAGE_INDEX = 65535;

    /**
     * Special value for feature index indicating unsupported feature.
     */
    public static final int OT_LAYOUT_NO_FEATURE_INDEX = 65535;

    /**
     * Special value for script index indicating unsupported script.
     */
    public static final int OT_LAYOUT_NO_SCRIPT_INDEX = 65535;

    /**
     * Special value for variations index indicating unsupported variation.
     */
    /**
     * Maximum number of OpenType tags that can correspond to a give {@link language_t}.
     */
    public static final int OT_MAX_TAGS_PER_LANGUAGE = 3;

    /**
     * Maximum number of OpenType tags that can correspond to a give {@link script_t}.
     */
    public static final int OT_MAX_TAGS_PER_SCRIPT = 3;

    /**
     * Do not use.
     */
    /**
     * Unset {@link set_t} value.
     */
    /**
     * Maximum valid Unicode code point.
     */
    public static final int UNICODE_MAX = 1114111;

    /**
     * See Unicode 6.1 for details on the maximum decomposition length.
     */
    public static final int UNICODE_MAX_DECOMPOSITION_LEN = 19;

    /**
     * The major component of the library version available at compile-time.
     */
    public static final int VERSION_MAJOR = 4;

    /**
     * The micro component of the library version available at compile-time.
     */
    public static final int VERSION_MICRO = 0;

    /**
     * The minor component of the library version available at compile-time.
     */
    public static final int VERSION_MINOR = 0;

    /**
     * A string literal containing the library version available at compile-time.
     */
    public static final java.lang.String VERSION_STRING = "4.0.0";

    private static final MethodHandle hb_aat_layout_feature_type_get_name_id = Interop.downcallHandle(
        "hb_aat_layout_feature_type_get_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the name identifier of the specified feature type in the face's {@code name} table.
     */
    public static @NotNull OtNameIdT aatLayoutFeatureTypeGetNameId(@NotNull FaceT face, @NotNull AatLayoutFeatureTypeT featureType) {
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_feature_type_get_name_id.invokeExact(face.handle(), featureType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtNameIdT(RESULT);
    }
    
    private static final MethodHandle hb_aat_layout_feature_type_get_selector_infos = Interop.downcallHandle(
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
    public static int aatLayoutFeatureTypeGetSelectorInfos(@NotNull FaceT face, @NotNull AatLayoutFeatureTypeT featureType, @NotNull int startOffset, @NotNull Out<Integer> selectorCount, @NotNull Out<AatLayoutFeatureSelectorInfoT[]> selectors, @NotNull Out<Integer> defaultIndex) {
        MemorySegment selectorCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment selectorsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment defaultIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_feature_type_get_selector_infos.invokeExact(face.handle(), featureType.getValue(), startOffset, (Addressable) selectorCountPOINTER.address(), (Addressable) selectorsPOINTER.address(), (Addressable) defaultIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        selectorCount.set(selectorCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        defaultIndex.set(defaultIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        AatLayoutFeatureSelectorInfoT[] selectorsARRAY = new AatLayoutFeatureSelectorInfoT[selectorCount.get().intValue()];
        for (int I = 0; I < selectorCount.get().intValue(); I++) {
            var OBJ = selectorsPOINTER.get(ValueLayout.ADDRESS, I);
            selectorsARRAY[I] = new AatLayoutFeatureSelectorInfoT(Refcounted.get(OBJ, false));
        }
        selectors.set(selectorsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_aat_layout_get_feature_types = Interop.downcallHandle(
        "hb_aat_layout_get_feature_types",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the AAT feature types included in the specified face.
     */
    public static int aatLayoutGetFeatureTypes(@NotNull FaceT face, @NotNull int startOffset, @NotNull Out<Integer> featureCount, @NotNull Out<AatLayoutFeatureTypeT[]> features) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment featuresPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_get_feature_types.invokeExact(face.handle(), startOffset, (Addressable) featureCountPOINTER.address(), (Addressable) featuresPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureCount.set(featureCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        AatLayoutFeatureTypeT[] featuresARRAY = new AatLayoutFeatureTypeT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featuresPOINTER.get(ValueLayout.JAVA_INT, I);
            featuresARRAY[I] = new AatLayoutFeatureTypeT(OBJ);
        }
        features.set(featuresARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_aat_layout_has_positioning = Interop.downcallHandle(
        "hb_aat_layout_has_positioning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any positioning information
     * in the {@code kerx} table.
     * <p>
     * &lt;note&gt;Note: does not examine the {@code GPOS} table.&lt;/note&gt;
     */
    public static @NotNull BoolT aatLayoutHasPositioning(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_has_positioning.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_aat_layout_has_substitution = Interop.downcallHandle(
        "hb_aat_layout_has_substitution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any substitutions in the
     * {@code morx} or {@code mort} tables.
     * <p>
     * &lt;note&gt;Note: does not examine the {@code GSUB} table.&lt;/note&gt;
     */
    public static @NotNull BoolT aatLayoutHasSubstitution(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_has_substitution.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_aat_layout_has_tracking = Interop.downcallHandle(
        "hb_aat_layout_has_tracking",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any tracking information
     * in the {@code trak} table.
     */
    public static @NotNull BoolT aatLayoutHasTracking(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_aat_layout_has_tracking.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_blob_copy_writable_or_fail = Interop.downcallHandle(
        "hb_blob_copy_writable_or_fail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a writable copy of {@code blob}.
     */
    public static @NotNull BlobT blobCopyWritableOrFail(@NotNull BlobT blob) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_copy_writable_or_fail.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_blob_create_from_file = Interop.downcallHandle(
        "hb_blob_create_from_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static @NotNull BlobT blobCreateFromFile(@NotNull java.lang.String fileName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_create_from_file.invokeExact(Interop.allocateNativeString(fileName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_blob_create_from_file_or_fail = Interop.downcallHandle(
        "hb_blob_create_from_file_or_fail",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     */
    public static @NotNull BlobT blobCreateFromFileOrFail(@NotNull java.lang.String fileName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_create_from_file_or_fail.invokeExact(Interop.allocateNativeString(fileName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_blob_create_sub_blob = Interop.downcallHandle(
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
    public static @NotNull BlobT blobCreateSubBlob(@NotNull BlobT parent, @NotNull int offset, @NotNull int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_create_sub_blob.invokeExact(parent.handle(), offset, length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_blob_destroy = Interop.downcallHandle(
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
    public static @NotNull void blobDestroy(@NotNull BlobT blob) {
        try {
            hb_blob_destroy.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_blob_get_data = Interop.downcallHandle(
        "hb_blob_get_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the data from a blob.
     */
    public static java.lang.String[] blobGetData(@NotNull BlobT blob, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_get_data.invokeExact(blob.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle hb_blob_get_data_writable = Interop.downcallHandle(
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
    public static java.lang.String[] blobGetDataWritable(@NotNull BlobT blob, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_get_data_writable.invokeExact(blob.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle hb_blob_get_empty = Interop.downcallHandle(
        "hb_blob_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the singleton empty blob.
     * <p>
     * See TODO:link object types for more information.
     */
    public static @NotNull BlobT blobGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_blob_get_length = Interop.downcallHandle(
        "hb_blob_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the length of a blob's data.
     */
    public static int blobGetLength(@NotNull BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) hb_blob_get_length.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_blob_get_user_data = Interop.downcallHandle(
        "hb_blob_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static @Nullable java.lang.foreign.MemoryAddress blobGetUserData(@NotNull BlobT blob, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_get_user_data.invokeExact(blob.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_blob_is_immutable = Interop.downcallHandle(
        "hb_blob_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a blob is immutable.
     */
    public static @NotNull BoolT blobIsImmutable(@NotNull BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) hb_blob_is_immutable.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_blob_make_immutable = Interop.downcallHandle(
        "hb_blob_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a blob immutable.
     */
    public static @NotNull void blobMakeImmutable(@NotNull BlobT blob) {
        try {
            hb_blob_make_immutable.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_blob_reference = Interop.downcallHandle(
        "hb_blob_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code blob}.
     * <p>
     * See TODO:link object types for more information.
     */
    public static @NotNull BlobT blobReference(@NotNull BlobT blob) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_blob_reference.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_add = Interop.downcallHandle(
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
    public static @NotNull void bufferAdd(@NotNull BufferT buffer, @NotNull CodepointT codepoint, @NotNull int cluster) {
        try {
            hb_buffer_add.invokeExact(buffer.handle(), codepoint.getValue(), cluster);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_add_codepoints = Interop.downcallHandle(
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
    public static @NotNull void bufferAddCodepoints(@NotNull BufferT buffer, @NotNull CodepointT[] text, @NotNull int textLength, @NotNull int itemOffset, @NotNull int itemLength) {
        try {
            hb_buffer_add_codepoints.invokeExact(buffer.handle(), Interop.allocateNativeArray(CodepointT.getIntegerValues(text)), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_add_latin1 = Interop.downcallHandle(
        "hb_buffer_add_latin1",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
     * Unicode code points that can fit in 8-bit strings.
     * <p>
     * &lt;note&gt;Has nothing to do with non-Unicode Latin-1 encoding.&lt;/note&gt;
     */
    public static @NotNull void bufferAddLatin1(@NotNull BufferT buffer, @NotNull byte[] text, @NotNull int textLength, @NotNull int itemOffset, @NotNull int itemLength) {
        try {
            hb_buffer_add_latin1.invokeExact(buffer.handle(), Interop.allocateNativeArray(text), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_add_utf16 = Interop.downcallHandle(
        "hb_buffer_add_utf16",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-16 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static @NotNull void bufferAddUtf16(@NotNull BufferT buffer, @NotNull short[] text, @NotNull int textLength, @NotNull int itemOffset, @NotNull int itemLength) {
        try {
            hb_buffer_add_utf16.invokeExact(buffer.handle(), Interop.allocateNativeArray(text), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_add_utf32 = Interop.downcallHandle(
        "hb_buffer_add_utf32",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-32 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static @NotNull void bufferAddUtf32(@NotNull BufferT buffer, @NotNull int[] text, @NotNull int textLength, @NotNull int itemOffset, @NotNull int itemLength) {
        try {
            hb_buffer_add_utf32.invokeExact(buffer.handle(), Interop.allocateNativeArray(text), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_add_utf8 = Interop.downcallHandle(
        "hb_buffer_add_utf8",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-8 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     */
    public static @NotNull void bufferAddUtf8(@NotNull BufferT buffer, @NotNull byte[] text, @NotNull int textLength, @NotNull int itemOffset, @NotNull int itemLength) {
        try {
            hb_buffer_add_utf8.invokeExact(buffer.handle(), Interop.allocateNativeArray(text), textLength, itemOffset, itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_allocation_successful = Interop.downcallHandle(
        "hb_buffer_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Check if allocating memory for the buffer succeeded.
     */
    public static @NotNull BoolT bufferAllocationSuccessful(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_allocation_successful.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_append = Interop.downcallHandle(
        "hb_buffer_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Append (part of) contents of another buffer to this buffer.
     */
    public static @NotNull void bufferAppend(@NotNull BufferT buffer, @NotNull BufferT source, @NotNull int start, @NotNull int end) {
        try {
            hb_buffer_append.invokeExact(buffer.handle(), source.handle(), start, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_clear_contents = Interop.downcallHandle(
        "hb_buffer_clear_contents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
     * the replacement code point.
     */
    public static @NotNull void bufferClearContents(@NotNull BufferT buffer) {
        try {
            hb_buffer_clear_contents.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_create = Interop.downcallHandle(
        "hb_buffer_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link buffer_t} with all properties to defaults.
     */
    public static @NotNull BufferT bufferCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_create_similar = Interop.downcallHandle(
        "hb_buffer_create_similar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link buffer_t}, similar to hb_buffer_create(). The only
     * difference is that the buffer is configured similarly to {@code src}.
     */
    public static @NotNull BufferT bufferCreateSimilar(@NotNull BufferT src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_create_similar.invokeExact(src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_deserialize_glyphs = Interop.downcallHandle(
        "hb_buffer_deserialize_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deserializes glyphs {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_glyphs().
     */
    public static @NotNull BoolT bufferDeserializeGlyphs(@NotNull BufferT buffer, @NotNull java.lang.String[] buf, @NotNull int bufLen, @NotNull Out<java.lang.String> endPtr, @Nullable FontT font, @NotNull BufferSerializeFormatT format) {
        MemorySegment endPtrPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_buffer_deserialize_glyphs.invokeExact(buffer.handle(), Interop.allocateNativeArray(buf), bufLen, (Addressable) endPtrPOINTER.address(), font.handle(), format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        endPtr.set(endPtrPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_deserialize_unicode = Interop.downcallHandle(
        "hb_buffer_deserialize_unicode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deserializes Unicode {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_unicode().
     */
    public static @NotNull BoolT bufferDeserializeUnicode(@NotNull BufferT buffer, @NotNull java.lang.String[] buf, @NotNull int bufLen, @NotNull Out<java.lang.String> endPtr, @NotNull BufferSerializeFormatT format) {
        MemorySegment endPtrPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_buffer_deserialize_unicode.invokeExact(buffer.handle(), Interop.allocateNativeArray(buf), bufLen, (Addressable) endPtrPOINTER.address(), format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        endPtr.set(endPtrPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_destroy = Interop.downcallHandle(
        "hb_buffer_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Deallocate the {@code buffer}.
     * Decreases the reference count on {@code buffer} by one. If the result is zero, then
     * {@code buffer} and all associated resources are freed. See hb_buffer_reference().
     */
    public static @NotNull void bufferDestroy(@NotNull BufferT buffer) {
        try {
            hb_buffer_destroy.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_diff = Interop.downcallHandle(
        "hb_buffer_diff",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * If dottedcircle_glyph is (hb_codepoint_t) -1 then {@code HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT}
     * and {@code HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT} are never returned.  This should be used by most
     * callers if just comparing two buffers is needed.
     */
    public static @NotNull BufferDiffFlagsT bufferDiff(@NotNull BufferT buffer, @NotNull BufferT reference, @NotNull CodepointT dottedcircleGlyph, @NotNull int positionFuzz) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_diff.invokeExact(buffer.handle(), reference.handle(), dottedcircleGlyph.getValue(), positionFuzz);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferDiffFlagsT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_cluster_level = Interop.downcallHandle(
        "hb_buffer_get_cluster_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static @NotNull BufferClusterLevelT bufferGetClusterLevel(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_cluster_level.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferClusterLevelT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_content_type = Interop.downcallHandle(
        "hb_buffer_get_content_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static @NotNull BufferContentTypeT bufferGetContentType(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_content_type.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferContentTypeT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_direction = Interop.downcallHandle(
        "hb_buffer_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_direction()
     */
    public static @NotNull DirectionT bufferGetDirection(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_direction.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DirectionT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_empty = Interop.downcallHandle(
        "hb_buffer_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches an empty {@link buffer_t}.
     */
    public static @NotNull BufferT bufferGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_get_flags = Interop.downcallHandle(
        "hb_buffer_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link buffer_flags_t} of {@code buffer}.
     */
    public static @NotNull BufferFlagsT bufferGetFlags(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_flags.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferFlagsT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_glyph_infos = Interop.downcallHandle(
        "hb_buffer_get_glyph_infos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code buffer} glyph information array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     */
    public static GlyphInfoT[] bufferGetGlyphInfos(@NotNull BufferT buffer, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_glyph_infos.invokeExact(buffer.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        GlyphInfoT[] resultARRAY = new GlyphInfoT[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new GlyphInfoT(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle hb_buffer_get_glyph_positions = Interop.downcallHandle(
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
    public static GlyphPositionT[] bufferGetGlyphPositions(@NotNull BufferT buffer, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_glyph_positions.invokeExact(buffer.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        GlyphPositionT[] resultARRAY = new GlyphPositionT[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new GlyphPositionT(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle hb_buffer_get_invisible_glyph = Interop.downcallHandle(
        "hb_buffer_get_invisible_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_invisible_glyph().
     */
    public static @NotNull CodepointT bufferGetInvisibleGlyph(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_invisible_glyph.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_language = Interop.downcallHandle(
        "hb_buffer_get_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_language().
     */
    public static @NotNull LanguageT bufferGetLanguage(@NotNull BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_language.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_buffer_get_length = Interop.downcallHandle(
        "hb_buffer_get_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of items in the buffer.
     */
    public static int bufferGetLength(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_length.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_buffer_get_not_found_glyph = Interop.downcallHandle(
        "hb_buffer_get_not_found_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_buffer_set_not_found_glyph().
     */
    public static @NotNull CodepointT bufferGetNotFoundGlyph(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_not_found_glyph.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_replacement_codepoint = Interop.downcallHandle(
        "hb_buffer_get_replacement_codepoint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     */
    public static @NotNull CodepointT bufferGetReplacementCodepoint(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_replacement_codepoint.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_script = Interop.downcallHandle(
        "hb_buffer_get_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the script of {@code buffer}.
     */
    public static @NotNull ScriptT bufferGetScript(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_get_script.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_get_segment_properties = Interop.downcallHandle(
        "hb_buffer_get_segment_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code props} to the {@link segment_properties_t} of {@code buffer}.
     */
    public static @NotNull void bufferGetSegmentProperties(@NotNull BufferT buffer, @NotNull Out<SegmentPropertiesT> props) {
        MemorySegment propsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_buffer_get_segment_properties.invokeExact(buffer.handle(), (Addressable) propsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        props.set(new SegmentPropertiesT(Refcounted.get(propsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_buffer_get_unicode_funcs = Interop.downcallHandle(
        "hb_buffer_get_unicode_funcs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the Unicode-functions structure of a buffer.
     */
    public static @NotNull UnicodeFuncsT bufferGetUnicodeFuncs(@NotNull BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_unicode_funcs.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_get_user_data = Interop.downcallHandle(
        "hb_buffer_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified buffer.
     */
    public static @Nullable java.lang.foreign.MemoryAddress bufferGetUserData(@NotNull BufferT buffer, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_get_user_data.invokeExact(buffer.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_buffer_guess_segment_properties = Interop.downcallHandle(
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
    public static @NotNull void bufferGuessSegmentProperties(@NotNull BufferT buffer) {
        try {
            hb_buffer_guess_segment_properties.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_has_positions = Interop.downcallHandle(
        "hb_buffer_has_positions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code buffer} has glyph position data.
     * A buffer gains position data when hb_buffer_get_glyph_positions() is called on it,
     * and cleared of position data when hb_buffer_clear_contents() is called.
     */
    public static @NotNull BoolT bufferHasPositions(@NotNull BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_has_positions.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_normalize_glyphs = Interop.downcallHandle(
        "hb_buffer_normalize_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reorders a glyph buffer to have canonical in-cluster glyph order / position.
     * The resulting clusters should behave identical to pre-reordering clusters.
     * <p>
     * &lt;note&gt;This has nothing to do with Unicode normalization.&lt;/note&gt;
     */
    public static @NotNull void bufferNormalizeGlyphs(@NotNull BufferT buffer) {
        try {
            hb_buffer_normalize_glyphs.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_pre_allocate = Interop.downcallHandle(
        "hb_buffer_pre_allocate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pre allocates memory for {@code buffer} to fit at least {@code size} number of items.
     */
    public static @NotNull BoolT bufferPreAllocate(@NotNull BufferT buffer, @NotNull int size) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_pre_allocate.invokeExact(buffer.handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_reference = Interop.downcallHandle(
        "hb_buffer_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code buffer} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_buffer_destroy() is made.
     */
    public static @NotNull BufferT bufferReference(@NotNull BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_reference.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_buffer_reset = Interop.downcallHandle(
        "hb_buffer_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the buffer to its initial status, as if it was just newly created
     * with hb_buffer_create().
     */
    public static @NotNull void bufferReset(@NotNull BufferT buffer) {
        try {
            hb_buffer_reset.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_reverse = Interop.downcallHandle(
        "hb_buffer_reverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses buffer contents.
     */
    public static @NotNull void bufferReverse(@NotNull BufferT buffer) {
        try {
            hb_buffer_reverse.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_reverse_clusters = Interop.downcallHandle(
        "hb_buffer_reverse_clusters",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses buffer clusters.  That is, the buffer contents are
     * reversed, then each cluster (consecutive items having the
     * same cluster number) are reversed again.
     */
    public static @NotNull void bufferReverseClusters(@NotNull BufferT buffer) {
        try {
            hb_buffer_reverse_clusters.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_reverse_range = Interop.downcallHandle(
        "hb_buffer_reverse_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Reverses buffer contents between {@code start} and {@code end}.
     */
    public static @NotNull void bufferReverseRange(@NotNull BufferT buffer, @NotNull int start, @NotNull int end) {
        try {
            hb_buffer_reverse_range.invokeExact(buffer.handle(), start, end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_serialize = Interop.downcallHandle(
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
    public static int bufferSerialize(@NotNull BufferT buffer, @NotNull int start, @NotNull int end, @NotNull Out<byte[]> buf, @NotNull Out<Integer> bufSize, @NotNull Out<Integer> bufConsumed, @Nullable FontT font, @NotNull BufferSerializeFormatT format, @NotNull BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bufSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_buffer_serialize.invokeExact(buffer.handle(), start, end, (Addressable) bufPOINTER.address(), (Addressable) bufSizePOINTER.address(), (Addressable) bufConsumedPOINTER.address(), font.handle(), format.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufSize.set(bufSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        bufConsumed.set(bufConsumedPOINTER.get(ValueLayout.JAVA_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(ValueLayout.ADDRESS, 0), bufSize.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT;
    }
    
    private static final MethodHandle hb_buffer_serialize_format_from_string = Interop.downcallHandle(
        "hb_buffer_serialize_format_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Parses a string into an {@link buffer_serialize_format_t}. Does not check if
     * {@code str} is a valid buffer serialization format, use
     * hb_buffer_serialize_list_formats() to get the list of supported formats.
     */
    public static @NotNull BufferSerializeFormatT bufferSerializeFormatFromString(@NotNull byte[] str, @NotNull int len) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_serialize_format_from_string.invokeExact(Interop.allocateNativeArray(str), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BufferSerializeFormatT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_serialize_format_to_string = Interop.downcallHandle(
        "hb_buffer_serialize_format_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts {@code format} to the string corresponding it, or {@code null} if it is not a valid
     * {@link buffer_serialize_format_t}.
     */
    public static @NotNull java.lang.String bufferSerializeFormatToString(@NotNull BufferSerializeFormatT format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_serialize_format_to_string.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle hb_buffer_serialize_glyphs = Interop.downcallHandle(
        "hb_buffer_serialize_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Serializes {@code buffer} into a textual representation of its glyph content,
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * 
     * <h2>text</h2>
     * A human-readable, plain text format.
     * The serialized glyphs will look something like:
     * 
     * <pre>{@code 
     * [uni0651=0@518,0+0|uni0628=0+1897]
     * }</pre>
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
     * 
     * <h2>json</h2>
     * A machine-readable, structured format.
     * The serialized glyphs will look something like:
     * 
     * <pre>{@code 
     * [{"g":"uni0651","cl":0,"dx":518,"dy":0,"ax":0,"ay":0},
     * {"g":"uni0628","cl":0,"dx":0,"dy":0,"ax":1897,"ay":0}]
     * }</pre>
     * </ul>
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
    public static int bufferSerializeGlyphs(@NotNull BufferT buffer, @NotNull int start, @NotNull int end, @NotNull Out<byte[]> buf, @NotNull Out<Integer> bufSize, @NotNull Out<Integer> bufConsumed, @Nullable FontT font, @NotNull BufferSerializeFormatT format, @NotNull BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bufSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_buffer_serialize_glyphs.invokeExact(buffer.handle(), start, end, (Addressable) bufPOINTER.address(), (Addressable) bufSizePOINTER.address(), (Addressable) bufConsumedPOINTER.address(), font.handle(), format.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufSize.set(bufSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        bufConsumed.set(bufConsumedPOINTER.get(ValueLayout.JAVA_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(ValueLayout.ADDRESS, 0), bufSize.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT;
    }
    
    private static final MethodHandle hb_buffer_serialize_list_formats = Interop.downcallHandle(
        "hb_buffer_serialize_list_formats",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Returns a list of supported buffer serialization formats.
     */
    public static PointerString bufferSerializeListFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_buffer_serialize_list_formats.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle hb_buffer_serialize_unicode = Interop.downcallHandle(
        "hb_buffer_serialize_unicode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Serializes {@code buffer} into a textual representation of its content,
     * when the buffer contains Unicode codepoints (i.e., before shaping). This is
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * 
     * <h2>text</h2>
     * A human-readable, plain text format.
     * The serialized codepoints will look something like:
     * 
     * <pre>{@code 
     *  <U+0651=0|U+0628=1>
     * }</pre>
     * <ul>
     * <li>Glyphs are separated with {@code |}
     * <li>Unicode codepoints are expressed as zero-padded four (or more)
     *   digit hexadecimal numbers preceded by {@code U+}
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set, the cluster
     *   will be indicated with a {@code =} then {@link glyph_info_t}.cluster.
     * 
     * <h2>json</h2>
     * A machine-readable, structured format.
     * The serialized codepoints will be a list of objects with the following
     * properties:
     * <li>{@code u}: the Unicode codepoint as a decimal integer
     * <li>{@code cl}: {@link glyph_info_t}.cluster if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set.
     * </ul>
     * <p>
     * For example:
     * 
     * <pre>{@code 
     * [{u:1617,cl:0},{u:1576,cl:1}]
     * }</pre>
     */
    public static int bufferSerializeUnicode(@NotNull BufferT buffer, @NotNull int start, @NotNull int end, @NotNull Out<byte[]> buf, @NotNull Out<Integer> bufSize, @NotNull Out<Integer> bufConsumed, @NotNull BufferSerializeFormatT format, @NotNull BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment bufSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_buffer_serialize_unicode.invokeExact(buffer.handle(), start, end, (Addressable) bufPOINTER.address(), (Addressable) bufSizePOINTER.address(), (Addressable) bufConsumedPOINTER.address(), format.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufSize.set(bufSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        bufConsumed.set(bufConsumedPOINTER.get(ValueLayout.JAVA_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(ValueLayout.ADDRESS, 0), bufSize.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
        return RESULT;
    }
    
    private static final MethodHandle hb_buffer_set_cluster_level = Interop.downcallHandle(
        "hb_buffer_set_cluster_level",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cluster level of a buffer. The {@link buffer_cluster_level_t}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     */
    public static @NotNull void bufferSetClusterLevel(@NotNull BufferT buffer, @NotNull BufferClusterLevelT clusterLevel) {
        try {
            hb_buffer_set_cluster_level.invokeExact(buffer.handle(), clusterLevel.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_content_type = Interop.downcallHandle(
        "hb_buffer_set_content_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     */
    public static @NotNull void bufferSetContentType(@NotNull BufferT buffer, @NotNull BufferContentTypeT contentType) {
        try {
            hb_buffer_set_content_type.invokeExact(buffer.handle(), contentType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_direction = Interop.downcallHandle(
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
    public static @NotNull void bufferSetDirection(@NotNull BufferT buffer, @NotNull DirectionT direction) {
        try {
            hb_buffer_set_direction.invokeExact(buffer.handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_flags = Interop.downcallHandle(
        "hb_buffer_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code buffer} flags to {@code flags}. See {@link buffer_flags_t}.
     */
    public static @NotNull void bufferSetFlags(@NotNull BufferT buffer, @NotNull BufferFlagsT flags) {
        try {
            hb_buffer_set_flags.invokeExact(buffer.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_invisible_glyph = Interop.downcallHandle(
        "hb_buffer_set_invisible_glyph",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link codepoint_t} that replaces invisible characters in
     * the shaping result.  If set to zero (default), the glyph for the
     * U+0020 SPACE character is used.  Otherwise, this value is used
     * verbatim.
     */
    public static @NotNull void bufferSetInvisibleGlyph(@NotNull BufferT buffer, @NotNull CodepointT invisible) {
        try {
            hb_buffer_set_invisible_glyph.invokeExact(buffer.handle(), invisible.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_language = Interop.downcallHandle(
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
    public static @NotNull void bufferSetLanguage(@NotNull BufferT buffer, @NotNull LanguageT language) {
        try {
            hb_buffer_set_language.invokeExact(buffer.handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_length = Interop.downcallHandle(
        "hb_buffer_set_length",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Similar to hb_buffer_pre_allocate(), but clears any new items added at the
     * end.
     */
    public static @NotNull BoolT bufferSetLength(@NotNull BufferT buffer, @NotNull int length) {
        int RESULT;
        try {
            RESULT = (int) hb_buffer_set_length.invokeExact(buffer.handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_buffer_set_not_found_glyph = Interop.downcallHandle(
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
    public static @NotNull void bufferSetNotFoundGlyph(@NotNull BufferT buffer, @NotNull CodepointT notFound) {
        try {
            hb_buffer_set_not_found_glyph.invokeExact(buffer.handle(), notFound.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_replacement_codepoint = Interop.downcallHandle(
        "hb_buffer_set_replacement_codepoint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@link codepoint_t} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     * <p>
     * Default is {@code HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT}.
     */
    public static @NotNull void bufferSetReplacementCodepoint(@NotNull BufferT buffer, @NotNull CodepointT replacement) {
        try {
            hb_buffer_set_replacement_codepoint.invokeExact(buffer.handle(), replacement.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_script = Interop.downcallHandle(
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
    public static @NotNull void bufferSetScript(@NotNull BufferT buffer, @NotNull ScriptT script) {
        try {
            hb_buffer_set_script.invokeExact(buffer.handle(), script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_segment_properties = Interop.downcallHandle(
        "hb_buffer_set_segment_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the segment properties of the buffer, a shortcut for calling
     * hb_buffer_set_direction(), hb_buffer_set_script() and
     * hb_buffer_set_language() individually.
     */
    public static @NotNull void bufferSetSegmentProperties(@NotNull BufferT buffer, @NotNull SegmentPropertiesT props) {
        try {
            hb_buffer_set_segment_properties.invokeExact(buffer.handle(), props.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_buffer_set_unicode_funcs = Interop.downcallHandle(
        "hb_buffer_set_unicode_funcs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the Unicode-functions structure of a buffer to
     * {@code unicode_funcs}.
     */
    public static @NotNull void bufferSetUnicodeFuncs(@NotNull BufferT buffer, @NotNull UnicodeFuncsT unicodeFuncs) {
        try {
            hb_buffer_set_unicode_funcs.invokeExact(buffer.handle(), unicodeFuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_color_get_alpha = Interop.downcallHandle(
        "hb_color_get_alpha",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the alpha channel of the given {@code color}.
     */
    public static byte colorGetAlpha(@NotNull ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) hb_color_get_alpha.invokeExact(color.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_color_get_blue = Interop.downcallHandle(
        "hb_color_get_blue",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the blue channel of the given {@code color}.
     */
    public static byte colorGetBlue(@NotNull ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) hb_color_get_blue.invokeExact(color.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_color_get_green = Interop.downcallHandle(
        "hb_color_get_green",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the green channel of the given {@code color}.
     */
    public static byte colorGetGreen(@NotNull ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) hb_color_get_green.invokeExact(color.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_color_get_red = Interop.downcallHandle(
        "hb_color_get_red",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the red channel of the given {@code color}.
     */
    public static byte colorGetRed(@NotNull ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) hb_color_get_red.invokeExact(color.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_direction_from_string = Interop.downcallHandle(
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
    public static @NotNull DirectionT directionFromString(@NotNull byte[] str, @NotNull int len) {
        int RESULT;
        try {
            RESULT = (int) hb_direction_from_string.invokeExact(Interop.allocateNativeArray(str), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DirectionT(RESULT);
    }
    
    private static final MethodHandle hb_direction_to_string = Interop.downcallHandle(
        "hb_direction_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link direction_t} to a string.
     */
    public static @NotNull java.lang.String directionToString(@NotNull DirectionT direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_direction_to_string.invokeExact(direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle hb_draw_close_path = Interop.downcallHandle(
        "hb_draw_close_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Perform a "close-path" draw operation.
     */
    public static @NotNull void drawClosePath(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st) {
        try {
            hb_draw_close_path.invokeExact(dfuncs.handle(), drawData, st.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_cubic_to = Interop.downcallHandle(
        "hb_draw_cubic_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "cubic-to" draw operation.
     */
    public static @NotNull void drawCubicTo(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float control1X, @NotNull float control1Y, @NotNull float control2X, @NotNull float control2Y, @NotNull float toX, @NotNull float toY) {
        try {
            hb_draw_cubic_to.invokeExact(dfuncs.handle(), drawData, st.handle(), control1X, control1Y, control2X, control2Y, toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_funcs_create = Interop.downcallHandle(
        "hb_draw_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new draw callbacks object.
     */
    public static @NotNull DrawFuncsT drawFuncsCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_draw_funcs_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DrawFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_draw_funcs_destroy = Interop.downcallHandle(
        "hb_draw_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Deallocate the {@code dfuncs}.
     * Decreases the reference count on {@code dfuncs} by one. If the result is zero, then
     * {@code dfuncs} and all associated resources are freed. See hb_draw_funcs_reference().
     */
    public static @NotNull void drawFuncsDestroy(@NotNull DrawFuncsT dfuncs) {
        try {
            hb_draw_funcs_destroy.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_funcs_is_immutable = Interop.downcallHandle(
        "hb_draw_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code dfuncs} is immutable.
     */
    public static @NotNull BoolT drawFuncsIsImmutable(@NotNull DrawFuncsT dfuncs) {
        int RESULT;
        try {
            RESULT = (int) hb_draw_funcs_is_immutable.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_draw_funcs_make_immutable = Interop.downcallHandle(
        "hb_draw_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code dfuncs} object immutable.
     */
    public static @NotNull void drawFuncsMakeImmutable(@NotNull DrawFuncsT dfuncs) {
        try {
            hb_draw_funcs_make_immutable.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_funcs_reference = Interop.downcallHandle(
        "hb_draw_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code dfuncs} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_draw_funcs_destroy() is made.
     */
    public static @NotNull DrawFuncsT drawFuncsReference(@NotNull DrawFuncsT dfuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_draw_funcs_reference.invokeExact(dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DrawFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_draw_line_to = Interop.downcallHandle(
        "hb_draw_line_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "line-to" draw operation.
     */
    public static @NotNull void drawLineTo(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float toX, @NotNull float toY) {
        try {
            hb_draw_line_to.invokeExact(dfuncs.handle(), drawData, st.handle(), toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_move_to = Interop.downcallHandle(
        "hb_draw_move_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "move-to" draw operation.
     */
    public static @NotNull void drawMoveTo(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float toX, @NotNull float toY) {
        try {
            hb_draw_move_to.invokeExact(dfuncs.handle(), drawData, st.handle(), toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_draw_quadratic_to = Interop.downcallHandle(
        "hb_draw_quadratic_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Perform a "quadratic-to" draw operation.
     */
    public static @NotNull void drawQuadraticTo(@NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, @NotNull DrawStateT st, @NotNull float controlX, @NotNull float controlY, @NotNull float toX, @NotNull float toY) {
        try {
            hb_draw_quadratic_to.invokeExact(dfuncs.handle(), drawData, st.handle(), controlX, controlY, toX, toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_builder_add_table = Interop.downcallHandle(
        "hb_face_builder_add_table",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Add table for {@code tag} with data provided by {@code blob} to the face.  {@code face} must
     * be created using hb_face_builder_create().
     */
    public static @NotNull BoolT faceBuilderAddTable(@NotNull FaceT face, @NotNull TagT tag, @NotNull BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) hb_face_builder_add_table.invokeExact(face.handle(), tag.getValue(), blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_face_builder_create = Interop.downcallHandle(
        "hb_face_builder_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@link face_t} that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     */
    public static @NotNull FaceT faceBuilderCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_builder_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_collect_unicodes = Interop.downcallHandle(
        "hb_face_collect_unicodes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all of the Unicode characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static @NotNull void faceCollectUnicodes(@NotNull FaceT face, @NotNull SetT out) {
        try {
            hb_face_collect_unicodes.invokeExact(face.handle(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_collect_variation_selectors = Interop.downcallHandle(
        "hb_face_collect_variation_selectors",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all Unicode "Variation Selector" characters covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static @NotNull void faceCollectVariationSelectors(@NotNull FaceT face, @NotNull SetT out) {
        try {
            hb_face_collect_variation_selectors.invokeExact(face.handle(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_collect_variation_unicodes = Interop.downcallHandle(
        "hb_face_collect_variation_unicodes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Collects all Unicode characters for {@code variation_selector} covered by {@code face} and adds
     * them to the {@link set_t} set {@code out}.
     */
    public static @NotNull void faceCollectVariationUnicodes(@NotNull FaceT face, @NotNull CodepointT variationSelector, @NotNull SetT out) {
        try {
            hb_face_collect_variation_unicodes.invokeExact(face.handle(), variationSelector.getValue(), out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_count = Interop.downcallHandle(
        "hb_face_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of faces in a blob.
     */
    public static int faceCount(@NotNull BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) hb_face_count.invokeExact(blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_face_create = Interop.downcallHandle(
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
    public static @NotNull FaceT faceCreate(@NotNull BlobT blob, @NotNull int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_create.invokeExact(blob.handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_destroy = Interop.downcallHandle(
        "hb_face_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a face object. When the
     * reference count reaches zero, the face is destroyed,
     * freeing all memory.
     */
    public static @NotNull void faceDestroy(@NotNull FaceT face) {
        try {
            hb_face_destroy.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_get_empty = Interop.downcallHandle(
        "hb_face_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty face object.
     */
    public static @NotNull FaceT faceGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_get_glyph_count = Interop.downcallHandle(
        "hb_face_get_glyph_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph-count value of the specified face object.
     */
    public static int faceGetGlyphCount(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_face_get_glyph_count.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_face_get_index = Interop.downcallHandle(
        "hb_face_get_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the face-index corresponding to the given face.
     * <p>
     * &lt;note&gt;Note: face indices within a collection are zero-based.&lt;/note&gt;
     */
    public static int faceGetIndex(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_face_get_index.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_face_get_table_tags = Interop.downcallHandle(
        "hb_face_get_table_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all table tags for a face, if possible. The list returned will
     * begin at the offset provided
     */
    public static int faceGetTableTags(@NotNull FaceT face, @NotNull int startOffset, @NotNull Out<Integer> tableCount, @NotNull Out<TagT[]> tableTags) {
        MemorySegment tableCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment tableTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_face_get_table_tags.invokeExact(face.handle(), startOffset, (Addressable) tableCountPOINTER.address(), (Addressable) tableTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tableCount.set(tableCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        TagT[] tableTagsARRAY = new TagT[tableCount.get().intValue()];
        for (int I = 0; I < tableCount.get().intValue(); I++) {
            var OBJ = tableTagsPOINTER.get(ValueLayout.JAVA_INT, I);
            tableTagsARRAY[I] = new TagT(OBJ);
        }
        tableTags.set(tableTagsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_face_get_upem = Interop.downcallHandle(
        "hb_face_get_upem",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the units-per-em (upem) value of the specified face object.
     */
    public static int faceGetUpem(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_face_get_upem.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_face_get_user_data = Interop.downcallHandle(
        "hb_face_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified face object.
     */
    public static @Nullable java.lang.foreign.MemoryAddress faceGetUserData(@NotNull FaceT face, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_get_user_data.invokeExact(face.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_face_is_immutable = Interop.downcallHandle(
        "hb_face_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the given face object is immutable.
     */
    public static @NotNull BoolT faceIsImmutable(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_face_is_immutable.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_face_make_immutable = Interop.downcallHandle(
        "hb_face_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the given face object immutable.
     */
    public static @NotNull void faceMakeImmutable(@NotNull FaceT face) {
        try {
            hb_face_make_immutable.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_reference = Interop.downcallHandle(
        "hb_face_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a face object.
     */
    public static @NotNull FaceT faceReference(@NotNull FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_reference.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FaceT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_reference_blob = Interop.downcallHandle(
        "hb_face_reference_blob",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     */
    public static @NotNull BlobT faceReferenceBlob(@NotNull FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_reference_blob.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_reference_table = Interop.downcallHandle(
        "hb_face_reference_table",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches a reference to the specified table within
     * the specified face.
     */
    public static @NotNull BlobT faceReferenceTable(@NotNull FaceT face, @NotNull TagT tag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_face_reference_table.invokeExact(face.handle(), tag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_face_set_glyph_count = Interop.downcallHandle(
        "hb_face_set_glyph_count",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the glyph count for a face object to the specified value.
     */
    public static @NotNull void faceSetGlyphCount(@NotNull FaceT face, @NotNull int glyphCount) {
        try {
            hb_face_set_glyph_count.invokeExact(face.handle(), glyphCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_set_index = Interop.downcallHandle(
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
    public static @NotNull void faceSetIndex(@NotNull FaceT face, @NotNull int index) {
        try {
            hb_face_set_index.invokeExact(face.handle(), index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_face_set_upem = Interop.downcallHandle(
        "hb_face_set_upem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the units-per-em (upem) for a face object to the specified value.
     */
    public static @NotNull void faceSetUpem(@NotNull FaceT face, @NotNull int upem) {
        try {
            hb_face_set_upem.invokeExact(face.handle(), upem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_feature_from_string = Interop.downcallHandle(
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
     * &lt;row&gt;&lt;entry&gt;Syntax&lt;/entry&gt;    &lt;entry&gt;Value&lt;/entry&gt; &lt;entry&gt;Start&lt;/entry&gt; &lt;entry&gt;End&lt;/entry&gt;&lt;/row&gt;
     * &lt;/thead&gt;
     * &lt;tbody&gt;
     * &lt;row&gt;&lt;entry&gt;Setting value:&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern&lt;/entry&gt;      &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;+kern&lt;/entry&gt;     &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;-kern&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature off&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern=0&lt;/entry&gt;    &lt;entry&gt;0&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature off&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern=1&lt;/entry&gt;    &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;aalt=2&lt;/entry&gt;    &lt;entry&gt;2&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Choose 2nd alternate&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;Setting index:&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[]&lt;/entry&gt;    &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[:]&lt;/entry&gt;   &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[5:]&lt;/entry&gt;  &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;5&lt;/entry&gt;      &lt;entry&gt;∞&lt;/entry&gt;   &lt;entry&gt;Turn feature on, partial&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[:5]&lt;/entry&gt;  &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;0&lt;/entry&gt;      &lt;entry&gt;5&lt;/entry&gt;   &lt;entry&gt;Turn feature on, partial&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[3:5]&lt;/entry&gt; &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;3&lt;/entry&gt;      &lt;entry&gt;5&lt;/entry&gt;   &lt;entry&gt;Turn feature on, range&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;kern[3]&lt;/entry&gt;   &lt;entry&gt;1&lt;/entry&gt;     &lt;entry&gt;3&lt;/entry&gt;      &lt;entry&gt;3+1&lt;/entry&gt; &lt;entry&gt;Turn feature on, single char&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;Mixing it all:&lt;/entry&gt;&lt;/row&gt;
     * &lt;row&gt;&lt;entry&gt;aalt[3:5]=2&lt;/entry&gt; &lt;entry&gt;2&lt;/entry&gt;   &lt;entry&gt;3&lt;/entry&gt;      &lt;entry&gt;5&lt;/entry&gt;   &lt;entry&gt;Turn 2nd alternate on for range&lt;/entry&gt;&lt;/row&gt;
     * &lt;/tbody&gt;
     * &lt;/tgroup&gt;
     * &lt;/informaltable&gt;
     */
    public static @NotNull BoolT featureFromString(@NotNull byte[] str, @NotNull int len, @NotNull Out<FeatureT> feature) {
        MemorySegment featurePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_feature_from_string.invokeExact(Interop.allocateNativeArray(str), len, (Addressable) featurePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        feature.set(new FeatureT(Refcounted.get(featurePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_feature_to_string = Interop.downcallHandle(
        "hb_feature_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a {@link feature_t} into a {@code null}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static @NotNull void featureToString(@NotNull FeatureT feature, @NotNull Out<java.lang.String[]> buf, @NotNull Out<Integer> size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_feature_to_string.invokeExact(feature.handle(), (Addressable) bufPOINTER.address(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] bufARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = bufPOINTER.get(ValueLayout.ADDRESS, I);
            bufARRAY[I] = OBJ.getUtf8String(0);
        }
        buf.set(bufARRAY);
    }
    
    private static final MethodHandle hb_font_add_glyph_origin_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontAddGlyphOriginForDirection(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_add_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_font_create = Interop.downcallHandle(
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
    public static @NotNull FontT fontCreate(@NotNull FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_create.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_create_sub_font = Interop.downcallHandle(
        "hb_font_create_sub_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a sub-font font object from the specified {@code parent} font,
     * replicating the parent's properties.
     */
    public static @NotNull FontT fontCreateSubFont(@NotNull FontT parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_create_sub_font.invokeExact(parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_destroy = Interop.downcallHandle(
        "hb_font_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on the given font object. When the
     * reference count reaches zero, the font is destroyed,
     * freeing all memory.
     */
    public static @NotNull void fontDestroy(@NotNull FontT font) {
        try {
            hb_font_destroy.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_funcs_create = Interop.downcallHandle(
        "hb_font_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link font_funcs_t} structure of font functions.
     */
    public static @NotNull FontFuncsT fontFuncsCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_funcs_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_funcs_destroy = Interop.downcallHandle(
        "hb_font_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a font-functions structure. When
     * the reference count reaches zero, the font-functions structure is
     * destroyed, freeing all memory.
     */
    public static @NotNull void fontFuncsDestroy(@NotNull FontFuncsT ffuncs) {
        try {
            hb_font_funcs_destroy.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_funcs_get_empty = Interop.downcallHandle(
        "hb_font_funcs_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches an empty font-functions structure.
     */
    public static @NotNull FontFuncsT fontFuncsGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_funcs_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_funcs_get_user_data = Interop.downcallHandle(
        "hb_font_funcs_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     */
    public static @Nullable java.lang.foreign.MemoryAddress fontFuncsGetUserData(@NotNull FontFuncsT ffuncs, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_funcs_get_user_data.invokeExact(ffuncs.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_font_funcs_is_immutable = Interop.downcallHandle(
        "hb_font_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a font-functions structure is immutable.
     */
    public static @NotNull BoolT fontFuncsIsImmutable(@NotNull FontFuncsT ffuncs) {
        int RESULT;
        try {
            RESULT = (int) hb_font_funcs_is_immutable.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_funcs_make_immutable = Interop.downcallHandle(
        "hb_font_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a font-functions structure immutable.
     */
    public static @NotNull void fontFuncsMakeImmutable(@NotNull FontFuncsT ffuncs) {
        try {
            hb_font_funcs_make_immutable.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_funcs_reference = Interop.downcallHandle(
        "hb_font_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a font-functions structure.
     */
    public static @NotNull FontFuncsT fontFuncsReference(@NotNull FontFuncsT ffuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_funcs_reference.invokeExact(ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_get_empty = Interop.downcallHandle(
        "hb_font_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the empty font object.
     */
    public static @NotNull FontT fontGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_get_extents_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontGetExtentsForDirection(@NotNull FontT font, @NotNull DirectionT direction, @NotNull Out<FontExtentsT> extents) {
        MemorySegment extentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_font_get_extents_for_direction.invokeExact(font.handle(), direction.getValue(), (Addressable) extentsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        extents.set(new FontExtentsT(Refcounted.get(extentsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_font_get_face = Interop.downcallHandle(
        "hb_font_get_face",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the face associated with the specified font object.
     */
    public static @NotNull FaceT fontGetFace(@NotNull FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_face.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FaceT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_font_get_glyph = Interop.downcallHandle(
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
    public static @NotNull BoolT fontGetGlyph(@NotNull FontT font, @NotNull CodepointT unicode, @NotNull CodepointT variationSelector, @NotNull Out<CodepointT> glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph.invokeExact(font.handle(), unicode.getValue(), variationSelector.getValue(), (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.set(new CodepointT(glyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_advance_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontGetGlyphAdvanceForDirection(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_advance_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_font_get_glyph_advances_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontGetGlyphAdvancesForDirection(@NotNull FontT font, @NotNull DirectionT direction, @NotNull int count, @NotNull CodepointT firstGlyph, @NotNull int glyphStride, @NotNull Out<PositionT> firstAdvance, @NotNull Out<Integer> advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment advanceStridePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_advances_for_direction.invokeExact(font.handle(), direction.getValue(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, (Addressable) firstAdvancePOINTER.address(), (Addressable) advanceStridePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.set(new PositionT(firstAdvancePOINTER.get(ValueLayout.JAVA_INT, 0)));
        advanceStride.set(advanceStridePOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_font_get_glyph_contour_point = Interop.downcallHandle(
        "hb_font_get_glyph_contour_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (x,y) coordinates of a specified contour-point index
     * in the specified glyph, within the specified font.
     */
    public static @NotNull BoolT fontGetGlyphContourPoint(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull int pointIndex, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_contour_point.invokeExact(font.handle(), glyph.getValue(), pointIndex, (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_contour_point_for_origin = Interop.downcallHandle(
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
    public static @NotNull BoolT fontGetGlyphContourPointForOrigin(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull int pointIndex, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_contour_point_for_origin.invokeExact(font.handle(), glyph.getValue(), pointIndex, direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_extents = Interop.downcallHandle(
        "hb_font_get_glyph_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the {@link glyph_extents_t} data for a glyph ID
     * in the specified font.
     */
    public static @NotNull BoolT fontGetGlyphExtents(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull Out<GlyphExtentsT> extents) {
        MemorySegment extentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_extents.invokeExact(font.handle(), glyph.getValue(), (Addressable) extentsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        extents.set(new GlyphExtentsT(Refcounted.get(extentsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_extents_for_origin = Interop.downcallHandle(
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
    public static @NotNull BoolT fontGetGlyphExtentsForOrigin(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull Out<GlyphExtentsT> extents) {
        MemorySegment extentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_extents_for_origin.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), (Addressable) extentsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        extents.set(new GlyphExtentsT(Refcounted.get(extentsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_from_name = Interop.downcallHandle(
        "hb_font_get_glyph_from_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID that corresponds to a name string in the specified {@code font}.
     * <p>
     * &lt;note&gt;Note: {@code len} == -1 means the name string is null-terminated.&lt;/note&gt;
     */
    public static @NotNull BoolT fontGetGlyphFromName(@NotNull FontT font, @NotNull java.lang.String[] name, @NotNull int len, @NotNull Out<CodepointT> glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_from_name.invokeExact(font.handle(), Interop.allocateNativeArray(name), len, (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.set(new CodepointT(glyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_h_advance = Interop.downcallHandle(
        "hb_font_get_glyph_h_advance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for horizontal text segments.
     */
    public static @NotNull PositionT fontGetGlyphHAdvance(@NotNull FontT font, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_h_advance.invokeExact(font.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_h_advances = Interop.downcallHandle(
        "hb_font_get_glyph_h_advances",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for horizontal text segments.
     */
    public static @NotNull void fontGetGlyphHAdvances(@NotNull FontT font, @NotNull int count, @NotNull CodepointT firstGlyph, @NotNull int glyphStride, @NotNull Out<PositionT> firstAdvance, @NotNull int advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_h_advances.invokeExact(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, (Addressable) firstAdvancePOINTER.address(), advanceStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.set(new PositionT(firstAdvancePOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_font_get_glyph_h_kerning = Interop.downcallHandle(
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
    public static @NotNull PositionT fontGetGlyphHKerning(@NotNull FontT font, @NotNull CodepointT leftGlyph, @NotNull CodepointT rightGlyph) {
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_h_kerning.invokeExact(font.handle(), leftGlyph.getValue(), rightGlyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_h_origin = Interop.downcallHandle(
        "hb_font_get_glyph_h_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for horizontal text segments.
     */
    public static @NotNull BoolT fontGetGlyphHOrigin(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_h_origin.invokeExact(font.handle(), glyph.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_kerning_for_direction = Interop.downcallHandle(
        "hb_font_get_glyph_kerning_for_direction",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     */
    public static @NotNull void fontGetGlyphKerningForDirection(@NotNull FontT font, @NotNull CodepointT firstGlyph, @NotNull CodepointT secondGlyph, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_kerning_for_direction.invokeExact(font.handle(), firstGlyph.getValue(), secondGlyph.getValue(), direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_font_get_glyph_name = Interop.downcallHandle(
        "hb_font_get_glyph_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the glyph-name string for a glyph ID in the specified {@code font}.
     */
    public static @NotNull BoolT fontGetGlyphName(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull Out<java.lang.String[]> name, @NotNull Out<Integer> size) {
        MemorySegment namePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_name.invokeExact(font.handle(), glyph.getValue(), (Addressable) namePOINTER.address(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] nameARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = namePOINTER.get(ValueLayout.ADDRESS, I);
            nameARRAY[I] = OBJ.getUtf8String(0);
        }
        name.set(nameARRAY);
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_origin_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontGetGlyphOriginForDirection(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_font_get_glyph_shape = Interop.downcallHandle(
        "hb_font_get_glyph_shape",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph shape that corresponds to a glyph in the specified {@code font}.
     * The shape is returned by way of calls to the callsbacks of the {@code dfuncs}
     * objects, with {@code draw_data} passed to them.
     */
    public static @NotNull void fontGetGlyphShape(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData) {
        try {
            hb_font_get_glyph_shape.invokeExact(font.handle(), glyph.getValue(), dfuncs.handle(), drawData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_get_glyph_v_advance = Interop.downcallHandle(
        "hb_font_get_glyph_v_advance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for vertical text segments.
     */
    public static @NotNull PositionT fontGetGlyphVAdvance(@NotNull FontT font, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_v_advance.invokeExact(font.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_glyph_v_advances = Interop.downcallHandle(
        "hb_font_get_glyph_v_advances",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for vertical text segments.
     */
    public static @NotNull void fontGetGlyphVAdvances(@NotNull FontT font, @NotNull int count, @NotNull CodepointT firstGlyph, @NotNull int glyphStride, @NotNull Out<PositionT> firstAdvance, @NotNull Out<Integer> advanceStride) {
        PointerInteger firstGlyphPOINTER = new PointerInteger(firstGlyph.getValue());
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment advanceStridePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_glyph_v_advances.invokeExact(font.handle(), count, new PointerInteger(firstGlyph.getValue()).handle(), glyphStride, (Addressable) firstAdvancePOINTER.address(), (Addressable) advanceStridePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            firstGlyph.setValue(firstGlyphPOINTER.get());
        firstAdvance.set(new PositionT(firstAdvancePOINTER.get(ValueLayout.JAVA_INT, 0)));
        advanceStride.set(advanceStridePOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_font_get_glyph_v_origin = Interop.downcallHandle(
        "hb_font_get_glyph_v_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for vertical text segments.
     */
    public static @NotNull BoolT fontGetGlyphVOrigin(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_glyph_v_origin.invokeExact(font.handle(), glyph.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_h_extents = Interop.downcallHandle(
        "hb_font_get_h_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the extents for a specified font, for horizontal
     * text segments.
     */
    public static @NotNull BoolT fontGetHExtents(@NotNull FontT font, @NotNull Out<FontExtentsT> extents) {
        MemorySegment extentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_h_extents.invokeExact(font.handle(), (Addressable) extentsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        extents.set(new FontExtentsT(Refcounted.get(extentsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_nominal_glyph = Interop.downcallHandle(
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
    public static @NotNull BoolT fontGetNominalGlyph(@NotNull FontT font, @NotNull CodepointT unicode, @NotNull Out<CodepointT> glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_nominal_glyph.invokeExact(font.handle(), unicode.getValue(), (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.set(new CodepointT(glyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_nominal_glyphs = Interop.downcallHandle(
        "hb_font_get_nominal_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
     * IDs must be returned in a {@link codepoint_t} output parameter.
     */
    public static int fontGetNominalGlyphs(@NotNull FontT font, @NotNull int count, @NotNull CodepointT firstUnicode, @NotNull int unicodeStride, @NotNull Out<CodepointT> firstGlyph, @NotNull int glyphStride) {
        PointerInteger firstUnicodePOINTER = new PointerInteger(firstUnicode.getValue());
        MemorySegment firstGlyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_nominal_glyphs.invokeExact(font.handle(), count, new PointerInteger(firstUnicode.getValue()).handle(), unicodeStride, (Addressable) firstGlyphPOINTER.address(), glyphStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            firstUnicode.setValue(firstUnicodePOINTER.get());
        firstGlyph.set(new CodepointT(firstGlyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return RESULT;
    }
    
    private static final MethodHandle hb_font_get_parent = Interop.downcallHandle(
        "hb_font_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the parent font of {@code font}.
     */
    public static @NotNull FontT fontGetParent(@NotNull FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_parent.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_font_get_ppem = Interop.downcallHandle(
        "hb_font_get_ppem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the horizontal and vertical points-per-em (ppem) of a font.
     */
    public static @NotNull void fontGetPpem(@NotNull FontT font, @NotNull Out<Integer> xPpem, @NotNull Out<Integer> yPpem) {
        MemorySegment xPpemPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPpemPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_ppem.invokeExact(font.handle(), (Addressable) xPpemPOINTER.address(), (Addressable) yPpemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPpem.set(xPpemPOINTER.get(ValueLayout.JAVA_INT, 0));
        yPpem.set(yPpemPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_font_get_ptem = Interop.downcallHandle(
        "hb_font_get_ptem",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the "point size" of a font. Used in CoreText to
     * implement optical sizing.
     */
    public static float fontGetPtem(@NotNull FontT font) {
        float RESULT;
        try {
            RESULT = (float) hb_font_get_ptem.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_font_get_scale = Interop.downcallHandle(
        "hb_font_get_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the horizontal and vertical scale of a font.
     */
    public static @NotNull void fontGetScale(@NotNull FontT font, @NotNull Out<Integer> xScale, @NotNull Out<Integer> yScale) {
        MemorySegment xScalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yScalePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_get_scale.invokeExact(font.handle(), (Addressable) xScalePOINTER.address(), (Addressable) yScalePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xScale.set(xScalePOINTER.get(ValueLayout.JAVA_INT, 0));
        yScale.set(yScalePOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_font_get_synthetic_slant = Interop.downcallHandle(
        "hb_font_get_synthetic_slant",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the "synthetic slant" of a font.
     */
    public static float fontGetSyntheticSlant(@NotNull FontT font) {
        float RESULT;
        try {
            RESULT = (float) hb_font_get_synthetic_slant.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_font_get_user_data = Interop.downcallHandle(
        "hb_font_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user-data object associated with the specified key,
     * attached to the specified font object.
     */
    public static @Nullable java.lang.foreign.MemoryAddress fontGetUserData(@NotNull FontT font, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_user_data.invokeExact(font.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_font_get_v_extents = Interop.downcallHandle(
        "hb_font_get_v_extents",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the extents for a specified font, for vertical
     * text segments.
     */
    public static @NotNull BoolT fontGetVExtents(@NotNull FontT font, @NotNull Out<FontExtentsT> extents) {
        MemorySegment extentsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_v_extents.invokeExact(font.handle(), (Addressable) extentsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        extents.set(new FontExtentsT(Refcounted.get(extentsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_get_var_coords_design = Interop.downcallHandle(
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
    public static PointerFloat fontGetVarCoordsDesign(@NotNull FontT font, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_var_coords_design.invokeExact(font.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new PointerFloat(RESULT);
    }
    
    private static final MethodHandle hb_font_get_var_coords_normalized = Interop.downcallHandle(
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
    public static PointerInteger fontGetVarCoordsNormalized(@NotNull FontT font, @NotNull Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_get_var_coords_normalized.invokeExact(font.handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new PointerInteger(RESULT);
    }
    
    private static final MethodHandle hb_font_get_variation_glyph = Interop.downcallHandle(
        "hb_font_get_variation_glyph",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID for a Unicode code point when followed by
     * by the specified variation-selector code point, in the specified
     * font.
     */
    public static @NotNull BoolT fontGetVariationGlyph(@NotNull FontT font, @NotNull CodepointT unicode, @NotNull CodepointT variationSelector, @NotNull Out<CodepointT> glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_get_variation_glyph.invokeExact(font.handle(), unicode.getValue(), variationSelector.getValue(), (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.set(new CodepointT(glyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_glyph_from_string = Interop.downcallHandle(
        "hb_font_glyph_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the glyph ID from {@code font} that matches the specified string.
     * Strings of the format {@code gidDDD} or {@code uniUUUU} are parsed automatically.
     * <p>
     * &lt;note&gt;Note: {@code len} == -1 means the string is null-terminated.&lt;/note&gt;
     */
    public static @NotNull BoolT fontGlyphFromString(@NotNull FontT font, @NotNull byte[] s, @NotNull int len, @NotNull Out<CodepointT> glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_font_glyph_from_string.invokeExact(font.handle(), Interop.allocateNativeArray(s), len, (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.set(new CodepointT(glyphPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_glyph_to_string = Interop.downcallHandle(
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
    public static @NotNull void fontGlyphToString(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull Out<java.lang.String[]> s, @NotNull Out<Integer> size) {
        MemorySegment sPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_glyph_to_string.invokeExact(font.handle(), glyph.getValue(), (Addressable) sPOINTER.address(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] sARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = sPOINTER.get(ValueLayout.ADDRESS, I);
            sARRAY[I] = OBJ.getUtf8String(0);
        }
        s.set(sARRAY);
    }
    
    private static final MethodHandle hb_font_is_immutable = Interop.downcallHandle(
        "hb_font_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a font object is immutable.
     */
    public static @NotNull BoolT fontIsImmutable(@NotNull FontT font) {
        int RESULT;
        try {
            RESULT = (int) hb_font_is_immutable.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_font_make_immutable = Interop.downcallHandle(
        "hb_font_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code font} immutable.
     */
    public static @NotNull void fontMakeImmutable(@NotNull FontT font) {
        try {
            hb_font_make_immutable.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_reference = Interop.downcallHandle(
        "hb_font_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on the given font object.
     */
    public static @NotNull FontT fontReference(@NotNull FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_font_reference.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_font_set_face = Interop.downcallHandle(
        "hb_font_set_face",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code face} as the font-face value of {@code font}.
     */
    public static @NotNull void fontSetFace(@NotNull FontT font, @NotNull FaceT face) {
        try {
            hb_font_set_face.invokeExact(font.handle(), face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_parent = Interop.downcallHandle(
        "hb_font_set_parent",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the parent font of {@code font}.
     */
    public static @NotNull void fontSetParent(@NotNull FontT font, @NotNull FontT parent) {
        try {
            hb_font_set_parent.invokeExact(font.handle(), parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_ppem = Interop.downcallHandle(
        "hb_font_set_ppem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the horizontal and vertical pixels-per-em (ppem) of a font.
     */
    public static @NotNull void fontSetPpem(@NotNull FontT font, @NotNull int xPpem, @NotNull int yPpem) {
        try {
            hb_font_set_ppem.invokeExact(font.handle(), xPpem, yPpem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_ptem = Interop.downcallHandle(
        "hb_font_set_ptem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the "point size" of a font. Set to zero to unset.
     * Used in CoreText to implement optical sizing.
     * <p>
     * &lt;note&gt;Note: There are 72 points in an inch.&lt;/note&gt;
     */
    public static @NotNull void fontSetPtem(@NotNull FontT font, @NotNull float ptem) {
        try {
            hb_font_set_ptem.invokeExact(font.handle(), ptem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_scale = Interop.downcallHandle(
        "hb_font_set_scale",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the horizontal and vertical scale of a font.
     */
    public static @NotNull void fontSetScale(@NotNull FontT font, @NotNull int xScale, @NotNull int yScale) {
        try {
            hb_font_set_scale.invokeExact(font.handle(), xScale, yScale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_synthetic_slant = Interop.downcallHandle(
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
    public static @NotNull void fontSetSyntheticSlant(@NotNull FontT font, @NotNull float slant) {
        try {
            hb_font_set_synthetic_slant.invokeExact(font.handle(), slant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_var_coords_design = Interop.downcallHandle(
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
    public static @NotNull void fontSetVarCoordsDesign(@NotNull FontT font, @NotNull float[] coords, @NotNull int coordsLength) {
        try {
            hb_font_set_var_coords_design.invokeExact(font.handle(), Interop.allocateNativeArray(coords), coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_var_coords_normalized = Interop.downcallHandle(
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
     * &lt;note&gt;Note: Coordinates should be normalized to 2.14.&lt;/note&gt;
     */
    public static @NotNull void fontSetVarCoordsNormalized(@NotNull FontT font, @NotNull int[] coords, @NotNull int coordsLength) {
        try {
            hb_font_set_var_coords_normalized.invokeExact(font.handle(), Interop.allocateNativeArray(coords), coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_var_named_instance = Interop.downcallHandle(
        "hb_font_set_var_named_instance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets design coords of a font from a named instance index.
     */
    public static @NotNull void fontSetVarNamedInstance(@NotNull FontT font, @NotNull int instanceIndex) {
        try {
            hb_font_set_var_named_instance.invokeExact(font.handle(), instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_set_variations = Interop.downcallHandle(
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
    public static @NotNull void fontSetVariations(@NotNull FontT font, @NotNull VariationT[] variations, @NotNull int variationsLength) {
        try {
            hb_font_set_variations.invokeExact(font.handle(), Interop.allocateNativeArray(variations), variationsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_font_subtract_glyph_origin_for_direction = Interop.downcallHandle(
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
    public static @NotNull void fontSubtractGlyphOriginForDirection(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull Out<PositionT> x, @NotNull Out<PositionT> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_font_subtract_glyph_origin_for_direction.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(new PositionT(xPOINTER.get(ValueLayout.JAVA_INT, 0)));
        y.set(new PositionT(yPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_ft_font_changed = Interop.downcallHandle(
        "hb_ft_font_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Refreshes the state of {@code font} when the underlying FT_Face has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the FT_Face.
     */
    public static @NotNull void ftFontChanged(@NotNull FontT font) {
        try {
            hb_ft_font_changed.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_ft_font_get_load_flags = Interop.downcallHandle(
        "hb_ft_font_get_load_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the FT_Load_Glyph load flags of the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static int ftFontGetLoadFlags(@NotNull FontT font) {
        int RESULT;
        try {
            RESULT = (int) hb_ft_font_get_load_flags.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ft_font_set_funcs = Interop.downcallHandle(
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
    public static @NotNull void ftFontSetFuncs(@NotNull FontT font) {
        try {
            hb_ft_font_set_funcs.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_ft_font_set_load_flags = Interop.downcallHandle(
        "hb_ft_font_set_load_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the FT_Load_Glyph load flags for the specified {@link font_t}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     */
    public static @NotNull void ftFontSetLoadFlags(@NotNull FontT font, @NotNull int loadFlags) {
        try {
            hb_ft_font_set_load_flags.invokeExact(font.handle(), loadFlags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_ft_font_unlock_face = Interop.downcallHandle(
        "hb_ft_font_unlock_face",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases an FT_Face previously obtained with hb_ft_font_lock_face().
     */
    public static @NotNull void ftFontUnlockFace(@NotNull FontT font) {
        try {
            hb_ft_font_unlock_face.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_glib_blob_create = Interop.downcallHandle(
        "hb_glib_blob_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates an {@link blob_t} blob from the specified
     * GBytes data structure.
     */
    public static @NotNull BlobT glibBlobCreate(@NotNull org.gtk.glib.Bytes gbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_glib_blob_create.invokeExact(gbytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_glib_get_unicode_funcs = Interop.downcallHandle(
        "hb_glib_get_unicode_funcs",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     */
    public static @NotNull UnicodeFuncsT glibGetUnicodeFuncs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_glib_get_unicode_funcs.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_glib_script_from_script = Interop.downcallHandle(
        "hb_glib_script_from_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the GUnicodeScript identifier that corresponds to the
     * specified {@link script_t} script.
     */
    public static @NotNull org.gtk.glib.UnicodeScript glibScriptFromScript(@NotNull ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) hb_glib_script_from_script.invokeExact(script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.UnicodeScript(RESULT);
    }
    
    private static final MethodHandle hb_glib_script_to_script = Interop.downcallHandle(
        "hb_glib_script_to_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@link script_t} script that corresponds to the
     * specified GUnicodeScript identifier.
     */
    public static @NotNull ScriptT glibScriptToScript(@NotNull org.gtk.glib.UnicodeScript script) {
        int RESULT;
        try {
            RESULT = (int) hb_glib_script_to_script.invokeExact(script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_glyph_info_get_glyph_flags = Interop.downcallHandle(
        "hb_glyph_info_get_glyph_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns glyph flags encoded within a {@link glyph_info_t}.
     */
    public static @NotNull GlyphFlagsT glyphInfoGetGlyphFlags(@NotNull GlyphInfoT info) {
        int RESULT;
        try {
            RESULT = (int) hb_glyph_info_get_glyph_flags.invokeExact(info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new GlyphFlagsT(RESULT);
    }
    
    private static final MethodHandle hb_language_from_string = Interop.downcallHandle(
        "hb_language_from_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts {@code str} representing a BCP 47 language tag to the corresponding
     * {@link language_t}.
     */
    public static @NotNull LanguageT languageFromString(@NotNull byte[] str, @NotNull int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_language_from_string.invokeExact(Interop.allocateNativeArray(str), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_language_get_default = Interop.downcallHandle(
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
    public static @NotNull LanguageT languageGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_language_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_language_to_string = Interop.downcallHandle(
        "hb_language_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link language_t} to a string.
     */
    public static @NotNull java.lang.String languageToString(@NotNull LanguageT language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_language_to_string.invokeExact(language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle hb_map_allocation_successful = Interop.downcallHandle(
        "hb_map_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static @NotNull BoolT mapAllocationSuccessful(@NotNull MapT map) {
        int RESULT;
        try {
            RESULT = (int) hb_map_allocation_successful.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_map_clear = Interop.downcallHandle(
        "hb_map_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears out the contents of {@code map}.
     */
    public static @NotNull void mapClear(@NotNull MapT map) {
        try {
            hb_map_clear.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_map_create = Interop.downcallHandle(
        "hb_map_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new, initially empty map.
     */
    public static @NotNull MapT mapCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_map_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_map_del = Interop.downcallHandle(
        "hb_map_del",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes {@code key} and its stored value from {@code map}.
     */
    public static @NotNull void mapDel(@NotNull MapT map, @NotNull CodepointT key) {
        try {
            hb_map_del.invokeExact(map.handle(), key.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_map_destroy = Interop.downcallHandle(
        "hb_map_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a map. When
     * the reference count reaches zero, the map is
     * destroyed, freeing all memory.
     */
    public static @NotNull void mapDestroy(@NotNull MapT map) {
        try {
            hb_map_destroy.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_map_get = Interop.downcallHandle(
        "hb_map_get",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the value stored for {@code key} in {@code map}.
     */
    public static @NotNull CodepointT mapGet(@NotNull MapT map, @NotNull CodepointT key) {
        int RESULT;
        try {
            RESULT = (int) hb_map_get.invokeExact(map.handle(), key.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_map_get_empty = Interop.downcallHandle(
        "hb_map_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty {@link map_t}.
     */
    public static @NotNull MapT mapGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_map_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_map_get_population = Interop.downcallHandle(
        "hb_map_get_population",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of key-value pairs in the map.
     */
    public static int mapGetPopulation(@NotNull MapT map) {
        int RESULT;
        try {
            RESULT = (int) hb_map_get_population.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_map_get_user_data = Interop.downcallHandle(
        "hb_map_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified map.
     */
    public static @Nullable java.lang.foreign.MemoryAddress mapGetUserData(@NotNull MapT map, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_map_get_user_data.invokeExact(map.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_map_has = Interop.downcallHandle(
        "hb_map_has",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether {@code key} is an element of {@code map}.
     */
    public static @NotNull BoolT mapHas(@NotNull MapT map, @NotNull CodepointT key) {
        int RESULT;
        try {
            RESULT = (int) hb_map_has.invokeExact(map.handle(), key.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_map_is_empty = Interop.downcallHandle(
        "hb_map_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code map} is empty (contains no elements).
     */
    public static @NotNull BoolT mapIsEmpty(@NotNull MapT map) {
        int RESULT;
        try {
            RESULT = (int) hb_map_is_empty.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_map_reference = Interop.downcallHandle(
        "hb_map_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a map.
     */
    public static @NotNull MapT mapReference(@NotNull MapT map) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_map_reference.invokeExact(map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MapT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_map_set = Interop.downcallHandle(
        "hb_map_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Stores {@code key}:{@code value} in the map.
     */
    public static @NotNull void mapSet(@NotNull MapT map, @NotNull CodepointT key, @NotNull CodepointT value) {
        try {
            hb_map_set.invokeExact(map.handle(), key.getValue(), value.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_ot_color_glyph_get_layers = Interop.downcallHandle(
        "hb_ot_color_glyph_get_layers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all color layers for the specified glyph index in the specified
     * face. The list returned will begin at the offset provided.
     */
    public static int otColorGlyphGetLayers(@NotNull FaceT face, @NotNull CodepointT glyph, @NotNull int startOffset, @NotNull Out<Integer> layerCount, @Nullable Out<OtColorLayerT[]> layers) {
        MemorySegment layerCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment layersPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_glyph_get_layers.invokeExact(face.handle(), glyph.getValue(), startOffset, (Addressable) layerCountPOINTER.address(), (Addressable) layersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        layerCount.set(layerCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtColorLayerT[] layersARRAY = new OtColorLayerT[layerCount.get().intValue()];
        for (int I = 0; I < layerCount.get().intValue(); I++) {
            var OBJ = layersPOINTER.get(ValueLayout.ADDRESS, I);
            layersARRAY[I] = new OtColorLayerT(Refcounted.get(OBJ, false));
        }
        layers.set(layersARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_color_glyph_reference_png = Interop.downcallHandle(
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
    public static @NotNull BlobT otColorGlyphReferencePng(@NotNull FontT font, @NotNull CodepointT glyph) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_ot_color_glyph_reference_png.invokeExact(font.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_ot_color_glyph_reference_svg = Interop.downcallHandle(
        "hb_ot_color_glyph_reference_svg",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the SVG document for a glyph. The blob may be either plain text or gzip-encoded.
     * <p>
     * If the glyph has no SVG document, the singleton empty blob is returned.
     */
    public static @NotNull BlobT otColorGlyphReferenceSvg(@NotNull FaceT face, @NotNull CodepointT glyph) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_ot_color_glyph_reference_svg.invokeExact(face.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_ot_color_has_layers = Interop.downcallHandle(
        "hb_ot_color_has_layers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any {@code COLR} color layers.
     */
    public static @NotNull BoolT otColorHasLayers(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_has_layers.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_has_palettes = Interop.downcallHandle(
        "hb_ot_color_has_palettes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes a {@code CPAL} color-palette table.
     */
    public static @NotNull BoolT otColorHasPalettes(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_has_palettes.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_has_png = Interop.downcallHandle(
        "hb_ot_color_has_png",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has PNG glyph images (either in {@code CBDT} or {@code sbix} tables).
     */
    public static @NotNull BoolT otColorHasPng(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_has_png.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_has_svg = Interop.downcallHandle(
        "hb_ot_color_has_svg",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any {@code SVG} glyph images.
     */
    public static @NotNull BoolT otColorHasSvg(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_has_svg.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_palette_color_get_name_id = Interop.downcallHandle(
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
    public static @NotNull OtNameIdT otColorPaletteColorGetNameId(@NotNull FaceT face, @NotNull int colorIndex) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_palette_color_get_name_id.invokeExact(face.handle(), colorIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtNameIdT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_palette_get_colors = Interop.downcallHandle(
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
    public static int otColorPaletteGetColors(@NotNull FaceT face, @NotNull int paletteIndex, @NotNull int startOffset, @NotNull Out<Integer> colorCount, @Nullable Out<ColorT[]> colors) {
        MemorySegment colorCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment colorsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_palette_get_colors.invokeExact(face.handle(), paletteIndex, startOffset, (Addressable) colorCountPOINTER.address(), (Addressable) colorsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        colorCount.set(colorCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        ColorT[] colorsARRAY = new ColorT[colorCount.get().intValue()];
        for (int I = 0; I < colorCount.get().intValue(); I++) {
            var OBJ = colorsPOINTER.get(ValueLayout.JAVA_INT, I);
            colorsARRAY[I] = new ColorT(OBJ);
        }
        colors.set(colorsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_color_palette_get_count = Interop.downcallHandle(
        "hb_ot_color_palette_get_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of color palettes in a face.
     */
    public static int otColorPaletteGetCount(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_palette_get_count.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_color_palette_get_flags = Interop.downcallHandle(
        "hb_ot_color_palette_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the flags defined for a color palette.
     */
    public static @NotNull OtColorPaletteFlagsT otColorPaletteGetFlags(@NotNull FaceT face, @NotNull int paletteIndex) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_palette_get_flags.invokeExact(face.handle(), paletteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtColorPaletteFlagsT(RESULT);
    }
    
    private static final MethodHandle hb_ot_color_palette_get_name_id = Interop.downcallHandle(
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
    public static @NotNull OtNameIdT otColorPaletteGetNameId(@NotNull FaceT face, @NotNull int paletteIndex) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_color_palette_get_name_id.invokeExact(face.handle(), paletteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtNameIdT(RESULT);
    }
    
    private static final MethodHandle hb_ot_font_set_funcs = Interop.downcallHandle(
        "hb_ot_font_set_funcs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the font functions to use when working with {@code font}.
     */
    public static @NotNull void otFontSetFuncs(@NotNull FontT font) {
        try {
            hb_ot_font_set_funcs.invokeExact(font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_ot_layout_collect_features = Interop.downcallHandle(
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
    public static @NotNull void otLayoutCollectFeatures(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull TagT scripts, @NotNull TagT languages, @NotNull TagT features, @NotNull Out<SetT> featureIndexes) {
        PointerInteger scriptsPOINTER = new PointerInteger(scripts.getValue());
        PointerInteger languagesPOINTER = new PointerInteger(languages.getValue());
        PointerInteger featuresPOINTER = new PointerInteger(features.getValue());
        MemorySegment featureIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_collect_features.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), (Addressable) featureIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            scripts.setValue(scriptsPOINTER.get());
            languages.setValue(languagesPOINTER.get());
            features.setValue(featuresPOINTER.get());
        featureIndexes.set(new SetT(Refcounted.get(featureIndexesPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_collect_lookups = Interop.downcallHandle(
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
    public static @NotNull void otLayoutCollectLookups(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull TagT scripts, @NotNull TagT languages, @NotNull TagT features, @NotNull Out<SetT> lookupIndexes) {
        PointerInteger scriptsPOINTER = new PointerInteger(scripts.getValue());
        PointerInteger languagesPOINTER = new PointerInteger(languages.getValue());
        PointerInteger featuresPOINTER = new PointerInteger(features.getValue());
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_collect_lookups.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scripts.getValue()).handle(), new PointerInteger(languages.getValue()).handle(), new PointerInteger(features.getValue()).handle(), (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            scripts.setValue(scriptsPOINTER.get());
            languages.setValue(languagesPOINTER.get());
            features.setValue(featuresPOINTER.get());
        lookupIndexes.set(new SetT(Refcounted.get(lookupIndexesPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_feature_get_characters = Interop.downcallHandle(
        "hb_ot_layout_feature_get_characters",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of the characters defined as having a variant under the specified
     * "Character Variant" ("cvXX") feature tag.
     */
    public static int otLayoutFeatureGetCharacters(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int featureIndex, @NotNull int startOffset, @NotNull Out<Integer> charCount, @NotNull Out<CodepointT[]> characters) {
        MemorySegment charCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment charactersPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_feature_get_characters.invokeExact(face.handle(), tableTag.getValue(), featureIndex, startOffset, (Addressable) charCountPOINTER.address(), (Addressable) charactersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        charCount.set(charCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        CodepointT[] charactersARRAY = new CodepointT[charCount.get().intValue()];
        for (int I = 0; I < charCount.get().intValue(); I++) {
            var OBJ = charactersPOINTER.get(ValueLayout.JAVA_INT, I);
            charactersARRAY[I] = new CodepointT(OBJ);
        }
        characters.set(charactersARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_feature_get_lookups = Interop.downcallHandle(
        "hb_ot_layout_feature_get_lookups",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table. The list returned will
     * begin at the offset provided.
     */
    public static int otLayoutFeatureGetLookups(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int featureIndex, @NotNull int startOffset, @NotNull Out<Integer> lookupCount, @NotNull Out<int[]> lookupIndexes) {
        MemorySegment lookupCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_feature_get_lookups.invokeExact(face.handle(), tableTag.getValue(), featureIndex, startOffset, (Addressable) lookupCountPOINTER.address(), (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lookupCount.set(lookupCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        lookupIndexes.set(MemorySegment.ofAddress(lookupIndexesPOINTER.get(ValueLayout.ADDRESS, 0), lookupCount.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_feature_get_name_ids = Interop.downcallHandle(
        "hb_ot_layout_feature_get_name_ids",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches name indices from feature parameters for "Stylistic Set" ('ssXX') or
     * "Character Variant" ('cvXX') features.
     */
    public static @NotNull BoolT otLayoutFeatureGetNameIds(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int featureIndex, @NotNull Out<OtNameIdT> labelId, @NotNull Out<OtNameIdT> tooltipId, @NotNull Out<OtNameIdT> sampleId, @NotNull Out<Integer> numNamedParameters, @NotNull Out<OtNameIdT> firstParamId) {
        MemorySegment labelIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment tooltipIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment sampleIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment numNamedParametersPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment firstParamIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_feature_get_name_ids.invokeExact(face.handle(), tableTag.getValue(), featureIndex, (Addressable) labelIdPOINTER.address(), (Addressable) tooltipIdPOINTER.address(), (Addressable) sampleIdPOINTER.address(), (Addressable) numNamedParametersPOINTER.address(), (Addressable) firstParamIdPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        labelId.set(new OtNameIdT(labelIdPOINTER.get(ValueLayout.JAVA_INT, 0)));
        tooltipId.set(new OtNameIdT(tooltipIdPOINTER.get(ValueLayout.JAVA_INT, 0)));
        sampleId.set(new OtNameIdT(sampleIdPOINTER.get(ValueLayout.JAVA_INT, 0)));
        numNamedParameters.set(numNamedParametersPOINTER.get(ValueLayout.JAVA_INT, 0));
        firstParamId.set(new OtNameIdT(firstParamIdPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_feature_with_variations_get_lookups = Interop.downcallHandle(
        "hb_ot_layout_feature_with_variations_get_lookups",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table, enabled at the specified
     * variations index. The list returned will begin at the offset provided.
     */
    public static int otLayoutFeatureWithVariationsGetLookups(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int featureIndex, @NotNull int variationsIndex, @NotNull int startOffset, @NotNull Out<Integer> lookupCount, @NotNull Out<int[]> lookupIndexes) {
        MemorySegment lookupCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_feature_with_variations_get_lookups.invokeExact(face.handle(), tableTag.getValue(), featureIndex, variationsIndex, startOffset, (Addressable) lookupCountPOINTER.address(), (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lookupCount.set(lookupCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        lookupIndexes.set(MemorySegment.ofAddress(lookupIndexesPOINTER.get(ValueLayout.ADDRESS, 0), lookupCount.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_get_attach_points = Interop.downcallHandle(
        "hb_ot_layout_get_attach_points",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all attachment points for the specified glyph in the GDEF
     * table of the face. The list returned will begin at the offset provided.
     * <p>
     * Useful if the client program wishes to cache the list.
     */
    public static int otLayoutGetAttachPoints(@NotNull FaceT face, @NotNull CodepointT glyph, @NotNull int startOffset, @NotNull Out<Integer> pointCount, @NotNull Out<int[]> pointArray) {
        MemorySegment pointCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment pointArrayPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_attach_points.invokeExact(face.handle(), glyph.getValue(), startOffset, (Addressable) pointCountPOINTER.address(), (Addressable) pointArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        pointCount.set(pointCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        pointArray.set(MemorySegment.ofAddress(pointArrayPOINTER.get(ValueLayout.ADDRESS, 0), pointCount.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_get_baseline = Interop.downcallHandle(
        "hb_ot_layout_get_baseline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a baseline value from the face.
     */
    public static @NotNull BoolT otLayoutGetBaseline(@NotNull FontT font, @NotNull OtLayoutBaselineTagT baselineTag, @NotNull DirectionT direction, @NotNull TagT scriptTag, @NotNull TagT languageTag, @Nullable Out<PositionT> coord) {
        MemorySegment coordPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_baseline.invokeExact(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), (Addressable) coordPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coord.set(new PositionT(coordPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_get_baseline_with_fallback = Interop.downcallHandle(
        "hb_ot_layout_get_baseline_with_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a baseline value from the face, and synthesizes
     * it if the font does not have it.
     */
    public static @NotNull void otLayoutGetBaselineWithFallback(@NotNull FontT font, @NotNull OtLayoutBaselineTagT baselineTag, @NotNull DirectionT direction, @NotNull TagT scriptTag, @NotNull TagT languageTag, @NotNull Out<PositionT> coord) {
        MemorySegment coordPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_ot_layout_get_baseline_with_fallback.invokeExact(font.handle(), baselineTag.getValue(), direction.getValue(), scriptTag.getValue(), languageTag.getValue(), (Addressable) coordPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coord.set(new PositionT(coordPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_ot_layout_get_glyph_class = Interop.downcallHandle(
        "hb_ot_layout_get_glyph_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the GDEF class of the requested glyph in the specified face.
     */
    public static @NotNull OtLayoutGlyphClassT otLayoutGetGlyphClass(@NotNull FaceT face, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_glyph_class.invokeExact(face.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtLayoutGlyphClassT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_get_glyphs_in_class = Interop.downcallHandle(
        "hb_ot_layout_get_glyphs_in_class",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     */
    public static @NotNull void otLayoutGetGlyphsInClass(@NotNull FaceT face, @NotNull OtLayoutGlyphClassT klass, @NotNull Out<SetT> glyphs) {
        MemorySegment glyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_get_glyphs_in_class.invokeExact(face.handle(), klass.getValue(), (Addressable) glyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphs.set(new SetT(Refcounted.get(glyphsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_get_horizontal_baseline_tag_for_script = Interop.downcallHandle(
        "hb_ot_layout_get_horizontal_baseline_tag_for_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the dominant horizontal baseline tag used by {@code script}.
     */
    public static @NotNull OtLayoutBaselineTagT otLayoutGetHorizontalBaselineTagForScript(@NotNull ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_horizontal_baseline_tag_for_script.invokeExact(script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtLayoutBaselineTagT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_get_ligature_carets = Interop.downcallHandle(
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
    public static int otLayoutGetLigatureCarets(@NotNull FontT font, @NotNull DirectionT direction, @NotNull CodepointT glyph, @NotNull int startOffset, @NotNull Out<Integer> caretCount, @NotNull Out<PositionT[]> caretArray) {
        MemorySegment caretCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment caretArrayPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_ligature_carets.invokeExact(font.handle(), direction.getValue(), glyph.getValue(), startOffset, (Addressable) caretCountPOINTER.address(), (Addressable) caretArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        caretCount.set(caretCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        PositionT[] caretArrayARRAY = new PositionT[caretCount.get().intValue()];
        for (int I = 0; I < caretCount.get().intValue(); I++) {
            var OBJ = caretArrayPOINTER.get(ValueLayout.JAVA_INT, I);
            caretArrayARRAY[I] = new PositionT(OBJ);
        }
        caretArray.set(caretArrayARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_get_size_params = Interop.downcallHandle(
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
    public static @NotNull BoolT otLayoutGetSizeParams(@NotNull FaceT face, @NotNull Out<Integer> designSize, @NotNull Out<Integer> subfamilyId, @NotNull Out<OtNameIdT> subfamilyNameId, @NotNull Out<Integer> rangeStart, @NotNull Out<Integer> rangeEnd) {
        MemorySegment designSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment subfamilyIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment subfamilyNameIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment rangeStartPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment rangeEndPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_get_size_params.invokeExact(face.handle(), (Addressable) designSizePOINTER.address(), (Addressable) subfamilyIdPOINTER.address(), (Addressable) subfamilyNameIdPOINTER.address(), (Addressable) rangeStartPOINTER.address(), (Addressable) rangeEndPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        designSize.set(designSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        subfamilyId.set(subfamilyIdPOINTER.get(ValueLayout.JAVA_INT, 0));
        subfamilyNameId.set(new OtNameIdT(subfamilyNameIdPOINTER.get(ValueLayout.JAVA_INT, 0)));
        rangeStart.set(rangeStartPOINTER.get(ValueLayout.JAVA_INT, 0));
        rangeEnd.set(rangeEndPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_has_glyph_classes = Interop.downcallHandle(
        "hb_ot_layout_has_glyph_classes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has any glyph classes defined in its GDEF table.
     */
    public static @NotNull BoolT otLayoutHasGlyphClasses(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_has_glyph_classes.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_has_positioning = Interop.downcallHandle(
        "hb_ot_layout_has_positioning",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any GPOS positioning.
     */
    public static @NotNull BoolT otLayoutHasPositioning(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_has_positioning.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_has_substitution = Interop.downcallHandle(
        "hb_ot_layout_has_substitution",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified face includes any GSUB substitutions.
     */
    public static @NotNull BoolT otLayoutHasSubstitution(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_has_substitution.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_language_find_feature = Interop.downcallHandle(
        "hb_ot_layout_language_find_feature",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index of a given feature tag in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language.
     */
    public static @NotNull BoolT otLayoutLanguageFindFeature(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageIndex, @NotNull TagT featureTag, @NotNull Out<Integer> featureIndex) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_language_find_feature.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, featureTag.getValue(), (Addressable) featureIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_language_get_feature_indexes = Interop.downcallHandle(
        "hb_ot_layout_language_get_feature_indexes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureIndexes(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageIndex, @NotNull int startOffset, @NotNull Out<Integer> featureCount, @NotNull Out<int[]> featureIndexes) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment featureIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_language_get_feature_indexes.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, (Addressable) featureCountPOINTER.address(), (Addressable) featureIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureCount.set(featureCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        featureIndexes.set(MemorySegment.ofAddress(featureIndexesPOINTER.get(ValueLayout.ADDRESS, 0), featureCount.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_language_get_feature_tags = Interop.downcallHandle(
        "hb_ot_layout_language_get_feature_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     */
    public static int otLayoutLanguageGetFeatureTags(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageIndex, @NotNull int startOffset, @NotNull Out<Integer> featureCount, @NotNull Out<TagT[]> featureTags) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment featureTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_language_get_feature_tags.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, startOffset, (Addressable) featureCountPOINTER.address(), (Addressable) featureTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureCount.set(featureCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        TagT[] featureTagsARRAY = new TagT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featureTagsPOINTER.get(ValueLayout.JAVA_INT, I);
            featureTagsARRAY[I] = new TagT(OBJ);
        }
        featureTags.set(featureTagsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_language_get_required_feature = Interop.downcallHandle(
        "hb_ot_layout_language_get_required_feature",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the tag of a requested feature index in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static @NotNull BoolT otLayoutLanguageGetRequiredFeature(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageIndex, @NotNull Out<Integer> featureIndex, @NotNull Out<TagT> featureTag) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment featureTagPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_language_get_required_feature.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, (Addressable) featureIndexPOINTER.address(), (Addressable) featureTagPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        featureTag.set(new TagT(featureTagPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_language_get_required_feature_index = Interop.downcallHandle(
        "hb_ot_layout_language_get_required_feature_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index of a requested feature in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     */
    public static @NotNull BoolT otLayoutLanguageGetRequiredFeatureIndex(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageIndex, @NotNull Out<Integer> featureIndex) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_language_get_required_feature_index.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageIndex, (Addressable) featureIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_lookup_collect_glyphs = Interop.downcallHandle(
        "hb_ot_layout_lookup_collect_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all glyphs affected by the specified lookup in the
     * specified face's GSUB table or GPOS table.
     */
    public static @NotNull void otLayoutLookupCollectGlyphs(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int lookupIndex, @NotNull Out<SetT> glyphsBefore, @NotNull Out<SetT> glyphsInput, @NotNull Out<SetT> glyphsAfter, @NotNull Out<SetT> glyphsOutput) {
        MemorySegment glyphsBeforePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment glyphsInputPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment glyphsAfterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment glyphsOutputPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_lookup_collect_glyphs.invokeExact(face.handle(), tableTag.getValue(), lookupIndex, (Addressable) glyphsBeforePOINTER.address(), (Addressable) glyphsInputPOINTER.address(), (Addressable) glyphsAfterPOINTER.address(), (Addressable) glyphsOutputPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphsBefore.set(new SetT(Refcounted.get(glyphsBeforePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        glyphsInput.set(new SetT(Refcounted.get(glyphsInputPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        glyphsAfter.set(new SetT(Refcounted.get(glyphsAfterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        glyphsOutput.set(new SetT(Refcounted.get(glyphsOutputPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_lookup_get_glyph_alternates = Interop.downcallHandle(
        "hb_ot_layout_lookup_get_glyph_alternates",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches alternates of a glyph from a given GSUB lookup index.
     */
    public static int otLayoutLookupGetGlyphAlternates(@NotNull FaceT face, @NotNull int lookupIndex, @NotNull CodepointT glyph, @NotNull int startOffset, @NotNull Out<Integer> alternateCount, @NotNull Out<CodepointT[]> alternateGlyphs) {
        MemorySegment alternateCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment alternateGlyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_lookup_get_glyph_alternates.invokeExact(face.handle(), lookupIndex, glyph.getValue(), startOffset, (Addressable) alternateCountPOINTER.address(), (Addressable) alternateGlyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        alternateCount.set(alternateCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        CodepointT[] alternateGlyphsARRAY = new CodepointT[alternateCount.get().intValue()];
        for (int I = 0; I < alternateCount.get().intValue(); I++) {
            var OBJ = alternateGlyphsPOINTER.get(ValueLayout.JAVA_INT, I);
            alternateGlyphsARRAY[I] = new CodepointT(OBJ);
        }
        alternateGlyphs.set(alternateGlyphsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_lookup_substitute_closure = Interop.downcallHandle(
        "hb_ot_layout_lookup_substitute_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the transitive closure of glyphs needed for a
     * specified lookup.
     */
    public static @NotNull void otLayoutLookupSubstituteClosure(@NotNull FaceT face, @NotNull int lookupIndex, @NotNull Out<SetT> glyphs) {
        MemorySegment glyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_lookup_substitute_closure.invokeExact(face.handle(), lookupIndex, (Addressable) glyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphs.set(new SetT(Refcounted.get(glyphsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_lookup_would_substitute = Interop.downcallHandle(
        "hb_ot_layout_lookup_would_substitute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether a specified lookup in the specified face would
     * trigger a substitution on the given glyph sequence.
     */
    public static @NotNull BoolT otLayoutLookupWouldSubstitute(@NotNull FaceT face, @NotNull int lookupIndex, @NotNull CodepointT glyphs, @NotNull int glyphsLength, @NotNull BoolT zeroContext) {
        PointerInteger glyphsPOINTER = new PointerInteger(glyphs.getValue());
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_lookup_would_substitute.invokeExact(face.handle(), lookupIndex, new PointerInteger(glyphs.getValue()).handle(), glyphsLength, zeroContext.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            glyphs.setValue(glyphsPOINTER.get());
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_lookups_substitute_closure = Interop.downcallHandle(
        "hb_ot_layout_lookups_substitute_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compute the transitive closure of glyphs needed for all of the
     * provided lookups.
     */
    public static @NotNull void otLayoutLookupsSubstituteClosure(@NotNull FaceT face, @NotNull SetT lookups, @NotNull Out<SetT> glyphs) {
        MemorySegment glyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_layout_lookups_substitute_closure.invokeExact(face.handle(), lookups.handle(), (Addressable) glyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphs.set(new SetT(Refcounted.get(glyphsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_layout_script_get_language_tags = Interop.downcallHandle(
        "hb_ot_layout_script_get_language_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of language tags in the given face's GSUB or GPOS table, underneath
     * the specified script index. The list returned will begin at the offset provided.
     */
    public static int otLayoutScriptGetLanguageTags(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int startOffset, @NotNull Out<Integer> languageCount, @NotNull Out<TagT[]> languageTags) {
        MemorySegment languageCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment languageTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_script_get_language_tags.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, startOffset, (Addressable) languageCountPOINTER.address(), (Addressable) languageTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        languageCount.set(languageCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        TagT[] languageTagsARRAY = new TagT[languageCount.get().intValue()];
        for (int I = 0; I < languageCount.get().intValue(); I++) {
            var OBJ = languageTagsPOINTER.get(ValueLayout.JAVA_INT, I);
            languageTagsARRAY[I] = new TagT(OBJ);
        }
        languageTags.set(languageTagsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_script_select_language = Interop.downcallHandle(
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
    public static @NotNull BoolT otLayoutScriptSelectLanguage(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptIndex, @NotNull int languageCount, @NotNull TagT languageTags, @NotNull Out<Integer> languageIndex) {
        PointerInteger languageTagsPOINTER = new PointerInteger(languageTags.getValue());
        MemorySegment languageIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_script_select_language.invokeExact(face.handle(), tableTag.getValue(), scriptIndex, languageCount, new PointerInteger(languageTags.getValue()).handle(), (Addressable) languageIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            languageTags.setValue(languageTagsPOINTER.get());
        languageIndex.set(languageIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_table_choose_script = Interop.downcallHandle(
        "hb_ot_layout_table_choose_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deprecated since 2.0.0
     */
    public static @NotNull BoolT otLayoutTableChooseScript(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull TagT scriptTags, @NotNull Out<Integer> scriptIndex, @NotNull Out<TagT> chosenScript) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment chosenScriptPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_choose_script.invokeExact(face.handle(), tableTag.getValue(), new PointerInteger(scriptTags.getValue()).handle(), (Addressable) scriptIndexPOINTER.address(), (Addressable) chosenScriptPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            scriptTags.setValue(scriptTagsPOINTER.get());
        scriptIndex.set(scriptIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        chosenScript.set(new TagT(chosenScriptPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_table_find_feature_variations = Interop.downcallHandle(
        "hb_ot_layout_table_find_feature_variations",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of feature variations in the specified face's GSUB table
     * or GPOS table, at the specified variation coordinates.
     */
    public static @NotNull BoolT otLayoutTableFindFeatureVariations(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull PointerInteger coords, @NotNull int numCoords, @NotNull Out<Integer> variationsIndex) {
        MemorySegment variationsIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_find_feature_variations.invokeExact(face.handle(), tableTag.getValue(), coords.handle(), numCoords, (Addressable) variationsIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variationsIndex.set(variationsIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_table_find_script = Interop.downcallHandle(
        "hb_ot_layout_table_find_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the index if a given script tag in the specified face's GSUB table
     * or GPOS table.
     */
    public static @NotNull BoolT otLayoutTableFindScript(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull TagT scriptTag, @NotNull Out<Integer> scriptIndex) {
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_find_script.invokeExact(face.handle(), tableTag.getValue(), scriptTag.getValue(), (Addressable) scriptIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptIndex.set(scriptIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_layout_table_get_feature_tags = Interop.downcallHandle(
        "hb_ot_layout_table_get_feature_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all feature tags in the given face's GSUB or GPOS table.
     */
    public static int otLayoutTableGetFeatureTags(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int startOffset, @NotNull Out<Integer> featureCount, @NotNull Out<TagT[]> featureTags) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment featureTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_get_feature_tags.invokeExact(face.handle(), tableTag.getValue(), startOffset, (Addressable) featureCountPOINTER.address(), (Addressable) featureTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureCount.set(featureCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        TagT[] featureTagsARRAY = new TagT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featureTagsPOINTER.get(ValueLayout.JAVA_INT, I);
            featureTagsARRAY[I] = new TagT(OBJ);
        }
        featureTags.set(featureTagsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_table_get_lookup_count = Interop.downcallHandle(
        "hb_ot_layout_table_get_lookup_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the total number of lookups enumerated in the specified
     * face's GSUB table or GPOS table.
     */
    public static int otLayoutTableGetLookupCount(@NotNull FaceT face, @NotNull TagT tableTag) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_get_lookup_count.invokeExact(face.handle(), tableTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_table_get_script_tags = Interop.downcallHandle(
        "hb_ot_layout_table_get_script_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all scripts enumerated in the specified face's GSUB table
     * or GPOS table. The list returned will begin at the offset provided.
     */
    public static int otLayoutTableGetScriptTags(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int startOffset, @NotNull Out<Integer> scriptCount, @NotNull Out<TagT[]> scriptTags) {
        MemorySegment scriptCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_get_script_tags.invokeExact(face.handle(), tableTag.getValue(), startOffset, (Addressable) scriptCountPOINTER.address(), (Addressable) scriptTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptCount.set(scriptCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        TagT[] scriptTagsARRAY = new TagT[scriptCount.get().intValue()];
        for (int I = 0; I < scriptCount.get().intValue(); I++) {
            var OBJ = scriptTagsPOINTER.get(ValueLayout.JAVA_INT, I);
            scriptTagsARRAY[I] = new TagT(OBJ);
        }
        scriptTags.set(scriptTagsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_layout_table_select_script = Interop.downcallHandle(
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
    public static @NotNull BoolT otLayoutTableSelectScript(@NotNull FaceT face, @NotNull TagT tableTag, @NotNull int scriptCount, @NotNull TagT scriptTags, @NotNull Out<Integer> scriptIndex, @NotNull Out<TagT> chosenScript) {
        PointerInteger scriptTagsPOINTER = new PointerInteger(scriptTags.getValue());
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment chosenScriptPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_layout_table_select_script.invokeExact(face.handle(), tableTag.getValue(), scriptCount, new PointerInteger(scriptTags.getValue()).handle(), (Addressable) scriptIndexPOINTER.address(), (Addressable) chosenScriptPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            scriptTags.setValue(scriptTagsPOINTER.get());
        scriptIndex.set(scriptIndexPOINTER.get(ValueLayout.JAVA_INT, 0));
        chosenScript.set(new TagT(chosenScriptPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_get_constant = Interop.downcallHandle(
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
    public static @NotNull PositionT otMathGetConstant(@NotNull FontT font, @NotNull OtMathConstantT constant) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_constant.invokeExact(font.handle(), constant.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_assembly = Interop.downcallHandle(
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
    public static int otMathGetGlyphAssembly(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull int startOffset, @NotNull Out<Integer> partsCount, @NotNull Out<OtMathGlyphPartT[]> parts, @NotNull Out<PositionT> italicsCorrection) {
        MemorySegment partsCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment partsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment italicsCorrectionPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_assembly.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), startOffset, (Addressable) partsCountPOINTER.address(), (Addressable) partsPOINTER.address(), (Addressable) italicsCorrectionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        partsCount.set(partsCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        italicsCorrection.set(new PositionT(italicsCorrectionPOINTER.get(ValueLayout.JAVA_INT, 0)));
        OtMathGlyphPartT[] partsARRAY = new OtMathGlyphPartT[partsCount.get().intValue()];
        for (int I = 0; I < partsCount.get().intValue(); I++) {
            var OBJ = partsPOINTER.get(ValueLayout.ADDRESS, I);
            partsARRAY[I] = new OtMathGlyphPartT(Refcounted.get(OBJ, false));
        }
        parts.set(partsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_italics_correction = Interop.downcallHandle(
        "hb_ot_math_get_glyph_italics_correction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches an italics-correction value (if one exists) for the specified
     * glyph index.
     */
    public static @NotNull PositionT otMathGetGlyphItalicsCorrection(@NotNull FontT font, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_italics_correction.invokeExact(font.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_kerning = Interop.downcallHandle(
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
    public static @NotNull PositionT otMathGetGlyphKerning(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull OtMathKernT kern, @NotNull PositionT correctionHeight) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_kerning.invokeExact(font.handle(), glyph.getValue(), kern.getValue(), correctionHeight.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_kernings = Interop.downcallHandle(
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
     * &lt;note&gt;For a glyph with @n defined kern values (where @n > 0), there are only
     * @n−1 defined correction heights, as each correction height defines a boundary
     * past which the next kern value should be selected. Therefore, only the
     * {@link ot_math_kern_entry_t}.kern_value of the uppermost {@link ot_math_kern_entry_t}
     * actually comes from the font; its corresponding
     * {@link ot_math_kern_entry_t}.max_correction_height is always set to
     * &lt;code&gt;INT32_MAX&lt;/code&gt;.&lt;/note&gt;
     */
    public static int otMathGetGlyphKernings(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull OtMathKernT kern, @NotNull int startOffset, @NotNull Out<Integer> entriesCount, @NotNull Out<OtMathKernEntryT[]> kernEntries) {
        MemorySegment entriesCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment kernEntriesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_kernings.invokeExact(font.handle(), glyph.getValue(), kern.getValue(), startOffset, (Addressable) entriesCountPOINTER.address(), (Addressable) kernEntriesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        entriesCount.set(entriesCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtMathKernEntryT[] kernEntriesARRAY = new OtMathKernEntryT[entriesCount.get().intValue()];
        for (int I = 0; I < entriesCount.get().intValue(); I++) {
            var OBJ = kernEntriesPOINTER.get(ValueLayout.ADDRESS, I);
            kernEntriesARRAY[I] = new OtMathKernEntryT(Refcounted.get(OBJ, false));
        }
        kernEntries.set(kernEntriesARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_top_accent_attachment = Interop.downcallHandle(
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
    public static @NotNull PositionT otMathGetGlyphTopAccentAttachment(@NotNull FontT font, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_top_accent_attachment.invokeExact(font.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_get_glyph_variants = Interop.downcallHandle(
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
    public static int otMathGetGlyphVariants(@NotNull FontT font, @NotNull CodepointT glyph, @NotNull DirectionT direction, @NotNull int startOffset, @NotNull Out<Integer> variantsCount, @NotNull Out<OtMathGlyphVariantT[]> variants) {
        MemorySegment variantsCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment variantsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_glyph_variants.invokeExact(font.handle(), glyph.getValue(), direction.getValue(), startOffset, (Addressable) variantsCountPOINTER.address(), (Addressable) variantsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variantsCount.set(variantsCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtMathGlyphVariantT[] variantsARRAY = new OtMathGlyphVariantT[variantsCount.get().intValue()];
        for (int I = 0; I < variantsCount.get().intValue(); I++) {
            var OBJ = variantsPOINTER.get(ValueLayout.ADDRESS, I);
            variantsARRAY[I] = new OtMathGlyphVariantT(Refcounted.get(OBJ, false));
        }
        variants.set(variantsARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_math_get_min_connector_overlap = Interop.downcallHandle(
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
    public static @NotNull PositionT otMathGetMinConnectorOverlap(@NotNull FontT font, @NotNull DirectionT direction) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_get_min_connector_overlap.invokeExact(font.handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_has_data = Interop.downcallHandle(
        "hb_ot_math_has_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face has a {@code MATH} table.
     */
    public static @NotNull BoolT otMathHasData(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_has_data.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_math_is_glyph_extended_shape = Interop.downcallHandle(
        "hb_ot_math_is_glyph_extended_shape",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether the given glyph index is an extended shape in the face.
     */
    public static @NotNull BoolT otMathIsGlyphExtendedShape(@NotNull FaceT face, @NotNull CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_math_is_glyph_extended_shape.invokeExact(face.handle(), glyph.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_meta_get_entry_tags = Interop.downcallHandle(
        "hb_ot_meta_get_entry_tags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches all available feature types.
     */
    public static int otMetaGetEntryTags(@NotNull FaceT face, @NotNull int startOffset, @NotNull Out<Integer> entriesCount, @NotNull Out<OtMetaTagT[]> entries) {
        MemorySegment entriesCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment entriesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_meta_get_entry_tags.invokeExact(face.handle(), startOffset, (Addressable) entriesCountPOINTER.address(), (Addressable) entriesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        entriesCount.set(entriesCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtMetaTagT[] entriesARRAY = new OtMetaTagT[entriesCount.get().intValue()];
        for (int I = 0; I < entriesCount.get().intValue(); I++) {
            var OBJ = entriesPOINTER.get(ValueLayout.JAVA_INT, I);
            entriesARRAY[I] = new OtMetaTagT(OBJ);
        }
        entries.set(entriesARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_meta_reference_entry = Interop.downcallHandle(
        "hb_ot_meta_reference_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * It fetches metadata entry of a given tag from a font.
     */
    public static @NotNull BlobT otMetaReferenceEntry(@NotNull FaceT face, @NotNull OtMetaTagT metaTag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_ot_meta_reference_entry.invokeExact(face.handle(), metaTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BlobT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_ot_metrics_get_position = Interop.downcallHandle(
        "hb_ot_metrics_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font}.
     */
    public static @NotNull BoolT otMetricsGetPosition(@NotNull FontT font, @NotNull OtMetricsTagT metricsTag, @NotNull Out<PositionT> position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_ot_metrics_get_position.invokeExact(font.handle(), metricsTag.getValue(), (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(new PositionT(positionPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_metrics_get_position_with_fallback = Interop.downcallHandle(
        "hb_ot_metrics_get_position_with_fallback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font},
     * and synthesizes a value if it the value is missing in the font.
     */
    public static @NotNull void otMetricsGetPositionWithFallback(@NotNull FontT font, @NotNull OtMetricsTagT metricsTag, @NotNull Out<PositionT> position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_ot_metrics_get_position_with_fallback.invokeExact(font.handle(), metricsTag.getValue(), (Addressable) positionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        position.set(new PositionT(positionPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_ot_metrics_get_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font} with the
     * current font variation settings applied.
     */
    public static float otMetricsGetVariation(@NotNull FontT font, @NotNull OtMetricsTagT metricsTag) {
        float RESULT;
        try {
            RESULT = (float) hb_ot_metrics_get_variation.invokeExact(font.handle(), metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_metrics_get_x_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_x_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches horizontal metrics value corresponding to {@code metrics_tag} from {@code font}
     * with the current font variation settings applied.
     */
    public static @NotNull PositionT otMetricsGetXVariation(@NotNull FontT font, @NotNull OtMetricsTagT metricsTag) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_metrics_get_x_variation.invokeExact(font.handle(), metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_metrics_get_y_variation = Interop.downcallHandle(
        "hb_ot_metrics_get_y_variation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches vertical metrics value corresponding to {@code metrics_tag} from {@code font} with
     * the current font variation settings applied.
     */
    public static @NotNull PositionT otMetricsGetYVariation(@NotNull FontT font, @NotNull OtMetricsTagT metricsTag) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_metrics_get_y_variation.invokeExact(font.handle(), metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionT(RESULT);
    }
    
    private static final MethodHandle hb_ot_name_get_utf16 = Interop.downcallHandle(
        "hb_ot_name_get_utf16",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-16 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf16(@NotNull FaceT face, @NotNull OtNameIdT nameId, @NotNull LanguageT language, @NotNull Out<Integer> textSize, @NotNull Out<short[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_name_get_utf16.invokeExact(face.handle(), nameId.getValue(), language.handle(), (Addressable) textSizePOINTER.address(), (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        textSize.set(textSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        text.set(MemorySegment.ofAddress(textPOINTER.get(ValueLayout.ADDRESS, 0), textSize.get().intValue() * ValueLayout.JAVA_SHORT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_SHORT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_name_get_utf32 = Interop.downcallHandle(
        "hb_ot_name_get_utf32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-32 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf32(@NotNull FaceT face, @NotNull OtNameIdT nameId, @NotNull LanguageT language, @NotNull Out<Integer> textSize, @NotNull Out<int[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_name_get_utf32.invokeExact(face.handle(), nameId.getValue(), language.handle(), (Addressable) textSizePOINTER.address(), (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        textSize.set(textSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        text.set(MemorySegment.ofAddress(textPOINTER.get(ValueLayout.ADDRESS, 0), textSize.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_name_get_utf8 = Interop.downcallHandle(
        "hb_ot_name_get_utf8",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-8 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     */
    public static int otNameGetUtf8(@NotNull FaceT face, @NotNull OtNameIdT nameId, @NotNull LanguageT language, @NotNull Out<Integer> textSize, @NotNull Out<java.lang.String[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_name_get_utf8.invokeExact(face.handle(), nameId.getValue(), language.handle(), (Addressable) textSizePOINTER.address(), (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        textSize.set(textSizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] textARRAY = new java.lang.String[textSize.get().intValue()];
        for (int I = 0; I < textSize.get().intValue(); I++) {
            var OBJ = textPOINTER.get(ValueLayout.ADDRESS, I);
            textARRAY[I] = OBJ.getUtf8String(0);
        }
        text.set(textARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_name_list_names = Interop.downcallHandle(
        "hb_ot_name_list_names",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Enumerates all available name IDs and language combinations. Returned
     * array is owned by the {@code face} and should not be modified.  It can be
     * used as long as {@code face} is alive.
     */
    public static OtNameEntryT[] otNameListNames(@NotNull FaceT face, @NotNull Out<Integer> numEntries) {
        MemorySegment numEntriesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_ot_name_list_names.invokeExact(face.handle(), (Addressable) numEntriesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        numEntries.set(numEntriesPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtNameEntryT[] resultARRAY = new OtNameEntryT[numEntries.get().intValue()];
        for (int I = 0; I < numEntries.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new OtNameEntryT(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle hb_ot_shape_glyphs_closure = Interop.downcallHandle(
        "hb_ot_shape_glyphs_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the transitive closure of glyphs needed for a specified
     * input buffer under the given font and feature list. The closure is
     * computed as a set, not as a list.
     */
    public static @NotNull void otShapeGlyphsClosure(@NotNull FontT font, @NotNull BufferT buffer, @NotNull FeatureT[] features, @NotNull int numFeatures, @NotNull Out<SetT> glyphs) {
        MemorySegment glyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_shape_glyphs_closure.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features), numFeatures, (Addressable) glyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphs.set(new SetT(Refcounted.get(glyphsPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_shape_plan_collect_lookups = Interop.downcallHandle(
        "hb_ot_shape_plan_collect_lookups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the complete set of GSUB or GPOS lookups that are applicable
     * under a given {@code shape_plan}.
     */
    public static @NotNull void otShapePlanCollectLookups(@NotNull ShapePlanT shapePlan, @NotNull TagT tableTag, @NotNull Out<SetT> lookupIndexes) {
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_shape_plan_collect_lookups.invokeExact(shapePlan.handle(), tableTag.getValue(), (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lookupIndexes.set(new SetT(Refcounted.get(lookupIndexesPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_tag_from_language = Interop.downcallHandle(
        "hb_ot_tag_from_language",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static @NotNull TagT otTagFromLanguage(@NotNull LanguageT language) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_tag_from_language.invokeExact(language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TagT(RESULT);
    }
    
    private static final MethodHandle hb_ot_tag_to_language = Interop.downcallHandle(
        "hb_ot_tag_to_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a language tag to an {@link language_t}.
     */
    public static @Nullable LanguageT otTagToLanguage(@NotNull TagT tag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_ot_tag_to_language.invokeExact(tag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LanguageT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_ot_tag_to_script = Interop.downcallHandle(
        "hb_ot_tag_to_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a script tag to an {@link script_t}.
     */
    public static @NotNull ScriptT otTagToScript(@NotNull TagT tag) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_tag_to_script.invokeExact(tag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_ot_tags_from_script = Interop.downcallHandle(
        "hb_ot_tags_from_script",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static @NotNull void otTagsFromScript(@NotNull ScriptT script, @NotNull TagT scriptTag1, @NotNull TagT scriptTag2) {
        PointerInteger scriptTag1POINTER = new PointerInteger(scriptTag1.getValue());
        PointerInteger scriptTag2POINTER = new PointerInteger(scriptTag2.getValue());
        try {
            hb_ot_tags_from_script.invokeExact(script.getValue(), new PointerInteger(scriptTag1.getValue()).handle(), new PointerInteger(scriptTag2.getValue()).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
            scriptTag1.setValue(scriptTag1POINTER.get());
            scriptTag2.setValue(scriptTag2POINTER.get());
    }
    
    private static final MethodHandle hb_ot_tags_from_script_and_language = Interop.downcallHandle(
        "hb_ot_tags_from_script_and_language",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link script_t} and an {@link language_t} to script and language tags.
     */
    public static @NotNull void otTagsFromScriptAndLanguage(@NotNull ScriptT script, @NotNull LanguageT language, @NotNull Out<Integer> scriptCount, @NotNull Out<TagT> scriptTags, @NotNull Out<Integer> languageCount, @NotNull Out<TagT> languageTags) {
        MemorySegment scriptCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment languageCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment languageTagsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_ot_tags_from_script_and_language.invokeExact(script.getValue(), language.handle(), (Addressable) scriptCountPOINTER.address(), (Addressable) scriptTagsPOINTER.address(), (Addressable) languageCountPOINTER.address(), (Addressable) languageTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptCount.set(scriptCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        scriptTags.set(new TagT(scriptTagsPOINTER.get(ValueLayout.JAVA_INT, 0)));
        languageCount.set(languageCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        languageTags.set(new TagT(languageTagsPOINTER.get(ValueLayout.JAVA_INT, 0)));
    }
    
    private static final MethodHandle hb_ot_tags_to_script_and_language = Interop.downcallHandle(
        "hb_ot_tags_to_script_and_language",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts a script tag and a language tag to an {@link script_t} and an
     * {@link language_t}.
     */
    public static @NotNull void otTagsToScriptAndLanguage(@NotNull TagT scriptTag, @NotNull TagT languageTag, @NotNull Out<ScriptT> script, @NotNull Out<LanguageT> language) {
        MemorySegment scriptPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment languagePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_ot_tags_to_script_and_language.invokeExact(scriptTag.getValue(), languageTag.getValue(), (Addressable) scriptPOINTER.address(), (Addressable) languagePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        script.set(new ScriptT(scriptPOINTER.get(ValueLayout.JAVA_INT, 0)));
        language.set(new LanguageT(Refcounted.get(languagePOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle hb_ot_var_find_axis_info = Interop.downcallHandle(
        "hb_ot_var_find_axis_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the variation-axis information corresponding to the specified axis tag
     * in the specified face.
     */
    public static @NotNull BoolT otVarFindAxisInfo(@NotNull FaceT face, @NotNull TagT axisTag, @NotNull Out<OtVarAxisInfoT> axisInfo) {
        MemorySegment axisInfoPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_find_axis_info.invokeExact(face.handle(), axisTag.getValue(), (Addressable) axisInfoPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        axisInfo.set(new OtVarAxisInfoT(Refcounted.get(axisInfoPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_var_get_axis_count = Interop.downcallHandle(
        "hb_ot_var_get_axis_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of OpenType variation axes included in the face.
     */
    public static int otVarGetAxisCount(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_get_axis_count.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_var_get_axis_infos = Interop.downcallHandle(
        "hb_ot_var_get_axis_infos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a list of all variation axes in the specified face. The list returned will begin
     * at the offset provided.
     */
    public static int otVarGetAxisInfos(@NotNull FaceT face, @NotNull int startOffset, @NotNull Out<Integer> axesCount, @NotNull Out<OtVarAxisInfoT[]> axesArray) {
        MemorySegment axesCountPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment axesArrayPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_get_axis_infos.invokeExact(face.handle(), startOffset, (Addressable) axesCountPOINTER.address(), (Addressable) axesArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        axesCount.set(axesCountPOINTER.get(ValueLayout.JAVA_INT, 0));
        OtVarAxisInfoT[] axesArrayARRAY = new OtVarAxisInfoT[axesCount.get().intValue()];
        for (int I = 0; I < axesCount.get().intValue(); I++) {
            var OBJ = axesArrayPOINTER.get(ValueLayout.ADDRESS, I);
            axesArrayARRAY[I] = new OtVarAxisInfoT(Refcounted.get(OBJ, false));
        }
        axesArray.set(axesArrayARRAY);
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_var_get_named_instance_count = Interop.downcallHandle(
        "hb_ot_var_get_named_instance_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the number of named instances included in the face.
     */
    public static int otVarGetNamedInstanceCount(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_get_named_instance_count.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_var_has_data = Interop.downcallHandle(
        "hb_ot_var_has_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a face includes any OpenType variation data in the {@code fvar} table.
     */
    public static @NotNull BoolT otVarHasData(@NotNull FaceT face) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_has_data.invokeExact(face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_ot_var_named_instance_get_design_coords = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_design_coords",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the design-space coordinates corresponding to the given
     * named instance in the face.
     */
    public static int otVarNamedInstanceGetDesignCoords(@NotNull FaceT face, @NotNull int instanceIndex, @NotNull Out<Integer> coordsLength, @NotNull Out<float[]> coords) {
        MemorySegment coordsLengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment coordsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_named_instance_get_design_coords.invokeExact(face.handle(), instanceIndex, (Addressable) coordsLengthPOINTER.address(), (Addressable) coordsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coordsLength.set(coordsLengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        coords.set(MemorySegment.ofAddress(coordsPOINTER.get(ValueLayout.ADDRESS, 0), coordsLength.get().intValue() * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT));
        return RESULT;
    }
    
    private static final MethodHandle hb_ot_var_named_instance_get_postscript_name_id = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_postscript_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "PostScript name" defined for the given named instance in the face.
     */
    public static @NotNull OtNameIdT otVarNamedInstanceGetPostscriptNameId(@NotNull FaceT face, @NotNull int instanceIndex) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_named_instance_get_postscript_name_id.invokeExact(face.handle(), instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtNameIdT(RESULT);
    }
    
    private static final MethodHandle hb_ot_var_named_instance_get_subfamily_name_id = Interop.downcallHandle(
        "hb_ot_var_named_instance_get_subfamily_name_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "Subfamily name" defined for the given named instance in the face.
     */
    public static @NotNull OtNameIdT otVarNamedInstanceGetSubfamilyNameId(@NotNull FaceT face, @NotNull int instanceIndex) {
        int RESULT;
        try {
            RESULT = (int) hb_ot_var_named_instance_get_subfamily_name_id.invokeExact(face.handle(), instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new OtNameIdT(RESULT);
    }
    
    private static final MethodHandle hb_ot_var_normalize_coords = Interop.downcallHandle(
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
    public static @NotNull void otVarNormalizeCoords(@NotNull FaceT face, @NotNull int coordsLength, @NotNull PointerFloat designCoords, @NotNull Out<Integer> normalizedCoords) {
        MemorySegment normalizedCoordsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_ot_var_normalize_coords.invokeExact(face.handle(), coordsLength, designCoords.handle(), (Addressable) normalizedCoordsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        normalizedCoords.set(normalizedCoordsPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_ot_var_normalize_variations = Interop.downcallHandle(
        "hb_ot_var_normalize_variations",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Normalizes all of the coordinates in the given list of variation axes.
     */
    public static @NotNull void otVarNormalizeVariations(@NotNull FaceT face, @NotNull VariationT variations, @NotNull int variationsLength, @NotNull Out<int[]> coords, @NotNull Out<Integer> coordsLength) {
        MemorySegment coordsPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment coordsLengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_ot_var_normalize_variations.invokeExact(face.handle(), variations.handle(), variationsLength, (Addressable) coordsPOINTER.address(), (Addressable) coordsLengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coordsLength.set(coordsLengthPOINTER.get(ValueLayout.JAVA_INT, 0));
        coords.set(MemorySegment.ofAddress(coordsPOINTER.get(ValueLayout.ADDRESS, 0), coordsLength.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT));
    }
    
    private static final MethodHandle hb_script_from_iso15924_tag = Interop.downcallHandle(
        "hb_script_from_iso15924_tag",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an ISO 15924 script tag to a corresponding {@link script_t}.
     */
    public static @NotNull ScriptT scriptFromIso15924Tag(@NotNull TagT tag) {
        int RESULT;
        try {
            RESULT = (int) hb_script_from_iso15924_tag.invokeExact(tag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_script_from_string = Interop.downcallHandle(
        "hb_script_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string {@code str} representing an ISO 15924 script tag to a
     * corresponding {@link script_t}. Shorthand for hb_tag_from_string() then
     * hb_script_from_iso15924_tag().
     */
    public static @NotNull ScriptT scriptFromString(@NotNull byte[] str, @NotNull int len) {
        int RESULT;
        try {
            RESULT = (int) hb_script_from_string.invokeExact(Interop.allocateNativeArray(str), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_script_get_horizontal_direction = Interop.downcallHandle(
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
    public static @NotNull DirectionT scriptGetHorizontalDirection(@NotNull ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) hb_script_get_horizontal_direction.invokeExact(script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DirectionT(RESULT);
    }
    
    private static final MethodHandle hb_script_to_iso15924_tag = Interop.downcallHandle(
        "hb_script_to_iso15924_tag",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link script_t} to a corresponding ISO 15924 script tag.
     */
    public static @NotNull TagT scriptToIso15924Tag(@NotNull ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) hb_script_to_iso15924_tag.invokeExact(script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TagT(RESULT);
    }
    
    private static final MethodHandle hb_segment_properties_equal = Interop.downcallHandle(
        "hb_segment_properties_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks the equality of two {@link segment_properties_t}'s.
     */
    public static @NotNull BoolT segmentPropertiesEqual(@NotNull SegmentPropertiesT a, @NotNull SegmentPropertiesT b) {
        int RESULT;
        try {
            RESULT = (int) hb_segment_properties_equal.invokeExact(a.handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_segment_properties_hash = Interop.downcallHandle(
        "hb_segment_properties_hash",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a hash representing @p.
     */
    public static int segmentPropertiesHash(@NotNull SegmentPropertiesT p) {
        int RESULT;
        try {
            RESULT = (int) hb_segment_properties_hash.invokeExact(p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_segment_properties_overlay = Interop.downcallHandle(
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
    public static @NotNull void segmentPropertiesOverlay(@NotNull SegmentPropertiesT p, @NotNull SegmentPropertiesT src) {
        try {
            hb_segment_properties_overlay.invokeExact(p.handle(), src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_add = Interop.downcallHandle(
        "hb_set_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code codepoint} to {@code set}.
     */
    public static @NotNull void setAdd(@NotNull SetT set, @NotNull CodepointT codepoint) {
        try {
            hb_set_add.invokeExact(set.handle(), codepoint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_add_range = Interop.downcallHandle(
        "hb_set_add_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds all of the elements from {@code first} to {@code last}
     * (inclusive) to {@code set}.
     */
    public static @NotNull void setAddRange(@NotNull SetT set, @NotNull CodepointT first, @NotNull CodepointT last) {
        try {
            hb_set_add_range.invokeExact(set.handle(), first.getValue(), last.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_allocation_successful = Interop.downcallHandle(
        "hb_set_allocation_successful",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether memory allocation for a set was successful.
     */
    public static @NotNull BoolT setAllocationSuccessful(@NotNull SetT set) {
        int RESULT;
        try {
            RESULT = (int) hb_set_allocation_successful.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_clear = Interop.downcallHandle(
        "hb_set_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears out the contents of a set.
     */
    public static @NotNull void setClear(@NotNull SetT set) {
        try {
            hb_set_clear.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_copy = Interop.downcallHandle(
        "hb_set_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allocate a copy of {@code set}.
     */
    public static @NotNull SetT setCopy(@NotNull SetT set) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_set_copy.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_set_create = Interop.downcallHandle(
        "hb_set_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new, initially empty set.
     */
    public static @NotNull SetT setCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_set_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_set_del = Interop.downcallHandle(
        "hb_set_del",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes {@code codepoint} from {@code set}.
     */
    public static @NotNull void setDel(@NotNull SetT set, @NotNull CodepointT codepoint) {
        try {
            hb_set_del.invokeExact(set.handle(), codepoint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_del_range = Interop.downcallHandle(
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
    public static @NotNull void setDelRange(@NotNull SetT set, @NotNull CodepointT first, @NotNull CodepointT last) {
        try {
            hb_set_del_range.invokeExact(set.handle(), first.getValue(), last.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_destroy = Interop.downcallHandle(
        "hb_set_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a set. When
     * the reference count reaches zero, the set is
     * destroyed, freeing all memory.
     */
    public static @NotNull void setDestroy(@NotNull SetT set) {
        try {
            hb_set_destroy.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_get_empty = Interop.downcallHandle(
        "hb_set_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty {@link set_t}.
     */
    public static @NotNull SetT setGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_set_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_set_get_max = Interop.downcallHandle(
        "hb_set_get_max",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the largest element in the set.
     */
    public static @NotNull CodepointT setGetMax(@NotNull SetT set) {
        int RESULT;
        try {
            RESULT = (int) hb_set_get_max.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_set_get_min = Interop.downcallHandle(
        "hb_set_get_min",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the smallest element in the set.
     */
    public static @NotNull CodepointT setGetMin(@NotNull SetT set) {
        int RESULT;
        try {
            RESULT = (int) hb_set_get_min.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_set_get_population = Interop.downcallHandle(
        "hb_set_get_population",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of elements in the set.
     */
    public static int setGetPopulation(@NotNull SetT set) {
        int RESULT;
        try {
            RESULT = (int) hb_set_get_population.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_set_get_user_data = Interop.downcallHandle(
        "hb_set_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified set.
     */
    public static @Nullable java.lang.foreign.MemoryAddress setGetUserData(@NotNull SetT set, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_set_get_user_data.invokeExact(set.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_set_has = Interop.downcallHandle(
        "hb_set_has",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests whether {@code codepoint} belongs to {@code set}.
     */
    public static @NotNull BoolT setHas(@NotNull SetT set, @NotNull CodepointT codepoint) {
        int RESULT;
        try {
            RESULT = (int) hb_set_has.invokeExact(set.handle(), codepoint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_intersect = Interop.downcallHandle(
        "hb_set_intersect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the intersection of {@code set} and {@code other}.
     */
    public static @NotNull void setIntersect(@NotNull SetT set, @NotNull SetT other) {
        try {
            hb_set_intersect.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_invert = Interop.downcallHandle(
        "hb_set_invert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Inverts the contents of {@code set}.
     */
    public static @NotNull void setInvert(@NotNull SetT set) {
        try {
            hb_set_invert.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_is_empty = Interop.downcallHandle(
        "hb_set_is_empty",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether a set is empty (contains no elements).
     */
    public static @NotNull BoolT setIsEmpty(@NotNull SetT set) {
        int RESULT;
        try {
            RESULT = (int) hb_set_is_empty.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_is_equal = Interop.downcallHandle(
        "hb_set_is_equal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code set} and {@code other} are equal (contain the same
     * elements).
     */
    public static @NotNull BoolT setIsEqual(@NotNull SetT set, @NotNull SetT other) {
        int RESULT;
        try {
            RESULT = (int) hb_set_is_equal.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_is_subset = Interop.downcallHandle(
        "hb_set_is_subset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether {@code set} is a subset of {@code larger_set}.
     */
    public static @NotNull BoolT setIsSubset(@NotNull SetT set, @NotNull SetT largerSet) {
        int RESULT;
        try {
            RESULT = (int) hb_set_is_subset.invokeExact(set.handle(), largerSet.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_next = Interop.downcallHandle(
        "hb_set_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the next element in {@code set} that is greater than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static @NotNull BoolT setNext(@NotNull SetT set, @NotNull Out<CodepointT> codepoint) {
        MemorySegment codepointPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_set_next.invokeExact(set.handle(), (Addressable) codepointPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        codepoint.set(new CodepointT(codepointPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_next_range = Interop.downcallHandle(
        "hb_set_next_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the next consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code last} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static @NotNull BoolT setNextRange(@NotNull SetT set, @NotNull Out<CodepointT> first, @NotNull Out<CodepointT> last) {
        MemorySegment firstPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment lastPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_set_next_range.invokeExact(set.handle(), (Addressable) firstPOINTER.address(), (Addressable) lastPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        first.set(new CodepointT(firstPOINTER.get(ValueLayout.JAVA_INT, 0)));
        last.set(new CodepointT(lastPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_previous = Interop.downcallHandle(
        "hb_set_previous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the previous element in {@code set} that is lower than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static @NotNull BoolT setPrevious(@NotNull SetT set, @NotNull Out<CodepointT> codepoint) {
        MemorySegment codepointPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_set_previous.invokeExact(set.handle(), (Addressable) codepointPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        codepoint.set(new CodepointT(codepointPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_previous_range = Interop.downcallHandle(
        "hb_set_previous_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the previous consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code first} to {@code HB_SET_VALUE_INVALID} to get started.
     */
    public static @NotNull BoolT setPreviousRange(@NotNull SetT set, @NotNull Out<CodepointT> first, @NotNull Out<CodepointT> last) {
        MemorySegment firstPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment lastPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_set_previous_range.invokeExact(set.handle(), (Addressable) firstPOINTER.address(), (Addressable) lastPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        first.set(new CodepointT(firstPOINTER.get(ValueLayout.JAVA_INT, 0)));
        last.set(new CodepointT(lastPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_set_reference = Interop.downcallHandle(
        "hb_set_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a set.
     */
    public static @NotNull SetT setReference(@NotNull SetT set) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_set_reference.invokeExact(set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SetT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_set_set = Interop.downcallHandle(
        "hb_set_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the contents of {@code set} equal to the contents of {@code other}.
     */
    public static @NotNull void setSet(@NotNull SetT set, @NotNull SetT other) {
        try {
            hb_set_set.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_subtract = Interop.downcallHandle(
        "hb_set_subtract",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Subtracts the contents of {@code other} from {@code set}.
     */
    public static @NotNull void setSubtract(@NotNull SetT set, @NotNull SetT other) {
        try {
            hb_set_subtract.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_symmetric_difference = Interop.downcallHandle(
        "hb_set_symmetric_difference",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the symmetric difference of {@code set}
     * and {@code other}.
     */
    public static @NotNull void setSymmetricDifference(@NotNull SetT set, @NotNull SetT other) {
        try {
            hb_set_symmetric_difference.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_set_union = Interop.downcallHandle(
        "hb_set_union",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes {@code set} the union of {@code set} and {@code other}.
     */
    public static @NotNull void setUnion(@NotNull SetT set, @NotNull SetT other) {
        try {
            hb_set_union.invokeExact(set.handle(), other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_shape = Interop.downcallHandle(
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
    public static @NotNull void shape(@NotNull FontT font, @NotNull BufferT buffer, @Nullable FeatureT[] features, @NotNull int numFeatures) {
        try {
            hb_shape.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features), numFeatures);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_shape_full = Interop.downcallHandle(
        "hb_shape_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * See hb_shape() for details. If {@code shaper_list} is not {@code null}, the specified
     * shapers will be used in the given order, otherwise the default shapers list
     * will be used.
     */
    public static @NotNull BoolT shapeFull(@NotNull FontT font, @NotNull BufferT buffer, @Nullable FeatureT[] features, @NotNull int numFeatures, @Nullable java.lang.String[] shaperList) {
        int RESULT;
        try {
            RESULT = (int) hb_shape_full.invokeExact(font.handle(), buffer.handle(), Interop.allocateNativeArray(features), numFeatures, Interop.allocateNativeArray(shaperList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_shape_list_shapers = Interop.downcallHandle(
        "hb_shape_list_shapers",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Retrieves the list of shapers supported by HarfBuzz.
     */
    public static PointerString shapeListShapers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_list_shapers.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle hb_shape_plan_create = Interop.downcallHandle(
        "hb_shape_plan_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}.
     */
    public static @NotNull ShapePlanT shapePlanCreate(@NotNull FaceT face, @NotNull SegmentPropertiesT props, @NotNull FeatureT[] userFeatures, @NotNull int numUserFeatures, @NotNull java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_create.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures), numUserFeatures, Interop.allocateNativeArray(shaperList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_shape_plan_create2 = Interop.downcallHandle(
        "hb_shape_plan_create2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The variable-font version of {@code hb_shape_plan_create}.
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}, plus the variation-space coordinates {@code coords}.
     */
    public static @NotNull ShapePlanT shapePlanCreate2(@NotNull FaceT face, @NotNull SegmentPropertiesT props, @NotNull FeatureT[] userFeatures, @NotNull int numUserFeatures, @NotNull int[] coords, @NotNull int numCoords, @NotNull java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_create2.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures), numUserFeatures, Interop.allocateNativeArray(coords), numCoords, Interop.allocateNativeArray(shaperList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_shape_plan_create_cached = Interop.downcallHandle(
        "hb_shape_plan_create_cached",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}.
     */
    public static @NotNull ShapePlanT shapePlanCreateCached(@NotNull FaceT face, @NotNull SegmentPropertiesT props, @NotNull FeatureT[] userFeatures, @NotNull int numUserFeatures, @NotNull java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_create_cached.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures), numUserFeatures, Interop.allocateNativeArray(shaperList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_shape_plan_create_cached2 = Interop.downcallHandle(
        "hb_shape_plan_create_cached2",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The variable-font version of {@code hb_shape_plan_create_cached}.
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}, plus the
     * variation-space coordinates {@code coords}.
     */
    public static @NotNull ShapePlanT shapePlanCreateCached2(@NotNull FaceT face, @NotNull SegmentPropertiesT props, @NotNull FeatureT[] userFeatures, @NotNull int numUserFeatures, @NotNull int[] coords, @NotNull int numCoords, @NotNull java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_create_cached2.invokeExact(face.handle(), props.handle(), Interop.allocateNativeArray(userFeatures), numUserFeatures, Interop.allocateNativeArray(coords), numCoords, Interop.allocateNativeArray(shaperList));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_shape_plan_destroy = Interop.downcallHandle(
        "hb_shape_plan_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on the given shaping plan. When the
     * reference count reaches zero, the shaping plan is destroyed,
     * freeing all memory.
     */
    public static @NotNull void shapePlanDestroy(@NotNull ShapePlanT shapePlan) {
        try {
            hb_shape_plan_destroy.invokeExact(shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_shape_plan_execute = Interop.downcallHandle(
        "hb_shape_plan_execute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Executes the given shaping plan on the specified buffer, using
     * the given {@code font} and {@code features}.
     */
    public static @NotNull BoolT shapePlanExecute(@NotNull ShapePlanT shapePlan, @NotNull FontT font, @NotNull BufferT buffer, @NotNull FeatureT[] features, @NotNull int numFeatures) {
        int RESULT;
        try {
            RESULT = (int) hb_shape_plan_execute.invokeExact(shapePlan.handle(), font.handle(), buffer.handle(), Interop.allocateNativeArray(features), numFeatures);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_shape_plan_get_empty = Interop.downcallHandle(
        "hb_shape_plan_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty shaping plan.
     */
    public static @NotNull ShapePlanT shapePlanGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_shape_plan_get_shaper = Interop.downcallHandle(
        "hb_shape_plan_get_shaper",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the shaper from a given shaping plan.
     */
    public static @NotNull java.lang.String shapePlanGetShaper(@NotNull ShapePlanT shapePlan) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_get_shaper.invokeExact(shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle hb_shape_plan_get_user_data = Interop.downcallHandle(
        "hb_shape_plan_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified shaping plan.
     */
    public static @Nullable java.lang.foreign.MemoryAddress shapePlanGetUserData(@NotNull ShapePlanT shapePlan, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_get_user_data.invokeExact(shapePlan.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_shape_plan_reference = Interop.downcallHandle(
        "hb_shape_plan_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on the given shaping plan.
     */
    public static @NotNull ShapePlanT shapePlanReference(@NotNull ShapePlanT shapePlan) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_shape_plan_reference.invokeExact(shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShapePlanT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_style_get_value = Interop.downcallHandle(
        "hb_style_get_value",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Searches variation axes of a {@link font_t} object for a specific axis first,
     * if not set, then tries to get default style values from different
     * tables of the font.
     */
    public static float styleGetValue(@NotNull FontT font, @NotNull StyleTagT styleTag) {
        float RESULT;
        try {
            RESULT = (float) hb_style_get_value.invokeExact(font.handle(), styleTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_tag_from_string = Interop.downcallHandle(
        "hb_tag_from_string",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts a string into an {@link tag_t}. Valid tags
     * are four characters. Shorter input strings will be
     * padded with spaces. Longer input strings will be
     * truncated.
     */
    public static @NotNull TagT tagFromString(@NotNull byte[] str, @NotNull int len) {
        int RESULT;
        try {
            RESULT = (int) hb_tag_from_string.invokeExact(Interop.allocateNativeArray(str), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TagT(RESULT);
    }
    
    private static final MethodHandle hb_tag_to_string = Interop.downcallHandle(
        "hb_tag_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts an {@link tag_t} to a string and returns it in {@code buf}.
     * Strings will be four characters long.
     */
    public static @NotNull void tagToString(@NotNull TagT tag, @NotNull Out<byte[]> buf) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            hb_tag_to_string.invokeExact(tag.getValue(), (Addressable) bufPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(ValueLayout.ADDRESS, 0), 4 * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE));
    }
    
    private static final MethodHandle hb_unicode_combining_class = Interop.downcallHandle(
        "hb_unicode_combining_class",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the Canonical Combining Class (ccc) property
     * of code point {@code unicode}.
     */
    public static @NotNull UnicodeCombiningClassT unicodeCombiningClass(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) hb_unicode_combining_class.invokeExact(ufuncs.handle(), unicode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeCombiningClassT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_compose = Interop.downcallHandle(
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
    public static @NotNull BoolT unicodeCompose(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT a, @NotNull CodepointT b, @NotNull Out<CodepointT> ab) {
        MemorySegment abPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_unicode_compose.invokeExact(ufuncs.handle(), a.getValue(), b.getValue(), (Addressable) abPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        ab.set(new CodepointT(abPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_decompose = Interop.downcallHandle(
        "hb_unicode_decompose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the decomposition of a Unicode code point.
     * <p>
     * Calls the decomposition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     */
    public static @NotNull BoolT unicodeDecompose(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT ab, @NotNull Out<CodepointT> a, @NotNull Out<CodepointT> b) {
        MemorySegment aPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) hb_unicode_decompose.invokeExact(ufuncs.handle(), ab.getValue(), (Addressable) aPOINTER.address(), (Addressable) bPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        a.set(new CodepointT(aPOINTER.get(ValueLayout.JAVA_INT, 0)));
        b.set(new CodepointT(bPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_funcs_create = Interop.downcallHandle(
        "hb_unicode_funcs_create",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link unicode_funcs_t} structure of Unicode functions.
     */
    public static @NotNull UnicodeFuncsT unicodeFuncsCreate(@Nullable UnicodeFuncsT parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_create.invokeExact(parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_unicode_funcs_destroy = Interop.downcallHandle(
        "hb_unicode_funcs_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a Unicode-functions structure. When
     * the reference count reaches zero, the Unicode-functions structure is
     * destroyed, freeing all memory.
     */
    public static @NotNull void unicodeFuncsDestroy(@NotNull UnicodeFuncsT ufuncs) {
        try {
            hb_unicode_funcs_destroy.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_unicode_funcs_get_default = Interop.downcallHandle(
        "hb_unicode_funcs_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches a pointer to the default Unicode-functions structure that is used
     * when no functions are explicitly set on {@link buffer_t}.
     */
    public static @NotNull UnicodeFuncsT unicodeFuncsGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle hb_unicode_funcs_get_empty = Interop.downcallHandle(
        "hb_unicode_funcs_get_empty",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the singleton empty Unicode-functions structure.
     */
    public static @NotNull UnicodeFuncsT unicodeFuncsGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_unicode_funcs_get_parent = Interop.downcallHandle(
        "hb_unicode_funcs_get_parent",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the parent of the Unicode-functions structure
     * {@code ufuncs}.
     */
    public static @NotNull UnicodeFuncsT unicodeFuncsGetParent(@NotNull UnicodeFuncsT ufuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_get_parent.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_unicode_funcs_get_user_data = Interop.downcallHandle(
        "hb_unicode_funcs_get_user_data",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fetches the user-data associated with the specified key,
     * attached to the specified Unicode-functions structure.
     */
    public static @Nullable java.lang.foreign.MemoryAddress unicodeFuncsGetUserData(@NotNull UnicodeFuncsT ufuncs, @NotNull UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_get_user_data.invokeExact(ufuncs.handle(), key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle hb_unicode_funcs_is_immutable = Interop.downcallHandle(
        "hb_unicode_funcs_is_immutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Tests whether the specified Unicode-functions structure
     * is immutable.
     */
    public static @NotNull BoolT unicodeFuncsIsImmutable(@NotNull UnicodeFuncsT ufuncs) {
        int RESULT;
        try {
            RESULT = (int) hb_unicode_funcs_is_immutable.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_funcs_make_immutable = Interop.downcallHandle(
        "hb_unicode_funcs_make_immutable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the specified Unicode-functions structure
     * immutable.
     */
    public static @NotNull void unicodeFuncsMakeImmutable(@NotNull UnicodeFuncsT ufuncs) {
        try {
            hb_unicode_funcs_make_immutable.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle hb_unicode_funcs_reference = Interop.downcallHandle(
        "hb_unicode_funcs_reference",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a Unicode-functions structure.
     */
    public static @NotNull UnicodeFuncsT unicodeFuncsReference(@NotNull UnicodeFuncsT ufuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_unicode_funcs_reference.invokeExact(ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeFuncsT(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle hb_unicode_general_category = Interop.downcallHandle(
        "hb_unicode_general_category",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the General Category (gc) property
     * of code point {@code unicode}.
     */
    public static @NotNull UnicodeGeneralCategoryT unicodeGeneralCategory(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) hb_unicode_general_category.invokeExact(ufuncs.handle(), unicode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new UnicodeGeneralCategoryT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_mirroring = Interop.downcallHandle(
        "hb_unicode_mirroring",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the Bi-directional Mirroring Glyph code
     * point defined for code point {@code unicode}.
     */
    public static @NotNull CodepointT unicodeMirroring(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) hb_unicode_mirroring.invokeExact(ufuncs.handle(), unicode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new CodepointT(RESULT);
    }
    
    private static final MethodHandle hb_unicode_script = Interop.downcallHandle(
        "hb_unicode_script",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the {@link script_t} script to which code
     * point {@code unicode} belongs.
     */
    public static @NotNull ScriptT unicodeScript(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) hb_unicode_script.invokeExact(ufuncs.handle(), unicode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ScriptT(RESULT);
    }
    
    private static final MethodHandle hb_variation_from_string = Interop.downcallHandle(
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
    public static @NotNull BoolT variationFromString(@NotNull byte[] str, @NotNull int len, @NotNull Out<VariationT> variation) {
        MemorySegment variationPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) hb_variation_from_string.invokeExact(Interop.allocateNativeArray(str), len, (Addressable) variationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variation.set(new VariationT(Refcounted.get(variationPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_variation_to_string = Interop.downcallHandle(
        "hb_variation_to_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Converts an {@link variation_t} into a {@code null}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     */
    public static @NotNull void variationToString(@NotNull VariationT variation, @NotNull Out<java.lang.String[]> buf, @NotNull Out<Integer> size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment sizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_variation_to_string.invokeExact(variation.handle(), (Addressable) bufPOINTER.address(), (Addressable) sizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        size.set(sizePOINTER.get(ValueLayout.JAVA_INT, 0));
        java.lang.String[] bufARRAY = new java.lang.String[size.get().intValue()];
        for (int I = 0; I < size.get().intValue(); I++) {
            var OBJ = bufPOINTER.get(ValueLayout.ADDRESS, I);
            bufARRAY[I] = OBJ.getUtf8String(0);
        }
        buf.set(bufARRAY);
    }
    
    private static final MethodHandle hb_version = Interop.downcallHandle(
        "hb_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns library version as three integer components.
     */
    public static @NotNull void version(@NotNull Out<Integer> major, @NotNull Out<Integer> minor, @NotNull Out<Integer> micro) {
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment microPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            hb_version.invokeExact((Addressable) majorPOINTER.address(), (Addressable) minorPOINTER.address(), (Addressable) microPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(ValueLayout.JAVA_INT, 0));
        minor.set(minorPOINTER.get(ValueLayout.JAVA_INT, 0));
        micro.set(microPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle hb_version_atleast = Interop.downcallHandle(
        "hb_version_atleast",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tests the library version against a minimum value,
     * as three integer components.
     */
    public static @NotNull BoolT versionAtleast(@NotNull int major, @NotNull int minor, @NotNull int micro) {
        int RESULT;
        try {
            RESULT = (int) hb_version_atleast.invokeExact(major, minor, micro);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BoolT(RESULT);
    }
    
    private static final MethodHandle hb_version_string = Interop.downcallHandle(
        "hb_version_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Returns library version as a string with three components.
     */
    public static @NotNull java.lang.String versionString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) hb_version_string.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
