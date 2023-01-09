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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            Interop.valueLayout.C_INT.withName("type"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("handle"),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanHandle}
     * @return A new, uninitialized @{link VulkanHandle}
     */
    public static VulkanHandle allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanHandle newInstance = new VulkanHandle(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.MiniObject parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code device}
     * @return The value of the field {@code device}
     */
    public org.gstreamer.vulkan.VulkanDevice getDevice() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("device"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.vulkan.VulkanDevice) Interop.register(RESULT, org.gstreamer.vulkan.VulkanDevice.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code device}
     * @param device The new value of the field {@code device}
     */
    public void setDevice(org.gstreamer.vulkan.VulkanDevice device) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("device"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.vulkan.VulkanHandleType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.vulkan.VulkanHandleType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.vulkan.VulkanHandleType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code handle}
     * @return The value of the field {@code handle}
     */
    public org.gstreamer.vulkan.VulkanHandleTypedef getHandle() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.vulkan.VulkanHandleTypedef(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code handle}
     * @param handle The new value of the field {@code handle}
     */
    public void setHandle(org.gstreamer.vulkan.VulkanHandleTypedef handle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handle == null ? MemoryAddress.NULL : handle.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gstreamer.vulkan.VulkanHandleDestroyNotify getNotify() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData(java.lang.foreign.MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
        }
    }
    
    /**
     * Create a VulkanHandle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanHandle(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanHandle> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanHandle(input);
    
    private static MemoryAddress constructNewWrapped(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanHandleType type, org.gstreamer.vulkan.VulkanHandleTypedef handle, org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_handle_new_wrapped.invokeExact(
                    device.handle(),
                    type.getValue(),
                    handle.getValue().longValue(),
                    (Addressable) notify.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static VulkanHandle newWrapped(org.gstreamer.vulkan.VulkanDevice device, org.gstreamer.vulkan.VulkanHandleType type, org.gstreamer.vulkan.VulkanHandleTypedef handle, org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
        var RESULT = constructNewWrapped(device, type, handle, notify);
        var OBJECT = org.gstreamer.vulkan.VulkanHandle.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees the descriptor set layout in {@code handle}
     */
    public void freeDescriptorSetLayout() {
        try {
            DowncallHandles.gst_vulkan_handle_free_descriptor_set_layout.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the framebuffer in {@code handle}
     */
    public void freeFramebuffer() {
        try {
            DowncallHandles.gst_vulkan_handle_free_framebuffer.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the pipeline in {@code handle}
     */
    public void freePipeline() {
        try {
            DowncallHandles.gst_vulkan_handle_free_pipeline.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the pipeline layout in {@code handle}
     */
    public void freePipelineLayout() {
        try {
            DowncallHandles.gst_vulkan_handle_free_pipeline_layout.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the render pass in {@code handle}
     */
    public void freeRenderPass() {
        try {
            DowncallHandles.gst_vulkan_handle_free_render_pass.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the sampler in {@code handle}
     */
    public void freeSampler() {
        try {
            DowncallHandles.gst_vulkan_handle_free_sampler.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees the shader in {@code handle}
     */
    public void freeShader() {
        try {
            DowncallHandles.gst_vulkan_handle_free_shader.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the refcount of the given handle by one.
     * @return {@code buf}
     */
    public org.gstreamer.vulkan.VulkanHandle ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_handle_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.vulkan.VulkanHandle.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Decreases the refcount of the buffer. If the refcount reaches 0, the buffer
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_handle_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    public static boolean contextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.vulkan.VulkanDisplay display, @Nullable org.gstreamer.vulkan.VulkanInstance instance, @Nullable org.gstreamer.vulkan.VulkanDevice device) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static boolean setContext(org.gstreamer.gst.Element element, org.gstreamer.gst.Context context, @Nullable Out<org.gstreamer.vulkan.VulkanDisplay> display, Out<org.gstreamer.vulkan.VulkanInstance> instance) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment displayPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment instancePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_vulkan_handle_set_context.invokeExact(
                        element.handle(),
                        context.handle(),
                        (Addressable) (display == null ? MemoryAddress.NULL : (Addressable) displayPOINTER.address()),
                        (Addressable) instancePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (display != null) display.set((org.gstreamer.vulkan.VulkanDisplay) Interop.register(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanDisplay.fromAddress).marshal(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    instance.set((org.gstreamer.vulkan.VulkanInstance) Interop.register(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.vulkan.VulkanInstance.fromAddress).marshal(instancePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
     * A {@link VulkanHandle.Builder} object constructs a {@link VulkanHandle} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanHandle.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanHandle struct;
        
        private Builder() {
            struct = VulkanHandle.allocate();
        }
        
        /**
         * Finish building the {@link VulkanHandle} struct.
         * @return A new instance of {@code VulkanHandle} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanHandle build() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.MiniObject}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanDevice} for this handle
         * @param device The value for the {@code device} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDevice(org.gstreamer.vulkan.VulkanDevice device) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("device"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (device == null ? MemoryAddress.NULL : device.handle()));
                return this;
            }
        }
        
        /**
         * the type of handle
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.vulkan.VulkanHandleType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
        
        /**
         * the handle value
         * @param handle The value for the {@code handle} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHandle(org.gstreamer.vulkan.VulkanHandleTypedef handle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handle == null ? MemoryAddress.NULL : handle.getValue().longValue()));
                return this;
            }
        }
        
        public Builder setNotify(org.gstreamer.vulkan.VulkanHandleDestroyNotify notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
                return this;
            }
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
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
