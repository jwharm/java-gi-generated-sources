package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_quality().
 */
public enum PrintQuality implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Low quality.
     */
    LOW(0),
    
    /**
     * Normal quality.
     */
    NORMAL(1),
    
    /**
     * High quality.
     */
    HIGH(2),
    
    /**
     * Draft quality.
     */
    DRAFT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintQuality";
    
    private final int value;
    
    /**
     * Create a new PrintQuality for the provided value
     * @param numeric value the enum value
     */
    PrintQuality(int value) {
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
     * Create a new PrintQuality for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PrintQuality of(int value) {
        return switch (value) {
            case 0 -> LOW;
            case 1 -> NORMAL;
            case 2 -> HIGH;
            case 3 -> DRAFT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
