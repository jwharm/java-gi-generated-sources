package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * unescaped "{@code "} outside a character class is encountered. This indicates
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
 * @version 2.14
 */
public class Regex extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GRegex";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Regex allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Regex newInstance = new Regex(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public Regex(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String pattern, @NotNull org.gtk.glib.RegexCompileFlags compileOptions, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) throws GErrorException {
        java.util.Objects.requireNonNull(pattern, "Parameter 'pattern' must not be null");
        java.util.Objects.requireNonNull(compileOptions, "Parameter 'compileOptions' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_regex_new.invokeExact(
                    Interop.allocateNativeString(pattern),
                    compileOptions.getValue(),
                    matchOptions.getValue(), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Compiles the regular expression to an internal form, and does
     * the initial setup of the {@link Regex} structure.
     * @param pattern the regular expression
     * @param compileOptions compile options for the regular expression, or 0
     * @param matchOptions match options for the regular expression, or 0
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public Regex(@NotNull java.lang.String pattern, @NotNull org.gtk.glib.RegexCompileFlags compileOptions, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) throws GErrorException {
        super(constructNew(pattern, compileOptions, matchOptions));
    }
    
    /**
     * Returns the number of capturing subpatterns in the pattern.
     * @return the number of capturing subpatterns
     */
    public int getCaptureCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_capture_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the compile options that {@code regex} was created with.
     * <p>
     * Depending on the version of PCRE that is used, this may or may not
     * include flags set by option expressions such as {@code (?i)} found at the
     * top-level within the compiled pattern.
     * @return flags from {@link RegexCompileFlags}
     */
    public @NotNull org.gtk.glib.RegexCompileFlags getCompileFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_compile_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.RegexCompileFlags(RESULT);
    }
    
    /**
     * Checks whether the pattern contains explicit CR or LF references.
     * @return {@code true} if the pattern contains explicit CR or LF references
     */
    public boolean getHasCrOrLf() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_has_cr_or_lf.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the match options that {@code regex} was created with.
     * @return flags from {@link RegexMatchFlags}
     */
    public @NotNull org.gtk.glib.RegexMatchFlags getMatchFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_match_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.RegexMatchFlags(RESULT);
    }
    
    /**
     * Returns the number of the highest back reference
     * in the pattern, or 0 if the pattern does not contain
     * back references.
     * @return the number of the highest back reference
     */
    public int getMaxBackref() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_max_backref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the number of characters in the longest lookbehind assertion in the
     * pattern. This information is useful when doing multi-segment matching using
     * the partial matching facilities.
     * @return the number of characters in the longest lookbehind assertion.
     */
    public int getMaxLookbehind() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_max_lookbehind.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the pattern string associated with {@code regex}, i.e. a copy of
     * the string passed to g_regex_new().
     * @return the pattern of {@code regex}
     */
    public @NotNull java.lang.String getPattern() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_get_pattern.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the number of the subexpression named {@code name}.
     * @param name name of the subexpression
     * @return The number of the subexpression or -1 if {@code name}
     *   does not exists
     */
    public int getStringNumber(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_get_string_number.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param string the string to scan for matches
     * @param matchOptions match options
     * @param matchInfo pointer to location where to store
     *     the {@link MatchInfo}, or {@code null} if you do not need it
     * @return {@code true} is the string matched, {@code false} otherwise
     */
    public boolean match(@NotNull java.lang.String string, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, @NotNull PointerProxy<org.gtk.glib.MatchInfo> matchInfo) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        java.util.Objects.requireNonNull(matchInfo, "Parameter 'matchInfo' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string),
                    matchOptions.getValue(),
                    matchInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param string the string to scan for matches
     * @param matchOptions match options
     * @param matchInfo pointer to location where to store
     *     the {@link MatchInfo}, or {@code null} if you do not need it
     * @return {@code true} is the string matched, {@code false} otherwise
     */
    public boolean matchAll(@NotNull java.lang.String string, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, @NotNull PointerProxy<org.gtk.glib.MatchInfo> matchInfo) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        java.util.Objects.requireNonNull(matchInfo, "Parameter 'matchInfo' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match_all.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string),
                    matchOptions.getValue(),
                    matchInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the {@code string} is retrieved, it is not possible
     * to obtain all the available matches. For instance matching
     * "&lt;a&gt; &lt;b&gt; &lt;c&gt;" against the pattern "&lt;.*&gt;"
     * you get "&lt;a&gt; &lt;b&gt; &lt;c&gt;".
     * <p>
     * This function uses a different algorithm (called DFA, i.e. deterministic
     * finite automaton), so it can retrieve all the possible matches, all
     * starting at the same point in the string. For instance matching
     * "&lt;a&gt; &lt;b&gt; &lt;c&gt;" against the pattern "&lt;.*&gt;;"
     * you would obtain three matches: "&lt;a&gt; &lt;b&gt; &lt;c&gt;",
     * "&lt;a&gt; &lt;b&gt;" and "&lt;a&gt;".
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
     * @param string the string to scan for matches
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param matchOptions match options
     * @param matchInfo pointer to location where to store
     *     the {@link MatchInfo}, or {@code null} if you do not need it
     * @return {@code true} is the string matched, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean matchAllFull(java.lang.String[] string, long stringLen, int startPosition, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, @NotNull PointerProxy<org.gtk.glib.MatchInfo> matchInfo) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        java.util.Objects.requireNonNull(matchInfo, "Parameter 'matchInfo' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match_all_full.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    matchOptions.getValue(),
                    matchInfo.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
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
     * @param string the string to scan for matches
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param matchOptions match options
     * @param matchInfo pointer to location where to store
     *     the {@link MatchInfo}, or {@code null} if you do not need it
     * @return {@code true} is the string matched, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean matchFull(java.lang.String[] string, long stringLen, int startPosition, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, @NotNull PointerProxy<org.gtk.glib.MatchInfo> matchInfo) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        java.util.Objects.requireNonNull(matchInfo, "Parameter 'matchInfo' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match_full.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    matchOptions.getValue(),
                    matchInfo.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Increases reference count of {@code regex} by 1.
     * @return {@code regex}
     */
    public @NotNull org.gtk.glib.Regex ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Regex(Refcounted.get(RESULT, true));
    }
    
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
     * @param string the string to perform matches against
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param matchOptions options for the match
     * @return a newly allocated string containing the replacements
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull java.lang.String replace(java.lang.String[] string, long stringLen, int startPosition, @NotNull java.lang.String replacement, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(replacement, "Parameter 'replacement' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_replace.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    Interop.allocateNativeString(replacement),
                    matchOptions.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param string string to perform matches against
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param matchOptions options for the match
     * @param eval a function to call for each match
     * @return a newly allocated string containing the replacements
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull java.lang.String replaceEval(java.lang.String[] string, long stringLen, int startPosition, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, @NotNull org.gtk.glib.RegexEvalCallback eval) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        java.util.Objects.requireNonNull(eval, "Parameter 'eval' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_replace_eval.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    matchOptions.getValue(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.Callbacks.class, "cbRegexEvalCallback",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(eval)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Replaces all occurrences of the pattern in {@code regex} with the
     * replacement text. {@code replacement} is replaced literally, to
     * include backreferences use g_regex_replace().
     * <p>
     * Setting {@code start_position} differs from just passing over a
     * shortened string and setting {@link RegexMatchFlags#NOTBOL} in the
     * case of a pattern that begins with any kind of lookbehind
     * assertion, such as "\\b".
     * @param string the string to perform matches against
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param replacement text to replace each match with
     * @param matchOptions options for the match
     * @return a newly allocated string containing the replacements
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull java.lang.String replaceLiteral(java.lang.String[] string, long stringLen, int startPosition, @NotNull java.lang.String replacement, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(replacement, "Parameter 'replacement' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_replace_literal.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    Interop.allocateNativeString(replacement),
                    matchOptions.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param string the string to split with the pattern
     * @param matchOptions match time option flags
     * @return a {@code null}-terminated gchar ** array. Free
     * it using g_strfreev()
     */
    public @NotNull PointerString split(@NotNull java.lang.String string, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_split.invokeExact(
                    handle(),
                    Interop.allocateNativeString(string),
                    matchOptions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
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
     * @param string the string to split with the pattern
     * @param stringLen the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @param startPosition starting index of the string to match, in bytes
     * @param matchOptions match time option flags
     * @param maxTokens the maximum number of tokens to split {@code string} into.
     *   If this is less than 1, the string is split completely
     * @return a {@code null}-terminated gchar ** array. Free
     * it using g_strfreev()
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull PointerString splitFull(java.lang.String[] string, long stringLen, int startPosition, @NotNull org.gtk.glib.RegexMatchFlags matchOptions, int maxTokens) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_split_full.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(string, false),
                    stringLen,
                    startPosition,
                    matchOptions.getValue(),
                    maxTokens, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Decreases reference count of {@code regex} by 1. When reference count drops
     * to zero, it frees all the memory associated with the regex structure.
     */
    public void unref() {
        try {
            DowncallHandles.g_regex_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param replacement the replacement string
     * @param hasReferences location to store information about
     *   references in {@code replacement} or {@code null}
     * @return whether {@code replacement} is a valid replacement string
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static boolean checkReplacement(@NotNull java.lang.String replacement, Out<Boolean> hasReferences) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(replacement, "Parameter 'replacement' must not be null");
        java.util.Objects.requireNonNull(hasReferences, "Parameter 'hasReferences' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment hasReferencesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_check_replacement.invokeExact(
                    Interop.allocateNativeString(replacement),
                    (Addressable) hasReferencesPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        hasReferences.set(hasReferencesPOINTER.get(ValueLayout.JAVA_INT, 0) != 0);
        return RESULT != 0;
    }
    
    public static @NotNull org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Escapes the nul characters in {@code string} to "\\x00".  It can be used
     * to compile a regex with embedded nul characters.
     * <p>
     * For completeness, {@code length} can be -1 for a nul-terminated string.
     * In this case the output string will be of course equal to {@code string}.
     * @param string the string to escape
     * @param length the length of {@code string}
     * @return a newly-allocated escaped string
     */
    public static @NotNull java.lang.String escapeNul(@NotNull java.lang.String string, int length) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_escape_nul.invokeExact(
                    Interop.allocateNativeString(string),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Escapes the special characters used for regular expressions
     * in {@code string}, for instance "a.b*c" becomes "a\\.b\\*c". This
     * function is useful to dynamically generate regular expressions.
     * <p>
     * {@code string} can contain nul characters that are replaced with "\\0",
     * in this case remember to specify the correct length of {@code string}
     * in {@code length}.
     * @param string the string to escape
     * @param length the length of {@code string}, in bytes, or -1 if {@code string} is nul-terminated
     * @return a newly-allocated escaped string
     */
    public static @NotNull java.lang.String escapeString(java.lang.String[] string, int length) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_escape_string.invokeExact(
                    Interop.allocateNativeArray(string, false),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
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
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compileOptions compile options for the regular expression, or 0
     * @param matchOptions match options, or 0
     * @return {@code true} if the string matched, {@code false} otherwise
     */
    public static boolean matchSimple(@NotNull java.lang.String pattern, @NotNull java.lang.String string, @NotNull org.gtk.glib.RegexCompileFlags compileOptions, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) {
        java.util.Objects.requireNonNull(pattern, "Parameter 'pattern' must not be null");
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(compileOptions, "Parameter 'compileOptions' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_regex_match_simple.invokeExact(
                    Interop.allocateNativeString(pattern),
                    Interop.allocateNativeString(string),
                    compileOptions.getValue(),
                    matchOptions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param pattern the regular expression
     * @param string the string to scan for matches
     * @param compileOptions compile options for the regular expression, or 0
     * @param matchOptions match options, or 0
     * @return a {@code null}-terminated array of strings. Free
     * it using g_strfreev()
     */
    public static @NotNull PointerString splitSimple(@NotNull java.lang.String pattern, @NotNull java.lang.String string, @NotNull org.gtk.glib.RegexCompileFlags compileOptions, @NotNull org.gtk.glib.RegexMatchFlags matchOptions) {
        java.util.Objects.requireNonNull(pattern, "Parameter 'pattern' must not be null");
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        java.util.Objects.requireNonNull(compileOptions, "Parameter 'compileOptions' must not be null");
        java.util.Objects.requireNonNull(matchOptions, "Parameter 'matchOptions' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_regex_split_simple.invokeExact(
                    Interop.allocateNativeString(pattern),
                    Interop.allocateNativeString(string),
                    compileOptions.getValue(),
                    matchOptions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_regex_new = Interop.downcallHandle(
            "g_regex_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_capture_count = Interop.downcallHandle(
            "g_regex_get_capture_count",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_compile_flags = Interop.downcallHandle(
            "g_regex_get_compile_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_has_cr_or_lf = Interop.downcallHandle(
            "g_regex_get_has_cr_or_lf",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_match_flags = Interop.downcallHandle(
            "g_regex_get_match_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_max_backref = Interop.downcallHandle(
            "g_regex_get_max_backref",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_max_lookbehind = Interop.downcallHandle(
            "g_regex_get_max_lookbehind",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_pattern = Interop.downcallHandle(
            "g_regex_get_pattern",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_get_string_number = Interop.downcallHandle(
            "g_regex_get_string_number",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_match = Interop.downcallHandle(
            "g_regex_match",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_match_all = Interop.downcallHandle(
            "g_regex_match_all",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_match_all_full = Interop.downcallHandle(
            "g_regex_match_all_full",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_match_full = Interop.downcallHandle(
            "g_regex_match_full",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_ref = Interop.downcallHandle(
            "g_regex_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_replace = Interop.downcallHandle(
            "g_regex_replace",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_replace_eval = Interop.downcallHandle(
            "g_regex_replace_eval",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_replace_literal = Interop.downcallHandle(
            "g_regex_replace_literal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_split = Interop.downcallHandle(
            "g_regex_split",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_regex_split_full = Interop.downcallHandle(
            "g_regex_split_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_unref = Interop.downcallHandle(
            "g_regex_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_check_replacement = Interop.downcallHandle(
            "g_regex_check_replacement",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_regex_error_quark = Interop.downcallHandle(
            "g_regex_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_regex_escape_nul = Interop.downcallHandle(
            "g_regex_escape_nul",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_regex_escape_string = Interop.downcallHandle(
            "g_regex_escape_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_regex_match_simple = Interop.downcallHandle(
            "g_regex_match_simple",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_regex_split_simple = Interop.downcallHandle(
            "g_regex_split_simple",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
}
