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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlSource.getMemoryLayout().withName("parent"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
            Interop.valueLayout.ADDRESS.withName("values"),
            Interop.valueLayout.C_INT.withName("nvalues"),
            Interop.valueLayout.C_INT.withName("valid_cache"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TimedValueControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TimedValueControlSource(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TimedValueControlSource> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TimedValueControlSource(input);
    
    /**
     * Find last value before given timestamp in control point list.
     * If all values in the control point list come after the given
     * timestamp or no values exist, {@code null} is returned.
     * <p>
     * For use in control source implementations.
     * @param timestamp the search key
     * @return the found {@link org.gtk.glib.SequenceIter} or {@code null}
     */
    public org.gtk.glib.SequenceIter findControlPointIter(org.gstreamer.gst.ClockTime timestamp) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_timed_value_control_source_find_control_point_iter.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SequenceIter.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns a read-only copy of the list of {@link org.gstreamer.gst.TimedValue} for the given property.
     * Free the list after done with it.
     * @return a copy
     * of the list, or {@code null} if the property isn't handled by the controller
     */
    public org.gtk.glib.List getAll() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_timed_value_control_source_get_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the number of control points that are set.
     * @return the number of control points that are set.
     */
    public int getCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_get_count.invokeExact(handle());
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
    public boolean set(org.gstreamer.gst.ClockTime timestamp, double value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_set.invokeExact(
                    handle(),
                    timestamp.getValue().longValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets multiple timed values at once.
     * @param timedvalues a list
     * with {@link org.gstreamer.gst.TimedValue} items
     * @return FALSE if the values couldn't be set, TRUE otherwise.
     */
    public boolean setFromList(org.gtk.glib.SList timedvalues) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_set_from_list.invokeExact(
                    handle(),
                    timedvalues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Used to remove the value of given controller-handled property at a certain
     * time.
     * @param timestamp the time the control-change should be removed from
     * @return FALSE if the value couldn't be unset (i.e. not found, TRUE otherwise.
     */
    public boolean unset(org.gstreamer.gst.ClockTime timestamp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_timed_value_control_source_unset.invokeExact(
                    handle(),
                    timestamp.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Used to remove all time-stamped values of given controller-handled property
     */
    public void unsetAll() {
        try {
            DowncallHandles.gst_timed_value_control_source_unset_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_timed_value_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ValueAdded} callback.
     */
    @FunctionalInterface
    public interface ValueAdded {
    
        /**
         * Emitted right after the new value has been added to {@code self}
         */
        void run(org.gstreamer.controller.ControlPoint timedValue);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue) {
            run(org.gstreamer.controller.ControlPoint.fromAddress.marshal(timedValue, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted right after the new value has been added to {@code self}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueAdded> onValueAdded(TimedValueControlSource.ValueAdded handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-added", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueChanged} callback.
     */
    @FunctionalInterface
    public interface ValueChanged {
    
        /**
         * Emitted right after the new value has been set on {@code timed_signals}
         */
        void run(org.gstreamer.controller.ControlPoint timedValue);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue) {
            run(org.gstreamer.controller.ControlPoint.fromAddress.marshal(timedValue, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted right after the new value has been set on {@code timed_signals}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueChanged> onValueChanged(TimedValueControlSource.ValueChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueRemoved} callback.
     */
    @FunctionalInterface
    public interface ValueRemoved {
    
        /**
         * Emitted when {@code timed_value} is removed from {@code self}
         */
        void run(org.gstreamer.controller.ControlPoint timedValue);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTimedValueControlSource, MemoryAddress timedValue) {
            run(org.gstreamer.controller.ControlPoint.fromAddress.marshal(timedValue, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when {@code timed_value} is removed from {@code self}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TimedValueControlSource.ValueRemoved> onValueRemoved(TimedValueControlSource.ValueRemoved handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-removed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TimedValueControlSource.Builder} object constructs a {@link TimedValueControlSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TimedValueControlSource.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.ControlSource.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TimedValueControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TimedValueControlSource}.
         * @return A new instance of {@code TimedValueControlSource} with the properties 
         *         that were set in the Builder object.
         */
        public TimedValueControlSource build() {
            return (TimedValueControlSource) org.gtk.gobject.GObject.newWithProperties(
                TimedValueControlSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_timed_value_control_source_get_type != null;
    }
}
