package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Menu models</strong><br/>
 * The XML format understood by {@code GtkBuilder} for {@code GMenuModel} consists
 * of a toplevel {@code <menu>} element, which contains one or more {@code <item>}
 * elements. Each {@code <item>} element contains {@code <attribute>} and {@code <link>}
 * elements with a mandatory name attribute. {@code <link>} elements have the
 * same content model as {@code <menu>}. Instead of {@code <link name="submenu">}
 * or {@code <link name="section">}, you can use {@code <submenu>} or {@code <section>}
 * elements.
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
 *      {@link PopoverMenu#addChild}, {@link PopoverMenuBar#addChild},
 *      or in the ui file with {@code <child type="ID">}.
 * </ul>
 * <p>
 * The following attributes are used when constructing sections:
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
 * <strong>CSS Nodes</strong><br/>
 * {@code GtkPopoverMenu} is just a subclass of {@code GtkPopover} that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a .menu style class to the popover's main node.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkPopoverMenu} uses the {@link AccessibleRole#MENU} role, and its
 * items use the {@link AccessibleRole#MENU_ITEM},
 * {@link AccessibleRole#MENU_ITEM_CHECKBOX} or
 * {@link AccessibleRole#MENU_ITEM_RADIO} roles, depending on the
 * action they are connected to.
 */
public class PopoverMenu extends org.gtk.gtk.Popover implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PopoverMenu(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PopoverMenu */
    public static PopoverMenu castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenu(gobject.refcounted());
    }
    
    private static Refcounted constructNewFromModel(@Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_popover_menu_new_from_model.invokeExact(model.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param model a {@code GMenuModel}
     * @return the new {@code GtkPopoverMenu}
     */
    public static PopoverMenu newFromModel(@Nullable org.gtk.gio.MenuModel model) {
        return new PopoverMenu(constructNewFromModel(model));
    }
    
    private static Refcounted constructNewFromModelFull(@NotNull org.gtk.gio.MenuModel model, @NotNull org.gtk.gtk.PopoverMenuFlags flags) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_popover_menu_new_from_model_full.invokeExact(model.handle(), flags.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param model a {@code GMenuModel}
     * @param flags flags that affect how the menu is created
     * @return the new {@code GtkPopoverMenu}
     */
    public static PopoverMenu newFromModelFull(@NotNull org.gtk.gio.MenuModel model, @NotNull org.gtk.gtk.PopoverMenuFlags flags) {
        return new PopoverMenu(constructNewFromModelFull(model, flags));
    }
    
    /**
     * Adds a custom widget to a generated menu.
     * <p>
     * For this to work, the menu model of {@code popover} must have
     * an item with a {@code custom} attribute that matches {@code id}.
     * @param child the {@code GtkWidget} to add
     * @param id the ID to insert {@code child} at
     * @return {@code true} if {@code id} was found and the widget added
     */
    public boolean addChild(@NotNull org.gtk.gtk.Widget child, @NotNull java.lang.String id) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(id, "Parameter 'id' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_add_child.invokeExact(handle(), child.handle(), Interop.allocateNativeString(id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the menu model used to populate the popover.
     * @return the menu model of {@code popover}
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_menu_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_add_child().
     * @param child the {@code GtkWidget} to remove
     * @return {@code true} if the widget was removed
     */
    public boolean removeChild(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_remove_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets a new menu model on {@code popover}.
     * <p>
     * The existing contents of {@code popover} are removed, and
     * the {@code popover} is populated with new contents according
     * to {@code model}.
     * @param model a {@code GMenuModel}
     */
    public void setMenuModel(@Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_popover_menu_set_menu_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_popover_menu_new_from_model = Interop.downcallHandle(
            "gtk_popover_menu_new_from_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_new_from_model_full = Interop.downcallHandle(
            "gtk_popover_menu_new_from_model_full",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_popover_menu_add_child = Interop.downcallHandle(
            "gtk_popover_menu_add_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_get_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_get_menu_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_remove_child = Interop.downcallHandle(
            "gtk_popover_menu_remove_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_set_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_set_menu_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
