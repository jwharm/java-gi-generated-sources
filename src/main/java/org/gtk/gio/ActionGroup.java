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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionGroupImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ActionGroupImpl(input);
    
    /**
     * Emits the {@link ActionGroup}::action-added signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     */
    default void actionAdded(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_action_added.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-enabled-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     * @param enabled whether or not the action is now enabled
     */
    default void actionEnabledChanged(java.lang.String actionName, boolean enabled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_action_enabled_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        Marshal.booleanToInteger.marshal(enabled, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-removed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     */
    default void actionRemoved(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_action_removed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Emits the {@link ActionGroup}::action-state-changed signal on {@code action_group}.
     * <p>
     * This function should only be called by {@link ActionGroup} implementations.
     * @param actionName the name of an action in the group
     * @param state the new state of the named action
     */
    default void actionStateChanged(java.lang.String actionName, org.gtk.glib.Variant state) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_action_state_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        state.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default void activateAction(java.lang.String actionName, @Nullable org.gtk.glib.Variant parameter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_activate_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) (parameter == null ? MemoryAddress.NULL : parameter.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default void changeActionState(java.lang.String actionName, org.gtk.glib.Variant value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_action_group_change_action_state.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        value.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    default boolean getActionEnabled(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_action_group_get_action_enabled.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    default @Nullable org.gtk.glib.VariantType getActionParameterType(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_parameter_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.VariantType.fromAddress.marshal(RESULT, null);
        }
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
    default @Nullable org.gtk.glib.Variant getActionState(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    default @Nullable org.gtk.glib.Variant getActionStateHint(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state_hint.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Variant.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    default @Nullable org.gtk.glib.VariantType getActionStateType(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_group_get_action_state_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.glib.VariantType.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Checks if the named action exists within {@code action_group}.
     * @param actionName the name of the action to check for
     * @return whether the named action exists
     */
    default boolean hasAction(java.lang.String actionName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_action_group_has_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Lists the actions contained within {@code action_group}.
     * <p>
     * The caller is responsible for freeing the list with g_strfreev() when
     * it is no longer required.
     * @return a {@code null}-terminated array of the names of the
     * actions in the group
     */
    default PointerString listActions() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_action_group_list_actions.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
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
    default boolean queryAction(java.lang.String actionName, Out<Boolean> enabled, @Nullable Out<org.gtk.glib.VariantType> parameterType, @Nullable Out<org.gtk.glib.VariantType> stateType, @Nullable Out<org.gtk.glib.Variant> stateHint, @Nullable Out<org.gtk.glib.Variant> state) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment enabledPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment parameterTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stateTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment stateHintPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_action_group_query_action.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(actionName, SCOPE),
                        (Addressable) enabledPOINTER.address(),
                        (Addressable) (parameterType == null ? MemoryAddress.NULL : (Addressable) parameterTypePOINTER.address()),
                        (Addressable) (stateType == null ? MemoryAddress.NULL : (Addressable) stateTypePOINTER.address()),
                        (Addressable) (stateHint == null ? MemoryAddress.NULL : (Addressable) stateHintPOINTER.address()),
                        (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    enabled.set(enabledPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (parameterType != null) parameterType.set(org.gtk.glib.VariantType.fromAddress.marshal(parameterTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stateType != null) stateType.set(org.gtk.glib.VariantType.fromAddress.marshal(stateTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (stateHint != null) stateHint.set(org.gtk.glib.Variant.fromAddress.marshal(stateHintPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (state != null) state.set(org.gtk.glib.Variant.fromAddress.marshal(statePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_action_group_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActionAdded} callback.
     */
    @FunctionalInterface
    public interface ActionAdded {
    
        /**
         * Signals that a new action was just added to the group.
         * This signal is emitted after the action has been added
         * and is now visible.
         */
        void run(java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceActionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionAdded.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("action-added" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionEnabledChanged} callback.
     */
    @FunctionalInterface
    public interface ActionEnabledChanged {
    
        /**
         * Signals that the enabled status of the named action has changed.
         */
        void run(java.lang.String actionName, boolean enabled);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceActionGroup, MemoryAddress actionName, int enabled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(actionName, null), Marshal.integerToBoolean.marshal(enabled, null).booleanValue());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionEnabledChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that the enabled status of the named action has changed.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionEnabledChanged> onActionEnabledChanged(@Nullable String detail, ActionGroup.ActionEnabledChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("action-enabled-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionRemoved} callback.
     */
    @FunctionalInterface
    public interface ActionRemoved {
    
        /**
         * Signals that an action is just about to be removed from the group.
         * This signal is emitted before the action is removed, so the action
         * is still visible and can be queried from the signal handler.
         */
        void run(java.lang.String actionName);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceActionGroup, MemoryAddress actionName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(actionName, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionRemoved.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("action-removed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActionStateChanged} callback.
     */
    @FunctionalInterface
    public interface ActionStateChanged {
    
        /**
         * Signals that the state of the named action has changed.
         */
        void run(java.lang.String actionName, org.gtk.glib.Variant value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceActionGroup, MemoryAddress actionName, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(actionName, null), org.gtk.glib.Variant.fromAddress.marshal(value, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActionStateChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that the state of the named action has changed.
     * @param detail The signal detail
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ActionGroup.ActionStateChanged> onActionStateChanged(@Nullable String detail, ActionGroup.ActionStateChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("action-state-changed" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_added = Interop.downcallHandle(
                "g_action_group_action_added",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_enabled_changed = Interop.downcallHandle(
                "g_action_group_action_enabled_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_removed = Interop.downcallHandle(
                "g_action_group_action_removed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_action_state_changed = Interop.downcallHandle(
                "g_action_group_action_state_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_activate_action = Interop.downcallHandle(
                "g_action_group_activate_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_change_action_state = Interop.downcallHandle(
                "g_action_group_change_action_state",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_enabled = Interop.downcallHandle(
                "g_action_group_get_action_enabled",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_parameter_type = Interop.downcallHandle(
                "g_action_group_get_action_parameter_type",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state = Interop.downcallHandle(
                "g_action_group_get_action_state",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state_hint = Interop.downcallHandle(
                "g_action_group_get_action_state_hint",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_action_state_type = Interop.downcallHandle(
                "g_action_group_get_action_state_type",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_has_action = Interop.downcallHandle(
                "g_action_group_has_action",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_list_actions = Interop.downcallHandle(
                "g_action_group_list_actions",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_query_action = Interop.downcallHandle(
                "g_action_group_query_action",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_action_group_get_type = Interop.downcallHandle(
                "g_action_group_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The ActionGroupImpl type represents a native instance of the ActionGroup interface.
     */
    class ActionGroupImpl extends org.gtk.gobject.GObject implements ActionGroup {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of ActionGroup for the provided memory address.
         * @param address the memory address of the instance
         */
        public ActionGroupImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_action_group_get_type != null;
    }
}
