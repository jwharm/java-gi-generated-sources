package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Allocator} is used to create new memory.
 */
public class AllocatorClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAllocatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("object_class"),
            Interop.valueLayout.ADDRESS.withName("alloc"),
            Interop.valueLayout.ADDRESS.withName("free"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AllocatorClass}
     * @return A new, uninitialized @{link AllocatorClass}
     */
    public static AllocatorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AllocatorClass newInstance = new AllocatorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gst.ObjectClass getObjectClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code object_class}
     * @param objectClass The new value of the field {@code object_class}
     */
    public void setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AllocCallback} callback.
     */
    @FunctionalInterface
    public interface AllocCallback {
    
        @Nullable org.gstreamer.gst.Memory run(@Nullable org.gstreamer.gst.Allocator allocator, long size, @Nullable org.gstreamer.gst.AllocationParams params);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress allocator, long size, MemoryAddress params) {
            var RESULT = run((org.gstreamer.gst.Allocator) Interop.register(allocator, org.gstreamer.gst.Allocator.fromAddress).marshal(allocator, null), size, org.gstreamer.gst.AllocationParams.fromAddress.marshal(params, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AllocCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc}
     * @param alloc The new value of the field {@code alloc}
     */
    public void setAlloc(AllocCallback alloc) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FreeCallback} callback.
     */
    @FunctionalInterface
    public interface FreeCallback {
    
        void run(org.gstreamer.gst.Allocator allocator, org.gstreamer.gst.Memory memory);
        
        @ApiStatus.Internal default void upcall(MemoryAddress allocator, MemoryAddress memory) {
            run((org.gstreamer.gst.Allocator) Interop.register(allocator, org.gstreamer.gst.Allocator.fromAddress).marshal(allocator, null), org.gstreamer.gst.Memory.fromAddress.marshal(memory, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FreeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free}
     * @param free The new value of the field {@code free}
     */
    public void setFree(FreeCallback free) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
        }
    }
    
    /**
     * Create a AllocatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AllocatorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AllocatorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AllocatorClass(input);
    
    /**
     * A {@link AllocatorClass.Builder} object constructs a {@link AllocatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AllocatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AllocatorClass struct;
        
        private Builder() {
            struct = AllocatorClass.allocate();
        }
        
        /**
         * Finish building the {@link AllocatorClass} struct.
         * @return A new instance of {@code AllocatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public AllocatorClass build() {
            return struct;
        }
        
        /**
         * Object parent class
         * @param objectClass The value for the {@code objectClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
                return this;
            }
        }
        
        public Builder setAlloc(AllocCallback alloc) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
                return this;
            }
        }
        
        public Builder setFree(FreeCallback free) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (free == null ? MemoryAddress.NULL : free.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
