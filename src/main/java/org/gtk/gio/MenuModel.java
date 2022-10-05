package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link MenuModel} represents the contents of a menu -- an ordered list of
 * menu items. The items are associated with actions, which can be
 * activated through them. Items can be grouped in sections, and may
 * have submenus associated with them. Both items and sections usually
 * have some representation data, such as labels or icons. The type of
 * the associated action (ie whether it is stateful, and what kind of
 * state it has) can influence the representation of the item.
 * <p>
 * The conceptual model of menus in {@link MenuModel} is hierarchical:
 * sections and submenus are again represented by {@code GMenuModels}.
 * Menus themselves do not define their own roles. Rather, the role
 * of a particular {@link MenuModel} is defined by the item that references
 * it (or, in the case of the 'root' menu, is defined by the context
 * in which it is used).
 * <p>
 * As an example, consider the visible portions of this menu:
 * <p>
 * <h2>An example menu # {#menu-example}</h2>
 * <p>
 * ![](menu-example.png)
 * <p>
 * There are 8 "menus" visible in the screenshot: one menubar, two
 * submenus and 5 sections:
 * <p>
 * <ul>
 * <li>the toplevel menubar (containing 4 items)
 * <li>the View submenu (containing 3 sections)
 * <li>the first section of the View submenu (containing 2 items)
 * <li>the second section of the View submenu (containing 1 item)
 * <li>the final section of the View submenu (containing 1 item)
 * <li>the Highlight Mode submenu (containing 2 sections)
 * <li>the Sources section (containing 2 items)
 * <li>the Markup section (containing 2 items)
 * </ul>
 * <p>
 * The [example][menu-model] illustrates the conceptual connection between
 * these 8 menus. Each large block in the figure represents a menu and the
 * smaller blocks within the large block represent items in that menu. Some
 * items contain references to other menus.
 * <p>
 * <h2>A menu example # {#menu-model}</h2>
 * <p>
 * ![](menu-model.png)
 * <p>
 * Notice that the separators visible in the [example][menu-example]
 * appear nowhere in the [menu model][menu-model]. This is because
 * separators are not explicitly represented in the menu model. Instead,
 * a separator is inserted between any two non-empty sections of a menu.
 * Section items can have labels just like any other item. In that case,
 * a display system may show a section header instead of a separator.
 * <p>
 * The motivation for this abstract model of application controls is
 * that modern user interfaces tend to make these controls available
 * outside the application. Examples include global menus, jumplists,
 * dash boards, etc. To support such uses, it is necessary to 'export'
 * information about actions and their representation in menus, which
 * is exactly what the [GActionGroup exporter][gio-GActionGroup-exporter]
 * and the [GMenuModel exporter][gio-GMenuModel-exporter] do for
 * {@link ActionGroup} and {@link MenuModel}. The client-side counterparts to
 * make use of the exported information are {@link DBusActionGroup} and
 * {@link DBusMenuModel}.
 * <p>
 * The API of {@link MenuModel} is very generic, with iterators for the
 * attributes and links of an item, see g_menu_model_iterate_item_attributes()
 * and g_menu_model_iterate_item_links(). The 'standard' attributes and
 * link types have predefined names: {@code G_MENU_ATTRIBUTE_LABEL},
 * {@code G_MENU_ATTRIBUTE_ACTION}, {@code G_MENU_ATTRIBUTE_TARGET}, {@code G_MENU_LINK_SECTION}
 * and {@code G_MENU_LINK_SUBMENU}.
 * <p>
 * Items in a {@link MenuModel} represent active controls if they refer to
 * an action that can get activated when the user interacts with the
 * menu item. The reference to the action is encoded by the string id
 * in the {@code G_MENU_ATTRIBUTE_ACTION} attribute. An action id uniquely
 * identifies an action in an action group. Which action group(s) provide
 * actions depends on the context in which the menu model is used.
 * E.g. when the model is exported as the application menu of a
 * {@link org.gtk.gtk.Application}, actions can be application-wide or window-specific
 * (and thus come from two different action groups). By convention, the
 * application-wide actions have names that start with "app.", while the
 * names of window-specific actions start with "win.".
 * <p>
 * While a wide variety of stateful actions is possible, the following
 * is the minimum that is expected to be supported by all users of exported
 * menu information:
 * <ul>
 * <li>an action with no parameter type and no state
 * <li>an action with no parameter type and boolean state
 * <li>an action with string parameter type and string state
 * </ul>
 * <p>
 * <h2>Stateless</h2>
 * <p>
 * A stateless action typically corresponds to an ordinary menu item.
 * <p>
 * Selecting such a menu item will activate the action (with no parameter).
 * <p>
 * <h2>Boolean State</h2>
 * <p>
 * An action with a boolean state will most typically be used with a "toggle"
 * or "switch" menu item. The state can be set directly, but activating the
 * action (with no parameter) results in the state being toggled.
 * <p>
 * Selecting a toggle menu item will activate the action. The menu item should
 * be rendered as "checked" when the state is true.
 * <p>
 * <h2>String Parameter and State</h2>
 * <p>
 * Actions with string parameters and state will most typically be used to
 * represent an enumerated choice over the items available for a group of
 * radio menu items. Activating the action with a string parameter is
 * equivalent to setting that parameter as the state.
 * <p>
 * Radio menu items, in addition to being associated with the action, will
 * have a target value. Selecting that menu item will result in activation
 * of the action with the target value as the parameter. The menu item should
 * be rendered as "selected" when the state of the action is equal to the
 * target value of the menu item.
 */
public class MenuModel extends org.gtk.gobject.Object {

