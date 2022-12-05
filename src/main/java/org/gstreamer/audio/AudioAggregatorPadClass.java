package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioAggregatorPadClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregatorPadClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.AggregatorPadClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("convert_buffer"),
        Interop.valueLayout.ADDRESS.withName("update_conversion_info"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AudioAggregatorPadClass}
     * @return A new, uninitialized @{link AudioAggregatorPadClass}
     */
    public static AudioAggregatorPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioAggregatorPadClass newInstance = new AudioAggregatorPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorPadClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.base.AggregatorPadClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioAggregatorPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioAggregatorPadClass struct;
        
         /**
         * A {@link AudioAggregatorPadClass.Build} object constructs a {@link AudioAggregatorPadClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioAggregatorPadClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioAggregatorPadClass} struct.
         * @return A new instance of {@code AudioAggregatorPadClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioAggregatorPadClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setConvertBuffer(java.lang.foreign.MemoryAddress convertBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("convert_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convertBuffer == null ? MemoryAddress.NULL : convertBuffer));
            return this;
        }
        
        public Build setUpdateConversionInfo(java.lang.foreign.MemoryAddress updateConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
