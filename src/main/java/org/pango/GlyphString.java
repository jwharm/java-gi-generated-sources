package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public GlyphString(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.pango_glyph_string_new(), true);
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
        return new GlyphString(Refcounted.get(RESULT, true));
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
        gtk_h.pango_glyph_string_get_logical_widths(handle(), Interop.allocateNativeString(text).handle(), length, embeddingLevel, Interop.allocateNativeArray(logicalWidths).handle());
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
     * Converts from character position to x position.
     * <p>
     * The X position is measured from the left edge of the run.
     * Character positions are obtained using font metrics for ligatures
     * where available, and computed by dividing up each cluster
     * into equal portions, otherwise.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="glyphstring-positions-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Glyph positions" src="glyphstring-positions-light.png"&gt;
     * &lt;/picture&gt;
     */
    public void indexToX(java.lang.String text, int length, Analysis analysis, int index, boolean trailing, PointerInteger xPos) {
        gtk_h.pango_glyph_string_index_to_x(handle(), Interop.allocateNativeString(text).handle(), length, analysis.handle(), index, trailing ? 1 : 0, xPos.handle());
    }
    
    /**
     * Converts from character position to x position.
     * <p>
     * This variant of {@link GlyphString#indexToX} additionally
     * accepts a {@code PangoLogAttr} array. The grapheme boundary information
     * in it can be used to disambiguate positioning inside some complex
     * clusters.
     */
    public void indexToXFull(java.lang.String text, int length, Analysis analysis, LogAttr attrs, int index, boolean trailing, PointerInteger xPos) {
        gtk_h.pango_glyph_string_index_to_x_full(handle(), Interop.allocateNativeString(text).handle(), length, analysis.handle(), attrs.handle(), index, trailing ? 1 : 0, xPos.handle());
    }
    
    /**
     * Resize a glyph string to the given length.
     */
    public void setSize(int newLen) {
        gtk_h.pango_glyph_string_set_size(handle(), newLen);
    }
    
    /**
     * Convert from x offset to character position.
     * <p>
     * Character positions are computed by dividing up each cluster into
     * equal portions. In scripts where positioning within a cluster is
     * not allowed (such as Thai), the returned value may not be a valid
     * cursor position; the caller must combine the result with the logical
     * attributes for the text to compute the valid cursor position.
     */
    public void xToIndex(java.lang.String text, int length, Analysis analysis, int xPos, PointerInteger index, PointerInteger trailing) {
        gtk_h.pango_glyph_string_x_to_index(handle(), Interop.allocateNativeString(text).handle(), length, analysis.handle(), xPos, index.handle(), trailing.handle());
    }
    
}
