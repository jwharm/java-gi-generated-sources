package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkColumnView` presents a large dynamic list of items using multiple columns
 * with headers.
 * 
 * `GtkColumnView` uses the factories of its columns to generate a cell widget for
 * each column, for each visible item and displays them together as the row for
 * this item.
 * 
 * The [property@Gtk.ColumnView:show-row-separators] and
 * [property@Gtk.ColumnView:show-column-separators] properties offer a simple way
 * to display separators between the rows or columns.
 * 
 * `GtkColumnView` allows the user to select items according to the selection
 * characteristics of the model. For models that allow multiple selected items,
 * it is possible to turn on *rubberband selection*, using
 * [property@Gtk.ColumnView:enable-rubberband].
 * 
 * The column view supports sorting that can be customized by the user by
 * clicking on column headers. To set this up, the `GtkSorter` returned by
 * [method@Gtk.ColumnView.get_sorter] must be attached to a sort model for the
 * data that the view is showing, and the columns must have sorters attached to
 * them by calling [method@Gtk.ColumnViewColumn.set_sorter]. The initial sort
 * order can be set with [method@Gtk.ColumnView.sort_by_column].
 * 
 * The column view also supports interactive resizing and reordering of
 * columns, via Drag-and-Drop of the column headers. This can be enabled or
 * disabled with the [property@Gtk.ColumnView:reorderable] and
 * [property@Gtk.ColumnViewColumn:resizable] properties.
 * 
 * To learn more about the list widget framework, see the
 * [overview](section-list-widget.html).
 * 
 * # CSS nodes
 * 
 * ```
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
 * ```
 * 
 * `GtkColumnView` uses a single CSS node named columnview. It may carry the
 * .column-separators style class, when [property@Gtk.ColumnView:show-column-separators]
 * property is set. Header widgets appear below a node with name header.
 * The rows are contained in a `GtkListView` widget, so there is a listview
 * node with the same structure as for a standalone `GtkListView` widget.
 * If [property@Gtk.ColumnView:show-row-separators] is set, it will be passed
 * on to the list view, causing its CSS node to carry the .separators style class.
 * For rubberband selection, a node with name rubberband is used.
 * 
 * The main columnview node may also carry style classes to select
 * the style of [list presentation](section-list-widget.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 * 
 * # Accessibility
 * 
 * `GtkColumnView` uses the %GTK_ACCESSIBLE_ROLE_TREE_GRID role, header title
 * widgets are using the %GTK_ACCESSIBLE_ROLE_COLUMN_HEADER role. The row widgets
 * are using the %GTK_ACCESSIBLE_ROLE_ROW role, and individual cells are using
 * the %GTK_ACCESSIBLE_ROLE_GRID_CELL role
 */
public class ColumnView extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public ColumnView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColumnView */
    public static ColumnView castFrom(org.gtk.gobject.Object gobject) {
        return new ColumnView(gobject.getReference());
    }
    
    private static Reference constructNew(SelectionModel model) {
        Reference RESULT = References.get(gtk_h.gtk_column_view_new(model.getReference().unowned().handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new `GtkColumnView`.
     * 
     * You most likely want to call [method@Gtk.ColumnView.append_column]
     * to add columns next.
     */
    public ColumnView(SelectionModel model) {
        super(constructNew(model));
    }
    
    /**
     * Appends the @column to the end of the columns in @self.
     */
    public void appendColumn(ColumnViewColumn column) {
        gtk_h.gtk_column_view_append_column(handle(), column.handle());
    }
    
    /**
     * Gets the list of columns in this column view.
     * 
     * This list is constant over the lifetime of @self and can be used to
     * monitor changes to the columns of @self by connecting to the
     * ::items-changed signal.
     */
    public org.gtk.gio.ListModel getColumns() {
        var RESULT = gtk_h.gtk_column_view_get_columns(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether rows can be selected by dragging with the mouse.
     */
    public boolean getEnableRubberband() {
        var RESULT = gtk_h.gtk_column_view_get_enable_rubberband(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the model that's currently used to read the items displayed.
     */
    public SelectionModel getModel() {
        var RESULT = gtk_h.gtk_column_view_get_model(handle());
        return new SelectionModel.SelectionModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns whether columns are reorderable.
     */
    public boolean getReorderable() {
        var RESULT = gtk_h.gtk_column_view_get_reorderable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the list should show separators
     * between columns.
     */
    public boolean getShowColumnSeparators() {
        var RESULT = gtk_h.gtk_column_view_get_show_column_separators(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the list should show separators
     * between rows.
     */
    public boolean getShowRowSeparators() {
        var RESULT = gtk_h.gtk_column_view_get_show_row_separators(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether rows will be activated on single click and
     * selected on hover.
     */
    public boolean getSingleClickActivate() {
        var RESULT = gtk_h.gtk_column_view_get_single_click_activate(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns a special sorter that reflects the users sorting
     * choices in the column view.
     * 
     * To allow users to customizable sorting by clicking on column
     * headers, this sorter needs to be set on the sort model underneath
     * the model that is displayed by the view.
     * 
     * See [method@Gtk.ColumnViewColumn.set_sorter] for setting up
     * per-column sorting.
     * 
     * Here is an example:
     * ```c
     * gtk_column_view_column_set_sorter (column, sorter);
     * gtk_column_view_append_column (view, column);
     * sorter = g_object_ref (gtk_column_view_get_sorter (view)));
     * model = gtk_sort_list_model_new (store, sorter);
     * selection = gtk_no_selection_new (model);
     * gtk_column_view_set_model (view, selection);
     * ```
     */
    public Sorter getSorter() {
        var RESULT = gtk_h.gtk_column_view_get_sorter(handle());
        return new Sorter(References.get(RESULT, false));
    }
    
    /**
     * Inserts a column at the given position in the columns of @self.
     * 
     * If @column is already a column of @self, it will be repositioned.
     */
    public void insertColumn(int position, ColumnViewColumn column) {
        gtk_h.gtk_column_view_insert_column(handle(), position, column.handle());
    }
    
    /**
     * Removes the @column from the list of columns of @self.
     */
    public void removeColumn(ColumnViewColumn column) {
        gtk_h.gtk_column_view_remove_column(handle(), column.handle());
    }
    
    /**
     * Sets whether selections can be changed by dragging with the mouse.
     */
    public void setEnableRubberband(boolean enableRubberband) {
        gtk_h.gtk_column_view_set_enable_rubberband(handle(), enableRubberband ? 1 : 0);
    }
    
    /**
     * Sets the model to use.
     * 
     * This must be a [iface@Gtk.SelectionModel].
     */
    public void setModel(SelectionModel model) {
        gtk_h.gtk_column_view_set_model(handle(), model.handle());
    }
    
    /**
     * Sets whether columns should be reorderable by dragging.
     */
    public void setReorderable(boolean reorderable) {
        gtk_h.gtk_column_view_set_reorderable(handle(), reorderable ? 1 : 0);
    }
    
    /**
     * Sets whether the list should show separators
     * between columns.
     */
    public void setShowColumnSeparators(boolean showColumnSeparators) {
        gtk_h.gtk_column_view_set_show_column_separators(handle(), showColumnSeparators ? 1 : 0);
    }
    
    /**
     * Sets whether the list should show separators
     * between rows.
     */
    public void setShowRowSeparators(boolean showRowSeparators) {
        gtk_h.gtk_column_view_set_show_row_separators(handle(), showRowSeparators ? 1 : 0);
    }
    
    /**
     * Sets whether rows should be activated on single click and
     * selected on hover.
     */
    public void setSingleClickActivate(boolean singleClickActivate) {
        gtk_h.gtk_column_view_set_single_click_activate(handle(), singleClickActivate ? 1 : 0);
    }
    
    /**
     * Sets the sorting of the view.
     * 
     * This function should be used to set up the initial sorting.
     * At runtime, users can change the sorting of a column view
     * by clicking on the list headers.
     * 
     * This call only has an effect if the sorter returned by
     * [method@Gtk.ColumnView.get_sorter] is set on a sort model,
     * and [method@Gtk.ColumnViewColumn.set_sorter] has been called
     * on @column to associate a sorter with the column.
     * 
     * If @column is %NULL, the view will be unsorted.
     */
    public void sortByColumn(ColumnViewColumn column, SortType direction) {
        gtk_h.gtk_column_view_sort_by_column(handle(), column.handle(), direction.getValue());
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(ColumnView source, int position);
    }
    
    /**
     * Emitted when a row has been activated by the user, usually via activating
     * the GtkListBase|list.activate-item action.
     * 
     * This allows for a convenient way to handle activation in a columnview.
     * See [method@Gtk.ListItem.set_activatable] for details on how to use this
     * signal.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalColumnViewActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
