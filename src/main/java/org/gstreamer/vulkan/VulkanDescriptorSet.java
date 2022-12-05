package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanDescriptorSet extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanDescriptorSet";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        org.vulkan.DescriptorSet.getMemoryLayout().withName("set"),
        Interop.valueLayout.ADDRESS.withName("pool"),
        Interop.valueLayout.ADDRESS.withName("cache"),
        Interop.valueLayout.C_INT.withName("n_layouts"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("layouts"),
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
     * Allocate a new {@link VulkanDescriptorSet}
     * @return A new, uninitialized @{link VulkanDescriptorSet}
     */
    public static VulkanDescriptorSet allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanDescriptorSet newInstance = new VulkanDescriptorSet(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code set}
     * @return The value of the field {@code set}
     */
    public org.vulkan.DescriptorSet set$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("set"));
        return new org.vulkan.DescriptorSet(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code pool}
     * @return The value of the field {@code pool}
     */
    public org.gstreamer.vulkan.VulkanDescriptorPool pool$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pool"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanDescriptorPool(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pool}
     * @param pool The new value of the field {@code pool}
     */
    public void pool$set(org.gstreamer.vulkan.VulkanDescriptorPool pool) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pool"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pool.handle());
    }
    
    /**
     * Get the value of the field {@code cache}
     * @return The value of the field {@code cache}
     */
    public org.gstreamer.vulkan.VulkanDescriptorCache cache$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanDescriptorCache(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code cache}
     * @param cache The new value of the field {@code cache}
     */
    public void cache$set(org.gstreamer.vulkan.VulkanDescriptorCache cache) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cache"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), cache.handle());
    }
    
    /**
     * Get the value of the field {@code n_layouts}
     * @return The value of the field {@code n_layouts}
     */
    public int nLayouts$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_layouts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_layouts}
     * @param nLayouts The new value of the field {@code n_layouts}
     */
    public void nLayouts$set(int nLayouts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_layouts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nLayouts);
    }
    
    /**
     * Get the value of the field {@code layouts}
     * @return The value of the field {@code layouts}
     */
    public PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layouts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.vulkan.VulkanHandle>(RESULT, org.gstreamer.vulkan.VulkanHandle.class);
    }
    
    /**
     * Change the value of the field {@code layouts}
     * @param layouts The new value of the field {@code layouts}
     */
    public void layouts$set(PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layouts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), layouts.handle());
    }
    
    /**
     * Create a VulkanDescriptorSet proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanDescriptorSet(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewWrapped(@NotNull org.gstreamer.vulkan.VulkanDescriptorPool pool, @NotNull org.vulkan.DescriptorSet set, int nLayouts, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        java.util.Objects.requireNonNull(pool, "Parameter 'pool' must not be null");
        java.util.Objects.requireNonNull(set, "Parameter 'set' must not be null");
        java.util.Objects.requireNonNull(layouts, "Parameter 'layouts' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_set_new_wrapped.invokeExact(
                    pool.handle(),
                    set.handle(),
                    nLayouts,
                    layouts.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static VulkanDescriptorSet newWrapped(@NotNull org.gstreamer.vulkan.VulkanDescriptorPool pool, @NotNull org.vulkan.DescriptorSet set, int nLayouts, @NotNull PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
        return new VulkanDescriptorSet(constructNewWrapped(pool, set, nLayouts, layouts), Ownership.FULL);
    }
    
    /**
     * Increases the refcount of the given buffer by one.
     * @return {@code set}
     */
    public @NotNull org.gstreamer.vulkan.VulkanDescriptorSet ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vulkan_descriptor_set_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.vulkan.VulkanDescriptorSet(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the refcount of the buffer. If the refcount reaches 0, the buffer
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_vulkan_descriptor_set_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vulkan_descriptor_set_new_wrapped = Interop.downcallHandle(
            "gst_vulkan_descriptor_set_new_wrapped",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_set_ref = Interop.downcallHandle(
            "gst_vulkan_descriptor_set_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vulkan_descriptor_set_unref = Interop.downcallHandle(
            "gst_vulkan_descriptor_set_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanDescriptorSet struct;
        
         /**
         * A {@link VulkanDescriptorSet.Build} object constructs a {@link VulkanDescriptorSet} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanDescriptorSet.allocate();
        }
        
         /**
         * Finish building the {@link VulkanDescriptorSet} struct.
         * @return A new instance of {@code VulkanDescriptorSet} with the fields 
         *         that were set in the Build object.
         */
        public VulkanDescriptorSet construct() {
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
         * the vulkan descriptor set handle
         * @param set The value for the {@code set} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSet(org.vulkan.DescriptorSet set) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set == null ? MemoryAddress.NULL : set.handle()));
            return this;
        }
        
        /**
         * the parent {@link VulkanDescriptorPool} for pooling
         * @param pool The value for the {@code pool} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPool(org.gstreamer.vulkan.VulkanDescriptorPool pool) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
            return this;
        }
        
        /**
         * the parent {@link VulkanDescriptorCache} for reuse
         * @param cache The value for the {@code cache} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCache(org.gstreamer.vulkan.VulkanDescriptorCache cache) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cache"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cache == null ? MemoryAddress.NULL : cache.handle()));
            return this;
        }
        
        /**
         * number of layouts applied to this descriptor set
         * @param nLayouts The value for the {@code nLayouts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNLayouts(int nLayouts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_layouts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nLayouts);
            return this;
        }
        
        /**
         * layouts applied to this descriptor set
         * @param layouts The value for the {@code layouts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLayouts(PointerProxy<org.gstreamer.vulkan.VulkanHandle> layouts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layouts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (layouts == null ? MemoryAddress.NULL : layouts.handle()));
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
