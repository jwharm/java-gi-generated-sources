package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a spin button in a cell
 * 
 * `GtkCellRendererSpin` renders text in a cell like `GtkCellRendererText` from
 * which it is derived. But while `GtkCellRendererText` offers a simple entry to
 * edit the text, `GtkCellRendererSpin` offers a `GtkSpinButton` widget. Of course,
 * that means that the text has to be parseable as a floating point number.
 * 
 * The range of the spinbutton is taken from the adjustment property of the
 * cell renderer, which can be set explicitly or mapped to a column in the
 * tree model, like all properties of cell renders. `GtkCellRendererSpin`
 * also has properties for the `GtkCellRendererSpin:climb-rate` and the number
 * of `GtkCellRendererSpin:digits` to display. Other `GtkSpinButton` properties
 * can be set in a handler for the `GtkCellRenderer::editing-started` signal.
 * 
 * The `GtkCellRendererSpin` cell renderer was added in GTK 2.10.
 */
public class CellRendererSpin extends CellRendererText {

    public CellRendererSpin(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CellRendererSpin */
    public static CellRendererSpin castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpin(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkCellRendererSpin`.
     */
    public CellRendererSpin() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_cell_renderer_spin_new(), false));
    }
    
}
