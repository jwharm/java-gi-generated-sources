package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MenuItem} is an opaque structure type.  You must access it using the
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
     * Creates a new {@link MenuItem}.
     * <p>
     * If {@code label} is non-<code>null</code> it is used to set the "label" attribute of the
     * new item.
     * <p>
     * If {@code detailed_action} is non-<code>null</code> it is used to set the "action" and
     * possibly the "target" attribute of the new item.  See
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
     * Creates a {@link MenuItem} as an exact copy of an existing menu item in a
     * {@link MenuModel}.
     * <p>
     * {@code item_index} must be valid (ie: be sure to call
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
     * Creates a new {@link MenuItem} representing a section.
     * <p>
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_section().
     * <p>
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from {@code section} become a direct part of
     * the menu that {@code menu_item} is added to.
     * <p>
     * Visual separation is typically displayed between two non-empty
     * sections.  If {@code label} is non-<code>null</code> then it will be encorporated into
     * this visual indication.  This allows for labeled subsections of a
     * menu.
     * <p>
     * As a simple example, consider a typical "Edit" menu from a simple
     * program.  It probably contains an "Undo" and "Redo" item, followed by
     * a separator, followed by "Cut", "Copy" and "Paste".
     * <p>
     * This would be accomplished by creating three {@link Menu} instances.  The
     * first would be populated with the "Undo" and "Redo" items, and the
     * second with the "Cut", "Copy" and "Paste" items.  The first and
     * second menus would then be added as submenus of the third.  In XML
     * format, this would look something like the following:
     * |[
     * &lt;menu id='edit-menu'&gt;
     *   &lt;section&gt;
     *     &lt;item label='Undo'/&gt;
     *     &lt;item label='Redo'/&gt;
     *   &lt;/section&gt;
     *   &lt;section&gt;
     *     &lt;item label='Cut'/&gt;
     *     &lt;item label='Copy'/&gt;
     *     &lt;item label='Paste'/&gt;
     *   &lt;/section&gt;
     * &lt;/menu&gt;
     * ]|
     * <p>
     * The following example is exactly equivalent.  It is more illustrative
     * of the exact relationship between the menus and items (keeping in
     * mind that the 'link' element defines a new menu that is linked to the
     * containing one).  The style of the second example is more verbose and
     * difficult to read (and therefore not recommended except for the
     * purpose of understanding what is really going on).
     * |[
     * &lt;menu id='edit-menu'&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Undo'/&gt;
     *       &lt;item label='Redo'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     *   &lt;item&gt;
     *     &lt;link name='section'&gt;
     *       &lt;item label='Cut'/&gt;
     *       &lt;item label='Copy'/&gt;
     *       &lt;item label='Paste'/&gt;
     *     &lt;/link&gt;
     *   &lt;/item&gt;
     * &lt;/menu&gt;
     * ]|
     */
    public static MenuItem newSection(java.lang.String label, MenuModel section) {
        return new MenuItem(constructNewSection(label, section));
    }
    
    private static Reference constructNewSubmenu(java.lang.String label, MenuModel submenu) {
        Reference RESULT = References.get(gtk_h.g_menu_item_new_submenu(Interop.allocateNativeString(label).handle(), submenu.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link MenuItem} representing a submenu.
     * <p>
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_submenu().
     */
    public static MenuItem newSubmenu(java.lang.String label, MenuModel submenu) {
        return new MenuItem(constructNewSubmenu(label, submenu));
    }
    
    /**
     * Queries the named {@code attribute} on {@code menu_item}.
     * <p>
     * If {@code expected_type} is specified and the attribute does not have this
     * type, <code>null</code> is returned.  <code>null</code> is also returned if the attribute
     * simply does not exist.
     */
    public org.gtk.glib.Variant getAttributeValue(java.lang.String attribute, org.gtk.glib.VariantType expectedType) {
        var RESULT = gtk_h.g_menu_item_get_attribute_value(handle(), Interop.allocateNativeString(attribute).handle(), expectedType.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the named {@code link} on {@code menu_item}.
     */
    public MenuModel getLink(java.lang.String link) {
        var RESULT = gtk_h.g_menu_item_get_link(handle(), Interop.allocateNativeString(link).handle());
        return new MenuModel(References.get(RESULT, true));
    }
    
    /**
     * Sets or unsets the "action" and "target" attributes of {@code menu_item}.
     * <p>
     * If {@code action} is <code>null</code> then both the "action" and "target" attributes
     * are unset (and {@code target_value} is ignored).
     * <p>
     * If {@code action} is non-<code>null</code> then the "action" attribute is set.  The
     * "target" attribute is then set to the value of {@code target_value} if it is
     * non-<code>null</code> or unset otherwise.
     * <p>
     * Normal menu items (ie: not submenu, section or other custom item
     * types) are expected to have the "action" attribute set to identify
     * the action that they are associated with.  The state type of the
     * action help to determine the disposition of the menu item.  See
     * {@link Action} and {@link ActionGroup} for an overview of actions.
     * <p>
     * In general, clicking on the menu item will result in activation of
     * the named action with the "target" attribute given as the parameter
     * to the action invocation.  If the "target" attribute is not set then
     * the action is invoked with no parameter.
     * <p>
     * If the action has no state then the menu item is usually drawn as a
     * plain menu item (ie: with no additional decoration).
     * <p>
     * If the action has a boolean state then the menu item is usually drawn
     * as a toggle menu item (ie: with a checkmark or equivalent
     * indication).  The item should be marked as 'toggled' or 'checked'
     * when the boolean state is <code>true</code>.
     * <p>
     * If the action has a string state then the menu item is usually drawn
     * as a radio menu item (ie: with a radio bullet or equivalent
     * indication).  The item should be marked as 'selected' when the string
     * state is equal to the value of the {@code target} property.
     * <p>
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_detailed_action() for two equivalent calls that are
     * probably more convenient for most uses.
     */
    public void setActionAndTargetValue(java.lang.String action, org.gtk.glib.Variant targetValue) {
        gtk_h.g_menu_item_set_action_and_target_value(handle(), Interop.allocateNativeString(action).handle(), targetValue.handle());
    }
    
    /**
     * Sets or unsets an attribute on {@code menu_item}.
     * <p>
     * The attribute to set or unset is specified by {@code attribute}. This
     * can be one of the standard attribute names {@code G_MENU_ATTRIBUTE_LABEL},
     * {@code G_MENU_ATTRIBUTE_ACTION}, {@code G_MENU_ATTRIBUTE_TARGET}, or a custom
     * attribute name.
     * Attribute names are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     * <p>
     * must consist only of lowercase
     * ASCII characters, digits and '-'.
     * <p>
     * If {@code value} is non-<code>null</code> then it is used as the new value for the
     * attribute.  If {@code value} is <code>null</code> then the attribute is unset. If
     * the {@code value} {@link org.gtk.glib.Variant} is floating, it is consumed.
     * <p>
     * See also g_menu_item_set_attribute() for a more convenient way to do
     * the same.
     */
    public void setAttributeValue(java.lang.String attribute, org.gtk.glib.Variant value) {
        gtk_h.g_menu_item_set_attribute_value(handle(), Interop.allocateNativeString(attribute).handle(), value.handle());
    }
    
    /**
     * Sets the "action" and possibly the "target" attribute of {@code menu_item}.
     * <p>
     * The format of {@code detailed_action} is the same format parsed by
     * g_action_parse_detailed_name().
     * <p>
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_action_and_target_value() for more flexible (but
     * slightly less convenient) alternatives.
     * <p>
     * See also g_menu_item_set_action_and_target_value() for a description of
     * the semantics of the action and target attributes.
     */
    public void setDetailedAction(java.lang.String detailedAction) {
        gtk_h.g_menu_item_set_detailed_action(handle(), Interop.allocateNativeString(detailedAction).handle());
    }
    
    /**
     * Sets (or unsets) the icon on {@code menu_item}.
     * <p>
     * This call is the same as calling g_icon_serialize() and using the
     * result as the value to g_menu_item_set_attribute_value() for
     * {@code G_MENU_ATTRIBUTE_ICON}.
     * <p>
     * This API is only intended for use with "noun" menu items; things like
     * bookmarks or applications in an "Open With" menu.  Don't use it on
     * menu items corresponding to verbs (eg: stock icons for 'Save' or
     * 'Quit').
     * <p>
     * If {@code icon} is <code>null</code> then the icon is unset.
     */
    public void setIcon(Icon icon) {
        gtk_h.g_menu_item_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets or unsets the "label" attribute of {@code menu_item}.
     * <p>
     * If {@code label} is non-<code>null</code> it is used as the label for the menu item.  If
     * it is <code>null</code> then the label attribute is unset.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.g_menu_item_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Creates a link from {@code menu_item} to {@code model} if non-<code>null</code>, or unsets it.
     * <p>
     * Links are used to establish a relationship between a particular menu
     * item and another menu.  For example, {@code G_MENU_LINK_SUBMENU} is used to
     * associate a submenu with a particular menu item, and {@code G_MENU_LINK_SECTION}
     * is used to create a section. Other types of link can be used, but there
     * is no guarantee that clients will be able to make sense of them.
     * Link types are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     */
    public void setLink(java.lang.String link, MenuModel model) {
        gtk_h.g_menu_item_set_link(handle(), Interop.allocateNativeString(link).handle(), model.handle());
    }
    
    /**
     * Sets or unsets the "section" link of {@code menu_item} to {@code section}.
     * <p>
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from {@code section} become a direct part of
     * the menu that {@code menu_item} is added to.  See g_menu_item_new_section()
     * for more information about what it means for a menu item to be a
     * section.
     */
    public void setSection(MenuModel section) {
        gtk_h.g_menu_item_set_section(handle(), section.handle());
    }
    
    /**
     * Sets or unsets the "submenu" link of {@code menu_item} to {@code submenu}.
     * <p>
     * If {@code submenu} is non-<code>null</code>, it is linked to.  If it is <code>null</code> then the
     * link is unset.
     * <p>
     * The effect of having one menu appear as a submenu of another is
     * exactly as it sounds.
     */
    public void setSubmenu(MenuModel submenu) {
        gtk_h.g_menu_item_set_submenu(handle(), submenu.handle());
    }
    
}
