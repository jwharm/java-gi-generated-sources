package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Core errors are errors inside the core GStreamer library.
 */
public class CoreError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstCoreError";
    
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    public static final CoreError FAILED = new CoreError(1);
    
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    public static final CoreError TOO_LAZY = new CoreError(2);
    
    /**
     * use this when you do not want to implement
     * this functionality yet.
     */
    public static final CoreError NOT_IMPLEMENTED = new CoreError(3);
    
    /**
     * used for state change errors.
     */
    public static final CoreError STATE_CHANGE = new CoreError(4);
    
    /**
     * used for pad-related errors.
     */
    public static final CoreError PAD = new CoreError(5);
    
    /**
     * used for thread-related errors.
     */
    public static final CoreError THREAD = new CoreError(6);
    
    /**
     * used for negotiation-related errors.
     */
    public static final CoreError NEGOTIATION = new CoreError(7);
    
    /**
     * used for event-related errors.
     */
    public static final CoreError EVENT = new CoreError(8);
    
    /**
     * used for seek-related errors.
     */
    public static final CoreError SEEK = new CoreError(9);
    
    /**
     * used for caps-related errors.
     */
    public static final CoreError CAPS = new CoreError(10);
    
    /**
     * used for negotiation-related errors.
     */
    public static final CoreError TAG = new CoreError(11);
    
    /**
     * used if a plugin is missing.
     */
    public static final CoreError MISSING_PLUGIN = new CoreError(12);
    
    /**
     * used for clock related errors.
     */
    public static final CoreError CLOCK = new CoreError(13);
    
    /**
     * used if functionality has been disabled at
     *                           compile time.
     */
    public static final CoreError DISABLED = new CoreError(14);
    
    /**
     * the number of core error types.
     */
    public static final CoreError NUM_ERRORS = new CoreError(15);
    
    public CoreError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
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
