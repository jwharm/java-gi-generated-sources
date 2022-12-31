package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioSrc} class. Override the vmethod to implement
 * functionality.
 */
public class AudioSrcClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.audio.AudioBaseSrcClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("prepare"),
            Interop.valueLayout.ADDRESS.withName("unprepare"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("read"),
            Interop.valueLayout.ADDRESS.withName("delay"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioSrcClass}
     * @return A new, uninitialized @{link AudioSrcClass}
     */
    public static AudioSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioSrcClass newInstance = new AudioSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.audio.AudioBaseSrcClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.audio.AudioBaseSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.audio.AudioBaseSrcClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.audio.AudioSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE));
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
        boolean run(org.gstreamer.audio.AudioSrc src, org.gstreamer.audio.AudioRingBufferSpec spec);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress spec) {
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.audio.AudioRingBufferSpec.fromAddress.marshal(spec, Ownership.NONE));
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
        boolean run(org.gstreamer.audio.AudioSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE));
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
        boolean run(org.gstreamer.audio.AudioSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE));
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
    public interface ReadCallback {
        int run(org.gstreamer.audio.AudioSrc src, int length, org.gstreamer.gst.ClockTime timestamp);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress data, int length, MemoryAddress timestamp) {
            org.gstreamer.gst.ClockTime timestampALIAS = new org.gstreamer.gst.ClockTime(timestamp.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE), length, timestampALIAS);
            timestamp.set(Interop.valueLayout.C_LONG, 0, timestampALIAS.getValue());
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read}
     * @param read The new value of the field {@code read}
     */
    public void setRead(ReadCallback read) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
    }
    
    @FunctionalInterface
    public interface DelayCallback {
        int run(org.gstreamer.audio.AudioSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE));
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
        void run(org.gstreamer.audio.AudioSrc src);

        @ApiStatus.Internal default void upcall(MemoryAddress src) {
            run((org.gstreamer.audio.AudioSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.audio.AudioSrc.fromAddress).marshal(src, Ownership.NONE));
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
    
    /**
     * Create a AudioSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioSrcClass(input, ownership);
    
    /**
     * A {@link AudioSrcClass.Builder} object constructs a {@link AudioSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioSrcClass struct;
        
        private Builder() {
            struct = AudioSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioSrcClass} struct.
         * @return A new instance of {@code AudioSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioSrcClass build() {
            return struct;
        }
        
        /**
         * the parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.audio.AudioBaseSrcClass parentClass) {
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
        
        public Builder setRead(ReadCallback read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
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
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
