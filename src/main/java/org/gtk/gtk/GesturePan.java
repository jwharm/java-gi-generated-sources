package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGesturePan} is a {@code GtkGesture} for pan gestures.
 * <p>
 * These are drags that are locked to happen along one axis. The axis
 * that a {@code GtkGesturePan} handles is defined at construct time, and
 * can be changed through {@link GesturePan#setOrientation}.
 * <p>
 * When the gesture starts to be recognized, {@code GtkGesturePan} will
 * attempt to determine as early as possible whether the sequence
 * is moving in the expected direction, and denying the sequence if
 * this does not happen.
 * <p>
 * Once a panning gesture along the expected axis is recognized,
 * the {@code Gtk.GesturePan::pan} signal will be emitted as input
 * events are received, containing the offset in the given axis.
 */
public class GesturePan extends GestureDrag {

    public GesturePan(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GesturePan */
    public static GesturePan castFrom(org.gtk.gobject.Object gobject) {
        return new GesturePan(gobject.refcounted());
    }
    
    static final MethodHandle gtk_gesture_pan_new = Interop.downcallHandle(
        "gtk_gesture_pan_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Orientation orientation) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_pan_new.invokeExact(orientation.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes pan gestures.
     */
    public GesturePan(Orientation orientation) {
        super(constructNew(orientation));
    }
    
    static final MethodHandle gtk_gesture_pan_get_orientation = Interop.downcallHandle(
        "gtk_gesture_pan_get_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the orientation of the pan gestures that this {@code gesture} expects.
     */
    public Orientation getOrientation() {
        try {
            var RESULT = (int) gtk_gesture_pan_get_orientation.invokeExact(handle());
            return new Orientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_gesture_pan_set_orientation = Interop.downcallHandle(
        "gtk_gesture_pan_set_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the orientation to be expected on pan gestures.
     */
    public void setOrientation(Orientation orientation) {
        try {
            gtk_gesture_pan_set_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PanHandler {
        void signalReceived(GesturePan source, PanDirection direction, double offset);
    }
    
    /**
     * Emitted once a panning gesture along the expected axis is detected.
     */
    public SignalHandle onPan(PanHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pan").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GesturePan.Callbacks.class, "signalGesturePanPan",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGesturePanPan(MemoryAddress source, int direction, double offset, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GesturePan.PanHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GesturePan(Refcounted.get(source)), new PanDirection(direction), offset);
        }
        
    }
}
