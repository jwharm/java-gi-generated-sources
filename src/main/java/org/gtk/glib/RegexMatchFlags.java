package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags specifying match-time options.
 * @version 2.14
 */
public class RegexMatchFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GRegexMatchFlags";
    
    /**
     * The pattern is forced to be "anchored", that is,
     *     it is constrained to match only at the first matching point in the
     *     string that is being searched. This effect can also be achieved by
     *     appropriate constructs in the pattern itself such as the "^"
     *     metacharacter.
     */
    public static final RegexMatchFlags ANCHORED = new RegexMatchFlags(16);
    
    /**
     * Specifies that first character of the string is
     *     not the beginning of a line, so the circumflex metacharacter should
     *     not match before it. Setting this without {@link RegexCompileFlags#MULTILINE} (at
     *     compile time) causes circumflex never to match. This option affects
     *     only the behaviour of the circumflex metacharacter, it does not
     *     affect "\\A".
     */
    public static final RegexMatchFlags NOTBOL = new RegexMatchFlags(128);
    
    /**
     * Specifies that the end of the subject string is
     *     not the end of a line, so the dollar metacharacter should not match
     *     it nor (except in multiline mode) a newline immediately before it.
     *     Setting this without {@link RegexCompileFlags#MULTILINE} (at compile time) causes
     *     dollar never to match. This option affects only the behaviour of
     *     the dollar metacharacter, it does not affect "\\Z" or "\\z".
     */
    public static final RegexMatchFlags NOTEOL = new RegexMatchFlags(256);
    
    /**
     * An empty string is not considered to be a valid
     *     match if this option is set. If there are alternatives in the pattern,
     *     they are tried. If all the alternatives match the empty string, the
     *     entire match fails. For example, if the pattern "a?b?" is applied to
     *     a string not beginning with "a" or "b", it matches the empty string
     *     at the start of the string. With this flag set, this match is not
     *     valid, so GRegex searches further into the string for occurrences
     *     of "a" or "b".
     */
    public static final RegexMatchFlags NOTEMPTY = new RegexMatchFlags(1024);
    
    /**
     * Turns on the partial matching feature, for more
     *     documentation on partial matching see g_match_info_is_partial_match().
     */
    public static final RegexMatchFlags PARTIAL = new RegexMatchFlags(32768);
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link Regex}, setting the '\\r' character as line terminator.
     */
    public static final RegexMatchFlags NEWLINE_CR = new RegexMatchFlags(1048576);
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link Regex}, setting the '\\n' character as line terminator.
     */
    public static final RegexMatchFlags NEWLINE_LF = new RegexMatchFlags(2097152);
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link Regex}, setting the '\\r\\n' characters sequence as line terminator.
     */
    public static final RegexMatchFlags NEWLINE_CRLF = new RegexMatchFlags(3145728);
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link Regex}, any Unicode newline sequence
     *     is recognised as a newline. These are '\\r', '\\n' and '\\rn', and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR.
     */
    public static final RegexMatchFlags NEWLINE_ANY = new RegexMatchFlags(4194304);
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link Regex}; any '\\r', '\\n', or '\\r\\n' character sequence
     *     is recognized as a newline. Since: 2.34
     */
    public static final RegexMatchFlags NEWLINE_ANYCRLF = new RegexMatchFlags(5242880);
    
    /**
     * Overrides the newline definition for "\\R" set when
     *     creating a new {@link Regex}; only '\\r', '\\n', or '\\r\\n' character sequences
     *     are recognized as a newline by "\\R". Since: 2.34
     */
    public static final RegexMatchFlags BSR_ANYCRLF = new RegexMatchFlags(8388608);
    
    /**
     * Overrides the newline definition for "\\R" set when
     *     creating a new {@link Regex}; any Unicode newline character or character sequence
     *     are recognized as a newline by "\\R". These are '\\r', '\\n' and '\\rn', and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR. Since: 2.34
     */
    public static final RegexMatchFlags BSR_ANY = new RegexMatchFlags(16777216);
    
    /**
     * An alias for {@link RegexMatchFlags#PARTIAL}. Since: 2.34
     */
    public static final RegexMatchFlags PARTIAL_SOFT = new RegexMatchFlags(32768);
    
    /**
     * Turns on the partial matching feature. In contrast to
     *     to {@link RegexMatchFlags#PARTIAL_SOFT}, this stops matching as soon as a partial match
     *     is found, without continuing to search for a possible complete match. See
     *     g_match_info_is_partial_match() for more information. Since: 2.34
     */
    public static final RegexMatchFlags PARTIAL_HARD = new RegexMatchFlags(134217728);
    
    /**
     * Like {@link RegexMatchFlags#NOTEMPTY}, but only applied to
     *     the start of the matched string. For anchored
     *     patterns this can only happen for pattern containing "\\K". Since: 2.34
     */
    public static final RegexMatchFlags NOTEMPTY_ATSTART = new RegexMatchFlags(268435456);
    
    public RegexMatchFlags(int value) {
        super(value);
    }
}
