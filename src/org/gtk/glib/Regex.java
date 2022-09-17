package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The g_regex_*() functions implement regular
 * expression pattern matching using syntax and semantics similar to
 * Perl regular expression.
 * 
 * Some functions accept a @start_position argument, setting it differs
 * from just passing over a shortened string and setting <code>G_REGEX_MATCH_NOTBOL
 * in</code> the case of a pattern that begins with any kind of lookbehind assertion.
 * For example, consider the pattern &#34;\\Biss\\B&#34; which finds occurrences of &#34;iss&#34;
 * in the middle of words. (&#34;\\B&#34; matches only if the current position in the
 * subject is not a word boundary.) When applied to the string &#34;Mississipi&#34;
 * from the fourth byte, namely &#34;issipi&#34;, it does not match, because &#34;\\B&#34; is
 * always false at the start of the subject, which is deemed to be a word
 * boundary. However, if the entire string is passed , but with
 * @start_position set to 4, it finds the second occurrence of &#34;iss&#34; because
 * it is able to look behind the starting point to discover that it is
 * preceded by a letter.
 * 
 * Note that, unless you set the {@link org.gtk.glib.RegexCompileFlags#RAW} flag, all the strings passed
 * to these functions must be encoded in UTF-8. The lengths and the positions
 * inside the strings are in bytes and not in characters, so, for instance,
 * &#34;\\xc3\\xa0&#34; (i.e. &#34;&#224;&#34;) is two bytes long but it is treated as a
 * single character. If you set {@link org.gtk.glib.RegexCompileFlags#RAW} the strings can be non-valid
 * UTF-8 strings and a byte is treated as a character, so &#34;\\xc3\\xa0&#34; is two
 * bytes and two characters long.
 * 
 * When matching a pattern, &#34;\\n&#34; matches only against a &#34;\\n&#34; character in
 * the string, and &#34;\\r&#34; matches only a &#34;\\r&#34; character. To match any newline
 * sequence use &#34;\\R&#34;. This particular group matches either the two-character
 * sequence CR + LF (&#34;\\r\\n&#34;), or one of the single characters LF (linefeed,
 * U+000A, &#34;\\n&#34;), VT vertical tab, U+000B, &#34;\\v&#34;), FF (formfeed, U+000C, &#34;\\f&#34;),
 * CR (carriage return, U+000D, &#34;\\r&#34;), NEL (next line, U+0085), LS (line
 * separator, U+2028), or PS (paragraph separator, U+2029).
 * 
 * The behaviour of the dot, circumflex, and dollar metacharacters are
 * affected by newline characters, the default is to recognize any newline
 * character (the same characters recognized by &#34;\\R&#34;). This can be changed
 * with <code>G_REGEX_NEWLINE_CR,</code> {@link org.gtk.glib.RegexCompileFlags#NEWLINE_LF} and <code>G_REGEX_NEWLINE_CRLF
 * compile</code> options, and with <code>G_REGEX_MATCH_NEWLINE_ANY,
 * %G_REGEX_MATCH_NEWLINE_CR,</code> {@link org.gtk.glib.RegexMatchFlags#NEWLINE_LF} and
 * {@link org.gtk.glib.RegexMatchFlags#NEWLINE_CRLF} match options. These settings are also
 * relevant when compiling a pattern if {@link org.gtk.glib.RegexCompileFlags#EXTENDED} is set, and an
 * unescaped &#34;#&#34; outside a character class is encountered. This indicates
 * a comment that lasts until after the next newline.
 * 
 * When setting the {@link org.gtk.glib.RegexCompileFlags#JAVASCRIPT_COMPAT} flag, pattern syntax and pattern
 * matching is changed to be compatible with the way that regular expressions
 * work in JavaScript. More precisely, a lonely &#39;]&#39; character in the pattern
 * is a syntax error; the &#39;\\x&#39; escape only allows 0 to 2 hexadecimal digits, and
 * you must use the &#39;\\u&#39; escape sequence with 4 hex digits to specify a unicode
 * codepoint instead of &#39;\\x&#39; or &#39;x{....}&#39;. If &#39;\\x&#39; or &#39;\\u&#39; are not followed by
 * the specified number of hex digits, they match &#39;x&#39; and &#39;u&#39; literally; also
 * &#39;\\U&#39; always matches &#39;U&#39; instead of being an error in the pattern. Finally,
 * pattern matching is modified so that back references to an unset subpattern
 * group produces a match with the empty string instead of an error. See
 * pcreapi(3) for more information.
 * 
 * Creating and manipulating the same #GRegex structure from different
 * threads is not a problem as #GRegex does not modify its internal
 * state between creation and destruction, on the other hand #GMatchInfo
 * is not threadsafe.
 * 
 * The regular expressions low-level functionalities are obtained through
 * the excellent
 * {@link [PCRE]}(http://www.pcre.org/)
 * library written by Philip Hazel.
 */
public class Regex extends io.github.jwharm.javagi.ResourceBase {

    public Regex(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String pattern, int compileOptions, int matchOptions) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_regex_new(Interop.allocateNativeString(pattern).handle(), compileOptions, matchOptions, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Compiles the regular expression to an internal form, and does
     * the initial setup of the #GRegex structure.
     */
    public Regex(java.lang.String pattern, int compileOptions, int matchOptions) throws GErrorException {
        super(constructNew(pattern, compileOptions, matchOptions));
    }
    
    /**
     * Returns the number of capturing subpatterns in the pattern.
     */
    public int getCaptureCount() {
        var RESULT = gtk_h.g_regex_get_capture_count(handle());
        return RESULT;
    }
    
    /**
     * Returns the compile options that @regex was created with.
     * <p>
     * Depending on the version of PCRE that is used, this may or may not
     * include flags set by option expressions such as <code>(?i)</code> found at the
     * top-level within the compiled pattern.
     */
    public int getCompileFlags() {
        var RESULT = gtk_h.g_regex_get_compile_flags(handle());
        return RESULT;
    }
    
    /**
     * Checks whether the pattern contains explicit CR or LF references.
     */
    public boolean getHasCrOrLf() {
        var RESULT = gtk_h.g_regex_get_has_cr_or_lf(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the match options that @regex was created with.
     */
    public int getMatchFlags() {
        var RESULT = gtk_h.g_regex_get_match_flags(handle());
        return RESULT;
    }
    
    /**
     * Returns the number of the highest back reference
     * in the pattern, or 0 if the pattern does not contain
     * back references.
     */
    public int getMaxBackref() {
        var RESULT = gtk_h.g_regex_get_max_backref(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of characters in the longest lookbehind assertion in the
     * pattern. This information is useful when doing multi-segment matching using
     * the partial matching facilities.
     */
    public int getMaxLookbehind() {
        var RESULT = gtk_h.g_regex_get_max_lookbehind(handle());
        return RESULT;
    }
    
    /**
     * Gets the pattern string associated with @regex, i.e. a copy of
     * the string passed to g_regex_new().
     */
    public java.lang.String getPattern() {
        var RESULT = gtk_h.g_regex_get_pattern(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the number of the subexpression named @name.
     */
    public int getStringNumber(java.lang.String name) {
        var RESULT = gtk_h.g_regex_get_string_number(handle(), Interop.allocateNativeString(name).handle());
        return RESULT;
    }
    
    /**
     * Scans for a match in @string for the pattern in @regex.
     * The @match_options are combined with the match options specified
     * when the @regex structure was created, letting you have more
     * flexibility in reusing #GRegex structures.
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags#RAW} is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match,
     * is stored in @match_info if not <code>NULL.</code> Note that if @match_info
     * is not <code>null</code> then it is created even if the function returns <code>FALSE,
     * i.e.</code> you must free it regardless if regular expression actually matched.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *  
     *   regex = g_regex_new (&#34;[A-Z]}+&#34;, 0, 0, NULL);
     *   g_regex_match (regex, string, 0, &#38;match_info);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print (&#34;Found: <code>s\\n&#34;,</code> word);
     *       g_free (word);
     *       g_match_info_next (match_info, NULL);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     * }
     * ]|
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean match(java.lang.String string, int matchOptions, MatchInfo[] matchInfo) {
        var RESULT = gtk_h.g_regex_match(handle(), Interop.allocateNativeString(string).handle(), matchOptions, Interop.allocateNativeArray(matchInfo).handle());
        return (RESULT != 0);
    }
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the string is retrieved. This function uses
     * a different algorithm so it can retrieve all the possible matches.
     * For more documentation see g_regex_match_all_full().
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not <code>NULL.</code> Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>FALSE,
     * i.e.</code> you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean matchAll(java.lang.String string, int matchOptions, MatchInfo[] matchInfo) {
        var RESULT = gtk_h.g_regex_match_all(handle(), Interop.allocateNativeString(string).handle(), matchOptions, Interop.allocateNativeArray(matchInfo).handle());
        return (RESULT != 0);
    }
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the @string is retrieved, it is not possible
     * to obtain all the available matches. For instance matching
     * &#34;&#60;a&#62; &#60;b&#62; &#60;c&#62;&#34; against the pattern &#34;&#60;.*&#62;&#34;
     * you get &#34;&#60;a&#62; &#60;b&#62; &#60;c&#62;&#34;.
     * 
     * This function uses a different algorithm (called DFA, i.e. deterministic
     * finite automaton), so it can retrieve all the possible matches, all
     * starting at the same point in the string. For instance matching
     * &#34;&#60;a&#62; &#60;b&#62; &#60;c&#62;&#34; against the pattern &#34;&#60;.*&#62;;&#34;
     * you would obtain three matches: &#34;&#60;a&#62; &#60;b&#62; &#60;c&#62;&#34;,
     * &#34;&#60;a&#62; &#60;b&#62;&#34; and &#34;&#60;a&#62;&#34;.
     * 
     * The number of matched strings is retrieved using
     * g_match_info_get_match_count(). To obtain the matched strings and
     * their position you can use, respectively, g_match_info_fetch() and
     * g_match_info_fetch_pos(). Note that the strings are returned in
     * reverse order of length; that is, the longest matching string is
     * given first.
     * 
     * Note that the DFA algorithm is slower than the standard one and it
     * is not able to capture substrings, so backreferences do not work.
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &#34;\\b&#34;.
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags#RAW} is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not <code>NULL.</code> Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>FALSE,
     * i.e.</code> you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean matchAllFull(java.lang.String[] string, long stringLen, int startPosition, int matchOptions, MatchInfo[] matchInfo) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_regex_match_all_full(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions, Interop.allocateNativeArray(matchInfo).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Scans for a match in @string for the pattern in @regex.
     * The @match_options are combined with the match options specified
     * when the @regex structure was created, letting you have more
     * flexibility in reusing #GRegex structures.
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &#34;\\b&#34;.
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags#RAW} is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not <code>NULL.</code> Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>FALSE,
     * i.e.</code> you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *   GError *error = NULL;
     *   
     *   regex = g_regex_new (&#34;[A-Z]}+&#34;, 0, 0, NULL);
     *   g_regex_match_full (regex, string, -1, 0, 0, &#38;match_info, &#38;error);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print (&#34;Found: <code>s\\n&#34;,</code> word);
     *       g_free (word);
     *       g_match_info_next (match_info, &#38;error);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     *   if (error != NULL)
     *     {
     *       g_printerr (&#34;Error while matching: <code>s\\n&#34;,</code> error-&#62;message);
     *       g_error_free (error);
     *     }
     * }
     * ]|
     */
    public boolean matchFull(java.lang.String[] string, long stringLen, int startPosition, int matchOptions, MatchInfo[] matchInfo) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_regex_match_full(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions, Interop.allocateNativeArray(matchInfo).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Increases reference count of @regex by 1.
     */
    public Regex ref() {
        var RESULT = gtk_h.g_regex_ref(handle());
        return new Regex(References.get(RESULT, true));
    }
    
    /**
     * Replaces all occurrences of the pattern in @regex with the
     * replacement text. Backreferences of the form &#39;\\number&#39; or
     * &#39;\\g&#60;number&#62;&#39; in the replacement text are interpolated by the
     * number-th captured subexpression of the match, &#39;\\g&#60;name&#62;&#39; refers
     * to the captured subexpression with the given name. &#39;\\0&#39; refers
     * to the complete match, but &#39;\\0&#39; followed by a number is the octal
     * representation of a character. To include a literal &#39;\\&#39; in the
     * replacement, write &#39;\\\\\\\\&#39;.
     * 
     * There are also escapes that changes the case of the following text:
     * 
     * - \\l: Convert to lower case the next character
     * - \\u: Convert to upper case the next character
     * - \\L: Convert to lower case till \\E
     * - \\U: Convert to upper case till \\E
     * - \\E: End case modification
     * 
     * If you do not need to use backreferences use g_regex_replace_literal().
     * 
     * The @replacement string must be UTF-8 encoded even if {@link org.gtk.glib.RegexCompileFlags#RAW} was
     * passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * you can use g_regex_replace_literal().
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags#NOTBOL} in the case of a pattern that
     * begins with any kind of lookbehind assertion, such as &#34;\\b&#34;.
     */
    public java.lang.String replace(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, int matchOptions) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_regex_replace(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Replaces occurrences of the pattern in regex with the output of
     * @eval for that occurrence.
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &#34;\\b&#34;.
     * 
     * The following example uses g_regex_replace_eval() to replace multiple
     * strings at once:
     * |{@link [&#60;!-- language=&#34;C&#34; --&#62;
     * static gboolean
     * eval_cb (const GMatchInfo *info,
     *          GString          *res,
     *          gpointer          data)
     * {
     *   gchar *match;
     *   gchar *r;
     * 
     *    match = g_match_info_fetch (info, 0);
     *    r = g_hash_table_lookup ((GHashTable *)data, match);
     *    g_string_append (res, r);
     *    g_free (match);
     * 
     *    return FALSE;
     * }
     * 
     * ...
     * 
     * GRegex *reg;
     * GHashTable *h;
     * gchar *res;
     * 
     * h = g_hash_table_new (g_str_hash, g_str_equal);
     * 
     * g_hash_table_insert (h, &#34;1&#34;, &#34;ONE&#34;);
     * g_hash_table_insert (h, &#34;2&#34;, &#34;TWO&#34;);
     * g_hash_table_insert (h, &#34;3&#34;, &#34;THREE&#34;);
     * g_hash_table_insert (h, &#34;4&#34;, &#34;FOUR&#34;);
     * 
     * reg = g_regex_new (&#34;1|2|3|4&#34;, 0, 0, NULL);
     * res = g_regex_replace_eval (reg, text, -1, 0, 0, eval_cb, h, NULL);
     * g_hash_table_destroy (h);
     * 
     * ...
     * ]}|
     */
    public java.lang.String replaceEval(java.lang.String[] string, long stringLen, int startPosition, int matchOptions, RegexEvalCallback eval) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = gtk_h.g_regex_replace_eval(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions, 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbRegexEvalCallback",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(eval.hashCode(), eval)), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Replaces all occurrences of the pattern in @regex with the
     * replacement text. @replacement is replaced literally, to
     * include backreferences use g_regex_replace().
     * 
     * Setting @start_position differs from just passing over a
     * shortened string and setting {@link org.gtk.glib.RegexMatchFlags#NOTBOL} in the
     * case of a pattern that begins with any kind of lookbehind
     * assertion, such as &#34;\\b&#34;.
     */
    public java.lang.String replaceLiteral(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, int matchOptions) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_regex_replace_literal(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Decreases reference count of @regex by 1. When reference count drops
     * to zero, it frees all the memory associated with the regex structure.
     */
    public void unref() {
        gtk_h.g_regex_unref(handle());
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_regex_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Escapes the nul characters in @string to &#34;\\x00&#34;.  It can be used
     * to compile a regex with embedded nul characters.
     * 
     * For completeness, @length can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to @string.
     */
    public static java.lang.String escapeNul(java.lang.String string, int length) {
        var RESULT = gtk_h.g_regex_escape_nul(Interop.allocateNativeString(string).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Escapes the special characters used for regular expressions
     * in @string, for instance &#34;a.b*c&#34; becomes &#34;a\\.b\\*c&#34;. This
     * function is useful to dynamically generate regular expressions.
     * 
     * @string can contain nul characters that are replaced with &#34;\\0&#34;,
     * in this case remember to specify the correct length of @string
     * in @length.
     */
    public static java.lang.String escapeString(java.lang.String[] string, int length) {
        var RESULT = gtk_h.g_regex_escape_string(Interop.allocateNativeArray(string).handle(), length);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Scans for a match in @string for @pattern.
     * 
     * This function is equivalent to g_regex_match() but it does not
     * require to compile the pattern with g_regex_new(), avoiding some
     * lines of code when you need just to do a match without extracting
     * substrings, capture counts, and so on.
     * 
     * If this function is to be called on the same @pattern more than
     * once, it&#39;s more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     */
    public static boolean matchSimple(java.lang.String pattern, java.lang.String string, int compileOptions, int matchOptions) {
        var RESULT = gtk_h.g_regex_match_simple(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions, matchOptions);
        return (RESULT != 0);
    }
    
}
