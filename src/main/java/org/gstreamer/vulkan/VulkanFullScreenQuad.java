package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanFullScreenQuad extends org.gstreamer.gst.Object {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFullScreenQuad";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a VulkanFullScreenQuad proxy instance for the provided memory address.
     * <p>
     * Because VulkanFullScreenQuad is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanFullScreenQuad(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to VulkanFullScreenQuad if its GType is a (or inherits from) "GstVulkanFullScreenQuad".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code VulkanFullScreenQuad} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstVulkanFullScreenQuad", a ClassCastException will be thrown.
     */
    public static VulkanFullScreenQuad castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), VulkanFullScreenQuad.getType())) {
            return new VulkanFullScreenQuad(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstVulkanFullScreenQuad");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanQueue queue) {
        java.util.Objects.requireNonNull(queue, "Parameter 'queue' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_full_screen_quad_new.invokeExact(
                    queue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VulkanFullScreenQuad(@NotNull org.gstreamer.vulkan.VulkanQueue queue) {
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
        return RESULT != 0;
    }
    
    public boolean fillCommandBuffer(@NotNull org.gstreamer.vulkan.VulkanCommandBuffer cmd, @NotNull org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(cmd, "Parameter 'cmd' must not be null");
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
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
        return RESULT != 0;
    }
    
    public @NotNull org.gstreamer.vulkan.VulkanFence getLastFence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_full_screen_quad_get_last_fence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanFence(RESULT, Ownership.FULL);
    }
    
    public boolean prepareDraw(@NotNull org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * See also gst_vulkan_full_screen_quad_set_vertex_buffer()
     * @param indices the index data.  Must be a {@link VulkanBufferMemory}
     * @param nIndices number of indices in {@code indices}
     * @return whether the index data could be set
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setIndexBuffer(@NotNull org.gstreamer.gst.Memory indices, long nIndices) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(indices, "Parameter 'indices' must not be null");
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
        return RESULT != 0;
    }
    
    public boolean setInfo(@NotNull org.gstreamer.video.VideoInfo inInfo, @NotNull org.gstreamer.video.VideoInfo outInfo) {
        java.util.Objects.requireNonNull(inInfo, "Parameter 'inInfo' must not be null");
        java.util.Objects.requireNonNull(outInfo, "Parameter 'outInfo' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_info.invokeExact(
                    handle(),
                    inInfo.handle(),
                    outInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean setInputBuffer(@NotNull org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
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
        return RESULT != 0;
    }
    
    public boolean setOutputBuffer(@NotNull org.gstreamer.gst.Buffer buffer) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
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
        return RESULT != 0;
    }
    
    public boolean setShaders(@NotNull org.gstreamer.vulkan.VulkanHandle vert, @NotNull org.gstreamer.vulkan.VulkanHandle frag) {
        java.util.Objects.requireNonNull(vert, "Parameter 'vert' must not be null");
        java.util.Objects.requireNonNull(frag, "Parameter 'frag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_full_screen_quad_set_shaders.invokeExact(
                    handle(),
                    vert.handle(),
                    frag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean setUniformBuffer(@NotNull org.gstreamer.gst.Memory uniforms) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uniforms, "Parameter 'uniforms' must not be null");
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
        return RESULT != 0;
    }
    
    public boolean setVertexBuffer(@NotNull org.gstreamer.gst.Memory vertices) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(vertices, "Parameter 'vertices' must not be null");
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
        return RESULT != 0;
    }
    
    public boolean submit(@NotNull org.gstreamer.vulkan.VulkanCommandBuffer cmd, @NotNull org.gstreamer.vulkan.VulkanFence fence) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(cmd, "Parameter 'cmd' must not be null");
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_vulkan_full_screen_quad_get_type.invokeExact();
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
         * A {@link VulkanFullScreenQuad.Build} object constructs a {@link VulkanFullScreenQuad} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link VulkanFullScreenQuad} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link VulkanFullScreenQuad} using {@link VulkanFullScreenQuad#castFrom}.
         * @return A new instance of {@code VulkanFullScreenQuad} with the properties 
         *         that were set in the Build object.
         */
        public VulkanFullScreenQuad construct() {
            return VulkanFullScreenQuad.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    VulkanFullScreenQuad.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
