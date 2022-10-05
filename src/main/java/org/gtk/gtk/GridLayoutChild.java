package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkGridLayout}.
 */
public class GridLayoutChild extends LayoutChild {

    public GridLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GridLayoutChild */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayoutChild(gobject.refcounted());
    }
    
    static final MethodHandle gtk_grid_layout_child_get_column = Interop.downcallHandle(
        "gtk_grid_layout_child_get_column",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the column number to which {@code child} attaches its left side.
     */
    public int getColumn() {
        try {
            var RESULT = (int) gtk_grid_layout_child_get_column.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_get_column_span = Interop.downcallHandle(
        "gtk_grid_layout_child_get_column_span",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of columns that {@code child} spans to.
     */
    public int getColumnSpan() {
        try {
            var RESULT = (int) gtk_grid_layout_child_get_column_span.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_get_row = Interop.downcallHandle(
        "gtk_grid_layout_child_get_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the row number to which {@code child} attaches its top side.
     */
    public int getRow() {
        try {
            var RESULT = (int) gtk_grid_layout_child_get_row.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_get_row_span = Interop.downcallHandle(
        "gtk_grid_layout_child_get_row_span",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of rows that {@code child} spans to.
     */
    public int getRowSpan() {
        try {
            var RESULT = (int) gtk_grid_layout_child_get_row_span.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_set_column = Interop.downcallHandle(
        "gtk_grid_layout_child_set_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the column number to attach the left side of {@code child}.
     */
    public void setColumn(int column) {
        try {
            gtk_grid_layout_child_set_column.invokeExact(handle(), column);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_set_column_span = Interop.downcallHandle(
        "gtk_grid_layout_child_set_column_span",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of columns {@code child} spans to.
     */
    public void setColumnSpan(int span) {
        try {
            gtk_grid_layout_child_set_column_span.invokeExact(handle(), span);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_set_row = Interop.downcallHandle(
        "gtk_grid_layout_child_set_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the row to place {@code child} in.
     */
    public void setRow(int row) {
        try {
            gtk_grid_layout_child_set_row.invokeExact(handle(), row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_child_set_row_span = Interop.downcallHandle(
        "gtk_grid_layout_child_set_row_span",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of rows {@code child} spans to.
     */
    public void setRowSpan(int span) {
        try {
            gtk_grid_layout_child_set_row_span.invokeExact(handle(), span);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
