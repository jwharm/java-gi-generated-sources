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
public class GestureStylus extends GestureSingle {

    public GestureStylus(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureStylus */
    public static GestureStylus castFrom(org.gtk.gobject.Object gobject) {
        return new GestureStylus(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_stylus_new = Interop.downcallHandle(
        "gtk_gesture_stylus_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_stylus_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkGestureStylus}.
     */
    public GestureStylus() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gesture_stylus_get_axis = Interop.downcallHandle(
        "gtk_gesture_stylus_get_axis",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current value for the requested {@code axis}.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::proximity}
     * signals.
     */
    public boolean getAxis(@NotNull org.gtk.gdk.AxisUse axis, @NotNull Out<Double> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_stylus_get_axis.invokeExact(handle(), axis.getValue(), (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gesture_stylus_get_backlog = Interop.downcallHandle(
        "gtk_gesture_stylus_get_backlog",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean getBacklog(@NotNull Out<org.gtk.gdk.TimeCoord[]> backlog, @NotNull Out<Integer> nElems) {
        MemorySegment backlogPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nElemsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_stylus_get_backlog.invokeExact(handle(), (Addressable) backlogPOINTER.address(), (Addressable) nElemsPOINTER.address());
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
    
    private static final MethodHandle gtk_gesture_stylus_get_device_tool = Interop.downcallHandle(
        "gtk_gesture_stylus_get_device_tool",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDeviceTool} currently driving input through this gesture.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::proximity}
     * signals.
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_gesture_stylus_get_device_tool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DownHandler {
        void signalReceived(GestureStylus source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when the stylus touches the device.
     */
    public SignalHandle onDown(DownHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("down"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusDown",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(GestureStylus source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ProximityHandler {
        void signalReceived(GestureStylus source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     */
    public SignalHandle onProximity(ProximityHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("proximity"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusProximity",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UpHandler {
        void signalReceived(GestureStylus source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     */
    public SignalHandle onUp(UpHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("up"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusUp",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureStylus.DownHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureStylus.MotionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureStylus.ProximityHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
        public static void signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureStylus.UpHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureStylus(Refcounted.get(source)), x, y);
        }
        
    }
}
