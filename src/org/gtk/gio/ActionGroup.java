package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link ActionGroup} represents a group of actions. Actions can be used to
 * expose functionality in a structured way, either from one part of a
 * program to another, or to the outside world. Action groups are often
 * used together with a {@link MenuModel} that provides additional
 * representation data for displaying the actions to the user, e.g. in
 * a menu.
 * <p>
 * The main way to interact with the actions in a GActionGroup is to
 * activate them with g_action_group_activate_action(). Activating an
 * action may require a {@link org.gtk.glib.Variant} parameter. The required type of the
 * parameter can be inquired with g_action_group_get_action_parameter_type().
 * Actions may be disabled, see g_action_group_get_action_enabled().
 * Activating a disabled action has no effect.
 * <p>
 * Actions may optionally have a state in the form of a {@link org.gtk.glib.Variant}. The
 * current state of an action can be inquired with
 * g_action_group_get_action_state(). Activating a stateful action may
 * change its state, but it is also possible to set the state by calling
 * g_action_group_change_action_state().
 * <p>
 * As typical example, consider a text editing application which has an
 * option to change the current font to 'bold'. A good way to represent
 * this would be a stateful action, with a boolean state. Activating the
 * action would toggle the state.
 * <p>
 * Each action in the group has a unique name (which is a string).  All
 * method calls, except g_action_group_list_actions() take the name of
 * an action as an argument.
 * <p>
 * The {@link ActionGroup} API is meant to be the 'public' API to the action
 * group.  The calls here are exactly the interaction that 'external
 * forces' (eg: UI, incoming D-Bus messages, etc.) are supposed to have
 * with actions.  'Internal' APIs (ie: ones meant only to be accessed by
 * the action group implementation) are found on subclasses.  This is
 * why you will find - for example - g_action_group_get_action_enabled()
 * but not an equivalent set() call.
 * <p>
 * Signals are emitted on the action group in response to state changes
 * on individual actions.
 * <p>
 * Implementations of {@link ActionGroup} should provide implementations for
 * the virtual functions g_action_group_list_actions() and
 * g_action_group_query_action().  The other virtual functions should
 * not be implemented - their "wrappers" are actually implemented with
 * calls to g_action_group_query_action().
 */
