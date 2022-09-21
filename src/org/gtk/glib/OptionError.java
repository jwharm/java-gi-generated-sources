package org.gtk.glib;

/**
 * Error codes returned by option parsing.
 */
public enum OptionError {

    /**
     * An option was not known to the parser.
     *  This error will only be reported, if the parser hasn't been instructed
     *  to ignore unknown options, see g_option_context_set_ignore_unknown_options().
     */
    UNKNOWN_OPTION,
    
    /**
     * A value couldn't be parsed.
     */
    BAD_VALUE,
    
    /**
     * A {@link OptionArgFunc} callback failed.
     */
    FAILED;
    
    public static OptionError fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN_OPTION;
            case 1 -> BAD_VALUE;
            case 2 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN_OPTION -> 0;
            case BAD_VALUE -> 1;
            case FAILED -> 2;
        };
    }

}
