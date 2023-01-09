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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CrossFadeNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CrossFadeNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CrossFadeNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CrossFadeNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode start, org.gtk.gsk.RenderNode end, float progress) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_new.invokeExact(
                    start.handle(),
                    end.handle(),
                    progress);
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
    public CrossFadeNode(org.gtk.gsk.RenderNode start, org.gtk.gsk.RenderNode end, float progress) {
        super(constructNew(start, end, progress));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the end of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public org.gtk.gsk.RenderNode getEndChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_end_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the progress value of the cross fade.
     * @return the progress value, between 0 and 1
     */
    public float getProgress() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_cross_fade_node_get_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} at the beginning of the cross-fade.
     * @return a {@code GskRenderNode}
     */
    public org.gtk.gsk.RenderNode getStartChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_cross_fade_node_get_start_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_cross_fade_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_cross_fade_node_new = Interop.downcallHandle(
                "gsk_cross_fade_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_end_child = Interop.downcallHandle(
                "gsk_cross_fade_node_get_end_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_progress = Interop.downcallHandle(
                "gsk_cross_fade_node_get_progress",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_start_child = Interop.downcallHandle(
                "gsk_cross_fade_node_get_start_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_cross_fade_node_get_type = Interop.downcallHandle(
                "gsk_cross_fade_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_cross_fade_node_get_type != null;
    }
}
