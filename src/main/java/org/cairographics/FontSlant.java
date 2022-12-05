package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum FontSlant implements io.github.jwharm.javagi.Enumeration {
    NORMAL(0),
    ITALIC(1),
    OBLIQUE(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_slant_t";
    
    private final int value;
    FontSlant(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FontSlant of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> ITALIC;
            case 2 -> OBLIQUE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
