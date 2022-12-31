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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLMemoryAllocatorClass.getMemoryLayout().withName("parent_class"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
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
    protected GLMemoryEGLAllocatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLMemoryEGLAllocatorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLMemoryEGLAllocatorClass(input, ownership);
    
    /**
     * A {@link GLMemoryEGLAllocatorClass.Builder} object constructs a {@link GLMemoryEGLAllocatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLMemoryEGLAllocatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLMemoryEGLAllocatorClass struct;
        
        private Builder() {
            struct = GLMemoryEGLAllocatorClass.allocate();
        }
        
         /**
         * Finish building the {@link GLMemoryEGLAllocatorClass} struct.
         * @return A new instance of {@code GLMemoryEGLAllocatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLMemoryEGLAllocatorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gl.GLMemoryAllocatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
