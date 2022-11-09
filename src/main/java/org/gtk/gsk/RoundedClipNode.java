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
    @ApiStatus.Internal
    public RoundedClipNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to RoundedClipNode if its GType is a (or inherits from) "GskRoundedClipNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "RoundedClipNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskRoundedClipNode", a ClassCastException will be thrown.
     */
    public static RoundedClipNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskRoundedClipNode"))) {
            return new RoundedClipNode(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskRoundedClipNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.RoundedRect clip) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(clip, "Parameter 'clip' must not be null");
        Addressable RESULT;
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
    public RoundedClipNode(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.gsk.RoundedRect clip) {
        super(constructNew(child, clip), Ownership.NONE);
    }
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     * @return The child that is getting clipped
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_clip_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the {@code node}.
     * @return a rounded rectangle
     */
    public @NotNull org.gtk.gsk.RoundedRect getClip() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_rounded_clip_node_get_clip.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_rounded_clip_node_new = Interop.downcallHandle(
            "gsk_rounded_clip_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_clip_node_get_child = Interop.downcallHandle(
            "gsk_rounded_clip_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_rounded_clip_node_get_clip = Interop.downcallHandle(
            "gsk_rounded_clip_node_get_clip",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
