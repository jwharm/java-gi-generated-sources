package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskShadowNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ShadowNode if its GType is a (or inherits from) "GskShadowNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ShadowNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskShadowNode", a ClassCastException will be thrown.
     */
    public static ShadowNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskShadowNode"))) {
            return new ShadowNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskShadowNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode child, org.gtk.gsk.Shadow[] shadows, long nShadows) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(shadows, "Parameter 'shadows' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_shadow_node_new.invokeExact(
                    child.handle(),
                    Interop.allocateNativeArray(shadows, false),
                    nShadows), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will draw a {@code child} with the given
     * {@code shadows} below it.
     * @param child The node to draw
     * @param shadows The shadows to apply
     * @param nShadows number of entries in the {@code shadows} array
     */
    public ShadowNode(@NotNull org.gtk.gsk.RenderNode child, org.gtk.gsk.Shadow[] shadows, long nShadows) {
        super(constructNew(child, shadows, nShadows));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the shadow {@code node}.
     * @return the child render node
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shadow_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of shadows in the {@code node}.
     * @return the number of shadows.
     */
    public long getNShadows() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_shadow_node_get_n_shadows.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the shadow data at the given index {@code i}.
     * @param i the given index
     * @return the shadow data
     */
    public @NotNull org.gtk.gsk.Shadow getShadow(long i) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shadow_node_get_shadow.invokeExact(
                    handle(),
                    i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Shadow(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_shadow_node_new = Interop.downcallHandle(
            "gsk_shadow_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gsk_shadow_node_get_child = Interop.downcallHandle(
            "gsk_shadow_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_shadow_node_get_n_shadows = Interop.downcallHandle(
            "gsk_shadow_node_get_n_shadows",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_shadow_node_get_shadow = Interop.downcallHandle(
            "gsk_shadow_node_get_shadow",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
    }
}
