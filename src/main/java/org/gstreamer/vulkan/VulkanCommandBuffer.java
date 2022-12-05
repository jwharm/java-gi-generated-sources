package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanCommandBuffer extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanCommandBuffer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        org.vulkan.CommandBuffer.getMemoryLayout().withName("cmd"),
        Interop.valueLayout.ADDRESS.withName("pool"),
        org.vulkan.CommandBufferLevel.getMemoryLayout().withName("level"),
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
     * Allocate a new {@link VulkanCommandBuffer}
     * @return A new, uninitialized @{link VulkanCommandBuffer}
     */
    public static VulkanCommandBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanCommandBuffer newInstance = new VulkanCommandBuffer(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code cmd}
     * @return The value of the field {@code cmd}
     */
    public org.vulkan.CommandBuffer cmd$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("cmd"));
        return new org.vulkan.CommandBuffer(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code pool}
     * @return The value of the field {@code pool}
     */
    public org.gstreamer.vulkan.VulkanCommandPool pool$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pool"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanCommandPool(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pool}
     * @param pool The new value of the field {@code pool}
     */
    public void pool$set(org.gstreamer.vulkan.VulkanCommandPool pool) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pool"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pool.handle());
    }
    
    /**
     * Get the value of the field {@code level}
     * @return The value of the field {@code level}
     */
    public org.vulkan.CommandBufferLevel level$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("level"));
        return new org.vulkan.CommandBufferLevel(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VulkanCommandBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanCommandBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewWrapped(@NotNull org.vulkan.CommandBuffer cmd, @NotNull org.vulkan.CommandBufferLevel level) {
        java.util.Objects.requireNonNull(cmd, "Parameter 'cmd' must not be null");
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_command_buffer_new_wrapped.invokeExact(
                    cmd.handle(),
                    level.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanCommandBuffer newWrapped(@NotNull org.vulkan.CommandBuffer cmd, @NotNull org.vulkan.CommandBufferLevel level) {
        return new VulkanCommandBuffer(constructNewWrapped(cmd, level), Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given buffer by one.
     * @return {@code cmd}
     */
    public @NotNull org.gstreamer.vulkan.VulkanCommandBuffer ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_command_buffer_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanCommandBuffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the buffer. If the refcount reaches 0, the buffer
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_command_buffer_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_command_buffer_new_wrapped = Interop.downcallHandle(
            "gst_vulkan_command_buffer_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_command_buffer_ref = Interop.downcallHandle(
            "gst_vulkan_command_buffer_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_command_buffer_unref = Interop.downcallHandle(
            "gst_vulkan_command_buffer_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanCommandBuffer struct;
        
         /**
         * A {@link VulkanCommandBuffer.Build} object constructs a {@link VulkanCommandBuffer} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanCommandBuffer.allocate();
        }
        
         /**
         * Finish building the {@link VulkanCommandBuffer} struct.
         * @return A new instance of {@code VulkanCommandBuffer} with the fields 
         *         that were set in the Build object.
         */
        public VulkanCommandBuffer construct() {
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
         * the vulkan command buffer handle
         * @param cmd The value for the {@code cmd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCmd(org.vulkan.CommandBuffer cmd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cmd"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cmd == null ? MemoryAddress.NULL : cmd.handle()));
            return this;
        }
        
        /**
         * the parent {@link VulkanCommandPool} for command buffer reuse and locking
         * @param pool The value for the {@code pool} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPool(org.gstreamer.vulkan.VulkanCommandPool pool) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
            return this;
        }
        
        /**
         * the level of the vulkan command buffer
         * @param level The value for the {@code level} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLevel(org.vulkan.CommandBufferLevel level) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("level"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (level == null ? MemoryAddress.NULL : level.handle()));
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
