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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanMemory}
     * @return A new, uninitialized @{link VulkanMemory}
     */
    public static VulkanMemory allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VulkanMemory newInstance = new VulkanMemory(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mem}
     * @return The value of the field {@code mem}
     */
    public org.gstreamer.gst.Memory getMem() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem"));
        return org.gstreamer.gst.Memory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mem}
     * @param mem The new value of the field {@code mem}
     */
    public void setMem(org.gstreamer.gst.Memory mem) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
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
     * Get the value of the field {@code mem_ptr}
     * @return The value of the field {@code mem_ptr}
     */
    public org.vulkan.DeviceMemory getMemPtr() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mem_ptr"));
        return org.vulkan.DeviceMemory.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mem_ptr}
     * @param memPtr The new value of the field {@code mem_ptr}
     */
    public void setMemPtr(org.vulkan.DeviceMemory memPtr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem_ptr"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (memPtr == null ? MemoryAddress.NULL : memPtr.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code lock}
     * @return The value of the field {@code lock}
     */
    public org.gtk.glib.Mutex getLock() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.Mutex.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code lock}
     * @param lock The new value of the field {@code lock}
     */
    public void setLock(org.gtk.glib.Mutex lock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code map_count}
     * @return The value of the field {@code map_count}
     */
    public int getMapCount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code map_count}
     * @param mapCount The new value of the field {@code map_count}
     */
    public void setMapCount(int mapCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), mapCount);
        }
    }
    
    /**
     * Create a VulkanMemory proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VulkanMemory(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanMemory> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VulkanMemory(input);
    
    /**
     * Allocated a new {@link VulkanMemory}.
     * @param device a {@link VulkanDevice}
     * @param memoryTypeIndex the Vulkan memory type index
     * @param params a {@link org.gstreamer.gst.AllocationParams}
     * @param size the size to allocate
     * @return a {@link org.gstreamer.gst.Memory} object backed by a vulkan device memory
     */
    public static org.gstreamer.gst.Memory alloc(org.gstreamer.vulkan.VulkanDevice device, int memoryTypeIndex, org.gstreamer.gst.AllocationParams params, long size, org.vulkan.MemoryPropertyFlags memPropFlags) {
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
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public static boolean findMemoryTypeIndexWithTypeProperties(org.gstreamer.vulkan.VulkanDevice device, int typeBits, org.vulkan.MemoryPropertyFlags properties, PointerInteger typeIndex) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static java.lang.String heapFlagsToString(org.vulkan.MemoryHeapFlags propBits) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_heap_flags_to_string.invokeExact(propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    
    public static java.lang.String propertyFlagsToString(org.vulkan.MemoryPropertyFlags propBits) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_memory_property_flags_to_string.invokeExact(propBits.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
     * A {@link VulkanMemory.Builder} object constructs a {@link VulkanMemory} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanMemory.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanMemory struct;
        
        private Builder() {
            struct = VulkanMemory.allocate();
        }
        
        /**
         * Finish building the {@link VulkanMemory} struct.
         * @return A new instance of {@code VulkanMemory} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanMemory build() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.Memory}
         * @param mem The value for the {@code mem} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMem(org.gstreamer.gst.Memory mem) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mem"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mem == null ? MemoryAddress.NULL : mem.handle()));
                return this;
            }
        }
        
        /**
         * the {@link VulkanDevice} this memory is allocated from
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
         * the vulkan memory handle
         * @param memPtr The value for the {@code memPtr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMemPtr(org.vulkan.DeviceMemory memPtr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mem_ptr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (memPtr == null ? MemoryAddress.NULL : memPtr.handle()));
                return this;
            }
        }
        
        /**
         * lock for accessing/changing memory informat
         * @param lock The value for the {@code lock} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLock(org.gtk.glib.Mutex lock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lock == null ? MemoryAddress.NULL : lock.handle()));
                return this;
            }
        }
        
        /**
         * number of times this memory is mapped
         * @param mapCount The value for the {@code mapCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMapCount(int mapCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), mapCount);
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
        
        public Builder setAllocInfo(org.vulkan.MemoryAllocateInfo allocInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocInfo == null ? MemoryAddress.NULL : allocInfo.handle()));
                return this;
            }
        }
        
        public Builder setProperties(org.vulkan.MemoryPropertyFlags properties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (properties == null ? MemoryAddress.NULL : properties.handle()));
                return this;
            }
        }
        
        public Builder setVkOffset(long vkOffset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("vk_offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), vkOffset);
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
