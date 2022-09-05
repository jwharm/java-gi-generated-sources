package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GskRenderNode` is the basic block in a scene graph to be
 * rendered using [class@Gsk.Renderer].
 * 
 * Each node has a parent, except the top-level node; each node may have
 * children nodes.
 * 
 * Each node has an associated drawing surface, which has the size of
 * the rectangle set when creating it.
 * 
 * Render nodes are meant to be transient; once they have been associated
 * to a [class@Gsk.Renderer] it's safe to release any reference you have on
 * them. All [class@Gsk.RenderNode]s are immutable, you can only specify their
 * properties during construction.
 */
public class RenderNode extends org.gtk.gobject.Object {

    public RenderNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to RenderNode */
    public static RenderNode castFrom(org.gtk.gobject.Object gobject) {
        return new RenderNode(gobject.getProxy());
    }
    
    /**
     * Draw the contents of @node to the given cairo context.
     * 
     * Typically, you'll use this function to implement fallback rendering
     * of `GskRenderNode`s on an intermediate Cairo context, instead of using
     * the drawing context associated to a [class@Gdk.Surface]'s rendering buffer.
     * 
     * For advanced nodes that cannot be supported using Cairo, in particular
     * for nodes doing 3D operations, this function may fail.
     */
    public void draw(org.cairographics.Context cr) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_draw(HANDLE(), cr.HANDLE());
    }
    
    /**
     * Retrieves the boundaries of the @node.
     * 
     * The node will not draw outside of its boundaries.
     */
    public void getBounds(org.gtk.graphene.Rect bounds) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_get_bounds(HANDLE(), bounds.HANDLE());
    }
    
    /**
     * Returns the type of the @node.
     */
    public RenderNodeType getNodeType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_get_node_type(HANDLE());
        return RenderNodeType.fromValue(RESULT);
    }
    
    /**
     * Acquires a reference on the given `GskRenderNode`.
     */
    public RenderNode ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_ref(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Serializes the @node for later deserialization via
     * gsk_render_node_deserialize(). No guarantees are made about the format
     * used other than that the same version of GTK will be able to deserialize
     * the result of a call to gsk_render_node_serialize() and
     * gsk_render_node_deserialize() will correctly reject files it cannot open
     * that were created with previous versions of GTK.
     * 
     * The intended use of this functions is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     */
    public org.gtk.glib.Bytes serialize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_serialize(HANDLE());
        return new org.gtk.glib.Bytes(ProxyFactory.getProxy(RESULT, true));
    }
    
    /**
     * Releases a reference on the given `GskRenderNode`.
     * 
     * If the reference was the last, the resources associated to the @node are
     * freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_unref(HANDLE());
    }
    
    /**
     * This function is equivalent to calling [method@Gsk.RenderNode.serialize]
     * followed by [func@GLib.file_set_contents].
     * 
     * See those two functions for details on the arguments.
     * 
     * It is mostly intended for use inside a debugger to quickly dump a render
     * node to a file for later inspection.
     */
    public boolean writeToFile(java.lang.String filename) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_render_node_write_to_file(HANDLE(), Interop.getAllocator().allocateUtf8String(filename), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}