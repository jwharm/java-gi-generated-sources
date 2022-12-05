package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by option parsing.
 */
public enum OptionError implements io.github.jwharm.javagi.Enumeration {
    /**
     * An option was not known to the parser.
     *  This error will only be reported, if the parser hasn't been instructed
     *  to ignore unknown options, see g_option_context_set_ignore_unknown_options().
     */
    UNKNOWN_OPTION(0),
    /**
     * A value couldn't be parsed.
     */
    BAD_VALUE(1),
    /**
     * A {@link OptionArgFunc} callback failed.
     */
    FAILED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GOptionError";
    
    private final int value;
    OptionError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static OptionError of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN_OPTION;
            case 1 -> BAD_VALUE;
            case 2 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
