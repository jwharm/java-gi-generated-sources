package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These identify the various errors that can occur while calling
 * {@code GtkFileChooser} functions.
 */
public class FileChooserError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserError";
    
    /**
     * Indicates that a file does not exist.
     */
    public static final FileChooserError NONEXISTENT = new FileChooserError(0);
    
    /**
     * Indicates a malformed filename.
     */
    public static final FileChooserError BAD_FILENAME = new FileChooserError(1);
    
    /**
     * Indicates a duplicate path (e.g. when
     *  adding a bookmark).
     */
    public static final FileChooserError ALREADY_EXISTS = new FileChooserError(2);
    
    /**
     * Indicates an incomplete hostname
     *  (e.g. "http://foo" without a slash after that).
     */
    public static final FileChooserError INCOMPLETE_HOSTNAME = new FileChooserError(3);
    
    public FileChooserError(int value) {
        super(value);
    }
    
    /**
     * Registers an error quark for {@code GtkFileChooser} errors.
     * @return The error quark used for {@code GtkFileChooser} errors.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_file_chooser_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_error_quark = Interop.downcallHandle(
            "gtk_file_chooser_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT),
            false
        );
    }
}
