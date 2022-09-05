package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGestureSingle` is a `GtkGestures` subclass optimized for singe-touch
 * and mouse gestures.
 * 
 * Under interaction, these gestures stick to the first interacting sequence,
 * which is accessible through [method@Gtk.GestureSingle.get_current_sequence]
 * while the gesture is being interacted with.
 * 
 * By default gestures react to both %GDK_BUTTON_PRIMARY and touch events.
 * [method@Gtk.GestureSingle.set_touch_only] can be used to change the
 * touch behavior. Callers may also specify a different mouse button number
 * to interact with through [method@Gtk.GestureSingle.set_button], or react
 * to any mouse button by setting it to 0. While the gesture is active, the
 * button being currently pressed can be known through
 * [method@Gtk.GestureSingle.get_current_button].
 */
public class GestureSingle extends Gesture {

    public GestureSingle(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GestureSingle */
    public static GestureSingle castFrom(org.gtk.gobject.Object gobject) {
        return new GestureSingle(gobject.getProxy());
    }
    
    /**
     * Returns the button number @gesture listens for.
     * 
     * If this is 0, the gesture reacts to any button press.
     */
    public int getButton() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_get_button(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the button number currently interacting
     * with @gesture, or 0 if there is none.
     */
    public int getCurrentButton() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_get_current_button(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the event sequence currently interacting with @gesture.
     * 
     * This is only meaningful if [method@Gtk.Gesture.is_active]
     * returns %TRUE.
     */
    public org.gtk.gdk.EventSequence getCurrentSequence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_get_current_sequence(HANDLE());
        return new org.gtk.gdk.EventSequence(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Gets whether a gesture is exclusive.
     * 
     * For more information, see [method@Gtk.GestureSingle.set_exclusive].
     */
    public boolean getExclusive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_get_exclusive(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the gesture is only triggered by touch events.
     */
    public boolean getTouchOnly() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_get_touch_only(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_set_button(HANDLE(), button);
    }
    
    /**
     * Sets whether @gesture is exclusive.
     * 
     * An exclusive gesture will only handle pointer and "pointer emulated"
     * touch events, so at any given time, there is only one sequence able
     * to interact with those.
     */
    public void setExclusive(boolean exclusive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_set_exclusive(HANDLE(), exclusive ? 1 : 0);
    }
    
    /**
     * Sets whether to handle only touch events.
     * 
     * If @touch_only is %TRUE, @gesture will only handle events of type
     * %GDK_TOUCH_BEGIN, %GDK_TOUCH_UPDATE or %GDK_TOUCH_END. If %FALSE,
     * mouse events will be handled too.
     */
    public void setTouchOnly(boolean touchOnly) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gesture_single_set_touch_only(HANDLE(), touchOnly ? 1 : 0);
    }
    
}
