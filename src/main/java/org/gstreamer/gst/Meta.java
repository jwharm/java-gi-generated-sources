package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Meta} structure should be included as the first member of a {@link Buffer}
 * metadata structure. The structure defines the API of the metadata and should
 * be accessible to all elements using the metadata.
 * <p>
 * A metadata API is registered with gst_meta_api_type_register() which takes a
 * name for the metadata API and some tags associated with the metadata.
 * With gst_meta_api_type_has_tag() one can check if a certain metadata API
 * contains a given tag.
 * <p>
 * Multiple implementations of a metadata API can be registered.
 * To implement a metadata API, gst_meta_register() should be used. This
 * function takes all parameters needed to create, free and transform metadata
 * along with the size of the metadata. The function returns a {@link MetaInfo}
 * structure that contains the information for the implementation of the API.
 * <p>
 * A specific implementation can be retrieved by name with gst_meta_get_info().
 * <p>
 * See {@link Buffer} for how the metadata can be added, retrieved and removed from
 * buffers.
 */
public class Meta extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("info")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Meta}
     * @return A new, uninitialized @{link Meta}
     */
    public static Meta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Meta newInstance = new Meta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.gst.MetaFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MetaFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.gst.MetaFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.gst.MetaInfo info$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void info$set(org.gstreamer.gst.MetaInfo info) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), info.handle());
    }
    
    /**
     * Create a Meta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Meta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Meta sequence number compare function. Can be used as {@link org.gtk.glib.CompareFunc}
     * or a {@link org.gtk.glib.CompareDataFunc}.
     * @param meta2 a {@link Meta}
     * @return a negative number if {@code meta1} comes before {@code meta2}, 0 if both metas
     *   have an equal sequence number, or a positive integer if {@code meta1} comes
     *   after {@code meta2}.
     */
    public int compareSeqnum(@NotNull org.gstreamer.gst.Meta meta2) {
        java.util.Objects.requireNonNull(meta2, "Parameter 'meta2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_meta_compare_seqnum.invokeExact(
                    handle(),
                    meta2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets seqnum for this meta.
     */
    public long getSeqnum() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_meta_get_seqnum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static @NotNull PointerString apiTypeGetTags(@NotNull org.gtk.glib.Type api) {
        java.util.Objects.requireNonNull(api, "Parameter 'api' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_api_type_get_tags.invokeExact(
                    api.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Check if {@code api} was registered with {@code tag}.
     * @param api an API
     * @param tag the tag to check
     * @return {@code true} if {@code api} was registered with {@code tag}.
     */
    public static boolean apiTypeHasTag(@NotNull org.gtk.glib.Type api, @NotNull org.gtk.glib.Quark tag) {
        java.util.Objects.requireNonNull(api, "Parameter 'api' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_meta_api_type_has_tag.invokeExact(
                    api.getValue().longValue(),
                    tag.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Register and return a GType for the {@code api} and associate it with
     * {@code tags}.
     * @param api an API to register
     * @param tags tags for {@code api}
     * @return a unique GType for {@code api}.
     */
    public static @NotNull org.gtk.glib.Type apiTypeRegister(@NotNull java.lang.String api, @NotNull java.lang.String[] tags) {
        java.util.Objects.requireNonNull(api, "Parameter 'api' must not be null");
        java.util.Objects.requireNonNull(tags, "Parameter 'tags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_meta_api_type_register.invokeExact(
                    Interop.allocateNativeString(api),
                    Interop.allocateNativeArray(tags, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Lookup a previously registered meta info structure by its implementation name
     * {@code impl}.
     * @param impl the name
     * @return a {@link MetaInfo} with {@code impl}, or
     * {@code null} when no such metainfo exists.
     */
    public static @Nullable org.gstreamer.gst.MetaInfo getInfo(@NotNull java.lang.String impl) {
        java.util.Objects.requireNonNull(impl, "Parameter 'impl' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_get_info.invokeExact(
                    Interop.allocateNativeString(impl));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Register a new {@link Meta} implementation.
     * <p>
     * The same {@code info} can be retrieved later with gst_meta_get_info() by using
     * {@code impl} as the key.
     * @param api the type of the {@link Meta} API
     * @param impl the name of the {@link Meta} implementation
     * @param size the size of the {@link Meta} structure
     * @param initFunc a {@link MetaInitFunction}
     * @param freeFunc a {@link MetaFreeFunction}
     * @param transformFunc a {@link MetaTransformFunction}
     * @return a {@link MetaInfo} that can be used to
     * access metadata.
     */
    public static @NotNull org.gstreamer.gst.MetaInfo register(@NotNull org.gtk.glib.Type api, @NotNull java.lang.String impl, long size, @NotNull org.gstreamer.gst.MetaInitFunction initFunc, @NotNull org.gstreamer.gst.MetaFreeFunction freeFunc, @NotNull org.gstreamer.gst.MetaTransformFunction transformFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Register a new custom {@link Meta} implementation, backed by an opaque
     * structure holding a {@link Structure}.
     * <p>
     * The registered info can be retrieved later with gst_meta_get_info() by using
     * {@code name} as the key.
     * <p>
     * The backing {@link Structure} can be retrieved with
     * gst_custom_meta_get_structure(), its mutability is conditioned by the
     * writability of the buffer the meta is attached to.
     * <p>
     * When {@code transform_func} is {@code null}, the meta and its backing {@link Structure}
     * will always be copied when the transform operation is copy, other operations
     * are discarded, copy regions are ignored.
     * @param name the name of the {@link Meta} implementation
     * @param tags tags for {@code api}
     * @param transformFunc a {@link MetaTransformFunction}
     * @return a {@link MetaInfo} that can be used to
     * access metadata.
     */
    public static @NotNull org.gstreamer.gst.MetaInfo registerCustom(@NotNull java.lang.String name, @NotNull java.lang.String[] tags, @Nullable org.gstreamer.gst.CustomMetaTransformFunction transformFunc) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(tags, "Parameter 'tags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_meta_register_custom.invokeExact(
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeArray(tags, false),
                    (Addressable) (transformFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbCustomMetaTransformFunction",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (transformFunc == null ? MemoryAddress.NULL : Interop.registerCallback(transformFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_meta_compare_seqnum = Interop.downcallHandle(
            "gst_meta_compare_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_meta_get_seqnum = Interop.downcallHandle(
            "gst_meta_get_seqnum",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_meta_api_type_get_tags = Interop.downcallHandle(
            "gst_meta_api_type_get_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_meta_api_type_has_tag = Interop.downcallHandle(
            "gst_meta_api_type_has_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_meta_api_type_register = Interop.downcallHandle(
            "gst_meta_api_type_register",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_meta_get_info = Interop.downcallHandle(
            "gst_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_meta_register = Interop.downcallHandle(
            "gst_meta_register",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_meta_register_custom = Interop.downcallHandle(
            "gst_meta_register_custom",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Meta struct;
        
         /**
         * A {@link Meta.Build} object constructs a {@link Meta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Meta.allocate();
        }
        
         /**
         * Finish building the {@link Meta} struct.
         * @return A new instance of {@code Meta} with the fields 
         *         that were set in the Build object.
         */
        public Meta construct() {
            return struct;
        }
        
        /**
         * extra flags for the metadata
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.gst.MetaFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * pointer to the {@link MetaInfo}
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gstreamer.gst.MetaInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
    }
}
