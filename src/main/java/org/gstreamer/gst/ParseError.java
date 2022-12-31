package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different parsing errors that can occur.
 */
public enum ParseError implements io.github.jwharm.javagi.Enumeration {
    /**
     * A syntax error occurred.
     */
    SYNTAX(0),
    /**
     * The description contained an unknown element
     */
    NO_SUCH_ELEMENT(1),
    /**
     * An element did not have a specified property
     */
    NO_SUCH_PROPERTY(2),
    /**
     * There was an error linking two pads.
     */
    LINK(3),
    /**
     * There was an error setting a property
     */
    COULD_NOT_SET_PROPERTY(4),
    /**
     * An empty bin was specified.
     */
    EMPTY_BIN(5),
    /**
     * An empty description was specified
     */
    EMPTY(6),
    /**
     * A delayed link did not get resolved.
     */
    DELAYED_LINK(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstParseError";
    
    private final int value;
    ParseError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ParseError of(int value) {
        return switch (value) {
            case 0 -> SYNTAX;
            case 1 -> NO_SUCH_ELEMENT;
            case 2 -> NO_SUCH_PROPERTY;
            case 3 -> LINK;
            case 4 -> COULD_NOT_SET_PROPERTY;
            case 5 -> EMPTY_BIN;
            case 6 -> EMPTY;
            case 7 -> DELAYED_LINK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Get the error quark used by the parsing subsystem.
     * @return the quark of the parse errors.
     */
    public static org.gtk.glib.Quark quark() {
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
