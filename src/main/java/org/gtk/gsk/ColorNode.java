package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a solid color.
 */
public class ColorNode extends RenderNode {

    public ColorNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorNode */
    public static ColorNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_color_node_new = Interop.downcallHandle(
        "gsk_color_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gdk.RGBA rgba, @NotNull org.gtk.graphene.Rect bounds) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_color_node_new.invokeExact(rgba.handle(), bounds.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render the color specified by {@code rgba} into
     * the area given by {@code bounds}.
     */
    public ColorNode(@NotNull org.gtk.gdk.RGBA rgba, @NotNull org.gtk.graphene.Rect bounds) {
        super(constructNew(rgba, bounds));
    }
    
    private static final MethodHandle gsk_color_node_get_color = Interop.downcallHandle(
        "gsk_color_node_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color of the given {@code node}.
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_color_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
}
