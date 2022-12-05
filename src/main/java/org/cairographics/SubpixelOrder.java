package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SubpixelOrder implements io.github.jwharm.javagi.Enumeration {
    DEFAULT(0),
    RGB(1),
    BGR(2),
    VRGB(3),
    VBGR(4);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_subpixel_order_t";
    
    private final int value;
    SubpixelOrder(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SubpixelOrder of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> RGB;
            case 2 -> BGR;
            case 3 -> VRGB;
            case 4 -> VBGR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
