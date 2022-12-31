package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link BufferPool} class.
 */
public class BufferPoolClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferPoolClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("object_class"),
            Interop.valueLayout.ADDRESS.withName("get_options"),
            Interop.valueLayout.ADDRESS.withName("set_config"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("acquire_buffer"),
            Interop.valueLayout.ADDRESS.withName("alloc_buffer"),
            Interop.valueLayout.ADDRESS.withName("reset_buffer"),
            Interop.valueLayout.ADDRESS.withName("release_buffer"),
            Interop.valueLayout.ADDRESS.withName("free_buffer"),
            Interop.valueLayout.ADDRESS.withName("flush_start"),
            Interop.valueLayout.ADDRESS.withName("flush_stop"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BufferPoolClass}
     * @return A new, uninitialized @{link BufferPoolClass}
     */
    public static BufferPoolClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BufferPoolClass newInstance = new BufferPoolClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code object_class}
     * @return The value of the field {@code object_class}
     */
    public org.gstreamer.gst.ObjectClass getObjectClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("object_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code object_class}
     * @param objectClass The new value of the field {@code object_class}
     */
    public void setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetOptionsCallback {
        java.lang.String[] run(org.gstreamer.gst.BufferPool pool);

        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetOptionsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_options}
     * @param getOptions The new value of the field {@code get_options}
     */
    public void setGetOptions(GetOptionsCallback getOptions) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_options"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getOptions == null ? MemoryAddress.NULL : getOptions.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetConfigCallback {
        boolean run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Structure config);

        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress config) {
            var RESULT = run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(config, Ownership.FULL));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetConfigCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_config}
     * @param setConfig The new value of the field {@code set_config}
     */
    public void setSetConfig(SetConfigCallback setConfig) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_config"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setConfig == null ? MemoryAddress.NULL : setConfig.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.gst.BufferPool pool);

        @ApiStatus.Internal default int upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        boolean run(org.gstreamer.gst.BufferPool pool);

        @ApiStatus.Internal default int upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcquireBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.BufferPool pool, Out<org.gstreamer.gst.Buffer> buffer, @Nullable org.gstreamer.gst.BufferPoolAcquireParams params);

        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress buffer, MemoryAddress params) {
            Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
            var RESULT = run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), bufferOUT, org.gstreamer.gst.BufferPoolAcquireParams.fromAddress.marshal(params, Ownership.NONE));
            buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcquireBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire_buffer}
     * @param acquireBuffer The new value of the field {@code acquire_buffer}
     */
    public void setAcquireBuffer(AcquireBufferCallback acquireBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("acquire_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireBuffer == null ? MemoryAddress.NULL : acquireBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface AllocBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.BufferPool pool, Out<org.gstreamer.gst.Buffer> buffer, @Nullable org.gstreamer.gst.BufferPoolAcquireParams params);

        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress buffer, MemoryAddress params) {
            Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
            var RESULT = run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), bufferOUT, org.gstreamer.gst.BufferPoolAcquireParams.fromAddress.marshal(params, Ownership.NONE));
            buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AllocBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc_buffer}
     * @param allocBuffer The new value of the field {@code alloc_buffer}
     */
    public void setAllocBuffer(AllocBufferCallback allocBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocBuffer == null ? MemoryAddress.NULL : allocBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResetBufferCallback {
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResetBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset_buffer}
     * @param resetBuffer The new value of the field {@code reset_buffer}
     */
    public void setResetBuffer(ResetBufferCallback resetBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resetBuffer == null ? MemoryAddress.NULL : resetBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReleaseBufferCallback {
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReleaseBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release_buffer}
     * @param releaseBuffer The new value of the field {@code release_buffer}
     */
    public void setReleaseBuffer(ReleaseBufferCallback releaseBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("release_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseBuffer == null ? MemoryAddress.NULL : releaseBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface FreeBufferCallback {
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FreeBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free_buffer}
     * @param freeBuffer The new value of the field {@code free_buffer}
     */
    public void setFreeBuffer(FreeBufferCallback freeBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("free_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeBuffer == null ? MemoryAddress.NULL : freeBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushStartCallback {
        void run(org.gstreamer.gst.BufferPool pool);

        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_start}
     * @param flushStart The new value of the field {@code flush_start}
     */
    public void setFlushStart(FlushStartCallback flushStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStart == null ? MemoryAddress.NULL : flushStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushStopCallback {
        void run(org.gstreamer.gst.BufferPool pool);

        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.BufferPool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pool)), org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushStopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_stop}
     * @param flushStop The new value of the field {@code flush_stop}
     */
    public void setFlushStop(FlushStopCallback flushStop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush_stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStop == null ? MemoryAddress.NULL : flushStop.toCallback()));
    }
    
    /**
     * Create a BufferPoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BufferPoolClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferPoolClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BufferPoolClass(input, ownership);
    
    /**
     * A {@link BufferPoolClass.Builder} object constructs a {@link BufferPoolClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BufferPoolClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BufferPoolClass struct;
        
        private Builder() {
            struct = BufferPoolClass.allocate();
        }
        
         /**
         * Finish building the {@link BufferPoolClass} struct.
         * @return A new instance of {@code BufferPoolClass} with the fields 
         *         that were set in the Builder object.
         */
        public BufferPoolClass build() {
            return struct;
        }
        
        /**
         * Object parent class
         * @param objectClass The value for the {@code objectClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setObjectClass(org.gstreamer.gst.ObjectClass objectClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
            return this;
        }
        
        public Builder setGetOptions(GetOptionsCallback getOptions) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getOptions == null ? MemoryAddress.NULL : getOptions.toCallback()));
            return this;
        }
        
        public Builder setSetConfig(SetConfigCallback setConfig) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setConfig == null ? MemoryAddress.NULL : setConfig.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setAcquireBuffer(AcquireBufferCallback acquireBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acquireBuffer == null ? MemoryAddress.NULL : acquireBuffer.toCallback()));
            return this;
        }
        
        public Builder setAllocBuffer(AllocBufferCallback allocBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocBuffer == null ? MemoryAddress.NULL : allocBuffer.toCallback()));
            return this;
        }
        
        public Builder setResetBuffer(ResetBufferCallback resetBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resetBuffer == null ? MemoryAddress.NULL : resetBuffer.toCallback()));
            return this;
        }
        
        public Builder setReleaseBuffer(ReleaseBufferCallback releaseBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (releaseBuffer == null ? MemoryAddress.NULL : releaseBuffer.toCallback()));
            return this;
        }
        
        public Builder setFreeBuffer(FreeBufferCallback freeBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (freeBuffer == null ? MemoryAddress.NULL : freeBuffer.toCallback()));
            return this;
        }
        
        public Builder setFlushStart(FlushStartCallback flushStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStart == null ? MemoryAddress.NULL : flushStart.toCallback()));
            return this;
        }
        
        public Builder setFlushStop(FlushStopCallback flushStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushStop == null ? MemoryAddress.NULL : flushStop.toCallback()));
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
