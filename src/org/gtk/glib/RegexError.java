package org.gtk.glib;

/**
 * Error codes returned by regular expressions functions.
 */
public class RegexError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Compilation of the regular expression failed.
     */
    public static final RegexError COMPILE = new RegexError(0);
    
    /**
     * Optimization of the regular expression failed.
     */
    public static final RegexError OPTIMIZE = new RegexError(1);
    
    /**
     * Replacement failed due to an ill-formed replacement
     *     string.
     */
    public static final RegexError REPLACE = new RegexError(2);
    
    /**
     * The match process failed.
     */
    public static final RegexError MATCH = new RegexError(3);
    
    /**
     * Internal error of the regular expression engine.
     *     Since 2.16
     */
    public static final RegexError INTERNAL = new RegexError(4);
    
    /**
     * "\\\\" at end of pattern. Since 2.16
     */
    public static final RegexError STRAY_BACKSLASH = new RegexError(101);
    
    /**
     * "\\\\c" at end of pattern. Since 2.16
     */
    public static final RegexError MISSING_CONTROL_CHAR = new RegexError(102);
    
    /**
     * Unrecognized character follows "\\\\".
     *     Since 2.16
     */
    public static final RegexError UNRECOGNIZED_ESCAPE = new RegexError(103);
    
    /**
     * Numbers out of order in "{}"
     *     quantifier. Since 2.16
     */
    public static final RegexError QUANTIFIERS_OUT_OF_ORDER = new RegexError(104);
    
    /**
     * Number too big in "{}" quantifier.
     *     Since 2.16
     */
    public static final RegexError QUANTIFIER_TOO_BIG = new RegexError(105);
    
    /**
     * Missing terminating "]" for
     *     character class. Since 2.16
     */
    public static final RegexError UNTERMINATED_CHARACTER_CLASS = new RegexError(106);
    
    /**
     * Invalid escape sequence
     *     in character class. Since 2.16
     */
    public static final RegexError INVALID_ESCAPE_IN_CHARACTER_CLASS = new RegexError(107);
    
    /**
     * Range out of order in character class.
     *     Since 2.16
     */
    public static final RegexError RANGE_OUT_OF_ORDER = new RegexError(108);
    
    /**
     * Nothing to repeat. Since 2.16
     */
    public static final RegexError NOTHING_TO_REPEAT = new RegexError(109);
    
    /**
     * Unrecognized character after "(?",
     *     "(?<" or "(?P". Since 2.16
     */
    public static final RegexError UNRECOGNIZED_CHARACTER = new RegexError(112);
    
    /**
     * POSIX named classes are
     *     supported only within a class. Since 2.16
     */
    public static final RegexError POSIX_NAMED_CLASS_OUTSIDE_CLASS = new RegexError(113);
    
    /**
     * Missing terminating ")" or ")"
     *     without opening "(". Since 2.16
     */
    public static final RegexError UNMATCHED_PARENTHESIS = new RegexError(114);
    
    /**
     * Reference to non-existent
     *     subpattern. Since 2.16
     */
    public static final RegexError INEXISTENT_SUBPATTERN_REFERENCE = new RegexError(115);
    
    /**
     * Missing terminating ")" after comment.
     *     Since 2.16
     */
    public static final RegexError UNTERMINATED_COMMENT = new RegexError(118);
    
    /**
     * Regular expression too large.
     *     Since 2.16
     */
    public static final RegexError EXPRESSION_TOO_LARGE = new RegexError(120);
    
    /**
     * Failed to get memory. Since 2.16
     */
    public static final RegexError MEMORY_ERROR = new RegexError(121);
    
    /**
     * Lookbehind assertion is not
     *     fixed length. Since 2.16
     */
    public static final RegexError VARIABLE_LENGTH_LOOKBEHIND = new RegexError(125);
    
    /**
     * Malformed number or name after "(?(".
     *     Since 2.16
     */
    public static final RegexError MALFORMED_CONDITION = new RegexError(126);
    
    /**
     * Conditional group contains
     *     more than two branches. Since 2.16
     */
    public static final RegexError TOO_MANY_CONDITIONAL_BRANCHES = new RegexError(127);
    
    /**
     * Assertion expected after "(?(".
     *     Since 2.16
     */
    public static final RegexError ASSERTION_EXPECTED = new RegexError(128);
    
    /**
     * Unknown POSIX class name.
     *     Since 2.16
     */
    public static final RegexError UNKNOWN_POSIX_CLASS_NAME = new RegexError(130);
    
    /**
     * POSIX collating
     *     elements are not supported. Since 2.16
     */
    public static final RegexError POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED = new RegexError(131);
    
    /**
     * Character value in "\\\\x{...}" sequence
     *     is too large. Since 2.16
     */
    public static final RegexError HEX_CODE_TOO_LARGE = new RegexError(134);
    
    /**
     * Invalid condition "(?(0)". Since 2.16
     */
    public static final RegexError INVALID_CONDITION = new RegexError(135);
    
    /**
     * \\\\C not allowed in
     *     lookbehind assertion. Since 2.16
     */
    public static final RegexError SINGLE_BYTE_MATCH_IN_LOOKBEHIND = new RegexError(136);
    
    /**
     * Recursive call could loop indefinitely.
     *     Since 2.16
     */
    public static final RegexError INFINITE_LOOP = new RegexError(140);
    
    /**
     * Missing terminator
     *     in subpattern name. Since 2.16
     */
    public static final RegexError MISSING_SUBPATTERN_NAME_TERMINATOR = new RegexError(142);
    
    /**
     * Two named subpatterns have
     *     the same name. Since 2.16
     */
    public static final RegexError DUPLICATE_SUBPATTERN_NAME = new RegexError(143);
    
    /**
     * Malformed "\\\\P" or "\\\\p" sequence.
     *     Since 2.16
     */
    public static final RegexError MALFORMED_PROPERTY = new RegexError(146);
    
    /**
     * Unknown property name after "\\\\P" or
     *     "\\\\p". Since 2.16
     */
    public static final RegexError UNKNOWN_PROPERTY = new RegexError(147);
    
    /**
     * Subpattern name is too long
     *     (maximum 32 characters). Since 2.16
     */
    public static final RegexError SUBPATTERN_NAME_TOO_LONG = new RegexError(148);
    
    /**
     * Too many named subpatterns (maximum
     *     10,000). Since 2.16
     */
    public static final RegexError TOO_MANY_SUBPATTERNS = new RegexError(149);
    
    /**
     * Octal value is greater than "\\\\377".
     *     Since 2.16
     */
    public static final RegexError INVALID_OCTAL_VALUE = new RegexError(151);
    
    /**
     * "DEFINE" group contains more
     *     than one branch. Since 2.16
     */
    public static final RegexError TOO_MANY_BRANCHES_IN_DEFINE = new RegexError(154);
    
    /**
     * Repeating a "DEFINE" group is not allowed.
     *     This error is never raised. Since: 2.16 Deprecated: 2.34
     */
    public static final RegexError DEFINE_REPETION = new RegexError(155);
    
    /**
     * Inconsistent newline options.
     *     Since 2.16
     */
    public static final RegexError INCONSISTENT_NEWLINE_OPTIONS = new RegexError(156);
    
    /**
     * "\\\\g" is not followed by a braced,
     *      angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
     */
    public static final RegexError MISSING_BACK_REFERENCE = new RegexError(157);
    
    /**
     * relative reference must not be zero. Since: 2.34
     */
    public static final RegexError INVALID_RELATIVE_REFERENCE = new RegexError(158);
    
    /**
     * the backtracing
     *     control verb used does not allow an argument. Since: 2.34
     */
    public static final RegexError BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN = new RegexError(159);
    
    /**
     * unknown backtracing
     *     control verb. Since: 2.34
     */
    public static final RegexError UNKNOWN_BACKTRACKING_CONTROL_VERB = new RegexError(160);
    
    /**
     * number is too big in escape sequence. Since: 2.34
     */
    public static final RegexError NUMBER_TOO_BIG = new RegexError(161);
    
    /**
     * Missing subpattern name. Since: 2.34
     */
    public static final RegexError MISSING_SUBPATTERN_NAME = new RegexError(162);
    
    /**
     * Missing digit. Since 2.34
     */
    public static final RegexError MISSING_DIGIT = new RegexError(163);
    
    /**
     * In JavaScript compatibility mode,
     *     "[" is an invalid data character. Since: 2.34
     */
    public static final RegexError INVALID_DATA_CHARACTER = new RegexError(164);
    
    /**
     * different names for subpatterns of the
     *     same number are not allowed. Since: 2.34
     */
    public static final RegexError EXTRA_SUBPATTERN_NAME = new RegexError(165);
    
    /**
     * the backtracing control
     *     verb requires an argument. Since: 2.34
     */
    public static final RegexError BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED = new RegexError(166);
    
    /**
     * "\\\\c" must be followed by an ASCII
     *     character. Since: 2.34
     */
    public static final RegexError INVALID_CONTROL_CHAR = new RegexError(168);
    
    /**
     * "\\\\k" is not followed by a braced, angle-bracketed, or
     *     quoted name. Since: 2.34
     */
    public static final RegexError MISSING_NAME = new RegexError(169);
    
    /**
     * "\\\\N" is not supported in a class. Since: 2.34
     */
    public static final RegexError NOT_SUPPORTED_IN_CLASS = new RegexError(171);
    
    /**
     * too many forward references. Since: 2.34
     */
    public static final RegexError TOO_MANY_FORWARD_REFERENCES = new RegexError(172);
    
    /**
     * the name is too long in "(<strong>MARK)", "(</strong>PRUNE)",
     *     "(<strong>SKIP)", or "(</strong>THEN)". Since: 2.34
     */
    public static final RegexError NAME_TOO_LONG = new RegexError(175);
    
    /**
     * the character value in the \\\\u sequence is
     *     too large. Since: 2.34
     */
    public static final RegexError CHARACTER_VALUE_TOO_LARGE = new RegexError(176);
    
    public RegexError(int value) {
        super(value);
    }
    
}
