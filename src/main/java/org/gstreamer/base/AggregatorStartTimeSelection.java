package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum AggregatorStartTimeSelection implements io.github.jwharm.javagi.Enumeration {
    /**
     * Start at running time 0.
     */
    ZERO(0),
    /**
     * Start at the running time of
     * the first buffer that is received.
     */
    FIRST(1),
    /**
     * Start at the running time
     * selected by the {@code start-time} property.
     */
    SET(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorStartTimeSelection";
    
    private final int value;
    AggregatorStartTimeSelection(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AggregatorStartTimeSelection of(int value) {
        return switch (value) {
            case 0 -> ZERO;
            case 1 -> FIRST;
            case 2 -> SET;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
