package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkColumnView} presents a large dynamic list of items using multiple columns
 * with headers.
 * <p>
 * {@code GtkColumnView} uses the factories of its columns to generate a cell widget for
 * each column, for each visible item and displays them together as the row for
 * this item.
 * <p>
 * The {@code Gtk.ColumnView:show-row-separators} and
 * {@code Gtk.ColumnView:show-column-separators} properties offer a simple way
 * to display separators between the rows or columns.
 * <p>
 * {@code GtkColumnView} allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on <strong>rubberband selection</strong>, using
 * {@code Gtk.ColumnView:enable-rubberband}.
 * <p>
 * The column view supports sorting that can be customized by the user by
 * clicking on column headers. To set this up, the {@code GtkSorter} returned by
 * {@link ColumnView#getSorter} must be attached to a sort model for the
 * data that the view is showing, and the columns must have sorters attached to
 * them by calling {@link ColumnViewColumn#setSorter}. The initial sort
 * order can be set with {@link ColumnView#sortByColumn}.
 * <p>
 * The column view also supports interactive resizing and reordering of
 * columns, via Drag-and-Drop of the column headers. This can be enabled or
 * disabled with the {@code Gtk.ColumnView:reorderable} and
 * {@code Gtk.ColumnViewColumn:resizable} properties.
 * <p>
 * To learn more about the list widget framework, see the
 * <a href="section-list-widget.html">overview</a>.
 * 
 * <h1>CSS nodes</h1>
 * <pre>{@code 
 * columnview[.column-separators][.rich-list][.navigation-sidebar][.data-table]
 * ├── header
 * │   ├── <column header>
 * ┊   ┊
 * │   ╰── <column header>
 * │
 * ├── listview
 * │
 * ┊
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkColumnView} uses a single CSS node named columnview. It may carry the
 * .column-separators style class, when {@code Gtk.ColumnView:show-column-separators}
 * property is set. Header widgets appear below a node with name header.
 * The rows are contained in a {@code GtkListView} widget, so there is a listview
 * node with the same structure as for a standalone {@code GtkListView} widget.
 * If {@code Gtk.ColumnView:show-row-separators} is set, it will be passed
 * on to the list view, causing its CSS node to carry the .separators style class.
 * For rubberband selection, a node with name rubberband is used.
 * <p>
 * The main columnview node may also carry style classes to select
 * the style of <a href="section-list-widget.html#list-styles">list presentation</a>:
 * .rich-list, .navigation-sidebar or .data-table.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkColumnView} uses the {@link AccessibleRole#TREE_GRID} role, header title
 * widgets are using the {@link AccessibleRole#COLUMN_HEADER} role. The row widgets
 * are using the {@link AccessibleRole#ROW} role, and individual cells are using
 * the {@link AccessibleRole#GRID_CELL} role
 */
public class ColumnView extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public ColumnView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColumnView */
    public static ColumnView castFrom(org.gtk.gobject.Object gobject) {
        return new ColumnView(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_column_view_new = Interop.downcallHandle(
        "gtk_column_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable SelectionModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_column_view_new.invokeExact(model.refcounted().unowned().handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkColumnView}.
     * <p>
     * You most likely want to call {@link ColumnView#appendColumn}
     * to add columns next.
     */
    public ColumnView(@Nullable SelectionModel model) {
        super(constructNew(model));
    }
    
    private static final MethodHandle gtk_column_view_append_column = Interop.downcallHandle(
        "gtk_column_view_append_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends the {@code column} to the end of the columns in {@code self}.
     */
    public @NotNull void appendColumn(@NotNull ColumnViewColumn column) {
        try {
            gtk_column_view_append_column.invokeExact(handle(), column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_get_columns = Interop.downcallHandle(
        "gtk_column_view_get_columns",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list of columns in this column view.
     * <p>
     * This list is constant over the lifetime of {@code self} and can be used to
     * monitor changes to the columns of {@code self} by connecting to the
     * ::items-changed signal.
     */
    public @NotNull org.gtk.gio.ListModel getColumns() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_get_columns.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_get_enable_rubberband = Interop.downcallHandle(
        "gtk_column_view_get_enable_rubberband",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_get_enable_rubberband.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_get_model = Interop.downcallHandle(
        "gtk_column_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public @Nullable SelectionModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_get_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_get_reorderable = Interop.downcallHandle(
        "gtk_column_view_get_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether columns are reorderable.
     */
    public boolean getReorderable() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_get_reorderable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_get_show_column_separators = Interop.downcallHandle(
        "gtk_column_view_get_show_column_separators",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the list should show separators
     * between columns.
     */
    public boolean getShowColumnSeparators() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_get_show_column_separators.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_get_show_row_separators = Interop.downcallHandle(
        "gtk_column_view_get_show_row_separators",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the list should show separators
     * between rows.
     */
    public boolean getShowRowSeparators() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_get_show_row_separators.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_get_single_click_activate = Interop.downcallHandle(
        "gtk_column_view_get_single_click_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        int RESULT;
        try {
            RESULT = (int) gtk_column_view_get_single_click_activate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_column_view_get_sorter = Interop.downcallHandle(
        "gtk_column_view_get_sorter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a special sorter that reflects the users sorting
     * choices in the column view.
     * <p>
     * To allow users to customizable sorting by clicking on column
     * headers, this sorter needs to be set on the sort model underneath
     * the model that is displayed by the view.
     * <p>
     * See {@link ColumnViewColumn#setSorter} for setting up
     * per-column sorting.
     * <p>
     * Here is an example:
     * <pre>{@code c
     * gtk_column_view_column_set_sorter (column, sorter);
     * gtk_column_view_append_column (view, column);
     * sorter = g_object_ref (gtk_column_view_get_sorter (view)));
     * model = gtk_sort_list_model_new (store, sorter);
     * selection = gtk_no_selection_new (model);
     * gtk_column_view_set_model (view, selection);
     * }</pre>
     */
    public @Nullable Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_column_view_get_sorter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sorter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_column_view_insert_column = Interop.downcallHandle(
        "gtk_column_view_insert_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a column at the given position in the columns of {@code self}.
     * <p>
     * If {@code column} is already a column of {@code self}, it will be repositioned.
     */
    public @NotNull void insertColumn(@NotNull int position, @NotNull ColumnViewColumn column) {
        try {
            gtk_column_view_insert_column.invokeExact(handle(), position, column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_remove_column = Interop.downcallHandle(
        "gtk_column_view_remove_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the {@code column} from the list of columns of {@code self}.
     */
    public @NotNull void removeColumn(@NotNull ColumnViewColumn column) {
        try {
            gtk_column_view_remove_column.invokeExact(handle(), column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_enable_rubberband = Interop.downcallHandle(
        "gtk_column_view_set_enable_rubberband",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public @NotNull void setEnableRubberband(@NotNull boolean enableRubberband) {
        try {
            gtk_column_view_set_enable_rubberband.invokeExact(handle(), enableRubberband ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_model = Interop.downcallHandle(
        "gtk_column_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model to use.
     * <p>
     * This must be a {@code Gtk.SelectionModel}.
     */
    public @NotNull void setModel(@Nullable SelectionModel model) {
        try {
            gtk_column_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_reorderable = Interop.downcallHandle(
        "gtk_column_view_set_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether columns should be reorderable by dragging.
     */
    public @NotNull void setReorderable(@NotNull boolean reorderable) {
        try {
            gtk_column_view_set_reorderable.invokeExact(handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_show_column_separators = Interop.downcallHandle(
        "gtk_column_view_set_show_column_separators",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the list should show separators
     * between columns.
     */
    public @NotNull void setShowColumnSeparators(@NotNull boolean showColumnSeparators) {
        try {
            gtk_column_view_set_show_column_separators.invokeExact(handle(), showColumnSeparators ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_show_row_separators = Interop.downcallHandle(
        "gtk_column_view_set_show_row_separators",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the list should show separators
     * between rows.
     */
    public @NotNull void setShowRowSeparators(@NotNull boolean showRowSeparators) {
        try {
            gtk_column_view_set_show_row_separators.invokeExact(handle(), showRowSeparators ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_set_single_click_activate = Interop.downcallHandle(
        "gtk_column_view_set_single_click_activate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     */
    public @NotNull void setSingleClickActivate(@NotNull boolean singleClickActivate) {
        try {
            gtk_column_view_set_single_click_activate.invokeExact(handle(), singleClickActivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_column_view_sort_by_column = Interop.downcallHandle(
        "gtk_column_view_sort_by_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the sorting of the view.
     * <p>
     * This function should be used to set up the initial sorting.
     * At runtime, users can change the sorting of a column view
     * by clicking on the list headers.
     * <p>
     * This call only has an effect if the sorter returned by
     * {@link ColumnView#getSorter} is set on a sort model,
     * and {@link ColumnViewColumn#setSorter} has been called
     * on {@code column} to associate a sorter with the column.
     * <p>
     * If {@code column} is {@code null}, the view will be unsorted.
     */
    public @NotNull void sortByColumn(@Nullable ColumnViewColumn column, @NotNull SortType direction) {
        try {
            gtk_column_view_sort_by_column.invokeExact(handle(), column.handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ColumnView source, @NotNull int position);
    }
    
    /**
     * Emitted when a row has been activated by the user, usually via activating
     * the GtkListBase|list.activate-item action.
     * <p>
     * This allows for a convenient way to handle activation in a columnview.
     * See {@link ListItem#setActivatable} for details on how to use this
     * signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColumnView.Callbacks.class, "signalColumnViewActivate",
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
    
        public static void signalColumnViewActivate(MemoryAddress source, int position, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ColumnView.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ColumnView(Refcounted.get(source)), position);
        }
        
    }
}
