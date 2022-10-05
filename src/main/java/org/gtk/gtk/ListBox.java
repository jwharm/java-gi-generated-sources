package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * {@code Gtk.ListBox.insert} and a
 * {@code GtkListBoxRow} widget will automatically be inserted between the list
 * and the widget.
 * <p>
 * {@code GtkListBoxRows} can be marked as activatable or selectable. If a row is
 * activatable, {@code Gtk.ListBox::row-activated} will be emitted for it when
 * the user tries to activate it. If it is selectable, the row will be marked
 * as selected when the user tries to select it.
 * <p>
 * <h1>GtkListBox as GtkBuildable</h1>
 * <p>
 * The {@code GtkListBox} implementation of the {@code GtkBuildable} interface supports
 * setting a child as the placeholder by specifying “placeholder” as the “type”
 * attribute of a &lt;child&gt; element. See {@link ListBox#setPlaceholder}
 * for info.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
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
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkListBox} uses the {@link AccessibleRole#LIST} role and {@code GtkListBoxRow} uses
 * the {@link AccessibleRole#LIST_ITEM} role.
 */
public class ListBox extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ListBox(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ListBox */
    public static ListBox castFrom(org.gtk.gobject.Object gobject) {
        return new ListBox(gobject.refcounted());
    }
    
    static final MethodHandle gtk_list_box_new = Interop.downcallHandle(
        "gtk_list_box_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_list_box_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkListBox} container.
     */
    public ListBox() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_list_box_append = Interop.downcallHandle(
        "gtk_list_box_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Append a widget to the list.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void append(Widget child) {
        try {
            gtk_list_box_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_bind_model = Interop.downcallHandle(
        "gtk_list_box_bind_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void bindModel(org.gtk.gio.ListModel model, ListBoxCreateWidgetFunc createWidgetFunc) {
        try {
            gtk_list_box_bind_model.invokeExact(handle(), model.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbListBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(createWidgetFunc.hashCode(), createWidgetFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_drag_highlight_row = Interop.downcallHandle(
        "gtk_list_box_drag_highlight_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void dragHighlightRow(ListBoxRow row) {
        try {
            gtk_list_box_drag_highlight_row.invokeExact(handle(), row.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_drag_unhighlight_row = Interop.downcallHandle(
        "gtk_list_box_drag_unhighlight_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public void dragUnhighlightRow() {
        try {
            gtk_list_box_drag_unhighlight_row.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_activate_on_single_click = Interop.downcallHandle(
        "gtk_list_box_get_activate_on_single_click",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rows activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        try {
            var RESULT = (int) gtk_list_box_get_activate_on_single_click.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_adjustment = Interop.downcallHandle(
        "gtk_list_box_get_adjustment",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     */
    public Adjustment getAdjustment() {
        try {
            var RESULT = (MemoryAddress) gtk_list_box_get_adjustment.invokeExact(handle());
            return new Adjustment(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_row_at_index = Interop.downcallHandle(
        "gtk_list_box_get_row_at_index",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the n-th child in the list (not counting headers).
     * <p>
     * If {@code index_} is negative or larger than the number of items in the
     * list, {@code null} is returned.
     */
    public ListBoxRow getRowAtIndex(int index) {
        try {
            var RESULT = (MemoryAddress) gtk_list_box_get_row_at_index.invokeExact(handle(), index);
            return new ListBoxRow(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_row_at_y = Interop.downcallHandle(
        "gtk_list_box_get_row_at_y",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the row at the @y position.
     */
    public ListBoxRow getRowAtY(int y) {
        try {
            var RESULT = (MemoryAddress) gtk_list_box_get_row_at_y.invokeExact(handle(), y);
            return new ListBoxRow(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_selected_row = Interop.downcallHandle(
        "gtk_list_box_get_selected_row",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selected row, or {@code null} if no rows are selected.
     * <p>
     * Note that the box may allow multiple selection, in which
     * case you should use {@link ListBox#selectedForeach} to
     * find all selected rows.
     */
    public ListBoxRow getSelectedRow() {
        try {
            var RESULT = (MemoryAddress) gtk_list_box_get_selected_row.invokeExact(handle());
            return new ListBoxRow(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_selected_rows = Interop.downcallHandle(
        "gtk_list_box_get_selected_rows",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedRows() {
        try {
            var RESULT = (MemoryAddress) gtk_list_box_get_selected_rows.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_selection_mode = Interop.downcallHandle(
        "gtk_list_box_get_selection_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selection mode of the listbox.
     */
    public SelectionMode getSelectionMode() {
        try {
            var RESULT = (int) gtk_list_box_get_selection_mode.invokeExact(handle());
            return new SelectionMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_get_show_separators = Interop.downcallHandle(
        "gtk_list_box_get_show_separators",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        try {
            var RESULT = (int) gtk_list_box_get_show_separators.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_insert = Interop.downcallHandle(
        "gtk_list_box_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Insert the {@code child} into the {@code box} at {@code position}.
     * <p>
     * If a sort function is
     * set, the widget will actually be inserted at the calculated position.
     * <p>
     * If {@code position} is -1, or larger than the total number of items in the
     * {@code box}, then the {@code child} will be appended to the end.
     */
    public void insert(Widget child, int position) {
        try {
            gtk_list_box_insert.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_invalidate_filter = Interop.downcallHandle(
        "gtk_list_box_invalidate_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
            gtk_list_box_invalidate_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_invalidate_headers = Interop.downcallHandle(
        "gtk_list_box_invalidate_headers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Update the separators for all rows.
     * <p>
     * Call this when result
     * of the header function on the {@code box} is changed due
     * to an external factor.
     */
    public void invalidateHeaders() {
        try {
            gtk_list_box_invalidate_headers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_invalidate_sort = Interop.downcallHandle(
        "gtk_list_box_invalidate_sort",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Update the sorting for all rows.
     * <p>
     * Call this when result
     * of the sort function on the {@code box} is changed due
     * to an external factor.
     */
    public void invalidateSort() {
        try {
            gtk_list_box_invalidate_sort.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_prepend = Interop.downcallHandle(
        "gtk_list_box_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepend a widget to the list.
     * <p>
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void prepend(Widget child) {
        try {
            gtk_list_box_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_remove = Interop.downcallHandle(
        "gtk_list_box_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code box}.
     */
    public void remove(Widget child) {
        try {
            gtk_list_box_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_select_all = Interop.downcallHandle(
        "gtk_list_box_select_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Select all children of {@code box}, if the selection mode allows it.
     */
    public void selectAll() {
        try {
            gtk_list_box_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_select_row = Interop.downcallHandle(
        "gtk_list_box_select_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make {@code row} the currently selected row.
     */
    public void selectRow(ListBoxRow row) {
        try {
            gtk_list_box_select_row.invokeExact(handle(), row.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_selected_foreach = Interop.downcallHandle(
        "gtk_list_box_selected_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each selected child.
     * <p>
     * Note that the selection cannot be modified from within this function.
     */
    public void selectedForeach(ListBoxForeachFunc func) {
        try {
            gtk_list_box_selected_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbListBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_activate_on_single_click = Interop.downcallHandle(
        "gtk_list_box_set_activate_on_single_click",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code single} is {@code true}, rows will be activated when you click on them,
     * otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            gtk_list_box_set_activate_on_single_click.invokeExact(handle(), single ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_adjustment = Interop.downcallHandle(
        "gtk_list_box_set_adjustment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setAdjustment(Adjustment adjustment) {
        try {
            gtk_list_box_set_adjustment.invokeExact(handle(), adjustment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_filter_func = Interop.downcallHandle(
        "gtk_list_box_set_filter_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * By setting a filter function on the {@code box} one can decide dynamically which
     * of the rows to show.
     * <p>
     * For instance, to implement a search function on a list that
     * filters the original list to only show the matching rows.
     * <p>
     * The {@code filter_func} will be called for each row after the call, and
     * it will continue to be called each time a row changes (via
     * {@code Gtk.ListBox.invalidate_filter}
     * is called.
     * <p>
     * Note that using a filter function is incompatible with using a model
     * (see {@link ListBox#bindModel}).
     */
    public void setFilterFunc(ListBoxFilterFunc filterFunc) {
        try {
            gtk_list_box_set_filter_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbListBoxFilterFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(filterFunc.hashCode(), filterFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_header_func = Interop.downcallHandle(
        "gtk_list_box_set_header_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setHeaderFunc(ListBoxUpdateHeaderFunc updateHeader) {
        try {
            gtk_list_box_set_header_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbListBoxUpdateHeaderFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(updateHeader.hashCode(), updateHeader)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_placeholder = Interop.downcallHandle(
        "gtk_list_box_set_placeholder",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn't display any visible children.
     */
    public void setPlaceholder(Widget placeholder) {
        try {
            gtk_list_box_set_placeholder.invokeExact(handle(), placeholder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_selection_mode = Interop.downcallHandle(
        "gtk_list_box_set_selection_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets how selection works in the listbox.
     */
    public void setSelectionMode(SelectionMode mode) {
        try {
            gtk_list_box_set_selection_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_show_separators = Interop.downcallHandle(
        "gtk_list_box_set_show_separators",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        try {
            gtk_list_box_set_show_separators.invokeExact(handle(), showSeparators ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_set_sort_func = Interop.downcallHandle(
        "gtk_list_box_set_sort_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a sort function.
     * <p>
     * By setting a sort function on the {@code box} one can dynamically reorder
     * the rows of the list, based on the contents of the rows.
     * <p>
     * The {@code sort_func} will be called for each row after the call, and will
     * continue to be called each time a row changes (via
     * {@code Gtk.ListBox.invalidate_sort}
     * is called.
     * <p>
     * Note that using a sort function is incompatible with using a model
     * (see {@link ListBox#bindModel}).
     */
    public void setSortFunc(ListBoxSortFunc sortFunc) {
        try {
            gtk_list_box_set_sort_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbListBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_unselect_all = Interop.downcallHandle(
        "gtk_list_box_unselect_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unselect all children of {@code box}, if the selection mode allows it.
     */
    public void unselectAll() {
        try {
            gtk_list_box_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_list_box_unselect_row = Interop.downcallHandle(
        "gtk_list_box_unselect_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects a single row of {@code box}, if the selection mode allows it.
     */
    public void unselectRow(ListBoxRow row) {
        try {
            gtk_list_box_unselect_row.invokeExact(handle(), row.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public SignalHandle onActivateCursorRow(ActivateCursorRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxActivateCursorRow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(ListBox source, MovementStep object, int p0, boolean p1, boolean p2);
    }
    
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowActivatedHandler {
        void signalReceived(ListBox source, ListBoxRow row);
    }
    
    /**
     * Emitted when a row has been activated by the user.
     */
    public SignalHandle onRowActivated(RowActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowSelectedHandler {
        void signalReceived(ListBox source, ListBoxRow row);
    }
    
    /**
     * Emitted when a new row is selected, or (with a {@code null} {@code row})
     * when the selection is cleared.
     * <p>
     * When the {@code box} is using {@link SelectionMode#MULTIPLE}, this signal will not
     * give you the full picture of selection changes, and you should use
     * the {@code Gtk.ListBox::selected-rows-changed} signal instead.
     */
    public SignalHandle onRowSelected(RowSelectedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-selected").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxRowSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted to select all children of the box, if the selection
     * mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd>Ctrl</kbd>-<kbd>a</kbd&gt;.
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectedRowsChangedHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted when the set of selected rows changes.
     */
    public SignalHandle onSelectedRowsChanged(SelectedRowsChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selected-rows-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxSelectedRowsChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public SignalHandle onToggleCursorRow(ToggleCursorRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxToggleCursorRow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted to unselect all children of the box, if the selection
     * mode permits it.
     * <p>
     * This is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is
     * &lt;kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd&gt;.
     */
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ListBox.Callbacks.class, "signalListBoxUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalListBoxActivateCursorRow(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.ActivateCursorRowHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)));
        }
        
        public static void signalListBoxMoveCursor(MemoryAddress source, int object, int p0, int p1, int p2, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.MoveCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)), new MovementStep(object), p0, p1 != 0, p2 != 0);
        }
        
        public static void signalListBoxRowActivated(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.RowActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)), new ListBoxRow(Refcounted.get(row, false)));
        }
        
        public static void signalListBoxRowSelected(MemoryAddress source, MemoryAddress row, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.RowSelectedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)), new ListBoxRow(Refcounted.get(row, false)));
        }
        
        public static void signalListBoxSelectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.SelectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)));
        }
        
        public static void signalListBoxSelectedRowsChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.SelectedRowsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)));
        }
        
        public static void signalListBoxToggleCursorRow(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.ToggleCursorRowHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)));
        }
        
        public static void signalListBoxUnselectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ListBox.UnselectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ListBox(Refcounted.get(source)));
        }
        
    }
}
