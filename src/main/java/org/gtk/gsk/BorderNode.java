package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a border.
 */
public class BorderNode extends RenderNode {

    public BorderNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BorderNode */
    public static BorderNode castFrom(org.gtk.gobject.Object gobject) {
        return new BorderNode(gobject.refcounted());
    }
    
    static final MethodHandle gsk_border_node_new = Interop.downcallHandle(
        "gsk_border_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_border_node_new.invokeExact(outline.handle(), Interop.allocateNativeArray(borderWidth).handle(), Interop.allocateNativeArray(borderColor).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will stroke a border rectangle inside the
     * given {@code outline}.
     * <p>
     * The 4 sides of the border can have different widths and colors.
     */
    public BorderNode(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        super(constructNew(outline, borderWidth, borderColor));
    }
    
    static final MethodHandle gsk_border_node_get_colors = Interop.downcallHandle(
        "gsk_border_node_get_colors",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the colors of the border.
     */
    public org.gtk.gdk.RGBA getColors() {
        try {
            var RESULT = (MemoryAddress) gsk_border_node_get_colors.invokeExact(handle());
            return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_border_node_get_outline = Interop.downcallHandle(
        "gsk_border_node_get_outline",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the outline of the border.
     */
    public RoundedRect getOutline() {
        try {
            var RESULT = (MemoryAddress) gsk_border_node_get_outline.invokeExact(handle());
            return new RoundedRect(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_border_node_get_widths = Interop.downcallHandle(
        "gsk_border_node_get_widths",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the stroke widths of the border.
     */
    public PointerFloat getWidths() {
        try {
            var RESULT = (MemoryAddress) gsk_border_node_get_widths.invokeExact(handle());
            return new PointerFloat(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
