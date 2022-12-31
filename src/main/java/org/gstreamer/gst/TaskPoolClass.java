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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TaskPoolClass newInstance = new TaskPoolClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface PrepareCallback {
        void run(org.gstreamer.gst.TaskPool pool);

        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
    }
    
    @FunctionalInterface
    public interface CleanupCallback {
        void run(org.gstreamer.gst.TaskPool pool);

        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CleanupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code cleanup}
     * @param cleanup The new value of the field {@code cleanup}
     */
    public void setCleanup(CleanupCallback cleanup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("cleanup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cleanup == null ? MemoryAddress.NULL : cleanup.toCallback()));
    }
    
    @FunctionalInterface
    public interface PushCallback {
        @Nullable java.lang.foreign.MemoryAddress run(org.gstreamer.gst.TaskPool pool, org.gstreamer.gst.TaskPoolFunction func);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress pool, MemoryAddress func, MemoryAddress userData) {
            var RESULT = run((org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, Ownership.NONE), null /* Unsupported parameter type */);
            return RESULT == null ? MemoryAddress.NULL.address() : ((Addressable) RESULT).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code push}
     * @param push The new value of the field {@code push}
     */
    public void setPush(PushCallback push) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("push"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (push == null ? MemoryAddress.NULL : push.toCallback()));
    }
    
    @FunctionalInterface
    public interface JoinCallback {
        void run(org.gstreamer.gst.TaskPool pool, @Nullable java.lang.foreign.MemoryAddress id);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress id) {
            run((org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, Ownership.NONE), id);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(JoinCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code join}
     * @param join The new value of the field {@code join}
     */
    public void setJoin(JoinCallback join) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("join"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (join == null ? MemoryAddress.NULL : join.toCallback()));
    }
    
    @FunctionalInterface
    public interface DisposeHandleCallback {
        void run(org.gstreamer.gst.TaskPool pool, @Nullable java.lang.foreign.MemoryAddress id);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress id) {
            run((org.gstreamer.gst.TaskPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.TaskPool.fromAddress).marshal(pool, Ownership.NONE), id);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DisposeHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispose_handle}
     * @param disposeHandle The new value of the field {@code dispose_handle}
     */
    public void setDisposeHandle(DisposeHandleCallback disposeHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispose_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (disposeHandle == null ? MemoryAddress.NULL : disposeHandle.toCallback()));
    }
    
    /**
     * Create a TaskPoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TaskPoolClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TaskPoolClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TaskPoolClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
            return this;
        }
        
        public Builder setCleanup(CleanupCallback cleanup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cleanup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cleanup == null ? MemoryAddress.NULL : cleanup.toCallback()));
            return this;
        }
        
        public Builder setPush(PushCallback push) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("push"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (push == null ? MemoryAddress.NULL : push.toCallback()));
            return this;
        }
        
        public Builder setJoin(JoinCallback join) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("join"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (join == null ? MemoryAddress.NULL : join.toCallback()));
            return this;
        }
        
        public Builder setDisposeHandle(DisposeHandleCallback disposeHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (disposeHandle == null ? MemoryAddress.NULL : disposeHandle.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
