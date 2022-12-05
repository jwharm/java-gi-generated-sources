package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Format implements io.github.jwharm.javagi.Enumeration {
    INVALID(-1),
    ARGB32(0),
    RGB24(1),
    A8(2),
    A1(3),
    RGB16_565(4),
    RGB30(5);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_format_t";
    
    private final int value;
    Format(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Format of(int value) {
        return switch (value) {
            case -1 -> INVALID;
            case 0 -> ARGB32;
            case 1 -> RGB24;
            case 2 -> A8;
            case 3 -> A1;
            case 4 -> RGB16_565;
            case 5 -> RGB30;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
