package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanVideoFilter extends org.gstreamer.base.BaseTransform {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanVideoFilter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.BaseTransform.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("instance"),
        Interop.valueLayout.ADDRESS.withName("device"),
        Interop.valueLayout.ADDRESS.withName("queue"),
        Interop.valueLayout.ADDRESS.withName("in_caps"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
        Interop.valueLayout.ADDRESS.withName("out_caps"),
        org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
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
     * Create a VulkanVideoFilter proxy instance for the provided memory address.
     * <p>
     * Because VulkanVideoFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanVideoFilter(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanVideoFilter if its GType is a (or inherits from) "GstVulkanVideoFilter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanVideoFilter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanVideoFilter", a ClassCastException will be thrown.
     */
    public static VulkanVideoFilter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanVideoFilter.getType())) {
            return new VulkanVideoFilter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanVideoFilter");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_video_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.BaseTransform.Build {
        
         /**
         * A {@link VulkanVideoFilter.Build} object constructs a {@link VulkanVideoFilter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanVideoFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanVideoFilter} using {@link VulkanVideoFilter#castFrom}.
         * @return A new instance of {@code VulkanVideoFilter} with the properties 
         *         that were set in the Build object.
         */
        public VulkanVideoFilter construct() {
            return VulkanVideoFilter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanVideoFilter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_video_filter_get_type = Interop.downcallHandle(
            "gst_vulkan_video_filter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
