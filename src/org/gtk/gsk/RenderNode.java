package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GskRenderNode} is the basic block in a scene graph to be
 * rendered using {@link Renderer}.
 * <p>
 * Each node has a parent, except the top-level node; each node may have
 * children nodes.
 * <p>
 * Each node has an associated drawing surface, which has the size of
 * the rectangle set when creating it.
 * <p>
 * Render nodes are meant to be transient; once they have been associated
 * to a {@link Renderer} it's safe to release any reference you have on
 * them. All {@link RenderNode}s are immutable, you can only specify their
 * properties during construction.
 */
public class RenderNode extends org.gtk.gobject.Object {

    public RenderNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RenderNode */
    public static RenderNode castFrom(org.gtk.gobject.Object gobject) {
        return new RenderNode(gobject.getReference());
    }
    
    /**
     * Draw the contents of {@code node} to the given cairo context.
     * <p>
     * Typically, you'll use this function to implement fallback rendering
     * of {@code GskRenderNode}s on an intermediate Cairo context, instead of using
     * the drawing context associated to a {@link org.gtk.gdk.Surface}'s rendering buffer.
     * <p>
     * For advanced nodes that cannot be supported using Cairo, in particular
     * for nodes doing 3D operations, this function may fail.
     */
    public void draw(org.cairographics.Context cr) {
        gtk_h.gsk_render_node_draw(handle(), cr.handle());
    }
    
    /**
     * Retrieves the boundaries of the {@code node}.
     * <p>
     * The node will not draw outside of its boundaries.
     */
    public void getBounds(org.gtk.graphene.Rect bounds) {
        gtk_h.gsk_render_node_get_bounds(handle(), bounds.handle());
    }
    
    /**
     * Returns the type of the {@code node}.
     */
    public RenderNodeType getNodeType() {
        var RESULT = gtk_h.gsk_render_node_get_node_type(handle());
        return new RenderNodeType(RESULT);
    }
    
    /**
     * Acquires a reference on the given {@code GskRenderNode}.
     */
    public RenderNode ref() {
        var RESULT = gtk_h.gsk_render_node_ref(handle());
        return new RenderNode(References.get(RESULT, true));
    }
    
    /**
     * Serializes the {@code node} for later deserialization via
     * gsk_render_node_deserialize(). No guarantees are made about the format
     * used other than that the same version of GTK will be able to deserialize
     * the result of a call to gsk_render_node_serialize() and
     * gsk_render_node_deserialize() will correctly reject files it cannot open
     * that were created with previous versions of GTK.
     * <p>
     * The intended use of this functions is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     */
    public org.gtk.glib.Bytes serialize() {
        var RESULT = gtk_h.gsk_render_node_serialize(handle());
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given {@code GskRenderNode}.
     * <p>
     * If the reference was the last, the resources associated to the {@code node} are
     * freed.
     */
    public void unref() {
        gtk_h.gsk_render_node_unref(handle());
    }
    
    /**
     * This function is equivalent to calling {@link RenderNode#serialize}
     * followed by {@link GLib#fileSetContents}.
     * <p>
     * See those two functions for details on the arguments.
     * <p>
     * It is mostly intended for use inside a debugger to quickly dump a render
     * node to a file for later inspection.
     */
    public boolean writeToFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gsk_render_node_write_to_file(handle(), Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Loads data previously created via {@link RenderNode#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     */
    public static RenderNode deserialize(org.gtk.glib.Bytes bytes, ParseErrorFunc errorFunc) {
        try {
            var RESULT = gtk_h.gsk_render_node_deserialize(bytes.handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gsk.class, "__cbParseErrorFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(errorFunc.hashCode(), errorFunc)));
            return new RenderNode(References.get(RESULT, true));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
}
