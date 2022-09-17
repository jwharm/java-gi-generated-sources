package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a spin button in a cell
 * <p><code>GtkCellRendererSpin</code> renders text in a cell like <code>GtkCellRendererText</code> from
 * which it is derived. But while <code>GtkCellRendererText</code> offers a simple entry to
 * edit the text, <code>GtkCellRendererSpin</code> offers a <code>GtkSpinButton</code> widget. Of course,
 * that means that the text has to be parseable as a floating point number.
 * <p>
 * The range of the spinbutton is taken from the adjustment property of the
 * cell renderer, which can be set explicitly or mapped to a column in the
 * tree model, like all properties of cell renders. <code>GtkCellRendererSpin</code>
 * also has properties for the <code>GtkCellRendererSpin:climb-rate</code> and the number
 * of <code>GtkCellRendererSpin:digits</code> to display. Other <code>GtkSpinButton</code> properties
 * can be set in a handler for the <code>GtkCellRenderer::editing-started</code> signal.
 * <p>
 * The <code>GtkCellRendererSpin</code> cell renderer was added in GTK 2.10.
 */
public class CellRendererSpin extends CellRendererText {

    public CellRendererSpin(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CellRendererSpin */
    public static CellRendererSpin castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererSpin(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_cell_renderer_spin_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkCellRendererSpin</code>.
     */
    public CellRendererSpin() {
        super(constructNew());
    }
    
}
