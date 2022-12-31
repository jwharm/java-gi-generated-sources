package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class SCTESpliceEvent extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsSCTESpliceEvent";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("insert_event"),
            Interop.valueLayout.C_INT.withName("splice_event_id"),
            Interop.valueLayout.C_INT.withName("splice_event_cancel_indicator"),
            Interop.valueLayout.C_INT.withName("out_of_network_indicator"),
            Interop.valueLayout.C_INT.withName("program_splice_flag"),
            Interop.valueLayout.C_INT.withName("duration_flag"),
            Interop.valueLayout.C_INT.withName("splice_immediate_flag"),
            Interop.valueLayout.C_INT.withName("program_splice_time_specified"),
            Interop.valueLayout.C_LONG.withName("program_splice_time"),
            Interop.valueLayout.C_INT.withName("utc_splice_time"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("components"),
            Interop.valueLayout.C_INT.withName("break_duration_auto_return"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("break_duration"),
            Interop.valueLayout.C_SHORT.withName("unique_program_id"),
            Interop.valueLayout.C_BYTE.withName("avail_num"),
            Interop.valueLayout.C_BYTE.withName("avails_expected")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SCTESpliceEvent}
     * @return A new, uninitialized @{link SCTESpliceEvent}
     */
    public static SCTESpliceEvent allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SCTESpliceEvent newInstance = new SCTESpliceEvent(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code insert_event}
     * @return The value of the field {@code insert_event}
     */
    public boolean getInsertEvent() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("insert_event"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code insert_event}
     * @param insertEvent The new value of the field {@code insert_event}
     */
    public void setInsertEvent(boolean insertEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("insert_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(insertEvent, null).intValue());
    }
    
    /**
     * Get the value of the field {@code splice_event_id}
     * @return The value of the field {@code splice_event_id}
     */
    public int getSpliceEventId() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_event_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code splice_event_id}
     * @param spliceEventId The new value of the field {@code splice_event_id}
     */
    public void setSpliceEventId(int spliceEventId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_event_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceEventId);
    }
    
    /**
     * Get the value of the field {@code splice_event_cancel_indicator}
     * @return The value of the field {@code splice_event_cancel_indicator}
     */
    public boolean getSpliceEventCancelIndicator() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_event_cancel_indicator"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code splice_event_cancel_indicator}
     * @param spliceEventCancelIndicator The new value of the field {@code splice_event_cancel_indicator}
     */
    public void setSpliceEventCancelIndicator(boolean spliceEventCancelIndicator) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_event_cancel_indicator"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(spliceEventCancelIndicator, null).intValue());
    }
    
    /**
     * Get the value of the field {@code out_of_network_indicator}
     * @return The value of the field {@code out_of_network_indicator}
     */
    public boolean getOutOfNetworkIndicator() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_of_network_indicator"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code out_of_network_indicator}
     * @param outOfNetworkIndicator The new value of the field {@code out_of_network_indicator}
     */
    public void setOutOfNetworkIndicator(boolean outOfNetworkIndicator) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("out_of_network_indicator"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(outOfNetworkIndicator, null).intValue());
    }
    
    /**
     * Get the value of the field {@code program_splice_flag}
     * @return The value of the field {@code program_splice_flag}
     */
    public boolean getProgramSpliceFlag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code program_splice_flag}
     * @param programSpliceFlag The new value of the field {@code program_splice_flag}
     */
    public void setProgramSpliceFlag(boolean programSpliceFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(programSpliceFlag, null).intValue());
    }
    
    /**
     * Get the value of the field {@code duration_flag}
     * @return The value of the field {@code duration_flag}
     */
    public boolean getDurationFlag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code duration_flag}
     * @param durationFlag The new value of the field {@code duration_flag}
     */
    public void setDurationFlag(boolean durationFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(durationFlag, null).intValue());
    }
    
    /**
     * Get the value of the field {@code splice_immediate_flag}
     * @return The value of the field {@code splice_immediate_flag}
     */
    public boolean getSpliceImmediateFlag() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_immediate_flag"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code splice_immediate_flag}
     * @param spliceImmediateFlag The new value of the field {@code splice_immediate_flag}
     */
    public void setSpliceImmediateFlag(boolean spliceImmediateFlag) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("splice_immediate_flag"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(spliceImmediateFlag, null).intValue());
    }
    
    /**
     * Get the value of the field {@code program_splice_time_specified}
     * @return The value of the field {@code program_splice_time_specified}
     */
    public boolean getProgramSpliceTimeSpecified() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time_specified"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code program_splice_time_specified}
     * @param programSpliceTimeSpecified The new value of the field {@code program_splice_time_specified}
     */
    public void setProgramSpliceTimeSpecified(boolean programSpliceTimeSpecified) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time_specified"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(programSpliceTimeSpecified, null).intValue());
    }
    
    /**
     * Get the value of the field {@code program_splice_time}
     * @return The value of the field {@code program_splice_time}
     */
    public long getProgramSpliceTime() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code program_splice_time}
     * @param programSpliceTime The new value of the field {@code program_splice_time}
     */
    public void setProgramSpliceTime(long programSpliceTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), programSpliceTime);
    }
    
    /**
     * Get the value of the field {@code utc_splice_time}
     * @return The value of the field {@code utc_splice_time}
     */
    public int getUtcSpliceTime() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code utc_splice_time}
     * @param utcSpliceTime The new value of the field {@code utc_splice_time}
     */
    public void setUtcSpliceTime(int utcSpliceTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), utcSpliceTime);
    }
    
    /**
     * Get the value of the field {@code components}
     * @return The value of the field {@code components}
     */
    public PointerAddress getComponents() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("components"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code components}
     * @param components The new value of the field {@code components}
     */
    public void setComponents(java.lang.foreign.MemoryAddress[] components) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("components"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (components == null ? MemoryAddress.NULL : Interop.allocateNativeArray(components, false)));
    }
    
    /**
     * Get the value of the field {@code break_duration_auto_return}
     * @return The value of the field {@code break_duration_auto_return}
     */
    public boolean getBreakDurationAutoReturn() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_duration_auto_return"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code break_duration_auto_return}
     * @param breakDurationAutoReturn The new value of the field {@code break_duration_auto_return}
     */
    public void setBreakDurationAutoReturn(boolean breakDurationAutoReturn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_duration_auto_return"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(breakDurationAutoReturn, null).intValue());
    }
    
    /**
     * Get the value of the field {@code break_duration}
     * @return The value of the field {@code break_duration}
     */
    public long getBreakDuration() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code break_duration}
     * @param breakDuration The new value of the field {@code break_duration}
     */
    public void setBreakDuration(long breakDuration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("break_duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), breakDuration);
    }
    
    /**
     * Get the value of the field {@code unique_program_id}
     * @return The value of the field {@code unique_program_id}
     */
    public short getUniqueProgramId() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unique_program_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code unique_program_id}
     * @param uniqueProgramId The new value of the field {@code unique_program_id}
     */
    public void setUniqueProgramId(short uniqueProgramId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unique_program_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), uniqueProgramId);
    }
    
    /**
     * Get the value of the field {@code avail_num}
     * @return The value of the field {@code avail_num}
     */
    public byte getAvailNum() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("avail_num"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code avail_num}
     * @param availNum The new value of the field {@code avail_num}
     */
    public void setAvailNum(byte availNum) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("avail_num"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), availNum);
    }
    
    /**
     * Get the value of the field {@code avails_expected}
     * @return The value of the field {@code avails_expected}
     */
    public byte getAvailsExpected() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("avails_expected"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code avails_expected}
     * @param availsExpected The new value of the field {@code avails_expected}
     */
    public void setAvailsExpected(byte availsExpected) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("avails_expected"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), availsExpected);
    }
    
    /**
     * Create a SCTESpliceEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SCTESpliceEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SCTESpliceEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SCTESpliceEvent(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_scte_splice_event_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates and initializes a {@link SCTESpliceEvent}.
     */
    public SCTESpliceEvent() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_scte_splice_event_new = Interop.downcallHandle(
            "gst_mpegts_scte_splice_event_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link SCTESpliceEvent.Builder} object constructs a {@link SCTESpliceEvent} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SCTESpliceEvent.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SCTESpliceEvent struct;
        
        private Builder() {
            struct = SCTESpliceEvent.allocate();
        }
        
         /**
         * Finish building the {@link SCTESpliceEvent} struct.
         * @return A new instance of {@code SCTESpliceEvent} with the fields 
         *         that were set in the Builder object.
         */
        public SCTESpliceEvent build() {
            return struct;
        }
        
        public Builder setInsertEvent(boolean insertEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(insertEvent, null).intValue());
            return this;
        }
        
        public Builder setSpliceEventId(int spliceEventId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_event_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), spliceEventId);
            return this;
        }
        
        public Builder setSpliceEventCancelIndicator(boolean spliceEventCancelIndicator) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_event_cancel_indicator"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(spliceEventCancelIndicator, null).intValue());
            return this;
        }
        
        public Builder setOutOfNetworkIndicator(boolean outOfNetworkIndicator) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("out_of_network_indicator"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(outOfNetworkIndicator, null).intValue());
            return this;
        }
        
        public Builder setProgramSpliceFlag(boolean programSpliceFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_splice_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(programSpliceFlag, null).intValue());
            return this;
        }
        
        public Builder setDurationFlag(boolean durationFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(durationFlag, null).intValue());
            return this;
        }
        
        public Builder setSpliceImmediateFlag(boolean spliceImmediateFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_immediate_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(spliceImmediateFlag, null).intValue());
            return this;
        }
        
        public Builder setProgramSpliceTimeSpecified(boolean programSpliceTimeSpecified) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time_specified"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(programSpliceTimeSpecified, null).intValue());
            return this;
        }
        
        public Builder setProgramSpliceTime(long programSpliceTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), programSpliceTime);
            return this;
        }
        
        /**
         * The UTC time of the signaled splice event
         * @param utcSpliceTime The value for the {@code utcSpliceTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUtcSpliceTime(int utcSpliceTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("utc_splice_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), utcSpliceTime);
            return this;
        }
        
        /**
         * Per-PID splice time information
         * @param components The value for the {@code components} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setComponents(java.lang.foreign.MemoryAddress[] components) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("components"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (components == null ? MemoryAddress.NULL : Interop.allocateNativeArray(components, false)));
            return this;
        }
        
        public Builder setBreakDurationAutoReturn(boolean breakDurationAutoReturn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_duration_auto_return"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(breakDurationAutoReturn, null).intValue());
            return this;
        }
        
        public Builder setBreakDuration(long breakDuration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("break_duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), breakDuration);
            return this;
        }
        
        public Builder setUniqueProgramId(short uniqueProgramId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unique_program_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), uniqueProgramId);
            return this;
        }
        
        public Builder setAvailNum(byte availNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("avail_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), availNum);
            return this;
        }
        
        public Builder setAvailsExpected(byte availsExpected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("avails_expected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), availsExpected);
            return this;
        }
    }
}
