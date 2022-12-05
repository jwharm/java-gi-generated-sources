package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Holds information about a vulkan non dispatchable handle that only has
 * a vulkan device as a parent and no specific host synchronisation
 * requirements.  Command buffers have extra requirements that are serviced by
 * more specific implementations ({@link VulkanCommandBuffer}, {@link VulkanCommandPool}).
 * @version 1.18
 */
public class VulkanHandle extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanHandle";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        Interop.valueLayout.C_INT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_LONG.withName("handle"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
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
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanHandle}
     * @return A new, uninitialized @{link VulkanHandle}
     */
    public static VulkanHandle allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanHandle newInstance = new VulkanHandle(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code device}
     * @return The value of the field {@code device}
     */
    public org.gstreamer.vulkan.VulkanDevice device$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanDevice(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code device}
     * @param device The new value of the field {@code device}
     */
    public void device$set(org.gstreamer.vulkan.VulkanDevice device) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("device"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), device.handle());
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.vulkan.VulkanHandleType type$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanHandleType.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(org.gstreamer.vulkan.VulkanHandleType type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type.getValue());
    }
    
    /**
     * Get the value of the field {@code handle}
     * @return The value of the field {@code handle}
     */
    public org.gstreamer.vulkan.VulkanHandleTypedef handle$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanHandleTypedef(RESULT);
    }
    
    /**
     * Change the value of the field {@code handle}
     * @param handle The new value of the field {@code handle}
     */
    public void handle$set(org.gstreamer.vulkan.VulkanHandleTypedef handle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), handle.getValue().longValue());
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gstreamer.vulkan.VulkanHandleDestroyNotify notify$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress userData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void userData$set(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) userData);
    }
    
    /**
     * Create a VulkanHandle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanHandle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.gstreamer.vulkan.VulkanHandleType type, @NotNull org.gstreamer.vulkan.VulkanHandleTypedef handle, @NotNull org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(handle, "Parameter 'handle' must not be null");
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_handle_new_wrapped.invokeExact(
                    device.handle(),
                    type.getValue(),
                    handle.getValue().longValue(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbVulkanHandleDestroyNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanHandle newWrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.gstreamer.vulkan.VulkanHandleType type, @NotNull org.gstreamer.vulkan.VulkanHandleTypedef handle, @NotNull org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
        return new VulkanHandle(constructNewWrapped(device, type, handle, notify), Ownership.FULL);
    }
    
    /**
     * Frees the descriptor set layout in {@code handle}
     * @param userData callback user data
     */
    public void freeDescriptorSetLayout(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_descriptor_set_layout.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the framebuffer in {@code handle}
     * @param userData callback user data
     */
    public void freeFramebuffer(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_framebuffer.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the pipeline in {@code handle}
     * @param userData callback user data
     */
    public void freePipeline(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_pipeline.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the pipeline layout in {@code handle}
     * @param userData callback user data
     */
    public void freePipelineLayout(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_pipeline_layout.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the render pass in {@code handle}
     * @param userData callback user data
     */
    public void freeRenderPass(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_render_pass.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the sampler in {@code handle}
     * @param userData callback user data
     */
    public void freeSampler(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_sampler.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the shader in {@code handle}
     * @param userData callback user data
     */
    public void freeShader(@Nullable java.lang.foreign.MemoryAddress userData) {
        try {
            DowncallHandles.gst_vulkan_handle_free_shader.invokeExact(
                    handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the refcount of the given handle by one.
     * @return {@code buf}
     */
    public @NotNull org.gstreamer.vulkan.VulkanHandle ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_handle_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanHandle(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the buffer. If the refcount reaches 0, the buffer
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_handle_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    public static boolean contextQuery(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display, @Nullable org.gstreamer.vulkan.VulkanInstance instance, @Nullable org.gstreamer.vulkan.VulkanDevice device) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                    (Addressable) (instance == null ? MemoryAddress.NULL : instance.handle()),
                    (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Helper function for implementing {@link org.gstreamer.gst.ElementClass}.set_context() in
     * Vulkan capable elements.
     * <p>
     * Retrieve's the {@link VulkanDisplay} or {@link VulkanInstance} in {@code context} and places
     * the result in {@code display} or {@code instance} respectively.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param display location of a {@link VulkanDisplay}
     * @param instance location of a {@link VulkanInstance}
     * @return whether the {@code display} or {@code instance} could be set successfully
     */
    public static boolean setContext(@NotNull org.gstreamer.gst.Element element, @NotNull org.gstreamer.gst.Context context, @NotNull Out<org.gstreamer.vulkan.VulkanDisplay> display, @NotNull Out<org.gstreamer.vulkan.VulkanInstance> instance) {
        java.util.Objects.requireNonNull(element, "Parameter 'element' must not be null");
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemorySegment displayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        MemorySegment instancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_handle_set_context.invokeExact(
                    element.handle(),
                    context.handle(),
                    (Addressable) displayPOINTER.address(),
                    (Addressable) instancePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        display.set(new org.gstreamer.vulkan.VulkanDisplay(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        instance.set(new org.gstreamer.vulkan.VulkanInstance(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_handle_new_wrapped = Interop.downcallHandle(
            "gst_vulkan_handle_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_descriptor_set_layout = Interop.downcallHandle(
            "gst_vulkan_handle_free_descriptor_set_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_framebuffer = Interop.downcallHandle(
            "gst_vulkan_handle_free_framebuffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_pipeline = Interop.downcallHandle(
            "gst_vulkan_handle_free_pipeline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_pipeline_layout = Interop.downcallHandle(
            "gst_vulkan_handle_free_pipeline_layout",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_render_pass = Interop.downcallHandle(
            "gst_vulkan_handle_free_render_pass",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_sampler = Interop.downcallHandle(
            "gst_vulkan_handle_free_sampler",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_free_shader = Interop.downcallHandle(
            "gst_vulkan_handle_free_shader",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_ref = Interop.downcallHandle(
            "gst_vulkan_handle_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_unref = Interop.downcallHandle(
            "gst_vulkan_handle_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_context_query = Interop.downcallHandle(
            "gst_vulkan_handle_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_handle_set_context = Interop.downcallHandle(
            "gst_vulkan_handle_set_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanHandle struct;
        
         /**
         * A {@link VulkanHandle.Build} object constructs a {@link VulkanHandle} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanHandle.allocate();
        }
        
         /**
         * Finish building the {@link VulkanHandle} struct.
         * @return A new instance of {@code VulkanHandle} with the fields 
         *         that were set in the Build object.
         */
        public VulkanHandle construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.MiniObject}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanDevice} for this handle
         * @param device The value for the {@code device} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDevice(org.gstreamer.vulkan.VulkanDevice device) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
            return this;
        }
        
        /**
         * the type of handle
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(org.gstreamer.vulkan.VulkanHandleType type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
            return this;
        }
        
        /**
         * the handle value
         * @param handle The value for the {@code handle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHandle(org.gstreamer.vulkan.VulkanHandleTypedef handle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handle == null ? MemoryAddress.NULL : handle.getValue().longValue()));
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
        
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Build setReserved(java.lang.foreign.MemoryAddress[] Reserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Reserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Reserved, false)));
            return this;
        }
    }
}
