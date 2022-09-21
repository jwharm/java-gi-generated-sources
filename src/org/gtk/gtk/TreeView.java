package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
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

    public TreeView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeView */
    public static TreeView castFrom(org.gtk.gobject.Object gobject) {
        return new TreeView(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_tree_view_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget.
     */
    public TreeView() {
        super(constructNew());
    }
    
    private static Reference constructNewWithModel(TreeModel model) {
        Reference RESULT = References.get(gtk_h.gtk_tree_view_new_with_model(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkTreeView} widget with the model initialized to {@code model}.
     */
    public static TreeView newWithModel(TreeModel model) {
        return new TreeView(constructNewWithModel(model));
    }
    
    /**
     * Appends {@code column} to the list of columns. If {@code tree_view} has “fixed_height”
     * mode enabled, then {@code column} must have its “sizing” property set to be
     * GTK_TREE_VIEW_COLUMN_FIXED.
     */
    public int appendColumn(TreeViewColumn column) {
        var RESULT = gtk_h.gtk_tree_view_append_column(handle(), column.handle());
        return RESULT;
    }
    
    /**
     * Recursively collapses all visible, expanded nodes in {@code tree_view}.
     */
    public void collapseAll() {
        gtk_h.gtk_tree_view_collapse_all(handle());
    }
    
    /**
     * Collapses a row (hides its child rows, if they exist).
     */
    public boolean collapseRow(TreePath path) {
        var RESULT = gtk_h.gtk_tree_view_collapse_row(handle(), path.handle());
        return (RESULT != 0);
    }
    
    /**
     * Resizes all columns to their optimal width. Only works after the
     * treeview has been realized.
     */
    public void columnsAutosize() {
        gtk_h.gtk_tree_view_columns_autosize(handle());
    }
    
    /**
     * Creates a {@code cairo_surface_t} representation of the row at {@code path}.
     * This image is used for a drag icon.
     */
    public org.gtk.gdk.Paintable createRowDragIcon(TreePath path) {
        var RESULT = gtk_h.gtk_tree_view_create_row_drag_icon(handle(), path.handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Turns {@code tree_view} into a drop destination for automatic DND. Calling
     * this method sets {@code GtkTreeView}:reorderable to <code>false</code>.
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, int actions) {
        gtk_h.gtk_tree_view_enable_model_drag_dest(handle(), formats.handle(), actions);
    }
    
    /**
     * Turns {@code tree_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkTreeView}:reorderable to <code>false</code>.
     */
    public void enableModelDragSource(int startButtonMask, org.gtk.gdk.ContentFormats formats, int actions) {
        gtk_h.gtk_tree_view_enable_model_drag_source(handle(), startButtonMask, formats.handle(), actions);
    }
    
    /**
     * Recursively expands all nodes in the {@code tree_view}.
     */
    public void expandAll() {
        gtk_h.gtk_tree_view_expand_all(handle());
    }
    
    /**
     * Opens the row so its children are visible.
     */
    public boolean expandRow(TreePath path, boolean openAll) {
        var RESULT = gtk_h.gtk_tree_view_expand_row(handle(), path.handle(), openAll ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Expands the row at {@code path}. This will also expand all parent rows of
     * {@code path} as necessary.
     */
    public void expandToPath(TreePath path) {
        gtk_h.gtk_tree_view_expand_to_path(handle(), path.handle());
    }
    
    /**
     * Gets the setting set by gtk_tree_view_set_activate_on_single_click().
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = gtk_h.gtk_tree_view_get_activate_on_single_click(handle());
        return (RESULT != 0);
    }
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * <code>null</code>, or points to a node not found in the tree, the @y and {@code height} fields of
     * the rectangle will be filled with 0. If {@code column} is <code>null</code>, the @x and {@code width}
     * fields will be filled with 0.  The returned rectangle is equivalent to the
     * {@code background_area} passed to gtk_cell_renderer_render().  These background
     * areas tile to cover the entire bin window.  Contrast with the {@code cell_area},
     * returned by gtk_tree_view_get_cell_area(), which returns only the cell
     * itself, excluding surrounding borders and the tree expander area.
     */
    public void getBackgroundArea(TreePath path, TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_tree_view_get_background_area(handle(), path.handle(), column.handle(), rect.handle());
    }
    
    /**
     * Fills the bounding rectangle in bin_window coordinates for the cell at the
     * row specified by {@code path} and the column specified by {@code column}.  If {@code path} is
     * <code>null</code>, or points to a path not currently displayed, the @y and {@code height} fields
     * of the rectangle will be filled with 0. If {@code column} is <code>null</code>, the @x and {@code width}
     * fields will be filled with 0.  The sum of all cell rects does not cover the
     * entire tree; there are extra pixels in between rows, for example. The
     * returned rectangle is equivalent to the {@code cell_area} passed to
     * gtk_cell_renderer_render().  This function is only valid if {@code tree_view} is
     * realized.
     */
    public void getCellArea(TreePath path, TreeViewColumn column, org.gtk.gdk.Rectangle rect) {
        gtk_h.gtk_tree_view_get_cell_area(handle(), path.handle(), column.handle(), rect.handle());
    }
    
    /**
     * Gets the {@code GtkTreeViewColumn} at the given position in the {@code tree_view}.
     */
    public TreeViewColumn getColumn(int n) {
        var RESULT = gtk_h.gtk_tree_view_get_column(handle(), n);
        return new TreeViewColumn(References.get(RESULT, false));
    }
    
    /**
     * Returns a {@code GList} of all the {@code GtkTreeViewColumn}s currently in {@code tree_view}.
     * The returned list must be freed with g_list_free ().
     */
    public org.gtk.glib.List getColumns() {
        var RESULT = gtk_h.gtk_tree_view_get_columns(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Fills in {@code path} and {@code focus_column} with the current path and focus column.  If
     * the cursor isn’t currently set, then *{@code path} will be <code>null</code>.  If no column
     * currently has focus, then *{@code focus_column} will be <code>null</code>.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free() when
     * you are done with it.
     */
    public void getCursor(TreePath[] path, TreeViewColumn[] focusColumn) {
        gtk_h.gtk_tree_view_get_cursor(handle(), Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(focusColumn).handle());
    }
    
    /**
     * Returns whether or not the tree allows to start interactive searching
     * by typing in text.
     */
    public boolean getEnableSearch() {
        var RESULT = gtk_h.gtk_tree_view_get_enable_search(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether or not tree lines are drawn in {@code tree_view}.
     */
    public boolean getEnableTreeLines() {
        var RESULT = gtk_h.gtk_tree_view_get_enable_tree_lines(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the column that is the current expander column,
     * or <code>null</code> if none has been set.
     * This column has the expander arrow drawn next to it.
     */
    public TreeViewColumn getExpanderColumn() {
        var RESULT = gtk_h.gtk_tree_view_get_expander_column(handle());
        return new TreeViewColumn(References.get(RESULT, false));
    }
    
    /**
     * Returns whether fixed height mode is turned on for {@code tree_view}.
     */
    public boolean getFixedHeightMode() {
        var RESULT = gtk_h.gtk_tree_view_get_fixed_height_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns which grid lines are enabled in {@code tree_view}.
     */
    public TreeViewGridLines getGridLines() {
        var RESULT = gtk_h.gtk_tree_view_get_grid_lines(handle());
        return TreeViewGridLines.fromValue(RESULT);
    }
    
    /**
     * Returns whether all header columns are clickable.
     */
    public boolean getHeadersClickable() {
        var RESULT = gtk_h.gtk_tree_view_get_headers_clickable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns <code>true</code> if the headers on the {@code tree_view} are visible.
     */
    public boolean getHeadersVisible() {
        var RESULT = gtk_h.gtk_tree_view_get_headers_visible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether hover expansion mode is turned on for {@code tree_view}.
     */
    public boolean getHoverExpand() {
        var RESULT = gtk_h.gtk_tree_view_get_hover_expand(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether hover selection mode is turned on for {@code tree_view}.
     */
    public boolean getHoverSelection() {
        var RESULT = gtk_h.gtk_tree_view_get_hover_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the amount, in pixels, of extra indentation for child levels
     * in {@code tree_view}.
     */
    public int getLevelIndentation() {
        var RESULT = gtk_h.gtk_tree_view_get_level_indentation(handle());
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkTreeView} is based on.  Returns <code>null</code> if the
     * model is unset.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_tree_view_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Queries the number of columns in the given {@code tree_view}.
     */
    public int getNColumns() {
        var RESULT = gtk_h.gtk_tree_view_get_n_columns(handle());
        return RESULT;
    }
    
    /**
     * Retrieves whether the user can reorder the tree via drag-and-drop. See
     * gtk_tree_view_set_reorderable().
     */
    public boolean getReorderable() {
        var RESULT = gtk_h.gtk_tree_view_get_reorderable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether rubber banding is turned on for {@code tree_view}.  If the
     * selection mode is {@link SelectionMode#MULTIPLE}, rubber banding will allow the
     * user to select multiple rows by dragging the mouse.
     */
    public boolean getRubberBanding() {
        var RESULT = gtk_h.gtk_tree_view_get_rubber_banding(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the column searched on by the interactive search code.
     */
    public int getSearchColumn() {
        var RESULT = gtk_h.gtk_tree_view_get_search_column(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkEntry} which is currently in use as interactive search
     * entry for {@code tree_view}.  In case the built-in entry is being used, <code>null</code>
     * will be returned.
     */
    public Editable getSearchEntry() {
        var RESULT = gtk_h.gtk_tree_view_get_search_entry(handle());
        return new Editable.EditableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GtkTreeSelection} associated with {@code tree_view}.
     */
    public TreeSelection getSelection() {
        var RESULT = gtk_h.gtk_tree_view_get_selection(handle());
        return new TreeSelection(References.get(RESULT, false));
    }
    
    /**
     * Returns whether or not expanders are drawn in {@code tree_view}.
     */
    public boolean getShowExpanders() {
        var RESULT = gtk_h.gtk_tree_view_get_show_expanders(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the column of {@code tree_view}’s model which is being used for
     * displaying tooltips on {@code tree_view}’s rows.
     */
    public int getTooltipColumn() {
        var RESULT = gtk_h.gtk_tree_view_get_tooltip_column(handle());
        return RESULT;
    }
    
    /**
     * This function is supposed to be used in a ::query-tooltip
     * signal handler for {@code GtkTreeView}. The @x, @y and {@code keyboard_tip} values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * <p>
     * The return value indicates whether there is a tree view row at the given
     * coordinates (<code>true</code>) or not (<code>false</code>) for mouse tooltips. For keyboard
     * tooltips the row returned will be the cursor row. When <code>true</code>, then any of
     * {@code model}, {@code path} and {@code iter} which have been provided will be set to point to
     * that row and the corresponding model. @x and @y will always be converted
     * to be relative to {@code tree_view}’s bin_window if {@code keyboard_tooltip} is <code>false</code>.
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, TreeModel[] model, TreePath[] path, TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_view_get_tooltip_context(handle(), x, y, keyboardTip ? 1 : 0, Interop.allocateNativeArray(model).handle(), Interop.allocateNativeArray(path).handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * The paths should be freed with gtk_tree_path_free() after use.
     */
    public boolean getVisibleRange(TreePath[] startPath, TreePath[] endPath) {
        var RESULT = gtk_h.gtk_tree_view_get_visible_range(handle(), Interop.allocateNativeArray(startPath).handle(), Interop.allocateNativeArray(endPath).handle());
        return (RESULT != 0);
    }
    
    /**
     * Fills {@code visible_rect} with the currently-visible region of the
     * buffer, in tree coordinates. Convert to bin_window coordinates with
     * gtk_tree_view_convert_tree_to_bin_window_coords().
     * Tree coordinates start at 0,0 for row 0 of the tree, and cover the entire
     * scrollable area of the tree.
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        gtk_h.gtk_tree_view_get_visible_rect(handle(), visibleRect.handle());
    }
    
    /**
     * This inserts the {@code column} into the {@code tree_view} at {@code position}.  If {@code position} is
     * -1, then the column is inserted at the end. If {@code tree_view} has
     * “fixed_height” mode enabled, then {@code column} must have its “sizing” property
     * set to be GTK_TREE_VIEW_COLUMN_FIXED.
     */
    public int insertColumn(TreeViewColumn column, int position) {
        var RESULT = gtk_h.gtk_tree_view_insert_column(handle(), column.handle(), position);
        return RESULT;
    }
    
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
            var RESULT = gtk_h.gtk_tree_view_insert_column_with_data_func(handle(), position, Interop.allocateNativeString(title).handle(), cell.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeCellDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Returns whether a rubber banding operation is currently being done
     * in {@code tree_view}.
     */
    public boolean isRubberBandingActive() {
        var RESULT = gtk_h.gtk_tree_view_is_rubber_banding_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls {@code func} on all expanded rows.
     */
    public void mapExpandedRows(TreeViewMappingFunc func) {
        try {
            gtk_h.gtk_tree_view_map_expanded_rows(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeViewMappingFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Moves {@code column} to be after to {@code base_column}.  If {@code base_column} is <code>null</code>, then
     * {@code column} is placed in the first position.
     */
    public void moveColumnAfter(TreeViewColumn column, TreeViewColumn baseColumn) {
        gtk_h.gtk_tree_view_move_column_after(handle(), column.handle(), baseColumn.handle());
    }
    
    /**
     * Removes {@code column} from {@code tree_view}.
     */
    public int removeColumn(TreeViewColumn column) {
        var RESULT = gtk_h.gtk_tree_view_remove_column(handle(), column.handle());
        return RESULT;
    }
    
    /**
     * Activates the cell determined by {@code path} and {@code column}.
     */
    public void rowActivated(TreePath path, TreeViewColumn column) {
        gtk_h.gtk_tree_view_row_activated(handle(), path.handle(), column.handle());
    }
    
    /**
     * Returns <code>true</code> if the node pointed to by {@code path} is expanded in {@code tree_view}.
     */
    public boolean rowExpanded(TreePath path) {
        var RESULT = gtk_h.gtk_tree_view_row_expanded(handle(), path.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the alignments of {@code tree_view} to the position specified by {@code column} and
     * {@code path}.  If {@code column} is <code>null</code>, then no horizontal scrolling occurs.  Likewise,
     * if {@code path} is <code>null</code> no vertical scrolling occurs.  At a minimum, one of {@code column}
     * or {@code path} need to be non-<code>null</code>.  {@code row_align} determines where the row is
     * placed, and {@code col_align} determines where {@code column} is placed.  Both are expected
     * to be between 0.0 and 1.0. 0.0 means left/top alignment, 1.0 means
     * right/bottom alignment, 0.5 means center.
     * <p>
     * If {@code use_align} is <code>false</code>, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the cell onto the screen.
     * This means that the cell will be scrolled to the edge closest to its current
     * position.  If the cell is currently visible on the screen, nothing is done.
     * <p>
     * This function only works if the model is set, and {@code path} is a valid row on the
     * model.  If the model changes before the {@code tree_view} is realized, the centered
     * path will be modified to reflect this change.
     */
    public void scrollToCell(TreePath path, TreeViewColumn column, boolean useAlign, float rowAlign, float colAlign) {
        gtk_h.gtk_tree_view_scroll_to_cell(handle(), path.handle(), column.handle(), useAlign ? 1 : 0, rowAlign, colAlign);
    }
    
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
        gtk_h.gtk_tree_view_scroll_to_point(handle(), treeX, treeY);
    }
    
    /**
     * Cause the {@code GtkTreeView}::row-activated signal to be emitted
     * on a single click instead of a double click.
     */
    public void setActivateOnSingleClick(boolean single) {
        gtk_h.gtk_tree_view_set_activate_on_single_click(handle(), single ? 1 : 0);
    }
    
    /**
     * Sets a user function for determining where a column may be dropped when
     * dragged.  This function is called on every column pair in turn at the
     * beginning of a column drag to determine where a drop can take place.  The
     * arguments passed to {@code func} are: the {@code tree_view}, the {@code GtkTreeViewColumn} being
     * dragged, the two {@code GtkTreeViewColumn}s determining the drop spot, and
     * {@code user_data}.  If either of the {@code GtkTreeViewColumn} arguments for the drop spot
     * are <code>null</code>, then they indicate an edge.  If {@code func} is set to be <code>null</code>, then
     * {@code tree_view} reverts to the default behavior of allowing all columns to be
     * dropped everywhere.
     */
    public void setColumnDragFunction(TreeViewColumnDropFunc func) {
        try {
            gtk_h.gtk_tree_view_set_column_drag_function(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeViewColumnDropFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the current keyboard focus to be at {@code path}, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * {@code focus_column} is not <code>null</code>, then focus is given to the column specified by
     * it. Additionally, if {@code focus_column} is specified, and {@code start_editing} is
     * <code>true</code>, then editing should be started in the specified cell.
     * This function is often followed by {@code gtk_widget_grab_focus} ({@code tree_view})
     * in order to give keyboard focus to the widget.  Please note that editing
     * can only happen when the widget is realized.
     * <p>
     * If {@code path} is invalid for {@code model}, the current cursor (if any) will be unset
     * and the function will return without failing.
     */
    public void setCursor(TreePath path, TreeViewColumn focusColumn, boolean startEditing) {
        gtk_h.gtk_tree_view_set_cursor(handle(), path.handle(), focusColumn.handle(), startEditing ? 1 : 0);
    }
    
    /**
     * Sets the current keyboard focus to be at {@code path}, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular row.  If
     * {@code focus_column} is not <code>null</code>, then focus is given to the column specified by
     * it. If {@code focus_column} and {@code focus_cell} are not <code>null</code>, and {@code focus_column}
     * contains 2 or more editable or activatable cells, then focus is given to
     * the cell specified by {@code focus_cell}. Additionally, if {@code focus_column} is
     * specified, and {@code start_editing} is <code>true</code>, then editing should be started in
     * the specified cell.  This function is often followed by
     * {@code gtk_widget_grab_focus} ({@code tree_view}) in order to give keyboard focus to the
     * widget.  Please note that editing can only happen when the widget is
     * realized.
     * <p>
     * If {@code path} is invalid for {@code model}, the current cursor (if any) will be unset
     * and the function will return without failing.
     */
    public void setCursorOnCell(TreePath path, TreeViewColumn focusColumn, CellRenderer focusCell, boolean startEditing) {
        gtk_h.gtk_tree_view_set_cursor_on_cell(handle(), path.handle(), focusColumn.handle(), focusCell.handle(), startEditing ? 1 : 0);
    }
    
    /**
     * Sets the row that is highlighted for feedback.
     * If {@code path} is <code>null</code>, an existing highlight is removed.
     */
    public void setDragDestRow(TreePath path, TreeViewDropPosition pos) {
        gtk_h.gtk_tree_view_set_drag_dest_row(handle(), path.handle(), pos.getValue());
    }
    
    /**
     * If {@code enable_search} is set, then the user can type in text to search through
     * the tree interactively (this is sometimes called "typeahead find").
     * <p>
     * Note that even if this is <code>false</code>, the user can still initiate a search
     * using the “start-interactive-search” key binding.
     */
    public void setEnableSearch(boolean enableSearch) {
        gtk_h.gtk_tree_view_set_enable_search(handle(), enableSearch ? 1 : 0);
    }
    
    /**
     * Sets whether to draw lines interconnecting the expanders in {@code tree_view}.
     * This does not have any visible effects for lists.
     */
    public void setEnableTreeLines(boolean enabled) {
        gtk_h.gtk_tree_view_set_enable_tree_lines(handle(), enabled ? 1 : 0);
    }
    
    /**
     * Sets the column to draw the expander arrow at. It must be in {@code tree_view}.
     * If {@code column} is <code>null</code>, then the expander arrow is always at the first
     * visible column.
     * <p>
     * If you do not want expander arrow to appear in your tree, set the
     * expander column to a hidden column.
     */
    public void setExpanderColumn(TreeViewColumn column) {
        gtk_h.gtk_tree_view_set_expander_column(handle(), column.handle());
    }
    
    /**
     * Enables or disables the fixed height mode of {@code tree_view}.
     * Fixed height mode speeds up {@code GtkTreeView} by assuming that all
     * rows have the same height.
     * Only enable this option if all rows are the same height and all
     * columns are of type {@link TreeViewColumnSizing#FIXED}.
     */
    public void setFixedHeightMode(boolean enable) {
        gtk_h.gtk_tree_view_set_fixed_height_mode(handle(), enable ? 1 : 0);
    }
    
    /**
     * Sets which grid lines to draw in {@code tree_view}.
     */
    public void setGridLines(TreeViewGridLines gridLines) {
        gtk_h.gtk_tree_view_set_grid_lines(handle(), gridLines.getValue());
    }
    
    /**
     * Allow the column title buttons to be clicked.
     */
    public void setHeadersClickable(boolean setting) {
        gtk_h.gtk_tree_view_set_headers_clickable(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the visibility state of the headers.
     */
    public void setHeadersVisible(boolean headersVisible) {
        gtk_h.gtk_tree_view_set_headers_visible(handle(), headersVisible ? 1 : 0);
    }
    
    /**
     * Enables or disables the hover expansion mode of {@code tree_view}.
     * Hover expansion makes rows expand or collapse if the pointer
     * moves over them.
     */
    public void setHoverExpand(boolean expand) {
        gtk_h.gtk_tree_view_set_hover_expand(handle(), expand ? 1 : 0);
    }
    
    /**
     * Enables or disables the hover selection mode of {@code tree_view}.
     * Hover selection makes the selected row follow the pointer.
     * Currently, this works only for the selection modes
     * {@link SelectionMode#SINGLE} and {@link SelectionMode#BROWSE}.
     */
    public void setHoverSelection(boolean hover) {
        gtk_h.gtk_tree_view_set_hover_selection(handle(), hover ? 1 : 0);
    }
    
    /**
     * Sets the amount of extra indentation for child levels to use in {@code tree_view}
     * in addition to the default indentation.  The value should be specified in
     * pixels, a value of 0 disables this feature and in this case only the default
     * indentation will be used.
     * This does not have any visible effects for lists.
     */
    public void setLevelIndentation(int indentation) {
        gtk_h.gtk_tree_view_set_level_indentation(handle(), indentation);
    }
    
    /**
     * Sets the model for a {@code GtkTreeView}.  If the {@code tree_view} already has a model
     * set, it will remove it before setting the new model.  If {@code model} is <code>null</code>,
     * then it will unset the old model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_tree_view_set_model(handle(), model.handle());
    }
    
    /**
     * This function is a convenience function to allow you to reorder
     * models that support the {@code GtkTreeDragSourceIface} and the
     * {@code GtkTreeDragDestIface}.  Both {@code GtkTreeStore} and {@code GtkListStore} support
     * these.  If {@code reorderable} is <code>true</code>, then the user can reorder the
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
        gtk_h.gtk_tree_view_set_reorderable(handle(), reorderable ? 1 : 0);
    }
    
    /**
     * Sets the row separator function, which is used to determine
     * whether a row should be drawn as a separator. If the row separator
     * function is <code>null</code>, no separators are drawn. This is the default value.
     */
    public void setRowSeparatorFunc(TreeViewRowSeparatorFunc func) {
        try {
            gtk_h.gtk_tree_view_set_row_separator_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeViewRowSeparatorFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Enables or disables rubber banding in {@code tree_view}.  If the selection mode
     * is {@link SelectionMode#MULTIPLE}, rubber banding will allow the user to select
     * multiple rows by dragging the mouse.
     */
    public void setRubberBanding(boolean enable) {
        gtk_h.gtk_tree_view_set_rubber_banding(handle(), enable ? 1 : 0);
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
     */
    public void setSearchColumn(int column) {
        gtk_h.gtk_tree_view_set_search_column(handle(), column);
    }
    
    /**
     * Sets the entry which the interactive search code will use for this
     * {@code tree_view}.  This is useful when you want to provide a search entry
     * in our interface at all time at a fixed position.  Passing <code>null</code> for
     * {@code entry} will make the interactive search code use the built-in popup
     * entry again.
     */
    public void setSearchEntry(Editable entry) {
        gtk_h.gtk_tree_view_set_search_entry(handle(), entry.handle());
    }
    
    /**
     * Sets the compare function for the interactive search capabilities; note
     * that somewhat like strcmp() returning 0 for equality
     * {@code GtkTreeView}SearchEqualFunc returns <code>false</code> on matches.
     */
    public void setSearchEqualFunc(TreeViewSearchEqualFunc searchEqualFunc) {
        try {
            gtk_h.gtk_tree_view_set_search_equal_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTreeViewSearchEqualFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(searchEqualFunc.hashCode(), searchEqualFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
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
     */
    public void setShowExpanders(boolean enabled) {
        gtk_h.gtk_tree_view_set_show_expanders(handle(), enabled ? 1 : 0);
    }
    
    /**
     * Sets the tip area of {@code tooltip} to the area {@code path}, {@code column} and {@code cell} have
     * in common.  For example if {@code path} is <code>null</code> and {@code column} is set, the tip
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
        gtk_h.gtk_tree_view_set_tooltip_cell(handle(), tooltip.handle(), path.handle(), column.handle(), cell.handle());
    }
    
    /**
     * If you only plan to have simple (text-only) tooltips on full rows, you
     * can use this function to have {@code GtkTreeView} handle these automatically
     * for you. {@code column} should be set to the column in {@code tree_view}’s model
     * containing the tooltip texts, or -1 to disable this feature.
     * <p>
     * When enabled, {@code GtkWidget:has-tooltip} will be set to <code>true</code> and
     * {@code tree_view} will connect a {@code GtkWidget::query-tooltip} signal handler.
     * <p>
     * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * so &, <, etc have to be escaped in the text.
     */
    public void setTooltipColumn(int column) {
        gtk_h.gtk_tree_view_set_tooltip_column(handle(), column);
    }
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the row at {@code path}.
     * See also gtk_tree_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     */
    public void setTooltipRow(Tooltip tooltip, TreePath path) {
        gtk_h.gtk_tree_view_set_tooltip_row(handle(), tooltip.handle(), path.handle());
    }
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_dest(). Calling this method sets
     * {@code GtkTreeView}:reorderable to <code>false</code>.
     */
    public void unsetRowsDragDest() {
        gtk_h.gtk_tree_view_unset_rows_drag_dest(handle());
    }
    
    /**
     * Undoes the effect of
     * gtk_tree_view_enable_model_drag_source(). Calling this method sets
     * {@code GtkTreeView}:reorderable to <code>false</code>.
     */
    public void unsetRowsDragSource() {
        gtk_h.gtk_tree_view_unset_rows_drag_source(handle());
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewColumnsChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("columns-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewCursorChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cursor-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ExpandCollapseCursorRowHandler {
        boolean signalReceived(TreeView source, boolean object, boolean p0, boolean p1);
    }
    
    public SignalHandle onExpandCollapseCursorRow(ExpandCollapseCursorRowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewExpandCollapseCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("expand-collapse-cursor-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
     * {@code Gtk.TreeView:activate-on-single-click} property set to <code>false</code>,
     * or when the user single-clicks a row when that property set to <code>true</code>.
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewRowActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("row-activated").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewRowCollapsed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("row-collapsed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewRowExpanded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("row-expanded").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorParentHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onSelectCursorParent(SelectCursorParentHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewSelectCursorParent", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-cursor-parent").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorRowHandler {
        boolean signalReceived(TreeView source, boolean object);
    }
    
    public SignalHandle onSelectCursorRow(SelectCursorRowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewSelectCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-cursor-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StartInteractiveSearchHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onStartInteractiveSearch(StartInteractiveSearchHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewStartInteractiveSearch", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("start-interactive-search").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewTestCollapseRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("test-collapse-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
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
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewTestExpandRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("test-expand-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorRowHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onToggleCursorRow(ToggleCursorRowHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewToggleCursorRow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-cursor-row").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        boolean signalReceived(TreeView source);
    }
    
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeViewUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("unselect-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
