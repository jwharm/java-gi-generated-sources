package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DataStreamNewlineType} is used when checking for or setting the line endings for a given file.
 */
public enum DataStreamNewlineType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Selects "LF" line endings, common on most modern UNIX platforms.
     */
    LF(0),
    /**
     * Selects "CR" line endings.
     */
    CR(1),
    /**
     * Selects "CR, LF" line ending, common on Microsoft Windows.
     */
    CR_LF(2),
    /**
     * Automatically try to handle any line ending type.
     */
    ANY(3);
    
    private static final java.lang.String C_TYPE_NAME = "GDataStreamNewlineType";
    
    private final int value;
    DataStreamNewlineType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DataStreamNewlineType of(int value) {
        return switch (value) {
            case 0 -> LF;
            case 1 -> CR;
            case 2 -> CR_LF;
            case 3 -> ANY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
