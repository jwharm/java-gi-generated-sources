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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    /**
     * Create a VulkanVideoFilter proxy instance for the provided memory address.
     * <p>
     * Because VulkanVideoFilter is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanVideoFilter(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanVideoFilter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanVideoFilter(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_video_filter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanVideoFilter.Builder} object constructs a {@link VulkanVideoFilter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanVideoFilter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseTransform.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanVideoFilter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanVideoFilter}.
         * @return A new instance of {@code VulkanVideoFilter} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanVideoFilter build() {
            return (VulkanVideoFilter) org.gtk.gobject.GObject.newWithProperties(
                VulkanVideoFilter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
