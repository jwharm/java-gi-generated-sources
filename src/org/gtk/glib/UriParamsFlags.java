package org.gtk.glib;

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * #GUriParamsIter.
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
     * Replace <code>+</code> with space character. Only useful for
     *     URLs on the web, using the <code>https</code> or <code>http</code> schemas.
     */
    public static final int WWW_FORM = 2;
    
    /**
     * See 
     *       
     *       
     *         See %G_URI_FLAGS_PARSE_RELAXED.
     */
    public static final int PARSE_RELAXED = 4;
    
}
