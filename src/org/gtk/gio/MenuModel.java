package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.MenuModel} represents the contents of a menu -- an ordered list of
 * menu items. The items are associated with actions, which can be
 * activated through them. Items can be grouped in sections, and may
 * have submenus associated with them. Both items and sections usually
 * have some representation data, such as labels or icons. The type of
 * the associated action (ie whether it is stateful, and what kind of
 * state it has) can influence the representation of the item.
 * 
 * The conceptual model of menus in {@link org.gtk.gio.MenuModel} is hierarchical:
 * sections and submenus are again represented by <code>#GMenuModels</code> 
 * Menus themselves do not define their own roles. Rather, the role
 * of a particular {@link org.gtk.gio.MenuModel} is defined by the item that references
 * it (or, in the case of the &<code>#39</code> root&<code>#39</code>  menu, is defined by the context
 * in which it is used).
 * 
 * As an example, consider the visible portions of this menu:
 * 
 * <code>#</code>  An example menu <code>#</code> {<code>#menu</code> example}
 * 
 * !{@link []}(menu-example.png)
 * 
 * There are 8 &<code>#34</code> menus&<code>#34</code>  visible in the screenshot: one menubar, two
 * submenus and 5 sections:
 * 
 * - the toplevel menubar (containing 4 items)
 * - the View submenu (containing 3 sections)
 * - the first section of the View submenu (containing 2 items)
 * - the second section of the View submenu (containing 1 item)
 * - the final section of the View submenu (containing 1 item)
 * - the Highlight Mode submenu (containing 2 sections)
 * - the Sources section (containing 2 items)
 * - the Markup section (containing 2 items)
 * 
 * The {@link [example]}{@link [menu-model]} illustrates the conceptual connection between
 * these 8 menus. Each large block in the figure represents a menu and the
 * smaller blocks within the large block represent items in that menu. Some
 * items contain references to other menus.
 * 
 * <code>#</code>  A menu example <code>#</code> {<code>#menu</code> model}
 * 
 * !{@link []}(menu-model.png)
 * 
 * Notice that the separators visible in the {@link [example]}{@link [menu-example]}
 * appear nowhere in the {@link [menu model]}{@link [menu-model]}. This is because
 * separators are not explicitly represented in the menu model. Instead,
 * a separator is inserted between any two non-empty sections of a menu.
 * Section items can have labels just like any other item. In that case,
 * a display system may show a section header instead of a separator.
 * 
 * The motivation for this abstract model of application controls is
 * that modern user interfaces tend to make these controls available
 * outside the application. Examples include global menus, jumplists,
 * dash boards, etc. To support such uses, it is necessary to &<code>#39</code> export&<code>#39</code> 
 * information about actions and their representation in menus, which
 * is exactly what the {@link [GActionGroup exporter]}{@link [gio-GActionGroup-exporter]}
 * and the {@link [GMenuModel exporter]}{@link [gio-GMenuModel-exporter]} do for
 * {@link org.gtk.gio.ActionGroup} and {@link org.gtk.gio.MenuModel}  The client-side counterparts to
 * make use of the exported information are {@link org.gtk.gio.DBusActionGroup} and
 * {@link org.gtk.gio.DBusMenuModel} 
 * 
 * The API of {@link org.gtk.gio.MenuModel} is very generic, with iterators for the
 * attributes and links of an item, see g_menu_model_iterate_item_attributes()
 * and g_menu_model_iterate_item_links(). The &<code>#39</code> standard&<code>#39</code>  attributes and
 * link types have predefined names: <code>G_MENU_ATTRIBUTE_LABEL</code> 
 * <code>G_MENU_ATTRIBUTE_ACTION</code>  <code>G_MENU_ATTRIBUTE_TARGET</code>  <code>G_MENU_LINK_SECTION</code> and <code>G_MENU_LINK_SUBMENU</code> 
 * 
 * Items in a {@link org.gtk.gio.MenuModel} represent active controls if they refer to
 * an action that can get activated when the user interacts with the
 * menu item. The reference to the action is encoded by the string id
 * in the <code>G_MENU_ATTRIBUTE_ACTION</code> attribute. An action id uniquely
 * identifies an action in an action group. Which action group(s) provide
 * actions depends on the context in which the menu model is used.
 * E.g. when the model is exported as the application menu of a
 * {@link org.gtk.gtk.Application}  actions can be application-wide or window-specific
 * (and thus come from two different action groups). By convention, the
 * application-wide actions have names that start with &<code>#34</code> app.&<code>#34</code> , while the
 * names of window-specific actions start with &<code>#34</code> win.&<code>#34</code> .
 * 
 * While a wide variety of stateful actions is possible, the following
 * is the minimum that is expected to be supported by all users of exported
 * menu information:
 * - an action with no parameter type and no state
 * - an action with no parameter type and boolean state
 * - an action with string parameter type and string state
 * 
 * <code>#</code>  Stateless
 * 
 * A stateless action typically corresponds to an ordinary menu item.
 * 
 * Selecting such a menu item will activate the action (with no parameter).
 * 
 * <code>#</code>  Boolean State
 * 
 * An action with a boolean state will most typically be used with a &<code>#34</code> toggle&<code>#34</code> 
 * or &<code>#34</code> switch&<code>#34</code>  menu item. The state can be set directly, but activating the
 * action (with no parameter) results in the state being toggled.
 * 
 * Selecting a toggle menu item will activate the action. The menu item should
 * be rendered as &<code>#34</code> checked&<code>#34</code>  when the state is true.
 * 
 * <code>#</code>  String Parameter and State
 * 
 * Actions with string parameters and state will most typically be used to
 * represent an enumerated choice over the items available for a group of
 * radio menu items. Activating the action with a string parameter is
 * equivalent to setting that parameter as the state.
 * 
 * Radio menu items, in addition to being associated with the action, will
 * have a target value. Selecting that menu item will result in activation
 * of the action with the target value as the parameter. The menu item should
 * be rendered as &<code>#34</code> selected&<code>#34</code>  when the state of the action is equal to the
 * target value of the menu item.
 */
