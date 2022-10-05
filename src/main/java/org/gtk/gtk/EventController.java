package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
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

    public EventController(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventController */
    public static EventController castFrom(org.gtk.gobject.Object gobject) {
        return new EventController(gobject.refcounted());
    }
    
    static final MethodHandle gtk_event_controller_get_current_event = Interop.downcallHandle(
        "gtk_event_controller_get_current_event",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the event that is currently being handled by the controller.
     * <p>
     * At other times, {@code null} is returned.
     */
    public org.gtk.gdk.Event getCurrentEvent() {
        try {
            var RESULT = (MemoryAddress) gtk_event_controller_get_current_event.invokeExact(handle());
            return new org.gtk.gdk.Event(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_current_event_device = Interop.downcallHandle(
        "gtk_event_controller_get_current_event_device",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the device of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, {@code null} is returned.
     */
    public org.gtk.gdk.Device getCurrentEventDevice() {
        try {
            var RESULT = (MemoryAddress) gtk_event_controller_get_current_event_device.invokeExact(handle());
            return new org.gtk.gdk.Device(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_current_event_state = Interop.downcallHandle(
        "gtk_event_controller_get_current_event_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the modifier state of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     */
    public org.gtk.gdk.ModifierType getCurrentEventState() {
        try {
            var RESULT = (int) gtk_event_controller_get_current_event_state.invokeExact(handle());
            return new org.gtk.gdk.ModifierType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_current_event_time = Interop.downcallHandle(
        "gtk_event_controller_get_current_event_time",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the timestamp of the event that is currently being
     * handled by the controller.
     * <p>
     * At other times, 0 is returned.
     */
    public int getCurrentEventTime() {
        try {
            var RESULT = (int) gtk_event_controller_get_current_event_time.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_name = Interop.downcallHandle(
        "gtk_event_controller_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of {@code controller}.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_event_controller_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_propagation_limit = Interop.downcallHandle(
        "gtk_event_controller_get_propagation_limit",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the propagation limit of the event controller.
     */
    public PropagationLimit getPropagationLimit() {
        try {
            var RESULT = (int) gtk_event_controller_get_propagation_limit.invokeExact(handle());
            return new PropagationLimit(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_propagation_phase = Interop.downcallHandle(
        "gtk_event_controller_get_propagation_phase",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the propagation phase at which {@code controller} handles events.
     */
    public PropagationPhase getPropagationPhase() {
        try {
            var RESULT = (int) gtk_event_controller_get_propagation_phase.invokeExact(handle());
            return new PropagationPhase(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_get_widget = Interop.downcallHandle(
        "gtk_event_controller_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkWidget} this controller relates to.
     */
    public Widget getWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_event_controller_get_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_reset = Interop.downcallHandle(
        "gtk_event_controller_reset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resets the {@code controller} to a clean state.
     */
    public void reset() {
        try {
            gtk_event_controller_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_set_name = Interop.downcallHandle(
        "gtk_event_controller_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a name on the controller that can be used for debugging.
     */
    public void setName(java.lang.String name) {
        try {
            gtk_event_controller_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_set_propagation_limit = Interop.downcallHandle(
        "gtk_event_controller_set_propagation_limit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the event propagation limit on the event controller.
     * <p>
     * If the limit is set to {@link PropagationLimit#SAME_NATIVE}, the controller
     * won't handle events that are targeted at widgets on a different
     * surface, such as popovers.
     */
    public void setPropagationLimit(PropagationLimit limit) {
        try {
            gtk_event_controller_set_propagation_limit.invokeExact(handle(), limit.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_event_controller_set_propagation_phase = Interop.downcallHandle(
        "gtk_event_controller_set_propagation_phase",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the propagation phase at which a controller handles events.
     * <p>
     * If {@code phase} is {@link PropagationPhase#NONE}, no automatic event handling will be
     * performed, but other additional gesture maintenance will.
     */
    public void setPropagationPhase(PropagationPhase phase) {
        try {
            gtk_event_controller_set_propagation_phase.invokeExact(handle(), phase.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
