package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different parsing errors that can occur.
 */
public class ParseError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstParseError";
    
    /**
     * A syntax error occurred.
     */
    public static final ParseError SYNTAX = new ParseError(0);
    
    /**
     * The description contained an unknown element
     */
    public static final ParseError NO_SUCH_ELEMENT = new ParseError(1);
    
    /**
     * An element did not have a specified property
     */
    public static final ParseError NO_SUCH_PROPERTY = new ParseError(2);
    
    /**
     * There was an error linking two pads.
     */
    public static final ParseError LINK = new ParseError(3);
    
    /**
     * There was an error setting a property
     */
    public static final ParseError COULD_NOT_SET_PROPERTY = new ParseError(4);
    
    /**
     * An empty bin was specified.
     */
    public static final ParseError EMPTY_BIN = new ParseError(5);
    
    /**
     * An empty description was specified
     */
    public static final ParseError EMPTY = new ParseError(6);
    
    /**
     * A delayed link did not get resolved.
     */
    public static final ParseError DELAYED_LINK = new ParseError(7);
    
    public ParseError(int value) {
        super(value);
    }
    
    /**
     * Get the error quark used by the parsing subsystem.
     * @return the quark of the parse errors.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_parse_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_parse_error_quark = Interop.downcallHandle(
            "gst_parse_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
