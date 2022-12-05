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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("cache"),
        Interop.valueLayout.ADDRESS.withName("fence"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("user_data"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
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
    public org.gstreamer.gst.MiniObject parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code cache}
     * @return The value of the field {@code cache}
     */
    public org.gstreamer.vulkan.VulkanTrashList cache$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanTrashList(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code cache}
     * @param cache The new value of the field {@code cache}
     */
    public void cache$set(org.gstreamer.vulkan.VulkanTrashList cache) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cache.handle());
    }
    
    /**
     * Get the value of the field {@code fence}
     * @return The value of the field {@code fence}
     */
    public org.gstreamer.vulkan.VulkanFence fence$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fence"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanFence(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code fence}
     * @param fence The new value of the field {@code fence}
     */
    public void fence$set(org.gstreamer.vulkan.VulkanFence fence) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fence"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fence.handle());
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gstreamer.vulkan.VulkanTrashNotify notify$get() {
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
     * Create a VulkanTrash proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanTrash(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.vulkan.VulkanFence fence, @Nullable org.gstreamer.vulkan.VulkanTrashNotify notify) {
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_new.invokeExact(
                    fence.handle(),
                    (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstVulkan.Callbacks.class, "cbVulkanTrashNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (notify == null ? MemoryAddress.NULL : Interop.registerCallback(notify)));
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
    public VulkanTrash(@NotNull org.gstreamer.vulkan.VulkanFence fence, @Nullable org.gstreamer.vulkan.VulkanTrashNotify notify) {
        super(constructNew(fence, notify), Ownership.FULL);
    }
    
    private static Addressable constructNewFreeSemaphore(@NotNull org.gstreamer.vulkan.VulkanFence fence, @NotNull org.vulkan.Semaphore semaphore) {
        java.util.Objects.requireNonNull(fence, "Parameter 'fence' must not be null");
        java.util.Objects.requireNonNull(semaphore, "Parameter 'semaphore' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_new_free_semaphore.invokeExact(
                    fence.handle(),
                    semaphore.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanTrash newFreeSemaphore(@NotNull org.gstreamer.vulkan.VulkanFence fence, @NotNull org.vulkan.Semaphore semaphore) {
        return new VulkanTrash(constructNewFreeSemaphore(fence, semaphore), Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given trash object by one.
     * @return {@code trash}
     */
    public @NotNull org.gstreamer.vulkan.VulkanTrash ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_trash_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanTrash(RESULT, Ownership.FULL);
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
     * @param userData the {@link org.gstreamer.gst.MiniObject}
     */
    public static void miniObjectUnref(@NotNull org.gstreamer.vulkan.VulkanDevice device, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_vulkan_trash_mini_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) userData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link VulkanTrashNotify} implementation for unreffing a {@link org.gstreamer.gst.Object} when the
     * associated {@link VulkanFence} is signalled
     * @param device the {@link VulkanDevice}
     * @param userData the {@link org.gstreamer.gst.MiniObject}
     */
    public static void objectUnref(@NotNull org.gstreamer.vulkan.VulkanDevice device, @Nullable java.lang.foreign.MemoryAddress userData) {
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        try {
            DowncallHandles.gst_vulkan_trash_object_unref.invokeExact(
                    device.handle(),
                    (Addressable) userData);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanTrash struct;
        
         /**
         * A {@link VulkanTrash.Build} object constructs a {@link VulkanTrash} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanTrash.allocate();
        }
        
         /**
         * Finish building the {@link VulkanTrash} struct.
         * @return A new instance of {@code VulkanTrash} with the fields 
         *         that were set in the Build object.
         */
        public VulkanTrash construct() {
            return struct;
        }
        
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setCache(org.gstreamer.vulkan.VulkanTrashList cache) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cache"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cache == null ? MemoryAddress.NULL : cache.handle()));
            return this;
        }
        
        public Build setFence(org.gstreamer.vulkan.VulkanFence fence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fence == null ? MemoryAddress.NULL : fence.handle()));
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
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false)));
            return this;
        }
    }
}
