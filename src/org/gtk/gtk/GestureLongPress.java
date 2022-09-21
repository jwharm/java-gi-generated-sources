package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public GestureLongPress(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureLongPress */
    public static GestureLongPress castFrom(org.gtk.gobject.Object gobject) {
        return new GestureLongPress(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_long_press_new(), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes long presses.
     */
    public GestureLongPress() {
        super(constructNew());
    }
    
    /**
     * Returns the delay factor.
     */
    public double getDelayFactor() {
        var RESULT = gtk_h.gtk_gesture_long_press_get_delay_factor(handle());
        return RESULT;
    }
    
    /**
     * Applies the given delay factor.
     * <p>
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     */
    public void setDelayFactor(double delayFactor) {
        gtk_h.gtk_gesture_long_press_set_delay_factor(handle(), delayFactor);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureLongPressCancelled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cancelled").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureLongPressPressed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("pressed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
