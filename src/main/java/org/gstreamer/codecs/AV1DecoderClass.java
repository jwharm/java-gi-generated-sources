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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gstreamer.video.VideoDecoderClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.video.VideoDecoderClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AV1DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AV1DecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AV1DecoderClass struct;
        
         /**
         * A {@link AV1DecoderClass.Build} object constructs a {@link AV1DecoderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AV1DecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link AV1DecoderClass} struct.
         * @return A new instance of {@code AV1DecoderClass} with the fields 
         *         that were set in the Build object.
         */
        public AV1DecoderClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.video.VideoDecoderClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setNewSequence(java.lang.foreign.MemoryAddress newSequence) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sequence"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newSequence == null ? MemoryAddress.NULL : newSequence));
            return this;
        }
        
        public Build setNewPicture(java.lang.foreign.MemoryAddress newPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (newPicture == null ? MemoryAddress.NULL : newPicture));
            return this;
        }
        
        public Build setDuplicatePicture(java.lang.foreign.MemoryAddress duplicatePicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duplicate_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (duplicatePicture == null ? MemoryAddress.NULL : duplicatePicture));
            return this;
        }
        
        public Build setStartPicture(java.lang.foreign.MemoryAddress startPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture));
            return this;
        }
        
        public Build setDecodeTile(java.lang.foreign.MemoryAddress decodeTile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_tile"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeTile == null ? MemoryAddress.NULL : decodeTile));
            return this;
        }
        
        public Build setEndPicture(java.lang.foreign.MemoryAddress endPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (endPicture == null ? MemoryAddress.NULL : endPicture));
            return this;
        }
        
        public Build setOutputPicture(java.lang.foreign.MemoryAddress outputPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outputPicture == null ? MemoryAddress.NULL : outputPicture));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
