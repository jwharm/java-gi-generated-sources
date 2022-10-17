package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link glyph_position_t} is the structure that holds the positions of the
 * glyph in both horizontal and vertical directions. All positions in
 * {@link glyph_position_t} are relative to the current point.
 */
public class GlyphPositionT extends io.github.jwharm.javagi.ResourceBase {

    public GlyphPositionT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
