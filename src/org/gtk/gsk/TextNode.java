package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node drawing a set of glyphs.
 */
public class TextNode extends RenderNode {

    public TextNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextNode */
    public static TextNode castFrom(org.gtk.gobject.Object gobject) {
        return new TextNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.pango.Font font, org.pango.GlyphString glyphs, org.gtk.gdk.RGBA color, org.gtk.graphene.Point offset) {
        Reference RESULT = References.get(gtk_h.gsk_text_node_new(font.handle(), glyphs.handle(), color.handle(), offset.handle()), true);
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
        return new org.gtk.gdk.RGBA(References.get(RESULT, false));
    }
    
    /**
     * Returns the font used by the text {@code node}.
     */
    public org.pango.Font getFont() {
        var RESULT = gtk_h.gsk_text_node_get_font(handle());
        return new org.pango.Font(References.get(RESULT, false));
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
        return new org.gtk.graphene.Point(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the text {@code node} has color glyphs.
     */
    public boolean hasColorGlyphs() {
        var RESULT = gtk_h.gsk_text_node_has_color_glyphs(handle());
        return (RESULT != 0);
    }
    
}
