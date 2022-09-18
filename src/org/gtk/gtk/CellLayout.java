package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for packing cells
 * <p><code>GtkCellLayout</code> is an interface to be implemented by all objects which
 * want to provide a <code>GtkTreeViewColumn</code> like API for packing cells,
 * setting attributes and data funcs.
 * <p>
 * One of the notable features provided by implementations of<code>GtkCellLayout</code> are attributes. Attributes let you set the properties
 * in flexible ways. They can just be set to constant values like regular
 * properties. But they can also be mapped to a column of the underlying
 * tree model with gtk_cell_layout_set_attributes(), which means that the value
 * of the attribute can change from cell to cell as they are rendered by
 * the cell renderer. Finally, it is possible to specify a function with
 * gtk_cell_layout_set_cell_data_func() that is called to determine the
 * value of the attribute for each cell that is rendered.
 * <p>
 * <h1>GtkCellLayouts as GtkBuildable</h1>
 * <p>
 * Implementations of GtkCellLayout which also implement the GtkBuildable
 * interface (<code>GtkCellView</code>, <code>GtkIconView</code>, <code>GtkComboBox</code>,<code>GtkEntryCompletion</code>, <code>GtkTreeViewColumn</code>) accept <code>GtkCellRenderer</code> objects
 * as <code>&<code>#60</code> child&<code>#62</code> </code> elements in UI definitions. They support a custom <code>&<code>#60</code> attributes&<code>#62</code> </code>
 * element for their children, which can contain multiple <code>&<code>#60</code> attribute&<code>#62</code> </code>
 * elements. Each <code>&<code>#60</code> attribute&<code>#62</code> </code> element has a name attribute which specifies
 * a property of the cell renderer; the content of the element is the
 * attribute value.
 * <p>
 * This is an example of a UI definition fragment specifying attributes:
 * <p><pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkCellView&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> child&<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkCellRendererText&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> attributes&<code>#62</code> 
 *       &<code>#60</code> attribute name=&<code>#34</code> text&<code>#34</code> &<code>#62</code> 0&<code>#60</code> /attribute&<code>#62</code> 
 *     &<code>#60</code> /attributes&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * Furthermore for implementations of <code>GtkCellLayout</code> that use a <code>GtkCellArea</code>
 * to lay out cells (all <code>GtkCellLayout</code>s in GTK use a <code>GtkCellArea</code>)
 * {@link [cell properties]}(class.CellArea.html<code>#cell</code> properties) can also be defined
 * in the format by specifying the custom <code>&<code>#60</code> cell-packing&<code>#62</code> </code> attribute which can
 * contain multiple <code>&<code>#60</code> property&<code>#62</code> </code> elements.
 * <p>
 * Here is a UI definition fragment specifying cell properties:
 * <p><pre>xml
 * &<code>#60</code> object class=&<code>#34</code> GtkTreeViewColumn&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> child&<code>#62</code> 
 *     &<code>#60</code> object class=&<code>#34</code> GtkCellRendererText&<code>#34</code> /&<code>#62</code> 
 *     &<code>#60</code> cell-packing&<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> align&<code>#34</code> &<code>#62</code> True&<code>#60</code> /property&<code>#62</code> 
 *       &<code>#60</code> property name=&<code>#34</code> expand&<code>#34</code> &<code>#62</code> False&<code>#60</code> /property&<code>#62</code> 
 *     &<code>#60</code> /cell-packing&<code>#62</code> 
 *   &<code>#60</code> /child&<code>#62</code> 
 * &<code>#60</code> /object&<code>#62</code> 
 * </pre>
 * <p>
 * <h1>Subclassing GtkCellLayout implementations</h1>
 * <p>
 * When subclassing a widget that implements <code>GtkCellLayout</code> like<code>GtkIconView</code> or <code>GtkComboBox</code>, there are some considerations related
 * to the fact that these widgets internally use a <code>GtkCellArea</code>.
 * The cell area is exposed as a construct-only property by these
 * widgets. This means that it is possible to e.g. do
 * <p><pre>c
 * GtkWIdget *combo =
 *   g_object_new (GTK_TYPE_COMBO_BOX, &<code>#34</code> cell-area&<code>#34</code> , my_cell_area, NULL);
 * </pre>
 * <p>
 * to use a custom cell area with a combo box. But construct properties
 * are only initialized after instance <code>init()</code>
 * functions have run, which means that using functions which rely on
 * the existence of the cell area in your subclass <code>init()</code> function will
 * cause the default cell area to be instantiated. In this case, a provided
 * construct property value will be ignored (with a warning, to alert
 * you to the problem).
 * <p><pre>c
 * static void
 * my_combo_box_init (MyComboBox *b)
 * {
 *   GtkCellRenderer *cell;
 * <p>
 *   cell = gtk_cell_renderer_pixbuf_new ();
 * <p>
 *   // The following call causes the default cell area for combo boxes,
 *   // a GtkCellAreaBox, to be instantiated
 *   gtk_cell_layout_pack_start (GTK_CELL_LAYOUT (b), cell, FALSE);
 *   ...
 * }
 * <p>
 * GtkWidget *
 * my_combo_box_new (GtkCellArea *area)
 * {
 *   // This call is going to cause a warning about area being ignored
 *   return g_object_new (MY_TYPE_COMBO_BOX, &<code>#34</code> cell-area&<code>#34</code> , area, NULL);
 * }
 * </pre>
 * <p>
 * If supporting alternative cell areas with your derived widget is
 * not important, then this does not have to concern you. If you want
 * to support alternative cell areas, you can do so by moving the
 * problematic calls out of <code>init()</code> and into a <code>constructor()</code>
 * for your class.
 */
public interface CellLayout extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Adds an attribute mapping to the list in @cell_layout.
     * <p>
     * The @column is the column of the model to get a value from, and the
     * @attribute is the property on @cell to be set from that value. So for
     * example if column 2 of the model contains strings, you could have the
     * &<code>#8220</code> text&<code>#8221</code>  attribute of a <code>GtkCellRendererText</code> get its values from column 2.
     * In this context &<code>#34</code> attribute&<code>#34</code>  and &<code>#34</code> property&<code>#34</code>  are used interchangeably.
     */
    public default void addAttribute(CellRenderer cell, java.lang.String attribute, int column) {
        gtk_h.gtk_cell_layout_add_attribute(handle(), cell.handle(), Interop.allocateNativeString(attribute).handle(), column);
    }
    
    /**
     * Unsets all the mappings on all renderers on @cell_layout and
     * removes all renderers from @cell_layout.
     */
    public default void clear() {
        gtk_h.gtk_cell_layout_clear(handle());
    }
    
    /**
     * Clears all existing attributes previously set with
     * gtk_cell_layout_set_attributes().
     */
    public default void clearAttributes(CellRenderer cell) {
        gtk_h.gtk_cell_layout_clear_attributes(handle(), cell.handle());
    }
    
    /**
     * Returns the underlying <code>GtkCellArea</code> which might be @cell_layout
     * if called on a <code>GtkCellArea</code> or might be <code>null</code> if no <code>GtkCellArea</code>
     * is used by @cell_layout.
     */
    public default CellArea getArea() {
        var RESULT = gtk_h.gtk_cell_layout_get_area(handle());
        return new CellArea(References.get(RESULT, false));
    }
    
    /**
     * Returns the cell renderers which have been added to @cell_layout.
     */
    public default org.gtk.glib.List getCells() {
        var RESULT = gtk_h.gtk_cell_layout_get_cells(handle());
        return new org.gtk.glib.List(References.get(RESULT, false));
    }
    
    /**
     * Adds the @cell to the end of @cell_layout. If @expand is <code>false</code>  then the
     * @cell is allocated no more space than it needs. Any unused space is
     * divided evenly between cells for which @expand is <code>true</code> 
     * 
     * Note that reusing the same cell renderer is not supported.
     */
    public default void packEnd(CellRenderer cell, boolean expand) {
        gtk_h.gtk_cell_layout_pack_end(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Packs the @cell into the beginning of @cell_layout. If @expand is <code>false</code> 
     * then the @cell is allocated no more space than it needs. Any unused space
     * is divided evenly between cells for which @expand is <code>true</code> 
     * 
     * Note that reusing the same cell renderer is not supported.
     */
    public default void packStart(CellRenderer cell, boolean expand) {
        gtk_h.gtk_cell_layout_pack_start(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Re-inserts @cell at @position.
     * 
     * Note that @cell has already to be packed into @cell_layout
     * for this to function properly.
     */
    public default void reorder(CellRenderer cell, int position) {
        gtk_h.gtk_cell_layout_reorder(handle(), cell.handle(), position);
    }
    
    /**
     * Sets the <code>GtkCellLayout</code>DataFunc to use for @cell_layout.
     * 
     * This function is used instead of the standard attributes mapping
     * for setting the column value, and should set the value of @cell_layout&<code>#8217</code> s
     * cell renderer(s) as appropriate.
     * 
     * @func may be <code>null</code> to remove a previously set function.
     */
    public default void setCellDataFunc(CellRenderer cell, CellLayoutDataFunc func) {
        try {
            gtk_h.gtk_cell_layout_set_cell_data_func(handle(), cell.handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCellLayoutDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class CellLayoutImpl extends org.gtk.gobject.Object implements CellLayout {
        public CellLayoutImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
