package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGridLayout` is a layout manager which arranges child widgets in
 * rows and columns.
 * 
 * Children have an "attach point" defined by the horizontal and vertical
 * index of the cell they occupy; children can span multiple rows or columns.
 * The layout properties for setting the attach points and spans are set
 * using the [class@Gtk.GridLayoutChild] associated to each child widget.
 * 
 * The behaviour of `GtkGridLayout` when several children occupy the same
 * grid cell is undefined.
 * 
 * `GtkGridLayout` can be used like a `GtkBoxLayout` if all children are
 * attached to the same row or column; however, if you only ever need a
 * single row or column, you should consider using `GtkBoxLayout`.
 */
public class GridLayout extends LayoutManager {

    public GridLayout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridLayout */
    public static GridLayout castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayout(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkGridLayout`.
     */
    public GridLayout() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_new(), true));
    }
    
    /**
     * Retrieves the row set with gtk_grid_layout_set_baseline_row().
     */
    public int getBaselineRow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_baseline_row(HANDLE());
        return RESULT;
    }
    
    /**
     * Checks whether all columns of @grid should have the same width.
     */
    public boolean getColumnHomogeneous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_column_homogeneous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     */
    public int getColumnSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_column_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the baseline position of @row.
     * 
     * If no value has been set with
     * [method@Gtk.GridLayout.set_row_baseline_position],
     * the default value of %GTK_BASELINE_POSITION_CENTER
     * is returned.
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_row_baseline_position(HANDLE(), row);
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Checks whether all rows of @grid should have the same height.
     */
    public boolean getRowHomogeneous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_row_homogeneous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_row_spacing().
     */
    public int getRowSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_get_row_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets which row defines the global baseline for the entire grid.
     * 
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the @grid.
     */
    public void setBaselineRow(int row) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_baseline_row(HANDLE(), row);
    }
    
    /**
     * Sets whether all columns of @grid should have the same width.
     */
    public void setColumnHomogeneous(boolean homogeneous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_column_homogeneous(HANDLE(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space to insert between consecutive columns.
     */
    public void setColumnSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_column_spacing(HANDLE(), spacing);
    }
    
    /**
     * Sets how the baseline should be positioned on @row of the
     * grid, in case that row is assigned more space than is requested.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_row_baseline_position(HANDLE(), row, pos.getValue());
    }
    
    /**
     * Sets whether all rows of @grid should have the same height.
     */
    public void setRowHomogeneous(boolean homogeneous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_row_homogeneous(HANDLE(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the amount of space to insert between consecutive rows.
     */
    public void setRowSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_set_row_spacing(HANDLE(), spacing);
    }
    
}
