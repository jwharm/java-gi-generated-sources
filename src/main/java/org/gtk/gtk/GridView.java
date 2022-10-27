package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkGridView} uses the {@link AccessibleRole#GRID} role, and the items
 * use the {@link AccessibleRole#GRID_CELL} role.
 */
public class GridView extends org.gtk.gtk.ListBase implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GridView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GridView */
    public static GridView castFrom(org.gtk.gobject.Object gobject) {
        return new GridView(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(factory, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_grid_view_new.invokeExact(model.refcounted().unowned().handle(), factory.refcounted().unowned().handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param model the model to use
     * @param factory The factory to populate items with
     */
    public GridView(@Nullable org.gtk.gtk.SelectionModel model, @Nullable org.gtk.gtk.ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     * @return {@code true} if rubberband selection is enabled
     */
    public boolean getEnableRubberband() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_enable_rubberband.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the factory that's currently used to populate list items.
     * @return The factory in use
     */
    public @Nullable org.gtk.gtk.ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_view_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of columns that the grid will use.
     * @return The maximum number of columns
     */
    public int getMaxColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_max_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the minimum number of columns that the grid will use.
     * @return The minimum number of columns
     */
    public int getMinColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_min_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     * @return The model in use
     */
    public @Nullable org.gtk.gtk.SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_view_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     * @return {@code true} if items are activated on single click
     */
    public boolean getSingleClickActivate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_view_get_single_click_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     * @param enableRubberband {@code true} to enable rubberband selection
     */
    public void setEnableRubberband(boolean enableRubberband) {
        try {
            DowncallHandles.gtk_grid_view_set_enable_rubberband.invokeExact(handle(), enableRubberband ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     * @param factory the factory to use
     */
    public void setFactory(@Nullable org.gtk.gtk.ListItemFactory factory) {
        java.util.Objects.requireNonNullElse(factory, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_grid_view_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code max_columns} is smaller than the minimum set via
     * {@link GridView#setMinColumns}, that value is used instead.
     * @param maxColumns The maximum number of columns
     */
    public void setMaxColumns(int maxColumns) {
        try {
            DowncallHandles.gtk_grid_view_set_max_columns.invokeExact(handle(), maxColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum number of columns to use.
     * <p>
     * This number must be at least 1.
     * <p>
     * If {@code min_columns} is smaller than the minimum set via
     * {@link GridView#setMaxColumns}, that value is ignored.
     * @param minColumns The minimum number of columns
     */
    public void setMinColumns(int minColumns) {
        try {
            DowncallHandles.gtk_grid_view_set_min_columns.invokeExact(handle(), minColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the imodel to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel}.
     * @param model the model to use
     */
    public void setModel(@Nullable org.gtk.gtk.SelectionModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_grid_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     * @param singleClickActivate {@code true} to activate items on single click
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        try {
            DowncallHandles.gtk_grid_view_set_single_click_activate.invokeExact(handle(), singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
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
    public Signal<GridView.Activate> onActivate(GridView.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GridView.Callbacks.class, "signalGridViewActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GridView.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_view_new = Interop.downcallHandle(
            "gtk_grid_view_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_enable_rubberband = Interop.downcallHandle(
            "gtk_grid_view_get_enable_rubberband",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_factory = Interop.downcallHandle(
            "gtk_grid_view_get_factory",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_max_columns = Interop.downcallHandle(
            "gtk_grid_view_get_max_columns",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_min_columns = Interop.downcallHandle(
            "gtk_grid_view_get_min_columns",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_model = Interop.downcallHandle(
            "gtk_grid_view_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_get_single_click_activate = Interop.downcallHandle(
            "gtk_grid_view_get_single_click_activate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_set_enable_rubberband = Interop.downcallHandle(
            "gtk_grid_view_set_enable_rubberband",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_view_set_factory = Interop.downcallHandle(
            "gtk_grid_view_set_factory",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_set_max_columns = Interop.downcallHandle(
            "gtk_grid_view_set_max_columns",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_view_set_min_columns = Interop.downcallHandle(
            "gtk_grid_view_set_min_columns",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_view_set_model = Interop.downcallHandle(
            "gtk_grid_view_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_view_set_single_click_activate = Interop.downcallHandle(
            "gtk_grid_view_set_single_click_activate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalGridViewActivate(MemoryAddress source, int position, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (GridView.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GridView(Refcounted.get(source)), position);
        }
    }
}
