package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public class PrintError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintError";
    
    /**
     * An unspecified error occurred.
     */
    public static final PrintError GENERAL = new PrintError(0);
    
    /**
     * An internal error occurred.
     */
    public static final PrintError INTERNAL_ERROR = new PrintError(1);
    
    /**
     * A memory allocation failed.
     */
    public static final PrintError NOMEM = new PrintError(2);
    
    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    public static final PrintError INVALID_FILE = new PrintError(3);
    
    public PrintError(int value) {
        super(value);
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
