package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum {@code handle_frame} needs to be overridden, and {@code set_format}
 * and likely as well.  If non-packetized input is supported or expected,
 * {@code parse} needs to be overridden as well.
 */
public class VideoDecoderClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDecoderClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("element_class"),
        Interop.valueLayout.ADDRESS.withName("open"),
        Interop.valueLayout.ADDRESS.withName("close"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("parse"),
        Interop.valueLayout.ADDRESS.withName("set_format"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("finish"),
        Interop.valueLayout.ADDRESS.withName("handle_frame"),
        Interop.valueLayout.ADDRESS.withName("sink_event"),
        Interop.valueLayout.ADDRESS.withName("src_event"),
        Interop.valueLayout.ADDRESS.withName("negotiate"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("propose_allocation"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("sink_query"),
        Interop.valueLayout.ADDRESS.withName("src_query"),
        Interop.valueLayout.ADDRESS.withName("getcaps"),
        Interop.valueLayout.ADDRESS.withName("drain"),
        Interop.valueLayout.ADDRESS.withName("transform_meta"),
        Interop.valueLayout.ADDRESS.withName("handle_missing_data"),
        MemoryLayout.sequenceLayout(13, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link VideoDecoderClass}
     * @return A new, uninitialized @{link VideoDecoderClass}
     */
    public static VideoDecoderClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoDecoderClass newInstance = new VideoDecoderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a VideoDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoDecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoDecoderClass struct;
        
         /**
         * A {@link VideoDecoderClass.Build} object constructs a {@link VideoDecoderClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoDecoderClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoDecoderClass} struct.
         * @return A new instance of {@code VideoDecoderClass} with the fields 
         *         that were set in the Build object.
         */
        public VideoDecoderClass construct() {
            return struct;
        }
        
        public Build setElementClass(org.gstreamer.gst.ElementClass elementClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
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
        
        public Build setParse(java.lang.foreign.MemoryAddress parse) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parse == null ? MemoryAddress.NULL : parse));
            return this;
        }
        
        public Build setSetFormat(java.lang.foreign.MemoryAddress setFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat));
            return this;
        }
        
        public Build setReset(java.lang.foreign.MemoryAddress reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset));
            return this;
        }
        
        public Build setFinish(java.lang.foreign.MemoryAddress finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finish == null ? MemoryAddress.NULL : finish));
            return this;
        }
        
        public Build setHandleFrame(java.lang.foreign.MemoryAddress handleFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame));
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
        
        public Build setFlush(java.lang.foreign.MemoryAddress flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush));
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
        
        public Build setDrain(java.lang.foreign.MemoryAddress drain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drain == null ? MemoryAddress.NULL : drain));
            return this;
        }
        
        public Build setTransformMeta(java.lang.foreign.MemoryAddress transformMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta));
            return this;
        }
        
        public Build setHandleMissingData(java.lang.foreign.MemoryAddress handleMissingData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_missing_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMissingData == null ? MemoryAddress.NULL : handleMissingData));
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
