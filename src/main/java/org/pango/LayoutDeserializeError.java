package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Errors that can be returned by {@link Layout#deserialize}.
 * @version 1.50
 */
public class LayoutDeserializeError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayoutDeserializeError";
    
    /**
     * Unspecified error
     */
    public static final LayoutDeserializeError INVALID = new LayoutDeserializeError(0);
    
    /**
     * A JSon value could not be
     *   interpreted
     */
    public static final LayoutDeserializeError INVALID_VALUE = new LayoutDeserializeError(1);
    
    /**
     * A required JSon member was
     *   not found
     */
    public static final LayoutDeserializeError MISSING_VALUE = new LayoutDeserializeError(2);
    
    public LayoutDeserializeError(int value) {
        super(value);
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
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
