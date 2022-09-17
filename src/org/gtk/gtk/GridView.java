package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGridView</code> presents a large dynamic grid of items.
 * <p><code>GtkGridView</code> uses its factory to generate one child widget for each
 * visible item and shows them in a grid. The orientation of the grid view
 * determines if the grid reflows vertically or horizontally.
 * <p><code>GtkGridView</code> allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * {@link [property@Gtk.GridView:enable-rubberband] (ref=property)}.
 * <p>
 * To learn more about the list widget framework, see the
 * {@link [overview]}(section-list-widget.html).
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * gridview
 * &#9500;&#9472;&#9472; child{@link [.activatable]}
 * &#9474;
 * &#9500;&#9472;&#9472; child{@link [.activatable]}
 * &#9474;
 * &#9482;
 * &#9584;&#9472;&#9472; {@link [rubberband]}
 * </pre>
 * <p><code>GtkGridView</code> uses a single CSS node with name <code>gridview</code>. Each child uses
 * a single CSS node with name <code>child</code>. If the {@link [property@Gtk.ListItem:activatable] (ref=property)}
 * property is set, the corresponding row will have the <code>.activatable</code> style
 * class. For rubberband selection, a subnode with name <code>rubberband</code> is used.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkGridView</code> uses the {@link org.gtk.gtk.AccessibleRole#GRID} role, and the items
 * use the {@link org.gtk.gtk.AccessibleRole#GRID_CELL} role.
 */
public class GridView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public GridView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridView */
    public static GridView castFrom(org.gtk.gobject.Object gobject) {
        return new GridView(gobject.getReference());
    }
    
    private static Reference constructNew(SelectionModel model, ListItemFactory factory) {
        Reference RESULT = References.get(gtk_h.gtk_grid_view_new(model.getReference().unowned().handle(), factory.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkGridView</code> that uses the given @factory for
     * mapping items to widgets.
     * <p>
     * The function takes ownership of the
     * arguments, so you can write code like<pre>c
     * grid_view = gtk_grid_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource (&#34;/resource.ui&#34;));
     * </pre>
     */
    public GridView(SelectionModel model, ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        var RESULT = gtk_h.gtk_grid_view_get_enable_rubberband(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the factory that&#39;s currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        var RESULT = gtk_h.gtk_grid_view_get_factory(handle());
        return new ListItemFactory(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of columns that the grid will use.
     */
    public int getMaxColumns() {
        var RESULT = gtk_h.gtk_grid_view_get_max_columns(handle());
        return RESULT;
    }
    
    /**
     * Gets the minimum number of columns that the grid will use.
     */
    public int getMinColumns() {
        var RESULT = gtk_h.gtk_grid_view_get_min_columns(handle());
        return RESULT;
    }
    
    /**
     * Gets the model that&#39;s currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        var RESULT = gtk_h.gtk_grid_view_get_model(handle());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        var RESULT = gtk_h.gtk_grid_view_get_single_click_activate(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        gtk_h.gtk_grid_view_set_enable_rubberband(handle(), enableRubberband ? 1 : 0);
    }
    
    /**
     * Sets the <code>GtkListItemFactory</code> to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        gtk_h.gtk_grid_view_set_factory(handle(), factory.handle());
    }
    
    /**
     * Sets the maximum number of columns to use.
     * 
     * This number must be at least 1.
     * 
     * If @max_columns is smaller than the minimum set via
     * {@link org.gtk.gtk.GridView#setMinColumns}, that value is used instead.
     */
    public void setMaxColumns(int maxColumns) {
        gtk_h.gtk_grid_view_set_max_columns(handle(), maxColumns);
    }
    
    /**
     * Sets the minimum number of columns to use.
     * 
     * This number must be at least 1.
     * 
     * If @min_columns is smaller than the minimum set via
     * {@link org.gtk.gtk.GridView#setMaxColumns}, that value is ignored.
     */
    public void setMinColumns(int minColumns) {
        gtk_h.gtk_grid_view_set_min_columns(handle(), minColumns);
    }
    
    /**
     * Sets the imodel to use.
     * 
     * This must be a {@link [iface@Gtk.SelectionModel] (ref=iface)}.
     */
    public void setModel(SelectionModel model) {
        gtk_h.gtk_grid_view_set_model(handle(), model.handle());
    }
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        gtk_h.gtk_grid_view_set_single_click_activate(handle(), singleClickActivate ? 1 : 0);
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
     * See {@link [property@Gtk.ListItem:activatable] (ref=property)} for details on how to use
     * this signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGridViewActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
