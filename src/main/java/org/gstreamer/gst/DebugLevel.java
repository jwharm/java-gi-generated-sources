package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The level defines the importance of a debugging message. The more important a
 * message is, the greater the probability that the debugging system outputs it.
 */
public enum DebugLevel implements io.github.jwharm.javagi.Enumeration {
    /**
     * No debugging level specified or desired. Used to deactivate
     *  debugging output.
     */
    NONE(0),
    /**
     * Error messages are to be used only when an error occurred
     *  that stops the application from keeping working correctly.
     *  An examples is gst_element_error, which outputs a message with this priority.
     *  It does not mean that the application is terminating as with g_error.
     */
    ERROR(1),
    /**
     * Warning messages are to inform about abnormal behaviour
     *  that could lead to problems or weird behaviour later on. An example of this
     *  would be clocking issues ("your computer is pretty slow") or broken input
     *  data ("Can't synchronize to stream.")
     */
    WARNING(2),
    /**
     * Fixme messages are messages that indicate that something
     *  in the executed code path is not fully implemented or handled yet. Note
     *  that this does not replace proper error handling in any way, the purpose
     *  of this message is to make it easier to spot incomplete/unfinished pieces
     *  of code when reading the debug log.
     */
    FIXME(3),
    /**
     * Informational messages should be used to keep the developer
     *  updated about what is happening.
     *  Examples where this should be used are when a typefind function has
     *  successfully determined the type of the stream or when an mp3 plugin detects
     *  the format to be used. ("This file has mono sound.")
     */
    INFO(4),
    /**
     * Debugging messages should be used when something common
     *  happens that is not the expected default behavior, or something that's
     *  useful to know but doesn't happen all the time (ie. per loop iteration or
     *  buffer processed or event handled).
     *  An example would be notifications about state changes or receiving/sending
     *  of events.
     */
    DEBUG(5),
    /**
     * Log messages are messages that are very common but might be
     *  useful to know. As a rule of thumb a pipeline that is running as expected
     *  should never output anything else but LOG messages whilst processing data.
     *  Use this log level to log recurring information in chain functions and
     *  loop functions, for example.
     */
    LOG(6),
    /**
     * Tracing-related messages.
     *  Examples for this are referencing/dereferencing of objects.
     */
    TRACE(7),
    /**
     * memory dump messages are used to log (small) chunks of
     *  data as memory dumps in the log. They will be displayed as hexdump with
     *  ASCII characters.
     */
    MEMDUMP(9),
    /**
     * The number of defined debugging levels.
     */
    COUNT(10);
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugLevel";
    
    private final int value;
    DebugLevel(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DebugLevel of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> ERROR;
            case 2 -> WARNING;
            case 3 -> FIXME;
            case 4 -> INFO;
            case 5 -> DEBUG;
            case 6 -> LOG;
            case 7 -> TRACE;
            case 9 -> MEMDUMP;
            case 10 -> COUNT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Get the string representation of a debugging level
     * @param level the level to get the name for
     * @return the name
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.DebugLevel level) {
        java.util.Objects.requireNonNull(level, "Parameter 'level' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_debug_level_get_name.invokeExact(
                    level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_debug_level_get_name = Interop.downcallHandle(
            "gst_debug_level_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
