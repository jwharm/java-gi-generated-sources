package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLBaseMemoryAllocatorClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLBaseMemoryAllocatorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.AllocatorClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("alloc"),
        Interop.valueLayout.ADDRESS.withName("create"),
        Interop.valueLayout.ADDRESS.withName("map"),
        Interop.valueLayout.ADDRESS.withName("unmap"),
        Interop.valueLayout.ADDRESS.withName("copy"),
        Interop.valueLayout.ADDRESS.withName("destroy"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link GLBaseMemoryAllocatorClass}
     * @return A new, uninitialized @{link GLBaseMemoryAllocatorClass}
     */
    public static GLBaseMemoryAllocatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLBaseMemoryAllocatorClass newInstance = new GLBaseMemoryAllocatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.AllocatorClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.AllocatorClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code alloc}
     * @return The value of the field {@code alloc}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorAllocFunction alloc$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code create}
     * @return The value of the field {@code create}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorCreateFunction create$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code map}
     * @return The value of the field {@code map}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorMapFunction map$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code unmap}
     * @return The value of the field {@code unmap}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorUnmapFunction unmap$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code copy}
     * @return The value of the field {@code copy}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorCopyFunction copy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("copy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code destroy}
     * @return The value of the field {@code destroy}
     */
    public org.gstreamer.gl.GLBaseMemoryAllocatorDestroyFunction destroy$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Create a GLBaseMemoryAllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLBaseMemoryAllocatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLBaseMemoryAllocatorClass struct;
        
         /**
         * A {@link GLBaseMemoryAllocatorClass.Build} object constructs a {@link GLBaseMemoryAllocatorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLBaseMemoryAllocatorClass.allocate();
        }
        
         /**
         * Finish building the {@link GLBaseMemoryAllocatorClass} struct.
         * @return A new instance of {@code GLBaseMemoryAllocatorClass} with the fields 
         *         that were set in the Build object.
         */
        public GLBaseMemoryAllocatorClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.AllocatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorAllocFunction}
         * @param alloc The value for the {@code alloc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlloc(java.lang.foreign.MemoryAddress alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorCreateFunction}
         * @param create The value for the {@code create} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCreate(java.lang.foreign.MemoryAddress create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorMapFunction}
         * @param map The value for the {@code map} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMap(java.lang.foreign.MemoryAddress map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : map));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorUnmapFunction}
         * @param unmap The value for the {@code unmap} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUnmap(java.lang.foreign.MemoryAddress unmap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorCopyFunction}
         * @param copy The value for the {@code copy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        /**
         * a {@link GLBaseMemoryAllocatorDestroyFunction}
         * @param destroy The value for the {@code destroy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDestroy(java.lang.foreign.MemoryAddress destroy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("destroy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (destroy == null ? MemoryAddress.NULL : destroy));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
