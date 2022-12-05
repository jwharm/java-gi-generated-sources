package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Results returned from g_converter_convert().
 * @version 2.24
 */
public enum ConverterResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * There was an error during conversion.
     */
    ERROR(0),
    /**
     * Some data was consumed or produced
     */
    CONVERTED(1),
    /**
     * The conversion is finished
     */
    FINISHED(2),
    /**
     * Flushing is finished
     */
    FLUSHED(3);
    
    private static final java.lang.String C_TYPE_NAME = "GConverterResult";
    
    private final int value;
    ConverterResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ConverterResult of(int value) {
        return switch (value) {
            case 0 -> ERROR;
            case 1 -> CONVERTED;
            case 2 -> FINISHED;
            case 3 -> FLUSHED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
