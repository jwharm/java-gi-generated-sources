package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a spinning animation in a cell
 * <p>
 * {@code GtkCellRendererSpinner} renders a spinning animation in a cell, very
 * similar to {@code GtkSpinner}. It can often be used as an alternative
 * to a {@code GtkCellRendererProgress} for displaying indefinite activity,
 * instead of actual progress.
 * <p>
 * To start the animation in a cell, set the {@code GtkCellRendererSpinner:active}
 * property to {@code true} and increment the {@code GtkCellRendererSpinner:pulse} property
 * at regular intervals. The usual way to set the cell renderer properties
 * for each cell is to bind them to columns in your tree model using e.g.
 * gtk_tree_view_column_add_attribute().
 */
public class CellRendererSpinner extends CellRenderer {

    public CellRendererSpinner(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererSpinner */
    public static CellRendererSpinner castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpinner(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_cell_renderer_spinner_new = Interop.downcallHandle(
        "gtk_cell_renderer_spinner_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_spinner_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * activity.
     */
    public CellRendererSpinner() {
        super(constructNew());
    }
    
}
