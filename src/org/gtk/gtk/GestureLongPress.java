package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGestureLongPress` is a `GtkGesture` for long presses.
 * 
 * This gesture is also known as “Press and Hold”.
 * 
 * When the timeout is exceeded, the gesture is triggering the
 * [signal@Gtk.GestureLongPress::pressed] signal.
 * 
 * If the touchpoint is lifted before the timeout passes, or if
 * it drifts too far of the initial press point, the
 * [signal@Gtk.GestureLongPress::cancelled] signal will be emitted.
 * 
 * How long the timeout is before the ::pressed signal gets emitted is
 * determined by the [property@Gtk.Settings:gtk-long-press-time] setting.
 * It can be modified by the [property@Gtk.GestureLongPress:delay-factor]
 * property.
 */
public class GestureLongPress extends GestureSingle {

    public GestureLongPress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GestureLongPress */
    public static GestureLongPress castFrom(org.gtk.gobject.Object gobject) {
        return new GestureLongPress(gobject.getProxy());
    }
    
    /**
     * Returns a newly created `GtkGesture` that recognizes long presses.
     */
    public GestureLongPress() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_long_press_new(), true));
    }
    
    /**
     * Returns the delay factor.
     */
    public double getDelayFactor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_long_press_get_delay_factor(HANDLE());
        return RESULT;
    }
    
    /**
     * Applies the given delay factor.
     * 
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     */
    public void setDelayFactor(double delayFactor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_long_press_set_delay_factor(HANDLE(), delayFactor);
    }
    
    @FunctionalInterface
    public interface CancelledHandler {
        void signalReceived(GestureLongPress source);
    }
    
    /**
     * Emitted whenever a press moved too far, or was released
     * before [signal@Gtk.GestureLongPress::pressed] happened.
     */
    public void onCancelled(CancelledHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureLongPressCancelled", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("cancelled"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onPressed(PressedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureLongPressPressed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("pressed"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
