package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Core errors are errors inside the core GStreamer library.
 */
public enum CoreError implements io.github.jwharm.javagi.Enumeration {
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
     * use this when you do not want to implement
     * this functionality yet.
     */
    NOT_IMPLEMENTED(3),
    /**
     * used for state change errors.
     */
    STATE_CHANGE(4),
    /**
     * used for pad-related errors.
     */
    PAD(5),
    /**
     * used for thread-related errors.
     */
    THREAD(6),
    /**
     * used for negotiation-related errors.
     */
    NEGOTIATION(7),
    /**
     * used for event-related errors.
     */
    EVENT(8),
    /**
     * used for seek-related errors.
     */
    SEEK(9),
    /**
     * used for caps-related errors.
     */
    CAPS(10),
    /**
     * used for negotiation-related errors.
     */
    TAG(11),
    /**
     * used if a plugin is missing.
     */
    MISSING_PLUGIN(12),
    /**
     * used for clock related errors.
     */
    CLOCK(13),
    /**
     * used if functionality has been disabled at
     *                           compile time.
     */
    DISABLED(14),
    /**
     * the number of core error types.
     */
    NUM_ERRORS(15);
    
    private static final java.lang.String C_TYPE_NAME = "GstCoreError";
    
    private final int value;
    CoreError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CoreError of(int value) {
        return switch (value) {
            case 1 -> FAILED;
            case 2 -> TOO_LAZY;
            case 3 -> NOT_IMPLEMENTED;
            case 4 -> STATE_CHANGE;
            case 5 -> PAD;
            case 6 -> THREAD;
            case 7 -> NEGOTIATION;
            case 8 -> EVENT;
            case 9 -> SEEK;
            case 10 -> CAPS;
            case 11 -> TAG;
            case 12 -> MISSING_PLUGIN;
            case 13 -> CLOCK;
            case 14 -> DISABLED;
            case 15 -> NUM_ERRORS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_core_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_core_error_quark = Interop.downcallHandle(
            "gst_core_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
