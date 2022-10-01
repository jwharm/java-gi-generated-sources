package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link Action} represents a single named action.
 * <p>
 * The main interface to an action is that it can be activated with
 * g_action_activate().  This results in the 'activate' signal being
 * emitted.  An activation has a {@link org.gtk.glib.Variant} parameter (which may be
 * {@code null}).  The correct type for the parameter is determined by a static
 * parameter type (which is given at construction time).
 * <p>
 * An action may optionally have a state, in which case the state may be
 * set with g_action_change_state().  This call takes a {@link org.gtk.glib.Variant}.  The
 * correct type for the state is determined by a static state type
 * (which is given at construction time).
 * <p>
 * The state may have a hint associated with it, specifying its valid
 * range.
 * <p>
 * {@link Action} is merely the interface to the concept of an action, as
 * described above.  Various implementations of actions exist, including
 * {@link SimpleAction}.
 * <p>
 * In all cases, the implementing class is responsible for storing the
 * name of the action, the parameter type, the enabled state, the
 * optional state type and the state and emitting the appropriate
 * signals when these change.  The implementor is responsible for filtering
 * calls to g_action_activate() and g_action_change_state() for type
 * safety and for the state being enabled.
 * <p>
 * Probably the only useful thing to do with a {@link Action} is to put it
 * inside of a {@link SimpleActionGroup}.
 */
public interface Action extends io.github.jwharm.javagi.Proxy {

    /**
     * Activates the action.
     * <p>
     * {@code parameter} must be the correct type of parameter for the action (ie:
     * the parameter type given at construction time).  If the parameter
     * type was {@code null} then {@code parameter} must also be {@code null}.
     * <p>
     * If the {@code parameter} GVariant is floating, it is consumed.
     */
    public default void activate(org.gtk.glib.Variant parameter) {
        gtk_h.g_action_activate(handle(), parameter.handle());
    }
    
    /**
     * Request for the state of {@code action} to be changed to {@code value}.
     * <p>
     * The action must be stateful and {@code value} must be of the correct type.
     * See g_action_get_state_type().
     * <p>
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than {@code value}.
     * See g_action_get_state_hint().
     * <p>
     * If the {@code value} GVariant is floating, it is consumed.
     */
    public default void changeState(org.gtk.glib.Variant value) {
        gtk_h.g_action_change_state(handle(), value.handle());
    }
    
    /**
     * Checks if {@code action} is currently enabled.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     */
    public default boolean getEnabled() {
        var RESULT = gtk_h.g_action_get_enabled(handle());
        return RESULT != 0;
    }
    
