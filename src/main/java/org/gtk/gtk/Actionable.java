package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkActionable} interface provides a convenient way of asscociating
 * widgets with actions.
 * <p>
 * It primarily consists of two properties: {@code Gtk.Actionable:action-name}
 * and {@code Gtk.Actionable:action-target}. There are also some convenience
 * APIs for setting these properties.
 * <p>
 * The action will be looked up in action groups that are found among
 * the widgets ancestors. Most commonly, these will be the actions with
 * the “win.” or “app.” prefix that are associated with the
 * {@code GtkApplicationWindow} or {@code GtkApplication}, but other action groups that
 * are added with {@link Widget#insertActionGroup} will be consulted
 * as well.
 */
public interface Actionable extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ActionableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ActionableImpl(input, ownership);
    
    /**
     * Gets the action name for {@code actionable}.
     * @return the action name
     */
    default @Nullable java.lang.String getActionName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_actionable_get_action_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the current target value of {@code actionable}.
     * @return the current target value
     */
    default @Nullable org.gtk.glib.Variant getActionTargetValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_actionable_get_action_target_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Specifies the name of the action with which this widget should be
     * associated.
     * <p>
     * If {@code action_name} is {@code null} then the widget will be unassociated from
     * any previous action.
     * <p>
     * Usually this function is used when the widget is located (or will be
     * located) within the hierarchy of a {@code GtkApplicationWindow}.
     * <p>
     * Names are of the form “win.save” or “app.quit” for actions on the
     * containing {@link ApplicationWindow},
     * respectively. This is the same form used for actions in the {@link org.gtk.gio.Menu}
     * associated with the window.
     * @param actionName an action name
     */
    default void setActionName(@Nullable java.lang.String actionName) {
        try {
            DowncallHandles.gtk_actionable_set_action_name.invokeExact(
                    handle(),
                    (Addressable) (actionName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(actionName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the target of an actionable widget.
     * <p>
     * This is a convenience function that calls {@link org.gtk.glib.Variant#Variant} for
     * {@code format_string} and uses the result to call
     * {@link Actionable#setActionTargetValue}.
     * <p>
     * If you are setting a string-valued target and want to set
     * the action name at the same time, you can use
     * {@link Actionable#setDetailedActionName}.
     * @param formatString a {@code GLib.Variant} format string
     * @param varargs arguments appropriate for {@code format_string}
     */
    default void setActionTarget(java.lang.String formatString, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_actionable_set_action_target.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(formatString, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the target value of an actionable widget.
     * <p>
     * If {@code target_value} is {@code null} then the target value is unset.
     * <p>
     * The target value has two purposes. First, it is used as the parameter
     * to activation of the action associated with the {@code GtkActionable} widget.
     * Second, it is used to determine if the widget should be rendered as
     * “active” — the widget is active if the state is equal to the given target.
     * <p>
     * Consider the example of associating a set of buttons with a {@code Gio.Action}
     * with string state in a typical “radio button” situation. Each button
     * will be associated with the same action, but with a different target
     * value for that action. Clicking on a particular button will activate
     * the action with the target of that button, which will typically cause
     * the action’s state to change to that value. Since the action’s state
     * is now equal to the target value of the button, the button will now
     * be rendered as active (and the other buttons, with different targets,
     * rendered inactive).
     * @param targetValue a {@code GLib.Variant} to set as the target value
     */
    default void setActionTargetValue(@Nullable org.gtk.glib.Variant targetValue) {
        try {
            DowncallHandles.gtk_actionable_set_action_target_value.invokeExact(
                    handle(),
                    (Addressable) (targetValue == null ? MemoryAddress.NULL : targetValue.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the action-name and associated string target value of an
     * actionable widget.
     * <p>
     * {@code detailed_action_name} is a string in the format accepted by
     * {@link org.gtk.gio.Action#parseDetailedName}.
     * @param detailedActionName the detailed action name
     */
    default void setDetailedActionName(java.lang.String detailedActionName) {
        try {
            DowncallHandles.gtk_actionable_set_detailed_action_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(detailedActionName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_actionable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_get_action_name = Interop.downcallHandle(
            "gtk_actionable_get_action_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_get_action_target_value = Interop.downcallHandle(
            "gtk_actionable_get_action_target_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_set_action_name = Interop.downcallHandle(
            "gtk_actionable_set_action_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_set_action_target = Interop.downcallHandle(
            "gtk_actionable_set_action_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_set_action_target_value = Interop.downcallHandle(
            "gtk_actionable_set_action_target_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_set_detailed_action_name = Interop.downcallHandle(
            "gtk_actionable_set_detailed_action_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_actionable_get_type = Interop.downcallHandle(
            "gtk_actionable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class ActionableImpl extends org.gtk.gobject.GObject implements Actionable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public ActionableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
