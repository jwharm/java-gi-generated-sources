package org.gtk.gtk;

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

    public IconView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to IconView */
    public static IconView castFrom(org.gtk.gobject.Object gobject) {
        return new IconView(gobject.refcounted());
    }
    
    static final MethodHandle gtk_icon_view_new = Interop.downcallHandle(
        "gtk_icon_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_icon_view_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkIconView} widget
     */
    public IconView() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_icon_view_new_with_area = Interop.downcallHandle(
        "gtk_icon_view_new_with_area",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithArea(CellArea area) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_icon_view_new_with_area.invokeExact(area.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkIconView} widget using the
     * specified {@code area} to layout cells inside the icons.
     */
    public static IconView newWithArea(CellArea area) {
        return new IconView(constructNewWithArea(area));
    }
    
    static final MethodHandle gtk_icon_view_new_with_model = Interop.downcallHandle(
        "gtk_icon_view_new_with_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithModel(TreeModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_icon_view_new_with_model.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkIconView} widget with the model {@code model}.
     */
    public static IconView newWithModel(TreeModel model) {
        return new IconView(constructNewWithModel(model));
    }
    
    static final MethodHandle gtk_icon_view_create_drag_icon = Interop.downcallHandle(
        "gtk_icon_view_create_drag_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code GdkPaintable} representation of the item at {@code path}.
     * This image is used for a drag icon.
     */
    public org.gtk.gdk.Paintable createDragIcon(TreePath path) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_view_create_drag_icon.invokeExact(handle(), path.handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_enable_model_drag_dest = Interop.downcallHandle(
        "gtk_icon_view_enable_model_drag_dest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns {@code icon_view} into a drop destination for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void enableModelDragDest(org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            gtk_icon_view_enable_model_drag_dest.invokeExact(handle(), formats.handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_enable_model_drag_source = Interop.downcallHandle(
        "gtk_icon_view_enable_model_drag_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Turns {@code icon_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void enableModelDragSource(org.gtk.gdk.ModifierType startButtonMask, org.gtk.gdk.ContentFormats formats, org.gtk.gdk.DragAction actions) {
        try {
            gtk_icon_view_enable_model_drag_source.invokeExact(handle(), startButtonMask.getValue(), formats.handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_activate_on_single_click = Interop.downcallHandle(
        "gtk_icon_view_get_activate_on_single_click",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
     */
    public boolean getActivateOnSingleClick() {
        try {
            var RESULT = (int) gtk_icon_view_get_activate_on_single_click.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_cell_rect = Interop.downcallHandle(
        "gtk_icon_view_get_cell_rect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * {@code path} and {@code cell}. If {@code cell} is {@code null} the main cell area is used.
     * <p>
     * This function is only valid if {@code icon_view} is realized.
     */
    public boolean getCellRect(TreePath path, CellRenderer cell, org.gtk.gdk.Rectangle rect) {
        try {
            var RESULT = (int) gtk_icon_view_get_cell_rect.invokeExact(handle(), path.handle(), cell.handle(), rect.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_column_spacing = Interop.downcallHandle(
        "gtk_icon_view_get_column_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::column-spacing property.
     */
    public int getColumnSpacing() {
        try {
            var RESULT = (int) gtk_icon_view_get_column_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_columns = Interop.downcallHandle(
        "gtk_icon_view_get_columns",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::columns property.
     */
    public int getColumns() {
        try {
            var RESULT = (int) gtk_icon_view_get_columns.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_cursor = Interop.downcallHandle(
        "gtk_icon_view_get_cursor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills in {@code path} and {@code cell} with the current cursor path and cell.
     * If the cursor isn’t currently set, then *{@code path} will be {@code null}.
     * If no cell currently has focus, then *{@code cell} will be {@code null}.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free().
     */
    public boolean getCursor(TreePath[] path, CellRenderer[] cell) {
        try {
            var RESULT = (int) gtk_icon_view_get_cursor.invokeExact(handle(), Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(cell).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_dest_item_at_pos = Interop.downcallHandle(
        "gtk_icon_view_get_dest_item_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determines the destination item for a given position.
     */
    public boolean getDestItemAtPos(int dragX, int dragY, TreePath[] path, IconViewDropPosition pos) {
        try {
            var RESULT = (int) gtk_icon_view_get_dest_item_at_pos.invokeExact(handle(), dragX, dragY, Interop.allocateNativeArray(path).handle(), new PointerInteger(pos.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_drag_dest_item = Interop.downcallHandle(
        "gtk_icon_view_get_drag_dest_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets information about the item that is highlighted for feedback.
     */
    public void getDragDestItem(TreePath[] path, IconViewDropPosition pos) {
        try {
            gtk_icon_view_get_drag_dest_item.invokeExact(handle(), Interop.allocateNativeArray(path).handle(), new PointerInteger(pos.getValue()).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_at_pos = Interop.downcallHandle(
        "gtk_icon_view_get_item_at_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the path and cell for the icon at the given position.
     */
    public boolean getItemAtPos(int x, int y, TreePath[] path, CellRenderer[] cell) {
        try {
            var RESULT = (int) gtk_icon_view_get_item_at_pos.invokeExact(handle(), x, y, Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(cell).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_column = Interop.downcallHandle(
        "gtk_icon_view_get_item_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the column in which the item {@code path} is currently
     * displayed. Column numbers start at 0.
     */
    public int getItemColumn(TreePath path) {
        try {
            var RESULT = (int) gtk_icon_view_get_item_column.invokeExact(handle(), path.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_orientation = Interop.downcallHandle(
        "gtk_icon_view_get_item_orientation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::item-orientation property which determines
     * whether the labels are drawn beside the icons instead of below.
     */
    public Orientation getItemOrientation() {
        try {
            var RESULT = (int) gtk_icon_view_get_item_orientation.invokeExact(handle());
            return new Orientation(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_padding = Interop.downcallHandle(
        "gtk_icon_view_get_item_padding",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::item-padding property.
     */
    public int getItemPadding() {
        try {
            var RESULT = (int) gtk_icon_view_get_item_padding.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_row = Interop.downcallHandle(
        "gtk_icon_view_get_item_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the row in which the item {@code path} is currently
     * displayed. Row numbers start at 0.
     */
    public int getItemRow(TreePath path) {
        try {
            var RESULT = (int) gtk_icon_view_get_item_row.invokeExact(handle(), path.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_item_width = Interop.downcallHandle(
        "gtk_icon_view_get_item_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::item-width property.
     */
    public int getItemWidth() {
        try {
            var RESULT = (int) gtk_icon_view_get_item_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_margin = Interop.downcallHandle(
        "gtk_icon_view_get_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::margin property.
     */
    public int getMargin() {
        try {
            var RESULT = (int) gtk_icon_view_get_margin.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_markup_column = Interop.downcallHandle(
        "gtk_icon_view_get_markup_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column with markup text for {@code icon_view}.
     */
    public int getMarkupColumn() {
        try {
            var RESULT = (int) gtk_icon_view_get_markup_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_model = Interop.downcallHandle(
        "gtk_icon_view_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model the {@code GtkIconView} is based on.  Returns {@code null} if the
     * model is unset.
     */
    public TreeModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_icon_view_get_model.invokeExact(handle());
            return new TreeModel.TreeModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_path_at_pos = Interop.downcallHandle(
        "gtk_icon_view_get_path_at_pos",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the path for the icon at the given position.
     */
    public TreePath getPathAtPos(int x, int y) {
        try {
            var RESULT = (MemoryAddress) gtk_icon_view_get_path_at_pos.invokeExact(handle(), x, y);
            return new TreePath(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_pixbuf_column = Interop.downcallHandle(
        "gtk_icon_view_get_pixbuf_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column with pixbufs for {@code icon_view}.
     */
    public int getPixbufColumn() {
        try {
            var RESULT = (int) gtk_icon_view_get_pixbuf_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_reorderable = Interop.downcallHandle(
        "gtk_icon_view_get_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the user can reorder the list via drag-and-drop.
     * See gtk_icon_view_set_reorderable().
     */
    public boolean getReorderable() {
        try {
            var RESULT = (int) gtk_icon_view_get_reorderable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_row_spacing = Interop.downcallHandle(
        "gtk_icon_view_get_row_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::row-spacing property.
     */
    public int getRowSpacing() {
        try {
            var RESULT = (int) gtk_icon_view_get_row_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_selected_items = Interop.downcallHandle(
        "gtk_icon_view_get_selected_items",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (MemoryAddress) gtk_icon_view_get_selected_items.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_selection_mode = Interop.downcallHandle(
        "gtk_icon_view_get_selection_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selection mode of the {@code icon_view}.
     */
    public SelectionMode getSelectionMode() {
        try {
            var RESULT = (int) gtk_icon_view_get_selection_mode.invokeExact(handle());
            return new SelectionMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_spacing = Interop.downcallHandle(
        "gtk_icon_view_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value of the ::spacing property.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) gtk_icon_view_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_text_column = Interop.downcallHandle(
        "gtk_icon_view_get_text_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column with text for {@code icon_view}.
     */
    public int getTextColumn() {
        try {
            var RESULT = (int) gtk_icon_view_get_text_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_tooltip_column = Interop.downcallHandle(
        "gtk_icon_view_get_tooltip_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the column of {@code icon_view}’s model which is being used for
     * displaying tooltips on {@code icon_view}’s rows.
     */
    public int getTooltipColumn() {
        try {
            var RESULT = (int) gtk_icon_view_get_tooltip_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_tooltip_context = Interop.downcallHandle(
        "gtk_icon_view_get_tooltip_context",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
        try {
            var RESULT = (int) gtk_icon_view_get_tooltip_context.invokeExact(handle(), x, y, keyboardTip ? 1 : 0, Interop.allocateNativeArray(model).handle(), Interop.allocateNativeArray(path).handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_get_visible_range = Interop.downcallHandle(
        "gtk_icon_view_get_visible_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * Both paths should be freed with gtk_tree_path_free() after use.
     */
    public boolean getVisibleRange(TreePath[] startPath, TreePath[] endPath) {
        try {
            var RESULT = (int) gtk_icon_view_get_visible_range.invokeExact(handle(), Interop.allocateNativeArray(startPath).handle(), Interop.allocateNativeArray(endPath).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_item_activated = Interop.downcallHandle(
        "gtk_icon_view_item_activated",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Activates the item determined by {@code path}.
     */
    public void itemActivated(TreePath path) {
        try {
            gtk_icon_view_item_activated.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_path_is_selected = Interop.downcallHandle(
        "gtk_icon_view_path_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the icon pointed to by {@code path} is currently
     * selected. If {@code path} does not point to a valid location, {@code false} is returned.
     */
    public boolean pathIsSelected(TreePath path) {
        try {
            var RESULT = (int) gtk_icon_view_path_is_selected.invokeExact(handle(), path.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_scroll_to_path = Interop.downcallHandle(
        "gtk_icon_view_scroll_to_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)
    );
    
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
        try {
            gtk_icon_view_scroll_to_path.invokeExact(handle(), path.handle(), useAlign ? 1 : 0, rowAlign, colAlign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_select_all = Interop.downcallHandle(
        "gtk_icon_view_select_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Selects all the icons. {@code icon_view} must has its selection mode set
     * to {@link SelectionMode#MULTIPLE}.
     */
    public void selectAll() {
        try {
            gtk_icon_view_select_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_select_path = Interop.downcallHandle(
        "gtk_icon_view_select_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects the row at {@code path}.
     */
    public void selectPath(TreePath path) {
        try {
            gtk_icon_view_select_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_selected_foreach = Interop.downcallHandle(
        "gtk_icon_view_selected_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each selected icon. Note that the model or
     * selection cannot be modified from within this function.
     */
    public void selectedForeach(IconViewForeachFunc func) {
        try {
            gtk_icon_view_selected_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbIconViewForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_activate_on_single_click = Interop.downcallHandle(
        "gtk_icon_view_set_activate_on_single_click",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Causes the {@code GtkIconView}::item-activated signal to be emitted on
     * a single click instead of a double click.
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            gtk_icon_view_set_activate_on_single_click.invokeExact(handle(), single ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_column_spacing = Interop.downcallHandle(
        "gtk_icon_view_set_column_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::column-spacing property which specifies the space
     * which is inserted between the columns of the icon view.
     */
    public void setColumnSpacing(int columnSpacing) {
        try {
            gtk_icon_view_set_column_spacing.invokeExact(handle(), columnSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_columns = Interop.downcallHandle(
        "gtk_icon_view_set_columns",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::columns property which determines in how
     * many columns the icons are arranged. If {@code columns} is
     * -1, the number of columns will be chosen automatically
     * to fill the available area.
     */
    public void setColumns(int columns) {
        try {
            gtk_icon_view_set_columns.invokeExact(handle(), columns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_cursor = Interop.downcallHandle(
        "gtk_icon_view_set_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_icon_view_set_cursor.invokeExact(handle(), path.handle(), cell.handle(), startEditing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_drag_dest_item = Interop.downcallHandle(
        "gtk_icon_view_set_drag_dest_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the item that is highlighted for feedback.
     */
    public void setDragDestItem(TreePath path, IconViewDropPosition pos) {
        try {
            gtk_icon_view_set_drag_dest_item.invokeExact(handle(), path.handle(), pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_item_orientation = Interop.downcallHandle(
        "gtk_icon_view_set_item_orientation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::item-orientation property which determines whether the labels
     * are drawn beside the icons instead of below.
     */
    public void setItemOrientation(Orientation orientation) {
        try {
            gtk_icon_view_set_item_orientation.invokeExact(handle(), orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_item_padding = Interop.downcallHandle(
        "gtk_icon_view_set_item_padding",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkIconView}:item-padding property which specifies the padding
     * around each of the icon view’s items.
     */
    public void setItemPadding(int itemPadding) {
        try {
            gtk_icon_view_set_item_padding.invokeExact(handle(), itemPadding);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_item_width = Interop.downcallHandle(
        "gtk_icon_view_set_item_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::item-width property which specifies the width
     * to use for each item. If it is set to -1, the icon view will
     * automatically determine a suitable item size.
     */
    public void setItemWidth(int itemWidth) {
        try {
            gtk_icon_view_set_item_width.invokeExact(handle(), itemWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_margin = Interop.downcallHandle(
        "gtk_icon_view_set_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::margin property which specifies the space
     * which is inserted at the top, bottom, left and right
     * of the icon view.
     */
    public void setMargin(int margin) {
        try {
            gtk_icon_view_set_margin.invokeExact(handle(), margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_markup_column = Interop.downcallHandle(
        "gtk_icon_view_set_markup_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the column with markup information for {@code icon_view} to be
     * {@code column}. The markup column must be of type {@code G_TYPE_STRING}.
     * If the markup column is set to something, it overrides
     * the text column set by gtk_icon_view_set_text_column().
     */
    public void setMarkupColumn(int column) {
        try {
            gtk_icon_view_set_markup_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_model = Interop.downcallHandle(
        "gtk_icon_view_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model for a {@code GtkIconView}.
     * If the {@code icon_view} already has a model set, it will remove
     * it before setting the new model.  If {@code model} is {@code null}, then
     * it will unset the old model.
     */
    public void setModel(TreeModel model) {
        try {
            gtk_icon_view_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_pixbuf_column = Interop.downcallHandle(
        "gtk_icon_view_set_pixbuf_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the column with pixbufs for {@code icon_view} to be {@code column}. The pixbuf
     * column must be of type {@code GDK_TYPE_PIXBUF}
     */
    public void setPixbufColumn(int column) {
        try {
            gtk_icon_view_set_pixbuf_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_reorderable = Interop.downcallHandle(
        "gtk_icon_view_set_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_icon_view_set_reorderable.invokeExact(handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_row_spacing = Interop.downcallHandle(
        "gtk_icon_view_set_row_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::row-spacing property which specifies the space
     * which is inserted between the rows of the icon view.
     */
    public void setRowSpacing(int rowSpacing) {
        try {
            gtk_icon_view_set_row_spacing.invokeExact(handle(), rowSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_selection_mode = Interop.downcallHandle(
        "gtk_icon_view_set_selection_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the selection mode of the {@code icon_view}.
     */
    public void setSelectionMode(SelectionMode mode) {
        try {
            gtk_icon_view_set_selection_mode.invokeExact(handle(), mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_spacing = Interop.downcallHandle(
        "gtk_icon_view_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the ::spacing property which specifies the space
     * which is inserted between the cells (i.e. the icon and
     * the text) of an item.
     */
    public void setSpacing(int spacing) {
        try {
            gtk_icon_view_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_text_column = Interop.downcallHandle(
        "gtk_icon_view_set_text_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the column with text for {@code icon_view} to be {@code column}. The text
     * column must be of type {@code G_TYPE_STRING}.
     */
    public void setTextColumn(int column) {
        try {
            gtk_icon_view_set_text_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_tooltip_cell = Interop.downcallHandle(
        "gtk_icon_view_set_tooltip_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tip area of {@code tooltip} to the area which {@code cell} occupies in
     * the item pointed to by {@code path}. See also gtk_tooltip_set_tip_area().
     * <p>
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     */
    public void setTooltipCell(Tooltip tooltip, TreePath path, CellRenderer cell) {
        try {
            gtk_icon_view_set_tooltip_cell.invokeExact(handle(), tooltip.handle(), path.handle(), cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_tooltip_column = Interop.downcallHandle(
        "gtk_icon_view_set_tooltip_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_icon_view_set_tooltip_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_set_tooltip_item = Interop.downcallHandle(
        "gtk_icon_view_set_tooltip_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the item at {@code path}.
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     */
    public void setTooltipItem(Tooltip tooltip, TreePath path) {
        try {
            gtk_icon_view_set_tooltip_item.invokeExact(handle(), tooltip.handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_unselect_all = Interop.downcallHandle(
        "gtk_icon_view_unselect_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects all the icons.
     */
    public void unselectAll() {
        try {
            gtk_icon_view_unselect_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_unselect_path = Interop.downcallHandle(
        "gtk_icon_view_unselect_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unselects the row at {@code path}.
     */
    public void unselectPath(TreePath path) {
        try {
            gtk_icon_view_unselect_path.invokeExact(handle(), path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_unset_model_drag_dest = Interop.downcallHandle(
        "gtk_icon_view_unset_model_drag_dest",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragDest() {
        try {
            gtk_icon_view_unset_model_drag_dest.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_icon_view_unset_model_drag_source = Interop.downcallHandle(
        "gtk_icon_view_unset_model_drag_source",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragSource() {
        try {
            gtk_icon_view_unset_model_drag_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-item").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewActivateCursorItem",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("item-activated").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewItemActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewMoveCursor",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectAll",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-cursor-item").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectCursorItem",
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
    public interface SelectionChangedHandler {
        void signalReceived(IconView source);
    }
    
    /**
     * The ::selection-changed signal is emitted when the selection
     * (i.e. the set of selected items) changes.
     */
    public SignalHandle onSelectionChanged(SelectionChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selection-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectionChanged",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-item").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewToggleCursorItem",
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewUnselectAll",
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
    
        public static boolean signalIconViewActivateCursorItem(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.ActivateCursorItemHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
        public static void signalIconViewItemActivated(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.ItemActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)), new TreePath(Refcounted.get(path, false)));
        }
        
        public static boolean signalIconViewMoveCursor(MemoryAddress source, int step, int count, int extend, int modify, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.MoveCursorHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new IconView(Refcounted.get(source)), new MovementStep(step), count, extend != 0, modify != 0);
        }
        
        public static void signalIconViewSelectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.SelectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
        public static void signalIconViewSelectCursorItem(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.SelectCursorItemHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
        public static void signalIconViewSelectionChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.SelectionChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
        public static void signalIconViewToggleCursorItem(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.ToggleCursorItemHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
        public static void signalIconViewUnselectAll(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (IconView.UnselectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new IconView(Refcounted.get(source)));
        }
        
    }
}