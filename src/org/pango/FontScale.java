package org.pango;

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 */
public enum FontScale {

    /**
     * Leave the font size unchanged
     */
    NONE,
    
    /**
     * Change the font to a size suitable for superscripts
     */
    SUPERSCRIPT,
    
    /**
     * Change the font to a size suitable for subscripts
     */
    SUBSCRIPT,
    
    /**
     * Change the font to a size suitable for Small Caps
     */
    SMALL_CAPS;
    
    public static FontScale fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> SUPERSCRIPT;
            case 2 -> SUBSCRIPT;
            case 3 -> SMALL_CAPS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case SUPERSCRIPT -> 1;
            case SUBSCRIPT -> 2;
            case SMALL_CAPS -> 3;
        };
    }

}
