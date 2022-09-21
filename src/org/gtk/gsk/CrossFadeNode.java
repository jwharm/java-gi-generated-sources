package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node cross fading between two child nodes.
 */
public class CrossFadeNode extends RenderNode {

    public CrossFadeNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CrossFadeNode */
    public static CrossFadeNode castFrom(org.gtk.gobject.Object gobject) {
        return new CrossFadeNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode start, RenderNode end, float progress) {
        Reference RESULT = References.get(gtk_h.gsk_cross_fade_node_new(start.handle(), end.handle(), progress), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will do a cross-fade between {@code start} and {@code end}.
     */
    public CrossFadeNode(RenderNode start, RenderNode end, float progress) {
        super(constructNew(start, end, progress));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the end of the cross-fade.
     */
    public RenderNode getEndChild() {
        var RESULT = gtk_h.gsk_cross_fade_node_get_end_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the progress value of the cross fade.
     */
    public float getProgress() {
        var RESULT = gtk_h.gsk_cross_fade_node_get_progress(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the beginning of the cross-fade.
     */
    public RenderNode getStartChild() {
        var RESULT = gtk_h.gsk_cross_fade_node_get_start_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
}
