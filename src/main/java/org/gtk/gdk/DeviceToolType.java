package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates the specific type of tool being used being a tablet. Such as an
 * airbrush, pencil, etc.
 */
public enum DeviceToolType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Tool is of an unknown type.
     */
    UNKNOWN(0),
    /**
     * Tool is a standard tablet stylus.
     */
    PEN(1),
    /**
     * Tool is standard tablet eraser.
     */
    ERASER(2),
    /**
     * Tool is a brush stylus.
     */
    BRUSH(3),
    /**
     * Tool is a pencil stylus.
     */
    PENCIL(4),
    /**
     * Tool is an airbrush stylus.
     */
    AIRBRUSH(5),
    /**
     * Tool is a mouse.
     */
    MOUSE(6),
    /**
     * Tool is a lens cursor.
     */
    LENS(7);
    
    private static final java.lang.String C_TYPE_NAME = "GdkDeviceToolType";
    
    private final int value;
    DeviceToolType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DeviceToolType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> PEN;
            case 2 -> ERASER;
            case 3 -> BRUSH;
            case 4 -> PENCIL;
            case 5 -> AIRBRUSH;
            case 6 -> MOUSE;
            case 7 -> LENS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
