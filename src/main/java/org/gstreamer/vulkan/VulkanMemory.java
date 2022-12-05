package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanMemory extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanMemory";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Memory.getMemoryLayout().withName("mem"),
        Interop.valueLayout.ADDRESS.withName("device"),
        org.vulkan.DeviceMemory.getMemoryLayout().withName("mem_ptr"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
        Interop.valueLayout.C_INT.withName("map_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        org.vulkan.MemoryAllocateInfo.getMemoryLayout().withName("alloc_info"),
        org.vulkan.MemoryPropertyFlags.getMemoryLayout().withName("properties"),
        Interop.valueLayout.C_LONG.withName("vk_offset"),
        Interop.valueLayout.C_INT.withName("wrapped"),
        MemoryLayout.paddingLayout(96),
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
     * Allocate a new {@link VulkanMemory}
     * @return A new, uninitialized @{link VulkanMemory}
     */
    public static VulkanMemory allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanMemory newInstance = new VulkanMemory(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gst.Memory mem$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
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
     * Get the value of the field {@code mem_ptr}
     * @return The value of the field {@code mem_ptr}
     */
    public org.vulkan.DeviceMemory memPtr$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem_ptr"));
        return new org.vulkan.DeviceMemory(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code lock}
     * @return The value of the field {@code lock}
     */
    public org.gtk.glib.Mutex lock$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Mutex(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code lock}
     * @param lock The new value of the field {@code lock}
     */
    public void lock$set(org.gtk.glib.Mutex lock) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lock"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lock.handle());
    }
    
    /**
     * Get the value of the field {@code map_count}
     * @return The value of the field {@code map_count}
     */
    public int mapCount$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code map_count}
     * @param mapCount The new value of the field {@code map_count}
     */
    public void mapCount$set(int mapCount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapCount);
    }
    
    /**
     * Create a VulkanMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanMemory(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Allocated a new {@link VulkanMemory}.
     * @param device a {@link VulkanDevice}
     * @param memoryTypeIndex the Vulkan memory type index
     * @param params a {@link org.gstreamer.gst.AllocationParams}
     * @param size the size to allocate
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static @NotNull org.gstreamer.gst.Memory alloc(@NotNull org.gstreamer.vulkan.VulkanDevice device, int memoryTypeIndex, @NotNull org.gstreamer.gst.AllocationParams params, long size, @NotNull org.vulkan.MemoryPropertyFlags memPropFlags) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(memPropFlags, "Parameter 'memPropFlags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_alloc.invokeExact(
                    device.handle(),
                    memoryTypeIndex,
                    params.handle(),
                    size,
                    memPropFlags.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Memory(RESULT, Ownership.FULL);
    }
    
    public static boolean findMemoryTypeIndexWithTypeProperties(@NotNull org.gstreamer.vulkan.VulkanDevice device, int typeBits, @NotNull org.vulkan.MemoryPropertyFlags properties, PointerInteger typeIndex) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(properties, "Parameter 'properties' must not be null");
        java.util.Objects.requireNonNull(typeIndex, "Parameter 'typeIndex' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_memory_find_memory_type_index_with_type_properties.invokeExact(
                    device.handle(),
                    typeBits,
                    properties.handle(),
                    typeIndex.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull java.lang.String heapFlagsToString(@NotNull org.vulkan.MemoryHeapFlags propBits) {
        java.util.Objects.requireNonNull(propBits, "Parameter 'propBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_heap_flags_to_string.invokeExact(
                    propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Initializes the Vulkan memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link VulkanMemory} operation.
     */
    public static void initOnce() {
        try {
            DowncallHandles.gst_vulkan_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull java.lang.String propertyFlagsToString(@NotNull org.vulkan.MemoryPropertyFlags propBits) {
        java.util.Objects.requireNonNull(propBits, "Parameter 'propBits' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_property_flags_to_string.invokeExact(
                    propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_memory_alloc = Interop.downcallHandle(
            "gst_vulkan_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_find_memory_type_index_with_type_properties = Interop.downcallHandle(
            "gst_vulkan_memory_find_memory_type_index_with_type_properties",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_heap_flags_to_string = Interop.downcallHandle(
            "gst_vulkan_memory_heap_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_init_once = Interop.downcallHandle(
            "gst_vulkan_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_vulkan_memory_property_flags_to_string = Interop.downcallHandle(
            "gst_vulkan_memory_property_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanMemory struct;
        
         /**
         * A {@link VulkanMemory.Build} object constructs a {@link VulkanMemory} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanMemory.allocate();
        }
        
         /**
         * Finish building the {@link VulkanMemory} struct.
         * @return A new instance of {@code VulkanMemory} with the fields 
         *         that were set in the Build object.
         */
        public VulkanMemory construct() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.Memory}
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMem(org.gstreamer.gst.Memory mem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
            return this;
        }
        
        /**
         * the {@link VulkanDevice} this memory is allocated from
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
         * the vulkan memory handle
         * @param memPtr The value for the {@code memPtr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMemPtr(org.vulkan.DeviceMemory memPtr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem_ptr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (memPtr == null ? MemoryAddress.NULL : memPtr.handle()));
            return this;
        }
        
        /**
         * lock for accessing/changing memory informat
         * @param lock The value for the {@code lock} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLock(org.gtk.glib.Mutex lock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
            return this;
        }
        
        /**
         * number of times this memory is mapped
         * @param mapCount The value for the {@code mapCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMapCount(int mapCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), mapCount);
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
        
        public Build setAllocInfo(org.vulkan.MemoryAllocateInfo allocInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocInfo == null ? MemoryAddress.NULL : allocInfo.handle()));
            return this;
        }
        
        public Build setProperties(org.vulkan.MemoryPropertyFlags properties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (properties == null ? MemoryAddress.NULL : properties.handle()));
            return this;
        }
        
        public Build setVkOffset(long vkOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("vk_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), vkOffset);
            return this;
        }
        
        public Build setWrapped(boolean wrapped) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wrapped"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), wrapped ? 1 : 0);
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
