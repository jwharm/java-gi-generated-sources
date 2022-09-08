package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GActionGroup represents a group of actions. Actions can be used to
 * expose functionality in a structured way, either from one part of a
 * program to another, or to the outside world. Action groups are often
 * used together with a #GMenuModel that provides additional
 * representation data for displaying the actions to the user, e.g. in
 * a menu.
 * 
 * The main way to interact with the actions in a GActionGroup is to
 * activate them with g_action_group_activate_action(). Activating an
 * action may require a #GVariant parameter. The required type of the
 * parameter can be inquired with g_action_group_get_action_parameter_type().
 * Actions may be disabled, see g_action_group_get_action_enabled().
 * Activating a disabled action has no effect.
 * 
 * Actions may optionally have a state in the form of a #GVariant. The
 * current state of an action can be inquired with
 * g_action_group_get_action_state(). Activating a stateful action may
 * change its state, but it is also possible to set the state by calling
 * g_action_group_change_action_state().
 * 
 * As typical example, consider a text editing application which has an
 * option to change the current font to 'bold'. A good way to represent
 * this would be a stateful action, with a boolean state. Activating the
 * action would toggle the state.
 * 
 * Each action in the group has a unique name (which is a string).  All
 * method calls, except g_action_group_list_actions() take the name of
 * an action as an argument.
 * 
 * The #GActionGroup API is meant to be the 'public' API to the action
 * group.  The calls here are exactly the interaction that 'external
 * forces' (eg: UI, incoming D-Bus messages, etc.) are supposed to have
 * with actions.  'Internal' APIs (ie: ones meant only to be accessed by
 * the action group implementation) are found on subclasses.  This is
 * why you will find - for example - g_action_group_get_action_enabled()
 * but not an equivalent set() call.
 * 
 * Signals are emitted on the action group in response to state changes
 * on individual actions.
 * 
 * Implementations of #GActionGroup should provide implementations for
 * the virtual functions g_action_group_list_actions() and
 * g_action_group_query_action().  The other virtual functions should
 * not be implemented - their "wrappers" are actually implemented with
 * calls to g_action_group_query_action().
 */
