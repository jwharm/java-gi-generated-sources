package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLDisplayEGLClass extends Struct {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayEGLClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gl.GLDisplayClass.getMemoryLayout().withName("object_class"),
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
     * Allocate a new {@link GLDisplayEGLClass}
     * @return A new, uninitialized @{link GLDisplayEGLClass}
     */
    public static GLDisplayEGLClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLDisplayEGLClass newInstance = new GLDisplayEGLClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gl.GLDisplayClass objectClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return new org.gstreamer.gl.GLDisplayClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a GLDisplayEGLClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLDisplayEGLClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLDisplayEGLClass struct;
        
         /**
         * A {@link GLDisplayEGLClass.Build} object constructs a {@link GLDisplayEGLClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLDisplayEGLClass.allocate();
        }
        
         /**
         * Finish building the {@link GLDisplayEGLClass} struct.
         * @return A new instance of {@code GLDisplayEGLClass} with the fields 
         *         that were set in the Build object.
         */
        public GLDisplayEGLClass construct() {
            return struct;
        }
        
        public Build setObjectClass(org.gstreamer.gl.GLDisplayClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
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
