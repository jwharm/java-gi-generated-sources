package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanWindowClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanWindowClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("get_surface"),
            Interop.valueLayout.ADDRESS.withName("get_presentation_support"),
            Interop.valueLayout.ADDRESS.withName("set_window_handle"),
            Interop.valueLayout.ADDRESS.withName("get_surface_dimensions"),
            Interop.valueLayout.ADDRESS.withName("handle_events"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanWindowClass}
     * @return A new, uninitialized @{link VulkanWindowClass}
     */
    public static VulkanWindowClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanWindowClass newInstance = new VulkanWindowClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.vulkan.VulkanWindow window);

        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        void run(org.gstreamer.vulkan.VulkanWindow window);

        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSurfaceCallback {
        org.vulkan.SurfaceKHR run(org.gstreamer.vulkan.VulkanWindow window);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSurfaceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surface}
     * @param getSurface The new value of the field {@code get_surface}
     */
    public void setGetSurface(GetSurfaceCallback getSurface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_surface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurface == null ? MemoryAddress.NULL : getSurface.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPresentationSupportCallback {
        boolean run(org.gstreamer.vulkan.VulkanWindow window, org.gstreamer.vulkan.VulkanDevice device, int queueFamilyIdx);

        @ApiStatus.Internal default int upcall(MemoryAddress window, MemoryAddress device, int queueFamilyIdx) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE), (org.gstreamer.vulkan.VulkanDevice) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(device, Ownership.NONE), queueFamilyIdx);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPresentationSupportCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_presentation_support}
     * @param getPresentationSupport The new value of the field {@code get_presentation_support}
     */
    public void setGetPresentationSupport(GetPresentationSupportCallback getPresentationSupport) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_presentation_support"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresentationSupport == null ? MemoryAddress.NULL : getPresentationSupport.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetWindowHandleCallback {
        void run(org.gstreamer.vulkan.VulkanWindow window, long handle);

        @ApiStatus.Internal default void upcall(MemoryAddress window, long handle) {
            run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE), handle);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetWindowHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_window_handle}
     * @param setWindowHandle The new value of the field {@code set_window_handle}
     */
    public void setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSurfaceDimensionsCallback {
        void run(org.gstreamer.vulkan.VulkanWindow window, PointerInteger width, PointerInteger height);

        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress width, MemoryAddress height) {
            run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE), new PointerInteger(width), new PointerInteger(height));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSurfaceDimensionsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surface_dimensions}
     * @param getSurfaceDimensions The new value of the field {@code get_surface_dimensions}
     */
    public void setGetSurfaceDimensions(GetSurfaceDimensionsCallback getSurfaceDimensions) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_surface_dimensions"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurfaceDimensions == null ? MemoryAddress.NULL : getSurfaceDimensions.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleEventsCallback {
        void run(org.gstreamer.vulkan.VulkanWindow window, boolean handleEvents);

        @ApiStatus.Internal default void upcall(MemoryAddress window, int handleEvents) {
            run((org.gstreamer.vulkan.VulkanWindow) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(window)), org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, Ownership.NONE), Marshal.integerToBoolean.marshal(handleEvents, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleEventsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_events}
     * @param handleEvents The new value of the field {@code handle_events}
     */
    public void setHandleEvents(HandleEventsCallback handleEvents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
    }
    
    /**
     * Create a VulkanWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanWindowClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanWindowClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanWindowClass(input, ownership);
    
    /**
     * A {@link VulkanWindowClass.Builder} object constructs a {@link VulkanWindowClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanWindowClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanWindowClass struct;
        
        private Builder() {
            struct = VulkanWindowClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanWindowClass} struct.
         * @return A new instance of {@code VulkanWindowClass} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanWindowClass build() {
            return struct;
        }
        
        /**
         * Parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setGetSurface(GetSurfaceCallback getSurface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurface == null ? MemoryAddress.NULL : getSurface.toCallback()));
            return this;
        }
        
        public Builder setGetPresentationSupport(GetPresentationSupportCallback getPresentationSupport) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_presentation_support"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresentationSupport == null ? MemoryAddress.NULL : getPresentationSupport.toCallback()));
            return this;
        }
        
        public Builder setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
            return this;
        }
        
        public Builder setGetSurfaceDimensions(GetSurfaceDimensionsCallback getSurfaceDimensions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface_dimensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurfaceDimensions == null ? MemoryAddress.NULL : getSurfaceDimensions.toCallback()));
            return this;
        }
        
        public Builder setHandleEvents(HandleEventsCallback handleEvents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
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
