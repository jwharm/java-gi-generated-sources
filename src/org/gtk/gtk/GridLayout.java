package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public GridLayout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridLayout */
    public static GridLayout castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayout(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_grid_layout_new(), true);
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
     */
    public int getBaselineRow() {
        var RESULT = gtk_h.gtk_grid_layout_get_baseline_row(handle());
        return RESULT;
    }
    
    /**
     * Checks whether all columns of {@code grid} should have the same width.
     */
    public boolean getColumnHomogeneous() {
        var RESULT = gtk_h.gtk_grid_layout_get_column_homogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     */
    public int getColumnSpacing() {
        var RESULT = gtk_h.gtk_grid_layout_get_column_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the baseline position of {@code row}.
     * <p>
     * If no value has been set with
     * {@link GridLayout#setRowBaselinePosition},
     * the default value of {@link BaselinePosition#CENTER}
     * is returned.
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        var RESULT = gtk_h.gtk_grid_layout_get_row_baseline_position(handle(), row);
        return new BaselinePosition(RESULT);
    }
    
    /**
     * Checks whether all rows of {@code grid} should have the same height.
     */
    public boolean getRowHomogeneous() {
        var RESULT = gtk_h.gtk_grid_layout_get_row_homogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
     */
    public int getRowSpacing() {
        var RESULT = gtk_h.gtk_grid_layout_get_row_spacing(handle());
        return RESULT;
    }
    
    /**
     * Sets which row defines the global baseline for the entire grid.
     * <p>
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the {@code grid}.
     */
    public void setBaselineRow(int row) {
        gtk_h.gtk_grid_layout_set_baseline_row(handle(), row);
    }
    
    /**
     * Sets whether all columns of {@code grid} should have the same width.
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        gtk_h.gtk_grid_layout_set_column_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space to insert between consecutive columns.
     */
    public void setColumnSpacing(int spacing) {
        gtk_h.gtk_grid_layout_set_column_spacing(handle(), spacing);
    }
    
    /**
     * Sets how the baseline should be positioned on {@code row} of the
     * grid, in case that row is assigned more space than is requested.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        gtk_h.gtk_grid_layout_set_row_baseline_position(handle(), row, pos.getValue());
    }
    
    /**
     * Sets whether all rows of {@code grid} should have the same height.
     */
    public void setRowHomogeneous(boolean homogeneous) {
        gtk_h.gtk_grid_layout_set_row_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space to insert between consecutive rows.
     */
    public void setRowSpacing(int spacing) {
        gtk_h.gtk_grid_layout_set_row_spacing(handle(), spacing);
    }
    
}
