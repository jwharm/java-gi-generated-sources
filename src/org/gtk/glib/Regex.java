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
 * from just passing over a shortened string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the case of a pattern that begins with any kind of lookbehind assertion.
 * For example, consider the pattern &<code>#34</code> \\Biss\\B&<code>#34</code>  which finds occurrences of &<code>#34</code> iss&<code>#34</code> 
 * in the middle of words. (&<code>#34</code> \\B&<code>#34</code>  matches only if the current position in the
 * subject is not a word boundary.) When applied to the string &<code>#34</code> Mississipi&<code>#34</code> 
 * from the fourth byte, namely &<code>#34</code> issipi&<code>#34</code> , it does not match, because &<code>#34</code> \\B&<code>#34</code>  is
 * always false at the start of the subject, which is deemed to be a word
 * boundary. However, if the entire string is passed , but with
 * @start_position set to 4, it finds the second occurrence of &<code>#34</code> iss&<code>#34</code>  because
 * it is able to look behind the starting point to discover that it is
 * preceded by a letter.
 * 
 * Note that, unless you set the {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  flag, all the strings passed
 * to these functions must be encoded in UTF-8. The lengths and the positions
 * inside the strings are in bytes and not in characters, so, for instance,
 * &<code>#34</code> \\xc3\\xa0&<code>#34</code>  (i.e. &<code>#34</code> &<code>#224</code> &<code>#34</code> ) is two bytes long but it is treated as a
 * single character. If you set {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  the strings can be non-valid
 * UTF-8 strings and a byte is treated as a character, so &<code>#34</code> \\xc3\\xa0&<code>#34</code>  is two
 * bytes and two characters long.
 * 
 * When matching a pattern, &<code>#34</code> \\n&<code>#34</code>  matches only against a &<code>#34</code> \\n&<code>#34</code>  character in
 * the string, and &<code>#34</code> \\r&<code>#34</code>  matches only a &<code>#34</code> \\r&<code>#34</code>  character. To match any newline
 * sequence use &<code>#34</code> \\R&<code>#34</code> . This particular group matches either the two-character
 * sequence CR + LF (&<code>#34</code> \\r\\n&<code>#34</code> ), or one of the single characters LF (linefeed,
 * U+000A, &<code>#34</code> \\n&<code>#34</code> ), VT vertical tab, U+000B, &<code>#34</code> \\v&<code>#34</code> ), FF (formfeed, U+000C, &<code>#34</code> \\f&<code>#34</code> ),
 * CR (carriage return, U+000D, &<code>#34</code> \\r&<code>#34</code> ), NEL (next line, U+0085), LS (line
 * separator, U+2028), or PS (paragraph separator, U+2029).
 * 
 * The behaviour of the dot, circumflex, and dollar metacharacters are
 * affected by newline characters, the default is to recognize any newline
 * character (the same characters recognized by &<code>#34</code> \\R&<code>#34</code> ). This can be changed
 * with {@link org.gtk.glib.RegexCompileFlags<code>#NEWLINE_CR</code>   {@link org.gtk.glib.RegexCompileFlags<code>#NEWLINE_LF</code>  and {@link org.gtk.glib.RegexCompileFlags<code>#NEWLINE_CRLF</code>  compile options, and with {@link org.gtk.glib.RegexMatchFlags<code>#NEWLINE_ANY</code>  
 * {@link org.gtk.glib.RegexMatchFlags<code>#NEWLINE_CR</code>   {@link org.gtk.glib.RegexMatchFlags<code>#NEWLINE_LF</code>  and
 * {@link org.gtk.glib.RegexMatchFlags<code>#NEWLINE_CRLF</code>  match options. These settings are also
 * relevant when compiling a pattern if {@link org.gtk.glib.RegexCompileFlags<code>#EXTENDED</code>  is set, and an
 * unescaped &<code>#34</code> <code>#</code> <code>#34</code>  outside a character class is encountered. This indicates
 * a comment that lasts until after the next newline.
 * 
 * When setting the {@link org.gtk.glib.RegexCompileFlags<code>#JAVASCRIPT_COMPAT</code>  flag, pattern syntax and pattern
 * matching is changed to be compatible with the way that regular expressions
 * work in JavaScript. More precisely, a lonely &<code>#39</code> ]&<code>#39</code>  character in the pattern
 * is a syntax error; the &<code>#39</code> \\x&<code>#39</code>  escape only allows 0 to 2 hexadecimal digits, and
 * you must use the &<code>#39</code> \\u&<code>#39</code>  escape sequence with 4 hex digits to specify a unicode
 * codepoint instead of &<code>#39</code> \\x&<code>#39</code>  or &<code>#39</code> x{....}&<code>#39</code> . If &<code>#39</code> \\x&<code>#39</code>  or &<code>#39</code> \\u&<code>#39</code>  are not followed by
 * the specified number of hex digits, they match &<code>#39</code> x&<code>#39</code>  and &<code>#39</code> u&<code>#39</code>  literally; also
 * &<code>#39</code> \\U&<code>#39</code>  always matches &<code>#39</code> U&<code>#39</code>  instead of being an error in the pattern. Finally,
 * pattern matching is modified so that back references to an unset subpattern
 * group produces a match with the empty string instead of an error. See
 * pcreapi(3) for more information.
 * 
 * Creating and manipulating the same {@link org.gtk.glib.Regex} structure from different
 * threads is not a problem as {@link org.gtk.glib.Regex} does not modify its internal
 * state between creation and destruction, on the other hand {@link org.gtk.glib.MatchInfo} is not threadsafe.
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
     * the initial setup of the {@link org.gtk.glib.Regex} structure.
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
     * flexibility in reusing {@link org.gtk.glib.Regex} structures.
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  is specified in the options, @string must be valid UTF-8.
     * 
     * A {@link org.gtk.glib.MatchInfo} structure, used to get information on the match,
     * is stored in @match_info if not <code>null</code>  Note that if @match_info
     * is not <code>null</code> then it is created even if the function returns <code>false</code> 
     * i.e. you must free it regardless if regular expression actually matched.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *  
     *   regex = g_regex_new (&<code>#34</code> [A-Z]}+&<code>#34</code> , 0, 0, NULL);
     *   g_regex_match (regex, string, 0, &<code>#38</code> match_info);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print (&<code>#34</code> Found: <code>s</code> n&<code>#34</code> , word);
     *       g_free (word);
     *       g_match_info_next (match_info, NULL);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     * }
     * ]|
     * 
     * @string is not copied and is used in {@link org.gtk.glib.MatchInfo} internally. If
     * you use any {@link org.gtk.glib.MatchInfo} method (except g_match_info_free()) after
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
     * A {@link org.gtk.glib.MatchInfo} structure, used to get information on the match, is
     * stored in @match_info if not <code>null</code>  Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>false</code> 
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in {@link org.gtk.glib.MatchInfo} internally. If
     * you use any {@link org.gtk.glib.MatchInfo} method (except g_match_info_free()) after
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
     * &<code>#34</code> &<code>#60</code> a&<code>#62</code>  &<code>#60</code> b&<code>#62</code>  &<code>#60</code> c&<code>#62</code> &<code>#34</code>  against the pattern &<code>#34</code> &<code>#60</code> .*&<code>#62</code> &<code>#34</code> 
     * you get &<code>#34</code> &<code>#60</code> a&<code>#62</code>  &<code>#60</code> b&<code>#62</code>  &<code>#60</code> c&<code>#62</code> &<code>#34</code> .
     * 
     * This function uses a different algorithm (called DFA, i.e. deterministic
     * finite automaton), so it can retrieve all the possible matches, all
     * starting at the same point in the string. For instance matching
     * &<code>#34</code> &<code>#60</code> a&<code>#62</code>  &<code>#60</code> b&<code>#62</code>  &<code>#60</code> c&<code>#62</code> &<code>#34</code>  against the pattern &<code>#34</code> &<code>#60</code> .*&<code>#62</code> ;&<code>#34</code> 
     * you would obtain three matches: &<code>#34</code> &<code>#60</code> a&<code>#62</code>  &<code>#60</code> b&<code>#62</code>  &<code>#60</code> c&<code>#62</code> &<code>#34</code> ,
     * &<code>#34</code> &<code>#60</code> a&<code>#62</code>  &<code>#60</code> b&<code>#62</code> &<code>#34</code>  and &<code>#34</code> &<code>#60</code> a&<code>#62</code> &<code>#34</code> .
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
     * string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &<code>#34</code> \\b&<code>#34</code> .
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  is specified in the options, @string must be valid UTF-8.
     * 
     * A {@link org.gtk.glib.MatchInfo} structure, used to get information on the match, is
     * stored in @match_info if not <code>null</code>  Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>false</code> 
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in {@link org.gtk.glib.MatchInfo} internally. If
     * you use any {@link org.gtk.glib.MatchInfo} method (except g_match_info_free()) after
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
     * flexibility in reusing {@link org.gtk.glib.Regex} structures.
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &<code>#34</code> \\b&<code>#34</code> .
     * 
     * Unless {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  is specified in the options, @string must be valid UTF-8.
     * 
     * A {@link org.gtk.glib.MatchInfo} structure, used to get information on the match, is
     * stored in @match_info if not <code>null</code>  Note that if @match_info is
     * not <code>null</code> then it is created even if the function returns <code>false</code> 
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in {@link org.gtk.glib.MatchInfo} internally. If
     * you use any {@link org.gtk.glib.MatchInfo} method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *   GError *error = NULL;
     *   
     *   regex = g_regex_new (&<code>#34</code> [A-Z]}+&<code>#34</code> , 0, 0, NULL);
     *   g_regex_match_full (regex, string, -1, 0, 0, &<code>#38</code> match_info, &<code>#38</code> error);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print (&<code>#34</code> Found: <code>s</code> n&<code>#34</code> , word);
     *       g_free (word);
     *       g_match_info_next (match_info, &<code>#38</code> error);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     *   if (error != NULL)
     *     {
     *       g_printerr (&<code>#34</code> Error while matching: <code>s</code> n&<code>#34</code> , error-&<code>#62</code> message);
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
     * replacement text. Backreferences of the form &<code>#39</code> \\number&<code>#39</code>  or
     * &<code>#39</code> \\g&<code>#60</code> number&<code>#62</code> &<code>#39</code>  in the replacement text are interpolated by the
     * number-th captured subexpression of the match, &<code>#39</code> \\g&<code>#60</code> name&<code>#62</code> &<code>#39</code>  refers
     * to the captured subexpression with the given name. &<code>#39</code> \\0&<code>#39</code>  refers
     * to the complete match, but &<code>#39</code> \\0&<code>#39</code>  followed by a number is the octal
     * representation of a character. To include a literal &<code>#39</code> \\&<code>#39</code>  in the
     * replacement, write &<code>#39</code> \\\\\\\\&<code>#39</code> .
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
     * The @replacement string must be UTF-8 encoded even if {@link org.gtk.glib.RegexCompileFlags<code>#RAW</code>  was
     * passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * you can use g_regex_replace_literal().
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the case of a pattern that
     * begins with any kind of lookbehind assertion, such as &<code>#34</code> \\b&<code>#34</code> .
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
     * string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as &<code>#34</code> \\b&<code>#34</code> .
     * 
     * The following example uses g_regex_replace_eval() to replace multiple
     * strings at once:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
     * g_hash_table_insert (h, &<code>#34</code> 1&<code>#34</code> , &<code>#34</code> ONE&<code>#34</code> );
     * g_hash_table_insert (h, &<code>#34</code> 2&<code>#34</code> , &<code>#34</code> TWO&<code>#34</code> );
     * g_hash_table_insert (h, &<code>#34</code> 3&<code>#34</code> , &<code>#34</code> THREE&<code>#34</code> );
     * g_hash_table_insert (h, &<code>#34</code> 4&<code>#34</code> , &<code>#34</code> FOUR&<code>#34</code> );
     * 
     * reg = g_regex_new (&<code>#34</code> 1|2|3|4&<code>#34</code> , 0, 0, NULL);
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
     * shortened string and setting {@link org.gtk.glib.RegexMatchFlags<code>#NOTBOL</code>  in the
     * case of a pattern that begins with any kind of lookbehind
     * assertion, such as &<code>#34</code> \\b&<code>#34</code> .
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
     * Escapes the nul characters in @string to &<code>#34</code> \\x00&<code>#34</code> .  It can be used
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
     * in @string, for instance &<code>#34</code> a.b*c&<code>#34</code>  becomes &<code>#34</code> a\\.b\\*c&<code>#34</code> . This
     * function is useful to dynamically generate regular expressions.
     * 
     * @string can contain nul characters that are replaced with &<code>#34</code> \\0&<code>#34</code> ,
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
     * once, it&<code>#39</code> s more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     */
    public static boolean matchSimple(java.lang.String pattern, java.lang.String string, int compileOptions, int matchOptions) {
        var RESULT = gtk_h.g_regex_match_simple(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions, matchOptions);
        return (RESULT != 0);
    }
    
}
