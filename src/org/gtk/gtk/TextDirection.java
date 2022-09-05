package org.gtk.gtk;

/**
 * Reading directions for text.
 */
public enum TextDirection {

    /**
     * No direction.
     */
    NONE,
    
    /**
     * Left to right text direction.
     */
    LTR,
    
    /**
     * Right to left text direction.
     */
    RTL;
    
    public static TextDirection fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> LTR;
            case 2 -> RTL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case LTR -> 1;
            case RTL -> 2;
        };
    }

}
