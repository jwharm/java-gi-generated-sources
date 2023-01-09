package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of {@link BufferT} contents.
 */
public enum BufferContentTypeT implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Initial value for new buffer.
     */
    INVALID(0),
    
    /**
     * The buffer contains input characters (before shaping).
     */
    UNICODE(1),
    
    /**
     * The buffer contains output glyphs (after shaping).
     */
    GLYPHS(2);
    
    private static final java.lang.String C_TYPE_NAME = "hb_buffer_content_type_t";
    
    private final int value;
    
    /**
     * Create a new BufferContentTypeT for the provided value
     * @param numeric value the enum value
     */
    BufferContentTypeT(int value) {
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
     * Create a new BufferContentTypeT for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BufferContentTypeT of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> UNICODE;
            case 2 -> GLYPHS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
