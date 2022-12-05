package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public enum BaselinePosition implements io.github.jwharm.javagi.Enumeration {
    /**
     * Align the baseline at the top
     */
    TOP(0),
    /**
     * Center the baseline
     */
    CENTER(1),
    /**
     * Align the baseline at the bottom
     */
    BOTTOM(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkBaselinePosition";
    
    private final int value;
    BaselinePosition(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BaselinePosition of(int value) {
        return switch (value) {
            case 0 -> TOP;
            case 1 -> CENTER;
            case 2 -> BOTTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
