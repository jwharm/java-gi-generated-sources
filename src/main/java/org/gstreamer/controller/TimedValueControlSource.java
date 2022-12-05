package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for {@link org.gstreamer.gst.ControlSource} that use time-stamped values.
 * <p>
 * When overriding bind, chain up first to give this bind implementation a
 * chance to setup things.
 * <p>
 * All functions are MT-safe.
 */
public class TimedValueControlSource extends org.gstreamer.gst.ControlSource {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTimedValueControlSource";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ControlSource.getMemoryLayout().withName("parent"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
        Interop.valueLayout.ADDRESS.withName("values"),
        Interop.valueLayout.C_INT.withName("nvalues"),
        Interop.valueLayout.C_INT.withName("valid_cache"),
        Interop.valueLayout.ADDRESS.withName("priv"),
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
     * Create a TimedValueControlSource proxy instance for the provided memory address.
     * <p>
     * Because TimedValueControlSource is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TimedValueControlSource(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to TimedValueControlSource if its GType is a (or inherits from) "GstTimedValueControlSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TimedValueControlSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTimedValueControlSource", a ClassCastException will be thrown.
     */
    public static TimedValueControlSource castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TimedValueControlSource.getType())) {
            return new TimedValueControlSource(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTimedValueControlSource");
        }
    }
    
    /**
     * Find last value before given timestamp in control point list.
     * If all values in the control point list come after the given
     * timestamp or no values exist, {@code null} is returned.
     * <p>
     * For use in control source implementations.
     * @param timestamp the search key
     * @return the found {@link org.gtk.glib.SequenceIter} or {@code null}
     */
    public @NotNull org.gtk.glib.SequenceIter findControlPointIter(@NotNull org.gstreamer.gst.ClockTime timestamp) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_timed_value_control_source_find_control_point_iter.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SequenceIter(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a read-only copy of the list of {@link org.gstreamer.gst.TimedValue} for the given property.
     * Free the list after done with it.
     * @return a copy
     * of the list, or {@code null} if the property isn't handled by the controller
     */
    public @NotNull org.gtk.glib.List getAll() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_timed_value_control_source_get_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Get the number of control points that are set.
     * @return the number of control points that are set.
     */
    public int getCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_get_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Set the value of given controller-handled property at a certain time.
     * @param timestamp the time the control-change is scheduled for
     * @param value the control-value
     * @return FALSE if the values couldn't be set, TRUE otherwise.
     */
    public boolean set(@NotNull org.gstreamer.gst.ClockTime timestamp, double value) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_set.invokeExact(
                    handle(),
                    timestamp.getValue().longValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets multiple timed values at once.
     * @param timedvalues a list
     * with {@link org.gstreamer.gst.TimedValue} items
     * @return FALSE if the values couldn't be set, TRUE otherwise.
     */
    public boolean setFromList(@NotNull org.gtk.glib.SList timedvalues) {
        java.util.Objects.requireNonNull(timedvalues, "Parameter 'timedvalues' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_set_from_list.invokeExact(
                    handle(),
                    timedvalues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Used to remove the value of given controller-handled property at a certain
     * time.
     * @param timestamp the time the control-change should be removed from
     * @return FALSE if the value couldn't be unset (i.e. not found, TRUE otherwise.
     */
    public boolean unset(@NotNull org.gstreamer.gst.ClockTime timestamp) {
        java.util.Objects.requireNonNull(timestamp, "Parameter 'timestamp' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_unset.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Used to remove all time-stamped values of given controller-handled property
     */
    public void unsetAll() {
        try {
            DowncallHandles.gst_timed_value_control_source_unset_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_timed_value_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ValueAdded {
        void signalReceived(TimedValueControlSource sourceTimedValueControlSource, @NotNull org.gstreamer.controller.ControlPoint timedValue);
    }
    
    /**
     * Emitted right after the new value has been added to {@code self}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueAdded> onValueAdded(TimedValueControlSource.ValueAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TimedValueControlSource.Callbacks.class, "signalTimedValueControlSourceValueAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TimedValueControlSource.ValueAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(TimedValueControlSource sourceTimedValueControlSource, @NotNull org.gstreamer.controller.ControlPoint timedValue);
    }
    
    /**
     * Emitted right after the new value has been set on {@code timed_signals}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueChanged> onValueChanged(TimedValueControlSource.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TimedValueControlSource.Callbacks.class, "signalTimedValueControlSourceValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TimedValueControlSource.ValueChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ValueRemoved {
        void signalReceived(TimedValueControlSource sourceTimedValueControlSource, @NotNull org.gstreamer.controller.ControlPoint timedValue);
    }
    
    /**
     * Emitted when {@code timed_value} is removed from {@code self}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueRemoved> onValueRemoved(TimedValueControlSource.ValueRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TimedValueControlSource.Callbacks.class, "signalTimedValueControlSourceValueRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TimedValueControlSource.ValueRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.ControlSource.Build {
        
         /**
         * A {@link TimedValueControlSource.Build} object constructs a {@link TimedValueControlSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TimedValueControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TimedValueControlSource} using {@link TimedValueControlSource#castFrom}.
         * @return A new instance of {@code TimedValueControlSource} with the properties 
         *         that were set in the Build object.
         */
        public TimedValueControlSource construct() {
            return TimedValueControlSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TimedValueControlSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_timed_value_control_source_find_control_point_iter = Interop.downcallHandle(
            "gst_timed_value_control_source_find_control_point_iter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_get_all = Interop.downcallHandle(
            "gst_timed_value_control_source_get_all",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_get_count = Interop.downcallHandle(
            "gst_timed_value_control_source_get_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_set = Interop.downcallHandle(
            "gst_timed_value_control_source_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_set_from_list = Interop.downcallHandle(
            "gst_timed_value_control_source_set_from_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_unset = Interop.downcallHandle(
            "gst_timed_value_control_source_unset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_unset_all = Interop.downcallHandle(
            "gst_timed_value_control_source_unset_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_timed_value_control_source_get_type = Interop.downcallHandle(
            "gst_timed_value_control_source_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalTimedValueControlSourceValueAdded(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TimedValueControlSource.ValueAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TimedValueControlSource(sourceTimedValueControlSource, Ownership.NONE), new org.gstreamer.controller.ControlPoint(timedValue, Ownership.NONE));
        }
        
        public static void signalTimedValueControlSourceValueChanged(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TimedValueControlSource.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TimedValueControlSource(sourceTimedValueControlSource, Ownership.NONE), new org.gstreamer.controller.ControlPoint(timedValue, Ownership.NONE));
        }
        
        public static void signalTimedValueControlSourceValueRemoved(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TimedValueControlSource.ValueRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TimedValueControlSource(sourceTimedValueControlSource, Ownership.NONE), new org.gstreamer.controller.ControlPoint(timedValue, Ownership.NONE));
        }
    }
}
