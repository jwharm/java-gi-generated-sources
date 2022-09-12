package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
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

    public DropDown(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DropDown */
    public static DropDown castFrom(org.gtk.gobject.Object gobject) {
        return new DropDown(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gio.ListModel model, Expression expression) {
        Reference RESULT = References.get(gtk_h.gtk_drop_down_new(model.getReference().unowned().handle(), expression.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkDropDown`.
     * 
     * You may want to call [method@Gtk.DropDown.set_factory]
     * to set up a way to map its items to widgets.
     */
    public DropDown(org.gtk.gio.ListModel model, Expression expression) {
        super(constructNew(model, expression));
    }
    
    private static Reference constructNewFromStrings(java.lang.String[] strings) {
        Reference RESULT = References.get(gtk_h.gtk_drop_down_new_from_strings(Interop.allocateNativeArray(strings).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkDropDown` that is populated with
     * the strings.
     */
    public static DropDown newFromStrings(java.lang.String[] strings) {
        return new DropDown(constructNewFromStrings(strings));
    }
    
    /**
     * Returns whether search is enabled.
     */
    public boolean getEnableSearch() {
        var RESULT = gtk_h.gtk_drop_down_get_enable_search(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the expression set that is used to obtain strings from items.
     * 
     * See [method@Gtk.DropDown.set_expression].
     */
    public Expression getExpression() {
        var RESULT = gtk_h.gtk_drop_down_get_expression(handle());
        return new Expression(References.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * 
     * The factory returned by this function is always used for the
     * item in the button. It is also used for items in the popup
     * if [property@Gtk.DropDown:list-factory] is not set.
     */
    public ListItemFactory getFactory() {
        var RESULT = gtk_h.gtk_drop_down_get_factory(handle());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the factory that's currently used to populate list items in the popup.
     */
    public ListItemFactory getListFactory() {
        var RESULT = gtk_h.gtk_drop_down_get_list_factory(handle());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the model that provides the displayed items.
     */
    public org.gtk.gio.ListModel getModel() {
        var RESULT = gtk_h.gtk_drop_down_get_model(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the position of the selected item.
     */
    public int getSelected() {
        var RESULT = gtk_h.gtk_drop_down_get_selected(handle());
        return RESULT;
    }
    
    /**
     * Gets the selected item. If no item is selected, %NULL is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        var RESULT = gtk_h.gtk_drop_down_get_selected_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Returns whether to show an arrow within the widget.
     */
    public boolean getShowArrow() {
        var RESULT = gtk_h.gtk_drop_down_get_show_arrow(handle());
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
        gtk_h.gtk_drop_down_set_enable_search(handle(), enableSearch ? 1 : 0);
    }
    
    /**
     * Sets the expression that gets evaluated to obtain strings from items.
     * 
     * This is used for search in the popup. The expression must have
     * a value type of %G_TYPE_STRING.
     */
    public void setExpression(Expression expression) {
        gtk_h.gtk_drop_down_set_expression(handle(), expression.handle());
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        gtk_h.gtk_drop_down_set_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items in the popup.
     */
    public void setListFactory(ListItemFactory factory) {
        gtk_h.gtk_drop_down_set_list_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the `GListModel` to use.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        gtk_h.gtk_drop_down_set_model(handle(), model.handle());
    }
    
    /**
     * Selects the item at the given position.
     */
    public void setSelected(int position) {
        gtk_h.gtk_drop_down_set_selected(handle(), position);
    }
    
    /**
     * Sets whether an arrow will be displayed within the widget.
     */
    public void setShowArrow(boolean showArrow) {
        gtk_h.gtk_drop_down_set_show_arrow(handle(), showArrow ? 1 : 0);
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
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDropDownActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
