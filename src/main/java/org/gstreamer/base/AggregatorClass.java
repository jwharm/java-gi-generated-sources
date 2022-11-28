package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The aggregator base class will handle in a thread-safe way all manners of
 * concurrent flushes, seeks, pad additions and removals, leaving to the
 * subclass the responsibility of clipping buffers, and aggregating buffers in
 * the way the implementor sees fit.
 * <p>
 * It will also take care of event ordering (stream-start, segment, eos).
 * <p>
 * Basically, a simple implementation will override {@code aggregate}, and call
 * _finish_buffer from inside that function.
 * @version 1.14
 */
public class AggregatorClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("clip"),
        Interop.valueLayout.ADDRESS.withName("finish_buffer"),
        Interop.valueLayout.ADDRESS.withName("sink_event"),
        Interop.valueLayout.ADDRESS.withName("sink_query"),
        Interop.valueLayout.ADDRESS.withName("src_event"),
        Interop.valueLayout.ADDRESS.withName("src_query"),
        Interop.valueLayout.ADDRESS.withName("src_activate"),
        Interop.valueLayout.ADDRESS.withName("aggregate"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("get_next_time"),
        Interop.valueLayout.ADDRESS.withName("create_new_pad"),
        Interop.valueLayout.ADDRESS.withName("update_src_caps"),
        Interop.valueLayout.ADDRESS.withName("fixate_src_caps"),
        Interop.valueLayout.ADDRESS.withName("negotiated_src_caps"),
        Interop.valueLayout.ADDRESS.withName("decide_allocation"),
        Interop.valueLayout.ADDRESS.withName("propose_allocation"),
        Interop.valueLayout.ADDRESS.withName("negotiate"),
        Interop.valueLayout.ADDRESS.withName("sink_event_pre_queue"),
        Interop.valueLayout.ADDRESS.withName("sink_query_pre_queue"),
        Interop.valueLayout.ADDRESS.withName("finish_buffer_list"),
        Interop.valueLayout.ADDRESS.withName("peek_next_sample"),
        MemoryLayout.sequenceLayout(15, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AggregatorClass}
     * @return A new, uninitialized @{link AggregatorClass}
     */
    public static AggregatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AggregatorClass newInstance = new AggregatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AggregatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AggregatorClass struct;
        
         /**
         * A {@link AggregatorClass.Build} object constructs a {@link AggregatorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AggregatorClass.allocate();
        }
        
         /**
         * Finish building the {@link AggregatorClass} struct.
         * @return A new instance of {@code AggregatorClass} with the fields 
         *         that were set in the Build object.
         */
        public AggregatorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setFlush(java.lang.foreign.MemoryAddress flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush));
            return this;
        }
        
        public Build setClip(java.lang.foreign.MemoryAddress clip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clip == null ? MemoryAddress.NULL : clip));
            return this;
        }
        
        public Build setFinishBuffer(java.lang.foreign.MemoryAddress finishBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBuffer == null ? MemoryAddress.NULL : finishBuffer));
            return this;
        }
        
        public Build setSinkEvent(java.lang.foreign.MemoryAddress sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent));
            return this;
        }
        
        public Build setSinkQuery(java.lang.foreign.MemoryAddress sinkQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery));
            return this;
        }
        
        public Build setSrcEvent(java.lang.foreign.MemoryAddress srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent));
            return this;
        }
        
        public Build setSrcQuery(java.lang.foreign.MemoryAddress srcQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery));
            return this;
        }
        
        public Build setSrcActivate(java.lang.foreign.MemoryAddress srcActivate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcActivate == null ? MemoryAddress.NULL : srcActivate));
            return this;
        }
        
        public Build setAggregate(java.lang.foreign.MemoryAddress aggregate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregate == null ? MemoryAddress.NULL : aggregate));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setGetNextTime(java.lang.foreign.MemoryAddress getNextTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_next_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNextTime == null ? MemoryAddress.NULL : getNextTime));
            return this;
        }
        
        public Build setCreateNewPad(java.lang.foreign.MemoryAddress createNewPad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_new_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createNewPad == null ? MemoryAddress.NULL : createNewPad));
            return this;
        }
        
        public Build setUpdateSrcCaps(java.lang.foreign.MemoryAddress updateSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateSrcCaps == null ? MemoryAddress.NULL : updateSrcCaps));
            return this;
        }
        
        public Build setFixateSrcCaps(java.lang.foreign.MemoryAddress fixateSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateSrcCaps == null ? MemoryAddress.NULL : fixateSrcCaps));
            return this;
        }
        
        public Build setNegotiatedSrcCaps(java.lang.foreign.MemoryAddress negotiatedSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiated_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiatedSrcCaps == null ? MemoryAddress.NULL : negotiatedSrcCaps));
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
        
        public Build setNegotiate(java.lang.foreign.MemoryAddress negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate));
            return this;
        }
        
        public Build setSinkEventPreQueue(java.lang.foreign.MemoryAddress sinkEventPreQueue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event_pre_queue"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEventPreQueue == null ? MemoryAddress.NULL : sinkEventPreQueue));
            return this;
        }
        
        public Build setSinkQueryPreQueue(java.lang.foreign.MemoryAddress sinkQueryPreQueue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query_pre_queue"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQueryPreQueue == null ? MemoryAddress.NULL : sinkQueryPreQueue));
            return this;
        }
        
        public Build setFinishBufferList(java.lang.foreign.MemoryAddress finishBufferList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBufferList == null ? MemoryAddress.NULL : finishBufferList));
            return this;
        }
        
        public Build setPeekNextSample(java.lang.foreign.MemoryAddress peekNextSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("peek_next_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (peekNextSample == null ? MemoryAddress.NULL : peekNextSample));
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
