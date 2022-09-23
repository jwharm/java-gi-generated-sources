package org.gnome.adw;

/**
 * Determines when {@code Leaflet} will fold.
 */
public enum FoldThresholdPolicy {

    /**
     * Folding is based on the minimum size
     */
    MINIMUM,
    
    /**
     * Folding is based on the natural size
     */
    NATURAL;
    
    public static FoldThresholdPolicy fromValue(int value) {
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
