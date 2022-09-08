package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGrid` is a container which arranges its child widgets in
 * rows and columns.
 * 
 * ![An example GtkGrid](grid.png)
 * 
 * It supports arbitrary positions and horizontal/vertical spans.
 * 
 * Children are added using [method@Gtk.Grid.attach]. They can span multiple
 * rows or columns. It is also possible to add a child next to an existing
 * child, using [method@Gtk.Grid.attach_next_to]. To remove a child from the
 * grid, use [method@Gtk.Grid.remove].
 * 
 * The behaviour of `GtkGrid` when several children occupy the same grid
 * cell is undefined.
 * 
 * # GtkGrid as GtkBuildable
 * 
 * Every child in a `GtkGrid` has access to a custom [iface@Gtk.Buildable]
 * element, called `<layout>`. It can by used to specify a position in the
 * grid and optionally spans. All properties that can be used in the `<layout>`
 * element are implemented by [class@Gtk.GridLayoutChild].
 * 
 * It is implemented by `GtkWidget` using [class@Gtk.LayoutManager].
 * 
 * To showcase it, here is a simple example:
 * 
 * ```xml
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
 * ```
 * 
 * It organizes the first two buttons side-by-side in one cell each.
 * The third button is in the last column but spans across two rows.
 * This is defined by the `row-span` property. The last button is
 * located in the second row and spans across two columns, which is
 * defined by the `column-span` property.
 * 
 * # CSS nodes
 * 
 * `GtkGrid` uses a single CSS node with name `grid`.
 * 
 * # Accessibility
 * 
 * `GtkGrid` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public class Grid extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Grid(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Grid */
    public static Grid castFrom(org.gtk.gobject.Object gobject) {
        return new Grid(gobject.getReference());
    }
    
    /**
     * Creates a new grid widget.
     */
    public Grid() {
        super(References.get(gtk_h.gtk_grid_new(), false));
    }
    
    /**
     * Adds a widget to the grid.
     * 
     * The position of @child is determined by @column and @row.
     * The number of “cells” that @child will occupy is determined
     * by @width and @height.
     */
    public void attach(Widget child, int column, int row, int width, int height) {
        gtk_h.gtk_grid_attach(handle(), child.handle(), column, row, width, height);
    }
    
    /**
     * Adds a widget to the grid.
     * 
     * The widget is placed next to @sibling, on the side determined by
     * @side. When @sibling is %NULL, the widget is placed in row (for
     * left or right placement) or column 0 (for top or bottom placement),
     * at the end indicated by @side.
     * 
     * Attaching widgets labeled `[1]`, `[2]`, `[3]` with `@sibling == %NULL` and
     * `@side == %GTK_POS_LEFT` yields a layout of `[3][2][1]`.
     */
    public void attachNextTo(Widget child, Widget sibling, PositionType side, int width, int height) {
        gtk_h.gtk_grid_attach_next_to(handle(), child.handle(), sibling.handle(), side.getValue(), width, height);
    }
    
    /**
     * Returns which row defines the global baseline of @grid.
     */
    public int getBaselineRow() {
        var RESULT = gtk_h.gtk_grid_get_baseline_row(handle());
        return RESULT;
    }
    
    /**
     * Gets the child of @grid whose area covers the grid
     * cell at @column, @row.
     */
    public Widget getChildAt(int column, int row) {
        var RESULT = gtk_h.gtk_grid_get_child_at(handle(), column, row);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether all columns of @grid have the same width.
     */
    public boolean getColumnHomogeneous() {
        var RESULT = gtk_h.gtk_grid_get_column_homogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the amount of space between the columns of @grid.
     */
    public int getColumnSpacing() {
        var RESULT = gtk_h.gtk_grid_get_column_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the baseline position of @row.
     * 
     * See [method@Gtk.Grid.set_row_baseline_position].
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        var RESULT = gtk_h.gtk_grid_get_row_baseline_position(handle(), row);
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Returns whether all rows of @grid have the same height.
     */
    public boolean getRowHomogeneous() {
        var RESULT = gtk_h.gtk_grid_get_row_homogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the amount of space between the rows of @grid.
     */
    public int getRowSpacing() {
        var RESULT = gtk_h.gtk_grid_get_row_spacing(handle());
        return RESULT;
    }
    
    /**
     * Inserts a column at the specified position.
     * 
     * Children which are attached at or to the right of this position
     * are moved one column to the right. Children which span across this
     * position are grown to span the new column.
     */
    public void insertColumn(int position) {
        gtk_h.gtk_grid_insert_column(handle(), position);
    }
    
    /**
     * Inserts a row or column at the specified position.
     * 
     * The new row or column is placed next to @sibling, on the side
     * determined by @side. If @side is %GTK_POS_TOP or %GTK_POS_BOTTOM,
     * a row is inserted. If @side is %GTK_POS_LEFT of %GTK_POS_RIGHT,
     * a column is inserted.
     */
    public void insertNextTo(Widget sibling, PositionType side) {
        gtk_h.gtk_grid_insert_next_to(handle(), sibling.handle(), side.getValue());
    }
    
    /**
     * Inserts a row at the specified position.
     * 
     * Children which are attached at or below this position
     * are moved one row down. Children which span across this
     * position are grown to span the new row.
     */
    public void insertRow(int position) {
        gtk_h.gtk_grid_insert_row(handle(), position);
    }
    
    /**
     * Removes a child from @grid.
     * 
     * The child must have been added with
     * [method@Gtk.Grid.attach] or [method@Gtk.Grid.attach_next_to].
     */
    public void remove(Widget child) {
        gtk_h.gtk_grid_remove(handle(), child.handle());
    }
    
    /**
     * Removes a column from the grid.
     * 
     * Children that are placed in this column are removed,
     * spanning children that overlap this column have their
     * width reduced by one, and children after the column
     * are moved to the left.
     */
    public void removeColumn(int position) {
        gtk_h.gtk_grid_remove_column(handle(), position);
    }
    
    /**
     * Removes a row from the grid.
     * 
     * Children that are placed in this row are removed,
     * spanning children that overlap this row have their
     * height reduced by one, and children below the row
     * are moved up.
     */
    public void removeRow(int position) {
        gtk_h.gtk_grid_remove_row(handle(), position);
    }
    
    /**
     * Sets which row defines the global baseline for the entire grid.
     * 
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the @grid.
     */
    public void setBaselineRow(int row) {
        gtk_h.gtk_grid_set_baseline_row(handle(), row);
    }
    
    /**
     * Sets whether all columns of @grid will have the same width.
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        gtk_h.gtk_grid_set_column_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space between columns of @grid.
     */
    public void setColumnSpacing(int spacing) {
        gtk_h.gtk_grid_set_column_spacing(handle(), spacing);
    }
    
    /**
     * Sets how the baseline should be positioned on @row of the
     * grid, in case that row is assigned more space than is requested.
     * 
     * The default baseline position is %GTK_BASELINE_POSITION_CENTER.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        gtk_h.gtk_grid_set_row_baseline_position(handle(), row, pos.getValue());
    }
    
    /**
     * Sets whether all rows of @grid will have the same height.
     */
    public void setRowHomogeneous(boolean homogeneous) {
        gtk_h.gtk_grid_set_row_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space between rows of @grid.
     */
    public void setRowSpacing(int spacing) {
        gtk_h.gtk_grid_set_row_spacing(handle(), spacing);
    }
    
}
