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
public class GestureSingle extends org.gtk.gtk.Gesture {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureSingle";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureSingle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GestureSingle(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureSingle if its GType is a (or inherits from) "GtkGestureSingle".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GestureSingle" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureSingle", a ClassCastException will be thrown.
     */
    public static GestureSingle castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGestureSingle"))) {
            return new GestureSingle(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureSingle");
        }
    }
    
    /**
     * Returns the button number {@code gesture} listens for.
     * <p>
     * If this is 0, the gesture reacts to any button press.
     * @return The button number, or 0 for any button
     */
    public int getButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_single_get_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the button number currently interacting
     * with {@code gesture}, or 0 if there is none.
     * @return The current button number
     */
    public int getCurrentButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_single_get_current_button.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the event sequence currently interacting with {@code gesture}.
     * <p>
     * This is only meaningful if {@link Gesture#isActive}
     * returns {@code true}.
     * @return the current sequence
     */
    public @Nullable org.gtk.gdk.EventSequence getCurrentSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_single_get_current_sequence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.EventSequence(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets whether a gesture is exclusive.
     * <p>
     * For more information, see {@link GestureSingle#setExclusive}.
     * @return Whether the gesture is exclusive
     */
    public boolean getExclusive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_single_get_exclusive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the gesture is only triggered by touch events.
     * @return {@code true} if the gesture only handles touch events
     */
    public boolean getTouchOnly() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_single_get_touch_only.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the button number {@code gesture} listens to.
     * <p>
     * If non-0, every button press from a different button
     * number will be ignored. Touch events implicitly match
     * with button 1.
     * @param button button number to listen to, or 0 for any button
     */
    public void setButton(int button) {
        try {
            DowncallHandles.gtk_gesture_single_set_button.invokeExact(
                    handle(),
                    button);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code gesture} is exclusive.
     * <p>
     * An exclusive gesture will only handle pointer and "pointer emulated"
     * touch events, so at any given time, there is only one sequence able
     * to interact with those.
     * @param exclusive {@code true} to make {@code gesture} exclusive
     */
    public void setExclusive(boolean exclusive) {
        try {
            DowncallHandles.gtk_gesture_single_set_exclusive.invokeExact(
                    handle(),
                    exclusive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to handle only touch events.
     * <p>
     * If {@code touch_only} is {@code true}, {@code gesture} will only handle events of type
     * {@link org.gtk.gdk.EventType#TOUCH_BEGIN}, {@link org.gtk.gdk.EventType#TOUCH_UPDATE} or {@link org.gtk.gdk.EventType#TOUCH_END}. If {@code false},
     * mouse events will be handled too.
     * @param touchOnly whether {@code gesture} handles only touch events
     */
    public void setTouchOnly(boolean touchOnly) {
        try {
            DowncallHandles.gtk_gesture_single_set_touch_only.invokeExact(
                    handle(),
                    touchOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_single_get_button = Interop.downcallHandle(
            "gtk_gesture_single_get_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_get_current_button = Interop.downcallHandle(
            "gtk_gesture_single_get_current_button",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_get_current_sequence = Interop.downcallHandle(
            "gtk_gesture_single_get_current_sequence",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_get_exclusive = Interop.downcallHandle(
            "gtk_gesture_single_get_exclusive",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_get_touch_only = Interop.downcallHandle(
            "gtk_gesture_single_get_touch_only",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_set_button = Interop.downcallHandle(
            "gtk_gesture_single_set_button",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_set_exclusive = Interop.downcallHandle(
            "gtk_gesture_single_set_exclusive",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_gesture_single_set_touch_only = Interop.downcallHandle(
            "gtk_gesture_single_set_touch_only",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
