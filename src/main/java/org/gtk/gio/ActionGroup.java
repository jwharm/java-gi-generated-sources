package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    /**
     * Cast object to ActionGroup if its GType is a (or inherits from) "GActionGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ActionGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GActionGroup", a ClassCastException will be thrown.
     */
    public static ActionGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GActionGroup"))) {
            return new ActionGroupImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GActionGroup");
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-added signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     */
    default void actionAdded(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_action_group_action_added.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-enabled-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     * @param enabled whether or not the action is now enabled
     */
    default void actionEnabledChanged(@NotNull java.lang.String actionName, boolean enabled) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_action_group_action_enabled_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-removed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     */
    default void actionRemoved(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_action_group_action_removed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-state-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     * @param state the new state of the named action
     */
    default void actionStateChanged(@NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant state) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        try {
            DowncallHandles.g_action_group_action_state_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    state.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param actionName the name of the action to activate
     * @param parameter parameters to the activation
     */
    default void activateAction(@NotNull java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.g_action_group_activate_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    (Addressable) (parameter == null ? MemoryAddress.NULL : parameter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param actionName the name of the action to request the change on
     * @param value the new state
     */
    default void changeActionState(@NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_action_group_change_action_state.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if the named action within {@code action_group} is currently enabled.
     * <p>
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     * @param actionName the name of the action to query
     * @return whether or not the action is currently enabled
     */
    default boolean getActionEnabled(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_action_group_get_action_enabled.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
     * @param actionName the name of the action to query
     * @return the parameter type
     */
    default @Nullable org.gtk.glib.VariantType getActionParameterType(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_parameter_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(RESULT, Ownership.NONE);
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
     * @param actionName the name of the action to query
     * @return the current state of the action
     */
    default @Nullable org.gtk.glib.Variant getActionState(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
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
     * @param actionName the name of the action to query
     * @return the state range hint
     */
    default @Nullable org.gtk.glib.Variant getActionStateHint(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state_hint.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
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
     * @param actionName the name of the action to query
     * @return the state type, if the action is stateful
     */
    default @Nullable org.gtk.glib.VariantType getActionStateType(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.VariantType(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if the named action exists within {@code action_group}.
     * @param actionName the name of the action to check for
     * @return whether the named action exists
     */
    default boolean hasAction(@NotNull java.lang.String actionName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_action_group_has_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lists the actions contained within {@code action_group}.
     * <p>
     * The caller is responsible for freeing the list with g_strfreev() when
     * it is no longer required.
     * @return a {@code null}-terminated array of the names of the
     * actions in the group
     */
    default @NotNull PointerString listActions() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_action_group_list_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
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
     * @param actionName the name of an action in the group
     * @param enabled if the action is presently enabled
     * @param parameterType the parameter type, or {@code null} if none needed
     * @param stateType the state type, or {@code null} if stateless
     * @param stateHint the state hint, or {@code null} if none
     * @param state the current state, or {@code null} if stateless
     * @return {@code true} if the action exists, else {@code false}
     */
    default boolean queryAction(@NotNull java.lang.String actionName, Out<Boolean> enabled, @NotNull PointerProxy<org.gtk.glib.VariantType> parameterType, @NotNull PointerProxy<org.gtk.glib.VariantType> stateType, @NotNull PointerProxy<org.gtk.glib.Variant> stateHint, @NotNull PointerProxy<org.gtk.glib.Variant> state) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(enabled, "Parameter 'enabled' must not be null");
        java.util.Objects.requireNonNull(parameterType, "Parameter 'parameterType' must not be null");
        java.util.Objects.requireNonNull(stateType, "Parameter 'stateType' must not be null");
        java.util.Objects.requireNonNull(stateHint, "Parameter 'stateHint' must not be null");
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        MemorySegment enabledPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_action_group_query_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    (Addressable) enabledPOINTER.address(),
                    parameterType.handle(),
                    stateType.handle(),
                    stateHint.handle(),
                    state.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        enabled.set(enabledPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface ActionAdded {
        void signalReceived(ActionGroup source, @NotNull java.lang.String actionName);
    }
    
    /**
     * Signals that a new action was just added to the group.
     * This signal is emitted after the action has been added
     * and is now visible.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionAdded> onActionAdded(@Nullable String detail, ActionGroup.ActionAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-added" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ActionGroup.ActionAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActionEnabledChanged {
        void signalReceived(ActionGroup source, @NotNull java.lang.String actionName, boolean enabled);
    }
    
    /**
     * Signals that the enabled status of the named action has changed.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionEnabledChanged> onActionEnabledChanged(@Nullable String detail, ActionGroup.ActionEnabledChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-enabled-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionEnabledChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ActionGroup.ActionEnabledChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActionRemoved {
        void signalReceived(ActionGroup source, @NotNull java.lang.String actionName);
    }
    
    /**
     * Signals that an action is just about to be removed from the group.
     * This signal is emitted before the action is removed, so the action
     * is still visible and can be queried from the signal handler.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionRemoved> onActionRemoved(@Nullable String detail, ActionGroup.ActionRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-removed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ActionGroup.ActionRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActionStateChanged {
        void signalReceived(ActionGroup source, @NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant value);
    }
    
    /**
     * Signals that the state of the named action has changed.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionStateChanged> onActionStateChanged(@Nullable String detail, ActionGroup.ActionStateChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("action-state-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionGroup.Callbacks.class, "signalActionGroupActionStateChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ActionGroup.ActionStateChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_added = Interop.downcallHandle(
            "g_action_group_action_added",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_enabled_changed = Interop.downcallHandle(
            "g_action_group_action_enabled_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_removed = Interop.downcallHandle(
            "g_action_group_action_removed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_state_changed = Interop.downcallHandle(
            "g_action_group_action_state_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_activate_action = Interop.downcallHandle(
            "g_action_group_activate_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_change_action_state = Interop.downcallHandle(
            "g_action_group_change_action_state",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_enabled = Interop.downcallHandle(
            "g_action_group_get_action_enabled",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_parameter_type = Interop.downcallHandle(
            "g_action_group_get_action_parameter_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state = Interop.downcallHandle(
            "g_action_group_get_action_state",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state_hint = Interop.downcallHandle(
            "g_action_group_get_action_state_hint",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state_type = Interop.downcallHandle(
            "g_action_group_get_action_state_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_has_action = Interop.downcallHandle(
            "g_action_group_has_action",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_list_actions = Interop.downcallHandle(
            "g_action_group_list_actions",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_query_action = Interop.downcallHandle(
            "g_action_group_query_action",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalActionGroupActionAdded(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ActionGroup.ActionAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ActionGroup.ActionGroupImpl(source, Ownership.UNKNOWN), Interop.getStringFrom(actionName));
        }
        
        public static void signalActionGroupActionEnabledChanged(MemoryAddress source, MemoryAddress actionName, int enabled, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ActionGroup.ActionEnabledChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ActionGroup.ActionGroupImpl(source, Ownership.UNKNOWN), Interop.getStringFrom(actionName), enabled != 0);
        }
        
        public static void signalActionGroupActionRemoved(MemoryAddress source, MemoryAddress actionName, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ActionGroup.ActionRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ActionGroup.ActionGroupImpl(source, Ownership.UNKNOWN), Interop.getStringFrom(actionName));
        }
        
        public static void signalActionGroupActionStateChanged(MemoryAddress source, MemoryAddress actionName, MemoryAddress value, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (ActionGroup.ActionStateChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ActionGroup.ActionGroupImpl(source, Ownership.UNKNOWN), Interop.getStringFrom(actionName), new org.gtk.glib.Variant(value, Ownership.NONE));
        }
    }
    
    class ActionGroupImpl extends org.gtk.gobject.Object implements ActionGroup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public ActionGroupImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
