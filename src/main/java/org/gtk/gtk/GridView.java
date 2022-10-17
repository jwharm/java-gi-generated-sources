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
 * 
 * <h1>CSS nodes</h1>
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
 * 
 * <h1>Accessibility</h1>
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
    
    private static final MethodHandle gtk_grid_view_new = Interop.downcallHandle(
        "gtk_grid_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable SelectionModel model, @Nullable ListItemFactory factory) {
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
    public GridView(@Nullable SelectionModel model, @Nullable ListItemFactory factory) {
        super(constructNew(model, factory));
    }
    
    private static final MethodHandle gtk_grid_view_get_enable_rubberband = Interop.downcallHandle(
        "gtk_grid_view_get_enable_rubberband",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        int RESULT;
        try {
            RESULT = (int) gtk_grid_view_get_enable_rubberband.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_grid_view_get_factory = Interop.downcallHandle(
        "gtk_grid_view_get_factory",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the factory that's currently used to populate list items.
     */
    public @Nullable ListItemFactory getFactory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_grid_view_get_factory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ListItemFactory(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_grid_view_get_max_columns = Interop.downcallHandle(
        "gtk_grid_view_get_max_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum number of columns that the grid will use.
     */
    public int getMaxColumns() {
        int RESULT;
        try {
            RESULT = (int) gtk_grid_view_get_max_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_grid_view_get_min_columns = Interop.downcallHandle(
        "gtk_grid_view_get_min_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the minimum number of columns that the grid will use.
     */
    public int getMinColumns() {
        int RESULT;
        try {
            RESULT = (int) gtk_grid_view_get_min_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_grid_view_get_model = Interop.downcallHandle(
        "gtk_grid_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public @Nullable SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_grid_view_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_grid_view_get_single_click_activate = Interop.downcallHandle(
        "gtk_grid_view_get_single_click_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether items will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        int RESULT;
        try {
            RESULT = (int) gtk_grid_view_get_single_click_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_grid_view_set_enable_rubberband = Interop.downcallHandle(
        "gtk_grid_view_set_enable_rubberband",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public @NotNull void setEnableRubberband(@NotNull boolean enableRubberband) {
        try {
            gtk_grid_view_set_enable_rubberband.invokeExact(handle(), enableRubberband ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_grid_view_set_factory = Interop.downcallHandle(
        "gtk_grid_view_set_factory",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkListItemFactory} to use for populating list items.
     */
    public @NotNull void setFactory(@Nullable ListItemFactory factory) {
        try {
            gtk_grid_view_set_factory.invokeExact(handle(), factory.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_grid_view_set_max_columns = Interop.downcallHandle(
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
    public @NotNull void setMaxColumns(@NotNull int maxColumns) {
        try {
            gtk_grid_view_set_max_columns.invokeExact(handle(), maxColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_grid_view_set_min_columns = Interop.downcallHandle(
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
    public @NotNull void setMinColumns(@NotNull int minColumns) {
        try {
            gtk_grid_view_set_min_columns.invokeExact(handle(), minColumns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_grid_view_set_model = Interop.downcallHandle(
        "gtk_grid_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the imodel to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel}.
     */
    public @NotNull void setModel(@Nullable SelectionModel model) {
        try {
            gtk_grid_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_grid_view_set_single_click_activate = Interop.downcallHandle(
        "gtk_grid_view_set_single_click_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether items should be activated on single click and
     * selected on hover.
     */
    public @NotNull void setSingleClickActivate(@NotNull boolean singleClickActivate) {
        try {
            gtk_grid_view_set_single_click_activate.invokeExact(handle(), singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(GridView source, @NotNull int position);
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
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GridView.Callbacks.class, "signalGridViewActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
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