public class MenuModel extends org.gtk.gobject.Object {

    public MenuModel(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MenuModel */
    public static MenuModel castFrom(org.gtk.gobject.Object gobject) {
        return new MenuModel(gobject.getReference());
    }
    
    /**
     * Queries the item at position @item_index in @model for the attribute
     * specified by @attribute.
     * 
     * If @expected_type is non-<code>null</code> then it specifies the expected type of
     * the attribute.  If it is <code>null</code> then any type will be accepted.
     * 
     * If the attribute exists and matches @expected_type (or if the
     * expected type is unspecified) then the value is returned.
     * 
     * If the attribute does not exist, or does not match the expected type
     * then <code>null</code> is returned.
     */
    public org.gtk.glib.Variant getItemAttributeValue(int itemIndex, java.lang.String attribute, org.gtk.glib.VariantType expectedType) {
        var RESULT = gtk_h.g_menu_model_get_item_attribute_value(handle(), itemIndex, Interop.allocateNativeString(attribute).handle(), expectedType.handle());
        return new org.gtk.glib.Variant(References.get(RESULT, true));
    }
    
    /**
     * Queries the item at position @item_index in @model for the link
     * specified by @link.
     * 
     * If the link exists, the linked {@link org.gtk.gio.MenuModel} is returned.  If the link
     * does not exist, <code>null</code> is returned.
     */
    public MenuModel getItemLink(int itemIndex, java.lang.String link) {
        var RESULT = gtk_h.g_menu_model_get_item_link(handle(), itemIndex, Interop.allocateNativeString(link).handle());
        return new MenuModel(References.get(RESULT, true));
    }
    
    /**
     * Query the number of items in @model.
     */
    public int getNItems() {
        var RESULT = gtk_h.g_menu_model_get_n_items(handle());
        return RESULT;
    }
    
    /**
     * Queries if @model is mutable.
     * 
     * An immutable {@link org.gtk.gio.MenuModel} will never emit the {@link org.gtk.gio.MenuModel} :items-changed
     * signal. Consumers of the model may make optimisations accordingly.
     */
    public boolean isMutable() {
        var RESULT = gtk_h.g_menu_model_is_mutable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Requests emission of the {@link org.gtk.gio.MenuModel} :items-changed signal on @model.
     * 
     * This function should never be called except by {@link org.gtk.gio.MenuModel} subclasses.  Any other calls to this function will very likely lead
     * to a violation of the interface of the model.
     * 
     * The implementation should update its internal representation of the
     * menu before emitting the signal.  The implementation should further
     * expect to receive queries about the new state of the menu (and
     * particularly added menu items) while signal handlers are running.
     * 
     * The implementation must dispatch this call directly from a mainloop
     * entry and not in response to calls -- particularly those from the
     * {@link org.gtk.gio.MenuModel} API.  Said another way: the menu must not change while
     * user code is running without returning to the mainloop.
     */
    public void itemsChanged(int position, int removed, int added) {
        gtk_h.g_menu_model_items_changed(handle(), position, removed, added);
    }
    
    /**
     * Creates a {@link org.gtk.gio.MenuAttributeIter} to iterate over the attributes of
     * the item at position @item_index in @model.
     * 
     * You must free the iterator with g_object_unref() when you are done.
     */
    public MenuAttributeIter iterateItemAttributes(int itemIndex) {
        var RESULT = gtk_h.g_menu_model_iterate_item_attributes(handle(), itemIndex);
        return new MenuAttributeIter(References.get(RESULT, true));
    }
    
    /**
     * Creates a {@link org.gtk.gio.MenuLinkIter} to iterate over the links of the item at
     * position @item_index in @model.
     * 
     * You must free the iterator with g_object_unref() when you are done.
     */
    public MenuLinkIter iterateItemLinks(int itemIndex) {
        var RESULT = gtk_h.g_menu_model_iterate_item_links(handle(), itemIndex);
        return new MenuLinkIter(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface ItemsChangedHandler {
        void signalReceived(MenuModel source, int position, int removed, int added);
    }
    
    /**
     * Emitted when a change has occurred to the menu.
     * 
     * The only changes that can occur to a menu is that items are removed
     * or added.  Items may not change (except by being removed and added
     * back in the same location).  This signal is capable of describing
     * both of those changes (at the same time).
     * 
     * The signal means that starting at the index @position, @removed
     * items were removed and @added items were added in their place.  If
     * @removed is zero then only items were added.  If @added is zero
     * then only items were removed.
     * 
     * As an example, if the menu contains items a, b, c, d (in that
     * order) and the signal (2, 1, 3) occurs then the new composition of
     * the menu will be a, b, _, _, _, d (with each _ representing some
     * new item).
     * 
     * Signal handlers may query the model (particularly the added items)
     * and expect to see the results of the modification that is being
     * reported.  The signal is emitted after the modification.
     */
    public SignalHandle onItemsChanged(ItemsChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMenuModelItemsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("items-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
