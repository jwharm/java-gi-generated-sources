package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_text_node_new(font.handle(), glyphs.handle(), color.handle(), offset.handle()), true);
        return RESULT;
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
    
    /**
     * Retrieves the color used by the text {@code node}.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = gtk_h.gsk_text_node_get_color(handle());
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the font used by the text {@code node}.
     */
    public org.pango.Font getFont() {
        var RESULT = gtk_h.gsk_text_node_get_font(handle());
        return new org.pango.Font(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the glyph information in the {@code node}.
     */
    public PointerIterator<org.pango.GlyphInfo> getGlyphs(PointerInteger nGlyphs) {
        var RESULT = gtk_h.gsk_text_node_get_glyphs(handle(), nGlyphs.handle());
        return new PointerProxy<org.pango.GlyphInfo>(RESULT, org.pango.GlyphInfo.class).iterator();
    }
    
    /**
     * Retrieves the number of glyphs in the text node.
     */
    public int getNumGlyphs() {
        var RESULT = gtk_h.gsk_text_node_get_num_glyphs(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the offset applied to the text.
     */
    public org.gtk.graphene.Point getOffset() {
        var RESULT = gtk_h.gsk_text_node_get_offset(handle());
        return new org.gtk.graphene.Point(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     */
    public boolean hasColorGlyphs() {
        var RESULT = gtk_h.gsk_text_node_has_color_glyphs(handle());
        return RESULT != 0;
    }
    
}
