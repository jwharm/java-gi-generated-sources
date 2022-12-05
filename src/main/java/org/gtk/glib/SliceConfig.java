package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SliceConfig implements io.github.jwharm.javagi.Enumeration {
    ALWAYS_MALLOC(1),
    BYPASS_MAGAZINES(2),
    WORKING_SET_MSECS(3),
    COLOR_INCREMENT(4),
    CHUNK_SIZES(5),
    CONTENTION_COUNTER(6);
    
    private static final java.lang.String C_TYPE_NAME = "GSliceConfig";
    
    private final int value;
    SliceConfig(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SliceConfig of(int value) {
        return switch (value) {
            case 1 -> ALWAYS_MALLOC;
            case 2 -> BYPASS_MAGAZINES;
            case 3 -> WORKING_SET_MSECS;
            case 4 -> COLOR_INCREMENT;
            case 5 -> CHUNK_SIZES;
            case 6 -> CONTENTION_COUNTER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
