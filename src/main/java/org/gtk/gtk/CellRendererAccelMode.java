package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The available modes for {@code Gtk.CellRendererAccel:accel-mode}.
 */
public enum CellRendererAccelMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * GTK accelerators mode
     */
    GTK(0),
    
    /**
     * Other accelerator mode
     */
    OTHER(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererAccelMode";
    
    private final int value;
    
    /**
     * Create a new CellRendererAccelMode for the provided value
     * @param numeric value the enum value
     */
    CellRendererAccelMode(int value) {
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
     * Create a new CellRendererAccelMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CellRendererAccelMode of(int value) {
        return switch (value) {
            case 0 -> GTK;
            case 1 -> OTHER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
