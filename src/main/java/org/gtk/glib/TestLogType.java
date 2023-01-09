package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TestLogType implements io.github.jwharm.javagi.Enumeration {
    
    NONE(0),
    
    ERROR(1),
    
    START_BINARY(2),
    
    LIST_CASE(3),
    
    SKIP_CASE(4),
    
    START_CASE(5),
    
    STOP_CASE(6),
    
    MIN_RESULT(7),
    
    MAX_RESULT(8),
    
    MESSAGE(9),
    
    START_SUITE(10),
    
    STOP_SUITE(11);
    
    private static final java.lang.String C_TYPE_NAME = "GTestLogType";
    
    private final int value;
    
    /**
     * Create a new TestLogType for the provided value
     * @param numeric value the enum value
     */
    TestLogType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TestLogType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TestLogType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ERROR;
            case 2 -> START_BINARY;
            case 3 -> LIST_CASE;
            case 4 -> SKIP_CASE;
            case 5 -> START_CASE;
            case 6 -> STOP_CASE;
            case 7 -> MIN_RESULT;
            case 8 -> MAX_RESULT;
            case 9 -> MESSAGE;
            case 10 -> START_SUITE;
            case 11 -> STOP_SUITE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
