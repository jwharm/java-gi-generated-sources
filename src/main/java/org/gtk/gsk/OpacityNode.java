package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskOpacityNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public OpacityNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to OpacityNode if its GType is a (or inherits from) "GskOpacityNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "OpacityNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskOpacityNode", a ClassCastException will be thrown.
     */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskOpacityNode"))) {
            return new OpacityNode(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GskOpacityNode");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gsk.RenderNode child, float opacity) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_opacity_node_new.invokeExact(
                    child.handle(),
                    opacity), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will drawn the {@code child} with reduced
     * {@code opacity}.
     * @param child The node to draw
     * @param opacity The opacity to apply
     */
    public OpacityNode(@NotNull org.gtk.gsk.RenderNode child, float opacity) {
        super(constructNew(child, opacity));
    }
    
    /**
     * Gets the child node that is getting opacityed by the given {@code node}.
     * @return The child that is getting opacityed
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_opacity_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the transparency factor for an opacity node.
     * @return the opacity factor
     */
    public float getOpacity() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_opacity_node_get_opacity.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_opacity_node_new = Interop.downcallHandle(
            "gsk_opacity_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gsk_opacity_node_get_child = Interop.downcallHandle(
            "gsk_opacity_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_opacity_node_get_opacity = Interop.downcallHandle(
            "gsk_opacity_node_get_opacity",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
    }
}
