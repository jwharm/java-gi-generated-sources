package org.gtk.glib;

/**
 * Defines how a Unicode string is transformed in a canonical
 * form, standardizing such issues as whether a character with
 * an accent is represented as a base character and combining
 * accent or as a single precomposed character. Unicode strings
 * should generally be normalized before comparing them.
 */
public enum NormalizeMode {

    /**
     * standardize differences that do not affect the
     *     text content, such as the above-mentioned accent representation
     */
    DEFAULT,
    
    /**
     * another name for {@link NormalizeMode#DEFAULT}
     */
    NFD,
    
    /**
     * like {@link NormalizeMode#DEFAULT}, but with
     *     composed forms rather than a maximally decomposed form
     */
    DEFAULT_COMPOSE,
    
    /**
     * another name for {@link NormalizeMode#DEFAULT_COMPOSE}
     */
    NFC,
    
    /**
     * beyond {@link NormalizeMode#DEFAULT} also standardize the
     *     "compatibility" characters in Unicode, such as SUPERSCRIPT THREE
     *     to the standard forms (in this case DIGIT THREE). Formatting
     *     information may be lost but for most text operations such
     *     characters should be considered the same
     */
    ALL,
    
    /**
     * another name for {@link NormalizeMode#ALL}
     */
    NFKD,
    
    /**
     * like {@link NormalizeMode#ALL}, but with composed
     *     forms rather than a maximally decomposed form
     */
    ALL_COMPOSE,
    
    /**
     * another name for {@link NormalizeMode#ALL_COMPOSE}
     */
    NFKC;
    
    public static NormalizeMode fromValue(int value) {
        return switch(value) {
            case 0 -> DEFAULT;
            case 1 -> DEFAULT_COMPOSE;
            case 2 -> ALL;
            case 3 -> ALL_COMPOSE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DEFAULT -> 0;
            case NFD -> 0;
            case DEFAULT_COMPOSE -> 1;
            case NFC -> 1;
            case ALL -> 2;
            case NFKD -> 2;
            case ALL_COMPOSE -> 3;
            case NFKC -> 3;
        };
    }

}
