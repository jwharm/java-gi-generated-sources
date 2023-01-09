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
public enum ResourceError implements io.github.jwharm.javagi.Enumeration {
    
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
     * used when the resource could not be found.
     */
    NOT_FOUND(3),
    
    /**
     * used when resource is busy.
     */
    BUSY(4),
    
    /**
     * used when resource fails to open for reading.
     */
    OPEN_READ(5),
    
    /**
     * used when resource fails to open for writing.
     */
    OPEN_WRITE(6),
    
    /**
     * used when resource cannot be opened for
     * both reading and writing, or either (but unspecified which).
     */
    OPEN_READ_WRITE(7),
    
    /**
     * used when the resource can't be closed.
     */
    CLOSE(8),
    
    /**
     * used when the resource can't be read from.
     */
    READ(9),
    
    /**
     * used when the resource can't be written to.
     */
    WRITE(10),
    
    /**
     * used when a seek on the resource fails.
     */
    SEEK(11),
    
    /**
     * used when a synchronize on the resource fails.
     */
    SYNC(12),
    
    /**
     * used when settings can't be manipulated on.
     */
    SETTINGS(13),
    
    /**
     * used when the resource has no space left.
     */
    NO_SPACE_LEFT(14),
    
    /**
     * used when the resource can't be opened
     *                                     due to missing authorization.
     *                                     (Since: 1.2.4)
     */
    NOT_AUTHORIZED(15),
    
    /**
     * the number of resource error types.
     */
    NUM_ERRORS(16);
    
    private static final java.lang.String C_TYPE_NAME = "GstResourceError";
    
    private final int value;
    
    /**
     * Create a new ResourceError for the provided value
     * @param numeric value the enum value
     */
    ResourceError(int value) {
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
     * Create a new ResourceError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ResourceError of(int value) {
        return switch (value) {
            case 1 -> FAILED;
            case 2 -> TOO_LAZY;
            case 3 -> NOT_FOUND;
            case 4 -> BUSY;
            case 5 -> OPEN_READ;
            case 6 -> OPEN_WRITE;
            case 7 -> OPEN_READ_WRITE;
            case 8 -> CLOSE;
            case 9 -> READ;
            case 10 -> WRITE;
            case 11 -> SEEK;
            case 12 -> SYNC;
            case 13 -> SETTINGS;
            case 14 -> NO_SPACE_LEFT;
            case 15 -> NOT_AUTHORIZED;
            case 16 -> NUM_ERRORS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static org.gtk.glib.Quark quark() {
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