public interface ActionGroup extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Emits the #GActionGroup::action-added signal on @action_group.
     * 
     * This function should only be called by #GActionGroup implementations.
     */
    public default void actionAdded(java.lang.String actionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_action_added(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
    }
    
    /**
     * Emits the #GActionGroup::action-enabled-changed signal on @action_group.
     * 
     * This function should only be called by #GActionGroup implementations.
     */
    public default void actionEnabledChanged(java.lang.String actionName, boolean enabled) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_action_enabled_changed(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), enabled ? 1 : 0);
    }
    
    /**
     * Emits the #GActionGroup::action-removed signal on @action_group.
     * 
     * This function should only be called by #GActionGroup implementations.
     */
    public default void actionRemoved(java.lang.String actionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_action_removed(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
    }
    
    /**
     * Emits the #GActionGroup::action-state-changed signal on @action_group.
     * 
     * This function should only be called by #GActionGroup implementations.
     */
    public default void actionStateChanged(java.lang.String actionName, org.gtk.glib.Variant state) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_action_state_changed(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), state.HANDLE());
    }
    
    /**
     * Activate the named action within @action_group.
     * 
     * If the action is expecting a parameter, then the correct type of
     * parameter must be given as @parameter.  If the action is expecting no
     * parameters then @parameter must be %NULL.  See
     * g_action_group_get_action_parameter_type().
     * 
     * If the #GActionGroup implementation supports asynchronous remote
     * activation over D-Bus, this call may return before the relevant
     * D-Bus traffic has been sent, or any replies have been received. In
     * order to block on such asynchronous activation calls,
     * g_dbus_connection_flush() should be called prior to the code, which
     * depends on the result of the action activation. Without flushing
     * the D-Bus connection, there is no guarantee that the action would
     * have been activated.
     * 
     * The following code which runs in a remote app instance, shows an
     * example of a "quit" action being activated on the primary app
     * instance over D-Bus. Here g_dbus_connection_flush() is called
     * before `exit()`. Without g_dbus_connection_flush(), the "quit" action
     * may fail to be activated on the primary instance.
     * 
     * |[<!-- language="C" -->
     * // call "quit" action on primary instance
     * g_action_group_activate_action (G_ACTION_GROUP (app), "quit", NULL);
     * 
     * // make sure the action is activated now
     * g_dbus_connection_flush (...);
     * 
     * g_debug ("application has been terminated. exiting.");
     * 
     * exit (0);
     * ]|
     */
    public default void activateAction(java.lang.String actionName, org.gtk.glib.Variant parameter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_activate_action(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), parameter.HANDLE());
    }
    
    /**
     * Request for the state of the named action within @action_group to be
     * changed to @value.
     * 
     * The action must be stateful and @value must be of the correct type.
     * See g_action_group_get_action_state_type().
     * 
     * This call merely requests a change.  The action may refuse to change
     * its state or may change its state to something other than @value.
     * See g_action_group_get_action_state_hint().
     * 
     * If the @value GVariant is floating, it is consumed.
     */
    public default void changeActionState(java.lang.String actionName, org.gtk.glib.Variant value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_change_action_state(HANDLE(), Interop.allocateNativeString(actionName).HANDLE(), value.HANDLE());
    }
    
    /**
     * Checks if the named action within @action_group is currently enabled.
     * 
     * An action must be enabled in order to be activated or in order to
     * have its state changed from outside callers.
     */
    public default boolean getActionEnabled(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_get_action_enabled(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Queries the type of the parameter that must be given when activating
     * the named action within @action_group.
     * 
     * When activating the action using g_action_group_activate_action(),
     * the #GVariant given to that function must be of the type returned
     * by this function.
     * 
     * In the case that this function returns %NULL, you must not give any
     * #GVariant, but %NULL instead.
     * 
     * The parameter type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different parameter type.
     */
    public default org.gtk.glib.VariantType getActionParameterType(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_get_action_parameter_type(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    /**
     * Queries the current state of the named action within @action_group.
     * 
     * If the action is not stateful then %NULL will be returned.  If the
     * action is stateful then the type of the return value is the type
     * given by g_action_group_get_action_state_type().
     * 
     * The return value (if non-%NULL) should be freed with
     * g_variant_unref() when it is no longer required.
     */
    public default org.gtk.glib.Variant getActionState(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_get_action_state(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Requests a hint about the valid range of values for the state of the
     * named action within @action_group.
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
    public default org.gtk.glib.Variant getActionStateHint(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_get_action_state_hint(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the type of the state of the named action within
     * @action_group.
     * 
     * If the action is stateful then this function returns the
     * #GVariantType of the state.  All calls to
     * g_action_group_change_action_state() must give a #GVariant of this
     * type and g_action_group_get_action_state() will return a #GVariant
     * of the same type.
     * 
     * If the action is not stateful then this function will return %NULL.
     * In that case, g_action_group_get_action_state() will return %NULL
     * and you must not call g_action_group_change_action_state().
     * 
     * The state type of a particular action will never change but it is
     * possible for an action to be removed and for a new action to be added
     * with the same name but a different state type.
     */
    public default org.gtk.glib.VariantType getActionStateType(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_get_action_state_type(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
        return new org.gtk.glib.VariantType(References.get(RESULT, false));
    }
    
    /**
     * Checks if the named action exists within @action_group.
     */
    public default boolean hasAction(java.lang.String actionName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_action_group_has_action(HANDLE(), Interop.allocateNativeString(actionName).HANDLE());
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
    public default void onActionAdded(ActionAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalActionGroupActionAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("action-added").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActionEnabledChangedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName, boolean enabled);
    }
    
    /**
     * Signals that the enabled status of the named action has changed.
     */
    public default void onActionEnabledChanged(ActionEnabledChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalActionGroupActionEnabledChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("action-enabled-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
    public default void onActionRemoved(ActionRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalActionGroupActionRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("action-removed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ActionStateChangedHandler {
        void signalReceived(ActionGroup source, java.lang.String actionName, org.gtk.glib.Variant value);
    }
    
    /**
     * Signals that the state of the named action has changed.
     */
    public default void onActionStateChanged(ActionStateChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalActionGroupActionStateChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("action-state-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class ActionGroupImpl extends org.gtk.gobject.Object implements ActionGroup {
        public ActionGroupImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
