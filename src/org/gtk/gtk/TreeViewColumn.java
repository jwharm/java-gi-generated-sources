package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A visible column in a {@link TreeView} widget
 * <p>
 * The {@code GtkTreeViewColumn} object represents a visible column in a {@code GtkTreeView} widget.
 * It allows to set properties of the column header, and functions as a holding pen
 * for the cell renderers which determine how the data in the column is displayed.
 * <p>
 * Please refer to the <a href="section-tree-widget.html">tree widget conceptual overview</a>
 * for an overview of all the objects and data types related to the tree widget and
 * how they work together, and to the {@link TreeView} documentation for specifics
 * about the CSS node structure for treeviews and their headers.
 */
public class TreeViewColumn extends org.gtk.gobject.InitiallyUnowned implements Buildable, CellLayout {

    public TreeViewColumn(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeViewColumn */
    public static TreeViewColumn castFrom(org.gtk.gobject.Object gobject) {
        return new TreeViewColumn(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_tree_view_column_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn}.
     */
    public TreeViewColumn() {
        super(constructNew());
    }
    
    private static Reference constructNewWithArea(CellArea area) {
        Reference RESULT = References.get(gtk_h.gtk_tree_view_column_new_with_area(area.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn} using {@code area} to render its cells.
     */
    public static TreeViewColumn newWithArea(CellArea area) {
        return new TreeViewColumn(constructNewWithArea(area));
    }
    
    /**
     * Adds an attribute mapping to the list in {@code tree_column}.
     * <p>
     * The {@code column} is the
     * column of the model to get a value from, and the {@code attribute} is the
     * parameter on {@code cell_renderer} to be set from the value. So for example
     * if column 2 of the model contains strings, you could have the
     * “text” attribute of a {@code GtkCellRendererText} get its values from
     * column 2.
     */
    public void addAttribute(CellRenderer cellRenderer, java.lang.String attribute, int column) {
        gtk_h.gtk_tree_view_column_add_attribute(handle(), cellRenderer.handle(), Interop.allocateNativeString(attribute).handle(), column);
    }
    
    /**
     * Returns {@code true} if any of the cells packed into the {@code tree_column} are visible.
     * For this to be meaningful, you must first initialize the cells with
     * gtk_tree_view_column_cell_set_cell_data()
     */
    public boolean cellIsVisible() {
        var RESULT = gtk_h.gtk_tree_view_column_cell_is_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the cell renderer based on the {@code tree_model} and {@code iter}.  That is, for
     * every attribute mapping in {@code tree_column}, it will get a value from the set
     * column on the {@code iter}, and use that value to set the attribute on the cell
     * renderer.  This is used primarily by the {@code GtkTreeView}.
     */
    public void cellSetCellData(TreeModel treeModel, TreeIter iter, boolean isExpander, boolean isExpanded) {
        gtk_h.gtk_tree_view_column_cell_set_cell_data(handle(), treeModel.handle(), iter.handle(), isExpander ? 1 : 0, isExpanded ? 1 : 0);
    }
    
    /**
     * Unsets all the mappings on all renderers on the {@code tree_column}.
     */
    public void clear() {
        gtk_h.gtk_tree_view_column_clear(handle());
    }
    
    /**
     * Clears all existing attributes previously set with
     * gtk_tree_view_column_set_attributes().
     */
    public void clearAttributes(CellRenderer cellRenderer) {
        gtk_h.gtk_tree_view_column_clear_attributes(handle(), cellRenderer.handle());
    }
    
    /**
     * Emits the “clicked” signal on the column.  This function will only work if
     * {@code tree_column} is clickable.
     */
    public void clicked() {
        gtk_h.gtk_tree_view_column_clicked(handle());
    }
    
    /**
     * Sets the current keyboard focus to be at {@code cell}, if the column contains
     * 2 or more editable and activatable cells.
     */
    public void focusCell(CellRenderer cell) {
        gtk_h.gtk_tree_view_column_focus_cell(handle(), cell.handle());
    }
    
    /**
     * Returns the current x alignment of {@code tree_column}.  This value can range
     * between 0.0 and 1.0.
     */
    public float getAlignment() {
        var RESULT = gtk_h.gtk_tree_view_column_get_alignment(handle());
        return RESULT;
    }
    
    /**
     * Returns the button used in the treeview column header
     */
    public Widget getButton() {
        var RESULT = gtk_h.gtk_tree_view_column_get_button(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if the user can click on the header for the column.
     */
    public boolean getClickable() {
        var RESULT = gtk_h.gtk_tree_view_column_get_clickable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if the column expands to fill available space.
     */
    public boolean getExpand() {
        var RESULT = gtk_h.gtk_tree_view_column_get_expand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * width of the column; for that, use gtk_tree_view_column_get_width().
     */
    public int getFixedWidth() {
        var RESULT = gtk_h.gtk_tree_view_column_get_fixed_width(handle());
        return RESULT;
    }
    
    /**
     * Returns the maximum width in pixels of the {@code tree_column}, or -1 if no maximum
     * width is set.
     */
    public int getMaxWidth() {
        var RESULT = gtk_h.gtk_tree_view_column_get_max_width(handle());
        return RESULT;
    }
    
    /**
     * Returns the minimum width in pixels of the {@code tree_column}, or -1 if no minimum
     * width is set.
     */
    public int getMinWidth() {
        var RESULT = gtk_h.gtk_tree_view_column_get_min_width(handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the {@code tree_column} can be reordered by the user.
     */
    public boolean getReorderable() {
        var RESULT = gtk_h.gtk_tree_view_column_get_reorderable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if the {@code tree_column} can be resized by the end user.
     */
    public boolean getResizable() {
        var RESULT = gtk_h.gtk_tree_view_column_get_resizable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current type of {@code tree_column}.
     */
    public TreeViewColumnSizing getSizing() {
        var RESULT = gtk_h.gtk_tree_view_column_get_sizing(handle());
        return TreeViewColumnSizing.fromValue(RESULT);
    }
    
    /**
     * Gets the logical {@code sort_column_id} that the model sorts on
     * when this column is selected for sorting.
     * <p>
     * See {@link TreeViewColumn#setSortColumnId}.
     */
    public int getSortColumnId() {
        var RESULT = gtk_h.gtk_tree_view_column_get_sort_column_id(handle());
        return RESULT;
    }
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     */
    public boolean getSortIndicator() {
        var RESULT = gtk_h.gtk_tree_view_column_get_sort_indicator(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     */
    public SortType getSortOrder() {
        var RESULT = gtk_h.gtk_tree_view_column_get_sort_order(handle());
        return SortType.fromValue(RESULT);
    }
    
    /**
     * Returns the spacing of {@code tree_column}.
     */
    public int getSpacing() {
        var RESULT = gtk_h.gtk_tree_view_column_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the title of the widget.
     */
    public java.lang.String getTitle() {
        var RESULT = gtk_h.gtk_tree_view_column_get_title(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the {@code GtkTreeView} wherein {@code tree_column} has been inserted.
     * If {@code column} is currently not inserted in any tree view, {@code null} is
     * returned.
     */
    public Widget getTreeView() {
        var RESULT = gtk_h.gtk_tree_view_column_get_tree_view(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if {@code tree_column} is visible.
     */
    public boolean getVisible() {
        var RESULT = gtk_h.gtk_tree_view_column_get_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the {@code GtkWidget} in the button on the column header.
     * <p>
     * If a custom widget has not been set then {@code null} is returned.
     */
    public Widget getWidget() {
        var RESULT = gtk_h.gtk_tree_view_column_get_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the current size of {@code tree_column} in pixels.
     */
    public int getWidth() {
        var RESULT = gtk_h.gtk_tree_view_column_get_width(handle());
        return RESULT;
    }
    
    /**
     * Returns the current X offset of {@code tree_column} in pixels.
     */
    public int getXOffset() {
        var RESULT = gtk_h.gtk_tree_view_column_get_x_offset(handle());
        return RESULT;
    }
    
    /**
     * Adds the {@code cell} to end of the column. If {@code expand} is {@code false}, then the {@code cell}
     * is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public void packEnd(CellRenderer cell, boolean expand) {
        gtk_h.gtk_tree_view_column_pack_end(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Packs the {@code cell} into the beginning of the column. If {@code expand} is {@code false}, then
     * the {@code cell} is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public void packStart(CellRenderer cell, boolean expand) {
        gtk_h.gtk_tree_view_column_pack_start(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Flags the column, and the cell renderers added to this column, to have
     * their sizes renegotiated.
     */
    public void queueResize() {
        gtk_h.gtk_tree_view_column_queue_resize(handle());
    }
    
    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * The alignment determines its location inside the button -- 0.0 for left, 0.5
     * for center, 1.0 for right.
     */
    public void setAlignment(float xalign) {
        gtk_h.gtk_tree_view_column_set_alignment(handle(), xalign);
    }
    
    /**
     * Sets the {@code GtkTreeCellDataFunc} to use for the column.
     * <p>
     * This
     * function is used instead of the standard attributes mapping for
     * setting the column value, and should set the value of {@code tree_column}'s
     * cell renderer as appropriate.  {@code func} may be {@code null} to remove an
     * older one.
     */
    public void setCellDataFunc(CellRenderer cellRenderer, TreeCellDataFunc func) {
        try {
            gtk_h.gtk_tree_view_column_set_cell_data_func(handle(), cellRenderer.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeCellDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the header to be active if {@code clickable} is {@code true}.  When the header is
     * active, then it can take keyboard focus, and can be clicked.
     */
    public void setClickable(boolean clickable) {
        gtk_h.gtk_tree_view_column_set_clickable(handle(), clickable ? 1 : 0);
    }
    
    /**
     * Sets the column to take available extra space.  This space is shared equally
     * amongst all columns that have the expand set to {@code true}.  If no column has this
     * option set, then the last column gets all extra space.  By default, every
     * column is created with this {@code false}.
     * <p>
     * Along with “fixed-width”, the “expand” property changes when the column is
     * resized by the user.
     */
    public void setExpand(boolean expand) {
        gtk_h.gtk_tree_view_column_set_expand(handle(), expand ? 1 : 0);
    }
    
    /**
     * If {@code fixed_width} is not -1, sets the fixed width of {@code tree_column}; otherwise
     * unsets it.  The effective value of {@code fixed_width} is clamped between the
     * minimum and maximum width of the column; however, the value stored in the
     * “fixed-width” property is not clamped.  If the column sizing is
     * {@link TreeViewColumnSizing#GROW_ONLY} or {@link TreeViewColumnSizing#AUTOSIZE}, setting
     * a fixed width overrides the automatically calculated width.  Note that
     * {@code fixed_width} is only a hint to GTK; the width actually allocated to the
     * column may be greater or less than requested.
     * <p>
     * Along with “expand”, the “fixed-width” property changes when the column is
     * resized by the user.
     */
    public void setFixedWidth(int fixedWidth) {
        gtk_h.gtk_tree_view_column_set_fixed_width(handle(), fixedWidth);
    }
    
    /**
     * Sets the maximum width of the {@code tree_column}.  If {@code max_width} is -1, then the
     * maximum width is unset.  Note, the column can actually be wider than max
     * width if it’s the last column in a view.  In this case, the column expands to
     * fill any extra space.
     */
    public void setMaxWidth(int maxWidth) {
        gtk_h.gtk_tree_view_column_set_max_width(handle(), maxWidth);
    }
    
    /**
     * Sets the minimum width of the {@code tree_column}.  If {@code min_width} is -1, then the
     * minimum width is unset.
     */
    public void setMinWidth(int minWidth) {
        gtk_h.gtk_tree_view_column_set_min_width(handle(), minWidth);
    }
    
    /**
     * If {@code reorderable} is {@code true}, then the column can be reordered by the end user
     * dragging the header.
     */
    public void setReorderable(boolean reorderable) {
        gtk_h.gtk_tree_view_column_set_reorderable(handle(), reorderable ? 1 : 0);
    }
    
    /**
     * If {@code resizable} is {@code true}, then the user can explicitly resize the column by
     * grabbing the outer edge of the column button.
     * <p>
     * If resizable is {@code true} and
     * sizing mode of the column is {@link TreeViewColumnSizing#AUTOSIZE}, then the sizing
     * mode is changed to {@link TreeViewColumnSizing#GROW_ONLY}.
     */
    public void setResizable(boolean resizable) {
        gtk_h.gtk_tree_view_column_set_resizable(handle(), resizable ? 1 : 0);
    }
    
    /**
     * Sets the growth behavior of {@code tree_column} to {@code type}.
     */
    public void setSizing(TreeViewColumnSizing type) {
        gtk_h.gtk_tree_view_column_set_sizing(handle(), type.getValue());
    }
    
    /**
     * Sets the logical {@code sort_column_id} that this column sorts on when this column
     * is selected for sorting.  Doing so makes the column header clickable.
     */
    public void setSortColumnId(int sortColumnId) {
        gtk_h.gtk_tree_view_column_set_sort_column_id(handle(), sortColumnId);
    }
    
    /**
     * Call this function with a {@code setting} of {@code true} to display an arrow in
     * the header button indicating the column is sorted. Call
     * gtk_tree_view_column_set_sort_order() to change the direction of
     * the arrow.
     */
    public void setSortIndicator(boolean setting) {
        gtk_h.gtk_tree_view_column_set_sort_indicator(handle(), setting ? 1 : 0);
    }
    
    /**
     * Changes the appearance of the sort indicator.
     * <p>
     * This does not actually sort the model.  Use
     * gtk_tree_view_column_set_sort_column_id() if you want automatic sorting
     * support.  This function is primarily for custom sorting behavior, and should
     * be used in conjunction with gtk_tree_sortable_set_sort_column_id() to do
     * that. For custom models, the mechanism will vary.
     * <p>
     * The sort indicator changes direction to indicate normal sort or reverse sort.
     * Note that you must have the sort indicator enabled to see anything when
     * calling this function; see gtk_tree_view_column_set_sort_indicator().
     */
    public void setSortOrder(SortType order) {
        gtk_h.gtk_tree_view_column_set_sort_order(handle(), order.getValue());
    }
    
    /**
     * Sets the spacing field of {@code tree_column}, which is the number of pixels to
     * place between cell renderers packed into it.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_tree_view_column_set_spacing(handle(), spacing);
    }
    
    /**
     * Sets the title of the {@code tree_column}.  If a custom widget has been set, then
     * this value is ignored.
     */
    public void setTitle(java.lang.String title) {
        gtk_h.gtk_tree_view_column_set_title(handle(), Interop.allocateNativeString(title).handle());
    }
    
    /**
     * Sets the visibility of {@code tree_column}.
     */
    public void setVisible(boolean visible) {
        gtk_h.gtk_tree_view_column_set_visible(handle(), visible ? 1 : 0);
    }
    
    /**
     * Sets the widget in the header to be {@code widget}.  If widget is {@code null}, then the
     * header button is set with a {@code GtkLabel} set to the title of {@code tree_column}.
     */
    public void setWidget(Widget widget) {
        gtk_h.gtk_tree_view_column_set_widget(handle(), widget.handle());
    }
    
    @FunctionalInterface
    public interface ClickedHandler {
        void signalReceived(TreeViewColumn source);
    }
    
    /**
     * Emitted when the column's header has been clicked.
     */
    public SignalHandle onClicked(ClickedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewColumnClicked", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("clicked").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
