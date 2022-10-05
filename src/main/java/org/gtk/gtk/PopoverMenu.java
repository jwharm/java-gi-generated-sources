package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPopoverMenu} is a subclass of {@code GtkPopover} that implements menu
 * behavior.
 * <p>
 * <img src="./doc-files/menu.png" alt="An example GtkPopoverMenu">
 * <p>
 * {@code GtkPopoverMenu} treats its children like menus and allows switching
 * between them. It can open submenus as traditional, nested submenus,
 * or in a more touch-friendly sliding fashion.
 * <p>
 * {@code GtkPopoverMenu} is meant to be used primarily with menu models,
 * using {@link PopoverMenu#newFromModel}. If you need to put
 * other widgets such as a {@code GtkSpinButton} or a {@code GtkSwitch} into a popover,
 * you can use {@link PopoverMenu#addChild}.
 * <p>
 * For more dialog-like behavior, use a plain {@code GtkPopover}.
 * <p>
 * <h2>Menu models</h2>
 * <p>
 * The XML format understood by {@code GtkBuilder} for {@code GMenuModel} consists
 * of a toplevel {@code <menu>} element, which contains one or more {@code <item>}
 * elements. Each {@code <item>} element contains {@code <attribute>} and {@code <link>}
 * elements with a mandatory name attribute. {@code <link>} elements have the
 * same content model as {@code <menu>}. Instead of {@code <link name="submenu">}
 * or {@code <link name="section">}, you can use {@code <submenu>} or {@code <section>}
 * elements.
 * <p>
 * <pre>{@code xml
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
 * }</pre>
 * <p>
 * Attribute values can be translated using gettext, like other {@code GtkBuilder}
 * content. {@code <attribute>} elements can be marked for translation with a
 * {@code translatable="yes"} attribute. It is also possible to specify message
 * context and translator comments, using the context and comments attributes.
 * To make use of this, the {@code GtkBuilder} must have been given the gettext
 * domain to use.
 * <p>
 * The following attributes are used when constructing menu items:
 * <p>
 * <ul>
 * <li>"label": a user-visible string to display
 * <li>"use-markup": whether the text in the menu item includes <a href="https://docs.gtk.org/Pango/pango_markup.html">Pango markup</a>
 * <li>"action": the prefixed name of the action to trigger
 * <li>"target": the parameter to use when activating the action
 * <li>"icon" and "verb-icon": names of icons that may be displayed
 * <li>"submenu-action": name of an action that may be used to track
 *      whether a submenu is open
 * <li>"hidden-when": a string used to determine when the item will be hidden.
 *      Possible values include "action-disabled", "action-missing", "macos-menubar".
 *      This is mainly useful for exported menus, see {@link Application#setMenubar}.
 * <li>"custom": a string used to match against the ID of a custom child added with
 *      {@code Gtk.PopoverMenuBar.add_child},
 *      or in the ui file with {@code <child type="ID">}.
 * </ul>
 * <p>
 * The following attributes are used when constructing sections:
 * <p>
 * <ul>
 * <li>"label": a user-visible string to use as section heading
 * <li>"display-hint": a string used to determine special formatting for the section.
 *     Possible values include "horizontal-buttons", "circular-buttons" and
 *     "inline-buttons". They all indicate that section should be
 *     displayed as a horizontal row of buttons.
 * <li>"text-direction": a string used to determine the {@code GtkTextDirection} to use
 *     when "display-hint" is set to "horizontal-buttons". Possible values
 *     include "rtl", "ltr", and "none".
 * </ul>
 * <p>
 * The following attributes are used when constructing submenus:
 * <p>
 * <ul>
 * <li>"label": a user-visible string to display
 * <li>"icon": icon name to display
 * </ul>
 * <p>
 * Menu items will also show accelerators, which are usually associated
 * with actions via {@link Application#setAccelsForAction},
 * {@link WidgetClass#addBindingAction} or
 * {@link ShortcutController#addShortcut}.
 * <p>
 * <h1>CSS Nodes</h1>
 * <p>
 * {@code GtkPopoverMenu} is just a subclass of {@code GtkPopover} that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a .menu style class to the popover's main node.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkPopoverMenu} uses the {@link AccessibleRole#MENU} role, and its
 * items use the {@link AccessibleRole#MENU_ITEM},
 * {@link AccessibleRole#MENU_ITEM_CHECKBOX} or
 * {@link AccessibleRole#MENU_ITEM_RADIO} roles, depending on the
 * action they are connected to.
 */
public class PopoverMenu extends Popover implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public PopoverMenu(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PopoverMenu */
    public static PopoverMenu castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenu(gobject.refcounted());
    }
    
    static final MethodHandle gtk_popover_menu_new_from_model = Interop.downcallHandle(
        "gtk_popover_menu_new_from_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromModel(org.gtk.gio.MenuModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_popover_menu_new_from_model.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkPopoverMenu} and populates it according to {@code model}.
     * <p>
     * The created buttons are connected to actions found in the
     * {@code GtkApplicationWindow} to which the popover belongs - typically
     * by means of being attached to a widget that is contained within
     * the {@code GtkApplicationWindow}s widget hierarchy.
     * <p>
     * Actions can also be added using {@link Widget#insertActionGroup}
     * on the menus attach widget or on any of its parent widgets.
     * <p>
     * This function creates menus with sliding submenus.
     * See {@link PopoverMenu#newFromModelFull} for a way
     * to control this.
     */
    public static PopoverMenu newFromModel(org.gtk.gio.MenuModel model) {
        return new PopoverMenu(constructNewFromModel(model));
    }
    
    static final MethodHandle gtk_popover_menu_new_from_model_full = Interop.downcallHandle(
        "gtk_popover_menu_new_from_model_full",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromModelFull(org.gtk.gio.MenuModel model, PopoverMenuFlags flags) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_popover_menu_new_from_model_full.invokeExact(model.handle(), flags.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkPopoverMenu} and populates it according to {@code model}.
     * <p>
     * The created buttons are connected to actions found in the
     * action groups that are accessible from the parent widget.
     * This includes the {@code GtkApplicationWindow} to which the popover
     * belongs. Actions can also be added using {@link Widget#insertActionGroup}
     * on the parent widget or on any of its parent widgets.
     * <p>
     * The only flag that is supported currently is
     * {@link PopoverMenuFlags#NESTED}, which makes GTK create traditional,
     * nested submenus instead of the default sliding submenus.
     */
    public static PopoverMenu newFromModelFull(org.gtk.gio.MenuModel model, PopoverMenuFlags flags) {
        return new PopoverMenu(constructNewFromModelFull(model, flags));
    }
    
    static final MethodHandle gtk_popover_menu_add_child = Interop.downcallHandle(
        "gtk_popover_menu_add_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a custom widget to a generated menu.
     * <p>
     * For this to work, the menu model of {@code popover} must have
     * an item with a {@code custom} attribute that matches {@code id}.
     */
    public boolean addChild(Widget child, java.lang.String id) {
        try {
            var RESULT = (int) gtk_popover_menu_add_child.invokeExact(handle(), child.handle(), Interop.allocateNativeString(id).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_get_menu_model = Interop.downcallHandle(
        "gtk_popover_menu_get_menu_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the menu model used to populate the popover.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        try {
            var RESULT = (MemoryAddress) gtk_popover_menu_get_menu_model.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_remove_child = Interop.downcallHandle(
        "gtk_popover_menu_remove_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_add_child().
     */
    public boolean removeChild(Widget child) {
        try {
            var RESULT = (int) gtk_popover_menu_remove_child.invokeExact(handle(), child.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_set_menu_model = Interop.downcallHandle(
        "gtk_popover_menu_set_menu_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a new menu model on {@code popover}.
     * <p>
     * The existing contents of {@code popover} are removed, and
     * the {@code popover} is populated with new contents according
     * to {@code model}.
     */
    public void setMenuModel(org.gtk.gio.MenuModel model) {
        try {
            gtk_popover_menu_set_menu_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
