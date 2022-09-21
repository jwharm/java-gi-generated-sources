package org.gtk.glib;

/**
 * Flags describing what parts of the URI to hide in
 * g_uri_to_string_partial(). Note that {@link UriHideFlags#PASSWORD} and
 * {@link UriHideFlags#AUTH_PARAMS} will only work if the {@link Uri} was parsed with
 * the corresponding flags.
 */
public class UriHideFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Hide the userinfo.
     */
    public static final int USERINFO = 1;
    
    /**
     * Hide the password.
     */
    public static final int PASSWORD = 2;
    
    /**
     * Hide the auth_params.
     */
    public static final int AUTH_PARAMS = 4;
    
    /**
     * Hide the query.
     */
    public static final int QUERY = 8;
    
    /**
     * Hide the fragment.
     */
    public static final int FRAGMENT = 16;
    
}
