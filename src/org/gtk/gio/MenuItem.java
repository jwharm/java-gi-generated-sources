package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMenuItem is an opaque structure type.  You must access it using the
 * functions below.
 */
public class MenuItem extends org.gtk.gobject.Object {

    public MenuItem(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MenuItem */
    public static MenuItem castFrom(org.gtk.gobject.Object gobject) {
        return new MenuItem(gobject.getProxy());
    }
    
    /**
     * Creates a new #GMenuItem.
     * 
     * If @label is non-%NULL it is used to set the "label" attribute of the
     * new item.
     * 
     * If @detailed_action is non-%NULL it is used to set the "action" and
     * possibly the "target" attribute of the new item.  See
     * g_menu_item_set_detailed_action() for more information.
     */
    public MenuItem(java.lang.String label, java.lang.String detailedAction) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_new(Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE()), true));
    }
    
    /**
     * Creates a #GMenuItem as an exact copy of an existing menu item in a
     * #GMenuModel.
     * 
     * @item_index must be valid (ie: be sure to call
     * g_menu_model_get_n_items() first).
     */
    public MenuItem(MenuModel model, int itemIndex) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_new_from_model(model.HANDLE(), itemIndex), true));
    }
    
    /**
     * Creates a new #GMenuItem representing a section.
     * 
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_section().
     * 
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from @section become a direct part of
     * the menu that @menu_item is added to.
     * 
     * Visual separation is typically displayed between two non-empty
     * sections.  If @label is non-%NULL then it will be encorporated into
     * this visual indication.  This allows for labeled subsections of a
     * menu.
     * 
     * As a simple example, consider a typical "Edit" menu from a simple
     * program.  It probably contains an "Undo" and "Redo" item, followed by
     * a separator, followed by "Cut", "Copy" and "Paste".
     * 
     * This would be accomplished by creating three #GMenu instances.  The
     * first would be populated with the "Undo" and "Redo" items, and the
     * second with the "Cut", "Copy" and "Paste" items.  The first and
     * second menus would then be added as submenus of the third.  In XML
     * format, this would look something like the following:
     * |[
     * <menu id='edit-menu'>
     *   <section>
     *     <item label='Undo'/>
     *     <item label='Redo'/>
     *   </section>
     *   <section>
     *     <item label='Cut'/>
     *     <item label='Copy'/>
     *     <item label='Paste'/>
     *   </section>
     * </menu>
     * ]|
     * 
     * The following example is exactly equivalent.  It is more illustrative
     * of the exact relationship between the menus and items (keeping in
     * mind that the 'link' element defines a new menu that is linked to the
     * containing one).  The style of the second example is more verbose and
     * difficult to read (and therefore not recommended except for the
     * purpose of understanding what is really going on).
     * |[
     * <menu id='edit-menu'>
     *   <item>
     *     <link name='section'>
     *       <item label='Undo'/>
     *       <item label='Redo'/>
     *     </link>
     *   </item>
     *   <item>
     *     <link name='section'>
     *       <item label='Cut'/>
     *       <item label='Copy'/>
     *       <item label='Paste'/>
     *     </link>
     *   </item>
     * </menu>
     * ]|
     */
    public static MenuItem newSection(java.lang.String label, MenuModel section) {
        return new MenuItem(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_new_section(Interop.allocateNativeString(label).HANDLE(), section.HANDLE()), true));
    }
    
    /**
     * Creates a new #GMenuItem representing a submenu.
     * 
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_submenu().
     */
    public static MenuItem newSubmenu(java.lang.String label, MenuModel submenu) {
        return new MenuItem(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_new_submenu(Interop.allocateNativeString(label).HANDLE(), submenu.HANDLE()), true));
    }
    
    /**
     * Queries the named @attribute on @menu_item.
     * 
     * If @expected_type is specified and the attribute does not have this
     * type, %NULL is returned.  %NULL is also returned if the attribute
     * simply does not exist.
     */
    public org.gtk.glib.Variant getAttributeValue(java.lang.String attribute, org.gtk.glib.VariantType expectedType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_get_attribute_value(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), expectedType.HANDLE());
        return new org.gtk.glib.Variant(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Queries the named @link on @menu_item.
     */
    public MenuModel getLink(java.lang.String link) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_get_link(HANDLE(), Interop.allocateNativeString(link).HANDLE());
        return new MenuModel(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Sets or unsets the "action" and "target" attributes of @menu_item.
     * 
     * If @action is %NULL then both the "action" and "target" attributes
     * are unset (and @target_value is ignored).
     * 
     * If @action is non-%NULL then the "action" attribute is set.  The
     * "target" attribute is then set to the value of @target_value if it is
     * non-%NULL or unset otherwise.
     * 
     * Normal menu items (ie: not submenu, section or other custom item
     * types) are expected to have the "action" attribute set to identify
     * the action that they are associated with.  The state type of the
     * action help to determine the disposition of the menu item.  See
     * #GAction and #GActionGroup for an overview of actions.
     * 
     * In general, clicking on the menu item will result in activation of
     * the named action with the "target" attribute given as the parameter
     * to the action invocation.  If the "target" attribute is not set then
     * the action is invoked with no parameter.
     * 
     * If the action has no state then the menu item is usually drawn as a
     * plain menu item (ie: with no additional decoration).
     * 
     * If the action has a boolean state then the menu item is usually drawn
     * as a toggle menu item (ie: with a checkmark or equivalent
     * indication).  The item should be marked as 'toggled' or 'checked'
     * when the boolean state is %TRUE.
     * 
     * If the action has a string state then the menu item is usually drawn
     * as a radio menu item (ie: with a radio bullet or equivalent
     * indication).  The item should be marked as 'selected' when the string
     * state is equal to the value of the @target property.
     * 
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_detailed_action() for two equivalent calls that are
     * probably more convenient for most uses.
     */
    public void setActionAndTargetValue(java.lang.String action, org.gtk.glib.Variant targetValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_action_and_target_value(HANDLE(), Interop.allocateNativeString(action).HANDLE(), targetValue.HANDLE());
    }
    
    /**
     * Sets or unsets an attribute on @menu_item.
     * 
     * The attribute to set or unset is specified by @attribute. This
     * can be one of the standard attribute names %G_MENU_ATTRIBUTE_LABEL,
     * %G_MENU_ATTRIBUTE_ACTION, %G_MENU_ATTRIBUTE_TARGET, or a custom
     * attribute name.
     * Attribute names are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     * 
     * must consist only of lowercase
     * ASCII characters, digits and '-'.
     * 
     * If @value is non-%NULL then it is used as the new value for the
     * attribute.  If @value is %NULL then the attribute is unset. If
     * the @value #GVariant is floating, it is consumed.
     * 
     * See also g_menu_item_set_attribute() for a more convenient way to do
     * the same.
     */
    public void setAttributeValue(java.lang.String attribute, org.gtk.glib.Variant value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_attribute_value(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), value.HANDLE());
    }
    
    /**
     * Sets the "action" and possibly the "target" attribute of @menu_item.
     * 
     * The format of @detailed_action is the same format parsed by
     * g_action_parse_detailed_name().
     * 
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_action_and_target_value() for more flexible (but
     * slightly less convenient) alternatives.
     * 
     * See also g_menu_item_set_action_and_target_value() for a description of
     * the semantics of the action and target attributes.
     */
    public void setDetailedAction(java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_detailed_action(HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Sets (or unsets) the icon on @menu_item.
     * 
     * This call is the same as calling g_icon_serialize() and using the
     * result as the value to g_menu_item_set_attribute_value() for
     * %G_MENU_ATTRIBUTE_ICON.
     * 
     * This API is only intended for use with "noun" menu items; things like
     * bookmarks or applications in an "Open With" menu.  Don't use it on
     * menu items corresponding to verbs (eg: stock icons for 'Save' or
     * 'Quit').
     * 
     * If @icon is %NULL then the icon is unset.
     */
    public void setIcon(Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_icon(HANDLE(), icon.HANDLE());
    }
    
    /**
     * Sets or unsets the "label" attribute of @menu_item.
     * 
     * If @label is non-%NULL it is used as the label for the menu item.  If
     * it is %NULL then the label attribute is unset.
     */
    public void setLabel(java.lang.String label) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_label(HANDLE(), Interop.allocateNativeString(label).HANDLE());
    }
    
    /**
     * Creates a link from @menu_item to @model if non-%NULL, or unsets it.
     * 
     * Links are used to establish a relationship between a particular menu
     * item and another menu.  For example, %G_MENU_LINK_SUBMENU is used to
     * associate a submenu with a particular menu item, and %G_MENU_LINK_SECTION
     * is used to create a section. Other types of link can be used, but there
     * is no guarantee that clients will be able to make sense of them.
     * Link types are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     */
    public void setLink(java.lang.String link, MenuModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_link(HANDLE(), Interop.allocateNativeString(link).HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets or unsets the "section" link of @menu_item to @section.
     * 
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from @section become a direct part of
     * the menu that @menu_item is added to.  See g_menu_item_new_section()
     * for more information about what it means for a menu item to be a
     * section.
     */
    public void setSection(MenuModel section) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_section(HANDLE(), section.HANDLE());
    }
    
    /**
     * Sets or unsets the "submenu" link of @menu_item to @submenu.
     * 
     * If @submenu is non-%NULL, it is linked to.  If it is %NULL then the
     * link is unset.
     * 
     * The effect of having one menu appear as a submenu of another is
     * exactly as it sounds.
     */
    public void setSubmenu(MenuModel submenu) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_item_set_submenu(HANDLE(), submenu.HANDLE());
    }
    
}
