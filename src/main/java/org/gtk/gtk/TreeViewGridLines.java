package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public enum TreeViewGridLines implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No grid lines.
     */
    NONE(0),
    
    /**
     * Horizontal grid lines.
     */
    HORIZONTAL(1),
    
    /**
     * Vertical grid lines.
     */
    VERTICAL(2),
    
    /**
     * Horizontal and vertical grid lines.
     */
    BOTH(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeViewGridLines";
    
    private final int value;
    
    /**
     * Create a new TreeViewGridLines for the provided value
     * @param numeric value the enum value
     */
    TreeViewGridLines(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TreeViewGridLines for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TreeViewGridLines of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            case 3 -> BOTH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
