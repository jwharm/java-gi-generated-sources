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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a OpacityNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OpacityNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OpacityNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OpacityNode(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode child, float opacity) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_opacity_node_new.invokeExact(
                    child.handle(),
                    opacity);
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
    public OpacityNode(org.gtk.gsk.RenderNode child, float opacity) {
        super(constructNew(child, opacity), Ownership.FULL);
    }
    
    /**
     * Gets the child node that is getting opacityed by the given {@code node}.
     * @return The child that is getting opacityed
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_opacity_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_opacity_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_opacity_node_new = Interop.downcallHandle(
            "gsk_opacity_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_child = Interop.downcallHandle(
            "gsk_opacity_node_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_opacity = Interop.downcallHandle(
            "gsk_opacity_node_get_opacity",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_opacity_node_get_type = Interop.downcallHandle(
            "gsk_opacity_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
