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
 * you can use {@link org.gtk.gtk.PopoverMenu#addChild}.
 * <p>
 * For more dialog-like behavior, use a plain <code>GtkPopover</code>.
 * <p>
 * <h2>Menu models</h2>
 * <p>
 * The XML format understood by <code>GtkBuilder</code> for <code>GMenuModel</code> consists
 * of a toplevel <code>&#60;menu&#62;</code> element, which contains one or more <code>&#60;item&#62;</code>
 * elements. Each <code>&#60;item&#62;</code> element contains <code>&#60;attribute&#62;</code> and <code>&#60;link&#62;</code>
 * elements with a mandatory name attribute. <code>&#60;link&#62;</code> elements have the
 * same content model as <code>&#60;menu&#62;</code>. Instead of <code>&#60;link name=&#34;submenu&#34;&#62;</code>
 * or <code>&#60;link name=&#34;section&#34;&#62;</code>, you can use <code>&#60;submenu&#62;</code> or <code>&#60;section&#62;</code>
 * elements.
 * <p><pre>xml
 * &#60;menu id=&#39;app-menu&#39;&#62;
 *   &#60;section&#62;
 *     &#60;item&#62;
 *       &#60;attribute name=&#39;label&#39; translatable=&#39;yes&#39;&#62;_New Window&#60;/attribute&#62;
 *       &#60;attribute name=&#39;action&#39;&#62;app.new&#60;/attribute&#62;
 *     &#60;/item&#62;
 *     &#60;item&#62;
 *       &#60;attribute name=&#39;label&#39; translatable=&#39;yes&#39;&#62;_About Sunny&#60;/attribute&#62;
 *       &#60;attribute name=&#39;action&#39;&#62;app.about&#60;/attribute&#62;
 *     &#60;/item&#62;
 *     &#60;item&#62;
 *       &#60;attribute name=&#39;label&#39; translatable=&#39;yes&#39;&#62;_Quit&#60;/attribute&#62;
 *       &#60;attribute name=&#39;action&#39;&#62;app.quit&#60;/attribute&#62;
 *     &#60;/item&#62;
 *   &#60;/section&#62;
 * &#60;/menu&#62;
 * </pre>
 * <p>
 * Attribute values can be translated using gettext, like other <code>GtkBuilder</code>
 * content. <code>&#60;attribute&#62;</code> elements can be marked for translation with a<code>translatable=&#34;yes&#34;</code> attribute. It is also possible to specify message
 * context and translator comments, using the context and comments attributes.
 * To make use of this, the <code>GtkBuilder</code> must have been given the gettext
 * domain to use.
 * <p>
 * The following attributes are used when constructing menu items:
 * <p>
 * <li>&#34;label&#34;: a user-visible string to display
 * <li>&#34;use-markup&#34;: whether the text in the menu item includes {@link [Pango markup]}(https://docs.gtk.org/Pango/pango_markup.html)
 * <li>&#34;action&#34;: the prefixed name of the action to trigger
 * <li>&#34;target&#34;: the parameter to use when activating the action
 * <li>&#34;icon&#34; and &#34;verb-icon&#34;: names of icons that may be displayed
 * <li>&#34;submenu-action&#34;: name of an action that may be used to track
 *      whether a submenu is open
 * <li>&#34;hidden-when&#34;: a string used to determine when the item will be hidden.
 *      Possible values include &#34;action-disabled&#34;, &#34;action-missing&#34;, &#34;macos-menubar&#34;.
 *      This is mainly useful for exported menus, see {@link org.gtk.gtk.Application#setMenubar}.
 * <li>&#34;custom&#34;: a string used to match against the ID of a custom child added with
 *      {@link org.gtk.gtk.PopoverMenu#addChild}, {@link org.gtk.gtk.PopoverMenuBar#addChild},
 *      or in the ui file with <code>&#60;child type=&#34;ID&#34;&#62;</code>.
 * <p>
 * The following attributes are used when constructing sections:
 * <p>
 * <li>&#34;label&#34;: a user-visible string to use as section heading
 * <li>&#34;display-hint&#34;: a string used to determine special formatting for the section.
 *     Possible values include &#34;horizontal-buttons&#34;, &#34;circular-buttons&#34; and
 *     &#34;inline-buttons&#34;. They all indicate that section should be
 *     displayed as a horizontal row of buttons.
 * <li>&#34;text-direction&#34;: a string used to determine the <code>GtkTextDirection</code> to use
 *     when &#34;display-hint&#34; is set to &#34;horizontal-buttons&#34;. Possible values
 *     include &#34;rtl&#34;, &#34;ltr&#34;, and &#34;none&#34;.
 * <p>
 * The following attributes are used when constructing submenus:
 * <p>
 * <li>&#34;label&#34;: a user-visible string to display
 * <li>&#34;icon&#34;: icon name to display
 * <p>
 * Menu items will also show accelerators, which are usually associated
 * with actions via {@link org.gtk.gtk.Application#setAccelsForAction},
 * {@link org.gtk.gtk.WidgetClass#addBindingAction} or
 * {@link org.gtk.gtk.ShortcutController#addShortcut}.
 * <p>
 * <h1>SS Nodes</h1>
 * <p><code>GtkPopoverMenu</code> is just a subclass of <code>GtkPopover</code> that adds custom content
 * to it, therefore it has the same CSS nodes. It is one of the cases that add
 * a .menu style class to the popover&#39;s main node.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkPopoverMenu</code> uses the {@link org.gtk.gtk.AccessibleRole#MENU} role, and its
 * items use the <code>GTK_ACCESSIBLE_ROLE_MENU_ITEM,
 * %GTK_ACCESSIBLE_ROLE_MENU_ITEM_CHECKBOX</code> or
 * {@link org.gtk.gtk.AccessibleRole#MENU_ITEM_RADIO} roles, depending on the
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
     * Actions can also be added using {@link org.gtk.gtk.Widget#insertActionGroup}
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
     * belongs. Actions can also be added using {@link org.gtk.gtk.Widget#insertActionGroup}
     * on the parent widget or on any of its parent widgets.
     * 
     * The only flag that is supported currently is
     * <code>GTK_POPOVER_MENU_NESTED,</code> which makes GTK create traditional,
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
