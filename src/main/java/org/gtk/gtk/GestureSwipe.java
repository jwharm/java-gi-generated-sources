package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureSwipe} is a {@code GtkGesture} for swipe gestures.
 * <p>
 * After a press/move/.../move/release sequence happens, the
 * {@code Gtk.GestureSwipe::swipe} signal will be emitted,
 * providing the velocity and directionality of the sequence
 * at the time it was lifted.
 * <p>
 * If the velocity is desired in intermediate points,
 * {@link GestureSwipe#getVelocity} can be called in a
 * {@code Gtk.Gesture::update} handler.
 * <p>
 * All velocities are reported in pixels/sec units.
 */
public class GestureSwipe extends GestureSingle {

    public GestureSwipe(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureSwipe */
    public static GestureSwipe castFrom(org.gtk.gobject.Object gobject) {
        return new GestureSwipe(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_swipe_new = Interop.downcallHandle(
        "gtk_gesture_swipe_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_swipe_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes swipes.
     */
    public GestureSwipe() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gesture_swipe_get_velocity = Interop.downcallHandle(
        "gtk_gesture_swipe_get_velocity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current velocity.
     * <p>
     * If the gesture is recognized, this function returns {@code true} and fills
     * in {@code velocity_x} and {@code velocity_y} with the recorded velocity, as per the
     * last events processed.
     */
    public boolean getVelocity(@NotNull Out<Double> velocityX, @NotNull Out<Double> velocityY) {
        MemorySegment velocityXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment velocityYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_swipe_get_velocity.invokeExact(handle(), (Addressable) velocityXPOINTER.address(), (Addressable) velocityYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        velocityX.set(velocityXPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        velocityY.set(velocityYPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface SwipeHandler {
        void signalReceived(GestureSwipe source, @NotNull double velocityX, @NotNull double velocityY);
    }
    
    /**
     * Emitted when the recognized gesture is finished.
     * <p>
     * Velocity and direction are a product of previously recorded events.
     */
    public SignalHandle onSwipe(SwipeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("swipe"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureSwipe.Callbacks.class, "signalGestureSwipeSwipe",
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
    
        public static void signalGestureSwipeSwipe(MemoryAddress source, double velocityX, double velocityY, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureSwipe.SwipeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureSwipe(Refcounted.get(source)), velocityX, velocityY);
        }
        
    }
}
