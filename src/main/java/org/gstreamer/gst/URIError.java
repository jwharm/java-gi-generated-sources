package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different URI-related errors that can occur.
 */
public class URIError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstURIError";
    
    /**
     * The protocol is not supported
     */
    public static final URIError UNSUPPORTED_PROTOCOL = new URIError(0);
    
    /**
     * There was a problem with the URI
     */
    public static final URIError BAD_URI = new URIError(1);
    
    /**
     * Could not set or change the URI because the
     *     URI handler was in a state where that is not possible or not permitted
     */
    public static final URIError BAD_STATE = new URIError(2);
    
    /**
     * There was a problem with the entity that
     *     the URI references
     */
    public static final URIError BAD_REFERENCE = new URIError(3);
    
    public URIError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_uri_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_uri_error_quark = Interop.downcallHandle(
            "gst_uri_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
