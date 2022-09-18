package org.gtk.glib;

/**
 * Flags specifying match-time options.
 */
public class RegexMatchFlags {

    /**
     * The pattern is forced to be &<code>#34</code> anchored&<code>#34</code> , that is,
     *     it is constrained to match only at the first matching point in the
     *     string that is being searched. This effect can also be achieved by
     *     appropriate constructs in the pattern itself such as the &<code>#34</code> ^&<code>#34</code> 
     *     metacharacter.
     */
    public static final int ANCHORED = 16;
    
    /**
     * Specifies that first character of the string is
     *     not the beginning of a line, so the circumflex metacharacter should
     *     not match before it. Setting this without {@link org.gtk.glib.RegexCompileFlags<code>#MULTILINE</code>  (at
     *     compile time) causes circumflex never to match. This option affects
     *     only the behaviour of the circumflex metacharacter, it does not
     *     affect &<code>#34</code> \\A&<code>#34</code> .
     */
    public static final int NOTBOL = 128;
    
    /**
     * Specifies that the end of the subject string is
     *     not the end of a line, so the dollar metacharacter should not match
     *     it nor (except in multiline mode) a newline immediately before it.
     *     Setting this without {@link org.gtk.glib.RegexCompileFlags<code>#MULTILINE</code>  (at compile time) causes
     *     dollar never to match. This option affects only the behaviour of
     *     the dollar metacharacter, it does not affect &<code>#34</code> \\Z&<code>#34</code>  or &<code>#34</code> \\z&<code>#34</code> .
     */
    public static final int NOTEOL = 256;
    
    /**
     * An empty string is not considered to be a valid
     *     match if this option is set. If there are alternatives in the pattern,
     *     they are tried. If all the alternatives match the empty string, the
     *     entire match fails. For example, if the pattern &<code>#34</code> a?b?&<code>#34</code>  is applied to
     *     a string not beginning with &<code>#34</code> a&<code>#34</code>  or &<code>#34</code> b&<code>#34</code> , it matches the empty string
     *     at the start of the string. With this flag set, this match is not
     *     valid, so GRegex searches further into the string for occurrences
     *     of &<code>#34</code> a&<code>#34</code>  or &<code>#34</code> b&<code>#34</code> .
     */
    public static final int NOTEMPTY = 1024;
    
    /**
     * Turns on the partial matching feature, for more
     *     documentation on partial matching see g_match_info_is_partial_match().
     */
    public static final int PARTIAL = 32768;
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link org.gtk.glib.Regex}  setting the &<code>#39</code> \\r&<code>#39</code>  character as line terminator.
     */
    public static final int NEWLINE_CR = 1048576;
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link org.gtk.glib.Regex}  setting the &<code>#39</code> \\n&<code>#39</code>  character as line terminator.
     */
    public static final int NEWLINE_LF = 2097152;
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link org.gtk.glib.Regex}  setting the &<code>#39</code> \\r\\n&<code>#39</code>  characters sequence as line terminator.
     */
    public static final int NEWLINE_CRLF = 3145728;
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link org.gtk.glib.Regex}  any Unicode newline sequence
     *     is recognised as a newline. These are &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code>  and &<code>#39</code> \\rn&<code>#39</code> , and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR.
     */
    public static final int NEWLINE_ANY = 4194304;
    
    /**
     * Overrides the newline definition set when
     *     creating a new {@link org.gtk.glib.Regex}  any &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code> , or &<code>#39</code> \\r\\n&<code>#39</code>  character sequence
     *     is recognized as a newline. Since: 2.34
     */
    public static final int NEWLINE_ANYCRLF = 5242880;
    
    /**
     * Overrides the newline definition for &<code>#34</code> \\R&<code>#34</code>  set when
     *     creating a new {@link org.gtk.glib.Regex}  only &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code> , or &<code>#39</code> \\r\\n&<code>#39</code>  character sequences
     *     are recognized as a newline by &<code>#34</code> \\R&<code>#34</code> . Since: 2.34
     */
    public static final int BSR_ANYCRLF = 8388608;
    
    /**
     * Overrides the newline definition for &<code>#34</code> \\R&<code>#34</code>  set when
     *     creating a new {@link org.gtk.glib.Regex}  any Unicode newline character or character sequence
     *     are recognized as a newline by &<code>#34</code> \\R&<code>#34</code> . These are &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code>  and &<code>#39</code> \\rn&<code>#39</code> , and the
     *     single characters U+000B LINE TABULATION, U+000C FORM FEED (FF),
     *     U+0085 NEXT LINE (NEL), U+2028 LINE SEPARATOR and
     *     U+2029 PARAGRAPH SEPARATOR. Since: 2.34
     */
    public static final int BSR_ANY = 16777216;
    
    /**
     * An alias for {@link org.gtk.glib.RegexMatchFlags<code>#PARTIAL</code>   Since: 2.34
     */
    public static final int PARTIAL_SOFT = 32768;
    
    /**
     * Turns on the partial matching feature. In contrast to
     *     to {@link org.gtk.glib.RegexMatchFlags<code>#PARTIAL_SOFT</code>   this stops matching as soon as a partial match
     *     is found, without continuing to search for a possible complete match. See
     *     g_match_info_is_partial_match() for more information. Since: 2.34
     */
    public static final int PARTIAL_HARD = 134217728;
    
    /**
     * Like {@link org.gtk.glib.RegexMatchFlags<code>#NOTEMPTY</code>   but only applied to
     *     the start of the matched string. For anchored
     *     patterns this can only happen for pattern containing &<code>#34</code> \\K&<code>#34</code> . Since: 2.34
     */
    public static final int NOTEMPTY_ATSTART = 268435456;
    
}
