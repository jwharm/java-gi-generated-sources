package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The indexes of colors passed to symbolic color rendering, such as
 * {@link SymbolicPaintable#snapshotSymbolic}.
 * <p>
 * More values may be added over time.
 * @version 4.6
 */
public enum SymbolicColor implements io.github.jwharm.javagi.Enumeration {
    /**
     * The default foreground color
     */
    FOREGROUND(0),
    /**
     * Indication color for errors
     */
    ERROR(1),
    /**
     * Indication color for warnings
     */
    WARNING(2),
    /**
     * Indication color for success
     */
    SUCCESS(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkSymbolicColor";
    
    private final int value;
    SymbolicColor(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SymbolicColor of(int value) {
        return switch (value) {
            case 0 -> FOREGROUND;
            case 1 -> ERROR;
            case 2 -> WARNING;
            case 3 -> SUCCESS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
