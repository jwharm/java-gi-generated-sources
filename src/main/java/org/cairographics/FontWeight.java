package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum FontWeight implements io.github.jwharm.javagi.Enumeration {
    NORMAL(0),
    BOLD(1);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_font_weight_t";
    
    private final int value;
    FontWeight(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FontWeight of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> BOLD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
