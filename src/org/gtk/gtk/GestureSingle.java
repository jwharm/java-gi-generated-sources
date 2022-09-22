package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public GestureSingle(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureSingle */
    public static GestureSingle castFrom(org.gtk.gobject.Object gobject) {
        return new GestureSingle(gobject.getReference());
    }
    
    /**
     * Returns the button number {@code gesture} listens for.
     * <p>
     * If this is 0, the gesture reacts to any button press.
     */
    public int getButton() {
        var RESULT = gtk_h.gtk_gesture_single_get_button(handle());
        return RESULT;
    }
    
    /**
     * Returns the button number currently interacting
     * with {@code gesture}, or 0 if there is none.
     */
    public int getCurrentButton() {
        var RESULT = gtk_h.gtk_gesture_single_get_current_button(handle());
        return RESULT;
    }
    
    /**
     * Returns the event sequence currently interacting with {@code gesture}.
     * <p>
     * This is only meaningful if {@link Gesture#isActive}
     * returns <code>true</code>.
     */
    public org.gtk.gdk.EventSequence getCurrentSequence() {
        var RESULT = gtk_h.gtk_gesture_single_get_current_sequence(handle());
        return new org.gtk.gdk.EventSequence(References.get(RESULT, true));
    }
    
    /**
     * Gets whether a gesture is exclusive.
     * <p>
     * For more information, see {@link GestureSingle#setExclusive}.
     */
    public boolean getExclusive() {
        var RESULT = gtk_h.gtk_gesture_single_get_exclusive(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the gesture is only triggered by touch events.
     */
    public boolean getTouchOnly() {
        var RESULT = gtk_h.gtk_gesture_single_get_touch_only(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the button number {@code gesture} listens to.
     * <p>
     * If non-0, every button press from a different button
     * number will be ignored. Touch events implicitly match
     * with button 1.
     */
    public void setButton(int button) {
        gtk_h.gtk_gesture_single_set_button(handle(), button);
    }
    
    /**
     * Sets whether {@code gesture} is exclusive.
     * <p>
     * An exclusive gesture will only handle pointer and "pointer emulated"
     * touch events, so at any given time, there is only one sequence able
     * to interact with those.
     */
    public void setExclusive(boolean exclusive) {
        gtk_h.gtk_gesture_single_set_exclusive(handle(), exclusive ? 1 : 0);
    }
    
    /**
     * Sets whether to handle only touch events.
     * <p>
     * If {@code touch_only} is <code>true</code>, {@code gesture} will only handle events of type
     * {@link org.gtk.gdk.EventType#TOUCH_BEGIN}, {@link org.gtk.gdk.EventType#TOUCH_UPDATE} or {@link org.gtk.gdk.EventType#TOUCH_END}. If <code>false</code>,
     * mouse events will be handled too.
     */
    public void setTouchOnly(boolean touchOnly) {
        gtk_h.gtk_gesture_single_set_touch_only(handle(), touchOnly ? 1 : 0);
    }
    
}
