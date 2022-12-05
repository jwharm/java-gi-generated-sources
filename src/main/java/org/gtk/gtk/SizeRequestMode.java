package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public enum SizeRequestMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Prefer height-for-width geometry management
     */
    HEIGHT_FOR_WIDTH(0),
    /**
     * Prefer width-for-height geometry management
     */
    WIDTH_FOR_HEIGHT(1),
    /**
     * Don’t trade height-for-width or width-for-height
     */
    CONSTANT_SIZE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSizeRequestMode";
    
    private final int value;
    SizeRequestMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SizeRequestMode of(int value) {
        return switch (value) {
            case 0 -> HEIGHT_FOR_WIDTH;
            case 1 -> WIDTH_FOR_HEIGHT;
            case 2 -> CONSTANT_SIZE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
