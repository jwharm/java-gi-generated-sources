package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLDisplayClass extends Struct {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("object_class"),
            Interop.valueLayout.ADDRESS.withName("get_handle"),
            Interop.valueLayout.ADDRESS.withName("create_window"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link GLDisplayClass}
     * @return A new, uninitialized @{link GLDisplayClass}
     */
    public static GLDisplayClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLDisplayClass newInstance = new GLDisplayClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gst.ObjectClass getObjectClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object_class}
     * @param objectClass The new value of the field {@code object_class}
     */
    public void setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetHandleCallback {
        long run(org.gstreamer.gl.GLDisplay display);

        @ApiStatus.Internal default long upcall(MemoryAddress display) {
            var RESULT = run((org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(display)), org.gstreamer.gl.GLDisplay.fromAddress).marshal(display, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_handle}
     * @param getHandle The new value of the field {@code get_handle}
     */
    public void setGetHandle(GetHandleCallback getHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getHandle == null ? MemoryAddress.NULL : getHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateWindowCallback {
        org.gstreamer.gl.GLWindow run(org.gstreamer.gl.GLDisplay display);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress display) {
            var RESULT = run((org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(display)), org.gstreamer.gl.GLDisplay.fromAddress).marshal(display, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateWindowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_window}
     * @param createWindow The new value of the field {@code create_window}
     */
    public void setCreateWindow(CreateWindowCallback createWindow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_window"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createWindow == null ? MemoryAddress.NULL : createWindow.toCallback()));
    }
    
    /**
     * Create a GLDisplayClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GLDisplayClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLDisplayClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GLDisplayClass(input, ownership);
    
    /**
     * A {@link GLDisplayClass.Builder} object constructs a {@link GLDisplayClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link GLDisplayClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final GLDisplayClass struct;
        
        private Builder() {
            struct = GLDisplayClass.allocate();
        }
        
         /**
         * Finish building the {@link GLDisplayClass} struct.
         * @return A new instance of {@code GLDisplayClass} with the fields 
         *         that were set in the Builder object.
         */
        public GLDisplayClass build() {
            return struct;
        }
        
        public Builder setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
            return this;
        }
        
        public Builder setGetHandle(GetHandleCallback getHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getHandle == null ? MemoryAddress.NULL : getHandle.toCallback()));
            return this;
        }
        
        public Builder setCreateWindow(CreateWindowCallback createWindow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_window"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createWindow == null ? MemoryAddress.NULL : createWindow.toCallback()));
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
