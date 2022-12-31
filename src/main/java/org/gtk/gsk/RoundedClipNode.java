package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public class RoundedClipNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRoundedClipNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RoundedClipNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RoundedClipNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RoundedClipNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RoundedClipNode(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode child, org.gtk.gsk.RoundedRect clip) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_clip_node_new.invokeExact(
                    child.handle(),
                    clip.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will clip the {@code child} to the area
     * given by {@code clip}.
     * @param child The node to draw
     * @param clip The clip to apply
     */
    public RoundedClipNode(org.gtk.gsk.RenderNode child, org.gtk.gsk.RoundedRect clip) {
        super(constructNew(child, clip), Ownership.FULL);
    }
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     * @return The child that is getting clipped
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_clip_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the {@code node}.
     * @return a rounded rectangle
     */
    public org.gtk.gsk.RoundedRect getClip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_clip_node_get_clip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_rounded_clip_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_rounded_clip_node_new = Interop.downcallHandle(
            "gsk_rounded_clip_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_clip_node_get_child = Interop.downcallHandle(
            "gsk_rounded_clip_node_get_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_clip_node_get_clip = Interop.downcallHandle(
            "gsk_rounded_clip_node_get_clip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_clip_node_get_type = Interop.downcallHandle(
            "gsk_rounded_clip_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
