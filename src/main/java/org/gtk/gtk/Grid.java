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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a Grid proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Grid(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Grid if its GType is a (or inherits from) "GtkGrid".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Grid} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGrid", a ClassCastException will be thrown.
     */
    public static Grid castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Grid.getType())) {
            return new Grid(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGrid");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public void attach(@NotNull org.gtk.gtk.Widget child, int column, int row, int width, int height) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public void attachNextTo(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling, @NotNull org.gtk.gtk.PositionType side, int width, int height) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(side, "Parameter 'side' must not be null");
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
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
        return RESULT != 0;
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
    public @NotNull org.gtk.gtk.BaselinePosition getRowBaselinePosition(int row) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_grid_get_row_baseline_position.invokeExact(
                    handle(),
                    row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BaselinePosition(RESULT);
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
        return RESULT != 0;
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
    public void insertNextTo(@NotNull org.gtk.gtk.Widget sibling, @NotNull org.gtk.gtk.PositionType side) {
        java.util.Objects.requireNonNull(sibling, "Parameter 'sibling' must not be null");
        java.util.Objects.requireNonNull(side, "Parameter 'side' must not be null");
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
    public void queryChild(@NotNull org.gtk.gtk.Widget child, Out<Integer> column, Out<Integer> row, Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(column, "Parameter 'column' must not be null");
        MemorySegment columnPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(row, "Parameter 'row' must not be null");
        MemorySegment rowPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_grid_query_child.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) columnPOINTER.address(),
                    (Addressable) rowPOINTER.address(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        column.set(columnPOINTER.get(Interop.valueLayout.C_INT, 0));
        row.set(rowPOINTER.get(Interop.valueLayout.C_INT, 0));
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Removes a child from {@code grid}.
     * <p>
     * The child must have been added with
     * {@link Grid#attach} or {@link Grid#attachNextTo}.
     * @param child the child widget to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
                    homogeneous ? 1 : 0);
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
    public void setRowBaselinePosition(int row, @NotNull org.gtk.gtk.BaselinePosition pos) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
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
                    homogeneous ? 1 : 0);
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_grid_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Grid.Build} object constructs a {@link Grid} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Grid} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Grid} using {@link Grid#castFrom}.
         * @return A new instance of {@code Grid} with the properties 
         *         that were set in the Build object.
         */
        public Grid construct() {
            return Grid.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Grid.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The row to align to the baseline when valign is {@link Align#BASELINE}.
         * @param baselineRow The value for the {@code baseline-row} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBaselineRow(int baselineRow) {
            names.add("baseline-row");
            values.add(org.gtk.gobject.Value.create(baselineRow));
            return this;
        }
        
        /**
         * If {@code true}, the columns are all the same width.
         * @param columnHomogeneous The value for the {@code column-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnHomogeneous(boolean columnHomogeneous) {
            names.add("column-homogeneous");
            values.add(org.gtk.gobject.Value.create(columnHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between two consecutive columns.
         * @param columnSpacing The value for the {@code column-spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setColumnSpacing(int columnSpacing) {
            names.add("column-spacing");
            values.add(org.gtk.gobject.Value.create(columnSpacing));
            return this;
        }
        
        /**
         * If {@code true}, the rows are all the same height.
         * @param rowHomogeneous The value for the {@code row-homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRowHomogeneous(boolean rowHomogeneous) {
            names.add("row-homogeneous");
            values.add(org.gtk.gobject.Value.create(rowHomogeneous));
            return this;
        }
        
        /**
         * The amount of space between two consecutive rows.
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
