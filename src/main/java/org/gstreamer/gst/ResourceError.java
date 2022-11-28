package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Resource errors are for any resource used by an element:
 * memory, files, network connections, process space, ...
 * They're typically used by source and sink elements.
 */
public class ResourceError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstResourceError";
    
    /**
     * a general error which doesn't fit in any other
     * category.  Make sure you add a custom message to the error call.
     */
    public static final ResourceError FAILED = new ResourceError(1);
    
    /**
     * do not use this except as a placeholder for
     * deciding where to go while developing code.
     */
    public static final ResourceError TOO_LAZY = new ResourceError(2);
    
    /**
     * used when the resource could not be found.
     */
    public static final ResourceError NOT_FOUND = new ResourceError(3);
    
    /**
     * used when resource is busy.
     */
    public static final ResourceError BUSY = new ResourceError(4);
    
    /**
     * used when resource fails to open for reading.
     */
    public static final ResourceError OPEN_READ = new ResourceError(5);
    
    /**
     * used when resource fails to open for writing.
     */
    public static final ResourceError OPEN_WRITE = new ResourceError(6);
    
    /**
     * used when resource cannot be opened for
     * both reading and writing, or either (but unspecified which).
     */
    public static final ResourceError OPEN_READ_WRITE = new ResourceError(7);
    
    /**
     * used when the resource can't be closed.
     */
    public static final ResourceError CLOSE = new ResourceError(8);
    
    /**
     * used when the resource can't be read from.
     */
    public static final ResourceError READ = new ResourceError(9);
    
    /**
     * used when the resource can't be written to.
     */
    public static final ResourceError WRITE = new ResourceError(10);
    
    /**
     * used when a seek on the resource fails.
     */
    public static final ResourceError SEEK = new ResourceError(11);
    
    /**
     * used when a synchronize on the resource fails.
     */
    public static final ResourceError SYNC = new ResourceError(12);
    
    /**
     * used when settings can't be manipulated on.
     */
    public static final ResourceError SETTINGS = new ResourceError(13);
    
    /**
     * used when the resource has no space left.
     */
    public static final ResourceError NO_SPACE_LEFT = new ResourceError(14);
    
    /**
     * used when the resource can't be opened
     *                                     due to missing authorization.
     *                                     (Since: 1.2.4)
     */
    public static final ResourceError NOT_AUTHORIZED = new ResourceError(15);
    
    /**
     * the number of resource error types.
     */
    public static final ResourceError NUM_ERRORS = new ResourceError(16);
    
    public ResourceError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_resource_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_resource_error_quark = Interop.downcallHandle(
            "gst_resource_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
