package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOError} is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public enum IOError implements io.github.jwharm.javagi.Enumeration {
    /**
     * no error
     */
    NONE(0),
    /**
     * an EAGAIN error occurred
     */
    AGAIN(1),
    /**
     * an EINVAL error occurred
     */
    INVAL(2),
    /**
     * another error occurred
     */
    UNKNOWN(3);
    
    private static final java.lang.String C_TYPE_NAME = "GIOError";
    
    private final int value;
    IOError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static IOError of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> AGAIN;
            case 2 -> INVAL;
            case 3 -> UNKNOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
