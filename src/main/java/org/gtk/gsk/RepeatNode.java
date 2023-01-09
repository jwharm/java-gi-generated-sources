package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node repeating its single child node.
 */
public class RepeatNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskRepeatNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a RepeatNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RepeatNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RepeatNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RepeatNode(input);
    
    private static MemoryAddress constructNew(org.gtk.graphene.Rect bounds, org.gtk.gsk.RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeat_node_new.invokeExact(
                    bounds.handle(),
                    child.handle(),
                    (Addressable) (childBounds == null ? MemoryAddress.NULL : childBounds.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will repeat the drawing of {@code child} across
     * the given {@code bounds}.
     * @param bounds The bounds of the area to be painted
     * @param child The child to repeat
     * @param childBounds The area of the child to repeat or {@code null} to
     *     use the child's bounds
     */
    public RepeatNode(org.gtk.graphene.Rect bounds, org.gtk.gsk.RenderNode child, @Nullable org.gtk.graphene.Rect childBounds) {
        super(constructNew(bounds, child, childBounds));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the child of {@code node}.
     * @return a {@code GskRenderNode}
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeat_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the bounding rectangle of the child of {@code node}.
     * @return a bounding rectangle
     */
    public org.gtk.graphene.Rect getChildBounds() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_repeat_node_get_child_bounds.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Rect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_repeat_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_repeat_node_new = Interop.downcallHandle(
                "gsk_repeat_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_repeat_node_get_child = Interop.downcallHandle(
                "gsk_repeat_node_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_repeat_node_get_child_bounds = Interop.downcallHandle(
                "gsk_repeat_node_get_child_bounds",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_repeat_node_get_type = Interop.downcallHandle(
                "gsk_repeat_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_repeat_node_get_type != null;
    }
}
