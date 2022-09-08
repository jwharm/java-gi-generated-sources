package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders numbers as progress bars
 * 
 * `GtkCellRendererProgress` renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 */
public class CellRendererProgress extends CellRenderer implements Orientable {

    public CellRendererProgress(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererProgress */
    public static CellRendererProgress castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererProgress(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkCellRendererProgress`.
     */
    public CellRendererProgress() {
        super(References.get(gtk_h.gtk_cell_renderer_progress_new(), false));
    }
    
}
