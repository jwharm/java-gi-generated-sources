package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors that can be returned by {@link Layout#deserialize}.
 * @version 1.50
 */
public enum LayoutDeserializeError implements io.github.jwharm.javagi.Enumeration {
    /**
     * Unspecified error
     */
    INVALID(0),
    /**
     * A JSon value could not be
     *   interpreted
     */
    INVALID_VALUE(1),
    /**
     * A required JSon member was
     *   not found
     */
    MISSING_VALUE(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutDeserializeError";
    
    private final int value;
    LayoutDeserializeError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static LayoutDeserializeError of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> INVALID_VALUE;
            case 2 -> MISSING_VALUE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_deserialize_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_layout_deserialize_error_quark = Interop.downcallHandle(
            "pango_layout_deserialize_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
