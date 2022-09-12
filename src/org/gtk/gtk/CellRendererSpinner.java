package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a spinning animation in a cell
 * 
 * `GtkCellRendererSpinner` renders a spinning animation in a cell, very
 * similar to `GtkSpinner`. It can often be used as an alternative
 * to a `GtkCellRendererProgress` for displaying indefinite activity,
 * instead of actual progress.
 * 
 * To start the animation in a cell, set the `GtkCellRendererSpinner:active`
 * property to %TRUE and increment the `GtkCellRendererSpinner:pulse` property
 * at regular intervals. The usual way to set the cell renderer properties
 * for each cell is to bind them to columns in your tree model using e.g.
 * gtk_tree_view_column_add_attribute().
 */
public class CellRendererSpinner extends CellRenderer {

    public CellRendererSpinner(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererSpinner */
    public static CellRendererSpinner castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpinner(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_renderer_spinner_new(), false);
        return RESULT;
    }
    
    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * activity.
     */
    public CellRendererSpinner() {
        super(constructNew());
    }
    
}
