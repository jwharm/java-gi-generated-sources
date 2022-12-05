package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying the base position for a
 * g_io_channel_seek_position() operation.
 */
public enum SeekType implements io.github.jwharm.javagi.Enumeration {
    /**
     * the current position in the file.
     */
    CUR(0),
    /**
     * the start of the file.
     */
    SET(1),
    /**
     * the end of the file.
     */
    END(2);
    
    private static final java.lang.String C_TYPE_NAME = "GSeekType";
    
    private final int value;
    SeekType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SeekType of(int value) {
        return switch (value) {
            case 0 -> CUR;
            case 1 -> SET;
            case 2 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
