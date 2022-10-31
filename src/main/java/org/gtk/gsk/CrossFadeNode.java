package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node cross fading between two child nodes.
 */
public class CrossFadeNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskCrossFadeNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CrossFadeNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CrossFadeNode if its GType is a (or inherits from) "GskCrossFadeNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CrossFadeNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskCrossFadeNode", a ClassCastException will be thrown.
     */
    public static CrossFadeNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskCrossFadeNode"))) {
            return new CrossFadeNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskCrossFadeNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode start, @NotNull org.gtk.gsk.RenderNode end, float progress) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_cross_fade_node_new.invokeExact(
                    start.handle(),
                    end.handle(),
                    progress), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will do a cross-fade between {@code start} and {@code end}.
     * @param start The start node to be drawn
     * @param end The node to be cross_fadeed onto the {@code start} node
     * @param progress How far the fade has progressed from start to end. The value will
     *     be clamped to the range [0 ... 1]
     */
    public CrossFadeNode(@NotNull org.gtk.gsk.RenderNode start, @NotNull org.gtk.gsk.RenderNode end, float progress) {
        super(constructNew(start, end, progress));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the end of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_end_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the progress value of the cross fade.
     * @return the progress value, between 0 and 1
     */
    public float getProgress() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_cross_fade_node_get_progress.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the beginning of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public @NotNull org.gtk.gsk.RenderNode getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_start_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cross_fade_node_new = Interop.downcallHandle(
            "gsk_cross_fade_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_end_child = Interop.downcallHandle(
            "gsk_cross_fade_node_get_end_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_progress = Interop.downcallHandle(
            "gsk_cross_fade_node_get_progress",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_start_child = Interop.downcallHandle(
            "gsk_cross_fade_node_get_start_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
