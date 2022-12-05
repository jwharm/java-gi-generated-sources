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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link VulkanBufferMemory}
     * @return A new, uninitialized @{link VulkanBufferMemory}
     */
    public static VulkanBufferMemory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanBufferMemory newInstance = new VulkanBufferMemory(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.Memory parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.Memory(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
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
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.vulkan.Buffer buffer$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("buffer"));
        return new org.vulkan.Buffer(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code vk_mem}
     * @return The value of the field {@code vk_mem}
     */
    public org.gstreamer.vulkan.VulkanMemory vkMem$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanMemory(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code vk_mem}
     * @param vkMem The new value of the field {@code vk_mem}
     */
    public void vkMem$set(org.gstreamer.vulkan.VulkanMemory vkMem) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), vkMem.handle());
    }
    
    /**
     * Get the value of the field {@code requirements}
     * @return The value of the field {@code requirements}
     */
    public org.vulkan.MemoryRequirements requirements$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("requirements"));
        return new org.vulkan.MemoryRequirements(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code usage}
     * @return The value of the field {@code usage}
     */
    public org.vulkan.BufferUsageFlags usage$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("usage"));
        return new org.vulkan.BufferUsageFlags(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code barrier}
     * @return The value of the field {@code barrier}
     */
    public org.gstreamer.vulkan.VulkanBarrierBufferInfo barrier$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("barrier"));
        return new org.gstreamer.vulkan.VulkanBarrierBufferInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanBufferMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanBufferMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Allocate a new {@link VulkanBufferMemory}.
     * @param device a {@link VulkanDevice}
     * @param size size of the new buffer
     * @param usage buffer usage flags
     * @param memPropFlags memory properties flags for the backing memory
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan buffer
     *          backed by vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory alloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, long size, @NotNull org.vulkan.BufferUsageFlags usage, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        java.util.Objects.requireNonNull(memPropFlags, "Parameter 'memPropFlags' must not be null");
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
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
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
     * @param userData user data to call {@code notify} with
     * @param notify a {@link org.gtk.glib.DestroyNotify} called when {@code buffer} is no longer in use
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory wrapped(@NotNull org.gstreamer.vulkan.VulkanDevice device, @NotNull org.vulkan.Buffer buffer, @NotNull org.vulkan.BufferUsageFlags usage, @Nullable java.lang.foreign.MemoryAddress userData, @Nullable org.gtk.glib.DestroyNotify notify) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(usage, "Parameter 'usage' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_buffer_memory_wrapped.invokeExact(
                    device.handle(),
                    buffer.handle(),
                    usage.handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanBufferMemory struct;
        
         /**
         * A {@link VulkanBufferMemory.Build} object constructs a {@link VulkanBufferMemory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanBufferMemory.allocate();
        }
        
         /**
         * Finish building the {@link VulkanBufferMemory} struct.
         * @return A new instance of {@code VulkanBufferMemory} with the fields 
         *         that were set in the Build object.
         */
        public VulkanBufferMemory construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Memory}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gstreamer.gst.Memory parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanDevice} this vulkan buffer is allocated from
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
         * Vulkan buffer object
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.vulkan.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * backing {@link VulkanMemory} for {@code buffer}
         * @param vkMem The value for the {@code vkMem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVkMem(org.gstreamer.vulkan.VulkanMemory vkMem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vk_mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (vkMem == null ? MemoryAddress.NULL : vkMem.handle()));
            return this;
        }
        
        /**
         * allocation requirements for {@code buffer}
         * @param requirements The value for the {@code requirements} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRequirements(org.vulkan.MemoryRequirements requirements) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("requirements"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (requirements == null ? MemoryAddress.NULL : requirements.handle()));
            return this;
        }
        
        /**
         * intended usage for {@code buffer}
         * @param usage The value for the {@code usage} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUsage(org.vulkan.BufferUsageFlags usage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (usage == null ? MemoryAddress.NULL : usage.handle()));
            return this;
        }
        
        /**
         * the last set barrier information
         * @param barrier The value for the {@code barrier} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBarrier(org.gstreamer.vulkan.VulkanBarrierBufferInfo barrier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("barrier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (barrier == null ? MemoryAddress.NULL : barrier.handle()));
            return this;
        }
        
        public Build setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        public Build setWrapped(boolean wrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), wrapped ? 1 : 0);
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
    }
}
