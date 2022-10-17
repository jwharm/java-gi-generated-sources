package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node that emits a debugging message when drawing its
 * child node.
 */
public class DebugNode extends RenderNode {

    public DebugNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DebugNode */
    public static DebugNode castFrom(org.gtk.gobject.Object gobject) {
        return new DebugNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_debug_node_new = Interop.downcallHandle(
        "gsk_debug_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull java.lang.String message) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_debug_node_new.invokeExact(child.handle(), Interop.allocateNativeString(message)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will add debug information about
     * the given {@code child}.
     * <p>
     * Adding this node has no visual effect.
     */
    public DebugNode(@NotNull RenderNode child, @NotNull java.lang.String message) {
        super(constructNew(child, message));
    }
    
    private static final MethodHandle gsk_debug_node_get_child = Interop.downcallHandle(
        "gsk_debug_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting drawn by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_debug_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_debug_node_get_message = Interop.downcallHandle(
        "gsk_debug_node_get_message",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the debug message that was set on this node
     */
    public @NotNull java.lang.String getMessage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_debug_node_get_message.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
