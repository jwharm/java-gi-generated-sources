package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a Cairo surface.
 */
public class CairoNode extends RenderNode {

    public CairoNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CairoNode */
    public static CairoNode castFrom(org.gtk.gobject.Object gobject) {
        return new CairoNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will render a cairo surface
     * into the area given by @bounds.
     * 
     * You can draw to the cairo surface using [method@Gsk.CairoNode.get_draw_context].
     */
    public CairoNode(org.gtk.graphene.Rect bounds) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cairo_node_new(bounds.HANDLE()), true));
    }
    
    /**
     * Creates a Cairo context for drawing using the surface associated
     * to the render node.
     * 
     * If no surface exists yet, a surface will be created optimized for
     * rendering to @renderer.
     */
    public org.cairographics.Context getDrawContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cairo_node_get_draw_context(HANDLE());
        return new org.cairographics.Context(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Retrieves the Cairo surface used by the render node.
     */
    public org.cairographics.Surface getSurface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cairo_node_get_surface(HANDLE());
        return new org.cairographics.Surface(ProxyFactory.getProxy(RESULT, false));
    }
    
}
