package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkGridLayout}.
 */
public class GridLayoutChild extends LayoutChild {

    public GridLayoutChild(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GridLayoutChild */
    public static GridLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new GridLayoutChild(gobject.getReference());
    }
    
    /**
     * Retrieves the column number to which {@code child} attaches its left side.
     */
    public int getColumn() {
        var RESULT = gtk_h.gtk_grid_layout_child_get_column(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the number of columns that {@code child} spans to.
     */
    public int getColumnSpan() {
        var RESULT = gtk_h.gtk_grid_layout_child_get_column_span(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the row number to which {@code child} attaches its top side.
     */
    public int getRow() {
        var RESULT = gtk_h.gtk_grid_layout_child_get_row(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the number of rows that {@code child} spans to.
     */
    public int getRowSpan() {
        var RESULT = gtk_h.gtk_grid_layout_child_get_row_span(handle());
        return RESULT;
    }
    
    /**
     * Sets the column number to attach the left side of {@code child}.
     */
    public void setColumn(int column) {
        gtk_h.gtk_grid_layout_child_set_column(handle(), column);
    }
    
    /**
     * Sets the number of columns {@code child} spans to.
     */
    public void setColumnSpan(int span) {
        gtk_h.gtk_grid_layout_child_set_column_span(handle(), span);
    }
    
    /**
     * Sets the row to place {@code child} in.
     */
    public void setRow(int row) {
        gtk_h.gtk_grid_layout_child_set_row(handle(), row);
    }
    
    /**
     * Sets the number of rows {@code child} spans to.
     */
    public void setRowSpan(int span) {
        gtk_h.gtk_grid_layout_child_set_row_span(handle(), span);
    }
    
}
