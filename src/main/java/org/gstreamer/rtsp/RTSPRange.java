package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides helper functions to deal with time ranges.
 */
public class RTSPRange extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPRange";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("min"),
            Interop.valueLayout.C_INT.withName("max")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPRange}
     * @return A new, uninitialized @{link RTSPRange}
     */
    public static RTSPRange allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPRange newInstance = new RTSPRange(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code min}
     * @return The value of the field {@code min}
     */
    public int getMin() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code min}
     * @param min The new value of the field {@code min}
     */
    public void setMin(int min) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("min"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), min);
    }
    
    /**
     * Get the value of the field {@code max}
     * @return The value of the field {@code max}
     */
    public int getMax() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code max}
     * @param max The new value of the field {@code max}
     */
    public void setMax(int max) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("max"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), max);
    }
    
    /**
     * Create a RTSPRange proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPRange(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPRange> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPRange(input, ownership);
    
    /**
     * Converts the range in-place between different types of units.
     * Ranges containing the special value {@code GST_RTSP_TIME_NOW} can not be
     * converted as these are only valid for {@code GST_RTSP_RANGE_NPT}.
     * @param range a {@link RTSPTimeRange}
     * @param unit the unit to convert the range into
     * @return {@code true} if the range could be converted
     */
    public static boolean convertUnits(org.gstreamer.rtsp.RTSPTimeRange range, org.gstreamer.rtsp.RTSPRangeUnit unit) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_convert_units.invokeExact(
                    range.handle(),
                    unit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Free the memory allocated by {@code range}.
     * @param range a {@link RTSPTimeRange}
     */
    public static void free(org.gstreamer.rtsp.RTSPTimeRange range) {
        try {
            DowncallHandles.gst_rtsp_range_free.invokeExact(
                    range.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieve the minimum and maximum values from {@code range} converted to
     * {@link org.gstreamer.gst.ClockTime} in {@code min} and {@code max}.
     * <p>
     * A value of {@code GST_CLOCK_TIME_NONE} will be used to signal {@code GST_RTSP_TIME_NOW}
     * and {@code GST_RTSP_TIME_END} for {@code min} and {@code max} respectively.
     * <p>
     * UTC times will be converted to nanoseconds since 1900.
     * @param range a {@link RTSPTimeRange}
     * @param min result minimum {@link org.gstreamer.gst.ClockTime}
     * @param max result maximum {@link org.gstreamer.gst.ClockTime}
     * @return {@code true} on success.
     */
    public static boolean getTimes(org.gstreamer.rtsp.RTSPTimeRange range, org.gstreamer.gst.ClockTime min, org.gstreamer.gst.ClockTime max) {
        MemorySegment minPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        MemorySegment maxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_get_times.invokeExact(
                    range.handle(),
                    (Addressable) minPOINTER.address(),
                    (Addressable) maxPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        min.setValue(minPOINTER.get(Interop.valueLayout.C_LONG, 0));
        max.setValue(maxPOINTER.get(Interop.valueLayout.C_LONG, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Parse {@code rangestr} to a {@link RTSPTimeRange}.
     * @param rangestr a range string to parse
     * @param range location to hold the {@link RTSPTimeRange} result
     * @return {@code GST_RTSP_OK} on success.
     */
    public static org.gstreamer.rtsp.RTSPResult parse(java.lang.String rangestr, Out<org.gstreamer.rtsp.RTSPTimeRange> range) {
        MemorySegment rangePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtsp_range_parse.invokeExact(
                    Marshal.stringToAddress.marshal(rangestr, null),
                    (Addressable) rangePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        range.set(org.gstreamer.rtsp.RTSPTimeRange.fromAddress.marshal(rangePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.rtsp.RTSPResult.of(RESULT);
    }
    
    /**
     * Convert {@code range} into a string representation.
     * @param range a {@link RTSPTimeRange}
     * @return The string representation of {@code range}. g_free() after usage.
     */
    public static java.lang.String toString(org.gstreamer.rtsp.RTSPTimeRange range) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_range_to_string.invokeExact(
                    range.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_range_convert_units = Interop.downcallHandle(
            "gst_rtsp_range_convert_units",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_free = Interop.downcallHandle(
            "gst_rtsp_range_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_get_times = Interop.downcallHandle(
            "gst_rtsp_range_get_times",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_parse = Interop.downcallHandle(
            "gst_rtsp_range_parse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_range_to_string = Interop.downcallHandle(
            "gst_rtsp_range_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTSPRange.Builder} object constructs a {@link RTSPRange} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPRange.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPRange struct;
        
        private Builder() {
            struct = RTSPRange.allocate();
        }
        
         /**
         * Finish building the {@link RTSPRange} struct.
         * @return A new instance of {@code RTSPRange} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPRange build() {
            return struct;
        }
        
        /**
         * minimum value of the range
         * @param min The value for the {@code min} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMin(int min) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("min"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), min);
            return this;
        }
        
        /**
         * maximum value of the range
         * @param max The value for the {@code max} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMax(int max) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("max"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), max);
            return this;
        }
    }
}
