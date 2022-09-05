package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node cross fading between two child nodes.
 */
public class CrossFadeNode extends RenderNode {

    public CrossFadeNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to CrossFadeNode */
    public static CrossFadeNode castFrom(org.gtk.gobject.Object gobject) {
        return new CrossFadeNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will do a cross-fade between @start and @end.
     */
    public CrossFadeNode(RenderNode start, RenderNode end, float progress) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cross_fade_node_new(start.HANDLE(), end.HANDLE(), progress), true));
    }
    
    /**
     * Retrieves the child `GskRenderNode` at the end of the cross-fade.
     */
    public RenderNode getEndChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cross_fade_node_get_end_child(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the progress value of the cross fade.
     */
    public float getProgress() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cross_fade_node_get_progress(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the child `GskRenderNode` at the beginning of the cross-fade.
     */
    public RenderNode getStartChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_cross_fade_node_get_start_child(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, false));
    }
    
}
