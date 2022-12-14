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
public class TreeViewColumn extends org.gtk.gobject.InitiallyUnowned implements org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewColumn";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TreeViewColumn proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeViewColumn(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeViewColumn> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeViewColumn(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn}.
     */
    public TreeViewColumn() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithArea(org.gtk.gtk.CellArea area) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_new_with_area.invokeExact(area.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkTreeViewColumn} using {@code area} to render its cells.
     * @param area the {@code GtkCellArea} that the newly created column should use to layout cells.
     * @return A newly created {@code GtkTreeViewColumn}.
     */
    public static TreeViewColumn newWithArea(org.gtk.gtk.CellArea area) {
        var RESULT = constructNewWithArea(area);
        var OBJECT = (org.gtk.gtk.TreeViewColumn) Interop.register(RESULT, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWithAttributes(java.lang.String title, org.gtk.gtk.CellRenderer cell, java.lang.Object... varargs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_new_with_attributes.invokeExact(
                        Marshal.stringToAddress.marshal(title, SCOPE),
                        cell.handle(),
                        varargs);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new {@code GtkTreeViewColumn} with a number of default values.
     * This is equivalent to calling gtk_tree_view_column_set_title(),
     * gtk_tree_view_column_pack_start(), and
     * gtk_tree_view_column_set_attributes() on the newly created {@code GtkTreeViewColumn}.
     * <p>
     * Here???s a simple example:
     * <pre>{@code <!-- language="C" -->
     *  enum { TEXT_COLUMN, COLOR_COLUMN, N_COLUMNS };
     *  // ...
     *  {
     *    GtkTreeViewColumn *column;
     *    GtkCellRenderer   *renderer = gtk_cell_renderer_text_new ();
     *  
     *    column = gtk_tree_view_column_new_with_attributes ("Title",
     *                                                       renderer,
     *                                                       "text", TEXT_COLUMN,
     *                                                       "foreground", COLOR_COLUMN,
     *                                                       NULL);
     *  }
     * }</pre>
     * @param title The title to set the header to
     * @param cell The {@code GtkCellRenderer}
     * @param varargs A {@code null}-terminated list of attributes
     * @return A newly created {@code GtkTreeViewColumn}.
     */
    public static TreeViewColumn newWithAttributes(java.lang.String title, org.gtk.gtk.CellRenderer cell, java.lang.Object... varargs) {
        var RESULT = constructNewWithAttributes(title, cell, varargs);
        var OBJECT = (org.gtk.gtk.TreeViewColumn) Interop.register(RESULT, org.gtk.gtk.TreeViewColumn.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds an attribute mapping to the list in {@code tree_column}.
     * <p>
     * The {@code column} is the
     * column of the model to get a value from, and the {@code attribute} is the
     * parameter on {@code cell_renderer} to be set from the value. So for example
     * if column 2 of the model contains strings, you could have the
     * ???text??? attribute of a {@code GtkCellRendererText} get its values from
     * column 2.
     * @param cellRenderer the {@code GtkCellRenderer} to set attributes on
     * @param attribute An attribute on the renderer
     * @param column The column position on the model to get the attribute from.
     */
    public void addAttribute(org.gtk.gtk.CellRenderer cellRenderer, java.lang.String attribute, int column) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tree_view_column_add_attribute.invokeExact(
                        handle(),
                        cellRenderer.handle(),
                        Marshal.stringToAddress.marshal(attribute, SCOPE),
                        column);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Obtains the horizontal position and size of a cell in a column.
     * <p>
     * If the  cell is not found in the column, {@code start_pos} and {@code width}
     * are not changed and {@code false} is returned.
     * @param cellRenderer a {@code GtkCellRenderer}
     * @param xOffset return location for the horizontal
     *   position of {@code cell} within {@code tree_column}
     * @param width return location for the width of {@code cell}
     * @return {@code true} if {@code cell} belongs to {@code tree_column}
     */
    public boolean cellGetPosition(org.gtk.gtk.CellRenderer cellRenderer, Out<Integer> xOffset, Out<Integer> width) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xOffsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_tree_view_column_cell_get_position.invokeExact(
                        handle(),
                        cellRenderer.handle(),
                        (Addressable) (xOffset == null ? MemoryAddress.NULL : (Addressable) xOffsetPOINTER.address()),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (xOffset != null) xOffset.set(xOffsetPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Obtains the width and height needed to render the column.  This is used
     * primarily by the {@code GtkTreeView}.
     * @param xOffset location to return x offset of a cell relative to {@code cell_area}
     * @param yOffset location to return y offset of a cell relative to {@code cell_area}
     * @param width location to return width needed to render a cell
     * @param height location to return height needed to render a cell
     */
    public void cellGetSize(Out<Integer> xOffset, Out<Integer> yOffset, Out<Integer> width, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment xOffsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment yOffsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_tree_view_column_cell_get_size.invokeExact(
                        handle(),
                        (Addressable) (xOffset == null ? MemoryAddress.NULL : (Addressable) xOffsetPOINTER.address()),
                        (Addressable) (yOffset == null ? MemoryAddress.NULL : (Addressable) yOffsetPOINTER.address()),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (xOffset != null) xOffset.set(xOffsetPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (yOffset != null) yOffset.set(yOffsetPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Returns {@code true} if any of the cells packed into the {@code tree_column} are visible.
     * For this to be meaningful, you must first initialize the cells with
     * gtk_tree_view_column_cell_set_cell_data()
     * @return {@code true}, if any of the cells packed into the {@code tree_column} are currently visible
     */
    public boolean cellIsVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_cell_is_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the cell renderer based on the {@code tree_model} and {@code iter}.  That is, for
     * every attribute mapping in {@code tree_column}, it will get a value from the set
     * column on the {@code iter}, and use that value to set the attribute on the cell
     * renderer.  This is used primarily by the {@code GtkTreeView}.
     * @param treeModel The {@code GtkTreeModel} to get the cell renderers attributes from.
     * @param iter The {@code GtkTreeIter} to get the cell renderer???s attributes from.
     * @param isExpander {@code true}, if the row has children
     * @param isExpanded {@code true}, if the row has visible children
     */
    public void cellSetCellData(org.gtk.gtk.TreeModel treeModel, org.gtk.gtk.TreeIter iter, boolean isExpander, boolean isExpanded) {
        try {
            DowncallHandles.gtk_tree_view_column_cell_set_cell_data.invokeExact(
                    handle(),
                    treeModel.handle(),
                    iter.handle(),
                    Marshal.booleanToInteger.marshal(isExpander, null).intValue(),
                    Marshal.booleanToInteger.marshal(isExpanded, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets all the mappings on all renderers on the {@code tree_column}.
     */
    public void clear() {
        try {
            DowncallHandles.gtk_tree_view_column_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clears all existing attributes previously set with
     * gtk_tree_view_column_set_attributes().
     * @param cellRenderer a {@code GtkCellRenderer} to clear the attribute mapping on.
     */
    public void clearAttributes(org.gtk.gtk.CellRenderer cellRenderer) {
        try {
            DowncallHandles.gtk_tree_view_column_clear_attributes.invokeExact(
                    handle(),
                    cellRenderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the ???clicked??? signal on the column.  This function will only work if
     * {@code tree_column} is clickable.
     */
    public void clicked() {
        try {
            DowncallHandles.gtk_tree_view_column_clicked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current keyboard focus to be at {@code cell}, if the column contains
     * 2 or more editable and activatable cells.
     * @param cell A {@code GtkCellRenderer}
     */
    public void focusCell(org.gtk.gtk.CellRenderer cell) {
        try {
            DowncallHandles.gtk_tree_view_column_focus_cell.invokeExact(
                    handle(),
                    cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the current x alignment of {@code tree_column}.  This value can range
     * between 0.0 and 1.0.
     * @return The current alignent of {@code tree_column}.
     */
    public float getAlignment() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_tree_view_column_get_alignment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the button used in the treeview column header
     * @return The button for the column header.
     */
    public org.gtk.gtk.Widget getButton() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_get_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns {@code true} if the user can click on the header for the column.
     * @return {@code true} if user can click the column header.
     */
    public boolean getClickable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_clickable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the column expands to fill available space.
     * @return {@code true} if the column expands to fill available space.
     */
    public boolean getExpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_expand.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the fixed width of the column.  This may not be the actual displayed
     * width of the column; for that, use gtk_tree_view_column_get_width().
     * @return The fixed width of the column.
     */
    public int getFixedWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_fixed_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the maximum width in pixels of the {@code tree_column}, or -1 if no maximum
     * width is set.
     * @return The maximum width of the {@code tree_column}.
     */
    public int getMaxWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_max_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the minimum width in pixels of the {@code tree_column}, or -1 if no minimum
     * width is set.
     * @return The minimum width of the {@code tree_column}.
     */
    public int getMinWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_min_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the {@code tree_column} can be reordered by the user.
     * @return {@code true} if the {@code tree_column} can be reordered by the user.
     */
    public boolean getReorderable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_reorderable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the {@code tree_column} can be resized by the end user.
     * @return {@code true}, if the {@code tree_column} can be resized.
     */
    public boolean getResizable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_resizable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the current type of {@code tree_column}.
     * @return The type of {@code tree_column}.
     */
    public org.gtk.gtk.TreeViewColumnSizing getSizing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_sizing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.TreeViewColumnSizing.of(RESULT);
    }
    
    /**
     * Gets the logical {@code sort_column_id} that the model sorts on
     * when this column is selected for sorting.
     * <p>
     * See {@link TreeViewColumn#setSortColumnId}.
     * @return the current {@code sort_column_id} for this column, or -1 if
     *   this column can???t be used for sorting
     */
    public int getSortColumnId() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_sort_column_id.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_indicator().
     * @return whether the sort indicator arrow is displayed
     */
    public boolean getSortIndicator() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_sort_indicator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value set by gtk_tree_view_column_set_sort_order().
     * @return the sort order the sort indicator is indicating
     */
    public org.gtk.gtk.SortType getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_sort_order.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SortType.of(RESULT);
    }
    
    /**
     * Returns the spacing of {@code tree_column}.
     * @return the spacing of {@code tree_column}.
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the title of the widget.
     * @return the title of the column. This string should not be
     * modified or freed.
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_get_title.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GtkTreeView} wherein {@code tree_column} has been inserted.
     * If {@code column} is currently not inserted in any tree view, {@code null} is
     * returned.
     * @return The tree view wherein {@code column}
     *   has been inserted
     */
    public @Nullable org.gtk.gtk.Widget getTreeView() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_get_tree_view.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns {@code true} if {@code tree_column} is visible.
     * @return whether the column is visible or not.  If it is visible, then
     * the tree will show the column.
     */
    public boolean getVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the {@code GtkWidget} in the button on the column header.
     * <p>
     * If a custom widget has not been set then {@code null} is returned.
     * @return The {@code GtkWidget} in the column header
     */
    public @Nullable org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_column_get_widget.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the current size of {@code tree_column} in pixels.
     * @return The current width of {@code tree_column}.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the current X offset of {@code tree_column} in pixels.
     * @return The current X offset of {@code tree_column}.
     */
    public int getXOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_column_get_x_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Adds the {@code cell} to end of the column. If {@code expand} is {@code false}, then the {@code cell}
     * is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     * @param cell The {@code GtkCellRenderer}
     * @param expand {@code true} if {@code cell} is to be given extra space allocated to {@code tree_column}.
     */
    public void packEnd(org.gtk.gtk.CellRenderer cell, boolean expand) {
        try {
            DowncallHandles.gtk_tree_view_column_pack_end.invokeExact(
                    handle(),
                    cell.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Packs the {@code cell} into the beginning of the column. If {@code expand} is {@code false}, then
     * the {@code cell} is allocated no more space than it needs. Any unused space is divided
     * evenly between cells for which {@code expand} is {@code true}.
     * @param cell The {@code GtkCellRenderer}
     * @param expand {@code true} if {@code cell} is to be given extra space allocated to {@code tree_column}.
     */
    public void packStart(org.gtk.gtk.CellRenderer cell, boolean expand) {
        try {
            DowncallHandles.gtk_tree_view_column_pack_start.invokeExact(
                    handle(),
                    cell.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Flags the column, and the cell renderers added to this column, to have
     * their sizes renegotiated.
     */
    public void queueResize() {
        try {
            DowncallHandles.gtk_tree_view_column_queue_resize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the alignment of the title or custom widget inside the column header.
     * The alignment determines its location inside the button -- 0.0 for left, 0.5
     * for center, 1.0 for right.
     * @param xalign The alignment, which is between [0.0 and 1.0] inclusive.
     */
    public void setAlignment(float xalign) {
        try {
            DowncallHandles.gtk_tree_view_column_set_alignment.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the attributes in the list as the attributes of {@code tree_column}.
     * <p>
     * The attributes should be in attribute/column order, as in
     * gtk_tree_view_column_add_attribute(). All existing attributes
     * are removed, and replaced with the new attributes.
     * @param cellRenderer the {@code GtkCellRenderer} we???re setting the attributes of
     * @param varargs A {@code null}-terminated list of attributes
     */
    public void setAttributes(org.gtk.gtk.CellRenderer cellRenderer, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_tree_view_column_set_attributes.invokeExact(
                    handle(),
                    cellRenderer.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkTreeCellDataFunc} to use for the column.
     * <p>
     * This
     * function is used instead of the standard attributes mapping for
     * setting the column value, and should set the value of {@code tree_column}'s
     * cell renderer as appropriate.  {@code func} may be {@code null} to remove an
     * older one.
     * @param cellRenderer A {@code GtkCellRenderer}
     * @param func The {@code GtkTreeCellDataFunc} to use.
     * @param destroy The destroy notification for {@code func_data}
     */
    public void setCellDataFunc(org.gtk.gtk.CellRenderer cellRenderer, @Nullable org.gtk.gtk.TreeCellDataFunc func, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_view_column_set_cell_data_func.invokeExact(
                    handle(),
                    cellRenderer.handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the header to be active if {@code clickable} is {@code true}.  When the header is
     * active, then it can take keyboard focus, and can be clicked.
     * @param clickable {@code true} if the header is active.
     */
    public void setClickable(boolean clickable) {
        try {
            DowncallHandles.gtk_tree_view_column_set_clickable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(clickable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the column to take available extra space.  This space is shared equally
     * amongst all columns that have the expand set to {@code true}.  If no column has this
     * option set, then the last column gets all extra space.  By default, every
     * column is created with this {@code false}.
     * <p>
     * Along with ???fixed-width???, the ???expand??? property changes when the column is
     * resized by the user.
     * @param expand {@code true} if the column should expand to fill available space.
     */
    public void setExpand(boolean expand) {
        try {
            DowncallHandles.gtk_tree_view_column_set_expand.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code fixed_width} is not -1, sets the fixed width of {@code tree_column}; otherwise
     * unsets it.  The effective value of {@code fixed_width} is clamped between the
     * minimum and maximum width of the column; however, the value stored in the
     * ???fixed-width??? property is not clamped.  If the column sizing is
     * {@link TreeViewColumnSizing#GROW_ONLY} or {@link TreeViewColumnSizing#AUTOSIZE}, setting
     * a fixed width overrides the automatically calculated width.  Note that
     * {@code fixed_width} is only a hint to GTK; the width actually allocated to the
     * column may be greater or less than requested.
     * <p>
     * Along with ???expand???, the ???fixed-width??? property changes when the column is
     * resized by the user.
     * @param fixedWidth The new fixed width, in pixels, or -1.
     */
    public void setFixedWidth(int fixedWidth) {
        try {
            DowncallHandles.gtk_tree_view_column_set_fixed_width.invokeExact(
                    handle(),
                    fixedWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum width of the {@code tree_column}.  If {@code max_width} is -1, then the
     * maximum width is unset.  Note, the column can actually be wider than max
     * width if it???s the last column in a view.  In this case, the column expands to
     * fill any extra space.
     * @param maxWidth The maximum width of the column in pixels, or -1.
     */
    public void setMaxWidth(int maxWidth) {
        try {
            DowncallHandles.gtk_tree_view_column_set_max_width.invokeExact(
                    handle(),
                    maxWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum width of the {@code tree_column}.  If {@code min_width} is -1, then the
     * minimum width is unset.
     * @param minWidth The minimum width of the column in pixels, or -1.
     */
    public void setMinWidth(int minWidth) {
        try {
            DowncallHandles.gtk_tree_view_column_set_min_width.invokeExact(
                    handle(),
                    minWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code reorderable} is {@code true}, then the column can be reordered by the end user
     * dragging the header.
     * @param reorderable {@code true}, if the column can be reordered.
     */
    public void setReorderable(boolean reorderable) {
        try {
            DowncallHandles.gtk_tree_view_column_set_reorderable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(reorderable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code resizable} is {@code true}, then the user can explicitly resize the column by
     * grabbing the outer edge of the column button.
     * <p>
     * If resizable is {@code true} and
     * sizing mode of the column is {@link TreeViewColumnSizing#AUTOSIZE}, then the sizing
     * mode is changed to {@link TreeViewColumnSizing#GROW_ONLY}.
     * @param resizable {@code true}, if the column can be resized
     */
    public void setResizable(boolean resizable) {
        try {
            DowncallHandles.gtk_tree_view_column_set_resizable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(resizable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the growth behavior of {@code tree_column} to {@code type}.
     * @param type The {@code GtkTreeViewColumn}Sizing.
     */
    public void setSizing(org.gtk.gtk.TreeViewColumnSizing type) {
        try {
            DowncallHandles.gtk_tree_view_column_set_sizing.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the logical {@code sort_column_id} that this column sorts on when this column
     * is selected for sorting.  Doing so makes the column header clickable.
     * @param sortColumnId The {@code sort_column_id} of the model to sort on.
     */
    public void setSortColumnId(int sortColumnId) {
        try {
            DowncallHandles.gtk_tree_view_column_set_sort_column_id.invokeExact(
                    handle(),
                    sortColumnId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Call this function with a {@code setting} of {@code true} to display an arrow in
     * the header button indicating the column is sorted. Call
     * gtk_tree_view_column_set_sort_order() to change the direction of
     * the arrow.
     * @param setting {@code true} to display an indicator that the column is sorted
     */
    public void setSortIndicator(boolean setting) {
        try {
            DowncallHandles.gtk_tree_view_column_set_sort_indicator.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param order sort order that the sort indicator should indicate
     */
    public void setSortOrder(org.gtk.gtk.SortType order) {
        try {
            DowncallHandles.gtk_tree_view_column_set_sort_order.invokeExact(
                    handle(),
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the spacing field of {@code tree_column}, which is the number of pixels to
     * place between cell renderers packed into it.
     * @param spacing distance between cell renderers in pixels.
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_tree_view_column_set_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of the {@code tree_column}.  If a custom widget has been set, then
     * this value is ignored.
     * @param title The title of the {@code tree_column}.
     */
    public void setTitle(java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_tree_view_column_set_title.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the visibility of {@code tree_column}.
     * @param visible {@code true} if the {@code tree_column} is visible.
     */
    public void setVisible(boolean visible) {
        try {
            DowncallHandles.gtk_tree_view_column_set_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(visible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the widget in the header to be {@code widget}.  If widget is {@code null}, then the
     * header button is set with a {@code GtkLabel} set to the title of {@code tree_column}.
     * @param widget A child {@code GtkWidget}
     */
    public void setWidget(@Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_tree_view_column_set_widget.invokeExact(
                    handle(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
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
            RESULT = (long) DowncallHandles.gtk_tree_view_column_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Clicked} callback.
     */
    @FunctionalInterface
    public interface Clicked {
    
        /**
         * Emitted when the column's header has been clicked.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeViewColumn) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Clicked.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the column's header has been clicked.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeViewColumn.Clicked> onClicked(TreeViewColumn.Clicked handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("clicked", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TreeViewColumn.Builder} object constructs a {@link TreeViewColumn} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeViewColumn.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.InitiallyUnowned.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeViewColumn} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeViewColumn}.
         * @return A new instance of {@code TreeViewColumn} with the properties 
         *         that were set in the Builder object.
         */
        public TreeViewColumn build() {
            return (TreeViewColumn) org.gtk.gobject.GObject.newWithProperties(
                TreeViewColumn.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAlignment(float alignment) {
            names.add("alignment");
            values.add(org.gtk.gobject.Value.create(alignment));
            return this;
        }
        
        /**
         * The {@code GtkCellArea} used to layout cell renderers for this column.
         * <p>
         * If no area is specified when creating the tree view column with gtk_tree_view_column_new_with_area()
         * a horizontally oriented {@code GtkCellAreaBox} will be used.
         * @param cellArea The value for the {@code cell-area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCellArea(org.gtk.gtk.CellArea cellArea) {
            names.add("cell-area");
            values.add(org.gtk.gobject.Value.create(cellArea));
            return this;
        }
        
        public Builder setClickable(boolean clickable) {
            names.add("clickable");
            values.add(org.gtk.gobject.Value.create(clickable));
            return this;
        }
        
        public Builder setExpand(boolean expand) {
            names.add("expand");
            values.add(org.gtk.gobject.Value.create(expand));
            return this;
        }
        
        public Builder setFixedWidth(int fixedWidth) {
            names.add("fixed-width");
            values.add(org.gtk.gobject.Value.create(fixedWidth));
            return this;
        }
        
        public Builder setMaxWidth(int maxWidth) {
            names.add("max-width");
            values.add(org.gtk.gobject.Value.create(maxWidth));
            return this;
        }
        
        public Builder setMinWidth(int minWidth) {
            names.add("min-width");
            values.add(org.gtk.gobject.Value.create(minWidth));
            return this;
        }
        
        public Builder setReorderable(boolean reorderable) {
            names.add("reorderable");
            values.add(org.gtk.gobject.Value.create(reorderable));
            return this;
        }
        
        public Builder setResizable(boolean resizable) {
            names.add("resizable");
            values.add(org.gtk.gobject.Value.create(resizable));
            return this;
        }
        
        public Builder setSizing(org.gtk.gtk.TreeViewColumnSizing sizing) {
            names.add("sizing");
            values.add(org.gtk.gobject.Value.create(sizing));
            return this;
        }
        
        /**
         * Logical sort column ID this column sorts on when selected for sorting. Setting the sort column ID makes the column header
         * clickable. Set to -1 to make the column unsortable.
         * @param sortColumnId The value for the {@code sort-column-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSortColumnId(int sortColumnId) {
            names.add("sort-column-id");
            values.add(org.gtk.gobject.Value.create(sortColumnId));
            return this;
        }
        
        public Builder setSortIndicator(boolean sortIndicator) {
            names.add("sort-indicator");
            values.add(org.gtk.gobject.Value.create(sortIndicator));
            return this;
        }
        
        public Builder setSortOrder(org.gtk.gtk.SortType sortOrder) {
            names.add("sort-order");
            values.add(org.gtk.gobject.Value.create(sortOrder));
            return this;
        }
        
        public Builder setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
        
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        public Builder setVisible(boolean visible) {
            names.add("visible");
            values.add(org.gtk.gobject.Value.create(visible));
            return this;
        }
        
        public Builder setWidget(org.gtk.gtk.Widget widget) {
            names.add("widget");
            values.add(org.gtk.gobject.Value.create(widget));
            return this;
        }
        
        public Builder setWidth(int width) {
            names.add("width");
            values.add(org.gtk.gobject.Value.create(width));
            return this;
        }
        
        public Builder setXOffset(int xOffset) {
            names.add("x-offset");
            values.add(org.gtk.gobject.Value.create(xOffset));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_view_column_new = Interop.downcallHandle(
                "gtk_tree_view_column_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_new_with_area = Interop.downcallHandle(
                "gtk_tree_view_column_new_with_area",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_new_with_attributes = Interop.downcallHandle(
                "gtk_tree_view_column_new_with_attributes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_tree_view_column_add_attribute = Interop.downcallHandle(
                "gtk_tree_view_column_add_attribute",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_cell_get_position = Interop.downcallHandle(
                "gtk_tree_view_column_cell_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_cell_get_size = Interop.downcallHandle(
                "gtk_tree_view_column_cell_get_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_cell_is_visible = Interop.downcallHandle(
                "gtk_tree_view_column_cell_is_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_cell_set_cell_data = Interop.downcallHandle(
                "gtk_tree_view_column_cell_set_cell_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_clear = Interop.downcallHandle(
                "gtk_tree_view_column_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_clear_attributes = Interop.downcallHandle(
                "gtk_tree_view_column_clear_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_clicked = Interop.downcallHandle(
                "gtk_tree_view_column_clicked",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_focus_cell = Interop.downcallHandle(
                "gtk_tree_view_column_focus_cell",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_alignment = Interop.downcallHandle(
                "gtk_tree_view_column_get_alignment",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_button = Interop.downcallHandle(
                "gtk_tree_view_column_get_button",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_clickable = Interop.downcallHandle(
                "gtk_tree_view_column_get_clickable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_expand = Interop.downcallHandle(
                "gtk_tree_view_column_get_expand",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_fixed_width = Interop.downcallHandle(
                "gtk_tree_view_column_get_fixed_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_max_width = Interop.downcallHandle(
                "gtk_tree_view_column_get_max_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_min_width = Interop.downcallHandle(
                "gtk_tree_view_column_get_min_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_reorderable = Interop.downcallHandle(
                "gtk_tree_view_column_get_reorderable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_resizable = Interop.downcallHandle(
                "gtk_tree_view_column_get_resizable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_sizing = Interop.downcallHandle(
                "gtk_tree_view_column_get_sizing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_sort_column_id = Interop.downcallHandle(
                "gtk_tree_view_column_get_sort_column_id",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_sort_indicator = Interop.downcallHandle(
                "gtk_tree_view_column_get_sort_indicator",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_sort_order = Interop.downcallHandle(
                "gtk_tree_view_column_get_sort_order",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_spacing = Interop.downcallHandle(
                "gtk_tree_view_column_get_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_title = Interop.downcallHandle(
                "gtk_tree_view_column_get_title",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_tree_view = Interop.downcallHandle(
                "gtk_tree_view_column_get_tree_view",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_visible = Interop.downcallHandle(
                "gtk_tree_view_column_get_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_widget = Interop.downcallHandle(
                "gtk_tree_view_column_get_widget",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_width = Interop.downcallHandle(
                "gtk_tree_view_column_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_x_offset = Interop.downcallHandle(
                "gtk_tree_view_column_get_x_offset",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_pack_end = Interop.downcallHandle(
                "gtk_tree_view_column_pack_end",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_pack_start = Interop.downcallHandle(
                "gtk_tree_view_column_pack_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_queue_resize = Interop.downcallHandle(
                "gtk_tree_view_column_queue_resize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_alignment = Interop.downcallHandle(
                "gtk_tree_view_column_set_alignment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_attributes = Interop.downcallHandle(
                "gtk_tree_view_column_set_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                true
        );
        
        private static final MethodHandle gtk_tree_view_column_set_cell_data_func = Interop.downcallHandle(
                "gtk_tree_view_column_set_cell_data_func",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_clickable = Interop.downcallHandle(
                "gtk_tree_view_column_set_clickable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_expand = Interop.downcallHandle(
                "gtk_tree_view_column_set_expand",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_fixed_width = Interop.downcallHandle(
                "gtk_tree_view_column_set_fixed_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_max_width = Interop.downcallHandle(
                "gtk_tree_view_column_set_max_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_min_width = Interop.downcallHandle(
                "gtk_tree_view_column_set_min_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_reorderable = Interop.downcallHandle(
                "gtk_tree_view_column_set_reorderable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_resizable = Interop.downcallHandle(
                "gtk_tree_view_column_set_resizable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_sizing = Interop.downcallHandle(
                "gtk_tree_view_column_set_sizing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_sort_column_id = Interop.downcallHandle(
                "gtk_tree_view_column_set_sort_column_id",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_sort_indicator = Interop.downcallHandle(
                "gtk_tree_view_column_set_sort_indicator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_sort_order = Interop.downcallHandle(
                "gtk_tree_view_column_set_sort_order",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_spacing = Interop.downcallHandle(
                "gtk_tree_view_column_set_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_title = Interop.downcallHandle(
                "gtk_tree_view_column_set_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_visible = Interop.downcallHandle(
                "gtk_tree_view_column_set_visible",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_set_widget = Interop.downcallHandle(
                "gtk_tree_view_column_set_widget",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_tree_view_column_get_type = Interop.downcallHandle(
                "gtk_tree_view_column_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_tree_view_column_get_type != null;
    }
}
