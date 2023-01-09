package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The opaque {@link H264DecoderClass} data structure.
 */
public class H264DecoderClass extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264DecoderClass";
    
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
            Interop.valueLayout.ADDRESS.withName("new_field_picture"),
            Interop.valueLayout.ADDRESS.withName("start_picture"),
            Interop.valueLayout.ADDRESS.withName("decode_slice"),
            Interop.valueLayout.ADDRESS.withName("end_picture"),
            Interop.valueLayout.ADDRESS.withName("output_picture"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_output_delay"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H264DecoderClass}
     * @return A new, uninitialized @{link H264DecoderClass}
     */
    public static H264DecoderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        H264DecoderClass newInstance = new H264DecoderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code NewSequenceCallback} callback.
     */
    @FunctionalInterface
    public interface NewSequenceCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, java.lang.foreign.MemoryAddress sps, int maxDpbSize);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress sps, int maxDpbSize) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), sps, maxDpbSize);
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
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
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.H264Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(picture, null));
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
     * Functional interface declaration of the {@code NewFieldPictureCallback} callback.
     */
    @FunctionalInterface
    public interface NewFieldPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.codecs.H264Picture firstField, org.gstreamer.codecs.H264Picture secondField);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress firstField, MemoryAddress secondField) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(firstField, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(secondField, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewFieldPictureCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_field_picture}
     * @param newFieldPicture The new value of the field {@code new_field_picture}
     */
    public void setNewFieldPicture(NewFieldPictureCallback newFieldPicture) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_field_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newFieldPicture == null ? MemoryAddress.NULL : newFieldPicture.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartPictureCallback} callback.
     */
    @FunctionalInterface
    public interface StartPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.codecs.H264Picture picture, org.gstreamer.codecs.H264Slice slice, org.gstreamer.codecs.H264Dpb dpb);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress slice, MemoryAddress dpb) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(picture, null), org.gstreamer.codecs.H264Slice.fromAddress.marshal(slice, null), org.gstreamer.codecs.H264Dpb.fromAddress.marshal(dpb, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Functional interface declaration of the {@code DecodeSliceCallback} callback.
     */
    @FunctionalInterface
    public interface DecodeSliceCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.codecs.H264Picture picture, org.gstreamer.codecs.H264Slice slice, PointerProxy<org.gstreamer.codecs.H264Picture> refPicList0, PointerProxy<org.gstreamer.codecs.H264Picture> refPicList1);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress slice, MemoryAddress refPicList0, MemoryAddress refPicList1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(picture, null), org.gstreamer.codecs.H264Slice.fromAddress.marshal(slice, null), new PointerProxy<org.gstreamer.codecs.H264Picture>(refPicList0, org.gstreamer.codecs.H264Picture.fromAddress), new PointerProxy<org.gstreamer.codecs.H264Picture>(refPicList1, org.gstreamer.codecs.H264Picture.fromAddress));
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecodeSliceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode_slice}
     * @param decodeSlice The new value of the field {@code decode_slice}
     */
    public void setDecodeSlice(DecodeSliceCallback decodeSlice) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_slice"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decodeSlice == null ? MemoryAddress.NULL : decodeSlice.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndPictureCallback} callback.
     */
    @FunctionalInterface
    public interface EndPictureCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.codecs.H264Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(picture, null));
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
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H264Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.H264Picture picture);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.codecs.H264Picture.fromAddress.marshal(picture, null));
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
    
        int run(org.gstreamer.codecs.H264Decoder decoder, boolean live);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, int live) {
            var RESULT = run((org.gstreamer.codecs.H264Decoder) Interop.register(decoder, org.gstreamer.codecs.H264Decoder.fromAddress).marshal(decoder, null), Marshal.integerToBoolean.marshal(live, null).booleanValue());
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
     * Create a H264DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected H264DecoderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264DecoderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new H264DecoderClass(input);
    
    /**
     * A {@link H264DecoderClass.Builder} object constructs a {@link H264DecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link H264DecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final H264DecoderClass struct;
        
        private Builder() {
            struct = H264DecoderClass.allocate();
        }
        
        /**
         * Finish building the {@link H264DecoderClass} struct.
         * @return A new instance of {@code H264DecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public H264DecoderClass build() {
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
        
        public Builder setNewFieldPicture(NewFieldPictureCallback newFieldPicture) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_field_picture"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newFieldPicture == null ? MemoryAddress.NULL : newFieldPicture.toCallback()));
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
        
        public Builder setDecodeSlice(DecodeSliceCallback decodeSlice) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decode_slice"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decodeSlice == null ? MemoryAddress.NULL : decodeSlice.toCallback()));
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
