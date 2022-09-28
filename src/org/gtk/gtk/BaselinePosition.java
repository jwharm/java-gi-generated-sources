package org.gtk.gtk;

/**
 * Baseline position in a row of widgets.
 * <p>
 * Whenever a container has some form of natural row it may align
 * children in that row along a common typographical baseline. If
 * the amount of vertical space in the row is taller than the total
 * requested height of the baseline-aligned children then it can use a
 * {@code GtkBaselinePosition} to select where to put the baseline inside the
 * extra available space.
 */
public class BaselinePosition extends io.github.jwharm.javagi.Enumeration {

    /**
     * Align the baseline at the top
     */
    public static final BaselinePosition TOP = new BaselinePosition(0);
    
    /**
     * Center the baseline
     */
    public static final BaselinePosition CENTER = new BaselinePosition(1);
    
    /**
     * Align the baseline at the bottom
     */
    public static final BaselinePosition BOTTOM = new BaselinePosition(2);
    
    public BaselinePosition(int value) {
        super(value);
    }
    
}
