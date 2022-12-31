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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gl.GLDisplayClass.getMemoryLayout().withName("object_class"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
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
    public org.gstreamer.gl.GLDisplayClass getObjectClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return org.gstreamer.gl.GLDisplayClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object_class}
     * @param objectClass The new value of the field {@code object_class}
     */
    public void setObjectClass(org.gstreamer.gl.GLDisplayClass objectClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
    }
    
    /**
     * Get the value of the field {@code _padding}
     * @return The value of the field {@code _padding}
     */
    public java.lang.foreign.MemoryAddress[] getPadding() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getAddressArrayFrom(RESULT, 4);
    }
    
    /**
     * Change the value of the field {@code _padding}
     * @param Padding The new value of the field {@code _padding}
     */
    public void setPadding(java.lang.foreign.MemoryAddress[] Padding) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
    }
    
    /**
     * Create a GLDisplayEGLClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplayEGLClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayEGLClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayEGLClass(input, ownership);
    
    /**
     * A {@link GLDisplayEGLClass.Builder} object constructs a {@link GLDisplayEGLClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLDisplayEGLClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLDisplayEGLClass struct;
        
        private Builder() {
            struct = GLDisplayEGLClass.allocate();
        }
        
         /**
         * Finish building the {@link GLDisplayEGLClass} struct.
         * @return A new instance of {@code GLDisplayEGLClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLDisplayEGLClass build() {
            return struct;
        }
        
        public Builder setObjectClass(org.gstreamer.gl.GLDisplayClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
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
