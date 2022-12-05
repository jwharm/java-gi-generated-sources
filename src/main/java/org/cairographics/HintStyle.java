package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum HintStyle implements io.github.jwharm.javagi.Enumeration {
    DEFAULT(0),
    NONE(1),
    SLIGHT(2),
    MEDIUM(3),
    FULL(4);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_hint_style_t";
    
    private final int value;
    HintStyle(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static HintStyle of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> NONE;
            case 2 -> SLIGHT;
            case 3 -> MEDIUM;
            case 4 -> FULL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
