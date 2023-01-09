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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanWindowClass newInstance = new VulkanWindowClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OpenCallback} callback.
     */
    @FunctionalInterface
    public interface OpenCallback {
    
        boolean run(org.gstreamer.vulkan.VulkanWindow window);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseCallback} callback.
     */
    @FunctionalInterface
    public interface CloseCallback {
    
        void run(org.gstreamer.vulkan.VulkanWindow window);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window) {
            run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSurfaceCallback} callback.
     */
    @FunctionalInterface
    public interface GetSurfaceCallback {
    
        org.vulkan.SurfaceKHR run(org.gstreamer.vulkan.VulkanWindow window);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress window) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSurfaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surface}
     * @param getSurface The new value of the field {@code get_surface}
     */
    public void setGetSurface(GetSurfaceCallback getSurface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurface == null ? MemoryAddress.NULL : getSurface.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPresentationSupportCallback} callback.
     */
    @FunctionalInterface
    public interface GetPresentationSupportCallback {
    
        boolean run(org.gstreamer.vulkan.VulkanWindow window, org.gstreamer.vulkan.VulkanDevice device, int queueFamilyIdx);
        
        @ApiStatus.Internal default int upcall(MemoryAddress window, MemoryAddress device, int queueFamilyIdx) {
            var RESULT = run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null), (org.gstreamer.vulkan.VulkanDevice) Interop.register(device, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(device, null), queueFamilyIdx);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPresentationSupportCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_presentation_support}
     * @param getPresentationSupport The new value of the field {@code get_presentation_support}
     */
    public void setGetPresentationSupport(GetPresentationSupportCallback getPresentationSupport) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_presentation_support"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPresentationSupport == null ? MemoryAddress.NULL : getPresentationSupport.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetWindowHandleCallback} callback.
     */
    @FunctionalInterface
    public interface SetWindowHandleCallback {
    
        void run(org.gstreamer.vulkan.VulkanWindow window, long handle);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, long handle) {
            run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null), handle);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetWindowHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_window_handle}
     * @param setWindowHandle The new value of the field {@code set_window_handle}
     */
    public void setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSurfaceDimensionsCallback} callback.
     */
    @FunctionalInterface
    public interface GetSurfaceDimensionsCallback {
    
        void run(org.gstreamer.vulkan.VulkanWindow window, PointerInteger width, PointerInteger height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, MemoryAddress width, MemoryAddress height) {
            run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null), new PointerInteger(width), new PointerInteger(height));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSurfaceDimensionsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_surface_dimensions}
     * @param getSurfaceDimensions The new value of the field {@code get_surface_dimensions}
     */
    public void setGetSurfaceDimensions(GetSurfaceDimensionsCallback getSurfaceDimensions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surface_dimensions"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurfaceDimensions == null ? MemoryAddress.NULL : getSurfaceDimensions.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleEventsCallback} callback.
     */
    @FunctionalInterface
    public interface HandleEventsCallback {
    
        void run(org.gstreamer.vulkan.VulkanWindow window, boolean handleEvents);
        
        @ApiStatus.Internal default void upcall(MemoryAddress window, int handleEvents) {
            run((org.gstreamer.vulkan.VulkanWindow) Interop.register(window, org.gstreamer.vulkan.VulkanWindow.fromAddress).marshal(window, null), Marshal.integerToBoolean.marshal(handleEvents, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleEventsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_events}
     * @param handleEvents The new value of the field {@code handle_events}
     */
    public void setHandleEvents(HandleEventsCallback handleEvents) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
        }
    }
    
    /**
     * Create a VulkanWindowClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanWindowClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanWindowClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanWindowClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setOpen(OpenCallback open) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
                return this;
            }
        }
        
        public Builder setClose(CloseCallback close) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSurface(GetSurfaceCallback getSurface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_surface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurface == null ? MemoryAddress.NULL : getSurface.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPresentationSupport(GetPresentationSupportCallback getPresentationSupport) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_presentation_support"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPresentationSupport == null ? MemoryAddress.NULL : getPresentationSupport.toCallback()));
                return this;
            }
        }
        
        public Builder setSetWindowHandle(SetWindowHandleCallback setWindowHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_window_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setWindowHandle == null ? MemoryAddress.NULL : setWindowHandle.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSurfaceDimensions(GetSurfaceDimensionsCallback getSurfaceDimensions) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_surface_dimensions"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSurfaceDimensions == null ? MemoryAddress.NULL : getSurfaceDimensions.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleEvents(HandleEventsCallback handleEvents) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_events"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvents == null ? MemoryAddress.NULL : handleEvents.toCallback()));
                return this;
            }
        }
        
        public Builder setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false, SCOPE)));
                return this;
            }
        }
    }
}
