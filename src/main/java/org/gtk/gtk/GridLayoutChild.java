package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkGridLayout}.
 */
public class GridLayoutChild extends org.gtk.gtk.LayoutChild {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGridLayoutChild";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GridLayoutChild proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GridLayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GridLayoutChild if its GType is a (or inherits from) "GtkGridLayoutChild".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GridLayoutChild} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGridLayoutChild", a ClassCastException will be thrown.
     */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GridLayoutChild.getType())) {
            return new GridLayoutChild(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGridLayoutChild");
        }
    }
    
    /**
     * Retrieves the column number to which {@code child} attaches its left side.
     * @return the column number
     */
    public int getColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_column.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the number of columns that {@code child} spans to.
     * @return the number of columns
     */
    public int getColumnSpan() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_column_span.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the row number to which {@code child} attaches its top side.
     * @return the row number
     */
    public int getRow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the number of rows that {@code child} spans to.
     * @return the number of row
     */
    public int getRowSpan() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_row_span.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the column number to attach the left side of {@code child}.
     * @param column the attach point for {@code child}
     */
    public void setColumn(int column) {
        try {
            DowncallHandles.gtk_grid_layout_child_set_column.invokeExact(
                    handle(),
                    column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of columns {@code child} spans to.
     * @param span the span of {@code child}
     */
    public void setColumnSpan(int span) {
        try {
            DowncallHandles.gtk_grid_layout_child_set_column_span.invokeExact(
                    handle(),
                    span);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the row to place {@code child} in.
     * @param row the row for {@code child}
     */
    public void setRow(int row) {
        try {
            DowncallHandles.gtk_grid_layout_child_set_row.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of rows {@code child} spans to.
     * @param span the span of {@code child}
     */
    public void setRowSpan(int span) {
        try {
            DowncallHandles.gtk_grid_layout_child_set_row_span.invokeExact(
                    handle(),
                    span);
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
            RESULT = (long) DowncallHandles.gtk_grid_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutChild.Build {
        
         /**
         * A {@link GridLayoutChild.Build} object constructs a {@link GridLayoutChild} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GridLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GridLayoutChild} using {@link GridLayoutChild#castFrom}.
         * @return A new instance of {@code GridLayoutChild} with the properties 
         *         that were set in the Build object.
         */
        public GridLayoutChild construct() {
            return GridLayoutChild.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GridLayoutChild.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The column to place the child in.
         * @param column The value for the {@code column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumn(int column) {
            names.add("column");
            values.add(org.gtk.gobject.Value.create(column));
            return this;
        }
        
        /**
         * The number of columns the child spans to.
         * @param columnSpan The value for the {@code column-span} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnSpan(int columnSpan) {
            names.add("column-span");
            values.add(org.gtk.gobject.Value.create(columnSpan));
            return this;
        }
        
        /**
         * The row to place the child in.
         * @param row The value for the {@code row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRow(int row) {
            names.add("row");
            values.add(org.gtk.gobject.Value.create(row));
            return this;
        }
        
        /**
         * The number of rows the child spans to.
         * @param rowSpan The value for the {@code row-span} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRowSpan(int rowSpan) {
            names.add("row-span");
            values.add(org.gtk.gobject.Value.create(rowSpan));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_layout_child_get_column = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column_span",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row_span",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column_span",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row_span",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_type = Interop.downcallHandle(
            "gtk_grid_layout_child_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
