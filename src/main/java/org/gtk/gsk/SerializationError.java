package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors that can happen during (de)serialization.
 */
public class SerializationError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The format can not be identified
     */
    public static final SerializationError UNSUPPORTED_FORMAT = new SerializationError(0);
    
    /**
     * The version of the data is not
     *   understood
     */
    public static final SerializationError UNSUPPORTED_VERSION = new SerializationError(1);
    
    /**
     * The given data may not exist in
     *   a proper serialization
     */
    public static final SerializationError INVALID_DATA = new SerializationError(2);
    
    public SerializationError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
