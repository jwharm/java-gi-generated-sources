package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum LineCap implements io.github.jwharm.javagi.Enumeration {
    BUTT(0),
    ROUND(1),
    SQUARE(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_line_cap_t";
    
    private final int value;
    LineCap(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static LineCap of(int value) {
        return switch (value) {
            case 0 -> BUTT;
            case 1 -> ROUND;
            case 2 -> SQUARE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
