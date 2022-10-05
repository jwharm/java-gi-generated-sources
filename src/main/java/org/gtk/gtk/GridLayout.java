package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGridLayout} is a layout manager which arranges child widgets in
 * rows and columns.
 * <p>
 * Children have an "attach point" defined by the horizontal and vertical
 * index of the cell they occupy; children can span multiple rows or columns.
 * The layout properties for setting the attach points and spans are set
 * using the {@link GridLayoutChild} associated to each child widget.
 * <p>
 * The behaviour of {@code GtkGridLayout} when several children occupy the same
 * grid cell is undefined.
 * <p>
 * {@code GtkGridLayout} can be used like a {@code GtkBoxLayout} if all children are
 * attached to the same row or column; however, if you only ever need a
 * single row or column, you should consider using {@code GtkBoxLayout}.
 */
public class GridLayout extends LayoutManager {

    public GridLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GridLayout */
    public static GridLayout castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayout(gobject.refcounted());
    }
    
    static final MethodHandle gtk_grid_layout_new = Interop.downcallHandle(
        "gtk_grid_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_grid_layout_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkGridLayout}.
     */
    public GridLayout() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_grid_layout_get_baseline_row = Interop.downcallHandle(
        "gtk_grid_layout_get_baseline_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the row set with gtk_grid_layout_set_baseline_row().
     */
    public int getBaselineRow() {
        try {
            var RESULT = (int) gtk_grid_layout_get_baseline_row.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_get_column_homogeneous = Interop.downcallHandle(
        "gtk_grid_layout_get_column_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether all columns of {@code grid} should have the same width.
     */
    public boolean getColumnHomogeneous() {
        try {
            var RESULT = (int) gtk_grid_layout_get_column_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_get_column_spacing = Interop.downcallHandle(
        "gtk_grid_layout_get_column_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     */
    public int getColumnSpacing() {
        try {
            var RESULT = (int) gtk_grid_layout_get_column_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_get_row_baseline_position = Interop.downcallHandle(
        "gtk_grid_layout_get_row_baseline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the baseline position of {@code row}.
     * <p>
     * If no value has been set with
     * {@link GridLayout#setRowBaselinePosition},
     * the default value of {@link BaselinePosition#CENTER}
     * is returned.
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        try {
            var RESULT = (int) gtk_grid_layout_get_row_baseline_position.invokeExact(handle(), row);
            return new BaselinePosition(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_get_row_homogeneous = Interop.downcallHandle(
        "gtk_grid_layout_get_row_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether all rows of {@code grid} should have the same height.
     */
    public boolean getRowHomogeneous() {
        try {
            var RESULT = (int) gtk_grid_layout_get_row_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_get_row_spacing = Interop.downcallHandle(
        "gtk_grid_layout_get_row_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
     */
    public int getRowSpacing() {
        try {
            var RESULT = (int) gtk_grid_layout_get_row_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_baseline_row = Interop.downcallHandle(
        "gtk_grid_layout_set_baseline_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets which row defines the global baseline for the entire grid.
     * <p>
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the {@code grid}.
     */
    public void setBaselineRow(int row) {
        try {
            gtk_grid_layout_set_baseline_row.invokeExact(handle(), row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_column_homogeneous = Interop.downcallHandle(
        "gtk_grid_layout_set_column_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether all columns of {@code grid} should have the same width.
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        try {
            gtk_grid_layout_set_column_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_column_spacing = Interop.downcallHandle(
        "gtk_grid_layout_set_column_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of space to insert between consecutive columns.
     */
    public void setColumnSpacing(int spacing) {
        try {
            gtk_grid_layout_set_column_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_row_baseline_position = Interop.downcallHandle(
        "gtk_grid_layout_set_row_baseline_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets how the baseline should be positioned on {@code row} of the
     * grid, in case that row is assigned more space than is requested.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        try {
            gtk_grid_layout_set_row_baseline_position.invokeExact(handle(), row, pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_row_homogeneous = Interop.downcallHandle(
        "gtk_grid_layout_set_row_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether all rows of {@code grid} should have the same height.
     */
    public void setRowHomogeneous(boolean homogeneous) {
        try {
            gtk_grid_layout_set_row_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_layout_set_row_spacing = Interop.downcallHandle(
        "gtk_grid_layout_set_row_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of space to insert between consecutive rows.
     */
    public void setRowSpacing(int spacing) {
        try {
            gtk_grid_layout_set_row_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
