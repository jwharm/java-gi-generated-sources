package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMenuItem is an opaque structure type.  You must access it using the
 * functions below.
 */
public class MenuItem extends org.gtk.gobject.Object {

    public MenuItem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MenuItem */
    public static MenuItem castFrom(org.gtk.gobject.Object gobject) {
        return new MenuItem(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String label, java.lang.String detailedAction) {
        Reference RESULT = References.get(gtk_h.g_menu_item_new(Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(detailedAction).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GMenuItem.
     * 
     * If @label is non-<code>null</code> it is used to set the &#34;label&#34; attribute of the
     * new item.
     * 
     * If @detailed_action is non-<code>null</code> it is used to set the &#34;action&#34; and
     * possibly the &#34;target&#34; attribute of the new item.  See
     * g_menu_item_set_detailed_action() for more information.
     */
    public MenuItem(java.lang.String label, java.lang.String detailedAction) {
        super(constructNew(label, detailedAction));
    }
    
    private static Reference constructNewFromModel(MenuModel model, int itemIndex) {
        Reference RESULT = References.get(gtk_h.g_menu_item_new_from_model(model.handle(), itemIndex), true);
        return RESULT;
    }
    
    /**
     * Creates a #GMenuItem as an exact copy of an existing menu item in a
     * #GMenuModel.
     * 
     * @item_index must be valid (ie: be sure to call
     * g_menu_model_get_n_items() first).
     */
    public static MenuItem newFromModel(MenuModel model, int itemIndex) {
        return new MenuItem(constructNewFromModel(model, itemIndex));
    }
    
    private static Reference constructNewSection(java.lang.String label, MenuModel section) {
        Reference RESULT = References.get(gtk_h.g_menu_item_new_section(Interop.allocateNativeString(label).handle(), section.handle()), true);
        return RESULT;
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
     * sections.  If @label is non-<code>null</code> then it will be encorporated into
     * this visual indication.  This allows for labeled subsections of a
     * menu.
     * 
     * As a simple example, consider a typical &#34;Edit&#34; menu from a simple
     * program.  It probably contains an &#34;Undo&#34; and &#34;Redo&#34; item, followed by
     * a separator, followed by &#34;Cut&#34;, &#34;Copy&#34; and &#34;Paste&#34;.
     * 
     * This would be accomplished by creating three #GMenu instances.  The
     * first would be populated with the &#34;Undo&#34; and &#34;Redo&#34; items, and the
     * second with the &#34;Cut&#34;, &#34;Copy&#34; and &#34;Paste&#34; items.  The first and
     * second menus would then be added as submenus of the third.  In XML
     * format, this would look something like the following:
     * |{@link [
     * &#60;menu id=&#39;edit-menu&#39;&#62;
     *   &#60;section&#62;
     *     &#60;item label=&#39;Undo&#39;/&#62;
     *     &#60;item label=&#39;Redo&#39;/&#62;
     *   &#60;/section&#62;
     *   &#60;section&#62;
     *     &#60;item label=&#39;Cut&#39;/&#62;
     *     &#60;item label=&#39;Copy&#39;/&#62;
     *     &#60;item label=&#39;Paste&#39;/&#62;
     *   &#60;/section&#62;
     * &#60;/menu&#62;
     * ]}|
     * 
     * The following example is exactly equivalent.  It is more illustrative
     * of the exact relationship between the menus and items (keeping in
     * mind that the &#39;link&#39; element defines a new menu that is linked to the
     * containing one).  The style of the second example is more verbose and
     * difficult to read (and therefore not recommended except for the
     * purpose of understanding what is really going on).
     * |{@link [
     * &#60;menu id=&#39;edit-menu&#39;&#62;
     *   &#60;item&#62;
     *     &#60;link name=&#39;section&#39;&#62;
     *       &#60;item label=&#39;Undo&#39;/&#62;
     *       &#60;item label=&#39;Redo&#39;/&#62;
     *     &#60;/link&#62;
     *   &#60;/item&#62;
     *   &#60;item&#62;
     *     &#60;link name=&#39;section&#39;&#62;
     *       &#60;item label=&#39;Cut&#39;/&#62;
     *       &#60;item label=&#39;Copy&#39;/&#62;
     *       &#60;item label=&#39;Paste&#39;/&#62;
     *     &#60;/link&#62;
     *   &#60;/item&#62;
     * &#60;/menu&#62;
     * ]}|
     */
    public static MenuItem newSection(java.lang.String label, MenuModel section) {
        return new MenuItem(constructNewSection(label, section));
    }
    
    private static Reference constructNewSubmenu(java.lang.String label, MenuModel submenu) {
        Reference RESULT = References.get(gtk_h.g_menu_item_new_submenu(Interop.allocateNativeString(label).handle(), submenu.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new #GMenuItem representing a submenu.
     * 
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_submenu().
     */
    public static MenuItem newSubmenu(java.lang.String label, MenuModel submenu) {
        return new MenuItem(constructNewSubmenu(label, submenu));
    }
    
    /**
     * Queries the named @attribute on @menu_item.
     * 
     * If @expected_type is specified and the attribute does not have this
     * type, <code>null</code> is returned.  <code>null</code> is also returned if the attribute
     * simply does not exist.
     */
    public org.gtk.glib.Variant getAttributeValue(java.lang.String attribute, org.gtk.glib.VariantType expectedType) {
        var RESULT = gtk_h.g_menu_item_get_attribute_value(handle(), Interop.allocateNativeString(attribute).handle(), expectedType.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the named @link on @menu_item.
     */
    public MenuModel getLink(java.lang.String link) {
        var RESULT = gtk_h.g_menu_item_get_link(handle(), Interop.allocateNativeString(link).handle());
        return new MenuModel(References.get(RESULT, true));
    }
    
    /**
     * Sets or unsets the &#34;action&#34; and &#34;target&#34; attributes of @menu_item.
     * 
     * If @action is <code>null</code> then both the &#34;action&#34; and &#34;target&#34; attributes
     * are unset (and @target_value is ignored).
     * 
     * If @action is non-<code>null</code> then the &#34;action&#34; attribute is set.  The
     * &#34;target&#34; attribute is then set to the value of @target_value if it is
     * non-<code>null</code> or unset otherwise.
     * 
     * Normal menu items (ie: not submenu, section or other custom item
     * types) are expected to have the &#34;action&#34; attribute set to identify
     * the action that they are associated with.  The state type of the
     * action help to determine the disposition of the menu item.  See
     * #GAction and #GActionGroup for an overview of actions.
     * 
     * In general, clicking on the menu item will result in activation of
     * the named action with the &#34;target&#34; attribute given as the parameter
     * to the action invocation.  If the &#34;target&#34; attribute is not set then
     * the action is invoked with no parameter.
     * 
     * If the action has no state then the menu item is usually drawn as a
     * plain menu item (ie: with no additional decoration).
     * 
     * If the action has a boolean state then the menu item is usually drawn
     * as a toggle menu item (ie: with a checkmark or equivalent
     * indication).  The item should be marked as &#39;toggled&#39; or &#39;checked&#39;
     * when the boolean state is <code>TRUE.
     * 
     * If</code> the action has a string state then the menu item is usually drawn
     * as a radio menu item (ie: with a radio bullet or equivalent
     * indication).  The item should be marked as &#39;selected&#39; when the string
     * state is equal to the value of the @target property.
     * 
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_detailed_action() for two equivalent calls that are
     * probably more convenient for most uses.
     */
    public void setActionAndTargetValue(java.lang.String action, org.gtk.glib.Variant targetValue) {
        gtk_h.g_menu_item_set_action_and_target_value(handle(), Interop.allocateNativeString(action).handle(), targetValue.handle());
    }
    
    /**
     * Sets or unsets an attribute on @menu_item.
     * 
     * The attribute to set or unset is specified by @attribute. This
     * can be one of the standard attribute names <code>G_MENU_ATTRIBUTE_LABEL,
     * %G_MENU_ATTRIBUTE_ACTION,</code> <code>G_MENU_ATTRIBUTE_TARGET,</code> or a custom
     * attribute name.
     * Attribute names are restricted to lowercase characters, numbers
     * and &#39;-&#39;. Furthermore, the names must begin with a lowercase character,
     * must not end with a &#39;-&#39;, and must not contain consecutive dashes.
     * 
     * must consist only of lowercase
     * ASCII characters, digits and &#39;-&#39;.
     * 
     * If @value is non-<code>null</code> then it is used as the new value for the
     * attribute.  If @value is <code>null</code> then the attribute is unset. If
     * the @value #GVariant is floating, it is consumed.
     * 
     * See also g_menu_item_set_attribute() for a more convenient way to do
     * the same.
     */
    public void setAttributeValue(java.lang.String attribute, org.gtk.glib.Variant value) {
        gtk_h.g_menu_item_set_attribute_value(handle(), Interop.allocateNativeString(attribute).handle(), value.handle());
    }
    
    /**
     * Sets the &#34;action&#34; and possibly the &#34;target&#34; attribute of @menu_item.
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
        gtk_h.g_menu_item_set_detailed_action(handle(), Interop.allocateNativeString(detailedAction).handle());
    }
    
    /**
     * Sets (or unsets) the icon on @menu_item.
     * 
     * This call is the same as calling g_icon_serialize() and using the
     * result as the value to g_menu_item_set_attribute_value() for
     * <code>G_MENU_ATTRIBUTE_ICON.
     * 
     * This</code> API is only intended for use with &#34;noun&#34; menu items; things like
     * bookmarks or applications in an &#34;Open With&#34; menu.  Don&#39;t use it on
     * menu items corresponding to verbs (eg: stock icons for &#39;Save&#39; or
     * &#39;Quit&#39;).
     * 
     * If @icon is <code>null</code> then the icon is unset.
     */
    public void setIcon(Icon icon) {
        gtk_h.g_menu_item_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets or unsets the &#34;label&#34; attribute of @menu_item.
     * 
     * If @label is non-<code>null</code> it is used as the label for the menu item.  If
     * it is <code>null</code> then the label attribute is unset.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.g_menu_item_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Creates a link from @menu_item to @model if non-<code>NULL,</code> or unsets it.
     * 
     * Links are used to establish a relationship between a particular menu
     * item and another menu.  For example, <code>G_MENU_LINK_SUBMENU</code> is used to
     * associate a submenu with a particular menu item, and <code>G_MENU_LINK_SECTION
     * is</code> used to create a section. Other types of link can be used, but there
     * is no guarantee that clients will be able to make sense of them.
     * Link types are restricted to lowercase characters, numbers
     * and &#39;-&#39;. Furthermore, the names must begin with a lowercase character,
     * must not end with a &#39;-&#39;, and must not contain consecutive dashes.
     */
    public void setLink(java.lang.String link, MenuModel model) {
        gtk_h.g_menu_item_set_link(handle(), Interop.allocateNativeString(link).handle(), model.handle());
    }
    
    /**
     * Sets or unsets the &#34;section&#34; link of @menu_item to @section.
     * 
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from @section become a direct part of
     * the menu that @menu_item is added to.  See g_menu_item_new_section()
     * for more information about what it means for a menu item to be a
     * section.
     */
    public void setSection(MenuModel section) {
        gtk_h.g_menu_item_set_section(handle(), section.handle());
    }
    
    /**
     * Sets or unsets the &#34;submenu&#34; link of @menu_item to @submenu.
     * 
     * If @submenu is non-<code>NULL,</code> it is linked to.  If it is <code>null</code> then the
     * link is unset.
     * 
     * The effect of having one menu appear as a submenu of another is
     * exactly as it sounds.
     */
    public void setSubmenu(MenuModel submenu) {
        gtk_h.g_menu_item_set_submenu(handle(), submenu.handle());
    }
    
}
