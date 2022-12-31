package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * System Time Table (A65)
 */
public class AtscSTT extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscSTT";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("protocol_version"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("system_time"),
            Interop.valueLayout.C_BYTE.withName("gps_utc_offset"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("ds_status"),
            Interop.valueLayout.C_BYTE.withName("ds_dayofmonth"),
            Interop.valueLayout.C_BYTE.withName("ds_hour"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("descriptors"),
            Interop.valueLayout.ADDRESS.withName("utc_datetime")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscSTT}
     * @return A new, uninitialized @{link AtscSTT}
     */
    public static AtscSTT allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscSTT newInstance = new AtscSTT(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code protocol_version}
     * @return The value of the field {@code protocol_version}
     */
    public byte getProtocolVersion() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code protocol_version}
     * @param protocolVersion The new value of the field {@code protocol_version}
     */
    public void setProtocolVersion(byte protocolVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
    }
    
    /**
     * Get the value of the field {@code system_time}
     * @return The value of the field {@code system_time}
     */
    public int getSystemTime() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_time"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code system_time}
     * @param systemTime The new value of the field {@code system_time}
     */
    public void setSystemTime(int systemTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemTime);
    }
    
    /**
     * Get the value of the field {@code gps_utc_offset}
     * @return The value of the field {@code gps_utc_offset}
     */
    public byte getGpsUtcOffset() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gps_utc_offset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code gps_utc_offset}
     * @param gpsUtcOffset The new value of the field {@code gps_utc_offset}
     */
    public void setGpsUtcOffset(byte gpsUtcOffset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("gps_utc_offset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), gpsUtcOffset);
    }
    
    /**
     * Get the value of the field {@code ds_status}
     * @return The value of the field {@code ds_status}
     */
    public boolean getDsStatus() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_status"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Change the value of the field {@code ds_status}
     * @param dsStatus The new value of the field {@code ds_status}
     */
    public void setDsStatus(boolean dsStatus) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_status"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(dsStatus, null).intValue());
    }
    
    /**
     * Get the value of the field {@code ds_dayofmonth}
     * @return The value of the field {@code ds_dayofmonth}
     */
    public byte getDsDayofmonth() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_dayofmonth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ds_dayofmonth}
     * @param dsDayofmonth The new value of the field {@code ds_dayofmonth}
     */
    public void setDsDayofmonth(byte dsDayofmonth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_dayofmonth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dsDayofmonth);
    }
    
    /**
     * Get the value of the field {@code ds_hour}
     * @return The value of the field {@code ds_hour}
     */
    public byte getDsHour() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_hour"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ds_hour}
     * @param dsHour The new value of the field {@code ds_hour}
     */
    public void setDsHour(byte dsHour) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ds_hour"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), dsHour);
    }
    
    /**
     * Get the value of the field {@code descriptors}
     * @return The value of the field {@code descriptors}
     */
    public PointerProxy<org.gstreamer.mpegts.Descriptor> getDescriptors() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.mpegts.Descriptor>(RESULT, org.gstreamer.mpegts.Descriptor.fromAddress);
    }
    
    /**
     * Change the value of the field {@code descriptors}
     * @param descriptors The new value of the field {@code descriptors}
     */
    public void setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
    }
    
    /**
     * Get the value of the field {@code utc_datetime}
     * @return The value of the field {@code utc_datetime}
     */
    public org.gstreamer.gst.DateTime getUtcDatetime() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_datetime"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code utc_datetime}
     * @param utcDatetime The new value of the field {@code utc_datetime}
     */
    public void setUtcDatetime(org.gstreamer.gst.DateTime utcDatetime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("utc_datetime"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (utcDatetime == null ? MemoryAddress.NULL : utcDatetime.handle()));
    }
    
    /**
     * Create a AtscSTT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AtscSTT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscSTT> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AtscSTT(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_stt_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public AtscSTT() {
        super(constructNew(), Ownership.FULL);
    }
    
    public org.gstreamer.gst.DateTime getDatetimeUtc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_atsc_stt_get_datetime_utc.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_atsc_stt_new = Interop.downcallHandle(
            "gst_mpegts_atsc_stt_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpegts_atsc_stt_get_datetime_utc = Interop.downcallHandle(
            "gst_mpegts_atsc_stt_get_datetime_utc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AtscSTT.Builder} object constructs a {@link AtscSTT} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscSTT.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscSTT struct;
        
        private Builder() {
            struct = AtscSTT.allocate();
        }
        
         /**
         * Finish building the {@link AtscSTT} struct.
         * @return A new instance of {@code AtscSTT} with the fields 
         *         that were set in the Builder object.
         */
        public AtscSTT build() {
            return struct;
        }
        
        /**
         * The protocol version
         * @param protocolVersion The value for the {@code protocolVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProtocolVersion(byte protocolVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("protocol_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), protocolVersion);
            return this;
        }
        
        /**
         * The system time
         * @param systemTime The value for the {@code systemTime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSystemTime(int systemTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemTime);
            return this;
        }
        
        /**
         * The GPS to UTC offset
         * @param gpsUtcOffset The value for the {@code gpsUtcOffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGpsUtcOffset(byte gpsUtcOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("gps_utc_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), gpsUtcOffset);
            return this;
        }
        
        public Builder setDsStatus(boolean dsStatus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ds_status"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(dsStatus, null).intValue());
            return this;
        }
        
        /**
         * The day of month
         * @param dsDayofmonth The value for the {@code dsDayofmonth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDsDayofmonth(byte dsDayofmonth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ds_dayofmonth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dsDayofmonth);
            return this;
        }
        
        /**
         * The hour
         * @param dsHour The value for the {@code dsHour} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDsHour(byte dsHour) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ds_hour"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dsHour);
            return this;
        }
        
        /**
         * descriptors
         * @param descriptors The value for the {@code descriptors} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDescriptors(org.gstreamer.mpegts.Descriptor[] descriptors) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("descriptors"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (descriptors == null ? MemoryAddress.NULL : Interop.allocateNativeArray(descriptors, org.gstreamer.mpegts.Descriptor.getMemoryLayout(), false)));
            return this;
        }
        
        /**
         * The UTC date and time
         * @param utcDatetime The value for the {@code utcDatetime} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUtcDatetime(org.gstreamer.gst.DateTime utcDatetime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("utc_datetime"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (utcDatetime == null ? MemoryAddress.NULL : utcDatetime.handle()));
            return this;
        }
    }
}
