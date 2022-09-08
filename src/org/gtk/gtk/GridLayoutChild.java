package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkLayoutChild` subclass for children in a `GtkGridLayout`.
 */
public class GridLayoutChild extends LayoutChild {

    public GridLayoutChild(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridLayoutChild */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves the column number to which @child attaches its left side.
     */
    public int getColumn() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_get_column(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the number of columns that @child spans to.
     */
    public int getColumnSpan() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_get_column_span(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the row number to which @child attaches its top side.
     */
    public int getRow() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_get_row(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the number of rows that @child spans to.
     */
    public int getRowSpan() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_get_row_span(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the column number to attach the left side of @child.
     */
    public void setColumn(int column) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_set_column(HANDLE(), column);
    }
    
    /**
     * Sets the number of columns @child spans to.
     */
    public void setColumnSpan(int span) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_set_column_span(HANDLE(), span);
    }
    
    /**
     * Sets the row to place @child in.
     */
    public void setRow(int row) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_set_row(HANDLE(), row);
    }
    
    /**
     * Sets the number of rows @child spans to.
     */
    public void setRowSpan(int span) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_grid_layout_child_set_row_span(HANDLE(), span);
    }
    
}
