package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a solid color.
 */
public class ColorNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ColorNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorNode */
    public static ColorNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gdk.RGBA rgba, @NotNull org.gtk.graphene.Rect bounds) {
        java.util.Objects.requireNonNull(rgba, "Parameter 'rgba' must not be null");
        java.util.Objects.requireNonNull(bounds, "Parameter 'bounds' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gsk_color_node_new.invokeExact(rgba.handle(), bounds.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the color specified by {@code rgba} into
     * the area given by {@code bounds}.
     * @param rgba a {@code GdkRGBA} specifying a color
     * @param bounds the rectangle to render the color into
     */
    public ColorNode(@NotNull org.gtk.gdk.RGBA rgba, @NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(rgba, bounds));
    }
    
    /**
     * Retrieves the color of the given {@code node}.
     * @return the color of the node
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_color_node_new = Interop.downcallHandle(
            "gsk_color_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gsk_color_node_get_color = Interop.downcallHandle(
            "gsk_color_node_get_color",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
