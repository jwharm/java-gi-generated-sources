package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different URI-related errors that can occur.
 */
public enum URIError implements io.github.jwharm.javagi.Enumeration {
    /**
     * The protocol is not supported
     */
    UNSUPPORTED_PROTOCOL(0),
    /**
     * There was a problem with the URI
     */
    BAD_URI(1),
    /**
     * Could not set or change the URI because the
     *     URI handler was in a state where that is not possible or not permitted
     */
    BAD_STATE(2),
    /**
     * There was a problem with the entity that
     *     the URI references
     */
    BAD_REFERENCE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstURIError";
    
    private final int value;
    URIError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static URIError of(int value) {
        return switch (value) {
            case 0 -> UNSUPPORTED_PROTOCOL;
            case 1 -> BAD_URI;
            case 2 -> BAD_STATE;
            case 3 -> BAD_REFERENCE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
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
