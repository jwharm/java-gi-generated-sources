package org.gtk.glib;

/**
 * Error codes returned by option parsing.
 */
public class OptionError extends io.github.jwharm.javagi.Enumeration {

    /**
     * An option was not known to the parser.
     *  This error will only be reported, if the parser hasn't been instructed
     *  to ignore unknown options, see g_option_context_set_ignore_unknown_options().
     */
    public static final OptionError UNKNOWN_OPTION = new OptionError(0);
    
    /**
     * A value couldn't be parsed.
     */
    public static final OptionError BAD_VALUE = new OptionError(1);
    
    /**
     * A {@link OptionArgFunc} callback failed.
     */
    public static final OptionError FAILED = new OptionError(2);
    
    public OptionError(int value) {
        super(value);
    }
    
}
