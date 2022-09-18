package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkShortcutController</code> is an event controller that manages shortcuts.
 * <p>
 * Most common shortcuts are using this controller implicitly, e.g. by
 * adding a mnemonic underline to a <code>GtkLabel</code>, or by installing a key
 * binding using {@link org.gtk.gtk.WidgetClass<code>#addBinding</code> , or by adding accelerators
 * to global actions using {@link org.gtk.gtk.Application<code>#setAccelsForAction</code> .
 * <p>
 * But it is possible to create your own shortcut controller, and add
 * shortcuts to it.
 * <p><code>GtkShortcutController</code> implements <code>GListModel</code> for querying the
 * shortcuts that have been added to it.
 * <p>
 * <h1>GtkShortcutController as a GtkBuildable</h1>
 * <p><code>GtkShortcutControllers</code> can be creates in ui files to set up
 * shortcuts in the same place as the widgets.
 * <p>
 * An example of a UI definition fragment with <code>GtkShortcutController</code>:<pre>xml
 *   &<code>#60</code> object class=&<code>#39</code> GtkButton&<code>#39</code> &<code>#62</code> 
 *     &<code>#60</code> child&<code>#62</code> 
 *       &<code>#60</code> object class=&<code>#39</code> GtkShortcutController&<code>#39</code> &<code>#62</code> 
 *         &<code>#60</code> property name=&<code>#39</code> scope&<code>#39</code> &<code>#62</code> managed&<code>#60</code> /property&<code>#62</code> 
 *         &<code>#60</code> child&<code>#62</code> 
 *           &<code>#60</code> object class=&<code>#39</code> GtkShortcut&<code>#39</code> &<code>#62</code> 
 *             &<code>#60</code> property name=&<code>#39</code> trigger&<code>#39</code> &<code>#62</code> &<code>#38</code> lt;Control&<code>#38</code> gt;k&<code>#60</code> /property&<code>#62</code> 
 *             &<code>#60</code> property name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> activate&<code>#60</code> /property&<code>#62</code> 
 *           &<code>#60</code> /object&<code>#62</code> 
 *         &<code>#60</code> /child&<code>#62</code> 
 *       &<code>#60</code> /object&<code>#62</code> 
 *     &<code>#60</code> /child&<code>#62</code> 
 *   &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * This example creates a {@link org.gtk.gtk.ActivateAction} for triggering the<code>activate</code> signal of the <code>GtkButton</code>. See {@link [ctor@Gtk.ShortcutAction.parse_string] (ref=ctor)}
 * for the syntax for other kinds of <code>GtkShortcutAction</code>. See
 * {@link [ctor@Gtk.ShortcutTrigger.parse_string] (ref=ctor)} to learn more about the syntax
 * for triggers.
 */
public class ShortcutController extends EventController implements org.gtk.gio.ListModel, Buildable {

    public ShortcutController(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShortcutController */
    public static ShortcutController castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutController(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_controller_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new shortcut controller.
     */
    public ShortcutController() {
        super(constructNew());
    }
    
    private static Reference constructNewForModel(org.gtk.gio.ListModel model) {
        Reference RESULT = References.get(gtk_h.gtk_shortcut_controller_new_for_model(model.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new shortcut controller that takes its shortcuts from
     * the given list model.
     * 
     * A controller created by this function does not let you add or
     * remove individual shortcuts using the shortcut controller api,
     * but you can change the contents of the model.
     */
    public static ShortcutController newForModel(org.gtk.gio.ListModel model) {
        return new ShortcutController(constructNewForModel(model));
    }
    
    /**
     * Adds @shortcut to the list of shortcuts handled by @self.
     * 
     * If this controller uses an external shortcut list, this
     * function does nothing.
     */
    public void addShortcut(Shortcut shortcut) {
        gtk_h.gtk_shortcut_controller_add_shortcut(handle(), shortcut.getReference().unowned().handle());
    }
    
    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     */
    public int getMnemonicsModifiers() {
        var RESULT = gtk_h.gtk_shortcut_controller_get_mnemonics_modifiers(handle());
        return RESULT;
    }
    
    /**
     * Gets the scope for when this controller activates its shortcuts.
     * 
     * See {@link org.gtk.gtk.ShortcutController<code>#setScope</code>  for details.
     */
    public ShortcutScope getScope() {
        var RESULT = gtk_h.gtk_shortcut_controller_get_scope(handle());
        return ShortcutScope.fromValue(RESULT);
    }
    
    /**
     * Removes @shortcut from the list of shortcuts handled by @self.
     * 
     * If @shortcut had not been added to @controller or this controller
     * uses an external shortcut list, this function does nothing.
     */
    public void removeShortcut(Shortcut shortcut) {
        gtk_h.gtk_shortcut_controller_remove_shortcut(handle(), shortcut.handle());
    }
    
    /**
     * Sets the controller to use the given modifier for mnemonics.
     * <p>
     * The mnemonics modifiers determines which modifiers need to be pressed to allow
     * activation of shortcuts with mnemonics triggers.
     * <p>
     * GTK normally uses the Alt modifier for mnemonics, except in <code>GtkPopoverMenu</code>s,
     * where mnemonics can be triggered without any modifiers. It should be very
     * rarely necessary to change this, and doing so is likely to interfere with
     * other shortcuts.
     * 
     * This value is only relevant for local shortcut controllers. Global and managed
     * shortcut controllers will have their shortcuts activated from other places which
     * have their own modifiers for activating mnemonics.
     */
    public void setMnemonicsModifiers(int modifiers) {
        gtk_h.gtk_shortcut_controller_set_mnemonics_modifiers(handle(), modifiers);
    }
    
    /**
     * Sets the controller to have the given @scope.
     * 
     * The scope allows shortcuts to be activated outside of the normal
     * event propagation. In particular, it allows installing global
     * keyboard shortcuts that can be activated even when a widget does
     * not have focus.
     * 
     * With {@link org.gtk.gtk.ShortcutScope<code>#LOCAL</code>   shortcuts will only be activated
     * when the widget has focus.
     */
    public void setScope(ShortcutScope scope) {
        gtk_h.gtk_shortcut_controller_set_scope(handle(), scope.getValue());
    }
    
}
