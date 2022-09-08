package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The g_regex_*() functions implement regular
 * expression pattern matching using syntax and semantics similar to
 * Perl regular expression.
 * 
 * Some functions accept a @start_position argument, setting it differs
 * from just passing over a shortened string and setting %G_REGEX_MATCH_NOTBOL
 * in the case of a pattern that begins with any kind of lookbehind assertion.
 * For example, consider the pattern "\\Biss\\B" which finds occurrences of "iss"
 * in the middle of words. ("\\B" matches only if the current position in the
 * subject is not a word boundary.) When applied to the string "Mississipi"
 * from the fourth byte, namely "issipi", it does not match, because "\\B" is
 * always false at the start of the subject, which is deemed to be a word
 * boundary. However, if the entire string is passed , but with
 * @start_position set to 4, it finds the second occurrence of "iss" because
 * it is able to look behind the starting point to discover that it is
 * preceded by a letter.
 * 
 * Note that, unless you set the %G_REGEX_RAW flag, all the strings passed
 * to these functions must be encoded in UTF-8. The lengths and the positions
 * inside the strings are in bytes and not in characters, so, for instance,
 * "\\xc3\\xa0" (i.e. "à") is two bytes long but it is treated as a
 * single character. If you set %G_REGEX_RAW the strings can be non-valid
 * UTF-8 strings and a byte is treated as a character, so "\\xc3\\xa0" is two
 * bytes and two characters long.
 * 
 * When matching a pattern, "\\n" matches only against a "\\n" character in
 * the string, and "\\r" matches only a "\\r" character. To match any newline
 * sequence use "\\R". This particular group matches either the two-character
 * sequence CR + LF ("\\r\\n"), or one of the single characters LF (linefeed,
 * U+000A, "\\n"), VT vertical tab, U+000B, "\\v"), FF (formfeed, U+000C, "\\f"),
 * CR (carriage return, U+000D, "\\r"), NEL (next line, U+0085), LS (line
 * separator, U+2028), or PS (paragraph separator, U+2029).
 * 
 * The behaviour of the dot, circumflex, and dollar metacharacters are
 * affected by newline characters, the default is to recognize any newline
 * character (the same characters recognized by "\\R"). This can be changed
 * with %G_REGEX_NEWLINE_CR, %G_REGEX_NEWLINE_LF and %G_REGEX_NEWLINE_CRLF
 * compile options, and with %G_REGEX_MATCH_NEWLINE_ANY,
 * %G_REGEX_MATCH_NEWLINE_CR, %G_REGEX_MATCH_NEWLINE_LF and
 * %G_REGEX_MATCH_NEWLINE_CRLF match options. These settings are also
 * relevant when compiling a pattern if %G_REGEX_EXTENDED is set, and an
 * unescaped "#" outside a character class is encountered. This indicates
 * a comment that lasts until after the next newline.
 * 
 * When setting the %G_REGEX_JAVASCRIPT_COMPAT flag, pattern syntax and pattern
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
 * 
 * Creating and manipulating the same #GRegex structure from different
 * threads is not a problem as #GRegex does not modify its internal
 * state between creation and destruction, on the other hand #GMatchInfo
 * is not threadsafe.
 * 
 * The regular expressions low-level functionalities are obtained through
 * the excellent
 * [PCRE](http://www.pcre.org/)
 * library written by Philip Hazel.
 */
public class Regex extends io.github.jwharm.javagi.interop.ResourceBase {

    public Regex(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
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
     * 
     * Depending on the version of PCRE that is used, this may or may not
     * include flags set by option expressions such as `(?i)` found at the
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
     * Unless %G_REGEX_RAW is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match,
     * is stored in @match_info if not %NULL. Note that if @match_info
     * is not %NULL then it is created even if the function returns %FALSE,
     * i.e. you must free it regardless if regular expression actually matched.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |[<!-- language="C" -->
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
     * ]|
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean match(java.lang.String string, int matchOptions, MatchInfo[] matchInfo) {
        var RESULT = gtk_h.g_regex_match(handle(), Interop.allocateNativeString(string).handle(), matchOptions, Interop.allocateNativeArray(matchInfo));
        return (RESULT != 0);
    }
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the string is retrieved. This function uses
     * a different algorithm so it can retrieve all the possible matches.
     * For more documentation see g_regex_match_all_full().
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not %NULL. Note that if @match_info is
     * not %NULL then it is created even if the function returns %FALSE,
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean matchAll(java.lang.String string, int matchOptions, MatchInfo[] matchInfo) {
        var RESULT = gtk_h.g_regex_match_all(handle(), Interop.allocateNativeString(string).handle(), matchOptions, Interop.allocateNativeArray(matchInfo));
        return (RESULT != 0);
    }
    
    /**
     * Using the standard algorithm for regular expression matching only
     * the longest match in the @string is retrieved, it is not possible
     * to obtain all the available matches. For instance matching
     * "<a> <b> <c>" against the pattern "<.*>"
     * you get "<a> <b> <c>".
     * 
     * This function uses a different algorithm (called DFA, i.e. deterministic
     * finite automaton), so it can retrieve all the possible matches, all
     * starting at the same point in the string. For instance matching
     * "<a> <b> <c>" against the pattern "<.*>;"
     * you would obtain three matches: "<a> <b> <c>",
     * "<a> <b>" and "<a>".
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
     * string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     * 
     * Unless %G_REGEX_RAW is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not %NULL. Note that if @match_info is
     * not %NULL then it is created even if the function returns %FALSE,
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     */
    public boolean matchAllFull(java.lang.String[] string, long stringLen, int startPosition, int matchOptions, MatchInfo[] matchInfo) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_regex_match_all_full(handle(), Interop.allocateNativeArray(string), stringLen, startPosition, matchOptions, Interop.allocateNativeArray(matchInfo), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
     * string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern
     * that begins with any kind of lookbehind assertion, such as "\\b".
     * 
     * Unless %G_REGEX_RAW is specified in the options, @string must be valid UTF-8.
     * 
     * A #GMatchInfo structure, used to get information on the match, is
     * stored in @match_info if not %NULL. Note that if @match_info is
     * not %NULL then it is created even if the function returns %FALSE,
     * i.e. you must free it regardless if regular expression actually
     * matched.
     * 
     * @string is not copied and is used in #GMatchInfo internally. If
     * you use any #GMatchInfo method (except g_match_info_free()) after
     * freeing or modifying @string then the behaviour is undefined.
     * 
     * To retrieve all the non-overlapping matches of the pattern in
     * string you can use g_match_info_next().
     * 
     * |[<!-- language="C" -->
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
     * ]|
     */
    public boolean matchFull(java.lang.String[] string, long stringLen, int startPosition, int matchOptions, MatchInfo[] matchInfo) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_regex_match_full(handle(), Interop.allocateNativeArray(string), stringLen, startPosition, matchOptions, Interop.allocateNativeArray(matchInfo), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
     * replacement text. Backreferences of the form '\\number' or
     * '\\g<number>' in the replacement text are interpolated by the
     * number-th captured subexpression of the match, '\\g<name>' refers
     * to the captured subexpression with the given name. '\\0' refers
     * to the complete match, but '\\0' followed by a number is the octal
     * representation of a character. To include a literal '\\' in the
     * replacement, write '\\\\\\\\'.
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
     * The @replacement string must be UTF-8 encoded even if %G_REGEX_RAW was
     * passed to g_regex_new(). If you want to use not UTF-8 encoded strings
     * you can use g_regex_replace_literal().
     * 
     * Setting @start_position differs from just passing over a shortened
     * string and setting %G_REGEX_MATCH_NOTBOL in the case of a pattern that
     * begins with any kind of lookbehind assertion, such as "\\b".
     */
    public java.lang.String replace(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, int matchOptions) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_regex_replace(handle(), Interop.allocateNativeArray(string), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Replaces all occurrences of the pattern in @regex with the
     * replacement text. @replacement is replaced literally, to
     * include backreferences use g_regex_replace().
     * 
     * Setting @start_position differs from just passing over a
     * shortened string and setting %G_REGEX_MATCH_NOTBOL in the
     * case of a pattern that begins with any kind of lookbehind
     * assertion, such as "\\b".
     */
    public java.lang.String replaceLiteral(java.lang.String[] string, long stringLen, int startPosition, java.lang.String replacement, int matchOptions) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = gtk_h.g_regex_replace_literal(handle(), Interop.allocateNativeArray(string), stringLen, startPosition, Interop.allocateNativeString(replacement).handle(), matchOptions, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
    
}
