package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Library errors are for errors from the library being used by elements
 * (initializing, finalizing, settings, ...)
 */
public enum LibraryError implements io.github.jwharm.javagi.Enumeration {
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    FAILED(1),
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    TOO_LAZY(2),
    /**
     * used when the library could not be opened.
     */
    INIT(3),
    /**
     * used when the library could not be closed.
     */
    SHUTDOWN(4),
    /**
     * used when the library doesn't accept settings.
     */
    SETTINGS(5),
    /**
     * used when the library generated an encoding error.
     */
    ENCODE(6),
    /**
     * the number of library error types.
     */
    NUM_ERRORS(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstLibraryError";
    
    private final int value;
    LibraryError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static LibraryError of(int value) {
        return switch (value) {
            case 1 -> FAILED;
            case 2 -> TOO_LAZY;
            case 3 -> INIT;
            case 4 -> SHUTDOWN;
            case 5 -> SETTINGS;
            case 6 -> ENCODE;
            case 7 -> NUM_ERRORS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_library_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_library_error_quark = Interop.downcallHandle(
            "gst_library_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
