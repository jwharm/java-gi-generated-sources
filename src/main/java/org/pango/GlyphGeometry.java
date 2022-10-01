package org.pango;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code PangoGlyphGeometry} structure contains width and positioning
 * information for a single glyph.
 * <p>
 * Note that {@code width} is not guaranteed to be the same as the glyph
 * extents. Kerning and other positioning applied during shaping will
 * affect both the {@code width} and the {@code x_offset} for the glyphs in the
 * glyph string that results from shaping.
 * <p>
 * The information in this struct is intended for rendering the glyphs,
 * as follows:
 * <p>
 * 1. Assume the current point is (x, y)
 * 2. Render the current glyph at (x + x_offset, y + y_offset),
 * 3. Advance the current point to (x + width, y)
 * 4. Render the next glyph
 */
public class GlyphGeometry extends io.github.jwharm.javagi.ResourceBase {

    public GlyphGeometry(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public GlyphGeometry() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.PangoGlyphGeometry.allocate(Interop.getAllocator()).address()));
    }
    
}
