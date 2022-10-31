package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskBlurNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public BlurNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BlurNode if its GType is a (or inherits from) "GskBlurNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BlurNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskBlurNode", a ClassCastException will be thrown.
     */
    public static BlurNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskBlurNode"))) {
            return new BlurNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskBlurNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode child, float radius) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_blur_node_new.invokeExact(
                    child.handle(),
                    radius), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a render node that blurs the child.
     * @param child the child node to blur
     * @param radius the blur radius. Must be positive
     */
    public BlurNode(@NotNull org.gtk.gsk.RenderNode child, float radius) {
        super(constructNew(child, radius));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the blur {@code node}.
     * @return the blurred child node
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blur_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the blur radius of the {@code node}.
     * @return the blur radius
     */
    public float getRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_blur_node_get_radius.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_blur_node_new = Interop.downcallHandle(
            "gsk_blur_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gsk_blur_node_get_child = Interop.downcallHandle(
            "gsk_blur_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_blur_node_get_radius = Interop.downcallHandle(
            "gsk_blur_node_get_radius",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
    }
}
