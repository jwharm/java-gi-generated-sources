package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkListBox` is a vertical list.
 * 
 * A `GtkListBox` only contains `GtkListBoxRow` children. These rows can
 * by dynamically sorted and filtered, and headers can be added dynamically
 * depending on the row content. It also allows keyboard and mouse navigation
 * and selection like a typical list.
 * 
 * Using `GtkListBox` is often an alternative to `GtkTreeView`, especially
 * when the list contents has a more complicated layout than what is allowed
 * by a `GtkCellRenderer`, or when the contents is interactive (i.e. has a
 * button in it).
 * 
 * Although a `GtkListBox` must have only `GtkListBoxRow` children, you can
 * add any kind of widget to it via [method@Gtk.ListBox.prepend],
 * [method@Gtk.ListBox.append] and [method@Gtk.ListBox.insert] and a
 * `GtkListBoxRow` widget will automatically be inserted between the list
 * and the widget.
 * 
 * `GtkListBoxRows` can be marked as activatable or selectable. If a row is
 * activatable, [signal@Gtk.ListBox::row-activated] will be emitted for it when
 * the user tries to activate it. If it is selectable, the row will be marked
 * as selected when the user tries to select it.
 * 
 * # GtkListBox as GtkBuildable
 * 
 * The `GtkListBox` implementation of the `GtkBuildable` interface supports
 * setting a child as the placeholder by specifying “placeholder” as the “type”
 * attribute of a <child> element. See [method@Gtk.ListBox.set_placeholder]
 * for info.
 * 
 * # CSS nodes
 * 
 * |[<!-- language="plain" -->
 * list[.separators][.rich-list][.navigation-sidebar]
 * ╰── row[.activatable]
 * ]|
 * 
 * `GtkListBox` uses a single CSS node named list. It may carry the .separators
 * style class, when the [property@Gtk.ListBox:show-separators] property is set.
 * Each `GtkListBoxRow` uses a single CSS node named row. The row nodes get the
 * .activatable style class added when appropriate.
 * 
 * The main list node may also carry style classes to select
 * the style of [list presentation](section-list-widget.html#list-styles):
 * .rich-list, .navigation-sidebar or .data-table.
 * 
 * # Accessibility
 * 
 * `GtkListBox` uses the %GTK_ACCESSIBLE_ROLE_LIST role and `GtkListBoxRow` uses
 * the %GTK_ACCESSIBLE_ROLE_LIST_ITEM role.
 */
public class ListBox extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ListBox(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListBox */
    public static ListBox castFrom(org.gtk.gobject.Object gobject) {
        return new ListBox(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkListBox` container.
     */
    public ListBox() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_new(), false));
    }
    
    /**
     * Append a widget to the list.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void append(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_append(HANDLE(), child.HANDLE());
    }
    
    /**
     * Add a drag highlight to a row.
     * 
     * This is a helper function for implementing DnD onto a `GtkListBox`.
     * The passed in @row will be highlighted by setting the
     * %GTK_STATE_FLAG_DROP_ACTIVE state and any previously highlighted
     * row will be unhighlighted.
     * 
     * The row will also be unhighlighted when the widget gets
     * a drag leave event.
     */
    public void dragHighlightRow(ListBoxRow row) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_drag_highlight_row(HANDLE(), row.HANDLE());
    }
    
    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public void dragUnhighlightRow() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_drag_unhighlight_row(HANDLE());
    }
    
    /**
     * Returns whether rows activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_activate_on_single_click(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     */
    public Adjustment getAdjustment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_adjustment(HANDLE());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Gets the n-th child in the list (not counting headers).
     * 
     * If @index_ is negative or larger than the number of items in the
     * list, %NULL is returned.
     */
    public ListBoxRow getRowAtIndex(int index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_row_at_index(HANDLE(), index);
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Gets the row at the @y position.
     */
    public ListBoxRow getRowAtY(int y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_row_at_y(HANDLE(), y);
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Gets the selected row, or %NULL if no rows are selected.
     * 
     * Note that the box may allow multiple selection, in which
     * case you should use [method@Gtk.ListBox.selected_foreach] to
     * find all selected rows.
     */
    public ListBoxRow getSelectedRow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_selected_row(HANDLE());
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedRows() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_selected_rows(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the selection mode of the listbox.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_selection_mode(HANDLE());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_get_show_separators(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Insert the @child into the @box at @position.
     * 
     * If a sort function is
     * set, the widget will actually be inserted at the calculated position.
     * 
     * If @position is -1, or larger than the total number of items in the
     * @box, then the @child will be appended to the end.
     */
    public void insert(Widget child, int position) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_insert(HANDLE(), child.HANDLE(), position);
    }
    
    /**
     * Update the filtering for all rows.
     * 
     * Call this when result
     * of the filter function on the @box is changed due
     * to an external factor. For instance, this would be used
     * if the filter function just looked for a specific search
     * string and the entry with the search string has changed.
     */
    public void invalidateFilter() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_invalidate_filter(HANDLE());
    }
    
    /**
     * Update the separators for all rows.
     * 
     * Call this when result
     * of the header function on the @box is changed due
     * to an external factor.
     */
    public void invalidateHeaders() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_invalidate_headers(HANDLE());
    }
    
    /**
     * Update the sorting for all rows.
     * 
     * Call this when result
     * of the sort function on the @box is changed due
     * to an external factor.
     */
    public void invalidateSort() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_invalidate_sort(HANDLE());
    }
    
    /**
     * Prepend a widget to the list.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void prepend(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_prepend(HANDLE(), child.HANDLE());
    }
    
    /**
     * Removes a child from @box.
     */
    public void remove(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_remove(HANDLE(), child.HANDLE());
    }
    
    /**
     * Select all children of @box, if the selection mode allows it.
     */
    public void selectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_select_all(HANDLE());
    }
    
    /**
     * Make @row the currently selected row.
     */
    public void selectRow(ListBoxRow row) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_select_row(HANDLE(), row.HANDLE());
    }
    
    /**
     * If @single is %TRUE, rows will be activated when you click on them,
     * otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_set_activate_on_single_click(HANDLE(), single ? 1 : 0);
    }
    
    /**
     * Sets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     * 
     * For instance, this is used to get the page size for
     * PageUp/Down key handling.
     * 
     * In the normal case when the @box is packed inside
     * a `GtkScrolledWindow` the adjustment from that will
     * be picked up automatically, so there is no need
     * to manually do that.
     */
    public void setAdjustment(Adjustment adjustment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_set_adjustment(HANDLE(), adjustment.HANDLE());
    }
    
    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn't display any visible children.
     */
    public void setPlaceholder(Widget placeholder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_set_placeholder(HANDLE(), placeholder.HANDLE());
    }
    
    /**
     * Sets how selection works in the listbox.
     */
    public void setSelectionMode(SelectionMode mode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_set_selection_mode(HANDLE(), mode.getValue());
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_set_show_separators(HANDLE(), showSeparators ? 1 : 0);
    }
    
    /**
     * Unselect all children of @box, if the selection mode allows it.
     */
    public void unselectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_unselect_all(HANDLE());
    }
    
    /**
     * Unselects a single row of @box, if the selection mode allows it.
     */
    public void unselectRow(ListBoxRow row) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_list_box_unselect_row(HANDLE(), row.HANDLE());
    }
    
    @FunctionalInterface
    public interface ActivateCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public void onActivateCursorRow(ActivateCursorRowHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxActivateCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate-cursor-row").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(ListBox source, MovementStep object, int p0, boolean p1, boolean p2);
    }
    
    public void onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("move-cursor").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowActivatedHandler {
        void signalReceived(ListBox source, ListBoxRow row);
    }
    
    /**
     * Emitted when a row has been activated by the user.
     */
    public void onRowActivated(RowActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxRowActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("row-activated").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowSelectedHandler {
        void signalReceived(ListBox source, ListBoxRow row);
    }
    
    /**
     * Emitted when a new row is selected, or (with a %NULL @row)
     * when the selection is cleared.
     * 
     * When the @box is using %GTK_SELECTION_MULTIPLE, this signal will not
     * give you the full picture of selection changes, and you should use
     * the [signal@Gtk.ListBox::selected-rows-changed] signal instead.
     */
    public void onRowSelected(RowSelectedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxRowSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("row-selected").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted to select all children of the box, if the selection
     * mode permits it.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is <kbd>Ctrl</kbd>-<kbd>a</kbd>.
     */
    public void onSelectAll(SelectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("select-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectedRowsChangedHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted when the set of selected rows changes.
     */
    public void onSelectedRowsChanged(SelectedRowsChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxSelectedRowsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("selected-rows-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public void onToggleCursorRow(ToggleCursorRowHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxToggleCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("toggle-cursor-row").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        void signalReceived(ListBox source);
    }
    
    /**
     * Emitted to unselect all children of the box, if the selection
     * mode permits it.
     * 
     * This is a [keybinding signal](class.SignalAction.html).
     * 
     * The default binding for this signal is
     * <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>a</kbd>.
     */
    public void onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("unselect-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
