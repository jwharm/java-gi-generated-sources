package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkIconView} is a widget which displays data in a grid of icons.
 * <p>
 * {@code GtkIconView} provides an alternative view on a {@code GtkTreeModel}.
 * It displays the model as a grid of icons with labels. Like
 * {@link TreeView}, it allows to select one or multiple items
 * (depending on the selection mode, see {@link IconView#setSelectionMode}).
 * In addition to selection with the arrow keys, {@code GtkIconView} supports
 * rubberband selection, which is controlled by dragging the pointer.
 * <p>
 * Note that if the tree model is backed by an actual tree store (as
 * opposed to a flat list where the mapping to icons is obvious),
 * {@code GtkIconView} will only display the first level of the tree and
 * ignore the tree’s branches.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * iconview.view
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkIconView} has a single CSS node with name iconview and style class .view.
 * For rubberband selection, a subnode with name rubberband is used.
 */
public class IconView extends Widget implements Accessible, Buildable, CellLayout, ConstraintTarget, Scrollable {

    public IconView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to IconView */
    public static IconView castFrom(org.gtk.gobject.Object gobject) {
        return new IconView(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_icon_view_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget
     */
    public IconView() {
        super(constructNew());
    }
    
    private static Reference constructNewWithArea(CellArea area) {
        Reference RESULT = References.get(gtk_h.gtk_icon_view_new_with_area(area.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget using the
     * specified {@code area} to layout cells inside the icons.
     */
    public static IconView newWithArea(CellArea area) {
        return new IconView(constructNewWithArea(area));
    }
    
    private static Reference constructNewWithModel(TreeModel model) {
        Reference RESULT = References.get(gtk_h.gtk_icon_view_new_with_model(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget with the model {@code model}.
     */
    public static IconView newWithModel(TreeModel model) {
        return new IconView(constructNewWithModel(model));
    }
    
    /**
     * Creates a {@code GdkPaintable} representation of the item at {@code path}.
     * This image is used for a drag icon.
     */
    public org.gtk.gdk.Paintable createDragIcon(TreePath path) {
        var RESULT = gtk_h.gtk_icon_view_create_drag_icon(handle(), path.handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, true));
    }
    
    /**
     * Turns {@code icon_view} into a drop destination for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        gtk_h.gtk_icon_view_enable_model_drag_dest(handle(), formats.handle(), actions.getValue());
    }
    
    /**
     * Turns {@code icon_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void enableModelDragSource(org.gtk.gdk.ModifierType startButtonMask, org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        gtk_h.gtk_icon_view_enable_model_drag_source(handle(), startButtonMask.getValue(), formats.handle(), actions.getValue());
    }
    
    /**
     * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
     */
    public boolean getActivateOnSingleClick() {
        var RESULT = gtk_h.gtk_icon_view_get_activate_on_single_click(handle());
        return RESULT != 0;
    }
    
    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * {@code path} and {@code cell}. If {@code cell} is {@code null} the main cell area is used.
     * <p>
     * This function is only valid if {@code icon_view} is realized.
     */
    public boolean getCellRect(TreePath path, CellRenderer cell, org.gtk.gdk.Rectangle rect) {
        var RESULT = gtk_h.gtk_icon_view_get_cell_rect(handle(), path.handle(), cell.handle(), rect.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the value of the ::column-spacing property.
     */
    public int getColumnSpacing() {
        var RESULT = gtk_h.gtk_icon_view_get_column_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::columns property.
     */
    public int getColumns() {
        var RESULT = gtk_h.gtk_icon_view_get_columns(handle());
        return RESULT;
    }
    
    /**
     * Fills in {@code path} and {@code cell} with the current cursor path and cell.
     * If the cursor isn’t currently set, then *{@code path} will be {@code null}.
     * If no cell currently has focus, then *{@code cell} will be {@code null}.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free().
     */
    public boolean getCursor(TreePath[] path, CellRenderer[] cell) {
        var RESULT = gtk_h.gtk_icon_view_get_cursor(handle(), Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(cell).handle());
        return RESULT != 0;
    }
    
    /**
     * Determines the destination item for a given position.
     */
    public boolean getDestItemAtPos(int dragX, int dragY, TreePath[] path, IconViewDropPosition pos) {
        var RESULT = gtk_h.gtk_icon_view_get_dest_item_at_pos(handle(), dragX, dragY, Interop.allocateNativeArray(path).handle(), new PointerInteger(pos.getValue()).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets information about the item that is highlighted for feedback.
     */
    public void getDragDestItem(TreePath[] path, IconViewDropPosition pos) {
        gtk_h.gtk_icon_view_get_drag_dest_item(handle(), Interop.allocateNativeArray(path).handle(), new PointerInteger(pos.getValue()).handle());
    }
    
    /**
     * Gets the path and cell for the icon at the given position.
     */
    public boolean getItemAtPos(int x, int y, TreePath[] path, CellRenderer[] cell) {
        var RESULT = gtk_h.gtk_icon_view_get_item_at_pos(handle(), x, y, Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(cell).handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the column in which the item {@code path} is currently
     * displayed. Column numbers start at 0.
     */
    public int getItemColumn(TreePath path) {
        var RESULT = gtk_h.gtk_icon_view_get_item_column(handle(), path.handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-orientation property which determines
     * whether the labels are drawn beside the icons instead of below.
     */
    public Orientation getItemOrientation() {
        var RESULT = gtk_h.gtk_icon_view_get_item_orientation(handle());
        return new Orientation(RESULT);
    }
    
    /**
     * Returns the value of the ::item-padding property.
     */
    public int getItemPadding() {
        var RESULT = gtk_h.gtk_icon_view_get_item_padding(handle());
        return RESULT;
    }
    
    /**
     * Gets the row in which the item {@code path} is currently
     * displayed. Row numbers start at 0.
     */
    public int getItemRow(TreePath path) {
        var RESULT = gtk_h.gtk_icon_view_get_item_row(handle(), path.handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-width property.
     */
    public int getItemWidth() {
        var RESULT = gtk_h.gtk_icon_view_get_item_width(handle());
        return RESULT;
    }
    
    /**
     * Returns the value of the ::margin property.
     */
    public int getMargin() {
        var RESULT = gtk_h.gtk_icon_view_get_margin(handle());
        return RESULT;
    }
    
    /**
     * Returns the column with markup text for {@code icon_view}.
     */
    public int getMarkupColumn() {
        var RESULT = gtk_h.gtk_icon_view_get_markup_column(handle());
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkIconView} is based on.  Returns {@code null} if the
     * model is unset.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_icon_view_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the path for the icon at the given position.
     */
    public TreePath getPathAtPos(int x, int y) {
        var RESULT = gtk_h.gtk_icon_view_get_path_at_pos(handle(), x, y);
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns the column with pixbufs for {@code icon_view}.
     */
    public int getPixbufColumn() {
        var RESULT = gtk_h.gtk_icon_view_get_pixbuf_column(handle());
        return RESULT;
    }
    
    /**
     * Retrieves whether the user can reorder the list via drag-and-drop.
     * See gtk_icon_view_set_reorderable().
     */
    public boolean getReorderable() {
        var RESULT = gtk_h.gtk_icon_view_get_reorderable(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the value of the ::row-spacing property.
     */
    public int getRowSpacing() {
        var RESULT = gtk_h.gtk_icon_view_get_row_spacing(handle());
        return RESULT;
    }
    
    /**
     * Creates a list of paths of all selected items. Additionally, if you are
     * planning on modifying the model after calling this function, you may
     * want to convert the returned list into a list of {@code GtkTreeRowReferences}.
     * To do this, you can use gtk_tree_row_reference_new().
     * <p>
     * To free the return value, use {@code g_list_free_full}:
     * <pre>{@code <!-- language="C" -->
     * GtkWidget *icon_view = gtk_icon_view_new ();
     * // Use icon_view
     * 
     * GList *list = gtk_icon_view_get_selected_items (GTK_ICON_VIEW (icon_view));
     * 
     * // use list
     * 
     * g_list_free_full (list, (GDestroyNotify) gtk_tree_path_free);
     * }</pre>
     */
    public org.gtk.glib.List getSelectedItems() {
        var RESULT = gtk_h.gtk_icon_view_get_selected_items(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Gets the selection mode of the {@code icon_view}.
     */
    public SelectionMode getSelectionMode() {
        var RESULT = gtk_h.gtk_icon_view_get_selection_mode(handle());
        return new SelectionMode(RESULT);
    }
    
    /**
     * Returns the value of the ::spacing property.
     */
    public int getSpacing() {
        var RESULT = gtk_h.gtk_icon_view_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the column with text for {@code icon_view}.
     */
    public int getTextColumn() {
        var RESULT = gtk_h.gtk_icon_view_get_text_column(handle());
        return RESULT;
    }
    
    /**
     * Returns the column of {@code icon_view}’s model which is being used for
     * displaying tooltips on {@code icon_view}’s rows.
     */
    public int getTooltipColumn() {
        var RESULT = gtk_h.gtk_icon_view_get_tooltip_column(handle());
        return RESULT;
    }
    
    /**
     * This function is supposed to be used in a {@code GtkWidget::query-tooltip}
     * signal handler for {@code GtkIconView}. The @x, @y and {@code keyboard_tip} values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * <p>
     * The return value indicates whether there is an icon view item at the given
     * coordinates ({@code true}) or not ({@code false}) for mouse tooltips. For keyboard
     * tooltips the item returned will be the cursor item. When {@code true}, then any of
     * {@code model}, {@code path} and {@code iter} which have been provided will be set to point to
     * that row and the corresponding model.
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, TreeModel[] model, TreePath[] path, TreeIter iter) {
        var RESULT = gtk_h.gtk_icon_view_get_tooltip_context(handle(), x, y, keyboardTip ? 1 : 0, Interop.allocateNativeArray(model).handle(), Interop.allocateNativeArray(path).handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * Both paths should be freed with gtk_tree_path_free() after use.
     */
    public boolean getVisibleRange(TreePath[] startPath, TreePath[] endPath) {
        var RESULT = gtk_h.gtk_icon_view_get_visible_range(handle(), Interop.allocateNativeArray(startPath).handle(), Interop.allocateNativeArray(endPath).handle());
        return RESULT != 0;
    }
    
    /**
     * Activates the item determined by {@code path}.
     */
    public void itemActivated(TreePath path) {
        gtk_h.gtk_icon_view_item_activated(handle(), path.handle());
    }
    
    /**
     * Returns {@code true} if the icon pointed to by {@code path} is currently
     * selected. If {@code path} does not point to a valid location, {@code false} is returned.
     */
    public boolean pathIsSelected(TreePath path) {
        var RESULT = gtk_h.gtk_icon_view_path_is_selected(handle(), path.handle());
        return RESULT != 0;
    }
    
    /**
     * Moves the alignments of {@code icon_view} to the position specified by {@code path}.
     * {@code row_align} determines where the row is placed, and {@code col_align} determines
     * where {@code column} is placed.  Both are expected to be between 0.0 and 1.0.
     * 0.0 means left/top alignment, 1.0 means right/bottom alignment, 0.5 means
     * center.
     * <p>
     * If {@code use_align} is {@code false}, then the alignment arguments are ignored, and the
     * tree does the minimum amount of work to scroll the item onto the screen.
     * This means that the item will be scrolled to the edge closest to its current
     * position.  If the item is currently visible on the screen, nothing is done.
     * <p>
     * This function only works if the model is set, and {@code path} is a valid row on
     * the model. If the model changes before the {@code icon_view} is realized, the
     * centered path will be modified to reflect this change.
     */
    public void scrollToPath(TreePath path, boolean useAlign, float rowAlign, float colAlign) {
        gtk_h.gtk_icon_view_scroll_to_path(handle(), path.handle(), useAlign ? 1 : 0, rowAlign, colAlign);
    }
    
    /**
     * Selects all the icons. {@code icon_view} must has its selection mode set
     * to {@link SelectionMode#MULTIPLE}.
     */
    public void selectAll() {
        gtk_h.gtk_icon_view_select_all(handle());
    }
    
    /**
     * Selects the row at {@code path}.
     */
    public void selectPath(TreePath path) {
        gtk_h.gtk_icon_view_select_path(handle(), path.handle());
    }
    
    /**
     * Calls a function for each selected icon. Note that the model or
     * selection cannot be modified from within this function.
     */
    public void selectedForeach(IconViewForeachFunc func) {
        try {
            gtk_h.gtk_icon_view_selected_foreach(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbIconViewForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Causes the {@code GtkIconView}::item-activated signal to be emitted on
     * a single click instead of a double click.
     */
    public void setActivateOnSingleClick(boolean single) {
        gtk_h.gtk_icon_view_set_activate_on_single_click(handle(), single ? 1 : 0);
    }
    
    /**
     * Sets the ::column-spacing property which specifies the space
     * which is inserted between the columns of the icon view.
     */
    public void setColumnSpacing(int columnSpacing) {
        gtk_h.gtk_icon_view_set_column_spacing(handle(), columnSpacing);
    }
    
    /**
     * Sets the ::columns property which determines in how
     * many columns the icons are arranged. If {@code columns} is
     * -1, the number of columns will be chosen automatically
     * to fill the available area.
     */
    public void setColumns(int columns) {
        gtk_h.gtk_icon_view_set_columns(handle(), columns);
    }
    
    /**
     * Sets the current keyboard focus to be at {@code path}, and selects it.  This is
     * useful when you want to focus the user’s attention on a particular item.
     * If {@code cell} is not {@code null}, then focus is given to the cell specified by
     * it. Additionally, if {@code start_editing} is {@code true}, then editing should be
     * started in the specified cell.
     * <p>
     * This function is often followed by {@code gtk_widget_grab_focus
     * (icon_view)} in order to give keyboard focus to the widget.
     * Please note that editing can only happen when the widget is realized.
     */
    public void setCursor(TreePath path, CellRenderer cell, boolean startEditing) {
        gtk_h.gtk_icon_view_set_cursor(handle(), path.handle(), cell.handle(), startEditing ? 1 : 0);
    }
    
    /**
     * Sets the item that is highlighted for feedback.
     */
    public void setDragDestItem(TreePath path, IconViewDropPosition pos) {
        gtk_h.gtk_icon_view_set_drag_dest_item(handle(), path.handle(), pos.getValue());
    }
    
    /**
     * Sets the ::item-orientation property which determines whether the labels
     * are drawn beside the icons instead of below.
     */
    public void setItemOrientation(Orientation orientation) {
        gtk_h.gtk_icon_view_set_item_orientation(handle(), orientation.getValue());
    }
    
    /**
     * Sets the {@code GtkIconView}:item-padding property which specifies the padding
     * around each of the icon view’s items.
     */
    public void setItemPadding(int itemPadding) {
        gtk_h.gtk_icon_view_set_item_padding(handle(), itemPadding);
    }
    
    /**
     * Sets the ::item-width property which specifies the width
     * to use for each item. If it is set to -1, the icon view will
     * automatically determine a suitable item size.
     */
    public void setItemWidth(int itemWidth) {
        gtk_h.gtk_icon_view_set_item_width(handle(), itemWidth);
    }
    
    /**
     * Sets the ::margin property which specifies the space
     * which is inserted at the top, bottom, left and right
     * of the icon view.
     */
    public void setMargin(int margin) {
        gtk_h.gtk_icon_view_set_margin(handle(), margin);
    }
    
    /**
     * Sets the column with markup information for {@code icon_view} to be
     * {@code column}. The markup column must be of type {@code G_TYPE_STRING}.
     * If the markup column is set to something, it overrides
     * the text column set by gtk_icon_view_set_text_column().
     */
    public void setMarkupColumn(int column) {
        gtk_h.gtk_icon_view_set_markup_column(handle(), column);
    }
    
    /**
     * Sets the model for a {@code GtkIconView}.
     * If the {@code icon_view} already has a model set, it will remove
     * it before setting the new model.  If {@code model} is {@code null}, then
     * it will unset the old model.
     */
    public void setModel(TreeModel model) {
        gtk_h.gtk_icon_view_set_model(handle(), model.handle());
    }
    
    /**
     * Sets the column with pixbufs for {@code icon_view} to be {@code column}. The pixbuf
     * column must be of type {@code GDK_TYPE_PIXBUF}
     */
    public void setPixbufColumn(int column) {
        gtk_h.gtk_icon_view_set_pixbuf_column(handle(), column);
    }
    
    /**
     * This function is a convenience function to allow you to reorder models that
     * support the {@code GtkTreeDragSourceIface} and the {@code GtkTreeDragDestIface}. Both
     * {@code GtkTreeStore} and {@code GtkListStore} support these. If {@code reorderable} is {@code true}, then
     * the user can reorder the model by dragging and dropping rows.  The
     * developer can listen to these changes by connecting to the model's
     * row_inserted and row_deleted signals. The reordering is implemented by setting up
     * the icon view as a drag source and destination. Therefore, drag and
     * drop can not be used in a reorderable view for any other purpose.
     * <p>
     * This function does not give you any degree of control over the order -- any
     * reordering is allowed.  If more control is needed, you should probably
     * handle drag and drop manually.
     */
    public void setReorderable(boolean reorderable) {
        gtk_h.gtk_icon_view_set_reorderable(handle(), reorderable ? 1 : 0);
    }
    
    /**
     * Sets the ::row-spacing property which specifies the space
     * which is inserted between the rows of the icon view.
     */
    public void setRowSpacing(int rowSpacing) {
        gtk_h.gtk_icon_view_set_row_spacing(handle(), rowSpacing);
    }
    
    /**
     * Sets the selection mode of the {@code icon_view}.
     */
    public void setSelectionMode(SelectionMode mode) {
        gtk_h.gtk_icon_view_set_selection_mode(handle(), mode.getValue());
    }
    
    /**
     * Sets the ::spacing property which specifies the space
     * which is inserted between the cells (i.e. the icon and
     * the text) of an item.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_icon_view_set_spacing(handle(), spacing);
    }
    
    /**
     * Sets the column with text for {@code icon_view} to be {@code column}. The text
     * column must be of type {@code G_TYPE_STRING}.
     */
    public void setTextColumn(int column) {
        gtk_h.gtk_icon_view_set_text_column(handle(), column);
    }
    
    /**
     * Sets the tip area of {@code tooltip} to the area which {@code cell} occupies in
     * the item pointed to by {@code path}. See also gtk_tooltip_set_tip_area().
     * <p>
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     */
    public void setTooltipCell(Tooltip tooltip, TreePath path, CellRenderer cell) {
        gtk_h.gtk_icon_view_set_tooltip_cell(handle(), tooltip.handle(), path.handle(), cell.handle());
    }
    
    /**
     * If you only plan to have simple (text-only) tooltips on full items, you
     * can use this function to have {@code GtkIconView} handle these automatically
     * for you. {@code column} should be set to the column in {@code icon_view}’s model
     * containing the tooltip texts, or -1 to disable this feature.
     * <p>
     * When enabled, {@code GtkWidget:has-tooltip} will be set to {@code true} and
     * {@code icon_view} will connect a {@code GtkWidget::query-tooltip} signal handler.
     * <p>
     * Note that the signal handler sets the text with gtk_tooltip_set_markup(),
     * so &, <, etc have to be escaped in the text.
     */
    public void setTooltipColumn(int column) {
        gtk_h.gtk_icon_view_set_tooltip_column(handle(), column);
    }
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the item at {@code path}.
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     */
    public void setTooltipItem(Tooltip tooltip, TreePath path) {
        gtk_h.gtk_icon_view_set_tooltip_item(handle(), tooltip.handle(), path.handle());
    }
    
    /**
     * Unselects all the icons.
     */
    public void unselectAll() {
        gtk_h.gtk_icon_view_unselect_all(handle());
    }
    
    /**
     * Unselects the row at {@code path}.
     */
    public void unselectPath(TreePath path) {
        gtk_h.gtk_icon_view_unselect_path(handle(), path.handle());
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragDest() {
        gtk_h.gtk_icon_view_unset_model_drag_dest(handle());
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragSource() {
        gtk_h.gtk_icon_view_unset_model_drag_source(handle());
    }
    
    @FunctionalInterface
    public interface ActivateCursorItemHandler {
        boolean signalReceived(IconView source);
    }
    
    /**
     * A {@code Gtk.SignalAction}
     * which gets emitted when the user activates the currently
     * focused item.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control activation
     * programmatically.
     * <p>
     * The default bindings for this signal are Space, Return and Enter.
     */
    public SignalHandle onActivateCursorItem(ActivateCursorItemHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate-cursor-item").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewActivateCursorItem",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalIconViewActivateCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.ActivateCursorItemHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IconView(References.get(source)));
    }
    
    @FunctionalInterface
    public interface ItemActivatedHandler {
        void signalReceived(IconView source, TreePath path);
    }
    
    /**
     * The ::item-activated signal is emitted when the method
     * gtk_icon_view_item_activated() is called, when the user double
     * clicks an item with the "activate-on-single-click" property set
     * to {@code false}, or when the user single clicks an item when the
     * "activate-on-single-click" property set to {@code true}. It is also
     * emitted when a non-editable item is selected and one of the keys:
     * Space, Return or Enter is pressed.
     */
    public SignalHandle onItemActivated(ItemActivatedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("item-activated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewItemActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewItemActivated(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.ItemActivatedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)), new TreePath(References.get(path, false)));
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        boolean signalReceived(IconView source, MovementStep step, int count, boolean extend, boolean modify);
    }
    
    /**
     * The ::move-cursor signal is a
     * {@code Gtk.SignalAction}
     * which gets emitted when the user initiates a cursor movement.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * The default bindings for this signal include
     * <ul>
     * <li>Arrow keys which move by individual steps
     * <li>Home/End keys which move to the first/last item
     * <li>PageUp/PageDown which move by "pages"
     * All of these will extend the selection when combined with
     * the Shift modifier.
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewMoveCursor",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalIconViewMoveCursor(MemoryAddress source, int step, int count, int extend, int modify, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.MoveCursorHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new IconView(References.get(source)), new MovementStep(step), count, extend != 0, modify != 0);
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A {@code Gtk.SignalAction}
     * which gets emitted when the user selects all items.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * <p>
     * The default binding for this signal is Ctrl-a.
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewSelectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.SelectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    @FunctionalInterface
    public interface SelectCursorItemHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A {@code Gtk.SignalAction}
     * which gets emitted when the user selects the item that is currently
     * focused.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * <p>
     * There is no default binding for this signal.
     */
    public SignalHandle onSelectCursorItem(SelectCursorItemHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("select-cursor-item").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewSelectCursorItem",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewSelectCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.SelectCursorItemHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    @FunctionalInterface
    public interface SelectionChangedHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * The ::selection-changed signal is emitted when the selection
     * (i.e. the set of selected items) changes.
     */
    public SignalHandle onSelectionChanged(SelectionChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("selection-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewSelectionChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.SelectionChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    @FunctionalInterface
    public interface ToggleCursorItemHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A {@code Gtk.SignalAction}
     * which gets emitted when the user toggles whether the currently
     * focused item is selected or not. The exact effect of this
     * depend on the selection mode.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * <p>
     * There is no default binding for this signal is Ctrl-Space.
     */
    public SignalHandle onToggleCursorItem(ToggleCursorItemHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("toggle-cursor-item").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewToggleCursorItem",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewToggleCursorItem(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.ToggleCursorItemHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
    @FunctionalInterface
    public interface UnselectAllHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * A {@code Gtk.SignalAction}
     * which gets emitted when the user unselects all items.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control selection
     * programmatically.
     * <p>
     * The default binding for this signal is Ctrl-Shift-a.
     */
    public SignalHandle onUnselectAll(UnselectAllHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("unselect-all").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.class, "__signalIconViewUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalIconViewUnselectAll(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (IconView.UnselectAllHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new IconView(References.get(source)));
    }
    
}
