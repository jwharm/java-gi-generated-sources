package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GDEF classes defined for glyphs.
 */
public class OtLayoutGlyphClassT extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_layout_glyph_class_t";
    
    /**
     * Glyphs not matching the other classifications
     */
    public static final OtLayoutGlyphClassT UNCLASSIFIED = new OtLayoutGlyphClassT(0);
    
    /**
     * Spacing, single characters, capable of accepting marks
     */
    public static final OtLayoutGlyphClassT BASE_GLYPH = new OtLayoutGlyphClassT(1);
    
    /**
     * Glyphs that represent ligation of multiple characters
     */
    public static final OtLayoutGlyphClassT LIGATURE = new OtLayoutGlyphClassT(2);
    
    /**
     * Non-spacing, combining glyphs that represent marks
     */
    public static final OtLayoutGlyphClassT MARK = new OtLayoutGlyphClassT(3);
    
    /**
     * Spacing glyphs that represent part of a single character
     */
    public static final OtLayoutGlyphClassT COMPONENT = new OtLayoutGlyphClassT(4);
    
    public OtLayoutGlyphClassT(int value) {
        super(value);
    }
}
