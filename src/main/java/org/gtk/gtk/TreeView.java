package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget for displaying both trees and lists
 * <p>
 * Widget that displays any object that implements the {@code Gtk.TreeModel} interface.
 * <p>
 * Please refer to the <a href="section-tree-widget.html">tree widget conceptual overview</a>
 * for an overview of all the objects and data types related to the tree
 * widget and how they work together.
 * <p>
 * <h2>Coordinate systems in GtkTreeView API</h2>
 * <p>
 * Several different coordinate systems are exposed in the {@code GtkTreeView} API.
 * These are:
 * <p>
 * ![](tree-view-coordinates.png)
 * <p>
 * <ul>
 * <li>Widget coordinates: Coordinates relative to the widget (usually {@code widget->window}).
 * </ul>
 * <p>
 * <ul>
 * <li>Bin window coordinates: Coordinates relative to the window that GtkTreeView renders to.
 * </ul>
 * <p>
 * <ul>
 * <li>Tree coordinates: Coordinates relative to the entire scrollable area of GtkTreeView. These
 *   coordinates start at (0, 0) for row 0 of the tree.
 * </ul>
 * <p>
 * Several functions are available for converting between the different
 * coordinate systems.  The most common translations are between widget and bin
 * window coordinates and between bin window and tree coordinates. For the
 * former you can use {@link TreeView#convertWidgetToBinWindowCoords}
 * (and vice versa), for the latter {@link TreeView#convertBinWindowToTreeCoords}
 * (and vice versa).
 * <p>
 * <h2>`GtkTreeView` as `GtkBuildable`</h2>
 * <p>
 * The {@code GtkTreeView} implementation of the {@code GtkBuildable} interface accepts
 * {@link TreeViewColumn} objects as {@code <child>} elements and exposes the
 * internal {@link TreeSelection} in UI definitions.
 * <p>
 * An example of a UI definition fragment with {@code GtkTreeView}:
 * <p>
 * <pre>{@code xml
 * <object class="GtkTreeView" id="treeview">
 *   <property name="model">liststore1</property>
 *   <child>
 *     <object class="GtkTreeViewColumn" id="test-column">
 *       <property name="title">Test</property>
 *       <child>
 *         <object class="GtkCellRendererText" id="test-renderer"/>
 *         <attributes>
 *           <attribute name="text">1</attribute>
 *         </attributes>
 *       </child>
 *     </object>
 *   </child>
 *   <child internal-child="selection">
 *     <object class="GtkTreeSelection" id="selection">
 *       <signal name="changed" handler="on_treeview_selection_changed"/>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * <pre>{@code 
 * treeview.view
 * ├── header
 * │   ├── button
 * │   │   ╰── [sort-indicator]
 * ┊   ┊
 * │   ╰── button
 * │       ╰── [sort-indicator]
 * │
 * ├── [rubberband]
 * ╰── [dndtarget]
 * }</pre>
 * <p>
 * {@code GtkTreeView} has a main CSS node with name {@code treeview} and style class {@code .view}.
 * It has a subnode with name {@code header}, which is the parent for all the column
 * header widgets' CSS nodes.
 * <p>
 * Each column header consists of a {@code button}, which among other content, has a
 * child with name {@code sort-indicator}, which carries the {@code .ascending} or {@code .descending}
 * style classes when the column header should show a sort indicator. The CSS
 * is expected to provide a suitable image using the {@code -gtk-icon-source} property.
 * <p>
 * For rubberband selection, a subnode with name {@code rubberband} is used.
 * <p>
 * For the drop target location during DND, a subnode with name {@code dndtarget} is used.
 */
public class TreeView extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public TreeView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeView */
    public static TreeView castFrom(org.gtk.gobject.Object gobject) {
        return new TreeView(gobject.refcounted());
    }
    
    static final MethodHandle gtk_tree_view_new = Interop.downcallHandle(
        "gtk_tree_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_view_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget.
     */
    public TreeView() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_tree_view_new_with_model = Interop.downcallHandle(
        "gtk_tree_view_new_with_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithModel(TreeModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_view_new_with_model.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget with the model initialized to {@code model}.
     */
    public static TreeView newWithModel(TreeModel model) {
        return new TreeView(constructNewWithModel(model));
    }
    
    static final MethodHandle gtk_tree_view_append_column = Interop.downcallHandle(
        "gtk_tree_view_append_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code column} to the list of columns. If {@code tree_view} has “fixed_height”
     * mode enabled, then {@code column} must have its “sizing” property set to be
     * GTK_TREE_VIEW_COLUMN_FIXED.
     */
    public int appendColumn(TreeViewColumn column) {
        try {
            var RESULT = (int) gtk_tree_view_append_column.invokeExact(handle(), column.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_collapse_all = Interop.downcallHandle(
        "gtk_tree_view_collapse_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively collapses all visible, expanded nodes in {@code tree_view}.
     */
    public void collapseAll() {
        try {
            gtk_tree_view_collapse_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_collapse_row = Interop.downcallHandle(
        "gtk_tree_view_collapse_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Collapses a row (hides its child rows, if they exist).
     */
    public boolean collapseRow(TreePath path) {
        try {
            var RESULT = (int) gtk_tree_view_collapse_row.invokeExact(handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_columns_autosize = Interop.downcallHandle(
        "gtk_tree_view_columns_autosize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Resizes all columns to their optimal width. Only works after the
     * treeview has been realized.
     */
    public void columnsAutosize() {
        try {
            gtk_tree_view_columns_autosize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_bin_window_to_tree_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_bin_window_to_tree_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts bin_window coordinates to coordinates for the
     * tree (the full scrollable area of the tree).
     */
    public void convertBinWindowToTreeCoords(int bx, int by, PointerInteger tx, PointerInteger ty) {
        try {
            gtk_tree_view_convert_bin_window_to_tree_coords.invokeExact(handle(), bx, by, tx.handle(), ty.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_bin_window_to_widget_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_bin_window_to_widget_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts bin_window coordinates to widget relative coordinates.
     */
    public void convertBinWindowToWidgetCoords(int bx, int by, PointerInteger wx, PointerInteger wy) {
        try {
            gtk_tree_view_convert_bin_window_to_widget_coords.invokeExact(handle(), bx, by, wx.handle(), wy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_tree_to_bin_window_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_tree_to_bin_window_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * to bin_window coordinates.
     */
    public void convertTreeToBinWindowCoords(int tx, int ty, PointerInteger bx, PointerInteger by) {
        try {
            gtk_tree_view_convert_tree_to_bin_window_coords.invokeExact(handle(), tx, ty, bx.handle(), by.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_tree_to_widget_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_tree_to_widget_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * to widget coordinates.
     */
    public void convertTreeToWidgetCoords(int tx, int ty, PointerInteger wx, PointerInteger wy) {
        try {
            gtk_tree_view_convert_tree_to_widget_coords.invokeExact(handle(), tx, ty, wx.handle(), wy.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_widget_to_bin_window_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_widget_to_bin_window_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts widget coordinates to coordinates for the bin_window.
     */
    public void convertWidgetToBinWindowCoords(int wx, int wy, PointerInteger bx, PointerInteger by) {
        try {
            gtk_tree_view_convert_widget_to_bin_window_coords.invokeExact(handle(), wx, wy, bx.handle(), by.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_convert_widget_to_tree_coords = Interop.downcallHandle(
        "gtk_tree_view_convert_widget_to_tree_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts widget coordinates to coordinates for the
     * tree (the full scrollable area of the tree).
     */
    public void convertWidgetToTreeCoords(int wx, int wy, PointerInteger tx, PointerInteger ty) {
        try {
            gtk_tree_view_convert_widget_to_tree_coords.invokeExact(handle(), wx, wy, tx.handle(), ty.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_create_row_drag_icon = Interop.downcallHandle(
        "gtk_tree_view_create_row_drag_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code cairo_surface_t} representation of the row at {@code path}.
     * This image is used for a drag icon.
     */
    public org.gtk.gdk.Paintable createRowDragIcon(TreePath path) {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_create_row_drag_icon.invokeExact(handle(), path.handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_enable_model_drag_dest = Interop.downcallHandle(
        "gtk_tree_view_enable_model_drag_dest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns {@code tree_view} into a drop destination for automatic DND. Calling
     * this method sets {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            gtk_tree_view_enable_model_drag_dest.invokeExact(handle(), formats.handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_enable_model_drag_source = Interop.downcallHandle(
        "gtk_tree_view_enable_model_drag_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns {@code tree_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void enableModelDragSource(org.gtk.gdk.ModifierType startButtonMask, org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            gtk_tree_view_enable_model_drag_source.invokeExact(handle(), startButtonMask.getValue(), formats.handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_expand_all = Interop.downcallHandle(
        "gtk_tree_view_expand_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively expands all nodes in the {@code tree_view}.
     */
    public void expandAll() {
        try {
            gtk_tree_view_expand_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_expand_row = Interop.downcallHandle(
        "gtk_tree_view_expand_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Opens the row so its children are visible.
     */
    public boolean expandRow(TreePath path, boolean openAll) {
        try {
            var RESULT = (int) gtk_tree_view_expand_row.invokeExact(handle(), path.handle(), openAll ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_expand_to_path = Interop.downcallHandle(
        "gtk_tree_view_expand_to_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Expands the row at {@code path}. This will also expand all parent rows of
     * {@code path} as necessary.
     */
    public void expandToPath(TreePath path) {
        try {
            gtk_tree_view_expand_to_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_activate_on_single_click = Interop.downcallHandle(
        "gtk_tree_view_get_activate_on_single_click",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
     */
    public boolean getActivateOnSingleClick() {
        try {
            var RESULT = (int) gtk_tree_view_get_activate_on_single_click.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_background_area = Interop.downcallHandle(
        "gtk_tree_view_get_background_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * {@code null}, or points to a node not found in the tree, the @y and {@code height} fields of
     * the rectangle will be filled with 0. If {@code column} is {@code null}, the @x and {@code width}
     * fields will be filled with 0.  The returned rectangle is equivalent to the
     * {@code background_area} passed to gtk_cell_renderer_render().  These background
     * areas tile to cover the entire bin window.  Contrast with the {@code cell_area},
     * returned by gtk_tree_view_get_cell_area(), which returns only the cell
     * itself, excluding surrounding borders and the tree expander area.
     */
    public void getBackgroundArea(TreePath path, TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        try {
            gtk_tree_view_get_background_area.invokeExact(handle(), path.handle(), column.handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_cell_area = Interop.downcallHandle(
        "gtk_tree_view_get_cell_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * {@code null}, or points to a path not currently displayed, the @y and {@code height} fields
     * of the rectangle will be filled with 0. If {@code column} is {@code null}, the @x and {@code width}
     * fields will be filled with 0.  The sum of all cell rects does not cover the
     * entire tree; there are extra pixels in between rows, for example. The
     * returned rectangle is equivalent to the {@code cell_area} passed to
     * gtk_cell_renderer_render().  This function is only valid if {@code tree_view} is
     * realized.
     */
    public void getCellArea(TreePath path, TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        try {
            gtk_tree_view_get_cell_area.invokeExact(handle(), path.handle(), column.handle(), rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_column = Interop.downcallHandle(
        "gtk_tree_view_get_column",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the {@code GtkTreeViewColumn} at the given position in the {@code tree_view}.
     */
    public TreeViewColumn getColumn(int n) {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_column.invokeExact(handle(), n);
            return new TreeViewColumn(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_columns = Interop.downcallHandle(
        "gtk_tree_view_get_columns",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GList} of all the {@code GtkTreeViewColumn}s currently in {@code tree_view}.
     * The returned list must be freed with g_list_free ().
     */
    public org.gtk.glib.List getColumns() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_columns.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_cursor = Interop.downcallHandle(
        "gtk_tree_view_get_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in {@code path} and {@code focus_column} with the current path and focus column.  If
     * the cursor isn’t currently set, then *{@code path} will be {@code null}.  If no column
     * currently has focus, then *{@code focus_column} will be {@code null}.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free() when
     * you are done with it.
     */
    public void getCursor(PointerProxy<TreePath> path, PointerProxy<TreeViewColumn> focusColumn) {
        try {
            gtk_tree_view_get_cursor.invokeExact(handle(), path.handle(), focusColumn.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_dest_row_at_pos = Interop.downcallHandle(
        "gtk_tree_view_get_dest_row_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the destination row for a given position.  {@code drag_x} and
     * {@code drag_y} are expected to be in widget coordinates.  This function is only
     * meaningful if {@code tree_view} is realized.  Therefore this function will always
     * return {@code false} if {@code tree_view} is not realized or does not have a model.
     */
    public boolean getDestRowAtPos(int dragX, int dragY, PointerProxy<TreePath> path, TreeViewDropPosition pos) {
        try {
            var RESULT = (int) gtk_tree_view_get_dest_row_at_pos.invokeExact(handle(), dragX, dragY, path.handle(), new PointerInteger(pos.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_drag_dest_row = Interop.downcallHandle(
        "gtk_tree_view_get_drag_dest_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets information about the row that is highlighted for feedback.
     */
    public void getDragDestRow(PointerProxy<TreePath> path, TreeViewDropPosition pos) {
        try {
            gtk_tree_view_get_drag_dest_row.invokeExact(handle(), path.handle(), new PointerInteger(pos.getValue()).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_enable_search = Interop.downcallHandle(
        "gtk_tree_view_get_enable_search",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether or not the tree allows to start interactive searching
     * by typing in text.
     */
    public boolean getEnableSearch() {
        try {
            var RESULT = (int) gtk_tree_view_get_enable_search.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_enable_tree_lines = Interop.downcallHandle(
        "gtk_tree_view_get_enable_tree_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether or not tree lines are drawn in {@code tree_view}.
     */
    public boolean getEnableTreeLines() {
        try {
            var RESULT = (int) gtk_tree_view_get_enable_tree_lines.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_expander_column = Interop.downcallHandle(
        "gtk_tree_view_get_expander_column",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column that is the current expander column,
     * or {@code null} if none has been set.
     * This column has the expander arrow drawn next to it.
     */
    public TreeViewColumn getExpanderColumn() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_expander_column.invokeExact(handle());
            return new TreeViewColumn(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_fixed_height_mode = Interop.downcallHandle(
        "gtk_tree_view_get_fixed_height_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether fixed height mode is turned on for {@code tree_view}.
     */
    public boolean getFixedHeightMode() {
        try {
            var RESULT = (int) gtk_tree_view_get_fixed_height_mode.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_grid_lines = Interop.downcallHandle(
        "gtk_tree_view_get_grid_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns which grid lines are enabled in {@code tree_view}.
     */
    public TreeViewGridLines getGridLines() {
        try {
            var RESULT = (int) gtk_tree_view_get_grid_lines.invokeExact(handle());
            return new TreeViewGridLines(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_headers_clickable = Interop.downcallHandle(
        "gtk_tree_view_get_headers_clickable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether all header columns are clickable.
     */
    public boolean getHeadersClickable() {
        try {
            var RESULT = (int) gtk_tree_view_get_headers_clickable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_headers_visible = Interop.downcallHandle(
        "gtk_tree_view_get_headers_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the headers on the {@code tree_view} are visible.
     */
    public boolean getHeadersVisible() {
        try {
            var RESULT = (int) gtk_tree_view_get_headers_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_hover_expand = Interop.downcallHandle(
        "gtk_tree_view_get_hover_expand",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether hover expansion mode is turned on for {@code tree_view}.
     */
    public boolean getHoverExpand() {
        try {
            var RESULT = (int) gtk_tree_view_get_hover_expand.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_hover_selection = Interop.downcallHandle(
        "gtk_tree_view_get_hover_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether hover selection mode is turned on for {@code tree_view}.
     */
    public boolean getHoverSelection() {
        try {
            var RESULT = (int) gtk_tree_view_get_hover_selection.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_level_indentation = Interop.downcallHandle(
        "gtk_tree_view_get_level_indentation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the amount, in pixels, of extra indentation for child levels
     * in {@code tree_view}.
     */
    public int getLevelIndentation() {
        try {
            var RESULT = (int) gtk_tree_view_get_level_indentation.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_model = Interop.downcallHandle(
        "gtk_tree_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model the {@code GtkTreeView} is based on.  Returns {@code null} if the
     * model is unset.
     */
    public TreeModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_model.invokeExact(handle());
            return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_n_columns = Interop.downcallHandle(
        "gtk_tree_view_get_n_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the number of columns in the given {@code tree_view}.
     */
    public int getNColumns() {
        try {
            var RESULT = (int) gtk_tree_view_get_n_columns.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_path_at_pos = Interop.downcallHandle(
        "gtk_tree_view_get_path_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the path at the point (@x, @y), relative to bin_window coordinates.
     * That is, @x and @y are relative to an events coordinates. Widget-relative
     * coordinates must be converted using
     * gtk_tree_view_convert_widget_to_bin_window_coords(). It is primarily for
     * things like popup menus. If {@code path} is non-{@code null}, then it will be filled
     * with the {@code GtkTreePath} at that point.  This path should be freed with
     * gtk_tree_path_free().  If {@code column} is non-{@code null}, then it will be filled
     * with the column at that point.  {@code cell_x} and {@code cell_y} return the coordinates
     * relative to the cell background (i.e. the {@code background_area} passed to
     * gtk_cell_renderer_render()).  This function is only meaningful if
     * {@code tree_view} is realized.  Therefore this function will always return {@code false}
     * if {@code tree_view} is not realized or does not have a model.
     * <p>
     * For converting widget coordinates (eg. the ones you get from
     * GtkWidget::query-tooltip), please see
     * gtk_tree_view_convert_widget_to_bin_window_coords().
     */
    public boolean getPathAtPos(int x, int y, PointerProxy<TreePath> path, PointerProxy<TreeViewColumn> column, PointerInteger cellX, PointerInteger cellY) {
        try {
            var RESULT = (int) gtk_tree_view_get_path_at_pos.invokeExact(handle(), x, y, path.handle(), column.handle(), cellX.handle(), cellY.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_reorderable = Interop.downcallHandle(
        "gtk_tree_view_get_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the user can reorder the tree via drag-and-drop. See
     * gtk_tree_view_set_reorderable().
     */
    public boolean getReorderable() {
        try {
            var RESULT = (int) gtk_tree_view_get_reorderable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_rubber_banding = Interop.downcallHandle(
        "gtk_tree_view_get_rubber_banding",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether rubber banding is turned on for {@code tree_view}.  If the
     * selection mode is {@link SelectionMode#MULTIPLE}, rubber banding will allow the
     * user to select multiple rows by dragging the mouse.
     */
    public boolean getRubberBanding() {
        try {
            var RESULT = (int) gtk_tree_view_get_rubber_banding.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_search_column = Interop.downcallHandle(
        "gtk_tree_view_get_search_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the column searched on by the interactive search code.
     */
    public int getSearchColumn() {
        try {
            var RESULT = (int) gtk_tree_view_get_search_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_search_entry = Interop.downcallHandle(
        "gtk_tree_view_get_search_entry",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkEntry} which is currently in use as interactive search
     * entry for {@code tree_view}.  In case the built-in entry is being used, {@code null}
     * will be returned.
     */
    public Editable getSearchEntry() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_search_entry.invokeExact(handle());
            return new Editable.EditableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_selection = Interop.downcallHandle(
        "gtk_tree_view_get_selection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkTreeSelection} associated with {@code tree_view}.
     */
    public TreeSelection getSelection() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_view_get_selection.invokeExact(handle());
            return new TreeSelection(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_show_expanders = Interop.downcallHandle(
        "gtk_tree_view_get_show_expanders",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether or not expanders are drawn in {@code tree_view}.
     */
    public boolean getShowExpanders() {
        try {
            var RESULT = (int) gtk_tree_view_get_show_expanders.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_tooltip_column = Interop.downcallHandle(
        "gtk_tree_view_get_tooltip_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column of {@code tree_view}’s model which is being used for
     * displaying tooltips on {@code tree_view}’s rows.
     */
    public int getTooltipColumn() {
        try {
            var RESULT = (int) gtk_tree_view_get_tooltip_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_tooltip_context = Interop.downcallHandle(
        "gtk_tree_view_get_tooltip_context",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is supposed to be used in a ::query-tooltip
     * signal handler for {@code GtkTreeView}. The @x, @y and {@code keyboard_tip} values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * <p>
     * The return value indicates whether there is a tree view row at the given
     * coordinates ({@code true}) or not ({@code false}) for mouse tooltips. For keyboard
     * tooltips the row returned will be the cursor row. When {@code true}, then any of
     * {@code model}, {@code path} and {@code iter} which have been provided will be set to point to
     * that row and the corresponding model. @x and @y will always be converted
     * to be relative to {@code tree_view}’s bin_window if {@code keyboard_tooltip} is {@code false}.
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, PointerProxy<TreeModel> model, PointerProxy<TreePath> path, TreeIter iter) {
        try {
            var RESULT = (int) gtk_tree_view_get_tooltip_context.invokeExact(handle(), x, y, keyboardTip ? 1 : 0, model.handle(), path.handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_visible_range = Interop.downcallHandle(
        "gtk_tree_view_get_visible_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * The paths should be freed with gtk_tree_path_free() after use.
     */
    public boolean getVisibleRange(PointerProxy<TreePath> startPath, PointerProxy<TreePath> endPath) {
        try {
            var RESULT = (int) gtk_tree_view_get_visible_range.invokeExact(handle(), startPath.handle(), endPath.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_get_visible_rect = Interop.downcallHandle(
        "gtk_tree_view_get_visible_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills {@code visible_rect} with the currently-visible region of the
     * buffer, in tree coordinates. Convert to bin_window coordinates with
     * gtk_tree_view_convert_tree_to_bin_window_coords().
     * Tree coordinates start at 0,0 for row 0 of the tree, and cover the entire
     * scrollable area of the tree.
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        try {
            gtk_tree_view_get_visible_rect.invokeExact(handle(), visibleRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_insert_column = Interop.downcallHandle(
        "gtk_tree_view_insert_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This inserts the {@code column} into the {@code tree_view} at {@code position}.  If {@code position} is
     * -1, then the column is inserted at the end. If {@code tree_view} has
     * “fixed_height” mode enabled, then {@code column} must have its “sizing” property
     * set to be GTK_TREE_VIEW_COLUMN_FIXED.
     */
    public int insertColumn(TreeViewColumn column, int position) {
        try {
            var RESULT = (int) gtk_tree_view_insert_column.invokeExact(handle(), column.handle(), position);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_insert_column_with_data_func = Interop.downcallHandle(
        "gtk_tree_view_insert_column_with_data_func",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function that inserts a new column into the {@code GtkTreeView}
     * with the given cell renderer and a {@code GtkTreeCellDataFunc} to set cell renderer
     * attributes (normally using data from the model). See also
     * gtk_tree_view_column_set_cell_data_func(), gtk_tree_view_column_pack_start().
     * If {@code tree_view} has “fixed_height” mode enabled, then the new column will have its
     * “sizing” property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     */
    public int insertColumnWithDataFunc(int position, java.lang.String title, CellRenderer cell, TreeCellDataFunc func) {
        try {
            var RESULT = (int) gtk_tree_view_insert_column_with_data_func.invokeExact(handle(), position, Interop.allocateNativeString(title).handle(), cell.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeCellDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_is_blank_at_pos = Interop.downcallHandle(
        "gtk_tree_view_is_blank_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determine whether the point (@x, @y) in {@code tree_view} is blank, that is no
     * cell content nor an expander arrow is drawn at the location. If so, the
     * location can be considered as the background. You might wish to take
     * special action on clicks on the background, such as clearing a current
     * selection, having a custom context menu or starting rubber banding.
     * <p>
     * The @x and @y coordinate that are provided must be relative to bin_window
     * coordinates.  Widget-relative coordinates must be converted using
     * gtk_tree_view_convert_widget_to_bin_window_coords().
     * <p>
     * For converting widget coordinates (eg. the ones you get from
     * GtkWidget::query-tooltip), please see
     * gtk_tree_view_convert_widget_to_bin_window_coords().
     * <p>
     * The {@code path}, {@code column}, {@code cell_x} and {@code cell_y} arguments will be filled in
     * likewise as for gtk_tree_view_get_path_at_pos().  Please see
     * gtk_tree_view_get_path_at_pos() for more information.
     */
    public boolean isBlankAtPos(int x, int y, PointerProxy<TreePath> path, PointerProxy<TreeViewColumn> column, PointerInteger cellX, PointerInteger cellY) {
        try {
            var RESULT = (int) gtk_tree_view_is_blank_at_pos.invokeExact(handle(), x, y, path.handle(), column.handle(), cellX.handle(), cellY.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_is_rubber_banding_active = Interop.downcallHandle(
        "gtk_tree_view_is_rubber_banding_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether a rubber banding operation is currently being done
     * in {@code tree_view}.
     */
    public boolean isRubberBandingActive() {
        try {
            var RESULT = (int) gtk_tree_view_is_rubber_banding_active.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_map_expanded_rows = Interop.downcallHandle(
        "gtk_tree_view_map_expanded_rows",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code func} on all expanded rows.
     */
    public void mapExpandedRows(TreeViewMappingFunc func) {
        try {
            gtk_tree_view_map_expanded_rows.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewMappingFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_move_column_after = Interop.downcallHandle(
        "gtk_tree_view_move_column_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code column} to be after to {@code base_column}.  If {@code base_column} is {@code null}, then
     * {@code column} is placed in the first position.
     */
    public void moveColumnAfter(TreeViewColumn column, TreeViewColumn baseColumn) {
        try {
            gtk_tree_view_move_column_after.invokeExact(handle(), column.handle(), baseColumn.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_remove_column = Interop.downcallHandle(
        "gtk_tree_view_remove_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code column} from {@code tree_view}.
     */
    public int removeColumn(TreeViewColumn column) {
        try {
            var RESULT = (int) gtk_tree_view_remove_column.invokeExact(handle(), column.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_row_activated = Interop.downcallHandle(
        "gtk_tree_view_row_activated",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Activates the cell determined by {@code path} and {@code column}.
     */
    public void rowActivated(TreePath path, TreeViewColumn column) {
        try {
            gtk_tree_view_row_activated.invokeExact(handle(), path.handle(), column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_row_expanded = Interop.downcallHandle(
        "gtk_tree_view_row_expanded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the node pointed to by {@code path} is expanded in {@code tree_view}.
     */
    public boolean rowExpanded(TreePath path) {
        try {
            var RESULT = (int) gtk_tree_view_row_expanded.invokeExact(handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_scroll_to_cell = Interop.downcallHandle(
        "gtk_tree_view_scroll_to_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Moves the alignments of {@code tree_view} to the position specified by {@code column} and
     * {@code path}.  If {@code column} is {@code null}, then no horizontal scrolling occurs.  Likewise,
     * if {@code path} is {@code null} no vertical scrolling occurs.  At a minimum, one of {@code column}
     * or {@code path} need to be non-{@code null}.  {@code row_align} determines where the row is
     * placed, and {@code col_align} determines where {@code column} is placed.  Both are expected
     * to be between 0.0 and 1.0. 0.0 means left/top alignment, 1.0 means
     * right/bottom alignment, 0.5 means center.
     * <p>
     * If {@code use_align} is {@code false}, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the cell onto the screen.
     * This means that the cell will be scrolled to the edge closest to its current
     * position.  If the cell is currently visible on the screen, nothing is done.
     * <p>
     * This function only works if the model is set, and {@code path} is a valid row on the
     * model.  If the model changes before the {@code tree_view} is realized, the centered
     * path will be modified to reflect this change.
     */
    public void scrollToCell(TreePath path, TreeViewColumn column, boolean useAlign, float rowAlign, float colAlign) {
        try {
            gtk_tree_view_scroll_to_cell.invokeExact(handle(), path.handle(), column.handle(), useAlign ? 1 : 0, rowAlign, colAlign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_scroll_to_point = Interop.downcallHandle(
        "gtk_tree_view_scroll_to_point",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Scrolls the tree view such that the top-left corner of the visible
     * area is {@code tree_x}, {@code tree_y}, where {@code tree_x} and {@code tree_y} are specified
     * in tree coordinates.  The {@code tree_view} must be realized before
     * this function is called.  If it isn't, you probably want to be
     * using gtk_tree_view_scroll_to_cell().
     * <p>
     * If either {@code tree_x} or {@code tree_y} are -1, then that direction isn’t scrolled.
     */
    public void scrollToPoint(int treeX, int treeY) {
        try {
            gtk_tree_view_scroll_to_point.invokeExact(handle(), treeX, treeY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_activate_on_single_click = Interop.downcallHandle(
        "gtk_tree_view_set_activate_on_single_click",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Cause the {@code GtkTreeView}::row-activated signal to be emitted
     * on a single click instead of a double click.
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            gtk_tree_view_set_activate_on_single_click.invokeExact(handle(), single ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_column_drag_function = Interop.downcallHandle(
        "gtk_tree_view_set_column_drag_function",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a user function for determining where a column may be dropped when
     * dragged.  This function is called on every column pair in turn at the
     * beginning of a column drag to determine where a drop can take place.  The
     * arguments passed to {@code func} are: the {@code tree_view}, the {@code GtkTreeViewColumn} being
     * dragged, the two {@code GtkTreeViewColumn}s determining the drop spot, and
     * {@code user_data}.  If either of the {@code GtkTreeViewColumn} arguments for the drop spot
     * are {@code null}, then they indicate an edge.  If {@code func} is set to be {@code null}, then
     * {@code tree_view} reverts to the default behavior of allowing all columns to be
     * dropped everywhere.
     */
    public void setColumnDragFunction(TreeViewColumnDropFunc func) {
        try {
            gtk_tree_view_set_column_drag_function.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewColumnDropFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_cursor = Interop.downcallHandle(
        "gtk_tree_view_set_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the current keyboard focus to be at {@code path}, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * {@code focus_column} is not {@code null}, then focus is given to the column specified by
     * it. Additionally, if {@code focus_column} is specified, and {@code start_editing} is
     * {@code true}, then editing should be started in the specified cell.
     * This function is often followed by {@code gtk_widget_grab_focus} ({@code tree_view})
     * in order to give keyboard focus to the widget.  Please note that editing
     * can only happen when the widget is realized.
     * <p>
     * If {@code path} is invalid for {@code model}, the current cursor (if any) will be unset
     * and the function will return without failing.
     */
    public void setCursor(TreePath path, TreeViewColumn focusColumn, boolean startEditing) {
        try {
            gtk_tree_view_set_cursor.invokeExact(handle(), path.handle(), focusColumn.handle(), startEditing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_cursor_on_cell = Interop.downcallHandle(
        "gtk_tree_view_set_cursor_on_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the current keyboard focus to be at {@code path}, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * {@code focus_column} is not {@code null}, then focus is given to the column specified by
     * it. If {@code focus_column} and {@code focus_cell} are not {@code null}, and {@code focus_column}
     * contains 2 or more editable or activatable cells, then focus is given to
     * the cell specified by {@code focus_cell}. Additionally, if {@code focus_column} is
     * specified, and {@code start_editing} is {@code true}, then editing should be started in
     * the specified cell.  This function is often followed by
     * {@code gtk_widget_grab_focus} ({@code tree_view}) in order to give keyboard focus to the
     * widget.  Please note that editing can only happen when the widget is
     * realized.
     * <p>
     * If {@code path} is invalid for {@code model}, the current cursor (if any) will be unset
     * and the function will return without failing.
     */
    public void setCursorOnCell(TreePath path, TreeViewColumn focusColumn, CellRenderer focusCell, boolean startEditing) {
        try {
            gtk_tree_view_set_cursor_on_cell.invokeExact(handle(), path.handle(), focusColumn.handle(), focusCell.handle(), startEditing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_drag_dest_row = Interop.downcallHandle(
        "gtk_tree_view_set_drag_dest_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the row that is highlighted for feedback.
     * If {@code path} is {@code null}, an existing highlight is removed.
     */
    public void setDragDestRow(TreePath path, TreeViewDropPosition pos) {
        try {
            gtk_tree_view_set_drag_dest_row.invokeExact(handle(), path.handle(), pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_enable_search = Interop.downcallHandle(
        "gtk_tree_view_set_enable_search",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code enable_search} is set, then the user can type in text to search through
     * the tree interactively (this is sometimes called "typeahead find").
     * <p>
     * Note that even if this is {@code false}, the user can still initiate a search
     * using the “start-interactive-search” key binding.
     */
    public void setEnableSearch(boolean enableSearch) {
        try {
            gtk_tree_view_set_enable_search.invokeExact(handle(), enableSearch ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_enable_tree_lines = Interop.downcallHandle(
        "gtk_tree_view_set_enable_tree_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to draw lines interconnecting the expanders in {@code tree_view}.
     * This does not have any visible effects for lists.
     */
    public void setEnableTreeLines(boolean enabled) {
        try {
            gtk_tree_view_set_enable_tree_lines.invokeExact(handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_expander_column = Interop.downcallHandle(
        "gtk_tree_view_set_expander_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the column to draw the expander arrow at. It must be in {@code tree_view}.
     * If {@code column} is {@code null}, then the expander arrow is always at the first
     * visible column.
     * <p>
     * If you do not want expander arrow to appear in your tree, set the
     * expander column to a hidden column.
     */
    public void setExpanderColumn(TreeViewColumn column) {
        try {
            gtk_tree_view_set_expander_column.invokeExact(handle(), column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_fixed_height_mode = Interop.downcallHandle(
        "gtk_tree_view_set_fixed_height_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables the fixed height mode of {@code tree_view}.
     * Fixed height mode speeds up {@code GtkTreeView} by assuming that all
     * rows have the same height.
     * Only enable this option if all rows are the same height and all
     * columns are of type {@link TreeViewColumnSizing#FIXED}.
     */
    public void setFixedHeightMode(boolean enable) {
        try {
            gtk_tree_view_set_fixed_height_mode.invokeExact(handle(), enable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_grid_lines = Interop.downcallHandle(
        "gtk_tree_view_set_grid_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets which grid lines to draw in {@code tree_view}.
     */
    public void setGridLines(TreeViewGridLines gridLines) {
        try {
            gtk_tree_view_set_grid_lines.invokeExact(handle(), gridLines.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_headers_clickable = Interop.downcallHandle(
        "gtk_tree_view_set_headers_clickable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Allow the column title buttons to be clicked.
     */
    public void setHeadersClickable(boolean setting) {
        try {
            gtk_tree_view_set_headers_clickable.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_headers_visible = Interop.downcallHandle(
        "gtk_tree_view_set_headers_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the visibility state of the headers.
     */
    public void setHeadersVisible(boolean headersVisible) {
        try {
            gtk_tree_view_set_headers_visible.invokeExact(handle(), headersVisible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_hover_expand = Interop.downcallHandle(
        "gtk_tree_view_set_hover_expand",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables the hover expansion mode of {@code tree_view}.
     * Hover expansion makes rows expand or collapse if the pointer
     * moves over them.
     */
    public void setHoverExpand(boolean expand) {
        try {
            gtk_tree_view_set_hover_expand.invokeExact(handle(), expand ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_hover_selection = Interop.downcallHandle(
        "gtk_tree_view_set_hover_selection",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables the hover selection mode of {@code tree_view}.
     * Hover selection makes the selected row follow the pointer.
     * Currently, this works only for the selection modes
     * {@link SelectionMode#SINGLE} and {@link SelectionMode#BROWSE}.
     */
    public void setHoverSelection(boolean hover) {
        try {
            gtk_tree_view_set_hover_selection.invokeExact(handle(), hover ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_level_indentation = Interop.downcallHandle(
        "gtk_tree_view_set_level_indentation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of extra indentation for child levels to use in {@code tree_view}
     * in addition to the default indentation.  The value should be specified in
     * pixels, a value of 0 disables this feature and in this case only the default
     * indentation will be used.
     * This does not have any visible effects for lists.
     */
    public void setLevelIndentation(int indentation) {
        try {
            gtk_tree_view_set_level_indentation.invokeExact(handle(), indentation);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_model = Interop.downcallHandle(
        "gtk_tree_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model for a {@code GtkTreeView}.  If the {@code tree_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is {@code null},
     * then it will unset the old model.
     */
    public void setModel(TreeModel model) {
        try {
            gtk_tree_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_reorderable = Interop.downcallHandle(
        "gtk_tree_view_set_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This function is a convenience function to allow you to reorder
     * models that support the {@code GtkTreeDragSourceIface} and the
     * {@code GtkTreeDragDestIface}.  Both {@code GtkTreeStore} and {@code GtkListStore} support
     * these.  If {@code reorderable} is {@code true}, then the user can reorder the
     * model by dragging and dropping rows. The developer can listen to
     * these changes by connecting to the model’s {@code GtkTreeModel::row-inserted}
     * and {@code GtkTreeModel::row-deleted} signals. The reordering is implemented
     * by setting up the tree view as a drag source and destination.
     * Therefore, drag and drop can not be used in a reorderable view for any
     * other purpose.
     * <p>
     * This function does not give you any degree of control over the order -- any
     * reordering is allowed.  If more control is needed, you should probably
     * handle drag and drop manually.
     */
    public void setReorderable(boolean reorderable) {
        try {
            gtk_tree_view_set_reorderable.invokeExact(handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_row_separator_func = Interop.downcallHandle(
        "gtk_tree_view_set_row_separator_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator. If the row separator
     * function is {@code null}, no separators are drawn. This is the default value.
     */
    public void setRowSeparatorFunc(TreeViewRowSeparatorFunc func) {
        try {
            gtk_tree_view_set_row_separator_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewRowSeparatorFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_rubber_banding = Interop.downcallHandle(
        "gtk_tree_view_set_rubber_banding",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables rubber banding in {@code tree_view}.  If the selection mode
     * is {@link SelectionMode#MULTIPLE}, rubber banding will allow the user to select
     * multiple rows by dragging the mouse.
     */
    public void setRubberBanding(boolean enable) {
        try {
            gtk_tree_view_set_rubber_banding.invokeExact(handle(), enable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_search_column = Interop.downcallHandle(
        "gtk_tree_view_set_search_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code column} as the column where the interactive search code should
     * search in for the current model.
     * <p>
     * If the search column is set, users can use the “start-interactive-search”
     * key binding to bring up search popup. The enable-search property controls
     * whether simply typing text will also start an interactive search.
     * <p>
     * Note that {@code column} refers to a column of the current model. The search
     * column is reset to -1 when the model is changed.
     */
    public void setSearchColumn(int column) {
        try {
            gtk_tree_view_set_search_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_search_entry = Interop.downcallHandle(
        "gtk_tree_view_set_search_entry",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the entry which the interactive search code will use for this
     * {@code tree_view}.  This is useful when you want to provide a search entry
     * in our interface at all time at a fixed position.  Passing {@code null} for
     * {@code entry} will make the interactive search code use the built-in popup
     * entry again.
     */
    public void setSearchEntry(Editable entry) {
        try {
            gtk_tree_view_set_search_entry.invokeExact(handle(), entry.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_search_equal_func = Interop.downcallHandle(
        "gtk_tree_view_set_search_equal_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the compare function for the interactive search capabilities; note
     * that somewhat like strcmp() returning 0 for equality
     * {@code GtkTreeView}SearchEqualFunc returns {@code false} on matches.
     */
    public void setSearchEqualFunc(TreeViewSearchEqualFunc searchEqualFunc) {
        try {
            gtk_tree_view_set_search_equal_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeViewSearchEqualFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(searchEqualFunc.hashCode(), searchEqualFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_show_expanders = Interop.downcallHandle(
        "gtk_tree_view_set_show_expanders",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to draw and enable expanders and indent child rows in
     * {@code tree_view}.  When disabled there will be no expanders visible in trees
     * and there will be no way to expand and collapse rows by default.  Also
     * note that hiding the expanders will disable the default indentation.  You
     * can set a custom indentation in this case using
     * gtk_tree_view_set_level_indentation().
     * This does not have any visible effects for lists.
     */
    public void setShowExpanders(boolean enabled) {
        try {
            gtk_tree_view_set_show_expanders.invokeExact(handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_tooltip_cell = Interop.downcallHandle(
        "gtk_tree_view_set_tooltip_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tip area of {@code tooltip} to the area {@code path}, {@code column} and {@code cell} have
     * in common.  For example if {@code path} is {@code null} and {@code column} is set, the tip
     * area will be set to the full area covered by {@code column}.  See also
     * gtk_tooltip_set_tip_area().
     * <p>
     * Note that if {@code path} is not specified and {@code cell} is set and part of a column
     * containing the expander, the tooltip might not show and hide at the correct
     * position.  In such cases {@code path} must be set to the current node under the
     * mouse cursor for this function to operate correctly.
     * <p>
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     */
    public void setTooltipCell(Tooltip tooltip, TreePath path, TreeViewColumn column, CellRenderer cell) {
        try {
            gtk_tree_view_set_tooltip_cell.invokeExact(handle(), tooltip.handle(), path.handle(), column.handle(), cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_tooltip_column = Interop.downcallHandle(
        "gtk_tree_view_set_tooltip_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If you only plan to have simple (text-only) tooltips on full rows, you
     * can use this function to have {@code GtkTreeView} handle these automatically
     * for you. {@code column} should be set to the column in {@code tree_view}’s model
     * containing the tooltip texts, or -1 to disable this feature.
     * <p>
     * When enabled, {@code GtkWidget:has-tooltip} will be set to {@code true} and
     * {@code tree_view} will connect a {@code GtkWidget::query-tooltip} signal handler.
     * <p>
     * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * so &, <, etc have to be escaped in the text.
     */
    public void setTooltipColumn(int column) {
        try {
            gtk_tree_view_set_tooltip_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_set_tooltip_row = Interop.downcallHandle(
        "gtk_tree_view_set_tooltip_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the row at {@code path}.
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     */
    public void setTooltipRow(Tooltip tooltip, TreePath path) {
        try {
            gtk_tree_view_set_tooltip_row.invokeExact(handle(), tooltip.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_unset_rows_drag_dest = Interop.downcallHandle(
        "gtk_tree_view_unset_rows_drag_dest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_dest(). Calling this method sets
     * {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void unsetRowsDragDest() {
        try {
            gtk_tree_view_unset_rows_drag_dest.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_view_unset_rows_drag_source = Interop.downcallHandle(
        "gtk_tree_view_unset_rows_drag_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_source(). Calling this method sets
     * {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void unsetRowsDragSource() {
        try {
            gtk_tree_view_unset_rows_drag_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ColumnsChangedHandler {
        void signalReceived(TreeView source);
    }
    
    /**
     * The number of columns of the treeview has changed.
     */
    public SignalHandle onColumnsChanged(ColumnsChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("columns-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewColumnsChanged",
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
    public interface CursorChangedHandler {
        void signalReceived(TreeView source);
    }
    
    /**
     * The position of the cursor (focused cell) has changed.
     */
    public SignalHandle onCursorChanged(CursorChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cursor-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewCursorChanged",
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
    public interface ExpandCollapseCursorRowHandler {
        boolean signalReceived(TreeView source, boolean object, boolean p0, boolean p1);
    }
    
    public SignalHandle onExpandCollapseCursorRow(ExpandCollapseCursorRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("expand-collapse-cursor-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewExpandCollapseCursorRow",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
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
        boolean signalReceived(TreeView source, MovementStep step, int direction, boolean extend, boolean modify);
    }
    
    /**
     * The {@code GtkTreeView}::move-cursor signal is a [keybinding
     * signal]{@link SignalAction} which gets emitted when the user
     * presses one of the cursor keys.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically. In contrast to gtk_tree_view_set_cursor() and
     * gtk_tree_view_set_cursor_on_cell() when moving horizontally
     * {@code GtkTreeView}::move-cursor does not reset the current selection.
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewMoveCursor",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
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
        void signalReceived(TreeView source, TreePath path, TreeViewColumn column);
    }
    
    /**
     * The "row-activated" signal is emitted when the method
     * {@code Gtk.TreeView.row_activated`} is called.
     * <p>
     * This signal is emitted when the user double-clicks a treeview row with the
     * {@code Gtk.TreeView:activate-on-single-click} property set to {@code false},
     * or when the user single-clicks a row when that property set to {@code true}.
     * <p>
     * This signal is also emitted when a non-editable row is selected and one
     * of the keys: &lt;kbd>Space</kbd>, <kbd>Shift</kbd>+<kbd>Space</kbd&gt;,
     * &lt;kbd>Return</kbd> or <kbd>Enter</kbd&gt; is pressed.
     * <p>
     * For selection handling refer to the
     * <a href="section-tree-widget.html">tree widget conceptual overview</a>
     * as well as {@code GtkTreeSelection}.
     */
    public SignalHandle onRowActivated(RowActivatedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowCollapsedHandler {
        void signalReceived(TreeView source, TreeIter iter, TreePath path);
    }
    
    /**
     * The given row has been collapsed (child nodes are hidden).
     */
    public SignalHandle onRowCollapsed(RowCollapsedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-collapsed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewRowCollapsed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowExpandedHandler {
        void signalReceived(TreeView source, TreeIter iter, TreePath path);
    }
    
    /**
     * The given row has been expanded (child nodes are shown).
     */
    public SignalHandle onRowExpanded(RowExpandedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("row-expanded").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewRowExpanded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewSelectAll",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorParentHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onSelectCursorParent(SelectCursorParentHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-cursor-parent").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewSelectCursorParent",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorRowHandler {
        boolean signalReceived(TreeView source, boolean object);
    }
    
    public SignalHandle onSelectCursorRow(SelectCursorRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-cursor-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewSelectCursorRow",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StartInteractiveSearchHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onStartInteractiveSearch(StartInteractiveSearchHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("start-interactive-search").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewStartInteractiveSearch",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TestCollapseRowHandler {
        boolean signalReceived(TreeView source, TreeIter iter, TreePath path);
    }
    
    /**
     * The given row is about to be collapsed (hide its children nodes). Use this
     * signal if you need to control the collapsibility of individual rows.
     */
    public SignalHandle onTestCollapseRow(TestCollapseRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("test-collapse-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewTestCollapseRow",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TestExpandRowHandler {
        boolean signalReceived(TreeView source, TreeIter iter, TreePath path);
    }
    
    /**
     * The given row is about to be expanded (show its children nodes). Use this
     * signal if you need to control the expandability of individual rows.
     */
    public SignalHandle onTestExpandRow(TestExpandRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("test-expand-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewTestExpandRow",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onToggleCursorRow(ToggleCursorRowHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-row").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewToggleCursorRow",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeView.Callbacks.class, "signalTreeViewUnselectAll",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTreeViewColumnsChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.ColumnsChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static void signalTreeViewCursorChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.CursorChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static boolean signalTreeViewExpandCollapseCursorRow(MemoryAddress source, int object, int p0, int p1, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.ExpandCollapseCursorRowHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)), object != 0, p0 != 0, p1 != 0);
        }
        
        public static boolean signalTreeViewMoveCursor(MemoryAddress source, int step, int direction, int extend, int modify, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.MoveCursorHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)), new MovementStep(step), direction, extend != 0, modify != 0);
        }
        
        public static void signalTreeViewRowActivated(MemoryAddress source, MemoryAddress path, MemoryAddress column, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.RowActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeView(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)), new TreeViewColumn(Refcounted.get(column, false)));
        }
        
        public static void signalTreeViewRowCollapsed(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.RowCollapsedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeView(Refcounted.get(source)), new TreeIter(Refcounted.get(iter, false)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static void signalTreeViewRowExpanded(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.RowExpandedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeView(Refcounted.get(source)), new TreeIter(Refcounted.get(iter, false)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static boolean signalTreeViewSelectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.SelectAllHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static boolean signalTreeViewSelectCursorParent(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.SelectCursorParentHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static boolean signalTreeViewSelectCursorRow(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.SelectCursorRowHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)), object != 0);
        }
        
        public static boolean signalTreeViewStartInteractiveSearch(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.StartInteractiveSearchHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static boolean signalTreeViewTestCollapseRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.TestCollapseRowHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)), new TreeIter(Refcounted.get(iter, false)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static boolean signalTreeViewTestExpandRow(MemoryAddress source, MemoryAddress iter, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.TestExpandRowHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)), new TreeIter(Refcounted.get(iter, false)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static boolean signalTreeViewToggleCursorRow(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.ToggleCursorRowHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
        public static boolean signalTreeViewUnselectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeView.UnselectAllHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TreeView(Refcounted.get(source)));
        }
        
    }
}
