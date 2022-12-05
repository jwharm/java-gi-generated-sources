package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum {@code handle_frame} (and likely {@code set_format}) needs to be
 * overridden.
 */
public class AudioDecoderClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioDecoderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("element_class"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("set_format"),
        Interop.valueLayout.ADDRESS.withName("parse"),
        Interop.valueLayout.ADDRESS.withName("handle_frame"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("pre_push"),
        Interop.valueLayout.ADDRESS.withName("sink_event"),
        Interop.valueLayout.ADDRESS.withName("src_event"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("negotiate"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("propose_allocation"),
        Interop.valueLayout.ADDRESS.withName("sink_query"),
        Interop.valueLayout.ADDRESS.withName("src_query"),
        Interop.valueLayout.ADDRESS.withName("getcaps"),
        Interop.valueLayout.ADDRESS.withName("transform_meta"),
        MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AudioDecoderClass}
     * @return A new, uninitialized @{link AudioDecoderClass}
     */
    public static AudioDecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioDecoderClass newInstance = new AudioDecoderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code element_class}
     * @return The value of the field {@code element_class}
     */
    public org.gstreamer.gst.ElementClass elementClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("element_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AudioDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioDecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioDecoderClass struct;
        
         /**
         * A {@link AudioDecoderClass.Build} object constructs a {@link AudioDecoderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioDecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioDecoderClass} struct.
         * @return A new instance of {@code AudioDecoderClass} with the fields 
         *         that were set in the Build object.
         */
        public AudioDecoderClass construct() {
            return struct;
        }
        
        /**
         * The parent class structure
         * @param elementClass The value for the {@code elementClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setElementClass(org.gstreamer.gst.ElementClass elementClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setSetFormat(java.lang.foreign.MemoryAddress setFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat));
            return this;
        }
        
        public Build setParse(java.lang.foreign.MemoryAddress parse) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parse == null ? MemoryAddress.NULL : parse));
            return this;
        }
        
        public Build setHandleFrame(java.lang.foreign.MemoryAddress handleFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame));
            return this;
        }
        
        public Build setFlush(java.lang.foreign.MemoryAddress flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush));
            return this;
        }
        
        public Build setPrePush(java.lang.foreign.MemoryAddress prePush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pre_push"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prePush == null ? MemoryAddress.NULL : prePush));
            return this;
        }
        
        public Build setSinkEvent(java.lang.foreign.MemoryAddress sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent));
            return this;
        }
        
        public Build setSrcEvent(java.lang.foreign.MemoryAddress srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent));
            return this;
        }
        
        public Build setOpen(java.lang.foreign.MemoryAddress open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open));
            return this;
        }
        
        public Build setClose(java.lang.foreign.MemoryAddress close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close));
            return this;
        }
        
        public Build setNegotiate(java.lang.foreign.MemoryAddress negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate));
            return this;
        }
        
        public Build setDecideAllocation(java.lang.foreign.MemoryAddress decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation));
            return this;
        }
        
        public Build setProposeAllocation(java.lang.foreign.MemoryAddress proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation));
            return this;
        }
        
        public Build setSinkQuery(java.lang.foreign.MemoryAddress sinkQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery));
            return this;
        }
        
        public Build setSrcQuery(java.lang.foreign.MemoryAddress srcQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery));
            return this;
        }
        
        public Build setGetcaps(java.lang.foreign.MemoryAddress getcaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("getcaps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getcaps == null ? MemoryAddress.NULL : getcaps));
            return this;
        }
        
        public Build setTransformMeta(java.lang.foreign.MemoryAddress transformMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta));
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
