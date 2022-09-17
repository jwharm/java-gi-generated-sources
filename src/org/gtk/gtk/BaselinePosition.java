package org.gtk.gtk;

/**
 * Baseline position in a row of widgets.
 * <p>
 * Whenever a container has some form of natural row it may align
 * children in that row along a common typographical baseline. If
 * the amount of vertical space in the row is taller than the total
 * requested height of the baseline-aligned children then it can use a<code>GtkBaselinePosition</code> to select where to put the baseline inside the
 * extra available space.
 */
public enum BaselinePosition {

    /**
     * Align the baseline at the top
     */
    TOP,
    
    /**
     * Center the baseline
     */
    CENTER,
    
    /**
     * Align the baseline at the bottom
     */
    BOTTOM;
    
    public static BaselinePosition fromValue(int value) {
        return switch(value) {
            case 0 -> TOP;
            case 1 -> CENTER;
            case 2 -> BOTTOM;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOP -> 0;
            case CENTER -> 1;
            case BOTTOM -> 2;
        };
    }

}
