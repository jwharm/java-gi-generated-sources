package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An abstract class for laying out <code>GtkCellRenderer</code>s
 * <p>
 * The <code>GtkCellArea</code> is an abstract class for {@link [iface@Gtk.CellLayout] (ref=iface)}
 * widgets (also referred to as &<code>#34</code> layouting widgets&<code>#34</code> ) to interface with
 * an arbitrary number of {@link org.gtk.gtk.CellRenderer}s and interact with the user
 * for a given {@link [iface@Gtk.TreeModel] (ref=iface)} row.
 * <p>
 * The cell area handles events, focus navigation, drawing and
 * size requests and allocations for a given row of data.
 * <p>
 * Usually users dont have to interact with the <code>GtkCellArea</code> directly
 * unless they are implementing a cell-layouting widget themselves.
 * <p>
 * <h1>Requesting area sizes</h1>
 * <p>
 * As outlined in
 * {@link [GtkWidget&<code>#8217</code> s geometry management section]}(class.Widget.html<code>#height</code> for-width-geometry-management),
 * GTK uses a height-for-width
 * geometry management system to compute the sizes of widgets and user
 * interfaces. <code>GtkCellArea</code> uses the same semantics to calculate the
 * size of an area for an arbitrary number of <code>GtkTreeModel</code> rows.
 * <p>
 * When requesting the size of a cell area one needs to calculate
 * the size for a handful of rows, and this will be done differently by
 * different layouting widgets. For instance a {@link org.gtk.gtk.TreeViewColumn}
 * always lines up the areas from top to bottom while a {@link org.gtk.gtk.IconView}
 * on the other hand might enforce that all areas received the same
 * width and wrap the areas around, requesting height for more cell
 * areas when allocated less width.
 * <p>
 * It&<code>#8217</code> s also important for areas to maintain some cell
 * alignments with areas rendered for adjacent rows (cells can
 * appear &<code>#8220</code> columnized&<code>#8221</code>  inside an area even when the size of
 * cells are different in each row). For this reason the <code>GtkCellArea</code>
 * uses a {@link org.gtk.gtk.CellAreaContext} object to store the alignments
 * and sizes along the way (as well as the overall largest minimum
 * and natural size for all the rows which have been calculated
 * with the said context).
 * <p>
 * The {@link org.gtk.gtk.CellAreaContext} is an opaque object specific to the<code>GtkCellArea</code> which created it (see {@link org.gtk.gtk.CellArea<code>#createContext</code> ).
 * <p>
 * The owning cell-layouting widget can create as many contexts as
 * it wishes to calculate sizes of rows which should receive the
 * same size in at least one orientation (horizontally or vertically),
 * However, it&<code>#8217</code> s important that the same {@link org.gtk.gtk.CellAreaContext} which
 * was used to request the sizes for a given <code>GtkTreeModel</code> row be
 * used when rendering or processing events for that row.
 * <p>
 * In order to request the width of all the rows at the root level
 * of a <code>GtkTreeModel</code> one would do the following:
 * <p><pre>c
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 * <p>
 * valid = gtk_tree_model_get_iter_first (model, &<code>#38</code> iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &<code>#38</code> iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_width (area, context, widget, NULL, NULL);
 * <p>
 *     valid = gtk_tree_model_iter_next (model, &<code>#38</code> iter);
 *   }
 * <p>
 * gtk_cell_area_context_get_preferred_width (context, &<code>#38</code> minimum_width, &<code>#38</code> natural_width);
 * </pre>
 * <p>
 * Note that in this example it&<code>#8217</code> s not important to observe the
 * returned minimum and natural width of the area for each row
 * unless the cell-layouting object is actually interested in the
 * widths of individual rows. The overall width is however stored
 * in the accompanying <code>GtkCellAreaContext</code> object and can be consulted
 * at any time.
 * <p>
 * This can be useful since <code>GtkCellLayout</code> widgets usually have to
 * support requesting and rendering rows in treemodels with an
 * exceedingly large amount of rows. The <code>GtkCellLayout</code> widget in
 * that case would calculate the required width of the rows in an
 * idle or timeout source (see {@link GLib<code>#timeoutAdd</code> ) and when the widget
 * is requested its actual width in {@link org.gtk.gtk.Widget<code>#measure</code> 
 * it can simply consult the width accumulated so far in the<code>GtkCellAreaContext</code> object.
 * <p>
 * A simple example where rows are rendered from top to bottom and
 * take up the full width of the layouting widget would look like:
 * <p><pre>c
 * static void
 * foo_get_preferred_width (GtkWidget *widget,
 *                          int       *minimum_size,
 *                          int       *natural_size)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 * <p>
 *   foo_ensure_at_least_one_handfull_of_rows_have_been_requested (self);
 * <p>
 *   gtk_cell_area_context_get_preferred_width (priv-&<code>#62</code> context, minimum_size, natural_size);
 * }
 * </pre>
 * <p>
 * In the above example the <code>Foo</code> widget has to make sure that some
 * row sizes have been calculated (the amount of rows that <code>Foo</code> judged
 * was appropriate to request space for in a single timeout iteration)
 * before simply returning the amount of space required by the area via
 * the <code>GtkCellAreaContext</code>.
 * <p>
 * Requesting the height for width (or width for height) of an area is
 * a similar task except in this case the <code>GtkCellAreaContext</code> does not
 * store the data (actually, it does not know how much space the layouting
 * widget plans to allocate it for every row. It&<code>#8217</code> s up to the layouting
 * widget to render each row of data with the appropriate height and
 * width which was requested by the <code>GtkCellArea</code>).
 * <p>
 * In order to request the height for width of all the rows at the
 * root level of a <code>GtkTreeModel</code> one would do the following:
 * <p><pre>c
 * GtkTreeIter iter;
 * int minimum_height;
 * int natural_height;
 * int full_minimum_height = 0;
 * int full_natural_height = 0;
 * <p>
 * valid = gtk_tree_model_get_iter_first (model, &<code>#38</code> iter);
 * while (valid)
 *   {
 *     gtk_cell_area_apply_attributes (area, model, &<code>#38</code> iter, FALSE, FALSE);
 *     gtk_cell_area_get_preferred_height_for_width (area, context, widget,
 *                                                   width, &<code>#38</code> minimum_height, &<code>#38</code> natural_height);
 * <p>
 *     if (width_is_for_allocation)
 *        cache_row_height (&<code>#38</code> iter, minimum_height, natural_height);
 * <p>
 *     full_minimum_height += minimum_height;
 *     full_natural_height += natural_height;
 * <p>
 *     valid = gtk_tree_model_iter_next (model, &<code>#38</code> iter);
 *   }
 * </pre>
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
 * case it&<code>#8217</code> s only important that the layouting widget calculate
 * one reasonably sized chunk of rows and return that height
 * synchronously. The reasoning here is that any layouting widget is
 * at least capable of synchronously calculating enough height to fill
 * the screen height (or scrolled window height) in response to a single
 * call to {@link org.gtk.gtk.Widget<code>#measure</code> . Returning
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
 * {@link org.gtk.gtk.Widget<code>#snapshot</code>  time.
 * <p>
 * A crude example of how to render all the rows at the root level
 * runs as follows:
 * <p><pre>c
 * GtkAllocation allocation;
 * GdkRectangle cell_area = { 0, };
 * GtkTreeIter iter;
 * int minimum_width;
 * int natural_width;
 * <p>
 * gtk_widget_get_allocation (widget, &<code>#38</code> allocation);
 * cell_area.width = allocation.width;
 * <p>
 * valid = gtk_tree_model_get_iter_first (model, &<code>#38</code> iter);
 * while (valid)
 *   {
 *     cell_area.height = get_cached_height_for_row (&<code>#38</code> iter);
 * <p>
 *     gtk_cell_area_apply_attributes (area, model, &<code>#38</code> iter, FALSE, FALSE);
 *     gtk_cell_area_render (area, context, widget, cr,
 *                           &<code>#38</code> cell_area, &<code>#38</code> cell_area, state_flags, FALSE);
 * <p>
 *     cell_area.y += cell_area.height;
 * <p>
 *     valid = gtk_tree_model_iter_next (model, &<code>#38</code> iter);
 *   }
 * </pre>
 * <p>
 * Note that the cached height in this example really depends on how
 * the layouting widget works. The layouting widget might decide to
 * give every row its minimum or natural height or, if the model content
 * is expected to fit inside the layouting widget without scrolling, it
 * would make sense to calculate the allocation for each row at
 * the time the widget is allocated using {@link Gtk<code>#distributeNaturalAllocation</code> .
 * <p>
 * <h1>Handling Events and Driving Keyboard Focus</h1>
 * <p>
 * Passing events to the area is as simple as handling events on any
 * normal widget and then passing them to the {@link org.gtk.gtk.CellArea<code>#event</code> 
 * API as they come in. Usually <code>GtkCellArea</code> is only interested in
 * button events, however some customized derived areas can be implemented
 * who are interested in handling other events. Handling an event can
 * trigger the {@link [<code>signal@Gtk.CellArea::focus-changed</code>] (ref=<code>signal)} signal to fire; as well
 * as {@link [<code>signal@GtkCellArea::add-editable</code>] (ref=<code>signal)} in the case that an editable cell
 * was clicked and needs to start editing. You can call
 * {@link org.gtk.gtk.CellArea<code>#stopEditing</code>  at any time to cancel any cell editing
 * that is currently in progress.
 * <p>
 * The <code>GtkCellArea</code> drives keyboard focus from cell to cell in a way
 * similar to <code>GtkWidget</code>. For layouting widgets that support giving
 * focus to cells it&<code>#8217</code> s important to remember to pass <code>GTK_CELL_RENDERER_FOCUSED</code>
 * to the area functions for the row that has focus and to tell the
 * area to paint the focus at render time.
 * <p>
 * Layouting widgets that accept focus on cells should implement the
 * {@link org.gtk.gtk.Widget<code>#focus</code>  virtual method. The layouting widget is always
 * responsible for knowing where <code>GtkTreeModel</code> rows are rendered inside
 * the widget, so at {@link org.gtk.gtk.Widget<code>#focus</code>  time the layouting widget
 * should use the <code>GtkCellArea</code> methods to navigate focus inside the area
 * and then observe the {@link [enum@Gtk.DirectionType] (ref=enum)} to pass the focus to adjacent
 * rows and areas.
 * <p>
 * A basic example of how the {@link org.gtk.gtk.Widget<code>#focus</code>  virtual method
 * should be implemented:
 * <p><pre>
 * static gboolean
 * foo_focus (GtkWidget       *widget,
 *            GtkDirectionType direction)
 * {
 *   Foo *self = FOO (widget);
 *   FooPrivate *priv = foo_get_instance_private (self);
 *   int focus_row = priv-&<code>#62</code> focus_row;
 *   gboolean have_focus = FALSE;
 * <p>
 *   if (!gtk_widget_has_focus (widget))
 *     gtk_widget_grab_focus (widget);
 * <p>
 *   valid = gtk_tree_model_iter_nth_child (priv-&<code>#62</code> model, &<code>#38</code> iter, NULL, priv-&<code>#62</code> focus_row);
 *   while (valid)
 *     {
 *       gtk_cell_area_apply_attributes (priv-&<code>#62</code> area, priv-&<code>#62</code> model, &<code>#38</code> iter, FALSE, FALSE);
 * <p>
 *       if (gtk_cell_area_focus (priv-&<code>#62</code> area, direction))
 *         {
 *            priv-&<code>#62</code> focus_row = focus_row;
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
 *                   valid = gtk_tree_model_iter_nth_child (priv-&<code>#62</code> model, &<code>#38</code> iter, NULL, focus_row);
 *                }
 *             }
 *           else
 *             {
 *               if (focus_row == last_row)
 *                 break;
 *               else
 *                 {
 *                   focus_row++;
 *                   valid = gtk_tree_model_iter_next (priv-&<code>#62</code> model, &<code>#38</code> iter);
 *                 }
 *             }
 *         }
 *     }
 *     return have_focus;
 * }
 * </pre>
 * <p>
 * Note that the layouting widget is responsible for matching the<code>GtkDirectionType</code> values to the way it lays out its cells.
 * <p>
 * <h1>Cell Properties</h1>
 * <p>
 * The <code>GtkCellArea</code> introduces cell properties for <code>GtkCellRenderer</code>s.
 * This provides some general interfaces for defining the relationship
 * cell areas have with their cells. For instance in a {@link org.gtk.gtk.CellAreaBox}
 * a cell might &<code>#8220</code> expand&<code>#8221</code>  and receive extra space when the area is allocated
 * more than its full natural request, or a cell might be configured to &<code>#8220</code> align&<code>#8221</code> 
 * with adjacent rows which were requested and rendered with the same<code>GtkCellAreaContext</code>.
 * 
 * Use {@link org.gtk.gtk.CellAreaClass<code>#installCellProperty</code>  to install cell
 * properties for a cell area class and {@link org.gtk.gtk.CellAreaClass<code>#findCellProperty</code> 
 * or {@link org.gtk.gtk.CellAreaClass<code>#listCellProperties</code>  to get information about
 * existing cell properties.
 * 
 * To set the value of a cell property, use {@link org.gtk.gtk.CellArea<code>#cellSetProperty</code> ,
 * {@link org.gtk.gtk.CellArea<code>#cellSet</code>  or {@link org.gtk.gtk.CellArea<code>#cellSetValist</code> . To obtain
 * the value of a cell property, use {@link org.gtk.gtk.CellArea<code>#cellGetProperty</code> 
 * {@link org.gtk.gtk.CellArea<code>#cellGet</code>  or {@link org.gtk.gtk.CellArea<code>#cellGetValist</code> .
 */
public class CellArea extends org.gtk.gobject.InitiallyUnowned implements Buildable, CellLayout {

    public CellArea(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellArea */
    public static CellArea castFrom(org.gtk.gobject.Object gobject) {
        return new CellArea(gobject.getReference());
    }
    
    /**
     * Activates @area, usually by activating the currently focused
     * cell, however some subclasses which embed widgets in the area
     * can also activate a widget if it currently has the focus.
     */
    public boolean activate(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, int flags, boolean editOnly) {
        var RESULT = gtk_h.gtk_cell_area_activate(handle(), context.handle(), widget.handle(), cellArea.handle(), flags, editOnly ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * This is used by <code>GtkCellArea</code> subclasses when handling events
     * to activate cells, the base <code>GtkCellArea</code> class activates cells
     * for keyboard events for free in its own GtkCellArea-&<code>#62</code> activate()
     * implementation.
     */
    public boolean activateCell(Widget widget, CellRenderer renderer, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = gtk_h.gtk_cell_area_activate_cell(handle(), widget.handle(), renderer.handle(), event.handle(), cellArea.handle(), flags);
        return (RESULT != 0);
    }
    
    /**
     * Adds @renderer to @area with the default child cell properties.
     */
    public void add(CellRenderer renderer) {
        gtk_h.gtk_cell_area_add(handle(), renderer.handle());
    }
    
    /**
     * Adds @sibling to @renderer&<code>#8217</code> s focusable area, focus will be drawn
     * around @renderer and all of its siblings if @renderer can
     * focus for a given row.
     * 
     * Events handled by focus siblings can also activate the given
     * focusable @renderer.
     */
    public void addFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        gtk_h.gtk_cell_area_add_focus_sibling(handle(), renderer.handle(), sibling.handle());
    }
    
    /**
     * Applies any connected attributes to the renderers in
     * @area by pulling the values from @tree_model.
     */
    public void applyAttributes(TreeModel treeModel, TreeIter iter, boolean isExpander, boolean isExpanded) {
        gtk_h.gtk_cell_area_apply_attributes(handle(), treeModel.handle(), iter.handle(), isExpander ? 1 : 0, isExpanded ? 1 : 0);
    }
    
    /**
     * Connects an @attribute to apply values from @column for the<code>GtkTreeModel</code> in use.
     */
    public void attributeConnect(CellRenderer renderer, java.lang.String attribute, int column) {
        gtk_h.gtk_cell_area_attribute_connect(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle(), column);
    }
    
    /**
     * Disconnects @attribute for the @renderer in @area so that
     * attribute will no longer be updated with values from the
     * model.
     */
    public void attributeDisconnect(CellRenderer renderer, java.lang.String attribute) {
        gtk_h.gtk_cell_area_attribute_disconnect(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle());
    }
    
    /**
     * Returns the model column that an attribute has been mapped to,
     * or -1 if the attribute is not mapped.
     */
    public int attributeGetColumn(CellRenderer renderer, java.lang.String attribute) {
        var RESULT = gtk_h.gtk_cell_area_attribute_get_column(handle(), renderer.handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT;
    }
    
    /**
     * Gets the value of a cell property for @renderer in @area.
     */
    public void cellGetProperty(CellRenderer renderer, java.lang.String propertyName, org.gtk.gobject.Value value) {
        gtk_h.gtk_cell_area_cell_get_property(handle(), renderer.handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * Gets the values of one or more cell properties for @renderer in @area.
     */
    public void cellGetValist(CellRenderer renderer, java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.gtk_cell_area_cell_get_valist(handle(), renderer.handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * Sets a cell property for @renderer in @area.
     */
    public void cellSetProperty(CellRenderer renderer, java.lang.String propertyName, org.gtk.gobject.Value value) {
        gtk_h.gtk_cell_area_cell_set_property(handle(), renderer.handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * Sets one or more cell properties for @renderer in @area.
     */
    public void cellSetValist(CellRenderer renderer, java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.gtk_cell_area_cell_set_valist(handle(), renderer.handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * This is sometimes needed for cases where rows need to share
     * alignments in one orientation but may be separately grouped
     * in the opposing orientation.
     * <p>
     * For instance, <code>GtkIconView</code> creates all icons (rows) to have
     * the same width and the cells theirin to have the same
     * horizontal alignments. However each row of icons may have
     * a separate collective height. <code>GtkIconView</code> uses this to
     * request the heights of each row based on a context which
     * was already used to request all the row widths that are
     * to be displayed.
     */
    public CellAreaContext copyContext(CellAreaContext context) {
        var RESULT = gtk_h.gtk_cell_area_copy_context(handle(), context.handle());
        return new CellAreaContext(References.get(RESULT, true));
    }
    
    /**
     * Creates a <code>GtkCellArea</code>Context to be used with @area for
     * all purposes. <code>GtkCellArea</code>Context stores geometry information
     * for rows for which it was operated on, it is important to use
     * the same context for the same row of data at all times (i.e.
     * one should render and handle events with the same <code>GtkCellArea</code>Context
     * which was used to request the size of those rows of data).
     */
    public CellAreaContext createContext() {
        var RESULT = gtk_h.gtk_cell_area_create_context(handle());
        return new CellAreaContext(References.get(RESULT, true));
    }
    
    /**
     * Delegates event handling to a <code>GtkCellArea</code>.
     */
    public int event(CellAreaContext context, Widget widget, org.gtk.gdk.Event event, org.gtk.gdk.Rectangle cellArea, int flags) {
        var RESULT = gtk_h.gtk_cell_area_event(handle(), context.handle(), widget.handle(), event.handle(), cellArea.handle(), flags);
        return RESULT;
    }
    
    /**
     * This should be called by the @area&<code>#8217</code> s owning layout widget
     * when focus is to be passed to @area, or moved within @area
     * for a given @direction and row data.
     * <p>
     * Implementing <code>GtkCellArea</code> classes should implement this
     * method to receive and navigate focus in its own way particular
     * to how it lays out cells.
     */
    public boolean focus(DirectionType direction) {
        var RESULT = gtk_h.gtk_cell_area_focus(handle(), direction.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Calls @callback for every <code>GtkCellRenderer</code> in @area.
     */
    public void foreach(CellCallback callback) {
        try {
            gtk_h.gtk_cell_area_foreach(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCellCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Calls @callback for every <code>GtkCellRenderer</code> in @area with the
     * allocated rectangle inside @cell_area.
     */
    public void foreachAlloc(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle backgroundArea, CellAllocCallback callback) {
        try {
            gtk_h.gtk_cell_area_foreach_alloc(handle(), context.handle(), widget.handle(), cellArea.handle(), backgroundArea.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCellAllocCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(callback.hashCode(), callback)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Derives the allocation of @renderer inside @area if @area
     * were to be renderered in @cell_area.
     */
    public void getCellAllocation(CellAreaContext context, Widget widget, CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle allocation) {
        gtk_h.gtk_cell_area_get_cell_allocation(handle(), context.handle(), widget.handle(), renderer.handle(), cellArea.handle(), allocation.handle());
    }
    
    /**
     * Gets the <code>GtkCellRenderer</code> at @x and @y coordinates inside @area and optionally
     * returns the full cell allocation for it inside @cell_area.
     */
    public CellRenderer getCellAtPosition(CellAreaContext context, Widget widget, org.gtk.gdk.Rectangle cellArea, int x, int y, org.gtk.gdk.Rectangle allocArea) {
        var RESULT = gtk_h.gtk_cell_area_get_cell_at_position(handle(), context.handle(), widget.handle(), cellArea.handle(), x, y, allocArea.handle());
        return new CellRenderer(References.get(RESULT, false));
    }
    
    /**
     * Gets the current <code>GtkTreePath</code> string for the currently
     * applied <code>GtkTreeIter</code>, this is implicitly updated when
     * gtk_cell_area_apply_attributes() is called and can be
     * used to interact with renderers from <code>GtkCellArea</code>
     * subclasses.
     */
    public java.lang.String getCurrentPathString() {
        var RESULT = gtk_h.gtk_cell_area_get_current_path_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the <code>GtkCellEditable</code> widget currently used
     * to edit the currently edited cell.
     */
    public CellEditable getEditWidget() {
        var RESULT = gtk_h.gtk_cell_area_get_edit_widget(handle());
        return new CellEditable.CellEditableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>GtkCellRenderer</code> in @area that is currently
     * being edited.
     */
    public CellRenderer getEditedCell() {
        var RESULT = gtk_h.gtk_cell_area_get_edited_cell(handle());
        return new CellRenderer(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the currently focused cell for @area
     */
    public CellRenderer getFocusCell() {
        var RESULT = gtk_h.gtk_cell_area_get_focus_cell(handle());
        return new CellRenderer(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>GtkCellRenderer</code> which is expected to be focusable
     * for which @renderer is, or may be a sibling.
     * <p>
     * This is handy for <code>GtkCellArea</code> subclasses when handling events,
     * after determining the renderer at the event location it can
     * then chose to activate the focus cell for which the event
     * cell may have been a sibling.
     */
    public CellRenderer getFocusFromSibling(CellRenderer renderer) {
        var RESULT = gtk_h.gtk_cell_area_get_focus_from_sibling(handle(), renderer.handle());
        return new CellRenderer(References.get(RESULT, false));
    }
    
    /**
     * Gets the focus sibling cell renderers for @renderer.
     */
    public org.gtk.glib.List getFocusSiblings(CellRenderer renderer) {
        var RESULT = gtk_h.gtk_cell_area_get_focus_siblings(handle(), renderer.handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the area prefers a height-for-width layout
     * or a width-for-height layout.
     */
    public SizeRequestMode getRequestMode() {
        var RESULT = gtk_h.gtk_cell_area_get_request_mode(handle());
        return SizeRequestMode.fromValue(RESULT);
    }
    
    /**
     * Checks if @area contains @renderer.
     */
    public boolean hasRenderer(CellRenderer renderer) {
        var RESULT = gtk_h.gtk_cell_area_has_renderer(handle(), renderer.handle());
        return (RESULT != 0);
    }
    
    /**
     * This is a convenience function for <code>GtkCellArea</code> implementations
     * to get the inner area where a given <code>GtkCellRenderer</code> will be
     * rendered. It removes any padding previously added by gtk_cell_area_request_renderer().
     */
    public void innerCellArea(Widget widget, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle innerArea) {
        gtk_h.gtk_cell_area_inner_cell_area(handle(), widget.handle(), cellArea.handle(), innerArea.handle());
    }
    
    /**
     * Returns whether the area can do anything when activated,
     * after applying new attributes to @area.
     */
    public boolean isActivatable() {
        var RESULT = gtk_h.gtk_cell_area_is_activatable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @sibling is one of @renderer&<code>#8217</code> s focus siblings
     * (see gtk_cell_area_add_focus_sibling()).
     */
    public boolean isFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        var RESULT = gtk_h.gtk_cell_area_is_focus_sibling(handle(), renderer.handle(), sibling.handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes @renderer from @area.
     */
    public void remove(CellRenderer renderer) {
        gtk_h.gtk_cell_area_remove(handle(), renderer.handle());
    }
    
    /**
     * Removes @sibling from @renderer&<code>#8217</code> s focus sibling list
     * (see gtk_cell_area_add_focus_sibling()).
     */
    public void removeFocusSibling(CellRenderer renderer, CellRenderer sibling) {
        gtk_h.gtk_cell_area_remove_focus_sibling(handle(), renderer.handle(), sibling.handle());
    }
    
    /**
     * Explicitly sets the currently focused cell to @renderer.
     * <p>
     * This is generally called by implementations of<code>GtkCellAreaClass.focus()</code> or <code>GtkCellAreaClass.event()</code>,
     * however it can also be used to implement functions such
     * as gtk_tree_view_set_cursor_on_cell().
     */
    public void setFocusCell(CellRenderer renderer) {
        gtk_h.gtk_cell_area_set_focus_cell(handle(), renderer.handle());
    }
    
    /**
     * Snapshots @area&<code>#8217</code> s cells according to @area&<code>#8217</code> s layout onto at
     * the given coordinates.
     */
    public void snapshot(CellAreaContext context, Widget widget, Snapshot snapshot, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, int flags, boolean paintFocus) {
        gtk_h.gtk_cell_area_snapshot(handle(), context.handle(), widget.handle(), snapshot.handle(), backgroundArea.handle(), cellArea.handle(), flags, paintFocus ? 1 : 0);
    }
    
    /**
     * Explicitly stops the editing of the currently edited cell.
     * 
     * If @canceled is <code>true</code>  the currently edited cell renderer
     * will emit the ::editing-canceled signal, otherwise the
     * the ::editing-done signal will be emitted on the current
     * edit widget.
     * 
     * See gtk_cell_area_get_edited_cell() and gtk_cell_area_get_edit_widget().
     */
    public void stopEditing(boolean canceled) {
        gtk_h.gtk_cell_area_stop_editing(handle(), canceled ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface AddEditableHandler {
        void signalReceived(CellArea source, CellRenderer renderer, CellEditable editable, org.gtk.gdk.Rectangle cellArea, java.lang.String path);
    }
    
    /**
     * Indicates that editing has started on @renderer and that @editable
     * should be added to the owning cell-layouting widget at @cell_area.
     */
    public SignalHandle onAddEditable(AddEditableHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellAreaAddEditable", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("add-editable").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ApplyAttributesHandler {
        void signalReceived(CellArea source, TreeModel model, TreeIter iter, boolean isExpander, boolean isExpanded);
    }
    
    /**
     * This signal is emitted whenever applying attributes to @area from @model
     */
    public SignalHandle onApplyAttributes(ApplyAttributesHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellAreaApplyAttributes", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("apply-attributes").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FocusChangedHandler {
        void signalReceived(CellArea source, CellRenderer renderer, java.lang.String path);
    }
    
    /**
     * Indicates that focus changed on this @area. This signal
     * is emitted either as a result of focus handling or event
     * handling.
     * 
     * It&<code>#39</code> s possible that the signal is emitted even if the
     * currently focused renderer did not change, this is
     * because focus may change to the same renderer in the
     * same cell area for a different row of data.
     */
    public SignalHandle onFocusChanged(FocusChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellAreaFocusChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("focus-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RemoveEditableHandler {
        void signalReceived(CellArea source, CellRenderer renderer, CellEditable editable);
    }
    
    /**
     * Indicates that editing finished on @renderer and that @editable
     * should be removed from the owning cell-layouting widget.
     */
    public SignalHandle onRemoveEditable(RemoveEditableHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalCellAreaRemoveEditable", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("remove-editable").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
