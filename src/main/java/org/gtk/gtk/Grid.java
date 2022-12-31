package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGrid} is a container which arranges its child widgets in
 * rows and columns.
 * <p>
 * <img src="./doc-files/grid.png" alt="An example GtkGrid">
 * <p>
 * It supports arbitrary positions and horizontal/vertical spans.
 * <p>
 * Children are added using {@link Grid#attach}. They can span multiple
 * rows or columns. It is also possible to add a child next to an existing
 * child, using {@link Grid#attachNextTo}. To remove a child from the
 * grid, use {@link Grid#remove}.
 * <p>
 * The behaviour of {@code GtkGrid} when several children occupy the same grid
 * cell is undefined.
 * <p>
 * <strong>GtkGrid as GtkBuildable</strong><br/>
 * Every child in a {@code GtkGrid} has access to a custom {@code Gtk.Buildable}
 * element, called {@code <layout>}. It can by used to specify a position in the
 * grid and optionally spans. All properties that can be used in the {@code <layout>}
 * element are implemented by {@link GridLayoutChild}.
 * <p>
 * It is implemented by {@code GtkWidget} using {@link LayoutManager}.
 * <p>
 * To showcase it, here is a simple example:
 * <pre>{@code xml
 * <object class="GtkGrid" id="my_grid">
 *   <child>
 *     <object class="GtkButton" id="button1">
 *       <property name="label">Button 1</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">0</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button2">
 *       <property name="label">Button 2</property>
 *       <layout>
 *         <property name="column">1</property>
 *         <property name="row">0</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button3">
 *       <property name="label">Button 3</property>
 *       <layout>
 *         <property name="column">2</property>
 *         <property name="row">0</property>
 *         <property name="row-span">2</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkButton" id="button4">
 *       <property name="label">Button 4</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">1</property>
 *         <property name="column-span">2</property>
 *       </layout>
 *     </object>
 *   </child>
 * </object>
 * }</pre>
 * <p>
 * It organizes the first two buttons side-by-side in one cell each.
 * The third button is in the last column but spans across two rows.
 * This is defined by the {@code row-span} property. The last button is
 * located in the second row and spans across two columns, which is
 * defined by the {@code column-span} property.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkGrid} uses a single CSS node with name {@code grid}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkGrid} uses the {@link AccessibleRole#GROUP} role.
 */
public class Grid extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGrid";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Grid proxy instance for the provided memory address.
     * <p>
     * Because Grid is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Grid(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Grid> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Grid(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new grid widget.
     */
    public Grid() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a widget to the grid.
     * <p>
     * The position of {@code child} is determined by {@code column} and {@code row}.
     * The number of “cells” that {@code child} will occupy is determined
     * by {@code width} and {@code height}.
     * @param child the widget to add
     * @param column the column number to attach the left side of {@code child} to
     * @param row the row number to attach the top side of {@code child} to
     * @param width the number of columns that {@code child} will span
     * @param height the number of rows that {@code child} will span
     */
    public void attach(org.gtk.gtk.Widget child, int column, int row, int width, int height) {
        try {
            DowncallHandles.gtk_grid_attach.invokeExact(
                    handle(),
                    child.handle(),
                    column,
                    row,
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a widget to the grid.
     * <p>
     * The widget is placed next to {@code sibling}, on the side determined by
     * {@code side}. When {@code sibling} is {@code null}, the widget is placed in row (for
     * left or right placement) or column 0 (for top or bottom placement),
     * at the end indicated by {@code side}.
     * <p>
     * Attaching widgets labeled {@code [1]}, {@code [2]}, {@code [3]} with {@code @sibling == %NULL} and
     * {@code @side == %GTK_POS_LEFT} yields a layout of {@code [3][2][1]}.
     * @param child the widget to add
     * @param sibling the child of {@code grid} that {@code child} will be placed
     *   next to, or {@code null} to place {@code child} at the beginning or end
     * @param side the side of {@code sibling} that {@code child} is positioned next to
     * @param width the number of columns that {@code child} will span
     * @param height the number of rows that {@code child} will span
     */
    public void attachNextTo(org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling, org.gtk.gtk.PositionType side, int width, int height) {
        try {
            DowncallHandles.gtk_grid_attach_next_to.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()),
                    side.getValue(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns which row defines the global baseline of {@code grid}.
     * @return the row index defining the global baseline
     */
    public int getBaselineRow() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_baseline_row.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the child of {@code grid} whose area covers the grid
     * cell at {@code column}, {@code row}.
     * @param column the left edge of the cell
     * @param row the top edge of the cell
     * @return the child at the given position
     */
    public @Nullable org.gtk.gtk.Widget getChildAt(int column, int row) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_grid_get_child_at.invokeExact(
                    handle(),
                    column,
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether all columns of {@code grid} have the same width.
     * @return whether all columns of {@code grid} have the same width.
     */
    public boolean getColumnHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_column_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the amount of space between the columns of {@code grid}.
     * @return the column spacing of {@code grid}
     */
    public int getColumnSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_column_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the baseline position of {@code row}.
     * <p>
     * See {@link Grid#setRowBaselinePosition}.
     * @param row a row index
     * @return the baseline position of {@code row}
     */
    public org.gtk.gtk.BaselinePosition getRowBaselinePosition(int row) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_row_baseline_position.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.BaselinePosition.of(RESULT);
    }
    
    /**
     * Returns whether all rows of {@code grid} have the same height.
     * @return whether all rows of {@code grid} have the same height.
     */
    public boolean getRowHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_row_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the amount of space between the rows of {@code grid}.
     * @return the row spacing of {@code grid}
     */
    public int getRowSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_row_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts a column at the specified position.
     * <p>
     * Children which are attached at or to the right of this position
     * are moved one column to the right. Children which span across this
     * position are grown to span the new column.
     * @param position the position to insert the column at
     */
    public void insertColumn(int position) {
        try {
            DowncallHandles.gtk_grid_insert_column.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a row or column at the specified position.
     * <p>
     * The new row or column is placed next to {@code sibling}, on the side
     * determined by {@code side}. If {@code side} is {@link PositionType#TOP} or {@link PositionType#BOTTOM},
     * a row is inserted. If {@code side} is {@link PositionType#LEFT} of {@link PositionType#RIGHT},
     * a column is inserted.
     * @param sibling the child of {@code grid} that the new row or column will be
     *   placed next to
     * @param side the side of {@code sibling} that {@code child} is positioned next to
     */
    public void insertNextTo(org.gtk.gtk.Widget sibling, org.gtk.gtk.PositionType side) {
        try {
            DowncallHandles.gtk_grid_insert_next_to.invokeExact(
                    handle(),
                    sibling.handle(),
                    side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts a row at the specified position.
     * <p>
     * Children which are attached at or below this position
     * are moved one row down. Children which span across this
     * position are grown to span the new row.
     * @param position the position to insert the row at
     */
    public void insertRow(int position) {
        try {
            DowncallHandles.gtk_grid_insert_row.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Queries the attach points and spans of {@code child} inside the given {@code GtkGrid}.
     * @param child a {@code GtkWidget} child of {@code grid}
     * @param column the column used to attach the left side of {@code child}
     * @param row the row used to attach the top side of {@code child}
     * @param width the number of columns {@code child} spans
     * @param height the number of rows {@code child} spans
     */
    public void queryChild(org.gtk.gtk.Widget child, Out<Integer> column, Out<Integer> row, Out<Integer> width, Out<Integer> height) {
        MemorySegment columnPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment rowPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_grid_query_child.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (column == null ? MemoryAddress.NULL : (Addressable) columnPOINTER.address()),
                    (Addressable) (row == null ? MemoryAddress.NULL : (Addressable) rowPOINTER.address()),
                    (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                    (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (column != null) column.set(columnPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (row != null) row.set(rowPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Removes a child from {@code grid}.
     * <p>
     * The child must have been added with
     * {@link Grid#attach} or {@link Grid#attachNextTo}.
     * @param child the child widget to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_grid_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a column from the grid.
     * <p>
     * Children that are placed in this column are removed,
     * spanning children that overlap this column have their
     * width reduced by one, and children after the column
     * are moved to the left.
     * @param position the position of the column to remove
     */
    public void removeColumn(int position) {
        try {
            DowncallHandles.gtk_grid_remove_column.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a row from the grid.
     * <p>
     * Children that are placed in this row are removed,
     * spanning children that overlap this row have their
     * height reduced by one, and children below the row
     * are moved up.
     * @param position the position of the row to remove
     */
    public void removeRow(int position) {
        try {
            DowncallHandles.gtk_grid_remove_row.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            DowncallHandles.gtk_grid_set_baseline_row.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether all columns of {@code grid} will have the same width.
     * @param homogeneous {@code true} to make columns homogeneous
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_grid_set_column_homogeneous.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(homogeneous, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of space between columns of {@code grid}.
     * @param spacing the amount of space to insert between columns
     */
    public void setColumnSpacing(int spacing) {
        try {
            DowncallHandles.gtk_grid_set_column_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how the baseline should be positioned on {@code row} of the
     * grid, in case that row is assigned more space than is requested.
     * <p>
     * The default baseline position is {@link BaselinePosition#CENTER}.
     * @param row a row index
     * @param pos a {@code GtkBaselinePosition}
     */
    public void setRowBaselinePosition(int row, org.gtk.gtk.BaselinePosition pos) {
        try {
            DowncallHandles.gtk_grid_set_row_baseline_position.invokeExact(
                    handle(),
                    row,
                    pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether all rows of {@code grid} will have the same height.
     * @param homogeneous {@code true} to make rows homogeneous
     */
    public void setRowHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_grid_set_row_homogeneous.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(homogeneous, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the amount of space between rows of {@code grid}.
     * @param spacing the amount of space to insert between rows
     */
    public void setRowSpacing(int spacing) {
        try {
            DowncallHandles.gtk_grid_set_row_spacing.invokeExact(
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_grid_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Grid.Builder} object constructs a {@link Grid} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Grid.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Grid} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Grid}.
         * @return A new instance of {@code Grid} with the properties 
         *         that were set in the Builder object.
         */
        public Grid build() {
            return (Grid) org.gtk.gobject.GObject.newWithProperties(
                Grid.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The row to align to the baseline when valign is {@link Align#BASELINE}.
         * @param baselineRow The value for the {@code baseline-row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaselineRow(int baselineRow) {
            names.add("baseline-row");
            values.add(org.gtk.gobject.Value.create(baselineRow));
            return this;
        }
        
        /**
         * If {@code true}, the columns are all the same width.
         * @param columnHomogeneous The value for the {@code column-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColumnHomogeneous(boolean columnHomogeneous) {
            names.add("column-homogeneous");
            values.add(org.gtk.gobject.Value.create(columnHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between two consecutive columns.
         * @param columnSpacing The value for the {@code column-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setColumnSpacing(int columnSpacing) {
            names.add("column-spacing");
            values.add(org.gtk.gobject.Value.create(columnSpacing));
            return this;
        }
        
        /**
         * If {@code true}, the rows are all the same height.
         * @param rowHomogeneous The value for the {@code row-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRowHomogeneous(boolean rowHomogeneous) {
            names.add("row-homogeneous");
            values.add(org.gtk.gobject.Value.create(rowHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between two consecutive rows.
         * @param rowSpacing The value for the {@code row-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRowSpacing(int rowSpacing) {
            names.add("row-spacing");
            values.add(org.gtk.gobject.Value.create(rowSpacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_grid_new = Interop.downcallHandle(
            "gtk_grid_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_attach = Interop.downcallHandle(
            "gtk_grid_attach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_attach_next_to = Interop.downcallHandle(
            "gtk_grid_attach_next_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_get_baseline_row = Interop.downcallHandle(
            "gtk_grid_get_baseline_row",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_get_child_at = Interop.downcallHandle(
            "gtk_grid_get_child_at",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_get_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_get_column_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_get_column_spacing = Interop.downcallHandle(
            "gtk_grid_get_column_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_get_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_get_row_baseline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_get_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_get_row_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_get_row_spacing = Interop.downcallHandle(
            "gtk_grid_get_row_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_insert_column = Interop.downcallHandle(
            "gtk_grid_insert_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_insert_next_to = Interop.downcallHandle(
            "gtk_grid_insert_next_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_insert_row = Interop.downcallHandle(
            "gtk_grid_insert_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_query_child = Interop.downcallHandle(
            "gtk_grid_query_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_remove = Interop.downcallHandle(
            "gtk_grid_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_grid_remove_column = Interop.downcallHandle(
            "gtk_grid_remove_column",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_remove_row = Interop.downcallHandle(
            "gtk_grid_remove_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_baseline_row = Interop.downcallHandle(
            "gtk_grid_set_baseline_row",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_column_homogeneous = Interop.downcallHandle(
            "gtk_grid_set_column_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_column_spacing = Interop.downcallHandle(
            "gtk_grid_set_column_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_row_baseline_position = Interop.downcallHandle(
            "gtk_grid_set_row_baseline_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_row_homogeneous = Interop.downcallHandle(
            "gtk_grid_set_row_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_set_row_spacing = Interop.downcallHandle(
            "gtk_grid_set_row_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_grid_get_type = Interop.downcallHandle(
            "gtk_grid_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
