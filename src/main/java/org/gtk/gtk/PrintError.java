package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public enum PrintError implements io.github.jwharm.javagi.Enumeration {
    /**
     * An unspecified error occurred.
     */
    GENERAL(0),
    /**
     * An internal error occurred.
     */
    INTERNAL_ERROR(1),
    /**
     * A memory allocation failed.
     */
    NOMEM(2),
    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    INVALID_FILE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintError";
    
    private final int value;
    PrintError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PrintError of(int value) {
        return switch (value) {
            case 0 -> GENERAL;
            case 1 -> INTERNAL_ERROR;
            case 2 -> NOMEM;
            case 3 -> INVALID_FILE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Registers an error quark for {@code GtkPrintOperation} if necessary.
     * @return The error quark used for {@code GtkPrintOperation} errors.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_print_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_print_error_quark = Interop.downcallHandle(
            "gtk_print_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
