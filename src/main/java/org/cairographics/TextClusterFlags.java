package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TextClusterFlags implements io.github.jwharm.javagi.Enumeration {
    BACKWARD(1);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_text_cluster_flags_t";
    
    private final int value;
    TextClusterFlags(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TextClusterFlags of(int value) {
        return switch (value) {
            case 1 -> BACKWARD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
