package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Uri} type and related functions can be used to parse URIs into
 * their components, and build valid URIs from individual components.
 * <p>
 * Note that {@link Uri} scope is to help manipulate URIs in various applications,
 * following <a href="https://tools.ietf.org/html/rfc3986">RFC 3986</a>. In particular,
 * it doesn't intend to cover web browser needs, and doesn't implement the
 * <a href="https://url.spec.whatwg.org/">WHATWG URL</a> standard. No APIs are provided to
 * help prevent
 * <a href="https://en.wikipedia.org/wiki/IDN_homograph_attack">homograph attacks</a>, so
 * {@link Uri} is not suitable for formatting URIs for display to the user for making
 * security-sensitive decisions.
 * <p>
 * <strong>Relative and absolute URIs # {#relative-absolute-uris}</strong><br/>
 * As defined in <a href="https://tools.ietf.org/html/rfc3986#section-4">RFC 3986</a>, the
 * hierarchical nature of URIs means that they can either be ‘relative
 * references’ (sometimes referred to as ‘relative URIs’) or ‘URIs’ (for
 * clarity, ‘URIs’ are referred to in this documentation as
 * ‘absolute URIs’ — although
 * <a href="https://tools.ietf.org/html/rfc3986#section-4.3">in constrast to RFC 3986</a>,
 * fragment identifiers are always allowed).
 * <p>
 * Relative references have one or more components of the URI missing. In
 * particular, they have no scheme. Any other component, such as hostname,
 * query, etc. may be missing, apart from a path, which has to be specified (but
 * may be empty). The path may be relative, starting with {@code ./} rather than {@code /}.
 * <p>
 * For example, a valid relative reference is {@code ./path?query},
 * {@code /?query#fragment} or {@code //example.com}.
 * <p>
 * Absolute URIs have a scheme specified. Any other components of the URI which
 * are missing are specified as explicitly unset in the URI, rather than being
 * resolved relative to a base URI using g_uri_parse_relative().
 * <p>
 * For example, a valid absolute URI is {@code file:///home/bob} or
 * {@code https://search.com?query=string}.
 * <p>
 * A {@link Uri} instance is always an absolute URI. A string may be an absolute URI
 * or a relative reference; see the documentation for individual functions as to
 * what forms they accept.
 * <p>
 * <strong>Parsing URIs</strong><br/>
 * The most minimalist APIs for parsing URIs are g_uri_split() and
 * g_uri_split_with_user(). These split a URI into its component
 * parts, and return the parts; the difference between the two is that
 * g_uri_split() treats the ‘userinfo’ component of the URI as a
 * single element, while g_uri_split_with_user() can (depending on the
 * {@link UriFlags} you pass) treat it as containing a username, password,
 * and authentication parameters. Alternatively, g_uri_split_network()
 * can be used when you are only interested in the components that are
 * needed to initiate a network connection to the service (scheme,
 * host, and port).
 * <p>
 * g_uri_parse() is similar to g_uri_split(), but instead of returning
 * individual strings, it returns a {@link Uri} structure (and it requires
 * that the URI be an absolute URI).
 * <p>
 * g_uri_resolve_relative() and g_uri_parse_relative() allow you to
 * resolve a relative URI relative to a base URI.
 * g_uri_resolve_relative() takes two strings and returns a string,
 * and g_uri_parse_relative() takes a {@link Uri} and a string and returns a
 * {@link Uri}.
 * <p>
 * All of the parsing functions take a {@link UriFlags} argument describing
 * exactly how to parse the URI; see the documentation for that type
 * for more details on the specific flags that you can pass. If you
 * need to choose different flags based on the type of URI, you can
 * use g_uri_peek_scheme() on the URI string to check the scheme
 * first, and use that to decide what flags to parse it with.
 * <p>
 * For example, you might want to use {@link UriParamsFlags#WWW_FORM} when parsing the
 * params for a web URI, so compare the result of g_uri_peek_scheme() against
 * {@code http} and {@code https}.
 * <p>
 * <strong>Building URIs</strong><br/>
 * g_uri_join() and g_uri_join_with_user() can be used to construct
 * valid URI strings from a set of component strings. They are the
 * inverse of g_uri_split() and g_uri_split_with_user().
 * <p>
 * Similarly, g_uri_build() and g_uri_build_with_user() can be used to
 * construct a {@link Uri} from a set of component strings.
 * <p>
 * As with the parsing functions, the building functions take a
 * {@link UriFlags} argument. In particular, it is important to keep in mind
 * whether the URI components you are using are already {@code %}-encoded. If so,
 * you must pass the {@link UriFlags#ENCODED} flag.
 * <p>
 * <strong>`file://` URIs</strong><br/>
 * Note that Windows and Unix both define special rules for parsing
 * {@code file://} URIs (involving non-UTF-8 character sets on Unix, and the
 * interpretation of path separators on Windows). {@link Uri} does not
 * implement these rules. Use g_filename_from_uri() and
 * g_filename_to_uri() if you want to properly convert between
 * {@code file://} URIs and local filenames.
 * <p>
 * <strong>URI Equality</strong><br/>
 * Note that there is no {@code g_uri_equal ()} function, because comparing
 * URIs usefully requires scheme-specific knowledge that {@link Uri} does
 * not have. {@link Uri} can help with normalization if you use the various
 * encoded {@link UriFlags} as well as {@link UriFlags#SCHEME_NORMALIZE} however
 * it is not comprehensive.
 * For example, {@code data:,foo} and {@code data:;base64,Zm9v} resolve to the same
 * thing according to the {@code data:} URI specification which GLib does not
 * handle.
 * @version 2.66
 */
public class Uri extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GUri";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Uri}
     * @return A new, uninitialized @{link Uri}
     */
    public static Uri allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Uri newInstance = new Uri(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Uri proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Uri(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Uri> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Uri(input);
    
    /**
     * Gets {@code uri}'s authentication parameters, which may contain
     * {@code %}-encoding, depending on the flags with which {@code uri} was created.
     * (If {@code uri} was not created with {@link UriFlags#HAS_AUTH_PARAMS} then this will
     * be {@code null}.)
     * <p>
     * Depending on the URI scheme, g_uri_parse_params() may be useful for
     * further parsing this information.
     * @return {@code uri}'s authentication parameters.
     */
    public @Nullable java.lang.String getAuthParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_auth_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s flags set upon construction.
     * @return {@code uri}'s flags.
     */
    public org.gtk.glib.UriFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.UriFlags(RESULT);
    }
    
    /**
     * Gets {@code uri}'s fragment, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created.
     * @return {@code uri}'s fragment.
     */
    public @Nullable java.lang.String getFragment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_fragment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s host. This will never have {@code %}-encoded characters,
     * unless it is non-UTF-8 (which can only be the case if {@code uri} was
     * created with {@link UriFlags#NON_DNS}).
     * <p>
     * If {@code uri} contained an IPv6 address literal, this value will be just
     * that address, without the brackets around it that are necessary in
     * the string form of the URI. Note that in this case there may also
     * be a scope ID attached to the address. Eg, {@code fe80::1234%}{@code em1} (or
     * {@code fe80::1234%}{@code 25em1} if the string is still encoded).
     * @return {@code uri}'s host.
     */
    public @Nullable java.lang.String getHost() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_host.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s password, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created. (If {@code uri} was not created
     * with {@link UriFlags#HAS_PASSWORD} then this will be {@code null}.)
     * @return {@code uri}'s password.
     */
    public @Nullable java.lang.String getPassword() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_password.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s path, which may contain {@code %}-encoding, depending on the
     * flags with which {@code uri} was created.
     * @return {@code uri}'s path.
     */
    public java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_path.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s port.
     * @return {@code uri}'s port, or {@code -1} if no port was specified.
     */
    public int getPort() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_get_port.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets {@code uri}'s query, which may contain {@code %}-encoding, depending on the
     * flags with which {@code uri} was created.
     * <p>
     * For queries consisting of a series of {@code name=value} parameters,
     * {@link UriParamsIter} or g_uri_parse_params() may be useful.
     * @return {@code uri}'s query.
     */
    public @Nullable java.lang.String getQuery() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_query.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s scheme. Note that this will always be all-lowercase,
     * regardless of the string or strings that {@code uri} was created from.
     * @return {@code uri}'s scheme.
     */
    public java.lang.String getScheme() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_scheme.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the ‘username’ component of {@code uri}'s userinfo, which may contain
     * {@code %}-encoding, depending on the flags with which {@code uri} was created.
     * If {@code uri} was not created with {@link UriFlags#HAS_PASSWORD} or
     * {@link UriFlags#HAS_AUTH_PARAMS}, this is the same as g_uri_get_userinfo().
     * @return {@code uri}'s user.
     */
    public @Nullable java.lang.String getUser() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_user.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets {@code uri}'s userinfo, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created.
     * @return {@code uri}'s userinfo.
     */
    public @Nullable java.lang.String getUserinfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_get_userinfo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Parses {@code uri_ref} according to {@code flags} and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to {@code base_uri}.
     * If the result is not a valid absolute URI, it will be discarded, and an error
     * returned.
     * @param uriRef a string representing a relative or absolute URI
     * @param flags flags describing how to parse {@code uri_ref}
     * @return a new {@link Uri}, or NULL on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.Uri parseRelative(java.lang.String uriRef, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_parse_relative.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uriRef, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Increments the reference count of {@code uri} by one.
     * @return {@code uri}
     */
    public org.gtk.glib.Uri ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Returns a string representing {@code uri}.
     * <p>
     * This is not guaranteed to return a string which is identical to the
     * string that {@code uri} was parsed from. However, if the source URI was
     * syntactically correct (according to RFC 3986), and it was parsed
     * with {@link UriFlags#ENCODED}, then g_uri_to_string() is guaranteed to return
     * a string which is at least semantically equivalent to the source
     * URI (according to RFC 3986).
     * <p>
     * If {@code uri} might contain sensitive details, such as authentication parameters,
     * or private data in its query string, and the returned string is going to be
     * logged, then consider using g_uri_to_string_partial() to redact parts.
     * @return a string representing {@code uri},
     *     which the caller must free.
     */
    public java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_to_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns a string representing {@code uri}, subject to the options in
     * {@code flags}. See g_uri_to_string() and {@link UriHideFlags} for more details.
     * @param flags flags describing what parts of {@code uri} to hide
     * @return a string representing
     *     {@code uri}, which the caller must free.
     */
    public java.lang.String toStringPartial(org.gtk.glib.UriHideFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_uri_to_string_partial.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Atomically decrements the reference count of {@code uri} by one.
     * <p>
     * When the reference count reaches zero, the resources allocated by
     * {@code uri} are freed
     */
    public void unref() {
        try {
            DowncallHandles.g_uri_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}.
     * <p>
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the "userinfo" separately.
     * @param flags flags describing how to build the {@link Uri}
     * @param scheme the URI scheme
     * @param userinfo the userinfo component, or {@code null}
     * @param host the host component, or {@code null}
     * @param port the port, or {@code -1}
     * @param path the path component
     * @param query the query component, or {@code null}
     * @param fragment the fragment, or {@code null}
     * @return a new {@link Uri}
     */
    public static org.gtk.glib.Uri build(org.gtk.glib.UriFlags flags, java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_build.invokeExact(
                        flags.getValue(),
                        Marshal.stringToAddress.marshal(scheme, SCOPE),
                        (Addressable) (userinfo == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(userinfo, SCOPE)),
                        (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                        port,
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}
     * ({@link UriFlags#HAS_PASSWORD} is added unconditionally). The {@code flags} must be
     * coherent with the passed values, in particular use {@code %}-encoded values with
     * {@link UriFlags#ENCODED}.
     * <p>
     * In contrast to g_uri_build(), this allows specifying the components
     * of the ‘userinfo’ field separately. Note that {@code user} must be non-{@code null}
     * if either {@code password} or {@code auth_params} is non-{@code null}.
     * @param flags flags describing how to build the {@link Uri}
     * @param scheme the URI scheme
     * @param user the user component of the userinfo, or {@code null}
     * @param password the password component of the userinfo, or {@code null}
     * @param authParams the auth params of the userinfo, or {@code null}
     * @param host the host component, or {@code null}
     * @param port the port, or {@code -1}
     * @param path the path component
     * @param query the query component, or {@code null}
     * @param fragment the fragment, or {@code null}
     * @return a new {@link Uri}
     */
    public static org.gtk.glib.Uri buildWithUser(org.gtk.glib.UriFlags flags, java.lang.String scheme, @Nullable java.lang.String user, @Nullable java.lang.String password, @Nullable java.lang.String authParams, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_build_with_user.invokeExact(
                        flags.getValue(),
                        Marshal.stringToAddress.marshal(scheme, SCOPE),
                        (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, SCOPE)),
                        (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)),
                        (Addressable) (authParams == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(authParams, SCOPE)),
                        (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                        port,
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    public static org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_uri_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Escapes arbitrary data for use in a URI.
     * <p>
     * Normally all characters that are not ‘unreserved’ (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in {@code reserved_chars_allowed}
     * they are not escaped. This is useful for the ‘reserved’ characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * <p>
     * Though technically incorrect, this will also allow escaping nul
     * bytes as {@code %}{@code 00}.
     * @param unescaped the unescaped input data.
     * @param length the length of {@code unescaped}
     * @param reservedCharsAllowed a string of reserved
     *   characters that are allowed to be used, or {@code null}.
     * @return an escaped version of {@code unescaped}.
     *     The returned string should be freed when no longer needed.
     */
    public static java.lang.String escapeBytes(byte[] unescaped, long length, @Nullable java.lang.String reservedCharsAllowed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_escape_bytes.invokeExact(
                        Interop.allocateNativeArray(unescaped, false, SCOPE),
                        length,
                        (Addressable) (reservedCharsAllowed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reservedCharsAllowed, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Escapes a string for use in a URI.
     * <p>
     * Normally all characters that are not "unreserved" (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in {@code reserved_chars_allowed}
     * they are not escaped. This is useful for the "reserved" characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * @param unescaped the unescaped input string.
     * @param reservedCharsAllowed a string of reserved
     *   characters that are allowed to be used, or {@code null}.
     * @param allowUtf8 {@code true} if the result can include UTF-8 characters.
     * @return an escaped version of {@code unescaped}. The
     * returned string should be freed when no longer needed.
     */
    public static java.lang.String escapeString(java.lang.String unescaped, @Nullable java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_escape_string.invokeExact(
                        Marshal.stringToAddress.marshal(unescaped, SCOPE),
                        (Addressable) (reservedCharsAllowed == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(reservedCharsAllowed, SCOPE)),
                        Marshal.booleanToInteger.marshal(allowUtf8, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Parses {@code uri_string} according to {@code flags}, to determine whether it is a valid
     * [absolute URI][relative-absolute-uris], i.e. it does not need to be resolved
     * relative to another URI using g_uri_parse_relative().
     * <p>
     * If it’s not a valid URI, an error is returned explaining how it’s invalid.
     * <p>
     * See g_uri_split(), and the definition of {@link UriFlags}, for more
     * information on the effect of {@code flags}.
     * @param uriString a string containing an absolute URI
     * @param flags flags for parsing {@code uri_string}
     * @return {@code true} if {@code uri_string} is a valid absolute URI, {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean isValid(java.lang.String uriString, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_uri_is_valid.invokeExact(
                        Marshal.stringToAddress.marshal(uriString, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be {@code null} (though it may be the empty
     * string).
     * <p>
     * When {@code host} is present, {@code path} must either be empty or begin with a slash ({@code /})
     * character. When {@code host} is not present, {@code path} cannot begin with two slash
     *    characters ({@code //}). See
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986, section 3</a>.
     * <p>
     * See also g_uri_join_with_user(), which allows specifying the
     * components of the ‘userinfo’ separately.
     * <p>
     * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in {@code flags}.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or {@code null}
     * @param userinfo the userinfo component, or {@code null}
     * @param host the host component, or {@code null}
     * @param port the port, or {@code -1}
     * @param path the path component
     * @param query the query component, or {@code null}
     * @param fragment the fragment, or {@code null}
     * @return an absolute URI string
     */
    public static java.lang.String join(org.gtk.glib.UriFlags flags, @Nullable java.lang.String scheme, @Nullable java.lang.String userinfo, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_join.invokeExact(
                        flags.getValue(),
                        (Addressable) (scheme == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(scheme, SCOPE)),
                        (Addressable) (userinfo == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(userinfo, SCOPE)),
                        (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                        port,
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be {@code null} (though it may be the empty
     * string).
     * <p>
     * In contrast to g_uri_join(), this allows specifying the components
     * of the ‘userinfo’ separately. It otherwise behaves the same.
     * <p>
     * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in {@code flags}.
     * @param flags flags describing how to build the URI string
     * @param scheme the URI scheme, or {@code null}
     * @param user the user component of the userinfo, or {@code null}
     * @param password the password component of the userinfo, or
     *   {@code null}
     * @param authParams the auth params of the userinfo, or
     *   {@code null}
     * @param host the host component, or {@code null}
     * @param port the port, or {@code -1}
     * @param path the path component
     * @param query the query component, or {@code null}
     * @param fragment the fragment, or {@code null}
     * @return an absolute URI string
     */
    public static java.lang.String joinWithUser(org.gtk.glib.UriFlags flags, @Nullable java.lang.String scheme, @Nullable java.lang.String user, @Nullable java.lang.String password, @Nullable java.lang.String authParams, @Nullable java.lang.String host, int port, java.lang.String path, @Nullable java.lang.String query, @Nullable java.lang.String fragment) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_join_with_user.invokeExact(
                        flags.getValue(),
                        (Addressable) (scheme == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(scheme, SCOPE)),
                        (Addressable) (user == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(user, SCOPE)),
                        (Addressable) (password == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(password, SCOPE)),
                        (Addressable) (authParams == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(authParams, SCOPE)),
                        (Addressable) (host == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(host, SCOPE)),
                        port,
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        (Addressable) (query == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(query, SCOPE)),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(fragment, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Splits an URI list conforming to the text/uri-list
     * mime type defined in RFC 2483 into individual URIs,
     * discarding any comments. The URIs are not validated.
     * @param uriList an URI list
     * @return a newly allocated {@code null}-terminated list
     *   of strings holding the individual URIs. The array should be freed
     *   with g_strfreev().
     */
    public static PointerString listExtractUris(java.lang.String uriList) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_list_extract_uris.invokeExact(Marshal.stringToAddress.marshal(uriList, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return new PointerString(RESULT);
        }
    }
    
    /**
     * Parses {@code uri_string} according to {@code flags}. If the result is not a
     * valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * error returned.
     * @param uriString a string representing an absolute URI
     * @param flags flags describing how to parse {@code uri_string}
     * @return a new {@link Uri}, or NULL on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.Uri parse(java.lang.String uriString, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_parse.invokeExact(
                        Marshal.stringToAddress.marshal(uriString, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.Uri.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Many URI schemes include one or more attribute/value pairs as part of the URI
     * value. This method can be used to parse them into a hash table. When an
     * attribute has multiple occurrences, the last value is the final returned
     * value. If you need to handle repeated attributes differently, use
     * {@link UriParamsIter}.
     * <p>
     * The {@code params} string is assumed to still be {@code %}-encoded, but the returned
     * values will be fully decoded. (Thus it is possible that the returned values
     * may contain {@code =} or {@code separators}, if the value was encoded in the input.)
     * Invalid {@code %}-encoding is treated as with the {@link UriFlags#PARSE_RELAXED}
     * rules for g_uri_parse(). (However, if {@code params} is the path or query string
     * from a {@link Uri} that was parsed without {@link UriFlags#PARSE_RELAXED} and
     * {@link UriFlags#ENCODED}, then you already know that it does not contain any
     * invalid encoding.)
     * <p>
     * {@link UriParamsFlags#WWW_FORM} is handled as documented for g_uri_params_iter_init().
     * <p>
     * If {@link UriParamsFlags#CASE_INSENSITIVE} is passed to {@code flags}, attributes will be
     * compared case-insensitively, so a params string {@code attr=123&Attr=456} will only
     * return a single attribute–value pair, {@code Attr=456}. Case will be preserved in
     * the returned attributes.
     * <p>
     * If {@code params} cannot be parsed (for example, it contains two {@code separators}
     * characters in a row), then {@code error} is set and {@code null} is returned.
     * @param params a {@code %}-encoded string containing {@code attribute=value}
     *   parameters
     * @param length the length of {@code params}, or {@code -1} if it is nul-terminated
     * @param separators the separator byte character set between parameters. (usually
     *   {@code &}, but sometimes {@code ;} or both {@code &;}). Note that this function works on
     *   bytes not characters, so it can't be used to delimit UTF-8 strings for
     *   anything but ASCII characters. You may pass an empty set, in which case
     *   no splitting will occur.
     * @param flags flags to modify the way the parameters are handled.
     * @return A hash table of attribute/value pairs, with both names and values
     *     fully-decoded; or {@code null} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.HashTable parseParams(java.lang.String params, long length, java.lang.String separators, org.gtk.glib.UriParamsFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_parse_params.invokeExact(
                        Marshal.stringToAddress.marshal(params, SCOPE),
                        length,
                        Marshal.stringToAddress.marshal(separators, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.HashTable.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * <pre>{@code 
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * }</pre>
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or
     *     {@code null} on error. The returned string should be freed when no longer needed.
     */
    public static @Nullable java.lang.String parseScheme(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_parse_scheme.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * <pre>{@code 
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * }</pre>
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     * <p>
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     * @param uri a valid URI.
     * @return The ‘scheme’ component of the URI, or
     *     {@code null} on error. The returned string is normalized to all-lowercase, and
     *     interned via g_intern_string(), so it does not need to be freed.
     */
    public static @Nullable java.lang.String peekScheme(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_peek_scheme.invokeExact(Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Parses {@code uri_ref} according to {@code flags} and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to
     * {@code base_uri_string}. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     * <p>
     * (If {@code base_uri_string} is {@code null}, this just returns {@code uri_ref}, or
     * {@code null} if {@code uri_ref} is invalid or not absolute.)
     * @param baseUriString a string representing a base URI
     * @param uriRef a string representing a relative or absolute URI
     * @param flags flags describing how to parse {@code uri_ref}
     * @return the resolved URI string,
     * or NULL on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static java.lang.String resolveRelative(@Nullable java.lang.String baseUriString, java.lang.String uriRef, org.gtk.glib.UriFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_resolve_relative.invokeExact(
                        (Addressable) (baseUriString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(baseUriString, SCOPE)),
                        Marshal.stringToAddress.marshal(uriRef, SCOPE),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Parses {@code uri_ref} (which can be an
     * [absolute or relative URI][relative-absolute-uris]) according to {@code flags}, and
     * returns the pieces. Any component that doesn't appear in {@code uri_ref} will be
     * returned as {@code null} (but note that all URIs always have a path component,
     * though it may be the empty string).
     * <p>
     * If {@code flags} contains {@link UriFlags#ENCODED}, then {@code %}-encoded characters in
     * {@code uri_ref} will remain encoded in the output strings. (If not,
     * then all such characters will be decoded.) Note that decoding will
     * only work if the URI components are ASCII or UTF-8, so you will
     * need to use {@link UriFlags#ENCODED} if they are not.
     * <p>
     * Note that the {@link UriFlags#HAS_PASSWORD} and
     * {@link UriFlags#HAS_AUTH_PARAMS} {@code flags} are ignored by g_uri_split(),
     * since it always returns only the full userinfo; use
     * g_uri_split_with_user() if you want it split up.
     * @param uriRef a string containing a relative or absolute URI
     * @param flags flags for parsing {@code uri_ref}
     * @param scheme on return, contains
     *    the scheme (converted to lowercase), or {@code null}
     * @param userinfo on return, contains
     *    the userinfo, or {@code null}
     * @param host on return, contains the
     *    host, or {@code null}
     * @param port on return, contains the
     *    port, or {@code -1}
     * @param path on return, contains the
     *    path
     * @param query on return, contains the
     *    query, or {@code null}
     * @param fragment on return, contains
     *    the fragment, or {@code null}
     * @return {@code true} if {@code uri_ref} parsed successfully, {@code false}
     *   on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean split(java.lang.String uriRef, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> userinfo, @Nullable Out<java.lang.String> host, Out<Integer> port, @Nullable Out<java.lang.String> path, @Nullable Out<java.lang.String> query, @Nullable Out<java.lang.String> fragment) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment userinfoPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment queryPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment fragmentPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_uri_split.invokeExact(
                        Marshal.stringToAddress.marshal(uriRef, SCOPE),
                        flags.getValue(),
                        (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                        (Addressable) (userinfo == null ? MemoryAddress.NULL : (Addressable) userinfoPOINTER.address()),
                        (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                        (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                        (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                        (Addressable) (query == null ? MemoryAddress.NULL : (Addressable) queryPOINTER.address()),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : (Addressable) fragmentPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (userinfo != null) userinfo.set(Marshal.addressToString.marshal(userinfoPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (path != null) path.set(Marshal.addressToString.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (query != null) query.set(Marshal.addressToString.marshal(queryPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (fragment != null) fragment.set(Marshal.addressToString.marshal(fragmentPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses {@code uri_string} (which must be an [absolute URI][relative-absolute-uris])
     * according to {@code flags}, and returns the pieces relevant to connecting to a host.
     * See the documentation for g_uri_split() for more details; this is
     * mostly a wrapper around that function with simpler arguments.
     * However, it will return an error if {@code uri_string} is a relative URI,
     * or does not contain a hostname component.
     * @param uriString a string containing an absolute URI
     * @param flags flags for parsing {@code uri_string}
     * @param scheme on return, contains
     *    the scheme (converted to lowercase), or {@code null}
     * @param host on return, contains the
     *    host, or {@code null}
     * @param port on return, contains the
     *    port, or {@code -1}
     * @return {@code true} if {@code uri_string} parsed successfully,
     *   {@code false} on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean splitNetwork(java.lang.String uriString, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> host, Out<Integer> port) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_uri_split_network.invokeExact(
                        Marshal.stringToAddress.marshal(uriString, SCOPE),
                        flags.getValue(),
                        (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                        (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                        (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parses {@code uri_ref} (which can be an
     * [absolute or relative URI][relative-absolute-uris]) according to {@code flags}, and
     * returns the pieces. Any component that doesn't appear in {@code uri_ref} will be
     * returned as {@code null} (but note that all URIs always have a path component,
     * though it may be the empty string).
     * <p>
     * See g_uri_split(), and the definition of {@link UriFlags}, for more
     * information on the effect of {@code flags}. Note that {@code password} will only
     * be parsed out if {@code flags} contains {@link UriFlags#HAS_PASSWORD}, and
     * {@code auth_params} will only be parsed out if {@code flags} contains
     * {@link UriFlags#HAS_AUTH_PARAMS}.
     * @param uriRef a string containing a relative or absolute URI
     * @param flags flags for parsing {@code uri_ref}
     * @param scheme on return, contains
     *    the scheme (converted to lowercase), or {@code null}
     * @param user on return, contains
     *    the user, or {@code null}
     * @param password on return, contains
     *    the password, or {@code null}
     * @param authParams on return, contains
     *    the auth_params, or {@code null}
     * @param host on return, contains the
     *    host, or {@code null}
     * @param port on return, contains the
     *    port, or {@code -1}
     * @param path on return, contains the
     *    path
     * @param query on return, contains the
     *    query, or {@code null}
     * @param fragment on return, contains
     *    the fragment, or {@code null}
     * @return {@code true} if {@code uri_ref} parsed successfully, {@code false}
     *   on error.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean splitWithUser(java.lang.String uriRef, org.gtk.glib.UriFlags flags, @Nullable Out<java.lang.String> scheme, @Nullable Out<java.lang.String> user, @Nullable Out<java.lang.String> password, @Nullable Out<java.lang.String> authParams, @Nullable Out<java.lang.String> host, Out<Integer> port, @Nullable Out<java.lang.String> path, @Nullable Out<java.lang.String> query, @Nullable Out<java.lang.String> fragment) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment schemePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment userPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment passwordPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment authParamsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment hostPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment portPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment queryPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment fragmentPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_uri_split_with_user.invokeExact(
                        Marshal.stringToAddress.marshal(uriRef, SCOPE),
                        flags.getValue(),
                        (Addressable) (scheme == null ? MemoryAddress.NULL : (Addressable) schemePOINTER.address()),
                        (Addressable) (user == null ? MemoryAddress.NULL : (Addressable) userPOINTER.address()),
                        (Addressable) (password == null ? MemoryAddress.NULL : (Addressable) passwordPOINTER.address()),
                        (Addressable) (authParams == null ? MemoryAddress.NULL : (Addressable) authParamsPOINTER.address()),
                        (Addressable) (host == null ? MemoryAddress.NULL : (Addressable) hostPOINTER.address()),
                        (Addressable) (port == null ? MemoryAddress.NULL : (Addressable) portPOINTER.address()),
                        (Addressable) (path == null ? MemoryAddress.NULL : (Addressable) pathPOINTER.address()),
                        (Addressable) (query == null ? MemoryAddress.NULL : (Addressable) queryPOINTER.address()),
                        (Addressable) (fragment == null ? MemoryAddress.NULL : (Addressable) fragmentPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (scheme != null) scheme.set(Marshal.addressToString.marshal(schemePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (user != null) user.set(Marshal.addressToString.marshal(userPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (password != null) password.set(Marshal.addressToString.marshal(passwordPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (authParams != null) authParams.set(Marshal.addressToString.marshal(authParamsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (host != null) host.set(Marshal.addressToString.marshal(hostPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (port != null) port.set(portPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (path != null) path.set(Marshal.addressToString.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (query != null) query.set(Marshal.addressToString.marshal(queryPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (fragment != null) fragment.set(Marshal.addressToString.marshal(fragmentPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Unescapes a segment of an escaped string as binary data.
     * <p>
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     * <p>
     * If any of the characters in {@code illegal_characters} appears as an escaped
     * character in {@code escaped_string}, then that is an error and {@code null} will be
     * returned. This is useful if you want to avoid for instance having a slash
     * being expanded in an escaped path element, which might confuse pathname
     * handling.
     * @param escapedString A URI-escaped string
     * @param length the length (in bytes) of {@code escaped_string} to escape, or {@code -1} if it
     *   is nul-terminated.
     * @param illegalCharacters a string of illegal characters
     *   not to be allowed, or {@code null}.
     * @return an unescaped version of {@code escaped_string}
     *     or {@code null} on error (if decoding failed, using {@link UriError#FAILED} error
     *     code). The returned {@link Bytes} should be unreffed when no longer needed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.glib.Bytes unescapeBytes(java.lang.String escapedString, long length, @Nullable java.lang.String illegalCharacters) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_bytes.invokeExact(
                        Marshal.stringToAddress.marshal(escapedString, SCOPE),
                        length,
                        (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * Unescapes a segment of an escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and {@code null} will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * <p>
     * Note: {@code NUL} byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     * @param escapedString A string, may be {@code null}
     * @param escapedStringEnd Pointer to end of {@code escaped_string},
     *   may be {@code null}
     * @param illegalCharacters An optional string of illegal
     *   characters not to be allowed, may be {@code null}
     * @return an unescaped version of {@code escaped_string},
     * or {@code null} on error. The returned string should be freed when no longer
     * needed.  As a special case if {@code null} is given for {@code escaped_string}, this
     * function will return {@code null}.
     */
    public static @Nullable java.lang.String unescapeSegment(@Nullable java.lang.String escapedString, @Nullable java.lang.String escapedStringEnd, @Nullable java.lang.String illegalCharacters) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_segment.invokeExact(
                        (Addressable) (escapedString == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(escapedString, SCOPE)),
                        (Addressable) (escapedStringEnd == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(escapedStringEnd, SCOPE)),
                        (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Unescapes a whole escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and {@code null} will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * @param escapedString an escaped string to be unescaped.
     * @param illegalCharacters a string of illegal characters
     *   not to be allowed, or {@code null}.
     * @return an unescaped version of {@code escaped_string}.
     * The returned string should be freed when no longer needed.
     */
    public static @Nullable java.lang.String unescapeString(java.lang.String escapedString, @Nullable java.lang.String illegalCharacters) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_uri_unescape_string.invokeExact(
                        Marshal.stringToAddress.marshal(escapedString, SCOPE),
                        (Addressable) (illegalCharacters == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(illegalCharacters, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_uri_get_auth_params = Interop.downcallHandle(
                "g_uri_get_auth_params",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_flags = Interop.downcallHandle(
                "g_uri_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_fragment = Interop.downcallHandle(
                "g_uri_get_fragment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_host = Interop.downcallHandle(
                "g_uri_get_host",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_password = Interop.downcallHandle(
                "g_uri_get_password",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_path = Interop.downcallHandle(
                "g_uri_get_path",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_port = Interop.downcallHandle(
                "g_uri_get_port",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_query = Interop.downcallHandle(
                "g_uri_get_query",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_scheme = Interop.downcallHandle(
                "g_uri_get_scheme",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_user = Interop.downcallHandle(
                "g_uri_get_user",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_get_userinfo = Interop.downcallHandle(
                "g_uri_get_userinfo",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_parse_relative = Interop.downcallHandle(
                "g_uri_parse_relative",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_ref = Interop.downcallHandle(
                "g_uri_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_to_string = Interop.downcallHandle(
                "g_uri_to_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_to_string_partial = Interop.downcallHandle(
                "g_uri_to_string_partial",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_uri_unref = Interop.downcallHandle(
                "g_uri_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_build = Interop.downcallHandle(
                "g_uri_build",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_build_with_user = Interop.downcallHandle(
                "g_uri_build_with_user",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_error_quark = Interop.downcallHandle(
                "g_uri_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_uri_escape_bytes = Interop.downcallHandle(
                "g_uri_escape_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_escape_string = Interop.downcallHandle(
                "g_uri_escape_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_uri_is_valid = Interop.downcallHandle(
                "g_uri_is_valid",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_join = Interop.downcallHandle(
                "g_uri_join",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_join_with_user = Interop.downcallHandle(
                "g_uri_join_with_user",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_list_extract_uris = Interop.downcallHandle(
                "g_uri_list_extract_uris",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_parse = Interop.downcallHandle(
                "g_uri_parse",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_parse_params = Interop.downcallHandle(
                "g_uri_parse_params",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_parse_scheme = Interop.downcallHandle(
                "g_uri_parse_scheme",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_peek_scheme = Interop.downcallHandle(
                "g_uri_peek_scheme",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_resolve_relative = Interop.downcallHandle(
                "g_uri_resolve_relative",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_split = Interop.downcallHandle(
                "g_uri_split",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_split_network = Interop.downcallHandle(
                "g_uri_split_network",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_split_with_user = Interop.downcallHandle(
                "g_uri_split_with_user",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_unescape_bytes = Interop.downcallHandle(
                "g_uri_unescape_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_unescape_segment = Interop.downcallHandle(
                "g_uri_unescape_segment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_uri_unescape_string = Interop.downcallHandle(
                "g_uri_unescape_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
