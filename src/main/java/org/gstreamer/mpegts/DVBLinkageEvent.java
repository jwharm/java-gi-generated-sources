package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DVBLinkageEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsDVBLinkageEvent";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_SHORT.withName("target_event_id"),
        MemoryLayout.paddingLayout(16),
        Interop.valueLayout.C_INT.withName("target_listed"),
        Interop.valueLayout.C_INT.withName("event_simulcast")
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
     * Allocate a new {@link DVBLinkageEvent}
     * @return A new, uninitialized @{link DVBLinkageEvent}
     */
    public static DVBLinkageEvent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DVBLinkageEvent newInstance = new DVBLinkageEvent(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code target_event_id}
     * @return The value of the field {@code target_event_id}
     */
    public short targetEventId$get() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code target_event_id}
     * @param targetEventId The new value of the field {@code target_event_id}
     */
    public void targetEventId$set(short targetEventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
    }
    
    /**
     * Get the value of the field {@code target_listed}
     * @return The value of the field {@code target_listed}
     */
    public boolean targetListed$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code target_listed}
     * @param targetListed The new value of the field {@code target_listed}
     */
    public void targetListed$set(boolean targetListed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetListed ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code event_simulcast}
     * @return The value of the field {@code event_simulcast}
     */
    public boolean eventSimulcast$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code event_simulcast}
     * @param eventSimulcast The new value of the field {@code event_simulcast}
     */
    public void eventSimulcast$set(boolean eventSimulcast) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventSimulcast ? 1 : 0);
    }
    
    /**
     * Create a DVBLinkageEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DVBLinkageEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DVBLinkageEvent struct;
        
         /**
         * A {@link DVBLinkageEvent.Build} object constructs a {@link DVBLinkageEvent} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DVBLinkageEvent.allocate();
        }
        
         /**
         * Finish building the {@link DVBLinkageEvent} struct.
         * @return A new instance of {@code DVBLinkageEvent} with the fields 
         *         that were set in the Build object.
         */
        public DVBLinkageEvent construct() {
            return struct;
        }
        
        public Build setTargetEventId(short targetEventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetEventId);
            return this;
        }
        
        public Build setTargetListed(boolean targetListed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("target_listed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), targetListed ? 1 : 0);
            return this;
        }
        
        public Build setEventSimulcast(boolean eventSimulcast) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event_simulcast"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), eventSimulcast ? 1 : 0);
            return this;
        }
    }
}
