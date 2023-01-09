package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanBufferMemory extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBufferMemory";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Memory.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("device"),
            org.vulkan.Buffer.getMemoryLayout().withName("buffer"),
            Interop.valueLayout.ADDRESS.withName("vk_mem"),
            org.vulkan.MemoryRequirements.getMemoryLayout().withName("requirements"),
            org.vulkan.BufferUsageFlags.getMemoryLayout().withName("usage"),
            org.gstreamer.vulkan.VulkanBarrierBufferInfo.getMemoryLayout().withName("barrier"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
            Interop.valueLayout.C_INT.withName("wrapped"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.ADDRESS.withName("user_data")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanBufferMemory}
     * @return A new, uninitialized @{link VulkanBufferMemory}
     */
    public static VulkanBufferMemory allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanBufferMemory newInstance = new VulkanBufferMemory(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Memory getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.Memory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.Memory parent) {
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
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.vulkan.Buffer getBuffer() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("buffer"));
        return org.vulkan.Buffer.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.vulkan.Buffer buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code vk_mem}
     * @return The value of the field {@code vk_mem}
     */
    public org.gstreamer.vulkan.VulkanMemory getVkMem() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.vulkan.VulkanMemory.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code vk_mem}
     * @param vkMem The new value of the field {@code vk_mem}
     */
    public void setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vkMem == null ? MemoryAddress.NULL : vkMem.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code requirements}
     * @return The value of the field {@code requirements}
     */
    public org.vulkan.MemoryRequirements getRequirements() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("requirements"));
        return org.vulkan.MemoryRequirements.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code requirements}
     * @param requirements The new value of the field {@code requirements}
     */
    public void setRequirements(org.vulkan.MemoryRequirements requirements) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("requirements"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requirements == null ? MemoryAddress.NULL : requirements.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code usage}
     * @return The value of the field {@code usage}
     */
    public org.vulkan.BufferUsageFlags getUsage() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("usage"));
        return org.vulkan.BufferUsageFlags.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code usage}
     * @param usage The new value of the field {@code usage}
     */
    public void setUsage(org.vulkan.BufferUsageFlags usage) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (usage == null ? MemoryAddress.NULL : usage.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code barrier}
     * @return The value of the field {@code barrier}
     */
    public org.gstreamer.vulkan.VulkanBarrierBufferInfo getBarrier() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("barrier"));
        return org.gstreamer.vulkan.VulkanBarrierBufferInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code barrier}
     * @param barrier The new value of the field {@code barrier}
     */
    public void setBarrier(org.gstreamer.vulkan.VulkanBarrierBufferInfo barrier) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
        }
    }
    
    /**
     * Create a VulkanBufferMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanBufferMemory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanBufferMemory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanBufferMemory(input);
    
    /**
     * Allocate a new {@link VulkanBufferMemory}.
     * @param device a {@link VulkanDevice}
     * @param size size of the new buffer
     * @param usage buffer usage flags
     * @param memPropFlags memory properties flags for the backing memory
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan buffer
     *          backed by vulkan device memory
     */
    public static org.gstreamer.gst.Memory alloc(org.gstreamer.vulkan.VulkanDevice device, long size, org.vulkan.BufferUsageFlags usage, org.vulkan.MemoryPropertyFlags memPropFlags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_alloc.invokeExact(
                    device.handle(),
                    size,
                    usage.handle(),
                    memPropFlags.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Initializes the Vulkan buffer memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link VulkanBufferMemory} operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_vulkan_buffer_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocated a new wrapped {@link VulkanBufferMemory} with {@code buffer}.
     * @param device a {@link VulkanDevice}
     * @param buffer a {@code VkBuffer}
     * @param usage usage flags of {@code buffer}
     * @param notify a {@link org.gtk.glib.DestroyNotify} called when {@code buffer} is no longer in use
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static org.gstreamer.gst.Memory wrapped(org.gstreamer.vulkan.VulkanDevice device, org.vulkan.Buffer buffer, org.vulkan.BufferUsageFlags usage, @Nullable org.gtk.glib.DestroyNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_wrapped.invokeExact(
                    device.handle(),
                    buffer.handle(),
                    usage.handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_buffer_memory_alloc = Interop.downcallHandle(
                "gst_vulkan_buffer_memory_alloc",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_vulkan_buffer_memory_init_once = Interop.downcallHandle(
                "gst_vulkan_buffer_memory_init_once",
                FunctionDescriptor.ofVoid(),
                false
        );
        
        private static final MethodHandle gst_vulkan_buffer_memory_wrapped = Interop.downcallHandle(
                "gst_vulkan_buffer_memory_wrapped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VulkanBufferMemory.Builder} object constructs a {@link VulkanBufferMemory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanBufferMemory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanBufferMemory struct;
        
        private Builder() {
            struct = VulkanBufferMemory.allocate();
        }
        
        /**
         * Finish building the {@link VulkanBufferMemory} struct.
         * @return A new instance of {@code VulkanBufferMemory} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanBufferMemory build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Memory}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.Memory parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanDevice} this vulkan buffer is allocated from
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
         * Vulkan buffer object
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.vulkan.Buffer buffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
                return this;
            }
        }
        
        /**
         * backing {@link VulkanMemory} for {@code buffer}
         * @param vkMem The value for the {@code vkMem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (vkMem == null ? MemoryAddress.NULL : vkMem.handle()));
                return this;
            }
        }
        
        /**
         * allocation requirements for {@code buffer}
         * @param requirements The value for the {@code requirements} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRequirements(org.vulkan.MemoryRequirements requirements) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("requirements"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (requirements == null ? MemoryAddress.NULL : requirements.handle()));
                return this;
            }
        }
        
        /**
         * intended usage for {@code buffer}
         * @param usage The value for the {@code usage} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsage(org.vulkan.BufferUsageFlags usage) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("usage"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (usage == null ? MemoryAddress.NULL : usage.handle()));
                return this;
            }
        }
        
        /**
         * the last set barrier information
         * @param barrier The value for the {@code barrier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBarrier(org.gstreamer.vulkan.VulkanBarrierBufferInfo barrier) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
                return this;
            }
        }
        
        public Builder setLock(org.gtk.glib.Mutex lock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
                return this;
            }
        }
        
        public Builder setWrapped(boolean wrapped) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wrapped"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(wrapped, null).intValue());
                return this;
            }
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
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
    }
}
