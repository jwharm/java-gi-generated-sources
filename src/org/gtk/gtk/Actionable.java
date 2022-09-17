package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkActionable</code> interface provides a convenient way of asscociating
 * widgets with actions.
 * <p>
 * It primarily consists of two properties: {@link [property@Gtk.Actionable:action-name] (ref=property)}
 * and {@link [property@Gtk.Actionable:action-target] (ref=property)}. There are also some convenience
 * APIs for setting these properties.
 * <p>
 * The action will be looked up in action groups that are found among
 * the widgets ancestors. Most commonly, these will be the actions with
 * the &#8220;win.&#8221; or &#8220;app.&#8221; prefix that are associated with the<code>GtkApplicationWindow</code> or <code>GtkApplication</code>, but other action groups that
 * are added with {@link org.gtk.gtk.Widget#insertActionGroup} will be consulted
 * as well.
 */
public interface Actionable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets the action name for @actionable.
     */
    public default java.lang.String getActionName() {
        var RESULT = gtk_h.gtk_actionable_get_action_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the current target value of @actionable.
     */
    public default org.gtk.glib.Variant getActionTargetValue() {
        var RESULT = gtk_h.gtk_actionable_get_action_target_value(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Specifies the name of the action with which this widget should be
     * associated.
     * <p>
     * If @action_name is <code>null</code> then the widget will be unassociated from
     * any previous action.
     * <p>
     * Usually this function is used when the widget is located (or will be
     * located) within the hierarchy of a <code>GtkApplicationWindow</code>.
     * 
     * Names are of the form &#8220;win.save&#8221; or &#8220;app.quit&#8221; for actions on the
     * containing {@link [class@ApplicationWindow]} or its associated {@link [class@Application]},
     * respectively. This is the same form used for actions in the {@link org.gtk.gio.Menu}
     * associated with the window.
     */
    public default void setActionName(java.lang.String actionName) {
        gtk_h.gtk_actionable_set_action_name(handle(), Interop.allocateNativeString(actionName).handle());
    }
    
    /**
     * Sets the target value of an actionable widget.
     * <p>
     * If @target_value is <code>null</code> then the target value is unset.
     * <p>
     * The target value has two purposes. First, it is used as the parameter
     * to activation of the action associated with the <code>GtkActionable</code> widget.
     * Second, it is used to determine if the widget should be rendered as
     * &#8220;active&#8221; &#8212; the widget is active if the state is equal to the given target.
     * 
     * Consider the example of associating a set of buttons with a {@link [iface@Gio.Action] (ref=iface)}
     * with string state in a typical &#8220;radio button&#8221; situation. Each button
     * will be associated with the same action, but with a different target
     * value for that action. Clicking on a particular button will activate
     * the action with the target of that button, which will typically cause
     * the action&#8217;s state to change to that value. Since the action&#8217;s state
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
     * 
     * @detailed_action_name is a string in the format accepted by
     * {@link Gio#Action}.
     */
    public default void setDetailedActionName(java.lang.String detailedActionName) {
        gtk_h.gtk_actionable_set_detailed_action_name(handle(), Interop.allocateNativeString(detailedActionName).handle());
    }
    
    class ActionableImpl extends org.gtk.gobject.Object implements Actionable {
        public ActionableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
