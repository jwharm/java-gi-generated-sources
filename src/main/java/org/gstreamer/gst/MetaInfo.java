package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link MetaInfo} provides information about a specific metadata
 * structure.
 */
public class MetaInfo extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMetaInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("api"),
            Interop.valueLayout.C_LONG.withName("type"),
            Interop.valueLayout.C_LONG.withName("size"),
            Interop.valueLayout.ADDRESS.withName("init_func"),
            Interop.valueLayout.ADDRESS.withName("free_func"),
            Interop.valueLayout.ADDRESS.withName("transform_func")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MetaInfo}
     * @return A new, uninitialized @{link MetaInfo}
     */
    public static MetaInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MetaInfo newInstance = new MetaInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code api}
     * @return The value of the field {@code api}
     */
    public org.gtk.glib.Type getApi() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("api"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code api}
     * @param api The new value of the field {@code api}
     */
    public void setApi(org.gtk.glib.Type api) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("api"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (api == null ? MemoryAddress.NULL : api.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gtk.glib.Type type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long getSize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), size);
        }
    }
    
    /**
     * Get the value of the field {@code init_func}
     * @return The value of the field {@code init_func}
     */
    public org.gstreamer.gst.MetaInitFunction getInitFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code init_func}
     * @param initFunc The new value of the field {@code init_func}
     */
    public void setInitFunc(org.gstreamer.gst.MetaInitFunction initFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (initFunc == null ? MemoryAddress.NULL : (Addressable) initFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code free_func}
     * @return The value of the field {@code free_func}
     */
    public org.gstreamer.gst.MetaFreeFunction getFreeFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code free_func}
     * @param freeFunc The new value of the field {@code free_func}
     */
    public void setFreeFunc(org.gstreamer.gst.MetaFreeFunction freeFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeFunc == null ? MemoryAddress.NULL : (Addressable) freeFunc.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code transform_func}
     * @return The value of the field {@code transform_func}
     */
    public org.gstreamer.gst.MetaTransformFunction getTransformFunc() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_func"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code transform_func}
     * @param transformFunc The new value of the field {@code transform_func}
     */
    public void setTransformFunc(org.gstreamer.gst.MetaTransformFunction transformFunc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformFunc == null ? MemoryAddress.NULL : (Addressable) transformFunc.toCallback()));
        }
    }
    
    /**
     * Create a MetaInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MetaInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MetaInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MetaInfo(input);
    
    public boolean isCustom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_meta_info_is_custom.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_meta_info_is_custom = Interop.downcallHandle(
                "gst_meta_info_is_custom",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link MetaInfo.Builder} object constructs a {@link MetaInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MetaInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MetaInfo struct;
        
        private Builder() {
            struct = MetaInfo.allocate();
        }
        
        /**
         * Finish building the {@link MetaInfo} struct.
         * @return A new instance of {@code MetaInfo} with the fields 
         *         that were set in the Builder object.
         */
        public MetaInfo build() {
            return struct;
        }
        
        /**
         * tag identifying the metadata structure and api
         * @param api The value for the {@code api} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setApi(org.gtk.glib.Type api) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("api"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (api == null ? MemoryAddress.NULL : api.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * type identifying the implementor of the api
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gtk.glib.Type type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * size of the metadata
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(long size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), size);
                return this;
            }
        }
        
        /**
         * function for initializing the metadata
         * @param initFunc The value for the {@code initFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInitFunc(org.gstreamer.gst.MetaInitFunction initFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("init_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (initFunc == null ? MemoryAddress.NULL : (Addressable) initFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * function for freeing the metadata
         * @param freeFunc The value for the {@code freeFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFreeFunc(org.gstreamer.gst.MetaFreeFunction freeFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeFunc == null ? MemoryAddress.NULL : (Addressable) freeFunc.toCallback()));
                return this;
            }
        }
        
        /**
         * function for transforming the metadata
         * @param transformFunc The value for the {@code transformFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransformFunc(org.gstreamer.gst.MetaTransformFunction transformFunc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_func"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformFunc == null ? MemoryAddress.NULL : (Addressable) transformFunc.toCallback()));
                return this;
            }
        }
    }
}
