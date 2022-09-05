package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkCairoContext` is an object representing the platform-specific
 * draw context.
 * 
 * `GdkCairoContext`s are created for a surface using
 * [method@Gdk.Surface.create_cairo_context], and the context
 * can then be used to draw on that surface.
 */
public class CairoContext extends DrawContext {

    public CairoContext(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CairoContext */
    public static CairoContext castFrom(org.gtk.gobject.Object gobject) {
        return new CairoContext(gobject.getProxy());
    }
    
    /**
     * Retrieves a Cairo context to be used to draw on the `GdkSurface`
     * of @context.
     * 
     * A call to [method@Gdk.DrawContext.begin_frame] with this
     * @context must have been done or this function will return %NULL.
     * 
     * The returned context is guaranteed to be valid until
     * [method@Gdk.DrawContext.end_frame] is called.
     */
    public org.cairographics.Context cairoCreate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gdk_cairo_context_cairo_create(HANDLE());
        return new org.cairographics.Context(ProxyFactory.get(RESULT, true));
    }
    
}