    /**
     * Queries the name of {@code action}.
     */
    public default java.lang.String getName() {
        var RESULT = gtk_h.g_action_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Queries the type of the parameter that must be given when activating
     * {@code action}.
     * <p>
     * When activating the action using g_action_activate(), the {@link org.gtk.glib.Variant}
     * given to that function must be of the type returned by this function.
     * <p>
     * In the case that this function returns {@code null}, you must not give any
     * {@link org.gtk.glib.Variant}, but {@code null} instead.
     */
    public default org.gtk.glib.VariantType getParameterType() {
        var RESULT = gtk_h.g_action_get_parameter_type(handle());
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Queries the current state of {@code action}.
     * <p>
     * If the action is not stateful then {@code null} will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by g_action_get_state_type().
     * <p>
     * The return value (if non-{@code null}) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getState() {
        var RESULT = gtk_h.g_action_get_state(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    /**
     * Requests a hint about the valid range of values for the state of
     * {@code action}.
     * <p>
     * If {@code null} is returned it either means that the action is not stateful
     * or that there is no hint about the valid range of values for the
     * state of the action.
     * <p>
     * If a {@link org.gtk.glib.Variant} array is returned then each item in the array is a
     * possible value for the state.  If a {@link org.gtk.glib.Variant} pair (ie: two-tuple) is
     * returned then the tuple specifies the inclusive lower and upper bound
     * of valid values for the state.
     * <p>
     * In any case, the information is merely a hint.  It may be possible to
     * have a state value outside of the hinted range and setting a value
     * within the range may fail.
     * <p>
     * The return value (if non-{@code null}) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getStateHint() {
        var RESULT = gtk_h.g_action_get_state_hint(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    /**
     * Queries the type of the state of {@code action}.
     * <p>
     * If the action is stateful (e.g. created with
     * g_simple_action_new_stateful()) then this function returns the
     * {@link org.gtk.glib.VariantType} of the state.  This is the type of the initial value
     * given as the state. All calls to g_action_change_state() must give a
     * {@link org.gtk.glib.Variant} of this type and g_action_get_state() will return a
     * {@link org.gtk.glib.Variant} of the same type.
     * <p>
     * If the action is not stateful (e.g. created with g_simple_action_new())
     * then this function will return {@code null}. In that case, g_action_get_state()
     * will return {@code null} and you must not call g_action_change_state().
     */
    public default org.gtk.glib.VariantType getStateType() {
        var RESULT = gtk_h.g_action_get_state_type(handle());
        return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks if {@code action_name} is valid.
     * <p>
     * {@code action_name} is valid if it consists only of alphanumeric characters,
     * plus '-' and '.'.  The empty string is not a valid action name.
     * <p>
     * It is an error to call this function with a non-utf8 {@code action_name}.
     * {@code action_name} must not be {@code null}.
     */
    public static boolean nameIsValid(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_name_is_valid(Interop.allocateNativeString(actionName).handle());
        return RESULT != 0;
    }
    
    /**
     * Parses a detailed action name into its separate name and target
     * components.
     * <p>
     * Detailed action names can have three formats.
     * <p>
     * The first format is used to represent an action name with no target
     * value and consists of just an action name containing no whitespace
     * nor the characters ':', '(' or ')'.  For example: "app.action".
     * <p>
     * The second format is used to represent an action with a target value
     * that is a non-empty string consisting only of alphanumerics, plus '-'
     * and '.'.  In that case, the action name and target value are
     * separated by a double colon ("::").  For example:
     * "app.action::target".
     * <p>
     * The third format is used to represent an action with any type of
     * target value, including strings.  The target value follows the action
     * name, surrounded in parens.  For example: "app.action(42)".  The
     * target value is parsed using g_variant_parse().  If a tuple-typed
     * value is desired, it must be specified in the same way, resulting in
     * two sets of parens, for example: "app.action((1,2,3))".  A string
     * target can be specified this way as well: "app.action('target')".
     * For strings, this third format must be used if * target value is
     * empty or contains characters other than alphanumerics, '-' and '.'.
     */
    public static boolean parseDetailedName(java.lang.String detailedName, java.lang.String[] actionName, org.gtk.glib.Variant[] targetValue) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_action_parse_detailed_name(Interop.allocateNativeString(detailedName).handle(), Interop.allocateNativeArray(actionName).handle(), Interop.allocateNativeArray(targetValue).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Formats a detailed action name from {@code action_name} and {@code target_value}.
     * <p>
     * It is an error to call this function with an invalid action name.
     * <p>
     * This function is the opposite of g_action_parse_detailed_name().
     * It will produce a string that can be parsed back to the {@code action_name}
     * and {@code target_value} by that function.
     * <p>
     * See that function for the types of strings that will be printed by
     * this function.
     */
    public static java.lang.String printDetailedName(java.lang.String actionName, org.gtk.glib.Variant targetValue) {
        var RESULT = gtk_h.g_action_print_detailed_name(Interop.allocateNativeString(actionName).handle(), targetValue.handle());
        return RESULT.getUtf8String(0);
    }
    
    class ActionImpl extends org.gtk.gobject.Object implements Action {
        public ActionImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
