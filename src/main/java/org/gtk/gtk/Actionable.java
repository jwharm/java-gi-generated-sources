package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    /**
     * Gets the action name for {@code actionable}.
     */
    public default java.lang.String getActionName() {
        var RESULT = gtk_h.gtk_actionable_get_action_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the current target value of {@code actionable}.
     */
    public default org.gtk.glib.Variant getActionTargetValue() {
        var RESULT = gtk_h.gtk_actionable_get_action_target_value(handle());
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
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
     * containing {@code Application},
     * respectively. This is the same form used for actions in the {@link org.gtk.gio.Menu}
     * associated with the window.
     */
    public default void setActionName(java.lang.String actionName) {
        gtk_h.gtk_actionable_set_action_name(handle(), Interop.allocateNativeString(actionName).handle());
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
     */
    public default void setActionTargetValue(org.gtk.glib.Variant targetValue) {
        gtk_h.gtk_actionable_set_action_target_value(handle(), targetValue.handle());
    }
    
    /**
     * Sets the action-name and associated string target value of an
     * actionable widget.
     * <p>
     * {@code detailed_action_name} is a string in the format accepted by
     * {@link Gio#Action}.
     */
    public default void setDetailedActionName(java.lang.String detailedActionName) {
        gtk_h.gtk_actionable_set_detailed_action_name(handle(), Interop.allocateNativeString(detailedActionName).handle());
    }
    
    class ActionableImpl extends org.gtk.gobject.Object implements Actionable {
        public ActionableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
