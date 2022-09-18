package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGridLayout</code> is a layout manager which arranges child widgets in
 * rows and columns.
 * <p>
 * Children have an &<code>#34</code> attach point&<code>#34</code>  defined by the horizontal and vertical
 * index of the cell they occupy; children can span multiple rows or columns.
 * The layout properties for setting the attach points and spans are set
 * using the {@link org.gtk.gtk.GridLayoutChild} associated to each child widget.
 * <p>
 * The behaviour of <code>GtkGridLayout</code> when several children occupy the same
 * grid cell is undefined.
 * <p><code>GtkGridLayout</code> can be used like a <code>GtkBoxLayout</code> if all children are
 * attached to the same row or column; however, if you only ever need a
 * single row or column, you should consider using <code>GtkBoxLayout</code>.
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
     * Creates a new <code>GtkGridLayout</code>.
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
     * Checks whether all columns of @grid should have the same width.
     */
    public boolean getColumnHomogeneous() {
        var RESULT = gtk_h.gtk_grid_layout_get_column_homogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the spacing set with gtk_grid_layout_set_column_spacing().
     */
    public int getColumnSpacing() {
        var RESULT = gtk_h.gtk_grid_layout_get_column_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the baseline position of @row.
     * 
     * If no value has been set with
     * {@link org.gtk.gtk.GridLayout<code>#setRowBaselinePosition</code> ,
     * the default value of {@link org.gtk.gtk.BaselinePosition<code>#CENTER</code>  is returned.
     */
    public BaselinePosition getRowBaselinePosition(int row) {
        var RESULT = gtk_h.gtk_grid_layout_get_row_baseline_position(handle(), row);
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Checks whether all rows of @grid should have the same height.
     */
    public boolean getRowHomogeneous() {
        var RESULT = gtk_h.gtk_grid_layout_get_row_homogeneous(handle());
        return (RESULT != 0);
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
     * 
     * Each row in the grid can have its own local baseline, but only
     * one of those is global, meaning it will be the baseline in the
     * parent of the @grid.
     */
    public void setBaselineRow(int row) {
        gtk_h.gtk_grid_layout_set_baseline_row(handle(), row);
    }
    
    /**
     * Sets whether all columns of @grid should have the same width.
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
     * Sets how the baseline should be positioned on @row of the
     * grid, in case that row is assigned more space than is requested.
     */
    public void setRowBaselinePosition(int row, BaselinePosition pos) {
        gtk_h.gtk_grid_layout_set_row_baseline_position(handle(), row, pos.getValue());
    }
    
    /**
     * Sets whether all rows of @grid should have the same height.
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
