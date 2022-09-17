package org.gtk.glib;

/**
 * Flags specifying match-time options.
 */
public class RegexMatchFlags {

    /**
     * The pattern is forced to be &#34;anchored&#34;, that is,
     *     it is constrained to match only at the first matching point in the
     *     string that is being searched. This effect can also be achieved by
     *     appropriate constructs in the pattern itself such as the &#34;^&#34;
     *     metacharacter.
     */
    public static final int ANCHORED = 16;
    
    /**
     * Specifies that first character of the string is
     *     not the beginning of a line, so the circumflex metacharacter should
     *     not match before it. Setting this without {@link org.gtk.glib.RegexCompileFlags#MULTILINE} (at
     *     compile time) causes circumflex never to match. This option affects
     *     only the behaviour of the circumflex metacharacter, it does not
     *     affect &#34;\\A&#34;.
     */
    public static final int NOTBOL = 128;
    
    /**
     * Specifies that the end of the subject string is
     *     not the end of a line, so the dollar metacharacter should not match
     *     it nor (except in multiline mode) a newline immediately before it.
     *     Setting this without {@link org.gtk.glib.RegexCompileFlags#MULTILINE} (at compile time) causes
     *     dollar never to match. This option affects only the behaviour of
     *     the dollar metacharacter, it does not affect &#34;\\Z&#34; or &#34;\\z&#34;.
     */
    public static final int NOTEOL = 256;
    
    /**
     * An empty string is not considered to be a valid
     *     match if this option is set. If there are alternatives in the pattern,
     *     they are tried. If all the alternatives match the empty string, the
     *     entire match fails. For example, if the pattern &#34;a?b?&#34; is applied to
     *     a string not beginning with &#34;a&#34; or &#34;b&#34;, it matches the empty string
     *     at the start of the string. With this flag set, this match is not
     *     valid, so GRegex searches further into the string for occurrences
     *     of &#34;a&#34; or &#34;b&#34;.
     */
    public static final int NOTEMPTY = 1024;
    
    /**
     * Turns on the partial matching feature, for more
     *     documentation on partial matching see g_match_info_is_partial_match().
     */
    public static final int PARTIAL = 32768;
    
    /**
     * Overrides the newline definition set when
     *     creating a new #GRegex, setting the &#39;\\r&#39; character as line terminator.
     */
    public static final int NEWLINE_CR = 1048576;
    
    /**
     * Overrides the newline definition set when
     *     creating a new #GRegex, setting the &#39;\\n&#39; character as line terminator.
     */
    public static final int NEWLINE_LF = 2097152;
    
    /**
     * Overrides the newline definition set when
     *     creating a new #GRegex, setting the &#39;\\r\\n&#39; characters sequence as line terminator.
     */
    public static final int NEWLINE_CRLF = 3145728;
    
    /**
     * Overrides the newline definition set when
     *     creating a new #GRegex, any Unicode newline sequence
     *     is recognised as a newline. These are &#39;\\r&#39;, &#39;\\n&#39; and &#39;\\rn&#39;, and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR.
     */
    public static final int NEWLINE_ANY = 4194304;
    
    /**
     * Overrides the newline definition set when
     *     creating a new #GRegex; any &#39;\\r&#39;, &#39;\\n&#39;, or &#39;\\r\\n&#39; character sequence
     *     is recognized as a newline. Since: 2.34
     */
    public static final int NEWLINE_ANYCRLF = 5242880;
    
    /**
     * Overrides the newline definition for &#34;\\R&#34; set when
     *     creating a new #GRegex; only &#39;\\r&#39;, &#39;\\n&#39;, or &#39;\\r\\n&#39; character sequences
     *     are recognized as a newline by &#34;\\R&#34;. Since: 2.34
     */
    public static final int BSR_ANYCRLF = 8388608;
    
    /**
     * Overrides the newline definition for &#34;\\R&#34; set when
     *     creating a new #GRegex; any Unicode newline character or character sequence
     *     are recognized as a newline by &#34;\\R&#34;. These are &#39;\\r&#39;, &#39;\\n&#39; and &#39;\\rn&#39;, and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR. Since: 2.34
     */
    public static final int BSR_ANY = 16777216;
    
    /**
     * An alias for <code>G_REGEX_MATCH_PARTIAL.</code> Since: 2.34
     */
    public static final int PARTIAL_SOFT = 32768;
    
    /**
     * Turns on the partial matching feature. In contrast to
     *     to <code>G_REGEX_MATCH_PARTIAL_SOFT,</code> this stops matching as soon as a partial match
     *     is found, without continuing to search for a possible complete match. See
     *     g_match_info_is_partial_match() for more information. Since: 2.34
     */
    public static final int PARTIAL_HARD = 134217728;
    
    /**
     * Like <code>G_REGEX_MATCH_NOTEMPTY,</code> but only applied to
     *     the start of the matched string. For anchored
     *     patterns this can only happen for pattern containing &#34;\\K&#34;. Since: 2.34
     */
    public static final int NOTEMPTY_ATSTART = 268435456;
    
}
