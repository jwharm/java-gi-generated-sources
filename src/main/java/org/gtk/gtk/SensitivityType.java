package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public enum SensitivityType implements io.github.jwharm.javagi.Enumeration {
    /**
     * The control is made insensitive if no
     *   action can be triggered
     */
    AUTO(0),
    /**
     * The control is always sensitive
     */
    ON(1),
    /**
     * The control is always insensitive
     */
    OFF(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSensitivityType";
    
    private final int value;
    SensitivityType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SensitivityType of(int value) {
        return switch (value) {
            case 0 -> AUTO;
            case 1 -> ON;
            case 2 -> OFF;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
