package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

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
 * <h2>Relative and absolute URIs # {#relative-absolute-uris}</h2>
 * <p>
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
 * <h2>Parsing URIs</h2>
 * <p>
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
 * <h2>Building URIs</h2>
 * <p>
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
 * <h2>`file://` URIs</h2>
 * <p>
 * Note that Windows and Unix both define special rules for parsing
 * {@code file://} URIs (involving non-UTF-8 character sets on Unix, and the
 * interpretation of path separators on Windows). {@link Uri} does not
 * implement these rules. Use g_filename_from_uri() and
 * g_filename_to_uri() if you want to properly convert between
 * {@code file://} URIs and local filenames.
 * <p>
 * <h2>URI Equality</h2>
 * <p>
 * Note that there is no {@code g_uri_equal ()} function, because comparing
 * URIs usefully requires scheme-specific knowledge that {@link Uri} does
 * not have. {@link Uri} can help with normalization if you use the various
 * encoded {@link UriFlags} as well as {@link UriFlags#SCHEME_NORMALIZE} however
 * it is not comprehensive.
 * For example, {@code data:,foo} and {@code data:;base64,Zm9v} resolve to the same
 * thing according to the {@code data:} URI specification which GLib does not
 * handle.
 */
public class Uri extends io.github.jwharm.javagi.ResourceBase {

    public Uri(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets {@code uri}'s authentication parameters, which may contain
     * {@code %}-encoding, depending on the flags with which {@code uri} was created.
     * (If {@code uri} was not created with {@link UriFlags#HAS_AUTH_PARAMS} then this will
     * be <code>null</code>.)
     * <p>
     * Depending on the URI scheme, g_uri_parse_params() may be useful for
     * further parsing this information.
     */
    public java.lang.String getAuthParams() {
        var RESULT = gtk_h.g_uri_get_auth_params(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s flags set upon construction.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_uri_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets {@code uri}'s fragment, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created.
     */
    public java.lang.String getFragment() {
        var RESULT = gtk_h.g_uri_get_fragment(handle());
        return RESULT.getUtf8String(0);
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
     */
    public java.lang.String getHost() {
        var RESULT = gtk_h.g_uri_get_host(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s password, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created. (If {@code uri} was not created
     * with {@link UriFlags#HAS_PASSWORD} then this will be <code>null</code>.)
     */
    public java.lang.String getPassword() {
        var RESULT = gtk_h.g_uri_get_password(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s path, which may contain {@code %}-encoding, depending on the
     * flags with which {@code uri} was created.
     */
    public java.lang.String getPath() {
        var RESULT = gtk_h.g_uri_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s port.
     */
    public int getPort() {
        var RESULT = gtk_h.g_uri_get_port(handle());
        return RESULT;
    }
    
    /**
     * Gets {@code uri}'s query, which may contain {@code %}-encoding, depending on the
     * flags with which {@code uri} was created.
     * <p>
     * For queries consisting of a series of {@code name=value} parameters,
     * {@link UriParamsIter} or g_uri_parse_params() may be useful.
     */
    public java.lang.String getQuery() {
        var RESULT = gtk_h.g_uri_get_query(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s scheme. Note that this will always be all-lowercase,
     * regardless of the string or strings that {@code uri} was created from.
     */
    public java.lang.String getScheme() {
        var RESULT = gtk_h.g_uri_get_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the ‘username’ component of {@code uri}'s userinfo, which may contain
     * {@code %}-encoding, depending on the flags with which {@code uri} was created.
     * If {@code uri} was not created with {@link UriFlags#HAS_PASSWORD} or
     * {@link UriFlags#HAS_AUTH_PARAMS}, this is the same as g_uri_get_userinfo().
     */
    public java.lang.String getUser() {
        var RESULT = gtk_h.g_uri_get_user(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets {@code uri}'s userinfo, which may contain {@code %}-encoding, depending on
     * the flags with which {@code uri} was created.
     */
    public java.lang.String getUserinfo() {
        var RESULT = gtk_h.g_uri_get_userinfo(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses {@code uri_ref} according to {@code flags} and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to {@code base_uri}.
     * If the result is not a valid absolute URI, it will be discarded, and an error
     * returned.
     */
    public Uri parseRelative(java.lang.String uriRef, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_parse_relative(handle(), Interop.allocateNativeString(uriRef).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Increments the reference count of {@code uri} by one.
     */
    public Uri ref() {
        var RESULT = gtk_h.g_uri_ref(handle());
        return new Uri(References.get(RESULT, true));
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
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_uri_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a string representing {@code uri}, subject to the options in
     * {@code flags}. See g_uri_to_string() and {@link UriHideFlags} for more details.
     */
    public java.lang.String toStringPartial(int flags) {
        var RESULT = gtk_h.g_uri_to_string_partial(handle(), flags);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Atomically decrements the reference count of {@code uri} by one.
     * <p>
     * When the reference count reaches zero, the resources allocated by
     * {@code uri} are freed
     */
    public void unref() {
        gtk_h.g_uri_unref(handle());
    }
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}.
     * <p>
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the "userinfo" separately.
     */
    public static Uri build(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_build(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link Uri} from the given components according to {@code flags}
     * ({@link UriFlags#HAS_PASSWORD} is added unconditionally). The {@code flags} must be
     * coherent with the passed values, in particular use {@code %}-encoded values with
     * {@link UriFlags#ENCODED}.
     * <p>
     * In contrast to g_uri_build(), this allows specifying the components
     * of the ‘userinfo’ field separately. Note that {@code user} must be non-<code>null</code>
     * if either {@code password} or {@code auth_params} is non-<code>null</code>.
     */
    public static Uri buildWithUser(int flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_build_with_user(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return new Uri(References.get(RESULT, true));
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_uri_error_quark();
        return new Quark(RESULT);
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
     */
    public static java.lang.String escapeBytes(byte[] unescaped, long length, java.lang.String reservedCharsAllowed) {
        var RESULT = gtk_h.g_uri_escape_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, unescaped)).handle(), length, Interop.allocateNativeString(reservedCharsAllowed).handle());
        return RESULT.getUtf8String(0);
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
     */
    public static java.lang.String escapeString(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        var RESULT = gtk_h.g_uri_escape_string(Interop.allocateNativeString(unescaped).handle(), Interop.allocateNativeString(reservedCharsAllowed).handle(), allowUtf8 ? 1 : 0);
        return RESULT.getUtf8String(0);
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
     */
    public static boolean isValid(java.lang.String uriString, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_is_valid(Interop.allocateNativeString(uriString).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be <code>null</code> (though it may be the empty
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
     */
    public static java.lang.String join(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Joins the given components together according to {@code flags} to create
     * an absolute URI string. {@code path} may not be <code>null</code> (though it may be the empty
     * string).
     * <p>
     * In contrast to g_uri_join(), this allows specifying the components
     * of the ‘userinfo’ separately. It otherwise behaves the same.
     * <p>
     * {@link UriFlags#HAS_PASSWORD} and {@link UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in {@code flags}.
     */
    public static java.lang.String joinWithUser(int flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join_with_user(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses {@code uri_string} according to {@code flags}. If the result is not a
     * valid [absolute URI][relative-absolute-uris], it will be discarded, and an
     * error returned.
     */
    public static Uri parse(java.lang.String uriString, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_parse(Interop.allocateNativeString(uriString).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Uri(References.get(RESULT, true));
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
     * characters in a row), then {@code error} is set and <code>null</code> is returned.
     */
    public static org.gtk.glib.HashTable parseParams(java.lang.String params, long length, java.lang.String separators, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_parse_params(Interop.allocateNativeString(params).handle(), length, Interop.allocateNativeString(separators).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.HashTable(References.get(RESULT, true));
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     */
    public static java.lang.String parseScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_parse_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * <a href="https://tools.ietf.org/html/rfc3986#section-3">RFC 3986</a> decodes the scheme
     * as:
     * |[
     * URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
     * ]|
     * Common schemes include {@code file}, {@code https}, {@code svn+ssh}, etc.
     * <p>
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     */
    public static java.lang.String peekScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_peek_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses {@code uri_ref} according to {@code flags} and, if it is a
     * [relative URI][relative-absolute-uris], resolves it relative to
     * {@code base_uri_string}. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     * <p>
     * (If {@code base_uri_string} is <code>null</code>, this just returns {@code uri_ref}, or
     * <code>null</code> if {@code uri_ref} is invalid or not absolute.)
     */
    public static java.lang.String resolveRelative(java.lang.String baseUriString, java.lang.String uriRef, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_resolve_relative(Interop.allocateNativeString(baseUriString).handle(), Interop.allocateNativeString(uriRef).handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unescapes a segment of an escaped string as binary data.
     * <p>
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     * <p>
     * If any of the characters in {@code illegal_characters} appears as an escaped
     * character in {@code escaped_string}, then that is an error and <code>null</code> will be
     * returned. This is useful if you want to avoid for instance having a slash
     * being expanded in an escaped path element, which might confuse pathname
     * handling.
     */
    public static Bytes unescapeBytes(java.lang.String escapedString, long length, java.lang.String illegalCharacters) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_uri_unescape_bytes(Interop.allocateNativeString(escapedString).handle(), length, Interop.allocateNativeString(illegalCharacters).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Bytes(References.get(RESULT, true));
    }
    
    /**
     * Unescapes a segment of an escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * <p>
     * Note: {@code NUL} byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     */
    public static java.lang.String unescapeSegment(java.lang.String escapedString, java.lang.String escapedStringEnd, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_segment(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(escapedStringEnd).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unescapes a whole escaped string.
     * <p>
     * If any of the characters in {@code illegal_characters} or the NUL
     * character appears as an escaped character in {@code escaped_string}, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     */
    public static java.lang.String unescapeString(java.lang.String escapedString, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_string(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
}
