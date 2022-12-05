package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A base class for value mapping objects that attaches control sources to {@link org.gtk.gobject.Object}
 * properties. Such an object is taking one or more {@link ControlSource} instances,
 * combines them and maps the resulting value to the type and value range of the
 * bound property.
 */
public class ControlBinding extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlBinding";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("pspec"),
        Interop.valueLayout.ADDRESS.withName("object"),
        Interop.valueLayout.C_INT.withName("disabled")
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
     * Create a ControlBinding proxy instance for the provided memory address.
     * <p>
     * Because ControlBinding is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ControlBinding(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to ControlBinding if its GType is a (or inherits from) "GstControlBinding".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ControlBinding} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstControlBinding", a ClassCastException will be thrown.
     */
    public static ControlBinding castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ControlBinding.getType())) {
            return new ControlBinding(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstControlBinding");
        }
    }
    
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
    public boolean getGValueArray(@NotNull org.gstreamer.gst.ClockTime timestamp, @NotNull org.gstreamer.gst.ClockTime interval, int nValues, @NotNull org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        java.util.Objects.requireNonNull(interval, "Parameter 'interval' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_binding_get_g_value_array.invokeExact(
                    handle(),
                    timestamp.getValue().longValue(),
                    interval.getValue().longValue(),
                    nValues,
                    Interop.allocateNativeArray(values, org.gtk.gobject.Value.getMemoryLayout(), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value for the given controlled property at the requested time.
     * @param timestamp the time the control-change should be read from
     * @return the GValue of the property at the given time,
     * or {@code null} if the property isn't controlled.
     */
    public @Nullable org.gtk.gobject.Value getValue(@NotNull org.gstreamer.gst.ClockTime timestamp) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_control_binding_get_value.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.FULL);
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
    public boolean getValueArray(@NotNull org.gstreamer.gst.ClockTime timestamp, @NotNull org.gstreamer.gst.ClockTime interval, int nValues, @NotNull java.lang.foreign.MemoryAddress[] values) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        java.util.Objects.requireNonNull(interval, "Parameter 'interval' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_binding_get_value_array.invokeExact(
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
     * Checks if the control binding is disabled.
     * @return {@code true} if the binding is inactive
     */
    public boolean isDisabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_control_binding_is_disabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    disabled ? 1 : 0);
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
    public boolean syncValues(@NotNull org.gstreamer.gst.Object object, @NotNull org.gstreamer.gst.ClockTime timestamp, @NotNull org.gstreamer.gst.ClockTime lastSync) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        java.util.Objects.requireNonNull(lastSync, "Parameter 'lastSync' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_control_binding_get_type.invokeExact();
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
         * A {@link ControlBinding.Build} object constructs a {@link ControlBinding} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ControlBinding} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ControlBinding} using {@link ControlBinding#castFrom}.
         * @return A new instance of {@code ControlBinding} with the properties 
         *         that were set in the Build object.
         */
        public ControlBinding construct() {
            return ControlBinding.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ControlBinding.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        public Build setObject(org.gstreamer.gst.Object object) {
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
}