public interface ActionGroup extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Emits the {@link ActionGroup}::action-added signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionAdded(java.lang.String actionName) {
        gtk_h.g_action_group_action_added(handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    /**
     * Emits the {@link ActionGroup}::action-enabled-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionEnabledChanged(java.lang.String actionName, boolean enabled) {
        gtk_h.g_action_group_action_enabled_changed(handle(), Interop.allocateNativeString(actionName).handle(), enabled ? 1 : 0);
    }
    
    /**
     * Emits the {@link ActionGroup}::action-removed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionRemoved(java.lang.String actionName) {
        gtk_h.g_action_group_action_removed(handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    /**
     * Emits the {@link ActionGroup}::action-state-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionStateChanged(java.lang.String actionName, org.gtk.glib.Variant state) {
        gtk_h.g_action_group_action_state_changed(handle(), Interop.allocateNativeString(actionName).handle(), state.handle());
    }
    
    /**
     * Activate the named action within {@code action_group}.
     * <p>
     * If the action is expecting a parameter, then the correct type of
     * parameter must be given as {@code parameter}.  If the action is expecting no
     * parameters then {@code parameter} must be {@code null}.  See
     * g_action_group_get_action_parameter_type().
     * <p>
     * If the {@link ActionGroup} implementation supports asynchronous remote
     * activation over D-Bus, this call may return before the relevant
     * D-Bus traffic has been sent, or any replies have been received. In
     * order to block on such asynchronous activation calls,
     * g_dbus_connection_flush() should be called prior to the code, which
     * depends on the result of the action activation. Without flushing
     * the D-Bus connection, there is no guarantee that the action would
     * have been activated.
     * <p>
     * The following code which runs in a remote app instance, shows an
     * example of a "quit" action being activated on the primary app
     * instance over D-Bus. Here g_dbus_connection_flush() is called
     * before {@code exit()}. Without g_dbus_connection_flush(), the "quit" action
     * may fail to be activated on the primary instance.
     * <p>
     * <pre>{@code <!-- language="C" -->
     * // call "quit" action on primary instance
     * g_action_group_activate_action (G_ACTION_GROUP (app), "quit", NULL);
     * 
     * // make sure the action is activated now
     * g_dbus_connection_flush (...);
     * 
     * g_debug ("application has been terminated. exiting.");
     * 
     * exit (0);
     * }</pre>
     */
    public default void activateAction(java.lang.String actionName, org.gtk.glib.Variant parameter) {
        gtk_h.g_action_group_activate_action(handle(), Interop.allocateNativeString(actionName).handle(), parameter.handle());
    }
    
    /**
     * Request for the state of the named action within {@code action_group} to be
     * changed to {@code value}.
     * <p>
     * The action must be stateful and {@code value} must be of the correct type.
     * See g_action_group_get_action_state_type().
     * <p>
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than {@code value}.
     * See g_action_group_get_action_state_hint().
     * <p>
     * If the {@code value} GVariant is floating, it is consumed.
     */
    public default void changeActionState(java.lang.String actionName, org.gtk.glib.Variant value) {
        gtk_h.g_action_group_change_action_state(handle(), Interop.allocateNativeString(actionName).handle(), value.handle());
    }
    
    /**
     * Checks if the named action within {@code action_group} is currently enabled.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     */
    public default boolean getActionEnabled(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_get_action_enabled(handle(), Interop.allocateNativeString(actionName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Queries the type of the parameter that must be given when activating
     * the named action within {@code action_group}.
     * <p>
     * When activating the action using g_action_group_activate_action(),
     * the {@link org.gtk.glib.Variant} given to that function must be of the type returned
     * by this function.
     * <p>
     * In the case that this function returns {@code null}, you must not give any
     * {@link org.gtk.glib.Variant}, but {@code null} instead.
     * <p>
     * The parameter type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different parameter type.
     */
    public default org.gtk.glib.VariantType getActionParameterType(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_get_action_parameter_type(handle(), Interop.allocateNativeString(actionName).handle());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    /**
     * Queries the current state of the named action within {@code action_group}.
     * <p>
     * If the action is not stateful then {@code null} will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by g_action_group_get_action_state_type().
     * <p>
     * The return value (if non-{@code null}) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getActionState(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_get_action_state(handle(), Interop.allocateNativeString(actionName).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Requests a hint about the valid range of values for the state of the
     * named action within {@code action_group}.
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
    public default org.gtk.glib.Variant getActionStateHint(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_get_action_state_hint(handle(), Interop.allocateNativeString(actionName).handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the type of the state of the named action within
     * {@code action_group}.
     * <p>
     * If the action is stateful then this function returns the
     * {@link org.gtk.glib.VariantType} of the state.  All calls to
     * g_action_group_change_action_state() must give a {@link org.gtk.glib.Variant} of this
     * type and g_action_group_get_action_state() will return a {@link org.gtk.glib.Variant}
     * of the same type.
     * <p>
     * If the action is not stateful then this function will return {@code null}.
     * In that case, g_action_group_get_action_state() will return {@code null}
     * and you must not call g_action_group_change_action_state().
     * <p>
     * The state type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different state type.
     */
    public default org.gtk.glib.VariantType getActionStateType(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_get_action_state_type(handle(), Interop.allocateNativeString(actionName).handle());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    /**
     * Checks if the named action exists within {@code action_group}.
     */
    public default boolean hasAction(java.lang.String actionName) {
        var RESULT = gtk_h.g_action_group_has_action(handle(), Interop.allocateNativeString(actionName).handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface ActionAddedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName);
    }
    
    /**
     * Signals that a new action was just added to the group.
     * This signal is emitted after the action has been added
     * and is now visible.
     */
    public default SignalHandle onActionAdded(ActionAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("action-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.class, "__signalActionGroupActionAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalActionGroupActionAdded(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionAddedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    @FunctionalInterface
    public interface ActionEnabledChangedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName, boolean enabled);
    }
    
    /**
     * Signals that the enabled status of the named action has changed.
     */
    public default SignalHandle onActionEnabledChanged(ActionEnabledChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("action-enabled-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.class, "__signalActionGroupActionEnabledChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalActionGroupActionEnabledChanged(MemoryAddress source, MemoryAddress actionName, boolean enabled, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionEnabledChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), enabled);
    }
    
    @FunctionalInterface
    public interface ActionRemovedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName);
    }
    
    /**
     * Signals that an action is just about to be removed from the group.
     * This signal is emitted before the action is removed, so the action
     * is still visible and can be queried from the signal handler.
     */
    public default SignalHandle onActionRemoved(ActionRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("action-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.class, "__signalActionGroupActionRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalActionGroupActionRemoved(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionRemovedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0));
    }
    
    @FunctionalInterface
    public interface ActionStateChangedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName, org.gtk.glib.Variant value);
    }
    
    /**
     * Signals that the state of the named action has changed.
     */
    public default SignalHandle onActionStateChanged(ActionStateChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("action-state-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.class, "__signalActionGroupActionStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalActionGroupActionStateChanged(MemoryAddress source, MemoryAddress actionName, MemoryAddress value, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (ActionGroup.ActionStateChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new ActionGroup.ActionGroupImpl(References.get(source)), actionName.getUtf8String(0), new org.gtk.glib.Variant(References.get(value, false)));
    }
    
    class ActionGroupImpl extends org.gtk.gobject.Object implements ActionGroup {
        public ActionGroupImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
