package org.pango;

/**
 * {@code PangoCoverageLevel} is used to indicate how well a font can
 * represent a particular Unicode character for a particular script.
 * <p>
 * Since 1.44, only {@link CoverageLevel#NONE} and {@link CoverageLevel#EXACT}
 * will be returned.
 */
public class CoverageLevel {

    /**
     * The character is not representable with
     *   the font.
     */
    public static final CoverageLevel NONE = new CoverageLevel(0);
    
    /**
     * The character is represented in a
     *   way that may be comprehensible but is not the correct
     *   graphical form. For instance, a Hangul character represented
     *   as a a sequence of Jamos, or a Latin transliteration of a
     *   Cyrillic word.
     */
    public static final CoverageLevel FALLBACK = new CoverageLevel(1);
    
    /**
     * The character is represented as
     *   basically the correct graphical form, but with a stylistic
     *   variant inappropriate for the current script.
     */
    public static final CoverageLevel APPROXIMATE = new CoverageLevel(2);
    
    /**
     * The character is represented as the
     *   correct graphical form.
     */
    public static final CoverageLevel EXACT = new CoverageLevel(3);
    
    private int value;
    
    public CoverageLevel(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CoverageLevel[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
