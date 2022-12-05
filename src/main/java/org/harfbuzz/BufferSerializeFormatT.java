package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The buffer serialization and de-serialization format used in
 * hb_buffer_serialize_glyphs() and hb_buffer_deserialize_glyphs().
 * @version 0.9.2
 */
public enum BufferSerializeFormatT implements io.github.jwharm.javagi.Enumeration {
    /**
     * a human-readable, plain text format.
     */
    TEXT(1413830740),
    /**
     * a machine-readable JSON format.
     */
    JSON(1246973774),
    /**
     * invalid format.
     */
    INVALID(0);
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_serialize_format_t";
    
    private final int value;
    BufferSerializeFormatT(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BufferSerializeFormatT of(int value) {
        return switch (value) {
            case 1413830740 -> TEXT;
            case 1246973774 -> JSON;
            case 0 -> INVALID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
