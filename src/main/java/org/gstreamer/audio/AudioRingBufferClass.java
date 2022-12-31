package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The vmethods that subclasses can override to implement the ringbuffer.
 */
public class AudioRingBufferClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioRingBufferClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("open_device"),
            Interop.valueLayout.ADDRESS.withName("acquire"),
            Interop.valueLayout.ADDRESS.withName("release"),
            Interop.valueLayout.ADDRESS.withName("close_device"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("pause"),
            Interop.valueLayout.ADDRESS.withName("resume"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("delay"),
            Interop.valueLayout.ADDRESS.withName("activate"),
            Interop.valueLayout.ADDRESS.withName("commit"),
            Interop.valueLayout.ADDRESS.withName("clear_all"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioRingBufferClass}
     * @return A new, uninitialized @{link AudioRingBufferClass}
     */
    public static AudioRingBufferClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioRingBufferClass newInstance = new AudioRingBufferClass(segment.address(), Ownership.NONE);
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
    public interface OpenDeviceCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenDeviceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open_device}
     * @param openDevice The new value of the field {@code open_device}
     */
    public void setOpenDevice(OpenDeviceCallback openDevice) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open_device"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openDevice == null ? MemoryAddress.NULL : openDevice.toCallback()));
    }
    
    @FunctionalInterface
    public interface AcquireCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf, org.gstreamer.audio.AudioRingBufferSpec spec);

        @ApiStatus.Internal default int upcall(MemoryAddress buf, MemoryAddress spec) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE), org.gstreamer.audio.AudioRingBufferSpec.fromAddress.marshal(spec, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
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
    public interface CloseDeviceCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseDeviceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close_device}
     * @param closeDevice The new value of the field {@code close_device}
     */
    public void setCloseDevice(CloseDeviceCallback closeDevice) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close_device"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeDevice == null ? MemoryAddress.NULL : closeDevice.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
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
    public interface PauseCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
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
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
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
        boolean run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
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
    public interface DelayCallback {
        int run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress buf) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
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
    public interface ActivateCallback {
        boolean run(org.gstreamer.audio.AudioRingBuffer buf, boolean active);

        @ApiStatus.Internal default int upcall(MemoryAddress buf, int active) {
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE), Marshal.integerToBoolean.marshal(active, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    @FunctionalInterface
    public interface CommitCallback {
        int run(org.gstreamer.audio.AudioRingBuffer buf, PointerLong sample, byte[] data, int inSamples, int outSamples, Out<Integer> accum);

        @ApiStatus.Internal default int upcall(MemoryAddress buf, MemoryAddress sample, MemoryAddress data, int inSamples, int outSamples, MemoryAddress accum) {
            Out<Integer> accumOUT = new Out<>(accum.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE), new PointerLong(sample), MemorySegment.ofAddress(data, inSamples, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), inSamples, outSamples, accumOUT);
            accum.set(Interop.valueLayout.C_INT, 0, accumOUT.get());
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CommitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code commit}
     * @param commit The new value of the field {@code commit}
     */
    public void setCommit(CommitCallback commit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("commit"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commit == null ? MemoryAddress.NULL : commit.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClearAllCallback {
        void run(org.gstreamer.audio.AudioRingBuffer buf);

        @ApiStatus.Internal default void upcall(MemoryAddress buf) {
            run((org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(buf)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(buf, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClearAllCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clear_all}
     * @param clearAll The new value of the field {@code clear_all}
     */
    public void setClearAll(ClearAllCallback clearAll) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
    }
    
    /**
     * Create a AudioRingBufferClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioRingBufferClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioRingBufferClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioRingBufferClass(input, ownership);
    
    /**
     * A {@link AudioRingBufferClass.Builder} object constructs a {@link AudioRingBufferClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioRingBufferClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioRingBufferClass struct;
        
        private Builder() {
            struct = AudioRingBufferClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioRingBufferClass} struct.
         * @return A new instance of {@code AudioRingBufferClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioRingBufferClass build() {
            return struct;
        }
        
        /**
         * parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setOpenDevice(OpenDeviceCallback openDevice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openDevice == null ? MemoryAddress.NULL : openDevice.toCallback()));
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
        
        public Builder setCloseDevice(CloseDeviceCallback closeDevice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_device"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeDevice == null ? MemoryAddress.NULL : closeDevice.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
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
        
        public Builder setDelay(DelayCallback delay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delay == null ? MemoryAddress.NULL : delay.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
            return this;
        }
        
        public Builder setCommit(CommitCallback commit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commit == null ? MemoryAddress.NULL : commit.toCallback()));
            return this;
        }
        
        public Builder setClearAll(ClearAllCallback clearAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clear_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clearAll == null ? MemoryAddress.NULL : clearAll.toCallback()));
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
