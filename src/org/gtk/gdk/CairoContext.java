package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GdkCairoContext</code> is an object representing the platform-specific
 * draw context.
 * <p><code>GdkCairoContext</code>s are created for a surface using
 * {@link org.gtk.gdk.Surface#createCairoContext}, and the context
 * can then be used to draw on that surface.
 */
public class CairoContext extends DrawContext {

    public CairoContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CairoContext */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
        return new CairoContext(gobject.getReference());
    }
    
    /**
     * Retrieves a Cairo context to be used to draw on the <code>GdkSurface</code>
     * of @context.
     * 
     * A call to {@link org.gtk.gdk.DrawContext#beginFrame} with this
     * @context must have been done or this function will return <code>NULL.
     * 
     * The</code> returned context is guaranteed to be valid until
     * {@link org.gtk.gdk.DrawContext#endFrame} is called.
     */
    public org.cairographics.Context cairoCreate() {
        var RESULT = gtk_h.gdk_cairo_context_cairo_create(handle());
        return new org.cairographics.Context(References.get(RESULT, true));
    }
    
}
