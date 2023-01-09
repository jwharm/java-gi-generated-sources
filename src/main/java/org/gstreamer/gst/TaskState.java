package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different states a task can be in
 */
public enum TaskState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the task is started and running
     */
    STARTED(0),
    
    /**
     * the task is stopped
     */
    STOPPED(1),
    
    /**
     * the task is paused
     */
    PAUSED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstTaskState";
    
    private final int value;
    
    /**
     * Create a new TaskState for the provided value
     * @param numeric value the enum value
     */
    TaskState(int value) {
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
     * Create a new TaskState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TaskState of(int value) {
        return switch (value) {
            case 0 -> STARTED;
            case 1 -> STOPPED;
            case 2 -> PAUSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
