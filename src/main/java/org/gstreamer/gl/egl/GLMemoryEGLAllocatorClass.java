package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link GLMemoryEGLAllocatorClass} only contains private data
 */
public class GLMemoryEGLAllocatorClass extends Struct {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLMemoryEGLAllocatorClass";
    
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
     * Allocate a new {@link GLMemoryEGLAllocatorClass}
     * @return A new, uninitialized @{link GLMemoryEGLAllocatorClass}
     */
    public static GLMemoryEGLAllocatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLMemoryEGLAllocatorClass newInstance = new GLMemoryEGLAllocatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLMemoryEGLAllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLMemoryEGLAllocatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLMemoryEGLAllocatorClass struct;
        
         /**
         * A {@link GLMemoryEGLAllocatorClass.Build} object constructs a {@link GLMemoryEGLAllocatorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLMemoryEGLAllocatorClass.allocate();
        }
        
         /**
         * Finish building the {@link GLMemoryEGLAllocatorClass} struct.
         * @return A new instance of {@code GLMemoryEGLAllocatorClass} with the fields 
         *         that were set in the Build object.
         */
        public GLMemoryEGLAllocatorClass construct() {
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
