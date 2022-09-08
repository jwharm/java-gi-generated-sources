package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoGlyphString` is used to store strings of glyphs with geometry
 * and visual attribute information.
 * 
 * The storage for the glyph information is owned by the structure
 * which simplifies memory management.
 */
public class GlyphString extends io.github.jwharm.javagi.interop.ResourceBase {

    public GlyphString(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Create a new `PangoGlyphString`.
     */
    public GlyphString() {
        super(References.get(gtk_h.pango_glyph_string_new(), true));
    }
    
    /**
     * Copy a glyph string and associated storage.
     */
    public GlyphString copy() {
        var RESULT = gtk_h.pango_glyph_string_copy(handle());
        return new GlyphString(References.get(RESULT, true));
    }
    
    /**
     * Compute the logical and ink extents of a glyph string.
     * 
     * See the documentation for [method@Pango.Font.get_glyph_extents] for details
     * about the interpretation of the rectangles.
     * 
     * Examples of logical (red) and ink (green) rects:
     * 
     * ![](rects1.png) ![](rects2.png)
     */
    public void extents(Font font, Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_glyph_string_extents(handle(), font.handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Computes the extents of a sub-portion of a glyph string.
     * 
     * The extents are relative to the start of the glyph string range
     * (the origin of their coordinate system is at the start of the range,
     * not at the start of the entire glyph string).
     */
    public void extentsRange(int start, int end, Font font, Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_glyph_string_extents_range(handle(), start, end, font.handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Free a glyph string and associated storage.
     */
    public void free() {
        gtk_h.pango_glyph_string_free(handle());
    }
    
    /**
     * Given a `PangoGlyphString` and corresponding text, determine the width
     * corresponding to each character.
     * 
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * 
     * See also [method@Pango.GlyphItem.get_logical_widths].
     */
    public void getLogicalWidths(java.lang.String text, int length, int embeddingLevel, int[] logicalWidths) {
        gtk_h.pango_glyph_string_get_logical_widths(handle(), Interop.allocateNativeString(text).handle(), length, embeddingLevel, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, logicalWidths)).handle());
    }
    
    /**
     * Computes the logical width of the glyph string.
     * 
     * This can also be computed using [method@Pango.GlyphString.extents].
     * However, since this only computes the width, it's much faster. This
     * is in fact only a convenience function that computes the sum of
     * @geometry.width for each glyph in the @glyphs.
     */
    public int getWidth() {
        var RESULT = gtk_h.pango_glyph_string_get_width(handle());
        return RESULT;
    }
    
    /**
     * Resize a glyph string to the given length.
     */
    public void setSize(int newLen) {
        gtk_h.pango_glyph_string_set_size(handle(), newLen);
    }
    
}
