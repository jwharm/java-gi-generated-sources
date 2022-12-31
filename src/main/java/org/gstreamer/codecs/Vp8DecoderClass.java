package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp8DecoderClass extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp8DecoderClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoDecoderClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("new_sequence"),
            Interop.valueLayout.ADDRESS.withName("new_picture"),
            Interop.valueLayout.ADDRESS.withName("start_picture"),
            Interop.valueLayout.ADDRESS.withName("decode_picture"),
            Interop.valueLayout.ADDRESS.withName("end_picture"),
            Interop.valueLayout.ADDRESS.withName("output_picture"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_output_delay"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp8DecoderClass}
     * @return A new, uninitialized @{link Vp8DecoderClass}
     */
    public static Vp8DecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp8DecoderClass newInstance = new Vp8DecoderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.video.VideoDecoderClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.video.VideoDecoderClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.video.VideoDecoderClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface NewSequenceCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, java.lang.foreign.MemoryAddress frameHdr);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frameHdr) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), frameHdr);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NewSequenceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_sequence}
     * @param newSequence The new value of the field {@code new_sequence}
     */
    public void setNewSequence(NewSequenceCallback newSequence) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("new_sequence"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newSequence == null ? MemoryAddress.NULL : newSequence.toCallback()));
    }
    
    @FunctionalInterface
    public interface NewPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.Vp8Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.codecs.Vp8Picture.fromAddress.marshal(picture, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NewPictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_picture}
     * @param newPicture The new value of the field {@code new_picture}
     */
    public void setNewPicture(NewPictureCallback newPicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("new_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newPicture == null ? MemoryAddress.NULL : newPicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, org.gstreamer.codecs.Vp8Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.Vp8Picture.fromAddress.marshal(picture, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartPictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_picture}
     * @param startPicture The new value of the field {@code start_picture}
     */
    public void setStartPicture(StartPictureCallback startPicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface DecodePictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, org.gstreamer.codecs.Vp8Picture picture, java.lang.foreign.MemoryAddress parser);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress parser) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.Vp8Picture.fromAddress.marshal(picture, Ownership.NONE), parser);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecodePictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode_picture}
     * @param decodePicture The new value of the field {@code decode_picture}
     */
    public void setDecodePicture(DecodePictureCallback decodePicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decode_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodePicture == null ? MemoryAddress.NULL : decodePicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, org.gstreamer.codecs.Vp8Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.Vp8Picture.fromAddress.marshal(picture, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EndPictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_picture}
     * @param endPicture The new value of the field {@code end_picture}
     */
    public void setEndPicture(EndPictureCallback endPicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("end_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPicture == null ? MemoryAddress.NULL : endPicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface OutputPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp8Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.Vp8Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.codecs.Vp8Picture.fromAddress.marshal(picture, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OutputPictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code output_picture}
     * @param outputPicture The new value of the field {@code output_picture}
     */
    public void setOutputPicture(OutputPictureCallback outputPicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("output_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outputPicture == null ? MemoryAddress.NULL : outputPicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredOutputDelayCallback {
        int run(org.gstreamer.codecs.Vp8Decoder decoder, boolean isLive);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, int isLive) {
            var RESULT = run((org.gstreamer.codecs.Vp8Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.Vp8Decoder.fromAddress).marshal(decoder, Ownership.NONE), Marshal.integerToBoolean.marshal(isLive, null).booleanValue());
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredOutputDelayCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_output_delay}
     * @param getPreferredOutputDelay The new value of the field {@code get_preferred_output_delay}
     */
    public void setGetPreferredOutputDelay(GetPreferredOutputDelayCallback getPreferredOutputDelay) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_output_delay"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredOutputDelay == null ? MemoryAddress.NULL : getPreferredOutputDelay.toCallback()));
    }
    
    /**
     * Create a Vp8DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vp8DecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp8DecoderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vp8DecoderClass(input, ownership);
    
    /**
     * A {@link Vp8DecoderClass.Builder} object constructs a {@link Vp8DecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp8DecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp8DecoderClass struct;
        
        private Builder() {
            struct = Vp8DecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link Vp8DecoderClass} struct.
         * @return A new instance of {@code Vp8DecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public Vp8DecoderClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.video.VideoDecoderClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setNewSequence(NewSequenceCallback newSequence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sequence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newSequence == null ? MemoryAddress.NULL : newSequence.toCallback()));
            return this;
        }
        
        public Builder setNewPicture(NewPictureCallback newPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newPicture == null ? MemoryAddress.NULL : newPicture.toCallback()));
            return this;
        }
        
        public Builder setStartPicture(StartPictureCallback startPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture.toCallback()));
            return this;
        }
        
        public Builder setDecodePicture(DecodePictureCallback decodePicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodePicture == null ? MemoryAddress.NULL : decodePicture.toCallback()));
            return this;
        }
        
        public Builder setEndPicture(EndPictureCallback endPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPicture == null ? MemoryAddress.NULL : endPicture.toCallback()));
            return this;
        }
        
        public Builder setOutputPicture(OutputPictureCallback outputPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outputPicture == null ? MemoryAddress.NULL : outputPicture.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredOutputDelay(GetPreferredOutputDelayCallback getPreferredOutputDelay) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_output_delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredOutputDelay == null ? MemoryAddress.NULL : getPreferredOutputDelay.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
