package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGestureLongPress} is a {@code GtkGesture} for long presses.
 * <p>
 * This gesture is also known as “Press and Hold”.
 * <p>
 * When the timeout is exceeded, the gesture is triggering the
 * {@code Gtk.GestureLongPress::pressed} signal.
 * <p>
 * If the touchpoint is lifted before the timeout passes, or if
 * it drifts too far of the initial press point, the
 * {@code Gtk.GestureLongPress::cancelled} signal will be emitted.
 * <p>
 * How long the timeout is before the ::pressed signal gets emitted is
 * determined by the {@code Gtk.Settings:gtk-long-press-time} setting.
 * It can be modified by the {@code Gtk.GestureLongPress:delay-factor}
 * property.
 */
public class GestureLongPress extends GestureSingle {

    public GestureLongPress(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureLongPress */
    public static GestureLongPress castFrom(org.gtk.gobject.Object gobject) {
        return new GestureLongPress(gobject.refcounted());
    }
    
    static final MethodHandle gtk_gesture_long_press_new = Interop.downcallHandle(
        "gtk_gesture_long_press_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_long_press_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes long presses.
     */
    public GestureLongPress() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_gesture_long_press_get_delay_factor = Interop.downcallHandle(
        "gtk_gesture_long_press_get_delay_factor",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the delay factor.
     */
    public double getDelayFactor() {
        try {
            var RESULT = (double) gtk_gesture_long_press_get_delay_factor.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_gesture_long_press_set_delay_factor = Interop.downcallHandle(
        "gtk_gesture_long_press_set_delay_factor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Applies the given delay factor.
     * <p>
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     */
    public void setDelayFactor(double delayFactor) {
        try {
            gtk_gesture_long_press_set_delay_factor.invokeExact(handle(), delayFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CancelledHandler {
        void signalReceived(GestureLongPress source);
    }
    
    /**
     * Emitted whenever a press moved too far, or was released
     * before {@code Gtk.GestureLongPress::pressed} happened.
     */
    public SignalHandle onCancelled(CancelledHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancelled").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureLongPress.Callbacks.class, "signalGestureLongPressCancelled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PressedHandler {
        void signalReceived(GestureLongPress source, double x, double y);
    }
    
    /**
     * Emitted whenever a press goes unmoved/unreleased longer than
     * what the GTK defaults tell.
     */
    public SignalHandle onPressed(PressedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pressed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureLongPress.Callbacks.class, "signalGestureLongPressPressed",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureLongPressCancelled(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureLongPress.CancelledHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureLongPress(Refcounted.get(source)));
        }
        
        public static void signalGestureLongPressPressed(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureLongPress.PressedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureLongPress(Refcounted.get(source)), x, y);
        }
        
    }
}
