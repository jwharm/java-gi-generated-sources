package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkListBox</code> is a vertical list.
 * <p>
 * A <code>GtkListBox</code> only contains <code>GtkListBoxRow</code> children. These rows can
 * by dynamically sorted and filtered, and headers can be added dynamically
 * depending on the row content. It also allows keyboard and mouse navigation
 * and selection like a typical list.
 * <p>
 * Using <code>GtkListBox</code> is often an alternative to <code>GtkTreeView</code>, especially
 * when the list contents has a more complicated layout than what is allowed
 * by a <code>GtkCellRenderer</code>, or when the contents is interactive (i.e. has a
 * button in it).
 * <p>
 * Although a <code>GtkListBox</code> must have only <code>GtkListBoxRow</code> children, you can
 * add any kind of widget to it via {@link org.gtk.gtk.ListBox<code>#prepend</code> ,
 * {@link org.gtk.gtk.ListBox<code>#append</code>  and {@link org.gtk.gtk.ListBox<code>#insert</code>  and a<code>GtkListBoxRow</code> widget will automatically be inserted between the list
 * and the widget.
 * <p><code>GtkListBoxRows</code> can be marked as activatable or selectable. If a row is
 * activatable, {@link [signal@Gtk.ListBox::row-activated] (ref=signal)} will be emitted for it when
 * the user tries to activate it. If it is selectable, the row will be marked
 * as selected when the user tries to select it.
 * <p>
 * <h1>GtkListBox as GtkBuildable</h1>
 * <p>
 * The <code>GtkListBox</code> implementation of the <code>GtkBuildable</code> interface supports
 * setting a child as the placeholder by specifying &<code>#8220</code> placeholder&<code>#8221</code>  as the &<code>#8220</code> type&<code>#8221</code> 
 * attribute of a &<code>#60</code> child&<code>#62</code>  element. See {@link org.gtk.gtk.ListBox<code>#setPlaceholder</code> 
 * for info.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> plain&<code>#34</code>  --&<code>#62</code> 
 * list[.separators]}{@link [.rich-list]}{@link [.navigation-sidebar]}
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  row{@link [.activatable]}
 * ]|
 * <p><code>GtkListBox</code> uses a single CSS node named list. It may carry the .separators
 * style class, when the {@link [property@Gtk.ListBox:show-separators] (ref=property)} property is set.
 * Each <code>GtkListBoxRow</code> uses a single CSS node named row. The row nodes get the
 * .activatable style class added when appropriate.
 * <p>
 * The main list node may also carry style classes to select
 * the style of {@link [list presentation]}(section-list-widget.html<code>#list</code> styles):
 * .rich-list, .navigation-sidebar or .data-table.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkListBox</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#LIST</code>  role and <code>GtkListBoxRow</code> uses
 * the {@link org.gtk.gtk.AccessibleRole<code>#LIST_ITEM</code>  role.
 */
public class ListBox extends Widget implements Accessible, Buildable, ConstraintTarget {

    public ListBox(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListBox */
    public static ListBox castFrom(org.gtk.gobject.Object gobject) {
        return new ListBox(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_list_box_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkListBox</code> container.
     */
    public ListBox() {
        super(constructNew());
    }
    
    /**
     * Append a widget to the list.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void append(Widget child) {
        gtk_h.gtk_list_box_append(handle(), child.handle());
    }
    
    /**
     * Binds @model to @box.
     * <p>
     * If @box was already bound to a model, that previous binding is
     * destroyed.
     * <p>
     * The contents of @box are cleared and then filled with widgets that
     * represent items from @model. @box is updated whenever @model changes.
     * If @model is <code>null</code>  @box is left empty.
     * <p>
     * It is undefined to add or remove widgets directly (for example, with
     * {@link org.gtk.gtk.ListBox<code>#insert</code> ) while @box is bound to a model.
     * <p>
     * Note that using a model is incompatible with the filtering and sorting
     * functionality in <code>GtkListBox</code>. When using a model, filtering and sorting
     * should be implemented by the model.
     */
    public void bindModel(org.gtk.gio.ListModel model, ListBoxCreateWidgetFunc createWidgetFunc) {
        try {
            gtk_h.gtk_list_box_bind_model(handle(), model.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbListBoxCreateWidgetFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(createWidgetFunc.hashCode(), createWidgetFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Add a drag highlight to a row.
     * <p>
     * This is a helper function for implementing DnD onto a <code>GtkListBox</code>.
     * The passed in @row will be highlighted by setting the
     * {@link org.gtk.gtk.StateFlags<code>#DROP_ACTIVE</code>  state and any previously highlighted
     * row will be unhighlighted.
     * 
     * The row will also be unhighlighted when the widget gets
     * a drag leave event.
     */
    public void dragHighlightRow(ListBoxRow row) {
        gtk_h.gtk_list_box_drag_highlight_row(handle(), row.handle());
    }
    
    /**
     * If a row has previously been highlighted via gtk_list_box_drag_highlight_row(),
     * it will have the highlight removed.
     */
    public void dragUnhighlightRow() {
        gtk_h.gtk_list_box_drag_unhighlight_row(handle());
    }
    
    /**
     * Returns whether rows activate on single clicks.
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = gtk_h.gtk_list_box_get_activate_on_single_click(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     */
    public Adjustment getAdjustment() {
        var RESULT = gtk_h.gtk_list_box_get_adjustment(handle());
        return new Adjustment(References.get(RESULT, false));
    }
    
    /**
     * Gets the n-th child in the list (not counting headers).
     * 
     * If @index_ is negative or larger than the number of items in the
     * list, <code>null</code> is returned.
     */
    public ListBoxRow getRowAtIndex(int index) {
        var RESULT = gtk_h.gtk_list_box_get_row_at_index(handle(), index);
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Gets the row at the @y position.
     */
    public ListBoxRow getRowAtY(int y) {
        var RESULT = gtk_h.gtk_list_box_get_row_at_y(handle(), y);
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Gets the selected row, or <code>null</code> if no rows are selected.
     * 
     * Note that the box may allow multiple selection, in which
     * case you should use {@link org.gtk.gtk.ListBox<code>#selectedForeach</code>  to
     * find all selected rows.
     */
    public ListBoxRow getSelectedRow() {
        var RESULT = gtk_h.gtk_list_box_get_selected_row(handle());
        return new ListBoxRow(References.get(RESULT, false));
    }
    
    /**
     * Creates a list of all selected children.
     */
    public org.gtk.glib.List getSelectedRows() {
        var RESULT = gtk_h.gtk_list_box_get_selected_rows(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets the selection mode of the listbox.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = gtk_h.gtk_list_box_get_selection_mode(handle());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Returns whether the list box should show separators
     * between rows.
     */
    public boolean getShowSeparators() {
        var RESULT = gtk_h.gtk_list_box_get_show_separators(handle());
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
        gtk_h.gtk_list_box_insert(handle(), child.handle(), position);
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
        gtk_h.gtk_list_box_invalidate_filter(handle());
    }
    
    /**
     * Update the separators for all rows.
     * 
     * Call this when result
     * of the header function on the @box is changed due
     * to an external factor.
     */
    public void invalidateHeaders() {
        gtk_h.gtk_list_box_invalidate_headers(handle());
    }
    
    /**
     * Update the sorting for all rows.
     * 
     * Call this when result
     * of the sort function on the @box is changed due
     * to an external factor.
     */
    public void invalidateSort() {
        gtk_h.gtk_list_box_invalidate_sort(handle());
    }
    
    /**
     * Prepend a widget to the list.
     * 
     * If a sort function is set, the widget will
     * actually be inserted at the calculated position.
     */
    public void prepend(Widget child) {
        gtk_h.gtk_list_box_prepend(handle(), child.handle());
    }
    
    /**
     * Removes a child from @box.
     */
    public void remove(Widget child) {
        gtk_h.gtk_list_box_remove(handle(), child.handle());
    }
    
    /**
     * Select all children of @box, if the selection mode allows it.
     */
    public void selectAll() {
        gtk_h.gtk_list_box_select_all(handle());
    }
    
    /**
     * Make @row the currently selected row.
     */
    public void selectRow(ListBoxRow row) {
        gtk_h.gtk_list_box_select_row(handle(), row.handle());
    }
    
    /**
     * Calls a function for each selected child.
     * 
     * Note that the selection cannot be modified from within this function.
     */
    public void selectedForeach(ListBoxForeachFunc func) {
        try {
            gtk_h.gtk_list_box_selected_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbListBoxForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * If @single is <code>true</code>  rows will be activated when you click on them,
     * otherwise you need to double-click.
     */
    public void setActivateOnSingleClick(boolean single) {
        gtk_h.gtk_list_box_set_activate_on_single_click(handle(), single ? 1 : 0);
    }
    
    /**
     * Sets the adjustment (if any) that the widget uses to
     * for vertical scrolling.
     * <p>
     * For instance, this is used to get the page size for
     * PageUp/Down key handling.
     * <p>
     * In the normal case when the @box is packed inside
     * a <code>GtkScrolledWindow</code> the adjustment from that will
     * be picked up automatically, so there is no need
     * to manually do that.
     */
    public void setAdjustment(Adjustment adjustment) {
        gtk_h.gtk_list_box_set_adjustment(handle(), adjustment.handle());
    }
    
    /**
     * By setting a filter function on the @box one can decide dynamically which
     * of the rows to show.
     * 
     * For instance, to implement a search function on a list that
     * filters the original list to only show the matching rows.
     * 
     * The @filter_func will be called for each row after the call, and
     * it will continue to be called each time a row changes (via
     * {@link org.gtk.gtk.ListBoxRow<code>#changed</code> ) or when {@link org.gtk.gtk.ListBox<code>#invalidateFilter</code> 
     * is called.
     * 
     * Note that using a filter function is incompatible with using a model
     * (see {@link org.gtk.gtk.ListBox<code>#bindModel</code> ).
     */
    public void setFilterFunc(ListBoxFilterFunc filterFunc) {
        try {
            gtk_h.gtk_list_box_set_filter_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbListBoxFilterFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(filterFunc.hashCode(), filterFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a header function.
     * 
     * By setting a header function on the @box one can dynamically add headers
     * in front of rows, depending on the contents of the row and its position
     * in the list.
     * 
     * For instance, one could use it to add headers in front of the first item
     * of a new kind, in a list sorted by the kind.
     * 
     * The @update_header can look at the current header widget using
     * {@link org.gtk.gtk.ListBoxRow<code>#getHeader</code>  and either update the state of the widget
     * as needed, or set a new one using {@link org.gtk.gtk.ListBoxRow<code>#setHeader</code> . If no
     * header is needed, set the header to <code>null</code> 
     * 
     * Note that you may get many calls @update_header to this for a particular
     * row when e.g. changing things that don&<code>#8217</code> t affect the header. In this case
     * it is important for performance to not blindly replace an existing header
     * with an identical one.
     * 
     * The @update_header function will be called for each row after the call,
     * and it will continue to be called each time a row changes (via
     * {@link org.gtk.gtk.ListBoxRow<code>#changed</code> ) and when the row before changes (either
     * by {@link org.gtk.gtk.ListBoxRow<code>#changed</code>  on the previous row, or when the previous
     * row becomes a different row). It is also called for all rows when
     * {@link org.gtk.gtk.ListBox<code>#invalidateHeaders</code>  is called.
     */
    public void setHeaderFunc(ListBoxUpdateHeaderFunc updateHeader) {
        try {
            gtk_h.gtk_list_box_set_header_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbListBoxUpdateHeaderFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(updateHeader.hashCode(), updateHeader)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the placeholder widget that is shown in the list when
     * it doesn&<code>#39</code> t display any visible children.
     */
    public void setPlaceholder(Widget placeholder) {
        gtk_h.gtk_list_box_set_placeholder(handle(), placeholder.handle());
    }
    
    /**
     * Sets how selection works in the listbox.
     */
    public void setSelectionMode(SelectionMode mode) {
        gtk_h.gtk_list_box_set_selection_mode(handle(), mode.getValue());
    }
    
    /**
     * Sets whether the list box should show separators
     * between rows.
     */
    public void setShowSeparators(boolean showSeparators) {
        gtk_h.gtk_list_box_set_show_separators(handle(), showSeparators ? 1 : 0);
    }
    
    /**
     * Sets a sort function.
     * 
     * By setting a sort function on the @box one can dynamically reorder
     * the rows of the list, based on the contents of the rows.
     * 
     * The @sort_func will be called for each row after the call, and will
     * continue to be called each time a row changes (via
     * {@link org.gtk.gtk.ListBoxRow<code>#changed</code> ) and when {@link org.gtk.gtk.ListBox<code>#invalidateSort</code> 
     * is called.
     * 
     * Note that using a sort function is incompatible with using a model
     * (see {@link org.gtk.gtk.ListBox<code>#bindModel</code> ).
     */
    public void setSortFunc(ListBoxSortFunc sortFunc) {
        try {
            gtk_h.gtk_list_box_set_sort_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbListBoxSortFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unselect all children of @box, if the selection mode allows it.
     */
    public void unselectAll() {
        gtk_h.gtk_list_box_unselect_all(handle());
    }
    
    /**
     * Unselects a single row of @box, if the selection mode allows it.
     */
    public void unselectRow(ListBoxRow row) {
        gtk_h.gtk_list_box_unselect_row(handle(), row.handle());
    }
    
    @FunctionalInterface
    public interface ActivateCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public SignalHandle onActivateCursorRow(ActivateCursorRowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxActivateCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate-cursor-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(ListBox source, MovementStep object, int p0, boolean p1, boolean p2);
    }
    
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onRowActivated(RowActivatedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxRowActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("row-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RowSelectedHandler {
        void signalReceived(ListBox source, ListBoxRow row);
    }
    
    /**
     * Emitted when a new row is selected, or (with a <code>null</code> @row)
     * when the selection is cleared.
     * 
     * When the @box is using {@link org.gtk.gtk.SelectionMode<code>#MULTIPLE</code>   this signal will not
     * give you the full picture of selection changes, and you should use
     * the {@link [signal@Gtk.ListBox::selected-rows-changed] (ref=signal)} signal instead.
     */
    public SignalHandle onRowSelected(RowSelectedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxRowSelected", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("row-selected").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &<code>#60</code> kbd&<code>#62</code> Ctrl&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> a&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
    public SignalHandle onSelectedRowsChanged(SelectedRowsChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxSelectedRowsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("selected-rows-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRowHandler {
        void signalReceived(ListBox source);
    }
    
    public SignalHandle onToggleCursorRow(ToggleCursorRowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxToggleCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-cursor-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * This is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is
     * &<code>#60</code> kbd&<code>#62</code> Ctrl&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> Shift&<code>#60</code> /kbd&<code>#62</code> -&<code>#60</code> kbd&<code>#62</code> a&<code>#60</code> /kbd&<code>#62</code> .
     */
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalListBoxUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unselect-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
