package org.gtk.glib;

/**
 * Flags that describe a URI.
 * 
 * When parsing a URI, if you need to choose different flags based on
 * the type of URI, you can use g_uri_peek_scheme() on the URI string
 * to check the scheme first, and use that to decide what flags to
 * parse it with.
 */
public class UriFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Parse the URI more relaxedly than the
     *     [RFC 3986](https://tools.ietf.org/html/rfc3986) grammar specifies,
     *     fixing up or ignoring common mistakes in URIs coming from external
     *     sources. This is also needed for some obscure URI schemes where `;`
     *     separates the host from the path. Don’t use this flag unless you need to.
     */
    public static final int PARSE_RELAXED = 1;
    
    /**
     * The userinfo field may contain a password,
     *     which will be separated from the username by `:`.
     */
    public static final int HAS_PASSWORD = 2;
    
    /**
     * The userinfo may contain additional
     *     authentication-related parameters, which will be separated from
     *     the username and/or password by `;`.
     */
    public static final int HAS_AUTH_PARAMS = 4;
    
    /**
     * When parsing a URI, this indicates that `%`-encoded
     *     characters in the userinfo, path, query, and fragment fields
     *     should not be decoded. (And likewise the host field if
     *     %G_URI_FLAGS_NON_DNS is also set.) When building a URI, it indicates
     *     that you have already `%`-encoded the components, and so #GUri
     *     should not do any encoding itself.
     */
    public static final int ENCODED = 8;
    
    /**
     * The host component should not be assumed to be a
     *     DNS hostname or IP address (for example, for `smb` URIs with NetBIOS
     *     hostnames).
     */
    public static final int NON_DNS = 16;
    
    /**
     * Same as %G_URI_FLAGS_ENCODED, for the query
     *     field only.
     */
    public static final int ENCODED_QUERY = 32;
    
    /**
     * Same as %G_URI_FLAGS_ENCODED, for the path only.
     */
    public static final int ENCODED_PATH = 64;
    
    /**
     * Same as %G_URI_FLAGS_ENCODED, for the
     *     fragment only.
     */
    public static final int ENCODED_FRAGMENT = 128;
    
    /**
     * A scheme-based normalization will be applied.
     *     For example, when parsing an HTTP URI changing omitted path to `/` and
     *     omitted port to `80`; and when building a URI, changing empty path to `/`
     *     and default port `80`). This only supports a subset of known schemes. (Since: 2.68)
     */
    public static final int SCHEME_NORMALIZE = 256;
    
}
