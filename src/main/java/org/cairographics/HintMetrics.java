package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum HintMetrics implements io.github.jwharm.javagi.Enumeration {
    DEFAULT(0),
    OFF(1),
    ON(2);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_hint_metrics_t";
    
    private final int value;
    HintMetrics(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static HintMetrics of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> OFF;
            case 2 -> ON;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
