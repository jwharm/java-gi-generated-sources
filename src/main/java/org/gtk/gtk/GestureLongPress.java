package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class GestureLongPress extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureLongPress";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureLongPress proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GestureLongPress(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureLongPress if its GType is a (or inherits from) "GtkGestureLongPress".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureLongPress} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureLongPress", a ClassCastException will be thrown.
     */
    public static GestureLongPress castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGestureLongPress"))) {
            return new GestureLongPress(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureLongPress");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_long_press_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes long presses.
     */
    public GestureLongPress() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns the delay factor.
     * @return the delay factor
     */
    public double getDelayFactor() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_gesture_long_press_get_delay_factor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Applies the given delay factor.
     * <p>
     * The default long press time will be multiplied by this value.
     * Valid values are in the range [0.5..2.0].
     * @param delayFactor The delay factor to apply
     */
    public void setDelayFactor(double delayFactor) {
        try {
            DowncallHandles.gtk_gesture_long_press_set_delay_factor.invokeExact(
                    handle(),
                    delayFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Cancelled {
        void signalReceived(GestureLongPress source);
    }
    
    /**
     * Emitted whenever a press moved too far, or was released
     * before {@code Gtk.GestureLongPress::pressed} happened.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureLongPress.Cancelled> onCancelled(GestureLongPress.Cancelled handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancelled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureLongPress.Callbacks.class, "signalGestureLongPressCancelled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureLongPress.Cancelled>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Pressed {
        void signalReceived(GestureLongPress source, double x, double y);
    }
    
    /**
     * Emitted whenever a press goes unmoved/unreleased longer than
     * what the GTK defaults tell.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureLongPress.Pressed> onPressed(GestureLongPress.Pressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pressed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureLongPress.Callbacks.class, "signalGestureLongPressPressed",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureLongPress.Pressed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_long_press_new = Interop.downcallHandle(
            "gtk_gesture_long_press_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_long_press_get_delay_factor = Interop.downcallHandle(
            "gtk_gesture_long_press_get_delay_factor",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_long_press_set_delay_factor = Interop.downcallHandle(
            "gtk_gesture_long_press_set_delay_factor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureLongPressCancelled(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureLongPress.Cancelled) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureLongPress(source, Ownership.UNKNOWN));
        }
        
        public static void signalGestureLongPressPressed(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GestureLongPress.Pressed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureLongPress(source, Ownership.UNKNOWN), x, y);
        }
    }
}
