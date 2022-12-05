package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Passed as argument to various keybinding signals.
 */
public enum ScrollStep implements io.github.jwharm.javagi.Enumeration {
    /**
     * Scroll in steps.
     */
    STEPS(0),
    /**
     * Scroll by pages.
     */
    PAGES(1),
    /**
     * Scroll to ends.
     */
    ENDS(2),
    /**
     * Scroll in horizontal steps.
     */
    HORIZONTAL_STEPS(3),
    /**
     * Scroll by horizontal pages.
     */
    HORIZONTAL_PAGES(4),
    /**
     * Scroll to the horizontal ends.
     */
    HORIZONTAL_ENDS(5);
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollStep";
    
    private final int value;
    ScrollStep(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ScrollStep of(int value) {
        return switch (value) {
            case 0 -> STEPS;
            case 1 -> PAGES;
            case 2 -> ENDS;
            case 3 -> HORIZONTAL_STEPS;
            case 4 -> HORIZONTAL_PAGES;
            case 5 -> HORIZONTAL_ENDS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
