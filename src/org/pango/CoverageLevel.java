package org.pango;

/**
 * {@code PangoCoverageLevel} is used to indicate how well a font can
 * represent a particular Unicode character for a particular script.
 * <p>
 * Since 1.44, only {@link CoverageLevel#NONE} and {@link CoverageLevel#EXACT}
 * will be returned.
 */
public enum CoverageLevel {

    /**
     * The character is not representable with
     *   the font.
     */
    NONE,
    
    /**
     * The character is represented in a
     *   way that may be comprehensible but is not the correct
     *   graphical form. For instance, a Hangul character represented
     *   as a a sequence of Jamos, or a Latin transliteration of a
     *   Cyrillic word.
     */
    FALLBACK,
    
    /**
     * The character is represented as
     *   basically the correct graphical form, but with a stylistic
     *   variant inappropriate for the current script.
     */
    APPROXIMATE,
    
    /**
     * The character is represented as the
     *   correct graphical form.
     */
    EXACT;
    
    public static CoverageLevel fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> FALLBACK;
            case 2 -> APPROXIMATE;
            case 3 -> EXACT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case FALLBACK -> 1;
            case APPROXIMATE -> 2;
            case EXACT -> 3;
        };
    }

}
