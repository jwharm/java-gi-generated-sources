package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGestureClick} is a {@code GtkGesture} implementation for clicks.
 * <p>
 * It is able to recognize multiple clicks on a nearby zone, which
 * can be listened for through the {@code Gtk.GestureClick::pressed}
 * signal. Whenever time or distance between clicks exceed the GTK
 * defaults, {@code Gtk.GestureClick::stopped} is emitted, and the
 * click counter is reset.
 */
public class GestureClick extends GestureSingle {

    public GestureClick(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureClick */
    public static GestureClick castFrom(org.gtk.gobject.Object gobject) {
        return new GestureClick(gobject.refcounted());
    }
    
    static final MethodHandle gtk_gesture_click_new = Interop.downcallHandle(
        "gtk_gesture_click_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_click_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes
     * single and multiple presses.
     */
    public GestureClick() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface PressedHandler {
        void signalReceived(GestureClick source, int nPress, double x, double y);
    }
    
    /**
     * Emitted whenever a button or touch press happens.
     */
    public SignalHandle onPressed(PressedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pressed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickPressed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ReleasedHandler {
        void signalReceived(GestureClick source, int nPress, double x, double y);
    }
    
    /**
     * Emitted when a button or touch is released.
     * <p>
     * {@code n_press} will report the number of press that is paired to
     * this event, note that {@code Gtk.GestureClick::stopped} may
     * have been emitted between the press and its release, {@code n_press}
     * will only start over at the next press.
     */
    public SignalHandle onReleased(ReleasedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("released").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StoppedHandler {
        void signalReceived(GestureClick source);
    }
    
    /**
     * Emitted whenever any time/distance threshold has been exceeded.
     */
    public SignalHandle onStopped(StoppedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stopped").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickStopped",
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
    public interface UnpairedReleaseHandler {
        void signalReceived(GestureClick source, double x, double y, int button, org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted whenever the gesture receives a release
     * event that had no previous corresponding press.
     * <p>
     * Due to implicit grabs, this can only happen on situations
     * where input is grabbed elsewhere mid-press or the pressed
     * widget voluntarily relinquishes its implicit grab.
     */
    public SignalHandle onUnpairedRelease(UnpairedReleaseHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unpaired-release").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickUnpairedRelease",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureClickPressed(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureClick.PressedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureClick(Refcounted.get(source)), nPress, x, y);
        }
        
        public static void signalGestureClickReleased(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureClick.ReleasedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureClick(Refcounted.get(source)), nPress, x, y);
        }
        
        public static void signalGestureClickStopped(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureClick.StoppedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureClick(Refcounted.get(source)));
        }
        
        public static void signalGestureClickUnpairedRelease(MemoryAddress source, double x, double y, int button, MemoryAddress sequence, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureClick.UnpairedReleaseHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureClick(Refcounted.get(source)), x, y, button, new org.gtk.gdk.EventSequence(Refcounted.get(sequence, false)));
        }
        
    }
}
