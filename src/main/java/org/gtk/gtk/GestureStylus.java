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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GestureStylus(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureStylus */
    public static GestureStylus castFrom(org.gtk.gobject.Object gobject) {
        return new GestureStylus(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_gesture_stylus_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGestureStylus}.
     */
    public GestureStylus() {
        super(constructNew());
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
    public boolean getAxes(org.gtk.gdk.AxisUse[] axes, Out<double[]> values) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public boolean getAxis(@NotNull org.gtk.gdk.AxisUse axis, Out<Double> value) {
        java.util.Objects.requireNonNull(axis, "Parameter 'axis' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_axis.invokeExact(handle(), axis.getValue(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
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
        java.util.Objects.requireNonNull(backlog, "Parameter 'backlog' must not be null");
        java.util.Objects.requireNonNull(nElems, "Parameter 'nElems' must not be null");
        MemorySegment backlogPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nElemsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_backlog.invokeExact(handle(), (Addressable) backlogPOINTER.address(), (Addressable) nElemsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nElems.set(nElemsPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gdk.TimeCoord[] backlogARRAY = new org.gtk.gdk.TimeCoord[nElems.get().intValue()];
        for (int I = 0; I < nElems.get().intValue(); I++) {
            var OBJ = backlogPOINTER.get(ValueLayout.ADDRESS, I);
            backlogARRAY[I] = new org.gtk.gdk.TimeCoord(Refcounted.get(OBJ, true));
        }
        backlog.set(backlogARRAY);
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_get_device_tool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface Down {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus touches the device.
     */
    public Signal<GestureStylus.Down> onDown(GestureStylus.Down handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("down"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusDown",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Down>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     */
    public Signal<GestureStylus.Motion> onMotion(GestureStylus.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Motion>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Proximity {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     */
    public Signal<GestureStylus.Proximity> onProximity(GestureStylus.Proximity handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("proximity"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusProximity",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Proximity>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Up {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     */
    public Signal<GestureStylus.Up> onUp(GestureStylus.Up handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("up"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusUp",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Up>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_stylus_new = Interop.downcallHandle(
            "gtk_gesture_stylus_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axes = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axes",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axis = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axis",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_backlog = Interop.downcallHandle(
            "gtk_gesture_stylus_get_backlog",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_device_tool = Interop.downcallHandle(
            "gtk_gesture_stylus_get_device_tool",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureStylus.Down) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureStylus.Motion) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureStylus.Proximity) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureStylus.Up) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
    }
}
