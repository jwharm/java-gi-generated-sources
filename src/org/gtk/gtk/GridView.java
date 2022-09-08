package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGridView` presents a large dynamic grid of items.
 * 
 * `GtkGridView` uses its factory to generate one child widget for each
 * visible item and shows them in a grid. The orientation of the grid view
 * determines if the grid reflows vertically or horizontally.
 * 
 * `GtkGridView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * [property@Gtk.GridView:enable-rubberband].
 * 
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 * 
 * # CSS nodes
 * 
 * ```
 * gridview
 * ├── child[.activatable]
 * │
 * ├── child[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * ```
 * 
 * `GtkGridView` uses a single CSS node with name `gridview`. Each child uses
 * a single CSS node with name `child`. If the [property@Gtk.ListItem:activatable]
 * property is set, the corresponding row will have the `.activatable` style
 * class. For rubberband selection, a subnode with name `rubberband` is used.
 * 
 * # Accessibility
 * 
 * `GtkGridView` uses the %GTK_ACCESSIBLE_ROLE_GRID role, and the items
 * use the %GTK_ACCESSIBLE_ROLE_GRID_CELL role.
 */
public class GridView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public GridView(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridView */
    public static GridView castFrom(org.gtk.gobject.Object gobject) {
        return new GridView(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkGridView` that uses the given @factory for
     * mapping items to widgets.
     * 
     * The function takes ownership of the
     * arguments, so you can write code like
     * ```c
     * grid_view = gtk_grid_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * ```
     */
    public GridView(SelectionModel model, ListItemFactory factory) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_new(model.getReference().unowned().HANDLE(), factory.getReference().unowned().HANDLE()), false));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_enable_rubberband(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_factory(HANDLE());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of columns that the grid will use.
     */
    public int getMaxColumns() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_max_columns(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the minimum number of columns that the grid will use.
     */
    public int getMinColumns() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_min_columns(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_model(HANDLE());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_get_single_click_activate(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_enable_rubberband(HANDLE(), enableRubberband ? 1 : 0);
    }
    
    /**
     * Sets the `GtkListItemFactory` to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_factory(HANDLE(), factory.HANDLE());
    }
    
    /**
     * Sets the maximum number of columns to use.
     * 
     * This number must be at least 1.
     * 
     * If @max_columns is smaller than the minimum set via
     * [method@Gtk.GridView.set_min_columns], that value is used instead.
     */
    public void setMaxColumns(int maxColumns) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_max_columns(HANDLE(), maxColumns);
    }
    
    /**
     * Sets the minimum number of columns to use.
     * 
     * This number must be at least 1.
     * 
     * If @min_columns is smaller than the minimum set via
     * [method@Gtk.GridView.set_max_columns], that value is ignored.
     */
    public void setMinColumns(int minColumns) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_min_columns(HANDLE(), minColumns);
    }
    
    /**
     * Sets the imodel to use.
     * 
     * This must be a [iface@Gtk.SelectionModel].
     */
    public void setModel(SelectionModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_view_set_single_click_activate(HANDLE(), singleClickActivate ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(GridView source, int position);
    }
    
    /**
     * Emitted when a cell has been activated by the user,
     * usually via activating the GtkGridView|list.activate-item action.
     * 
     * This allows for a convenient way to handle activation in a gridview.
     * See [property@Gtk.ListItem:activatable] for details on how to use
     * this signal.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGridViewActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
