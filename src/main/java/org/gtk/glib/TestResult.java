package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum TestResult implements io.github.jwharm.javagi.Enumeration {
    SUCCESS(0),
    SKIPPED(1),
    FAILURE(2),
    INCOMPLETE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GTestResult";
    
    private final int value;
    TestResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TestResult of(int value) {
        return switch (value) {
            case 0 -> SUCCESS;
            case 1 -> SKIPPED;
            case 2 -> FAILURE;
            case 3 -> INCOMPLETE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
