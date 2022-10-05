package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node cross fading between two child nodes.
 */
public class CrossFadeNode extends RenderNode {

    public CrossFadeNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CrossFadeNode */
    public static CrossFadeNode castFrom(org.gtk.gobject.Object gobject) {
        return new CrossFadeNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_cross_fade_node_new = Interop.downcallHandle(
        "gsk_cross_fade_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    private static Refcounted constructNew(RenderNode start, RenderNode end, float progress) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_cross_fade_node_new.invokeExact(start.handle(), end.handle(), progress), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will do a cross-fade between {@code start} and {@code end}.
     */
    public CrossFadeNode(RenderNode start, RenderNode end, float progress) {
        super(constructNew(start, end, progress));
    }
    
    static final MethodHandle gsk_cross_fade_node_get_end_child = Interop.downcallHandle(
        "gsk_cross_fade_node_get_end_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child {@code GskRenderNode} at the end of the cross-fade.
     */
    public RenderNode getEndChild() {
        try {
            var RESULT = (MemoryAddress) gsk_cross_fade_node_get_end_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_cross_fade_node_get_progress = Interop.downcallHandle(
        "gsk_cross_fade_node_get_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the progress value of the cross fade.
     */
    public float getProgress() {
        try {
            var RESULT = (float) gsk_cross_fade_node_get_progress.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_cross_fade_node_get_start_child = Interop.downcallHandle(
        "gsk_cross_fade_node_get_start_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the child {@code GskRenderNode} at the beginning of the cross-fade.
     */
    public RenderNode getStartChild() {
        try {
            var RESULT = (MemoryAddress) gsk_cross_fade_node_get_start_child.invokeExact(handle());
            return new RenderNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
