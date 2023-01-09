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
     */
    protected GridLayoutChild(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GridLayoutChild> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GridLayoutChild(input);
    
    /**
     * Retrieves the column number to which {@code child} attaches its left side.
     * @return the column number
     */
    public int getColumn() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_column.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_column_span.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_row.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_grid_layout_child_get_row_span.invokeExact(handle());
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_grid_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link GridLayoutChild.Builder} object constructs a {@link GridLayoutChild} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GridLayoutChild.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutChild.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GridLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GridLayoutChild}.
         * @return A new instance of {@code GridLayoutChild} with the properties 
         *         that were set in the Builder object.
         */
        public GridLayoutChild build() {
            return (GridLayoutChild) org.gtk.gobject.GObject.newWithProperties(
                GridLayoutChild.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The column to place the child in.
         * @param column The value for the {@code column} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColumn(int column) {
            names.add("column");
            values.add(org.gtk.gobject.Value.create(column));
            return this;
        }
        
        /**
         * The number of columns the child spans to.
         * @param columnSpan The value for the {@code column-span} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColumnSpan(int columnSpan) {
            names.add("column-span");
            values.add(org.gtk.gobject.Value.create(columnSpan));
            return this;
        }
        
        /**
         * The row to place the child in.
         * @param row The value for the {@code row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRow(int row) {
            names.add("row");
            values.add(org.gtk.gobject.Value.create(row));
            return this;
        }
        
        /**
         * The number of rows the child spans to.
         * @param rowSpan The value for the {@code row-span} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRowSpan(int rowSpan) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_grid_layout_child_get_type != null;
    }
}
