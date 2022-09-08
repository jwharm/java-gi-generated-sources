package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkIconView` is a widget which displays data in a grid of icons.
 * 
 * `GtkIconView` provides an alternative view on a `GtkTreeModel`.
 * It displays the model as a grid of icons with labels. Like
 * [class@Gtk.TreeView], it allows to select one or multiple items
 * (depending on the selection mode, see [method@Gtk.IconView.set_selection_mode]).
 * In addition to selection with the arrow keys, `GtkIconView` supports
 * rubberband selection, which is controlled by dragging the pointer.
 * 
 * Note that if the tree model is backed by an actual tree store (as
 * opposed to a flat list where the mapping to icons is obvious),
 * `GtkIconView` will only display the first level of the tree and
 * ignore the tree’s branches.
 * 
 * # CSS nodes
 * 
 * ```
 * iconview.view
 * ╰── [rubberband]
 * ```
 * 
 * `GtkIconView` has a single CSS node with name iconview and style class .view.
 * For rubberband selection, a subnode with name rubberband is used.
 */
public class IconView extends Widget implements Accessible, Buildable, CellLayout, ConstraintTarget, Scrollable {

    public IconView(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IconView */
    public static IconView castFrom(org.gtk.gobject.Object gobject) {
        return new IconView(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkIconView` widget
     */
    public IconView() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_new(), false));
    }
    
    /**
     * Creates a new `GtkIconView` widget using the
     * specified @area to layout cells inside the icons.
     */
    public IconView(CellArea area) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_new_with_area(area.HANDLE()), false));
    }
    
    /**
     * Creates a new `GtkIconView` widget with the model @model.
     */
    public IconView(TreeModel model) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_new_with_model(model.HANDLE()), false));
    }
    
    /**
     * Creates a `GdkPaintable` representation of the item at @path.
     * This image is used for a drag icon.
     */
    public org.gtk.gdk.Paintable createDragIcon(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_create_drag_icon(HANDLE(), path.HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Turns @icon_view into a drop destination for automatic DND. Calling this
     * method sets `GtkIconView`:reorderable to %FALSE.
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, int actions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_enable_model_drag_dest(HANDLE(), formats.HANDLE(), actions);
    }
    
    /**
     * Turns @icon_view into a drag source for automatic DND. Calling this
     * method sets `GtkIconView`:reorderable to %FALSE.
     */
    public void enableModelDragSource(int startButtonMask, org.gtk.gdk.ContentFormats formats, int actions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_enable_model_drag_source(HANDLE(), startButtonMask, formats.HANDLE(), actions);
    }
    
    /**
     * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_activate_on_single_click(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * @path and @cell. If @cell is %NULL the main cell area is used.
     * 
     * This function is only valid if @icon_view is realized.
     */
    public boolean getCellRect(TreePath path, CellRenderer cell, org.gtk.gdk.Rectangle rect) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_cell_rect(HANDLE(), path.HANDLE(), cell.HANDLE(), rect.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the value of the ::column-spacing property.
     */
    public int getColumnSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_column_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::columns property.
     */
    public int getColumns() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_columns(HANDLE());
        return RESULT;
    }
    
    /**
     * Fills in @path and @cell with the current cursor path and cell.
     * If the cursor isn’t currently set, then *@path will be %NULL.
     * If no cell currently has focus, then *@cell will be %NULL.
     * 
     * The returned `GtkTreePath` must be freed with gtk_tree_path_free().
     */
    public boolean getCursor(TreePath[] path, CellRenderer[] cell) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_cursor(HANDLE(), Interop.allocateNativeArray(path), Interop.allocateNativeArray(cell));
        return (RESULT != 0);
    }
    
    /**
     * Gets the path and cell for the icon at the given position.
     */
    public boolean getItemAtPos(int x, int y, TreePath[] path, CellRenderer[] cell) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_at_pos(HANDLE(), x, y, Interop.allocateNativeArray(path), Interop.allocateNativeArray(cell));
        return (RESULT != 0);
    }
    
    /**
     * Gets the column in which the item @path is currently
     * displayed. Column numbers start at 0.
     */
    public int getItemColumn(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_column(HANDLE(), path.HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-orientation property which determines
     * whether the labels are drawn beside the icons instead of below.
     */
    public Orientation getItemOrientation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_orientation(HANDLE());
        return Orientation.fromValue(RESULT);
    }
    
    /**
     * Returns the value of the ::item-padding property.
     */
    public int getItemPadding() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_padding(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the row in which the item @path is currently
     * displayed. Row numbers start at 0.
     */
    public int getItemRow(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_row(HANDLE(), path.HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-width property.
     */
    public int getItemWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_item_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::margin property.
     */
    public int getMargin() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_margin(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the column with markup text for @icon_view.
     */
    public int getMarkupColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_markup_column(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the model the `GtkIconView` is based on.  Returns %NULL if the
     * model is unset.
     */
    public TreeModel getModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_model(HANDLE());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the path for the icon at the given position.
     */
    public TreePath getPathAtPos(int x, int y) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_path_at_pos(HANDLE(), x, y);
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns the column with pixbufs for @icon_view.
     */
    public int getPixbufColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_pixbuf_column(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves whether the user can reorder the list via drag-and-drop.
     * See gtk_icon_view_set_reorderable().
     */
    public boolean getReorderable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_reorderable(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the value of the ::row-spacing property.
     */
    public int getRowSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_row_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Creates a list of paths of all selected items. Additionally, if you are
     * planning on modifying the model after calling this function, you may
     * want to convert the returned list into a list of `GtkTreeRowReferences`.
     * To do this, you can use gtk_tree_row_reference_new().
     * 
     * To free the return value, use `g_list_free_full`:
     * |[<!-- language="C" -->
     * GtkWidget *icon_view = gtk_icon_view_new ();
     * // Use icon_view
     * 
     * GList *list = gtk_icon_view_get_selected_items (GTK_ICON_VIEW (icon_view));
     * 
     * // use list
     * 
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * ]|
     */
    public org.gtk.glib.List getSelectedItems() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_selected_items(HANDLE());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the selection mode of the @icon_view.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_selection_mode(HANDLE());
        return SelectionMode.fromValue(RESULT);
    }
    
    /**
     * Returns the value of the ::spacing property.
     */
    public int getSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the column with text for @icon_view.
     */
    public int getTextColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_text_column(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the column of @icon_view’s model which is being used for
     * displaying tooltips on @icon_view’s rows.
     */
    public int getTooltipColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_tooltip_column(HANDLE());
        return RESULT;
    }
    
    /**
     * This function is supposed to be used in a `GtkWidget::query-tooltip`
     * signal handler for `GtkIconView`. The @x, @y and @keyboard_tip values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * 
     * The return value indicates whether there is an icon view item at the given
     * coordinates (%TRUE) or not (%FALSE) for mouse tooltips. For keyboard
     * tooltips the item returned will be the cursor item. When %TRUE, then any of
     * @model, @path and @iter which have been provided will be set to point to
     * that row and the corresponding model.
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, TreeModel[] model, TreePath[] path, TreeIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_tooltip_context(HANDLE(), x, y, keyboardTip ? 1 : 0, Interop.allocateNativeArray(model), Interop.allocateNativeArray(path), iter.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets @start_path and @end_path to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * 
     * Both paths should be freed with gtk_tree_path_free() after use.
     */
    public boolean getVisibleRange(TreePath[] startPath, TreePath[] endPath) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_get_visible_range(HANDLE(), Interop.allocateNativeArray(startPath), Interop.allocateNativeArray(endPath));
        return (RESULT != 0);
    }
    
    /**
     * Activates the item determined by @path.
     */
    public void itemActivated(TreePath path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_item_activated(HANDLE(), path.HANDLE());
    }
    
    /**
     * Returns %TRUE if the icon pointed to by @path is currently
     * selected. If @path does not point to a valid location, %FALSE is returned.
     */
    public boolean pathIsSelected(TreePath path) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_path_is_selected(HANDLE(), path.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves the alignments of @icon_view to the position specified by @path.
     * @row_align determines where the row is placed, and @col_align determines
     * where @column is placed.  Both are expected to be between 0.0 and 1.0.
     * 0.0 means left/top alignment, 1.0 means right/bottom alignment, 0.5 means
     * center.
     * 
     * If @use_align is %FALSE, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the item onto the screen.
     * This means that the item will be scrolled to the edge closest to its current
     * position.  If the item is currently visible on the screen, nothing is done.
     * 
     * This function only works if the model is set, and @path is a valid row on
     * the model. If the model changes before the @icon_view is realized, the
     * centered path will be modified to reflect this change.
     */
    public void scrollToPath(TreePath path, boolean useAlign, float rowAlign, float colAlign) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_scroll_to_path(HANDLE(), path.HANDLE(), useAlign ? 1 : 0, rowAlign, colAlign);
    }
    
    /**
     * Selects all the icons. @icon_view must has its selection mode set
     * to %GTK_SELECTION_MULTIPLE.
     */
    public void selectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_select_all(HANDLE());
    }
    
    /**
     * Selects the row at @path.
     */
    public void selectPath(TreePath path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_select_path(HANDLE(), path.HANDLE());
    }
    
    /**
     * Causes the `GtkIconView`::item-activated signal to be emitted on
     * a single click instead of a double click.
     */
    public void setActivateOnSingleClick(boolean single) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_activate_on_single_click(HANDLE(), single ? 1 : 0);
    }
    
    /**
     * Sets the ::column-spacing property which specifies the space
     * which is inserted between the columns of the icon view.
     */
    public void setColumnSpacing(int columnSpacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_column_spacing(HANDLE(), columnSpacing);
    }
    
    /**
     * Sets the ::columns property which determines in how
     * many columns the icons are arranged. If @columns is
     * -1, the number of columns will be chosen automatically
     * to fill the available area.
     */
    public void setColumns(int columns) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_columns(HANDLE(), columns);
    }
    
    /**
     * Sets the current keyboard focus to be at @path, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular item.
     * If @cell is not %NULL, then focus is given to the cell specified by
     * it. Additionally, if @start_editing is %TRUE, then editing should be
     * started in the specified cell.
     * 
     * This function is often followed by `gtk_widget_grab_focus
     * (icon_view)` in order to give keyboard focus to the widget.
     * Please note that editing can only happen when the widget is realized.
     */
    public void setCursor(TreePath path, CellRenderer cell, boolean startEditing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_cursor(HANDLE(), path.HANDLE(), cell.HANDLE(), startEditing ? 1 : 0);
    }
    
    /**
     * Sets the item that is highlighted for feedback.
     */
    public void setDragDestItem(TreePath path, IconViewDropPosition pos) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_drag_dest_item(HANDLE(), path.HANDLE(), pos.getValue());
    }
    
    /**
     * Sets the ::item-orientation property which determines whether the labels
     * are drawn beside the icons instead of below.
     */
    public void setItemOrientation(Orientation orientation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_item_orientation(HANDLE(), orientation.getValue());
    }
    
    /**
     * Sets the `GtkIconView`:item-padding property which specifies the padding
     * around each of the icon view’s items.
     */
    public void setItemPadding(int itemPadding) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_item_padding(HANDLE(), itemPadding);
    }
    
    /**
     * Sets the ::item-width property which specifies the width
     * to use for each item. If it is set to -1, the icon view will
     * automatically determine a suitable item size.
     */
    public void setItemWidth(int itemWidth) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_item_width(HANDLE(), itemWidth);
    }
    
    /**
     * Sets the ::margin property which specifies the space
     * which is inserted at the top, bottom, left and right
     * of the icon view.
     */
    public void setMargin(int margin) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_margin(HANDLE(), margin);
    }
    
    /**
     * Sets the column with markup information for @icon_view to be
     * @column. The markup column must be of type `G_TYPE_STRING`.
     * If the markup column is set to something, it overrides
     * the text column set by gtk_icon_view_set_text_column().
     */
    public void setMarkupColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_markup_column(HANDLE(), column);
    }
    
    /**
     * Sets the model for a `GtkIconView`.
     * If the @icon_view already has a model set, it will remove
     * it before setting the new model.  If @model is %NULL, then
     * it will unset the old model.
     */
    public void setModel(TreeModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_model(HANDLE(), model.HANDLE());
    }
    
    /**
     * Sets the column with pixbufs for @icon_view to be @column. The pixbuf
     * column must be of type `GDK_TYPE_PIXBUF`
     */
    public void setPixbufColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_pixbuf_column(HANDLE(), column);
    }
    
    /**
     * This function is a convenience function to allow you to reorder models that
     * support the `GtkTreeDragSourceIface` and the `GtkTreeDragDestIface`. Both
     * `GtkTreeStore` and `GtkListStore` support these. If @reorderable is %TRUE, then
     * the user can reorder the model by dragging and dropping rows.  The
     * developer can listen to these changes by connecting to the model's
     * row_inserted and row_deleted signals. The reordering is implemented by setting up
     * the icon view as a drag source and destination. Therefore, drag and
     * drop can not be used in a reorderable view for any other purpose.
     * 
     * This function does not give you any degree of control over the order -- any
     * reordering is allowed.  If more control is needed, you should probably
     * handle drag and drop manually.
     */
    public void setReorderable(boolean reorderable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_reorderable(HANDLE(), reorderable ? 1 : 0);
    }
    
    /**
     * Sets the ::row-spacing property which specifies the space
     * which is inserted between the rows of the icon view.
     */
    public void setRowSpacing(int rowSpacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_row_spacing(HANDLE(), rowSpacing);
    }
    
    /**
     * Sets the selection mode of the @icon_view.
     */
    public void setSelectionMode(SelectionMode mode) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_selection_mode(HANDLE(), mode.getValue());
    }
    
    /**
     * Sets the ::spacing property which specifies the space
     * which is inserted between the cells (i.e. the icon and
     * the text) of an item.
     */
    public void setSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_spacing(HANDLE(), spacing);
    }
    
    /**
     * Sets the column with text for @icon_view to be @column. The text
     * column must be of type `G_TYPE_STRING`.
     */
    public void setTextColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_text_column(HANDLE(), column);
    }
    
    /**
     * Sets the tip area of @tooltip to the area which @cell occupies in
     * the item pointed to by @path. See also gtk_tooltip_set_tip_area().
     * 
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     */
    public void setTooltipCell(Tooltip tooltip, TreePath path, CellRenderer cell) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_tooltip_cell(HANDLE(), tooltip.HANDLE(), path.HANDLE(), cell.HANDLE());
    }
    
    /**
     * If you only plan to have simple (text-only) tooltips on full items, you
     * can use this function to have `GtkIconView` handle these automatically
     * for you. @column should be set to the column in @icon_view’s model
     * containing the tooltip texts, or -1 to disable this feature.
     * 
     * When enabled, `GtkWidget:has-tooltip` will be set to %TRUE and
     * @icon_view will connect a `GtkWidget::query-tooltip` signal handler.
     * 
     * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * so &, <, etc have to be escaped in the text.
     */
    public void setTooltipColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_tooltip_column(HANDLE(), column);
    }
    
    /**
     * Sets the tip area of @tooltip to be the area covered by the item at @path.
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     */
    public void setTooltipItem(Tooltip tooltip, TreePath path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_set_tooltip_item(HANDLE(), tooltip.HANDLE(), path.HANDLE());
    }
    
    /**
     * Unselects all the icons.
     */
    public void unselectAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_unselect_all(HANDLE());
    }
    
    /**
     * Unselects the row at @path.
     */
    public void unselectPath(TreePath path) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_unselect_path(HANDLE(), path.HANDLE());
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * method sets `GtkIconView`:reorderable to %FALSE.
     */
    public void unsetModelDragDest() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_unset_model_drag_dest(HANDLE());
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * method sets `GtkIconView`:reorderable to %FALSE.
     */
    public void unsetModelDragSource() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_icon_view_unset_model_drag_source(HANDLE());
    }
    
    @FunctionalInterface
    public interface ActivateCursorItemHandler {
        boolean signalReceived(IconView source);
    }
    
    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user activates the currently
     * focused item.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control activation
     * programmatically.
     * 
     * The default bindings for this signal are Space, Return and Enter.
     */
    public void onActivateCursorItem(ActivateCursorItemHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewActivateCursorItem", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("activate-cursor-item").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ItemActivatedHandler {
        void signalReceived(IconView source, TreePath path);
    }
    
    /**
     * The ::item-activated signal is emitted when the method
     * gtk_icon_view_item_activated() is called, when the user double
     * clicks an item with the "activate-on-single-click" property set
     * to %FALSE, or when the user single clicks an item when the
     * "activate-on-single-click" property set to %TRUE. It is also
     * emitted when a non-editable item is selected and one of the keys:
     * Space, Return or Enter is pressed.
     */
    public void onItemActivated(ItemActivatedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewItemActivated", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("item-activated").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        boolean signalReceived(IconView source, MovementStep step, int count, boolean extend, boolean modify);
    }
    
    /**
     * The ::move-cursor signal is a
     * [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user initiates a cursor movement.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * The default bindings for this signal include
     * - Arrow keys which move by individual steps
     * - Home/End keys which move to the first/last item
     * - PageUp/PageDown which move by "pages"
     * All of these will extend the selection when combined with
     * the Shift modifier.
     */
    public void onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("move-cursor").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user selects all items.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * 
     * The default binding for this signal is Ctrl-a.
     */
    public void onSelectAll(SelectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("select-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorItemHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user selects the item that is currently
     * focused.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * 
     * There is no default binding for this signal.
     */
    public void onSelectCursorItem(SelectCursorItemHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewSelectCursorItem", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("select-cursor-item").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectionChangedHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * The ::selection-changed signal is emitted when the selection
     * (i.e. the set of selected items) changes.
     */
    public void onSelectionChanged(SelectionChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewSelectionChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("selection-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorItemHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user toggles whether the currently
     * focused item is selected or not. The exact effect of this
     * depend on the selection mode.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * 
     * There is no default binding for this signal is Ctrl-Space.
     */
    public void onToggleCursorItem(ToggleCursorItemHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewToggleCursorItem", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("toggle-cursor-item").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A [keybinding signal][class@Gtk.SignalAction]
     * which gets emitted when the user unselects all items.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * 
     * The default binding for this signal is Ctrl-Shift-a.
     */
    public void onUnselectAll(UnselectAllHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalIconViewUnselectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("unselect-all").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
