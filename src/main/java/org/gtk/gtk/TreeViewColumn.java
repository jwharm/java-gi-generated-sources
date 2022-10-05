package org.gtk.gtk;

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

    public TreeViewColumn(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeViewColumn */
    public static TreeViewColumn castFrom(org.gtk.gobject.Object gobject) {
        return new TreeViewColumn(gobject.refcounted());
    }
    
    static final MethodHandle gtk_tree_view_column_new = Interop.downcallHandle(
        "gtk_tree_view_column_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_view_column_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn}.
     */
    public TreeViewColumn() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_tree_view_column_new_with_area = Interop.downcallHandle(
        "gtk_tree_view_column_new_with_area",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithArea(CellArea area) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_view_column_new_with_area.invokeExact(area.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn} using {@code area} to render its cells.
     */
    public static TreeViewColumn newWithArea(CellArea area) {
        return new TreeViewColumn(constructNewWithArea(area));
    }
    
    static final MethodHandle gtk_tree_view_column_add_attribute = Interop.downcallHandle(
        "gtk_tree_view_column_add_attribute",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_tree_view_column_add_attribute.invokeExact(handle(), cellRenderer.handle(), Interop.allocateNativeString(attribute).handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_cell_get_position = Interop.downcallHandle(
        "gtk_tree_view_column_cell_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the horizontal position and size of a cell in a column.
     * <p>
     * If the  cell is not found in the column, {@code start_pos} and {@code width}
     * are not changed and {@code false} is returned.
     */
    public boolean cellGetPosition(CellRenderer cellRenderer, PointerInteger xOffset, PointerInteger width) {
        try {
            var RESULT = (int) gtk_tree_view_column_cell_get_position.invokeExact(handle(), cellRenderer.handle(), xOffset.handle(), width.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_cell_get_size = Interop.downcallHandle(
        "gtk_tree_view_column_cell_get_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the width and height needed to render the column.  This is used
     * primarily by the {@code GtkTreeView}.
     */
    public void cellGetSize(PointerInteger xOffset, PointerInteger yOffset, PointerInteger width, PointerInteger height) {
        try {
            gtk_tree_view_column_cell_get_size.invokeExact(handle(), xOffset.handle(), yOffset.handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_cell_is_visible = Interop.downcallHandle(
        "gtk_tree_view_column_cell_is_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if any of the cells packed into the {@code tree_column} are visible.
     * For this to be meaningful, you must first initialize the cells with
     * gtk_tree_view_column_cell_set_cell_data()
     */
    public boolean cellIsVisible() {
        try {
            var RESULT = (int) gtk_tree_view_column_cell_is_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_cell_set_cell_data = Interop.downcallHandle(
        "gtk_tree_view_column_cell_set_cell_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cell renderer based on the {@code tree_model} and {@code iter}.  That is, for
     * every attribute mapping in {@code tree_column}, it will get a value from the set
     * column on the {@code iter}, and use that value to set the attribute on the cell
     * renderer.  This is used primarily by the {@code GtkTreeView}.
     */
    public void cellSetCellData(TreeModel treeModel, TreeIter iter, boolean isExpander, boolean isExpanded) {
        try {
            gtk_tree_view_column_cell_set_cell_data.invokeExact(handle(), treeModel.handle(), iter.handle(), isExpander ? 1 : 0, isExpanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_clear = Interop.downcallHandle(
        "gtk_tree_view_column_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unsets all the mappings on all renderers on the {@code tree_column}.
     */
    public void clear() {
        try {
            gtk_tree_view_column_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_clear_attributes = Interop.downcallHandle(
        "gtk_tree_view_column_clear_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Clears all existing attributes previously set with
     * gtk_tree_view_column_set_attributes().
     */
    public void clearAttributes(CellRenderer cellRenderer) {
        try {
            gtk_tree_view_column_clear_attributes.invokeExact(handle(), cellRenderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_clicked = Interop.downcallHandle(
        "gtk_tree_view_column_clicked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “clicked” signal on the column.  This function will only work if
     * {@code tree_column} is clickable.
     */
    public void clicked() {
        try {
            gtk_tree_view_column_clicked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_focus_cell = Interop.downcallHandle(
        "gtk_tree_view_column_focus_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current keyboard focus to be at {@code cell}, if the column contains
     * 2 or more editable and activatable cells.
     */
    public void focusCell(CellRenderer cell) {
        try {
            gtk_tree_view_column_focus_cell.invokeExact(handle(), cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_alignment = Interop.downcallHandle(
        "gtk_tree_view_column_get_alignment",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current x alignment of {@code tree_column}.  This value can range
     * between 0.0 and 1.0.
     */
    public float getAlignment() {
        try {
            var RESULT = (float) gtk_tree_view_column_get_alignment.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_button = Interop.downcallHandle(
        "gtk_tree_view_column_get_button",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the button used in the treeview column header
     */
    public Widget getButton() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_column_get_button.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_clickable = Interop.downcallHandle(
        "gtk_tree_view_column_get_clickable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the user can click on the header for the column.
     */
    public boolean getClickable() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_clickable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_expand = Interop.downcallHandle(
        "gtk_tree_view_column_get_expand",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the column expands to fill available space.
     */
    public boolean getExpand() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_expand.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_fixed_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_fixed_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * width of the column; for that, use gtk_tree_view_column_get_width().
     */
    public int getFixedWidth() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_fixed_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_max_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_max_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the maximum width in pixels of the {@code tree_column}, or -1 if no maximum
     * width is set.
     */
    public int getMaxWidth() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_max_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_min_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_min_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the minimum width in pixels of the {@code tree_column}, or -1 if no minimum
     * width is set.
     */
    public int getMinWidth() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_min_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_reorderable = Interop.downcallHandle(
        "gtk_tree_view_column_get_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code tree_column} can be reordered by the user.
     */
    public boolean getReorderable() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_reorderable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_resizable = Interop.downcallHandle(
        "gtk_tree_view_column_get_resizable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code tree_column} can be resized by the end user.
     */
    public boolean getResizable() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_resizable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_sizing = Interop.downcallHandle(
        "gtk_tree_view_column_get_sizing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current type of {@code tree_column}.
     */
    public TreeViewColumnSizing getSizing() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_sizing.invokeExact(handle());
            return new TreeViewColumnSizing(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_sort_column_id = Interop.downcallHandle(
        "gtk_tree_view_column_get_sort_column_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the logical {@code sort_column_id} that the model sorts on
     * when this column is selected for sorting.
     * <p>
     * See {@link TreeViewColumn#setSortColumnId}.
     */
    public int getSortColumnId() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_sort_column_id.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_sort_indicator = Interop.downcallHandle(
        "gtk_tree_view_column_get_sort_indicator",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     */
    public boolean getSortIndicator() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_sort_indicator.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_sort_order = Interop.downcallHandle(
        "gtk_tree_view_column_get_sort_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     */
    public SortType getSortOrder() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_sort_order.invokeExact(handle());
            return new SortType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_spacing = Interop.downcallHandle(
        "gtk_tree_view_column_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the spacing of {@code tree_column}.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_title = Interop.downcallHandle(
        "gtk_tree_view_column_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the title of the widget.
     */
    public java.lang.String getTitle() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_column_get_title.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_tree_view = Interop.downcallHandle(
        "gtk_tree_view_column_get_tree_view",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkTreeView} wherein {@code tree_column} has been inserted.
     * If {@code column} is currently not inserted in any tree view, {@code null} is
     * returned.
     */
    public Widget getTreeView() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_column_get_tree_view.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_visible = Interop.downcallHandle(
        "gtk_tree_view_column_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code tree_column} is visible.
     */
    public boolean getVisible() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_widget = Interop.downcallHandle(
        "gtk_tree_view_column_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkWidget} in the button on the column header.
     * <p>
     * If a custom widget has not been set then {@code null} is returned.
     */
    public Widget getWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_column_get_widget.invokeExact(handle());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current size of {@code tree_column} in pixels.
     */
    public int getWidth() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_get_x_offset = Interop.downcallHandle(
        "gtk_tree_view_column_get_x_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current X offset of {@code tree_column} in pixels.
     */
    public int getXOffset() {
        try {
            var RESULT = (int) gtk_tree_view_column_get_x_offset.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_pack_end = Interop.downcallHandle(
        "gtk_tree_view_column_pack_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the {@code cell} to end of the column. If {@code expand} is {@code false}, then the {@code cell}
     * is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public void packEnd(CellRenderer cell, boolean expand) {
        try {
            gtk_tree_view_column_pack_end.invokeExact(handle(), cell.handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_pack_start = Interop.downcallHandle(
        "gtk_tree_view_column_pack_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Packs the {@code cell} into the beginning of the column. If {@code expand} is {@code false}, then
     * the {@code cell} is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public void packStart(CellRenderer cell, boolean expand) {
        try {
            gtk_tree_view_column_pack_start.invokeExact(handle(), cell.handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_queue_resize = Interop.downcallHandle(
        "gtk_tree_view_column_queue_resize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Flags the column, and the cell renderers added to this column, to have
     * their sizes renegotiated.
     */
    public void queueResize() {
        try {
            gtk_tree_view_column_queue_resize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_alignment = Interop.downcallHandle(
        "gtk_tree_view_column_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * The alignment determines its location inside the button -- 0.0 for left, 0.5
     * for center, 1.0 for right.
     */
    public void setAlignment(float xalign) {
        try {
            gtk_tree_view_column_set_alignment.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_cell_data_func = Interop.downcallHandle(
        "gtk_tree_view_column_set_cell_data_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_tree_view_column_set_cell_data_func.invokeExact(handle(), cellRenderer.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeCellDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_clickable = Interop.downcallHandle(
        "gtk_tree_view_column_set_clickable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the header to be active if {@code clickable} is {@code true}.  When the header is
     * active, then it can take keyboard focus, and can be clicked.
     */
    public void setClickable(boolean clickable) {
        try {
            gtk_tree_view_column_set_clickable.invokeExact(handle(), clickable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_expand = Interop.downcallHandle(
        "gtk_tree_view_column_set_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_tree_view_column_set_expand.invokeExact(handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_fixed_width = Interop.downcallHandle(
        "gtk_tree_view_column_set_fixed_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_tree_view_column_set_fixed_width.invokeExact(handle(), fixedWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_max_width = Interop.downcallHandle(
        "gtk_tree_view_column_set_max_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum width of the {@code tree_column}.  If {@code max_width} is -1, then the
     * maximum width is unset.  Note, the column can actually be wider than max
     * width if it’s the last column in a view.  In this case, the column expands to
     * fill any extra space.
     */
    public void setMaxWidth(int maxWidth) {
        try {
            gtk_tree_view_column_set_max_width.invokeExact(handle(), maxWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_min_width = Interop.downcallHandle(
        "gtk_tree_view_column_set_min_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the minimum width of the {@code tree_column}.  If {@code min_width} is -1, then the
     * minimum width is unset.
     */
    public void setMinWidth(int minWidth) {
        try {
            gtk_tree_view_column_set_min_width.invokeExact(handle(), minWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_reorderable = Interop.downcallHandle(
        "gtk_tree_view_column_set_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code reorderable} is {@code true}, then the column can be reordered by the end user
     * dragging the header.
     */
    public void setReorderable(boolean reorderable) {
        try {
            gtk_tree_view_column_set_reorderable.invokeExact(handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_resizable = Interop.downcallHandle(
        "gtk_tree_view_column_set_resizable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code resizable} is {@code true}, then the user can explicitly resize the column by
     * grabbing the outer edge of the column button.
     * <p>
     * If resizable is {@code true} and
     * sizing mode of the column is {@link TreeViewColumnSizing#AUTOSIZE}, then the sizing
     * mode is changed to {@link TreeViewColumnSizing#GROW_ONLY}.
     */
    public void setResizable(boolean resizable) {
        try {
            gtk_tree_view_column_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_sizing = Interop.downcallHandle(
        "gtk_tree_view_column_set_sizing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the growth behavior of {@code tree_column} to {@code type}.
     */
    public void setSizing(TreeViewColumnSizing type) {
        try {
            gtk_tree_view_column_set_sizing.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_sort_column_id = Interop.downcallHandle(
        "gtk_tree_view_column_set_sort_column_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the logical {@code sort_column_id} that this column sorts on when this column
     * is selected for sorting.  Doing so makes the column header clickable.
     */
    public void setSortColumnId(int sortColumnId) {
        try {
            gtk_tree_view_column_set_sort_column_id.invokeExact(handle(), sortColumnId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_sort_indicator = Interop.downcallHandle(
        "gtk_tree_view_column_set_sort_indicator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Call this function with a {@code setting} of {@code true} to display an arrow in
     * the header button indicating the column is sorted. Call
     * gtk_tree_view_column_set_sort_order() to change the direction of
     * the arrow.
     */
    public void setSortIndicator(boolean setting) {
        try {
            gtk_tree_view_column_set_sort_indicator.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_sort_order = Interop.downcallHandle(
        "gtk_tree_view_column_set_sort_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_tree_view_column_set_sort_order.invokeExact(handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_spacing = Interop.downcallHandle(
        "gtk_tree_view_column_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the spacing field of {@code tree_column}, which is the number of pixels to
     * place between cell renderers packed into it.
     */
    public void setSpacing(int spacing) {
        try {
            gtk_tree_view_column_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_title = Interop.downcallHandle(
        "gtk_tree_view_column_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of the {@code tree_column}.  If a custom widget has been set, then
     * this value is ignored.
     */
    public void setTitle(java.lang.String title) {
        try {
            gtk_tree_view_column_set_title.invokeExact(handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_visible = Interop.downcallHandle(
        "gtk_tree_view_column_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the visibility of {@code tree_column}.
     */
    public void setVisible(boolean visible) {
        try {
            gtk_tree_view_column_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_column_set_widget = Interop.downcallHandle(
        "gtk_tree_view_column_set_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget in the header to be {@code widget}.  If widget is {@code null}, then the
     * header button is set with a {@code GtkLabel} set to the title of {@code tree_column}.
     */
    public void setWidget(Widget widget) {
        try {
            gtk_tree_view_column_set_widget.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clicked").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeViewColumn.Callbacks.class, "signalTreeViewColumnClicked",
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
    
        public static void signalTreeViewColumnClicked(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeViewColumn.ClickedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeViewColumn(Refcounted.get(source)));
        }
        
    }
}
