package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that describe a URI.
 * <p>
 * When parsing a URI, if you need to choose different flags based on
 * the type of URI, you can use g_uri_peek_scheme() on the URI string
 * to check the scheme first, and use that to decide what flags to
 * parse it with.
 * @version 2.66
 */
public class UriFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GUriFlags";
    
    /**
     * No flags set.
     */
    public static final UriFlags NONE = new UriFlags(0);
    
    /**
     * Parse the URI more relaxedly than the
     *     <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a> grammar specifies,
     *     fixing up or ignoring common mistakes in URIs coming from external
     *     sources. This is also needed for some obscure URI schemes where {@code ;}
     *     separates the host from the path. Don’t use this flag unless you need to.
     */
    public static final UriFlags PARSE_RELAXED = new UriFlags(1);
    
    /**
     * The userinfo field may contain a password,
     *     which will be separated from the username by {@code :}.
     */
    public static final UriFlags HAS_PASSWORD = new UriFlags(2);
    
    /**
     * The userinfo may contain additional
     *     authentication-related parameters, which will be separated from
     *     the username and/or password by {@code ;}.
     */
    public static final UriFlags HAS_AUTH_PARAMS = new UriFlags(4);
    
    /**
     * When parsing a URI, this indicates that {@code %}-encoded
     *     characters in the userinfo, path, query, and fragment fields
     *     should not be decoded. (And likewise the host field if
     *     {@link UriFlags#NON_DNS} is also set.) When building a URI, it indicates
     *     that you have already {@code %}-encoded the components, and so {@link Uri}
     *     should not do any encoding itself.
     */
    public static final UriFlags ENCODED = new UriFlags(8);
    
    /**
     * The host component should not be assumed to be a
     *     DNS hostname or IP address (for example, for {@code smb} URIs with NetBIOS
     *     hostnames).
     */
    public static final UriFlags NON_DNS = new UriFlags(16);
    
    /**
     * Same as {@link UriFlags#ENCODED}, for the query
     *     field only.
     */
    public static final UriFlags ENCODED_QUERY = new UriFlags(32);
    
    /**
     * Same as {@link UriFlags#ENCODED}, for the path only.
     */
    public static final UriFlags ENCODED_PATH = new UriFlags(64);
    
    /**
     * Same as {@link UriFlags#ENCODED}, for the
     *     fragment only.
     */
    public static final UriFlags ENCODED_FRAGMENT = new UriFlags(128);
    
    /**
     * A scheme-based normalization will be applied.
     *     For example, when parsing an HTTP URI changing omitted path to {@code /} and
     *     omitted port to {@code 80}; and when building a URI, changing empty path to {@code /}
     *     and default port {@code 80}). This only supports a subset of known schemes. (Since: 2.68)
     */
    public static final UriFlags SCHEME_NORMALIZE = new UriFlags(256);
    
    public UriFlags(int value) {
        super(value);
    }
}
