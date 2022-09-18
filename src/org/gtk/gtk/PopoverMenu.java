package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPopoverMenu</code> is a subclass of <code>GtkPopover</code> that implements menu
 * behavior.
 * <p>
 * !{@link [An example GtkPopoverMenu]}(menu.png)
 * <p><code>GtkPopoverMenu</code> treats its children like menus and allows switching
 * between them. It can open submenus as traditional, nested submenus,
 * or in a more touch-friendly sliding fashion.
 * <p><code>GtkPopoverMenu</code> is meant to be used primarily with menu models,
 * using {@link [ctor@Gtk.PopoverMenu.new_from_model] (ref=ctor)}. If you need to put
 * other widgets such as a <code>GtkSpinButton</code> or a <code>GtkSwitch</code> into a popover,
 * you can use {@link org.gtk.gtk.PopoverMenu<code>#addChild</code> .
 * <p>
 * For more dialog-like behavior, use a plain <code>GtkPopover</code>.
 * <p>
 * <h2>Menu models</h2>
 * <p>
 * The XML format understood by <code>GtkBuilder</code> for <code>GMenuModel</code> consists
 * of a toplevel <code>&<code>#60</code> menu&<code>#62</code> </code> element, which contains one or more <code>&<code>#60</code> item&<code>#62</code> </code>
 * elements. Each <code>&<code>#60</code> item&<code>#62</code> </code> element contains <code>&<code>#60</code> attribute&<code>#62</code> </code> and <code>&<code>#60</code> link&<code>#62</code> </code>
 * elements with a mandatory name attribute. <code>&<code>#60</code> link&<code>#62</code> </code> elements have the
 * same content model as <code>&<code>#60</code> menu&<code>#62</code> </code>. Instead of <code>&<code>#60</code> link name=&<code>#34</code> submenu&<code>#34</code> &<code>#62</code> </code>
 * or <code>&<code>#60</code> link name=&<code>#34</code> section&<code>#34</code> &<code>#62</code> </code>, you can use <code>&<code>#60</code> submenu&<code>#62</code> </code> or <code>&<code>#60</code> section&<code>#62</code> </code>
 * elements.
 * <p><pre>xml
 * &<code>#60</code> menu id=&<code>#39</code> app-menu&<code>#39</code> &<code>#62</code> 
 *   &<code>#60</code> section&<code>#62</code> 
 *     &<code>#60</code> item&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _New Window&<code>#60</code> /attribute&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> app.new&<code>#60</code> /attribute&<code>#62</code> 
 *     &<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _About Sunny&<code>#60</code> /attribute&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> app.about&<code>#60</code> /attribute&<code>#62</code> 
 *     &<code>#60</code> /item&<code>#62</code> 
 *     &<code>#60</code> item&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> label&<code>#39</code>  translatable=&<code>#39</code> yes&<code>#39</code> &<code>#62</code> _Quit&<code>#60</code> /attribute&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#39</code> action&<code>#39</code> &<code>#62</code> app.quit&<code>#60</code> /attribute&<code>#62</code> 
 *     &<code>#60</code> /item&<code>#62</code> 
 *   &<code>#60</code> /section&<code>#62</code> 
 * &<code>#60</code> /menu&<code>#62</code> 
 * </pre>
 * <p>
 * Attribute values can be translated using gettext, like other <code>GtkBuilder</code>
 * content. <code>&<code>#60</code> attribute&<code>#62</code> </code> elements can be marked for translation with a<code>translatable=&<code>#34</code> yes&<code>#34</code> </code> attribute. It is also possible to specify message
 * context and translator comments, using the context and comments attributes.
 * To make use of this, the <code>GtkBuilder</code> must have been given the gettext
 * domain to use.
 * <p>
 * The following attributes are used when constructing menu items:
 * <p>
 * <li>&<code>#34</code> label&<code>#34</code> : a user-visible string to display
 * <li>&<code>#34</code> use-markup&<code>#34</code> : whether the text in the menu item includes {@link [Pango markup]}(https://docs.gtk.org/Pango/pango_markup.html)
 * <li>&<code>#34</code> action&<code>#34</code> : the prefixed name of the action to trigger
 * <li>&<code>#34</code> target&<code>#34</code> : the parameter to use when activating the action
 * <li>&<code>#34</code> icon&<code>#34</code>  and &<code>#34</code> verb-icon&<code>#34</code> : names of icons that may be displayed
 * <li>&<code>#34</code> submenu-action&<code>#34</code> : name of an action that may be used to track
 *      whether a submenu is open
 * <li>&<code>#34</code> hidden-when&<code>#34</code> : a string used to determine when the item will be hidden.
 *      Possible values include &<code>#34</code> action-disabled&<code>#34</code> , &<code>#34</code> action-missing&<code>#34</code> , &<code>#34</code> macos-menubar&<code>#34</code> .
 *      This is mainly useful for exported menus, see {@link org.gtk.gtk.Application<code>#setMenubar</code> .
 * <li>&<code>#34</code> custom&<code>#34</code> : a string used to match against the ID of a custom child added with
 *      {@link org.gtk.gtk.PopoverMenu<code>#addChild</code> , {@link org.gtk.gtk.PopoverMenuBar<code>#addChild</code> ,
 *      or in the ui file with <code>&<code>#60</code> child type=&<code>#34</code> ID&<code>#34</code> &<code>#62</code> </code>.
 * <p>
 * The following attributes are used when constructing sections:
 * <p>
 * <li>&<code>#34</code> label&<code>#34</code> : a user-visible string to use as section heading
 * <li>&<code>#34</code> display-hint&<code>#34</code> : a string used to determine special formatting for the section.
 *     Possible values include &<code>#34</code> horizontal-buttons&<code>#34</code> , &<code>#34</code> circular-buttons&<code>#34</code>  and
 *     &<code>#34</code> inline-buttons&<code>#34</code> . They all indicate that section should be
 *     displayed as a horizontal row of buttons.
 * <li>&<code>#34</code> text-direction&<code>#34</code> : a string used to determine the <code>GtkTextDirection</code> to use
 *     when &<code>#34</code> display-hint&<code>#34</code>  is set to &<code>#34</code> horizontal-buttons&<code>#34</code> . Possible values
 *     include &<code>#34</code> rtl&<code>#34</code> , &<code>#34</code> ltr&<code>#34</code> , and &<code>#34</code> none&<code>#34</code> .
 * <p>
 * The following attributes are used when constructing submenus:
 * <p>
 * <li>&<code>#34</code> label&<code>#34</code> : a user-visible string to display
 * <li>&<code>#34</code> icon&<code>#34</code> : icon name to display
 * <p>
 * Menu items will also show accelerators, which are usually associated
 * with actions via {@link org.gtk.gtk.Application<code>#setAccelsForAction</code> ,
 * {@link org.gtk.gtk.WidgetClass<code>#addBindingAction</code>  or
 * {@link org.gtk.gtk.ShortcutController<code>#addShortcut</code> .
 * <p>
 * <h1>CSS Nodes</h1>
 * <p><code>GtkPopoverMenu</code> is just a subclass of <code>GtkPopover</code> that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a .menu style class to the popover&<code>#39</code> s main node.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkPopoverMenu</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#MENU</code>  role, and its
 * items use the {@link org.gtk.gtk.AccessibleRole<code>#MENU_ITEM</code>  
 * {@link org.gtk.gtk.AccessibleRole<code>#MENU_ITEM_CHECKBOX</code>  or
 * {@link org.gtk.gtk.AccessibleRole<code>#MENU_ITEM_RADIO</code>  roles, depending on the
 * action they are connected to.
 */
public class PopoverMenu extends Popover implements Accessible, Buildable, ConstraintTarget, Native, ShortcutManager {

    public PopoverMenu(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PopoverMenu */
    public static PopoverMenu castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenu(gobject.getReference());
    }
    
    private static Reference constructNewFromModel(org.gtk.gio.MenuModel model) {
        Reference RESULT = References.get(gtk_h.gtk_popover_menu_new_from_model(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkPopoverMenu</code> and populates it according to @model.
     * <p>
     * The created buttons are connected to actions found in the<code>GtkApplicationWindow</code> to which the popover belongs - typically
     * by means of being attached to a widget that is contained within
     * the <code>GtkApplicationWindow</code>s widget hierarchy.
     * 
     * Actions can also be added using {@link org.gtk.gtk.Widget<code>#insertActionGroup</code> 
     * on the menus attach widget or on any of its parent widgets.
     * 
     * This function creates menus with sliding submenus.
     * See {@link [ctor@Gtk.PopoverMenu.new_from_model_full] (ref=ctor)} for a way
     * to control this.
     */
    public static PopoverMenu newFromModel(org.gtk.gio.MenuModel model) {
        return new PopoverMenu(constructNewFromModel(model));
    }
    
    private static Reference constructNewFromModelFull(org.gtk.gio.MenuModel model, int flags) {
        Reference RESULT = References.get(gtk_h.gtk_popover_menu_new_from_model_full(model.handle(), flags), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkPopoverMenu</code> and populates it according to @model.
     * <p>
     * The created buttons are connected to actions found in the
     * action groups that are accessible from the parent widget.
     * This includes the <code>GtkApplicationWindow</code> to which the popover
     * belongs. Actions can also be added using {@link org.gtk.gtk.Widget<code>#insertActionGroup</code> 
     * on the parent widget or on any of its parent widgets.
     * 
     * The only flag that is supported currently is
     * {@link org.gtk.gtk.PopoverMenuFlags<code>#NESTED</code>   which makes GTK create traditional,
     * nested submenus instead of the default sliding submenus.
     */
    public static PopoverMenu newFromModelFull(org.gtk.gio.MenuModel model, int flags) {
        return new PopoverMenu(constructNewFromModelFull(model, flags));
    }
    
    /**
     * Adds a custom widget to a generated menu.
     * <p>
     * For this to work, the menu model of @popover must have
     * an item with a <code>custom</code> attribute that matches @id.
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
