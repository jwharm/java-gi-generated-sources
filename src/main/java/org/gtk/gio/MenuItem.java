package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MenuItem} is an opaque structure type.  You must access it using the
 * functions below.
 * @version 2.32
 */
public class MenuItem extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public MenuItem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuItem */
    public static MenuItem castFrom(org.gtk.gobject.Object gobject) {
        return new MenuItem(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(detailedAction, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_menu_item_new.invokeExact(Interop.allocateNativeString(label), Interop.allocateNativeString(detailedAction)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MenuItem}.
     * <p>
     * If {@code label} is non-{@code null} it is used to set the "label" attribute of the
     * new item.
     * <p>
     * If {@code detailed_action} is non-{@code null} it is used to set the "action" and
     * possibly the "target" attribute of the new item.  See
     * g_menu_item_set_detailed_action() for more information.
     * @param label the section label, or {@code null}
     * @param detailedAction the detailed action string, or {@code null}
     */
    public MenuItem(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        super(constructNew(label, detailedAction));
    }
    
    private static Refcounted constructNewFromModel(@NotNull org.gtk.gio.MenuModel model, int itemIndex) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_menu_item_new_from_model.invokeExact(model.handle(), itemIndex), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link MenuItem} as an exact copy of an existing menu item in a
     * {@link MenuModel}.
     * <p>
     * {@code item_index} must be valid (ie: be sure to call
     * g_menu_model_get_n_items() first).
     * @param model a {@link MenuModel}
     * @param itemIndex the index of an item in {@code model}
     * @return a new {@link MenuItem}.
     */
    public static MenuItem newFromModel(@NotNull org.gtk.gio.MenuModel model, int itemIndex) {
        return new MenuItem(constructNewFromModel(model, itemIndex));
    }
    
    private static Refcounted constructNewSection(@Nullable java.lang.String label, @NotNull org.gtk.gio.MenuModel section) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(section, "Parameter 'section' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_menu_item_new_section.invokeExact(Interop.allocateNativeString(label), section.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * sections.  If {@code label} is non-{@code null} then it will be encorporated into
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
     * <pre>{@code 
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
     * }</pre>
     * <p>
     * The following example is exactly equivalent.  It is more illustrative
     * of the exact relationship between the menus and items (keeping in
     * mind that the 'link' element defines a new menu that is linked to the
     * containing one).  The style of the second example is more verbose and
     * difficult to read (and therefore not recommended except for the
     * purpose of understanding what is really going on).
     * <pre>{@code 
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
     * }</pre>
     * @param label the section label, or {@code null}
     * @param section a {@link MenuModel} with the items of the section
     * @return a new {@link MenuItem}
     */
    public static MenuItem newSection(@Nullable java.lang.String label, @NotNull org.gtk.gio.MenuModel section) {
        return new MenuItem(constructNewSection(label, section));
    }
    
    private static Refcounted constructNewSubmenu(@Nullable java.lang.String label, @NotNull org.gtk.gio.MenuModel submenu) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(submenu, "Parameter 'submenu' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_menu_item_new_submenu.invokeExact(Interop.allocateNativeString(label), submenu.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MenuItem} representing a submenu.
     * <p>
     * This is a convenience API around g_menu_item_new() and
     * g_menu_item_set_submenu().
     * @param label the section label, or {@code null}
     * @param submenu a {@link MenuModel} with the items of the submenu
     * @return a new {@link MenuItem}
     */
    public static MenuItem newSubmenu(@Nullable java.lang.String label, @NotNull org.gtk.gio.MenuModel submenu) {
        return new MenuItem(constructNewSubmenu(label, submenu));
    }
    
    /**
     * Queries the named {@code attribute} on {@code menu_item}.
     * <p>
     * If the attribute exists and matches the {@link org.gtk.glib.VariantType} corresponding
     * to {@code format_string} then {@code format_string} is used to deconstruct the
     * value into the positional parameters and {@code true} is returned.
     * <p>
     * If the attribute does not exist, or it does exist but has the wrong
     * type, then the positional parameters are ignored and {@code false} is
     * returned.
     * @param attribute the attribute name to query
     * @param formatString a {@link org.gtk.glib.Variant} format string
     * @return {@code true} if the named attribute was found with the expected
     *     type
     */
    public boolean getAttribute(@NotNull java.lang.String attribute, @NotNull java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Queries the named {@code attribute} on {@code menu_item}.
     * <p>
     * If {@code expected_type} is specified and the attribute does not have this
     * type, {@code null} is returned.  {@code null} is also returned if the attribute
     * simply does not exist.
     * @param attribute the attribute name to query
     * @param expectedType the expected type of the attribute
     * @return the attribute value, or {@code null}
     */
    public @Nullable org.gtk.glib.Variant getAttributeValue(@NotNull java.lang.String attribute, @Nullable org.gtk.glib.VariantType expectedType) {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNullElse(expectedType, MemoryAddress.NULL);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_item_get_attribute_value.invokeExact(handle(), Interop.allocateNativeString(attribute), expectedType.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    /**
     * Queries the named {@code link} on {@code menu_item}.
     * @param link the link name to query
     * @return the link, or {@code null}
     */
    public @Nullable org.gtk.gio.MenuModel getLink(@NotNull java.lang.String link) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_item_get_link.invokeExact(handle(), Interop.allocateNativeString(link));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, true));
    }
    
    /**
     * Sets or unsets the "action" and "target" attributes of {@code menu_item}.
     * <p>
     * If {@code action} is {@code null} then both the "action" and "target" attributes
     * are unset (and {@code format_string} is ignored along with the positional
     * parameters).
     * <p>
     * If {@code action} is non-{@code null} then the "action" attribute is set.
     * {@code format_string} is then inspected.  If it is non-{@code null} then the proper
     * position parameters are collected to create a {@link org.gtk.glib.Variant} instance to
     * use as the target value.  If it is {@code null} then the positional
     * parameters are ignored and the "target" attribute is unset.
     * <p>
     * See also g_menu_item_set_action_and_target_value() for an equivalent
     * call that directly accepts a {@link org.gtk.glib.Variant}.  See
     * g_menu_item_set_detailed_action() for a more convenient version that
     * works with string-typed targets.
     * <p>
     * See also g_menu_item_set_action_and_target_value() for a
     * description of the semantics of the action and target attributes.
     * @param action the name of the action for this item
     * @param formatString a GVariant format string
     */
    public void setActionAndTarget(@Nullable java.lang.String action, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets or unsets the "action" and "target" attributes of {@code menu_item}.
     * <p>
     * If {@code action} is {@code null} then both the "action" and "target" attributes
     * are unset (and {@code target_value} is ignored).
     * <p>
     * If {@code action} is non-{@code null} then the "action" attribute is set.  The
     * "target" attribute is then set to the value of {@code target_value} if it is
     * non-{@code null} or unset otherwise.
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
     * when the boolean state is {@code true}.
     * <p>
     * If the action has a string state then the menu item is usually drawn
     * as a radio menu item (ie: with a radio bullet or equivalent
     * indication).  The item should be marked as 'selected' when the string
     * state is equal to the value of the {@code target} property.
     * <p>
     * See g_menu_item_set_action_and_target() or
     * g_menu_item_set_detailed_action() for two equivalent calls that are
     * probably more convenient for most uses.
     * @param action the name of the action for this item
     * @param targetValue a {@link org.gtk.glib.Variant} to use as the action target
     */
    public void setActionAndTargetValue(@Nullable java.lang.String action, @Nullable org.gtk.glib.Variant targetValue) {
        java.util.Objects.requireNonNullElse(action, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(targetValue, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_action_and_target_value.invokeExact(handle(), Interop.allocateNativeString(action), targetValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code format_string} is non-{@code null} then the proper position parameters
     * are collected to create a {@link org.gtk.glib.Variant} instance to use as the attribute
     * value.  If it is {@code null} then the positional parameterrs are ignored
     * and the named attribute is unset.
     * <p>
     * See also g_menu_item_set_attribute_value() for an equivalent call
     * that directly accepts a {@link org.gtk.glib.Variant}.
     * @param attribute the attribute to set
     * @param formatString a {@link org.gtk.glib.Variant} format string, or {@code null}
     */
    public void setAttribute(@NotNull java.lang.String attribute, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     * If {@code value} is non-{@code null} then it is used as the new value for the
     * attribute.  If {@code value} is {@code null} then the attribute is unset. If
     * the {@code value} {@link org.gtk.glib.Variant} is floating, it is consumed.
     * <p>
     * See also g_menu_item_set_attribute() for a more convenient way to do
     * the same.
     * @param attribute the attribute to set
     * @param value a {@link org.gtk.glib.Variant} to use as the value, or {@code null}
     */
    public void setAttributeValue(@NotNull java.lang.String attribute, @Nullable org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        java.util.Objects.requireNonNullElse(value, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_attribute_value.invokeExact(handle(), Interop.allocateNativeString(attribute), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param detailedAction the "detailed" action string
     */
    public void setDetailedAction(@NotNull java.lang.String detailedAction) {
        java.util.Objects.requireNonNull(detailedAction, "Parameter 'detailedAction' must not be null");
        try {
            DowncallHandles.g_menu_item_set_detailed_action.invokeExact(handle(), Interop.allocateNativeString(detailedAction));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * If {@code icon} is {@code null} then the icon is unset.
     * @param icon a {@link Icon}, or {@code null}
     */
    public void setIcon(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        try {
            DowncallHandles.g_menu_item_set_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or unsets the "label" attribute of {@code menu_item}.
     * <p>
     * If {@code label} is non-{@code null} it is used as the label for the menu item.  If
     * it is {@code null} then the label attribute is unset.
     * @param label the label to set, or {@code null} to unset
     */
    public void setLabel(@Nullable java.lang.String label) {
        java.util.Objects.requireNonNullElse(label, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_label.invokeExact(handle(), Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a link from {@code menu_item} to {@code model} if non-{@code null}, or unsets it.
     * <p>
     * Links are used to establish a relationship between a particular menu
     * item and another menu.  For example, {@code G_MENU_LINK_SUBMENU} is used to
     * associate a submenu with a particular menu item, and {@code G_MENU_LINK_SECTION}
     * is used to create a section. Other types of link can be used, but there
     * is no guarantee that clients will be able to make sense of them.
     * Link types are restricted to lowercase characters, numbers
     * and '-'. Furthermore, the names must begin with a lowercase character,
     * must not end with a '-', and must not contain consecutive dashes.
     * @param link type of link to establish or unset
     * @param model the {@link MenuModel} to link to (or {@code null} to unset)
     */
    public void setLink(@NotNull java.lang.String link, @Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNull(link, "Parameter 'link' must not be null");
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_link.invokeExact(handle(), Interop.allocateNativeString(link), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or unsets the "section" link of {@code menu_item} to {@code section}.
     * <p>
     * The effect of having one menu appear as a section of another is
     * exactly as it sounds: the items from {@code section} become a direct part of
     * the menu that {@code menu_item} is added to.  See g_menu_item_new_section()
     * for more information about what it means for a menu item to be a
     * section.
     * @param section a {@link MenuModel}, or {@code null}
     */
    public void setSection(@Nullable org.gtk.gio.MenuModel section) {
        java.util.Objects.requireNonNullElse(section, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_section.invokeExact(handle(), section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets or unsets the "submenu" link of {@code menu_item} to {@code submenu}.
     * <p>
     * If {@code submenu} is non-{@code null}, it is linked to.  If it is {@code null} then the
     * link is unset.
     * <p>
     * The effect of having one menu appear as a submenu of another is
     * exactly as it sounds.
     * @param submenu a {@link MenuModel}, or {@code null}
     */
    public void setSubmenu(@Nullable org.gtk.gio.MenuModel submenu) {
        java.util.Objects.requireNonNullElse(submenu, MemoryAddress.NULL);
        try {
            DowncallHandles.g_menu_item_set_submenu.invokeExact(handle(), submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_item_new = Interop.downcallHandle(
            "g_menu_item_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_new_from_model = Interop.downcallHandle(
            "g_menu_item_new_from_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_menu_item_new_section = Interop.downcallHandle(
            "g_menu_item_new_section",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_new_submenu = Interop.downcallHandle(
            "g_menu_item_new_submenu",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_get_attribute = Interop.downcallHandle(
            "g_menu_item_get_attribute",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_get_attribute_value = Interop.downcallHandle(
            "g_menu_item_get_attribute_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_get_link = Interop.downcallHandle(
            "g_menu_item_get_link",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_action_and_target = Interop.downcallHandle(
            "g_menu_item_set_action_and_target",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_action_and_target_value = Interop.downcallHandle(
            "g_menu_item_set_action_and_target_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_attribute = Interop.downcallHandle(
            "g_menu_item_set_attribute",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_attribute_value = Interop.downcallHandle(
            "g_menu_item_set_attribute_value",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_detailed_action = Interop.downcallHandle(
            "g_menu_item_set_detailed_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_icon = Interop.downcallHandle(
            "g_menu_item_set_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_label = Interop.downcallHandle(
            "g_menu_item_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_link = Interop.downcallHandle(
            "g_menu_item_set_link",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_section = Interop.downcallHandle(
            "g_menu_item_set_section",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_menu_item_set_submenu = Interop.downcallHandle(
            "g_menu_item_set_submenu",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
