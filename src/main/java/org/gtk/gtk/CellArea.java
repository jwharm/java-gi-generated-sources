package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>Requesting area sizes</h1>
 * <p>
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
 * <p>
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
 * idle or timeout source (see {@link GLib#timeoutAdd}) and when the widget
 * is requested its actual width in {@link Widget#measure}
 * it can simply consult the width accumulated so far in the
 * {@code GtkCellAreaContext} object.
 * <p>
 * A simple example where rows are rendered from top to bottom and
 * take up the full width of the layouting widget would look like:
 * <p>
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
 * <p>
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
 * <h1>Rendering Areas</h1>
 * <p>
 * Once area sizes have been acquired at least for the rows in the
 * visible area of the layouting widget they can be rendered at
 * {@link Widget#snapshot} time.
 * <p>
 * A crude example of how to render all the rows at the root level
 * runs as follows:
 * <p>
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
 * <h1>Handling Events and Driving Keyboard Focus</h1>
 * <p>
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
 * {@link Widget#focus} virtual method. The layouting widget is always
 * responsible for knowing where {@code GtkTreeModel} rows are rendered inside
 * the widget, so at {@link Widget#focus} time the layouting widget
 * should use the {@code GtkCellArea} methods to navigate focus inside the area
 * and then observe the {@code Gtk.DirectionType} to pass the focus to adjacent
 * rows and areas.
 * <p>
 * A basic example of how the {@link Widget#focus} virtual method
 * should be implemented:
 * <p>
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
 * <h1>Cell Properties</h1>
 * <p>
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
 * {@code Gtk.CellArea.cell_set_valist}. To obtain
 * the value of a cell property, use {@link CellArea#cellGetProperty}
 * {@code Gtk.CellArea.cell_get_valist}.
 */
public class CellArea extends org.gtk.gobject.InitiallyUnowned implements Buildable, CellLayout {

    public CellArea(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellArea */
    public static CellArea castFrom(org.gtk.gobject.Object gobject) {
        return new CellArea(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_area_activate = Interop.downcallHandle(
        "gtk_cell_area_activate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Activates {@code area}, usually by activating the currently focused
     * cell, however some subclasses which embed widgets in the area
     * can also activate a widget if it currently has the focus.
     */
    public boolean activate(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, CellRendererState flags, boolean editOnly) {
        try {
            var RESULT = (int) gtk_cell_area_activate.invokeExact(handle(), context.handle(), widget.handle(), cellArea.handle(), flags.getValue(), editOnly ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_activate_cell = Interop.downcallHandle(
        "gtk_cell_area_activate_cell",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This is used by {@code GtkCellArea} subclasses when handling events
     * to activate cells, the base {@code GtkCellArea} class activates cells
     * for keyboard events for free in its own GtkCellArea->activate()
     * implementation.
     */
    public boolean activateCell(Widget widget, CellRenderer renderer, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, CellRendererState flags) {
        try {
            var RESULT = (int) gtk_cell_area_activate_cell.invokeExact(handle(), widget.handle(), renderer.handle(), event.handle(), cellArea.handle(), flags.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_add = Interop.downcallHandle(
        "gtk_cell_area_add",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code renderer} to {@code area} with the default child cell properties.
     */
    public void add(CellRenderer renderer) {
        try {
            gtk_cell_area_add.invokeExact(handle(), renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_add_focus_sibling = Interop.downcallHandle(
        "gtk_cell_area_add_focus_sibling",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code sibling} to {@code renderer}’s focusable area, focus will be drawn
     * around {@code renderer} and all of its siblings if {@code renderer} can
     * focus for a given row.
     * <p>
     * Events handled by focus siblings can also activate the given
     * focusable {@code renderer}.
     */
    public void addFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        try {
            gtk_cell_area_add_focus_sibling.invokeExact(handle(), renderer.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_apply_attributes = Interop.downcallHandle(
        "gtk_cell_area_apply_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Applies any connected attributes to the renderers in
     * {@code area} by pulling the values from {@code tree_model}.
     */
    public void applyAttributes(TreeModel treeModel, TreeIter iter, boolean isExpander, boolean isExpanded) {
        try {
            gtk_cell_area_apply_attributes.invokeExact(handle(), treeModel.handle(), iter.handle(), isExpander ? 1 : 0, isExpanded ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_attribute_connect = Interop.downcallHandle(
        "gtk_cell_area_attribute_connect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects an {@code attribute} to apply values from {@code column} for the
     * {@code GtkTreeModel} in use.
     */
    public void attributeConnect(CellRenderer renderer, java.lang.String attribute, int column) {
        try {
            gtk_cell_area_attribute_connect.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_attribute_disconnect = Interop.downcallHandle(
        "gtk_cell_area_attribute_disconnect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Disconnects {@code attribute} for the {@code renderer} in {@code area} so that
     * attribute will no longer be updated with values from the
     * model.
     */
    public void attributeDisconnect(CellRenderer renderer, java.lang.String attribute) {
        try {
            gtk_cell_area_attribute_disconnect.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_attribute_get_column = Interop.downcallHandle(
        "gtk_cell_area_attribute_get_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model column that an attribute has been mapped to,
     * or -1 if the attribute is not mapped.
     */
    public int attributeGetColumn(CellRenderer renderer, java.lang.String attribute) {
        try {
            var RESULT = (int) gtk_cell_area_attribute_get_column.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_cell_get_property = Interop.downcallHandle(
        "gtk_cell_area_cell_get_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a cell property for {@code renderer} in {@code area}.
     */
    public void cellGetProperty(CellRenderer renderer, java.lang.String propertyName, org.gtk.gobject.Value value) {
        try {
            gtk_cell_area_cell_get_property.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_cell_get_valist = Interop.downcallHandle(
        "gtk_cell_area_cell_get_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the values of one or more cell properties for {@code renderer} in {@code area}.
     */
    public void cellGetValist(CellRenderer renderer, java.lang.String firstPropertyName, VaList varArgs) {
        try {
            gtk_cell_area_cell_get_valist.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_cell_set_property = Interop.downcallHandle(
        "gtk_cell_area_cell_set_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a cell property for {@code renderer} in {@code area}.
     */
    public void cellSetProperty(CellRenderer renderer, java.lang.String propertyName, org.gtk.gobject.Value value) {
        try {
            gtk_cell_area_cell_set_property.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_cell_set_valist = Interop.downcallHandle(
        "gtk_cell_area_cell_set_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets one or more cell properties for {@code renderer} in {@code area}.
     */
    public void cellSetValist(CellRenderer renderer, java.lang.String firstPropertyName, VaList varArgs) {
        try {
            gtk_cell_area_cell_set_valist.invokeExact(handle(), renderer.handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_copy_context = Interop.downcallHandle(
        "gtk_cell_area_copy_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public CellAreaContext copyContext(CellAreaContext context) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_copy_context.invokeExact(handle(), context.handle());
            return new CellAreaContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_create_context = Interop.downcallHandle(
        "gtk_cell_area_create_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code GtkCellArea}Context to be used with {@code area} for
     * all purposes. {@code GtkCellArea}Context stores geometry information
     * for rows for which it was operated on, it is important to use
     * the same context for the same row of data at all times (i.e.
     * one should render and handle events with the same {@code GtkCellArea}Context
     * which was used to request the size of those rows of data).
     */
    public CellAreaContext createContext() {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_create_context.invokeExact(handle());
            return new CellAreaContext(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_event = Interop.downcallHandle(
        "gtk_cell_area_event",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Delegates event handling to a {@code GtkCellArea}.
     */
    public int event(CellAreaContext context, Widget widget, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, CellRendererState flags) {
        try {
            var RESULT = (int) gtk_cell_area_event.invokeExact(handle(), context.handle(), widget.handle(), event.handle(), cellArea.handle(), flags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_focus = Interop.downcallHandle(
        "gtk_cell_area_focus",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * This should be called by the {@code area}’s owning layout widget
     * when focus is to be passed to {@code area}, or moved within {@code area}
     * for a given {@code direction} and row data.
     * <p>
     * Implementing {@code GtkCellArea} classes should implement this
     * method to receive and navigate focus in its own way particular
     * to how it lays out cells.
     */
    public boolean focus(DirectionType direction) {
        try {
            var RESULT = (int) gtk_cell_area_focus.invokeExact(handle(), direction.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_foreach = Interop.downcallHandle(
        "gtk_cell_area_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code callback} for every {@code GtkCellRenderer} in {@code area}.
     */
    public void foreach(CellCallback callback) {
        try {
            gtk_cell_area_foreach.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCellCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_foreach_alloc = Interop.downcallHandle(
        "gtk_cell_area_foreach_alloc",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls {@code callback} for every {@code GtkCellRenderer} in {@code area} with the
     * allocated rectangle inside {@code cell_area}.
     */
    public void foreachAlloc(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle backgroundArea, CellAllocCallback callback) {
        try {
            gtk_cell_area_foreach_alloc.invokeExact(handle(), context.handle(), widget.handle(), cellArea.handle(), backgroundArea.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCellAllocCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_cell_allocation = Interop.downcallHandle(
        "gtk_cell_area_get_cell_allocation",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Derives the allocation of {@code renderer} inside {@code area} if {@code area}
     * were to be renderered in {@code cell_area}.
     */
    public void getCellAllocation(CellAreaContext context, Widget widget, CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle allocation) {
        try {
            gtk_cell_area_get_cell_allocation.invokeExact(handle(), context.handle(), widget.handle(), renderer.handle(), cellArea.handle(), allocation.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_cell_at_position = Interop.downcallHandle(
        "gtk_cell_area_get_cell_at_position",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkCellRenderer} at @x and @y coordinates inside {@code area} and optionally
     * returns the full cell allocation for it inside {@code cell_area}.
     */
    public CellRenderer getCellAtPosition(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, int x, int y, org.gtk.gdk.Rectangle allocArea) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_cell_at_position.invokeExact(handle(), context.handle(), widget.handle(), cellArea.handle(), x, y, allocArea.handle());
            return new CellRenderer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_current_path_string = Interop.downcallHandle(
        "gtk_cell_area_get_current_path_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current {@code GtkTreePath} string for the currently
     * applied {@code GtkTreeIter}, this is implicitly updated when
     * gtk_cell_area_apply_attributes() is called and can be
     * used to interact with renderers from {@code GtkCellArea}
     * subclasses.
     */
    public java.lang.String getCurrentPathString() {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_current_path_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_edit_widget = Interop.downcallHandle(
        "gtk_cell_area_get_edit_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkCellEditable} widget currently used
     * to edit the currently edited cell.
     */
    public CellEditable getEditWidget() {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_edit_widget.invokeExact(handle());
            return new CellEditable.CellEditableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_edited_cell = Interop.downcallHandle(
        "gtk_cell_area_get_edited_cell",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkCellRenderer} in {@code area} that is currently
     * being edited.
     */
    public CellRenderer getEditedCell() {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_edited_cell.invokeExact(handle());
            return new CellRenderer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_focus_cell = Interop.downcallHandle(
        "gtk_cell_area_get_focus_cell",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the currently focused cell for {@code area}
     */
    public CellRenderer getFocusCell() {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_focus_cell.invokeExact(handle());
            return new CellRenderer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_focus_from_sibling = Interop.downcallHandle(
        "gtk_cell_area_get_focus_from_sibling",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkCellRenderer} which is expected to be focusable
     * for which {@code renderer} is, or may be a sibling.
     * <p>
     * This is handy for {@code GtkCellArea} subclasses when handling events,
     * after determining the renderer at the event location it can
     * then chose to activate the focus cell for which the event
     * cell may have been a sibling.
     */
    public CellRenderer getFocusFromSibling(CellRenderer renderer) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_focus_from_sibling.invokeExact(handle(), renderer.handle());
            return new CellRenderer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_focus_siblings = Interop.downcallHandle(
        "gtk_cell_area_get_focus_siblings",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the focus sibling cell renderers for {@code renderer}.
     */
    public org.gtk.glib.List getFocusSiblings(CellRenderer renderer) {
        try {
            var RESULT = (MemoryAddress) gtk_cell_area_get_focus_siblings.invokeExact(handle(), renderer.handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_preferred_height = Interop.downcallHandle(
        "gtk_cell_area_get_preferred_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a cell area’s initial minimum and natural height.
     * <p>
     * {@code area} will store some geometrical information in {@code context} along the way;
     * when requesting sizes over an arbitrary number of rows, it’s not important
     * to check the {@code minimum_height} and {@code natural_height} of this call but rather to
     * consult gtk_cell_area_context_get_preferred_height() after a series of
     * requests.
     */
    public void getPreferredHeight(CellAreaContext context, Widget widget, PointerInteger minimumHeight, PointerInteger naturalHeight) {
        try {
            gtk_cell_area_get_preferred_height.invokeExact(handle(), context.handle(), widget.handle(), minimumHeight.handle(), naturalHeight.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_preferred_height_for_width = Interop.downcallHandle(
        "gtk_cell_area_get_preferred_height_for_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void getPreferredHeightForWidth(CellAreaContext context, Widget widget, int width, PointerInteger minimumHeight, PointerInteger naturalHeight) {
        try {
            gtk_cell_area_get_preferred_height_for_width.invokeExact(handle(), context.handle(), widget.handle(), width, minimumHeight.handle(), naturalHeight.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_preferred_width = Interop.downcallHandle(
        "gtk_cell_area_get_preferred_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves a cell area’s initial minimum and natural width.
     * <p>
     * {@code area} will store some geometrical information in {@code context} along the way;
     * when requesting sizes over an arbitrary number of rows, it’s not important
     * to check the {@code minimum_width} and {@code natural_width} of this call but rather to
     * consult gtk_cell_area_context_get_preferred_width() after a series of
     * requests.
     */
    public void getPreferredWidth(CellAreaContext context, Widget widget, PointerInteger minimumWidth, PointerInteger naturalWidth) {
        try {
            gtk_cell_area_get_preferred_width.invokeExact(handle(), context.handle(), widget.handle(), minimumWidth.handle(), naturalWidth.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_preferred_width_for_height = Interop.downcallHandle(
        "gtk_cell_area_get_preferred_width_for_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void getPreferredWidthForHeight(CellAreaContext context, Widget widget, int height, PointerInteger minimumWidth, PointerInteger naturalWidth) {
        try {
            gtk_cell_area_get_preferred_width_for_height.invokeExact(handle(), context.handle(), widget.handle(), height, minimumWidth.handle(), naturalWidth.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_get_request_mode = Interop.downcallHandle(
        "gtk_cell_area_get_request_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the area prefers a height-for-width layout
     * or a width-for-height layout.
     */
    public SizeRequestMode getRequestMode() {
        try {
            var RESULT = (int) gtk_cell_area_get_request_mode.invokeExact(handle());
            return new SizeRequestMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_has_renderer = Interop.downcallHandle(
        "gtk_cell_area_has_renderer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if {@code area} contains {@code renderer}.
     */
    public boolean hasRenderer(CellRenderer renderer) {
        try {
            var RESULT = (int) gtk_cell_area_has_renderer.invokeExact(handle(), renderer.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_inner_cell_area = Interop.downcallHandle(
        "gtk_cell_area_inner_cell_area",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a convenience function for {@code GtkCellArea} implementations
     * to get the inner area where a given {@code GtkCellRenderer} will be
     * rendered. It removes any padding previously added by gtk_cell_area_request_renderer().
     */
    public void innerCellArea(Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle innerArea) {
        try {
            gtk_cell_area_inner_cell_area.invokeExact(handle(), widget.handle(), cellArea.handle(), innerArea.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_is_activatable = Interop.downcallHandle(
        "gtk_cell_area_is_activatable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the area can do anything when activated,
     * after applying new attributes to {@code area}.
     */
    public boolean isActivatable() {
        try {
            var RESULT = (int) gtk_cell_area_is_activatable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_is_focus_sibling = Interop.downcallHandle(
        "gtk_cell_area_is_focus_sibling",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code sibling} is one of {@code renderer}’s focus siblings
     * (see gtk_cell_area_add_focus_sibling()).
     */
    public boolean isFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        try {
            var RESULT = (int) gtk_cell_area_is_focus_sibling.invokeExact(handle(), renderer.handle(), sibling.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_remove = Interop.downcallHandle(
        "gtk_cell_area_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code renderer} from {@code area}.
     */
    public void remove(CellRenderer renderer) {
        try {
            gtk_cell_area_remove.invokeExact(handle(), renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_remove_focus_sibling = Interop.downcallHandle(
        "gtk_cell_area_remove_focus_sibling",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code sibling} from {@code renderer}’s focus sibling list
     * (see gtk_cell_area_add_focus_sibling()).
     */
    public void removeFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        try {
            gtk_cell_area_remove_focus_sibling.invokeExact(handle(), renderer.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_request_renderer = Interop.downcallHandle(
        "gtk_cell_area_request_renderer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This is a convenience function for {@code GtkCellArea} implementations
     * to request size for cell renderers. It’s important to use this
     * function to request size and then use gtk_cell_area_inner_cell_area()
     * at render and event time since this function will add padding
     * around the cell for focus painting.
     */
    public void requestRenderer(CellRenderer renderer, Orientation orientation, Widget widget, int forSize, PointerInteger minimumSize, PointerInteger naturalSize) {
        try {
            gtk_cell_area_request_renderer.invokeExact(handle(), renderer.handle(), orientation.getValue(), widget.handle(), forSize, minimumSize.handle(), naturalSize.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_set_focus_cell = Interop.downcallHandle(
        "gtk_cell_area_set_focus_cell",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Explicitly sets the currently focused cell to {@code renderer}.
     * <p>
     * This is generally called by implementations of
     * {@code GtkCellAreaClass.focus()} or {@code GtkCellAreaClass.event()},
     * however it can also be used to implement functions such
     * as gtk_tree_view_set_cursor_on_cell().
     */
    public void setFocusCell(CellRenderer renderer) {
        try {
            gtk_cell_area_set_focus_cell.invokeExact(handle(), renderer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_snapshot = Interop.downcallHandle(
        "gtk_cell_area_snapshot",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Snapshots {@code area}’s cells according to {@code area}’s layout onto at
     * the given coordinates.
     */
    public void snapshot(CellAreaContext context, Widget widget, Snapshot snapshot, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, CellRendererState flags, boolean paintFocus) {
        try {
            gtk_cell_area_snapshot.invokeExact(handle(), context.handle(), widget.handle(), snapshot.handle(), backgroundArea.handle(), cellArea.handle(), flags.getValue(), paintFocus ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_cell_area_stop_editing = Interop.downcallHandle(
        "gtk_cell_area_stop_editing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Explicitly stops the editing of the currently edited cell.
     * <p>
     * If {@code canceled} is {@code true}, the currently edited cell renderer
     * will emit the ::editing-canceled signal, otherwise the
     * the ::editing-done signal will be emitted on the current
     * edit widget.
     * <p>
     * See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
     */
    public void stopEditing(boolean canceled) {
        try {
            gtk_cell_area_stop_editing.invokeExact(handle(), canceled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AddEditableHandler {
        void signalReceived(CellArea source, CellRenderer renderer, CellEditable editable, org.gtk.gdk.Rectangle cellArea, java.lang.String path);
    }
    
    /**
     * Indicates that editing has started on {@code renderer} and that {@code editable}
     * should be added to the owning cell-layouting widget at {@code cell_area}.
     */
    public SignalHandle onAddEditable(AddEditableHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("add-editable").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaAddEditable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplyAttributesHandler {
        void signalReceived(CellArea source, TreeModel model, TreeIter iter, boolean isExpander, boolean isExpanded);
    }
    
    /**
     * This signal is emitted whenever applying attributes to {@code area} from {@code model}
     */
    public SignalHandle onApplyAttributes(ApplyAttributesHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply-attributes").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaApplyAttributes",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FocusChangedHandler {
        void signalReceived(CellArea source, CellRenderer renderer, java.lang.String path);
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
     */
    public SignalHandle onFocusChanged(FocusChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("focus-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaFocusChanged",
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
    public interface RemoveEditableHandler {
        void signalReceived(CellArea source, CellRenderer renderer, CellEditable editable);
    }
    
    /**
     * Indicates that editing finished on {@code renderer} and that {@code editable}
     * should be removed from the owning cell-layouting widget.
     */
    public SignalHandle onRemoveEditable(RemoveEditableHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-editable").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellArea.Callbacks.class, "signalCellAreaRemoveEditable",
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
    
    public static class Callbacks {
    
        public static void signalCellAreaAddEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress cellArea, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellArea.AddEditableHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellArea(Refcounted.get(source)), new CellRenderer(Refcounted.get(renderer, false)), new CellEditable.CellEditableImpl(Refcounted.get(editable, false)), new org.gtk.gdk.Rectangle(Refcounted.get(cellArea, false)), path.getUtf8String(0));
        }
        
        public static void signalCellAreaApplyAttributes(MemoryAddress source, MemoryAddress model, MemoryAddress iter, int isExpander, int isExpanded, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellArea.ApplyAttributesHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellArea(Refcounted.get(source)), new TreeModel.TreeModelImpl(Refcounted.get(model, false)), new TreeIter(Refcounted.get(iter, false)), isExpander != 0, isExpanded != 0);
        }
        
        public static void signalCellAreaFocusChanged(MemoryAddress source, MemoryAddress renderer, MemoryAddress path, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellArea.FocusChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellArea(Refcounted.get(source)), new CellRenderer(Refcounted.get(renderer, false)), path.getUtf8String(0));
        }
        
        public static void signalCellAreaRemoveEditable(MemoryAddress source, MemoryAddress renderer, MemoryAddress editable, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellArea.RemoveEditableHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellArea(Refcounted.get(source)), new CellRenderer(Refcounted.get(renderer, false)), new CellEditable.CellEditableImpl(Refcounted.get(editable, false)));
        }
        
    }
}
