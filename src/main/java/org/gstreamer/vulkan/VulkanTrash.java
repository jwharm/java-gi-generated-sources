package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanTrash extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanTrash";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("cache"),
            Interop.valueLayout.ADDRESS.withName("fence"),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanTrash}
     * @return A new, uninitialized @{link VulkanTrash}
     */
    public static VulkanTrash allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanTrash newInstance = new VulkanTrash(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.MiniObject parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code cache}
     * @return The value of the field {@code cache}
     */
    public org.gstreamer.vulkan.VulkanTrashList getCache() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.vulkan.VulkanTrashList) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.vulkan.VulkanTrashList.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code cache}
     * @param cache The new value of the field {@code cache}
     */
    public void setCache(org.gstreamer.vulkan.VulkanTrashList cache) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cache == null ? MemoryAddress.NULL : cache.handle()));
    }
    
    /**
     * Get the value of the field {@code fence}
     * @return The value of the field {@code fence}
     */
    public org.gstreamer.vulkan.VulkanFence getFence() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fence"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanFence.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code fence}
     * @param fence The new value of the field {@code fence}
     */
    public void setFence(org.gstreamer.vulkan.VulkanFence fence) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fence"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fence == null ? MemoryAddress.NULL : fence.handle()));
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gstreamer.vulkan.VulkanTrashNotify getNotify() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(org.gstreamer.vulkan.VulkanTrashNotify notify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress getUserData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
    }
    
    /**
     * Create a VulkanTrash proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanTrash(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanTrash> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanTrash(input, ownership);
    
    private static MemoryAddress constructNew(org.gstreamer.vulkan.VulkanFence fence, @Nullable org.gstreamer.vulkan.VulkanTrashNotify notify) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_new.invokeExact(
                    fence.handle(),
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create and return a new {@link VulkanTrash} object that will stores a callback
     * to call when {@code fence} is signalled.
     * @param fence a {@link VulkanFence}
     * @param notify a {@link VulkanTrashNotify}
     */
    public VulkanTrash(org.gstreamer.vulkan.VulkanFence fence, @Nullable org.gstreamer.vulkan.VulkanTrashNotify notify) {
        super(constructNew(fence, notify), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFreeSemaphore(org.gstreamer.vulkan.VulkanFence fence, org.vulkan.Semaphore semaphore) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_new_free_semaphore.invokeExact(
                    fence.handle(),
                    semaphore.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanTrash newFreeSemaphore(org.gstreamer.vulkan.VulkanFence fence, org.vulkan.Semaphore semaphore) {
        var RESULT = constructNewFreeSemaphore(fence, semaphore);
        return org.gstreamer.vulkan.VulkanTrash.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given trash object by one.
     * @return {@code trash}
     */
    public org.gstreamer.vulkan.VulkanTrash ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.vulkan.VulkanTrash.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the trash object. If the refcount reaches 0, the
     * trash will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_trash_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.MiniObject} when the
     * associated {@link VulkanFence} is signalled
     * @param device the {@link VulkanDevice}
     */
    public static void miniObjectUnref(org.gstreamer.vulkan.VulkanDevice device) {
        try {
            DowncallHandles.gst_vulkan_trash_mini_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.GstObject} when the
     * associated {@link VulkanFence} is signalled
     * @param device the {@link VulkanDevice}
     */
    public static void objectUnref(org.gstreamer.vulkan.VulkanDevice device) {
        try {
            DowncallHandles.gst_vulkan_trash_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_trash_new = Interop.downcallHandle(
            "gst_vulkan_trash_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_new_free_semaphore = Interop.downcallHandle(
            "gst_vulkan_trash_new_free_semaphore",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_ref = Interop.downcallHandle(
            "gst_vulkan_trash_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_unref = Interop.downcallHandle(
            "gst_vulkan_trash_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_mini_object_unref = Interop.downcallHandle(
            "gst_vulkan_trash_mini_object_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_trash_object_unref = Interop.downcallHandle(
            "gst_vulkan_trash_object_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VulkanTrash.Builder} object constructs a {@link VulkanTrash} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanTrash.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanTrash struct;
        
        private Builder() {
            struct = VulkanTrash.allocate();
        }
        
         /**
         * Finish building the {@link VulkanTrash} struct.
         * @return A new instance of {@code VulkanTrash} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanTrash build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setCache(org.gstreamer.vulkan.VulkanTrashList cache) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cache"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cache == null ? MemoryAddress.NULL : cache.handle()));
            return this;
        }
        
        public Builder setFence(org.gstreamer.vulkan.VulkanFence fence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fence == null ? MemoryAddress.NULL : fence.handle()));
            return this;
        }
        
        public Builder setNotify(org.gstreamer.vulkan.VulkanTrashNotify notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
