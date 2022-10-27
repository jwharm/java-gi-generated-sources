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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public GridLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GridLayoutChild */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayoutChild(gobject.refcounted());
    }
    
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
            DowncallHandles.gtk_grid_layout_child_set_column.invokeExact(handle(), column);
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
            DowncallHandles.gtk_grid_layout_child_set_column_span.invokeExact(handle(), span);
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
            DowncallHandles.gtk_grid_layout_child_set_row.invokeExact(handle(), row);
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
            DowncallHandles.gtk_grid_layout_child_set_row_span.invokeExact(handle(), span);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_layout_child_get_column = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_column_span",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_child_get_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_get_row_span",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_column_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_column_span",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_child_set_row_span = Interop.downcallHandle(
            "gtk_grid_layout_child_set_row_span",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
