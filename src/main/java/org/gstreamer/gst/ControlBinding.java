package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A base class for value mapping objects that attaches control sources to {@link org.gtk.gobject.GObject}
 * properties. Such an object is taking one or more {@link ControlSource} instances,
 * combines them and maps the resulting value to the type and value range of the
 * bound property.
 */
public class ControlBinding extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlBinding";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("pspec"),
            Interop.valueLayout.ADDRESS.withName("object"),
            Interop.valueLayout.C_INT.withName("disabled")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ControlBinding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ControlBinding(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ControlBinding> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ControlBinding(input);
    
    /**
     * Gets a number of {@code GValues} for the given controlled property starting at the
     * requested time. The array {@code values} need to hold enough space for {@code n_values} of
     * {@link org.gtk.gobject.Value}.
     * <p>
     * This function is useful if one wants to e.g. draw a graph of the control
     * curve or apply a control curve sample by sample.
     * @param timestamp the time that should be processed
     * @param interval the time spacing between subsequent values
     * @param nValues the number of values
     * @param values array to put control-values in
     * @return {@code true} if the given array could be filled, {@code false} otherwise
     */
    public boolean getGValueArray(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, org.gtk.gobject.Value[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_control_binding_get_g_value_array.invokeExact(
                        handle(),
                        timestamp.getValue().longValue(),
                        interval.getValue().longValue(),
                        nValues,
                        Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the value for the given controlled property at the requested time.
     * @param timestamp the time the control-change should be read from
     * @return the GValue of the property at the given time,
     * or {@code null} if the property isn't controlled.
     */
    public @Nullable org.gtk.gobject.Value getValue(org.gstreamer.gst.ClockTime timestamp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_control_binding_get_value.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets a number of values for the given controlled property starting at the
     * requested time. The array {@code values} needs to hold enough space for {@code n_values} of
     * the same type as the objects property's type.
     * <p>
     * This function is useful if one wants to e.g. draw a graph of the control
     * curve or apply a control curve sample by sample.
     * <p>
     * The values are unboxed and ready to be used. The similar function
     * gst_control_binding_get_g_value_array() returns the array as {@code GValues} and is
     * more suitable for bindings.
     * @param timestamp the time that should be processed
     * @param interval the time spacing between subsequent values
     * @param nValues the number of values
     * @param values array to put control-values in
     * @return {@code true} if the given array could be filled, {@code false} otherwise
     */
    public boolean getValueArray(org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, java.lang.foreign.MemoryAddress[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_control_binding_get_value_array.invokeExact(
                        handle(),
                        timestamp.getValue().longValue(),
                        interval.getValue().longValue(),
                        nValues,
                        Interop.allocateNativeArray(values, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Checks if the control binding is disabled.
     * @return {@code true} if the binding is inactive
     */
    public boolean isDisabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_binding_is_disabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * This function is used to disable a control binding for some time, i.e.
     * gst_object_sync_values() will do nothing.
     * @param disabled boolean that specifies whether to disable the controller
     * or not.
     */
    public void setDisabled(boolean disabled) {
        try {
            DowncallHandles.gst_control_binding_set_disabled.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(disabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the property of the {@code object}, according to the {@code GstControlSources} that
     * handles it and for the given timestamp.
     * <p>
     * If this function fails, it is most likely the application developers fault.
     * Most probably the control sources are not setup correctly.
     * @param object the object that has controlled properties
     * @param timestamp the time that should be processed
     * @param lastSync the last time this was called
     * @return {@code true} if the controller value could be applied to the object
     * property, {@code false} otherwise
     */
    public boolean syncValues(org.gstreamer.gst.GstObject object, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime lastSync) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_binding_sync_values.invokeExact(
                    handle(),
                    object.handle(),
                    timestamp.getValue().longValue(),
                    lastSync.getValue().longValue());
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
            RESULT = (long) DowncallHandles.gst_control_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ControlBinding.Builder} object constructs a {@link ControlBinding} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ControlBinding.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ControlBinding}.
         * @return A new instance of {@code ControlBinding} with the properties 
         *         that were set in the Builder object.
         */
        public ControlBinding build() {
            return (ControlBinding) org.gtk.gobject.GObject.newWithProperties(
                ControlBinding.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        public Builder setObject(org.gstreamer.gst.GstObject object) {
            names.add("object");
            values.add(org.gtk.gobject.Value.create(object));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_control_binding_get_g_value_array = Interop.downcallHandle(
                "gst_control_binding_get_g_value_array",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_control_binding_get_value = Interop.downcallHandle(
                "gst_control_binding_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_control_binding_get_value_array = Interop.downcallHandle(
                "gst_control_binding_get_value_array",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_control_binding_is_disabled = Interop.downcallHandle(
                "gst_control_binding_is_disabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_control_binding_set_disabled = Interop.downcallHandle(
                "gst_control_binding_set_disabled",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_control_binding_sync_values = Interop.downcallHandle(
                "gst_control_binding_sync_values",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_control_binding_get_type = Interop.downcallHandle(
                "gst_control_binding_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_control_binding_get_type != null;
    }
}
