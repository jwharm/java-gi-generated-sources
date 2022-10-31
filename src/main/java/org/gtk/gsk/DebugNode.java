package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node that emits a debugging message when drawing its
 * child node.
 */
public class DebugNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskDebugNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public DebugNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DebugNode if its GType is a (or inherits from) "GskDebugNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DebugNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskDebugNode", a ClassCastException will be thrown.
     */
    public static DebugNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskDebugNode"))) {
            return new DebugNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskDebugNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode child, @NotNull java.lang.String message) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(message, "Parameter 'message' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_debug_node_new.invokeExact(
                    child.handle(),
                    Interop.allocateNativeString(message)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will add debug information about
     * the given {@code child}.
     * <p>
     * Adding this node has no visual effect.
     * @param child The child to add debug info for
     * @param message The debug message
     */
    public DebugNode(@NotNull org.gtk.gsk.RenderNode child, @NotNull java.lang.String message) {
        super(constructNew(child, message));
    }
    
    /**
     * Gets the child node that is getting drawn by the given {@code node}.
     * @return the child {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_debug_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the debug message that was set on this node
     * @return The debug message
     */
    public @NotNull java.lang.String getMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_debug_node_get_message.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_debug_node_new = Interop.downcallHandle(
            "gsk_debug_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_debug_node_get_child = Interop.downcallHandle(
            "gsk_debug_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_debug_node_get_message = Interop.downcallHandle(
            "gsk_debug_node_get_message",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
