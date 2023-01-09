package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by regular expressions functions.
 * @version 2.14
 */
public enum RegexError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Compilation of the regular expression failed.
     */
    COMPILE(0),
    
    /**
     * Optimization of the regular expression failed.
     */
    OPTIMIZE(1),
    
    /**
     * Replacement failed due to an ill-formed replacement
     *     string.
     */
    REPLACE(2),
    
    /**
     * The match process failed.
     */
    MATCH(3),
    
    /**
     * Internal error of the regular expression engine.
     *     Since 2.16
     */
    INTERNAL(4),
    
    /**
     * "\\\\" at end of pattern. Since 2.16
     */
    STRAY_BACKSLASH(101),
    
    /**
     * "\\\\c" at end of pattern. Since 2.16
     */
    MISSING_CONTROL_CHAR(102),
    
    /**
     * Unrecognized character follows "\\\\".
     *     Since 2.16
     */
    UNRECOGNIZED_ESCAPE(103),
    
    /**
     * Numbers out of order in "{}"
     *     quantifier. Since 2.16
     */
    QUANTIFIERS_OUT_OF_ORDER(104),
    
    /**
     * Number too big in "{}" quantifier.
     *     Since 2.16
     */
    QUANTIFIER_TOO_BIG(105),
    
    /**
     * Missing terminating "]" for
     *     character class. Since 2.16
     */
    UNTERMINATED_CHARACTER_CLASS(106),
    
    /**
     * Invalid escape sequence
     *     in character class. Since 2.16
     */
    INVALID_ESCAPE_IN_CHARACTER_CLASS(107),
    
    /**
     * Range out of order in character class.
     *     Since 2.16
     */
    RANGE_OUT_OF_ORDER(108),
    
    /**
     * Nothing to repeat. Since 2.16
     */
    NOTHING_TO_REPEAT(109),
    
    /**
     * Unrecognized character after "(?",
     *     "(?&lt;" or "(?P". Since 2.16
     */
    UNRECOGNIZED_CHARACTER(112),
    
    /**
     * POSIX named classes are
     *     supported only within a class. Since 2.16
     */
    POSIX_NAMED_CLASS_OUTSIDE_CLASS(113),
    
    /**
     * Missing terminating ")" or ")"
     *     without opening "(". Since 2.16
     */
    UNMATCHED_PARENTHESIS(114),
    
    /**
     * Reference to non-existent
     *     subpattern. Since 2.16
     */
    INEXISTENT_SUBPATTERN_REFERENCE(115),
    
    /**
     * Missing terminating ")" after comment.
     *     Since 2.16
     */
    UNTERMINATED_COMMENT(118),
    
    /**
     * Regular expression too large.
     *     Since 2.16
     */
    EXPRESSION_TOO_LARGE(120),
    
    /**
     * Failed to get memory. Since 2.16
     */
    MEMORY_ERROR(121),
    
    /**
     * Lookbehind assertion is not
     *     fixed length. Since 2.16
     */
    VARIABLE_LENGTH_LOOKBEHIND(125),
    
    /**
     * Malformed number or name after "(?(".
     *     Since 2.16
     */
    MALFORMED_CONDITION(126),
    
    /**
     * Conditional group contains
     *     more than two branches. Since 2.16
     */
    TOO_MANY_CONDITIONAL_BRANCHES(127),
    
    /**
     * Assertion expected after "(?(".
     *     Since 2.16
     */
    ASSERTION_EXPECTED(128),
    
    /**
     * Unknown POSIX class name.
     *     Since 2.16
     */
    UNKNOWN_POSIX_CLASS_NAME(130),
    
    /**
     * POSIX collating
     *     elements are not supported. Since 2.16
     */
    POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED(131),
    
    /**
     * Character value in "\\\\x{...}" sequence
     *     is too large. Since 2.16
     */
    HEX_CODE_TOO_LARGE(134),
    
    /**
     * Invalid condition "(?(0)". Since 2.16
     */
    INVALID_CONDITION(135),
    
    /**
     * \\\\C not allowed in
     *     lookbehind assertion. Since 2.16
     */
    SINGLE_BYTE_MATCH_IN_LOOKBEHIND(136),
    
    /**
     * Recursive call could loop indefinitely.
     *     Since 2.16
     */
    INFINITE_LOOP(140),
    
    /**
     * Missing terminator
     *     in subpattern name. Since 2.16
     */
    MISSING_SUBPATTERN_NAME_TERMINATOR(142),
    
    /**
     * Two named subpatterns have
     *     the same name. Since 2.16
     */
    DUPLICATE_SUBPATTERN_NAME(143),
    
    /**
     * Malformed "\\\\P" or "\\\\p" sequence.
     *     Since 2.16
     */
    MALFORMED_PROPERTY(146),
    
    /**
     * Unknown property name after "\\\\P" or
     *     "\\\\p". Since 2.16
     */
    UNKNOWN_PROPERTY(147),
    
    /**
     * Subpattern name is too long
     *     (maximum 32 characters). Since 2.16
     */
    SUBPATTERN_NAME_TOO_LONG(148),
    
    /**
     * Too many named subpatterns (maximum
     *     10,000). Since 2.16
     */
    TOO_MANY_SUBPATTERNS(149),
    
    /**
     * Octal value is greater than "\\\\377".
     *     Since 2.16
     */
    INVALID_OCTAL_VALUE(151),
    
    /**
     * "DEFINE" group contains more
     *     than one branch. Since 2.16
     */
    TOO_MANY_BRANCHES_IN_DEFINE(154),
    
    /**
     * Repeating a "DEFINE" group is not allowed.
     *     This error is never raised. Since: 2.16 Deprecated: 2.34
     */
    DEFINE_REPETION(155),
    
    /**
     * Inconsistent newline options.
     *     Since 2.16
     */
    INCONSISTENT_NEWLINE_OPTIONS(156),
    
    /**
     * "\\\\g" is not followed by a braced,
     *      angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
     */
    MISSING_BACK_REFERENCE(157),
    
    /**
     * relative reference must not be zero. Since: 2.34
     */
    INVALID_RELATIVE_REFERENCE(158),
    
    /**
     * the backtracing
     *     control verb used does not allow an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN(159),
    
    /**
     * unknown backtracing
     *     control verb. Since: 2.34
     */
    UNKNOWN_BACKTRACKING_CONTROL_VERB(160),
    
    /**
     * number is too big in escape sequence. Since: 2.34
     */
    NUMBER_TOO_BIG(161),
    
    /**
     * Missing subpattern name. Since: 2.34
     */
    MISSING_SUBPATTERN_NAME(162),
    
    /**
     * Missing digit. Since 2.34
     */
    MISSING_DIGIT(163),
    
    /**
     * In JavaScript compatibility mode,
     *     "[" is an invalid data character. Since: 2.34
     */
    INVALID_DATA_CHARACTER(164),
    
    /**
     * different names for subpatterns of the
     *     same number are not allowed. Since: 2.34
     */
    EXTRA_SUBPATTERN_NAME(165),
    
    /**
     * the backtracing control
     *     verb requires an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED(166),
    
    /**
     * "\\\\c" must be followed by an ASCII
     *     character. Since: 2.34
     */
    INVALID_CONTROL_CHAR(168),
    
    /**
     * "\\\\k" is not followed by a braced, angle-bracketed, or
     *     quoted name. Since: 2.34
     */
    MISSING_NAME(169),
    
    /**
     * "\\\\N" is not supported in a class. Since: 2.34
     */
    NOT_SUPPORTED_IN_CLASS(171),
    
    /**
     * too many forward references. Since: 2.34
     */
    TOO_MANY_FORWARD_REFERENCES(172),
    
    /**
     * the name is too long in "(*MARK)", "(*PRUNE)",
     *     "(*SKIP)", or "(*THEN)". Since: 2.34
     */
    NAME_TOO_LONG(175),
    
    /**
     * the character value in the \\\\u sequence is
     *     too large. Since: 2.34
     */
    CHARACTER_VALUE_TOO_LARGE(176);
    
    private static final java.lang.String C_TYPE_NAME = "GRegexError";
    
    private final int value;
    
    /**
     * Create a new RegexError for the provided value
     * @param numeric value the enum value
     */
    RegexError(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new RegexError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RegexError of(int value) {
        return switch (value) {
            case 0 -> COMPILE;
            case 1 -> OPTIMIZE;
            case 2 -> REPLACE;
            case 3 -> MATCH;
            case 4 -> INTERNAL;
            case 101 -> STRAY_BACKSLASH;
            case 102 -> MISSING_CONTROL_CHAR;
            case 103 -> UNRECOGNIZED_ESCAPE;
            case 104 -> QUANTIFIERS_OUT_OF_ORDER;
            case 105 -> QUANTIFIER_TOO_BIG;
            case 106 -> UNTERMINATED_CHARACTER_CLASS;
            case 107 -> INVALID_ESCAPE_IN_CHARACTER_CLASS;
            case 108 -> RANGE_OUT_OF_ORDER;
            case 109 -> NOTHING_TO_REPEAT;
            case 112 -> UNRECOGNIZED_CHARACTER;
            case 113 -> POSIX_NAMED_CLASS_OUTSIDE_CLASS;
            case 114 -> UNMATCHED_PARENTHESIS;
            case 115 -> INEXISTENT_SUBPATTERN_REFERENCE;
            case 118 -> UNTERMINATED_COMMENT;
            case 120 -> EXPRESSION_TOO_LARGE;
            case 121 -> MEMORY_ERROR;
            case 125 -> VARIABLE_LENGTH_LOOKBEHIND;
            case 126 -> MALFORMED_CONDITION;
            case 127 -> TOO_MANY_CONDITIONAL_BRANCHES;
            case 128 -> ASSERTION_EXPECTED;
            case 130 -> UNKNOWN_POSIX_CLASS_NAME;
            case 131 -> POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED;
            case 134 -> HEX_CODE_TOO_LARGE;
            case 135 -> INVALID_CONDITION;
            case 136 -> SINGLE_BYTE_MATCH_IN_LOOKBEHIND;
            case 140 -> INFINITE_LOOP;
            case 142 -> MISSING_SUBPATTERN_NAME_TERMINATOR;
            case 143 -> DUPLICATE_SUBPATTERN_NAME;
            case 146 -> MALFORMED_PROPERTY;
            case 147 -> UNKNOWN_PROPERTY;
            case 148 -> SUBPATTERN_NAME_TOO_LONG;
            case 149 -> TOO_MANY_SUBPATTERNS;
            case 151 -> INVALID_OCTAL_VALUE;
            case 154 -> TOO_MANY_BRANCHES_IN_DEFINE;
            case 155 -> DEFINE_REPETION;
            case 156 -> INCONSISTENT_NEWLINE_OPTIONS;
            case 157 -> MISSING_BACK_REFERENCE;
            case 158 -> INVALID_RELATIVE_REFERENCE;
            case 159 -> BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN;
            case 160 -> UNKNOWN_BACKTRACKING_CONTROL_VERB;
            case 161 -> NUMBER_TOO_BIG;
            case 162 -> MISSING_SUBPATTERN_NAME;
            case 163 -> MISSING_DIGIT;
            case 164 -> INVALID_DATA_CHARACTER;
            case 165 -> EXTRA_SUBPATTERN_NAME;
            case 166 -> BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED;
            case 168 -> INVALID_CONTROL_CHAR;
            case 169 -> MISSING_NAME;
            case 171 -> NOT_SUPPORTED_IN_CLASS;
            case 172 -> TOO_MANY_FORWARD_REFERENCES;
            case 175 -> NAME_TOO_LONG;
            case 176 -> CHARACTER_VALUE_TOO_LARGE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
