package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GAction represents a single named action.
 * 
 * The main interface to an action is that it can be activated with
 * g_action_activate().  This results in the 'activate' signal being
 * emitted.  An activation has a #GVariant parameter (which may be
 * %NULL).  The correct type for the parameter is determined by a static
 * parameter type (which is given at construction time).
 * 
 * An action may optionally have a state, in which case the state may be
 * set with g_action_change_state().  This call takes a #GVariant.  The
 * correct type for the state is determined by a static state type
 * (which is given at construction time).
 * 
 * The state may have a hint associated with it, specifying its valid
 * range.
 * 
 * #GAction is merely the interface to the concept of an action, as
 * described above.  Various implementations of actions exist, including
 * #GSimpleAction.
 * 
 * In all cases, the implementing class is responsible for storing the
 * name of the action, the parameter type, the enabled state, the
 * optional state type and the state and emitting the appropriate
 * signals when these change.  The implementor is responsible for filtering
 * calls to g_action_activate() and g_action_change_state() for type
 * safety and for the state being enabled.
 * 
 * Probably the only useful thing to do with a #GAction is to put it
 * inside of a #GSimpleActionGroup.
 */
public interface Action extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Activates the action.
     * 
     * @parameter must be the correct type of parameter for the action (ie:
     * the parameter type given at construction time).  If the parameter
     * type was %NULL then @parameter must also be %NULL.
     * 
     * If the @parameter GVariant is floating, it is consumed.
     */
    public default void activate(org.gtk.glib.Variant parameter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_activate(HANDLE(), parameter.HANDLE());
    }
    
    /**
     * Request for the state of @action to be changed to @value.
     * 
     * The action must be stateful and @value must be of the correct type.
     * See g_action_get_state_type().
     * 
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than @value.
     * See g_action_get_state_hint().
     * 
     * If the @value GVariant is floating, it is consumed.
     */
    public default void changeState(org.gtk.glib.Variant value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_change_state(HANDLE(), value.HANDLE());
    }
    
    /**
     * Checks if @action is currently enabled.
     * 
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     */
    public default boolean getEnabled() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_enabled(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Queries the name of @action.
     */
    public default java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the type of the parameter that must be given when activating
     * @action.
     * 
     * When activating the action using g_action_activate(), the #GVariant
     * given to that function must be of the type returned by this function.
     * 
     * In the case that this function returns %NULL, you must not give any
     * #GVariant, but %NULL instead.
     */
    public default org.gtk.glib.VariantType getParameterType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_parameter_type(HANDLE());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    /**
     * Queries the current state of @action.
     * 
     * If the action is not stateful then %NULL will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by g_action_get_state_type().
     * 
     * The return value (if non-%NULL) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_state(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Requests a hint about the valid range of values for the state of
     * @action.
     * 
     * If %NULL is returned it either means that the action is not stateful
     * or that there is no hint about the valid range of values for the
     * state of the action.
     * 
     * If a #GVariant array is returned then each item in the array is a
     * possible value for the state.  If a #GVariant pair (ie: two-tuple) is
     * returned then the tuple specifies the inclusive lower and upper bound
     * of valid values for the state.
     * 
     * In any case, the information is merely a hint.  It may be possible to
     * have a state value outside of the hinted range and setting a value
     * within the range may fail.
     * 
     * The return value (if non-%NULL) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getStateHint() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_state_hint(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the type of the state of @action.
     * 
     * If the action is stateful (e.g. created with
     * g_simple_action_new_stateful()) then this function returns the
     * #GVariantType of the state.  This is the type of the initial value
     * given as the state. All calls to g_action_change_state() must give a
     * #GVariant of this type and g_action_get_state() will return a
     * #GVariant of the same type.
     * 
     * If the action is not stateful (e.g. created with g_simple_action_new())
     * then this function will return %NULL. In that case, g_action_get_state()
     * will return %NULL and you must not call g_action_change_state().
     */
    public default org.gtk.glib.VariantType getStateType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_get_state_type(HANDLE());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    class ActionImpl extends org.gtk.gobject.Object implements Action {
        public ActionImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
