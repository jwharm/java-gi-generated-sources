package org.gtk.gtk;

import org.gtk.gobject.*;
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

    public CellRendererProgress(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CellRendererProgress */
    public static CellRendererProgress castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererProgress(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkCellRendererProgress`.
     */
    public CellRendererProgress() {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_progress_new(), false));
    }
    
}
