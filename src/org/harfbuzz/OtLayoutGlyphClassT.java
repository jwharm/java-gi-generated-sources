package org.harfbuzz;

/**
 * The GDEF classes defined for glyphs.
 */
public class OtLayoutGlyphClassT {

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
    
    private int value;
    
    public OtLayoutGlyphClassT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OtLayoutGlyphClassT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
