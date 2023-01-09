package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TitlebarGesture implements io.github.jwharm.javagi.Enumeration {
    
    DOUBLE_CLICK(1),
    
    RIGHT_CLICK(2),
    
    MIDDLE_CLICK(3);
    
    private static final java.lang.String C_TYPE_NAME = "GdkTitlebarGesture";
    
    private final int value;
    
    /**
     * Create a new TitlebarGesture for the provided value
     * @param numeric value the enum value
     */
    TitlebarGesture(int value) {
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
     * Create a new TitlebarGesture for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TitlebarGesture of(int value) {
        return switch (value) {
            case 1 -> DOUBLE_CLICK;
            case 2 -> RIGHT_CLICK;
            case 3 -> MIDDLE_CLICK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
