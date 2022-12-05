package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Only contains private data
 */
public class GLMemoryPBOAllocatorClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryPBOAllocatorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLMemoryAllocatorClass.getMemoryLayout().withName("parent_class"),
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
     * Allocate a new {@link GLMemoryPBOAllocatorClass}
     * @return A new, uninitialized @{link GLMemoryPBOAllocatorClass}
     */
    public static GLMemoryPBOAllocatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLMemoryPBOAllocatorClass newInstance = new GLMemoryPBOAllocatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gl.GLMemoryAllocatorClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gl.GLMemoryAllocatorClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GLMemoryPBOAllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLMemoryPBOAllocatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLMemoryPBOAllocatorClass struct;
        
         /**
         * A {@link GLMemoryPBOAllocatorClass.Build} object constructs a {@link GLMemoryPBOAllocatorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLMemoryPBOAllocatorClass.allocate();
        }
        
         /**
         * Finish building the {@link GLMemoryPBOAllocatorClass} struct.
         * @return A new instance of {@code GLMemoryPBOAllocatorClass} with the fields 
         *         that were set in the Build object.
         */
        public GLMemoryPBOAllocatorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gl.GLMemoryAllocatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
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
