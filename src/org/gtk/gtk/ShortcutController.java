package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkShortcutController` is an event controller that manages shortcuts.
 * 
 * Most common shortcuts are using this controller implicitly, e.g. by
 * adding a mnemonic underline to a `GtkLabel`, or by installing a key
 * binding using [method@Gtk.WidgetClass.add_binding], or by adding accelerators
 * to global actions using [method@Gtk.Application.set_accels_for_action].
 * 
 * But it is possible to create your own shortcut controller, and add
 * shortcuts to it.
 * 
 * `GtkShortcutController` implements `GListModel` for querying the
 * shortcuts that have been added to it.
 * 
 * # GtkShortcutController as a GtkBuildable
 * 
 * `GtkShortcutControllers` can be creates in ui files to set up
 * shortcuts in the same place as the widgets.
 * 
 * An example of a UI definition fragment with `GtkShortcutController`:
 * ```xml
 *   <object class='GtkButton'>
 *     <child>
 *       <object class='GtkShortcutController'>
 *         <property name='scope'>managed</property>
 *         <child>
 *           <object class='GtkShortcut'>
 *             <property name='trigger'>&lt;Control&gt;k</property>
 *             <property name='action'>activate</property>
 *           </object>
 *         </child>
 *       </object>
 *     </child>
 *   </object>
 * ```
 * 
 * This example creates a [class@Gtk.ActivateAction] for triggering the
 * `activate` signal of the `GtkButton`. See [ctor@Gtk.ShortcutAction.parse_string]
 * for the syntax for other kinds of `GtkShortcutAction`. See
 * [ctor@Gtk.ShortcutTrigger.parse_string] to learn more about the syntax
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
     * See [method@Gtk.ShortcutController.set_scope] for details.
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
     * 
     * The mnemonics modifiers determines which modifiers need to be pressed to allow
     * activation of shortcuts with mnemonics triggers.
     * 
     * GTK normally uses the Alt modifier for mnemonics, except in `GtkPopoverMenu`s,
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
     * With %GTK_SHORTCUT_SCOPE_LOCAL, shortcuts will only be activated
     * when the widget has focus.
     */
    public void setScope(ShortcutScope scope) {
        gtk_h.gtk_shortcut_controller_set_scope(handle(), scope.getValue());
    }
    
}
