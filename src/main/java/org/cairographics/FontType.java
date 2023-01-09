package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum FontType implements io.github.jwharm.javagi.Enumeration {
    
    TOY(0),
    
    FT(1),
    
    WIN32(2),
    
    QUARTZ(3),
    
    USER(4);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_type_t";
    
    private final int value;
    
    /**
     * Create a new FontType for the provided value
     * @param numeric value the enum value
     */
    FontType(int value) {
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
     * Create a new FontType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FontType of(int value) {
        return switch (value) {
            case 0 -> TOY;
            case 1 -> FT;
            case 2 -> WIN32;
            case 3 -> QUARTZ;
            case 4 -> USER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
