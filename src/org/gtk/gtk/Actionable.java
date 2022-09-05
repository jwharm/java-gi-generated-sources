package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkActionable` interface provides a convenient way of asscociating
 * widgets with actions.
 * 
 * It primarily consists of two properties: [property@Gtk.Actionable:action-name]
 * and [property@Gtk.Actionable:action-target]. There are also some convenience
 * APIs for setting these properties.
 * 
 * The action will be looked up in action groups that are found among
 * the widgets ancestors. Most commonly, these will be the actions with
 * the “win.” or “app.” prefix that are associated with the
 * `GtkApplicationWindow` or `GtkApplication`, but other action groups that
 * are added with [method@Gtk.Widget.insert_action_group] will be consulted
 * as well.
 */
public interface Actionable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the action name for @actionable.
     */
    public default java.lang.String getActionName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_actionable_get_action_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the current target value of @actionable.
     */
    public default org.gtk.glib.Variant getActionTargetValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_actionable_get_action_target_value(HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Specifies the name of the action with which this widget should be
     * associated.
     * 
     * If @action_name is %NULL then the widget will be unassociated from
     * any previous action.
     * 
     * Usually this function is used when the widget is located (or will be
     * located) within the hierarchy of a `GtkApplicationWindow`.
     * 
     * Names are of the form “win.save” or “app.quit” for actions on the
     * containing [class@ApplicationWindow] or its associated [class@Application],
     * respectively. This is the same form used for actions in the [class@Gio.Menu]
     * associated with the window.
     */
    public default void setActionName(java.lang.String actionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_actionable_set_action_name(HANDLE(), Interop.getAllocator().allocateUtf8String(actionName));
    }
    
    /**
     * Sets the target value of an actionable widget.
     * 
     * If @target_value is %NULL then the target value is unset.
     * 
     * The target value has two purposes. First, it is used as the parameter
     * to activation of the action associated with the `GtkActionable` widget.
     * Second, it is used to determine if the widget should be rendered as
     * “active” — the widget is active if the state is equal to the given target.
     * 
     * Consider the example of associating a set of buttons with a [iface@Gio.Action]
     * with string state in a typical “radio button” situation. Each button
     * will be associated with the same action, but with a different target
     * value for that action. Clicking on a particular button will activate
     * the action with the target of that button, which will typically cause
     * the action’s state to change to that value. Since the action’s state
     * is now equal to the target value of the button, the button will now
     * be rendered as active (and the other buttons, with different targets,
     * rendered inactive).
     */
    public default void setActionTargetValue(org.gtk.glib.Variant targetValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_actionable_set_action_target_value(HANDLE(), targetValue.HANDLE());
    }
    
    /**
     * Sets the action-name and associated string target value of an
     * actionable widget.
     * 
     * @detailed_action_name is a string in the format accepted by
     * [func@Gio.Action.parse_detailed_name].
     */
    public default void setDetailedActionName(java.lang.String detailedActionName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_actionable_set_detailed_action_name(HANDLE(), Interop.getAllocator().allocateUtf8String(detailedActionName));
    }
    
    class ActionableImpl extends org.gtk.gobject.Object implements Actionable {
        public ActionableImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
