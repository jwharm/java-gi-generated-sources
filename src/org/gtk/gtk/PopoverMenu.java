package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPopoverMenu` is a subclass of `GtkPopover` that implements menu
 * behavior.
 * 
 * ![An example GtkPopoverMenu](menu.png)
 * 
 * `GtkPopoverMenu` treats its children like menus and allows switching
 * between them. It can open submenus as traditional, nested submenus,
 * or in a more touch-friendly sliding fashion.
 * 
 * `GtkPopoverMenu` is meant to be used primarily with menu models,
 * using [ctor@Gtk.PopoverMenu.new_from_model]. If you need to put
 * other widgets such as a `GtkSpinButton` or a `GtkSwitch` into a popover,
 * you can use [method@Gtk.PopoverMenu.add_child].
 * 
 * For more dialog-like behavior, use a plain `GtkPopover`.
 * 
 * ## Menu models
 * 
 * The XML format understood by `GtkBuilder` for `GMenuModel` consists
 * of a toplevel `<menu>` element, which contains one or more `<item>`
 * elements. Each `<item>` element contains `<attribute>` and `<link>`
 * elements with a mandatory name attribute. `<link>` elements have the
 * same content model as `<menu>`. Instead of `<link name="submenu">`
 * or `<link name="section">`, you can use `<submenu>` or `<section>`
 * elements.
 * 
 * ```xml
 * <menu id='app-menu'>
 *   <section>
 *     <item>
 *       <attribute name='label' translatable='yes'>_New Window</attribute>
 *       <attribute name='action'>app.new</attribute>
 *     </item>
 *     <item>
 *       <attribute name='label' translatable='yes'>_About Sunny</attribute>
 *       <attribute name='action'>app.about</attribute>
 *     </item>
 *     <item>
 *       <attribute name='label' translatable='yes'>_Quit</attribute>
 *       <attribute name='action'>app.quit</attribute>
 *     </item>
 *   </section>
 * </menu>
 * ```
 * 
 * Attribute values can be translated using gettext, like other `GtkBuilder`
 * content. `<attribute>` elements can be marked for translation with a
 * `translatable="yes"` attribute. It is also possible to specify message
 * context and translator comments, using the context and comments attributes.
 * To make use of this, the `GtkBuilder` must have been given the gettext
 * domain to use.
 * 
 * The following attributes are used when constructing menu items:
 * 
 * - "label": a user-visible string to display
 * - "use-markup": whether the text in the menu item includes [Pango markup](https://docs.gtk.org/Pango/pango_markup.html)
 * - "action": the prefixed name of the action to trigger
 * - "target": the parameter to use when activating the action
 * - "icon" and "verb-icon": names of icons that may be displayed
 * - "submenu-action": name of an action that may be used to track
 *      whether a submenu is open
 * - "hidden-when": a string used to determine when the item will be hidden.
 *      Possible values include "action-disabled", "action-missing", "macos-menubar".
 *      This is mainly useful for exported menus, see [method@Gtk.Application.set_menubar].
 * - "custom": a string used to match against the ID of a custom child added with
 *      [method@Gtk.PopoverMenu.add_child], [method@Gtk.PopoverMenuBar.add_child],
 *      or in the ui file with `<child type="ID">`.
 * 
 * The following attributes are used when constructing sections:
 * 
 * - "label": a user-visible string to use as section heading
 * - "display-hint": a string used to determine special formatting for the section.
 *     Possible values include "horizontal-buttons", "circular-buttons" and
 *     "inline-buttons". They all indicate that section should be
 *     displayed as a horizontal row of buttons.
 * - "text-direction": a string used to determine the `GtkTextDirection` to use
 *     when "display-hint" is set to "horizontal-buttons". Possible values
 *     include "rtl", "ltr", and "none".
 * 
 * The following attributes are used when constructing submenus:
 * 
 * - "label": a user-visible string to display
 * - "icon": icon name to display
 * 
 * Menu items will also show accelerators, which are usually associated
 * with actions via [method@Gtk.Application.set_accels_for_action],
 * [id@gtk_widget_class_add_binding_action] or
 * [method@Gtk.ShortcutController.add_shortcut].
 * 
 * # CSS Nodes
 * 
 * `GtkPopoverMenu` is just a subclass of `GtkPopover` that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a .menu style class to the popover's main node.
 * 
 * # Accessibility
 * 
 * `GtkPopoverMenu` uses the %GTK_ACCESSIBLE_ROLE_MENU role, and its
 * items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM,
 * %GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX or
 * %GTK_ACCESSIBLE_ROLE_MENU_ITEM_RADIO roles, depending on the
 * action they are connected to.
 */
public class PopoverMenu extends Popover implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public PopoverMenu(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PopoverMenu */
    public static PopoverMenu castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenu(gobject.getReference());
    }
    
    /**
     * Creates a `GtkPopoverMenu` and populates it according to @model.
     * 
     * The created buttons are connected to actions found in the
     * `GtkApplicationWindow` to which the popover belongs - typically
     * by means of being attached to a widget that is contained within
     * the `GtkApplicationWindow`s widget hierarchy.
     * 
     * Actions can also be added using [method@Gtk.Widget.insert_action_group]
     * on the menus attach widget or on any of its parent widgets.
     * 
     * This function creates menus with sliding submenus.
     * See [ctor@Gtk.PopoverMenu.new_from_model_full] for a way
     * to control this.
     */
    public PopoverMenu(org.gtk.gio.MenuModel model) {
        super(References.get(gtk_h.gtk_popover_menu_new_from_model(model.handle()), false));
    }
    
    /**
     * Creates a `GtkPopoverMenu` and populates it according to @model.
     * 
     * The created buttons are connected to actions found in the
     * action groups that are accessible from the parent widget.
     * This includes the `GtkApplicationWindow` to which the popover
     * belongs. Actions can also be added using [method@Gtk.Widget.insert_action_group]
     * on the parent widget or on any of its parent widgets.
     * 
     * The only flag that is supported currently is
     * %GTK_POPOVER_MENU_NESTED, which makes GTK create traditional,
     * nested submenus instead of the default sliding submenus.
     */
    public PopoverMenu(org.gtk.gio.MenuModel model, int flags) {
        super(References.get(gtk_h.gtk_popover_menu_new_from_model_full(model.handle(), flags), true));
    }
    
    /**
     * Adds a custom widget to a generated menu.
     * 
     * For this to work, the menu model of @popover must have
     * an item with a `custom` attribute that matches @id.
     */
    public boolean addChild(Widget child, java.lang.String id) {
        var RESULT = gtk_h.gtk_popover_menu_add_child(handle(), child.handle(), Interop.allocateNativeString(id).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the menu model used to populate the popover.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = gtk_h.gtk_popover_menu_get_menu_model(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_add_child().
     */
    public boolean removeChild(Widget child) {
        var RESULT = gtk_h.gtk_popover_menu_remove_child(handle(), child.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets a new menu model on @popover.
     * 
     * The existing contents of @popover are removed, and
     * the @popover is populated with new contents according
     * to @model.
     */
    public void setMenuModel(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_popover_menu_set_menu_model(handle(), model.handle());
    }
    
}
