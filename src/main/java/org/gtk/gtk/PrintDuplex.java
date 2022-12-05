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
    PrintDuplex(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PrintDuplex of(int value) {
        return switch (value) {
            case 0 -> SIMPLEX;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
