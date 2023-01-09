package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These identify the various errors that can occur while calling
 * {@code GtkFileChooser} functions.
 */
public enum FileChooserError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Indicates that a file does not exist.
     */
    NONEXISTENT(0),
    
    /**
     * Indicates a malformed filename.
     */
    BAD_FILENAME(1),
    
    /**
     * Indicates a duplicate path (e.g. when
     *  adding a bookmark).
     */
    ALREADY_EXISTS(2),
    
    /**
     * Indicates an incomplete hostname
     *  (e.g. "http://foo" without a slash after that).
     */
    INCOMPLETE_HOSTNAME(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserError";
    
    private final int value;
    
    /**
     * Create a new FileChooserError for the provided value
     * @param numeric value the enum value
     */
    FileChooserError(int value) {
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
     * Create a new FileChooserError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FileChooserError of(int value) {
        return switch (value) {
            case 0 -> NONEXISTENT;
            case 1 -> BAD_FILENAME;
            case 2 -> ALREADY_EXISTS;
            case 3 -> INCOMPLETE_HOSTNAME;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Registers an error quark for {@code GtkFileChooser} errors.
     * @return The error quark used for {@code GtkFileChooser} errors.
     */
    public static org.gtk.glib.Quark quark() {
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
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
}
