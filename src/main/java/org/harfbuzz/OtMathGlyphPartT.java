package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Data type to hold information for a "part" component of a math-variant glyph.
 * Large variants for stretchable math glyphs (such as parentheses) can be constructed
 * on the fly from parts.
 */
public class OtMathGlyphPartT extends io.github.jwharm.javagi.ResourceBase {

    public OtMathGlyphPartT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
