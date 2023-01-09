package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp9DecoderClass extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp9DecoderClass";
    
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
            Interop.valueLayout.ADDRESS.withName("duplicate_picture"),
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
     * Allocate a new {@link Vp9DecoderClass}
     * @return A new, uninitialized @{link Vp9DecoderClass}
     */
    public static Vp9DecoderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Vp9DecoderClass newInstance = new Vp9DecoderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.video.VideoDecoderClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.video.VideoDecoderClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.video.VideoDecoderClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewSequenceCallback} callback.
     */
    @FunctionalInterface
    public interface NewSequenceCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.codecs.Vp9FrameHeader frameHdr);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frameHdr) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.Vp9FrameHeader.fromAddress.marshal(frameHdr, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewSequenceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_sequence}
     * @param newSequence The new value of the field {@code new_sequence}
     */
    public void setNewSequence(NewSequenceCallback newSequence) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sequence"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSequence == null ? MemoryAddress.NULL : newSequence.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewPictureCallback} callback.
     */
    @FunctionalInterface
    public interface NewPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.Vp9Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewPictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_picture}
     * @param newPicture The new value of the field {@code new_picture}
     */
    public void setNewPicture(NewPictureCallback newPicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPicture == null ? MemoryAddress.NULL : newPicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DuplicatePictureCallback} callback.
     */
    @FunctionalInterface
    public interface DuplicatePictureCallback {
    
        org.gstreamer.codecs.Vp9Picture run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.Vp9Picture picture);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DuplicatePictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code duplicate_picture}
     * @param duplicatePicture The new value of the field {@code duplicate_picture}
     */
    public void setDuplicatePicture(DuplicatePictureCallback duplicatePicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duplicate_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (duplicatePicture == null ? MemoryAddress.NULL : duplicatePicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartPictureCallback} callback.
     */
    @FunctionalInterface
    public interface StartPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.codecs.Vp9Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartPictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_picture}
     * @param startPicture The new value of the field {@code start_picture}
     */
    public void setStartPicture(StartPictureCallback startPicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecodePictureCallback} callback.
     */
    @FunctionalInterface
    public interface DecodePictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.codecs.Vp9Picture picture, org.gstreamer.codecs.Vp9Dpb dpb);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress dpb) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null), org.gstreamer.codecs.Vp9Dpb.fromAddress.marshal(dpb, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecodePictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode_picture}
     * @param decodePicture The new value of the field {@code decode_picture}
     */
    public void setDecodePicture(DecodePictureCallback decodePicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decodePicture == null ? MemoryAddress.NULL : decodePicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndPictureCallback} callback.
     */
    @FunctionalInterface
    public interface EndPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.codecs.Vp9Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndPictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_picture}
     * @param endPicture The new value of the field {@code end_picture}
     */
    public void setEndPicture(EndPictureCallback endPicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endPicture == null ? MemoryAddress.NULL : endPicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code OutputPictureCallback} callback.
     */
    @FunctionalInterface
    public interface OutputPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.Vp9Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.Vp9Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.codecs.Vp9Picture.fromAddress.marshal(picture, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OutputPictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code output_picture}
     * @param outputPicture The new value of the field {@code output_picture}
     */
    public void setOutputPicture(OutputPictureCallback outputPicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (outputPicture == null ? MemoryAddress.NULL : outputPicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredOutputDelayCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredOutputDelayCallback {
    
        int run(org.gstreamer.codecs.Vp9Decoder decoder, boolean isLive);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, int isLive) {
            var RESULT = run((org.gstreamer.codecs.Vp9Decoder) Interop.register(decoder, org.gstreamer.codecs.Vp9Decoder.fromAddress).marshal(decoder, null), Marshal.integerToBoolean.marshal(isLive, null).booleanValue());
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredOutputDelayCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_output_delay}
     * @param getPreferredOutputDelay The new value of the field {@code get_preferred_output_delay}
     */
    public void setGetPreferredOutputDelay(GetPreferredOutputDelayCallback getPreferredOutputDelay) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_output_delay"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredOutputDelay == null ? MemoryAddress.NULL : getPreferredOutputDelay.toCallback()));
        }
    }
    
    /**
     * Create a Vp9DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Vp9DecoderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp9DecoderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Vp9DecoderClass(input);
    
    /**
     * A {@link Vp9DecoderClass.Builder} object constructs a {@link Vp9DecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp9DecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp9DecoderClass struct;
        
        private Builder() {
            struct = Vp9DecoderClass.allocate();
        }
        
        /**
         * Finish building the {@link Vp9DecoderClass} struct.
         * @return A new instance of {@code Vp9DecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public Vp9DecoderClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.video.VideoDecoderClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setNewSequence(NewSequenceCallback newSequence) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_sequence"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSequence == null ? MemoryAddress.NULL : newSequence.toCallback()));
                return this;
            }
        }
        
        public Builder setNewPicture(NewPictureCallback newPicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPicture == null ? MemoryAddress.NULL : newPicture.toCallback()));
                return this;
            }
        }
        
        public Builder setDuplicatePicture(DuplicatePictureCallback duplicatePicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("duplicate_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (duplicatePicture == null ? MemoryAddress.NULL : duplicatePicture.toCallback()));
                return this;
            }
        }
        
        public Builder setStartPicture(StartPictureCallback startPicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture.toCallback()));
                return this;
            }
        }
        
        public Builder setDecodePicture(DecodePictureCallback decodePicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decode_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decodePicture == null ? MemoryAddress.NULL : decodePicture.toCallback()));
                return this;
            }
        }
        
        public Builder setEndPicture(EndPictureCallback endPicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endPicture == null ? MemoryAddress.NULL : endPicture.toCallback()));
                return this;
            }
        }
        
        public Builder setOutputPicture(OutputPictureCallback outputPicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("output_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (outputPicture == null ? MemoryAddress.NULL : outputPicture.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredOutputDelay(GetPreferredOutputDelayCallback getPreferredOutputDelay) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_output_delay"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredOutputDelay == null ? MemoryAddress.NULL : getPreferredOutputDelay.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
