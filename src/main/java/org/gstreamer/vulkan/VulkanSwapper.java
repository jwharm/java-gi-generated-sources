package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanSwapper extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanSwapper";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            Interop.valueLayout.ADDRESS.withName("window"),
            Interop.valueLayout.ADDRESS.withName("queue"),
            Interop.valueLayout.ADDRESS.withName("cmd_pool"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanSwapper proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanSwapper(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanSwapper> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanSwapper(input);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanWindow window) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_swapper_new.invokeExact(
                    device.handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanSwapper(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanWindow window) {
        super(constructNew(device, window));
        this.refSink();
        this.takeOwnership();
    }
    
    public boolean chooseQueue(org.gstreamer.vulkan.VulkanQueue availableQueue) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_swapper_choose_queue.invokeExact(
                        handle(),
                        availableQueue.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public org.gstreamer.gst.Caps getSupportedCaps() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_swapper_get_supported_caps.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public void getSurfaceRectangles(@Nullable org.gstreamer.video.VideoRectangle inputImage, @Nullable org.gstreamer.video.VideoRectangle surfaceLocation, @Nullable org.gstreamer.video.VideoRectangle displayRect) {
        try {
            DowncallHandles.gst_vulkan_swapper_get_surface_rectangles.invokeExact(
                    handle(),
                    (Addressable) (inputImage == null ? MemoryAddress.NULL : inputImage.handle()),
                    (Addressable) (surfaceLocation == null ? MemoryAddress.NULL : surfaceLocation.handle()),
                    (Addressable) (displayRect == null ? MemoryAddress.NULL : displayRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public boolean renderBuffer(org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_swapper_render_buffer.invokeExact(
                        handle(),
                        buffer.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public boolean setCaps(org.gstreamer.gst.Caps caps) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_swapper_set_caps.invokeExact(
                        handle(),
                        caps.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_swapper_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanSwapper.Builder} object constructs a {@link VulkanSwapper} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanSwapper.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanSwapper} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanSwapper}.
         * @return A new instance of {@code VulkanSwapper} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanSwapper build() {
            return (VulkanSwapper) org.gtk.gobject.GObject.newWithProperties(
                VulkanSwapper.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setForceAspectRatio(boolean forceAspectRatio) {
            names.add("force-aspect-ratio");
            values.add(org.gtk.gobject.Value.create(forceAspectRatio));
            return this;
        }
        
        public Builder setPixelAspectRatio(org.gstreamer.gst.Fraction pixelAspectRatio) {
            names.add("pixel-aspect-ratio");
            values.add(org.gtk.gobject.Value.create(pixelAspectRatio));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_swapper_new = Interop.downcallHandle(
                "gst_vulkan_swapper_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_choose_queue = Interop.downcallHandle(
                "gst_vulkan_swapper_choose_queue",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_get_supported_caps = Interop.downcallHandle(
                "gst_vulkan_swapper_get_supported_caps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_get_surface_rectangles = Interop.downcallHandle(
                "gst_vulkan_swapper_get_surface_rectangles",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_render_buffer = Interop.downcallHandle(
                "gst_vulkan_swapper_render_buffer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_set_caps = Interop.downcallHandle(
                "gst_vulkan_swapper_set_caps",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_swapper_get_type = Interop.downcallHandle(
                "gst_vulkan_swapper_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_vulkan_swapper_get_type != null;
    }
}
