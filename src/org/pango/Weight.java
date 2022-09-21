package org.pango;

/**
 * An enumeration specifying the weight (boldness) of a font.
 * <p>
 * Weight is specified as a numeric value ranging from 100 to 1000.
 * This enumeration simply provides some common, predefined values.
 */
public enum Weight {

    /**
     * the thin weight (= 100) Since: 1.24
     */
    THIN,
    
    /**
     * the ultralight weight (= 200)
     */
    ULTRALIGHT,
    
    /**
     * the light weight (= 300)
     */
    LIGHT,
    
    /**
     * the semilight weight (= 350) Since: 1.36.7
     */
    SEMILIGHT,
    
    /**
     * the book weight (= 380) Since: 1.24)
     */
    BOOK,
    
    /**
     * the default weight (= 400)
     */
    NORMAL,
    
    /**
     * the medium weight (= 500) Since: 1.24
     */
    MEDIUM,
    
    /**
     * the semibold weight (= 600)
     */
    SEMIBOLD,
    
    /**
     * the bold weight (= 700)
     */
    BOLD,
    
    /**
     * the ultrabold weight (= 800)
     */
    ULTRABOLD,
    
    /**
     * the heavy weight (= 900)
     */
    HEAVY,
    
    /**
     * the ultraheavy weight (= 1000) Since: 1.24
     */
    ULTRAHEAVY;
    
    public static Weight fromValue(int value) {
        return switch(value) {
            case 100 -> THIN;
            case 200 -> ULTRALIGHT;
            case 300 -> LIGHT;
            case 350 -> SEMILIGHT;
            case 380 -> BOOK;
            case 400 -> NORMAL;
            case 500 -> MEDIUM;
            case 600 -> SEMIBOLD;
            case 700 -> BOLD;
            case 800 -> ULTRABOLD;
            case 900 -> HEAVY;
            case 1000 -> ULTRAHEAVY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case THIN -> 100;
            case ULTRALIGHT -> 200;
            case LIGHT -> 300;
            case SEMILIGHT -> 350;
            case BOOK -> 380;
            case NORMAL -> 400;
            case MEDIUM -> 500;
            case SEMIBOLD -> 600;
            case BOLD -> 700;
            case ULTRABOLD -> 800;
            case HEAVY -> 900;
            case ULTRAHEAVY -> 1000;
        };
    }

}
