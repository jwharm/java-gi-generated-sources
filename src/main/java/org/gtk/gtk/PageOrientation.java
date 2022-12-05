package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See also gtk_print_settings_set_orientation().
 */
public enum PageOrientation implements io.github.jwharm.javagi.Enumeration {
    /**
     * Portrait mode.
     */
    PORTRAIT(0),
    /**
     * Landscape mode.
     */
    LANDSCAPE(1),
    /**
     * Reverse portrait mode.
     */
    REVERSE_PORTRAIT(2),
    /**
     * Reverse landscape mode.
     */
    REVERSE_LANDSCAPE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPageOrientation";
    
    private final int value;
    PageOrientation(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PageOrientation of(int value) {
        return switch (value) {
            case 0 -> PORTRAIT;
            case 1 -> LANDSCAPE;
            case 2 -> REVERSE_PORTRAIT;
            case 3 -> REVERSE_LANDSCAPE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
