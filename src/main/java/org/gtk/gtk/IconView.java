package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * iconview.view
 * ╰── [rubberband]
 * }</pre>
 * <p>
 * {@code GtkIconView} has a single CSS node with name iconview and style class .view.
 * For rubberband selection, a subnode with name rubberband is used.
 */
public class IconView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconView";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a IconView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IconView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to IconView if its GType is a (or inherits from) "GtkIconView".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code IconView} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkIconView", a ClassCastException will be thrown.
     */
    public static IconView castFrom(org.gtk.gobject.Object gobject) {
            return new IconView(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget
     */
    public IconView() {
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithArea(@NotNull org.gtk.gtk.CellArea area) {
        java.util.Objects.requireNonNull(area, "Parameter 'area' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_new_with_area.invokeExact(
                    area.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget using the
     * specified {@code area} to layout cells inside the icons.
     * @param area the {@code GtkCellArea} to use to layout cells
     * @return A newly created {@code GtkIconView} widget
     */
    public static IconView newWithArea(@NotNull org.gtk.gtk.CellArea area) {
        return new IconView(constructNewWithArea(area), Ownership.NONE);
    }
    
    private static Addressable constructNewWithModel(@NotNull org.gtk.gtk.TreeModel model) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_new_with_model.invokeExact(
                    model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkIconView} widget with the model {@code model}.
     * @param model The model.
     * @return A newly created {@code GtkIconView} widget.
     */
    public static IconView newWithModel(@NotNull org.gtk.gtk.TreeModel model) {
        return new IconView(constructNewWithModel(model), Ownership.NONE);
    }
    
    /**
     * Creates a {@code GdkPaintable} representation of the item at {@code path}.
     * This image is used for a drag icon.
     * @param path a {@code GtkTreePath} in {@code icon_view}
     * @return a newly-allocated {@code GdkPaintable} of the drag icon.
     */
    public @Nullable org.gtk.gdk.Paintable createDragIcon(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_create_drag_icon.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Turns {@code icon_view} into a drop destination for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag to this
     *    widget
     */
    public void enableModelDragDest(@NotNull org.gtk.gdk.ContentFormats formats, @NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(formats, "Parameter 'formats' must not be null");
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        try {
            DowncallHandles.gtk_icon_view_enable_model_drag_dest.invokeExact(
                    handle(),
                    formats.handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Turns {@code icon_view} into a drag source for automatic DND. Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     * @param startButtonMask Mask of allowed buttons to start drag
     * @param formats the formats that the drag will support
     * @param actions the bitmask of possible actions for a drag from this
     *    widget
     */
    public void enableModelDragSource(@NotNull org.gtk.gdk.ModifierType startButtonMask, @NotNull org.gtk.gdk.ContentFormats formats, @NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(startButtonMask, "Parameter 'startButtonMask' must not be null");
        java.util.Objects.requireNonNull(formats, "Parameter 'formats' must not be null");
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        try {
            DowncallHandles.gtk_icon_view_enable_model_drag_source.invokeExact(
                    handle(),
                    startButtonMask.getValue(),
                    formats.handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the setting set by gtk_icon_view_set_activate_on_single_click().
     * @return {@code true} if item-activated will be emitted on a single click
     */
    public boolean getActivateOnSingleClick() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_activate_on_single_click.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Fills the bounding rectangle in widget coordinates for the cell specified by
     * {@code path} and {@code cell}. If {@code cell} is {@code null} the main cell area is used.
     * <p>
     * This function is only valid if {@code icon_view} is realized.
     * @param path a {@code GtkTreePath}
     * @param cell a {@code GtkCellRenderer}
     * @param rect rectangle to fill with cell rect
     * @return {@code false} if there is no such item, {@code true} otherwise
     */
    public boolean getCellRect(@NotNull org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.CellRenderer cell, @NotNull org.gtk.gdk.Rectangle rect) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(rect, "Parameter 'rect' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_cell_rect.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (cell == null ? MemoryAddress.NULL : cell.handle()),
                    rect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the value of the ::column-spacing property.
     * @return the space between columns
     */
    public int getColumnSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_column_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of the ::columns property.
     * @return the number of columns, or -1
     */
    public int getColumns() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_columns.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fills in {@code path} and {@code cell} with the current cursor path and cell.
     * If the cursor isn’t currently set, then *{@code path} will be {@code null}.
     * If no cell currently has focus, then *{@code cell} will be {@code null}.
     * <p>
     * The returned {@code GtkTreePath} must be freed with gtk_tree_path_free().
     * @param path Return location for the current
     *   cursor path
     * @param cell Return location the current
     *   focus cell
     * @return {@code true} if the cursor is set.
     */
    public boolean getCursor(@NotNull Out<org.gtk.gtk.TreePath> path, @NotNull Out<org.gtk.gtk.CellRenderer> cell) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(cell, "Parameter 'cell' must not be null");
        MemorySegment cellPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_cursor.invokeExact(
                    handle(),
                    (Addressable) pathPOINTER.address(),
                    (Addressable) cellPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        path.set(new org.gtk.gtk.TreePath(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        cell.set(new org.gtk.gtk.CellRenderer(cellPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return RESULT != 0;
    }
    
    /**
     * Determines the destination item for a given position.
     * @param dragX the position to determine the destination item for
     * @param dragY the position to determine the destination item for
     * @param path Return location for the path of the item
     * @param pos Return location for the drop position
     * @return whether there is an item at the given position.
     */
    public boolean getDestItemAtPos(int dragX, int dragY, @NotNull Out<org.gtk.gtk.TreePath> path, @NotNull Out<org.gtk.gtk.IconViewDropPosition> pos) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_dest_item_at_pos.invokeExact(
                    handle(),
                    dragX,
                    dragY,
                    (Addressable) pathPOINTER.address(),
                    (Addressable) posPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        path.set(new org.gtk.gtk.TreePath(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        pos.set(new org.gtk.gtk.IconViewDropPosition(posPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Gets information about the item that is highlighted for feedback.
     * @param path Return location for the path of
     *   the highlighted item
     * @param pos Return location for the drop position
     */
    public void getDragDestItem(@Nullable Out<org.gtk.gtk.TreePath> path, @NotNull Out<org.gtk.gtk.IconViewDropPosition> pos) {
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        MemorySegment posPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_icon_view_get_drag_dest_item.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                    (Addressable) posPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (path != null) path.set(new org.gtk.gtk.TreePath(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        pos.set(new org.gtk.gtk.IconViewDropPosition(posPOINTER.get(Interop.valueLayout.C_INT, 0)));
    }
    
    /**
     * Gets the path and cell for the icon at the given position.
     * @param x The x position to be identified
     * @param y The y position to be identified
     * @param path Return location for the path
     * @param cell Return location for the renderer
     *   responsible for the cell at ({@code x}, {@code y})
     * @return {@code true} if an item exists at the specified position
     */
    public boolean getItemAtPos(int x, int y, @NotNull Out<org.gtk.gtk.TreePath> path, @NotNull Out<org.gtk.gtk.CellRenderer> cell) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(cell, "Parameter 'cell' must not be null");
        MemorySegment cellPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_at_pos.invokeExact(
                    handle(),
                    x,
                    y,
                    (Addressable) pathPOINTER.address(),
                    (Addressable) cellPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        path.set(new org.gtk.gtk.TreePath(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        cell.set(new org.gtk.gtk.CellRenderer(cellPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return RESULT != 0;
    }
    
    /**
     * Gets the column in which the item {@code path} is currently
     * displayed. Column numbers start at 0.
     * @param path the {@code GtkTreePath} of the item
     * @return The column in which the item is displayed
     */
    public int getItemColumn(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_column.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-orientation property which determines
     * whether the labels are drawn beside the icons instead of below.
     * @return the relative position of texts and icons
     */
    public @NotNull org.gtk.gtk.Orientation getItemOrientation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_orientation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Orientation(RESULT);
    }
    
    /**
     * Returns the value of the ::item-padding property.
     * @return the padding around items
     */
    public int getItemPadding() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_padding.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the row in which the item {@code path} is currently
     * displayed. Row numbers start at 0.
     * @param path the {@code GtkTreePath} of the item
     * @return The row in which the item is displayed
     */
    public int getItemRow(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_row.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of the ::item-width property.
     * @return the width of a single item, or -1
     */
    public int getItemWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_item_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the value of the ::margin property.
     * @return the space at the borders
     */
    public int getMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_margin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the column with markup text for {@code icon_view}.
     * @return the markup column, or -1 if it’s unset.
     */
    public int getMarkupColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_markup_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the model the {@code GtkIconView} is based on.  Returns {@code null} if the
     * model is unset.
     * @return The currently used {@code GtkTreeModel}
     */
    public @Nullable org.gtk.gtk.TreeModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreeModel.TreeModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the path for the icon at the given position.
     * @param x The x position to be identified
     * @param y The y position to be identified
     * @return The {@code GtkTreePath} corresponding
     * to the icon or {@code null} if no icon exists at that position.
     */
    public @Nullable org.gtk.gtk.TreePath getPathAtPos(int x, int y) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_get_path_at_pos.invokeExact(
                    handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TreePath(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the column with pixbufs for {@code icon_view}.
     * @return the pixbuf column, or -1 if it’s unset.
     */
    public int getPixbufColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_pixbuf_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves whether the user can reorder the list via drag-and-drop.
     * See gtk_icon_view_set_reorderable().
     * @return {@code true} if the list can be reordered.
     */
    public boolean getReorderable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_reorderable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the value of the ::row-spacing property.
     * @return the space between rows
     */
    public int getRowSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_row_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return A {@code GList} containing a {@code GtkTreePath} for each selected row.
     */
    public @NotNull org.gtk.glib.List getSelectedItems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_icon_view_get_selected_items.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the selection mode of the {@code icon_view}.
     * @return the current selection mode
     */
    public @NotNull org.gtk.gtk.SelectionMode getSelectionMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_selection_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionMode(RESULT);
    }
    
    /**
     * Returns the value of the ::spacing property.
     * @return the space between cells
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the column with text for {@code icon_view}.
     * @return the text column, or -1 if it’s unset.
     */
    public int getTextColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_text_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the column of {@code icon_view}’s model which is being used for
     * displaying tooltips on {@code icon_view}’s rows.
     * @return the index of the tooltip column that is currently being
     * used, or -1 if this is disabled.
     */
    public int getTooltipColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_tooltip_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is supposed to be used in a {@code GtkWidget::query-tooltip}
     * signal handler for {@code GtkIconView}. The {@code x}, {@code y} and {@code keyboard_tip} values
     * which are received in the signal handler, should be passed to this
     * function without modification.
     * <p>
     * The return value indicates whether there is an icon view item at the given
     * coordinates ({@code true}) or not ({@code false}) for mouse tooltips. For keyboard
     * tooltips the item returned will be the cursor item. When {@code true}, then any of
     * {@code model}, {@code path} and {@code iter} which have been provided will be set to point to
     * that row and the corresponding model.
     * @param x the x coordinate (relative to widget coordinates)
     * @param y the y coordinate (relative to widget coordinates)
     * @param keyboardTip whether this is a keyboard tooltip or not
     * @param model a pointer to receive a {@code GtkTreeModel}
     * @param path a pointer to receive a {@code GtkTreePath}
     * @param iter a pointer to receive a {@code GtkTreeIter}
     * @return whether or not the given tooltip context points to an item
     */
    public boolean getTooltipContext(int x, int y, boolean keyboardTip, @NotNull Out<org.gtk.gtk.TreeModel> model, @NotNull Out<org.gtk.gtk.TreePath> path, @NotNull org.gtk.gtk.TreeIter iter) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        MemorySegment modelPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        MemorySegment pathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_tooltip_context.invokeExact(
                    handle(),
                    x,
                    y,
                    keyboardTip ? 1 : 0,
                    (Addressable) modelPOINTER.address(),
                    (Addressable) pathPOINTER.address(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.set(new org.gtk.gtk.TreeModel.TreeModelImpl(modelPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        path.set(new org.gtk.gtk.TreePath(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Sets {@code start_path} and {@code end_path} to be the first and last visible path.
     * Note that there may be invisible paths in between.
     * <p>
     * Both paths should be freed with gtk_tree_path_free() after use.
     * @param startPath Return location for start of region
     * @param endPath Return location for end of region
     * @return {@code true}, if valid paths were placed in {@code start_path} and {@code end_path}
     */
    public boolean getVisibleRange(@NotNull Out<org.gtk.gtk.TreePath> startPath, @NotNull Out<org.gtk.gtk.TreePath> endPath) {
        java.util.Objects.requireNonNull(startPath, "Parameter 'startPath' must not be null");
        MemorySegment startPathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(endPath, "Parameter 'endPath' must not be null");
        MemorySegment endPathPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_get_visible_range.invokeExact(
                    handle(),
                    (Addressable) startPathPOINTER.address(),
                    (Addressable) endPathPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        startPath.set(new org.gtk.gtk.TreePath(startPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        endPath.set(new org.gtk.gtk.TreePath(endPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Activates the item determined by {@code path}.
     * @param path The {@code GtkTreePath} to be activated
     */
    public void itemActivated(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_item_activated.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if the icon pointed to by {@code path} is currently
     * selected. If {@code path} does not point to a valid location, {@code false} is returned.
     * @param path A {@code GtkTreePath} to check selection on.
     * @return {@code true} if {@code path} is selected.
     */
    public boolean pathIsSelected(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_icon_view_path_is_selected.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param path The path of the item to move to.
     * @param useAlign whether to use alignment arguments, or {@code false}.
     * @param rowAlign The vertical alignment of the item specified by {@code path}.
     * @param colAlign The horizontal alignment of the item specified by {@code path}.
     */
    public void scrollToPath(@NotNull org.gtk.gtk.TreePath path, boolean useAlign, float rowAlign, float colAlign) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_scroll_to_path.invokeExact(
                    handle(),
                    path.handle(),
                    useAlign ? 1 : 0,
                    rowAlign,
                    colAlign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects all the icons. {@code icon_view} must has its selection mode set
     * to {@link SelectionMode#MULTIPLE}.
     */
    public void selectAll() {
        try {
            DowncallHandles.gtk_icon_view_select_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the row at {@code path}.
     * @param path The {@code GtkTreePath} to be selected.
     */
    public void selectPath(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_select_path.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls a function for each selected icon. Note that the model or
     * selection cannot be modified from within this function.
     * @param func The function to call for each selected icon.
     */
    public void selectedForeach(@NotNull org.gtk.gtk.IconViewForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gtk_icon_view_selected_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbIconViewForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Causes the {@code GtkIconView}::item-activated signal to be emitted on
     * a single click instead of a double click.
     * @param single {@code true} to emit item-activated on a single click
     */
    public void setActivateOnSingleClick(boolean single) {
        try {
            DowncallHandles.gtk_icon_view_set_activate_on_single_click.invokeExact(
                    handle(),
                    single ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::column-spacing property which specifies the space
     * which is inserted between the columns of the icon view.
     * @param columnSpacing the column spacing
     */
    public void setColumnSpacing(int columnSpacing) {
        try {
            DowncallHandles.gtk_icon_view_set_column_spacing.invokeExact(
                    handle(),
                    columnSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::columns property which determines in how
     * many columns the icons are arranged. If {@code columns} is
     * -1, the number of columns will be chosen automatically
     * to fill the available area.
     * @param columns the number of columns
     */
    public void setColumns(int columns) {
        try {
            DowncallHandles.gtk_icon_view_set_columns.invokeExact(
                    handle(),
                    columns);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param path A {@code GtkTreePath}
     * @param cell One of the cell renderers of {@code icon_view}
     * @param startEditing {@code true} if the specified cell should start being edited.
     */
    public void setCursor(@NotNull org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.CellRenderer cell, boolean startEditing) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_cursor.invokeExact(
                    handle(),
                    path.handle(),
                    (Addressable) (cell == null ? MemoryAddress.NULL : cell.handle()),
                    startEditing ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the item that is highlighted for feedback.
     * @param path The path of the item to highlight
     * @param pos Specifies where to drop, relative to the item
     */
    public void setDragDestItem(@Nullable org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.IconViewDropPosition pos) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_drag_dest_item.invokeExact(
                    handle(),
                    (Addressable) (path == null ? MemoryAddress.NULL : path.handle()),
                    pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::item-orientation property which determines whether the labels
     * are drawn beside the icons instead of below.
     * @param orientation the relative position of texts and icons
     */
    public void setItemOrientation(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_item_orientation.invokeExact(
                    handle(),
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkIconView}:item-padding property which specifies the padding
     * around each of the icon view’s items.
     * @param itemPadding the item padding
     */
    public void setItemPadding(int itemPadding) {
        try {
            DowncallHandles.gtk_icon_view_set_item_padding.invokeExact(
                    handle(),
                    itemPadding);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::item-width property which specifies the width
     * to use for each item. If it is set to -1, the icon view will
     * automatically determine a suitable item size.
     * @param itemWidth the width for each item
     */
    public void setItemWidth(int itemWidth) {
        try {
            DowncallHandles.gtk_icon_view_set_item_width.invokeExact(
                    handle(),
                    itemWidth);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::margin property which specifies the space
     * which is inserted at the top, bottom, left and right
     * of the icon view.
     * @param margin the margin
     */
    public void setMargin(int margin) {
        try {
            DowncallHandles.gtk_icon_view_set_margin.invokeExact(
                    handle(),
                    margin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the column with markup information for {@code icon_view} to be
     * {@code column}. The markup column must be of type {@code G_TYPE_STRING}.
     * If the markup column is set to something, it overrides
     * the text column set by gtk_icon_view_set_text_column().
     * @param column A column in the currently used model, or -1 to display no text
     */
    public void setMarkupColumn(int column) {
        try {
            DowncallHandles.gtk_icon_view_set_markup_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model for a {@code GtkIconView}.
     * If the {@code icon_view} already has a model set, it will remove
     * it before setting the new model.  If {@code model} is {@code null}, then
     * it will unset the old model.
     * @param model The model.
     */
    public void setModel(@Nullable org.gtk.gtk.TreeModel model) {
        try {
            DowncallHandles.gtk_icon_view_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the column with pixbufs for {@code icon_view} to be {@code column}. The pixbuf
     * column must be of type {@code GDK_TYPE_PIXBUF}
     * @param column A column in the currently used model, or -1 to disable
     */
    public void setPixbufColumn(int column) {
        try {
            DowncallHandles.gtk_icon_view_set_pixbuf_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param reorderable {@code true}, if the list of items can be reordered.
     */
    public void setReorderable(boolean reorderable) {
        try {
            DowncallHandles.gtk_icon_view_set_reorderable.invokeExact(
                    handle(),
                    reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::row-spacing property which specifies the space
     * which is inserted between the rows of the icon view.
     * @param rowSpacing the row spacing
     */
    public void setRowSpacing(int rowSpacing) {
        try {
            DowncallHandles.gtk_icon_view_set_row_spacing.invokeExact(
                    handle(),
                    rowSpacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the selection mode of the {@code icon_view}.
     * @param mode The selection mode
     */
    public void setSelectionMode(@NotNull org.gtk.gtk.SelectionMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_selection_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the ::spacing property which specifies the space
     * which is inserted between the cells (i.e. the icon and
     * the text) of an item.
     * @param spacing the spacing
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_icon_view_set_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the column with text for {@code icon_view} to be {@code column}. The text
     * column must be of type {@code G_TYPE_STRING}.
     * @param column A column in the currently used model, or -1 to display no text
     */
    public void setTextColumn(int column) {
        try {
            DowncallHandles.gtk_icon_view_set_text_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tip area of {@code tooltip} to the area which {@code cell} occupies in
     * the item pointed to by {@code path}. See also gtk_tooltip_set_tip_area().
     * <p>
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * @param tooltip a {@code GtkTooltip}
     * @param path a {@code GtkTreePath}
     * @param cell a {@code GtkCellRenderer}
     */
    public void setTooltipCell(@NotNull org.gtk.gtk.Tooltip tooltip, @NotNull org.gtk.gtk.TreePath path, @Nullable org.gtk.gtk.CellRenderer cell) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_tooltip_cell.invokeExact(
                    handle(),
                    tooltip.handle(),
                    path.handle(),
                    (Addressable) (cell == null ? MemoryAddress.NULL : cell.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * so &amp;, &lt;, etc have to be escaped in the text.
     * @param column an integer, which is a valid column number for {@code icon_view}’s model
     */
    public void setTooltipColumn(int column) {
        try {
            DowncallHandles.gtk_icon_view_set_tooltip_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the tip area of {@code tooltip} to be the area covered by the item at {@code path}.
     * See also gtk_icon_view_set_tooltip_column() for a simpler alternative.
     * See also gtk_tooltip_set_tip_area().
     * @param tooltip a {@code GtkTooltip}
     * @param path a {@code GtkTreePath}
     */
    public void setTooltipItem(@NotNull org.gtk.gtk.Tooltip tooltip, @NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(tooltip, "Parameter 'tooltip' must not be null");
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_set_tooltip_item.invokeExact(
                    handle(),
                    tooltip.handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects all the icons.
     */
    public void unselectAll() {
        try {
            DowncallHandles.gtk_icon_view_unselect_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unselects the row at {@code path}.
     * @param path The {@code GtkTreePath} to be unselected.
     */
    public void unselectPath(@NotNull org.gtk.gtk.TreePath path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.gtk_icon_view_unselect_path.invokeExact(
                    handle(),
                    path.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_dest(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragDest() {
        try {
            DowncallHandles.gtk_icon_view_unset_model_drag_dest.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the effect of gtk_icon_view_enable_model_drag_source(). Calling this
     * method sets {@code GtkIconView}:reorderable to {@code false}.
     */
    public void unsetModelDragSource() {
        try {
            DowncallHandles.gtk_icon_view_unset_model_drag_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_icon_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ActivateCursorItem {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.ActivateCursorItem> onActivateCursorItem(IconView.ActivateCursorItem handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate-cursor-item"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewActivateCursorItem",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.ActivateCursorItem>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ItemActivated {
        void signalReceived(IconView source, @NotNull org.gtk.gtk.TreePath path);
    }
    
    /**
     * The ::item-activated signal is emitted when the method
     * gtk_icon_view_item_activated() is called, when the user double
     * clicks an item with the "activate-on-single-click" property set
     * to {@code false}, or when the user single clicks an item when the
     * "activate-on-single-click" property set to {@code true}. It is also
     * emitted when a non-editable item is selected and one of the keys:
     * Space, Return or Enter is pressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.ItemActivated> onItemActivated(IconView.ItemActivated handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("item-activated"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewItemActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.ItemActivated>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        boolean signalReceived(IconView source, @NotNull org.gtk.gtk.MovementStep step, int count, boolean extend, boolean modify);
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
     * </ul>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.MoveCursor> onMoveCursor(IconView.MoveCursor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewMoveCursor",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.MoveCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAll {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.SelectAll> onSelectAll(IconView.SelectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.SelectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectCursorItem {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.SelectCursorItem> onSelectCursorItem(IconView.SelectCursorItem handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-cursor-item"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectCursorItem",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.SelectCursorItem>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectionChanged {
        void signalReceived(IconView source);
    }
    
    /**
     * The ::selection-changed signal is emitted when the selection
     * (i.e. the set of selected items) changes.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.SelectionChanged> onSelectionChanged(IconView.SelectionChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selection-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.SelectionChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorItem {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.ToggleCursorItem> onToggleCursorItem(IconView.ToggleCursorItem handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-item"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewToggleCursorItem",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.ToggleCursorItem>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnselectAll {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<IconView.UnselectAll> onUnselectAll(IconView.UnselectAll handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unselect-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(IconView.Callbacks.class, "signalIconViewUnselectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<IconView.UnselectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link IconView.Build} object constructs a {@link IconView} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link IconView} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link IconView} using {@link IconView#castFrom}.
         * @return A new instance of {@code IconView} with the properties 
         *         that were set in the Build object.
         */
        public IconView construct() {
            return IconView.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    IconView.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The activate-on-single-click property specifies whether the "item-activated" signal
         * will be emitted after a single click.
         * @param activateOnSingleClick The value for the {@code activate-on-single-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActivateOnSingleClick(boolean activateOnSingleClick) {
            names.add("activate-on-single-click");
            values.add(org.gtk.gobject.Value.create(activateOnSingleClick));
            return this;
        }
        
        /**
         * The {@code GtkCellArea} used to layout cell renderers for this view.
         * <p>
         * If no area is specified when creating the icon view with gtk_icon_view_new_with_area()
         * a {@code GtkCellAreaBox} will be used.
         * @param cellArea The value for the {@code cell-area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCellArea(org.gtk.gtk.CellArea cellArea) {
            names.add("cell-area");
            values.add(org.gtk.gobject.Value.create(cellArea));
            return this;
        }
        
        /**
         * The column-spacing property specifies the space which is inserted between
         * the columns of the icon view.
         * @param columnSpacing The value for the {@code column-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnSpacing(int columnSpacing) {
            names.add("column-spacing");
            values.add(org.gtk.gobject.Value.create(columnSpacing));
            return this;
        }
        
        /**
         * The columns property contains the number of the columns in which the
         * items should be displayed. If it is -1, the number of columns will
         * be chosen automatically to fill the available area.
         * @param columns The value for the {@code columns} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumns(int columns) {
            names.add("columns");
            values.add(org.gtk.gobject.Value.create(columns));
            return this;
        }
        
        /**
         * The item-orientation property specifies how the cells (i.e. the icon and
         * the text) of the item are positioned relative to each other.
         * @param itemOrientation The value for the {@code item-orientation} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemOrientation(org.gtk.gtk.Orientation itemOrientation) {
            names.add("item-orientation");
            values.add(org.gtk.gobject.Value.create(itemOrientation));
            return this;
        }
        
        /**
         * The item-padding property specifies the padding around each
         * of the icon view's item.
         * @param itemPadding The value for the {@code item-padding} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemPadding(int itemPadding) {
            names.add("item-padding");
            values.add(org.gtk.gobject.Value.create(itemPadding));
            return this;
        }
        
        /**
         * The item-width property specifies the width to use for each item.
         * If it is set to -1, the icon view will automatically determine a
         * suitable item size.
         * @param itemWidth The value for the {@code item-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemWidth(int itemWidth) {
            names.add("item-width");
            values.add(org.gtk.gobject.Value.create(itemWidth));
            return this;
        }
        
        /**
         * The margin property specifies the space which is inserted
         * at the edges of the icon view.
         * @param margin The value for the {@code margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMargin(int margin) {
            names.add("margin");
            values.add(org.gtk.gobject.Value.create(margin));
            return this;
        }
        
        /**
         * The ::markup-column property contains the number of the model column
         * containing markup information to be displayed. The markup column must be
         * of type {@code G_TYPE_STRING}. If this property and the :text-column property
         * are both set to column numbers, it overrides the text column.
         * If both are set to -1, no texts are displayed.
         * @param markupColumn The value for the {@code markup-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMarkupColumn(int markupColumn) {
            names.add("markup-column");
            values.add(org.gtk.gobject.Value.create(markupColumn));
            return this;
        }
        
        public Build setModel(org.gtk.gtk.TreeModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The ::pixbuf-column property contains the number of the model column
         * containing the pixbufs which are displayed. The pixbuf column must be
         * of type {@code GDK_TYPE_PIXBUF}. Setting this property to -1 turns off the
         * display of pixbufs.
         * @param pixbufColumn The value for the {@code pixbuf-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPixbufColumn(int pixbufColumn) {
            names.add("pixbuf-column");
            values.add(org.gtk.gobject.Value.create(pixbufColumn));
            return this;
        }
        
        /**
         * The reorderable property specifies if the items can be reordered
         * by DND.
         * @param reorderable The value for the {@code reorderable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setReorderable(boolean reorderable) {
            names.add("reorderable");
            values.add(org.gtk.gobject.Value.create(reorderable));
            return this;
        }
        
        /**
         * The row-spacing property specifies the space which is inserted between
         * the rows of the icon view.
         * @param rowSpacing The value for the {@code row-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRowSpacing(int rowSpacing) {
            names.add("row-spacing");
            values.add(org.gtk.gobject.Value.create(rowSpacing));
            return this;
        }
        
        /**
         * The ::selection-mode property specifies the selection mode of
         * icon view. If the mode is {@link SelectionMode#MULTIPLE}, rubberband selection
         * is enabled, for the other modes, only keyboard selection is possible.
         * @param selectionMode The value for the {@code selection-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSelectionMode(org.gtk.gtk.SelectionMode selectionMode) {
            names.add("selection-mode");
            values.add(org.gtk.gobject.Value.create(selectionMode));
            return this;
        }
        
        /**
         * The spacing property specifies the space which is inserted between
         * the cells (i.e. the icon and the text) of an item.
         * @param spacing The value for the {@code spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
        
        /**
         * The ::text-column property contains the number of the model column
         * containing the texts which are displayed. The text column must be
         * of type {@code G_TYPE_STRING}. If this property and the :markup-column
         * property are both set to -1, no texts are displayed.
         * @param textColumn The value for the {@code text-column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextColumn(int textColumn) {
            names.add("text-column");
            values.add(org.gtk.gobject.Value.create(textColumn));
            return this;
        }
        
        public Build setTooltipColumn(int tooltipColumn) {
            names.add("tooltip-column");
            values.add(org.gtk.gobject.Value.create(tooltipColumn));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_icon_view_new = Interop.downcallHandle(
            "gtk_icon_view_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_new_with_area = Interop.downcallHandle(
            "gtk_icon_view_new_with_area",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_new_with_model = Interop.downcallHandle(
            "gtk_icon_view_new_with_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_create_drag_icon = Interop.downcallHandle(
            "gtk_icon_view_create_drag_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_enable_model_drag_dest = Interop.downcallHandle(
            "gtk_icon_view_enable_model_drag_dest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_enable_model_drag_source = Interop.downcallHandle(
            "gtk_icon_view_enable_model_drag_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_activate_on_single_click = Interop.downcallHandle(
            "gtk_icon_view_get_activate_on_single_click",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_cell_rect = Interop.downcallHandle(
            "gtk_icon_view_get_cell_rect",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_column_spacing = Interop.downcallHandle(
            "gtk_icon_view_get_column_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_columns = Interop.downcallHandle(
            "gtk_icon_view_get_columns",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_cursor = Interop.downcallHandle(
            "gtk_icon_view_get_cursor",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_dest_item_at_pos = Interop.downcallHandle(
            "gtk_icon_view_get_dest_item_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_drag_dest_item = Interop.downcallHandle(
            "gtk_icon_view_get_drag_dest_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_at_pos = Interop.downcallHandle(
            "gtk_icon_view_get_item_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_column = Interop.downcallHandle(
            "gtk_icon_view_get_item_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_orientation = Interop.downcallHandle(
            "gtk_icon_view_get_item_orientation",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_padding = Interop.downcallHandle(
            "gtk_icon_view_get_item_padding",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_row = Interop.downcallHandle(
            "gtk_icon_view_get_item_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_item_width = Interop.downcallHandle(
            "gtk_icon_view_get_item_width",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_margin = Interop.downcallHandle(
            "gtk_icon_view_get_margin",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_markup_column = Interop.downcallHandle(
            "gtk_icon_view_get_markup_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_model = Interop.downcallHandle(
            "gtk_icon_view_get_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_path_at_pos = Interop.downcallHandle(
            "gtk_icon_view_get_path_at_pos",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_pixbuf_column = Interop.downcallHandle(
            "gtk_icon_view_get_pixbuf_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_reorderable = Interop.downcallHandle(
            "gtk_icon_view_get_reorderable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_row_spacing = Interop.downcallHandle(
            "gtk_icon_view_get_row_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_selected_items = Interop.downcallHandle(
            "gtk_icon_view_get_selected_items",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_selection_mode = Interop.downcallHandle(
            "gtk_icon_view_get_selection_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_spacing = Interop.downcallHandle(
            "gtk_icon_view_get_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_text_column = Interop.downcallHandle(
            "gtk_icon_view_get_text_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_tooltip_column = Interop.downcallHandle(
            "gtk_icon_view_get_tooltip_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_tooltip_context = Interop.downcallHandle(
            "gtk_icon_view_get_tooltip_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_visible_range = Interop.downcallHandle(
            "gtk_icon_view_get_visible_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_item_activated = Interop.downcallHandle(
            "gtk_icon_view_item_activated",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_path_is_selected = Interop.downcallHandle(
            "gtk_icon_view_path_is_selected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_scroll_to_path = Interop.downcallHandle(
            "gtk_icon_view_scroll_to_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_select_all = Interop.downcallHandle(
            "gtk_icon_view_select_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_select_path = Interop.downcallHandle(
            "gtk_icon_view_select_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_selected_foreach = Interop.downcallHandle(
            "gtk_icon_view_selected_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_activate_on_single_click = Interop.downcallHandle(
            "gtk_icon_view_set_activate_on_single_click",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_column_spacing = Interop.downcallHandle(
            "gtk_icon_view_set_column_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_columns = Interop.downcallHandle(
            "gtk_icon_view_set_columns",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_cursor = Interop.downcallHandle(
            "gtk_icon_view_set_cursor",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_drag_dest_item = Interop.downcallHandle(
            "gtk_icon_view_set_drag_dest_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_item_orientation = Interop.downcallHandle(
            "gtk_icon_view_set_item_orientation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_item_padding = Interop.downcallHandle(
            "gtk_icon_view_set_item_padding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_item_width = Interop.downcallHandle(
            "gtk_icon_view_set_item_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_margin = Interop.downcallHandle(
            "gtk_icon_view_set_margin",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_markup_column = Interop.downcallHandle(
            "gtk_icon_view_set_markup_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_model = Interop.downcallHandle(
            "gtk_icon_view_set_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_pixbuf_column = Interop.downcallHandle(
            "gtk_icon_view_set_pixbuf_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_reorderable = Interop.downcallHandle(
            "gtk_icon_view_set_reorderable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_row_spacing = Interop.downcallHandle(
            "gtk_icon_view_set_row_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_selection_mode = Interop.downcallHandle(
            "gtk_icon_view_set_selection_mode",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_spacing = Interop.downcallHandle(
            "gtk_icon_view_set_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_text_column = Interop.downcallHandle(
            "gtk_icon_view_set_text_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_tooltip_cell = Interop.downcallHandle(
            "gtk_icon_view_set_tooltip_cell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_tooltip_column = Interop.downcallHandle(
            "gtk_icon_view_set_tooltip_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_icon_view_set_tooltip_item = Interop.downcallHandle(
            "gtk_icon_view_set_tooltip_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_unselect_all = Interop.downcallHandle(
            "gtk_icon_view_unselect_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_unselect_path = Interop.downcallHandle(
            "gtk_icon_view_unselect_path",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_unset_model_drag_dest = Interop.downcallHandle(
            "gtk_icon_view_unset_model_drag_dest",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_unset_model_drag_source = Interop.downcallHandle(
            "gtk_icon_view_unset_model_drag_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_icon_view_get_type = Interop.downcallHandle(
            "gtk_icon_view_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalIconViewActivateCursorItem(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.ActivateCursorItem) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
        
        public static void signalIconViewItemActivated(MemoryAddress source, MemoryAddress path, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.ItemActivated) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE), new org.gtk.gtk.TreePath(path, Ownership.NONE));
        }
        
        public static boolean signalIconViewMoveCursor(MemoryAddress source, int step, int count, int extend, int modify, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.MoveCursor) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new IconView(source, Ownership.NONE), new org.gtk.gtk.MovementStep(step), count, extend != 0, modify != 0);
        }
        
        public static void signalIconViewSelectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.SelectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
        
        public static void signalIconViewSelectCursorItem(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.SelectCursorItem) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
        
        public static void signalIconViewSelectionChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.SelectionChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
        
        public static void signalIconViewToggleCursorItem(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.ToggleCursorItem) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
        
        public static void signalIconViewUnselectAll(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (IconView.UnselectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new IconView(source, Ownership.NONE));
        }
    }
}
