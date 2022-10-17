package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends RenderNode {

    public ShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShadowNode */
    public static ShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new ShadowNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_shadow_node_new = Interop.downcallHandle(
        "gsk_shadow_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull Shadow[] shadows, @NotNull long nShadows) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_shadow_node_new.invokeExact(child.handle(), Interop.allocateNativeArray(shadows), nShadows), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will draw a {@code child} with the given
     * {@code shadows} below it.
     */
    public ShadowNode(@NotNull RenderNode child, @NotNull Shadow[] shadows, @NotNull long nShadows) {
        super(constructNew(child, shadows, nShadows));
    }
    
    private static final MethodHandle gsk_shadow_node_get_child = Interop.downcallHandle(
        "gsk_shadow_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child {@code GskRenderNode} of the shadow {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_shadow_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_shadow_node_get_n_shadows = Interop.downcallHandle(
        "gsk_shadow_node_get_n_shadows",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of shadows in the {@code node}.
     */
    public long getNShadows() {
        long RESULT;
        try {
            RESULT = (long) gsk_shadow_node_get_n_shadows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_shadow_node_get_shadow = Interop.downcallHandle(
        "gsk_shadow_node_get_shadow",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Retrieves the shadow data at the given index @i.
     */
    public @NotNull Shadow getShadow(@NotNull long i) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_shadow_node_get_shadow.invokeExact(handle(), i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Shadow(Refcounted.get(RESULT, false));
    }
    
}
