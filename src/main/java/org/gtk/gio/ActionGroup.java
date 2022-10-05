package org.gtk.gio;

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
public interface ActionGroup extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle g_action_group_action_added = Interop.downcallHandle(
        "g_action_group_action_added",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@link ActionGroup}::action-added signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionAdded(java.lang.String actionName) {
        try {
            g_action_group_action_added.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_action_enabled_changed = Interop.downcallHandle(
        "g_action_group_action_enabled_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Emits the {@link ActionGroup}::action-enabled-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionEnabledChanged(java.lang.String actionName, boolean enabled) {
        try {
            g_action_group_action_enabled_changed.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_action_removed = Interop.downcallHandle(
        "g_action_group_action_removed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@link ActionGroup}::action-removed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionRemoved(java.lang.String actionName) {
        try {
            g_action_group_action_removed.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_action_state_changed = Interop.downcallHandle(
        "g_action_group_action_state_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the {@link ActionGroup}::action-state-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     */
    public default void actionStateChanged(java.lang.String actionName, org.gtk.glib.Variant state) {
        try {
            g_action_group_action_state_changed.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), state.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_activate_action = Interop.downcallHandle(
        "g_action_group_activate_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            g_action_group_activate_action.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), parameter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_change_action_state = Interop.downcallHandle(
        "g_action_group_change_action_state",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            g_action_group_change_action_state.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_get_action_enabled = Interop.downcallHandle(
        "g_action_group_get_action_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the named action within {@code action_group} is currently enabled.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     */
    public default boolean getActionEnabled(java.lang.String actionName) {
        try {
            var RESULT = (int) g_action_group_get_action_enabled.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_get_action_parameter_type = Interop.downcallHandle(
        "g_action_group_get_action_parameter_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_action_group_get_action_parameter_type.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_get_action_state = Interop.downcallHandle(
        "g_action_group_get_action_state",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_action_group_get_action_state.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_get_action_state_hint = Interop.downcallHandle(
        "g_action_group_get_action_state_hint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_action_group_get_action_state_hint.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_get_action_state_type = Interop.downcallHandle(
        "g_action_group_get_action_state_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) g_action_group_get_action_state_type.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return new org.gtk.glib.VariantType(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_has_action = Interop.downcallHandle(
        "g_action_group_has_action",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the named action exists within {@code action_group}.
     */
    public default boolean hasAction(java.lang.String actionName) {
        try {
            var RESULT = (int) g_action_group_has_action.invokeExact(handle(), Interop.allocateNativeString(actionName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_list_actions = Interop.downcallHandle(
        "g_action_group_list_actions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the actions contained within {@code action_group}.
     * <p>
     * The caller is responsible for freeing the list with g_strfreev() when
     * it is no longer required.
     */
    public default PointerIterator<java.lang.String> listActions() {
        try {
            var RESULT = (MemoryAddress) g_action_group_list_actions.invokeExact(handle());
            return new PointerString(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_action_group_query_action = Interop.downcallHandle(
        "g_action_group_query_action",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries all aspects of the named action within an {@code action_group}.
     * <p>
     * This function acquires the information available from
     * g_action_group_has_action(), g_action_group_get_action_enabled(),
     * g_action_group_get_action_parameter_type(),
     * g_action_group_get_action_state_type(),
     * g_action_group_get_action_state_hint() and
     * g_action_group_get_action_state() with a single function call.
     * <p>
     * This provides two main benefits.
     * <p>
     * The first is the improvement in efficiency that comes with not having
     * to perform repeated lookups of the action in order to discover
     * different things about it.  The second is that implementing
     * {@link ActionGroup} can now be done by only overriding this one virtual
     * function.
     * <p>
     * The interface provides a default implementation of this function that
     * calls the individual functions, as required, to fetch the
     * information.  The interface also provides default implementations of
     * those functions that call this function.  All implementations,
     * therefore, must override either this function or all of the others.
     * <p>
     * If the action exists, {@code true} is returned and any of the requested
     * fields (as indicated by having a non-{@code null} reference passed in) are
     * filled.  If the action doesn't exist, {@code false} is returned and the
     * fields may or may not have been modified.
     */
    public default boolean queryAction(java.lang.String actionName, PointerBoolean enabled, org.gtk.glib.VariantType[] parameterType, org.gtk.glib.VariantType[] stateType, org.gtk.glib.Variant[] stateHint, org.gtk.glib.Variant[] state) {
        try {
            var RESULT = (int) g_action_group_query_action.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), enabled.handle(), Interop.allocateNativeArray(parameterType).handle(), Interop.allocateNativeArray(stateType).handle(), Interop.allocateNativeArray(stateHint).handle(), Interop.allocateNativeArray(state).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-added").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-enabled-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionEnabledChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-removed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-state-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalActionGroupActionAdded(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionGroup.ActionAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionGroup.ActionGroupImpl(Refcounted.get(source)), actionName.getUtf8String(0));
        }
        
        public static void signalActionGroupActionEnabledChanged(MemoryAddress source, MemoryAddress actionName, int enabled, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionGroup.ActionEnabledChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionGroup.ActionGroupImpl(Refcounted.get(source)), actionName.getUtf8String(0), enabled != 0);
        }
        
        public static void signalActionGroupActionRemoved(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionGroup.ActionRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionGroup.ActionGroupImpl(Refcounted.get(source)), actionName.getUtf8String(0));
        }
        
        public static void signalActionGroupActionStateChanged(MemoryAddress source, MemoryAddress actionName, MemoryAddress value, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionGroup.ActionStateChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionGroup.ActionGroupImpl(Refcounted.get(source)), actionName.getUtf8String(0), new org.gtk.glib.Variant(Refcounted.get(value, false)));
        }
        
    }
    
    class ActionGroupImpl extends org.gtk.gobject.Object implements ActionGroup {
        public ActionGroupImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}