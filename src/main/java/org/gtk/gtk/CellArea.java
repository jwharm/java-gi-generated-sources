package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An abstract class for laying out {@code GtkCellRenderer}s
 * <p>
 * The {@code GtkCellArea} is an abstract class for {@code Gtk.CellLayout}
 * widgets (also referred to as "layouting widgets") to interface with
 * an arbitrary number of {@link CellRenderer}s and interact with the user
 * for a given {@code Gtk.TreeModel} row.
 * <p>
 * The cell area handles events, focus navigation, drawing and
 * size requests and allocations for a given row of data.
 * <p>
 * Usually users dont have to interact with the {@code GtkCellArea} directly
 * unless they are implementing a cell-layouting widget themselves.
 * <p>
 * <strong>Requesting area sizes</strong><br/>
 * As outlined in
 * <a href="class.Widget.html#height-for-width-geometry-management">GtkWidget’s geometry management section</a>,
 * GTK uses a height-for-width
 * geometry management system to compute the sizes of widgets and user
 * interfaces. {@code GtkCellArea} uses the same semantics to calculate the
 * size of an area for an arbitrary number of {@code GtkTreeModel} rows.
 * <p>
 * When requesting the size of a cell area one needs to calculate
 * the size for a handful of rows, and this will be done differently by
 * different layouting widgets. For instance a {@link TreeViewColumn}
 * always lines up the areas from top to bottom while a {@link IconView}
 * on the other hand might enforce that all areas received the same
 * width and wrap the areas around, requesting height for more cell
 * areas when allocated less width.
 * <p>
 * It’s also important for areas to maintain some cell
 * alignments with areas rendered for adjacent rows (cells can
 * appear “columnized” inside an area even when the size of
 * cells are different in each row). For this reason the {@code GtkCellArea}
 * uses a {@link CellAreaContext} object to store the alignments
 * and sizes along the way (as well as the overall largest minimum
 * and natural size for all the rows which have been calculated
 * with the said context).
 * <p>
 * The {@link CellAreaContext} is an opaque object specific to the
 * {@code GtkCellArea} which created it (see {@link CellArea#createContext}).
 * <p>
 * The owning cell-layouting widget can create as many contexts as
 * it wishes to calculate sizes of rows which should receive the
 * same size in at least one orientation (horizontally or vertically),
 * However, it’s important that the same {@link CellAreaContext} which
 * was used to request the sizes for a given {@code GtkTreeModel} row be
 * used when rendering or processing events for that row.
 * <p>
 * In order to request the width of all the rows at the root level
 * of a {@code GtkTreeModel} one would do the following:
 * <pre>{@code c
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 * 
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_width (area, context, widget, NULL, NULL);
 * 
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 * 
 * gtk_cell_area_context_get_preferred_width (context, &minimum_width, &natural_width);
 * }</pre>
 * <p>
 * Note that in this example it’s not important to observe the
 * returned minimum and natural width of the area for each row
 * unless the cell-layouting object is actually interested in the
 * widths of individual rows. The overall width is however stored
 * in the accompanying {@code GtkCellAreaContext} object and can be consulted
 * at any time.
 * <p>
 * This can be useful since {@code GtkCellLayout} widgets usually have to
 * support requesting and rendering rows in treemodels with an
 * exceedingly large amount of rows. The {@code GtkCellLayout} widget in
 * that case would calculate the required width of the rows in an
 * idle or timeout source (see {@link org.gtk.glib.GLib#timeoutAdd}) and when the widget
 * is requested its actual width in {@link Widget#measure}
 * it can simply consult the width accumulated so far in the
 * {@code GtkCellAreaContext} object.
 * <p>
 * A simple example where rows are rendered from top to bottom and
 * take up the full width of the layouting widget would look like:
 * <pre>{@code c
 * static void
 * foo_get_preferred_width (GtkWidget *widget,
 *                          int       *minimum_size,
 *                          int       *natural_size)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 * 
 *   foo_ensure_at_least_one_handfull_of_rows_have_been_requested (self);
 * 
 *   gtk_cell_area_context_get_preferred_width (priv->context, minimum_size, natural_size);
 * }
 * }</pre>
 * <p>
 * In the above example the {@code Foo} widget has to make sure that some
 * row sizes have been calculated (the amount of rows that {@code Foo} judged
 * was appropriate to request space for in a single timeout iteration)
 * before simply returning the amount of space required by the area via
 * the {@code GtkCellAreaContext}.
 * <p>
 * Requesting the height for width (or width for height) of an area is
 * a similar task except in this case the {@code GtkCellAreaContext} does not
 * store the data (actually, it does not know how much space the layouting
 * widget plans to allocate it for every row. It’s up to the layouting
 * widget to render each row of data with the appropriate height and
 * width which was requested by the {@code GtkCellArea}).
 * <p>
 * In order to request the height for width of all the rows at the
 * root level of a {@code GtkTreeModel} one would do the following:
 * <pre>{@code c
 * GtkTreeIter iter;
 * int minimum_height;
 * int natural_height;
 * int full_minimum_height = 0;
 * int full_natural_height = 0;
 * 
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_height_for_width (area, context, widget,
 *                                                   width, &minimum_height, &natural_height);
 * 
 *     if (width_is_for_allocation)
 *        cache_row_height (&iter, minimum_height, natural_height);
 * 
 *     full_minimum_height += minimum_height;
 *     full_natural_height += natural_height;
 * 
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 * }</pre>
 * <p>
 * Note that in the above example we would need to cache the heights
 * returned for each row so that we would know what sizes to render the
 * areas for each row. However we would only want to really cache the
 * heights if the request is intended for the layouting widgets real
 * allocation.
 * <p>
 * In some cases the layouting widget is requested the height for an
 * arbitrary for_width, this is a special case for layouting widgets
 * who need to request size for tens of thousands  of rows. For this
 * case it’s only important that the layouting widget calculate
 * one reasonably sized chunk of rows and return that height
 * synchronously. The reasoning here is that any layouting widget is
 * at least capable of synchronously calculating enough height to fill
 * the screen height (or scrolled window height) in response to a single
 * call to {@link Widget#measure}. Returning
 * a perfect height for width that is larger than the screen area is
 * inconsequential since after the layouting receives an allocation
 * from a scrolled window it simply continues to drive the scrollbar
 * values while more and more height is required for the row heights
 * that are calculated in the background.
 * <p>
 * <strong>Rendering Areas</strong><br/>
 * Once area sizes have been acquired at least for the rows in the
 * visible area of the layouting widget they can be rendered at
 * {@code Widget#snapshot} time.
 * <p>
 * A crude example of how to render all the rows at the root level
 * runs as follows:
 * <pre>{@code c
 * GtkAllocation allocation;
 * GdkRectangle cell_area = { 0, };
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 * 
 * gtk_widget_get_allocation (widget, &allocation);
 * cell_area.width = allocation.width;
 * 
 * valid = gtk_tree_model_get_iter_first (model, &iter);
 * while (valid)
 *   {
 *     cell_area.height = get_cached_height_for_row (&iter);
 * 
 *     gtk_cell_area_apply_attributes (area, model, &iter, FALSE, FALSE);
 *     gtk_cell_area_render (area, context, widget, cr,
 *                           &cell_area, &cell_area, state_flags, FALSE);
 * 
 *     cell_area.y += cell_area.height;
 * 
 *     valid = gtk_tree_model_iter_next (model, &iter);
 *   }
 * }</pre>
 * <p>
 * Note that the cached height in this example really depends on how
 * the layouting widget works. The layouting widget might decide to
 * give every row its minimum or natural height or, if the model content
 * is expected to fit inside the layouting widget without scrolling, it
 * would make sense to calculate the allocation for each row at
 * the time the widget is allocated using {@link Gtk#distributeNaturalAllocation}.
 * <p>
 * <strong>Handling Events and Driving Keyboard Focus</strong><br/>
 * Passing events to the area is as simple as handling events on any
 * normal widget and then passing them to the {@link CellArea#event}
 * API as they come in. Usually {@code GtkCellArea} is only interested in
 * button events, however some customized derived areas can be implemented
 * who are interested in handling other events. Handling an event can
 * trigger the {@code Gtk.CellArea::focus-changed`} signal to fire; as well
 * as {@code GtkCellArea::add-editable`} in the case that an editable cell
 * was clicked and needs to start editing. You can call
 * {@link CellArea#stopEditing} at any time to cancel any cell editing
 * that is currently in progress.
 * <p>
 * The {@code GtkCellArea} drives keyboard focus from cell to cell in a way
 * similar to {@code GtkWidget}. For layouting widgets that support giving
 * focus to cells it’s important to remember to pass {@code GTK_CELL_RENDERER_FOCUSED}
 * to the area functions for the row that has focus and to tell the
 * area to paint the focus at render time.
 * <p>
 * Layouting widgets that accept focus on cells should implement the
 * {@code Widget#focus} virtual method. The layouting widget is always
 * responsible for knowing where {@code GtkTreeModel} rows are rendered inside
 * the widget, so at {@code Widget#focus} time the layouting widget
 * should use the {@code GtkCellArea} methods to navigate focus inside the area
 * and then observe the {@code Gtk.DirectionType} to pass the focus to adjacent
 * rows and areas.
 * <p>
 * A basic example of how the {@code Widget#focus} virtual method
 * should be implemented:
 * <pre>{@code 
 * static gboolean
 * foo_focus (GtkWidget       *widget,
 *            GtkDirectionType direction)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 *   int focus_row = priv->focus_row;
 *   gboolean have_focus = FALSE;
 * 
 *   if (!gtk_widget_has_focus (widget))
 *     gtk_widget_grab_focus (widget);
 * 
 *   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, priv->focus_row);
 *   while (valid)
 *     {
 *       gtk_cell_area_apply_attributes (priv->area, priv->model, &iter, FALSE, FALSE);
 * 
 *       if (gtk_cell_area_focus (priv->area, direction))
 *         {
 *            priv->focus_row = focus_row;
 *            have_focus = TRUE;
 *            break;
 *         }
 *       else
 *         {
 *           if (direction == GTK_DIR_RIGHT ||
 *               direction == GTK_DIR_LEFT)
 *             break;
 *           else if (direction == GTK_DIR_UP ||
 *                    direction == GTK_DIR_TAB_BACKWARD)
 *            {
 *               if (focus_row == 0)
 *                 break;
 *               else
 *                {
 *                   focus_row--;
 *                   valid = gtk_tree_model_iter_nth_child (priv->model, &iter, NULL, focus_row);
 *                }
 *             }
 *           else
 *             {
 *               if (focus_row == last_row)
 *                 break;
 *               else
 *                 {
 *                   focus_row++;
 *                   valid = gtk_tree_model_iter_next (priv->model, &iter);
 *                 }
 *             }
 *         }
 *     }
 *     return have_focus;
 * }
 * }</pre>
 * <p>
 * Note that the layouting widget is responsible for matching the
 * {@code GtkDirectionType} values to the way it lays out its cells.
 * <p>
 * <strong>Cell Properties</strong><br/>
 * The {@code GtkCellArea} introduces cell properties for {@code GtkCellRenderer}s.
 * This provides some general interfaces for defining the relationship
 * cell areas have with their cells. For instance in a {@link CellAreaBox}
 * a cell might “expand” and receive extra space when the area is allocated
 * more than its full natural request, or a cell might be configured to “align”
 * with adjacent rows which were requested and rendered with the same
 * {@code GtkCellAreaContext}.
 * <p>
 * Use {@link CellAreaClass#installCellProperty} to install cell
 * properties for a cell area class and {@link CellAreaClass#findCellProperty}
 * or {@link CellAreaClass#listCellProperties} to get information about
 * existing cell properties.
 * <p>
 * To set the value of a cell property, use {@link CellArea#cellSetProperty},
 * {@link CellArea#cellSet} or {@link CellArea#cellSetValist}. To obtain
 * the value of a cell property, use {@link CellArea#cellGetProperty}
 * {@link CellArea#cellGet} or {@link CellArea#cellGetValist}.
 */
public class CellArea extends org.gtk.gobject.InitiallyUnowned implements org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellArea";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnowned.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a CellArea proxy instance for the provided memory address.
     * <p>
     * Because CellArea is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellArea(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to CellArea if its GType is a (or inherits from) "GtkCellArea".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellArea} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellArea", a ClassCastException will be thrown.
     */
    public static CellArea castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CellArea.getType())) {
            return new CellArea(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellArea");
        }
    }
    
    /**
     * Activates {@code area}, usually by activating the currently focused
     * cell, however some subclasses which embed widgets in the area
     * can also activate a widget if it currently has the focus.
     * @param context the {@code GtkCellArea}Context in context with the current row data
     * @param widget the {@code GtkWidget} that {@code area} is rendering on
     * @param cellArea the size and location of {@code area} relative to {@code widget}’s allocation
     * @param flags the {@code GtkCellRenderer}State flags for {@code area} for this row of data.
     * @param editOnly if {@code true} then only cell renderers that are {@link CellRendererMode#EDITABLE}
     *             will be activated.
     * @return Whether {@code area} was successfully activated.
     */
    public boolean activate(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gtk.CellRendererState flags, boolean editOnly) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_activate.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    cellArea.handle(),
                    flags.getValue(),
                    editOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This is used by {@code GtkCellArea} subclasses when handling events
     * to activate cells, the base {@code GtkCellArea} class activates cells
     * for keyboard events for free in its own GtkCellArea-&gt;activate()
     * implementation.
     * @param widget the {@code GtkWidget} that {@code area} is rendering onto
     * @param renderer the {@code GtkCellRenderer} in {@code area} to activate
     * @param event the {@code GdkEvent} for which cell activation should occur
     * @param cellArea the {@code GdkRectangle} in {@code widget} relative coordinates
     *             of {@code renderer} for the current row.
     * @param flags the {@code GtkCellRenderer}State for {@code renderer}
     * @return whether cell activation was successful
     */
    public boolean activateCell(@NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gdk.Event event, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gtk.CellRendererState flags) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_activate_cell.invokeExact(
                    handle(),
                    widget.handle(),
                    renderer.handle(),
                    event.handle(),
                    cellArea.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Adds {@code renderer} to {@code area} with the default child cell properties.
     * @param renderer the {@code GtkCellRenderer} to add to {@code area}
     */
    public void add(@NotNull org.gtk.gtk.CellRenderer renderer) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        try {
            DowncallHandles.gtk_cell_area_add.invokeExact(
                    handle(),
                    renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code sibling} to {@code renderer}’s focusable area, focus will be drawn
     * around {@code renderer} and all of its siblings if {@code renderer} can
     * focus for a given row.
     * <p>
     * Events handled by focus siblings can also activate the given
     * focusable {@code renderer}.
     * @param renderer the {@code GtkCellRenderer} expected to have focus
     * @param sibling the {@code GtkCellRenderer} to add to {@code renderer}’s focus area
     */
    public void addFocusSibling(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.CellRenderer sibling) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        try {
            DowncallHandles.gtk_cell_area_add_focus_sibling.invokeExact(
                    handle(),
                    renderer.handle(),
                    sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code renderer} to {@code area}, setting cell properties at the same time.
     * See gtk_cell_area_add() and gtk_cell_area_cell_set() for more details.
     * @param renderer a {@code GtkCellRenderer} to be placed inside {@code area}
     * @param firstPropName the name of the first cell property to set
     * @param varargs a {@code null}-terminated list of property names and values, starting
     *     with {@code first_prop_name}
     */
    public void addWithProperties(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String firstPropName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(firstPropName, "Parameter 'firstPropName' must not be null");
        try {
            DowncallHandles.gtk_cell_area_add_with_properties.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(firstPropName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Applies any connected attributes to the renderers in
     * {@code area} by pulling the values from {@code tree_model}.
     * @param treeModel the {@code GtkTreeModel} to pull values from
     * @param iter the {@code GtkTreeIter} in {@code tree_model} to apply values for
     * @param isExpander whether {@code iter} has children
     * @param isExpanded whether {@code iter} is expanded in the view and
     *               children are visible
     */
    public void applyAttributes(@NotNull org.gtk.gtk.TreeModel treeModel, @NotNull org.gtk.gtk.TreeIter iter, boolean isExpander, boolean isExpanded) {
        java.util.Objects.requireNonNull(treeModel, "Parameter 'treeModel' must not be null");
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_cell_area_apply_attributes.invokeExact(
                    handle(),
                    treeModel.handle(),
                    iter.handle(),
                    isExpander ? 1 : 0,
                    isExpanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects an {@code attribute} to apply values from {@code column} for the
     * {@code GtkTreeModel} in use.
     * @param renderer the {@code GtkCellRenderer} to connect an attribute for
     * @param attribute the attribute name
     * @param column the {@code GtkTreeModel} column to fetch attribute values from
     */
    public void attributeConnect(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String attribute, int column) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        try {
            DowncallHandles.gtk_cell_area_attribute_connect.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(attribute),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Disconnects {@code attribute} for the {@code renderer} in {@code area} so that
     * attribute will no longer be updated with values from the
     * model.
     * @param renderer the {@code GtkCellRenderer} to disconnect an attribute for
     * @param attribute the attribute name
     */
    public void attributeDisconnect(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String attribute) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        try {
            DowncallHandles.gtk_cell_area_attribute_disconnect.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(attribute));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the model column that an attribute has been mapped to,
     * or -1 if the attribute is not mapped.
     * @param renderer a {@code GtkCellRenderer}
     * @param attribute an attribute on the renderer
     * @return the model column, or -1
     */
    public int attributeGetColumn(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String attribute) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(attribute, "Parameter 'attribute' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_attribute_get_column.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(attribute));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the values of one or more cell properties for {@code renderer} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} which is inside {@code area}
     * @param firstPropName the name of the first cell property to get
     * @param varargs return location for the first cell property, followed
     *     optionally by more name/return location pairs, followed by {@code null}
     */
    public void cellGet(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String firstPropName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(firstPropName, "Parameter 'firstPropName' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_get.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(firstPropName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value of a cell property for {@code renderer} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} inside {@code area}
     * @param propertyName the name of the property to get
     * @param value a location to return the value
     */
    public void cellGetProperty(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String propertyName, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_get_property.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(propertyName),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the values of one or more cell properties for {@code renderer} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} inside {@code area}
     * @param firstPropertyName the name of the first property to get
     * @param varArgs return location for the first property, followed
     *     optionally by more name/return location pairs, followed by {@code null}
     */
    public void cellGetValist(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_get_valist.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets one or more cell properties for {@code cell} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} which is a cell inside {@code area}
     * @param firstPropName the name of the first cell property to set
     * @param varargs a {@code null}-terminated list of property names and values, starting
     *           with {@code first_prop_name}
     */
    public void cellSet(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String firstPropName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(firstPropName, "Parameter 'firstPropName' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_set.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(firstPropName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a cell property for {@code renderer} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} inside {@code area}
     * @param propertyName the name of the cell property to set
     * @param value the value to set the cell property to
     */
    public void cellSetProperty(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String propertyName, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_set_property.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(propertyName),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets one or more cell properties for {@code renderer} in {@code area}.
     * @param renderer a {@code GtkCellRenderer} which inside {@code area}
     * @param firstPropertyName the name of the first cell property to set
     * @param varArgs a {@code null}-terminated list of property names and values, starting
     *           with {@code first_prop_name}
     */
    public void cellSetValist(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gtk_cell_area_cell_set_valist.invokeExact(
                    handle(),
                    renderer.handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is sometimes needed for cases where rows need to share
     * alignments in one orientation but may be separately grouped
     * in the opposing orientation.
     * <p>
     * For instance, {@code GtkIconView} creates all icons (rows) to have
     * the same width and the cells theirin to have the same
     * horizontal alignments. However each row of icons may have
     * a separate collective height. {@code GtkIconView} uses this to
     * request the heights of each row based on a context which
     * was already used to request all the row widths that are
     * to be displayed.
     * @param context the {@code GtkCellArea}Context to copy
     * @return a newly created {@code GtkCellArea}Context copy of {@code context}.
     */
    public @NotNull org.gtk.gtk.CellAreaContext copyContext(@NotNull org.gtk.gtk.CellAreaContext context) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_copy_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellAreaContext(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a {@code GtkCellArea}Context to be used with {@code area} for
     * all purposes. {@code GtkCellArea}Context stores geometry information
     * for rows for which it was operated on, it is important to use
     * the same context for the same row of data at all times (i.e.
     * one should render and handle events with the same {@code GtkCellArea}Context
     * which was used to request the size of those rows of data).
     * @return a newly created {@code GtkCellArea}Context which can be used with {@code area}.
     */
    public @NotNull org.gtk.gtk.CellAreaContext createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_create_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellAreaContext(RESULT, Ownership.FULL);
    }
    
    /**
     * Delegates event handling to a {@code GtkCellArea}.
     * @param context the {@code GtkCellArea}Context for this row of data.
     * @param widget the {@code GtkWidget} that {@code area} is rendering to
     * @param event the {@code GdkEvent} to handle
     * @param cellArea the {@code widget} relative coordinates for {@code area}
     * @param flags the {@code GtkCellRenderer}State for {@code area} in this row.
     * @return {@code true} if the event was handled by {@code area}.
     */
    public int event(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Event event, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gtk.CellRendererState flags) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_event.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    event.handle(),
                    cellArea.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This should be called by the {@code area}’s owning layout widget
     * when focus is to be passed to {@code area}, or moved within {@code area}
     * for a given {@code direction} and row data.
     * <p>
     * Implementing {@code GtkCellArea} classes should implement this
     * method to receive and navigate focus in its own way particular
     * to how it lays out cells.
     * @param direction the {@code GtkDirectionType}
     * @return {@code true} if focus remains inside {@code area} as a result of this call.
     */
    public boolean focus(@NotNull org.gtk.gtk.DirectionType direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_focus.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls {@code callback} for every {@code GtkCellRenderer} in {@code area}.
     * @param callback the {@code GtkCellCallback} to call
     */
    public void foreach(@NotNull org.gtk.gtk.CellCallback callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gtk_cell_area_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCellCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls {@code callback} for every {@code GtkCellRenderer} in {@code area} with the
     * allocated rectangle inside {@code cell_area}.
     * @param context the {@code GtkCellArea}Context for this row of data.
     * @param widget the {@code GtkWidget} that {@code area} is rendering to
     * @param cellArea the {@code widget} relative coordinates and size for {@code area}
     * @param backgroundArea the {@code widget} relative coordinates of the background area
     * @param callback the {@code GtkCellAllocCallback} to call
     */
    public void foreachAlloc(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gdk.Rectangle backgroundArea, @NotNull org.gtk.gtk.CellAllocCallback callback) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(backgroundArea, "Parameter 'backgroundArea' must not be null");
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        try {
            DowncallHandles.gtk_cell_area_foreach_alloc.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    cellArea.handle(),
                    backgroundArea.handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCellAllocCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Derives the allocation of {@code renderer} inside {@code area} if {@code area}
     * were to be renderered in {@code cell_area}.
     * @param context the {@code GtkCellArea}Context used to hold sizes for {@code area}.
     * @param widget the {@code GtkWidget} that {@code area} is rendering on
     * @param renderer the {@code GtkCellRenderer} to get the allocation for
     * @param cellArea the whole allocated area for {@code area} in {@code widget}
     *             for this row
     * @param allocation where to store the allocation for {@code renderer}
     */
    public void getCellAllocation(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gdk.Rectangle allocation) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(allocation, "Parameter 'allocation' must not be null");
        try {
            DowncallHandles.gtk_cell_area_get_cell_allocation.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    renderer.handle(),
                    cellArea.handle(),
                    allocation.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the {@code GtkCellRenderer} at {@code x} and {@code y} coordinates inside {@code area} and optionally
     * returns the full cell allocation for it inside {@code cell_area}.
     * @param context the {@code GtkCellArea}Context used to hold sizes for {@code area}.
     * @param widget the {@code GtkWidget} that {@code area} is rendering on
     * @param cellArea the whole allocated area for {@code area} in {@code widget}
     *   for this row
     * @param x the x position
     * @param y the y position
     * @param allocArea where to store the inner allocated area of the
     *   returned cell renderer
     * @return the {@code GtkCellRenderer} at {@code x} and {@code y}.
     */
    public @NotNull org.gtk.gtk.CellRenderer getCellAtPosition(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Rectangle cellArea, int x, int y, @NotNull org.gtk.gdk.Rectangle allocArea) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(allocArea, "Parameter 'allocArea' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_cell_at_position.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    cellArea.handle(),
                    x,
                    y,
                    allocArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellRenderer(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current {@code GtkTreePath} string for the currently
     * applied {@code GtkTreeIter}, this is implicitly updated when
     * gtk_cell_area_apply_attributes() is called and can be
     * used to interact with renderers from {@code GtkCellArea}
     * subclasses.
     * @return The current {@code GtkTreePath} string for the current
     * attributes applied to {@code area}. This string belongs to the area and
     * should not be freed.
     */
    public @NotNull java.lang.String getCurrentPathString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_current_path_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the {@code GtkCellEditable} widget currently used
     * to edit the currently edited cell.
     * @return The currently active {@code GtkCellEditable} widget
     */
    public @Nullable org.gtk.gtk.CellEditable getEditWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_edit_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellEditable.CellEditableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GtkCellRenderer} in {@code area} that is currently
     * being edited.
     * @return The currently edited {@code GtkCellRenderer}
     */
    public @Nullable org.gtk.gtk.CellRenderer getEditedCell() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_edited_cell.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellRenderer(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the currently focused cell for {@code area}
     * @return the currently focused cell in {@code area}.
     */
    public @Nullable org.gtk.gtk.CellRenderer getFocusCell() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_focus_cell.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellRenderer(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GtkCellRenderer} which is expected to be focusable
     * for which {@code renderer} is, or may be a sibling.
     * <p>
     * This is handy for {@code GtkCellArea} subclasses when handling events,
     * after determining the renderer at the event location it can
     * then chose to activate the focus cell for which the event
     * cell may have been a sibling.
     * @param renderer the {@code GtkCellRenderer}
     * @return the {@code GtkCellRenderer}
     *   for which {@code renderer} is a sibling
     */
    public @Nullable org.gtk.gtk.CellRenderer getFocusFromSibling(@NotNull org.gtk.gtk.CellRenderer renderer) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_focus_from_sibling.invokeExact(
                    handle(),
                    renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.CellRenderer(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the focus sibling cell renderers for {@code renderer}.
     * @param renderer the {@code GtkCellRenderer} expected to have focus
     * @return A {@code GList} of {@code GtkCellRenderer}s.
     *       The returned list is internal and should not be freed.
     */
    public @NotNull org.gtk.glib.List getFocusSiblings(@NotNull org.gtk.gtk.CellRenderer renderer) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_get_focus_siblings.invokeExact(
                    handle(),
                    renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves a cell area’s initial minimum and natural height.
     * <p>
     * {@code area} will store some geometrical information in {@code context} along the way;
     * when requesting sizes over an arbitrary number of rows, it’s not important
     * to check the {@code minimum_height} and {@code natural_height} of this call but rather to
     * consult gtk_cell_area_context_get_preferred_height() after a series of
     * requests.
     * @param context the {@code GtkCellArea}Context to perform this request with
     * @param widget the {@code GtkWidget} where {@code area} will be rendering
     * @param minimumHeight location to store the minimum height
     * @param naturalHeight location to store the natural height
     */
    public void getPreferredHeight(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, Out<Integer> minimumHeight, Out<Integer> naturalHeight) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(minimumHeight, "Parameter 'minimumHeight' must not be null");
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_get_preferred_height.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a cell area’s minimum and natural height if it would be given
     * the specified {@code width}.
     * <p>
     * {@code area} stores some geometrical information in {@code context} along the way
     * while calling gtk_cell_area_get_preferred_width(). It’s important to
     * perform a series of gtk_cell_area_get_preferred_width() requests with
     * {@code context} first and then call gtk_cell_area_get_preferred_height_for_width()
     * on each cell area individually to get the height for width of each
     * fully requested row.
     * <p>
     * If at some point, the width of a single row changes, it should be
     * requested with gtk_cell_area_get_preferred_width() again and then
     * the full width of the requested rows checked again with
     * gtk_cell_area_context_get_preferred_width().
     * @param context the {@code GtkCellArea}Context which has already been requested for widths.
     * @param widget the {@code GtkWidget} where {@code area} will be rendering
     * @param width the width for which to check the height of this area
     * @param minimumHeight location to store the minimum height
     * @param naturalHeight location to store the natural height
     */
    public void getPreferredHeightForWidth(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(minimumHeight, "Parameter 'minimumHeight' must not be null");
        MemorySegment minimumHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalHeight, "Parameter 'naturalHeight' must not be null");
        MemorySegment naturalHeightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_get_preferred_height_for_width.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    width,
                    (Addressable) minimumHeightPOINTER.address(),
                    (Addressable) naturalHeightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumHeight.set(minimumHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalHeight.set(naturalHeightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a cell area’s initial minimum and natural width.
     * <p>
     * {@code area} will store some geometrical information in {@code context} along the way;
     * when requesting sizes over an arbitrary number of rows, it’s not important
     * to check the {@code minimum_width} and {@code natural_width} of this call but rather to
     * consult gtk_cell_area_context_get_preferred_width() after a series of
     * requests.
     * @param context the {@code GtkCellArea}Context to perform this request with
     * @param widget the {@code GtkWidget} where {@code area} will be rendering
     * @param minimumWidth location to store the minimum width
     * @param naturalWidth location to store the natural width
     */
    public void getPreferredWidth(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, Out<Integer> minimumWidth, Out<Integer> naturalWidth) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(minimumWidth, "Parameter 'minimumWidth' must not be null");
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_get_preferred_width.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Retrieves a cell area’s minimum and natural width if it would be given
     * the specified {@code height}.
     * <p>
     * {@code area} stores some geometrical information in {@code context} along the way
     * while calling gtk_cell_area_get_preferred_height(). It’s important to
     * perform a series of gtk_cell_area_get_preferred_height() requests with
     * {@code context} first and then call gtk_cell_area_get_preferred_width_for_height()
     * on each cell area individually to get the height for width of each
     * fully requested row.
     * <p>
     * If at some point, the height of a single row changes, it should be
     * requested with gtk_cell_area_get_preferred_height() again and then
     * the full height of the requested rows checked again with
     * gtk_cell_area_context_get_preferred_height().
     * @param context the {@code GtkCellArea}Context which has already been requested for widths.
     * @param widget the {@code GtkWidget} where {@code area} will be rendering
     * @param height the height for which to check the width of this area
     * @param minimumWidth location to store the minimum width
     * @param naturalWidth location to store the natural width
     */
    public void getPreferredWidthForHeight(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(minimumWidth, "Parameter 'minimumWidth' must not be null");
        MemorySegment minimumWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalWidth, "Parameter 'naturalWidth' must not be null");
        MemorySegment naturalWidthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_get_preferred_width_for_height.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    height,
                    (Addressable) minimumWidthPOINTER.address(),
                    (Addressable) naturalWidthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumWidth.set(minimumWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalWidth.set(naturalWidthPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Gets whether the area prefers a height-for-width layout
     * or a width-for-height layout.
     * @return The {@code GtkSizeRequestMode} preferred by {@code area}.
     */
    public @NotNull org.gtk.gtk.SizeRequestMode getRequestMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_get_request_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.SizeRequestMode.of(RESULT);
    }
    
    /**
     * Checks if {@code area} contains {@code renderer}.
     * @param renderer the {@code GtkCellRenderer} to check
     * @return {@code true} if {@code renderer} is in the {@code area}.
     */
    public boolean hasRenderer(@NotNull org.gtk.gtk.CellRenderer renderer) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_has_renderer.invokeExact(
                    handle(),
                    renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * This is a convenience function for {@code GtkCellArea} implementations
     * to get the inner area where a given {@code GtkCellRenderer} will be
     * rendered. It removes any padding previously added by gtk_cell_area_request_renderer().
     * @param widget the {@code GtkWidget} that {@code area} is rendering onto
     * @param cellArea the {@code widget} relative coordinates where one of {@code area}’s cells
     *             is to be placed
     * @param innerArea the return location for the inner cell area
     */
    public void innerCellArea(@NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gdk.Rectangle innerArea) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(innerArea, "Parameter 'innerArea' must not be null");
        try {
            DowncallHandles.gtk_cell_area_inner_cell_area.invokeExact(
                    handle(),
                    widget.handle(),
                    cellArea.handle(),
                    innerArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the area can do anything when activated,
     * after applying new attributes to {@code area}.
     * @return whether {@code area} can do anything when activated.
     */
    public boolean isActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_is_activatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code sibling} is one of {@code renderer}’s focus siblings
     * (see gtk_cell_area_add_focus_sibling()).
     * @param renderer the {@code GtkCellRenderer} expected to have focus
     * @param sibling the {@code GtkCellRenderer} to check against {@code renderer}’s sibling list
     * @return {@code true} if {@code sibling} is a focus sibling of {@code renderer}
     */
    public boolean isFocusSibling(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.CellRenderer sibling) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_is_focus_sibling.invokeExact(
                    handle(),
                    renderer.handle(),
                    sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes {@code renderer} from {@code area}.
     * @param renderer the {@code GtkCellRenderer} to remove from {@code area}
     */
    public void remove(@NotNull org.gtk.gtk.CellRenderer renderer) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        try {
            DowncallHandles.gtk_cell_area_remove.invokeExact(
                    handle(),
                    renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code sibling} from {@code renderer}’s focus sibling list
     * (see gtk_cell_area_add_focus_sibling()).
     * @param renderer the {@code GtkCellRenderer} expected to have focus
     * @param sibling the {@code GtkCellRenderer} to remove from {@code renderer}’s focus area
     */
    public void removeFocusSibling(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.CellRenderer sibling) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        try {
            DowncallHandles.gtk_cell_area_remove_focus_sibling.invokeExact(
                    handle(),
                    renderer.handle(),
                    sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is a convenience function for {@code GtkCellArea} implementations
     * to request size for cell renderers. It’s important to use this
     * function to request size and then use gtk_cell_area_inner_cell_area()
     * at render and event time since this function will add padding
     * around the cell for focus painting.
     * @param renderer the {@code GtkCellRenderer} to request size for
     * @param orientation the {@code GtkOrientation} in which to request size
     * @param widget the {@code GtkWidget} that {@code area} is rendering onto
     * @param forSize the allocation contextual size to request for, or -1 if
     * the base request for the orientation is to be returned.
     * @param minimumSize location to store the minimum size
     * @param naturalSize location to store the natural size
     */
    public void requestRenderer(@NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.Orientation orientation, @NotNull org.gtk.gtk.Widget widget, int forSize, Out<Integer> minimumSize, Out<Integer> naturalSize) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(minimumSize, "Parameter 'minimumSize' must not be null");
        MemorySegment minimumSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(naturalSize, "Parameter 'naturalSize' must not be null");
        MemorySegment naturalSizePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_cell_area_request_renderer.invokeExact(
                    handle(),
                    renderer.handle(),
                    orientation.getValue(),
                    widget.handle(),
                    forSize,
                    (Addressable) minimumSizePOINTER.address(),
                    (Addressable) naturalSizePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        minimumSize.set(minimumSizePOINTER.get(Interop.valueLayout.C_INT, 0));
        naturalSize.set(naturalSizePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Explicitly sets the currently focused cell to {@code renderer}.
     * <p>
     * This is generally called by implementations of
     * {@code GtkCellAreaClass.focus()} or {@code GtkCellAreaClass.event()},
     * however it can also be used to implement functions such
     * as gtk_tree_view_set_cursor_on_cell().
     * @param renderer the {@code GtkCellRenderer} to give focus to
     */
    public void setFocusCell(@Nullable org.gtk.gtk.CellRenderer renderer) {
        try {
            DowncallHandles.gtk_cell_area_set_focus_cell.invokeExact(
                    handle(),
                    (Addressable) (renderer == null ? MemoryAddress.NULL : renderer.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Snapshots {@code area}’s cells according to {@code area}’s layout onto at
     * the given coordinates.
     * @param context the {@code GtkCellArea}Context for this row of data.
     * @param widget the {@code GtkWidget} that {@code area} is rendering to
     * @param snapshot the {@code GtkSnapshot} to draw to
     * @param backgroundArea the {@code widget} relative coordinates for {@code area}’s background
     * @param cellArea the {@code widget} relative coordinates for {@code area}
     * @param flags the {@code GtkCellRenderer}State for {@code area} in this row.
     * @param paintFocus whether {@code area} should paint focus on focused cells for focused rows or not.
     */
    public void snapshot(@NotNull org.gtk.gtk.CellAreaContext context, @NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.Snapshot snapshot, @NotNull org.gtk.gdk.Rectangle backgroundArea, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gtk.CellRendererState flags, boolean paintFocus) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(snapshot, "Parameter 'snapshot' must not be null");
        java.util.Objects.requireNonNull(backgroundArea, "Parameter 'backgroundArea' must not be null");
        java.util.Objects.requireNonNull(cellArea, "Parameter 'cellArea' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.gtk_cell_area_snapshot.invokeExact(
                    handle(),
                    context.handle(),
                    widget.handle(),
                    snapshot.handle(),
                    backgroundArea.handle(),
                    cellArea.handle(),
                    flags.getValue(),
                    paintFocus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Explicitly stops the editing of the currently edited cell.
     * <p>
     * If {@code canceled} is {@code true}, the currently edited cell renderer
     * will emit the ::editing-canceled signal, otherwise the
     * the ::editing-done signal will be emitted on the current
     * edit widget.
     * <p>
     * See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
     * @param canceled whether editing was canceled.
     */
    public void stopEditing(boolean canceled) {
        try {
            DowncallHandles.gtk_cell_area_stop_editing.invokeExact(
                    handle(),
                    canceled ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_cell_area_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AddEditable {
        void signalReceived(CellArea sourceCellArea, @NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.CellEditable editable, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull java.lang.String path);
    }
    
    /**
     * Indicates that editing has started on {@code renderer} and that {@code editable}
     * should be added to the owning cell-layouting widget at {@code cell_area}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellArea.AddEditable> onAddEditable(CellArea.AddEditable handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("add-editable"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaAddEditable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellArea.AddEditable>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplyAttributes {
        void signalReceived(CellArea sourceCellArea, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter iter, boolean isExpander, boolean isExpanded);
    }
    
    /**
     * This signal is emitted whenever applying attributes to {@code area} from {@code model}
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellArea.ApplyAttributes> onApplyAttributes(CellArea.ApplyAttributes handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply-attributes"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaApplyAttributes",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellArea.ApplyAttributes>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FocusChanged {
        void signalReceived(CellArea sourceCellArea, @NotNull org.gtk.gtk.CellRenderer renderer, @NotNull java.lang.String path);
    }
    
    /**
     * Indicates that focus changed on this {@code area}. This signal
     * is emitted either as a result of focus handling or event
     * handling.
     * <p>
     * It's possible that the signal is emitted even if the
     * currently focused renderer did not change, this is
     * because focus may change to the same renderer in the
     * same cell area for a different row of data.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellArea.FocusChanged> onFocusChanged(CellArea.FocusChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("focus-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaFocusChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellArea.FocusChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveEditable {
        void signalReceived(CellArea sourceCellArea, @NotNull org.gtk.gtk.CellRenderer renderer, @NotNull org.gtk.gtk.CellEditable editable);
    }
    
    /**
     * Indicates that editing finished on {@code renderer} and that {@code editable}
     * should be removed from the owning cell-layouting widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellArea.RemoveEditable> onRemoveEditable(CellArea.RemoveEditable handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-editable"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaRemoveEditable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellArea.RemoveEditable>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.InitiallyUnowned.Build {
        
         /**
         * A {@link CellArea.Build} object constructs a {@link CellArea} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellArea} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellArea} using {@link CellArea#castFrom}.
         * @return A new instance of {@code CellArea} with the properties 
         *         that were set in the Build object.
         */
        public CellArea construct() {
            return CellArea.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellArea.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The widget currently editing the edited cell
         * <p>
         * This property is read-only and only changes as
         * a result of a call gtk_cell_area_activate_cell().
         * @param editWidget The value for the {@code edit-widget} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEditWidget(org.gtk.gtk.CellEditable editWidget) {
            names.add("edit-widget");
            values.add(org.gtk.gobject.Value.create(editWidget));
            return this;
        }
        
        /**
         * The cell in the area that is currently edited
         * <p>
         * This property is read-only and only changes as
         * a result of a call gtk_cell_area_activate_cell().
         * @param editedCell The value for the {@code edited-cell} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEditedCell(org.gtk.gtk.CellRenderer editedCell) {
            names.add("edited-cell");
            values.add(org.gtk.gobject.Value.create(editedCell));
            return this;
        }
        
        /**
         * The cell in the area that currently has focus
         * @param focusCell The value for the {@code focus-cell} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFocusCell(org.gtk.gtk.CellRenderer focusCell) {
            names.add("focus-cell");
            values.add(org.gtk.gobject.Value.create(focusCell));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_activate = Interop.downcallHandle(
            "gtk_cell_area_activate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_activate_cell = Interop.downcallHandle(
            "gtk_cell_area_activate_cell",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_add = Interop.downcallHandle(
            "gtk_cell_area_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_add_focus_sibling = Interop.downcallHandle(
            "gtk_cell_area_add_focus_sibling",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_add_with_properties = Interop.downcallHandle(
            "gtk_cell_area_add_with_properties",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_cell_area_apply_attributes = Interop.downcallHandle(
            "gtk_cell_area_apply_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_attribute_connect = Interop.downcallHandle(
            "gtk_cell_area_attribute_connect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_attribute_disconnect = Interop.downcallHandle(
            "gtk_cell_area_attribute_disconnect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_attribute_get_column = Interop.downcallHandle(
            "gtk_cell_area_attribute_get_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_cell_get = Interop.downcallHandle(
            "gtk_cell_area_cell_get",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_cell_area_cell_get_property = Interop.downcallHandle(
            "gtk_cell_area_cell_get_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_cell_get_valist = Interop.downcallHandle(
            "gtk_cell_area_cell_get_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_cell_set = Interop.downcallHandle(
            "gtk_cell_area_cell_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_cell_area_cell_set_property = Interop.downcallHandle(
            "gtk_cell_area_cell_set_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_cell_set_valist = Interop.downcallHandle(
            "gtk_cell_area_cell_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_copy_context = Interop.downcallHandle(
            "gtk_cell_area_copy_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_create_context = Interop.downcallHandle(
            "gtk_cell_area_create_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_event = Interop.downcallHandle(
            "gtk_cell_area_event",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_focus = Interop.downcallHandle(
            "gtk_cell_area_focus",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_foreach = Interop.downcallHandle(
            "gtk_cell_area_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_foreach_alloc = Interop.downcallHandle(
            "gtk_cell_area_foreach_alloc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_cell_allocation = Interop.downcallHandle(
            "gtk_cell_area_get_cell_allocation",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_cell_at_position = Interop.downcallHandle(
            "gtk_cell_area_get_cell_at_position",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_current_path_string = Interop.downcallHandle(
            "gtk_cell_area_get_current_path_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_edit_widget = Interop.downcallHandle(
            "gtk_cell_area_get_edit_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_edited_cell = Interop.downcallHandle(
            "gtk_cell_area_get_edited_cell",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_focus_cell = Interop.downcallHandle(
            "gtk_cell_area_get_focus_cell",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_focus_from_sibling = Interop.downcallHandle(
            "gtk_cell_area_get_focus_from_sibling",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_focus_siblings = Interop.downcallHandle(
            "gtk_cell_area_get_focus_siblings",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_preferred_height = Interop.downcallHandle(
            "gtk_cell_area_get_preferred_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_preferred_height_for_width = Interop.downcallHandle(
            "gtk_cell_area_get_preferred_height_for_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_preferred_width = Interop.downcallHandle(
            "gtk_cell_area_get_preferred_width",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_preferred_width_for_height = Interop.downcallHandle(
            "gtk_cell_area_get_preferred_width_for_height",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_request_mode = Interop.downcallHandle(
            "gtk_cell_area_get_request_mode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_has_renderer = Interop.downcallHandle(
            "gtk_cell_area_has_renderer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_inner_cell_area = Interop.downcallHandle(
            "gtk_cell_area_inner_cell_area",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_is_activatable = Interop.downcallHandle(
            "gtk_cell_area_is_activatable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_is_focus_sibling = Interop.downcallHandle(
            "gtk_cell_area_is_focus_sibling",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_remove = Interop.downcallHandle(
            "gtk_cell_area_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_remove_focus_sibling = Interop.downcallHandle(
            "gtk_cell_area_remove_focus_sibling",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_request_renderer = Interop.downcallHandle(
            "gtk_cell_area_request_renderer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_set_focus_cell = Interop.downcallHandle(
            "gtk_cell_area_set_focus_cell",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_snapshot = Interop.downcallHandle(
            "gtk_cell_area_snapshot",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_stop_editing = Interop.downcallHandle(
            "gtk_cell_area_stop_editing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_get_type = Interop.downcallHandle(
            "gtk_cell_area_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalCellAreaAddEditable(MemoryAddress sourceCellArea, MemoryAddress renderer, MemoryAddress editable, MemoryAddress cellArea, MemoryAddress path, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellArea.AddEditable) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellArea(sourceCellArea, Ownership.NONE), new org.gtk.gtk.CellRenderer(renderer, Ownership.NONE), new org.gtk.gtk.CellEditable.CellEditableImpl(editable, Ownership.NONE), new org.gtk.gdk.Rectangle(cellArea, Ownership.NONE), Interop.getStringFrom(path));
        }
        
        public static void signalCellAreaApplyAttributes(MemoryAddress sourceCellArea, MemoryAddress model, MemoryAddress iter, int isExpander, int isExpanded, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellArea.ApplyAttributes) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellArea(sourceCellArea, Ownership.NONE), new org.gtk.gtk.TreeModel.TreeModelImpl(model, Ownership.NONE), new org.gtk.gtk.TreeIter(iter, Ownership.NONE), isExpander != 0, isExpanded != 0);
        }
        
        public static void signalCellAreaFocusChanged(MemoryAddress sourceCellArea, MemoryAddress renderer, MemoryAddress path, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellArea.FocusChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellArea(sourceCellArea, Ownership.NONE), new org.gtk.gtk.CellRenderer(renderer, Ownership.NONE), Interop.getStringFrom(path));
        }
        
        public static void signalCellAreaRemoveEditable(MemoryAddress sourceCellArea, MemoryAddress renderer, MemoryAddress editable, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellArea.RemoveEditable) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellArea(sourceCellArea, Ownership.NONE), new org.gtk.gtk.CellRenderer(renderer, Ownership.NONE), new org.gtk.gtk.CellEditable.CellEditableImpl(editable, Ownership.NONE));
        }
    }
}
