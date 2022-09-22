package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoGlyphString} is used to store strings of glyphs with geometry
 * and visual attribute information.
 * <p>
 * The storage for the glyph information is owned by the structure
 * which simplifies memory management.
 */
public class GlyphString extends io.github.jwharm.javagi.ResourceBase {

    public GlyphString(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_glyph_string_new(), true);
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoGlyphString}.
     */
    public GlyphString() {
        super(constructNew());
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
     * <p>
     * See the documentation for {@link Font#getGlyphExtents} for details
     * about the interpretation of the rectangles.
     * <p>
     * Examples of logical (red) and ink (green) rects:
     * <p>
     * <img src="./doc-files/rects2.png" alt="](rects1.png) ![">
     */
    public void extents(Font font, Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_glyph_string_extents(handle(), font.handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Computes the extents of a sub-portion of a glyph string.
     * <p>
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
     * Given a {@code PangoGlyphString} and corresponding text, determine the width
     * corresponding to each character.
     * <p>
     * When multiple characters compose a single cluster, the width of the
     * entire cluster is divided equally among the characters.
     * <p>
     * See also {@link GlyphItem#getLogicalWidths}.
     */
    public void getLogicalWidths(java.lang.String text, int length, int embeddingLevel, int[] logicalWidths) {
        gtk_h.pango_glyph_string_get_logical_widths(handle(), Interop.allocateNativeString(text).handle(), length, embeddingLevel, new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_INT, logicalWidths)).handle());
    }
    
    /**
     * Computes the logical width of the glyph string.
     * <p>
     * This can also be computed using {@link GlyphString#extents}.
     * However, since this only computes the width, it's much faster. This
     * is in fact only a convenience function that computes the sum of
     * {@code geometry}.width for each glyph in the {@code glyphs}.
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
