package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class GridLayout extends org.gtk.gtk.LayoutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGridLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public GridLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to GridLayout if its GType is a (or inherits from) "GtkGridLayout".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "GridLayout" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGridLayout", a ClassCastException will be thrown.
     */
    public static GridLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkGridLayout"))) {
            return new GridLayout(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGridLayout");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_grid_layout_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGridLayout}.
     */
    public GridLayout() {
        super(constructNew());
    }
    
    /**
     * Retrieves the row set with gtk_grid_layout_set_baseline_row().
     * @return the global baseline row
     */
    public int getBaselineRow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_baseline_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks whether all columns of {@code grid} should have the same width.
     * @return {@code true} if the columns are homogeneous, and {@code false} otherwise
     */
    public boolean getColumnHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_column_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     * @return the spacing between consecutive columns
     */
    public int getColumnSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_column_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the baseline position of {@code row}.
     * <p>
     * If no value has been set with
     * {@link GridLayout#setRowBaselinePosition},
     * the default value of {@link BaselinePosition#CENTER}
     * is returned.
     * @param row a row index
     * @return the baseline position of {@code row}
     */
    public @NotNull org.gtk.gtk.BaselinePosition getRowBaselinePosition(int row) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_row_baseline_position.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BaselinePosition(RESULT);
    }
    
    /**
     * Checks whether all rows of {@code grid} should have the same height.
     * @return {@code true} if the rows are homogeneous, and {@code false} otherwise
     */
    public boolean getRowHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_row_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
     * @return the spacing between consecutive rows
     */
    public int getRowSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_layout_get_row_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets which row defines the global baseline for the entire grid.
     * <p>
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the {@code grid}.
     * @param row the row index
     */
    public void setBaselineRow(int row) {
        try {
            DowncallHandles.gtk_grid_layout_set_baseline_row.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether all columns of {@code grid} should have the same width.
     * @param homogeneous {@code true} to make columns homogeneous
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_grid_layout_set_column_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of space to insert between consecutive columns.
     * @param spacing the amount of space between columns, in pixels
     */
    public void setColumnSpacing(int spacing) {
        try {
            DowncallHandles.gtk_grid_layout_set_column_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how the baseline should be positioned on {@code row} of the
     * grid, in case that row is assigned more space than is requested.
     * @param row a row index
     * @param pos a {@code GtkBaselinePosition}
     */
    public void setRowBaselinePosition(int row, @NotNull org.gtk.gtk.BaselinePosition pos) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        try {
            DowncallHandles.gtk_grid_layout_set_row_baseline_position.invokeExact(
                    handle(),
                    row,
                    pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether all rows of {@code grid} should have the same height.
     * @param homogeneous {@code true} to make rows homogeneous
     */
    public void setRowHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_grid_layout_set_row_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of space to insert between consecutive rows.
     * @param spacing the amount of space between rows, in pixels
     */
    public void setRowSpacing(int spacing) {
        try {
            DowncallHandles.gtk_grid_layout_set_row_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_layout_new = Interop.downcallHandle(
            "gtk_grid_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_get_baseline_row = Interop.downcallHandle(
            "gtk_grid_layout_get_baseline_row",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_get_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_get_column_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_get_column_spacing = Interop.downcallHandle(
            "gtk_grid_layout_get_column_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_layout_get_row_baseline_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_get_row_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_spacing = Interop.downcallHandle(
            "gtk_grid_layout_get_row_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_grid_layout_set_baseline_row = Interop.downcallHandle(
            "gtk_grid_layout_set_baseline_row",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_set_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_set_column_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_set_column_spacing = Interop.downcallHandle(
            "gtk_grid_layout_set_column_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_layout_set_row_baseline_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_set_row_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_spacing = Interop.downcallHandle(
            "gtk_grid_layout_set_row_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
