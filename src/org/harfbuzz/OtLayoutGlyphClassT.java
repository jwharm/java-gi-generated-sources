package org.harfbuzz;

/**
 * The GDEF classes defined for glyphs.
 */
public enum OtLayoutGlyphClassT {

    /**
     * Glyphs not matching the other classifications
     */
    UNCLASSIFIED,
    
    /**
     * Spacing, single characters, capable of accepting marks
     */
    BASE_GLYPH,
    
    /**
     * Glyphs that represent ligation of multiple characters
     */
    LIGATURE,
    
    /**
     * Non-spacing, combining glyphs that represent marks
     */
    MARK,
    
    /**
     * Spacing glyphs that represent part of a single character
     */
    COMPONENT;
    
    public static OtLayoutGlyphClassT fromValue(int value) {
        return switch(value) {
            case 0 -> UNCLASSIFIED;
            case 1 -> BASE_GLYPH;
            case 2 -> LIGATURE;
            case 3 -> MARK;
            case 4 -> COMPONENT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNCLASSIFIED -> 0;
            case BASE_GLYPH -> 1;
            case LIGATURE -> 2;
            case MARK -> 3;
            case COMPONENT -> 4;
        };
    }

}
