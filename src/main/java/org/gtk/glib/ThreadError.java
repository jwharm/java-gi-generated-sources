package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors of thread related functions.
 */
public enum ThreadError implements io.github.jwharm.javagi.Enumeration {
    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    THREAD_ERROR_AGAIN(0);
    
    private static final java.lang.String C_TYPE_NAME = "GThreadError";
    
    private final int value;
    ThreadError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ThreadError of(int value) {
        return switch (value) {
            case 0 -> THREAD_ERROR_AGAIN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
