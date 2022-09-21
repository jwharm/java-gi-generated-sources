package org.gtk.glib;

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * {@link UriParamsIter}.
 */
public class UriParamsFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Parameter names are case insensitive.
     */
    public static final int CASE_INSENSITIVE = 1;
    
    /**
     * Replace {@code +} with space character. Only useful for
     *     URLs on the web, using the {@code https} or {@code http} schemas.
     */
    public static final int WWW_FORM = 2;
    
    /**
     * See {@link UriFlags#PARSE_RELAXED}.
     */
    public static final int PARSE_RELAXED = 4;
    
}
