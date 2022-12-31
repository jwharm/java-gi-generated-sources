package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureStylus} is a {@code GtkGesture} specific to stylus input.
 * <p>
 * The provided signals just relay the basic information of the
 * stylus events.
 */
public class GestureStylus extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureStylus";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureStylus proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GestureStylus(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureStylus> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GestureStylus(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGestureStylus}.
     */
    public GestureStylus() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns the current values for the requested {@code axes}.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @param axes array of requested axes, terminated with {@link org.gtk.gdk.AxisUse#IGNORE}
     * @param values return location for the axis values
     * @return {@code true} if there is a current value for the axes
     */
    public boolean getAxes(org.gtk.gdk.AxisUse[] axes, double[] values) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_axes.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(Enumeration.getValues(axes), false),
                    Interop.allocateNativeArray(values, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the current value for the requested {@code axis}.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @param axis requested device axis
     * @param value return location for the axis value
     * @return {@code true} if there is a current value for the axis
     */
    public boolean getAxis(org.gtk.gdk.AxisUse axis, Out<Double> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_axis.invokeExact(
                    handle(),
                    axis.getValue(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the accumulated backlog of tracking information.
     * <p>
     * By default, GTK will limit rate of input events. On stylus input
     * where accuracy of strokes is paramount, this function returns the
     * accumulated coordinate/timing state before the emission of the
     * current [Gtk.GestureStylus::motion] signal.
     * <p>
     * This function may only be called within a {@code Gtk.GestureStylus::motion}
     * signal handler, the state given in this signal and obtainable through
     * {@link GestureStylus#getAxis} express the latest (most up-to-date)
     * state in motion history.
     * <p>
     * The {@code backlog} is provided in chronological order.
     * @param backlog coordinates and times for the backlog events
     * @param nElems return location for the number of elements
     * @return {@code true} if there is a backlog to unfold in the current state.
     */
    public boolean getBacklog(Out<org.gtk.gdk.TimeCoord[]> backlog, Out<Integer> nElems) {
        MemorySegment backlogPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment nElemsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_backlog.invokeExact(
                    handle(),
                    (Addressable) backlogPOINTER.address(),
                    (Addressable) nElemsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nElems.set(nElemsPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.gdk.TimeCoord[] backlogARRAY = new org.gtk.gdk.TimeCoord[nElems.get().intValue()];
        for (int I = 0; I < nElems.get().intValue(); I++) {
            var OBJ = backlogPOINTER.get(Interop.valueLayout.ADDRESS, I);
            backlogARRAY[I] = org.gtk.gdk.TimeCoord.fromAddress.marshal(OBJ, Ownership.FULL);
        }
        backlog.set(backlogARRAY);
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the {@code GdkDeviceTool} currently driving input through this gesture.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @return The current stylus tool
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_get_device_tool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.DeviceTool) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.DeviceTool.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_stylus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Down {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Down.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the stylus touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Down> onDown(GestureStylus.Down handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("down"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Motion.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Motion> onMotion(GestureStylus.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("motion"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Proximity {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Proximity.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Proximity> onProximity(GestureStylus.Proximity handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("proximity"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Up {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Up.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Up> onUp(GestureStylus.Up handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("up"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureStylus.Builder} object constructs a {@link GestureStylus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureStylus.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureSingle.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureStylus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureStylus}.
         * @return A new instance of {@code GestureStylus} with the properties 
         *         that were set in the Builder object.
         */
        public GestureStylus build() {
            return (GestureStylus) org.gtk.gobject.GObject.newWithProperties(
                GestureStylus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_stylus_new = Interop.downcallHandle(
            "gtk_gesture_stylus_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axes = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axis = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axis",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_backlog = Interop.downcallHandle(
            "gtk_gesture_stylus_get_backlog",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_device_tool = Interop.downcallHandle(
            "gtk_gesture_stylus_get_device_tool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_type = Interop.downcallHandle(
            "gtk_gesture_stylus_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
