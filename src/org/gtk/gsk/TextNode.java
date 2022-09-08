package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node drawing a set of glyphs.
 */
public class TextNode extends RenderNode {

    public TextNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextNode */
    public static TextNode castFrom(org.gtk.gobject.Object gobject) {
        return new TextNode(gobject.getReference());
    }
    
    /**
     * Creates a render node that renders the given glyphs.
     * 
     * Note that @color may not be used if the font contains
     * color glyphs.
     */
    public TextNode(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_new(font.HANDLE(), glyphs.HANDLE(), color.HANDLE(), offset.HANDLE()), true));
    }
    
    /**
     * Retrieves the color used by the text @node.
     */
    public org.gtk.gdk.RGBA getColor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_get_color(HANDLE());
        return new org.gtk.gdk.RGBA(References.get(RESULT, false));
    }
    
    /**
     * Returns the font used by the text @node.
     */
    public org.pango.Font getFont() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_get_font(HANDLE());
        return new org.pango.Font(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of glyphs in the text node.
     */
    public int getNumGlyphs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_get_num_glyphs(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the offset applied to the text.
     */
    public org.gtk.graphene.Point getOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_get_offset(HANDLE());
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the text @node has color glyphs.
     */
    public boolean hasColorGlyphs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_text_node_has_color_glyphs(HANDLE());
        return (RESULT != 0);
    }
    
}
