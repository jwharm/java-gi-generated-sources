package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The mode of the size group determines the directions in which the size
 * group affects the requested sizes of its component widgets.
 */
public enum SizeGroupMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * group has no effect
     */
    NONE(0),
    /**
     * group affects horizontal requisition
     */
    HORIZONTAL(1),
    /**
     * group affects vertical requisition
     */
    VERTICAL(2),
    /**
     * group affects both horizontal and vertical requisition
     */
    BOTH(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSizeGroupMode";
    
    private final int value;
    SizeGroupMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SizeGroupMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            case 3 -> BOTH;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
