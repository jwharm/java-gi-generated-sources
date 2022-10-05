package org.gtk.gsk;

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

    public CairoRenderer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CairoRenderer */
    public static CairoRenderer castFrom(org.gtk.gobject.Object gobject) {
        return new CairoRenderer(gobject.refcounted());
    }
    
    static final MethodHandle gsk_cairo_renderer_new = Interop.downcallHandle(
        "gsk_cairo_renderer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_cairo_renderer_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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