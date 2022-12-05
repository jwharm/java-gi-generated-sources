package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanSwapper extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanSwapper";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        Interop.valueLayout.ADDRESS.withName("window"),
        Interop.valueLayout.ADDRESS.withName("queue"),
        Interop.valueLayout.ADDRESS.withName("cmd_pool"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a VulkanSwapper proxy instance for the provided memory address.
     * <p>
     * Because VulkanSwapper is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanSwapper(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanSwapper if its GType is a (or inherits from) "GstVulkanSwapper".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanSwapper} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanSwapper", a ClassCastException will be thrown.
     */
    public static VulkanSwapper castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanSwapper.getType())) {
            return new VulkanSwapper(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanSwapper");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.gstreamer.vulkan.VulkanWindow window) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_swapper_new.invokeExact(
                    device.handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanSwapper(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.gstreamer.vulkan.VulkanWindow window) {
        super(constructNew(device, window), Ownership.NONE);
    }
    
    public boolean chooseQueue(@NotNull org.gstreamer.vulkan.VulkanQueue availableQueue) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(availableQueue, "Parameter 'availableQueue' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.gst.Caps getSupportedCaps() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_swapper_get_supported_caps.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gstreamer.gst.Caps(RESULT, Ownership.FULL);
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
    
    public boolean renderBuffer(@NotNull org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    public boolean setCaps(@NotNull org.gstreamer.gst.Caps caps) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_swapper_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link VulkanSwapper.Build} object constructs a {@link VulkanSwapper} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanSwapper} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanSwapper} using {@link VulkanSwapper#castFrom}.
         * @return A new instance of {@code VulkanSwapper} with the properties 
         *         that were set in the Build object.
         */
        public VulkanSwapper construct() {
            return VulkanSwapper.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanSwapper.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setForceAspectRatio(boolean forceAspectRatio) {
            names.add("force-aspect-ratio");
            values.add(org.gtk.gobject.Value.create(forceAspectRatio));
            return this;
        }
        
        public Build setPixelAspectRatio(org.gstreamer.gst.Fraction pixelAspectRatio) {
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
}
