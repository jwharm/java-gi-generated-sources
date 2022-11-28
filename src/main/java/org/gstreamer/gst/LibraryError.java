package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Library errors are for errors from the library being used by elements
 * (initializing, finalizing, settings, ...)
 */
public class LibraryError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstLibraryError";
    
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    public static final LibraryError FAILED = new LibraryError(1);
    
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    public static final LibraryError TOO_LAZY = new LibraryError(2);
    
    /**
     * used when the library could not be opened.
     */
    public static final LibraryError INIT = new LibraryError(3);
    
    /**
     * used when the library could not be closed.
     */
    public static final LibraryError SHUTDOWN = new LibraryError(4);
    
    /**
     * used when the library doesn't accept settings.
     */
    public static final LibraryError SETTINGS = new LibraryError(5);
    
    /**
     * used when the library generated an encoding error.
     */
    public static final LibraryError ENCODE = new LibraryError(6);
    
    /**
     * the number of library error types.
     */
    public static final LibraryError NUM_ERRORS = new LibraryError(7);
    
    public LibraryError(int value) {
        super(value);
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
