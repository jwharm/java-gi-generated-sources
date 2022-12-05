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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GridLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GridLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GridLayout if its GType is a (or inherits from) "GtkGridLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GridLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGridLayout", a ClassCastException will be thrown.
     */
    public static GridLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GridLayout.getType())) {
            return new GridLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGridLayout");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_layout_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGridLayout}.
     */
    public GridLayout() {
        super(constructNew(), Ownership.FULL);
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
        return org.gtk.gtk.BaselinePosition.of(RESULT);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_grid_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutManager.Build {
        
         /**
         * A {@link GridLayout.Build} object constructs a {@link GridLayout} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GridLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GridLayout} using {@link GridLayout#castFrom}.
         * @return A new instance of {@code GridLayout} with the properties 
         *         that were set in the Build object.
         */
        public GridLayout construct() {
            return GridLayout.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GridLayout.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The row to align to the baseline, when {@code GtkWidget:valign} is set
         * to {@link Align#BASELINE}.
         * @param baselineRow The value for the {@code baseline-row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBaselineRow(int baselineRow) {
            names.add("baseline-row");
            values.add(org.gtk.gobject.Value.create(baselineRow));
            return this;
        }
        
        /**
         * Whether all the columns in the grid have the same width.
         * @param columnHomogeneous The value for the {@code column-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnHomogeneous(boolean columnHomogeneous) {
            names.add("column-homogeneous");
            values.add(org.gtk.gobject.Value.create(columnHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between to consecutive columns.
         * @param columnSpacing The value for the {@code column-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnSpacing(int columnSpacing) {
            names.add("column-spacing");
            values.add(org.gtk.gobject.Value.create(columnSpacing));
            return this;
        }
        
        /**
         * Whether all the rows in the grid have the same height.
         * @param rowHomogeneous The value for the {@code row-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRowHomogeneous(boolean rowHomogeneous) {
            names.add("row-homogeneous");
            values.add(org.gtk.gobject.Value.create(rowHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between to consecutive rows.
         * @param rowSpacing The value for the {@code row-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRowSpacing(int rowSpacing) {
            names.add("row-spacing");
            values.add(org.gtk.gobject.Value.create(rowSpacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_layout_new = Interop.downcallHandle(
            "gtk_grid_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_baseline_row = Interop.downcallHandle(
            "gtk_grid_layout_get_baseline_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_get_column_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_column_spacing = Interop.downcallHandle(
            "gtk_grid_layout_get_column_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_layout_get_row_baseline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_get_row_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_row_spacing = Interop.downcallHandle(
            "gtk_grid_layout_get_row_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_baseline_row = Interop.downcallHandle(
            "gtk_grid_layout_set_baseline_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_set_column_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_column_spacing = Interop.downcallHandle(
            "gtk_grid_layout_set_column_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_layout_set_row_baseline_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_layout_set_row_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_set_row_spacing = Interop.downcallHandle(
            "gtk_grid_layout_set_row_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_layout_get_type = Interop.downcallHandle(
            "gtk_grid_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
