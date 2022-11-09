package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node for a border.
 */
public class BorderNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskBorderNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BorderNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BorderNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BorderNode if its GType is a (or inherits from) "GskBorderNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BorderNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskBorderNode", a ClassCastException will be thrown.
     */
    public static BorderNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskBorderNode"))) {
            return new BorderNode(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskBorderNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull float[] borderWidth, @NotNull org.gtk.gdk.RGBA[] borderColor) {
        java.util.Objects.requireNonNull(outline, "Parameter 'outline' must not be null");
        java.util.Objects.requireNonNull(borderWidth, "Parameter 'borderWidth' must not be null");
        java.util.Objects.requireNonNull(borderColor, "Parameter 'borderColor' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_new.invokeExact(
                    outline.handle(),
                    Interop.allocateNativeArray(borderWidth, false),
                    Interop.allocateNativeArray(borderColor, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will stroke a border rectangle inside the
     * given {@code outline}.
     * <p>
     * The 4 sides of the border can have different widths and colors.
     * @param outline a {@code GskRoundedRect} describing the outline of the border
     * @param borderWidth the stroke width of the border on
     *     the top, right, bottom and left side respectively.
     * @param borderColor the color used on the top, right,
     *     bottom and left side.
     */
    public BorderNode(@NotNull org.gtk.gsk.RoundedRect outline, @NotNull float[] borderWidth, @NotNull org.gtk.gdk.RGBA[] borderColor) {
        super(constructNew(outline, borderWidth, borderColor), Ownership.FULL);
    }
    
    /**
     * Retrieves the colors of the border.
     * @return an array of 4 {@code GdkRGBA} structs
     *     for the top, right, bottom and left color of the border
     */
    public @NotNull org.gtk.gdk.RGBA getColors() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_colors.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the outline of the border.
     * @return the outline of the border
     */
    public @NotNull org.gtk.gsk.RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_outline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RoundedRect(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the stroke widths of the border.
     * @return an array of 4 floats
     *   for the top, right, bottom and left stroke width of the border,
     *   respectively
     */
    public @NotNull float[] getWidths() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_widths.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), 4 * ValueLayout.JAVA_FLOAT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_FLOAT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_border_node_new = Interop.downcallHandle(
            "gsk_border_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_border_node_get_colors = Interop.downcallHandle(
            "gsk_border_node_get_colors",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_border_node_get_outline = Interop.downcallHandle(
            "gsk_border_node_get_outline",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_border_node_get_widths = Interop.downcallHandle(
            "gsk_border_node_get_widths",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
