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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GridLayoutChild" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGridLayoutChild", a ClassCastException will be thrown.
     */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGridLayoutChild"))) {
            return new GridLayoutChild(gobject.handle(), gobject.refcounted().getOwnership());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_layout_child_get_column = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column_span",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row_span",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column_span",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row_span",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