    public MenuModel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MenuModel */
    public static MenuModel castFrom(org.gtk.gobject.Object gobject) {
        return new MenuModel(gobject.refcounted());
    }
    
    static final MethodHandle g_menu_model_get_item_attribute_value = Interop.downcallHandle(
        "g_menu_model_get_item_attribute_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the item at position {@code item_index} in {@code model} for the attribute
     * specified by {@code attribute}.
     * <p>
     * If {@code expected_type} is non-{@code null} then it specifies the expected type of
     * the attribute.  If it is {@code null} then any type will be accepted.
     * <p>
     * If the attribute exists and matches {@code expected_type} (or if the
     * expected type is unspecified) then the value is returned.
     * <p>
     * If the attribute does not exist, or does not match the expected type
     * then {@code null} is returned.
     */
    public org.gtk.glib.Variant getItemAttributeValue(int itemIndex, java.lang.String attribute, org.gtk.glib.VariantType expectedType) {
        try {
            var RESULT = (MemoryAddress) g_menu_model_get_item_attribute_value.invokeExact(handle(), itemIndex, Interop.allocateNativeString(attribute).handle(), expectedType.handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_get_item_link = Interop.downcallHandle(
        "g_menu_model_get_item_link",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the item at position {@code item_index} in {@code model} for the link
     * specified by {@code link}.
     * <p>
     * If the link exists, the linked {@link MenuModel} is returned.  If the link
     * does not exist, {@code null} is returned.
     */
    public MenuModel getItemLink(int itemIndex, java.lang.String link) {
        try {
            var RESULT = (MemoryAddress) g_menu_model_get_item_link.invokeExact(handle(), itemIndex, Interop.allocateNativeString(link).handle());
            return new MenuModel(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_get_n_items = Interop.downcallHandle(
        "g_menu_model_get_n_items",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Query the number of items in {@code model}.
     */
    public int getNItems() {
        try {
            var RESULT = (int) g_menu_model_get_n_items.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_is_mutable = Interop.downcallHandle(
        "g_menu_model_is_mutable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries if {@code model} is mutable.
     * <p>
     * An immutable {@link MenuModel} will never emit the {@link MenuModel}::items-changed
     * signal. Consumers of the model may make optimisations accordingly.
     */
    public boolean isMutable() {
        try {
            var RESULT = (int) g_menu_model_is_mutable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_items_changed = Interop.downcallHandle(
        "g_menu_model_items_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests emission of the {@link MenuModel}::items-changed signal on {@code model}.
     * <p>
     * This function should never be called except by {@link MenuModel}
     * subclasses.  Any other calls to this function will very likely lead
     * to a violation of the interface of the model.
     * <p>
     * The implementation should update its internal representation of the
     * menu before emitting the signal.  The implementation should further
     * expect to receive queries about the new state of the menu (and
     * particularly added menu items) while signal handlers are running.
     * <p>
     * The implementation must dispatch this call directly from a mainloop
     * entry and not in response to calls -- particularly those from the
     * {@link MenuModel} API.  Said another way: the menu must not change while
     * user code is running without returning to the mainloop.
     */
    public void itemsChanged(int position, int removed, int added) {
        try {
            g_menu_model_items_changed.invokeExact(handle(), position, removed, added);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_iterate_item_attributes = Interop.downcallHandle(
        "g_menu_model_iterate_item_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a {@link MenuAttributeIter} to iterate over the attributes of
     * the item at position {@code item_index} in {@code model}.
     * <p>
     * You must free the iterator with g_object_unref() when you are done.
     */
    public MenuAttributeIter iterateItemAttributes(int itemIndex) {
        try {
            var RESULT = (MemoryAddress) g_menu_model_iterate_item_attributes.invokeExact(handle(), itemIndex);
            return new MenuAttributeIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_menu_model_iterate_item_links = Interop.downcallHandle(
        "g_menu_model_iterate_item_links",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a {@link MenuLinkIter} to iterate over the links of the item at
     * position {@code item_index} in {@code model}.
     * <p>
     * You must free the iterator with g_object_unref() when you are done.
     */
    public MenuLinkIter iterateItemLinks(int itemIndex) {
        try {
            var RESULT = (MemoryAddress) g_menu_model_iterate_item_links.invokeExact(handle(), itemIndex);
            return new MenuLinkIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ItemsChangedHandler {
        void signalReceived(MenuModel source, int position, int removed, int added);
    }
    
    /**
     * Emitted when a change has occurred to the menu.
     * <p>
     * The only changes that can occur to a menu is that items are removed
     * or added.  Items may not change (except by being removed and added
     * back in the same location).  This signal is capable of describing
     * both of those changes (at the same time).
     * <p>
     * The signal means that starting at the index {@code position}, {@code removed}
     * items were removed and {@code added} items were added in their place.  If
     * {@code removed} is zero then only items were added.  If {@code added} is zero
     * then only items were removed.
     * <p>
     * As an example, if the menu contains items a, b, c, d (in that
     * order) and the signal (2, 1, 3) occurs then the new composition of
     * the menu will be a, b, _, _, _, d (with each _ representing some
     * new item).
     * <p>
     * Signal handlers may query the model (particularly the added items)
     * and expect to see the results of the modification that is being
     * reported.  The signal is emitted after the modification.
     */
    public SignalHandle onItemsChanged(ItemsChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("items-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MenuModel.Callbacks.class, "signalMenuModelItemsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalMenuModelItemsChanged(MemoryAddress source, int position, int removed, int added, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MenuModel.ItemsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MenuModel(Refcounted.get(source)), position, removed, added);
        }
        
    }
}