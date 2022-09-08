package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node that emits a debugging message when drawing its
 * child node.
 */
public class DebugNode extends RenderNode {

    public DebugNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DebugNode */
    public static DebugNode castFrom(org.gtk.gobject.Object gobject) {
        return new DebugNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will add debug information about
     * the given @child.
     * 
     * Adding this node has no visual effect.
     */
    public DebugNode(RenderNode child, java.lang.String message) {
        super(References.get(gtk_h.gsk_debug_node_new(child.handle(), Interop.allocateNativeString(message).handle()), true));
    }
    
    /**
     * Gets the child node that is getting drawn by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_debug_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the debug message that was set on this node
     */
    public java.lang.String getMessage() {
        var RESULT = gtk_h.gsk_debug_node_get_message(handle());
        return RESULT.getUtf8String(0);
    }
    
}
