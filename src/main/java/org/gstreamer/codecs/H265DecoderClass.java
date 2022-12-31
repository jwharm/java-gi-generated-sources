package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H265DecoderClass extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH265DecoderClass";
    
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
            Interop.valueLayout.ADDRESS.withName("decode_slice"),
            Interop.valueLayout.ADDRESS.withName("end_picture"),
            Interop.valueLayout.ADDRESS.withName("output_picture"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H265DecoderClass}
     * @return A new, uninitialized @{link H265DecoderClass}
     */
    public static H265DecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        H265DecoderClass newInstance = new H265DecoderClass(segment.address(), Ownership.NONE);
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, java.lang.foreign.MemoryAddress sps, int maxDpbSize);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress sps, int maxDpbSize) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), sps, maxDpbSize);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.H265Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.codecs.H265Picture.fromAddress.marshal(picture, Ownership.NONE));
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, org.gstreamer.codecs.H265Picture picture, org.gstreamer.codecs.H265Slice slice, org.gstreamer.codecs.H265Dpb dpb);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress slice, MemoryAddress dpb) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.H265Picture.fromAddress.marshal(picture, Ownership.NONE), org.gstreamer.codecs.H265Slice.fromAddress.marshal(slice, Ownership.NONE), org.gstreamer.codecs.H265Dpb.fromAddress.marshal(dpb, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface DecodeSliceCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, org.gstreamer.codecs.H265Picture picture, org.gstreamer.codecs.H265Slice slice, PointerAddress refPicList0, PointerAddress refPicList1);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress slice, MemoryAddress refPicList0, MemoryAddress refPicList1) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.H265Picture.fromAddress.marshal(picture, Ownership.NONE), org.gstreamer.codecs.H265Slice.fromAddress.marshal(slice, Ownership.NONE), new PointerAddress(refPicList0), new PointerAddress(refPicList1));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecodeSliceCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode_slice}
     * @param decodeSlice The new value of the field {@code decode_slice}
     */
    public void setDecodeSlice(DecodeSliceCallback decodeSlice) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decode_slice"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeSlice == null ? MemoryAddress.NULL : decodeSlice.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, org.gstreamer.codecs.H265Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.H265Picture.fromAddress.marshal(picture, Ownership.NONE));
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.H265Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.H265Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.H265Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.H265Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.codecs.H265Picture.fromAddress.marshal(picture, Ownership.NONE));
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
    
    /**
     * Create a H265DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected H265DecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, H265DecoderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new H265DecoderClass(input, ownership);
    
    /**
     * A {@link H265DecoderClass.Builder} object constructs a {@link H265DecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link H265DecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final H265DecoderClass struct;
        
        private Builder() {
            struct = H265DecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link H265DecoderClass} struct.
         * @return A new instance of {@code H265DecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public H265DecoderClass build() {
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
        
        public Builder setDecodeSlice(DecodeSliceCallback decodeSlice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_slice"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeSlice == null ? MemoryAddress.NULL : decodeSlice.toCallback()));
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
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
