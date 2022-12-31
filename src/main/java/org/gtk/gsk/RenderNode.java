package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class RenderNode extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRenderNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RenderNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RenderNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RenderNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RenderNode(input, ownership);
    
    /**
     * Draw the contents of {@code node} to the given cairo context.
     * <p>
     * Typically, you'll use this function to implement fallback rendering
     * of {@code GskRenderNode}s on an intermediate Cairo context, instead of using
     * the drawing context associated to a {@link org.gtk.gdk.Surface}'s rendering buffer.
     * <p>
     * For advanced nodes that cannot be supported using Cairo, in particular
     * for nodes doing 3D operations, this function may fail.
     * @param cr cairo context to draw to
     */
    public void draw(org.cairographics.Context cr) {
        try {
            DowncallHandles.gsk_render_node_draw.invokeExact(
                    handle(),
                    cr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the boundaries of the {@code node}.
     * <p>
     * The node will not draw outside of its boundaries.
     * @param bounds return location for the boundaries
     */
    public void getBounds(org.gtk.graphene.Rect bounds) {
        try {
            DowncallHandles.gsk_render_node_get_bounds.invokeExact(
                    handle(),
                    bounds.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the type of the {@code node}.
     * @return the type of the {@code GskRenderNode}
     */
    public org.gtk.gsk.RenderNodeType getNodeType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_render_node_get_node_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RenderNodeType.of(RESULT);
    }
    
    /**
     * Acquires a reference on the given {@code GskRenderNode}.
     * @return the {@code GskRenderNode} with an additional reference
     */
    public org.gtk.gsk.RenderNode ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_render_node_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, Ownership.FULL);
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
     * @return a {@code GBytes} representing the node.
     */
    public org.gtk.glib.Bytes serialize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_render_node_serialize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases a reference on the given {@code GskRenderNode}.
     * <p>
     * If the reference was the last, the resources associated to the {@code node} are
     * freed.
     */
    public void unref() {
        try {
            DowncallHandles.gsk_render_node_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * This function is equivalent to calling {@link RenderNode#serialize}
     * followed by {@link org.gtk.glib.GLib#fileSetContents}.
     * <p>
     * See those two functions for details on the arguments.
     * <p>
     * It is mostly intended for use inside a debugger to quickly dump a render
     * node to a file for later inspection.
     * @param filename the file to save it to.
     * @return {@code true} if saving was successful
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeToFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_render_node_write_to_file.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(filename, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_render_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Loads data previously created via {@link RenderNode#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     * @param bytes the bytes containing the data
     * @param errorFunc Callback on parsing errors
     * @return a new {@code GskRenderNode}
     */
    public static @Nullable org.gtk.gsk.RenderNode deserialize(org.gtk.glib.Bytes bytes, @Nullable org.gtk.gsk.ParseErrorFunc errorFunc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_render_node_deserialize.invokeExact(
                    bytes.handle(),
                    (Addressable) (errorFunc == null ? MemoryAddress.NULL : (Addressable) errorFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_render_node_draw = Interop.downcallHandle(
            "gsk_render_node_draw",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_get_bounds = Interop.downcallHandle(
            "gsk_render_node_get_bounds",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_get_node_type = Interop.downcallHandle(
            "gsk_render_node_get_node_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_ref = Interop.downcallHandle(
            "gsk_render_node_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_serialize = Interop.downcallHandle(
            "gsk_render_node_serialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_unref = Interop.downcallHandle(
            "gsk_render_node_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_write_to_file = Interop.downcallHandle(
            "gsk_render_node_write_to_file",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_render_node_get_type = Interop.downcallHandle(
            "gsk_render_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gsk_render_node_deserialize = Interop.downcallHandle(
            "gsk_render_node_deserialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
