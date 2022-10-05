package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle gsk_text_node_new = Interop.downcallHandle(
        "gsk_text_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
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
    public TextNode(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        super(constructNew(font, glyphs, color, offset));
    }
    
    static final MethodHandle gsk_text_node_get_color = Interop.downcallHandle(
        "gsk_text_node_get_color",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color used by the text {@code node}.
     */
    public org.gtk.gdk.RGBA getColor() {
        try {
            var RESULT = (MemoryAddress) gsk_text_node_get_color.invokeExact(handle());
            return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_text_node_get_font = Interop.downcallHandle(
        "gsk_text_node_get_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the font used by the text {@code node}.
     */
    public org.pango.Font getFont() {
        try {
            var RESULT = (MemoryAddress) gsk_text_node_get_font.invokeExact(handle());
            return new org.pango.Font(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_text_node_get_glyphs = Interop.downcallHandle(
        "gsk_text_node_get_glyphs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the glyph information in the {@code node}.
     */
    public PointerIterator<org.pango.GlyphInfo> getGlyphs(PointerInteger nGlyphs) {
        try {
            var RESULT = (MemoryAddress) gsk_text_node_get_glyphs.invokeExact(handle(), nGlyphs.handle());
            return new PointerProxy<org.pango.GlyphInfo>(RESULT, org.pango.GlyphInfo.class).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_text_node_get_num_glyphs = Interop.downcallHandle(
        "gsk_text_node_get_num_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of glyphs in the text node.
     */
    public int getNumGlyphs() {
        try {
            var RESULT = (int) gsk_text_node_get_num_glyphs.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_text_node_get_offset = Interop.downcallHandle(
        "gsk_text_node_get_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the offset applied to the text.
     */
    public org.gtk.graphene.Point getOffset() {
        try {
            var RESULT = (MemoryAddress) gsk_text_node_get_offset.invokeExact(handle());
            return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gsk_text_node_has_color_glyphs = Interop.downcallHandle(
        "gsk_text_node_has_color_glyphs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     */
    public boolean hasColorGlyphs() {
        try {
            var RESULT = (int) gsk_text_node_has_color_glyphs.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
