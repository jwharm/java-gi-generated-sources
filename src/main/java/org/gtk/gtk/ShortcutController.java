package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkShortcutController} is an event controller that manages shortcuts.
 * <p>
 * Most common shortcuts are using this controller implicitly, e.g. by
 * adding a mnemonic underline to a {@code GtkLabel}, or by installing a key
 * binding using {@link WidgetClass#addBinding}, or by adding accelerators
 * to global actions using {@link Application#setAccelsForAction}.
 * <p>
 * But it is possible to create your own shortcut controller, and add
 * shortcuts to it.
 * <p>
 * {@code GtkShortcutController} implements {@code GListModel} for querying the
 * shortcuts that have been added to it.
 * <p>
 * <h1>GtkShortcutController as a GtkBuildable</h1>
 * <p>
 * {@code GtkShortcutControllers} can be creates in ui files to set up
 * shortcuts in the same place as the widgets.
 * <p>
 * An example of a UI definition fragment with {@code GtkShortcutController}:
 * <pre>{@code xml
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
 * }</pre>
 * <p>
 * This example creates a {@link ActivateAction} for triggering the
 * {@code activate} signal of the {@code GtkButton}. See {@link ShortcutAction#parseString}
 * for the syntax for other kinds of {@code GtkShortcutAction}. See
 * {@link ShortcutTrigger#parseString} to learn more about the syntax
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
     * <p>
     * A controller created by this function does not let you add or
     * remove individual shortcuts using the shortcut controller api,
     * but you can change the contents of the model.
     */
    public static ShortcutController newForModel(org.gtk.gio.ListModel model) {
        return new ShortcutController(constructNewForModel(model));
    }
    
    /**
     * Adds {@code shortcut} to the list of shortcuts handled by {@code self}.
     * <p>
     * If this controller uses an external shortcut list, this
     * function does nothing.
     */
    public void addShortcut(Shortcut shortcut) {
        gtk_h.gtk_shortcut_controller_add_shortcut(handle(), shortcut.getReference().unowned().handle());
    }
    
    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     */
    public org.gtk.gdk.ModifierType getMnemonicsModifiers() {
        var RESULT = gtk_h.gtk_shortcut_controller_get_mnemonics_modifiers(handle());
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Gets the scope for when this controller activates its shortcuts.
     * <p>
     * See {@link ShortcutController#setScope} for details.
     */
    public ShortcutScope getScope() {
        var RESULT = gtk_h.gtk_shortcut_controller_get_scope(handle());
        return new ShortcutScope(RESULT);
    }
    
    /**
     * Removes {@code shortcut} from the list of shortcuts handled by {@code self}.
     * <p>
     * If {@code shortcut} had not been added to {@code controller} or this controller
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
     * GTK normally uses the Alt modifier for mnemonics, except in {@code GtkPopoverMenu}s,
     * where mnemonics can be triggered without any modifiers. It should be very
     * rarely necessary to change this, and doing so is likely to interfere with
     * other shortcuts.
     * <p>
     * This value is only relevant for local shortcut controllers. Global and managed
     * shortcut controllers will have their shortcuts activated from other places which
     * have their own modifiers for activating mnemonics.
     */
    public void setMnemonicsModifiers(org.gtk.gdk.ModifierType modifiers) {
        gtk_h.gtk_shortcut_controller_set_mnemonics_modifiers(handle(), modifiers.getValue());
    }
    
    /**
     * Sets the controller to have the given {@code scope}.
     * <p>
     * The scope allows shortcuts to be activated outside of the normal
     * event propagation. In particular, it allows installing global
     * keyboard shortcuts that can be activated even when a widget does
     * not have focus.
     * <p>
     * With {@link ShortcutScope#LOCAL}, shortcuts will only be activated
     * when the widget has focus.
     */
    public void setScope(ShortcutScope scope) {
        gtk_h.gtk_shortcut_controller_set_scope(handle(), scope.getValue());
    }
    
}
