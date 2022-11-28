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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("api"),
        Interop.valueLayout.C_LONG.withName("type"),
        Interop.valueLayout.C_LONG.withName("size"),
        Interop.valueLayout.ADDRESS.withName("init_func"),
        Interop.valueLayout.ADDRESS.withName("free_func"),
        Interop.valueLayout.ADDRESS.withName("transform_func")
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
     * Allocate a new {@link MetaInfo}
     * @return A new, uninitialized @{link MetaInfo}
     */
    public static MetaInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MetaInfo newInstance = new MetaInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code api}
     * @return The value of the field {@code api}
     */
    public org.gtk.glib.Type api$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("api"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code api}
     * @param api The new value of the field {@code api}
     */
    public void api$set(org.gtk.glib.Type api) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("api"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), api.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gtk.glib.Type type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gtk.glib.Type type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long size$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void size$set(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code init_func}
     * @return The value of the field {@code init_func}
     */
    public org.gstreamer.gst.MetaInitFunction initFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("init_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code free_func}
     * @return The value of the field {@code free_func}
     */
    public org.gstreamer.gst.MetaFreeFunction freeFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code transform_func}
     * @return The value of the field {@code transform_func}
     */
    public org.gstreamer.gst.MetaTransformFunction transformFunc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_func"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a MetaInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MetaInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public boolean isCustom() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_meta_info_is_custom.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_meta_info_is_custom = Interop.downcallHandle(
            "gst_meta_info_is_custom",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MetaInfo struct;
        
         /**
         * A {@link MetaInfo.Build} object constructs a {@link MetaInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MetaInfo.allocate();
        }
        
         /**
         * Finish building the {@link MetaInfo} struct.
         * @return A new instance of {@code MetaInfo} with the fields 
         *         that were set in the Build object.
         */
        public MetaInfo construct() {
            return struct;
        }
        
        /**
         * tag identifying the metadata structure and api
         * @param api The value for the {@code api} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setApi(org.gtk.glib.Type api) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("api"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (api == null ? MemoryAddress.NULL : api.getValue().longValue()));
            return this;
        }
        
        /**
         * type identifying the implementor of the api
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gtk.glib.Type type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue().longValue()));
            return this;
        }
        
        /**
         * size of the metadata
         * @param size The value for the {@code size} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
            return this;
        }
        
        /**
         * function for initializing the metadata
         * @param initFunc The value for the {@code initFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInitFunc(java.lang.foreign.MemoryAddress initFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("init_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (initFunc == null ? MemoryAddress.NULL : initFunc));
            return this;
        }
        
        /**
         * function for freeing the metadata
         * @param freeFunc The value for the {@code freeFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFreeFunc(java.lang.foreign.MemoryAddress freeFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeFunc == null ? MemoryAddress.NULL : freeFunc));
            return this;
        }
        
        /**
         * function for transforming the metadata
         * @param transformFunc The value for the {@code transformFunc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransformFunc(java.lang.foreign.MemoryAddress transformFunc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFunc == null ? MemoryAddress.NULL : transformFunc));
            return this;
        }
    }
}
