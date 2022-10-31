package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a {@code GskTransform} to its single child node.
 */
public class TransformNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTransformNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public TransformNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to TransformNode if its GType is a (or inherits from) "GskTransformNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TransformNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskTransformNode", a ClassCastException will be thrown.
     */
    public static TransformNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskTransformNode"))) {
            return new TransformNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskTransformNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.Transform transform) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(transform, "Parameter 'transform' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_transform_node_new.invokeExact(
                    child.handle(),
                    transform.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will transform the given {@code child}
     * with the given {@code transform}.
     * @param child The node to transform
     * @param transform The transform to apply
     */
    public TransformNode(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.Transform transform) {
        super(constructNew(child, transform));
    }
    
    /**
     * Gets the child node that is getting transformed by the given {@code node}.
     * @return The child that is getting transformed
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the {@code GskTransform} used by the {@code node}.
     * @return a {@code GskTransform}
     */
    public @NotNull org.gtk.gsk.Transform getTransform() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_transform_node_get_transform.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.Transform(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_transform_node_new = Interop.downcallHandle(
            "gsk_transform_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_transform_node_get_child = Interop.downcallHandle(
            "gsk_transform_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_transform_node_get_transform = Interop.downcallHandle(
            "gsk_transform_node_get_transform",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
