package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes for {@code GtkRecentManager} operations
 */
public enum RecentManagerError implements io.github.jwharm.javagi.Enumeration {
    /**
     * the URI specified does not exists in
     *   the recently used resources list.
     */
    NOT_FOUND(0),
    /**
     * the URI specified is not valid.
     */
    INVALID_URI(1),
    /**
     * the supplied string is not
     *   UTF-8 encoded.
     */
    INVALID_ENCODING(2),
    /**
     * no application has registered
     *   the specified item.
     */
    NOT_REGISTERED(3),
    /**
     * failure while reading the recently used
     *   resources file.
     */
    READ(4),
    /**
     * failure while writing the recently used
     *   resources file.
     */
    WRITE(5),
    /**
     * unspecified error.
     */
    UNKNOWN(6);
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentManagerError";
    
    private final int value;
    RecentManagerError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static RecentManagerError of(int value) {
        return switch (value) {
            case 0 -> NOT_FOUND;
            case 1 -> INVALID_URI;
            case 2 -> INVALID_ENCODING;
            case 3 -> NOT_REGISTERED;
            case 4 -> READ;
            case 5 -> WRITE;
            case 6 -> UNKNOWN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_recent_manager_error_quark = Interop.downcallHandle(
            "gtk_recent_manager_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
