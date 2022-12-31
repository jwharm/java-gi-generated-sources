package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget for displaying both trees and lists
 * <p>
 * Widget that displays any object that implements the {@code Gtk.TreeModel} interface.
 * <p>
 * Please refer to the <a href="section-tree-widget.html">tree widget conceptual overview</a>
 * for an overview of all the objects and data types related to the tree
 * widget and how they work together.
 * <p>
 * <strong>Coordinate systems in GtkTreeView API</strong><br/>
 * Several different coordinate systems are exposed in the {@code GtkTreeView} API.
 * These are:
 * <p>
 * <img src="./doc-files/tree-view-coordinates.png" alt="">
 * <ul>
 * <li>Widget coordinates: Coordinates relative to the widget (usually {@code widget->window}).
 * </ul>
 * <ul>
 * <li>Bin window coordinates: Coordinates relative to the window that GtkTreeView renders to.
 * </ul>
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
 * <strong>`GtkTreeView` as `GtkBuildable`</strong><br/>
 * The {@code GtkTreeView} implementation of the {@code GtkBuildable} interface accepts
 * {@link TreeViewColumn} objects as {@code <child>} elements and exposes the
 * internal {@link TreeSelection} in UI definitions.
 * <p>
 * An example of a UI definition fragment with {@code GtkTreeView}:
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
 * <strong>CSS nodes</strong><br/>
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
public class TreeView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeView";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TreeView proxy instance for the provided memory address.
     * <p>
     * Because TreeView is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeView(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeView> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeView(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget.
     */
    public TreeView() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithModel(org.gtk.gtk.TreeModel model) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_new_with_model.invokeExact(
                    model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget with the model initialized to {@code model}.
     * @param model the model.
     * @return A newly created {@code GtkTreeView} widget.
     */
    public static TreeView newWithModel(org.gtk.gtk.TreeModel model) {
        var RESULT = constructNewWithModel(model);
        return (org.gtk.gtk.TreeView) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeView.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Appends {@code column} to the list of columns. If {@code tree_view} has “fixed_height”
     * mode enabled, then {@code column} must have its “sizing” property set to be
     * GTK_TREE_VIEW_COLUMN_FIXED.
     * @param column The {@code GtkTreeViewColumn} to add.
     * @return The number of columns in {@code tree_view} after appending.
     */
    public int appendColumn(org.gtk.gtk.TreeViewColumn column) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_append_column.invokeExact(
                    handle(),
                    column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Recursively collapses all visible, expanded nodes in {@code tree_view}.
     */
    public void collapseAll() {
        try {
            DowncallHandles.gtk_tree_view_collapse_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Collapses a row (hides its child rows, if they exist).
     * @param path path to a row in the {@code tree_view}
     * @return {@code true} if the row was collapsed.
     */
    public boolean collapseRow(org.gtk.gtk.TreePath path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_collapse_row.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Resizes all columns to their optimal width. Only works after the
     * treeview has been realized.
     */
    public void columnsAutosize() {
        try {
            DowncallHandles.gtk_tree_view_columns_autosize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Converts bin_window coordinates to coordinates for the
     * tree (the full scrollable area of the tree).
     * @param bx X coordinate relative to bin_window
     * @param by Y coordinate relative to bin_window
     * @param tx return location for tree X coordinate
     * @param ty return location for tree Y coordinate
     */
    public void convertBinWindowToTreeCoords(int bx, int by, Out<Integer> tx, Out<Integer> ty) {
        MemorySegment txPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment tyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_bin_window_to_tree_coords.invokeExact(
                    handle(),
                    bx,
                    by,
                    (Addressable) txPOINTER.address(),
                    (Addressable) tyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tx.set(txPOINTER.get(Interop.valueLayout.C_INT, 0));
        ty.set(tyPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts bin_window coordinates to widget relative coordinates.
     * @param bx bin_window X coordinate
     * @param by bin_window Y coordinate
     * @param wx return location for widget X coordinate
     * @param wy return location for widget Y coordinate
     */
    public void convertBinWindowToWidgetCoords(int bx, int by, Out<Integer> wx, Out<Integer> wy) {
        MemorySegment wxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment wyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_bin_window_to_widget_coords.invokeExact(
                    handle(),
                    bx,
                    by,
                    (Addressable) wxPOINTER.address(),
                    (Addressable) wyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        wx.set(wxPOINTER.get(Interop.valueLayout.C_INT, 0));
        wy.set(wyPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * to bin_window coordinates.
     * @param tx tree X coordinate
     * @param ty tree Y coordinate
     * @param bx return location for X coordinate relative to bin_window
     * @param by return location for Y coordinate relative to bin_window
     */
    public void convertTreeToBinWindowCoords(int tx, int ty, Out<Integer> bx, Out<Integer> by) {
        MemorySegment bxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment byPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_tree_to_bin_window_coords.invokeExact(
                    handle(),
                    tx,
                    ty,
                    (Addressable) bxPOINTER.address(),
                    (Addressable) byPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bx.set(bxPOINTER.get(Interop.valueLayout.C_INT, 0));
        by.set(byPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts tree coordinates (coordinates in full scrollable area of the tree)
     * to widget coordinates.
     * @param tx X coordinate relative to the tree
     * @param ty Y coordinate relative to the tree
     * @param wx return location for widget X coordinate
     * @param wy return location for widget Y coordinate
     */
    public void convertTreeToWidgetCoords(int tx, int ty, Out<Integer> wx, Out<Integer> wy) {
        MemorySegment wxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment wyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_tree_to_widget_coords.invokeExact(
                    handle(),
                    tx,
                    ty,
                    (Addressable) wxPOINTER.address(),
                    (Addressable) wyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        wx.set(wxPOINTER.get(Interop.valueLayout.C_INT, 0));
        wy.set(wyPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts widget coordinates to coordinates for the bin_window.
     * @param wx X coordinate relative to the widget
     * @param wy Y coordinate relative to the widget
     * @param bx return location for bin_window X coordinate
     * @param by return location for bin_window Y coordinate
     */
    public void convertWidgetToBinWindowCoords(int wx, int wy, Out<Integer> bx, Out<Integer> by) {
        MemorySegment bxPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment byPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_widget_to_bin_window_coords.invokeExact(
                    handle(),
                    wx,
                    wy,
                    (Addressable) bxPOINTER.address(),
                    (Addressable) byPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bx.set(bxPOINTER.get(Interop.valueLayout.C_INT, 0));
        by.set(byPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Converts widget coordinates to coordinates for the
     * tree (the full scrollable area of the tree).
     * @param wx X coordinate relative to the widget
     * @param wy Y coordinate relative to the widget
     * @param tx return location for tree X coordinate
     * @param ty return location for tree Y coordinate
     */
    public void convertWidgetToTreeCoords(int wx, int wy, Out<Integer> tx, Out<Integer> ty) {
        MemorySegment txPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment tyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_convert_widget_to_tree_coords.invokeExact(
                    handle(),
                    wx,
                    wy,
                    (Addressable) txPOINTER.address(),
                    (Addressable) tyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        tx.set(txPOINTER.get(Interop.valueLayout.C_INT, 0));
        ty.set(tyPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Creates a {@code cairo_surface_t} representation of the row at {@code path}.
     * This image is used for a drag icon.
     * @param path a {@code GtkTreePath} in {@code tree_view}
     * @return a newly-allocated surface of the drag icon.
     */
    public @Nullable org.gtk.gdk.Paintable createRowDragIcon(org.gtk.gtk.TreePath path) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_create_row_drag_icon.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Turns {@code tree_view} into a drop destination for automatic DND. Calling
     * this method sets {@code GtkTreeView}:reorderable to {@code false}.
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            DowncallHandles.gtk_tree_view_enable_model_drag_dest.invokeExact(
                    handle(),
                    formats.handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Turns {@code tree_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkTreeView}:reorderable to {@code false}.
     * @param startButtonMask Mask of allowed buttons to start drag
     * @param formats the target formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public void enableModelDragSource(org.gtk.gdk.ModifierType startButtonMask, org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            DowncallHandles.gtk_tree_view_enable_model_drag_source.invokeExact(
                    handle(),
                    startButtonMask.getValue(),
                    formats.handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Recursively expands all nodes in the {@code tree_view}.
     */
    public void expandAll() {
        try {
            DowncallHandles.gtk_tree_view_expand_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Opens the row so its children are visible.
     * @param path path to a row
     * @param openAll whether to recursively expand, or just expand immediate children
     * @return {@code true} if the row existed and had children
     */
    public boolean expandRow(org.gtk.gtk.TreePath path, boolean openAll) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_expand_row.invokeExact(
                    handle(),
                    path.handle(),
                    Marshal.booleanToInteger.marshal(openAll, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Expands the row at {@code path}. This will also expand all parent rows of
     * {@code path} as necessary.
     * @param path path to a row.
     */
    public void expandToPath(org.gtk.gtk.TreePath path) {
        try {
            DowncallHandles.gtk_tree_view_expand_to_path.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
     * @return {@code true} if row-activated will be emitted on a single click
     */
    public boolean getActivateOnSingleClick() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_activate_on_single_click.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * {@code null}, or points to a node not found in the tree, the {@code y} and {@code height} fields of
     * the rectangle will be filled with 0. If {@code column} is {@code null}, the {@code x} and {@code width}
     * fields will be filled with 0.  The returned rectangle is equivalent to the
     * {@code background_area} passed to gtk_cell_renderer_render().  These background
     * areas tile to cover the entire bin window.  Contrast with the {@code cell_area},
     * returned by gtk_tree_view_get_cell_area(), which returns only the cell
     * itself, excluding surrounding borders and the tree expander area.
     * @param path a {@code GtkTreePath} for the row, or {@code null} to get only horizontal coordinates
     * @param column a {@code GtkTreeViewColumn} for the column, or {@code null} to get only vertical coordinates
     * @param rect rectangle to fill with cell background rect
     */
    public void getBackgroundArea(@Nullable org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        try {
            DowncallHandles.gtk_tree_view_get_background_area.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * {@code null}, or points to a path not currently displayed, the {@code y} and {@code height} fields
     * of the rectangle will be filled with 0. If {@code column} is {@code null}, the {@code x} and {@code width}
     * fields will be filled with 0.  The sum of all cell rects does not cover the
     * entire tree; there are extra pixels in between rows, for example. The
     * returned rectangle is equivalent to the {@code cell_area} passed to
     * gtk_cell_renderer_render().  This function is only valid if {@code tree_view} is
     * realized.
     * @param path a {@code GtkTreePath} for the row, or {@code null} to get only horizontal coordinates
     * @param column a {@code GtkTreeViewColumn} for the column, or {@code null} to get only vertical coordinates
     * @param rect rectangle to fill with cell rect
     */
    public void getCellArea(@Nullable org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        try {
            DowncallHandles.gtk_tree_view_get_cell_area.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code GtkTreeViewColumn} at the given position in the {@code tree_view}.
     * @param n The position of the column, counting from 0.
     * @return The {@code GtkTreeViewColumn}, or {@code null} if the
     * position is outside the range of columns.
     */
    public @Nullable org.gtk.gtk.TreeViewColumn getColumn(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_column.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code GList} of all the {@code GtkTreeViewColumn}s currently in {@code tree_view}.
     * The returned list must be freed with g_list_free ().
     * @return A list of {@code GtkTreeViewColumn}s
     */
    public org.gtk.glib.List getColumns() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Fills in {@code path} and {@code focus_column} with the current path and focus column.  If
     * the cursor isn’t currently set, then *{@code path} will be {@code null}.  If no column
     * currently has focus, then *{@code focus_column} will be {@code null}.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free() when
     * you are done with it.
     * @param path A pointer to be
     *   filled with the current cursor path
     * @param focusColumn A
     *   pointer to be filled with the current focus column
     */
    public void getCursor(@Nullable Out<org.gtk.gtk.TreePath> path, @Nullable Out<org.gtk.gtk.TreeViewColumn> focusColumn) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment focusColumnPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gtk_tree_view_get_cursor.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (focusColumn == null ? MemoryAddress.NULL : (Addressable) focusColumnPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (focusColumn != null) focusColumn.set((org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(focusColumnPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(focusColumnPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
    }
    
    /**
     * Determines the destination row for a given position.  {@code drag_x} and
     * {@code drag_y} are expected to be in widget coordinates.  This function is only
     * meaningful if {@code tree_view} is realized.  Therefore this function will always
     * return {@code false} if {@code tree_view} is not realized or does not have a model.
     * @param dragX the position to determine the destination row for
     * @param dragY the position to determine the destination row for
     * @param path Return location for the path of
     *   the highlighted row
     * @param pos Return location for the drop position, or
     *   {@code null}
     * @return whether there is a row at the given position, {@code true} if this
     * is indeed the case.
     */
    public boolean getDestRowAtPos(int dragX, int dragY, @Nullable Out<org.gtk.gtk.TreePath> path, @Nullable Out<org.gtk.gtk.TreeViewDropPosition> pos) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_dest_row_at_pos.invokeExact(
                    handle(),
                    dragX,
                    dragY,
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (pos == null ? MemoryAddress.NULL : (Addressable) posPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (pos != null) pos.set(org.gtk.gtk.TreeViewDropPosition.of(posPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets information about the row that is highlighted for feedback.
     * @param path Return location for the path of the highlighted row
     * @param pos Return location for the drop position
     */
    public void getDragDestRow(@Nullable Out<org.gtk.gtk.TreePath> path, @Nullable Out<org.gtk.gtk.TreeViewDropPosition> pos) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_tree_view_get_drag_dest_row.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (pos == null ? MemoryAddress.NULL : (Addressable) posPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (pos != null) pos.set(org.gtk.gtk.TreeViewDropPosition.of(posPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Returns whether or not the tree allows to start interactive searching
     * by typing in text.
     * @return whether or not to let the user search interactively
     */
    public boolean getEnableSearch() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_enable_search.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether or not tree lines are drawn in {@code tree_view}.
     * @return {@code true} if tree lines are drawn in {@code tree_view}, {@code false}
     * otherwise.
     */
    public boolean getEnableTreeLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_enable_tree_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the column that is the current expander column,
     * or {@code null} if none has been set.
     * This column has the expander arrow drawn next to it.
     * @return The expander column.
     */
    public @Nullable org.gtk.gtk.TreeViewColumn getExpanderColumn() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_expander_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether fixed height mode is turned on for {@code tree_view}.
     * @return {@code true} if {@code tree_view} is in fixed height mode
     */
    public boolean getFixedHeightMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_fixed_height_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns which grid lines are enabled in {@code tree_view}.
     * @return a {@code GtkTreeView}GridLines value indicating which grid lines
     * are enabled.
     */
    public org.gtk.gtk.TreeViewGridLines getGridLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_grid_lines.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.TreeViewGridLines.of(RESULT);
    }
    
    /**
     * Returns whether all header columns are clickable.
     * @return {@code true} if all header columns are clickable, otherwise {@code false}
     */
    public boolean getHeadersClickable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_headers_clickable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the headers on the {@code tree_view} are visible.
     * @return Whether the headers are visible or not.
     */
    public boolean getHeadersVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_headers_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether hover expansion mode is turned on for {@code tree_view}.
     * @return {@code true} if {@code tree_view} is in hover expansion mode
     */
    public boolean getHoverExpand() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_hover_expand.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether hover selection mode is turned on for {@code tree_view}.
     * @return {@code true} if {@code tree_view} is in hover selection mode
     */
    public boolean getHoverSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_hover_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the amount, in pixels, of extra indentation for child levels
     * in {@code tree_view}.
     * @return the amount of extra indentation for child levels in
     * {@code tree_view}.  A return value of 0 means that this feature is disabled.
     */
    public int getLevelIndentation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_level_indentation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkTreeView} is based on.  Returns {@code null} if the
     * model is unset.
     * @return A {@code GtkTreeModel}
     */
    public @Nullable org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Queries the number of columns in the given {@code tree_view}.
     * @return The number of columns in the {@code tree_view}
     */
    public int getNColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_n_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Finds the path at the point ({@code x}, {@code y}), relative to bin_window coordinates.
     * That is, {@code x} and {@code y} are relative to an events coordinates. Widget-relative
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
     * @param x The x position to be identified (relative to bin_window).
     * @param y The y position to be identified (relative to bin_window).
     * @param path A pointer to a {@code GtkTreePath}
     *   pointer to be filled in
     * @param column A pointer to
     *   a {@code GtkTreeViewColumn} pointer to be filled in
     * @param cellX A pointer where the X coordinate
     *   relative to the cell can be placed
     * @param cellY A pointer where the Y coordinate
     *   relative to the cell can be placed
     * @return {@code true} if a row exists at that coordinate.
     */
    public boolean getPathAtPos(int x, int y, @Nullable Out<org.gtk.gtk.TreePath> path, @Nullable Out<org.gtk.gtk.TreeViewColumn> column, Out<Integer> cellX, Out<Integer> cellY) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment columnPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment cellXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment cellYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_path_at_pos.invokeExact(
                    handle(),
                    x,
                    y,
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (column == null ? MemoryAddress.NULL : (Addressable) columnPOINTER.address()),
                    (Addressable) (cellX == null ? MemoryAddress.NULL : (Addressable) cellXPOINTER.address()),
                    (Addressable) (cellY == null ? MemoryAddress.NULL : (Addressable) cellYPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (column != null) column.set((org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(columnPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(columnPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (cellX != null) cellX.set(cellXPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (cellY != null) cellY.set(cellYPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves whether the user can reorder the tree via drag-and-drop. See
     * gtk_tree_view_set_reorderable().
     * @return {@code true} if the tree can be reordered.
     */
    public boolean getReorderable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_reorderable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the current row separator function.
     * @return the current row separator function.
     */
    public org.gtk.gtk.TreeViewRowSeparatorFunc getRowSeparatorFunc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_row_separator_func.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Returns whether rubber banding is turned on for {@code tree_view}.  If the
     * selection mode is {@link SelectionMode#MULTIPLE}, rubber banding will allow the
     * user to select multiple rows by dragging the mouse.
     * @return {@code true} if rubber banding in {@code tree_view} is enabled.
     */
    public boolean getRubberBanding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_rubber_banding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the column searched on by the interactive search code.
     * @return the column the interactive search code searches in.
     */
    public int getSearchColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_search_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkEntry} which is currently in use as interactive search
     * entry for {@code tree_view}.  In case the built-in entry is being used, {@code null}
     * will be returned.
     * @return the entry currently in use as search entry.
     */
    public @Nullable org.gtk.gtk.Editable getSearchEntry() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_search_entry.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Editable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Editable.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the compare function currently in use.
     * @return the currently used compare function for the search code.
     */
    public org.gtk.gtk.TreeViewSearchEqualFunc getSearchEqualFunc() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_search_equal_func.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Gets the {@code GtkTreeSelection} associated with {@code tree_view}.
     * @return A {@code GtkTreeSelection} object.
     */
    public org.gtk.gtk.TreeSelection getSelection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_view_get_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TreeSelection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.TreeSelection.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether or not expanders are drawn in {@code tree_view}.
     * @return {@code true} if expanders are drawn in {@code tree_view}, {@code false}
     * otherwise.
     */
    public boolean getShowExpanders() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_show_expanders.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the column of {@code tree_view}’s model which is being used for
     * displaying tooltips on {@code tree_view}’s rows.
     * @return the index of the tooltip column that is currently being
     * used, or -1 if this is disabled.
     */
    public int getTooltipColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_tooltip_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is supposed to be used in a ::query-tooltip
     * signal handler for {@code GtkTreeView}. The {@code x}, {@code y} and {@code keyboard_tip} values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * <p>
     * The return value indicates whether there is a tree view row at the given
     * coordinates ({@code true}) or not ({@code false}) for mouse tooltips. For keyboard
     * tooltips the row returned will be the cursor row. When {@code true}, then any of
     * {@code model}, {@code path} and {@code iter} which have been provided will be set to point to
     * that row and the corresponding model. {@code x} and {@code y} will always be converted
     * to be relative to {@code tree_view}’s bin_window if {@code keyboard_tooltip} is {@code false}.
     * @param x the x coordinate (relative to widget coordinates)
     * @param y the y coordinate (relative to widget coordinates)
     * @param keyboardTip whether this is a keyboard tooltip or not
     * @param model a pointer to
     *   receive a {@code GtkTreeModel}
     * @param path a pointer to receive a {@code GtkTreePath}
     * @param iter a pointer to receive a {@code GtkTreeIter}
     * @return whether or not the given tooltip context points to a row
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, @Nullable Out<org.gtk.gtk.TreeModel> model, @Nullable Out<org.gtk.gtk.TreePath> path, @Nullable org.gtk.gtk.TreeIter iter) {
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_tooltip_context.invokeExact(
                    handle(),
                    x,
                    y,
                    Marshal.booleanToInteger.marshal(keyboardTip, null).intValue(),
                    (Addressable) (model == null ? MemoryAddress.NULL : (Addressable) modelPOINTER.address()),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (model != null) model.set((org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeModel.fromAddress).marshal(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * The paths should be freed with gtk_tree_path_free() after use.
     * @param startPath Return location for start of region
     * @param endPath Return location for end of region
     * @return {@code true}, if valid paths were placed in {@code start_path} and {@code end_path}.
     */
    public boolean getVisibleRange(@Nullable Out<org.gtk.gtk.TreePath> startPath, @Nullable Out<org.gtk.gtk.TreePath> endPath) {
        MemorySegment startPathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment endPathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_get_visible_range.invokeExact(
                    handle(),
                    (Addressable) (startPath == null ? MemoryAddress.NULL : (Addressable) startPathPOINTER.address()),
                    (Addressable) (endPath == null ? MemoryAddress.NULL : (Addressable) endPathPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (startPath != null) startPath.set(org.gtk.gtk.TreePath.fromAddress.marshal(startPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (endPath != null) endPath.set(org.gtk.gtk.TreePath.fromAddress.marshal(endPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fills {@code visible_rect} with the currently-visible region of the
     * buffer, in tree coordinates. Convert to bin_window coordinates with
     * gtk_tree_view_convert_tree_to_bin_window_coords().
     * Tree coordinates start at 0,0 for row 0 of the tree, and cover the entire
     * scrollable area of the tree.
     * @param visibleRect rectangle to fill
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        try {
            DowncallHandles.gtk_tree_view_get_visible_rect.invokeExact(
                    handle(),
                    visibleRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This inserts the {@code column} into the {@code tree_view} at {@code position}.  If {@code position} is
     * -1, then the column is inserted at the end. If {@code tree_view} has
     * “fixed_height” mode enabled, then {@code column} must have its “sizing” property
     * set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param column The {@code GtkTreeViewColumn} to be inserted.
     * @param position The position to insert {@code column} in.
     * @return The number of columns in {@code tree_view} after insertion.
     */
    public int insertColumn(org.gtk.gtk.TreeViewColumn column, int position) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_insert_column.invokeExact(
                    handle(),
                    column.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeViewColumn} and inserts it into the {@code tree_view} at
     * {@code position}.  If {@code position} is -1, then the newly created column is inserted at
     * the end.  The column is initialized with the attributes given. If {@code tree_view}
     * has “fixed_height” mode enabled, then the new column will have its sizing
     * property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position The position to insert the new column in
     * @param title The title to set the header to
     * @param cell The {@code GtkCellRenderer}
     * @param varargs A {@code null}-terminated list of attributes
     * @return The number of columns in {@code tree_view} after insertion.
     */
    public int insertColumnWithAttributes(int position, java.lang.String title, org.gtk.gtk.CellRenderer cell, java.lang.Object... varargs) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_insert_column_with_attributes.invokeExact(
                    handle(),
                    position,
                    Marshal.stringToAddress.marshal(title, null),
                    cell.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convenience function that inserts a new column into the {@code GtkTreeView}
     * with the given cell renderer and a {@code GtkTreeCellDataFunc} to set cell renderer
     * attributes (normally using data from the model). See also
     * gtk_tree_view_column_set_cell_data_func(), gtk_tree_view_column_pack_start().
     * If {@code tree_view} has “fixed_height” mode enabled, then the new column will have its
     * “sizing” property set to be GTK_TREE_VIEW_COLUMN_FIXED.
     * @param position Position to insert, -1 for append
     * @param title column title
     * @param cell cell renderer for column
     * @param func function to set attributes of cell renderer
     * @param dnotify destroy notifier for {@code data}
     * @return number of columns in the tree view post-insert
     */
    public int insertColumnWithDataFunc(int position, java.lang.String title, org.gtk.gtk.CellRenderer cell, org.gtk.gtk.TreeCellDataFunc func, org.gtk.glib.DestroyNotify dnotify) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_insert_column_with_data_func.invokeExact(
                    handle(),
                    position,
                    Marshal.stringToAddress.marshal(title, null),
                    cell.handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) dnotify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Determine whether the point ({@code x}, {@code y}) in {@code tree_view} is blank, that is no
     * cell content nor an expander arrow is drawn at the location. If so, the
     * location can be considered as the background. You might wish to take
     * special action on clicks on the background, such as clearing a current
     * selection, having a custom context menu or starting rubber banding.
     * <p>
     * The {@code x} and {@code y} coordinate that are provided must be relative to bin_window
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
     * @param x The x position to be identified (relative to bin_window)
     * @param y The y position to be identified (relative to bin_window)
     * @param path A pointer to a {@code GtkTreePath} pointer to
     *   be filled in
     * @param column A pointer to a
     *   {@code GtkTreeViewColumn} pointer to be filled in
     * @param cellX A pointer where the X coordinate relative to the
     *   cell can be placed
     * @param cellY A pointer where the Y coordinate relative to the
     *   cell can be placed
     * @return {@code true} if the area at the given coordinates is blank,
     * {@code false} otherwise.
     */
    public boolean isBlankAtPos(int x, int y, @Nullable Out<org.gtk.gtk.TreePath> path, @Nullable Out<org.gtk.gtk.TreeViewColumn> column, Out<Integer> cellX, Out<Integer> cellY) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment columnPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment cellXPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment cellYPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_is_blank_at_pos.invokeExact(
                    handle(),
                    x,
                    y,
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) (column == null ? MemoryAddress.NULL : (Addressable) columnPOINTER.address()),
                    (Addressable) (cellX == null ? MemoryAddress.NULL : (Addressable) cellXPOINTER.address()),
                    (Addressable) (cellY == null ? MemoryAddress.NULL : (Addressable) cellYPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(org.gtk.gtk.TreePath.fromAddress.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (column != null) column.set((org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(columnPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(columnPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (cellX != null) cellX.set(cellXPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (cellY != null) cellY.set(cellYPOINTER.get(Interop.valueLayout.C_INT, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether a rubber banding operation is currently being done
     * in {@code tree_view}.
     * @return {@code true} if a rubber banding operation is currently being
     * done in {@code tree_view}.
     */
    public boolean isRubberBandingActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_is_rubber_banding_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Calls {@code func} on all expanded rows.
     * @param func A function to be called
     */
    public void mapExpandedRows(org.gtk.gtk.TreeViewMappingFunc func) {
        try {
            DowncallHandles.gtk_tree_view_map_expanded_rows.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code column} to be after to {@code base_column}.  If {@code base_column} is {@code null}, then
     * {@code column} is placed in the first position.
     * @param column The {@code GtkTreeViewColumn} to be moved.
     * @param baseColumn The {@code GtkTreeViewColumn} to be moved relative to
     */
    public void moveColumnAfter(org.gtk.gtk.TreeViewColumn column, @Nullable org.gtk.gtk.TreeViewColumn baseColumn) {
        try {
            DowncallHandles.gtk_tree_view_move_column_after.invokeExact(
                    handle(),
                    column.handle(),
                    (Addressable) (baseColumn == null ? MemoryAddress.NULL : baseColumn.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code column} from {@code tree_view}.
     * @param column The {@code GtkTreeViewColumn} to remove.
     * @return The number of columns in {@code tree_view} after removing.
     */
    public int removeColumn(org.gtk.gtk.TreeViewColumn column) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_remove_column.invokeExact(
                    handle(),
                    column.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Activates the cell determined by {@code path} and {@code column}.
     * @param path The {@code GtkTreePath} to be activated.
     * @param column The {@code GtkTreeViewColumn} to be activated.
     */
    public void rowActivated(org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column) {
        try {
            DowncallHandles.gtk_tree_view_row_activated.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if the node pointed to by {@code path} is expanded in {@code tree_view}.
     * @param path A {@code GtkTreePath} to test expansion state.
     * @return {@code true} if {@code path} is expanded.
     */
    public boolean rowExpanded(org.gtk.gtk.TreePath path) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_view_row_expanded.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param path The path of the row to move to
     * @param column The {@code GtkTreeViewColumn} to move horizontally to
     * @param useAlign whether to use alignment arguments, or {@code false}.
     * @param rowAlign The vertical alignment of the row specified by {@code path}.
     * @param colAlign The horizontal alignment of the column specified by {@code column}.
     */
    public void scrollToCell(@Nullable org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column, boolean useAlign, float rowAlign, float colAlign) {
        try {
            DowncallHandles.gtk_tree_view_scroll_to_cell.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()),
                    Marshal.booleanToInteger.marshal(useAlign, null).intValue(),
                    rowAlign,
                    colAlign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scrolls the tree view such that the top-left corner of the visible
     * area is {@code tree_x}, {@code tree_y}, where {@code tree_x} and {@code tree_y} are specified
     * in tree coordinates.  The {@code tree_view} must be realized before
     * this function is called.  If it isn't, you probably want to be
     * using gtk_tree_view_scroll_to_cell().
     * <p>
     * If either {@code tree_x} or {@code tree_y} are -1, then that direction isn’t scrolled.
     * @param treeX X coordinate of new top-left pixel of visible area, or -1
     * @param treeY Y coordinate of new top-left pixel of visible area, or -1
     */
    public void scrollToPoint(int treeX, int treeY) {
        try {
            DowncallHandles.gtk_tree_view_scroll_to_point.invokeExact(
                    handle(),
                    treeX,
                    treeY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Cause the {@code GtkTreeView}::row-activated signal to be emitted
     * on a single click instead of a double click.
     * @param single {@code true} to emit row-activated on a single click
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            DowncallHandles.gtk_tree_view_set_activate_on_single_click.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(single, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param func A function to determine which columns are reorderable
     * @param destroy Destroy notifier for {@code user_data}
     */
    public void setColumnDragFunction(@Nullable org.gtk.gtk.TreeViewColumnDropFunc func, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_view_set_column_drag_function.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param path A {@code GtkTreePath}
     * @param focusColumn A {@code GtkTreeViewColumn}
     * @param startEditing {@code true} if the specified cell should start being edited.
     */
    public void setCursor(org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn focusColumn, boolean startEditing) {
        try {
            DowncallHandles.gtk_tree_view_set_cursor.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (focusColumn == null ? MemoryAddress.NULL : focusColumn.handle()),
                    Marshal.booleanToInteger.marshal(startEditing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param path A {@code GtkTreePath}
     * @param focusColumn A {@code GtkTreeViewColumn}
     * @param focusCell A {@code GtkCellRenderer}
     * @param startEditing {@code true} if the specified cell should start being edited.
     */
    public void setCursorOnCell(org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn focusColumn, @Nullable org.gtk.gtk.CellRenderer focusCell, boolean startEditing) {
        try {
            DowncallHandles.gtk_tree_view_set_cursor_on_cell.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (focusColumn == null ? MemoryAddress.NULL : focusColumn.handle()),
                    (Addressable) (focusCell == null ? MemoryAddress.NULL : focusCell.handle()),
                    Marshal.booleanToInteger.marshal(startEditing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the row that is highlighted for feedback.
     * If {@code path} is {@code null}, an existing highlight is removed.
     * @param path The path of the row to highlight
     * @param pos Specifies whether to drop before, after or into the row
     */
    public void setDragDestRow(@Nullable org.gtk.gtk.TreePath path, org.gtk.gtk.TreeViewDropPosition pos) {
        try {
            DowncallHandles.gtk_tree_view_set_drag_dest_row.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code enable_search} is set, then the user can type in text to search through
     * the tree interactively (this is sometimes called "typeahead find").
     * <p>
     * Note that even if this is {@code false}, the user can still initiate a search
     * using the “start-interactive-search” key binding.
     * @param enableSearch {@code true}, if the user can search interactively
     */
    public void setEnableSearch(boolean enableSearch) {
        try {
            DowncallHandles.gtk_tree_view_set_enable_search.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableSearch, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to draw lines interconnecting the expanders in {@code tree_view}.
     * This does not have any visible effects for lists.
     * @param enabled {@code true} to enable tree line drawing, {@code false} otherwise.
     */
    public void setEnableTreeLines(boolean enabled) {
        try {
            DowncallHandles.gtk_tree_view_set_enable_tree_lines.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the column to draw the expander arrow at. It must be in {@code tree_view}.
     * If {@code column} is {@code null}, then the expander arrow is always at the first
     * visible column.
     * <p>
     * If you do not want expander arrow to appear in your tree, set the
     * expander column to a hidden column.
     * @param column {@code null}, or the column to draw the expander arrow at.
     */
    public void setExpanderColumn(@Nullable org.gtk.gtk.TreeViewColumn column) {
        try {
            DowncallHandles.gtk_tree_view_set_expander_column.invokeExact(
                    handle(),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables the fixed height mode of {@code tree_view}.
     * Fixed height mode speeds up {@code GtkTreeView} by assuming that all
     * rows have the same height.
     * Only enable this option if all rows are the same height and all
     * columns are of type {@link TreeViewColumnSizing#FIXED}.
     * @param enable {@code true} to enable fixed height mode
     */
    public void setFixedHeightMode(boolean enable) {
        try {
            DowncallHandles.gtk_tree_view_set_fixed_height_mode.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets which grid lines to draw in {@code tree_view}.
     * @param gridLines a {@code GtkTreeView}GridLines value indicating which grid lines to
     * enable.
     */
    public void setGridLines(org.gtk.gtk.TreeViewGridLines gridLines) {
        try {
            DowncallHandles.gtk_tree_view_set_grid_lines.invokeExact(
                    handle(),
                    gridLines.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allow the column title buttons to be clicked.
     * @param setting {@code true} if the columns are clickable.
     */
    public void setHeadersClickable(boolean setting) {
        try {
            DowncallHandles.gtk_tree_view_set_headers_clickable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the visibility state of the headers.
     * @param headersVisible {@code true} if the headers are visible
     */
    public void setHeadersVisible(boolean headersVisible) {
        try {
            DowncallHandles.gtk_tree_view_set_headers_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(headersVisible, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables the hover expansion mode of {@code tree_view}.
     * Hover expansion makes rows expand or collapse if the pointer
     * moves over them.
     * @param expand {@code true} to enable hover selection mode
     */
    public void setHoverExpand(boolean expand) {
        try {
            DowncallHandles.gtk_tree_view_set_hover_expand.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables the hover selection mode of {@code tree_view}.
     * Hover selection makes the selected row follow the pointer.
     * Currently, this works only for the selection modes
     * {@link SelectionMode#SINGLE} and {@link SelectionMode#BROWSE}.
     * @param hover {@code true} to enable hover selection mode
     */
    public void setHoverSelection(boolean hover) {
        try {
            DowncallHandles.gtk_tree_view_set_hover_selection.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(hover, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of extra indentation for child levels to use in {@code tree_view}
     * in addition to the default indentation.  The value should be specified in
     * pixels, a value of 0 disables this feature and in this case only the default
     * indentation will be used.
     * This does not have any visible effects for lists.
     * @param indentation the amount, in pixels, of extra indentation in {@code tree_view}.
     */
    public void setLevelIndentation(int indentation) {
        try {
            DowncallHandles.gtk_tree_view_set_level_indentation.invokeExact(
                    handle(),
                    indentation);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model for a {@code GtkTreeView}.  If the {@code tree_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is {@code null},
     * then it will unset the old model.
     * @param model The model.
     */
    public void setModel(@Nullable org.gtk.gtk.TreeModel model) {
        try {
            DowncallHandles.gtk_tree_view_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param reorderable {@code true}, if the tree can be reordered.
     */
    public void setReorderable(boolean reorderable) {
        try {
            DowncallHandles.gtk_tree_view_set_reorderable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(reorderable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator. If the row separator
     * function is {@code null}, no separators are drawn. This is the default value.
     * @param func a {@code GtkTreeView}RowSeparatorFunc
     * @param destroy destroy notifier for {@code data}
     */
    public void setRowSeparatorFunc(@Nullable org.gtk.gtk.TreeViewRowSeparatorFunc func, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_view_set_row_separator_func.invokeExact(
                    handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables or disables rubber banding in {@code tree_view}.  If the selection mode
     * is {@link SelectionMode#MULTIPLE}, rubber banding will allow the user to select
     * multiple rows by dragging the mouse.
     * @param enable {@code true} to enable rubber banding
     */
    public void setRubberBanding(boolean enable) {
        try {
            DowncallHandles.gtk_tree_view_set_rubber_banding.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param column the column of the model to search in, or -1 to disable searching
     */
    public void setSearchColumn(int column) {
        try {
            DowncallHandles.gtk_tree_view_set_search_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the entry which the interactive search code will use for this
     * {@code tree_view}.  This is useful when you want to provide a search entry
     * in our interface at all time at a fixed position.  Passing {@code null} for
     * {@code entry} will make the interactive search code use the built-in popup
     * entry again.
     * @param entry the entry the interactive search code of {@code tree_view} should use
     */
    public void setSearchEntry(@Nullable org.gtk.gtk.Editable entry) {
        try {
            DowncallHandles.gtk_tree_view_set_search_entry.invokeExact(
                    handle(),
                    (Addressable) (entry == null ? MemoryAddress.NULL : entry.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the compare function for the interactive search capabilities; note
     * that somewhat like strcmp() returning 0 for equality
     * {@code GtkTreeView}SearchEqualFunc returns {@code false} on matches.
     * @param searchEqualFunc the compare function to use during the search
     * @param searchDestroy Destroy notifier for {@code search_user_data}
     */
    public void setSearchEqualFunc(org.gtk.gtk.TreeViewSearchEqualFunc searchEqualFunc, @Nullable org.gtk.glib.DestroyNotify searchDestroy) {
        try {
            DowncallHandles.gtk_tree_view_set_search_equal_func.invokeExact(
                    handle(),
                    (Addressable) searchEqualFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (searchDestroy == null ? MemoryAddress.NULL : (Addressable) searchDestroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to draw and enable expanders and indent child rows in
     * {@code tree_view}.  When disabled there will be no expanders visible in trees
     * and there will be no way to expand and collapse rows by default.  Also
     * note that hiding the expanders will disable the default indentation.  You
     * can set a custom indentation in this case using
     * gtk_tree_view_set_level_indentation().
     * This does not have any visible effects for lists.
     * @param enabled {@code true} to enable expander drawing, {@code false} otherwise.
     */
    public void setShowExpanders(boolean enabled) {
        try {
            DowncallHandles.gtk_tree_view_set_show_expanders.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param tooltip a {@code GtkTooltip}
     * @param path a {@code GtkTreePath}
     * @param column a {@code GtkTreeViewColumn}
     * @param cell a {@code GtkCellRenderer}
     */
    public void setTooltipCell(org.gtk.gtk.Tooltip tooltip, @Nullable org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column, @Nullable org.gtk.gtk.CellRenderer cell) {
        try {
            DowncallHandles.gtk_tree_view_set_tooltip_cell.invokeExact(
                    handle(),
                    tooltip.handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    (Addressable) (column == null ? MemoryAddress.NULL : column.handle()),
                    (Addressable) (cell == null ? MemoryAddress.NULL : cell.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * so &amp;, &lt;, etc have to be escaped in the text.
     * @param column an integer, which is a valid column number for {@code tree_view}’s model
     */
    public void setTooltipColumn(int column) {
        try {
            DowncallHandles.gtk_tree_view_set_tooltip_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the row at {@code path}.
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     * @param tooltip a {@code GtkTooltip}
     * @param path a {@code GtkTreePath}
     */
    public void setTooltipRow(org.gtk.gtk.Tooltip tooltip, org.gtk.gtk.TreePath path) {
        try {
            DowncallHandles.gtk_tree_view_set_tooltip_row.invokeExact(
                    handle(),
                    tooltip.handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_dest(). Calling this method sets
     * {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void unsetRowsDragDest() {
        try {
            DowncallHandles.gtk_tree_view_unset_rows_drag_dest.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_source(). Calling this method sets
     * {@code GtkTreeView}:reorderable to {@code false}.
     */
    public void unsetRowsDragSource() {
        try {
            DowncallHandles.gtk_tree_view_unset_rows_drag_source.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gtk_tree_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ColumnsChanged {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeView) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ColumnsChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The number of columns of the treeview has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.ColumnsChanged> onColumnsChanged(TreeView.ColumnsChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("columns-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CursorChanged {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeView) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CursorChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The position of the cursor (focused cell) has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.CursorChanged> onCursorChanged(TreeView.CursorChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cursor-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ExpandCollapseCursorRow {
        boolean run(boolean object, boolean p0, boolean p1);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView, int object, int p0, int p1) {
            var RESULT = run(Marshal.integerToBoolean.marshal(object, null).booleanValue(), Marshal.integerToBoolean.marshal(p0, null).booleanValue(), Marshal.integerToBoolean.marshal(p1, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ExpandCollapseCursorRow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.ExpandCollapseCursorRow> onExpandCollapseCursorRow(TreeView.ExpandCollapseCursorRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("expand-collapse-cursor-row"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        boolean run(org.gtk.gtk.MovementStep step, int direction, boolean extend, boolean modify);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView, int step, int direction, int extend, int modify) {
            var RESULT = run(org.gtk.gtk.MovementStep.of(step), direction, Marshal.integerToBoolean.marshal(extend, null).booleanValue(), Marshal.integerToBoolean.marshal(modify, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MoveCursor.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.MoveCursor> onMoveCursor(TreeView.MoveCursor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-cursor"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowActivated {
        void run(org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.TreeViewColumn column);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeView, MemoryAddress path, MemoryAddress column) {
            run(org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE), (org.gtk.gtk.TreeViewColumn) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(column)), org.gtk.gtk.TreeViewColumn.fromAddress).marshal(column, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowActivated.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * of the keys: &lt;kbd&gt;Space&lt;/kbd&gt;, &lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Space&lt;/kbd&gt;,
     * &lt;kbd&gt;Return&lt;/kbd&gt; or &lt;kbd&gt;Enter&lt;/kbd&gt; is pressed.
     * <p>
     * For selection handling refer to the
     * <a href="section-tree-widget.html">tree widget conceptual overview</a>
     * as well as {@code GtkTreeSelection}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.RowActivated> onRowActivated(TreeView.RowActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("row-activated"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowCollapsed {
        void run(org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeView, MemoryAddress iter, MemoryAddress path) {
            run(org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowCollapsed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The given row has been collapsed (child nodes are hidden).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.RowCollapsed> onRowCollapsed(TreeView.RowCollapsed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("row-collapsed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RowExpanded {
        void run(org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeView, MemoryAddress iter, MemoryAddress path) {
            run(org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowExpanded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The given row has been expanded (child nodes are shown).
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.RowExpanded> onRowExpanded(TreeView.RowExpanded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("row-expanded"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAll {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectAll.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.SelectAll> onSelectAll(TreeView.SelectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-all"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorParent {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectCursorParent.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.SelectCursorParent> onSelectCursorParent(TreeView.SelectCursorParent handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-cursor-parent"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorRow {
        boolean run(boolean object);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView, int object) {
            var RESULT = run(Marshal.integerToBoolean.marshal(object, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SelectCursorRow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.SelectCursorRow> onSelectCursorRow(TreeView.SelectCursorRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-cursor-row"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StartInteractiveSearch {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartInteractiveSearch.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.StartInteractiveSearch> onStartInteractiveSearch(TreeView.StartInteractiveSearch handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("start-interactive-search"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TestCollapseRow {
        boolean run(org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run(org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TestCollapseRow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The given row is about to be collapsed (hide its children nodes). Use this
     * signal if you need to control the collapsibility of individual rows.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.TestCollapseRow> onTestCollapseRow(TreeView.TestCollapseRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("test-collapse-row"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface TestExpandRow {
        boolean run(org.gtk.gtk.TreeIter iter, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView, MemoryAddress iter, MemoryAddress path) {
            var RESULT = run(org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TestExpandRow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The given row is about to be expanded (show its children nodes). Use this
     * signal if you need to control the expandability of individual rows.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TreeView.TestExpandRow> onTestExpandRow(TreeView.TestExpandRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("test-expand-row"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRow {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ToggleCursorRow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.ToggleCursorRow> onToggleCursorRow(TreeView.ToggleCursorRow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-cursor-row"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAll {
        boolean run();

        @ApiStatus.Internal default int upcall(MemoryAddress sourceTreeView) {
            var RESULT = run();
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnselectAll.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<TreeView.UnselectAll> onUnselectAll(TreeView.UnselectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("unselect-all"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TreeView.Builder} object constructs a {@link TreeView} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TreeView.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TreeView} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TreeView}.
         * @return A new instance of {@code TreeView} with the properties 
         *         that were set in the Builder object.
         */
        public TreeView build() {
            return (TreeView) org.gtk.gobject.GObject.newWithProperties(
                TreeView.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The activate-on-single-click property specifies whether the "row-activated" signal
         * will be emitted after a single click.
         * @param activateOnSingleClick The value for the {@code activate-on-single-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivateOnSingleClick(boolean activateOnSingleClick) {
            names.add("activate-on-single-click");
            values.add(org.gtk.gobject.Value.create(activateOnSingleClick));
            return this;
        }
        
        public Builder setEnableGridLines(org.gtk.gtk.TreeViewGridLines enableGridLines) {
            names.add("enable-grid-lines");
            values.add(org.gtk.gobject.Value.create(enableGridLines));
            return this;
        }
        
        public Builder setEnableSearch(boolean enableSearch) {
            names.add("enable-search");
            values.add(org.gtk.gobject.Value.create(enableSearch));
            return this;
        }
        
        public Builder setEnableTreeLines(boolean enableTreeLines) {
            names.add("enable-tree-lines");
            values.add(org.gtk.gobject.Value.create(enableTreeLines));
            return this;
        }
        
        public Builder setExpanderColumn(org.gtk.gtk.TreeViewColumn expanderColumn) {
            names.add("expander-column");
            values.add(org.gtk.gobject.Value.create(expanderColumn));
            return this;
        }
        
        /**
         * Setting the ::fixed-height-mode property to {@code true} speeds up
         * {@code GtkTreeView} by assuming that all rows have the same height.
         * Only enable this option if all rows are the same height.
         * Please see gtk_tree_view_set_fixed_height_mode() for more
         * information on this option.
         * @param fixedHeightMode The value for the {@code fixed-height-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFixedHeightMode(boolean fixedHeightMode) {
            names.add("fixed-height-mode");
            values.add(org.gtk.gobject.Value.create(fixedHeightMode));
            return this;
        }
        
        public Builder setHeadersClickable(boolean headersClickable) {
            names.add("headers-clickable");
            values.add(org.gtk.gobject.Value.create(headersClickable));
            return this;
        }
        
        public Builder setHeadersVisible(boolean headersVisible) {
            names.add("headers-visible");
            values.add(org.gtk.gobject.Value.create(headersVisible));
            return this;
        }
        
        /**
         * Enables or disables the hover expansion mode of {@code tree_view}.
         * Hover expansion makes rows expand or collapse if the pointer moves
         * over them.
         * <p>
         * This mode is primarily intended for treeviews in popups, e.g.
         * in {@code GtkComboBox} or {@code GtkEntryCompletion}.
         * @param hoverExpand The value for the {@code hover-expand} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHoverExpand(boolean hoverExpand) {
            names.add("hover-expand");
            values.add(org.gtk.gobject.Value.create(hoverExpand));
            return this;
        }
        
        /**
         * Enables or disables the hover selection mode of {@code tree_view}.
         * Hover selection makes the selected row follow the pointer.
         * Currently, this works only for the selection modes
         * {@link SelectionMode#SINGLE} and {@link SelectionMode#BROWSE}.
         * <p>
         * This mode is primarily intended for treeviews in popups, e.g.
         * in {@code GtkComboBox} or {@code GtkEntryCompletion}.
         * @param hoverSelection The value for the {@code hover-selection} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHoverSelection(boolean hoverSelection) {
            names.add("hover-selection");
            values.add(org.gtk.gobject.Value.create(hoverSelection));
            return this;
        }
        
        /**
         * Extra indentation for each level.
         * @param levelIndentation The value for the {@code level-indentation} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLevelIndentation(int levelIndentation) {
            names.add("level-indentation");
            values.add(org.gtk.gobject.Value.create(levelIndentation));
            return this;
        }
        
        public Builder setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        public Builder setReorderable(boolean reorderable) {
            names.add("reorderable");
            values.add(org.gtk.gobject.Value.create(reorderable));
            return this;
        }
        
        public Builder setRubberBanding(boolean rubberBanding) {
            names.add("rubber-banding");
            values.add(org.gtk.gobject.Value.create(rubberBanding));
            return this;
        }
        
        public Builder setSearchColumn(int searchColumn) {
            names.add("search-column");
            values.add(org.gtk.gobject.Value.create(searchColumn));
            return this;
        }
        
        /**
         * {@code true} if the view has expanders.
         * @param showExpanders The value for the {@code show-expanders} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowExpanders(boolean showExpanders) {
            names.add("show-expanders");
            values.add(org.gtk.gobject.Value.create(showExpanders));
            return this;
        }
        
        public Builder setTooltipColumn(int tooltipColumn) {
            names.add("tooltip-column");
            values.add(org.gtk.gobject.Value.create(tooltipColumn));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_view_new = Interop.downcallHandle(
            "gtk_tree_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_new_with_model = Interop.downcallHandle(
            "gtk_tree_view_new_with_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_append_column = Interop.downcallHandle(
            "gtk_tree_view_append_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_collapse_all = Interop.downcallHandle(
            "gtk_tree_view_collapse_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_collapse_row = Interop.downcallHandle(
            "gtk_tree_view_collapse_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_columns_autosize = Interop.downcallHandle(
            "gtk_tree_view_columns_autosize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_bin_window_to_tree_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_bin_window_to_tree_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_bin_window_to_widget_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_bin_window_to_widget_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_tree_to_bin_window_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_tree_to_bin_window_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_tree_to_widget_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_tree_to_widget_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_widget_to_bin_window_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_widget_to_bin_window_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_convert_widget_to_tree_coords = Interop.downcallHandle(
            "gtk_tree_view_convert_widget_to_tree_coords",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_create_row_drag_icon = Interop.downcallHandle(
            "gtk_tree_view_create_row_drag_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_enable_model_drag_dest = Interop.downcallHandle(
            "gtk_tree_view_enable_model_drag_dest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_enable_model_drag_source = Interop.downcallHandle(
            "gtk_tree_view_enable_model_drag_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_expand_all = Interop.downcallHandle(
            "gtk_tree_view_expand_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_expand_row = Interop.downcallHandle(
            "gtk_tree_view_expand_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_expand_to_path = Interop.downcallHandle(
            "gtk_tree_view_expand_to_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_activate_on_single_click = Interop.downcallHandle(
            "gtk_tree_view_get_activate_on_single_click",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_background_area = Interop.downcallHandle(
            "gtk_tree_view_get_background_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_cell_area = Interop.downcallHandle(
            "gtk_tree_view_get_cell_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_column = Interop.downcallHandle(
            "gtk_tree_view_get_column",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_columns = Interop.downcallHandle(
            "gtk_tree_view_get_columns",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_cursor = Interop.downcallHandle(
            "gtk_tree_view_get_cursor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_dest_row_at_pos = Interop.downcallHandle(
            "gtk_tree_view_get_dest_row_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_drag_dest_row = Interop.downcallHandle(
            "gtk_tree_view_get_drag_dest_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_enable_search = Interop.downcallHandle(
            "gtk_tree_view_get_enable_search",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_enable_tree_lines = Interop.downcallHandle(
            "gtk_tree_view_get_enable_tree_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_expander_column = Interop.downcallHandle(
            "gtk_tree_view_get_expander_column",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_fixed_height_mode = Interop.downcallHandle(
            "gtk_tree_view_get_fixed_height_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_grid_lines = Interop.downcallHandle(
            "gtk_tree_view_get_grid_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_headers_clickable = Interop.downcallHandle(
            "gtk_tree_view_get_headers_clickable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_headers_visible = Interop.downcallHandle(
            "gtk_tree_view_get_headers_visible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_hover_expand = Interop.downcallHandle(
            "gtk_tree_view_get_hover_expand",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_hover_selection = Interop.downcallHandle(
            "gtk_tree_view_get_hover_selection",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_level_indentation = Interop.downcallHandle(
            "gtk_tree_view_get_level_indentation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_model = Interop.downcallHandle(
            "gtk_tree_view_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_n_columns = Interop.downcallHandle(
            "gtk_tree_view_get_n_columns",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_path_at_pos = Interop.downcallHandle(
            "gtk_tree_view_get_path_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_reorderable = Interop.downcallHandle(
            "gtk_tree_view_get_reorderable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_row_separator_func = Interop.downcallHandle(
            "gtk_tree_view_get_row_separator_func",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_rubber_banding = Interop.downcallHandle(
            "gtk_tree_view_get_rubber_banding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_search_column = Interop.downcallHandle(
            "gtk_tree_view_get_search_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_search_entry = Interop.downcallHandle(
            "gtk_tree_view_get_search_entry",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_search_equal_func = Interop.downcallHandle(
            "gtk_tree_view_get_search_equal_func",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_selection = Interop.downcallHandle(
            "gtk_tree_view_get_selection",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_show_expanders = Interop.downcallHandle(
            "gtk_tree_view_get_show_expanders",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_tooltip_column = Interop.downcallHandle(
            "gtk_tree_view_get_tooltip_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_tooltip_context = Interop.downcallHandle(
            "gtk_tree_view_get_tooltip_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_visible_range = Interop.downcallHandle(
            "gtk_tree_view_get_visible_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_visible_rect = Interop.downcallHandle(
            "gtk_tree_view_get_visible_rect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_insert_column = Interop.downcallHandle(
            "gtk_tree_view_insert_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_insert_column_with_attributes = Interop.downcallHandle(
            "gtk_tree_view_insert_column_with_attributes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_tree_view_insert_column_with_data_func = Interop.downcallHandle(
            "gtk_tree_view_insert_column_with_data_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_is_blank_at_pos = Interop.downcallHandle(
            "gtk_tree_view_is_blank_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_is_rubber_banding_active = Interop.downcallHandle(
            "gtk_tree_view_is_rubber_banding_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_map_expanded_rows = Interop.downcallHandle(
            "gtk_tree_view_map_expanded_rows",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_move_column_after = Interop.downcallHandle(
            "gtk_tree_view_move_column_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_remove_column = Interop.downcallHandle(
            "gtk_tree_view_remove_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_row_activated = Interop.downcallHandle(
            "gtk_tree_view_row_activated",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_row_expanded = Interop.downcallHandle(
            "gtk_tree_view_row_expanded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_scroll_to_cell = Interop.downcallHandle(
            "gtk_tree_view_scroll_to_cell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_scroll_to_point = Interop.downcallHandle(
            "gtk_tree_view_scroll_to_point",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_activate_on_single_click = Interop.downcallHandle(
            "gtk_tree_view_set_activate_on_single_click",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_column_drag_function = Interop.downcallHandle(
            "gtk_tree_view_set_column_drag_function",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_cursor = Interop.downcallHandle(
            "gtk_tree_view_set_cursor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_cursor_on_cell = Interop.downcallHandle(
            "gtk_tree_view_set_cursor_on_cell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_drag_dest_row = Interop.downcallHandle(
            "gtk_tree_view_set_drag_dest_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_enable_search = Interop.downcallHandle(
            "gtk_tree_view_set_enable_search",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_enable_tree_lines = Interop.downcallHandle(
            "gtk_tree_view_set_enable_tree_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_expander_column = Interop.downcallHandle(
            "gtk_tree_view_set_expander_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_fixed_height_mode = Interop.downcallHandle(
            "gtk_tree_view_set_fixed_height_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_grid_lines = Interop.downcallHandle(
            "gtk_tree_view_set_grid_lines",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_headers_clickable = Interop.downcallHandle(
            "gtk_tree_view_set_headers_clickable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_headers_visible = Interop.downcallHandle(
            "gtk_tree_view_set_headers_visible",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_hover_expand = Interop.downcallHandle(
            "gtk_tree_view_set_hover_expand",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_hover_selection = Interop.downcallHandle(
            "gtk_tree_view_set_hover_selection",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_level_indentation = Interop.downcallHandle(
            "gtk_tree_view_set_level_indentation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_model = Interop.downcallHandle(
            "gtk_tree_view_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_reorderable = Interop.downcallHandle(
            "gtk_tree_view_set_reorderable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_row_separator_func = Interop.downcallHandle(
            "gtk_tree_view_set_row_separator_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_rubber_banding = Interop.downcallHandle(
            "gtk_tree_view_set_rubber_banding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_search_column = Interop.downcallHandle(
            "gtk_tree_view_set_search_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_search_entry = Interop.downcallHandle(
            "gtk_tree_view_set_search_entry",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_search_equal_func = Interop.downcallHandle(
            "gtk_tree_view_set_search_equal_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_show_expanders = Interop.downcallHandle(
            "gtk_tree_view_set_show_expanders",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_tooltip_cell = Interop.downcallHandle(
            "gtk_tree_view_set_tooltip_cell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_tooltip_column = Interop.downcallHandle(
            "gtk_tree_view_set_tooltip_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_tree_view_set_tooltip_row = Interop.downcallHandle(
            "gtk_tree_view_set_tooltip_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_unset_rows_drag_dest = Interop.downcallHandle(
            "gtk_tree_view_unset_rows_drag_dest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_unset_rows_drag_source = Interop.downcallHandle(
            "gtk_tree_view_unset_rows_drag_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_tree_view_get_type = Interop.downcallHandle(
            "gtk_tree_view_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
