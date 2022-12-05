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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.video.VideoDecoderClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("new_sequence"),
        Interop.valueLayout.ADDRESS.withName("new_picture"),
        Interop.valueLayout.ADDRESS.withName("start_picture"),
        Interop.valueLayout.ADDRESS.withName("decode_slice"),
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
    public org.gstreamer.video.VideoDecoderClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.video.VideoDecoderClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a H265DecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public H265DecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private H265DecoderClass struct;
        
         /**
         * A {@link H265DecoderClass.Build} object constructs a {@link H265DecoderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = H265DecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link H265DecoderClass} struct.
         * @return A new instance of {@code H265DecoderClass} with the fields 
         *         that were set in the Build object.
         */
        public H265DecoderClass construct() {
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
        
        public Build setStartPicture(java.lang.foreign.MemoryAddress startPicture) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_picture"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startPicture == null ? MemoryAddress.NULL : startPicture));
            return this;
        }
        
        public Build setDecodeSlice(java.lang.foreign.MemoryAddress decodeSlice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_slice"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decodeSlice == null ? MemoryAddress.NULL : decodeSlice));
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
