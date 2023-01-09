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
     */
    protected BorderNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BorderNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BorderNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_new.invokeExact(
                        outline.handle(),
                        Interop.allocateNativeArray(borderWidth, false, SCOPE),
                        Interop.allocateNativeArray(borderColor, org.gtk.gdk.RGBA.getMemoryLayout(), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public BorderNode(org.gtk.gsk.RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        super(constructNew(outline, borderWidth, borderColor));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the colors of the border.
     * @return an array of 4 {@code GdkRGBA} structs
     *     for the top, right, bottom and left color of the border
     */
    public org.gtk.gdk.RGBA getColors() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_colors.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.RGBA.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the outline of the border.
     * @return the outline of the border
     */
    public org.gtk.gsk.RoundedRect getOutline() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_outline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.RoundedRect.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the stroke widths of the border.
     * @return an array of 4 floats
     *   for the top, right, bottom and left stroke width of the border,
     *   respectively
     */
    public float[] getWidths() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_border_node_get_widths.invokeExact(handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), 4 * Interop.valueLayout.C_FLOAT.byteSize(), SCOPE).toArray(Interop.valueLayout.C_FLOAT);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_border_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_border_node_new = Interop.downcallHandle(
                "gsk_border_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_border_node_get_colors = Interop.downcallHandle(
                "gsk_border_node_get_colors",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_border_node_get_outline = Interop.downcallHandle(
                "gsk_border_node_get_outline",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_border_node_get_widths = Interop.downcallHandle(
                "gsk_border_node_get_widths",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_border_node_get_type = Interop.downcallHandle(
                "gsk_border_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_border_node_get_type != null;
    }
}
