package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ControlSource} is a base class for control value sources that could
 * be used to get timestamp-value pairs. A control source essentially is a
 * function over time.
 * <p>
 * A {@link ControlSource} is used by first getting an instance of a specific
 * control-source, creating a binding for the control-source to the target property
 * of the element and then adding the binding to the element. The binding will
 * convert the data types and value range to fit to the bound property.
 * <p>
 * For implementing a new {@link ControlSource} one has to implement
 * {@link ControlSourceGetValue} and {@link ControlSourceGetValueArray} functions.
 * These are then used by gst_control_source_get_value() and
 * gst_control_source_get_value_array() to get values for specific timestamps.
 */
public class ControlSource extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlSource";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("get_value"),
            Interop.valueLayout.ADDRESS.withName("get_value_array"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ControlSource proxy instance for the provided memory address.
     * <p>
     * Because ControlSource is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ControlSource(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ControlSource> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ControlSource(input, ownership);
    
    /**
     * Gets the value for this {@link ControlSource} at a given timestamp.
     * @param timestamp the time for which the value should be returned
     * @param value the value
     * @return {@code false} if the value couldn't be returned, {@code true} otherwise.
     */
    public boolean controlSourceGetValue(org.gstreamer.gst.ClockTime timestamp, Out<Double> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_source_get_value.invokeExact(
                    handle(),
                    timestamp.getValue().longValue(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets an array of values for for this {@link ControlSource}. Values that are
     * undefined contain NANs.
     * @param timestamp the first timestamp
     * @param interval the time steps
     * @param nValues the number of values to fetch
     * @param values array to put control-values in
     * @return {@code true} if the given array could be filled, {@code false} otherwise
     */
    public boolean controlSourceGetValueArray(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, double[] values) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_source_get_value_array.invokeExact(
                    handle(),
                    timestamp.getValue().longValue(),
                    interval.getValue().longValue(),
                    nValues,
                    Interop.allocateNativeArray(values, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ControlSource.Builder} object constructs a {@link ControlSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ControlSource.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ControlSource}.
         * @return A new instance of {@code ControlSource} with the properties 
         *         that were set in the Builder object.
         */
        public ControlSource build() {
            return (ControlSource) org.gtk.gobject.GObject.newWithProperties(
                ControlSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_control_source_get_value = Interop.downcallHandle(
            "gst_control_source_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_control_source_get_value_array = Interop.downcallHandle(
            "gst_control_source_get_value_array",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_control_source_get_type = Interop.downcallHandle(
            "gst_control_source_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
