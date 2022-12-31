package org.gstreamer.gl.x11;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLDisplayX11Class extends Struct {
    
    static {
        GstGLX11.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayX11Class";
    
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
     * Allocate a new {@link GLDisplayX11Class}
     * @return A new, uninitialized @{link GLDisplayX11Class}
     */
    public static GLDisplayX11Class allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLDisplayX11Class newInstance = new GLDisplayX11Class(segment.address(), Ownership.NONE);
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
     * Create a GLDisplayX11Class proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplayX11Class(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayX11Class> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayX11Class(input, ownership);
    
    /**
     * A {@link GLDisplayX11Class.Builder} object constructs a {@link GLDisplayX11Class} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLDisplayX11Class.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLDisplayX11Class struct;
        
        private Builder() {
            struct = GLDisplayX11Class.allocate();
        }
        
         /**
         * Finish building the {@link GLDisplayX11Class} struct.
         * @return A new instance of {@code GLDisplayX11Class} with the fields 
         *         that were set in the Builder object.
         */
        public GLDisplayX11Class build() {
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
