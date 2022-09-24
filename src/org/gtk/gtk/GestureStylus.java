package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGestureStylus} is a {@code GtkGesture} specific to stylus input.
 * <p>
 * The provided signals just relay the basic information of the
 * stylus events.
 */
public class GestureStylus extends GestureSingle {

    public GestureStylus(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureStylus */
    public static GestureStylus castFrom(org.gtk.gobject.Object gobject) {
        return new GestureStylus(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_stylus_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGestureStylus}.
     */
    public GestureStylus() {
        super(constructNew());
    }
    
    /**
     * Returns the {@code GdkDeviceTool} currently driving input through this gesture.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::proximity}
     * signals.
     */
    public org.gtk.gdk.DeviceTool getDeviceTool() {
        var RESULT = gtk_h.gtk_gesture_stylus_get_device_tool(handle());
        return new org.gtk.gdk.DeviceTool(References.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface DownHandler {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus touches the device.
     */
    public SignalHandle onDown(DownHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("down").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.class, "__signalGestureStylusDown",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.DownHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("motion").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.class, "__signalGestureStylusMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.MotionHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    @FunctionalInterface
    public interface ProximityHandler {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     */
    public SignalHandle onProximity(ProximityHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("proximity").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.class, "__signalGestureStylusProximity",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.ProximityHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
    @FunctionalInterface
    public interface UpHandler {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     */
    public SignalHandle onUp(UpHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("up").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.class, "__signalGestureStylusUp",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureStylus.UpHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureStylus(References.get(source)), x, y);
    }
    
}
