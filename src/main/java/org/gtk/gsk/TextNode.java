package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing a set of glyphs.
 */
public class TextNode extends RenderNode {

    public TextNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextNode */
    public static TextNode castFrom(org.gtk.gobject.Object gobject) {
        return new TextNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_text_node_new = Interop.downcallHandle(
        "gsk_text_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.pango.Font font, @NotNull org.pango.GlyphString glyphs, @NotNull org.gtk.gdk.RGBA color, @NotNull org.gtk.graphene.Point offset) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_text_node_new.invokeExact(font.handle(), glyphs.handle(), color.handle(), offset.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a render node that renders the given glyphs.
     * <p>
     * Note that {@code color} may not be used if the font contains
     * color glyphs.
     */
    public TextNode(@NotNull org.pango.Font font, @NotNull org.pango.GlyphString glyphs, @NotNull org.gtk.gdk.RGBA color, @NotNull org.gtk.graphene.Point offset) {
        super(constructNew(font, glyphs, color, offset));
    }
    
    private static final MethodHandle gsk_text_node_get_color = Interop.downcallHandle(
        "gsk_text_node_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color used by the text {@code node}.
     */
    public @NotNull org.gtk.gdk.RGBA getColor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_text_node_get_color.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_text_node_get_font = Interop.downcallHandle(
        "gsk_text_node_get_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the font used by the text {@code node}.
     */
    public @NotNull org.pango.Font getFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_text_node_get_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Font(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_text_node_get_glyphs = Interop.downcallHandle(
        "gsk_text_node_get_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the glyph information in the {@code node}.
     */
    public org.pango.GlyphInfo[] getGlyphs(@NotNull Out<Integer> nGlyphs) {
        MemorySegment nGlyphsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_text_node_get_glyphs.invokeExact(handle(), (Addressable) nGlyphsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nGlyphs.set(nGlyphsPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.pango.GlyphInfo[] resultARRAY = new org.pango.GlyphInfo[nGlyphs.get().intValue()];
        for (int I = 0; I < nGlyphs.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.pango.GlyphInfo(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle gsk_text_node_get_num_glyphs = Interop.downcallHandle(
        "gsk_text_node_get_num_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of glyphs in the text node.
     */
    public int getNumGlyphs() {
        int RESULT;
        try {
            RESULT = (int) gsk_text_node_get_num_glyphs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gsk_text_node_get_offset = Interop.downcallHandle(
        "gsk_text_node_get_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the offset applied to the text.
     */
    public @NotNull org.gtk.graphene.Point getOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_text_node_get_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_text_node_has_color_glyphs = Interop.downcallHandle(
        "gsk_text_node_has_color_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     */
    public boolean hasColorGlyphs() {
        int RESULT;
        try {
            RESULT = (int) gsk_text_node_has_color_glyphs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
