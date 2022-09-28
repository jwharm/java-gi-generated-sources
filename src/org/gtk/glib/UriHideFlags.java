package org.gtk.glib;

/**
 * Flags describing what parts of the URI to hide in
 * g_uri_to_string_partial(). Note that {@link UriHideFlags#PASSWORD} and
 * {@link UriHideFlags#AUTH_PARAMS} will only work if the {@link Uri} was parsed with
 * the corresponding flags.
 */
public class UriHideFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final UriHideFlags NONE = new UriHideFlags(0);
    
    /**
     * Hide the userinfo.
     */
    public static final UriHideFlags USERINFO = new UriHideFlags(1);
    
    /**
     * Hide the password.
     */
    public static final UriHideFlags PASSWORD = new UriHideFlags(2);
    
    /**
     * Hide the auth_params.
     */
    public static final UriHideFlags AUTH_PARAMS = new UriHideFlags(4);
    
    /**
     * Hide the query.
     */
    public static final UriHideFlags QUERY = new UriHideFlags(8);
    
    /**
     * Hide the fragment.
     */
    public static final UriHideFlags FRAGMENT = new UriHideFlags(16);
    
    public UriHideFlags(int value) {
        super(value);
    }
    
}
