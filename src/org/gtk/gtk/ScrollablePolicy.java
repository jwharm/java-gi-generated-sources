package org.gtk.gtk;

/**
 * Defines the policy to be used in a scrollable widget when updating
 * the scrolled window adjustments in a given orientation.
 */
public enum ScrollablePolicy {

    /**
     * Scrollable adjustments are based on the minimum size
     */
    MINIMUM,
    
    /**
     * Scrollable adjustments are based on the natural size
     */
    NATURAL;
    
    public static ScrollablePolicy fromValue(int value) {
        return switch(value) {
            case 0 -> MINIMUM;
            case 1 -> NATURAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MINIMUM -> 0;
            case NATURAL -> 1;
        };
    }

}
