package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkListBox} is a vertical list.
 * <p>
 * A {@code GtkListBox} only contains {@code GtkListBoxRow} children. These rows can
 * by dynamically sorted and filtered, and headers can be added dynamically
 * depending on the row content. It also allows keyboard and mouse navigation
 * and selection like a typical list.
 * <p>
 * Using {@code GtkListBox} is often an alternative to {@code GtkTreeView}, especially
 * when the list contents has a more complicated layout than what is allowed
 * by a {@code GtkCellRenderer}, or when the contents is interactive (i.e. has a
 * button in it).
 * <p>
 * Although a {@code GtkListBox} must have only {@code GtkListBoxRow} children, you can
 * add any kind of widget to it via {@link ListBox#prepend},
 * {@link ListBox#append} and {@link ListBox#insert} and a
 * {@code GtkListBoxRow} widget will automatically be inserted between the list
 * and the widget.
 * <p>
 * {@code GtkListBoxRows} can be marked as activatable or selectable. If a row is
 * activatable, {@code Gtk.ListBox::row-activated} will be emitted for it when
 * the user tries to activate it. If it is selectable, the row will be marked
 * as selected when the user tries to select it.
 * <p>
 * <strong>GtkListBox as GtkBuildable</strong><br/>
 * The {@code GtkListBox} implementation of the {@code GtkBuildable} interface supports
 * setting a child as the placeholder by specifying “placeholder” as the “type”
 * attribute of a &lt;child&gt; element. See {@link ListBox#setPlaceholder}
 * for info.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code <!-- language="plain" -->
 * list[.separators][.rich-list][.navigation-sidebar]
 * ╰── row[.activatable]
 * }</pre>
 * <p>
 * {@code GtkListBox} uses a single CSS node named list. It may carry the .separators
 * style class, when the {@code Gtk.ListBox:show-separators} property is set.
 * Each {@code GtkListBoxRow} uses a single CSS node named row. The row nodes get the
 * .activatable style class added when appropriate.
 * <p>
 * The main list node may also carry style classes to select
 * the style of <a href="section-list-widget.html#list-styles">list presentation</a>:
 * .rich-list, .navigation-sidebar or .data-table.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkListBox} uses the {@link AccessibleRole#LIST} role and {@code GtkListBoxRow} uses
 * the {@link AccessibleRole#LIST_ITEM} role.
 */
public class ListBox extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListBox";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ListBox proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ListBox(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListBox> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ListBox(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkListBox} container.
     */
    public ListBox() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Append a widget to the list.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * @param child the {@code GtkWidget} to add
     */
    public void append(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_list_box_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Binds {@code model} to {@code box}.
     * <p>
     * If {@code box} was already bound to a model, that previous binding is
     * destroyed.
     * <p>
     * The contents of {@code box} are cleared and then filled with widgets that
     * represent items from {@code model}. {@code box} is updated whenever {@code model} changes.
     * If {@code model} is {@code null}, {@code box} is left empty.
     * <p>
     * It is undefined to add or remove widgets directly (for example, with
     * {@link ListBox#insert}) while {@code box} is bound to a model.
     * <p>
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in {@code GtkListBox}. When using a model, filtering and sorting
     * should be implemented by the model.
     * @param model the {@code GListModel} to be bound to {@code box}
     * @param createWidgetFunc a function that creates widgets for items
     *   or {@code null} in case you also passed {@code null} as {@code model}
     * @param userDataFreeFunc function for freeing {@code user_data}
     */
    public void bindModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.ListBoxCreateWidgetFunc createWidgetFunc, org.gtk.glib.DestroyNotify userDataFreeFunc) {
        try {
            DowncallHandles.gtk_list_box_bind_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (createWidgetFunc == null ? MemoryAddress.NULL : (Addressable) createWidgetFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDataFreeFunc.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add a drag highlight to a row.
     * <p>
     * This is a helper function for implementing DnD onto a {@code GtkListBox}.
     * The passed in {@code row} will be highlighted by setting the
     * {@link StateFlags#DROP_ACTIVE} state and any previously highlighted
     * row will be unhighlighted.
     * <p>
     * The row will also be unhighlighted when the widget gets
     * a drag leave event.
     * @param row a {@code GtkListBoxRow}
     */
    public void dragHighlightRow(org.gtk.gtk.ListBoxRow row) {
        try {
            DowncallHandles.gtk_list_box_drag_highlight_row.invokeExact(
                    handle(),
                    row.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public void dragUnhighlightRow() {
        try {
            DowncallHandles.gtk_list_box_drag_unhighlight_row.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether rows activate on single clicks.
     * @return {@code true} if rows are activated on single click, {@code false} otherwise
     */
    public boolean getActivateOnSingleClick() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_get_activate_on_single_click.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     * @return the adjustment
     */
    public @Nullable org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_adjustment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Adjustment) Interop.register(RESULT, org.gtk.gtk.Adjustment.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the n-th child in the list (not counting headers).
     * <p>
     * If {@code index_} is negative or larger than the number of items in the
     * list, {@code null} is returned.
     * @param index the index of the row
     * @return the child {@code GtkWidget}
     */
    public @Nullable org.gtk.gtk.ListBoxRow getRowAtIndex(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_row_at_index.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListBoxRow) Interop.register(RESULT, org.gtk.gtk.ListBoxRow.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the row at the {@code y} position.
     * @param y position
     * @return the row
     */
    public @Nullable org.gtk.gtk.ListBoxRow getRowAtY(int y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_row_at_y.invokeExact(
                    handle(),
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListBoxRow) Interop.register(RESULT, org.gtk.gtk.ListBoxRow.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the selected row, or {@code null} if no rows are selected.
     * <p>
     * Note that the box may allow multiple selection, in which
     * case you should use {@link ListBox#selectedForeach} to
     * find all selected rows.
     * @return the selected row
     */
    public @Nullable org.gtk.gtk.ListBoxRow getSelectedRow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_selected_row.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ListBoxRow) Interop.register(RESULT, org.gtk.gtk.ListBoxRow.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Creates a list of all selected children.
     * @return A {@code GList} containing the {@code GtkWidget} for each selected child.
     *   Free with g_list_free() when done.
     */
    public org.gtk.glib.List getSelectedRows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_selected_rows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the selection mode of the listbox.
     * @return a {@code GtkSelectionMode}
     */
    public org.gtk.gtk.SelectionMode getSelectionMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_get_selection_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SelectionMode.of(RESULT);
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     * @return {@code true} if the list box shows separators
     */
    public boolean getShowSeparators() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_get_show_separators.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Insert the {@code child} into the {@code box} at {@code position}.
     * <p>
     * If a sort function is
     * set, the widget will actually be inserted at the calculated position.
     * <p>
     * If {@code position} is -1, or larger than the total number of items in the
     * {@code box}, then the {@code child} will be appended to the end.
     * @param child the {@code GtkWidget} to add
     * @param position the position to insert {@code child} in
     */
    public void insert(org.gtk.gtk.Widget child, int position) {
        try {
            DowncallHandles.gtk_list_box_insert.invokeExact(
                    handle(),
                    child.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update the filtering for all rows.
     * <p>
     * Call this when result
     * of the filter function on the {@code box} is changed due
     * to an external factor. For instance, this would be used
     * if the filter function just looked for a specific search
     * string and the entry with the search string has changed.
     */
    public void invalidateFilter() {
        try {
            DowncallHandles.gtk_list_box_invalidate_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update the separators for all rows.
     * <p>
     * Call this when result
     * of the header function on the {@code box} is changed due
     * to an external factor.
     */
    public void invalidateHeaders() {
        try {
            DowncallHandles.gtk_list_box_invalidate_headers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Update the sorting for all rows.
     * <p>
     * Call this when result
     * of the sort function on the {@code box} is changed due
     * to an external factor.
     */
    public void invalidateSort() {
        try {
            DowncallHandles.gtk_list_box_invalidate_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepend a widget to the list.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * @param child the {@code GtkWidget} to add
     */
    public void prepend(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_list_box_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child from {@code box}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_list_box_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Select all children of {@code box}, if the selection mode allows it.
     */
    public void selectAll() {
        try {
            DowncallHandles.gtk_list_box_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Make {@code row} the currently selected row.
     * @param row The row to select
     */
    public void selectRow(@Nullable org.gtk.gtk.ListBoxRow row) {
        try {
            DowncallHandles.gtk_list_box_select_row.invokeExact(
                    handle(),
                    (Addressable) (row == null ? MemoryAddress.NULL : row.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function for each selected child.
     * <p>
     * Note that the selection cannot be modified from within this function.
     * @param func the function to call for each selected child
     */
    public void selectedForeach(org.gtk.gtk.ListBoxForeachFunc func) {
        try {
            DowncallHandles.gtk_list_box_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code single} is {@code true}, rows will be activated when you click on them,
     * otherwise you need to double-click.
     * @param single a boolean
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            DowncallHandles.gtk_list_box_set_activate_on_single_click.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(single, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     * <p>
     * For instance, this is used to get the page size for
     * PageUp/Down key handling.
     * <p>
     * In the normal case when the {@code box} is packed inside
     * a {@code GtkScrolledWindow} the adjustment from that will
     * be picked up automatically, so there is no need
     * to manually do that.
     * @param adjustment the adjustment
     */
    public void setAdjustment(@Nullable org.gtk.gtk.Adjustment adjustment) {
        try {
            DowncallHandles.gtk_list_box_set_adjustment.invokeExact(
                    handle(),
                    (Addressable) (adjustment == null ? MemoryAddress.NULL : adjustment.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * By setting a filter function on the {@code box} one can decide dynamically which
     * of the rows to show.
     * <p>
     * For instance, to implement a search function on a list that
     * filters the original list to only show the matching rows.
     * <p>
     * The {@code filter_func} will be called for each row after the call, and
     * it will continue to be called each time a row changes (via
     * {@link ListBoxRow#changed}) or when {@link ListBox#invalidateFilter}
     * is called.
     * <p>
     * Note that using a filter function is incompatible with using a model
     * (see {@link ListBox#bindModel}).
     * @param filterFunc callback that lets you filter which rows to show
     * @param destroy destroy notifier for {@code user_data}
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.ListBoxFilterFunc filterFunc, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_list_box_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : (Addressable) filterFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a header function.
     * <p>
     * By setting a header function on the {@code box} one can dynamically add headers
     * in front of rows, depending on the contents of the row and its position
     * in the list.
     * <p>
     * For instance, one could use it to add headers in front of the first item
     * of a new kind, in a list sorted by the kind.
     * <p>
     * The {@code update_header} can look at the current header widget using
     * {@link ListBoxRow#getHeader} and either update the state of the widget
     * as needed, or set a new one using {@link ListBoxRow#setHeader}. If no
     * header is needed, set the header to {@code null}.
     * <p>
     * Note that you may get many calls {@code update_header} to this for a particular
     * row when e.g. changing things that don’t affect the header. In this case
     * it is important for performance to not blindly replace an existing header
     * with an identical one.
     * <p>
     * The {@code update_header} function will be called for each row after the call,
     * and it will continue to be called each time a row changes (via
     * {@link ListBoxRow#changed}) and when the row before changes (either
     * by {@link ListBoxRow#changed} on the previous row, or when the previous
     * row becomes a different row). It is also called for all rows when
     * {@link ListBox#invalidateHeaders} is called.
     * @param updateHeader callback that lets you add row headers
     * @param destroy destroy notifier for {@code user_data}
     */
    public void setHeaderFunc(@Nullable org.gtk.gtk.ListBoxUpdateHeaderFunc updateHeader, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_list_box_set_header_func.invokeExact(
                    handle(),
                    (Addressable) (updateHeader == null ? MemoryAddress.NULL : (Addressable) updateHeader.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn't display any visible children.
     * @param placeholder a {@code GtkWidget}
     */
    public void setPlaceholder(@Nullable org.gtk.gtk.Widget placeholder) {
        try {
            DowncallHandles.gtk_list_box_set_placeholder.invokeExact(
                    handle(),
                    (Addressable) (placeholder == null ? MemoryAddress.NULL : placeholder.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how selection works in the listbox.
     * @param mode The {@code GtkSelectionMode}
     */
    public void setSelectionMode(org.gtk.gtk.SelectionMode mode) {
        try {
            DowncallHandles.gtk_list_box_set_selection_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     * @param showSeparators {@code true} to show separators
     */
    public void setShowSeparators(boolean showSeparators) {
        try {
            DowncallHandles.gtk_list_box_set_show_separators.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showSeparators, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a sort function.
     * <p>
     * By setting a sort function on the {@code box} one can dynamically reorder
     * the rows of the list, based on the contents of the rows.
     * <p>
     * The {@code sort_func} will be called for each row after the call, and will
     * continue to be called each time a row changes (via
     * {@link ListBoxRow#changed}) and when {@link ListBox#invalidateSort}
     * is called.
     * <p>
     * Note that using a sort function is incompatible with using a model
     * (see {@link ListBox#bindModel}).
     * @param sortFunc the sort function
     * @param destroy destroy notifier for {@code user_data}
     */
    public void setSortFunc(@Nullable org.gtk.gtk.ListBoxSortFunc sortFunc, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_list_box_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) sortFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselect all children of {@code box}, if the selection mode allows it.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_list_box_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects a single row of {@code box}, if the selection mode allows it.
     * @param row the row to unselected
     */
    public void unselectRow(org.gtk.gtk.ListBoxRow row) {
        try {
            DowncallHandles.gtk_list_box_unselect_row.invokeExact(
                    handle(),
                    row.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_list_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCursorRow} callback.
     */
    @FunctionalInterface
    public interface ActivateCursorRow {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCursorRow.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<ListBox.ActivateCursorRow> onActivateCursorRow(ListBox.ActivateCursorRow handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate-cursor-row", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursor} callback.
     */
    @FunctionalInterface
    public interface MoveCursor {
    
        void run(org.gtk.gtk.MovementStep object, int p0, boolean p1, boolean p2);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox, int object, int p0, int p1, int p2) {
            run(org.gtk.gtk.MovementStep.of(object), p0, Marshal.integerToBoolean.marshal(p1, null).booleanValue(), Marshal.integerToBoolean.marshal(p2, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<ListBox.MoveCursor> onMoveCursor(ListBox.MoveCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowActivated} callback.
     */
    @FunctionalInterface
    public interface RowActivated {
    
        /**
         * Emitted when a row has been activated by the user.
         */
        void run(org.gtk.gtk.ListBoxRow row);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox, MemoryAddress row) {
            run((org.gtk.gtk.ListBoxRow) Interop.register(row, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a row has been activated by the user.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.RowActivated> onRowActivated(ListBox.RowActivated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("row-activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowSelected} callback.
     */
    @FunctionalInterface
    public interface RowSelected {
    
        /**
         * Emitted when a new row is selected, or (with a {@code null} {@code row})
         * when the selection is cleared.
         * <p>
         * When the {@code box} is using {@link SelectionMode#MULTIPLE}, this signal will not
         * give you the full picture of selection changes, and you should use
         * the {@code Gtk.ListBox::selected-rows-changed} signal instead.
         */
        void run(@Nullable org.gtk.gtk.ListBoxRow row);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox, MemoryAddress row) {
            run((org.gtk.gtk.ListBoxRow) Interop.register(row, org.gtk.gtk.ListBoxRow.fromAddress).marshal(row, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowSelected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when a new row is selected, or (with a {@code null} {@code row})
     * when the selection is cleared.
     * <p>
     * When the {@code box} is using {@link SelectionMode#MULTIPLE}, this signal will not
     * give you the full picture of selection changes, and you should use
     * the {@code Gtk.ListBox::selected-rows-changed} signal instead.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.RowSelected> onRowSelected(ListBox.RowSelected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("row-selected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectAll} callback.
     */
    @FunctionalInterface
    public interface SelectAll {
    
        /**
         * Emitted to select all children of the box, if the selection
         * mode permits it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectAll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to select all children of the box, if the selection
     * mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.SelectAll> onSelectAll(ListBox.SelectAll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-all", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectedRowsChanged} callback.
     */
    @FunctionalInterface
    public interface SelectedRowsChanged {
    
        /**
         * Emitted when the set of selected rows changes.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectedRowsChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the set of selected rows changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.SelectedRowsChanged> onSelectedRowsChanged(ListBox.SelectedRowsChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("selected-rows-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleCursorRow} callback.
     */
    @FunctionalInterface
    public interface ToggleCursorRow {
    
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleCursorRow.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<ListBox.ToggleCursorRow> onToggleCursorRow(ListBox.ToggleCursorRow handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-cursor-row", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnselectAll} callback.
     */
    @FunctionalInterface
    public interface UnselectAll {
    
        /**
         * Emitted to unselect all children of the box, if the selection
         * mode permits it.
         * <p>
         * This is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceListBox) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnselectAll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted to unselect all children of the box, if the selection
     * mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.UnselectAll> onUnselectAll(ListBox.UnselectAll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unselect-all", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link ListBox.Builder} object constructs a {@link ListBox} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ListBox.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ListBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListBox}.
         * @return A new instance of {@code ListBox} with the properties 
         *         that were set in the Builder object.
         */
        public ListBox build() {
            return (ListBox) org.gtk.gobject.GObject.newWithProperties(
                ListBox.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to accept unpaired release events.
         * @param acceptUnpairedRelease The value for the {@code accept-unpaired-release} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptUnpairedRelease(boolean acceptUnpairedRelease) {
            names.add("accept-unpaired-release");
            values.add(org.gtk.gobject.Value.create(acceptUnpairedRelease));
            return this;
        }
        
        /**
         * Determines whether children can be activated with a single
         * click, or require a double-click.
         * @param activateOnSingleClick The value for the {@code activate-on-single-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivateOnSingleClick(boolean activateOnSingleClick) {
            names.add("activate-on-single-click");
            values.add(org.gtk.gobject.Value.create(activateOnSingleClick));
            return this;
        }
        
        /**
         * The selection mode used by the list box.
         * @param selectionMode The value for the {@code selection-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectionMode(org.gtk.gtk.SelectionMode selectionMode) {
            names.add("selection-mode");
            values.add(org.gtk.gobject.Value.create(selectionMode));
            return this;
        }
        
        /**
         * Whether to show separators between rows.
         * @param showSeparators The value for the {@code show-separators} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowSeparators(boolean showSeparators) {
            names.add("show-separators");
            values.add(org.gtk.gobject.Value.create(showSeparators));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_box_new = Interop.downcallHandle(
                "gtk_list_box_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_append = Interop.downcallHandle(
                "gtk_list_box_append",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_bind_model = Interop.downcallHandle(
                "gtk_list_box_bind_model",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_drag_highlight_row = Interop.downcallHandle(
                "gtk_list_box_drag_highlight_row",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_drag_unhighlight_row = Interop.downcallHandle(
                "gtk_list_box_drag_unhighlight_row",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_activate_on_single_click = Interop.downcallHandle(
                "gtk_list_box_get_activate_on_single_click",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_adjustment = Interop.downcallHandle(
                "gtk_list_box_get_adjustment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_row_at_index = Interop.downcallHandle(
                "gtk_list_box_get_row_at_index",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_row_at_y = Interop.downcallHandle(
                "gtk_list_box_get_row_at_y",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_selected_row = Interop.downcallHandle(
                "gtk_list_box_get_selected_row",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_selected_rows = Interop.downcallHandle(
                "gtk_list_box_get_selected_rows",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_selection_mode = Interop.downcallHandle(
                "gtk_list_box_get_selection_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_show_separators = Interop.downcallHandle(
                "gtk_list_box_get_show_separators",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_insert = Interop.downcallHandle(
                "gtk_list_box_insert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_invalidate_filter = Interop.downcallHandle(
                "gtk_list_box_invalidate_filter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_invalidate_headers = Interop.downcallHandle(
                "gtk_list_box_invalidate_headers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_invalidate_sort = Interop.downcallHandle(
                "gtk_list_box_invalidate_sort",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_prepend = Interop.downcallHandle(
                "gtk_list_box_prepend",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_remove = Interop.downcallHandle(
                "gtk_list_box_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_select_all = Interop.downcallHandle(
                "gtk_list_box_select_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_select_row = Interop.downcallHandle(
                "gtk_list_box_select_row",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_selected_foreach = Interop.downcallHandle(
                "gtk_list_box_selected_foreach",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_activate_on_single_click = Interop.downcallHandle(
                "gtk_list_box_set_activate_on_single_click",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_adjustment = Interop.downcallHandle(
                "gtk_list_box_set_adjustment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_filter_func = Interop.downcallHandle(
                "gtk_list_box_set_filter_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_header_func = Interop.downcallHandle(
                "gtk_list_box_set_header_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_placeholder = Interop.downcallHandle(
                "gtk_list_box_set_placeholder",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_selection_mode = Interop.downcallHandle(
                "gtk_list_box_set_selection_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_show_separators = Interop.downcallHandle(
                "gtk_list_box_set_show_separators",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_box_set_sort_func = Interop.downcallHandle(
                "gtk_list_box_set_sort_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_unselect_all = Interop.downcallHandle(
                "gtk_list_box_unselect_all",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_unselect_row = Interop.downcallHandle(
                "gtk_list_box_unselect_row",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_box_get_type = Interop.downcallHandle(
                "gtk_list_box_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_list_box_get_type != null;
    }
}
