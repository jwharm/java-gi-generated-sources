package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The g_regex_*() functions implement regular
 * expression pattern matching using syntax and semantics similar to
 * Perl regular expression.
 * <p>
 * Some functions accept a {@code start_position} argument, setting it differs
 * from just passing over a shortened string and setting {@link RegexMatchFlags#NOTBOL}
 * in the case of a pattern that begins with any kind of lookbehind assertion.
 * For example, consider the pattern "\\Biss\\B" which finds occurrences of "iss"
 * in the middle of words. ("\\B" matches only if the current position in the
 * subject is not a word boundary.) When applied to the string "Mississipi"
 * from the fourth byte, namely "issipi", it does not match, because "\\B" is
 * always false at the start of the subject, which is deemed to be a word
 * boundary. However, if the entire string is passed , but with
 * {@code start_position} set to 4, it finds the second occurrence of "iss" because
 * it is able to look behind the starting point to discover that it is
 * preceded by a letter.
 * <p>
 * Note that, unless you set the {@link RegexCompileFlags#RAW} flag, all the strings passed
 * to these functions must be encoded in UTF-8. The lengths and the positions
 * inside the strings are in bytes and not in characters, so, for instance,
 * "\\xc3\\xa0" (i.e. "à") is two bytes long but it is treated as a
 * single character. If you set {@link RegexCompileFlags#RAW} the strings can be non-valid
 * UTF-8 strings and a byte is treated as a character, so "\\xc3\\xa0" is two
 * bytes and two characters long.
 * <p>
 * When matching a pattern, "\\n" matches only against a "\\n" character in
 * the string, and "\\r" matches only a "\\r" character. To match any newline
 * sequence use "\\R". This particular group matches either the two-character
 * sequence CR + LF ("\\r\\n"), or one of the single characters LF (linefeed,
 * U+000A, "\\n"), VT vertical tab, U+000B, "\\v"), FF (formfeed, U+000C, "\\f"),
 * CR (carriage return, U+000D, "\\r"), NEL (next line, U+0085), LS (line
 * separator, U+2028), or PS (paragraph separator, U+2029).
 * <p>
 * The behaviour of the dot, circumflex, and dollar metacharacters are
 * affected by newline characters, the default is to recognize any newline
 * character (the same characters recognized by "\\R"). This can be changed
 * with {@link RegexCompileFlags#NEWLINE_CR}, {@link RegexCompileFlags#NEWLINE_LF} and {@link RegexCompileFlags#NEWLINE_CRLF}
 * compile options, and with {@link RegexMatchFlags#NEWLINE_ANY},
 * {@link RegexMatchFlags#NEWLINE_CR}, {@link RegexMatchFlags#NEWLINE_LF} and
 * {@link RegexMatchFlags#NEWLINE_CRLF} match options. These settings are also
 * relevant when compiling a pattern if {@link RegexCompileFlags#EXTENDED} is set, and an
 * unescaped "#" outside a character class is encountered. This indicates
 * a comment that lasts until after the next newline.
 * <p>
 * When setting the {@link RegexCompileFlags#JAVASCRIPT_COMPAT} flag, pattern syntax and pattern
 * matching is changed to be compatible with the way that regular expressions
 * work in JavaScript. More precisely, a lonely ']' character in the pattern
 * is a syntax error; the '\\x' escape only allows 0 to 2 hexadecimal digits, and
 * you must use the '\\u' escape sequence with 4 hex digits to specify a unicode
 * codepoint instead of '\\x' or 'x{....}'. If '\\x' or '\\u' are not followed by
 * the specified number of hex digits, they match 'x' and 'u' literally; also
 * '\\U' always matches 'U' instead of being an error in the pattern. Finally,
 * pattern matching is modified so that back references to an unset subpattern
 * group produces a match with the empty string instead of an error. See
 * pcreapi(3) for more information.
 * <p>
 * Creating and manipulating the same {@link Regex} structure from different
 * threads is not a problem as {@link Regex} does not modify its internal
 * state between creation and destruction, on the other hand {@link MatchInfo}
 * is not threadsafe.
 * <p>
 * The regular expressions low-level functionalities are obtained through
 * the excellent
 * <a href="http://www.pcre.org/">PCRE</a>
 * library written by Philip Hazel.
 */
public class Regex extends io.github.jwharm.javagi.ResourceBase {

    public Regex(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_regex_new = Interop.downcallHandle(
        "g_regex_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String pattern, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_regex_new.invokeExact(Interop.allocateNativeString(pattern).handle(), compileOptions.getValue(), matchOptions.getValue(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Compiles the regular expression to an internal form, and does
     * the initial setup of the {@link Regex} structure.
     */
    public Regex(java.lang.String pattern, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) throws GErrorException {
        super(constructNew(pattern, compileOptions, matchOptions));
    }
    
    static final MethodHandle g_regex_get_capture_count = Interop.downcallHandle(
        "g_regex_get_capture_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of capturing subpatterns in the pattern.
     */
    public int getCaptureCount() {
        try {
            var RESULT = (int) g_regex_get_capture_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_compile_flags = Interop.downcallHandle(
        "g_regex_get_compile_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the compile options that {@code regex} was created with.
     * <p>
     * Depending on the version of PCRE that is used, this may or may not
     * include flags set by option expressions such as {@code (?i)} found at the
     * top-level within the compiled pattern.
     */
    public RegexCompileFlags getCompileFlags() {
        try {
            var RESULT = (int) g_regex_get_compile_flags.invokeExact(handle());
            return new RegexCompileFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_has_cr_or_lf = Interop.downcallHandle(
        "g_regex_get_has_cr_or_lf",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the pattern contains explicit CR or LF references.
     */
    public boolean getHasCrOrLf() {
        try {
            var RESULT = (int) g_regex_get_has_cr_or_lf.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_match_flags = Interop.downcallHandle(
        "g_regex_get_match_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the match options that {@code regex} was created with.
     */
    public RegexMatchFlags getMatchFlags() {
        try {
            var RESULT = (int) g_regex_get_match_flags.invokeExact(handle());
            return new RegexMatchFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_max_backref = Interop.downcallHandle(
        "g_regex_get_max_backref",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of the highest back reference
     * in the pattern, or 0 if the pattern does not contain
     * back references.
     */
    public int getMaxBackref() {
        try {
            var RESULT = (int) g_regex_get_max_backref.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_max_lookbehind = Interop.downcallHandle(
        "g_regex_get_max_lookbehind",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of characters in the longest lookbehind assertion in the
     * pattern. This information is useful when doing multi-segment matching using
     * the partial matching facilities.
     */
    public int getMaxLookbehind() {
        try {
            var RESULT = (int) g_regex_get_max_lookbehind.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_pattern = Interop.downcallHandle(
        "g_regex_get_pattern",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the pattern string associated with {@code regex}, i.e. a copy of
     * the string passed to g_regex_new().
     */
    public java.lang.String getPattern() {
        try {
            var RESULT = (MemoryAddress) g_regex_get_pattern.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_get_string_number = Interop.downcallHandle(
        "g_regex_get_string_number",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of the subexpression named {@code name}.
     */
    public int getStringNumber(java.lang.String name) {
        try {
            var RESULT = (int) g_regex_get_string_number.invokeExact(handle(), Interop.allocateNativeString(name).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match = Interop.downcallHandle(
        "g_regex_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scans for a match in {@code string} for the pattern in {@code regex}.
     * The {@code match_options} are combined with the match options specified
     * when the {@code regex} structure was created, letting you have more
     * flexibility in reusing {@link Regex} structures.
     * <p>
     * Unless {@link RegexCompileFlags#RAW} is specified in the options, {@code string} must be valid UTF-8.
     * <p>
     * A {@link MatchInfo} structure, used to get information on the match,
     * is stored in {@code match_info} if not {@code null}. Note that if {@code match_info}
     * is not {@code null} then it is created even if the function returns {@code false},
     * i.e. you must free it regardless if regular expression actually matched.
     * <p>
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * <p>
     * <pre>{@code <!-- language="C" -->
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *  
     *   regex = g_regex_new ("[A-Z]+", 0, 0, NULL);
     *   g_regex_match (regex, string, 0, &match_info);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print ("Found: %s\\n", word);
     *       g_free (word);
     *       g_match_info_next (match_info, NULL);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     * }
     * }</pre>
     * <p>
     * {@code string} is not copied and is used in {@link MatchInfo} internally. If
     * you use any {@link MatchInfo} method (except g_match_info_free()) after
     * freeing or modifying {@code string} then the behaviour is undefined.
     */
    public boolean match(java.lang.String string, RegexMatchFlags matchOptions, PointerProxy<MatchInfo> matchInfo) {
        try {
            var RESULT = (int) g_regex_match.invokeExact(handle(), Interop.allocateNativeString(string).handle(), matchOptions.getValue(), matchInfo.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match_all = Interop.downcallHandle(
        "g_regex_match_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the string is retrieved. This function uses
     * a different algorithm so it can retrieve all the possible matches.
     * For more documentation see g_regex_match_all_full().
     * <p>
     * A {@link MatchInfo} structure, used to get information on the match, is
     * stored in {@code match_info} if not {@code null}. Note that if {@code match_info} is
     * not {@code null} then it is created even if the function returns {@code false},
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * <p>
     * {@code string} is not copied and is used in {@link MatchInfo} internally. If
     * you use any {@link MatchInfo} method (except g_match_info_free()) after
     * freeing or modifying {@code string} then the behaviour is undefined.
     */
    public boolean matchAll(java.lang.String string, RegexMatchFlags matchOptions, PointerProxy<MatchInfo> matchInfo) {
        try {
            var RESULT = (int) g_regex_match_all.invokeExact(handle(), Interop.allocateNativeString(string).handle(), matchOptions.getValue(), matchInfo.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match_all_full = Interop.downcallHandle(
        "g_regex_match_all_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the {@code string} is retrieved, it is not possible
     * to obtain all the available matches. For instance matching
     * "&lt;a> <b> <c>" against the pattern "<.*&gt;"
     * you get "&lt;a> <b> <c&gt;".
     * <p>
     * This function uses a different algorithm (called DFA, i.e. deterministic
     * finite automaton), so it can retrieve all the possible matches, all
     * starting at the same point in the string. For instance matching
     * "&lt;a> <b> <c>" against the pattern "<.*&gt;;"
     * you would obtain three matches: "&lt;a> <b> <c&gt;",
     * "&lt;a> <b>" and "<a&gt;".
     * <p>
     * The number of matched strings is retrieved using
     * g_match_info_get_match_count(). To obtain the matched strings and
     * their position you can use, respectively, g_match_info_fetch() and
     * g_match_info_fetch_pos(). Note that the strings are returned in
     * reverse order of length; that is, the longest matching string is
     * given first.
     * <p>
     * Note that the DFA algorithm is slower than the standard one and it
     * is not able to capture substrings, so backreferences do not work.
     * <p>
     * Setting {@code start_position} differs from just passing over a shortened
     * string and setting {@link RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     * <p>
     * Unless {@link RegexCompileFlags#RAW} is specified in the options, {@code string} must be valid UTF-8.
     * <p>
     * A {@link MatchInfo} structure, used to get information on the match, is
     * stored in {@code match_info} if not {@code null}. Note that if {@code match_info} is
     * not {@code null} then it is created even if the function returns {@code false},
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * <p>
     * {@code string} is not copied and is used in {@link MatchInfo} internally. If
     * you use any {@link MatchInfo} method (except g_match_info_free()) after
     * freeing or modifying {@code string} then the behaviour is undefined.
     */
    public boolean matchAllFull(java.lang.String[] string, long stringLen, int startPosition, RegexMatchFlags matchOptions, PointerProxy<MatchInfo> matchInfo) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_regex_match_all_full.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions.getValue(), matchInfo.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match_full = Interop.downcallHandle(
        "g_regex_match_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Scans for a match in {@code string} for the pattern in {@code regex}.
     * The {@code match_options} are combined with the match options specified
     * when the {@code regex} structure was created, letting you have more
     * flexibility in reusing {@link Regex} structures.
     * <p>
     * Setting {@code start_position} differs from just passing over a shortened
     * string and setting {@link RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     * <p>
     * Unless {@link RegexCompileFlags#RAW} is specified in the options, {@code string} must be valid UTF-8.
     * <p>
     * A {@link MatchInfo} structure, used to get information on the match, is
     * stored in {@code match_info} if not {@code null}. Note that if {@code match_info} is
     * not {@code null} then it is created even if the function returns {@code false},
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * <p>
     * {@code string} is not copied and is used in {@link MatchInfo} internally. If
     * you use any {@link MatchInfo} method (except g_match_info_free()) after
     * freeing or modifying {@code string} then the behaviour is undefined.
     * <p>
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * <p>
     * <pre>{@code <!-- language="C" -->
     * static void
     * print_uppercase_words (const gchar *string)
     * {
     *   // Print all uppercase-only words.
     *   GRegex *regex;
     *   GMatchInfo *match_info;
     *   GError *error = NULL;
     *   
     *   regex = g_regex_new ("[A-Z]+", 0, 0, NULL);
     *   g_regex_match_full (regex, string, -1, 0, 0, &match_info, &error);
     *   while (g_match_info_matches (match_info))
     *     {
     *       gchar *word = g_match_info_fetch (match_info, 0);
     *       g_print ("Found: %s\\n", word);
     *       g_free (word);
     *       g_match_info_next (match_info, &error);
     *     }
     *   g_match_info_free (match_info);
     *   g_regex_unref (regex);
     *   if (error != NULL)
     *     {
     *       g_printerr ("Error while matching: %s\\n", error->message);
     *       g_error_free (error);
     *     }
     * }
     * }</pre>
     */
    public boolean matchFull(java.lang.String[] string, long stringLen, int startPosition, RegexMatchFlags matchOptions, PointerProxy<MatchInfo> matchInfo) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_regex_match_full.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions.getValue(), matchInfo.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_ref = Interop.downcallHandle(
        "g_regex_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases reference count of {@code regex} by 1.
     */
    public Regex ref() {
        try {
            var RESULT = (MemoryAddress) g_regex_ref.invokeExact(handle());
            return new Regex(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_replace = Interop.downcallHandle(
        "g_regex_replace",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Replaces all occurrences of the pattern in {@code regex} with the
     * replacement text. Backreferences of the form '\\number' or
     * '\\g&lt;number&gt;' in the replacement text are interpolated by the
     * number-th captured subexpression of the match, '\\g&lt;name&gt;' refers
     * to the captured subexpression with the given name. '\\0' refers
     * to the complete match, but '\\0' followed by a number is the octal
     * representation of a character. To include a literal '\\' in the
     * replacement, write '\\\\\\\\'.
     * <p>
     * There are also escapes that changes the case of the following text:
     * <p>
     * <ul>
     * <li>\\l: Convert to lower case the next character
     * <li>\\u: Convert to upper case the next character
     * <li>\\L: Convert to lower case till \\E
     * <li>\\U: Convert to upper case till \\E
     * <li>\\E: End case modification
     * </ul>
     * <p>
     * If you do not need to use backreferences use g_regex_replace_literal().
     * <p>
     * The {@code replacement} string must be UTF-8 encoded even if {@link RegexCompileFlags#RAW} was
     * passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * you can use g_regex_replace_literal().
     * <p>
     * Setting {@code start_position} differs from just passing over a shortened
     * string and setting {@link RegexMatchFlags#NOTBOL} in the case of a pattern that
     * begins with any kind of lookbehind assertion, such as "\\b".
     */
    public java.lang.String replace(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, RegexMatchFlags matchOptions) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_regex_replace.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_replace_eval = Interop.downcallHandle(
        "g_regex_replace_eval",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Replaces occurrences of the pattern in regex with the output of
     * {@code eval} for that occurrence.
     * <p>
     * Setting {@code start_position} differs from just passing over a shortened
     * string and setting {@link RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     * <p>
     * The following example uses g_regex_replace_eval() to replace multiple
     * strings at once:
     * <pre>{@code <!-- language="C" -->
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
     * g_hash_table_insert (h, "1", "ONE");
     * g_hash_table_insert (h, "2", "TWO");
     * g_hash_table_insert (h, "3", "THREE");
     * g_hash_table_insert (h, "4", "FOUR");
     * 
     * reg = g_regex_new ("1|2|3|4", 0, 0, NULL);
     * res = g_regex_replace_eval (reg, text, -1, 0, 0, eval_cb, h, NULL);
     * g_hash_table_destroy (h);
     * 
     * ...
     * }</pre>
     */
    public java.lang.String replaceEval(java.lang.String[] string, long stringLen, int startPosition, RegexMatchFlags matchOptions, RegexEvalCallback eval) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_regex_replace_eval.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbRegexEvalCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(eval.hashCode(), eval)), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_replace_literal = Interop.downcallHandle(
        "g_regex_replace_literal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Replaces all occurrences of the pattern in {@code regex} with the
     * replacement text. {@code replacement} is replaced literally, to
     * include backreferences use g_regex_replace().
     * <p>
     * Setting {@code start_position} differs from just passing over a
     * shortened string and setting {@link RegexMatchFlags#NOTBOL} in the
     * case of a pattern that begins with any kind of lookbehind
     * assertion, such as "\\b".
     */
    public java.lang.String replaceLiteral(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, RegexMatchFlags matchOptions) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_regex_replace_literal.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_split = Interop.downcallHandle(
        "g_regex_split",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Breaks the string on the pattern, and returns an array of the tokens.
     * If the pattern contains capturing parentheses, then the text for each
     * of the substrings will also be returned. If the pattern does not match
     * anywhere in the string, then the whole string is returned as the first
     * token.
     * <p>
     * As a special case, the result of splitting the empty string "" is an
     * empty vector, not a vector containing a single string. The reason for
     * this special case is that being able to represent an empty vector is
     * typically more useful than consistent handling of empty elements. If
     * you do need to represent empty elements, you'll need to check for the
     * empty string before calling this function.
     * <p>
     * A pattern that can match empty strings splits {@code string} into separate
     * characters wherever it matches the empty string between characters.
     * For example splitting "ab c" using as a separator "\\s*", you will get
     * "a", "b" and "c".
     */
    public PointerString split(java.lang.String string, RegexMatchFlags matchOptions) {
        try {
            var RESULT = (MemoryAddress) g_regex_split.invokeExact(handle(), Interop.allocateNativeString(string).handle(), matchOptions.getValue());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_split_full = Interop.downcallHandle(
        "g_regex_split_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Breaks the string on the pattern, and returns an array of the tokens.
     * If the pattern contains capturing parentheses, then the text for each
     * of the substrings will also be returned. If the pattern does not match
     * anywhere in the string, then the whole string is returned as the first
     * token.
     * <p>
     * As a special case, the result of splitting the empty string "" is an
     * empty vector, not a vector containing a single string. The reason for
     * this special case is that being able to represent an empty vector is
     * typically more useful than consistent handling of empty elements. If
     * you do need to represent empty elements, you'll need to check for the
     * empty string before calling this function.
     * <p>
     * A pattern that can match empty strings splits {@code string} into separate
     * characters wherever it matches the empty string between characters.
     * For example splitting "ab c" using as a separator "\\s*", you will get
     * "a", "b" and "c".
     * <p>
     * Setting {@code start_position} differs from just passing over a shortened
     * string and setting {@link RegexMatchFlags#NOTBOL} in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     */
    public PointerString splitFull(java.lang.String[] string, long stringLen, int startPosition, RegexMatchFlags matchOptions, int maxTokens) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_regex_split_full.invokeExact(handle(), Interop.allocateNativeArray(string).handle(), stringLen, startPosition, matchOptions.getValue(), maxTokens, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_unref = Interop.downcallHandle(
        "g_regex_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases reference count of {@code regex} by 1. When reference count drops
     * to zero, it frees all the memory associated with the regex structure.
     */
    public void unref() {
        try {
            g_regex_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_check_replacement = Interop.downcallHandle(
        "g_regex_check_replacement",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks whether {@code replacement} is a valid replacement string
     * (see g_regex_replace()), i.e. that all escape sequences in
     * it are valid.
     * <p>
     * If {@code has_references} is not {@code null} then {@code replacement} is checked
     * for pattern references. For instance, replacement text 'foo\\n'
     * does not contain references and may be evaluated without information
     * about actual match, but '\\0\\1' (whole match followed by first
     * subpattern) requires valid {@link MatchInfo} object.
     */
    public static boolean checkReplacement(java.lang.String replacement, PointerBoolean hasReferences) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_regex_check_replacement.invokeExact(Interop.allocateNativeString(replacement).handle(), hasReferences.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_error_quark = Interop.downcallHandle(
        "g_regex_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark errorQuark() {
        try {
            var RESULT = (int) g_regex_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_escape_nul = Interop.downcallHandle(
        "g_regex_escape_nul",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Escapes the nul characters in {@code string} to "\\x00".  It can be used
     * to compile a regex with embedded nul characters.
     * <p>
     * For completeness, {@code length} can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to {@code string}.
     */
    public static java.lang.String escapeNul(java.lang.String string, int length) {
        try {
            var RESULT = (MemoryAddress) g_regex_escape_nul.invokeExact(Interop.allocateNativeString(string).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_escape_string = Interop.downcallHandle(
        "g_regex_escape_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Escapes the special characters used for regular expressions
     * in {@code string}, for instance "a.b<strong>c" becomes "a\\.b\\</strong>c". This
     * function is useful to dynamically generate regular expressions.
     * <p>
     * {@code string} can contain nul characters that are replaced with "\\0",
     * in this case remember to specify the correct length of {@code string}
     * in {@code length}.
     */
    public static java.lang.String escapeString(java.lang.String[] string, int length) {
        try {
            var RESULT = (MemoryAddress) g_regex_escape_string.invokeExact(Interop.allocateNativeArray(string).handle(), length);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_match_simple = Interop.downcallHandle(
        "g_regex_match_simple",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Scans for a match in {@code string} for {@code pattern}.
     * <p>
     * This function is equivalent to g_regex_match() but it does not
     * require to compile the pattern with g_regex_new(), avoiding some
     * lines of code when you need just to do a match without extracting
     * substrings, capture counts, and so on.
     * <p>
     * If this function is to be called on the same {@code pattern} more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_match().
     */
    public static boolean matchSimple(java.lang.String pattern, java.lang.String string, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) {
        try {
            var RESULT = (int) g_regex_match_simple.invokeExact(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions.getValue(), matchOptions.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_regex_split_simple = Interop.downcallHandle(
        "g_regex_split_simple",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Breaks the string on the pattern, and returns an array of
     * the tokens. If the pattern contains capturing parentheses,
     * then the text for each of the substrings will also be returned.
     * If the pattern does not match anywhere in the string, then the
     * whole string is returned as the first token.
     * <p>
     * This function is equivalent to g_regex_split() but it does
     * not require to compile the pattern with g_regex_new(), avoiding
     * some lines of code when you need just to do a split without
     * extracting substrings, capture counts, and so on.
     * <p>
     * If this function is to be called on the same {@code pattern} more than
     * once, it's more efficient to compile the pattern once with
     * g_regex_new() and then use g_regex_split().
     * <p>
     * As a special case, the result of splitting the empty string ""
     * is an empty vector, not a vector containing a single string.
     * The reason for this special case is that being able to represent
     * an empty vector is typically more useful than consistent handling
     * of empty elements. If you do need to represent empty elements,
     * you'll need to check for the empty string before calling this
     * function.
     * <p>
     * A pattern that can match empty strings splits {@code string} into
     * separate characters wherever it matches the empty string between
     * characters. For example splitting "ab c" using as a separator
     * "\\s*", you will get "a", "b" and "c".
     */
    public static PointerString splitSimple(java.lang.String pattern, java.lang.String string, RegexCompileFlags compileOptions, RegexMatchFlags matchOptions) {
        try {
            var RESULT = (MemoryAddress) g_regex_split_simple.invokeExact(Interop.allocateNativeString(pattern).handle(), Interop.allocateNativeString(string).handle(), compileOptions.getValue(), matchOptions.getValue());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
