package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanFence extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFence";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("device"),
        Interop.valueLayout.ADDRESS.withName("cache"),
        org.vulkan.Fence.getMemoryLayout().withName("fence"),
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
     * Allocate a new {@link VulkanFence}
     * @return A new, uninitialized @{link VulkanFence}
     */
    public static VulkanFence allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanFence newInstance = new VulkanFence(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code cache}
     * @return The value of the field {@code cache}
     */
    public org.gstreamer.vulkan.VulkanFenceCache cache$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanFenceCache(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code cache}
     * @param cache The new value of the field {@code cache}
     */
    public void cache$set(org.gstreamer.vulkan.VulkanFenceCache cache) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cache.handle());
    }
    
    /**
     * Get the value of the field {@code fence}
     * @return The value of the field {@code fence}
     */
    public org.vulkan.Fence fence$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("fence"));
        return new org.vulkan.Fence(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanFence proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanFence(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanDevice device) throws GErrorException {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_fence_new.invokeExact(
                    device.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    public VulkanFence(@NotNull org.gstreamer.vulkan.VulkanDevice device) throws GErrorException {
        super(constructNew(device), Ownership.FULL);
    }
    
    private static Addressable constructNewAlwaysSignalled(@NotNull org.gstreamer.vulkan.VulkanDevice device) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_fence_new_always_signalled.invokeExact(
                    device.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanFence newAlwaysSignalled(@NotNull org.gstreamer.vulkan.VulkanDevice device) {
        return new VulkanFence(constructNewAlwaysSignalled(device), Ownership.FULL);
    }
    
    public boolean isSignaled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_vulkan_fence_is_signaled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public void reset() {
        try {
            DowncallHandles.gst_vulkan_fence_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_fence_new = Interop.downcallHandle(
            "gst_vulkan_fence_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_fence_new_always_signalled = Interop.downcallHandle(
            "gst_vulkan_fence_new_always_signalled",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_fence_is_signaled = Interop.downcallHandle(
            "gst_vulkan_fence_is_signaled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_fence_reset = Interop.downcallHandle(
            "gst_vulkan_fence_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanFence struct;
        
         /**
         * A {@link VulkanFence.Build} object constructs a {@link VulkanFence} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanFence.allocate();
        }
        
         /**
         * Finish building the {@link VulkanFence} struct.
         * @return A new instance of {@code VulkanFence} with the fields 
         *         that were set in the Build object.
         */
        public VulkanFence construct() {
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
         * the {@link VulkanDevice} this fence is allocated from
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
         * the parent {@link VulkanFenceCache} for fence reuse
         * @param cache The value for the {@code cache} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCache(org.gstreamer.vulkan.VulkanFenceCache cache) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cache"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cache == null ? MemoryAddress.NULL : cache.handle()));
            return this;
        }
        
        /**
         * the vulkan fence handle
         * @param fence The value for the {@code fence} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFence(org.vulkan.Fence fence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fence == null ? MemoryAddress.NULL : fence.handle()));
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
