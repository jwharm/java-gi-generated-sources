package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An interface for packing cells
 * <p>
 * {@code GtkCellLayout} is an interface to be implemented by all objects which
 * want to provide a {@code GtkTreeViewColumn} like API for packing cells,
 * setting attributes and data funcs.
 * <p>
 * One of the notable features provided by implementations of
 * {@code GtkCellLayout} are attributes. Attributes let you set the properties
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
 * interface ({@code GtkCellView}, {@code GtkIconView}, {@code GtkComboBox},
 * {@code GtkEntryCompletion}, {@code GtkTreeViewColumn}) accept {@code GtkCellRenderer} objects
 * as {@code <child>} elements in UI definitions. They support a custom {@code <attributes>}
 * element for their children, which can contain multiple {@code <attribute>}
 * elements. Each {@code <attribute>} element has a name attribute which specifies
 * a property of the cell renderer; the content of the element is the
 * attribute value.
 * <p>
 * This is an example of a UI definition fragment specifying attributes:
 * <p>
 * <pre>{@code xml
 * <object class="GtkCellView">
 *   <child>
 *     <object class="GtkCellRendererText"/>
 *     <attributes>
 *       <attribute name="text">0</attribute>
 *     </attributes>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * Furthermore for implementations of {@code GtkCellLayout} that use a {@code GtkCellArea}
 * to lay out cells (all {@code GtkCellLayout}s in GTK use a {@code GtkCellArea})
 * <a href="class.CellArea.html#cell-properties">cell properties</a> can also be defined
 * in the format by specifying the custom {@code <cell-packing>} attribute which can
 * contain multiple {@code <property>} elements.
 * <p>
 * Here is a UI definition fragment specifying cell properties:
 * <p>
 * <pre>{@code xml
 * <object class="GtkTreeViewColumn">
 *   <child>
 *     <object class="GtkCellRendererText"/>
 *     <cell-packing>
 *       <property name="align">True</property>
 *       <property name="expand">False</property>
 *     </cell-packing>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * <h1>Subclassing GtkCellLayout implementations</h1>
 * <p>
 * When subclassing a widget that implements {@code GtkCellLayout} like
 * {@code GtkIconView} or {@code GtkComboBox}, there are some considerations related
 * to the fact that these widgets internally use a {@code GtkCellArea}.
 * The cell area is exposed as a construct-only property by these
 * widgets. This means that it is possible to e.g. do
 * <p>
 * <pre>{@code c
 * GtkWIdget *combo =
 *   g_object_new (GTK_TYPE_COMBO_BOX, "cell-area", my_cell_area, NULL);
 * }</pre>
 * <p>
 * to use a custom cell area with a combo box. But construct properties
 * are only initialized after instance {@code init()}
 * functions have run, which means that using functions which rely on
 * the existence of the cell area in your subclass {@code init()} function will
 * cause the default cell area to be instantiated. In this case, a provided
 * construct property value will be ignored (with a warning, to alert
 * you to the problem).
 * <p>
 * <pre>{@code c
 * static void
 * my_combo_box_init (MyComboBox *b)
 * {
 *   GtkCellRenderer *cell;
 * 
 *   cell = gtk_cell_renderer_pixbuf_new ();
 * 
 *   // The following call causes the default cell area for combo boxes,
 *   // a GtkCellAreaBox, to be instantiated
 *   gtk_cell_layout_pack_start (GTK_CELL_LAYOUT (b), cell, FALSE);
 *   ...
 * }
 * 
 * GtkWidget *
 * my_combo_box_new (GtkCellArea *area)
 * {
 *   // This call is going to cause a warning about area being ignored
 *   return g_object_new (MY_TYPE_COMBO_BOX, "cell-area", area, NULL);
 * }
 * }</pre>
 * <p>
 * If supporting alternative cell areas with your derived widget is
 * not important, then this does not have to concern you. If you want
 * to support alternative cell areas, you can do so by moving the
 * problematic calls out of {@code init()} and into a {@code constructor()}
 * for your class.
 */
public interface CellLayout extends io.github.jwharm.javagi.Proxy {

    /**
     * Adds an attribute mapping to the list in {@code cell_layout}.
     * <p>
     * The {@code column} is the column of the model to get a value from, and the
     * {@code attribute} is the property on {@code cell} to be set from that value. So for
     * example if column 2 of the model contains strings, you could have the
     * “text” attribute of a {@code GtkCellRendererText} get its values from column 2.
     * In this context "attribute" and "property" are used interchangeably.
     */
    public default void addAttribute(CellRenderer cell, java.lang.String attribute, int column) {
        gtk_h.gtk_cell_layout_add_attribute(handle(), cell.handle(), Interop.allocateNativeString(attribute).handle(), column);
    }
    
    /**
     * Unsets all the mappings on all renderers on {@code cell_layout} and
     * removes all renderers from {@code cell_layout}.
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
     * Returns the underlying {@code GtkCellArea} which might be {@code cell_layout}
     * if called on a {@code GtkCellArea} or might be {@code null} if no {@code GtkCellArea}
     * is used by {@code cell_layout}.
     */
    public default CellArea getArea() {
        var RESULT = gtk_h.gtk_cell_layout_get_area(handle());
        return new CellArea(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the cell renderers which have been added to {@code cell_layout}.
     */
    public default org.gtk.glib.List getCells() {
        var RESULT = gtk_h.gtk_cell_layout_get_cells(handle());
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Adds the {@code cell} to the end of {@code cell_layout}. If {@code expand} is {@code false}, then the
     * {@code cell} is allocated no more space than it needs. Any unused space is
     * divided evenly between cells for which {@code expand} is {@code true}.
     * <p>
     * Note that reusing the same cell renderer is not supported.
     */
    public default void packEnd(CellRenderer cell, boolean expand) {
        gtk_h.gtk_cell_layout_pack_end(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Packs the {@code cell} into the beginning of {@code cell_layout}. If {@code expand} is {@code false},
     * then the {@code cell} is allocated no more space than it needs. Any unused space
     * is divided evenly between cells for which {@code expand} is {@code true}.
     * <p>
     * Note that reusing the same cell renderer is not supported.
     */
    public default void packStart(CellRenderer cell, boolean expand) {
        gtk_h.gtk_cell_layout_pack_start(handle(), cell.handle(), expand ? 1 : 0);
    }
    
    /**
     * Re-inserts {@code cell} at {@code position}.
     * <p>
     * Note that {@code cell} has already to be packed into {@code cell_layout}
     * for this to function properly.
     */
    public default void reorder(CellRenderer cell, int position) {
        gtk_h.gtk_cell_layout_reorder(handle(), cell.handle(), position);
    }
    
    /**
     * Sets the {@code GtkCellLayout}DataFunc to use for {@code cell_layout}.
     * <p>
     * This function is used instead of the standard attributes mapping
     * for setting the column value, and should set the value of {@code cell_layout}’s
     * cell renderer(s) as appropriate.
     * <p>
     * {@code func} may be {@code null} to remove a previously set function.
     */
    public default void setCellDataFunc(CellRenderer cell, CellLayoutDataFunc func) {
        try {
            gtk_h.gtk_cell_layout_set_cell_data_func(handle(), cell.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCellLayoutDataFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    class CellLayoutImpl extends org.gtk.gobject.Object implements CellLayout {
        public CellLayoutImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
