package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioSinkClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSinkClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.audio.AudioBaseSinkClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("prepare"),
            Interop.valueLayout.ADDRESS.withName("unprepare"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("write"),
            Interop.valueLayout.ADDRESS.withName("delay"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            Interop.valueLayout.ADDRESS.withName("pause"),
            Interop.valueLayout.ADDRESS.withName("resume"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("extension")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioSinkClass}
     * @return A new, uninitialized @{link AudioSinkClass}
     */
    public static AudioSinkClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSinkClass newInstance = new AudioSinkClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.audio.AudioBaseSinkClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.audio.AudioBaseSinkClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.audio.AudioBaseSinkClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareCallback {
        boolean run(org.gstreamer.audio.AudioSink sink, org.gstreamer.audio.AudioRingBufferSpec spec);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress spec) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.audio.AudioRingBufferSpec.fromAddress.marshal(spec, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface UnprepareCallback {
        boolean run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnprepareCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unprepare}
     * @param unprepare The new value of the field {@code unprepare}
     */
    public void setUnprepare(UnprepareCallback unprepare) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unprepare"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unprepare == null ? MemoryAddress.NULL : unprepare.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        boolean run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteCallback {
        int run(org.gstreamer.audio.AudioSink sink, int length);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress data, int length) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE), length);
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write}
     * @param write The new value of the field {@code write}
     */
    public void setWrite(WriteCallback write) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
    }
    
    @FunctionalInterface
    public interface DelayCallback {
        int run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DelayCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delay}
     * @param delay The new value of the field {@code delay}
     */
    public void setDelay(DelayCallback delay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delay"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delay == null ? MemoryAddress.NULL : delay.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResetCallback {
        void run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
    }
    
    @FunctionalInterface
    public interface PauseCallback {
        void run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PauseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pause}
     * @param pause The new value of the field {@code pause}
     */
    public void setPause(PauseCallback pause) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pause"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pause == null ? MemoryAddress.NULL : pause.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResumeCallback {
        void run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResumeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code resume}
     * @param resume The new value of the field {@code resume}
     */
    public void setResume(ResumeCallback resume) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("resume"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resume == null ? MemoryAddress.NULL : resume.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        void run(org.gstreamer.audio.AudioSink sink);

        @ApiStatus.Internal default void upcall(MemoryAddress sink) {
            run((org.gstreamer.audio.AudioSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioSink.fromAddress).marshal(sink, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
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
    
    /**
     * Get the value of the field {@code extension}
     * @return The value of the field {@code extension}
     */
    public org.gstreamer.audio.AudioSinkClassExtension getExtension() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extension"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioSinkClassExtension.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code extension}
     * @param extension The new value of the field {@code extension}
     */
    public void setExtension(org.gstreamer.audio.AudioSinkClassExtension extension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extension == null ? MemoryAddress.NULL : extension.handle()));
    }
    
    /**
     * Create a AudioSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioSinkClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSinkClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioSinkClass(input, ownership);
    
    /**
     * A {@link AudioSinkClass.Builder} object constructs a {@link AudioSinkClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioSinkClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioSinkClass struct;
        
        private Builder() {
            struct = AudioSinkClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioSinkClass} struct.
         * @return A new instance of {@code AudioSinkClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioSinkClass build() {
            return struct;
        }
        
        /**
         * the parent class structure.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.audio.AudioBaseSinkClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
            return this;
        }
        
        public Builder setUnprepare(UnprepareCallback unprepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unprepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unprepare == null ? MemoryAddress.NULL : unprepare.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setWrite(WriteCallback write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
            return this;
        }
        
        public Builder setDelay(DelayCallback delay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delay == null ? MemoryAddress.NULL : delay.toCallback()));
            return this;
        }
        
        public Builder setReset(ResetCallback reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
            return this;
        }
        
        public Builder setPause(PauseCallback pause) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pause"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pause == null ? MemoryAddress.NULL : pause.toCallback()));
            return this;
        }
        
        public Builder setResume(ResumeCallback resume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resume == null ? MemoryAddress.NULL : resume.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        /**
         * class extension structure. Since: 1.18
         * @param extension The value for the {@code extension} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtension(org.gstreamer.audio.AudioSinkClassExtension extension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extension == null ? MemoryAddress.NULL : extension.handle()));
            return this;
        }
    }
}
