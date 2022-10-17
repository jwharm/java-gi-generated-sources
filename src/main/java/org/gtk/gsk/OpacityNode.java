package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends RenderNode {

    public OpacityNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OpacityNode */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        return new OpacityNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_opacity_node_new = Interop.downcallHandle(
        "gsk_opacity_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull float opacity) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_opacity_node_new.invokeExact(child.handle(), opacity), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will drawn the {@code child} with reduced
     * {@code opacity}.
     */
    public OpacityNode(@NotNull RenderNode child, @NotNull float opacity) {
        super(constructNew(child, opacity));
    }
    
    private static final MethodHandle gsk_opacity_node_get_child = Interop.downcallHandle(
        "gsk_opacity_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting opacityed by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_opacity_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_opacity_node_get_opacity = Interop.downcallHandle(
        "gsk_opacity_node_get_opacity",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the transparency factor for an opacity node.
     */
    public float getOpacity() {
        float RESULT;
        try {
            RESULT = (float) gsk_opacity_node_get_opacity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
