package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkEventController} is the base class for event controllers.
 * <p>
 * These are ancillary objects associated to widgets, which react
 * to {@code GdkEvents}, and possibly trigger actions as a consequence.
 * <p>
 * Event controllers are added to a widget with
 * {@link Widget#addController}. It is rarely necessary to
 * explicitly remove a controller with {@link Widget#removeController}.
 * <p>
 * See the chapter on <a href="input-handling.html">input handling</a> for
 * an overview of the basic concepts, such as the capture and bubble
 * phases of even propagation.
 */
public class EventController extends org.gtk.gobject.Object {

    public EventController(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventController */
    public static EventController castFrom(org.gtk.gobject.Object gobject) {
        return new EventController(gobject.getReference());
    }
    
    /**
     * Returns the event that is currently being handled by the controller.
     * <p>
     * At other times, <code>null</code> is returned.
     */
    public org.gtk.gdk.Event getCurrentEvent() {
        var RESULT = gtk_h.gtk_event_controller_get_current_event(handle());
        return new org.gtk.gdk.Event(References.get(RESULT, false));
    }
    
    /**
     * Returns the device of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, <code>null</code> is returned.
     */
    public org.gtk.gdk.Device getCurrentEventDevice() {
        var RESULT = gtk_h.gtk_event_controller_get_current_event_device(handle());
        return new org.gtk.gdk.Device(References.get(RESULT, false));
    }
    
    /**
     * Returns the modifier state of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     */
    public int getCurrentEventState() {
        var RESULT = gtk_h.gtk_event_controller_get_current_event_state(handle());
        return RESULT;
    }
    
    /**
     * Returns the timestamp of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     */
    public int getCurrentEventTime() {
        var RESULT = gtk_h.gtk_event_controller_get_current_event_time(handle());
        return RESULT;
    }
    
    /**
     * Gets the name of {@code controller}.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_event_controller_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the propagation limit of the event controller.
     */
    public PropagationLimit getPropagationLimit() {
        var RESULT = gtk_h.gtk_event_controller_get_propagation_limit(handle());
        return PropagationLimit.fromValue(RESULT);
    }
    
    /**
     * Gets the propagation phase at which {@code controller} handles events.
     */
    public PropagationPhase getPropagationPhase() {
        var RESULT = gtk_h.gtk_event_controller_get_propagation_phase(handle());
        return PropagationPhase.fromValue(RESULT);
    }
    
    /**
     * Returns the {@code GtkWidget} this controller relates to.
     */
    public Widget getWidget() {
        var RESULT = gtk_h.gtk_event_controller_get_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Resets the {@code controller} to a clean state.
     */
    public void reset() {
        gtk_h.gtk_event_controller_reset(handle());
    }
    
    /**
     * Sets a name on the controller that can be used for debugging.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_event_controller_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the event propagation limit on the event controller.
     * <p>
     * If the limit is set to {@link PropagationLimit#SAME_NATIVE}, the controller
     * won't handle events that are targeted at widgets on a different
     * surface, such as popovers.
     */
    public void setPropagationLimit(PropagationLimit limit) {
        gtk_h.gtk_event_controller_set_propagation_limit(handle(), limit.getValue());
    }
    
    /**
     * Sets the propagation phase at which a controller handles events.
     * <p>
     * If {@code phase} is {@link PropagationPhase#NONE}, no automatic event handling will be
     * performed, but other additional gesture maintenance will.
     */
    public void setPropagationPhase(PropagationPhase phase) {
        gtk_h.gtk_event_controller_set_propagation_phase(handle(), phase.getValue());
    }
    
}
