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
public class ControlSource extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlSource";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("get_value"),
        Interop.valueLayout.ADDRESS.withName("get_value_array"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ControlSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ControlSource if its GType is a (or inherits from) "GstControlSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ControlSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstControlSource", a ClassCastException will be thrown.
     */
    public static ControlSource castFrom(org.gtk.gobject.Object gobject) {
            return new ControlSource(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Gets the value for this {@link ControlSource} at a given timestamp.
     * @param timestamp the time for which the value should be returned
     * @param value the value
     * @return {@code false} if the value couldn't be returned, {@code true} otherwise.
     */
    public boolean controlSourceGetValue(@NotNull org.gstreamer.gst.ClockTime timestamp, Out<Double> value) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
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
        return RESULT != 0;
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
    public boolean controlSourceGetValueArray(@NotNull org.gstreamer.gst.ClockTime timestamp, @NotNull org.gstreamer.gst.ClockTime interval, int nValues, @NotNull double[] values) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        java.util.Objects.requireNonNull(interval, "Parameter 'interval' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link ControlSource.Build} object constructs a {@link ControlSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ControlSource} using {@link ControlSource#castFrom}.
         * @return A new instance of {@code ControlSource} with the properties 
         *         that were set in the Build object.
         */
        public ControlSource construct() {
            return ControlSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ControlSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
