package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_duplex().
 */
public enum PrintDuplex implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No duplex.
     */
    SIMPLEX(0),
    
    /**
     * Horizontal duplex.
     */
    HORIZONTAL(1),
    
    /**
     * Vertical duplex.
     */
    VERTICAL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintDuplex";
    
    private final int value;
    
    /**
     * Create a new PrintDuplex for the provided value
     * @param numeric value the enum value
     */
    PrintDuplex(int value) {
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
     * Create a new PrintDuplex for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PrintDuplex of(int value) {
        return switch (value) {
            case 0 -> SIMPLEX;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
