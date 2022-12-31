package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanFullScreenQuad extends org.gstreamer.gst.GstObject {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFullScreenQuad";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("out_info"),
            org.gstreamer.video.VideoInfo.getMemoryLayout().withName("in_info"),
            Interop.valueLayout.ADDRESS.withName("queue"),
            Interop.valueLayout.ADDRESS.withName("render_pass"),
            Interop.valueLayout.ADDRESS.withName("pipeline_layout"),
            Interop.valueLayout.ADDRESS.withName("graphics_pipeline"),
            Interop.valueLayout.ADDRESS.withName("descriptor_set_layout"),
            Interop.valueLayout.ADDRESS.withName("descriptor_cache"),
            Interop.valueLayout.ADDRESS.withName("descriptor_set"),
            Interop.valueLayout.ADDRESS.withName("framebuffer"),
            Interop.valueLayout.ADDRESS.withName("sampler"),
            Interop.valueLayout.ADDRESS.withName("cmd_pool"),
            Interop.valueLayout.ADDRESS.withName("trash_list"),
            Interop.valueLayout.ADDRESS.withName("last_fence"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VulkanFullScreenQuad proxy instance for the provided memory address.
     * <p>
     * Because VulkanFullScreenQuad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanFullScreenQuad(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, VulkanFullScreenQuad> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanFullScreenQuad(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanQueue queue) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_full_screen_quad_new.invokeExact(
                    queue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanFullScreenQuad(org.gstreamer.vulkan.VulkanQueue queue) {
        super(constructNew(queue), Ownership.FULL);
    }
    
    /**
     * Helper function for creation and submission of a command buffer that draws
     * a full screen quad.  If you need to add other things to the command buffer,
     * create the command buffer manually and call
     * gst_vulkan_full_screen_quad_prepare_draw(),
     * gst_vulkan_full_screen_quad_fill_command_buffer() and
     * gst_vulkan_full_screen_quad_submit() instead.
     * @return whether the draw was successful
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean draw() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_draw.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean fillCommandBuffer(org.gstreamer.vulkan.VulkanCommandBuffer cmd, org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_fill_command_buffer.invokeExact(
                    handle(),
                    cmd.handle(),
                    fence.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public org.gstreamer.vulkan.VulkanFence getLastFence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_full_screen_quad_get_last_fence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.vulkan.VulkanFence.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public boolean prepareDraw(org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_prepare_draw.invokeExact(
                    handle(),
                    fence.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * See also gst_vulkan_full_screen_quad_set_vertex_buffer()
     * @param indices the index data.  Must be a {@link VulkanBufferMemory}
     * @param nIndices number of indices in {@code indices}
     * @return whether the index data could be set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setIndexBuffer(org.gstreamer.gst.Memory indices, long nIndices) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_index_buffer.invokeExact(
                    handle(),
                    indices.handle(),
                    nIndices,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean setInfo(org.gstreamer.video.VideoInfo inInfo, org.gstreamer.video.VideoInfo outInfo) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_info.invokeExact(
                    handle(),
                    inInfo.handle(),
                    outInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean setInputBuffer(org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_input_buffer.invokeExact(
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
    
    public boolean setOutputBuffer(org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_output_buffer.invokeExact(
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
    
    public boolean setShaders(org.gstreamer.vulkan.VulkanHandle vert, org.gstreamer.vulkan.VulkanHandle frag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_shaders.invokeExact(
                    handle(),
                    vert.handle(),
                    frag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean setUniformBuffer(org.gstreamer.gst.Memory uniforms) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_uniform_buffer.invokeExact(
                    handle(),
                    uniforms.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean setVertexBuffer(org.gstreamer.gst.Memory vertices) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_vertex_buffer.invokeExact(
                    handle(),
                    vertices.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean submit(org.gstreamer.vulkan.VulkanCommandBuffer cmd, org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_submit.invokeExact(
                    handle(),
                    cmd.handle(),
                    fence.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        cmd.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_full_screen_quad_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link VulkanFullScreenQuad.Builder} object constructs a {@link VulkanFullScreenQuad} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link VulkanFullScreenQuad.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link VulkanFullScreenQuad} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanFullScreenQuad}.
         * @return A new instance of {@code VulkanFullScreenQuad} with the properties 
         *         that were set in the Builder object.
         */
        public VulkanFullScreenQuad build() {
            return (VulkanFullScreenQuad) org.gtk.gobject.GObject.newWithProperties(
                VulkanFullScreenQuad.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_full_screen_quad_new = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_draw = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_draw",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_fill_command_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_fill_command_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_get_last_fence = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_get_last_fence",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_prepare_draw = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_prepare_draw",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_index_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_index_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_info = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_input_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_input_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_output_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_output_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_shaders = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_shaders",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_uniform_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_uniform_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_set_vertex_buffer = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_set_vertex_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_submit = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_submit",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_full_screen_quad_get_type = Interop.downcallHandle(
            "gst_vulkan_full_screen_quad_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
