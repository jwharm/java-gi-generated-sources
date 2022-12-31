package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkCellLayouts as GtkBuildable</strong><br/>
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
 * <strong>Subclassing GtkCellLayout implementations</strong><br/>
 * When subclassing a widget that implements {@code GtkCellLayout} like
 * {@code GtkIconView} or {@code GtkComboBox}, there are some considerations related
 * to the fact that these widgets internally use a {@code GtkCellArea}.
 * The cell area is exposed as a construct-only property by these
 * widgets. This means that it is possible to e.g. do
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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellLayoutImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellLayoutImpl(input, ownership);
    
    /**
     * Adds an attribute mapping to the list in {@code cell_layout}.
     * <p>
     * The {@code column} is the column of the model to get a value from, and the
     * {@code attribute} is the property on {@code cell} to be set from that value. So for
     * example if column 2 of the model contains strings, you could have the
     * “text” attribute of a {@code GtkCellRendererText} get its values from column 2.
     * In this context "attribute" and "property" are used interchangeably.
     * @param cell a {@code GtkCellRenderer}
     * @param attribute a property on the renderer
     * @param column the column position on the model to get the attribute from
     */
    default void addAttribute(org.gtk.gtk.CellRenderer cell, java.lang.String attribute, int column) {
        try {
            DowncallHandles.gtk_cell_layout_add_attribute.invokeExact(
                    handle(),
                    cell.handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets all the mappings on all renderers on {@code cell_layout} and
     * removes all renderers from {@code cell_layout}.
     */
    default void clear() {
        try {
            DowncallHandles.gtk_cell_layout_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clears all existing attributes previously set with
     * gtk_cell_layout_set_attributes().
     * @param cell a {@code GtkCellRenderer} to clear the attribute mapping on
     */
    default void clearAttributes(org.gtk.gtk.CellRenderer cell) {
        try {
            DowncallHandles.gtk_cell_layout_clear_attributes.invokeExact(
                    handle(),
                    cell.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the underlying {@code GtkCellArea} which might be {@code cell_layout}
     * if called on a {@code GtkCellArea} or might be {@code null} if no {@code GtkCellArea}
     * is used by {@code cell_layout}.
     * @return the cell area used by {@code cell_layout}
     */
    default @Nullable org.gtk.gtk.CellArea getArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_layout_get_area.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.CellArea) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.CellArea.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the cell renderers which have been added to {@code cell_layout}.
     * @return a list of cell renderers. The list, but not the renderers has
     *   been newly allocated and should be freed with g_list_free()
     *   when no longer needed.
     */
    default org.gtk.glib.List getCells() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_layout_get_cells.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Adds the {@code cell} to the end of {@code cell_layout}. If {@code expand} is {@code false}, then the
     * {@code cell} is allocated no more space than it needs. Any unused space is
     * divided evenly between cells for which {@code expand} is {@code true}.
     * <p>
     * Note that reusing the same cell renderer is not supported.
     * @param cell a {@code GtkCellRenderer}
     * @param expand {@code true} if {@code cell} is to be given extra space allocated to {@code cell_layout}
     */
    default void packEnd(org.gtk.gtk.CellRenderer cell, boolean expand) {
        try {
            DowncallHandles.gtk_cell_layout_pack_end.invokeExact(
                    handle(),
                    cell.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Packs the {@code cell} into the beginning of {@code cell_layout}. If {@code expand} is {@code false},
     * then the {@code cell} is allocated no more space than it needs. Any unused space
     * is divided evenly between cells for which {@code expand} is {@code true}.
     * <p>
     * Note that reusing the same cell renderer is not supported.
     * @param cell a {@code GtkCellRenderer}
     * @param expand {@code true} if {@code cell} is to be given extra space allocated to {@code cell_layout}
     */
    default void packStart(org.gtk.gtk.CellRenderer cell, boolean expand) {
        try {
            DowncallHandles.gtk_cell_layout_pack_start.invokeExact(
                    handle(),
                    cell.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Re-inserts {@code cell} at {@code position}.
     * <p>
     * Note that {@code cell} has already to be packed into {@code cell_layout}
     * for this to function properly.
     * @param cell a {@code GtkCellRenderer} to reorder
     * @param position new position to insert {@code cell} at
     */
    default void reorder(org.gtk.gtk.CellRenderer cell, int position) {
        try {
            DowncallHandles.gtk_cell_layout_reorder.invokeExact(
                    handle(),
                    cell.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the attributes in the parameter list as the attributes
     * of {@code cell_layout}.
     * <p>
     * See {@link CellLayout#addAttribute} for more details.
     * <p>
     * The attributes should be in attribute/column order, as in
     * gtk_cell_layout_add_attribute(). All existing attributes are
     * removed, and replaced with the new attributes.
     * @param cell a {@code GtkCellRenderer}
     * @param varargs a {@code null}-terminated list of attributes
     */
    default void setAttributes(org.gtk.gtk.CellRenderer cell, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_cell_layout_set_attributes.invokeExact(
                    handle(),
                    cell.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkCellLayout}DataFunc to use for {@code cell_layout}.
     * <p>
     * This function is used instead of the standard attributes mapping
     * for setting the column value, and should set the value of {@code cell_layout}’s
     * cell renderer(s) as appropriate.
     * <p>
     * {@code func} may be {@code null} to remove a previously set function.
     * @param cell a {@code GtkCellRenderer}
     * @param func the {@code GtkCellLayout}DataFunc to use
     * @param destroy destroy notify for {@code func_data}
     */
    default void setCellDataFunc(org.gtk.gtk.CellRenderer cell, @Nullable org.gtk.gtk.CellLayoutDataFunc func, org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_cell_layout_set_cell_data_func.invokeExact(
                    handle(),
                    cell.handle(),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_add_attribute = Interop.downcallHandle(
            "gtk_cell_layout_add_attribute",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_clear = Interop.downcallHandle(
            "gtk_cell_layout_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_clear_attributes = Interop.downcallHandle(
            "gtk_cell_layout_clear_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_get_area = Interop.downcallHandle(
            "gtk_cell_layout_get_area",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_get_cells = Interop.downcallHandle(
            "gtk_cell_layout_get_cells",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_pack_end = Interop.downcallHandle(
            "gtk_cell_layout_pack_end",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_pack_start = Interop.downcallHandle(
            "gtk_cell_layout_pack_start",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_reorder = Interop.downcallHandle(
            "gtk_cell_layout_reorder",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_set_attributes = Interop.downcallHandle(
            "gtk_cell_layout_set_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_set_cell_data_func = Interop.downcallHandle(
            "gtk_cell_layout_set_cell_data_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_cell_layout_get_type = Interop.downcallHandle(
            "gtk_cell_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class CellLayoutImpl extends org.gtk.gobject.GObject implements CellLayout {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public CellLayoutImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
