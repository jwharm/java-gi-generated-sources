package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A GSK renderer that is using cairo.
 * <p>
 * Since it is using cairo, this renderer cannot support
 * 3D transformations.
 */
public class CairoRenderer extends Renderer {

    public CairoRenderer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CairoRenderer */
    public static CairoRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new CairoRenderer(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gsk_cairo_renderer_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new Cairo renderer.
     * <p>
     * The Cairo renderer is the fallback renderer drawing in ways similar
     * to how GTK 3 drew its content. Its primary use is as comparison tool.
     * <p>
     * The Cairo renderer is incomplete. It cannot render 3D transformed
     * content and will instead render an error marker. Its usage should be
     * avoided.
     */
    public CairoRenderer() {
        super(constructNew());
    }
    
}
