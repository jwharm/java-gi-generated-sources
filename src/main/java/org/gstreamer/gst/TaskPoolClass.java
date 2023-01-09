package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link TaskPoolClass} object.
 */
public class TaskPoolClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTaskPoolClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("prepare"),
            Interop.valueLayout.ADDRESS.withName("cleanup"),
            Interop.valueLayout.ADDRESS.withName("push"),
            Interop.valueLayout.ADDRESS.withName("join"),
            Interop.valueLayout.ADDRESS.withName("dispose_handle"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TaskPoolClass}
     * @return A new, uninitialized @{link TaskPoolClass}
     */
    public static TaskPoolClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TaskPoolClass newInstance = new TaskPoolClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareCallback {
    
        void run(org.gstreamer.gst.TaskPool pool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.TaskPool) Interop.register(pool, org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CleanupCallback} callback.
     */
    @FunctionalInterface
    public interface CleanupCallback {
    
        void run(org.gstreamer.gst.TaskPool pool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.TaskPool) Interop.register(pool, org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CleanupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code cleanup}
     * @param cleanup The new value of the field {@code cleanup}
     */
    public void setCleanup(CleanupCallback cleanup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cleanup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cleanup == null ? MemoryAddress.NULL : cleanup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PushCallback} callback.
     */
    @FunctionalInterface
    public interface PushCallback {
    
        @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gst.TaskPool pool, org.gstreamer.gst.TaskPoolFunction func);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress pool, MemoryAddress func, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.gst.TaskPool) Interop.register(pool, org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, null), null /* Unsupported parameter type */);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PushCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code push}
     * @param push The new value of the field {@code push}
     */
    public void setPush(PushCallback push) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (push == null ? MemoryAddress.NULL : push.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code JoinCallback} callback.
     */
    @FunctionalInterface
    public interface JoinCallback {
    
        void run(org.gstreamer.gst.TaskPool pool, @Nullable java.lang.foreign.MemoryAddress id);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress id) {
            run((org.gstreamer.gst.TaskPool) Interop.register(pool, org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, null), id);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), JoinCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code join}
     * @param join The new value of the field {@code join}
     */
    public void setJoin(JoinCallback join) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("join"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (join == null ? MemoryAddress.NULL : join.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DisposeHandleCallback} callback.
     */
    @FunctionalInterface
    public interface DisposeHandleCallback {
    
        void run(org.gstreamer.gst.TaskPool pool, @Nullable java.lang.foreign.MemoryAddress id);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress id) {
            run((org.gstreamer.gst.TaskPool) Interop.register(pool, org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, null), id);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DisposeHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispose_handle}
     * @param disposeHandle The new value of the field {@code dispose_handle}
     */
    public void setDisposeHandle(DisposeHandleCallback disposeHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (disposeHandle == null ? MemoryAddress.NULL : disposeHandle.toCallback()));
        }
    }
    
    /**
     * Create a TaskPoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TaskPoolClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TaskPoolClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TaskPoolClass(input);
    
    /**
     * A {@link TaskPoolClass.Builder} object constructs a {@link TaskPoolClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TaskPoolClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TaskPoolClass struct;
        
        private Builder() {
            struct = TaskPoolClass.allocate();
        }
        
        /**
         * Finish building the {@link TaskPoolClass} struct.
         * @return A new instance of {@code TaskPoolClass} with the fields 
         *         that were set in the Builder object.
         */
        public TaskPoolClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
                return this;
            }
        }
        
        public Builder setCleanup(CleanupCallback cleanup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cleanup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cleanup == null ? MemoryAddress.NULL : cleanup.toCallback()));
                return this;
            }
        }
        
        public Builder setPush(PushCallback push) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("push"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (push == null ? MemoryAddress.NULL : push.toCallback()));
                return this;
            }
        }
        
        public Builder setJoin(JoinCallback join) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("join"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (join == null ? MemoryAddress.NULL : join.toCallback()));
                return this;
            }
        }
        
        public Builder setDisposeHandle(DisposeHandleCallback disposeHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispose_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (disposeHandle == null ? MemoryAddress.NULL : disposeHandle.toCallback()));
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
