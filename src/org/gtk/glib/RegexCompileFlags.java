package org.gtk.glib;

/**
 * Flags specifying compile-time options.
 */
public class RegexCompileFlags {

    /**
     * Letters in the pattern match both upper- and
     *     lowercase letters. This option can be changed within a pattern
     *     by a &<code>#34</code> (?i)&<code>#34</code>  option setting.
     */
    public static final int CASELESS = 1;
    
    /**
     * By default, GRegex treats the strings as consisting
     *     of a single line of characters (even if it actually contains
     *     newlines). The &<code>#34</code> start of line&<code>#34</code>  metacharacter (&<code>#34</code> ^&<code>#34</code> ) matches only
     *     at the start of the string, while the &<code>#34</code> end of line&<code>#34</code>  metacharacter
     *     (&<code>#34</code> $&<code>#34</code> ) matches only at the end of the string, or before a terminating
     *     newline (unless {@link org.gtk.glib.RegexCompileFlags<code>#DOLLAR_ENDONLY</code>  is set). When
     *     {@link org.gtk.glib.RegexCompileFlags<code>#MULTILINE</code>  is set, the &<code>#34</code> start of line&<code>#34</code>  and &<code>#34</code> end of line&<code>#34</code> 
     *     constructs match immediately following or immediately before any
     *     newline in the string, respectively, as well as at the very start
     *     and end. This can be changed within a pattern by a &<code>#34</code> (?m)&<code>#34</code>  option
     *     setting.
     */
    public static final int MULTILINE = 2;
    
    /**
     * A dot metacharacter (&<code>#34</code> .&<code>#34</code> ) in the pattern matches all
     *     characters, including newlines. Without it, newlines are excluded.
     *     This option can be changed within a pattern by a (&<code>#34</code> ?s&<code>#34</code> ) option setting.
     */
    public static final int DOTALL = 4;
    
    /**
     * Whitespace data characters in the pattern are
     *     totally ignored except when escaped or inside a character class.
     *     Whitespace does not include the VT character (code 11). In addition,
     *     characters between an unescaped &<code>#34</code> <code>#</code> <code>#34</code>  outside a character class and
     *     the next newline character, inclusive, are also ignored. This can
     *     be changed within a pattern by a &<code>#34</code> (?x)&<code>#34</code>  option setting.
     */
    public static final int EXTENDED = 8;
    
    /**
     * The pattern is forced to be &<code>#34</code> anchored&<code>#34</code> , that is,
     *     it is constrained to match only at the first matching point in the
     *     string that is being searched. This effect can also be achieved by
     *     appropriate constructs in the pattern itself such as the &<code>#34</code> ^&<code>#34</code> 
     *     metacharacter.
     */
    public static final int ANCHORED = 16;
    
    /**
     * A dollar metacharacter (&<code>#34</code> $&<code>#34</code> ) in the pattern
     *     matches only at the end of the string. Without this option, a
     *     dollar also matches immediately before the final character if
     *     it is a newline (but not before any other newlines). This option
     *     is ignored if {@link org.gtk.glib.RegexCompileFlags<code>#MULTILINE</code>  is set.
     */
    public static final int DOLLAR_ENDONLY = 32;
    
    /**
     * Inverts the &<code>#34</code> greediness&<code>#34</code>  of the quantifiers so that
     *     they are not greedy by default, but become greedy if followed by &<code>#34</code> ?&<code>#34</code> .
     *     It can also be set by a &<code>#34</code> (?U)&<code>#34</code>  option setting within the pattern.
     */
    public static final int UNGREEDY = 512;
    
    /**
     * Usually strings must be valid UTF-8 strings, using this
     *     flag they are considered as a raw sequence of bytes.
     */
    public static final int RAW = 2048;
    
    /**
     * Disables the use of numbered capturing
     *     parentheses in the pattern. Any opening parenthesis that is not
     *     followed by &<code>#34</code> ?&<code>#34</code>  behaves as if it were followed by &<code>#34</code> ?:&<code>#34</code>  but named
     *     parentheses can still be used for capturing (and they acquire numbers
     *     in the usual way).
     */
    public static final int NO_AUTO_CAPTURE = 4096;
    
    /**
     * Optimize the regular expression. If the pattern will
     *     be used many times, then it may be worth the effort to optimize it
     *     to improve the speed of matches.
     */
    public static final int OPTIMIZE = 8192;
    
    /**
     * Limits an unanchored pattern to match before (or at) the
     *     first newline. Since: 2.34
     */
    public static final int FIRSTLINE = 262144;
    
    /**
     * Names used to identify capturing subpatterns need not
     *     be unique. This can be helpful for certain types of pattern when it
     *     is known that only one instance of the named subpattern can ever be
     *     matched.
     */
    public static final int DUPNAMES = 524288;
    
    /**
     * Usually any newline character or character sequence is
     *     recognized. If this option is set, the only recognized newline character
     *     is &<code>#39</code> \\r&<code>#39</code> .
     */
    public static final int NEWLINE_CR = 1048576;
    
    /**
     * Usually any newline character or character sequence is
     *     recognized. If this option is set, the only recognized newline character
     *     is &<code>#39</code> \\n&<code>#39</code> .
     */
    public static final int NEWLINE_LF = 2097152;
    
    /**
     * Usually any newline character or character sequence is
     *     recognized. If this option is set, the only recognized newline character
     *     sequence is &<code>#39</code> \\r\\n&<code>#39</code> .
     */
    public static final int NEWLINE_CRLF = 3145728;
    
    /**
     * Usually any newline character or character sequence
     *     is recognized. If this option is set, the only recognized newline character
     *     sequences are &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code> , and &<code>#39</code> \\r\\n&<code>#39</code> . Since: 2.34
     */
    public static final int NEWLINE_ANYCRLF = 5242880;
    
    /**
     * Usually any newline character or character sequence
     *     is recognised. If this option is set, then &<code>#34</code> \\R&<code>#34</code>  only recognizes the newline
     *    characters &<code>#39</code> \\r&<code>#39</code> , &<code>#39</code> \\n&<code>#39</code>  and &<code>#39</code> \\r\\n&<code>#39</code> . Since: 2.34
     */
    public static final int BSR_ANYCRLF = 8388608;
    
    /**
     * Changes behaviour so that it is compatible with
     *     JavaScript rather than PCRE. Since: 2.34
     */
    public static final int JAVASCRIPT_COMPAT = 33554432;
    
}
