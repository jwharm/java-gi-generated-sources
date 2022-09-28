package org.gtk.glib;

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * {@link UriParamsIter}.
 */
public class UriParamsFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final UriParamsFlags NONE = new UriParamsFlags(0);
    
    /**
     * Parameter names are case insensitive.
     */
    public static final UriParamsFlags CASE_INSENSITIVE = new UriParamsFlags(1);
    
    /**
     * Replace {@code +} with space character. Only useful for
     *     URLs on the web, using the {@code https} or {@code http} schemas.
     */
    public static final UriParamsFlags WWW_FORM = new UriParamsFlags(2);
    
    /**
     * See {@link UriFlags#PARSE_RELAXED}.
     */
    public static final UriParamsFlags PARSE_RELAXED = new UriParamsFlags(4);
    
    public UriParamsFlags(int value) {
        super(value);
    }
    
}
