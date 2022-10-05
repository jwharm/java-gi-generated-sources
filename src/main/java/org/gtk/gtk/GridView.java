package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGridView} presents a large dynamic grid of items.
 * <p>
 * {@code GtkGridView} uses its factory to generate one child widget for each
 * visible item and shows them in a grid. The orientation of the grid view
 * determines if the grid reflows vertically or horizontally.
 * <p>
 * {@code GtkGridView} allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on _rubberband selection_, using
 * {@code Gtk.GridView:enable-rubberband}.
 * <p>
 * To learn more about the list widget framework, see the
 * <a href="section-list-widget.html">overview</a>.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * gridview
 * ├── child[.activatable]
 * │
 * ├── child[.activatable]
 * │
 * ┊
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkGridView} uses a single CSS node with name {@code gridview}. Each child uses
 * a single CSS node with name {@code child}. If the {@code Gtk.ListItem:activatable}
 * property is set, the corresponding row will have the {@code .activatable} style
 * class. For rubberband selection, a subnode with name {@code rubberband} is used.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkGridView} uses the {@link AccessibleRole#GRID} role, and the items
 * use the {@link AccessibleRole#GRID_CELL} role.
 */
public class GridView extends ListBase implements Accessible, Buildable, ConstraintTarget, Orientable, Scrollable {

    public GridView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GridView */
    public static GridView castFrom(org.gtk.gobject.Object gobject) {
        return new GridView(gobject.refcounted());
    }
    
    static final MethodHandle gtk_grid_view_new = Interop.downcallHandle(
        "gtk_grid_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(SelectionModel model, ListItemFactory factory) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_grid_view_new.invokeExact(model.refcounted().unowned().handle(), factory.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkGridView} that uses the given {@code factory} for
     * mapping items to widgets.
     * <p>
     * The function takes ownership of the
     * arguments, so you can write code like
     * <pre>{@code c
     * grid_view = gtk_grid_view_new (create_model (),
     *   gtk_builder_list_item_factory_new_from_resource ("/resource.ui"));
     * }</pre>
     */
    public GridView(SelectionModel model, ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    static final MethodHandle gtk_grid_view_get_enable_rubberband = Interop.downcallHandle(
        "gtk_grid_view_get_enable_rubberband",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        try {
            var RESULT = (int) gtk_grid_view_get_enable_rubberband.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_get_factory = Interop.downcallHandle(
        "gtk_grid_view_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public ListItemFactory getFactory() {
        try {
            var RESULT = (MemoryAddress) gtk_grid_view_get_factory.invokeExact(handle());
            return new ListItemFactory(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_get_max_columns = Interop.downcallHandle(
        "gtk_grid_view_get_max_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum number of columns that the grid will use.
     */
    public int getMaxColumns() {
        try {
            var RESULT = (int) gtk_grid_view_get_max_columns.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_get_min_columns = Interop.downcallHandle(
        "gtk_grid_view_get_min_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the minimum number of columns that the grid will use.
     */
    public int getMinColumns() {
        try {
            var RESULT = (int) gtk_grid_view_get_min_columns.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_get_model = Interop.downcallHandle(
        "gtk_grid_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_grid_view_get_model.invokeExact(handle());
            return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_get_single_click_activate = Interop.downcallHandle(
        "gtk_grid_view_get_single_click_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        try {
            var RESULT = (int) gtk_grid_view_get_single_click_activate.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_enable_rubberband = Interop.downcallHandle(
        "gtk_grid_view_set_enable_rubberband",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        try {
            gtk_grid_view_set_enable_rubberband.invokeExact(handle(), enableRubberband ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_factory = Interop.downcallHandle(
        "gtk_grid_view_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public void setFactory(ListItemFactory factory) {
        try {
            gtk_grid_view_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_max_columns = Interop.downcallHandle(
        "gtk_grid_view_set_max_columns",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code max_columns} is smaller than the minimum set via
     * {@link GridView#setMinColumns}, that value is used instead.
     */
    public void setMaxColumns(int maxColumns) {
        try {
            gtk_grid_view_set_max_columns.invokeExact(handle(), maxColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_min_columns = Interop.downcallHandle(
        "gtk_grid_view_set_min_columns",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the minimum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code min_columns} is smaller than the minimum set via
     * {@link GridView#setMaxColumns}, that value is ignored.
     */
    public void setMinColumns(int minColumns) {
        try {
            gtk_grid_view_set_min_columns.invokeExact(handle(), minColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_model = Interop.downcallHandle(
        "gtk_grid_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the imodel to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel}.
     */
    public void setModel(SelectionModel model) {
        try {
            gtk_grid_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_view_set_single_click_activate = Interop.downcallHandle(
        "gtk_grid_view_set_single_click_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        try {
            gtk_grid_view_set_single_click_activate.invokeExact(handle(), singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(GridView source, int position);
    }
    
    /**
     * Emitted when a cell has been activated by the user,
     * usually via activating the GtkGridView|list.activate-item action.
     * <p>
     * This allows for a convenient way to handle activation in a gridview.
     * See {@code Gtk.ListItem:activatable} for details on how to use
     * this signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GridView.Callbacks.class, "signalGridViewActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGridViewActivate(MemoryAddress source, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GridView.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GridView(Refcounted.get(source)), position);
        }
        
    }
}
