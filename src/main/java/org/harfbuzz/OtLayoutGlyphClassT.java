package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The GDEF classes defined for glyphs.
 */
public enum OtLayoutGlyphClassT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Glyphs not matching the other classifications
     */
    UNCLASSIFIED(0),
    
    /**
     * Spacing, single characters, capable of accepting marks
     */
    BASE_GLYPH(1),
    
    /**
     * Glyphs that represent ligation of multiple characters
     */
    LIGATURE(2),
    
    /**
     * Non-spacing, combining glyphs that represent marks
     */
    MARK(3),
    
    /**
     * Spacing glyphs that represent part of a single character
     */
    COMPONENT(4);
    
    private static final java.lang.String C_TYPE_NAME = "hb_ot_layout_glyph_class_t";
    
    private final int value;
    
    /**
     * Create a new OtLayoutGlyphClassT for the provided value
     * @param numeric value the enum value
     */
    OtLayoutGlyphClassT(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new OtLayoutGlyphClassT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static OtLayoutGlyphClassT of(int value) {
        return switch (value) {
            case 0 -> UNCLASSIFIED;
            case 1 -> BASE_GLYPH;
            case 2 -> LIGATURE;
            case 3 -> MARK;
            case 4 -> COMPONENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
