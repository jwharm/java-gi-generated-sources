package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum Content implements io.github.jwharm.javagi.Enumeration {
    COLOR(4096),
    ALPHA(8192),
    COLOR_ALPHA(12288);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_content_t";
    
    private final int value;
    Content(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Content of(int value) {
        return switch (value) {
            case 4096 -> COLOR;
            case 8192 -> ALPHA;
            case 12288 -> COLOR_ALPHA;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
