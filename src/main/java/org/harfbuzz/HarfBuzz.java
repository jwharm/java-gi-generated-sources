package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global HarfBuzz namespace.
 */
public final class HarfBuzz {
    
    static {
        System.loadLibrary("harfbuzz");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
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
     * Special setting for {@link FeatureT}.start to apply the feature from the start
     * of the buffer.
     */
    public static final int FEATURE_GLOBAL_START = 0;
    
    /**
     * Unset {@link MapT} value.
     */
    public static final org.harfbuzz.CodepointT MAP_VALUE_INVALID = new org.harfbuzz.CodepointT(-1);
    
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
    public static final int OT_LAYOUT_NO_VARIATIONS_INDEX = -1;
    
    /**
     * Maximum number of OpenType tags that can correspond to a give {@link LanguageT}.
     */
    public static final int OT_MAX_TAGS_PER_LANGUAGE = 3;
    
    /**
     * Maximum number of OpenType tags that can correspond to a give {@link ScriptT}.
     */
    public static final int OT_MAX_TAGS_PER_SCRIPT = 3;
    
    /**
     * Do not use.
     */
    public static final int OT_VAR_NO_AXIS_INDEX = -1;
    
    /**
     * Unset {@link SetT} value.
     */
    public static final org.harfbuzz.CodepointT SET_VALUE_INVALID = new org.harfbuzz.CodepointT(-1);
    
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
    public static final int VERSION_MAJOR = 5;
    
    /**
     * The micro component of the library version available at compile-time.
     */
    public static final int VERSION_MICRO = 0;
    
    /**
     * The minor component of the library version available at compile-time.
     */
    public static final int VERSION_MINOR = 2;
    
    /**
     * A string literal containing the library version available at compile-time.
     */
    public static final java.lang.String VERSION_STRING = "5.2.0";
    
    /**
     * Fetches the name identifier of the specified feature type in the face's {@code name} table.
     * @param face {@link FaceT} to work upon
     * @param featureType The {@link AatLayoutFeatureTypeT} of the requested feature type
     * @return Name identifier of the requested feature type
     */
    public static org.harfbuzz.OtNameIdT aatLayoutFeatureTypeGetNameId(org.harfbuzz.FaceT face, org.harfbuzz.AatLayoutFeatureTypeT featureType) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_feature_type_get_name_id.invokeExact(
                    face.handle(),
                    featureType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Fetches a list of the selectors available for the specified feature in the given face.
     * <p>
     * If upon return, {@code default_index} is set to {@code HB_AAT_LAYOUT_NO_SELECTOR_INDEX}, then
     * the feature type is non-exclusive.  Otherwise, {@code default_index} is the index of
     * the selector that is selected by default.
     * @param face {@link FaceT} to work upon
     * @param featureType The {@link AatLayoutFeatureTypeT} of the requested feature type
     * @param startOffset offset of the first feature type to retrieve
     * @param selectorCount Input = the maximum number of selectors to return;
     *                  Output = the actual number of selectors returned (may be zero)
     * @param selectors A buffer pointer. The selectors available for the feature type queries.
     * @param defaultIndex The index of the feature's default selector, if any
     * @return Number of all available feature selectors
     */
    public static int aatLayoutFeatureTypeGetSelectorInfos(org.harfbuzz.FaceT face, org.harfbuzz.AatLayoutFeatureTypeT featureType, int startOffset, Out<Integer> selectorCount, @Nullable Out<org.harfbuzz.AatLayoutFeatureSelectorInfoT[]> selectors, Out<Integer> defaultIndex) {
        MemorySegment selectorCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment selectorsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment defaultIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_feature_type_get_selector_infos.invokeExact(
                    face.handle(),
                    featureType.getValue(),
                    startOffset,
                    (Addressable) (selectorCount == null ? MemoryAddress.NULL : (Addressable) selectorCountPOINTER.address()),
                    (Addressable) (selectors == null ? MemoryAddress.NULL : (Addressable) selectorsPOINTER.address()),
                    (Addressable) (defaultIndex == null ? MemoryAddress.NULL : (Addressable) defaultIndexPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (selectorCount != null) selectorCount.set(selectorCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (defaultIndex != null) defaultIndex.set(defaultIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.AatLayoutFeatureSelectorInfoT[] selectorsARRAY = new org.harfbuzz.AatLayoutFeatureSelectorInfoT[selectorCount.get().intValue()];
        for (int I = 0; I < selectorCount.get().intValue(); I++) {
            var OBJ = selectorsPOINTER.get(Interop.valueLayout.ADDRESS, I);
            selectorsARRAY[I] = org.harfbuzz.AatLayoutFeatureSelectorInfoT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        selectors.set(selectorsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches a list of the AAT feature types included in the specified face.
     * @param face {@link FaceT} to work upon
     * @param startOffset offset of the first feature type to retrieve
     * @param featureCount Input = the maximum number of feature types to return;
     *                 Output = the actual number of feature types returned (may be zero)
     * @param features Array of feature types found
     * @return Number of all available feature types.
     */
    public static int aatLayoutGetFeatureTypes(org.harfbuzz.FaceT face, int startOffset, Out<Integer> featureCount, Out<org.harfbuzz.AatLayoutFeatureTypeT[]> features) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment featuresPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_get_feature_types.invokeExact(
                    face.handle(),
                    startOffset,
                    (Addressable) (featureCount == null ? MemoryAddress.NULL : (Addressable) featureCountPOINTER.address()),
                    (Addressable) featuresPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (featureCount != null) featureCount.set(featureCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.AatLayoutFeatureTypeT[] featuresARRAY = new org.harfbuzz.AatLayoutFeatureTypeT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featuresPOINTER.get(Interop.valueLayout.C_INT, I);
            featuresARRAY[I] = org.harfbuzz.AatLayoutFeatureTypeT.of(OBJ);
        }
        features.set(featuresARRAY);
        return RESULT;
    }
    
    /**
     * Tests whether the specified face includes any positioning information
     * in the {@code kerx} table.
     * <p>
     * &lt;note&gt;Note: does not examine the {@code GPOS} table.&lt;/note&gt;
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT aatLayoutHasPositioning(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_has_positioning.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any substitutions in the
     * {@code morx} or {@code mort} tables.
     * <p>
     * &lt;note&gt;Note: does not examine the {@code GSUB} table.&lt;/note&gt;
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT aatLayoutHasSubstitution(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_has_substitution.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any tracking information
     * in the {@code trak} table.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT aatLayoutHasTracking(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_aat_layout_has_tracking.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes a writable copy of {@code blob}.
     * @param blob A blob.
     * @return The new blob, or nullptr if allocation failed
     */
    public static org.harfbuzz.BlobT blobCopyWritableOrFail(org.harfbuzz.BlobT blob) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_copy_writable_or_fail.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new "blob" object wrapping {@code data}.  The {@code mode} parameter is used
     * to negotiate ownership and lifecycle of {@code data}.
     * @param data Pointer to blob data.
     * @param length Length of {@code data} in bytes.
     * @param mode Memory mode for {@code data}.
     * @param userData Data parameter to pass to {@code destroy}.
     * @param destroy Callback to call when {@code data} is not needed anymore.
     * @return New blob, or the empty blob if something failed or if {@code length} is
     * zero.  Destroy with hb_blob_destroy().
     */
    public static org.harfbuzz.BlobT blobCreate(java.lang.String data, int length, org.harfbuzz.MemoryModeT mode, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_create.invokeExact(
                    Marshal.stringToAddress.marshal(data, null),
                    length,
                    mode.getValue(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     * @param fileName A font filename
     * @return An {@link BlobT} pointer with the content of the file,
     * or hb_blob_get_empty() if failed.
     */
    public static org.harfbuzz.BlobT blobCreateFromFile(java.lang.String fileName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_create_from_file.invokeExact(
                    Marshal.stringToAddress.marshal(fileName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new blob containing the data from the
     * specified binary font file.
     * @param fileName A font filename
     * @return An {@link BlobT} pointer with the content of the file,
     * or {@code NULL} if failed.
     */
    public static org.harfbuzz.BlobT blobCreateFromFileOrFail(java.lang.String fileName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_create_from_file_or_fail.invokeExact(
                    Marshal.stringToAddress.marshal(fileName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new "blob" object wrapping {@code data}.  The {@code mode} parameter is used
     * to negotiate ownership and lifecycle of {@code data}.
     * <p>
     * Note that this function returns a freshly-allocated empty blob even if {@code length}
     * is zero. This is in contrast to hb_blob_create(), which returns the singleton
     * empty blob (as returned by hb_blob_get_empty()) if {@code length} is zero.
     * @param data Pointer to blob data.
     * @param length Length of {@code data} in bytes.
     * @param mode Memory mode for {@code data}.
     * @param userData Data parameter to pass to {@code destroy}.
     * @param destroy Callback to call when {@code data} is not needed anymore.
     * @return New blob, or {@code NULL} if failed.  Destroy with hb_blob_destroy().
     */
    public static org.harfbuzz.BlobT blobCreateOrFail(java.lang.String data, int length, org.harfbuzz.MemoryModeT mode, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_create_or_fail.invokeExact(
                    Marshal.stringToAddress.marshal(data, null),
                    length,
                    mode.getValue(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a blob that represents a range of bytes in {@code parent}.  The new
     * blob is always created with {@code HB_MEMORY_MODE_READONLY}, meaning that it
     * will never modify data in the parent blob.  The parent data is not
     * expected to be modified, and will result in undefined behavior if it
     * is.
     * <p>
     * Makes {@code parent} immutable.
     * @param parent Parent blob.
     * @param offset Start offset of sub-blob within {@code parent}, in bytes.
     * @param length Length of sub-blob.
     * @return New blob, or the empty blob if something failed or if
     * {@code length} is zero or {@code offset} is beyond the end of {@code parent}'s data.  Destroy
     * with hb_blob_destroy().
     */
    public static org.harfbuzz.BlobT blobCreateSubBlob(org.harfbuzz.BlobT parent, int offset, int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_create_sub_blob.invokeExact(
                    parent.handle(),
                    offset,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on {@code blob}, and if it reaches zero, destroys
     * {@code blob}, freeing all memory, possibly calling the destroy-callback the blob
     * was created for if it has not been called already.
     * <p>
     * See TODO:link object types for more information.
     * @param blob a blob.
     */
    public static void blobDestroy(org.harfbuzz.BlobT blob) {
        try {
            DowncallHandles.hb_blob_destroy.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the data from a blob.
     * @param blob a blob.
     * @param length The length in bytes of the data retrieved
     * @return the byte data of {@code blob}.
     */
    public static @Nullable java.lang.String[] blobGetData(org.harfbuzz.BlobT blob, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_get_data.invokeExact(
                    blob.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Tries to make blob data writable (possibly copying it) and
     * return pointer to data.
     * <p>
     * Fails if blob has been made immutable, or if memory allocation
     * fails.
     * @param blob a blob.
     * @param length output length of the writable data.
     * @return Writable blob data,
     * or {@code NULL} if failed.
     */
    public static java.lang.String[] blobGetDataWritable(org.harfbuzz.BlobT blob, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_get_data_writable.invokeExact(
                    blob.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        return resultARRAY;
    }
    
    /**
     * Returns the singleton empty blob.
     * <p>
     * See TODO:link object types for more information.
     * @return The empty blob.
     */
    public static org.harfbuzz.BlobT blobGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the length of a blob's data.
     * @param blob a blob.
     * @return the length of {@code blob} data in bytes.
     */
    public static int blobGetLength(org.harfbuzz.BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_blob_get_length.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     * @param blob a blob
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress blobGetUserData(org.harfbuzz.BlobT blob, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_get_user_data.invokeExact(
                    blob.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether a blob is immutable.
     * @param blob a blob.
     * @return {@code true} if {@code blob} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT blobIsImmutable(org.harfbuzz.BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_blob_is_immutable.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes a blob immutable.
     * @param blob a blob
     */
    public static void blobMakeImmutable(org.harfbuzz.BlobT blob) {
        try {
            DowncallHandles.hb_blob_make_immutable.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on {@code blob}.
     * <p>
     * See TODO:link object types for more information.
     * @param blob a blob.
     * @return {@code blob}.
     */
    public static org.harfbuzz.BlobT blobReference(org.harfbuzz.BlobT blob) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_blob_reference.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Attaches a user-data key/data pair to the specified blob.
     * @param blob An {@link BlobT}
     * @param key The user-data key to set
     * @param data A pointer to the user data to set
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT blobSetUserData(org.harfbuzz.BlobT blob, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_blob_set_user_data.invokeExact(
                    blob.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Appends a character with the Unicode value of {@code codepoint} to {@code buffer}, and
     * gives it the initial cluster value of {@code cluster}. Clusters can be any thing
     * the client wants, they are usually used to refer to the index of the
     * character in the input text stream and are output in
     * {@link GlyphInfoT}.cluster field.
     * <p>
     * This function does not check the validity of {@code codepoint}, it is up to the
     * caller to ensure it is a valid Unicode code point.
     * @param buffer An {@link BufferT}
     * @param codepoint A Unicode code point.
     * @param cluster The cluster value of {@code codepoint}.
     */
    public static void bufferAdd(org.harfbuzz.BufferT buffer, org.harfbuzz.CodepointT codepoint, int cluster) {
        try {
            DowncallHandles.hb_buffer_add.invokeExact(
                    buffer.handle(),
                    codepoint.getValue().intValue(),
                    cluster);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param buffer a {@link BufferT} to append characters to.
     * @param text an array of Unicode code points to append.
     * @param textLength the length of the {@code text}, or -1 if it is {@code NULL} terminated.
     * @param itemOffset the offset of the first code point to add to the {@code buffer}.
     * @param itemLength the number of code points to add to the {@code buffer}, or -1 for the
     *               end of {@code text} (assuming it is {@code NULL} terminated).
     */
    public static void bufferAddCodepoints(org.harfbuzz.BufferT buffer, org.harfbuzz.CodepointT[] text, int textLength, int itemOffset, int itemLength) {
        try {
            DowncallHandles.hb_buffer_add_codepoints.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(org.harfbuzz.CodepointT.getIntegerValues(text), false),
                    textLength,
                    itemOffset,
                    itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to hb_buffer_add_codepoints(), but allows only access to first 256
     * Unicode code points that can fit in 8-bit strings.
     * <p>
     * &lt;note&gt;Has nothing to do with non-Unicode Latin-1 encoding.&lt;/note&gt;
     * @param buffer An {@link BufferT}
     * @param text an array of UTF-8
     *               characters to append
     * @param textLength the length of the {@code text}, or -1 if it is {@code NULL} terminated
     * @param itemOffset the offset of the first character to add to the {@code buffer}
     * @param itemLength the number of characters to add to the {@code buffer}, or -1 for the
     *               end of {@code text} (assuming it is {@code NULL} terminated)
     */
    public static void bufferAddLatin1(org.harfbuzz.BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        try {
            DowncallHandles.hb_buffer_add_latin1.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(text, false),
                    textLength,
                    itemOffset,
                    itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-16 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     * @param buffer An {@link BufferT}
     * @param text An array of UTF-16 characters to append
     * @param textLength The length of the {@code text}, or -1 if it is {@code NULL} terminated
     * @param itemOffset The offset of the first character to add to the {@code buffer}
     * @param itemLength The number of characters to add to the {@code buffer}, or -1 for the
     *               end of {@code text} (assuming it is {@code NULL} terminated)
     */
    public static void bufferAddUtf16(org.harfbuzz.BufferT buffer, short[] text, int textLength, int itemOffset, int itemLength) {
        try {
            DowncallHandles.hb_buffer_add_utf16.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(text, false),
                    textLength,
                    itemOffset,
                    itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-32 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     * @param buffer An {@link BufferT}
     * @param text An array of UTF-32 characters to append
     * @param textLength The length of the {@code text}, or -1 if it is {@code NULL} terminated
     * @param itemOffset The offset of the first character to add to the {@code buffer}
     * @param itemLength The number of characters to add to the {@code buffer}, or -1 for the
     *               end of {@code text} (assuming it is {@code NULL} terminated)
     */
    public static void bufferAddUtf32(org.harfbuzz.BufferT buffer, int[] text, int textLength, int itemOffset, int itemLength) {
        try {
            DowncallHandles.hb_buffer_add_utf32.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(text, false),
                    textLength,
                    itemOffset,
                    itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See hb_buffer_add_codepoints().
     * <p>
     * Replaces invalid UTF-8 characters with the {@code buffer} replacement code point,
     * see hb_buffer_set_replacement_codepoint().
     * @param buffer An {@link BufferT}
     * @param text An array of UTF-8
     *               characters to append.
     * @param textLength The length of the {@code text}, or -1 if it is {@code NULL} terminated.
     * @param itemOffset The offset of the first character to add to the {@code buffer}.
     * @param itemLength The number of characters to add to the {@code buffer}, or -1 for the
     *               end of {@code text} (assuming it is {@code NULL} terminated).
     */
    public static void bufferAddUtf8(org.harfbuzz.BufferT buffer, byte[] text, int textLength, int itemOffset, int itemLength) {
        try {
            DowncallHandles.hb_buffer_add_utf8.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(text, false),
                    textLength,
                    itemOffset,
                    itemLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if allocating memory for the buffer succeeded.
     * @param buffer An {@link BufferT}
     * @return {@code true} if {@code buffer} memory allocation succeeded, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT bufferAllocationSuccessful(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_allocation_successful.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Append (part of) contents of another buffer to this buffer.
     * @param buffer An {@link BufferT}
     * @param source source {@link BufferT}
     * @param start start index into source buffer to copy.  Use 0 to copy from start of buffer.
     * @param end end index into source buffer to copy.  Use {@code HB_FEATURE_GLOBAL_END} to copy to end of buffer.
     */
    public static void bufferAppend(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferT source, int start, int end) {
        try {
            DowncallHandles.hb_buffer_append.invokeExact(
                    buffer.handle(),
                    source.handle(),
                    start,
                    end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to hb_buffer_reset(), but does not clear the Unicode functions and
     * the replacement code point.
     * @param buffer An {@link BufferT}
     */
    public static void bufferClearContents(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_clear_contents.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link BufferT} with all properties to defaults.
     * @return A newly allocated {@link BufferT} with a reference count of 1. The initial
     * reference count should be released with hb_buffer_destroy() when you are done
     * using the {@link BufferT}. This function never returns {@code NULL}. If memory cannot
     * be allocated, a special {@link BufferT} object will be returned on which
     * hb_buffer_allocation_successful() returns {@code false}.
     */
    public static org.harfbuzz.BufferT bufferCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link BufferT}, similar to hb_buffer_create(). The only
     * difference is that the buffer is configured similarly to {@code src}.
     * @param src An {@link BufferT}
     * @return A newly allocated {@link BufferT}, similar to hb_buffer_create().
     */
    public static org.harfbuzz.BufferT bufferCreateSimilar(org.harfbuzz.BufferT src) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_create_similar.invokeExact(
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Deserializes glyphs {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_glyphs().
     * @param buffer an {@link BufferT} buffer.
     * @param buf string to deserialize
     * @param bufLen the size of {@code buf}, or -1 if it is {@code NULL}-terminated
     * @param endPtr output pointer to the character after last
     *                               consumed one.
     * @param font font for getting glyph IDs
     * @param format the {@link BufferSerializeFormatT} of the input {@code buf}
     * @return {@code true} if {@code buf} is not fully consumed, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT bufferDeserializeGlyphs(org.harfbuzz.BufferT buffer, java.lang.String[] buf, int bufLen, @Nullable Out<java.lang.String> endPtr, @Nullable org.harfbuzz.FontT font, org.harfbuzz.BufferSerializeFormatT format) {
        MemorySegment endPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_deserialize_glyphs.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(buf, false),
                    bufLen,
                    (Addressable) (endPtr == null ? MemoryAddress.NULL : (Addressable) endPtrPOINTER.address()),
                    (Addressable) (font == null ? MemoryAddress.NULL : font.handle()),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (endPtr != null) endPtr.set(Marshal.addressToString.marshal(endPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Deserializes Unicode {@code buffer} from textual representation in the format
     * produced by hb_buffer_serialize_unicode().
     * @param buffer an {@link BufferT} buffer.
     * @param buf string to deserialize
     * @param bufLen the size of {@code buf}, or -1 if it is {@code NULL}-terminated
     * @param endPtr output pointer to the character after last
     *                               consumed one.
     * @param format the {@link BufferSerializeFormatT} of the input {@code buf}
     * @return {@code true} if {@code buf} is not fully consumed, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT bufferDeserializeUnicode(org.harfbuzz.BufferT buffer, java.lang.String[] buf, int bufLen, @Nullable Out<java.lang.String> endPtr, org.harfbuzz.BufferSerializeFormatT format) {
        MemorySegment endPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_deserialize_unicode.invokeExact(
                    buffer.handle(),
                    Interop.allocateNativeArray(buf, false),
                    bufLen,
                    (Addressable) (endPtr == null ? MemoryAddress.NULL : (Addressable) endPtrPOINTER.address()),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (endPtr != null) endPtr.set(Marshal.addressToString.marshal(endPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Deallocate the {@code buffer}.
     * Decreases the reference count on {@code buffer} by one. If the result is zero, then
     * {@code buffer} and all associated resources are freed. See hb_buffer_reference().
     * @param buffer An {@link BufferT}
     */
    public static void bufferDestroy(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_destroy.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If dottedcircle_glyph is (hb_codepoint_t) -1 then {@code HB_BUFFER_DIFF_FLAG_DOTTED_CIRCLE_PRESENT}
     * and {@code HB_BUFFER_DIFF_FLAG_NOTDEF_PRESENT} are never returned.  This should be used by most
     * callers if just comparing two buffers is needed.
     * @param buffer a buffer.
     * @param reference other buffer to compare to.
     * @param dottedcircleGlyph glyph id of U+25CC DOTTED CIRCLE, or (hb_codepont_t) -1.
     * @param positionFuzz allowed absolute difference in position values.
     */
    public static org.harfbuzz.BufferDiffFlagsT bufferDiff(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferT reference, org.harfbuzz.CodepointT dottedcircleGlyph, int positionFuzz) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_diff.invokeExact(
                    buffer.handle(),
                    reference.handle(),
                    dottedcircleGlyph.getValue().intValue(),
                    positionFuzz);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BufferDiffFlagsT(RESULT);
    }
    
    /**
     * Fetches the cluster level of a buffer. The {@link BufferClusterLevelT}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     * @param buffer An {@link BufferT}
     * @return The cluster level of {@code buffer}
     */
    public static org.harfbuzz.BufferClusterLevelT bufferGetClusterLevel(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_cluster_level.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferClusterLevelT.of(RESULT);
    }
    
    /**
     * Fetches the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     * @param buffer An {@link BufferT}
     * @return The type of {@code buffer} contents
     */
    public static org.harfbuzz.BufferContentTypeT bufferGetContentType(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_content_type.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferContentTypeT.of(RESULT);
    }
    
    /**
     * See hb_buffer_set_direction()
     * @param buffer An {@link BufferT}
     * @return The direction of the {@code buffer}.
     */
    public static org.harfbuzz.DirectionT bufferGetDirection(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_direction.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.DirectionT.of(RESULT);
    }
    
    /**
     * Fetches an empty {@link BufferT}.
     * @return The empty buffer
     */
    public static org.harfbuzz.BufferT bufferGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the {@link BufferFlagsT} of {@code buffer}.
     * @param buffer An {@link BufferT}
     * @return The {@code buffer} flags
     */
    public static org.harfbuzz.BufferFlagsT bufferGetFlags(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_flags.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BufferFlagsT(RESULT);
    }
    
    /**
     * Returns {@code buffer} glyph information array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     * @param buffer An {@link BufferT}
     * @param length The output-array length.
     * @return The {@code buffer} glyph information array.
     * The value valid as long as buffer has not been modified.
     */
    public static org.harfbuzz.GlyphInfoT[] bufferGetGlyphInfos(org.harfbuzz.BufferT buffer, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_glyph_infos.invokeExact(
                    buffer.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.GlyphInfoT[] resultARRAY = new org.harfbuzz.GlyphInfoT[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = org.harfbuzz.GlyphInfoT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Returns {@code buffer} glyph position array.  Returned pointer
     * is valid as long as {@code buffer} contents are not modified.
     * <p>
     * If buffer did not have positions before, the positions will be
     * initialized to zeros, unless this function is called from
     * within a buffer message callback (see hb_buffer_set_message_func()),
     * in which case {@code NULL} is returned.
     * @param buffer An {@link BufferT}
     * @param length The output length
     * @return The {@code buffer} glyph position array.
     * The value valid as long as buffer has not been modified.
     */
    public static org.harfbuzz.GlyphPositionT[] bufferGetGlyphPositions(org.harfbuzz.BufferT buffer, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_glyph_positions.invokeExact(
                    buffer.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.GlyphPositionT[] resultARRAY = new org.harfbuzz.GlyphPositionT[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = org.harfbuzz.GlyphPositionT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * See hb_buffer_set_invisible_glyph().
     * @param buffer An {@link BufferT}
     * @return The {@code buffer} invisible {@link CodepointT}
     */
    public static org.harfbuzz.CodepointT bufferGetInvisibleGlyph(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_invisible_glyph.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * See hb_buffer_set_language().
     * @param buffer An {@link BufferT}
     * @return The {@link LanguageT} of the buffer. Must not be freed by the caller.
     */
    public static org.harfbuzz.LanguageT bufferGetLanguage(org.harfbuzz.BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_language.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.LanguageT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the number of items in the buffer.
     * @param buffer An {@link BufferT}
     * @return The {@code buffer} length.
     * The value valid as long as buffer has not been modified.
     */
    public static int bufferGetLength(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_length.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * See hb_buffer_set_not_found_glyph().
     * @param buffer An {@link BufferT}
     * @return The {@code buffer} not-found {@link CodepointT}
     */
    public static org.harfbuzz.CodepointT bufferGetNotFoundGlyph(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_not_found_glyph.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Fetches the {@link CodepointT} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     * @param buffer An {@link BufferT}
     * @return The {@code buffer} replacement {@link CodepointT}
     */
    public static org.harfbuzz.CodepointT bufferGetReplacementCodepoint(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_replacement_codepoint.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Fetches the script of {@code buffer}.
     * @param buffer An {@link BufferT}
     * @return The {@link ScriptT} of the {@code buffer}
     */
    public static org.harfbuzz.ScriptT bufferGetScript(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_get_script.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    /**
     * Sets {@code props} to the {@link SegmentPropertiesT} of {@code buffer}.
     * @param buffer An {@link BufferT}
     * @param props The output {@link SegmentPropertiesT}
     */
    public static void bufferGetSegmentProperties(org.harfbuzz.BufferT buffer, org.harfbuzz.SegmentPropertiesT props) {
        try {
            DowncallHandles.hb_buffer_get_segment_properties.invokeExact(
                    buffer.handle(),
                    props.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the Unicode-functions structure of a buffer.
     * @param buffer An {@link BufferT}
     * @return The Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT bufferGetUnicodeFuncs(org.harfbuzz.BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_unicode_funcs.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified buffer.
     * @param buffer An {@link BufferT}
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress bufferGetUserData(org.harfbuzz.BufferT buffer, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_get_user_data.invokeExact(
                    buffer.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param buffer An {@link BufferT}
     */
    public static void bufferGuessSegmentProperties(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_guess_segment_properties.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether {@code buffer} has glyph position data.
     * A buffer gains position data when hb_buffer_get_glyph_positions() is called on it,
     * and cleared of position data when hb_buffer_clear_contents() is called.
     * @param buffer an {@link BufferT}.
     * @return {@code true} if the {@code buffer} has position array, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT bufferHasPositions(org.harfbuzz.BufferT buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_has_positions.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Reorders a glyph buffer to have canonical in-cluster glyph order / position.
     * The resulting clusters should behave identical to pre-reordering clusters.
     * <p>
     * &lt;note&gt;This has nothing to do with Unicode normalization.&lt;/note&gt;
     * @param buffer An {@link BufferT}
     */
    public static void bufferNormalizeGlyphs(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_normalize_glyphs.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Pre allocates memory for {@code buffer} to fit at least {@code size} number of items.
     * @param buffer An {@link BufferT}
     * @param size Number of items to pre allocate.
     * @return {@code true} if {@code buffer} memory allocation succeeded, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT bufferPreAllocate(org.harfbuzz.BufferT buffer, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_pre_allocate.invokeExact(
                    buffer.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on {@code buffer} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_buffer_destroy() is made.
     * @param buffer An {@link BufferT}
     * @return The referenced {@link BufferT}.
     */
    public static org.harfbuzz.BufferT bufferReference(org.harfbuzz.BufferT buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_reference.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Resets the buffer to its initial status, as if it was just newly created
     * with hb_buffer_create().
     * @param buffer An {@link BufferT}
     */
    public static void bufferReset(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_reset.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reverses buffer contents.
     * @param buffer An {@link BufferT}
     */
    public static void bufferReverse(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_reverse.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reverses buffer clusters.  That is, the buffer contents are
     * reversed, then each cluster (consecutive items having the
     * same cluster number) are reversed again.
     * @param buffer An {@link BufferT}
     */
    public static void bufferReverseClusters(org.harfbuzz.BufferT buffer) {
        try {
            DowncallHandles.hb_buffer_reverse_clusters.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reverses buffer contents between {@code start} and {@code end}.
     * @param buffer An {@link BufferT}
     * @param start start index
     * @param end end index
     */
    public static void bufferReverseRange(org.harfbuzz.BufferT buffer, int start, int end) {
        try {
            DowncallHandles.hb_buffer_reverse_range.invokeExact(
                    buffer.handle(),
                    start,
                    end);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its content, whether
     * Unicode codepoints or glyph identifiers and positioning information. This is
     * useful for showing the contents of the buffer, for example during debugging.
     * See the documentation of hb_buffer_serialize_unicode() and
     * hb_buffer_serialize_glyphs() for a description of the output format.
     * @param buffer an {@link BufferT} buffer.
     * @param start the first item in {@code buffer} to serialize.
     * @param end the last item in {@code buffer} to serialize.
     * @param buf output string to
     *       write serialized buffer into.
     * @param bufSize the size of {@code buf}.
     * @param bufConsumed if not {@code NULL}, will be set to the number of bytes written into {@code buf}.
     * @param font the {@link FontT} used to shape this buffer, needed to
     *        read glyph names and extents. If {@code NULL}, an empty font will be used.
     * @param format the {@link BufferSerializeFormatT} to use for formatting the output.
     * @param flags the {@link BufferSerializeFlagsT} that control what glyph properties
     *         to serialize.
     * @return The number of serialized items.
     */
    public static int bufferSerialize(org.harfbuzz.BufferT buffer, int start, int end, Out<byte[]> buf, int bufSize, Out<Integer> bufConsumed, @Nullable org.harfbuzz.FontT font, org.harfbuzz.BufferSerializeFormatT format, org.harfbuzz.BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_serialize.invokeExact(
                    buffer.handle(),
                    start,
                    end,
                    (Addressable) bufPOINTER.address(),
                    bufSize,
                    (Addressable) (bufConsumed == null ? MemoryAddress.NULL : (Addressable) bufConsumedPOINTER.address()),
                    (Addressable) (font == null ? MemoryAddress.NULL : font.handle()),
                    format.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (bufConsumed != null) bufConsumed.set(bufConsumedPOINTER.get(Interop.valueLayout.C_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), bufSize * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT;
    }
    
    /**
     * Parses a string into an {@link BufferSerializeFormatT}. Does not check if
     * {@code str} is a valid buffer serialization format, use
     * hb_buffer_serialize_list_formats() to get the list of supported formats.
     * @param str a string to parse
     * @param len length of {@code str}, or -1 if string is {@code NULL} terminated
     * @return The parsed {@link BufferSerializeFormatT}.
     */
    public static org.harfbuzz.BufferSerializeFormatT bufferSerializeFormatFromString(byte[] str, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_serialize_format_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BufferSerializeFormatT.of(RESULT);
    }
    
    /**
     * Converts {@code format} to the string corresponding it, or {@code NULL} if it is not a valid
     * {@link BufferSerializeFormatT}.
     * @param format an {@link BufferSerializeFormatT} to convert.
     * @return A {@code NULL} terminated string corresponding to {@code format}. Should not be freed.
     */
    public static java.lang.String bufferSerializeFormatToString(org.harfbuzz.BufferSerializeFormatT format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_serialize_format_to_string.invokeExact(
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its glyph content,
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * <p>
     * <strong>text</strong><br/>
     * A human-readable, plain text format.
     * The serialized glyphs will look something like:
     * <pre>{@code 
     * [uni0651=0@518,0+0|uni0628=0+1897]
     * }</pre>
     * <ul>
     * <li>The serialized glyphs are delimited with {@code [} and {@code ]}.
     * <li>Glyphs are separated with {@code |}
     * <li>Each glyph starts with glyph name, or glyph index if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES} flag is set. Then,
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set, {@code =} then {@link GlyphInfoT}.cluster.
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS} is not set, the {@link GlyphPositionT} in the format:
     * <li>If both {@link GlyphPositionT}.x_offset and {@link GlyphPositionT}.y_offset are not 0, {@code @x_offset,y_offset}. Then,
     * <li>{@code +x_advance}, then {@code ,y_advance} if {@link GlyphPositionT}.y_advance is not 0. Then,
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS} is set, the {@link GlyphExtentsT} in the format {@code <x_bearing,y_bearing,width,height>}
     * </ul>
     * <p>
     * <strong>json</strong><br/>
     * A machine-readable, structured format.
     * The serialized glyphs will look something like:
     * <pre>{@code 
     * [{"g":"uni0651","cl":0,"dx":518,"dy":0,"ax":0,"ay":0},
     * {"g":"uni0628","cl":0,"dx":0,"dy":0,"ax":1897,"ay":0}]
     * }</pre>
     * <p>
     * Each glyph is a JSON object, with the following properties:
     * <ul>
     * <li>{@code g}: the glyph name or glyph index if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_GLYPH_NAMES} flag is set.
     * <li>{@code cl}: {@link GlyphInfoT}.cluster if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set.
     * <li>{@code dx},{@code dy},{@code ax},{@code ay}: {@link GlyphPositionT}.x_offset, {@link GlyphPositionT}.y_offset,
     *    {@link GlyphPositionT}.x_advance and {@link GlyphPositionT}.y_advance
     *    respectively, if {@code HB_BUFFER_SERIALIZE_FLAG_NO_POSITIONS} is not set.
     * <li>{@code xb},{@code yb},{@code w},{@code h}: {@link GlyphExtentsT}.x_bearing, {@link GlyphExtentsT}.y_bearing,
     *    {@link GlyphExtentsT}.width and {@link GlyphExtentsT}.height respectively if
     *    {@code HB_BUFFER_SERIALIZE_FLAG_GLYPH_EXTENTS} is set.
     * </ul>
     * @param buffer an {@link BufferT} buffer.
     * @param start the first item in {@code buffer} to serialize.
     * @param end the last item in {@code buffer} to serialize.
     * @param buf output string to
     *       write serialized buffer into.
     * @param bufSize the size of {@code buf}.
     * @param bufConsumed if not {@code NULL}, will be set to the number of bytes written into {@code buf}.
     * @param font the {@link FontT} used to shape this buffer, needed to
     *        read glyph names and extents. If {@code NULL}, an empty font will be used.
     * @param format the {@link BufferSerializeFormatT} to use for formatting the output.
     * @param flags the {@link BufferSerializeFlagsT} that control what glyph properties
     *         to serialize.
     * @return The number of serialized items.
     */
    public static int bufferSerializeGlyphs(org.harfbuzz.BufferT buffer, int start, int end, Out<byte[]> buf, int bufSize, Out<Integer> bufConsumed, @Nullable org.harfbuzz.FontT font, org.harfbuzz.BufferSerializeFormatT format, org.harfbuzz.BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_serialize_glyphs.invokeExact(
                    buffer.handle(),
                    start,
                    end,
                    (Addressable) bufPOINTER.address(),
                    bufSize,
                    (Addressable) (bufConsumed == null ? MemoryAddress.NULL : (Addressable) bufConsumedPOINTER.address()),
                    (Addressable) (font == null ? MemoryAddress.NULL : font.handle()),
                    format.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (bufConsumed != null) bufConsumed.set(bufConsumedPOINTER.get(Interop.valueLayout.C_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), bufSize * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT;
    }
    
    /**
     * Returns a list of supported buffer serialization formats.
     * @return A string array of buffer serialization formats. Should not be freed.
     */
    public static PointerString bufferSerializeListFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_buffer_serialize_list_formats.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Serializes {@code buffer} into a textual representation of its content,
     * when the buffer contains Unicode codepoints (i.e., before shaping). This is
     * useful for showing the contents of the buffer, for example during debugging.
     * There are currently two supported serialization formats:
     * <p>
     * <strong>text</strong><br/>
     * A human-readable, plain text format.
     * The serialized codepoints will look something like:
     * <pre>{@code 
     *  <U+0651=0|U+0628=1>
     * }</pre>
     * <ul>
     * <li>Glyphs are separated with {@code |}
     * <li>Unicode codepoints are expressed as zero-padded four (or more)
     *   digit hexadecimal numbers preceded by {@code U+}
     * <li>If {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set, the cluster
     *   will be indicated with a {@code =} then {@link GlyphInfoT}.cluster.
     * </ul>
     * <p>
     * <strong>json</strong><br/>
     * A machine-readable, structured format.
     * The serialized codepoints will be a list of objects with the following
     * properties:
     * <ul>
     * <li>{@code u}: the Unicode codepoint as a decimal integer
     * <li>{@code cl}: {@link GlyphInfoT}.cluster if
     *   {@code HB_BUFFER_SERIALIZE_FLAG_NO_CLUSTERS} is not set.
     * </ul>
     * <p>
     * For example:
     * <pre>{@code 
     * [{u:1617,cl:0},{u:1576,cl:1}]
     * }</pre>
     * @param buffer an {@link BufferT} buffer.
     * @param start the first item in {@code buffer} to serialize.
     * @param end the last item in {@code buffer} to serialize.
     * @param buf output string to
     *       write serialized buffer into.
     * @param bufSize the size of {@code buf}.
     * @param bufConsumed if not {@code NULL}, will be set to the number of bytes written into {@code buf}.
     * @param format the {@link BufferSerializeFormatT} to use for formatting the output.
     * @param flags the {@link BufferSerializeFlagsT} that control what glyph properties
     *         to serialize.
     * @return The number of serialized items.
     */
    public static int bufferSerializeUnicode(org.harfbuzz.BufferT buffer, int start, int end, Out<byte[]> buf, int bufSize, Out<Integer> bufConsumed, org.harfbuzz.BufferSerializeFormatT format, org.harfbuzz.BufferSerializeFlagsT flags) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment bufConsumedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_serialize_unicode.invokeExact(
                    buffer.handle(),
                    start,
                    end,
                    (Addressable) bufPOINTER.address(),
                    bufSize,
                    (Addressable) (bufConsumed == null ? MemoryAddress.NULL : (Addressable) bufConsumedPOINTER.address()),
                    format.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (bufConsumed != null) bufConsumed.set(bufConsumedPOINTER.get(Interop.valueLayout.C_INT, 0));
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), bufSize * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
        return RESULT;
    }
    
    /**
     * Sets the cluster level of a buffer. The {@link BufferClusterLevelT}
     * dictates one aspect of how HarfBuzz will treat non-base characters
     * during shaping.
     * @param buffer An {@link BufferT}
     * @param clusterLevel The cluster level to set on the buffer
     */
    public static void bufferSetClusterLevel(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferClusterLevelT clusterLevel) {
        try {
            DowncallHandles.hb_buffer_set_cluster_level.invokeExact(
                    buffer.handle(),
                    clusterLevel.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of {@code buffer} contents. Buffers are either empty, contain
     * characters (before shaping), or contain glyphs (the result of shaping).
     * @param buffer An {@link BufferT}
     * @param contentType The type of buffer contents to set
     */
    public static void bufferSetContentType(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferContentTypeT contentType) {
        try {
            DowncallHandles.hb_buffer_set_content_type.invokeExact(
                    buffer.handle(),
                    contentType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the text flow direction of the buffer. No shaping can happen without
     * setting {@code buffer} direction, and it controls the visual direction for the
     * output glyphs; for RTL direction the glyphs will be reversed. Many layout
     * features depend on the proper setting of the direction, for example,
     * reversing RTL text before shaping, then shaping with LTR direction is not
     * the same as keeping the text in logical order and shaping with RTL
     * direction.
     * @param buffer An {@link BufferT}
     * @param direction the {@link DirectionT} of the {@code buffer}
     */
    public static void bufferSetDirection(org.harfbuzz.BufferT buffer, org.harfbuzz.DirectionT direction) {
        try {
            DowncallHandles.hb_buffer_set_direction.invokeExact(
                    buffer.handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code buffer} flags to {@code flags}. See {@link BufferFlagsT}.
     * @param buffer An {@link BufferT}
     * @param flags The buffer flags to set
     */
    public static void bufferSetFlags(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferFlagsT flags) {
        try {
            DowncallHandles.hb_buffer_set_flags.invokeExact(
                    buffer.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@link CodepointT} that replaces invisible characters in
     * the shaping result.  If set to zero (default), the glyph for the
     * U+0020 SPACE character is used.  Otherwise, this value is used
     * verbatim.
     * @param buffer An {@link BufferT}
     * @param invisible the invisible {@link CodepointT}
     */
    public static void bufferSetInvisibleGlyph(org.harfbuzz.BufferT buffer, org.harfbuzz.CodepointT invisible) {
        try {
            DowncallHandles.hb_buffer_set_invisible_glyph.invokeExact(
                    buffer.handle(),
                    invisible.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * {@link LanguageT}.
     * @param buffer An {@link BufferT}
     * @param language An hb_language_t to set
     */
    public static void bufferSetLanguage(org.harfbuzz.BufferT buffer, org.harfbuzz.LanguageT language) {
        try {
            DowncallHandles.hb_buffer_set_language.invokeExact(
                    buffer.handle(),
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to hb_buffer_pre_allocate(), but clears any new items added at the
     * end.
     * @param buffer An {@link BufferT}
     * @param length The new length of {@code buffer}
     * @return {@code true} if {@code buffer} memory allocation succeeded, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT bufferSetLength(org.harfbuzz.BufferT buffer, int length) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_set_length.invokeExact(
                    buffer.handle(),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Sets the implementation function for {@link BufferMessageFuncT}.
     * @param buffer An {@link BufferT}
     * @param func Callback function
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void bufferSetMessageFunc(org.harfbuzz.BufferT buffer, org.harfbuzz.BufferMessageFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_buffer_set_message_func.invokeExact(
                    buffer.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@link CodepointT} that replaces characters not found in
     * the font during shaping.
     * <p>
     * The not-found glyph defaults to zero, sometimes knows as the
     * ".notdef" glyph.  This API allows for differentiating the two.
     * @param buffer An {@link BufferT}
     * @param notFound the not-found {@link CodepointT}
     */
    public static void bufferSetNotFoundGlyph(org.harfbuzz.BufferT buffer, org.harfbuzz.CodepointT notFound) {
        try {
            DowncallHandles.hb_buffer_set_not_found_glyph.invokeExact(
                    buffer.handle(),
                    notFound.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@link CodepointT} that replaces invalid entries for a given encoding
     * when adding text to {@code buffer}.
     * <p>
     * Default is {@code HB_BUFFER_REPLACEMENT_CODEPOINT_DEFAULT}.
     * @param buffer An {@link BufferT}
     * @param replacement the replacement {@link CodepointT}
     */
    public static void bufferSetReplacementCodepoint(org.harfbuzz.BufferT buffer, org.harfbuzz.CodepointT replacement) {
        try {
            DowncallHandles.hb_buffer_set_replacement_codepoint.invokeExact(
                    buffer.handle(),
                    replacement.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the script of {@code buffer} to {@code script}.
     * <p>
     * Script is crucial for choosing the proper shaping behaviour for scripts that
     * require it (e.g. Arabic) and the which OpenType features defined in the font
     * to be applied.
     * <p>
     * You can pass one of the predefined {@link ScriptT} values, or use
     * hb_script_from_string() or hb_script_from_iso15924_tag() to get the
     * corresponding script from an ISO 15924 script tag.
     * @param buffer An {@link BufferT}
     * @param script An {@link ScriptT} to set.
     */
    public static void bufferSetScript(org.harfbuzz.BufferT buffer, org.harfbuzz.ScriptT script) {
        try {
            DowncallHandles.hb_buffer_set_script.invokeExact(
                    buffer.handle(),
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the segment properties of the buffer, a shortcut for calling
     * hb_buffer_set_direction(), hb_buffer_set_script() and
     * hb_buffer_set_language() individually.
     * @param buffer An {@link BufferT}
     * @param props An {@link SegmentPropertiesT} to use
     */
    public static void bufferSetSegmentProperties(org.harfbuzz.BufferT buffer, org.harfbuzz.SegmentPropertiesT props) {
        try {
            DowncallHandles.hb_buffer_set_segment_properties.invokeExact(
                    buffer.handle(),
                    props.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the Unicode-functions structure of a buffer to
     * {@code unicode_funcs}.
     * @param buffer An {@link BufferT}
     * @param unicodeFuncs The Unicode-functions structure
     */
    public static void bufferSetUnicodeFuncs(org.harfbuzz.BufferT buffer, org.harfbuzz.UnicodeFuncsT unicodeFuncs) {
        try {
            DowncallHandles.hb_buffer_set_unicode_funcs.invokeExact(
                    buffer.handle(),
                    unicodeFuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified buffer.
     * @param buffer An {@link BufferT}
     * @param key The user-data key
     * @param data A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT bufferSetUserData(org.harfbuzz.BufferT buffer, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_buffer_set_user_data.invokeExact(
                    buffer.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the alpha channel of the given {@code color}.
     * @param color an {@link ColorT} we are interested in its channels.
     * @return Alpha channel value
     */
    public static byte colorGetAlpha(org.harfbuzz.ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.hb_color_get_alpha.invokeExact(
                    color.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the blue channel of the given {@code color}.
     * @param color an {@link ColorT} we are interested in its channels.
     * @return Blue channel value
     */
    public static byte colorGetBlue(org.harfbuzz.ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.hb_color_get_blue.invokeExact(
                    color.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the green channel of the given {@code color}.
     * @param color an {@link ColorT} we are interested in its channels.
     * @return Green channel value
     */
    public static byte colorGetGreen(org.harfbuzz.ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.hb_color_get_green.invokeExact(
                    color.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the red channel of the given {@code color}.
     * @param color an {@link ColorT} we are interested in its channels.
     * @return Red channel value
     */
    public static byte colorGetRed(org.harfbuzz.ColorT color) {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.hb_color_get_red.invokeExact(
                    color.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts a string to an {@link DirectionT}.
     * <p>
     * Matching is loose and applies only to the first letter. For
     * examples, "LTR" and "left-to-right" will both return {@code HB_DIRECTION_LTR}.
     * <p>
     * Unmatched strings will return {@code HB_DIRECTION_INVALID}.
     * @param str String to convert
     * @param len Length of {@code str}, or -1 if it is {@code NULL}-terminated
     * @return The {@link DirectionT} matching {@code str}
     */
    public static org.harfbuzz.DirectionT directionFromString(byte[] str, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_direction_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.DirectionT.of(RESULT);
    }
    
    /**
     * Converts an {@link DirectionT} to a string.
     * @param direction The {@link DirectionT} to convert
     * @return The string corresponding to {@code direction}
     */
    public static java.lang.String directionToString(org.harfbuzz.DirectionT direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_direction_to_string.invokeExact(
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Perform a "close-path" draw operation.
     * @param dfuncs draw functions
     * @param drawData associated draw data passed by the caller
     * @param st current draw state
     */
    public static void drawClosePath(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st) {
        try {
            DowncallHandles.hb_draw_close_path.invokeExact(
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData),
                    st.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform a "cubic-to" draw operation.
     * @param dfuncs draw functions
     * @param drawData associated draw data passed by the caller
     * @param st current draw state
     * @param control1X X component of first control point
     * @param control1Y Y component of first control point
     * @param control2X X component of second control point
     * @param control2Y Y component of second control point
     * @param toX X component of target point
     * @param toY Y component of target point
     */
    public static void drawCubicTo(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float control1X, float control1Y, float control2X, float control2Y, float toX, float toY) {
        try {
            DowncallHandles.hb_draw_cubic_to.invokeExact(
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData),
                    st.handle(),
                    control1X,
                    control1Y,
                    control2X,
                    control2Y,
                    toX,
                    toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new draw callbacks object.
     * @return A newly allocated {@link DrawFuncsT} with a reference count of 1. The initial
     * reference count should be released with hb_draw_funcs_destroy when you are
     * done using the {@link DrawFuncsT}. This function never returns {@code NULL}. If
     * memory cannot be allocated, a special singleton {@link DrawFuncsT} object will
     * be returned.
     */
    public static org.harfbuzz.DrawFuncsT drawFuncsCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_draw_funcs_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.DrawFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Deallocate the {@code dfuncs}.
     * Decreases the reference count on {@code dfuncs} by one. If the result is zero, then
     * {@code dfuncs} and all associated resources are freed. See hb_draw_funcs_reference().
     * @param dfuncs draw functions
     */
    public static void drawFuncsDestroy(org.harfbuzz.DrawFuncsT dfuncs) {
        try {
            DowncallHandles.hb_draw_funcs_destroy.invokeExact(
                    dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks whether {@code dfuncs} is immutable.
     * @param dfuncs draw functions
     * @return {@code true} if {@code dfuncs} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT drawFuncsIsImmutable(org.harfbuzz.DrawFuncsT dfuncs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_draw_funcs_is_immutable.invokeExact(
                    dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes {@code dfuncs} object immutable.
     * @param dfuncs draw functions
     */
    public static void drawFuncsMakeImmutable(org.harfbuzz.DrawFuncsT dfuncs) {
        try {
            DowncallHandles.hb_draw_funcs_make_immutable.invokeExact(
                    dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on {@code dfuncs} by one. This prevents {@code buffer} from
     * being destroyed until a matching call to hb_draw_funcs_destroy() is made.
     * @param dfuncs draw functions
     * @return The referenced {@link DrawFuncsT}.
     */
    public static org.harfbuzz.DrawFuncsT drawFuncsReference(org.harfbuzz.DrawFuncsT dfuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_draw_funcs_reference.invokeExact(
                    dfuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.DrawFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets close-path callback to the draw functions object.
     * @param dfuncs draw functions object
     * @param func close-path callback
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void drawFuncsSetClosePathFunc(org.harfbuzz.DrawFuncsT dfuncs, org.harfbuzz.DrawClosePathFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_draw_funcs_set_close_path_func.invokeExact(
                    dfuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets cubic-to callback to the draw functions object.
     * @param dfuncs draw functions
     * @param func cubic-to callback
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void drawFuncsSetCubicToFunc(org.harfbuzz.DrawFuncsT dfuncs, org.harfbuzz.DrawCubicToFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_draw_funcs_set_cubic_to_func.invokeExact(
                    dfuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets line-to callback to the draw functions object.
     * @param dfuncs draw functions object
     * @param func line-to callback
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void drawFuncsSetLineToFunc(org.harfbuzz.DrawFuncsT dfuncs, org.harfbuzz.DrawLineToFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_draw_funcs_set_line_to_func.invokeExact(
                    dfuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets move-to callback to the draw functions object.
     * @param dfuncs draw functions object
     * @param func move-to callback
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void drawFuncsSetMoveToFunc(org.harfbuzz.DrawFuncsT dfuncs, org.harfbuzz.DrawMoveToFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_draw_funcs_set_move_to_func.invokeExact(
                    dfuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets quadratic-to callback to the draw functions object.
     * @param dfuncs draw functions object
     * @param func quadratic-to callback
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void drawFuncsSetQuadraticToFunc(org.harfbuzz.DrawFuncsT dfuncs, org.harfbuzz.DrawQuadraticToFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_draw_funcs_set_quadratic_to_func.invokeExact(
                    dfuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform a "line-to" draw operation.
     * @param dfuncs draw functions
     * @param drawData associated draw data passed by the caller
     * @param st current draw state
     * @param toX X component of target point
     * @param toY Y component of target point
     */
    public static void drawLineTo(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float toX, float toY) {
        try {
            DowncallHandles.hb_draw_line_to.invokeExact(
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData),
                    st.handle(),
                    toX,
                    toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform a "move-to" draw operation.
     * @param dfuncs draw functions
     * @param drawData associated draw data passed by the caller
     * @param st current draw state
     * @param toX X component of target point
     * @param toY Y component of target point
     */
    public static void drawMoveTo(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float toX, float toY) {
        try {
            DowncallHandles.hb_draw_move_to.invokeExact(
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData),
                    st.handle(),
                    toX,
                    toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform a "quadratic-to" draw operation.
     * @param dfuncs draw functions
     * @param drawData associated draw data passed by the caller
     * @param st current draw state
     * @param controlX X component of control point
     * @param controlY Y component of control point
     * @param toX X component of target point
     * @param toY Y component of target point
     */
    public static void drawQuadraticTo(org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData, org.harfbuzz.DrawStateT st, float controlX, float controlY, float toX, float toY) {
        try {
            DowncallHandles.hb_draw_quadratic_to.invokeExact(
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData),
                    st.handle(),
                    controlX,
                    controlY,
                    toX,
                    toY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add table for {@code tag} with data provided by {@code blob} to the face.  {@code face} must
     * be created using hb_face_builder_create().
     * @param face A face object created with hb_face_builder_create()
     * @param tag The {@link TagT} of the table to add
     * @param blob The blob containing the table data to add
     */
    public static org.harfbuzz.BoolT faceBuilderAddTable(org.harfbuzz.FaceT face, org.harfbuzz.TagT tag, org.harfbuzz.BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_builder_add_table.invokeExact(
                    face.handle(),
                    tag.getValue().intValue(),
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Creates a {@link FaceT} that can be used with hb_face_builder_add_table().
     * After tables are added to the face, it can be compiled to a binary
     * font file by calling hb_face_reference_blob().
     * @return New face.
     */
    public static org.harfbuzz.FaceT faceBuilderCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_builder_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Collects all of the Unicode characters covered by {@code face} and adds
     * them to the {@link SetT} set {@code out}.
     * @param face A face object
     * @param out The set to add Unicode characters to
     */
    public static void faceCollectUnicodes(org.harfbuzz.FaceT face, org.harfbuzz.SetT out) {
        try {
            DowncallHandles.hb_face_collect_unicodes.invokeExact(
                    face.handle(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects all Unicode "Variation Selector" characters covered by {@code face} and adds
     * them to the {@link SetT} set {@code out}.
     * @param face A face object
     * @param out The set to add Variation Selector characters to
     */
    public static void faceCollectVariationSelectors(org.harfbuzz.FaceT face, org.harfbuzz.SetT out) {
        try {
            DowncallHandles.hb_face_collect_variation_selectors.invokeExact(
                    face.handle(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collects all Unicode characters for {@code variation_selector} covered by {@code face} and adds
     * them to the {@link SetT} set {@code out}.
     * @param face A face object
     * @param variationSelector The Variation Selector to query
     * @param out The set to add Unicode characters to
     */
    public static void faceCollectVariationUnicodes(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT variationSelector, org.harfbuzz.SetT out) {
        try {
            DowncallHandles.hb_face_collect_variation_unicodes.invokeExact(
                    face.handle(),
                    variationSelector.getValue().intValue(),
                    out.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the number of faces in a blob.
     * @param blob a blob.
     * @return Number of faces in {@code blob}
     */
    public static int faceCount(org.harfbuzz.BlobT blob) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_count.invokeExact(
                    blob.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param blob {@link BlobT} to work upon
     * @param index The index of the face within {@code blob}
     * @return The new face object
     */
    public static org.harfbuzz.FaceT faceCreate(org.harfbuzz.BlobT blob, int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_create.invokeExact(
                    blob.handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Variant of hb_face_create(), built for those cases where it is more
     * convenient to provide data for individual tables instead of the whole font
     * data. With the caveat that hb_face_get_table_tags() does not currently work
     * with faces created this way.
     * <p>
     * Creates a new face object from the specified {@code user_data} and {@code reference_table_func},
     * with the {@code destroy} callback.
     * @param referenceTableFunc Table-referencing function
     * @param userData A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @return The new face object
     */
    public static org.harfbuzz.FaceT faceCreateForTables(org.harfbuzz.ReferenceTableFuncT referenceTableFunc, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_create_for_tables.invokeExact(
                    (Addressable) referenceTableFunc.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on a face object. When the
     * reference count reaches zero, the face is destroyed,
     * freeing all memory.
     * @param face A face object
     */
    public static void faceDestroy(org.harfbuzz.FaceT face) {
        try {
            DowncallHandles.hb_face_destroy.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the singleton empty face object.
     * @return The empty face object
     */
    public static org.harfbuzz.FaceT faceGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the glyph-count value of the specified face object.
     * @param face A face object
     * @return The glyph-count value of {@code face}
     */
    public static int faceGetGlyphCount(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_get_glyph_count.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the face-index corresponding to the given face.
     * <p>
     * &lt;note&gt;Note: face indices within a collection are zero-based.&lt;/note&gt;
     * @param face A face object
     * @return The index of {@code face}.
     */
    public static int faceGetIndex(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_get_index.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches a list of all table tags for a face, if possible. The list returned will
     * begin at the offset provided
     * @param face A face object
     * @param startOffset The index of first table tag to retrieve
     * @param tableCount Input = the maximum number of table tags to return;
     *                Output = the actual number of table tags returned (may be zero)
     * @param tableTags The array of table tags found
     * @return Total number of tables, or zero if it is not possible to list
     */
    public static int faceGetTableTags(org.harfbuzz.FaceT face, int startOffset, Out<Integer> tableCount, Out<org.harfbuzz.TagT[]> tableTags) {
        MemorySegment tableCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment tableTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_get_table_tags.invokeExact(
                    face.handle(),
                    startOffset,
                    (Addressable) tableCountPOINTER.address(),
                    (Addressable) tableTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tableCount.set(tableCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.TagT[] tableTagsARRAY = new org.harfbuzz.TagT[tableCount.get().intValue()];
        for (int I = 0; I < tableCount.get().intValue(); I++) {
            var OBJ = tableTagsPOINTER.get(Interop.valueLayout.C_INT, I);
            tableTagsARRAY[I] = new org.harfbuzz.TagT(OBJ);
        }
        tableTags.set(tableTagsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the units-per-em (upem) value of the specified face object.
     * @param face A face object
     * @return The upem value of {@code face}
     */
    public static int faceGetUpem(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_get_upem.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified face object.
     * @param face A face object
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress faceGetUserData(org.harfbuzz.FaceT face, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_get_user_data.invokeExact(
                    face.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether the given face object is immutable.
     * @param face A face object
     * @return {@code true} is {@code face} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT faceIsImmutable(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_is_immutable.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes the given face object immutable.
     * @param face A face object
     */
    public static void faceMakeImmutable(org.harfbuzz.FaceT face) {
        try {
            DowncallHandles.hb_face_make_immutable.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on a face object.
     * @param face A face object
     * @return The {@code face} object
     */
    public static org.harfbuzz.FaceT faceReference(org.harfbuzz.FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_reference.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches a pointer to the binary blob that contains the
     * specified face. Returns an empty blob if referencing face data is not
     * possible.
     * @param face A face object
     * @return A pointer to the blob for {@code face}
     */
    public static org.harfbuzz.BlobT faceReferenceBlob(org.harfbuzz.FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_reference_blob.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches a reference to the specified table within
     * the specified face.
     * @param face A face object
     * @param tag The {@link TagT} of the table to query
     * @return A pointer to the {@code tag} table within {@code face}
     */
    public static org.harfbuzz.BlobT faceReferenceTable(org.harfbuzz.FaceT face, org.harfbuzz.TagT tag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_face_reference_table.invokeExact(
                    face.handle(),
                    tag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the glyph count for a face object to the specified value.
     * @param face A face object
     * @param glyphCount The glyph-count value to assign
     */
    public static void faceSetGlyphCount(org.harfbuzz.FaceT face, int glyphCount) {
        try {
            DowncallHandles.hb_face_set_glyph_count.invokeExact(
                    face.handle(),
                    glyphCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Assigns the specified face-index to {@code face}. Fails if the
     * face is immutable.
     * <p>
     * &lt;note&gt;Note: changing the index has no effect on the face itself
     * This only changes the value returned by hb_face_get_index().&lt;/note&gt;
     * @param face A face object
     * @param index The index to assign
     */
    public static void faceSetIndex(org.harfbuzz.FaceT face, int index) {
        try {
            DowncallHandles.hb_face_set_index.invokeExact(
                    face.handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the units-per-em (upem) for a face object to the specified value.
     * @param face A face object
     * @param upem The units-per-em value to assign
     */
    public static void faceSetUpem(org.harfbuzz.FaceT face, int upem) {
        try {
            DowncallHandles.hb_face_set_upem.invokeExact(
                    face.handle(),
                    upem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the given face object.
     * @param face A face object
     * @param key The user-data key to set
     * @param data A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT faceSetUserData(org.harfbuzz.FaceT face, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_face_set_user_data.invokeExact(
                    face.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Parses a string into a {@link FeatureT}.
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
     * @param str a string to parse
     * @param len length of {@code str}, or -1 if string is {@code NULL} terminated
     * @param feature the {@link FeatureT} to initialize with the parsed values
     * @return {@code true} if {@code str} is successfully parsed, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT featureFromString(byte[] str, int len, org.harfbuzz.FeatureT feature) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_feature_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len,
                    feature.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Converts a {@link FeatureT} into a {@code NULL}-terminated string in the format
     * understood by hb_feature_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     * @param feature an {@link FeatureT} to convert
     * @param buf output string
     * @param size the allocated size of {@code buf}
     */
    public static void featureToString(org.harfbuzz.FeatureT feature, Out<java.lang.String[]> buf, int size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_feature_to_string.invokeExact(
                    feature.handle(),
                    (Addressable) bufPOINTER.address(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        java.lang.String[] bufARRAY = new java.lang.String[size];
        for (int I = 0; I < size; I++) {
            var OBJ = bufPOINTER.get(Interop.valueLayout.ADDRESS, I);
            bufARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        buf.set(bufARRAY);
    }
    
    /**
     * Adds the origin coordinates to an (X,Y) point coordinate, in
     * the specified glyph ID in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param direction The direction of the text segment
     * @param x Input = The original X coordinate
     *     Output = The X coordinate plus the X-coordinate of the origin
     * @param y Input = The original Y coordinate
     *     Output = The Y coordinate plus the Y-coordinate of the origin
     */
    public static void fontAddGlyphOriginForDirection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_add_glyph_origin_for_direction.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Notifies the {@code font} that underlying font data has changed.
     * This has the effect of increasing the serial as returned
     * by hb_font_get_serial(), which invalidates internal caches.
     * @param font {@link FontT} to work upon
     */
    public static void fontChanged(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_font_changed.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param face a face.
     * @return The new font object
     */
    public static org.harfbuzz.FontT fontCreate(org.harfbuzz.FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_create.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Constructs a sub-font font object from the specified {@code parent} font,
     * replicating the parent's properties.
     * @param parent The parent font object
     * @return The new sub-font font object
     */
    public static org.harfbuzz.FontT fontCreateSubFont(org.harfbuzz.FontT parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_create_sub_font.invokeExact(
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on the given font object. When the
     * reference count reaches zero, the font is destroyed,
     * freeing all memory.
     * @param font {@link FontT} to work upon
     */
    public static void fontDestroy(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_font_destroy.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link FontFuncsT} structure of font functions.
     * @return The font-functions structure
     */
    public static org.harfbuzz.FontFuncsT fontFuncsCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_funcs_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on a font-functions structure. When
     * the reference count reaches zero, the font-functions structure is
     * destroyed, freeing all memory.
     * @param ffuncs The font-functions structure
     */
    public static void fontFuncsDestroy(org.harfbuzz.FontFuncsT ffuncs) {
        try {
            DowncallHandles.hb_font_funcs_destroy.invokeExact(
                    ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches an empty font-functions structure.
     * @return The font-functions structure
     */
    public static org.harfbuzz.FontFuncsT fontFuncsGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_funcs_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified font-functions structure.
     * @param ffuncs The font-functions structure
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress fontFuncsGetUserData(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_funcs_get_user_data.invokeExact(
                    ffuncs.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether a font-functions structure is immutable.
     * @param ffuncs The font-functions structure
     * @return {@code true} if {@code ffuncs} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontFuncsIsImmutable(org.harfbuzz.FontFuncsT ffuncs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_funcs_is_immutable.invokeExact(
                    ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes a font-functions structure immutable.
     * @param ffuncs The font-functions structure
     */
    public static void fontFuncsMakeImmutable(org.harfbuzz.FontFuncsT ffuncs) {
        try {
            DowncallHandles.hb_font_funcs_make_immutable.invokeExact(
                    ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on a font-functions structure.
     * @param ffuncs The font-functions structure
     * @return The font-functions structure
     */
    public static org.harfbuzz.FontFuncsT fontFuncsReference(org.harfbuzz.FontFuncsT ffuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_funcs_reference.invokeExact(
                    ffuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the implementation function for {@link FontGetFontHExtentsFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetFontHExtentsFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetFontHExtentsFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_font_h_extents_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetFontVExtentsFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetFontVExtentsFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetFontVExtentsFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_font_v_extents_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphContourPointFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphContourPointFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphContourPointFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_contour_point_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphExtentsFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphExtentsFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphExtentsFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_extents_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphFromNameFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphFromNameFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphFromNameFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_from_name_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deprecated.  Use hb_font_funcs_set_nominal_glyph_func() and
     * hb_font_funcs_set_variation_glyph_func() instead.
     * @param ffuncs The font-functions structure
     * @param func callback function
     * @param userData data to pass to {@code func}
     * @param destroy function to call when {@code user_data} is not needed anymore
     */
    @Deprecated
    public static void fontFuncsSetGlyphFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphHAdvanceFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphHAdvanceFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphHAdvanceFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_h_advance_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphHAdvancesFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphHAdvancesFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphHAdvancesFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_h_advances_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphHKerningFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphHKerningFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphHKerningFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_h_kerning_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphHOriginFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphHOriginFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphHOriginFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_h_origin_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphNameFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphNameFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphNameFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_name_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphShapeFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphShapeFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphShapeFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_shape_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphVAdvanceFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphVAdvanceFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphVAdvanceFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_v_advance_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphVAdvancesFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphVAdvancesFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphVAdvancesFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_v_advances_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphVKerningFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    @Deprecated
    public static void fontFuncsSetGlyphVKerningFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphVKerningFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_v_kerning_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetGlyphVOriginFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetGlyphVOriginFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetGlyphVOriginFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_glyph_v_origin_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetNominalGlyphFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetNominalGlyphFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetNominalGlyphFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_nominal_glyph_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link FontGetNominalGlyphsFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetNominalGlyphsFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetNominalGlyphsFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_nominal_glyphs_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified font-functions structure.
     * @param ffuncs The font-functions structure
     * @param key The user-data key to set
     * @param data A pointer to the user data set
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontFuncsSetUserData(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_funcs_set_user_data.invokeExact(
                    ffuncs.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Sets the implementation function for {@link FontGetVariationGlyphFuncT}.
     * @param ffuncs A font-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void fontFuncsSetVariationGlyphFunc(org.harfbuzz.FontFuncsT ffuncs, org.harfbuzz.FontGetVariationGlyphFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_funcs_set_variation_glyph_func.invokeExact(
                    ffuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the empty font object.
     * @return The empty font object
     */
    public static org.harfbuzz.FontT fontGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the extents for a font in a text segment of the
     * specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param direction The direction of the text segment
     * @param extents The {@link FontExtentsT} retrieved
     */
    public static void fontGetExtentsForDirection(org.harfbuzz.FontT font, org.harfbuzz.DirectionT direction, org.harfbuzz.FontExtentsT extents) {
        try {
            DowncallHandles.hb_font_get_extents_for_direction.invokeExact(
                    font.handle(),
                    direction.getValue(),
                    extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the face associated with the specified font object.
     * @param font {@link FontT} to work upon
     * @return The {@link FaceT} value
     */
    public static org.harfbuzz.FaceT fontGetFace(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_face.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetches the glyph ID for a Unicode code point in the specified
     * font, with an optional variation selector.
     * <p>
     * If {@code variation_selector} is 0, calls hb_font_get_nominal_glyph();
     * otherwise calls hb_font_get_variation_glyph().
     * @param font {@link FontT} to work upon
     * @param unicode The Unicode code point to query
     * @param variationSelector A variation-selector code point
     * @param glyph The glyph ID retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyph(org.harfbuzz.FontT font, org.harfbuzz.CodepointT unicode, org.harfbuzz.CodepointT variationSelector, org.harfbuzz.CodepointT glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph.invokeExact(
                    font.handle(),
                    unicode.getValue().intValue(),
                    variationSelector.getValue().intValue(),
                    (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.setValue(glyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the advance for a glyph ID from the specified font,
     * in a text segment of the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param direction The direction of the text segment
     * @param x The horizontal advance retrieved
     * @param y The vertical advance retrieved
     */
    public static void fontGetGlyphAdvanceForDirection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_advance_for_direction.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, in a text segment of the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param direction The direction of the text segment
     * @param count The number of glyph IDs in the sequence queried
     * @param firstGlyph The first glyph ID to query
     * @param glyphStride The stride between successive glyph IDs
     * @param firstAdvance The first advance retrieved
     * @param advanceStride The stride between successive advances
     */
    public static void fontGetGlyphAdvancesForDirection(org.harfbuzz.FontT font, org.harfbuzz.DirectionT direction, int count, org.harfbuzz.CodepointT firstGlyph, int glyphStride, org.harfbuzz.PositionT firstAdvance, int advanceStride) {
        MemorySegment firstGlyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_advances_for_direction.invokeExact(
                    font.handle(),
                    direction.getValue(),
                    count,
                    (Addressable) firstGlyphPOINTER.address(),
                    glyphStride,
                    (Addressable) firstAdvancePOINTER.address(),
                    advanceStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        firstGlyph.setValue(firstGlyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        firstAdvance.setValue(firstAdvancePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the (x,y) coordinates of a specified contour-point index
     * in the specified glyph, within the specified font.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param pointIndex The contour-point index to query
     * @param x The X value retrieved for the contour point
     * @param y The Y value retrieved for the contour point
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphContourPoint(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, int pointIndex, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_contour_point.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    pointIndex,
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of a specified contour-point index
     * in the specified glyph ID in the specified font, with respect
     * to the origin in a text segment in the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param pointIndex The contour-point index to query
     * @param direction The direction of the text segment
     * @param x The X value retrieved for the contour point
     * @param y The Y value retrieved for the contour point
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphContourPointForOrigin(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, int pointIndex, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_contour_point_for_origin.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    pointIndex,
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the {@link GlyphExtentsT} data for a glyph ID
     * in the specified font.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param extents The {@link GlyphExtentsT} retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphExtents(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.GlyphExtentsT extents) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_extents.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the {@link GlyphExtentsT} data for a glyph ID
     * in the specified font, with respect to the origin in
     * a text segment in the specified direction.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param direction The direction of the text segment
     * @param extents The {@link GlyphExtentsT} retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphExtentsForOrigin(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, org.harfbuzz.GlyphExtentsT extents) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_extents_for_origin.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID that corresponds to a name string in the specified {@code font}.
     * <p>
     * &lt;note&gt;Note: {@code len} == -1 means the name string is null-terminated.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param name The name string to query
     * @param len The length of the name queried
     * @param glyph The glyph ID retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphFromName(org.harfbuzz.FontT font, java.lang.String[] name, int len, org.harfbuzz.CodepointT glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_from_name.invokeExact(
                    font.handle(),
                    Interop.allocateNativeArray(name, false),
                    len,
                    (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.setValue(glyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for horizontal text segments.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @return The advance of {@code glyph} within {@code font}
     */
    public static org.harfbuzz.PositionT fontGetGlyphHAdvance(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_h_advance.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for horizontal text segments.
     * @param font {@link FontT} to work upon
     * @param count The number of glyph IDs in the sequence queried
     * @param firstGlyph The first glyph ID to query
     * @param glyphStride The stride between successive glyph IDs
     * @param firstAdvance The first advance retrieved
     * @param advanceStride The stride between successive advances
     */
    public static void fontGetGlyphHAdvances(org.harfbuzz.FontT font, int count, org.harfbuzz.CodepointT firstGlyph, int glyphStride, org.harfbuzz.PositionT firstAdvance, int advanceStride) {
        MemorySegment firstGlyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_h_advances.invokeExact(
                    font.handle(),
                    count,
                    (Addressable) firstGlyphPOINTER.address(),
                    glyphStride,
                    (Addressable) firstAdvancePOINTER.address(),
                    advanceStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        firstGlyph.setValue(firstGlyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        firstAdvance.setValue(firstAdvancePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in
     * the specified font, for horizontal text segments.
     * <p>
     * &lt;note&gt;It handles legacy kerning only (as returned by the corresponding
     * {@link FontFuncsT} function).&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param leftGlyph The glyph ID of the left glyph in the glyph pair
     * @param rightGlyph The glyph ID of the right glyph in the glyph pair
     * @return The kerning adjustment value
     */
    public static org.harfbuzz.PositionT fontGetGlyphHKerning(org.harfbuzz.FontT font, org.harfbuzz.CodepointT leftGlyph, org.harfbuzz.CodepointT rightGlyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_h_kerning.invokeExact(
                    font.handle(),
                    leftGlyph.getValue().intValue(),
                    rightGlyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for horizontal text segments.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param x The X coordinate of the origin
     * @param y The Y coordinate of the origin
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphHOrigin(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_h_origin.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param firstGlyph The glyph ID of the first glyph in the glyph pair to query
     * @param secondGlyph The glyph ID of the second glyph in the glyph pair to query
     * @param direction The direction of the text segment
     * @param x The horizontal kerning-adjustment value retrieved
     * @param y The vertical kerning-adjustment value retrieved
     */
    public static void fontGetGlyphKerningForDirection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT firstGlyph, org.harfbuzz.CodepointT secondGlyph, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_kerning_for_direction.invokeExact(
                    font.handle(),
                    firstGlyph.getValue().intValue(),
                    secondGlyph.getValue().intValue(),
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the glyph-name string for a glyph ID in the specified {@code font}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param name Name string retrieved for the glyph ID
     * @param size Length of the glyph-name string retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphName(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, Out<java.lang.String[]> name, int size) {
        MemorySegment namePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_name.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    (Addressable) namePOINTER.address(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        java.lang.String[] nameARRAY = new java.lang.String[size];
        for (int I = 0; I < size; I++) {
            var OBJ = namePOINTER.get(Interop.valueLayout.ADDRESS, I);
            nameARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        name.set(nameARRAY);
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph in
     * the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param direction The direction of the text segment
     * @param x The X coordinate retrieved for the origin
     * @param y The Y coordinate retrieved for the origin
     */
    public static void fontGetGlyphOriginForDirection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_origin_for_direction.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the glyph shape that corresponds to a glyph in the specified {@code font}.
     * The shape is returned by way of calls to the callsbacks of the {@code dfuncs}
     * objects, with {@code draw_data} passed to them.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID
     * @param dfuncs {@link DrawFuncsT} to draw to
     * @param drawData User data to pass to draw callbacks
     */
    public static void fontGetGlyphShape(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DrawFuncsT dfuncs, @Nullable java.lang.foreign.MemoryAddress drawData) {
        try {
            DowncallHandles.hb_font_get_glyph_shape.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    dfuncs.handle(),
                    (Addressable) (drawData == null ? MemoryAddress.NULL : (Addressable) drawData));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the advance for a glyph ID in the specified font,
     * for vertical text segments.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @return The advance of {@code glyph} within {@code font}
     */
    public static org.harfbuzz.PositionT fontGetGlyphVAdvance(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_v_advance.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the advances for a sequence of glyph IDs in the specified
     * font, for vertical text segments.
     * @param font {@link FontT} to work upon
     * @param count The number of glyph IDs in the sequence queried
     * @param firstGlyph The first glyph ID to query
     * @param glyphStride The stride between successive glyph IDs
     * @param firstAdvance The first advance retrieved
     * @param advanceStride The stride between successive advances
     */
    public static void fontGetGlyphVAdvances(org.harfbuzz.FontT font, int count, org.harfbuzz.CodepointT firstGlyph, int glyphStride, org.harfbuzz.PositionT firstAdvance, int advanceStride) {
        MemorySegment firstGlyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment firstAdvancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_glyph_v_advances.invokeExact(
                    font.handle(),
                    count,
                    (Addressable) firstGlyphPOINTER.address(),
                    glyphStride,
                    (Addressable) firstAdvancePOINTER.address(),
                    advanceStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        firstGlyph.setValue(firstGlyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        firstAdvance.setValue(firstAdvancePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the kerning-adjustment value for a glyph-pair in
     * the specified font, for vertical text segments.
     * <p>
     * &lt;note&gt;It handles legacy kerning only (as returned by the corresponding
     * {@link FontFuncsT} function).&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param topGlyph The glyph ID of the top glyph in the glyph pair
     * @param bottomGlyph The glyph ID of the bottom glyph in the glyph pair
     * @return The kerning adjustment value
     */
    @Deprecated
    public static org.harfbuzz.PositionT fontGetGlyphVKerning(org.harfbuzz.FontT font, org.harfbuzz.CodepointT topGlyph, org.harfbuzz.CodepointT bottomGlyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_v_kerning.invokeExact(
                    font.handle(),
                    topGlyph.getValue().intValue(),
                    bottomGlyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the (X,Y) coordinates of the origin for a glyph ID
     * in the specified font, for vertical text segments.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param x The X coordinate of the origin
     * @param y The Y coordinate of the origin
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetGlyphVOrigin(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_glyph_v_origin.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the extents for a specified font, for horizontal
     * text segments.
     * @param font {@link FontT} to work upon
     * @param extents The font extents retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetHExtents(org.harfbuzz.FontT font, org.harfbuzz.FontExtentsT extents) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_h_extents.invokeExact(
                    font.handle(),
                    extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the nominal glyph ID for a Unicode code point in the
     * specified font.
     * <p>
     * This version of the function should not be used to fetch glyph IDs
     * for code points modified by variation selectors. For variation-selector
     * support, user hb_font_get_variation_glyph() or use hb_font_get_glyph().
     * @param font {@link FontT} to work upon
     * @param unicode The Unicode code point to query
     * @param glyph The glyph ID retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetNominalGlyph(org.harfbuzz.FontT font, org.harfbuzz.CodepointT unicode, org.harfbuzz.CodepointT glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_nominal_glyph.invokeExact(
                    font.handle(),
                    unicode.getValue().intValue(),
                    (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.setValue(glyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the nominal glyph IDs for a sequence of Unicode code points. Glyph
     * IDs must be returned in a {@link CodepointT} output parameter.
     * @param font {@link FontT} to work upon
     * @param count number of code points to query
     * @param firstUnicode The first Unicode code point to query
     * @param unicodeStride The stride between successive code points
     * @param firstGlyph The first glyph ID retrieved
     * @param glyphStride The stride between successive glyph IDs
     * @return the number of code points processed
     */
    public static int fontGetNominalGlyphs(org.harfbuzz.FontT font, int count, org.harfbuzz.CodepointT firstUnicode, int unicodeStride, org.harfbuzz.CodepointT firstGlyph, int glyphStride) {
        MemorySegment firstUnicodePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment firstGlyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_nominal_glyphs.invokeExact(
                    font.handle(),
                    count,
                    (Addressable) firstUnicodePOINTER.address(),
                    unicodeStride,
                    (Addressable) firstGlyphPOINTER.address(),
                    glyphStride);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        firstUnicode.setValue(firstUnicodePOINTER.get(Interop.valueLayout.C_INT, 0));
        firstGlyph.setValue(firstGlyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
    
    /**
     * Fetches the parent font of {@code font}.
     * @param font {@link FontT} to work upon
     * @return The parent font object
     */
    public static org.harfbuzz.FontT fontGetParent(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_parent.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetches the horizontal and vertical points-per-em (ppem) of a font.
     * @param font {@link FontT} to work upon
     * @param xPpem Horizontal ppem value
     * @param yPpem Vertical ppem value
     */
    public static void fontGetPpem(org.harfbuzz.FontT font, Out<Integer> xPpem, Out<Integer> yPpem) {
        MemorySegment xPpemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPpemPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_ppem.invokeExact(
                    font.handle(),
                    (Addressable) xPpemPOINTER.address(),
                    (Addressable) yPpemPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xPpem.set(xPpemPOINTER.get(Interop.valueLayout.C_INT, 0));
        yPpem.set(yPpemPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the "point size" of a font. Used in CoreText to
     * implement optical sizing.
     * @param font {@link FontT} to work upon
     * @return Point size.  A value of zero means "not set."
     */
    public static float fontGetPtem(org.harfbuzz.FontT font) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.hb_font_get_ptem.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the horizontal and vertical scale of a font.
     * @param font {@link FontT} to work upon
     * @param xScale Horizontal scale value
     * @param yScale Vertical scale value
     */
    public static void fontGetScale(org.harfbuzz.FontT font, Out<Integer> xScale, Out<Integer> yScale) {
        MemorySegment xScalePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yScalePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_get_scale.invokeExact(
                    font.handle(),
                    (Addressable) xScalePOINTER.address(),
                    (Addressable) yScalePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xScale.set(xScalePOINTER.get(Interop.valueLayout.C_INT, 0));
        yScale.set(yScalePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Returns the internal serial number of the font. The serial
     * number is increased every time a setting on the font is
     * changed, using a setter function.
     * @param font {@link FontT} to work upon
     * @return serial number
     */
    public static int fontGetSerial(org.harfbuzz.FontT font) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_serial.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the "synthetic slant" of a font.
     * @param font {@link FontT} to work upon
     * @return Synthetic slant.  By default is zero.
     */
    public static float fontGetSyntheticSlant(org.harfbuzz.FontT font) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.hb_font_get_synthetic_slant.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the user-data object associated with the specified key,
     * attached to the specified font object.
     * @param font {@link FontT} to work upon
     * @param key The user-data key to query
     * @return Pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress fontGetUserData(org.harfbuzz.FontT font, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_user_data.invokeExact(
                    font.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the extents for a specified font, for vertical
     * text segments.
     * @param font {@link FontT} to work upon
     * @param extents The font extents retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetVExtents(org.harfbuzz.FontT font, org.harfbuzz.FontExtentsT extents) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_v_extents.invokeExact(
                    font.handle(),
                    extents.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
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
     * @param font {@link FontT} to work upon
     * @param length Number of coordinates retrieved
     * @return coordinates array
     */
    public static PointerFloat fontGetVarCoordsDesign(org.harfbuzz.FontT font, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_var_coords_design.invokeExact(
                    font.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
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
     * @param font {@link FontT} to work upon
     * @param length Number of coordinates retrieved
     * @return coordinates array
     */
    public static PointerInteger fontGetVarCoordsNormalized(org.harfbuzz.FontT font, Out<Integer> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_get_var_coords_normalized.invokeExact(
                    font.handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new PointerInteger(RESULT);
    }
    
    /**
     * Fetches the glyph ID for a Unicode code point when followed by
     * by the specified variation-selector code point, in the specified
     * font.
     * @param font {@link FontT} to work upon
     * @param unicode The Unicode code point to query
     * @param variationSelector The  variation-selector code point to query
     * @param glyph The glyph ID retrieved
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGetVariationGlyph(org.harfbuzz.FontT font, org.harfbuzz.CodepointT unicode, org.harfbuzz.CodepointT variationSelector, org.harfbuzz.CodepointT glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_get_variation_glyph.invokeExact(
                    font.handle(),
                    unicode.getValue().intValue(),
                    variationSelector.getValue().intValue(),
                    (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.setValue(glyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the glyph ID from {@code font} that matches the specified string.
     * Strings of the format {@code gidDDD} or {@code uniUUUU} are parsed automatically.
     * <p>
     * &lt;note&gt;Note: {@code len} == -1 means the string is null-terminated.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param s string to query
     * @param len The length of the string {@code s}
     * @param glyph The glyph ID corresponding to the string requested
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontGlyphFromString(org.harfbuzz.FontT font, byte[] s, int len, org.harfbuzz.CodepointT glyph) {
        MemorySegment glyphPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_glyph_from_string.invokeExact(
                    font.handle(),
                    Interop.allocateNativeArray(s, false),
                    len,
                    (Addressable) glyphPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyph.setValue(glyphPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the name of the specified glyph ID in {@code font} and returns
     * it in string {@code s}.
     * <p>
     * If the glyph ID has no name in {@code font}, a string of the form {@code gidDDD} is
     * generated, with {@code DDD} being the glyph ID.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param s The string containing the glyph name
     * @param size Length of string {@code s}
     */
    public static void fontGlyphToString(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, Out<java.lang.String[]> s, int size) {
        MemorySegment sPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_font_glyph_to_string.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    (Addressable) sPOINTER.address(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        java.lang.String[] sARRAY = new java.lang.String[size];
        for (int I = 0; I < size; I++) {
            var OBJ = sPOINTER.get(Interop.valueLayout.ADDRESS, I);
            sARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        s.set(sARRAY);
    }
    
    /**
     * Tests whether a font object is immutable.
     * @param font {@link FontT} to work upon
     * @return {@code true} if {@code font} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontIsImmutable(org.harfbuzz.FontT font) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_is_immutable.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes {@code font} immutable.
     * @param font {@link FontT} to work upon
     */
    public static void fontMakeImmutable(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_font_make_immutable.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on the given font object.
     * @param font {@link FontT} to work upon
     * @return The {@code font} object
     */
    public static org.harfbuzz.FontT fontReference(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_font_reference.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets {@code face} as the font-face value of {@code font}.
     * @param font {@link FontT} to work upon
     * @param face The {@link FaceT} to assign
     */
    public static void fontSetFace(org.harfbuzz.FontT font, org.harfbuzz.FaceT face) {
        try {
            DowncallHandles.hb_font_set_face.invokeExact(
                    font.handle(),
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Replaces the font-functions structure attached to a font, updating
     * the font's user-data with {@code font}-data and the {@code destroy} callback.
     * @param font {@link FontT} to work upon
     * @param klass The font-functions structure.
     * @param fontData Data to attach to {@code font}
     * @param destroy The function to call when {@code font_data} is not needed anymore
     */
    public static void fontSetFuncs(org.harfbuzz.FontT font, org.harfbuzz.FontFuncsT klass, @Nullable java.lang.foreign.MemoryAddress fontData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_set_funcs.invokeExact(
                    font.handle(),
                    klass.handle(),
                    (Addressable) (fontData == null ? MemoryAddress.NULL : (Addressable) fontData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Replaces the user data attached to a font, updating the font's
     * {@code destroy} callback.
     * @param font {@link FontT} to work upon
     * @param fontData Data to attach to {@code font}
     * @param destroy The function to call when {@code font_data} is not needed anymore
     */
    public static void fontSetFuncsData(org.harfbuzz.FontT font, @Nullable java.lang.foreign.MemoryAddress fontData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_font_set_funcs_data.invokeExact(
                    font.handle(),
                    (Addressable) (fontData == null ? MemoryAddress.NULL : (Addressable) fontData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the parent font of {@code font}.
     * @param font {@link FontT} to work upon
     * @param parent The parent font object to assign
     */
    public static void fontSetParent(org.harfbuzz.FontT font, org.harfbuzz.FontT parent) {
        try {
            DowncallHandles.hb_font_set_parent.invokeExact(
                    font.handle(),
                    parent.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal and vertical pixels-per-em (ppem) of a font.
     * @param font {@link FontT} to work upon
     * @param xPpem Horizontal ppem value to assign
     * @param yPpem Vertical ppem value to assign
     */
    public static void fontSetPpem(org.harfbuzz.FontT font, int xPpem, int yPpem) {
        try {
            DowncallHandles.hb_font_set_ppem.invokeExact(
                    font.handle(),
                    xPpem,
                    yPpem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the "point size" of a font. Set to zero to unset.
     * Used in CoreText to implement optical sizing.
     * <p>
     * &lt;note&gt;Note: There are 72 points in an inch.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param ptem font size in points.
     */
    public static void fontSetPtem(org.harfbuzz.FontT font, float ptem) {
        try {
            DowncallHandles.hb_font_set_ptem.invokeExact(
                    font.handle(),
                    ptem);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal and vertical scale of a font.
     * @param font {@link FontT} to work upon
     * @param xScale Horizontal scale value to assign
     * @param yScale Vertical scale value to assign
     */
    public static void fontSetScale(org.harfbuzz.FontT font, int xScale, int yScale) {
        try {
            DowncallHandles.hb_font_set_scale.invokeExact(
                    font.handle(),
                    xScale,
                    yScale);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param font {@link FontT} to work upon
     * @param slant synthetic slant value.
     */
    public static void fontSetSyntheticSlant(org.harfbuzz.FontT font, float slant) {
        try {
            DowncallHandles.hb_font_set_synthetic_slant.invokeExact(
                    font.handle(),
                    slant);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified font object.
     * @param font {@link FontT} to work upon
     * @param key The user-data key
     * @param data A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT fontSetUserData(org.harfbuzz.FontT font, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_font_set_user_data.invokeExact(
                    font.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Applies a list of variation coordinates (in design-space units)
     * to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code coords} will be effectively set to their
     * default values.
     * @param font {@link FontT} to work upon
     * @param coords Array of variation coordinates to apply
     * @param coordsLength Number of coordinates to apply
     */
    public static void fontSetVarCoordsDesign(org.harfbuzz.FontT font, float[] coords, int coordsLength) {
        try {
            DowncallHandles.hb_font_set_var_coords_design.invokeExact(
                    font.handle(),
                    Interop.allocateNativeArray(coords, false),
                    coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies a list of variation coordinates (in normalized units)
     * to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code coords} will be effectively set to their
     * default values.
     * <p>
     * &lt;note&gt;Note: Coordinates should be normalized to 2.14.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param coords Array of variation coordinates to apply
     * @param coordsLength Number of coordinates to apply
     */
    public static void fontSetVarCoordsNormalized(org.harfbuzz.FontT font, int[] coords, int coordsLength) {
        try {
            DowncallHandles.hb_font_set_var_coords_normalized.invokeExact(
                    font.handle(),
                    Interop.allocateNativeArray(coords, false),
                    coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets design coords of a font from a named instance index.
     * @param font a font.
     * @param instanceIndex named instance index.
     */
    public static void fontSetVarNamedInstance(org.harfbuzz.FontT font, int instanceIndex) {
        try {
            DowncallHandles.hb_font_set_var_named_instance.invokeExact(
                    font.handle(),
                    instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies a list of font-variation settings to a font.
     * <p>
     * Note that this overrides all existing variations set on {@code font}.
     * Axes not included in {@code variations} will be effectively set to their
     * default values.
     * @param font {@link FontT} to work upon
     * @param variations Array of variation settings to apply
     * @param variationsLength Number of variations to apply
     */
    public static void fontSetVariations(org.harfbuzz.FontT font, org.harfbuzz.VariationT[] variations, int variationsLength) {
        try {
            DowncallHandles.hb_font_set_variations.invokeExact(
                    font.handle(),
                    Interop.allocateNativeArray(variations, org.harfbuzz.VariationT.getMemoryLayout(), false),
                    variationsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Subtracts the origin coordinates from an (X,Y) point coordinate,
     * in the specified glyph ID in the specified font.
     * <p>
     * Calls the appropriate direction-specific variant (horizontal
     * or vertical) depending on the value of {@code direction}.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph ID to query
     * @param direction The direction of the text segment
     * @param x Input = The original X coordinate
     *     Output = The X coordinate minus the X-coordinate of the origin
     * @param y Input = The original Y coordinate
     *     Output = The Y coordinate minus the Y-coordinate of the origin
     */
    public static void fontSubtractGlyphOriginForDirection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, org.harfbuzz.PositionT x, org.harfbuzz.PositionT y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_font_subtract_glyph_origin_for_direction.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    (Addressable) xPOINTER.address(),
                    (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.setValue(xPOINTER.get(Interop.valueLayout.C_INT, 0));
        y.setValue(yPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Creates an {@link FaceT} face object from the specified FT_Face.
     * <p>
     * This variant of the function does not provide any life-cycle management.
     * <p>
     * Most client programs should use hb_ft_face_create_referenced()
     * (or, perhaps, hb_ft_face_create_cached()) instead.
     * <p>
     * If you know you have valid reasons not to use hb_ft_face_create_referenced(),
     * then it is the client program's responsibility to destroy {@code ft_face}
     * after the {@link FaceT} face object has been destroyed.
     * @param ftFace FT_Face to work upon
     * @param destroy A callback to call when the face object is not needed anymore
     * @return the new {@link FaceT} face object
     */
    public static org.harfbuzz.FaceT ftFaceCreate(org.freetype.Face ftFace, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_face_create.invokeExact(
                    ftFace.handle(),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates an {@link FaceT} face object from the specified FT_Face.
     * <p>
     * This variant of the function caches the newly created {@link FaceT}
     * face object, using the {@code generic} pointer of {@code ft_face}. Subsequent function
     * calls that are passed the same {@code ft_face} parameter will have the same
     * {@link FaceT} returned to them, and that {@link FaceT} will be correctly
     * reference counted.
     * <p>
     * However, client programs are still responsible for destroying
     * {@code ft_face} after the last {@link FaceT} face object has been destroyed.
     * @param ftFace FT_Face to work upon
     * @return the new {@link FaceT} face object
     */
    public static org.harfbuzz.FaceT ftFaceCreateCached(org.freetype.Face ftFace) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_face_create_cached.invokeExact(
                    ftFace.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates an {@link FaceT} face object from the specified FT_Face.
     * <p>
     * This is the preferred variant of the hb_ft_face_create*
     * function family, because it calls FT_Reference_Face() on {@code ft_face},
     * ensuring that {@code ft_face} remains alive as long as the resulting
     * {@link FaceT} face object remains alive. Also calls FT_Done_Face()
     * when the {@link FaceT} face object is destroyed.
     * <p>
     * Use this version unless you know you have good reasons not to.
     * @param ftFace FT_Face to work upon
     * @return the new {@link FaceT} face object
     */
    public static org.harfbuzz.FaceT ftFaceCreateReferenced(org.freetype.Face ftFace) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_face_create_referenced.invokeExact(
                    ftFace.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FaceT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Refreshes the state of {@code font} when the underlying FT_Face has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the FT_Face.
     * @param font {@link FontT} to work upon
     */
    public static void ftFontChanged(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_ft_font_changed.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an {@link FontT} font object from the specified FT_Face.
     * <p>
     * &lt;note&gt;Note: You must set the face size on {@code ft_face} before calling
     * hb_ft_font_create() on it. HarfBuzz assumes size is always set and will
     * access {@code size} member of FT_Face unconditionally.&lt;/note&gt;
     * <p>
     * This variant of the function does not provide any life-cycle management.
     * <p>
     * Most client programs should use hb_ft_font_create_referenced()
     * instead.
     * <p>
     * If you know you have valid reasons not to use hb_ft_font_create_referenced(),
     * then it is the client program's responsibility to destroy {@code ft_face}
     * after the {@link FontT} font object has been destroyed.
     * <p>
     * HarfBuzz will use the {@code destroy} callback on the {@link FontT} font object
     * if it is supplied when you use this function. However, even if {@code destroy}
     * is provided, it is the client program's responsibility to destroy {@code ft_face},
     * and it is the client program's responsibility to ensure that {@code ft_face} is
     * destroyed only after the {@link FontT} font object has been destroyed.
     * @param ftFace FT_Face to work upon
     * @param destroy A callback to call when the font object is not needed anymore
     * @return the new {@link FontT} font object
     */
    public static org.harfbuzz.FontT ftFontCreate(org.freetype.Face ftFace, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_font_create.invokeExact(
                    ftFace.handle(),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates an {@link FontT} font object from the specified FT_Face.
     * <p>
     * &lt;note&gt;Note: You must set the face size on {@code ft_face} before calling
     * hb_ft_font_create_referenced() on it. HarfBuzz assumes size is always set
     * and will access {@code size} member of FT_Face unconditionally.&lt;/note&gt;
     * <p>
     * This is the preferred variant of the hb_ft_font_create*
     * function family, because it calls FT_Reference_Face() on {@code ft_face},
     * ensuring that {@code ft_face} remains alive as long as the resulting
     * {@link FontT} font object remains alive.
     * <p>
     * Use this version unless you know you have good reasons not to.
     * @param ftFace FT_Face to work upon
     * @return the new {@link FontT} font object
     */
    public static org.harfbuzz.FontT ftFontCreateReferenced(org.freetype.Face ftFace) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_font_create_referenced.invokeExact(
                    ftFace.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.FontT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the FT_Face associated with the specified {@link FontT}
     * font object.
     * @param font {@link FontT} to work upon
     * @return the FT_Face found or {@code NULL}
     */
    public static @Nullable org.freetype.Face ftFontGetFace(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_font_get_face.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.freetype.Face.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Fetches the FT_Load_Glyph load flags of the specified {@link FontT}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     * @param font {@link FontT} to work upon
     * @return FT_Load_Glyph flags found
     */
    public static int ftFontGetLoadFlags(org.harfbuzz.FontT font) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ft_font_get_load_flags.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the FT_Face associated with {@code font}, This face will be kept around until
     * you call hb_ft_font_unlock_face().
     * @param font {@link FontT} to work upon
     * @return the FT_Face associated with {@code font} or {@code NULL}
     */
    public static @Nullable org.freetype.Face ftFontLockFace(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ft_font_lock_face.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.freetype.Face.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Configures the font-functions structure of the specified
     * {@link FontT} font object to use FreeType font functions.
     * <p>
     * In particular, you can use this function to configure an
     * existing {@link FaceT} face object for use with FreeType font
     * functions even if that {@link FaceT} face object was initially
     * created with hb_face_create(), and therefore was not
     * initially configured to use FreeType font functions.
     * <p>
     * An {@link FaceT} face object created with hb_ft_face_create()
     * is preconfigured for FreeType font functions and does not
     * require this function to be used.
     * <p>
     * &lt;note&gt;Note: Internally, this function creates an FT_Face.
     * &lt;/note&gt;
     * @param font {@link FontT} to work upon
     */
    public static void ftFontSetFuncs(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_ft_font_set_funcs.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the FT_Load_Glyph load flags for the specified {@link FontT}.
     * <p>
     * For more information, see
     * https://www.freetype.org/freetype2/docs/reference/ft2-base_interface.html{@code ft_load_xxx}
     * @param font {@link FontT} to work upon
     * @param loadFlags The FreeType load flags to set
     */
    public static void ftFontSetLoadFlags(org.harfbuzz.FontT font, int loadFlags) {
        try {
            DowncallHandles.hb_ft_font_set_load_flags.invokeExact(
                    font.handle(),
                    loadFlags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Releases an FT_Face previously obtained with hb_ft_font_lock_face().
     * @param font {@link FontT} to work upon
     */
    public static void ftFontUnlockFace(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_ft_font_unlock_face.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Refreshes the state of the underlying FT_Face of {@code font} when the hb_font_t
     * {@code font} has changed.
     * This function should be called after changing the size or
     * variation-axis settings on the {@code font}.
     * This call is fast if nothing has changed on {@code font}.
     * @param font {@link FontT} to work upon
     * @return true if changed, false otherwise
     */
    public static org.harfbuzz.BoolT ftHbFontChanged(org.harfbuzz.FontT font) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ft_hb_font_changed.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Creates an {@link BlobT} blob from the specified
     * GBytes data structure.
     * @param gbytes the GBytes structure to work upon
     * @return the new {@link BlobT} blob object
     */
    public static org.harfbuzz.BlobT glibBlobCreate(org.gtk.glib.Bytes gbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_glib_blob_create.invokeExact(
                    gbytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches a Unicode-functions structure that is populated
     * with the appropriate GLib function for each method.
     * @return a pointer to the {@link UnicodeFuncsT} Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT glibGetUnicodeFuncs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_glib_get_unicode_funcs.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetches the GUnicodeScript identifier that corresponds to the
     * specified {@link ScriptT} script.
     * @param script The {@link ScriptT} to query
     * @return the GUnicodeScript identifier found
     */
    public static org.gtk.glib.UnicodeScript glibScriptFromScript(org.harfbuzz.ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_glib_script_from_script.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.UnicodeScript.of(RESULT);
    }
    
    /**
     * Fetches the {@link ScriptT} script that corresponds to the
     * specified GUnicodeScript identifier.
     * @param script The GUnicodeScript identifier to query
     * @return the {@link ScriptT} script found
     */
    public static org.harfbuzz.ScriptT glibScriptToScript(org.gtk.glib.UnicodeScript script) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_glib_script_to_script.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    /**
     * Returns glyph flags encoded within a {@link GlyphInfoT}.
     * @param info a {@link GlyphInfoT}
     * @return The {@link GlyphFlagsT} encoded within {@code info}
     */
    public static org.harfbuzz.GlyphFlagsT glyphInfoGetGlyphFlags(org.harfbuzz.GlyphInfoT info) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_glyph_info_get_glyph_flags.invokeExact(
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.GlyphFlagsT(RESULT);
    }
    
    /**
     * Fetches the Graphite2 gr_face corresponding to the specified
     * {@link FaceT} face object.
     * @param face {@code hb_face_t} to query
     * @return the gr_face found
     */
    public static java.lang.foreign.MemoryAddress graphite2FaceGetGrFace(org.harfbuzz.FaceT face) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_graphite2_face_get_gr_face.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Always returns {@code NULL}. Use hb_graphite2_face_get_gr_face() instead.
     * @param font An {@link FontT}
     * @return Graphite2 font associated with {@code font}.
     */
    @Deprecated
    public static @Nullable java.lang.foreign.MemoryAddress graphite2FontGetGrFont(org.harfbuzz.FontT font) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_graphite2_font_get_gr_font.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts {@code str} representing a BCP 47 language tag to the corresponding
     * {@link LanguageT}.
     * @param str a string representing
     *       a BCP 47 language tag
     * @param len length of the {@code str}, or -1 if it is {@code NULL}-terminated.
     * @return The {@link LanguageT} corresponding to the BCP 47 language tag.
     */
    public static org.harfbuzz.LanguageT languageFromString(byte[] str, int len) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_language_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.LanguageT.fromAddress.marshal(RESULT, Ownership.NONE);
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
     * @return The default language of the locale as
     * an {@link LanguageT}
     */
    public static org.harfbuzz.LanguageT languageGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_language_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.LanguageT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Check whether a second language tag is the same or a more
     * specific version of the provided language tag.  For example,
     * "fa_IR.utf8" is a more specific tag for "fa" or for "fa_IR".
     * @param language The {@link LanguageT} to work on
     * @param specific Another {@link LanguageT}
     * @return {@code true} if languages match, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT languageMatches(org.harfbuzz.LanguageT language, org.harfbuzz.LanguageT specific) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_language_matches.invokeExact(
                    language.handle(),
                    specific.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Converts an {@link LanguageT} to a string.
     * @param language The {@link LanguageT} to convert
     * @return A {@code NULL}-terminated string representing the {@code language}. Must not be freed by
     * the caller.
     */
    public static java.lang.String languageToString(org.harfbuzz.LanguageT language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_language_to_string.invokeExact(
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Tests whether memory allocation for a set was successful.
     * @param map A map
     * @return {@code true} if allocation succeeded, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT mapAllocationSuccessful(org.harfbuzz.MapT map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_allocation_successful.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Clears out the contents of {@code map}.
     * @param map A map
     */
    public static void mapClear(org.harfbuzz.MapT map) {
        try {
            DowncallHandles.hb_map_clear.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocate a copy of {@code map}.
     * @param map A map
     * @return Newly-allocated map.
     */
    public static org.harfbuzz.MapT mapCopy(org.harfbuzz.MapT map) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_map_copy.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.MapT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new, initially empty map.
     * @return The new {@link MapT}
     */
    public static org.harfbuzz.MapT mapCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_map_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.MapT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes {@code key} and its stored value from {@code map}.
     * @param map A map
     * @param key The key to delete
     */
    public static void mapDel(org.harfbuzz.MapT map, org.harfbuzz.CodepointT key) {
        try {
            DowncallHandles.hb_map_del.invokeExact(
                    map.handle(),
                    key.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count on a map. When
     * the reference count reaches zero, the map is
     * destroyed, freeing all memory.
     * @param map A map
     */
    public static void mapDestroy(org.harfbuzz.MapT map) {
        try {
            DowncallHandles.hb_map_destroy.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the value stored for {@code key} in {@code map}.
     * @param map A map
     * @param key The key to query
     */
    public static org.harfbuzz.CodepointT mapGet(org.harfbuzz.MapT map, org.harfbuzz.CodepointT key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_get.invokeExact(
                    map.handle(),
                    key.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Fetches the singleton empty {@link MapT}.
     * @return The empty {@link MapT}
     */
    public static org.harfbuzz.MapT mapGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_map_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.MapT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the number of key-value pairs in the map.
     * @param map A map
     * @return The population of {@code map}
     */
    public static int mapGetPopulation(org.harfbuzz.MapT map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_get_population.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified map.
     * @param map A map
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress mapGetUserData(org.harfbuzz.MapT map, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_map_get_user_data.invokeExact(
                    map.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether {@code key} is an element of {@code map}.
     * @param map A map
     * @param key The key to query
     * @return {@code true} if {@code key} is found in {@code map}, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT mapHas(org.harfbuzz.MapT map, org.harfbuzz.CodepointT key) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_has.invokeExact(
                    map.handle(),
                    key.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Creates a hash representing {@code map}.
     * @param map A map
     * @return A hash of {@code map}.
     */
    public static int mapHash(org.harfbuzz.MapT map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_hash.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether {@code map} is empty (contains no elements).
     * @param map A map
     * @return {@code true} if {@code map} is empty
     */
    public static org.harfbuzz.BoolT mapIsEmpty(org.harfbuzz.MapT map) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_is_empty.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code map} and {@code other} are equal (contain the same
     * elements).
     * @param map A map
     * @param other Another map
     * @return {@code true} if the two maps are equal, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT mapIsEqual(org.harfbuzz.MapT map, org.harfbuzz.MapT other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_is_equal.invokeExact(
                    map.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on a map.
     * @param map A map
     * @return The map
     */
    public static org.harfbuzz.MapT mapReference(org.harfbuzz.MapT map) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_map_reference.invokeExact(
                    map.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.MapT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Stores {@code key}:{@code value} in the map.
     * @param map A map
     * @param key The key to store in the map
     * @param value The value to store for {@code key}
     */
    public static void mapSet(org.harfbuzz.MapT map, org.harfbuzz.CodepointT key, org.harfbuzz.CodepointT value) {
        try {
            DowncallHandles.hb_map_set.invokeExact(
                    map.handle(),
                    key.getValue().intValue(),
                    value.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified map.
     * @param map A map
     * @param key The user-data key to set
     * @param data A pointer to the user data to set
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT mapSetUserData(org.harfbuzz.MapT map, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_map_set_user_data.invokeExact(
                    map.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all color layers for the specified glyph index in the specified
     * face. The list returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param glyph The glyph index to query
     * @param startOffset offset of the first layer to retrieve
     * @param layerCount Input = the maximum number of layers to return;
     *         Output = the actual number of layers returned (may be zero)
     * @param layers The array of layers found
     * @return Total number of layers available for the glyph index queried
     */
    public static int otColorGlyphGetLayers(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT glyph, int startOffset, Out<Integer> layerCount, @Nullable Out<org.harfbuzz.OtColorLayerT[]> layers) {
        MemorySegment layerCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment layersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_glyph_get_layers.invokeExact(
                    face.handle(),
                    glyph.getValue().intValue(),
                    startOffset,
                    (Addressable) (layerCount == null ? MemoryAddress.NULL : (Addressable) layerCountPOINTER.address()),
                    (Addressable) (layers == null ? MemoryAddress.NULL : (Addressable) layersPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (layerCount != null) layerCount.set(layerCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtColorLayerT[] layersARRAY = new org.harfbuzz.OtColorLayerT[layerCount.get().intValue()];
        for (int I = 0; I < layerCount.get().intValue(); I++) {
            var OBJ = layersPOINTER.get(Interop.valueLayout.ADDRESS, I);
            layersARRAY[I] = org.harfbuzz.OtColorLayerT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        layers.set(layersARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the PNG image for a glyph. This function takes a font object, not a face object,
     * as input. To get an optimally sized PNG blob, the UPEM value must be set on the {@code font}
     * object. If UPEM is unset, the blob returned will be the largest PNG available.
     * <p>
     * If the glyph has no PNG image, the singleton empty blob is returned.
     * @param font {@link FontT} to work upon
     * @param glyph a glyph index
     * @return An {@link BlobT} containing the PNG image for the glyph, if available
     */
    public static org.harfbuzz.BlobT otColorGlyphReferencePng(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ot_color_glyph_reference_png.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the SVG document for a glyph. The blob may be either plain text or gzip-encoded.
     * <p>
     * If the glyph has no SVG document, the singleton empty blob is returned.
     * @param face {@link FaceT} to work upon
     * @param glyph a svg glyph index
     * @return An {@link BlobT} containing the SVG document of the glyph, if available
     */
    public static org.harfbuzz.BlobT otColorGlyphReferenceSvg(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT glyph) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ot_color_glyph_reference_svg.invokeExact(
                    face.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Tests whether a face includes any {@code COLR} color layers.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otColorHasLayers(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_has_layers.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes a {@code CPAL} color-palette table.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otColorHasPalettes(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_has_palettes.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether a face has PNG glyph images (either in {@code CBDT} or {@code sbix} tables).
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otColorHasPng(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_has_png.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether a face includes any {@code SVG} glyph images.
     * @param face {@link FaceT} to work upon.
     * @return {@code true} if data found, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT otColorHasSvg(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_has_svg.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the specified color in a face's {@code CPAL} color palette.
     * <p>
     * Display names can be generic (e.g., "Background") or specific
     * (e.g., "Eye color").
     * @param face {@link FaceT} to work upon
     * @param colorIndex The index of the color
     * @return the Name ID found for the color.
     */
    public static org.harfbuzz.OtNameIdT otColorPaletteColorGetNameId(org.harfbuzz.FaceT face, int colorIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_palette_color_get_name_id.invokeExact(
                    face.handle(),
                    colorIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Fetches a list of the colors in a color palette.
     * <p>
     * After calling this function, {@code colors} will be filled with the palette
     * colors. If {@code colors} is NULL, the function will just return the number
     * of total colors without storing any actual colors; this can be used
     * for allocating a buffer of suitable size before calling
     * hb_ot_color_palette_get_colors() a second time.
     * @param face {@link FaceT} to work upon
     * @param paletteIndex the index of the color palette to query
     * @param startOffset offset of the first color to retrieve
     * @param colorCount Input = the maximum number of colors to return;
     *               Output = the actual number of colors returned (may be zero)
     * @param colors The array of {@link ColorT} records found
     * @return the total number of colors in the palette
     */
    public static int otColorPaletteGetColors(org.harfbuzz.FaceT face, int paletteIndex, int startOffset, Out<Integer> colorCount, @Nullable Out<org.harfbuzz.ColorT[]> colors) {
        MemorySegment colorCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment colorsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_palette_get_colors.invokeExact(
                    face.handle(),
                    paletteIndex,
                    startOffset,
                    (Addressable) (colorCount == null ? MemoryAddress.NULL : (Addressable) colorCountPOINTER.address()),
                    (Addressable) (colors == null ? MemoryAddress.NULL : (Addressable) colorsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (colorCount != null) colorCount.set(colorCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.ColorT[] colorsARRAY = new org.harfbuzz.ColorT[colorCount.get().intValue()];
        for (int I = 0; I < colorCount.get().intValue(); I++) {
            var OBJ = colorsPOINTER.get(Interop.valueLayout.C_INT, I);
            colorsARRAY[I] = new org.harfbuzz.ColorT(OBJ);
        }
        colors.set(colorsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the number of color palettes in a face.
     * @param face {@link FaceT} to work upon
     * @return the number of palettes found
     */
    public static int otColorPaletteGetCount(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_palette_get_count.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the flags defined for a color palette.
     * @param face {@link FaceT} to work upon
     * @param paletteIndex The index of the color palette
     * @return the {@link OtColorPaletteFlagsT} of the requested color palette
     */
    public static org.harfbuzz.OtColorPaletteFlagsT otColorPaletteGetFlags(org.harfbuzz.FaceT face, int paletteIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_palette_get_flags.invokeExact(
                    face.handle(),
                    paletteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtColorPaletteFlagsT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * a {@code CPAL} color palette.
     * <p>
     * Palette display names can be generic (e.g., "Default") or provide
     * specific, themed names (e.g., "Spring", "Summer", "Fall", and "Winter").
     * @param face {@link FaceT} to work upon
     * @param paletteIndex The index of the color palette
     * @return the Named ID found for the palette.
     * If the requested palette has no name the result is {@code HB_OT_NAME_ID_INVALID}.
     */
    public static org.harfbuzz.OtNameIdT otColorPaletteGetNameId(org.harfbuzz.FaceT face, int paletteIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_color_palette_get_name_id.invokeExact(
                    face.handle(),
                    paletteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Sets the font functions to use when working with {@code font}.
     * @param font {@link FontT} to work upon
     */
    public static void otFontSetFuncs(org.harfbuzz.FontT font) {
        try {
            DowncallHandles.hb_ot_font_set_funcs.invokeExact(
                    font.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a list of all feature indexes in the specified face's GSUB table
     * or GPOS table, underneath the specified scripts, languages, and features.
     * If no list of scripts is provided, all scripts will be queried. If no list
     * of languages is provided, all languages will be queried. If no list of
     * features is provided, all features will be queried.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scripts The array of scripts to collect features for,
     *   terminated by {@code HB_TAG_NONE}
     * @param languages The array of languages to collect features for,
     *   terminated by {@code HB_TAG_NONE}
     * @param features The array of features to collect,
     *   terminated by {@code HB_TAG_NONE}
     * @param featureIndexes The array of feature indexes found for the query
     */
    public static void otLayoutCollectFeatures(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, @Nullable org.harfbuzz.TagT[] scripts, @Nullable org.harfbuzz.TagT[] languages, @Nullable org.harfbuzz.TagT[] features, org.harfbuzz.SetT featureIndexes) {
        try {
            DowncallHandles.hb_ot_layout_collect_features.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    (Addressable) (scripts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(scripts), false)),
                    (Addressable) (languages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(languages), false)),
                    (Addressable) (features == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(features), false)),
                    featureIndexes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a list of all feature-lookup indexes in the specified face's GSUB
     * table or GPOS table, underneath the specified scripts, languages, and
     * features. If no list of scripts is provided, all scripts will be queried.
     * If no list of languages is provided, all languages will be queried. If no
     * list of features is provided, all features will be queried.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scripts The array of scripts to collect lookups for,
     *   terminated by {@code HB_TAG_NONE}
     * @param languages The array of languages to collect lookups for,
     *   terminated by {@code HB_TAG_NONE}
     * @param features The array of features to collect lookups for,
     *   terminated by {@code HB_TAG_NONE}
     * @param lookupIndexes The array of lookup indexes found for the query
     */
    public static void otLayoutCollectLookups(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, @Nullable org.harfbuzz.TagT[] scripts, @Nullable org.harfbuzz.TagT[] languages, @Nullable org.harfbuzz.TagT[] features, org.harfbuzz.SetT lookupIndexes) {
        try {
            DowncallHandles.hb_ot_layout_collect_lookups.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    (Addressable) (scripts == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(scripts), false)),
                    (Addressable) (languages == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(languages), false)),
                    (Addressable) (features == null ? MemoryAddress.NULL : Interop.allocateNativeArray(org.harfbuzz.TagT.getIntegerValues(features), false)),
                    lookupIndexes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a list of the characters defined as having a variant under the specified
     * "Character Variant" ("cvXX") feature tag.
     * @param face {@link FaceT} to work upon
     * @param tableTag table tag to query, "GSUB" or "GPOS".
     * @param featureIndex index of feature to query.
     * @param startOffset offset of the first character to retrieve
     * @param charCount Input = the maximum number of characters to return;
     *              Output = the actual number of characters returned (may be zero)
     * @param characters A buffer pointer.
     *              The Unicode codepoints of the characters for which this feature provides
     *               glyph variants.
     * @return Number of total sample characters in the cvXX feature.
     */
    public static int otLayoutFeatureGetCharacters(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int featureIndex, int startOffset, Out<Integer> charCount, Out<org.harfbuzz.CodepointT[]> characters) {
        MemorySegment charCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment charactersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_feature_get_characters.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    featureIndex,
                    startOffset,
                    (Addressable) (charCount == null ? MemoryAddress.NULL : (Addressable) charCountPOINTER.address()),
                    (Addressable) charactersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (charCount != null) charCount.set(charCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.CodepointT[] charactersARRAY = new org.harfbuzz.CodepointT[charCount.get().intValue()];
        for (int I = 0; I < charCount.get().intValue(); I++) {
            var OBJ = charactersPOINTER.get(Interop.valueLayout.C_INT, I);
            charactersARRAY[I] = new org.harfbuzz.CodepointT(OBJ);
        }
        characters.set(charactersARRAY);
        return RESULT;
    }
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table. The list returned will
     * begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param featureIndex The index of the requested feature
     * @param startOffset offset of the first lookup to retrieve
     * @param lookupCount Input = the maximum number of lookups to return;
     *                Output = the actual number of lookups returned (may be zero)
     * @param lookupIndexes The array of lookup indexes found for the query
     * @return Total number of lookups.
     */
    public static int otLayoutFeatureGetLookups(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int featureIndex, int startOffset, Out<Integer> lookupCount, Out<int[]> lookupIndexes) {
        MemorySegment lookupCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_feature_get_lookups.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    featureIndex,
                    startOffset,
                    (Addressable) (lookupCount == null ? MemoryAddress.NULL : (Addressable) lookupCountPOINTER.address()),
                    (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (lookupCount != null) lookupCount.set(lookupCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        lookupIndexes.set(MemorySegment.ofAddress(lookupIndexesPOINTER.get(Interop.valueLayout.ADDRESS, 0), lookupCount.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT;
    }
    
    /**
     * Fetches name indices from feature parameters for "Stylistic Set" ('ssXX') or
     * "Character Variant" ('cvXX') features.
     * @param face {@link FaceT} to work upon
     * @param tableTag table tag to query, "GSUB" or "GPOS".
     * @param featureIndex index of feature to query.
     * @param labelId The ‘name’ table name ID that specifies a string
     *            for a user-interface label for this feature. (May be NULL.)
     * @param tooltipId The ‘name’ table name ID that specifies a string
     *              that an application can use for tooltip text for this
     *              feature. (May be NULL.)
     * @param sampleId The ‘name’ table name ID that specifies sample text
     *             that illustrates the effect of this feature. (May be NULL.)
     * @param numNamedParameters Number of named parameters. (May be zero.)
     * @param firstParamId The first ‘name’ table name ID used to specify
     *                  strings for user-interface labels for the feature
     *                  parameters. (Must be zero if numParameters is zero.)
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutFeatureGetNameIds(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int featureIndex, @Nullable org.harfbuzz.OtNameIdT labelId, @Nullable org.harfbuzz.OtNameIdT tooltipId, @Nullable org.harfbuzz.OtNameIdT sampleId, Out<Integer> numNamedParameters, @Nullable org.harfbuzz.OtNameIdT firstParamId) {
        MemorySegment labelIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment tooltipIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment sampleIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment numNamedParametersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment firstParamIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_feature_get_name_ids.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    featureIndex,
                    (Addressable) (labelId == null ? MemoryAddress.NULL : (Addressable) labelIdPOINTER.address()),
                    (Addressable) (tooltipId == null ? MemoryAddress.NULL : (Addressable) tooltipIdPOINTER.address()),
                    (Addressable) (sampleId == null ? MemoryAddress.NULL : (Addressable) sampleIdPOINTER.address()),
                    (Addressable) (numNamedParameters == null ? MemoryAddress.NULL : (Addressable) numNamedParametersPOINTER.address()),
                    (Addressable) (firstParamId == null ? MemoryAddress.NULL : (Addressable) firstParamIdPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (labelId != null) labelId.setValue(labelIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (tooltipId != null) tooltipId.setValue(tooltipIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (sampleId != null) sampleId.setValue(sampleIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (numNamedParameters != null) numNamedParameters.set(numNamedParametersPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (firstParamId != null) firstParamId.setValue(firstParamIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all lookups enumerated for the specified feature, in
     * the specified face's GSUB table or GPOS table, enabled at the specified
     * variations index. The list returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param featureIndex The index of the feature to query
     * @param variationsIndex The index of the feature variation to query
     * @param startOffset offset of the first lookup to retrieve
     * @param lookupCount Input = the maximum number of lookups to return;
     *                Output = the actual number of lookups returned (may be zero)
     * @param lookupIndexes The array of lookups found for the query
     * @return Total number of lookups.
     */
    public static int otLayoutFeatureWithVariationsGetLookups(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int featureIndex, int variationsIndex, int startOffset, Out<Integer> lookupCount, Out<int[]> lookupIndexes) {
        MemorySegment lookupCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment lookupIndexesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_feature_with_variations_get_lookups.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    featureIndex,
                    variationsIndex,
                    startOffset,
                    (Addressable) (lookupCount == null ? MemoryAddress.NULL : (Addressable) lookupCountPOINTER.address()),
                    (Addressable) lookupIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (lookupCount != null) lookupCount.set(lookupCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        lookupIndexes.set(MemorySegment.ofAddress(lookupIndexesPOINTER.get(Interop.valueLayout.ADDRESS, 0), lookupCount.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT;
    }
    
    /**
     * Fetches a list of all attachment points for the specified glyph in the GDEF
     * table of the face. The list returned will begin at the offset provided.
     * <p>
     * Useful if the client program wishes to cache the list.
     * @param face The {@link FaceT} to work on
     * @param glyph The {@link CodepointT} code point to query
     * @param startOffset offset of the first attachment point to retrieve
     * @param pointCount Input = the maximum number of attachment points to return;
     *               Output = the actual number of attachment points returned (may be zero)
     * @param pointArray The array of attachment points found for the query
     * @return Total number of attachment points for {@code glyph}.
     */
    public static int otLayoutGetAttachPoints(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT glyph, int startOffset, Out<Integer> pointCount, Out<int[]> pointArray) {
        MemorySegment pointCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment pointArrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_attach_points.invokeExact(
                    face.handle(),
                    glyph.getValue().intValue(),
                    startOffset,
                    (Addressable) (pointCount == null ? MemoryAddress.NULL : (Addressable) pointCountPOINTER.address()),
                    (Addressable) pointArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (pointCount != null) pointCount.set(pointCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        pointArray.set(MemorySegment.ofAddress(pointArrayPOINTER.get(Interop.valueLayout.ADDRESS, 0), pointCount.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT;
    }
    
    /**
     * Fetches a baseline value from the face.
     * @param font a font
     * @param baselineTag a baseline tag
     * @param direction text direction.
     * @param scriptTag script tag.
     * @param languageTag language tag, currently unused.
     * @param coord baseline value if found.
     * @return {@code true} if found baseline value in the font.
     */
    public static org.harfbuzz.BoolT otLayoutGetBaseline(org.harfbuzz.FontT font, org.harfbuzz.OtLayoutBaselineTagT baselineTag, org.harfbuzz.DirectionT direction, org.harfbuzz.TagT scriptTag, org.harfbuzz.TagT languageTag, @Nullable org.harfbuzz.PositionT coord) {
        MemorySegment coordPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_baseline.invokeExact(
                    font.handle(),
                    baselineTag.getValue(),
                    direction.getValue(),
                    scriptTag.getValue().intValue(),
                    languageTag.getValue().intValue(),
                    (Addressable) (coord == null ? MemoryAddress.NULL : (Addressable) coordPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (coord != null) coord.setValue(coordPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a baseline value from the face, and synthesizes
     * it if the font does not have it.
     * @param font a font
     * @param baselineTag a baseline tag
     * @param direction text direction.
     * @param scriptTag script tag.
     * @param languageTag language tag, currently unused.
     * @param coord baseline value if found.
     */
    public static void otLayoutGetBaselineWithFallback(org.harfbuzz.FontT font, org.harfbuzz.OtLayoutBaselineTagT baselineTag, org.harfbuzz.DirectionT direction, org.harfbuzz.TagT scriptTag, org.harfbuzz.TagT languageTag, org.harfbuzz.PositionT coord) {
        MemorySegment coordPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_layout_get_baseline_with_fallback.invokeExact(
                    font.handle(),
                    baselineTag.getValue(),
                    direction.getValue(),
                    scriptTag.getValue().intValue(),
                    languageTag.getValue().intValue(),
                    (Addressable) coordPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coord.setValue(coordPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches the GDEF class of the requested glyph in the specified face.
     * @param face The {@link FaceT} to work on
     * @param glyph The {@link CodepointT} code point to query
     * @return The {@link OtLayoutGlyphClassT} glyph class of the given code
     * point in the GDEF table of the face.
     */
    public static org.harfbuzz.OtLayoutGlyphClassT otLayoutGetGlyphClass(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_glyph_class.invokeExact(
                    face.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.OtLayoutGlyphClassT.of(RESULT);
    }
    
    /**
     * Retrieves the set of all glyphs from the face that belong to the requested
     * glyph class in the face's GDEF table.
     * @param face The {@link FaceT} to work on
     * @param klass The {@link OtLayoutGlyphClassT} GDEF class to retrieve
     * @param glyphs The {@link SetT} set of all glyphs belonging to the requested
     *          class.
     */
    public static void otLayoutGetGlyphsInClass(org.harfbuzz.FaceT face, org.harfbuzz.OtLayoutGlyphClassT klass, org.harfbuzz.SetT glyphs) {
        try {
            DowncallHandles.hb_ot_layout_get_glyphs_in_class.invokeExact(
                    face.handle(),
                    klass.getValue(),
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the dominant horizontal baseline tag used by {@code script}.
     * @param script a script tag.
     * @return dominant baseline tag for the {@code script}.
     */
    public static org.harfbuzz.OtLayoutBaselineTagT otLayoutGetHorizontalBaselineTagForScript(org.harfbuzz.ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_horizontal_baseline_tag_for_script.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.OtLayoutBaselineTagT.of(RESULT);
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
     * @param font The {@link FontT} to work on
     * @param direction The {@link DirectionT} text direction to use
     * @param glyph The {@link CodepointT} code point to query
     * @param startOffset offset of the first caret position to retrieve
     * @param caretCount Input = the maximum number of caret positions to return;
     *               Output = the actual number of caret positions returned (may be zero)
     * @param caretArray The array of caret positions found for the query
     * @return Total number of ligature caret positions for {@code glyph}.
     */
    public static int otLayoutGetLigatureCarets(org.harfbuzz.FontT font, org.harfbuzz.DirectionT direction, org.harfbuzz.CodepointT glyph, int startOffset, Out<Integer> caretCount, Out<org.harfbuzz.PositionT[]> caretArray) {
        MemorySegment caretCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment caretArrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_ligature_carets.invokeExact(
                    font.handle(),
                    direction.getValue(),
                    glyph.getValue().intValue(),
                    startOffset,
                    (Addressable) (caretCount == null ? MemoryAddress.NULL : (Addressable) caretCountPOINTER.address()),
                    (Addressable) caretArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (caretCount != null) caretCount.set(caretCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.PositionT[] caretArrayARRAY = new org.harfbuzz.PositionT[caretCount.get().intValue()];
        for (int I = 0; I < caretCount.get().intValue(); I++) {
            var OBJ = caretArrayPOINTER.get(Interop.valueLayout.C_INT, I);
            caretArrayARRAY[I] = new org.harfbuzz.PositionT(OBJ);
        }
        caretArray.set(caretArrayARRAY);
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
     * @param face {@link FaceT} to work upon
     * @param designSize The design size of the face
     * @param subfamilyId The identifier of the face within the font subfamily
     * @param subfamilyNameId The ‘name’ table name ID of the face within the font subfamily
     * @param rangeStart The minimum size of the recommended size range for the face
     * @param rangeEnd The maximum size of the recommended size range for the face
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutGetSizeParams(org.harfbuzz.FaceT face, Out<Integer> designSize, Out<Integer> subfamilyId, org.harfbuzz.OtNameIdT subfamilyNameId, Out<Integer> rangeStart, Out<Integer> rangeEnd) {
        MemorySegment designSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment subfamilyIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment subfamilyNameIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment rangeStartPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment rangeEndPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_get_size_params.invokeExact(
                    face.handle(),
                    (Addressable) designSizePOINTER.address(),
                    (Addressable) subfamilyIdPOINTER.address(),
                    (Addressable) subfamilyNameIdPOINTER.address(),
                    (Addressable) rangeStartPOINTER.address(),
                    (Addressable) rangeEndPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        designSize.set(designSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        subfamilyId.set(subfamilyIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        subfamilyNameId.setValue(subfamilyNameIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        rangeStart.set(rangeStartPOINTER.get(Interop.valueLayout.C_INT, 0));
        rangeEnd.set(rangeEndPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether a face has any glyph classes defined in its GDEF table.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutHasGlyphClasses(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_has_glyph_classes.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any GPOS positioning.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if the face has GPOS data, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutHasPositioning(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_has_positioning.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether the specified face includes any GSUB substitutions.
     * @param face {@link FaceT} to work upon
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutHasSubstitution(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_has_substitution.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the index of a given feature tag in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageIndex The index of the requested language tag
     * @param featureTag {@link TagT} of the feature tag requested
     * @param featureIndex The index of the requested feature
     * @return {@code true} if the feature is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutLanguageFindFeature(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageIndex, org.harfbuzz.TagT featureTag, Out<Integer> featureIndex) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_language_find_feature.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageIndex,
                    featureTag.getValue().intValue(),
                    (Addressable) featureIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageIndex The index of the requested language tag
     * @param startOffset offset of the first feature tag to retrieve
     * @param featureCount Input = the maximum number of feature tags to return;
     *                 Output: the actual number of feature tags returned (may be zero)
     * @param featureIndexes The array of feature indexes found for the query
     * @return Total number of features.
     */
    public static int otLayoutLanguageGetFeatureIndexes(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageIndex, int startOffset, Out<Integer> featureCount, Out<int[]> featureIndexes) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment featureIndexesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_language_get_feature_indexes.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageIndex,
                    startOffset,
                    (Addressable) (featureCount == null ? MemoryAddress.NULL : (Addressable) featureCountPOINTER.address()),
                    (Addressable) featureIndexesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (featureCount != null) featureCount.set(featureCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        featureIndexes.set(MemorySegment.ofAddress(featureIndexesPOINTER.get(Interop.valueLayout.ADDRESS, 0), featureCount.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT;
    }
    
    /**
     * Fetches a list of all features in the specified face's GSUB table
     * or GPOS table, underneath the specified script and language. The list
     * returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageIndex The index of the requested language tag
     * @param startOffset offset of the first feature tag to retrieve
     * @param featureCount Input = the maximum number of feature tags to return;
     *                 Output = the actual number of feature tags returned (may be zero)
     * @param featureTags The array of {@link TagT} feature tags found for the query
     * @return Total number of feature tags.
     */
    public static int otLayoutLanguageGetFeatureTags(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageIndex, int startOffset, Out<Integer> featureCount, Out<org.harfbuzz.TagT[]> featureTags) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment featureTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_language_get_feature_tags.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageIndex,
                    startOffset,
                    (Addressable) (featureCount == null ? MemoryAddress.NULL : (Addressable) featureCountPOINTER.address()),
                    (Addressable) featureTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (featureCount != null) featureCount.set(featureCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.TagT[] featureTagsARRAY = new org.harfbuzz.TagT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featureTagsPOINTER.get(Interop.valueLayout.C_INT, I);
            featureTagsARRAY[I] = new org.harfbuzz.TagT(OBJ);
        }
        featureTags.set(featureTagsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the tag of a requested feature index in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageIndex The index of the requested language tag
     * @param featureIndex The index of the requested feature
     * @param featureTag The {@link TagT} of the requested feature
     * @return {@code true} if the feature is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutLanguageGetRequiredFeature(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageIndex, Out<Integer> featureIndex, org.harfbuzz.TagT featureTag) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment featureTagPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_language_get_required_feature.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageIndex,
                    (Addressable) featureIndexPOINTER.address(),
                    (Addressable) featureTagPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        featureTag.setValue(featureTagPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the index of a requested feature in the given face's GSUB or GPOS table,
     * underneath the specified script and language.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageIndex The index of the requested language tag
     * @param featureIndex The index of the requested feature
     * @return {@code true} if the feature is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutLanguageGetRequiredFeatureIndex(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageIndex, Out<Integer> featureIndex) {
        MemorySegment featureIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_language_get_required_feature_index.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageIndex,
                    (Addressable) featureIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        featureIndex.set(featureIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all glyphs affected by the specified lookup in the
     * specified face's GSUB table or GPOS table.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param lookupIndex The index of the feature lookup to query
     * @param glyphsBefore Array of glyphs preceding the substitution range
     * @param glyphsInput Array of input glyphs that would be substituted by the lookup
     * @param glyphsAfter Array of glyphs following the substitution range
     * @param glyphsOutput Array of glyphs that would be the substituted output of the lookup
     */
    public static void otLayoutLookupCollectGlyphs(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int lookupIndex, org.harfbuzz.SetT glyphsBefore, org.harfbuzz.SetT glyphsInput, org.harfbuzz.SetT glyphsAfter, org.harfbuzz.SetT glyphsOutput) {
        try {
            DowncallHandles.hb_ot_layout_lookup_collect_glyphs.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    lookupIndex,
                    glyphsBefore.handle(),
                    glyphsInput.handle(),
                    glyphsAfter.handle(),
                    glyphsOutput.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches alternates of a glyph from a given GSUB lookup index.
     * @param face a face.
     * @param lookupIndex index of the feature lookup to query.
     * @param glyph a glyph id.
     * @param startOffset starting offset.
     * @param alternateCount Input = the maximum number of alternate glyphs to return;
     *                   Output = the actual number of alternate glyphs returned (may be zero).
     * @param alternateGlyphs A glyphs buffer.
     *                    Alternate glyphs associated with the glyph id.
     * @return Total number of alternates found in the specific lookup index for the given glyph id.
     */
    public static int otLayoutLookupGetGlyphAlternates(org.harfbuzz.FaceT face, int lookupIndex, org.harfbuzz.CodepointT glyph, int startOffset, Out<Integer> alternateCount, Out<org.harfbuzz.CodepointT[]> alternateGlyphs) {
        MemorySegment alternateCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment alternateGlyphsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_lookup_get_glyph_alternates.invokeExact(
                    face.handle(),
                    lookupIndex,
                    glyph.getValue().intValue(),
                    startOffset,
                    (Addressable) (alternateCount == null ? MemoryAddress.NULL : (Addressable) alternateCountPOINTER.address()),
                    (Addressable) alternateGlyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (alternateCount != null) alternateCount.set(alternateCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.CodepointT[] alternateGlyphsARRAY = new org.harfbuzz.CodepointT[alternateCount.get().intValue()];
        for (int I = 0; I < alternateCount.get().intValue(); I++) {
            var OBJ = alternateGlyphsPOINTER.get(Interop.valueLayout.C_INT, I);
            alternateGlyphsARRAY[I] = new org.harfbuzz.CodepointT(OBJ);
        }
        alternateGlyphs.set(alternateGlyphsARRAY);
        return RESULT;
    }
    
    /**
     * Compute the transitive closure of glyphs needed for a
     * specified lookup.
     * @param face {@link FaceT} to work upon
     * @param lookupIndex index of the feature lookup to query
     * @param glyphs Array of glyphs comprising the transitive closure of the lookup
     */
    public static void otLayoutLookupSubstituteClosure(org.harfbuzz.FaceT face, int lookupIndex, org.harfbuzz.SetT glyphs) {
        try {
            DowncallHandles.hb_ot_layout_lookup_substitute_closure.invokeExact(
                    face.handle(),
                    lookupIndex,
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tests whether a specified lookup in the specified face would
     * trigger a substitution on the given glyph sequence.
     * @param face {@link FaceT} to work upon
     * @param lookupIndex The index of the lookup to query
     * @param glyphs The sequence of glyphs to query for substitution
     * @param glyphsLength The length of the glyph sequence
     * @param zeroContext {@link BoolT} indicating whether pre-/post-context are disallowed
     * in substitutions
     * @return {@code true} if a substitution would be triggered, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutLookupWouldSubstitute(org.harfbuzz.FaceT face, int lookupIndex, org.harfbuzz.CodepointT glyphs, int glyphsLength, org.harfbuzz.BoolT zeroContext) {
        MemorySegment glyphsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_lookup_would_substitute.invokeExact(
                    face.handle(),
                    lookupIndex,
                    (Addressable) glyphsPOINTER.address(),
                    glyphsLength,
                    zeroContext.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glyphs.setValue(glyphsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Compute the transitive closure of glyphs needed for all of the
     * provided lookups.
     * @param face {@link FaceT} to work upon
     * @param lookups The set of lookups to query
     * @param glyphs Array of glyphs comprising the transitive closure of the lookups
     */
    public static void otLayoutLookupsSubstituteClosure(org.harfbuzz.FaceT face, org.harfbuzz.SetT lookups, org.harfbuzz.SetT glyphs) {
        try {
            DowncallHandles.hb_ot_layout_lookups_substitute_closure.invokeExact(
                    face.handle(),
                    lookups.handle(),
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the index of a given language tag in the specified face's GSUB table
     * or GPOS table, underneath the specified script tag.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageTag The {@link TagT} of the requested language
     * @param languageIndex The index of the requested language
     * @return {@code true} if the language tag is found, {@code false} otherwise
     */
    @Deprecated
    public static org.harfbuzz.BoolT otLayoutScriptFindLanguage(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, org.harfbuzz.TagT languageTag, PointerInteger languageIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_script_find_language.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageTag.getValue().intValue(),
                    languageIndex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of language tags in the given face's GSUB or GPOS table, underneath
     * the specified script index. The list returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param startOffset offset of the first language tag to retrieve
     * @param languageCount Input = the maximum number of language tags to return;
     *                  Output = the actual number of language tags returned (may be zero)
     * @param languageTags Array of language tags found in the table
     * @return Total number of language tags.
     */
    public static int otLayoutScriptGetLanguageTags(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int startOffset, Out<Integer> languageCount, Out<org.harfbuzz.TagT[]> languageTags) {
        MemorySegment languageCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment languageTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_script_get_language_tags.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    startOffset,
                    (Addressable) (languageCount == null ? MemoryAddress.NULL : (Addressable) languageCountPOINTER.address()),
                    (Addressable) languageTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (languageCount != null) languageCount.set(languageCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.TagT[] languageTagsARRAY = new org.harfbuzz.TagT[languageCount.get().intValue()];
        for (int I = 0; I < languageCount.get().intValue(); I++) {
            var OBJ = languageTagsPOINTER.get(Interop.valueLayout.C_INT, I);
            languageTagsARRAY[I] = new org.harfbuzz.TagT(OBJ);
        }
        languageTags.set(languageTagsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the index of the first language tag fom {@code language_tags} that is present
     * in the specified face's GSUB or GPOS table, underneath the specified script
     * index.
     * <p>
     * If none of the given language tags is found, {@code false} is returned and
     * {@code language_index} is set to the default language index.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptIndex The index of the requested script tag
     * @param languageCount The number of languages in the specified script
     * @param languageTags The array of language tags
     * @param languageIndex The index of the requested language
     * @return {@code true} if one of the given language tags is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutScriptSelectLanguage(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptIndex, int languageCount, org.harfbuzz.TagT languageTags, Out<Integer> languageIndex) {
        MemorySegment languageTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment languageIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_script_select_language.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptIndex,
                    languageCount,
                    (Addressable) languageTagsPOINTER.address(),
                    (Addressable) languageIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        languageTags.setValue(languageTagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        languageIndex.set(languageIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Deprecated since 2.0.0
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptTags Array of {@link TagT} script tags
     * @param scriptIndex The index of the requested script tag
     * @param chosenScript {@link TagT} of the script tag requested
     */
    public static org.harfbuzz.BoolT otLayoutTableChooseScript(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, org.harfbuzz.TagT scriptTags, Out<Integer> scriptIndex, org.harfbuzz.TagT chosenScript) {
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment chosenScriptPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_choose_script.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    (Addressable) scriptTagsPOINTER.address(),
                    (Addressable) scriptIndexPOINTER.address(),
                    (Addressable) chosenScriptPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptTags.setValue(scriptTagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        scriptIndex.set(scriptIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        chosenScript.setValue(chosenScriptPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of feature variations in the specified face's GSUB table
     * or GPOS table, at the specified variation coordinates.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param coords The variation coordinates to query
     * @param numCoords The number of variation coordinates
     * @param variationsIndex The array of feature variations found for the query
     * @return {@code true} if feature variations were found, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT otLayoutTableFindFeatureVariations(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, PointerInteger coords, int numCoords, Out<Integer> variationsIndex) {
        MemorySegment variationsIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_find_feature_variations.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    coords.handle(),
                    numCoords,
                    (Addressable) variationsIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variationsIndex.set(variationsIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the index if a given script tag in the specified face's GSUB table
     * or GPOS table.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptTag {@link TagT} of the script tag requested
     * @param scriptIndex The index of the requested script tag
     * @return {@code true} if the script is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otLayoutTableFindScript(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, org.harfbuzz.TagT scriptTag, Out<Integer> scriptIndex) {
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_find_script.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptTag.getValue().intValue(),
                    (Addressable) scriptIndexPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptIndex.set(scriptIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all feature tags in the given face's GSUB or GPOS table.
     * Note that there might be duplicate feature tags, belonging to different
     * script/language-system pairs of the table.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param startOffset offset of the first feature tag to retrieve
     * @param featureCount Input = the maximum number of feature tags to return;
     *                 Output = the actual number of feature tags returned (may be zero)
     * @param featureTags Array of feature tags found in the table
     * @return Total number of feature tags.
     */
    public static int otLayoutTableGetFeatureTags(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int startOffset, Out<Integer> featureCount, Out<org.harfbuzz.TagT[]> featureTags) {
        MemorySegment featureCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment featureTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_get_feature_tags.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    startOffset,
                    (Addressable) (featureCount == null ? MemoryAddress.NULL : (Addressable) featureCountPOINTER.address()),
                    (Addressable) featureTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (featureCount != null) featureCount.set(featureCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.TagT[] featureTagsARRAY = new org.harfbuzz.TagT[featureCount.get().intValue()];
        for (int I = 0; I < featureCount.get().intValue(); I++) {
            var OBJ = featureTagsPOINTER.get(Interop.valueLayout.C_INT, I);
            featureTagsARRAY[I] = new org.harfbuzz.TagT(OBJ);
        }
        featureTags.set(featureTagsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the total number of lookups enumerated in the specified
     * face's GSUB table or GPOS table.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @return Total number of lookups.
     */
    public static int otLayoutTableGetLookupCount(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_get_lookup_count.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches a list of all scripts enumerated in the specified face's GSUB table
     * or GPOS table. The list returned will begin at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param startOffset offset of the first script tag to retrieve
     * @param scriptCount Input = the maximum number of script tags to return;
     *                Output = the actual number of script tags returned (may be zero)
     * @param scriptTags The array of {@link TagT} script tags found for the query
     * @return Total number of script tags.
     */
    public static int otLayoutTableGetScriptTags(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int startOffset, Out<Integer> scriptCount, Out<org.harfbuzz.TagT[]> scriptTags) {
        MemorySegment scriptCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_get_script_tags.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    startOffset,
                    (Addressable) (scriptCount == null ? MemoryAddress.NULL : (Addressable) scriptCountPOINTER.address()),
                    (Addressable) scriptTagsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (scriptCount != null) scriptCount.set(scriptCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.TagT[] scriptTagsARRAY = new org.harfbuzz.TagT[scriptCount.get().intValue()];
        for (int I = 0; I < scriptCount.get().intValue(); I++) {
            var OBJ = scriptTagsPOINTER.get(Interop.valueLayout.C_INT, I);
            scriptTagsARRAY[I] = new org.harfbuzz.TagT(OBJ);
        }
        scriptTags.set(scriptTagsARRAY);
        return RESULT;
    }
    
    /**
     * Selects an OpenType script for {@code table_tag} from the {@code script_tags} array.
     * <p>
     * If the table does not have any of the requested scripts, then {@code DFLT},
     * {@code dflt}, and {@code latn} tags are tried in that order. If the table still does not
     * have any of these scripts, {@code script_index} and {@code chosen_script} are set to
     * {@code HB_OT_LAYOUT_NO_SCRIPT_INDEX}.
     * @param face {@link FaceT} to work upon
     * @param tableTag {@code HB_OT_TAG_GSUB} or {@code HB_OT_TAG_GPOS}
     * @param scriptCount Number of script tags in the array
     * @param scriptTags Array of {@link TagT} script tags
     * @param scriptIndex The index of the requested script
     * @param chosenScript {@link TagT} of the requested script
     * @return {@code true} if one of the requested scripts is selected, {@code false} if a fallback
     * script is selected or if no scripts are selected.
     */
    public static org.harfbuzz.BoolT otLayoutTableSelectScript(org.harfbuzz.FaceT face, org.harfbuzz.TagT tableTag, int scriptCount, org.harfbuzz.TagT scriptTags, Out<Integer> scriptIndex, @Nullable org.harfbuzz.TagT chosenScript) {
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment scriptIndexPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment chosenScriptPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_layout_table_select_script.invokeExact(
                    face.handle(),
                    tableTag.getValue().intValue(),
                    scriptCount,
                    (Addressable) scriptTagsPOINTER.address(),
                    (Addressable) (scriptIndex == null ? MemoryAddress.NULL : (Addressable) scriptIndexPOINTER.address()),
                    (Addressable) (chosenScript == null ? MemoryAddress.NULL : (Addressable) chosenScriptPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptTags.setValue(scriptTagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (scriptIndex != null) scriptIndex.set(scriptIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (chosenScript != null) chosenScript.setValue(chosenScriptPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the specified math constant. For most constants, the value returned
     * is an {@link PositionT}.
     * <p>
     * However, if the requested constant is {@code HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN},
     * {@code HB_OT_MATH_CONSTANT_SCRIPT_SCRIPT_PERCENT_SCALE_DOWN} or
     * {@code HB_OT_MATH_CONSTANT_SCRIPT_PERCENT_SCALE_DOWN}, then the return value is
     * an integer between 0 and 100 representing that percentage.
     * @param font {@link FontT} to work upon
     * @param constant {@link OtMathConstantT} the constant to retrieve
     * @return the requested constant or zero
     */
    public static org.harfbuzz.PositionT otMathGetConstant(org.harfbuzz.FontT font, org.harfbuzz.OtMathConstantT constant) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_constant.invokeExact(
                    font.handle(),
                    constant.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the GlyphAssembly for the specified font, glyph index, and direction.
     * Returned are a list of {@link OtMathGlyphPartT} glyph parts that can be
     * used to draw the glyph and an italics-correction value (if one is defined
     * in the font).
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link DirectionT}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param glyph The index of the glyph to stretch
     * @param direction direction of the stretching (horizontal or vertical)
     * @param startOffset offset of the first glyph part to retrieve
     * @param partsCount Input = maximum number of glyph parts to return;
     *               Output = actual number of parts returned
     * @param parts the glyph parts returned
     * @param italicsCorrection italics correction of the glyph assembly
     * @return the total number of parts in the glyph assembly
     */
    public static int otMathGetGlyphAssembly(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, int startOffset, Out<Integer> partsCount, Out<org.harfbuzz.OtMathGlyphPartT[]> parts, org.harfbuzz.PositionT italicsCorrection) {
        MemorySegment partsCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment partsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment italicsCorrectionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_assembly.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    startOffset,
                    (Addressable) partsCountPOINTER.address(),
                    (Addressable) partsPOINTER.address(),
                    (Addressable) italicsCorrectionPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        partsCount.set(partsCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        italicsCorrection.setValue(italicsCorrectionPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtMathGlyphPartT[] partsARRAY = new org.harfbuzz.OtMathGlyphPartT[partsCount.get().intValue()];
        for (int I = 0; I < partsCount.get().intValue(); I++) {
            var OBJ = partsPOINTER.get(Interop.valueLayout.ADDRESS, I);
            partsARRAY[I] = org.harfbuzz.OtMathGlyphPartT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        parts.set(partsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches an italics-correction value (if one exists) for the specified
     * glyph index.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph index from which to retrieve the value
     * @return the italics correction of the glyph or zero
     */
    public static org.harfbuzz.PositionT otMathGetGlyphItalicsCorrection(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_italics_correction.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the math kerning (cut-ins) value for the specified font, glyph index, and
     * {@code kern}.
     * <p>
     * If the MathKern table is found, the function examines it to find a height
     * value that is greater or equal to {@code correction_height}. If such a height
     * value is found, corresponding kerning value from the table is returned. If
     * no such height value is found, the last kerning value is returned.
     * @param font {@link FontT} to work upon
     * @param glyph The glyph index from which to retrieve the value
     * @param kern The {@link OtMathKernT} from which to retrieve the value
     * @param correctionHeight the correction height to use to determine the kerning.
     * @return requested kerning value or zero
     */
    public static org.harfbuzz.PositionT otMathGetGlyphKerning(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.OtMathKernT kern, org.harfbuzz.PositionT correctionHeight) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_kerning.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    kern.getValue(),
                    correctionHeight.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the raw MathKern (cut-in) data for the specified font, glyph index,
     * and {@code kern}. The corresponding list of kern values and correction heights is
     * returned as a list of {@link OtMathKernEntryT} structs.
     * <p>
     * See also {@code hb_ot_math_get_glyph_kerning}, which handles selecting the
     * appropriate kern value for a given correction height.
     * <p>
     * &lt;note&gt;For a glyph with {@code n} defined kern values (where {@code n} &gt; 0), there are only
     * {@code n}−1 defined correction heights, as each correction height defines a boundary
     * past which the next kern value should be selected. Therefore, only the
     * {@link OtMathKernEntryT}.kern_value of the uppermost {@link OtMathKernEntryT}
     * actually comes from the font; its corresponding
     * {@link OtMathKernEntryT}.max_correction_height is always set to
     * &lt;code&gt;INT32_MAX&lt;/code&gt;.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param glyph The glyph index from which to retrieve the kernings
     * @param kern The {@link OtMathKernT} from which to retrieve the kernings
     * @param startOffset offset of the first kern entry to retrieve
     * @param entriesCount Input = the maximum number of kern entries to return;
     *                                     Output = the actual number of kern entries returned
     * @param kernEntries array of kern entries returned
     * @return the total number of kern values available or zero
     */
    public static int otMathGetGlyphKernings(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.OtMathKernT kern, int startOffset, Out<Integer> entriesCount, Out<org.harfbuzz.OtMathKernEntryT[]> kernEntries) {
        MemorySegment entriesCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment kernEntriesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_kernings.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    kern.getValue(),
                    startOffset,
                    (Addressable) (entriesCount == null ? MemoryAddress.NULL : (Addressable) entriesCountPOINTER.address()),
                    (Addressable) kernEntriesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (entriesCount != null) entriesCount.set(entriesCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtMathKernEntryT[] kernEntriesARRAY = new org.harfbuzz.OtMathKernEntryT[entriesCount.get().intValue()];
        for (int I = 0; I < entriesCount.get().intValue(); I++) {
            var OBJ = kernEntriesPOINTER.get(Interop.valueLayout.ADDRESS, I);
            kernEntriesARRAY[I] = org.harfbuzz.OtMathKernEntryT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        kernEntries.set(kernEntriesARRAY);
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
     * @param font {@link FontT} to work upon
     * @param glyph The glyph index from which to retrieve the value
     * @return the top accent attachment of the glyph or 0.5 * the advance
     *               width of {@code glyph}
     */
    public static org.harfbuzz.PositionT otMathGetGlyphTopAccentAttachment(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_top_accent_attachment.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches the MathGlyphConstruction for the specified font, glyph index, and
     * direction. The corresponding list of size variants is returned as a list of
     * {@link OtMathGlyphVariantT} structs.
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link DirectionT}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param glyph The index of the glyph to stretch
     * @param direction The direction of the stretching (horizontal or vertical)
     * @param startOffset offset of the first variant to retrieve
     * @param variantsCount Input = the maximum number of variants to return;
     *                           Output = the actual number of variants returned
     * @param variants array of variants returned
     * @return the total number of size variants available or zero
     */
    public static int otMathGetGlyphVariants(org.harfbuzz.FontT font, org.harfbuzz.CodepointT glyph, org.harfbuzz.DirectionT direction, int startOffset, Out<Integer> variantsCount, Out<org.harfbuzz.OtMathGlyphVariantT[]> variants) {
        MemorySegment variantsCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment variantsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_glyph_variants.invokeExact(
                    font.handle(),
                    glyph.getValue().intValue(),
                    direction.getValue(),
                    startOffset,
                    (Addressable) variantsCountPOINTER.address(),
                    (Addressable) variantsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variantsCount.set(variantsCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtMathGlyphVariantT[] variantsARRAY = new org.harfbuzz.OtMathGlyphVariantT[variantsCount.get().intValue()];
        for (int I = 0; I < variantsCount.get().intValue(); I++) {
            var OBJ = variantsPOINTER.get(Interop.valueLayout.ADDRESS, I);
            variantsARRAY[I] = org.harfbuzz.OtMathGlyphVariantT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        variants.set(variantsARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the MathVariants table for the specified font and returns the
     * minimum overlap of connecting glyphs that are required to draw a glyph
     * assembly in the specified direction.
     * <p>
     * &lt;note&gt;The {@code direction} parameter is only used to select between horizontal
     * or vertical directions for the construction. Even though all {@link DirectionT}
     * values are accepted, only the result of {@code HB_DIRECTION_IS_HORIZONTAL} is
     * considered.&lt;/note&gt;
     * @param font {@link FontT} to work upon
     * @param direction direction of the stretching (horizontal or vertical)
     * @return requested minimum connector overlap or zero
     */
    public static org.harfbuzz.PositionT otMathGetMinConnectorOverlap(org.harfbuzz.FontT font, org.harfbuzz.DirectionT direction) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_get_min_connector_overlap.invokeExact(
                    font.handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Tests whether a face has a {@code MATH} table.
     * @param face {@link FaceT} to test
     * @return {@code true} if the table is found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otMathHasData(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_has_data.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether the given glyph index is an extended shape in the face.
     * @param face {@link FaceT} to work upon
     * @param glyph The glyph index to test
     * @return {@code true} if the glyph is an extended shape, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otMathIsGlyphExtendedShape(org.harfbuzz.FaceT face, org.harfbuzz.CodepointT glyph) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_math_is_glyph_extended_shape.invokeExact(
                    face.handle(),
                    glyph.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches all available feature types.
     * @param face a face object
     * @param startOffset iteration's start offset
     * @param entriesCount buffer size as input, filled size as output
     * @param entries entries tags buffer
     * @return Number of all available feature types.
     */
    public static int otMetaGetEntryTags(org.harfbuzz.FaceT face, int startOffset, Out<Integer> entriesCount, Out<org.harfbuzz.OtMetaTagT[]> entries) {
        MemorySegment entriesCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment entriesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_meta_get_entry_tags.invokeExact(
                    face.handle(),
                    startOffset,
                    (Addressable) (entriesCount == null ? MemoryAddress.NULL : (Addressable) entriesCountPOINTER.address()),
                    (Addressable) entriesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (entriesCount != null) entriesCount.set(entriesCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtMetaTagT[] entriesARRAY = new org.harfbuzz.OtMetaTagT[entriesCount.get().intValue()];
        for (int I = 0; I < entriesCount.get().intValue(); I++) {
            var OBJ = entriesPOINTER.get(Interop.valueLayout.C_INT, I);
            entriesARRAY[I] = org.harfbuzz.OtMetaTagT.of(OBJ);
        }
        entries.set(entriesARRAY);
        return RESULT;
    }
    
    /**
     * It fetches metadata entry of a given tag from a font.
     * @param face a {@link FaceT} object.
     * @param metaTag tag of metadata you like to have.
     * @return A blob containing the blob.
     */
    public static org.harfbuzz.BlobT otMetaReferenceEntry(org.harfbuzz.FaceT face, org.harfbuzz.OtMetaTagT metaTag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ot_meta_reference_entry.invokeExact(
                    face.handle(),
                    metaTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.BlobT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font}.
     * @param font an {@link FontT} object.
     * @param metricsTag tag of metrics value you like to fetch.
     * @param position result of metrics value from the font.
     * @return Whether found the requested metrics in the font.
     */
    public static org.harfbuzz.BoolT otMetricsGetPosition(org.harfbuzz.FontT font, org.harfbuzz.OtMetricsTagT metricsTag, @Nullable org.harfbuzz.PositionT position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_metrics_get_position.invokeExact(
                    font.handle(),
                    metricsTag.getValue(),
                    (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (position != null) position.setValue(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font},
     * and synthesizes a value if it the value is missing in the font.
     * @param font an {@link FontT} object.
     * @param metricsTag tag of metrics value you like to fetch.
     * @param position result of metrics value from the font.
     */
    public static void otMetricsGetPositionWithFallback(org.harfbuzz.FontT font, org.harfbuzz.OtMetricsTagT metricsTag, @Nullable org.harfbuzz.PositionT position) {
        MemorySegment positionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_metrics_get_position_with_fallback.invokeExact(
                    font.handle(),
                    metricsTag.getValue(),
                    (Addressable) (position == null ? MemoryAddress.NULL : (Addressable) positionPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (position != null) position.setValue(positionPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Fetches metrics value corresponding to {@code metrics_tag} from {@code font} with the
     * current font variation settings applied.
     * @param font an {@link FontT} object.
     * @param metricsTag tag of metrics value you like to fetch.
     * @return The requested metric value.
     */
    public static float otMetricsGetVariation(org.harfbuzz.FontT font, org.harfbuzz.OtMetricsTagT metricsTag) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.hb_ot_metrics_get_variation.invokeExact(
                    font.handle(),
                    metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches horizontal metrics value corresponding to {@code metrics_tag} from {@code font}
     * with the current font variation settings applied.
     * @param font an {@link FontT} object.
     * @param metricsTag tag of metrics value you like to fetch.
     * @return The requested metric value.
     */
    public static org.harfbuzz.PositionT otMetricsGetXVariation(org.harfbuzz.FontT font, org.harfbuzz.OtMetricsTagT metricsTag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_metrics_get_x_variation.invokeExact(
                    font.handle(),
                    metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches vertical metrics value corresponding to {@code metrics_tag} from {@code font} with
     * the current font variation settings applied.
     * @param font an {@link FontT} object.
     * @param metricsTag tag of metrics value you like to fetch.
     * @return The requested metric value.
     */
    public static org.harfbuzz.PositionT otMetricsGetYVariation(org.harfbuzz.FontT font, org.harfbuzz.OtMetricsTagT metricsTag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_metrics_get_y_variation.invokeExact(
                    font.handle(),
                    metricsTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.PositionT(RESULT);
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-16 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     * @param face font face.
     * @param nameId OpenType name identifier to fetch.
     * @param language language to fetch the name for.
     * @param textSize input size of {@code text} buffer, and output size of
     *                                   text written to buffer.
     * @param text buffer to write fetched name into.
     * @return full length of the requested string, or 0 if not found.
     */
    public static int otNameGetUtf16(org.harfbuzz.FaceT face, org.harfbuzz.OtNameIdT nameId, org.harfbuzz.LanguageT language, Out<Integer> textSize, Out<short[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_name_get_utf16.invokeExact(
                    face.handle(),
                    nameId.getValue().intValue(),
                    language.handle(),
                    (Addressable) (textSize == null ? MemoryAddress.NULL : (Addressable) textSizePOINTER.address()),
                    (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (textSize != null) textSize.set(textSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        text.set(MemorySegment.ofAddress(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), textSize.get().intValue() * Interop.valueLayout.C_SHORT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_SHORT));
        return RESULT;
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-32 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     * @param face font face.
     * @param nameId OpenType name identifier to fetch.
     * @param language language to fetch the name for.
     * @param textSize input size of {@code text} buffer, and output size of
     *                                   text written to buffer.
     * @param text buffer to write fetched name into.
     * @return full length of the requested string, or 0 if not found.
     */
    public static int otNameGetUtf32(org.harfbuzz.FaceT face, org.harfbuzz.OtNameIdT nameId, org.harfbuzz.LanguageT language, Out<Integer> textSize, Out<int[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_name_get_utf32.invokeExact(
                    face.handle(),
                    nameId.getValue().intValue(),
                    language.handle(),
                    (Addressable) (textSize == null ? MemoryAddress.NULL : (Addressable) textSizePOINTER.address()),
                    (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (textSize != null) textSize.set(textSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        text.set(MemorySegment.ofAddress(textPOINTER.get(Interop.valueLayout.ADDRESS, 0), textSize.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
        return RESULT;
    }
    
    /**
     * Fetches a font name from the OpenType 'name' table.
     * If {@code language} is {@code HB_LANGUAGE_INVALID}, English ("en") is assumed.
     * Returns string in UTF-8 encoding. A NUL terminator is always written
     * for convenience, and isn't included in the output {@code text_size}.
     * @param face font face.
     * @param nameId OpenType name identifier to fetch.
     * @param language language to fetch the name for.
     * @param textSize input size of {@code text} buffer, and output size of
     *                                   text written to buffer.
     * @param text buffer to write fetched name into.
     * @return full length of the requested string, or 0 if not found.
     */
    public static int otNameGetUtf8(org.harfbuzz.FaceT face, org.harfbuzz.OtNameIdT nameId, org.harfbuzz.LanguageT language, Out<Integer> textSize, Out<java.lang.String[]> text) {
        MemorySegment textSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment textPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_name_get_utf8.invokeExact(
                    face.handle(),
                    nameId.getValue().intValue(),
                    language.handle(),
                    (Addressable) (textSize == null ? MemoryAddress.NULL : (Addressable) textSizePOINTER.address()),
                    (Addressable) textPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (textSize != null) textSize.set(textSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        java.lang.String[] textARRAY = new java.lang.String[textSize.get().intValue()];
        for (int I = 0; I < textSize.get().intValue(); I++) {
            var OBJ = textPOINTER.get(Interop.valueLayout.ADDRESS, I);
            textARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        text.set(textARRAY);
        return RESULT;
    }
    
    /**
     * Enumerates all available name IDs and language combinations. Returned
     * array is owned by the {@code face} and should not be modified.  It can be
     * used as long as {@code face} is alive.
     * @param face font face.
     * @param numEntries number of returned entries.
     * @return Array of available name entries.
     */
    public static org.harfbuzz.OtNameEntryT[] otNameListNames(org.harfbuzz.FaceT face, Out<Integer> numEntries) {
        MemorySegment numEntriesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ot_name_list_names.invokeExact(
                    face.handle(),
                    (Addressable) (numEntries == null ? MemoryAddress.NULL : (Addressable) numEntriesPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (numEntries != null) numEntries.set(numEntriesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtNameEntryT[] resultARRAY = new org.harfbuzz.OtNameEntryT[numEntries.get().intValue()];
        for (int I = 0; I < numEntries.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = org.harfbuzz.OtNameEntryT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Computes the transitive closure of glyphs needed for a specified
     * input buffer under the given font and feature list. The closure is
     * computed as a set, not as a list.
     * @param font {@link FontT} to work upon
     * @param buffer The input buffer to compute from
     * @param features The features enabled on the buffer
     * @param numFeatures The number of features enabled on the buffer
     * @param glyphs The {@link SetT} set of glyphs comprising the transitive closure of the query
     */
    public static void otShapeGlyphsClosure(org.harfbuzz.FontT font, org.harfbuzz.BufferT buffer, org.harfbuzz.FeatureT[] features, int numFeatures, org.harfbuzz.SetT glyphs) {
        try {
            DowncallHandles.hb_ot_shape_glyphs_closure.invokeExact(
                    font.handle(),
                    buffer.handle(),
                    Interop.allocateNativeArray(features, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numFeatures,
                    glyphs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the complete set of GSUB or GPOS lookups that are applicable
     * under a given {@code shape_plan}.
     * @param shapePlan {@link ShapePlanT} to query
     * @param tableTag GSUB or GPOS
     * @param lookupIndexes The {@link SetT} set of lookups returned
     */
    public static void otShapePlanCollectLookups(org.harfbuzz.ShapePlanT shapePlan, org.harfbuzz.TagT tableTag, org.harfbuzz.SetT lookupIndexes) {
        try {
            DowncallHandles.hb_ot_shape_plan_collect_lookups.invokeExact(
                    shapePlan.handle(),
                    tableTag.getValue().intValue(),
                    lookupIndexes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.harfbuzz.TagT otTagFromLanguage(org.harfbuzz.LanguageT language) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_tag_from_language.invokeExact(
                    language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Converts a language tag to an {@link LanguageT}.
     * @param tag an language tag
     * @return The {@link LanguageT} corresponding to {@code tag}.
     */
    public static @Nullable org.harfbuzz.LanguageT otTagToLanguage(org.harfbuzz.TagT tag) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_ot_tag_to_language.invokeExact(
                    tag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.LanguageT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Converts a script tag to an {@link ScriptT}.
     * @param tag a script tag
     * @return The {@link ScriptT} corresponding to {@code tag}.
     */
    public static org.harfbuzz.ScriptT otTagToScript(org.harfbuzz.TagT tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_tag_to_script.invokeExact(
                    tag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    public static void otTagsFromScript(org.harfbuzz.ScriptT script, org.harfbuzz.TagT scriptTag1, org.harfbuzz.TagT scriptTag2) {
        MemorySegment scriptTag1POINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment scriptTag2POINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_tags_from_script.invokeExact(
                    script.getValue(),
                    (Addressable) scriptTag1POINTER.address(),
                    (Addressable) scriptTag2POINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        scriptTag1.setValue(scriptTag1POINTER.get(Interop.valueLayout.C_INT, 0));
        scriptTag2.setValue(scriptTag2POINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts an {@link ScriptT} and an {@link LanguageT} to script and language tags.
     * @param script an {@link ScriptT} to convert.
     * @param language an {@link LanguageT} to convert.
     * @param scriptCount maximum number of script tags to retrieve (IN)
     * and actual number of script tags retrieved (OUT)
     * @param scriptTags array of size at least {@code script_count} to store the
     * script tag results
     * @param languageCount maximum number of language tags to retrieve
     * (IN) and actual number of language tags retrieved (OUT)
     * @param languageTags array of size at least {@code language_count} to store
     * the language tag results
     */
    public static void otTagsFromScriptAndLanguage(org.harfbuzz.ScriptT script, org.harfbuzz.LanguageT language, Out<Integer> scriptCount, @Nullable org.harfbuzz.TagT scriptTags, Out<Integer> languageCount, @Nullable org.harfbuzz.TagT languageTags) {
        MemorySegment scriptCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment scriptTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment languageCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment languageTagsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_tags_from_script_and_language.invokeExact(
                    script.getValue(),
                    language.handle(),
                    (Addressable) (scriptCount == null ? MemoryAddress.NULL : (Addressable) scriptCountPOINTER.address()),
                    (Addressable) (scriptTags == null ? MemoryAddress.NULL : (Addressable) scriptTagsPOINTER.address()),
                    (Addressable) (languageCount == null ? MemoryAddress.NULL : (Addressable) languageCountPOINTER.address()),
                    (Addressable) (languageTags == null ? MemoryAddress.NULL : (Addressable) languageTagsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (scriptCount != null) scriptCount.set(scriptCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (scriptTags != null) scriptTags.setValue(scriptTagsPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (languageCount != null) languageCount.set(languageCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (languageTags != null) languageTags.setValue(languageTagsPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts a script tag and a language tag to an {@link ScriptT} and an
     * {@link LanguageT}.
     * @param scriptTag a script tag
     * @param languageTag a language tag
     * @param script the {@link ScriptT} corresponding to {@code script_tag}.
     * @param language the {@link LanguageT} corresponding to {@code script_tag} and
     * {@code language_tag}.
     */
    public static void otTagsToScriptAndLanguage(org.harfbuzz.TagT scriptTag, org.harfbuzz.TagT languageTag, @Nullable Out<org.harfbuzz.ScriptT> script, @Nullable org.harfbuzz.LanguageT language) {
        MemorySegment scriptPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_tags_to_script_and_language.invokeExact(
                    scriptTag.getValue().intValue(),
                    languageTag.getValue().intValue(),
                    (Addressable) (script == null ? MemoryAddress.NULL : (Addressable) scriptPOINTER.address()),
                    (Addressable) (language == null ? MemoryAddress.NULL : language.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (script != null) script.set(org.harfbuzz.ScriptT.of(scriptPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Fetches the variation-axis information corresponding to the specified axis tag
     * in the specified face.
     * @param face {@link FaceT} to work upon
     * @param axisTag The {@link TagT} of the variation axis to query
     * @param axisIndex The index of the variation axis
     * @param axisInfo The {@link OtVarAxisInfoT} of the axis tag queried
     * @deprecated <ul>
     * <li>use hb_ot_var_find_axis_info() instead
     * </ul>
     */
    @Deprecated
    public static org.harfbuzz.BoolT otVarFindAxis(org.harfbuzz.FaceT face, org.harfbuzz.TagT axisTag, PointerInteger axisIndex, org.harfbuzz.OtVarAxisT axisInfo) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_find_axis.invokeExact(
                    face.handle(),
                    axisTag.getValue().intValue(),
                    axisIndex.handle(),
                    axisInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the variation-axis information corresponding to the specified axis tag
     * in the specified face.
     * @param face {@link FaceT} to work upon
     * @param axisTag The {@link TagT} of the variation axis to query
     * @param axisInfo The {@link OtVarAxisInfoT} of the axis tag queried
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otVarFindAxisInfo(org.harfbuzz.FaceT face, org.harfbuzz.TagT axisTag, org.harfbuzz.OtVarAxisInfoT axisInfo) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_find_axis_info.invokeExact(
                    face.handle(),
                    axisTag.getValue().intValue(),
                    axisInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches a list of all variation axes in the specified face. The list returned will begin
     * at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param startOffset offset of the first lookup to retrieve
     * @param axesCount Input = the maximum number of variation axes to return;
     *                Output = the actual number of variation axes returned (may be zero)
     * @param axesArray The array of variation axes found
     * @deprecated use hb_ot_var_get_axis_infos() instead
     */
    @Deprecated
    public static int otVarGetAxes(org.harfbuzz.FaceT face, int startOffset, Out<Integer> axesCount, Out<org.harfbuzz.OtVarAxisT[]> axesArray) {
        MemorySegment axesCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment axesArrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_get_axes.invokeExact(
                    face.handle(),
                    startOffset,
                    (Addressable) (axesCount == null ? MemoryAddress.NULL : (Addressable) axesCountPOINTER.address()),
                    (Addressable) axesArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (axesCount != null) axesCount.set(axesCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtVarAxisT[] axesArrayARRAY = new org.harfbuzz.OtVarAxisT[axesCount.get().intValue()];
        for (int I = 0; I < axesCount.get().intValue(); I++) {
            var OBJ = axesArrayPOINTER.get(Interop.valueLayout.ADDRESS, I);
            axesArrayARRAY[I] = org.harfbuzz.OtVarAxisT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        axesArray.set(axesArrayARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the number of OpenType variation axes included in the face.
     * @param face The {@link FaceT} to work on
     * @return the number of variation axes defined
     */
    public static int otVarGetAxisCount(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_get_axis_count.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches a list of all variation axes in the specified face. The list returned will begin
     * at the offset provided.
     * @param face {@link FaceT} to work upon
     * @param startOffset offset of the first lookup to retrieve
     * @param axesCount Input = the maximum number of variation axes to return;
     *                Output = the actual number of variation axes returned (may be zero)
     * @param axesArray The array of variation axes found
     * @return the number of variation axes in the face
     */
    public static int otVarGetAxisInfos(org.harfbuzz.FaceT face, int startOffset, Out<Integer> axesCount, Out<org.harfbuzz.OtVarAxisInfoT[]> axesArray) {
        MemorySegment axesCountPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment axesArrayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_get_axis_infos.invokeExact(
                    face.handle(),
                    startOffset,
                    (Addressable) (axesCount == null ? MemoryAddress.NULL : (Addressable) axesCountPOINTER.address()),
                    (Addressable) axesArrayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (axesCount != null) axesCount.set(axesCountPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.harfbuzz.OtVarAxisInfoT[] axesArrayARRAY = new org.harfbuzz.OtVarAxisInfoT[axesCount.get().intValue()];
        for (int I = 0; I < axesCount.get().intValue(); I++) {
            var OBJ = axesArrayPOINTER.get(Interop.valueLayout.ADDRESS, I);
            axesArrayARRAY[I] = org.harfbuzz.OtVarAxisInfoT.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        axesArray.set(axesArrayARRAY);
        return RESULT;
    }
    
    /**
     * Fetches the number of named instances included in the face.
     * @param face The {@link FaceT} to work on
     * @return the number of named instances defined
     */
    public static int otVarGetNamedInstanceCount(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_get_named_instance_count.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether a face includes any OpenType variation data in the {@code fvar} table.
     * @param face The {@link FaceT} to work on
     * @return {@code true} if data found, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT otVarHasData(org.harfbuzz.FaceT face) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_has_data.invokeExact(
                    face.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the design-space coordinates corresponding to the given
     * named instance in the face.
     * @param face The {@link FaceT} to work on
     * @param instanceIndex The index of the named instance to query
     * @param coordsLength Input = the maximum number of coordinates to return;
     *                 Output = the actual number of coordinates returned (may be zero)
     * @param coords The array of coordinates found for the query
     * @return the number of variation axes in the face
     */
    public static int otVarNamedInstanceGetDesignCoords(org.harfbuzz.FaceT face, int instanceIndex, Out<Integer> coordsLength, Out<float[]> coords) {
        MemorySegment coordsLengthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment coordsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_named_instance_get_design_coords.invokeExact(
                    face.handle(),
                    instanceIndex,
                    (Addressable) (coordsLength == null ? MemoryAddress.NULL : (Addressable) coordsLengthPOINTER.address()),
                    (Addressable) coordsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (coordsLength != null) coordsLength.set(coordsLengthPOINTER.get(Interop.valueLayout.C_INT, 0));
        coords.set(MemorySegment.ofAddress(coordsPOINTER.get(Interop.valueLayout.ADDRESS, 0), coordsLength.get().intValue() * Interop.valueLayout.C_FLOAT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_FLOAT));
        return RESULT;
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "PostScript name" defined for the given named instance in the face.
     * @param face The {@link FaceT} to work on
     * @param instanceIndex The index of the named instance to query
     * @return the Name ID found for the PostScript name
     */
    public static org.harfbuzz.OtNameIdT otVarNamedInstanceGetPostscriptNameId(org.harfbuzz.FaceT face, int instanceIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_named_instance_get_postscript_name_id.invokeExact(
                    face.handle(),
                    instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtNameIdT(RESULT);
    }
    
    /**
     * Fetches the {@code name} table Name ID that provides display names for
     * the "Subfamily name" defined for the given named instance in the face.
     * @param face The {@link FaceT} to work on
     * @param instanceIndex The index of the named instance to query
     * @return the Name ID found for the Subfamily name
     */
    public static org.harfbuzz.OtNameIdT otVarNamedInstanceGetSubfamilyNameId(org.harfbuzz.FaceT face, int instanceIndex) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_ot_var_named_instance_get_subfamily_name_id.invokeExact(
                    face.handle(),
                    instanceIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.OtNameIdT(RESULT);
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
     * @param face The {@link FaceT} to work on
     * @param coordsLength The length of the coordinate array
     * @param designCoords The design-space coordinates to normalize
     * @param normalizedCoords The normalized coordinates
     */
    public static void otVarNormalizeCoords(org.harfbuzz.FaceT face, int coordsLength, PointerFloat designCoords, Out<Integer> normalizedCoords) {
        MemorySegment normalizedCoordsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_ot_var_normalize_coords.invokeExact(
                    face.handle(),
                    coordsLength,
                    designCoords.handle(),
                    (Addressable) normalizedCoordsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        normalizedCoords.set(normalizedCoordsPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Normalizes all of the coordinates in the given list of variation axes.
     * @param face The {@link FaceT} to work on
     * @param variations The array of variations to normalize
     * @param variationsLength The number of variations to normalize
     * @param coords The array of normalized coordinates
     * @param coordsLength The length of the coordinate array
     */
    public static void otVarNormalizeVariations(org.harfbuzz.FaceT face, org.harfbuzz.VariationT variations, int variationsLength, Out<int[]> coords, int coordsLength) {
        MemorySegment coordsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_ot_var_normalize_variations.invokeExact(
                    face.handle(),
                    variations.handle(),
                    variationsLength,
                    (Addressable) coordsPOINTER.address(),
                    coordsLength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        coords.set(MemorySegment.ofAddress(coordsPOINTER.get(Interop.valueLayout.ADDRESS, 0), coordsLength * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT));
    }
    
    /**
     * Converts an ISO 15924 script tag to a corresponding {@link ScriptT}.
     * @param tag an {@link TagT} representing an ISO 15924 tag.
     * @return An {@link ScriptT} corresponding to the ISO 15924 tag.
     */
    public static org.harfbuzz.ScriptT scriptFromIso15924Tag(org.harfbuzz.TagT tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_script_from_iso15924_tag.invokeExact(
                    tag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    /**
     * Converts a string {@code str} representing an ISO 15924 script tag to a
     * corresponding {@link ScriptT}. Shorthand for hb_tag_from_string() then
     * hb_script_from_iso15924_tag().
     * @param str a string representing an
     *       ISO 15924 tag.
     * @param len length of the {@code str}, or -1 if it is {@code NULL}-terminated.
     * @return An {@link ScriptT} corresponding to the ISO 15924 tag.
     */
    public static org.harfbuzz.ScriptT scriptFromString(byte[] str, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_script_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    /**
     * Fetches the {@link DirectionT} of a script when it is
     * set horizontally. All right-to-left scripts will return
     * {@code HB_DIRECTION_RTL}. All left-to-right scripts will return
     * {@code HB_DIRECTION_LTR}.  Scripts that can be written either
     * horizontally or vertically will return {@code HB_DIRECTION_INVALID}.
     * Unknown scripts will return {@code HB_DIRECTION_LTR}.
     * @param script The {@link ScriptT} to query
     * @return The horizontal {@link DirectionT} of {@code script}
     */
    public static org.harfbuzz.DirectionT scriptGetHorizontalDirection(org.harfbuzz.ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_script_get_horizontal_direction.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.DirectionT.of(RESULT);
    }
    
    /**
     * Converts an {@link ScriptT} to a corresponding ISO 15924 script tag.
     * @param script an {@link ScriptT} to convert.
     * @return An {@link TagT} representing an ISO 15924 script tag.
     */
    public static org.harfbuzz.TagT scriptToIso15924Tag(org.harfbuzz.ScriptT script) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_script_to_iso15924_tag.invokeExact(
                    script.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Checks the equality of two {@link SegmentPropertiesT}'s.
     * @param a first {@link SegmentPropertiesT} to compare.
     * @param b second {@link SegmentPropertiesT} to compare.
     * @return {@code true} if all properties of {@code a} equal those of {@code b}, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT segmentPropertiesEqual(org.harfbuzz.SegmentPropertiesT a, org.harfbuzz.SegmentPropertiesT b) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_segment_properties_equal.invokeExact(
                    a.handle(),
                    b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Creates a hash representing {@code p}.
     * @param p {@link SegmentPropertiesT} to hash.
     * @return A hash of {@code p}.
     */
    public static int segmentPropertiesHash(org.harfbuzz.SegmentPropertiesT p) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_segment_properties_hash.invokeExact(
                    p.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fills in missing fields of {@code p} from {@code src} in a considered manner.
     * <p>
     * First, if {@code p} does not have direction set, direction is copied from {@code src}.
     * <p>
     * Next, if {@code p} and {@code src} have the same direction (which can be unset), if {@code p}
     * does not have script set, script is copied from {@code src}.
     * <p>
     * Finally, if {@code p} and {@code src} have the same direction and script (which either
     * can be unset), if {@code p} does not have language set, language is copied from
     * {@code src}.
     * @param p {@link SegmentPropertiesT} to fill in.
     * @param src {@link SegmentPropertiesT} to fill in from.
     */
    public static void segmentPropertiesOverlay(org.harfbuzz.SegmentPropertiesT p, org.harfbuzz.SegmentPropertiesT src) {
        try {
            DowncallHandles.hb_segment_properties_overlay.invokeExact(
                    p.handle(),
                    src.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code codepoint} to {@code set}.
     * @param set A set
     * @param codepoint The element to add to {@code set}
     */
    public static void setAdd(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint) {
        try {
            DowncallHandles.hb_set_add.invokeExact(
                    set.handle(),
                    codepoint.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds all of the elements from {@code first} to {@code last}
     * (inclusive) to {@code set}.
     * @param set A set
     * @param first The first element to add to {@code set}
     * @param last The final element to add to {@code set}
     */
    public static void setAddRange(org.harfbuzz.SetT set, org.harfbuzz.CodepointT first, org.harfbuzz.CodepointT last) {
        try {
            DowncallHandles.hb_set_add_range.invokeExact(
                    set.handle(),
                    first.getValue().intValue(),
                    last.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code num_codepoints} codepoints to a set at once.
     * The codepoints array must be in increasing order,
     * with size at least {@code num_codepoints}.
     * @param set A set
     * @param sortedCodepoints Array of codepoints to add
     * @param numCodepoints Length of {@code sorted_codepoints}
     */
    public static void setAddSortedArray(org.harfbuzz.SetT set, org.harfbuzz.CodepointT[] sortedCodepoints, int numCodepoints) {
        try {
            DowncallHandles.hb_set_add_sorted_array.invokeExact(
                    set.handle(),
                    Interop.allocateNativeArray(org.harfbuzz.CodepointT.getIntegerValues(sortedCodepoints), false),
                    numCodepoints);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tests whether memory allocation for a set was successful.
     * @param set A set
     * @return {@code true} if allocation succeeded, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setAllocationSuccessful(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_allocation_successful.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Clears out the contents of a set.
     * @param set A set
     */
    public static void setClear(org.harfbuzz.SetT set) {
        try {
            DowncallHandles.hb_set_clear.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocate a copy of {@code set}.
     * @param set A set
     * @return Newly-allocated set.
     */
    public static org.harfbuzz.SetT setCopy(org.harfbuzz.SetT set) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_set_copy.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.SetT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new, initially empty set.
     * @return The new {@link SetT}
     */
    public static org.harfbuzz.SetT setCreate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_set_create.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.SetT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes {@code codepoint} from {@code set}.
     * @param set A set
     * @param codepoint Removes {@code codepoint} from {@code set}
     */
    public static void setDel(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint) {
        try {
            DowncallHandles.hb_set_del.invokeExact(
                    set.handle(),
                    codepoint.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all of the elements from {@code first} to {@code last}
     * (inclusive) from {@code set}.
     * <p>
     * If {@code last} is {@code HB_SET_VALUE_INVALID}, then all values
     * greater than or equal to {@code first} are removed.
     * @param set A set
     * @param first The first element to remove from {@code set}
     * @param last The final element to remove from {@code set}
     */
    public static void setDelRange(org.harfbuzz.SetT set, org.harfbuzz.CodepointT first, org.harfbuzz.CodepointT last) {
        try {
            DowncallHandles.hb_set_del_range.invokeExact(
                    set.handle(),
                    first.getValue().intValue(),
                    last.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count on a set. When
     * the reference count reaches zero, the set is
     * destroyed, freeing all memory.
     * @param set A set
     */
    public static void setDestroy(org.harfbuzz.SetT set) {
        try {
            DowncallHandles.hb_set_destroy.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches the singleton empty {@link SetT}.
     * @return The empty {@link SetT}
     */
    public static org.harfbuzz.SetT setGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_set_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.SetT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Finds the largest element in the set.
     * @param set A set
     * @return maximum of {@code set}, or {@code HB_SET_VALUE_INVALID} if {@code set} is empty.
     */
    public static org.harfbuzz.CodepointT setGetMax(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_get_max.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Finds the smallest element in the set.
     * @param set A set
     * @return minimum of {@code set}, or {@code HB_SET_VALUE_INVALID} if {@code set} is empty.
     */
    public static org.harfbuzz.CodepointT setGetMin(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_get_min.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Returns the number of elements in the set.
     * @param set A set
     * @return The population of {@code set}
     */
    public static int setGetPopulation(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_get_population.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified set.
     * @param set A set
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress setGetUserData(org.harfbuzz.SetT set, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_set_get_user_data.invokeExact(
                    set.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether {@code codepoint} belongs to {@code set}.
     * @param set A set
     * @param codepoint The element to query
     * @return {@code true} if {@code codepoint} is in {@code set}, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setHas(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_has.invokeExact(
                    set.handle(),
                    codepoint.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Creates a hash representing {@code set}.
     * @param set A set
     * @return A hash of {@code set}.
     */
    public static int setHash(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_hash.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Makes {@code set} the intersection of {@code set} and {@code other}.
     * @param set A set
     * @param other Another set
     */
    public static void setIntersect(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        try {
            DowncallHandles.hb_set_intersect.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inverts the contents of {@code set}.
     * @param set A set
     */
    public static void setInvert(org.harfbuzz.SetT set) {
        try {
            DowncallHandles.hb_set_invert.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tests whether a set is empty (contains no elements).
     * @param set a set.
     * @return {@code true} if {@code set} is empty
     */
    public static org.harfbuzz.BoolT setIsEmpty(org.harfbuzz.SetT set) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_is_empty.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code set} and {@code other} are equal (contain the same
     * elements).
     * @param set A set
     * @param other Another set
     * @return {@code true} if the two sets are equal, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT setIsEqual(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_is_equal.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Tests whether {@code set} is a subset of {@code larger_set}.
     * @param set A set
     * @param largerSet Another set
     * @return {@code true} if the {@code set} is a subset of (or equal to) {@code larger_set}, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT setIsSubset(org.harfbuzz.SetT set, org.harfbuzz.SetT largerSet) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_is_subset.invokeExact(
                    set.handle(),
                    largerSet.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the next element in {@code set} that is greater than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     * @param set A set
     * @param codepoint Input = Code point to query
     *             Output = Code point retrieved
     * @return {@code true} if there was a next value, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setNext(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint) {
        MemorySegment codepointPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_next.invokeExact(
                    set.handle(),
                    (Addressable) codepointPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        codepoint.setValue(codepointPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Finds the next element in {@code set} that is greater than {@code codepoint}. Writes out
     * codepoints to {@code out}, until either the set runs out of elements, or {@code size}
     * codepoints are written, whichever comes first.
     * @param set A set
     * @param codepoint Outputting codepoints starting after this one.
     *             Use {@code HB_SET_VALUE_INVALID} to get started.
     * @param out An array of codepoints to write to.
     * @param size The maximum number of codepoints to write out.
     * @return the number of values written.
     */
    public static int setNextMany(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint, org.harfbuzz.CodepointT[] out, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_next_many.invokeExact(
                    set.handle(),
                    codepoint.getValue().intValue(),
                    Interop.allocateNativeArray(org.harfbuzz.CodepointT.getIntegerValues(out), false),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fetches the next consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code last} to {@code HB_SET_VALUE_INVALID} to get started.
     * @param set A set
     * @param first The first code point in the range
     * @param last Input = The current last code point in the range
     *         Output = The last code point in the range
     * @return {@code true} if there was a next range, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setNextRange(org.harfbuzz.SetT set, org.harfbuzz.CodepointT first, org.harfbuzz.CodepointT last) {
        MemorySegment firstPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment lastPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_next_range.invokeExact(
                    set.handle(),
                    (Addressable) firstPOINTER.address(),
                    (Addressable) lastPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        first.setValue(firstPOINTER.get(Interop.valueLayout.C_INT, 0));
        last.setValue(lastPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the previous element in {@code set} that is lower than current value of {@code codepoint}.
     * <p>
     * Set {@code codepoint} to {@code HB_SET_VALUE_INVALID} to get started.
     * @param set A set
     * @param codepoint Input = Code point to query
     *             Output = Code point retrieved
     * @return {@code true} if there was a previous value, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setPrevious(org.harfbuzz.SetT set, org.harfbuzz.CodepointT codepoint) {
        MemorySegment codepointPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_previous.invokeExact(
                    set.handle(),
                    (Addressable) codepointPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        codepoint.setValue(codepointPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the previous consecutive range of elements in {@code set} that
     * are greater than current value of {@code last}.
     * <p>
     * Set {@code first} to {@code HB_SET_VALUE_INVALID} to get started.
     * @param set A set
     * @param first Input = The current first code point in the range
     *         Output = The first code point in the range
     * @param last The last code point in the range
     * @return {@code true} if there was a previous range, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setPreviousRange(org.harfbuzz.SetT set, org.harfbuzz.CodepointT first, org.harfbuzz.CodepointT last) {
        MemorySegment firstPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment lastPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_previous_range.invokeExact(
                    set.handle(),
                    (Addressable) firstPOINTER.address(),
                    (Addressable) lastPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        first.setValue(firstPOINTER.get(Interop.valueLayout.C_INT, 0));
        last.setValue(lastPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Increases the reference count on a set.
     * @param set A set
     * @return The set
     */
    public static org.harfbuzz.SetT setReference(org.harfbuzz.SetT set) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_set_reference.invokeExact(
                    set.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.SetT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Makes the contents of {@code set} equal to the contents of {@code other}.
     * @param set A set
     * @param other Another set
     */
    public static void setSet(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        try {
            DowncallHandles.hb_set_set.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified set.
     * @param set A set
     * @param key The user-data key to set
     * @param data A pointer to the user data to set
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT setSetUserData(org.harfbuzz.SetT set, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_set_set_user_data.invokeExact(
                    set.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Subtracts the contents of {@code other} from {@code set}.
     * @param set A set
     * @param other Another set
     */
    public static void setSubtract(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        try {
            DowncallHandles.hb_set_subtract.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code set} the symmetric difference of {@code set}
     * and {@code other}.
     * @param set A set
     * @param other Another set
     */
    public static void setSymmetricDifference(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        try {
            DowncallHandles.hb_set_symmetric_difference.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes {@code set} the union of {@code set} and {@code other}.
     * @param set A set
     * @param other Another set
     */
    public static void setUnion(org.harfbuzz.SetT set, org.harfbuzz.SetT other) {
        try {
            DowncallHandles.hb_set_union.invokeExact(
                    set.handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Shapes {@code buffer} using {@code font} turning its Unicode characters content to
     * positioned glyphs. If {@code features} is not {@code NULL}, it will be used to control the
     * features applied during shaping. If two {@code features} have the same tag but
     * overlapping ranges the value of the feature with the higher index takes
     * precedence.
     * @param font an {@link FontT} to use for shaping
     * @param buffer an {@link BufferT} to shape
     * @param features an array of user
     *    specified {@link FeatureT} or {@code NULL}
     * @param numFeatures the length of {@code features} array
     */
    public static void shape(org.harfbuzz.FontT font, org.harfbuzz.BufferT buffer, @Nullable org.harfbuzz.FeatureT[] features, int numFeatures) {
        try {
            DowncallHandles.hb_shape.invokeExact(
                    font.handle(),
                    buffer.handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : Interop.allocateNativeArray(features, org.harfbuzz.FeatureT.getMemoryLayout(), false)),
                    numFeatures);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * See hb_shape() for details. If {@code shaper_list} is not {@code NULL}, the specified
     * shapers will be used in the given order, otherwise the default shapers list
     * will be used.
     * @param font an {@link FontT} to use for shaping
     * @param buffer an {@link BufferT} to shape
     * @param features an array of user
     *    specified {@link FeatureT} or {@code NULL}
     * @param numFeatures the length of {@code features} array
     * @param shaperList a {@code NULL}-terminated
     *    array of shapers to use or {@code NULL}
     * @return false if all shapers failed, true otherwise
     */
    public static org.harfbuzz.BoolT shapeFull(org.harfbuzz.FontT font, org.harfbuzz.BufferT buffer, @Nullable org.harfbuzz.FeatureT[] features, int numFeatures, @Nullable java.lang.String[] shaperList) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_shape_full.invokeExact(
                    font.handle(),
                    buffer.handle(),
                    (Addressable) (features == null ? MemoryAddress.NULL : Interop.allocateNativeArray(features, org.harfbuzz.FeatureT.getMemoryLayout(), false)),
                    numFeatures,
                    (Addressable) (shaperList == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shaperList, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Retrieves the list of shapers supported by HarfBuzz.
     * @return an array of
     *    constant strings
     */
    public static PointerString shapeListShapers() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_list_shapers.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}.
     * @param face {@link FaceT} to use
     * @param props The {@link SegmentPropertiesT} of the segment
     * @param userFeatures The list of user-selected features
     * @param numUserFeatures The number of user-selected features
     * @param shaperList List of shapers to try
     * @return The shaping plan
     */
    public static org.harfbuzz.ShapePlanT shapePlanCreate(org.harfbuzz.FaceT face, org.harfbuzz.SegmentPropertiesT props, org.harfbuzz.FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_create.invokeExact(
                    face.handle(),
                    props.handle(),
                    Interop.allocateNativeArray(userFeatures, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numUserFeatures,
                    Interop.allocateNativeArray(shaperList, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * The variable-font version of {@code hb_shape_plan_create}.
     * Constructs a shaping plan for a combination of {@code face}, {@code user_features}, {@code props},
     * and {@code shaper_list}, plus the variation-space coordinates {@code coords}.
     * @param face {@link FaceT} to use
     * @param props The {@link SegmentPropertiesT} of the segment
     * @param userFeatures The list of user-selected features
     * @param numUserFeatures The number of user-selected features
     * @param coords The list of variation-space coordinates
     * @param numCoords The number of variation-space coordinates
     * @param shaperList List of shapers to try
     * @return The shaping plan
     */
    public static org.harfbuzz.ShapePlanT shapePlanCreate2(org.harfbuzz.FaceT face, org.harfbuzz.SegmentPropertiesT props, org.harfbuzz.FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_create2.invokeExact(
                    face.handle(),
                    props.handle(),
                    Interop.allocateNativeArray(userFeatures, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numUserFeatures,
                    Interop.allocateNativeArray(coords, false),
                    numCoords,
                    Interop.allocateNativeArray(shaperList, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}.
     * @param face {@link FaceT} to use
     * @param props The {@link SegmentPropertiesT} of the segment
     * @param userFeatures The list of user-selected features
     * @param numUserFeatures The number of user-selected features
     * @param shaperList List of shapers to try
     * @return The shaping plan
     */
    public static org.harfbuzz.ShapePlanT shapePlanCreateCached(org.harfbuzz.FaceT face, org.harfbuzz.SegmentPropertiesT props, org.harfbuzz.FeatureT[] userFeatures, int numUserFeatures, java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_create_cached.invokeExact(
                    face.handle(),
                    props.handle(),
                    Interop.allocateNativeArray(userFeatures, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numUserFeatures,
                    Interop.allocateNativeArray(shaperList, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * The variable-font version of {@code hb_shape_plan_create_cached}.
     * Creates a cached shaping plan suitable for reuse, for a combination
     * of {@code face}, {@code user_features}, {@code props}, and {@code shaper_list}, plus the
     * variation-space coordinates {@code coords}.
     * @param face {@link FaceT} to use
     * @param props The {@link SegmentPropertiesT} of the segment
     * @param userFeatures The list of user-selected features
     * @param numUserFeatures The number of user-selected features
     * @param coords The list of variation-space coordinates
     * @param numCoords The number of variation-space coordinates
     * @param shaperList List of shapers to try
     * @return The shaping plan
     */
    public static org.harfbuzz.ShapePlanT shapePlanCreateCached2(org.harfbuzz.FaceT face, org.harfbuzz.SegmentPropertiesT props, org.harfbuzz.FeatureT[] userFeatures, int numUserFeatures, int[] coords, int numCoords, java.lang.String[] shaperList) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_create_cached2.invokeExact(
                    face.handle(),
                    props.handle(),
                    Interop.allocateNativeArray(userFeatures, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numUserFeatures,
                    Interop.allocateNativeArray(coords, false),
                    numCoords,
                    Interop.allocateNativeArray(shaperList, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on the given shaping plan. When the
     * reference count reaches zero, the shaping plan is destroyed,
     * freeing all memory.
     * @param shapePlan A shaping plan
     */
    public static void shapePlanDestroy(org.harfbuzz.ShapePlanT shapePlan) {
        try {
            DowncallHandles.hb_shape_plan_destroy.invokeExact(
                    shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Executes the given shaping plan on the specified buffer, using
     * the given {@code font} and {@code features}.
     * @param shapePlan A shaping plan
     * @param font The {@link FontT} to use
     * @param buffer The {@link BufferT} to work upon
     * @param features Features to enable
     * @param numFeatures The number of features to enable
     * @return {@code true} if success, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT shapePlanExecute(org.harfbuzz.ShapePlanT shapePlan, org.harfbuzz.FontT font, org.harfbuzz.BufferT buffer, org.harfbuzz.FeatureT[] features, int numFeatures) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_shape_plan_execute.invokeExact(
                    shapePlan.handle(),
                    font.handle(),
                    buffer.handle(),
                    Interop.allocateNativeArray(features, org.harfbuzz.FeatureT.getMemoryLayout(), false),
                    numFeatures);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the singleton empty shaping plan.
     * @return The empty shaping plan
     */
    public static org.harfbuzz.ShapePlanT shapePlanGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the shaper from a given shaping plan.
     * @param shapePlan A shaping plan
     * @return The shaper
     */
    public static java.lang.String shapePlanGetShaper(org.harfbuzz.ShapePlanT shapePlan) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_get_shaper.invokeExact(
                    shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Fetches the user data associated with the specified key,
     * attached to the specified shaping plan.
     * @param shapePlan A shaping plan
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress shapePlanGetUserData(org.harfbuzz.ShapePlanT shapePlan, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_get_user_data.invokeExact(
                    shapePlan.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increases the reference count on the given shaping plan.
     * @param shapePlan A shaping plan
     * @return {@code shape_plan}
     */
    public static org.harfbuzz.ShapePlanT shapePlanReference(org.harfbuzz.ShapePlanT shapePlan) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_shape_plan_reference.invokeExact(
                    shapePlan.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ShapePlanT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Attaches a user-data key/data pair to the given shaping plan.
     * @param shapePlan A shaping plan
     * @param key The user-data key to set
     * @param data A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise.
     */
    public static org.harfbuzz.BoolT shapePlanSetUserData(org.harfbuzz.ShapePlanT shapePlan, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_shape_plan_set_user_data.invokeExact(
                    shapePlan.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Searches variation axes of a {@link FontT} object for a specific axis first,
     * if not set, then tries to get default style values from different
     * tables of the font.
     * @param font a {@link FontT} object.
     * @param styleTag a style tag.
     * @return Corresponding axis or default value to a style tag.
     */
    public static float styleGetValue(org.harfbuzz.FontT font, org.harfbuzz.StyleTagT styleTag) {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.hb_style_get_value.invokeExact(
                    font.handle(),
                    styleTag.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Converts a string into an {@link TagT}. Valid tags
     * are four characters. Shorter input strings will be
     * padded with spaces. Longer input strings will be
     * truncated.
     * @param str String to convert
     * @param len Length of {@code str}, or -1 if it is {@code NULL}-terminated
     * @return The {@link TagT} corresponding to {@code str}
     */
    public static org.harfbuzz.TagT tagFromString(byte[] str, int len) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_tag_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.TagT(RESULT);
    }
    
    /**
     * Converts an {@link TagT} to a string and returns it in {@code buf}.
     * Strings will be four characters long.
     * @param tag {@link TagT} to convert
     * @param buf Converted string
     */
    public static void tagToString(org.harfbuzz.TagT tag, Out<byte[]> buf) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_tag_to_string.invokeExact(
                    tag.getValue().intValue(),
                    (Addressable) bufPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.set(MemorySegment.ofAddress(bufPOINTER.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE));
    }
    
    /**
     * Retrieves the Canonical Combining Class (ccc) property
     * of code point {@code unicode}.
     * @param ufuncs The Unicode-functions structure
     * @param unicode The code point to query
     * @return The {@link UnicodeCombiningClassT} of {@code unicode}
     */
    public static org.harfbuzz.UnicodeCombiningClassT unicodeCombiningClass(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_combining_class.invokeExact(
                    ufuncs.handle(),
                    unicode.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeCombiningClassT.of(RESULT);
    }
    
    /**
     * Fetches the composition of a sequence of two Unicode
     * code points.
     * <p>
     * Calls the composition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     * @param ufuncs The Unicode-functions structure
     * @param a The first Unicode code point to compose
     * @param b The second Unicode code point to compose
     * @param ab The composition of {@code a}, {@code b}
     * @return {@code true} if {@code a} and {@code b} composed, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT unicodeCompose(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT a, org.harfbuzz.CodepointT b, org.harfbuzz.CodepointT ab) {
        MemorySegment abPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_compose.invokeExact(
                    ufuncs.handle(),
                    a.getValue().intValue(),
                    b.getValue().intValue(),
                    (Addressable) abPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        ab.setValue(abPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the decomposition of a Unicode code point.
     * <p>
     * Calls the decomposition function of the specified
     * Unicode-functions structure {@code ufuncs}.
     * @param ufuncs The Unicode-functions structure
     * @param ab Unicode code point to decompose
     * @param a The first code point of the decomposition of {@code ab}
     * @param b The second code point of the decomposition of {@code ab}
     * @return {@code true} if {@code ab} was decomposed, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT unicodeDecompose(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT ab, org.harfbuzz.CodepointT a, org.harfbuzz.CodepointT b) {
        MemorySegment aPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment bPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_decompose.invokeExact(
                    ufuncs.handle(),
                    ab.getValue().intValue(),
                    (Addressable) aPOINTER.address(),
                    (Addressable) bPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        a.setValue(aPOINTER.get(Interop.valueLayout.C_INT, 0));
        b.setValue(bPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Fetches the compatibility decomposition of a Unicode
     * code point. Deprecated.
     * @param ufuncs The Unicode-functions structure
     * @param u Code point to decompose
     * @param decomposed Compatibility decomposition of {@code u}
     * @return length of {@code decomposed}.
     */
    @Deprecated
    public static int unicodeDecomposeCompatibility(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT u, org.harfbuzz.CodepointT decomposed) {
        MemorySegment decomposedPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_decompose_compatibility.invokeExact(
                    ufuncs.handle(),
                    u.getValue().intValue(),
                    (Addressable) decomposedPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        decomposed.setValue(decomposedPOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
    
    /**
     * Don't use. Not used by HarfBuzz.
     * @param ufuncs a Unicode-function structure
     * @param unicode The code point to query
     */
    @Deprecated
    public static int unicodeEastasianWidth(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_eastasian_width.invokeExact(
                    ufuncs.handle(),
                    unicode.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link UnicodeFuncsT} structure of Unicode functions.
     * @param parent Parent Unicode-functions structure
     * @return The Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT unicodeFuncsCreate(@Nullable org.harfbuzz.UnicodeFuncsT parent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_create.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count on a Unicode-functions structure. When
     * the reference count reaches zero, the Unicode-functions structure is
     * destroyed, freeing all memory.
     * @param ufuncs The Unicode-functions structure
     */
    public static void unicodeFuncsDestroy(org.harfbuzz.UnicodeFuncsT ufuncs) {
        try {
            DowncallHandles.hb_unicode_funcs_destroy.invokeExact(
                    ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a pointer to the default Unicode-functions structure that is used
     * when no functions are explicitly set on {@link BufferT}.
     * @return a pointer to the {@link UnicodeFuncsT} Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT unicodeFuncsGetDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Fetches the singleton empty Unicode-functions structure.
     * @return The empty Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT unicodeFuncsGetEmpty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_get_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the parent of the Unicode-functions structure
     * {@code ufuncs}.
     * @param ufuncs The Unicode-functions structure
     * @return The parent Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT unicodeFuncsGetParent(org.harfbuzz.UnicodeFuncsT ufuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_get_parent.invokeExact(
                    ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Fetches the user-data associated with the specified key,
     * attached to the specified Unicode-functions structure.
     * @param ufuncs The Unicode-functions structure
     * @param key The user-data key to query
     * @return A pointer to the user data
     */
    public static @Nullable java.lang.foreign.MemoryAddress unicodeFuncsGetUserData(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UserDataKeyT key) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_get_user_data.invokeExact(
                    ufuncs.handle(),
                    key.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Tests whether the specified Unicode-functions structure
     * is immutable.
     * @param ufuncs The Unicode-functions structure
     * @return {@code true} if {@code ufuncs} is immutable, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT unicodeFuncsIsImmutable(org.harfbuzz.UnicodeFuncsT ufuncs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_funcs_is_immutable.invokeExact(
                    ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Makes the specified Unicode-functions structure
     * immutable.
     * @param ufuncs The Unicode-functions structure
     */
    public static void unicodeFuncsMakeImmutable(org.harfbuzz.UnicodeFuncsT ufuncs) {
        try {
            DowncallHandles.hb_unicode_funcs_make_immutable.invokeExact(
                    ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on a Unicode-functions structure.
     * @param ufuncs The Unicode-functions structure
     * @return The Unicode-functions structure
     */
    public static org.harfbuzz.UnicodeFuncsT unicodeFuncsReference(org.harfbuzz.UnicodeFuncsT ufuncs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_unicode_funcs_reference.invokeExact(
                    ufuncs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeFuncsT.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets the implementation function for {@link UnicodeCombiningClassFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetCombiningClassFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeCombiningClassFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_combining_class_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeComposeFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetComposeFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeComposeFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_compose_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeDecomposeCompatibilityFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    @Deprecated
    public static void unicodeFuncsSetDecomposeCompatibilityFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeDecomposeCompatibilityFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_decompose_compatibility_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeDecomposeFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetDecomposeFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeDecomposeFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_decompose_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeEastasianWidthFuncT}.
     * @param ufuncs a Unicode-function structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    @Deprecated
    public static void unicodeFuncsSetEastasianWidthFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeEastasianWidthFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_eastasian_width_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeGeneralCategoryFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetGeneralCategoryFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeGeneralCategoryFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_general_category_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeMirroringFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetMirroringFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeMirroringFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_mirroring_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the implementation function for {@link UnicodeScriptFuncT}.
     * @param ufuncs A Unicode-functions structure
     * @param func The callback function to assign
     * @param userData Data to pass to {@code func}
     * @param destroy The function to call when {@code user_data} is not needed anymore
     */
    public static void unicodeFuncsSetScriptFunc(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UnicodeScriptFuncT func, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.harfbuzz.DestroyFuncT destroy) {
        try {
            DowncallHandles.hb_unicode_funcs_set_script_func.invokeExact(
                    ufuncs.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches a user-data key/data pair to the specified Unicode-functions structure.
     * @param ufuncs The Unicode-functions structure
     * @param key The user-data key
     * @param data A pointer to the user data
     * @param destroy A callback to call when {@code data} is not needed anymore
     * @param replace Whether to replace an existing data with the same key
     * @return {@code true} if success, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT unicodeFuncsSetUserData(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.UserDataKeyT key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.harfbuzz.DestroyFuncT destroy, org.harfbuzz.BoolT replace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_funcs_set_user_data.invokeExact(
                    ufuncs.handle(),
                    key.handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data),
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()),
                    replace.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Retrieves the General Category (gc) property
     * of code point {@code unicode}.
     * @param ufuncs The Unicode-functions structure
     * @param unicode The code point to query
     * @return The {@link UnicodeGeneralCategoryT} of {@code unicode}
     */
    public static org.harfbuzz.UnicodeGeneralCategoryT unicodeGeneralCategory(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_general_category.invokeExact(
                    ufuncs.handle(),
                    unicode.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.UnicodeGeneralCategoryT.of(RESULT);
    }
    
    /**
     * Retrieves the Bi-directional Mirroring Glyph code
     * point defined for code point {@code unicode}.
     * @param ufuncs The Unicode-functions structure
     * @param unicode The code point to query
     * @return The {@link CodepointT} of the Mirroring Glyph for {@code unicode}
     */
    public static org.harfbuzz.CodepointT unicodeMirroring(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_mirroring.invokeExact(
                    ufuncs.handle(),
                    unicode.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.CodepointT(RESULT);
    }
    
    /**
     * Retrieves the {@link ScriptT} script to which code
     * point {@code unicode} belongs.
     * @param ufuncs The Unicode-functions structure
     * @param unicode The code point to query
     * @return The {@link ScriptT} of {@code unicode}
     */
    public static org.harfbuzz.ScriptT unicodeScript(org.harfbuzz.UnicodeFuncsT ufuncs, org.harfbuzz.CodepointT unicode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_unicode_script.invokeExact(
                    ufuncs.handle(),
                    unicode.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.harfbuzz.ScriptT.of(RESULT);
    }
    
    /**
     * Parses a string into a {@link VariationT}.
     * <p>
     * The format for specifying variation settings follows. All valid CSS
     * font-variation-settings values other than 'normal' and 'inherited' are also
     * accepted, though, not documented below.
     * <p>
     * The format is a tag, optionally followed by an equals sign, followed by a
     * number. For example {@code wght=500}, or {@code slnt=-7.5}.
     * @param str a string to parse
     * @param len length of {@code str}, or -1 if string is {@code NULL} terminated
     * @param variation the {@link VariationT} to initialize with the parsed values
     * @return {@code true} if {@code str} is successfully parsed, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT variationFromString(byte[] str, int len, org.harfbuzz.VariationT variation) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_variation_from_string.invokeExact(
                    Interop.allocateNativeArray(str, false),
                    len,
                    variation.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Converts an {@link VariationT} into a {@code NULL}-terminated string in the format
     * understood by hb_variation_from_string(). The client in responsible for
     * allocating big enough size for {@code buf}, 128 bytes is more than enough.
     * @param variation an {@link VariationT} to convert
     * @param buf output string
     * @param size the allocated size of {@code buf}
     */
    public static void variationToString(org.harfbuzz.VariationT variation, Out<java.lang.String[]> buf, int size) {
        MemorySegment bufPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.hb_variation_to_string.invokeExact(
                    variation.handle(),
                    (Addressable) bufPOINTER.address(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        java.lang.String[] bufARRAY = new java.lang.String[size];
        for (int I = 0; I < size; I++) {
            var OBJ = bufPOINTER.get(Interop.valueLayout.ADDRESS, I);
            bufARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
        }
        buf.set(bufARRAY);
    }
    
    /**
     * Returns library version as three integer components.
     * @param major Library major version component
     * @param minor Library minor version component
     * @param micro Library micro version component
     */
    public static void version(Out<Integer> major, Out<Integer> minor, Out<Integer> micro) {
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment microPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.hb_version.invokeExact(
                    (Addressable) majorPOINTER.address(),
                    (Addressable) minorPOINTER.address(),
                    (Addressable) microPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
        minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
        micro.set(microPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Tests the library version against a minimum value,
     * as three integer components.
     * @param major Library major version component
     * @param minor Library minor version component
     * @param micro Library micro version component
     * @return {@code true} if the library is equal to or greater than
     * the test value, {@code false} otherwise
     */
    public static org.harfbuzz.BoolT versionAtleast(int major, int minor, int micro) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.hb_version_atleast.invokeExact(
                    major,
                    minor,
                    micro);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.harfbuzz.BoolT(RESULT);
    }
    
    /**
     * Returns library version as a string with three components.
     * @return Library version string
     */
    public static java.lang.String versionString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.hb_version_string.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle hb_aat_layout_feature_type_get_name_id = Interop.downcallHandle(
            "hb_aat_layout_feature_type_get_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_aat_layout_feature_type_get_selector_infos = Interop.downcallHandle(
            "hb_aat_layout_feature_type_get_selector_infos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_aat_layout_get_feature_types = Interop.downcallHandle(
            "hb_aat_layout_get_feature_types",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_aat_layout_has_positioning = Interop.downcallHandle(
            "hb_aat_layout_has_positioning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_aat_layout_has_substitution = Interop.downcallHandle(
            "hb_aat_layout_has_substitution",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_aat_layout_has_tracking = Interop.downcallHandle(
            "hb_aat_layout_has_tracking",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_copy_writable_or_fail = Interop.downcallHandle(
            "hb_blob_copy_writable_or_fail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_create = Interop.downcallHandle(
            "hb_blob_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_create_from_file = Interop.downcallHandle(
            "hb_blob_create_from_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_create_from_file_or_fail = Interop.downcallHandle(
            "hb_blob_create_from_file_or_fail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_create_or_fail = Interop.downcallHandle(
            "hb_blob_create_or_fail",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_create_sub_blob = Interop.downcallHandle(
            "hb_blob_create_sub_blob",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_blob_destroy = Interop.downcallHandle(
            "hb_blob_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_get_data = Interop.downcallHandle(
            "hb_blob_get_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_get_data_writable = Interop.downcallHandle(
            "hb_blob_get_data_writable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_get_empty = Interop.downcallHandle(
            "hb_blob_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_get_length = Interop.downcallHandle(
            "hb_blob_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_get_user_data = Interop.downcallHandle(
            "hb_blob_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_is_immutable = Interop.downcallHandle(
            "hb_blob_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_make_immutable = Interop.downcallHandle(
            "hb_blob_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_reference = Interop.downcallHandle(
            "hb_blob_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_blob_set_user_data = Interop.downcallHandle(
            "hb_blob_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add = Interop.downcallHandle(
            "hb_buffer_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add_codepoints = Interop.downcallHandle(
            "hb_buffer_add_codepoints",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add_latin1 = Interop.downcallHandle(
            "hb_buffer_add_latin1",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add_utf16 = Interop.downcallHandle(
            "hb_buffer_add_utf16",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add_utf32 = Interop.downcallHandle(
            "hb_buffer_add_utf32",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_add_utf8 = Interop.downcallHandle(
            "hb_buffer_add_utf8",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_allocation_successful = Interop.downcallHandle(
            "hb_buffer_allocation_successful",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_append = Interop.downcallHandle(
            "hb_buffer_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_clear_contents = Interop.downcallHandle(
            "hb_buffer_clear_contents",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_create = Interop.downcallHandle(
            "hb_buffer_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_create_similar = Interop.downcallHandle(
            "hb_buffer_create_similar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_deserialize_glyphs = Interop.downcallHandle(
            "hb_buffer_deserialize_glyphs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_deserialize_unicode = Interop.downcallHandle(
            "hb_buffer_deserialize_unicode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_destroy = Interop.downcallHandle(
            "hb_buffer_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_diff = Interop.downcallHandle(
            "hb_buffer_diff",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_get_cluster_level = Interop.downcallHandle(
            "hb_buffer_get_cluster_level",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_content_type = Interop.downcallHandle(
            "hb_buffer_get_content_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_direction = Interop.downcallHandle(
            "hb_buffer_get_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_empty = Interop.downcallHandle(
            "hb_buffer_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_flags = Interop.downcallHandle(
            "hb_buffer_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_glyph_infos = Interop.downcallHandle(
            "hb_buffer_get_glyph_infos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_glyph_positions = Interop.downcallHandle(
            "hb_buffer_get_glyph_positions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_invisible_glyph = Interop.downcallHandle(
            "hb_buffer_get_invisible_glyph",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_language = Interop.downcallHandle(
            "hb_buffer_get_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_length = Interop.downcallHandle(
            "hb_buffer_get_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_not_found_glyph = Interop.downcallHandle(
            "hb_buffer_get_not_found_glyph",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_replacement_codepoint = Interop.downcallHandle(
            "hb_buffer_get_replacement_codepoint",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_script = Interop.downcallHandle(
            "hb_buffer_get_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_segment_properties = Interop.downcallHandle(
            "hb_buffer_get_segment_properties",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_unicode_funcs = Interop.downcallHandle(
            "hb_buffer_get_unicode_funcs",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_get_user_data = Interop.downcallHandle(
            "hb_buffer_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_guess_segment_properties = Interop.downcallHandle(
            "hb_buffer_guess_segment_properties",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_has_positions = Interop.downcallHandle(
            "hb_buffer_has_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_normalize_glyphs = Interop.downcallHandle(
            "hb_buffer_normalize_glyphs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_pre_allocate = Interop.downcallHandle(
            "hb_buffer_pre_allocate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_reference = Interop.downcallHandle(
            "hb_buffer_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_reset = Interop.downcallHandle(
            "hb_buffer_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_reverse = Interop.downcallHandle(
            "hb_buffer_reverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_reverse_clusters = Interop.downcallHandle(
            "hb_buffer_reverse_clusters",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_reverse_range = Interop.downcallHandle(
            "hb_buffer_reverse_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize = Interop.downcallHandle(
            "hb_buffer_serialize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize_format_from_string = Interop.downcallHandle(
            "hb_buffer_serialize_format_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize_format_to_string = Interop.downcallHandle(
            "hb_buffer_serialize_format_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize_glyphs = Interop.downcallHandle(
            "hb_buffer_serialize_glyphs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize_list_formats = Interop.downcallHandle(
            "hb_buffer_serialize_list_formats",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle hb_buffer_serialize_unicode = Interop.downcallHandle(
            "hb_buffer_serialize_unicode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_cluster_level = Interop.downcallHandle(
            "hb_buffer_set_cluster_level",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_content_type = Interop.downcallHandle(
            "hb_buffer_set_content_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_direction = Interop.downcallHandle(
            "hb_buffer_set_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_flags = Interop.downcallHandle(
            "hb_buffer_set_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_invisible_glyph = Interop.downcallHandle(
            "hb_buffer_set_invisible_glyph",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_language = Interop.downcallHandle(
            "hb_buffer_set_language",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_set_length = Interop.downcallHandle(
            "hb_buffer_set_length",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_message_func = Interop.downcallHandle(
            "hb_buffer_set_message_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_set_not_found_glyph = Interop.downcallHandle(
            "hb_buffer_set_not_found_glyph",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_replacement_codepoint = Interop.downcallHandle(
            "hb_buffer_set_replacement_codepoint",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_script = Interop.downcallHandle(
            "hb_buffer_set_script",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_buffer_set_segment_properties = Interop.downcallHandle(
            "hb_buffer_set_segment_properties",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_set_unicode_funcs = Interop.downcallHandle(
            "hb_buffer_set_unicode_funcs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_buffer_set_user_data = Interop.downcallHandle(
            "hb_buffer_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_color_get_alpha = Interop.downcallHandle(
            "hb_color_get_alpha",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_color_get_blue = Interop.downcallHandle(
            "hb_color_get_blue",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_color_get_green = Interop.downcallHandle(
            "hb_color_get_green",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_color_get_red = Interop.downcallHandle(
            "hb_color_get_red",
            FunctionDescriptor.of(Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_direction_from_string = Interop.downcallHandle(
            "hb_direction_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_direction_to_string = Interop.downcallHandle(
            "hb_direction_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_draw_close_path = Interop.downcallHandle(
            "hb_draw_close_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_cubic_to = Interop.downcallHandle(
            "hb_draw_cubic_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_create = Interop.downcallHandle(
            "hb_draw_funcs_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_destroy = Interop.downcallHandle(
            "hb_draw_funcs_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_is_immutable = Interop.downcallHandle(
            "hb_draw_funcs_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_make_immutable = Interop.downcallHandle(
            "hb_draw_funcs_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_reference = Interop.downcallHandle(
            "hb_draw_funcs_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_set_close_path_func = Interop.downcallHandle(
            "hb_draw_funcs_set_close_path_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_set_cubic_to_func = Interop.downcallHandle(
            "hb_draw_funcs_set_cubic_to_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_set_line_to_func = Interop.downcallHandle(
            "hb_draw_funcs_set_line_to_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_set_move_to_func = Interop.downcallHandle(
            "hb_draw_funcs_set_move_to_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_funcs_set_quadratic_to_func = Interop.downcallHandle(
            "hb_draw_funcs_set_quadratic_to_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_draw_line_to = Interop.downcallHandle(
            "hb_draw_line_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_draw_move_to = Interop.downcallHandle(
            "hb_draw_move_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_draw_quadratic_to = Interop.downcallHandle(
            "hb_draw_quadratic_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_face_builder_add_table = Interop.downcallHandle(
            "hb_face_builder_add_table",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_builder_create = Interop.downcallHandle(
            "hb_face_builder_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_collect_unicodes = Interop.downcallHandle(
            "hb_face_collect_unicodes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_collect_variation_selectors = Interop.downcallHandle(
            "hb_face_collect_variation_selectors",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_collect_variation_unicodes = Interop.downcallHandle(
            "hb_face_collect_variation_unicodes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_count = Interop.downcallHandle(
            "hb_face_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_create = Interop.downcallHandle(
            "hb_face_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_face_create_for_tables = Interop.downcallHandle(
            "hb_face_create_for_tables",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_destroy = Interop.downcallHandle(
            "hb_face_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_empty = Interop.downcallHandle(
            "hb_face_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_glyph_count = Interop.downcallHandle(
            "hb_face_get_glyph_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_index = Interop.downcallHandle(
            "hb_face_get_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_table_tags = Interop.downcallHandle(
            "hb_face_get_table_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_upem = Interop.downcallHandle(
            "hb_face_get_upem",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_get_user_data = Interop.downcallHandle(
            "hb_face_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_is_immutable = Interop.downcallHandle(
            "hb_face_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_make_immutable = Interop.downcallHandle(
            "hb_face_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_reference = Interop.downcallHandle(
            "hb_face_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_reference_blob = Interop.downcallHandle(
            "hb_face_reference_blob",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_face_reference_table = Interop.downcallHandle(
            "hb_face_reference_table",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_face_set_glyph_count = Interop.downcallHandle(
            "hb_face_set_glyph_count",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_face_set_index = Interop.downcallHandle(
            "hb_face_set_index",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_face_set_upem = Interop.downcallHandle(
            "hb_face_set_upem",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_face_set_user_data = Interop.downcallHandle(
            "hb_face_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_feature_from_string = Interop.downcallHandle(
            "hb_feature_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_feature_to_string = Interop.downcallHandle(
            "hb_feature_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_add_glyph_origin_for_direction = Interop.downcallHandle(
            "hb_font_add_glyph_origin_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_changed = Interop.downcallHandle(
            "hb_font_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_create = Interop.downcallHandle(
            "hb_font_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_create_sub_font = Interop.downcallHandle(
            "hb_font_create_sub_font",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_destroy = Interop.downcallHandle(
            "hb_font_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_create = Interop.downcallHandle(
            "hb_font_funcs_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_destroy = Interop.downcallHandle(
            "hb_font_funcs_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_get_empty = Interop.downcallHandle(
            "hb_font_funcs_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_get_user_data = Interop.downcallHandle(
            "hb_font_funcs_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_is_immutable = Interop.downcallHandle(
            "hb_font_funcs_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_make_immutable = Interop.downcallHandle(
            "hb_font_funcs_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_reference = Interop.downcallHandle(
            "hb_font_funcs_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_font_h_extents_func = Interop.downcallHandle(
            "hb_font_funcs_set_font_h_extents_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_font_v_extents_func = Interop.downcallHandle(
            "hb_font_funcs_set_font_v_extents_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_contour_point_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_contour_point_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_extents_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_extents_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_from_name_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_from_name_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_h_advance_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_h_advance_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_h_advances_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_h_advances_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_h_kerning_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_h_kerning_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_h_origin_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_h_origin_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_name_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_name_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_shape_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_shape_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_v_advance_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_v_advance_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_v_advances_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_v_advances_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_v_kerning_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_v_kerning_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_glyph_v_origin_func = Interop.downcallHandle(
            "hb_font_funcs_set_glyph_v_origin_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_nominal_glyph_func = Interop.downcallHandle(
            "hb_font_funcs_set_nominal_glyph_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_nominal_glyphs_func = Interop.downcallHandle(
            "hb_font_funcs_set_nominal_glyphs_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_user_data = Interop.downcallHandle(
            "hb_font_funcs_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_funcs_set_variation_glyph_func = Interop.downcallHandle(
            "hb_font_funcs_set_variation_glyph_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_empty = Interop.downcallHandle(
            "hb_font_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_extents_for_direction = Interop.downcallHandle(
            "hb_font_get_extents_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_face = Interop.downcallHandle(
            "hb_font_get_face",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph = Interop.downcallHandle(
            "hb_font_get_glyph",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_advance_for_direction = Interop.downcallHandle(
            "hb_font_get_glyph_advance_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_advances_for_direction = Interop.downcallHandle(
            "hb_font_get_glyph_advances_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_contour_point = Interop.downcallHandle(
            "hb_font_get_glyph_contour_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_contour_point_for_origin = Interop.downcallHandle(
            "hb_font_get_glyph_contour_point_for_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_extents = Interop.downcallHandle(
            "hb_font_get_glyph_extents",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_extents_for_origin = Interop.downcallHandle(
            "hb_font_get_glyph_extents_for_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_from_name = Interop.downcallHandle(
            "hb_font_get_glyph_from_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_h_advance = Interop.downcallHandle(
            "hb_font_get_glyph_h_advance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_h_advances = Interop.downcallHandle(
            "hb_font_get_glyph_h_advances",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_h_kerning = Interop.downcallHandle(
            "hb_font_get_glyph_h_kerning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_h_origin = Interop.downcallHandle(
            "hb_font_get_glyph_h_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_kerning_for_direction = Interop.downcallHandle(
            "hb_font_get_glyph_kerning_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_name = Interop.downcallHandle(
            "hb_font_get_glyph_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_origin_for_direction = Interop.downcallHandle(
            "hb_font_get_glyph_origin_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_shape = Interop.downcallHandle(
            "hb_font_get_glyph_shape",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_v_advance = Interop.downcallHandle(
            "hb_font_get_glyph_v_advance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_v_advances = Interop.downcallHandle(
            "hb_font_get_glyph_v_advances",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_v_kerning = Interop.downcallHandle(
            "hb_font_get_glyph_v_kerning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_glyph_v_origin = Interop.downcallHandle(
            "hb_font_get_glyph_v_origin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_h_extents = Interop.downcallHandle(
            "hb_font_get_h_extents",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_nominal_glyph = Interop.downcallHandle(
            "hb_font_get_nominal_glyph",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_nominal_glyphs = Interop.downcallHandle(
            "hb_font_get_nominal_glyphs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_get_parent = Interop.downcallHandle(
            "hb_font_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_ppem = Interop.downcallHandle(
            "hb_font_get_ppem",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_ptem = Interop.downcallHandle(
            "hb_font_get_ptem",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_scale = Interop.downcallHandle(
            "hb_font_get_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_serial = Interop.downcallHandle(
            "hb_font_get_serial",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_synthetic_slant = Interop.downcallHandle(
            "hb_font_get_synthetic_slant",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_user_data = Interop.downcallHandle(
            "hb_font_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_v_extents = Interop.downcallHandle(
            "hb_font_get_v_extents",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_var_coords_design = Interop.downcallHandle(
            "hb_font_get_var_coords_design",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_var_coords_normalized = Interop.downcallHandle(
            "hb_font_get_var_coords_normalized",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_get_variation_glyph = Interop.downcallHandle(
            "hb_font_get_variation_glyph",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_glyph_from_string = Interop.downcallHandle(
            "hb_font_glyph_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_glyph_to_string = Interop.downcallHandle(
            "hb_font_glyph_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_is_immutable = Interop.downcallHandle(
            "hb_font_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_make_immutable = Interop.downcallHandle(
            "hb_font_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_reference = Interop.downcallHandle(
            "hb_font_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_set_face = Interop.downcallHandle(
            "hb_font_set_face",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_set_funcs = Interop.downcallHandle(
            "hb_font_set_funcs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_set_funcs_data = Interop.downcallHandle(
            "hb_font_set_funcs_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_set_parent = Interop.downcallHandle(
            "hb_font_set_parent",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_font_set_ppem = Interop.downcallHandle(
            "hb_font_set_ppem",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_ptem = Interop.downcallHandle(
            "hb_font_set_ptem",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_font_set_scale = Interop.downcallHandle(
            "hb_font_set_scale",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_synthetic_slant = Interop.downcallHandle(
            "hb_font_set_synthetic_slant",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle hb_font_set_user_data = Interop.downcallHandle(
            "hb_font_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_var_coords_design = Interop.downcallHandle(
            "hb_font_set_var_coords_design",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_var_coords_normalized = Interop.downcallHandle(
            "hb_font_set_var_coords_normalized",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_var_named_instance = Interop.downcallHandle(
            "hb_font_set_var_named_instance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_set_variations = Interop.downcallHandle(
            "hb_font_set_variations",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_font_subtract_glyph_origin_for_direction = Interop.downcallHandle(
            "hb_font_subtract_glyph_origin_for_direction",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_face_create = Interop.downcallHandle(
            "hb_ft_face_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_face_create_cached = Interop.downcallHandle(
            "hb_ft_face_create_cached",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_face_create_referenced = Interop.downcallHandle(
            "hb_ft_face_create_referenced",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_changed = Interop.downcallHandle(
            "hb_ft_font_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_create = Interop.downcallHandle(
            "hb_ft_font_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_create_referenced = Interop.downcallHandle(
            "hb_ft_font_create_referenced",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_get_face = Interop.downcallHandle(
            "hb_ft_font_get_face",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_get_load_flags = Interop.downcallHandle(
            "hb_ft_font_get_load_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_lock_face = Interop.downcallHandle(
            "hb_ft_font_lock_face",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_set_funcs = Interop.downcallHandle(
            "hb_ft_font_set_funcs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_font_set_load_flags = Interop.downcallHandle(
            "hb_ft_font_set_load_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ft_font_unlock_face = Interop.downcallHandle(
            "hb_ft_font_unlock_face",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ft_hb_font_changed = Interop.downcallHandle(
            "hb_ft_hb_font_changed",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_glib_blob_create = Interop.downcallHandle(
            "hb_glib_blob_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_glib_get_unicode_funcs = Interop.downcallHandle(
            "hb_glib_get_unicode_funcs",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_glib_script_from_script = Interop.downcallHandle(
            "hb_glib_script_from_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_glib_script_to_script = Interop.downcallHandle(
            "hb_glib_script_to_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_glyph_info_get_glyph_flags = Interop.downcallHandle(
            "hb_glyph_info_get_glyph_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_graphite2_face_get_gr_face = Interop.downcallHandle(
            "hb_graphite2_face_get_gr_face",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_graphite2_font_get_gr_font = Interop.downcallHandle(
            "hb_graphite2_font_get_gr_font",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_language_from_string = Interop.downcallHandle(
            "hb_language_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_language_get_default = Interop.downcallHandle(
            "hb_language_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_language_matches = Interop.downcallHandle(
            "hb_language_matches",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_language_to_string = Interop.downcallHandle(
            "hb_language_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_allocation_successful = Interop.downcallHandle(
            "hb_map_allocation_successful",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_clear = Interop.downcallHandle(
            "hb_map_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_copy = Interop.downcallHandle(
            "hb_map_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_create = Interop.downcallHandle(
            "hb_map_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_del = Interop.downcallHandle(
            "hb_map_del",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_map_destroy = Interop.downcallHandle(
            "hb_map_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_get = Interop.downcallHandle(
            "hb_map_get",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_map_get_empty = Interop.downcallHandle(
            "hb_map_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_get_population = Interop.downcallHandle(
            "hb_map_get_population",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_get_user_data = Interop.downcallHandle(
            "hb_map_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_has = Interop.downcallHandle(
            "hb_map_has",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_map_hash = Interop.downcallHandle(
            "hb_map_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_is_empty = Interop.downcallHandle(
            "hb_map_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_is_equal = Interop.downcallHandle(
            "hb_map_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_reference = Interop.downcallHandle(
            "hb_map_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_map_set = Interop.downcallHandle(
            "hb_map_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_map_set_user_data = Interop.downcallHandle(
            "hb_map_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_color_glyph_get_layers = Interop.downcallHandle(
            "hb_ot_color_glyph_get_layers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_glyph_reference_png = Interop.downcallHandle(
            "hb_ot_color_glyph_reference_png",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_color_glyph_reference_svg = Interop.downcallHandle(
            "hb_ot_color_glyph_reference_svg",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_color_has_layers = Interop.downcallHandle(
            "hb_ot_color_has_layers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_has_palettes = Interop.downcallHandle(
            "hb_ot_color_has_palettes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_has_png = Interop.downcallHandle(
            "hb_ot_color_has_png",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_has_svg = Interop.downcallHandle(
            "hb_ot_color_has_svg",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_palette_color_get_name_id = Interop.downcallHandle(
            "hb_ot_color_palette_color_get_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_color_palette_get_colors = Interop.downcallHandle(
            "hb_ot_color_palette_get_colors",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_palette_get_count = Interop.downcallHandle(
            "hb_ot_color_palette_get_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_color_palette_get_flags = Interop.downcallHandle(
            "hb_ot_color_palette_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_color_palette_get_name_id = Interop.downcallHandle(
            "hb_ot_color_palette_get_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_font_set_funcs = Interop.downcallHandle(
            "hb_ot_font_set_funcs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_collect_features = Interop.downcallHandle(
            "hb_ot_layout_collect_features",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_collect_lookups = Interop.downcallHandle(
            "hb_ot_layout_collect_lookups",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_feature_get_characters = Interop.downcallHandle(
            "hb_ot_layout_feature_get_characters",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_feature_get_lookups = Interop.downcallHandle(
            "hb_ot_layout_feature_get_lookups",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_feature_get_name_ids = Interop.downcallHandle(
            "hb_ot_layout_feature_get_name_ids",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_feature_with_variations_get_lookups = Interop.downcallHandle(
            "hb_ot_layout_feature_with_variations_get_lookups",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_attach_points = Interop.downcallHandle(
            "hb_ot_layout_get_attach_points",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_baseline = Interop.downcallHandle(
            "hb_ot_layout_get_baseline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_baseline_with_fallback = Interop.downcallHandle(
            "hb_ot_layout_get_baseline_with_fallback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_glyph_class = Interop.downcallHandle(
            "hb_ot_layout_get_glyph_class",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_glyphs_in_class = Interop.downcallHandle(
            "hb_ot_layout_get_glyphs_in_class",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_horizontal_baseline_tag_for_script = Interop.downcallHandle(
            "hb_ot_layout_get_horizontal_baseline_tag_for_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_ligature_carets = Interop.downcallHandle(
            "hb_ot_layout_get_ligature_carets",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_get_size_params = Interop.downcallHandle(
            "hb_ot_layout_get_size_params",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_has_glyph_classes = Interop.downcallHandle(
            "hb_ot_layout_has_glyph_classes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_has_positioning = Interop.downcallHandle(
            "hb_ot_layout_has_positioning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_has_substitution = Interop.downcallHandle(
            "hb_ot_layout_has_substitution",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_language_find_feature = Interop.downcallHandle(
            "hb_ot_layout_language_find_feature",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_language_get_feature_indexes = Interop.downcallHandle(
            "hb_ot_layout_language_get_feature_indexes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_language_get_feature_tags = Interop.downcallHandle(
            "hb_ot_layout_language_get_feature_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_language_get_required_feature = Interop.downcallHandle(
            "hb_ot_layout_language_get_required_feature",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_language_get_required_feature_index = Interop.downcallHandle(
            "hb_ot_layout_language_get_required_feature_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_lookup_collect_glyphs = Interop.downcallHandle(
            "hb_ot_layout_lookup_collect_glyphs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_lookup_get_glyph_alternates = Interop.downcallHandle(
            "hb_ot_layout_lookup_get_glyph_alternates",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_lookup_substitute_closure = Interop.downcallHandle(
            "hb_ot_layout_lookup_substitute_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_lookup_would_substitute = Interop.downcallHandle(
            "hb_ot_layout_lookup_would_substitute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_layout_lookups_substitute_closure = Interop.downcallHandle(
            "hb_ot_layout_lookups_substitute_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_script_find_language = Interop.downcallHandle(
            "hb_ot_layout_script_find_language",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_script_get_language_tags = Interop.downcallHandle(
            "hb_ot_layout_script_get_language_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_script_select_language = Interop.downcallHandle(
            "hb_ot_layout_script_select_language",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_choose_script = Interop.downcallHandle(
            "hb_ot_layout_table_choose_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_find_feature_variations = Interop.downcallHandle(
            "hb_ot_layout_table_find_feature_variations",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_find_script = Interop.downcallHandle(
            "hb_ot_layout_table_find_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_get_feature_tags = Interop.downcallHandle(
            "hb_ot_layout_table_get_feature_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_get_lookup_count = Interop.downcallHandle(
            "hb_ot_layout_table_get_lookup_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_get_script_tags = Interop.downcallHandle(
            "hb_ot_layout_table_get_script_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_layout_table_select_script = Interop.downcallHandle(
            "hb_ot_layout_table_select_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_constant = Interop.downcallHandle(
            "hb_ot_math_get_constant",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_assembly = Interop.downcallHandle(
            "hb_ot_math_get_glyph_assembly",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_italics_correction = Interop.downcallHandle(
            "hb_ot_math_get_glyph_italics_correction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_kerning = Interop.downcallHandle(
            "hb_ot_math_get_glyph_kerning",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_kernings = Interop.downcallHandle(
            "hb_ot_math_get_glyph_kernings",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_top_accent_attachment = Interop.downcallHandle(
            "hb_ot_math_get_glyph_top_accent_attachment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_glyph_variants = Interop.downcallHandle(
            "hb_ot_math_get_glyph_variants",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_math_get_min_connector_overlap = Interop.downcallHandle(
            "hb_ot_math_get_min_connector_overlap",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_math_has_data = Interop.downcallHandle(
            "hb_ot_math_has_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_math_is_glyph_extended_shape = Interop.downcallHandle(
            "hb_ot_math_is_glyph_extended_shape",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_meta_get_entry_tags = Interop.downcallHandle(
            "hb_ot_meta_get_entry_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_meta_reference_entry = Interop.downcallHandle(
            "hb_ot_meta_reference_entry",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_metrics_get_position = Interop.downcallHandle(
            "hb_ot_metrics_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_metrics_get_position_with_fallback = Interop.downcallHandle(
            "hb_ot_metrics_get_position_with_fallback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_metrics_get_variation = Interop.downcallHandle(
            "hb_ot_metrics_get_variation",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_metrics_get_x_variation = Interop.downcallHandle(
            "hb_ot_metrics_get_x_variation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_metrics_get_y_variation = Interop.downcallHandle(
            "hb_ot_metrics_get_y_variation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_name_get_utf16 = Interop.downcallHandle(
            "hb_ot_name_get_utf16",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_name_get_utf32 = Interop.downcallHandle(
            "hb_ot_name_get_utf32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_name_get_utf8 = Interop.downcallHandle(
            "hb_ot_name_get_utf8",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_name_list_names = Interop.downcallHandle(
            "hb_ot_name_list_names",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_shape_glyphs_closure = Interop.downcallHandle(
            "hb_ot_shape_glyphs_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_shape_plan_collect_lookups = Interop.downcallHandle(
            "hb_ot_shape_plan_collect_lookups",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_tag_from_language = Interop.downcallHandle(
            "hb_ot_tag_from_language",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_tag_to_language = Interop.downcallHandle(
            "hb_ot_tag_to_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_tag_to_script = Interop.downcallHandle(
            "hb_ot_tag_to_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_tags_from_script = Interop.downcallHandle(
            "hb_ot_tags_from_script",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_tags_from_script_and_language = Interop.downcallHandle(
            "hb_ot_tags_from_script_and_language",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_tags_to_script_and_language = Interop.downcallHandle(
            "hb_ot_tags_to_script_and_language",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_find_axis = Interop.downcallHandle(
            "hb_ot_var_find_axis",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_find_axis_info = Interop.downcallHandle(
            "hb_ot_var_find_axis_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_get_axes = Interop.downcallHandle(
            "hb_ot_var_get_axes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_get_axis_count = Interop.downcallHandle(
            "hb_ot_var_get_axis_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_get_axis_infos = Interop.downcallHandle(
            "hb_ot_var_get_axis_infos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_get_named_instance_count = Interop.downcallHandle(
            "hb_ot_var_get_named_instance_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_has_data = Interop.downcallHandle(
            "hb_ot_var_has_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_named_instance_get_design_coords = Interop.downcallHandle(
            "hb_ot_var_named_instance_get_design_coords",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_named_instance_get_postscript_name_id = Interop.downcallHandle(
            "hb_ot_var_named_instance_get_postscript_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_var_named_instance_get_subfamily_name_id = Interop.downcallHandle(
            "hb_ot_var_named_instance_get_subfamily_name_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_ot_var_normalize_coords = Interop.downcallHandle(
            "hb_ot_var_normalize_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_ot_var_normalize_variations = Interop.downcallHandle(
            "hb_ot_var_normalize_variations",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_script_from_iso15924_tag = Interop.downcallHandle(
            "hb_script_from_iso15924_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_script_from_string = Interop.downcallHandle(
            "hb_script_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_script_get_horizontal_direction = Interop.downcallHandle(
            "hb_script_get_horizontal_direction",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_script_to_iso15924_tag = Interop.downcallHandle(
            "hb_script_to_iso15924_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_segment_properties_equal = Interop.downcallHandle(
            "hb_segment_properties_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_segment_properties_hash = Interop.downcallHandle(
            "hb_segment_properties_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_segment_properties_overlay = Interop.downcallHandle(
            "hb_segment_properties_overlay",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_add = Interop.downcallHandle(
            "hb_set_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_add_range = Interop.downcallHandle(
            "hb_set_add_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_add_sorted_array = Interop.downcallHandle(
            "hb_set_add_sorted_array",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_allocation_successful = Interop.downcallHandle(
            "hb_set_allocation_successful",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_clear = Interop.downcallHandle(
            "hb_set_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_copy = Interop.downcallHandle(
            "hb_set_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_create = Interop.downcallHandle(
            "hb_set_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_del = Interop.downcallHandle(
            "hb_set_del",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_del_range = Interop.downcallHandle(
            "hb_set_del_range",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_destroy = Interop.downcallHandle(
            "hb_set_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_get_empty = Interop.downcallHandle(
            "hb_set_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_get_max = Interop.downcallHandle(
            "hb_set_get_max",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_get_min = Interop.downcallHandle(
            "hb_set_get_min",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_get_population = Interop.downcallHandle(
            "hb_set_get_population",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_get_user_data = Interop.downcallHandle(
            "hb_set_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_has = Interop.downcallHandle(
            "hb_set_has",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_hash = Interop.downcallHandle(
            "hb_set_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_intersect = Interop.downcallHandle(
            "hb_set_intersect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_invert = Interop.downcallHandle(
            "hb_set_invert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_is_empty = Interop.downcallHandle(
            "hb_set_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_is_equal = Interop.downcallHandle(
            "hb_set_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_is_subset = Interop.downcallHandle(
            "hb_set_is_subset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_next = Interop.downcallHandle(
            "hb_set_next",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_next_many = Interop.downcallHandle(
            "hb_set_next_many",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_next_range = Interop.downcallHandle(
            "hb_set_next_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_previous = Interop.downcallHandle(
            "hb_set_previous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_previous_range = Interop.downcallHandle(
            "hb_set_previous_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_reference = Interop.downcallHandle(
            "hb_set_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_set = Interop.downcallHandle(
            "hb_set_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_set_user_data = Interop.downcallHandle(
            "hb_set_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_set_subtract = Interop.downcallHandle(
            "hb_set_subtract",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_symmetric_difference = Interop.downcallHandle(
            "hb_set_symmetric_difference",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_set_union = Interop.downcallHandle(
            "hb_set_union",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape = Interop.downcallHandle(
            "hb_shape",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_shape_full = Interop.downcallHandle(
            "hb_shape_full",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_list_shapers = Interop.downcallHandle(
            "hb_shape_list_shapers",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle hb_shape_plan_create = Interop.downcallHandle(
            "hb_shape_plan_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_create2 = Interop.downcallHandle(
            "hb_shape_plan_create2",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_create_cached = Interop.downcallHandle(
            "hb_shape_plan_create_cached",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_create_cached2 = Interop.downcallHandle(
            "hb_shape_plan_create_cached2",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_destroy = Interop.downcallHandle(
            "hb_shape_plan_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_execute = Interop.downcallHandle(
            "hb_shape_plan_execute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_shape_plan_get_empty = Interop.downcallHandle(
            "hb_shape_plan_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_get_shaper = Interop.downcallHandle(
            "hb_shape_plan_get_shaper",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_get_user_data = Interop.downcallHandle(
            "hb_shape_plan_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_reference = Interop.downcallHandle(
            "hb_shape_plan_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_shape_plan_set_user_data = Interop.downcallHandle(
            "hb_shape_plan_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_style_get_value = Interop.downcallHandle(
            "hb_style_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_tag_from_string = Interop.downcallHandle(
            "hb_tag_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_tag_to_string = Interop.downcallHandle(
            "hb_tag_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_combining_class = Interop.downcallHandle(
            "hb_unicode_combining_class",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_unicode_compose = Interop.downcallHandle(
            "hb_unicode_compose",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_decompose = Interop.downcallHandle(
            "hb_unicode_decompose",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_decompose_compatibility = Interop.downcallHandle(
            "hb_unicode_decompose_compatibility",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_eastasian_width = Interop.downcallHandle(
            "hb_unicode_eastasian_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_create = Interop.downcallHandle(
            "hb_unicode_funcs_create",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_destroy = Interop.downcallHandle(
            "hb_unicode_funcs_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_get_default = Interop.downcallHandle(
            "hb_unicode_funcs_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_get_empty = Interop.downcallHandle(
            "hb_unicode_funcs_get_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_get_parent = Interop.downcallHandle(
            "hb_unicode_funcs_get_parent",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_get_user_data = Interop.downcallHandle(
            "hb_unicode_funcs_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_is_immutable = Interop.downcallHandle(
            "hb_unicode_funcs_is_immutable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_make_immutable = Interop.downcallHandle(
            "hb_unicode_funcs_make_immutable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_reference = Interop.downcallHandle(
            "hb_unicode_funcs_reference",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_combining_class_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_combining_class_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_compose_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_compose_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_decompose_compatibility_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_decompose_compatibility_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_decompose_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_decompose_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_eastasian_width_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_eastasian_width_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_general_category_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_general_category_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_mirroring_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_mirroring_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_script_func = Interop.downcallHandle(
            "hb_unicode_funcs_set_script_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_unicode_funcs_set_user_data = Interop.downcallHandle(
            "hb_unicode_funcs_set_user_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_unicode_general_category = Interop.downcallHandle(
            "hb_unicode_general_category",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_unicode_mirroring = Interop.downcallHandle(
            "hb_unicode_mirroring",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_unicode_script = Interop.downcallHandle(
            "hb_unicode_script",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_variation_from_string = Interop.downcallHandle(
            "hb_variation_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_variation_to_string = Interop.downcallHandle(
            "hb_variation_to_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_version = Interop.downcallHandle(
            "hb_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle hb_version_atleast = Interop.downcallHandle(
            "hb_version_atleast",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle hb_version_string = Interop.downcallHandle(
            "hb_version_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
