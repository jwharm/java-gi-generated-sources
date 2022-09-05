package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDropDown` is a widget that allows the user to choose an item
 * from a list of options.
 * 
 * ![An example GtkDropDown](drop-down.png)
 * 
 * The `GtkDropDown` displays the selected choice.
 * 
 * The options are given to `GtkDropDown` in the form of `GListModel`
 * and how the individual options are represented is determined by
 * a [class@Gtk.ListItemFactory]. The default factory displays simple strings.
 * 
 * `GtkDropDown` knows how to obtain strings from the items in a
 * [class@Gtk.StringList]; for other models, you have to provide an expression
 * to find the strings via [method@Gtk.DropDown.set_expression].
 * 
 * `GtkDropDown` can optionally allow search in the popup, which is
 * useful if the list of options is long. To enable the search entry,
 * use [method@Gtk.DropDown.set_enable_search].
 * 
 * # CSS nodes
 * 
 * `GtkDropDown` has a single CSS node with name dropdown,
 * with the button and popover nodes as children.
 * 
 * # Accessibility
 * 
 * `GtkDropDown` uses the %GTK_ACCESSIBLE_ROLE_COMBO_BOX role.
 */
public class DropDown extends Widget implements Accessible, Buildable, ConstraintTarget {

    public DropDown(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DropDown */
    public static DropDown castFrom(org.gtk.gobject.Object gobject) {
        return new DropDown(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkDropDown`.
     * 
     * You may want to call [method@Gtk.DropDown.set_factory]
     * to set up a way to map its items to widgets.
     */
    public DropDown(org.gtk.gio.ListModel model, Expression expression) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_new(model.getProxy().unowned().HANDLE(), expression.getProxy().unowned().HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkDropDown` that is populated with
     * the strings.
     */
    public DropDown(java.lang.String[] strings) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_new_from_strings(Interop.allocateNativeArray(strings)), false));
    }
    
    /**
     * Returns whether search is enabled.
     */
    public boolean getEnableSearch() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_enable_search(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the expression set that is used to obtain strings from items.
     * 
     * See [method@Gtk.DropDown.set_expression].
     */
    public Expression getExpression() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_expression(HANDLE());
        return new Expression(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * 
     * The factory returned by this function is always used for the
     * item in the button. It is also used for items in the popup
     * if [property@Gtk.DropDown:list-factory] is not set.
     */
    public ListItemFactory getFactory() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_factory(HANDLE());
        return new ListItemFactory(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     */
    public ListItemFactory getListFactory() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_list_factory(HANDLE());
        return new ListItemFactory(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the model that provides the displayed items.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_model(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     */
    public int getSelected() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_selected(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the selected item. If no item is selected, %NULL is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_selected_item(HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns whether to show an arrow within the widget.
     */
    public boolean getShowArrow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_get_show_arrow(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether a search entry will be shown in the popup that
     * allows to search for items in the list.
     * 
     * Note that [property@Gtk.DropDown:expression] must be set for
     * search to work.
     */
    public void setEnableSearch(boolean enableSearch) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_enable_search(HANDLE(), enableSearch ? 1 : 0);
    }
    
    /**
     * Sets the expression that gets evaluated to obtain strings from items.
     * 
     * This is used for search in the popup. The expression must have
     * a value type of %G_TYPE_STRING.
     */
    public void setExpression(Expression expression) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_expression(HANDLE(), expression.HANDLE());
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_factory(HANDLE(), factory.HANDLE());
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items in the popup.
     */
    public void setListFactory(ListItemFactory factory) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_list_factory(HANDLE(), factory.HANDLE());
    }
    
    /**
     * Sets the `GListModel` to use.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Selects the item at the given position.
     */
    public void setSelected(int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_selected(HANDLE(), position);
    }
    
    /**
     * Sets whether an arrow will be displayed within the widget.
     */
    public void setShowArrow(boolean showArrow) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drop_down_set_show_arrow(HANDLE(), showArrow ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(DropDown source);
    }
    
    /**
     * Emitted to when the drop down is activated.
     * 
     * The `::activate` signal on `GtkDropDown` is an action signal and
     * emitting it causes the drop down to pop up its dropdown.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropDownActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
