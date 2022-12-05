package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Buffer dropping scheme to avoid the element's internal queue to block when
 * full.
 * @version 1.20
 */
public enum AppLeakyType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Not Leaky
     */
    NONE(0),
    /**
     * Leaky on upstream (new buffers)
     */
    UPSTREAM(1),
    /**
     * Leaky on downstream (old buffers)
     */
    DOWNSTREAM(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstAppLeakyType";
    
    private final int value;
    AppLeakyType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AppLeakyType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> UPSTREAM;
            case 2 -> DOWNSTREAM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
