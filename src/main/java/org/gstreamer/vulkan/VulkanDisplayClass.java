package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDisplayClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDisplayClass";
    
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
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanDisplayClass}
     * @return A new, uninitialized @{link VulkanDisplayClass}
     */
    public static VulkanDisplayClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanDisplayClass newInstance = new VulkanDisplayClass(segment.address(), Ownership.NONE);
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
        @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.vulkan.VulkanDisplay display);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress display) {
            var RESULT = run((org.gstreamer.vulkan.VulkanDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(display)), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(display, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
        org.gstreamer.vulkan.VulkanWindow run(org.gstreamer.vulkan.VulkanDisplay display);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress display) {
            var RESULT = run((org.gstreamer.vulkan.VulkanDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(display)), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(display, Ownership.NONE));
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
     * Create a VulkanDisplayClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanDisplayClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanDisplayClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanDisplayClass(input, ownership);
    
    /**
     * A {@link VulkanDisplayClass.Builder} object constructs a {@link VulkanDisplayClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanDisplayClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanDisplayClass struct;
        
        private Builder() {
            struct = VulkanDisplayClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanDisplayClass} struct.
         * @return A new instance of {@code VulkanDisplayClass} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanDisplayClass build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.ObjectClass}
         * @param objectClass The value for the {@code objectClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
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
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
