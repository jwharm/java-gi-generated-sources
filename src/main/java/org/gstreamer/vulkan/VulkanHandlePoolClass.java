package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanHandlePoolClass extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanHandlePoolClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("alloc"),
            Interop.valueLayout.ADDRESS.withName("acquire"),
            Interop.valueLayout.ADDRESS.withName("release"),
            Interop.valueLayout.ADDRESS.withName("free"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VulkanHandlePoolClass}
     * @return A new, uninitialized @{link VulkanHandlePoolClass}
     */
    public static VulkanHandlePoolClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanHandlePoolClass newInstance = new VulkanHandlePoolClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.ObjectClass getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.ObjectClass parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    @FunctionalInterface
    public interface AllocCallback {
        @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.vulkan.VulkanHandlePool pool);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.vulkan.VulkanHandlePool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.vulkan.VulkanHandlePool.fromAddress).marshal(pool, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AllocCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc}
     * @param alloc The new value of the field {@code alloc}
     */
    public void setAlloc(AllocCallback alloc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcquireCallback {
        @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.vulkan.VulkanHandlePool pool);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.vulkan.VulkanHandlePool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.vulkan.VulkanHandlePool.fromAddress).marshal(pool, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcquireCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire}
     * @param acquire The new value of the field {@code acquire}
     */
    public void setAcquire(AcquireCallback acquire) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReleaseCallback {
        void run(org.gstreamer.vulkan.VulkanHandlePool pool, @Nullable java.lang.foreign.MemoryAddress handle);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress handle) {
            run((org.gstreamer.vulkan.VulkanHandlePool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.vulkan.VulkanHandlePool.fromAddress).marshal(pool, Ownership.NONE), handle);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReleaseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release}
     * @param release The new value of the field {@code release}
     */
    public void setRelease(ReleaseCallback release) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release.toCallback()));
    }
    
    @FunctionalInterface
    public interface FreeCallback {
        void run(org.gstreamer.vulkan.VulkanHandlePool pool, @Nullable java.lang.foreign.MemoryAddress handle);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress handle) {
            run((org.gstreamer.vulkan.VulkanHandlePool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.vulkan.VulkanHandlePool.fromAddress).marshal(pool, Ownership.NONE), handle);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FreeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(FreeCallback free) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
    }
    
    /**
     * Create a VulkanHandlePoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanHandlePoolClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanHandlePoolClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanHandlePoolClass(input, ownership);
    
    /**
     * A {@link VulkanHandlePoolClass.Builder} object constructs a {@link VulkanHandlePoolClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanHandlePoolClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanHandlePoolClass struct;
        
        private Builder() {
            struct = VulkanHandlePoolClass.allocate();
        }
        
         /**
         * Finish building the {@link VulkanHandlePoolClass} struct.
         * @return A new instance of {@code VulkanHandlePoolClass} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanHandlePoolClass build() {
            return struct;
        }
        
        /**
         * the parent {@link org.gstreamer.gst.ObjectClass}
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gstreamer.gst.ObjectClass parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setAlloc(AllocCallback alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
            return this;
        }
        
        public Builder setAcquire(AcquireCallback acquire) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquire == null ? MemoryAddress.NULL : acquire.toCallback()));
            return this;
        }
        
        public Builder setRelease(ReleaseCallback release) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (release == null ? MemoryAddress.NULL : release.toCallback()));
            return this;
        }
        
        public Builder setFree(FreeCallback free) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
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
