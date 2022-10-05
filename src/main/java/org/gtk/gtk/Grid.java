package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h1>GtkGrid as GtkBuildable</h1>
 * <p>
 * Every child in a {@code GtkGrid} has access to a custom {@code Gtk.Buildable}
 * element, called {@code <layout>}. It can by used to specify a position in the
 * grid and optionally spans. All properties that can be used in the {@code <layout>}
 * element are implemented by {@link GridLayoutChild}.
 * <p>
 * It is implemented by {@code GtkWidget} using {@link LayoutManager}.
 * <p>
 * To showcase it, here is a simple example:
 * <p>
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
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkGrid} uses a single CSS node with name {@code grid}.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkGrid} uses the {@link AccessibleRole#GROUP} role.
 */
public class Grid extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Grid(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Grid */
    public static Grid castFrom(org.gtk.gobject.Object gobject) {
        return new Grid(gobject.refcounted());
    }
    
    static final MethodHandle gtk_grid_new = Interop.downcallHandle(
        "gtk_grid_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_grid_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new grid widget.
     */
    public Grid() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_grid_attach = Interop.downcallHandle(
        "gtk_grid_attach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds a widget to the grid.
     * <p>
     * The position of {@code child} is determined by {@code column} and {@code row}.
     * The number of “cells” that {@code child} will occupy is determined
     * by {@code width} and {@code height}.
     */
    public void attach(Widget child, int column, int row, int width, int height) {
        try {
            gtk_grid_attach.invokeExact(handle(), child.handle(), column, row, width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_attach_next_to = Interop.downcallHandle(
        "gtk_grid_attach_next_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public void attachNextTo(Widget child, Widget sibling, PositionType side, int width, int height) {
        try {
            gtk_grid_attach_next_to.invokeExact(handle(), child.handle(), sibling.handle(), side.getValue(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_baseline_row = Interop.downcallHandle(
        "gtk_grid_get_baseline_row",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns which row defines the global baseline of {@code grid}.
     */
    public int getBaselineRow() {
        try {
            var RESULT = (int) gtk_grid_get_baseline_row.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_child_at = Interop.downcallHandle(
        "gtk_grid_get_child_at",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the child of {@code grid} whose area covers the grid
     * cell at {@code column}, {@code row}.
     */
    public Widget getChildAt(int column, int row) {
        try {
            var RESULT = (MemoryAddress) gtk_grid_get_child_at.invokeExact(handle(), column, row);
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_column_homogeneous = Interop.downcallHandle(
        "gtk_grid_get_column_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether all columns of {@code grid} have the same width.
     */
    public boolean getColumnHomogeneous() {
        try {
            var RESULT = (int) gtk_grid_get_column_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_column_spacing = Interop.downcallHandle(
        "gtk_grid_get_column_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the amount of space between the columns of {@code grid}.
     */
    public int getColumnSpacing() {
        try {
            var RESULT = (int) gtk_grid_get_column_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_row_baseline_position = Interop.downcallHandle(
        "gtk_grid_get_row_baseline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the baseline position of {@code row}.
     * <p>
     * See {@link Grid#setRowBaselinePosition}.
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        try {
            var RESULT = (int) gtk_grid_get_row_baseline_position.invokeExact(handle(), row);
            return new BaselinePosition(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_row_homogeneous = Interop.downcallHandle(
        "gtk_grid_get_row_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether all rows of {@code grid} have the same height.
     */
    public boolean getRowHomogeneous() {
        try {
            var RESULT = (int) gtk_grid_get_row_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_get_row_spacing = Interop.downcallHandle(
        "gtk_grid_get_row_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the amount of space between the rows of {@code grid}.
     */
    public int getRowSpacing() {
        try {
            var RESULT = (int) gtk_grid_get_row_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_insert_column = Interop.downcallHandle(
        "gtk_grid_insert_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a column at the specified position.
     * <p>
     * Children which are attached at or to the right of this position
     * are moved one column to the right. Children which span across this
     * position are grown to span the new column.
     */
    public void insertColumn(int position) {
        try {
            gtk_grid_insert_column.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_insert_next_to = Interop.downcallHandle(
        "gtk_grid_insert_next_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a row or column at the specified position.
     * <p>
     * The new row or column is placed next to {@code sibling}, on the side
     * determined by {@code side}. If {@code side} is {@link PositionType#TOP} or {@link PositionType#BOTTOM},
     * a row is inserted. If {@code side} is {@link PositionType#LEFT} of {@link PositionType#RIGHT},
     * a column is inserted.
     */
    public void insertNextTo(Widget sibling, PositionType side) {
        try {
            gtk_grid_insert_next_to.invokeExact(handle(), sibling.handle(), side.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_insert_row = Interop.downcallHandle(
        "gtk_grid_insert_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts a row at the specified position.
     * <p>
     * Children which are attached at or below this position
     * are moved one row down. Children which span across this
     * position are grown to span the new row.
     */
    public void insertRow(int position) {
        try {
            gtk_grid_insert_row.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_query_child = Interop.downcallHandle(
        "gtk_grid_query_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the attach points and spans of {@code child} inside the given {@code GtkGrid}.
     */
    public void queryChild(Widget child, PointerInteger column, PointerInteger row, PointerInteger width, PointerInteger height) {
        try {
            gtk_grid_query_child.invokeExact(handle(), child.handle(), column.handle(), row.handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_remove = Interop.downcallHandle(
        "gtk_grid_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child from {@code grid}.
     * <p>
     * The child must have been added with
     * {@code Gtk.Grid.attach_next_to}.
     */
    public void remove(Widget child) {
        try {
            gtk_grid_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_remove_column = Interop.downcallHandle(
        "gtk_grid_remove_column",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes a column from the grid.
     * <p>
     * Children that are placed in this column are removed,
     * spanning children that overlap this column have their
     * width reduced by one, and children after the column
     * are moved to the left.
     */
    public void removeColumn(int position) {
        try {
            gtk_grid_remove_column.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_remove_row = Interop.downcallHandle(
        "gtk_grid_remove_row",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes a row from the grid.
     * <p>
     * Children that are placed in this row are removed,
     * spanning children that overlap this row have their
     * height reduced by one, and children below the row
     * are moved up.
     */
    public void removeRow(int position) {
        try {
            gtk_grid_remove_row.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_baseline_row = Interop.downcallHandle(
        "gtk_grid_set_baseline_row",
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
            gtk_grid_set_baseline_row.invokeExact(handle(), row);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_column_homogeneous = Interop.downcallHandle(
        "gtk_grid_set_column_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether all columns of {@code grid} will have the same width.
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        try {
            gtk_grid_set_column_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_column_spacing = Interop.downcallHandle(
        "gtk_grid_set_column_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of space between columns of {@code grid}.
     */
    public void setColumnSpacing(int spacing) {
        try {
            gtk_grid_set_column_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_row_baseline_position = Interop.downcallHandle(
        "gtk_grid_set_row_baseline_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets how the baseline should be positioned on {@code row} of the
     * grid, in case that row is assigned more space than is requested.
     * <p>
     * The default baseline position is {@link BaselinePosition#CENTER}.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        try {
            gtk_grid_set_row_baseline_position.invokeExact(handle(), row, pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_row_homogeneous = Interop.downcallHandle(
        "gtk_grid_set_row_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether all rows of {@code grid} will have the same height.
     */
    public void setRowHomogeneous(boolean homogeneous) {
        try {
            gtk_grid_set_row_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_grid_set_row_spacing = Interop.downcallHandle(
        "gtk_grid_set_row_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of space between rows of {@code grid}.
     */
    public void setRowSpacing(int spacing) {
        try {
            gtk_grid_set_row_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
