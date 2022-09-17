package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GUri type and related functions can be used to parse URIs into
 * their components, and build valid URIs from individual components.
 * <p>
 * Note that #GUri scope is to help manipulate URIs in various applications,
 * following {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986). In particular,
 * it doesn&#39;t intend to cover web browser needs, and doesn&#39;t implement the
 * {@link [WHATWG URL]}(https://url.spec.whatwg.org/) standard. No APIs are provided to
 * help prevent
 * {@link [homograph attacks]}(https://en.wikipedia.org/wiki/IDN_homograph_attack), so
 * <h1>ri is not suitable for formatting URIs for display to the user for making</h1>
 * security-sensitive decisions.
 * <p>
 * <h2>Relative and absolute URIs # {#relative-absolute-uris}</h2>
 * <p>
 * As defined in {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986#section-4), the
 * hierarchical nature of URIs means that they can either be &#8216;relative
 * references&#8217; (sometimes referred to as &#8216;relative URIs&#8217;) or &#8216;URIs&#8217; (for
 * clarity, &#8216;URIs&#8217; are referred to in this documentation as
 * &#8216;absolute URIs&#8217; &#8212; although
 * {@link [in constrast to RFC 3986]}(https://tools.ietf.org/html/rfc3986#section-4.3),
 * fragment identifiers are always allowed).
 * <p>
 * Relative references have one or more components of the URI missing. In
 * particular, they have no scheme. Any other component, such as hostname,
 * query, etc. may be missing, apart from a path, which has to be specified (but
 * may be empty). The path may be relative, starting with <code>./</code> rather than <code>/</code>.
 * <p>
 * For example, a valid relative reference is <code>./path?query</code>,<code>/?query#fragment</code> or <code>//example.com</code>.
 * <p>
 * Absolute URIs have a scheme specified. Any other components of the URI which
 * are missing are specified as explicitly unset in the URI, rather than being
 * resolved relative to a base URI using g_uri_parse_relative().
 * <p>
 * For example, a valid absolute URI is <code>file:///home/bob</code> or<code>https://search.com?query=string</code>.
 * <p>
 * A #GUri instance is always an absolute URI. A string may be an absolute URI
 * or a relative reference; see the documentation for individual functions as to
 * what forms they accept.
 * <p>
 * <h2>Parsing URIs</h2>
 * <p>
 * The most minimalist APIs for parsing URIs are g_uri_split() and
 * g_uri_split_with_user(). These split a URI into its component
 * parts, and return the parts; the difference between the two is that
 * g_uri_split() treats the &#8216;userinfo&#8217; component of the URI as a
 * single element, while g_uri_split_with_user() can (depending on the
 * <h1>riFlags you pass) treat it as containing a username, password,</h1>
 * and authentication parameters. Alternatively, g_uri_split_network()
 * can be used when you are only interested in the components that are
 * needed to initiate a network connection to the service (scheme,
 * host, and port).
 * <p>
 * g_uri_parse() is similar to g_uri_split(), but instead of returning
 * individual strings, it returns a #GUri structure (and it requires
 * that the URI be an absolute URI).
 * <p>
 * g_uri_resolve_relative() and g_uri_parse_relative() allow you to
 * resolve a relative URI relative to a base URI.
 * g_uri_resolve_relative() takes two strings and returns a string,
 * and g_uri_parse_relative() takes a #GUri and a string and returns a
 * <h1>ri.</h1>
 * <p>
 * All of the parsing functions take a #GUriFlags argument describing
 * exactly how to parse the URI; see the documentation for that type
 * for more details on the specific flags that you can pass. If you
 * need to choose different flags based on the type of URI, you can
 * use g_uri_peek_scheme() on the URI string to check the scheme
 * first, and use that to decide what flags to parse it with.
 * <p>
 * For example, you might want to use {@link org.gtk.glib.UriParamsFlags#WWW_FORM} when parsing the
 * params for a web URI, so compare the result of g_uri_peek_scheme() against<code>http</code> and <code>https</code>.
 * <p>
 * <h2>Building URIs</h2>
 * <p>
 * g_uri_join() and g_uri_join_with_user() can be used to construct
 * valid URI strings from a set of component strings. They are the
 * inverse of g_uri_split() and g_uri_split_with_user().
 * <p>
 * Similarly, g_uri_build() and g_uri_build_with_user() can be used to
 * construct a #GUri from a set of component strings.
 * <p>
 * As with the parsing functions, the building functions take a
 * <h1>riFlags argument. In particular, it is important to keep in mind</h1>
 * whether the URI components you are using are already <code><code></code>-encoded.</code> If so,
 * you must pass the {@link org.gtk.glib.UriFlags#ENCODED} flag.
 * <p>
 * <h2></h2><code>file://</code> URIs
 * <p>
 * Note that Windows and Unix both define special rules for parsing<code>file://</code> URIs (involving non-UTF-8 character sets on Unix, and the
 * interpretation of path separators on Windows). #GUri does not
 * implement these rules. Use g_filename_from_uri() and
 * g_filename_to_uri() if you want to properly convert between<code>file://</code> URIs and local filenames.
 * <p>
 * <h2>URI Equality</h2>
 * <p>
 * Note that there is no <code>g_uri_equal ()</code> function, because comparing
 * URIs usefully requires scheme-specific knowledge that #GUri does
 * not have. #GUri can help with normalization if you use the various
 * encoded #GUriFlags as well as {@link org.gtk.glib.UriFlags#SCHEME_NORMALIZE} however
 * it is not comprehensive.
 * For example, <code>data:,foo</code> and <code>data:;base64,Zm9v</code> resolve to the same
 * thing according to the <code>data:</code> URI specification which GLib does not
 * handle.
 */
public class Uri extends io.github.jwharm.javagi.ResourceBase {

    public Uri(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets @uri&#39;s authentication parameters, which may contain<code><code></code>-encoding,</code> depending on the flags with which @uri was created.
     * (If @uri was not created with {@link org.gtk.glib.UriFlags#HAS_AUTH_PARAMS} then this will
     * be <code>NULL.)
     * 
     * Depending</code> on the URI scheme, g_uri_parse_params() may be useful for
     * further parsing this information.
     */
    public java.lang.String getAuthParams() {
        var RESULT = gtk_h.g_uri_get_auth_params(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s flags set upon construction.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_uri_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets @uri&#39;s fragment, which may contain <code><code></code>-encoding,</code> depending on
     * the flags with which @uri was created.
     */
    public java.lang.String getFragment() {
        var RESULT = gtk_h.g_uri_get_fragment(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s host. This will never have <code><code></code>-encoded</code> characters,
     * unless it is non-UTF-8 (which can only be the case if @uri was
     * created with <code>G_URI_FLAGS_NON_DNS).
     * <p>
     * If</code> @uri contained an IPv6 address literal, this value will be just
     * that address, without the brackets around it that are necessary in
     * the string form of the URI. Note that in this case there may also
     * be a scope ID attached to the address. Eg, <code>fe80::1234<code></code><code>em1</code></code> (or<code>fe80::1234<code></code><code>25em1</code></code> if the string is still encoded).
     */
    public java.lang.String getHost() {
        var RESULT = gtk_h.g_uri_get_host(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s password, which may contain <code><code></code>-encoding,</code> depending on
     * the flags with which @uri was created. (If @uri was not created
     * with {@link org.gtk.glib.UriFlags#HAS_PASSWORD} then this will be then this will be %NULL.)
     */
    public java.lang.String getPassword() {
        var RESULT = gtk_h.g_uri_get_password(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s path, which may contain <code><code></code>-encoding,</code> depending on the
     * flags with which @uri was created.
     */
    public java.lang.String getPath() {
        var RESULT = gtk_h.g_uri_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s port.
     */
    public int getPort() {
        var RESULT = gtk_h.g_uri_get_port(handle());
        return RESULT;
    }
    
    /**
     * Gets @uri&#39;s query, which may contain <code><code></code>-encoding,</code> depending on the
     * flags with which @uri was created.
     * <p>
     * For queries consisting of a series of <code>name=value</code> parameters,
     * #GUriParamsIter or g_uri_parse_params() may be useful.
     */
    public java.lang.String getQuery() {
        var RESULT = gtk_h.g_uri_get_query(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s scheme. Note that this will always be all-lowercase,
     * regardless of the string or strings that @uri was created from.
     */
    public java.lang.String getScheme() {
        var RESULT = gtk_h.g_uri_get_scheme(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the &#8216;username&#8217; component of @uri&#39;s userinfo, which may contain<code><code></code>-encoding,</code> depending on the flags with which @uri was created.
     * If @uri was not created with {@link org.gtk.glib.UriFlags#HAS_PASSWORD} or
     * <code>G_URI_FLAGS_HAS_AUTH_PARAMS,</code> this is the same as g_uri_get_userinfo().
     */
    public java.lang.String getUser() {
        var RESULT = gtk_h.g_uri_get_user(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets @uri&#39;s userinfo, which may contain <code><code></code>-encoding,</code> depending on
     * the flags with which @uri was created.
     */
    public java.lang.String getUserinfo() {
        var RESULT = gtk_h.g_uri_get_userinfo(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_ref according to @flags and, if it is a
     * {@link [relative URI]}{@link [relative-absolute-uris]}, resolves it relative to @base_uri.
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
     * Increments the reference count of @uri by one.
     */
    public Uri ref() {
        var RESULT = gtk_h.g_uri_ref(handle());
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Returns a string representing @uri.
     * 
     * This is not guaranteed to return a string which is identical to the
     * string that @uri was parsed from. However, if the source URI was
     * syntactically correct (according to RFC 3986), and it was parsed
     * with <code>G_URI_FLAGS_ENCODED,</code> then g_uri_to_string() is guaranteed to return
     * a string which is at least semantically equivalent to the source
     * URI (according to RFC 3986).
     * 
     * If @uri might contain sensitive details, such as authentication parameters,
     * or private data in its query string, and the returned string is going to be
     * logged, then consider using g_uri_to_string_partial() to redact parts.
     */
    public java.lang.String toString() {
        var RESULT = gtk_h.g_uri_to_string(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a string representing @uri, subject to the options in
     * @flags. See g_uri_to_string() and #GUriHideFlags for more details.
     */
    public java.lang.String toStringPartial(int flags) {
        var RESULT = gtk_h.g_uri_to_string_partial(handle(), flags);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Atomically decrements the reference count of @uri by one.
     * 
     * When the reference count reaches zero, the resources allocated by
     * @uri are freed
     */
    public void unref() {
        gtk_h.g_uri_unref(handle());
    }
    
    /**
     * Creates a new #GUri from the given components according to @flags.
     * 
     * See also g_uri_build_with_user(), which allows specifying the
     * components of the &#34;userinfo&#34; separately.
     */
    public static Uri build(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_build(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return new Uri(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GUri from the given components according to @flags
     * ({@link org.gtk.glib.UriFlags#HAS_PASSWORD} is added unconditionally). The @flags must be
     * coherent with the passed values, in particular use <code><code></code>-encoded</code> values with
     * <code>G_URI_FLAGS_ENCODED.
     * 
     * In</code> contrast to g_uri_build(), this allows specifying the components
     * of the &#8216;userinfo&#8217; field separately. Note that @user must be non-<code>NULL
     * if</code> either @password or @auth_params is non-either @password or @auth_params is non-%NULL.
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
     * Normally all characters that are not &#8216;unreserved&#8217; (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the &#8216;reserved&#8217; characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * <p>
     * Though technically incorrect, this will also allow escaping nul
     * bytes as <code>
     *             
     *           
     *         
     *       
     *       
     *         
     *           
     *         
     *       
     *       
     *         Escapes arbitrary data for use in a URI.
     * <p>
     * Normally all characters that are not &#8216;unreserved&#8217; (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the &#8216;reserved&#8217; characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     * <p>
     * Though technically incorrect, this will also allow escaping nul
     * bytes as <code>%</code><code>00</code>.
     */
    public static java.lang.String escapeBytes(byte[] unescaped, long length, java.lang.String reservedCharsAllowed) {
        var RESULT = gtk_h.g_uri_escape_bytes(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, unescaped)).handle(), length, Interop.allocateNativeString(reservedCharsAllowed).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes a string for use in a URI.
     * 
     * Normally all characters that are not &#34;unreserved&#34; (i.e. ASCII
     * alphanumerical characters plus dash, dot, underscore and tilde) are
     * escaped. But if you specify characters in @reserved_chars_allowed
     * they are not escaped. This is useful for the &#34;reserved&#34; characters
     * in the URI specification, since those are allowed unescaped in some
     * portions of a URI.
     */
    public static java.lang.String escapeString(java.lang.String unescaped, java.lang.String reservedCharsAllowed, boolean allowUtf8) {
        var RESULT = gtk_h.g_uri_escape_string(Interop.allocateNativeString(unescaped).handle(), Interop.allocateNativeString(reservedCharsAllowed).handle(), allowUtf8 ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_string according to @flags, to determine whether it is a valid
     * {@link [absolute URI]}{@link [relative-absolute-uris]}, i.e. it does not need to be resolved
     * relative to another URI using g_uri_parse_relative().
     * 
     * If it&#8217;s not a valid URI, an error is returned explaining how it&#8217;s invalid.
     * 
     * See g_uri_split(), and the definition of #GUriFlags, for more
     * information on the effect of @flags.
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
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be <code>null</code> (though it may be the empty
     * string).
     * <p>
     * When @host is present, @path must either be empty or begin with a slash (<code>/</code>)
     * character. When @host is not present, @path cannot begin with two slash
     *    characters (<code>//</code>). See
     * {@link [RFC 3986, section 3]}(https://tools.ietf.org/html/rfc3986#section-3).
     * 
     * See also g_uri_join_with_user(), which allows specifying the
     * components of the &#8216;userinfo&#8217; separately.
     * 
     * {@link org.gtk.glib.UriFlags#HAS_PASSWORD} and {@link org.gtk.glib.UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in @flags.
     */
    public static java.lang.String join(int flags, java.lang.String scheme, java.lang.String userinfo, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(userinfo).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Joins the given components together according to @flags to create
     * an absolute URI string. @path may not be <code>null</code> (though it may be the empty
     * string).
     * 
     * In contrast to g_uri_join(), this allows specifying the components
     * of the &#8216;userinfo&#8217; separately. It otherwise behaves the same.
     * 
     * {@link org.gtk.glib.UriFlags#HAS_PASSWORD} and {@link org.gtk.glib.UriFlags#HAS_AUTH_PARAMS} are ignored if set
     * in @flags.
     */
    public static java.lang.String joinWithUser(int flags, java.lang.String scheme, java.lang.String user, java.lang.String password, java.lang.String authParams, java.lang.String host, int port, java.lang.String path, java.lang.String query, java.lang.String fragment) {
        var RESULT = gtk_h.g_uri_join_with_user(flags, Interop.allocateNativeString(scheme).handle(), Interop.allocateNativeString(user).handle(), Interop.allocateNativeString(password).handle(), Interop.allocateNativeString(authParams).handle(), Interop.allocateNativeString(host).handle(), port, Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(query).handle(), Interop.allocateNativeString(fragment).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_string according to @flags. If the result is not a
     * valid {@link [absolute URI]}{@link [relative-absolute-uris]}, it will be discarded, and an
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
     * <h1>riParamsIter.</h1>
     * <p>
     * The @params string is assumed to still be <code><code></code>-encoded,</code> but the returned
     * values will be fully decoded. (Thus it is possible that the returned values
     * may contain <code>=</code> or @separators, if the value was encoded in the input.)
     * Invalid <code><code></code>-encoding</code> is treated as with the <code>G_URI_FLAGS_PARSE_RELAXED
     * rules</code> for g_uri_parse(). (However, if @params is the path or query string
     * from a #GUri that was parsed without {@link org.gtk.glib.UriFlags#PARSE_RELAXED} and
     * <code>G_URI_FLAGS_ENCODED,</code> then you already know that it does not contain any
     * invalid encoding.)
     * <p>
     * {@link org.gtk.glib.UriParamsFlags#WWW_FORM} is handled as documented for g_uri_params_iter_init().
     * <p>
     * If {@link org.gtk.glib.UriParamsFlags#CASE_INSENSITIVE} is passed to @flags, attributes will be
     * compared case-insensitively, so a params string <code>attr=123&#38;Attr=456</code> will only
     * return a single attribute&#8211;value pair, <code>Attr=456</code>. Case will be preserved in
     * the returned attributes.
     * 
     * If @params cannot be parsed (for example, it contains two @separators
     * characters in a row), then @error is set and <code>null</code> is returned.
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
     * {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
     * as:
     * |{@link [
     * URI = scheme &#34;:&#34; hier-part [ &#34;?&#34; query ]} {@link [ &#34;#&#34; fragment ]}
     * ]|
     * Common schemes include <code>file</code>, <code>https</code>, <code>svn+ssh</code>, etc.
     */
    public static java.lang.String parseScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_parse_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the scheme portion of a URI string.
     * {@link [RFC 3986]}(https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
     * as:
     * |{@link [
     * URI = scheme &#34;:&#34; hier-part [ &#34;?&#34; query ]} {@link [ &#34;#&#34; fragment ]}
     * ]|
     * Common schemes include <code>file</code>, <code>https</code>, <code>svn+ssh</code>, etc.
     * 
     * Unlike g_uri_parse_scheme(), the returned scheme is normalized to
     * all-lowercase and does not need to be freed.
     */
    public static java.lang.String peekScheme(java.lang.String uri) {
        var RESULT = gtk_h.g_uri_peek_scheme(Interop.allocateNativeString(uri).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Parses @uri_ref according to @flags and, if it is a
     * {@link [relative URI]}{@link [relative-absolute-uris]}, resolves it relative to
     * @base_uri_string. If the result is not a valid absolute URI, it will be
     * discarded, and an error returned.
     * 
     * (If @base_uri_string is <code>NULL,</code> this just returns @uri_ref, or
     * <code>null</code> if @uri_ref is invalid or not absolute.)
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
     * 
     * Note that in contrast to g_uri_unescape_string(), this does allow
     * nul bytes to appear in the output.
     * 
     * If any of the characters in @illegal_characters appears as an escaped
     * character in @escaped_string, then that is an error and <code>null</code> will be
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
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     * <p>
     * Note: <code>NUL</code> byte is not accepted in the output, in contrast to
     * g_uri_unescape_bytes().
     */
    public static java.lang.String unescapeSegment(java.lang.String escapedString, java.lang.String escapedStringEnd, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_segment(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(escapedStringEnd).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Unescapes a whole escaped string.
     * 
     * If any of the characters in @illegal_characters or the NUL
     * character appears as an escaped character in @escaped_string, then
     * that is an error and <code>null</code> will be returned. This is useful if you
     * want to avoid for instance having a slash being expanded in an
     * escaped path element, which might confuse pathname handling.
     */
    public static java.lang.String unescapeString(java.lang.String escapedString, java.lang.String illegalCharacters) {
        var RESULT = gtk_h.g_uri_unescape_string(Interop.allocateNativeString(escapedString).handle(), Interop.allocateNativeString(illegalCharacters).handle());
        return RESULT.getUtf8String(0);
    }
    
}
