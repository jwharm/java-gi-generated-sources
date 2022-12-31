package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing a set of glyphs.
 */
public class TextNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskTextNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TextNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TextNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextNode> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TextNode(input, ownership);
    
    private static MemoryAddress constructNew(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_new.invokeExact(
                    font.handle(),
                    glyphs.handle(),
                    color.handle(),
                    offset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a render node that renders the given glyphs.
     * <p>
     * Note that {@code color} may not be used if the font contains
     * color glyphs.
     * @param font the {@code PangoFont} containing the glyphs
     * @param glyphs the {@code PangoGlyphString} to render
     * @param color the foreground color to render with
     * @param offset offset of the baseline
     */
    public TextNode(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        super(constructNew(font, glyphs, color, offset), Ownership.FULL);
    }
    
    /**
     * Retrieves the color used by the text {@code node}.
     * @return the text color
     */
    public org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_color.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.RGBA.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the font used by the text {@code node}.
     * @return the font
     */
    public org.pango.Font getFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_font.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.pango.Font.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the glyph information in the {@code node}.
     * @param nGlyphs the number of glyphs returned
     * @return the glyph information
     */
    public org.pango.GlyphInfo[] getGlyphs(Out<Integer> nGlyphs) {
        MemorySegment nGlyphsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_glyphs.invokeExact(
                    handle(),
                    (Addressable) (nGlyphs == null ? MemoryAddress.NULL : (Addressable) nGlyphsPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (nGlyphs != null) nGlyphs.set(nGlyphsPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.pango.GlyphInfo[] resultARRAY = new org.pango.GlyphInfo[nGlyphs.get().intValue()];
        for (int I = 0; I < nGlyphs.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
            resultARRAY[I] = org.pango.GlyphInfo.fromAddress.marshal(OBJ, Ownership.NONE);
        }
        return resultARRAY;
    }
    
    /**
     * Retrieves the number of glyphs in the text node.
     * @return the number of glyphs
     */
    public int getNumGlyphs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_text_node_get_num_glyphs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the offset applied to the text.
     * @return a point with the horizontal and vertical offsets
     */
    public org.gtk.graphene.Point getOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_text_node_get_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Point.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     * @return {@code true} if the text node has color glyphs
     */
    public boolean hasColorGlyphs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_text_node_has_color_glyphs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_text_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_text_node_new = Interop.downcallHandle(
            "gsk_text_node_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_color = Interop.downcallHandle(
            "gsk_text_node_get_color",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_font = Interop.downcallHandle(
            "gsk_text_node_get_font",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_glyphs = Interop.downcallHandle(
            "gsk_text_node_get_glyphs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_num_glyphs = Interop.downcallHandle(
            "gsk_text_node_get_num_glyphs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_offset = Interop.downcallHandle(
            "gsk_text_node_get_offset",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_has_color_glyphs = Interop.downcallHandle(
            "gsk_text_node_has_color_glyphs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_text_node_get_type = Interop.downcallHandle(
            "gsk_text_node_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
