package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AV1DecoderClass extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAV1DecoderClass";
    
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
            Interop.valueLayout.ADDRESS.withName("decode_tile"),
            Interop.valueLayout.ADDRESS.withName("end_picture"),
            Interop.valueLayout.ADDRESS.withName("output_picture"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AV1DecoderClass}
     * @return A new, uninitialized @{link AV1DecoderClass}
     */
    public static AV1DecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AV1DecoderClass newInstance = new AV1DecoderClass(segment.address(), Ownership.NONE);
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, java.lang.foreign.MemoryAddress seqHdr);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress seqHdr) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), seqHdr);
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.AV1Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.NONE));
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
    public interface DuplicatePictureCallback {
        org.gstreamer.codecs.AV1Picture run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.codecs.AV1Picture picture);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DuplicatePictureCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code duplicate_picture}
     * @param duplicatePicture The new value of the field {@code duplicate_picture}
     */
    public void setDuplicatePicture(DuplicatePictureCallback duplicatePicture) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duplicate_picture"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (duplicatePicture == null ? MemoryAddress.NULL : duplicatePicture.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.codecs.AV1Picture picture, org.gstreamer.codecs.AV1Dpb dpb);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress dpb) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.NONE), org.gstreamer.codecs.AV1Dpb.fromAddress.marshal(dpb, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface DecodeTileCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.codecs.AV1Picture picture, org.gstreamer.codecs.AV1Tile tile);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture, MemoryAddress tile) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.NONE), org.gstreamer.codecs.AV1Tile.fromAddress.marshal(tile, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecodeTileCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decode_tile}
     * @param decodeTile The new value of the field {@code decode_tile}
     */
    public void setDecodeTile(DecodeTileCallback decodeTile) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decode_tile"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeTile == null ? MemoryAddress.NULL : decodeTile.toCallback()));
    }
    
    @FunctionalInterface
    public interface EndPictureCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.codecs.AV1Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.NONE));
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
        org.gstreamer.gst.FlowReturn run(org.gstreamer.codecs.AV1Decoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.codecs.AV1Picture picture);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress picture) {
            var RESULT = run((org.gstreamer.codecs.AV1Decoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.codecs.AV1Decoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.FULL), org.gstreamer.codecs.AV1Picture.fromAddress.marshal(picture, Ownership.FULL));
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
     * Create a AV1DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AV1DecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AV1DecoderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AV1DecoderClass(input, ownership);
    
    /**
     * A {@link AV1DecoderClass.Builder} object constructs a {@link AV1DecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AV1DecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AV1DecoderClass struct;
        
        private Builder() {
            struct = AV1DecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link AV1DecoderClass} struct.
         * @return A new instance of {@code AV1DecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public AV1DecoderClass build() {
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
        
        public Builder setDuplicatePicture(DuplicatePictureCallback duplicatePicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duplicate_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (duplicatePicture == null ? MemoryAddress.NULL : duplicatePicture.toCallback()));
            return this;
        }
        
        public Builder setStartPicture(StartPictureCallback startPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture.toCallback()));
            return this;
        }
        
        public Builder setDecodeTile(DecodeTileCallback decodeTile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_tile"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeTile == null ? MemoryAddress.NULL : decodeTile.toCallback()));
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
