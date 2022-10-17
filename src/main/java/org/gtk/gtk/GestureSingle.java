package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureSingle} is a {@code GtkGestures} subclass optimized for singe-touch
 * and mouse gestures.
 * <p>
 * Under interaction, these gestures stick to the first interacting sequence,
 * which is accessible through {@link GestureSingle#getCurrentSequence}
 * while the gesture is being interacted with.
 * <p>
 * By default gestures react to both {@code GDK_BUTTON_PRIMARY} and touch events.
 * {@link GestureSingle#setTouchOnly} can be used to change the
 * touch behavior. Callers may also specify a different mouse button number
 * to interact with through {@link GestureSingle#setButton}, or react
 * to any mouse button by setting it to 0. While the gesture is active, the
 * button being currently pressed can be known through
 * {@link GestureSingle#getCurrentButton}.
 */
public class GestureSingle extends Gesture {

    public GestureSingle(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureSingle */
    public static GestureSingle castFrom(org.gtk.gobject.Object gobject) {
        return new GestureSingle(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_single_get_button = Interop.downcallHandle(
        "gtk_gesture_single_get_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the button number {@code gesture} listens for.
     * <p>
     * If this is 0, the gesture reacts to any button press.
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_single_get_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_gesture_single_get_current_button = Interop.downcallHandle(
        "gtk_gesture_single_get_current_button",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the button number currently interacting
     * with {@code gesture}, or 0 if there is none.
     */
    public int getCurrentButton() {
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_single_get_current_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_gesture_single_get_current_sequence = Interop.downcallHandle(
        "gtk_gesture_single_get_current_sequence",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the event sequence currently interacting with {@code gesture}.
     * <p>
     * This is only meaningful if {@link Gesture#isActive}
     * returns {@code true}.
     */
    public @Nullable org.gtk.gdk.EventSequence getCurrentSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_gesture_single_get_current_sequence.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.EventSequence(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_gesture_single_get_exclusive = Interop.downcallHandle(
        "gtk_gesture_single_get_exclusive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether a gesture is exclusive.
     * <p>
     * For more information, see {@link GestureSingle#setExclusive}.
     */
    public boolean getExclusive() {
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_single_get_exclusive.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gesture_single_get_touch_only = Interop.downcallHandle(
        "gtk_gesture_single_get_touch_only",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the gesture is only triggered by touch events.
     */
    public boolean getTouchOnly() {
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_single_get_touch_only.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gesture_single_set_button = Interop.downcallHandle(
        "gtk_gesture_single_set_button",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the button number {@code gesture} listens to.
     * <p>
     * If non-0, every button press from a different button
     * number will be ignored. Touch events implicitly match
     * with button 1.
     */
    public @NotNull void setButton(@NotNull int button) {
        try {
            gtk_gesture_single_set_button.invokeExact(handle(), button);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gesture_single_set_exclusive = Interop.downcallHandle(
        "gtk_gesture_single_set_exclusive",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code gesture} is exclusive.
     * <p>
     * An exclusive gesture will only handle pointer and "pointer emulated"
     * touch events, so at any given time, there is only one sequence able
     * to interact with those.
     */
    public @NotNull void setExclusive(@NotNull boolean exclusive) {
        try {
            gtk_gesture_single_set_exclusive.invokeExact(handle(), exclusive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gesture_single_set_touch_only = Interop.downcallHandle(
        "gtk_gesture_single_set_touch_only",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to handle only touch events.
     * <p>
     * If {@code touch_only} is {@code true}, {@code gesture} will only handle events of type
     * {@link org.gtk.gdk.EventType#TOUCH_BEGIN}, {@link org.gtk.gdk.EventType#TOUCH_UPDATE} or {@link org.gtk.gdk.EventType#TOUCH_END}. If {@code false},
     * mouse events will be handled too.
     */
    public @NotNull void setTouchOnly(@NotNull boolean touchOnly) {
        try {
            gtk_gesture_single_set_touch_only.invokeExact(handle(), touchOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
