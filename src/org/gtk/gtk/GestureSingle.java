package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGestureSingle</code> is a <code>GtkGestures</code> subclass optimized for singe-touch
 * and mouse gestures.
 * 
 * Under interaction, these gestures stick to the first interacting sequence,
 * which is accessible through {@link org.gtk.gtk.GestureSingle<code>#getCurrentSequence</code> 
 * while the gesture is being interacted with.
 * 
 * By default gestures react to both <code>GDK_BUTTON_PRIMARY</code> and touch events.
 * {@link org.gtk.gtk.GestureSingle<code>#setTouchOnly</code>  can be used to change the
 * touch behavior. Callers may also specify a different mouse button number
 * to interact with through {@link org.gtk.gtk.GestureSingle<code>#setButton</code> , or react
 * to any mouse button by setting it to 0. While the gesture is active, the
 * button being currently pressed can be known through
 * {@link org.gtk.gtk.GestureSingle<code>#getCurrentButton</code> .
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
     * Returns the button number @gesture listens for.
     * 
     * If this is 0, the gesture reacts to any button press.
     */
    public int getButton() {
        var RESULT = gtk_h.gtk_gesture_single_get_button(handle());
        return RESULT;
    }
    
    /**
     * Returns the button number currently interacting
     * with @gesture, or 0 if there is none.
     */
    public int getCurrentButton() {
        var RESULT = gtk_h.gtk_gesture_single_get_current_button(handle());
        return RESULT;
    }
    
    /**
     * Returns the event sequence currently interacting with @gesture.
     * 
     * This is only meaningful if {@link org.gtk.gtk.Gesture<code>#isActive</code> 
     * returns <code>true</code>
     */
    public org.gtk.gdk.EventSequence getCurrentSequence() {
        var RESULT = gtk_h.gtk_gesture_single_get_current_sequence(handle());
        return new org.gtk.gdk.EventSequence(References.get(RESULT, true));
    }
    
    /**
     * Gets whether a gesture is exclusive.
     * 
     * For more information, see {@link org.gtk.gtk.GestureSingle<code>#setExclusive</code> .
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
     * Sets the button number @gesture listens to.
     * 
     * If non-0, every button press from a different button
     * number will be ignored. Touch events implicitly match
     * with button 1.
     */
    public void setButton(int button) {
        gtk_h.gtk_gesture_single_set_button(handle(), button);
    }
    
    /**
     * Sets whether @gesture is exclusive.
     * 
     * An exclusive gesture will only handle pointer and &<code>#34</code> pointer emulated&<code>#34</code> 
     * touch events, so at any given time, there is only one sequence able
     * to interact with those.
     */
    public void setExclusive(boolean exclusive) {
        gtk_h.gtk_gesture_single_set_exclusive(handle(), exclusive ? 1 : 0);
    }
    
    /**
     * Sets whether to handle only touch events.
     * 
     * If @touch_only is <code>true</code>  @gesture will only handle events of type
     * {@link org.gtk.gdk.EventType<code>#TOUCH_BEGIN</code>   {@link org.gtk.gdk.EventType<code>#TOUCH_UPDATE</code>  or {@link org.gtk.gdk.EventType<code>#TOUCH_END</code>   If <code>false</code> 
     * mouse events will be handled too.
     */
    public void setTouchOnly(boolean touchOnly) {
        gtk_h.gtk_gesture_single_set_touch_only(handle(), touchOnly ? 1 : 0);
    }
    
}
