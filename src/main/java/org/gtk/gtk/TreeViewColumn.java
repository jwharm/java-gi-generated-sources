package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_tree_view_column_new = Interop.downcallHandle(
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
    
    private static final MethodHandle gtk_tree_view_column_new_with_area = Interop.downcallHandle(
        "gtk_tree_view_column_new_with_area",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithArea(@NotNull CellArea area) {
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
    public static TreeViewColumn newWithArea(@NotNull CellArea area) {
        return new TreeViewColumn(constructNewWithArea(area));
    }
    
    private static final MethodHandle gtk_tree_view_column_add_attribute = Interop.downcallHandle(
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
    public @NotNull void addAttribute(@NotNull CellRenderer cellRenderer, @NotNull java.lang.String attribute, @NotNull int column) {
        try {
            gtk_tree_view_column_add_attribute.invokeExact(handle(), cellRenderer.handle(), Interop.allocateNativeString(attribute), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_cell_get_position = Interop.downcallHandle(
        "gtk_tree_view_column_cell_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the horizontal position and size of a cell in a column.
     * <p>
     * If the  cell is not found in the column, {@code start_pos} and {@code width}
     * are not changed and {@code false} is returned.
     */
    public boolean cellGetPosition(@NotNull CellRenderer cellRenderer, @NotNull Out<Integer> xOffset, @NotNull Out<Integer> width) {
        MemorySegment xOffsetPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_cell_get_position.invokeExact(handle(), cellRenderer.handle(), (Addressable) xOffsetPOINTER.address(), (Addressable) widthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xOffset.set(xOffsetPOINTER.get(ValueLayout.JAVA_INT, 0));
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_cell_get_size = Interop.downcallHandle(
        "gtk_tree_view_column_cell_get_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the width and height needed to render the column.  This is used
     * primarily by the {@code GtkTreeView}.
     */
    public @NotNull void cellGetSize(@NotNull Out<Integer> xOffset, @NotNull Out<Integer> yOffset, @NotNull Out<Integer> width, @NotNull Out<Integer> height) {
        MemorySegment xOffsetPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment yOffsetPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gtk_tree_view_column_cell_get_size.invokeExact(handle(), (Addressable) xOffsetPOINTER.address(), (Addressable) yOffsetPOINTER.address(), (Addressable) widthPOINTER.address(), (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        xOffset.set(xOffsetPOINTER.get(ValueLayout.JAVA_INT, 0));
        yOffset.set(yOffsetPOINTER.get(ValueLayout.JAVA_INT, 0));
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gtk_tree_view_column_cell_is_visible = Interop.downcallHandle(
        "gtk_tree_view_column_cell_is_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if any of the cells packed into the {@code tree_column} are visible.
     * For this to be meaningful, you must first initialize the cells with
     * gtk_tree_view_column_cell_set_cell_data()
     */
    public boolean cellIsVisible() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_cell_is_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_cell_set_cell_data = Interop.downcallHandle(
        "gtk_tree_view_column_cell_set_cell_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the cell renderer based on the {@code tree_model} and {@code iter}.  That is, for
     * every attribute mapping in {@code tree_column}, it will get a value from the set
     * column on the {@code iter}, and use that value to set the attribute on the cell
     * renderer.  This is used primarily by the {@code GtkTreeView}.
     */
    public @NotNull void cellSetCellData(@NotNull TreeModel treeModel, @NotNull TreeIter iter, @NotNull boolean isExpander, @NotNull boolean isExpanded) {
        try {
            gtk_tree_view_column_cell_set_cell_data.invokeExact(handle(), treeModel.handle(), iter.handle(), isExpander ? 1 : 0, isExpanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_clear = Interop.downcallHandle(
        "gtk_tree_view_column_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unsets all the mappings on all renderers on the {@code tree_column}.
     */
    public @NotNull void clear() {
        try {
            gtk_tree_view_column_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_clear_attributes = Interop.downcallHandle(
        "gtk_tree_view_column_clear_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Clears all existing attributes previously set with
     * gtk_tree_view_column_set_attributes().
     */
    public @NotNull void clearAttributes(@NotNull CellRenderer cellRenderer) {
        try {
            gtk_tree_view_column_clear_attributes.invokeExact(handle(), cellRenderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_clicked = Interop.downcallHandle(
        "gtk_tree_view_column_clicked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “clicked” signal on the column.  This function will only work if
     * {@code tree_column} is clickable.
     */
    public @NotNull void clicked() {
        try {
            gtk_tree_view_column_clicked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_focus_cell = Interop.downcallHandle(
        "gtk_tree_view_column_focus_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current keyboard focus to be at {@code cell}, if the column contains
     * 2 or more editable and activatable cells.
     */
    public @NotNull void focusCell(@NotNull CellRenderer cell) {
        try {
            gtk_tree_view_column_focus_cell.invokeExact(handle(), cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_get_alignment = Interop.downcallHandle(
        "gtk_tree_view_column_get_alignment",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current x alignment of {@code tree_column}.  This value can range
     * between 0.0 and 1.0.
     */
    public float getAlignment() {
        float RESULT;
        try {
            RESULT = (float) gtk_tree_view_column_get_alignment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_button = Interop.downcallHandle(
        "gtk_tree_view_column_get_button",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the button used in the treeview column header
     */
    public @NotNull Widget getButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_view_column_get_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_view_column_get_clickable = Interop.downcallHandle(
        "gtk_tree_view_column_get_clickable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the user can click on the header for the column.
     */
    public boolean getClickable() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_clickable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_expand = Interop.downcallHandle(
        "gtk_tree_view_column_get_expand",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the column expands to fill available space.
     */
    public boolean getExpand() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_expand.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_fixed_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_fixed_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * width of the column; for that, use gtk_tree_view_column_get_width().
     */
    public int getFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_fixed_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_max_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_max_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the maximum width in pixels of the {@code tree_column}, or -1 if no maximum
     * width is set.
     */
    public int getMaxWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_max_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_min_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_min_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the minimum width in pixels of the {@code tree_column}, or -1 if no minimum
     * width is set.
     */
    public int getMinWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_min_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_reorderable = Interop.downcallHandle(
        "gtk_tree_view_column_get_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code tree_column} can be reordered by the user.
     */
    public boolean getReorderable() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_reorderable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_resizable = Interop.downcallHandle(
        "gtk_tree_view_column_get_resizable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the {@code tree_column} can be resized by the end user.
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_resizable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_sizing = Interop.downcallHandle(
        "gtk_tree_view_column_get_sizing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current type of {@code tree_column}.
     */
    public @NotNull TreeViewColumnSizing getSizing() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_sizing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TreeViewColumnSizing(RESULT);
    }
    
    private static final MethodHandle gtk_tree_view_column_get_sort_column_id = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_sort_column_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_sort_indicator = Interop.downcallHandle(
        "gtk_tree_view_column_get_sort_indicator",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     */
    public boolean getSortIndicator() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_sort_indicator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_sort_order = Interop.downcallHandle(
        "gtk_tree_view_column_get_sort_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     */
    public @NotNull SortType getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_sort_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SortType(RESULT);
    }
    
    private static final MethodHandle gtk_tree_view_column_get_spacing = Interop.downcallHandle(
        "gtk_tree_view_column_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the spacing of {@code tree_column}.
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_title = Interop.downcallHandle(
        "gtk_tree_view_column_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the title of the widget.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_view_column_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_tree_view_column_get_tree_view = Interop.downcallHandle(
        "gtk_tree_view_column_get_tree_view",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkTreeView} wherein {@code tree_column} has been inserted.
     * If {@code column} is currently not inserted in any tree view, {@code null} is
     * returned.
     */
    public @Nullable Widget getTreeView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_view_column_get_tree_view.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_view_column_get_visible = Interop.downcallHandle(
        "gtk_tree_view_column_get_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code tree_column} is visible.
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_widget = Interop.downcallHandle(
        "gtk_tree_view_column_get_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkWidget} in the button on the column header.
     * <p>
     * If a custom widget has not been set then {@code null} is returned.
     */
    public @Nullable Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_tree_view_column_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_tree_view_column_get_width = Interop.downcallHandle(
        "gtk_tree_view_column_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current size of {@code tree_column} in pixels.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_get_x_offset = Interop.downcallHandle(
        "gtk_tree_view_column_get_x_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current X offset of {@code tree_column} in pixels.
     */
    public int getXOffset() {
        int RESULT;
        try {
            RESULT = (int) gtk_tree_view_column_get_x_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_tree_view_column_pack_end = Interop.downcallHandle(
        "gtk_tree_view_column_pack_end",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds the {@code cell} to end of the column. If {@code expand} is {@code false}, then the {@code cell}
     * is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public @NotNull void packEnd(@NotNull CellRenderer cell, @NotNull boolean expand) {
        try {
            gtk_tree_view_column_pack_end.invokeExact(handle(), cell.handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_pack_start = Interop.downcallHandle(
        "gtk_tree_view_column_pack_start",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Packs the {@code cell} into the beginning of the column. If {@code expand} is {@code false}, then
     * the {@code cell} is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     */
    public @NotNull void packStart(@NotNull CellRenderer cell, @NotNull boolean expand) {
        try {
            gtk_tree_view_column_pack_start.invokeExact(handle(), cell.handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_queue_resize = Interop.downcallHandle(
        "gtk_tree_view_column_queue_resize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Flags the column, and the cell renderers added to this column, to have
     * their sizes renegotiated.
     */
    public @NotNull void queueResize() {
        try {
            gtk_tree_view_column_queue_resize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_alignment = Interop.downcallHandle(
        "gtk_tree_view_column_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * The alignment determines its location inside the button -- 0.0 for left, 0.5
     * for center, 1.0 for right.
     */
    public @NotNull void setAlignment(@NotNull float xalign) {
        try {
            gtk_tree_view_column_set_alignment.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_cell_data_func = Interop.downcallHandle(
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
    public @NotNull void setCellDataFunc(@NotNull CellRenderer cellRenderer, @Nullable TreeCellDataFunc func) {
        try {
            gtk_tree_view_column_set_cell_data_func.invokeExact(handle(), cellRenderer.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeCellDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_clickable = Interop.downcallHandle(
        "gtk_tree_view_column_set_clickable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the header to be active if {@code clickable} is {@code true}.  When the header is
     * active, then it can take keyboard focus, and can be clicked.
     */
    public @NotNull void setClickable(@NotNull boolean clickable) {
        try {
            gtk_tree_view_column_set_clickable.invokeExact(handle(), clickable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_expand = Interop.downcallHandle(
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
    public @NotNull void setExpand(@NotNull boolean expand) {
        try {
            gtk_tree_view_column_set_expand.invokeExact(handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_fixed_width = Interop.downcallHandle(
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
    public @NotNull void setFixedWidth(@NotNull int fixedWidth) {
        try {
            gtk_tree_view_column_set_fixed_width.invokeExact(handle(), fixedWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_max_width = Interop.downcallHandle(
        "gtk_tree_view_column_set_max_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum width of the {@code tree_column}.  If {@code max_width} is -1, then the
     * maximum width is unset.  Note, the column can actually be wider than max
     * width if it’s the last column in a view.  In this case, the column expands to
     * fill any extra space.
     */
    public @NotNull void setMaxWidth(@NotNull int maxWidth) {
        try {
            gtk_tree_view_column_set_max_width.invokeExact(handle(), maxWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_min_width = Interop.downcallHandle(
        "gtk_tree_view_column_set_min_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the minimum width of the {@code tree_column}.  If {@code min_width} is -1, then the
     * minimum width is unset.
     */
    public @NotNull void setMinWidth(@NotNull int minWidth) {
        try {
            gtk_tree_view_column_set_min_width.invokeExact(handle(), minWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_reorderable = Interop.downcallHandle(
        "gtk_tree_view_column_set_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code reorderable} is {@code true}, then the column can be reordered by the end user
     * dragging the header.
     */
    public @NotNull void setReorderable(@NotNull boolean reorderable) {
        try {
            gtk_tree_view_column_set_reorderable.invokeExact(handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_resizable = Interop.downcallHandle(
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
    public @NotNull void setResizable(@NotNull boolean resizable) {
        try {
            gtk_tree_view_column_set_resizable.invokeExact(handle(), resizable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_sizing = Interop.downcallHandle(
        "gtk_tree_view_column_set_sizing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the growth behavior of {@code tree_column} to {@code type}.
     */
    public @NotNull void setSizing(@NotNull TreeViewColumnSizing type) {
        try {
            gtk_tree_view_column_set_sizing.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_sort_column_id = Interop.downcallHandle(
        "gtk_tree_view_column_set_sort_column_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the logical {@code sort_column_id} that this column sorts on when this column
     * is selected for sorting.  Doing so makes the column header clickable.
     */
    public @NotNull void setSortColumnId(@NotNull int sortColumnId) {
        try {
            gtk_tree_view_column_set_sort_column_id.invokeExact(handle(), sortColumnId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_sort_indicator = Interop.downcallHandle(
        "gtk_tree_view_column_set_sort_indicator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Call this function with a {@code setting} of {@code true} to display an arrow in
     * the header button indicating the column is sorted. Call
     * gtk_tree_view_column_set_sort_order() to change the direction of
     * the arrow.
     */
    public @NotNull void setSortIndicator(@NotNull boolean setting) {
        try {
            gtk_tree_view_column_set_sort_indicator.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_sort_order = Interop.downcallHandle(
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
    public @NotNull void setSortOrder(@NotNull SortType order) {
        try {
            gtk_tree_view_column_set_sort_order.invokeExact(handle(), order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_spacing = Interop.downcallHandle(
        "gtk_tree_view_column_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the spacing field of {@code tree_column}, which is the number of pixels to
     * place between cell renderers packed into it.
     */
    public @NotNull void setSpacing(@NotNull int spacing) {
        try {
            gtk_tree_view_column_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_title = Interop.downcallHandle(
        "gtk_tree_view_column_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the title of the {@code tree_column}.  If a custom widget has been set, then
     * this value is ignored.
     */
    public @NotNull void setTitle(@NotNull java.lang.String title) {
        try {
            gtk_tree_view_column_set_title.invokeExact(handle(), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_visible = Interop.downcallHandle(
        "gtk_tree_view_column_set_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the visibility of {@code tree_column}.
     */
    public @NotNull void setVisible(@NotNull boolean visible) {
        try {
            gtk_tree_view_column_set_visible.invokeExact(handle(), visible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_tree_view_column_set_widget = Interop.downcallHandle(
        "gtk_tree_view_column_set_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget in the header to be {@code widget}.  If widget is {@code null}, then the
     * header button is set with a {@code GtkLabel} set to the title of {@code tree_column}.
     */
    public @NotNull void setWidget(@Nullable Widget widget) {
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
                Interop.allocateNativeString("clicked"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeViewColumn.Callbacks.class, "signalTreeViewColumnClicked",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
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
