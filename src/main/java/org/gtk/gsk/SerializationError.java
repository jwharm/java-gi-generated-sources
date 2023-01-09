package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors that can happen during (de)serialization.
 */
public enum SerializationError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The format can not be identified
     */
    UNSUPPORTED_FORMAT(0),
    
    /**
     * The version of the data is not
     *   understood
     */
    UNSUPPORTED_VERSION(1),
    
    /**
     * The given data may not exist in
     *   a proper serialization
     */
    INVALID_DATA(2);
    
    private static final java.lang.String C_TYPE_NAME = "GskSerializationError";
    
    private final int value;
    
    /**
     * Create a new SerializationError for the provided value
     * @param numeric value the enum value
     */
    SerializationError(int value) {
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
     * Create a new SerializationError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SerializationError of(int value) {
        return switch (value) {
            case 0 -> UNSUPPORTED_FORMAT;
            case 1 -> UNSUPPORTED_VERSION;
            case 2 -> INVALID_DATA;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_serialization_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_serialization_error_quark = Interop.downcallHandle(
                "gsk_serialization_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
