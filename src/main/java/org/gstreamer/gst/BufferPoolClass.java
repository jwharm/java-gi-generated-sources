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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BufferPoolClass newInstance = new BufferPoolClass(segment.address());
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
     * Functional interface declaration of the {@code GetOptionsCallback} callback.
     */
    @FunctionalInterface
    public interface GetOptionsCallback {
    
        java.lang.String[] run(org.gstreamer.gst.BufferPool pool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetOptionsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_options}
     * @param getOptions The new value of the field {@code get_options}
     */
    public void setGetOptions(GetOptionsCallback getOptions) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_options"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getOptions == null ? MemoryAddress.NULL : getOptions.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetConfigCallback} callback.
     */
    @FunctionalInterface
    public interface SetConfigCallback {
    
        boolean run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Structure config);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress config) {
            var RESULT = run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), org.gstreamer.gst.Structure.fromAddress.marshal(config, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetConfigCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_config}
     * @param setConfig The new value of the field {@code set_config}
     */
    public void setSetConfig(SetConfigCallback setConfig) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_config"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setConfig == null ? MemoryAddress.NULL : setConfig.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartCallback} callback.
     */
    @FunctionalInterface
    public interface StartCallback {
    
        boolean run(org.gstreamer.gst.BufferPool pool);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopCallback} callback.
     */
    @FunctionalInterface
    public interface StopCallback {
    
        boolean run(org.gstreamer.gst.BufferPool pool);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pool) {
            var RESULT = run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AcquireBufferCallback} callback.
     */
    @FunctionalInterface
    public interface AcquireBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.BufferPool pool, Out<org.gstreamer.gst.Buffer> buffer, @Nullable org.gstreamer.gst.BufferPoolAcquireParams params);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress buffer, MemoryAddress params) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
                var RESULT = run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), bufferOUT, org.gstreamer.gst.BufferPoolAcquireParams.fromAddress.marshal(params, null));
                buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AcquireBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code acquire_buffer}
     * @param acquireBuffer The new value of the field {@code acquire_buffer}
     */
    public void setAcquireBuffer(AcquireBufferCallback acquireBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("acquire_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acquireBuffer == null ? MemoryAddress.NULL : acquireBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AllocBufferCallback} callback.
     */
    @FunctionalInterface
    public interface AllocBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.gst.BufferPool pool, Out<org.gstreamer.gst.Buffer> buffer, @Nullable org.gstreamer.gst.BufferPoolAcquireParams params);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pool, MemoryAddress buffer, MemoryAddress params) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<org.gstreamer.gst.Buffer> bufferOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
                var RESULT = run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), bufferOUT, org.gstreamer.gst.BufferPoolAcquireParams.fromAddress.marshal(params, null));
                buffer.set(Interop.valueLayout.ADDRESS, 0, bufferOUT.get().handle());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AllocBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc_buffer}
     * @param allocBuffer The new value of the field {@code alloc_buffer}
     */
    public void setAllocBuffer(AllocBufferCallback allocBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocBuffer == null ? MemoryAddress.NULL : allocBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResetBufferCallback} callback.
     */
    @FunctionalInterface
    public interface ResetBufferCallback {
    
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResetBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset_buffer}
     * @param resetBuffer The new value of the field {@code reset_buffer}
     */
    public void setResetBuffer(ResetBufferCallback resetBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resetBuffer == null ? MemoryAddress.NULL : resetBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReleaseBufferCallback} callback.
     */
    @FunctionalInterface
    public interface ReleaseBufferCallback {
    
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReleaseBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code release_buffer}
     * @param releaseBuffer The new value of the field {@code release_buffer}
     */
    public void setReleaseBuffer(ReleaseBufferCallback releaseBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("release_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releaseBuffer == null ? MemoryAddress.NULL : releaseBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FreeBufferCallback} callback.
     */
    @FunctionalInterface
    public interface FreeBufferCallback {
    
        void run(org.gstreamer.gst.BufferPool pool, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool, MemoryAddress buffer) {
            run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FreeBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code free_buffer}
     * @param freeBuffer The new value of the field {@code free_buffer}
     */
    public void setFreeBuffer(FreeBufferCallback freeBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("free_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeBuffer == null ? MemoryAddress.NULL : freeBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FlushStartCallback} callback.
     */
    @FunctionalInterface
    public interface FlushStartCallback {
    
        void run(org.gstreamer.gst.BufferPool pool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlushStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_start}
     * @param flushStart The new value of the field {@code flush_start}
     */
    public void setFlushStart(FlushStartCallback flushStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flushStart == null ? MemoryAddress.NULL : flushStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FlushStopCallback} callback.
     */
    @FunctionalInterface
    public interface FlushStopCallback {
    
        void run(org.gstreamer.gst.BufferPool pool);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pool) {
            run((org.gstreamer.gst.BufferPool) Interop.register(pool, org.gstreamer.gst.BufferPool.fromAddress).marshal(pool, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlushStopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush_stop}
     * @param flushStop The new value of the field {@code flush_stop}
     */
    public void setFlushStop(FlushStopCallback flushStop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flushStop == null ? MemoryAddress.NULL : flushStop.toCallback()));
        }
    }
    
    /**
     * Create a BufferPoolClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferPoolClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferPoolClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferPoolClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("object_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (objectClass == null ? MemoryAddress.NULL : objectClass.handle()));
                return this;
            }
        }
        
        public Builder setGetOptions(GetOptionsCallback getOptions) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_options"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getOptions == null ? MemoryAddress.NULL : getOptions.toCallback()));
                return this;
            }
        }
        
        public Builder setSetConfig(SetConfigCallback setConfig) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_config"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setConfig == null ? MemoryAddress.NULL : setConfig.toCallback()));
                return this;
            }
        }
        
        public Builder setStart(StartCallback start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
                return this;
            }
        }
        
        public Builder setStop(StopCallback stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
                return this;
            }
        }
        
        public Builder setAcquireBuffer(AcquireBufferCallback acquireBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("acquire_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acquireBuffer == null ? MemoryAddress.NULL : acquireBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setAllocBuffer(AllocBufferCallback allocBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("alloc_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocBuffer == null ? MemoryAddress.NULL : allocBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setResetBuffer(ResetBufferCallback resetBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reset_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (resetBuffer == null ? MemoryAddress.NULL : resetBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setReleaseBuffer(ReleaseBufferCallback releaseBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("release_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (releaseBuffer == null ? MemoryAddress.NULL : releaseBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setFreeBuffer(FreeBufferCallback freeBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("free_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (freeBuffer == null ? MemoryAddress.NULL : freeBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setFlushStart(FlushStartCallback flushStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flush_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flushStart == null ? MemoryAddress.NULL : flushStart.toCallback()));
                return this;
            }
        }
        
        public Builder setFlushStop(FlushStopCallback flushStop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flush_stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flushStop == null ? MemoryAddress.NULL : flushStop.toCallback()));
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
