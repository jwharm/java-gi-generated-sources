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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListBox(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListBox if its GType is a (or inherits from) "GtkListBox".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListBox} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListBox", a ClassCastException will be thrown.
     */
    public static ListBox castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ListBox.getType())) {
            return new ListBox(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListBox");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Append a widget to the list.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     * @param child the {@code GtkWidget} to add
     */
    public void append(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
     */
    public void bindModel(@Nullable org.gtk.gio.ListModel model, @Nullable org.gtk.gtk.ListBoxCreateWidgetFunc createWidgetFunc) {
        try {
            DowncallHandles.gtk_list_box_bind_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()),
                    (Addressable) (createWidgetFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbListBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (createWidgetFunc == null ? MemoryAddress.NULL : Interop.registerCallback(createWidgetFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    public void dragHighlightRow(@NotNull org.gtk.gtk.ListBoxRow row) {
        java.util.Objects.requireNonNull(row, "Parameter 'row' must not be null");
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
            DowncallHandles.gtk_list_box_drag_unhighlight_row.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_list_box_get_activate_on_single_click.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     * @return the adjustment
     */
    public @Nullable org.gtk.gtk.Adjustment getAdjustment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_adjustment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Adjustment(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.ListBoxRow(RESULT, Ownership.NONE);
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
        return new org.gtk.gtk.ListBoxRow(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_selected_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ListBoxRow(RESULT, Ownership.NONE);
    }
    
    /**
     * Creates a list of all selected children.
     * @return A {@code GList} containing the {@code GtkWidget} for each selected child.
     *   Free with g_list_free() when done.
     */
    public @NotNull org.gtk.glib.List getSelectedRows() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_box_get_selected_rows.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Gets the selection mode of the listbox.
     * @return a {@code GtkSelectionMode}
     */
    public @NotNull org.gtk.gtk.SelectionMode getSelectionMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_get_selection_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionMode(RESULT);
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     * @return {@code true} if the list box shows separators
     */
    public boolean getShowSeparators() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_box_get_show_separators.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void insert(@NotNull org.gtk.gtk.Widget child, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
            DowncallHandles.gtk_list_box_invalidate_filter.invokeExact(
                    handle());
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
            DowncallHandles.gtk_list_box_invalidate_headers.invokeExact(
                    handle());
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
            DowncallHandles.gtk_list_box_invalidate_sort.invokeExact(
                    handle());
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
    public void prepend(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
            DowncallHandles.gtk_list_box_select_all.invokeExact(
                    handle());
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
    public void selectedForeach(@NotNull org.gtk.gtk.ListBoxForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_list_box_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbListBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
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
                    single ? 1 : 0);
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
     */
    public void setFilterFunc(@Nullable org.gtk.gtk.ListBoxFilterFunc filterFunc) {
        try {
            DowncallHandles.gtk_list_box_set_filter_func.invokeExact(
                    handle(),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbListBoxFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (filterFunc == null ? MemoryAddress.NULL : Interop.registerCallback(filterFunc)),
                    Interop.cbDestroyNotifySymbol());
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
     */
    public void setHeaderFunc(@Nullable org.gtk.gtk.ListBoxUpdateHeaderFunc updateHeader) {
        try {
            DowncallHandles.gtk_list_box_set_header_func.invokeExact(
                    handle(),
                    (Addressable) (updateHeader == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbListBoxUpdateHeaderFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (updateHeader == null ? MemoryAddress.NULL : Interop.registerCallback(updateHeader)),
                    Interop.cbDestroyNotifySymbol());
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
    public void setSelectionMode(@NotNull org.gtk.gtk.SelectionMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
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
                    showSeparators ? 1 : 0);
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
     */
    public void setSortFunc(@Nullable org.gtk.gtk.ListBoxSortFunc sortFunc) {
        try {
            DowncallHandles.gtk_list_box_set_sort_func.invokeExact(
                    handle(),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbListBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (sortFunc == null ? MemoryAddress.NULL : Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselect all children of {@code box}, if the selection mode allows it.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_list_box_unselect_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects a single row of {@code box}, if the selection mode allows it.
     * @param row the row to unselected
     */
    public void unselectRow(@NotNull org.gtk.gtk.ListBoxRow row) {
        java.util.Objects.requireNonNull(row, "Parameter 'row' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_list_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ActivateCursorRow {
        void signalReceived(ListBox source);
    }
    
    public Signal<ListBox.ActivateCursorRow> onActivateCursorRow(ListBox.ActivateCursorRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-row"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxActivateCursorRow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.ActivateCursorRow>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        void signalReceived(ListBox source, @NotNull org.gtk.gtk.MovementStep object, int p0, boolean p1, boolean p2);
    }
    
    public Signal<ListBox.MoveCursor> onMoveCursor(ListBox.MoveCursor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.MoveCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowActivated {
        void signalReceived(ListBox source, @NotNull org.gtk.gtk.ListBoxRow row);
    }
    
    /**
     * Emitted when a row has been activated by the user.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.RowActivated> onRowActivated(ListBox.RowActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.RowActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowSelected {
        void signalReceived(ListBox source, @Nullable org.gtk.gtk.ListBoxRow row);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxRowSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.RowSelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAll {
        void signalReceived(ListBox source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.SelectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectedRowsChanged {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted when the set of selected rows changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ListBox.SelectedRowsChanged> onSelectedRowsChanged(ListBox.SelectedRowsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selected-rows-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxSelectedRowsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.SelectedRowsChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRow {
        void signalReceived(ListBox source);
    }
    
    public Signal<ListBox.ToggleCursorRow> onToggleCursorRow(ListBox.ToggleCursorRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-row"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxToggleCursorRow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.ToggleCursorRow>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAll {
        void signalReceived(ListBox source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ListBox.UnselectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link ListBox.Build} object constructs a {@link ListBox} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ListBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListBox} using {@link ListBox#castFrom}.
         * @return A new instance of {@code ListBox} with the properties 
         *         that were set in the Build object.
         */
        public ListBox construct() {
            return ListBox.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ListBox.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether to accept unpaired release events.
         * @param acceptUnpairedRelease The value for the {@code accept-unpaired-release} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAcceptUnpairedRelease(boolean acceptUnpairedRelease) {
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
        public Build setActivateOnSingleClick(boolean activateOnSingleClick) {
            names.add("activate-on-single-click");
            values.add(org.gtk.gobject.Value.create(activateOnSingleClick));
            return this;
        }
        
        /**
         * The selection mode used by the list box.
         * @param selectionMode The value for the {@code selection-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSelectionMode(org.gtk.gtk.SelectionMode selectionMode) {
            names.add("selection-mode");
            values.add(org.gtk.gobject.Value.create(selectionMode));
            return this;
        }
        
        /**
         * Whether to show separators between rows.
         * @param showSeparators The value for the {@code show-separators} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowSeparators(boolean showSeparators) {
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
    
    private static class Callbacks {
        
        public static void signalListBoxActivateCursorRow(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.ActivateCursorRow) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE));
        }
        
        public static void signalListBoxMoveCursor(MemoryAddress source, int object, int p0, int p1, int p2, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.MoveCursor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE), new org.gtk.gtk.MovementStep(object), p0, p1 != 0, p2 != 0);
        }
        
        public static void signalListBoxRowActivated(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.RowActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE), new org.gtk.gtk.ListBoxRow(row, Ownership.NONE));
        }
        
        public static void signalListBoxRowSelected(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.RowSelected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE), new org.gtk.gtk.ListBoxRow(row, Ownership.NONE));
        }
        
        public static void signalListBoxSelectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.SelectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE));
        }
        
        public static void signalListBoxSelectedRowsChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.SelectedRowsChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE));
        }
        
        public static void signalListBoxToggleCursorRow(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.ToggleCursorRow) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE));
        }
        
        public static void signalListBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ListBox.UnselectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ListBox(source, Ownership.NONE));
        }
    }
}
