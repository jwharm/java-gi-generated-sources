package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node repeating its single child node.
 */
public class RepeatNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public RepeatNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RepeatNode */
    public static RepeatNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.gsk.RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNullElse(childBounds, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_repeat_node_new.invokeExact(bounds.handle(), child.handle(), childBounds.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will repeat the drawing of {@code child} across
     * the given {@code bounds}.
     * @param bounds The bounds of the area to be painted
     * @param child The child to repeat
     * @param childBounds The area of the child to repeat or {@code null} to
     *     use the child's bounds
     */
    public RepeatNode(@NotNull org.gtk.graphene.Rect bounds, @NotNull org.gtk.gsk.RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        super(constructNew(bounds, child, childBounds));
    }
    
    /**
     * Retrieves the child of {@code node}.
     * @return a {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeat_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the bounding rectangle of the child of {@code node}.
     * @return a bounding rectangle
     */
    public @NotNull org.gtk.graphene.Rect getChildBounds() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeat_node_get_child_bounds.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeat_node_new = Interop.downcallHandle(
            "gsk_repeat_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_repeat_node_get_child = Interop.downcallHandle(
            "gsk_repeat_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_repeat_node_get_child_bounds = Interop.downcallHandle(
            "gsk_repeat_node_get_child_bounds",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
