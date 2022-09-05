package org.gtk.glib;

/**
 * Error codes returned by regular expressions functions.
 */
public enum RegexError {

    /**
     * Compilation of the regular expression failed.
     */
    COMPILE,
    
    /**
     * Optimization of the regular expression failed.
     */
    OPTIMIZE,
    
    /**
     * Replacement failed due to an ill-formed replacement
     *     string.
     */
    REPLACE,
    
    /**
     * The match process failed.
     */
    MATCH,
    
    /**
     * Internal error of the regular expression engine.
     *     Since 2.16
     */
    INTERNAL,
    
    /**
     * "\\\\" at end of pattern. Since 2.16
     */
    STRAY_BACKSLASH,
    
    /**
     * "\\\\c" at end of pattern. Since 2.16
     */
    MISSING_CONTROL_CHAR,
    
    /**
     * Unrecognized character follows "\\\\".
     *     Since 2.16
     */
    UNRECOGNIZED_ESCAPE,
    
    /**
     * Numbers out of order in "{}"
     *     quantifier. Since 2.16
     */
    QUANTIFIERS_OUT_OF_ORDER,
    
    /**
     * Number too big in "{}" quantifier.
     *     Since 2.16
     */
    QUANTIFIER_TOO_BIG,
    
    /**
     * Missing terminating "]" for
     *     character class. Since 2.16
     */
    UNTERMINATED_CHARACTER_CLASS,
    
    /**
     * Invalid escape sequence
     *     in character class. Since 2.16
     */
    INVALID_ESCAPE_IN_CHARACTER_CLASS,
    
    /**
     * Range out of order in character class.
     *     Since 2.16
     */
    RANGE_OUT_OF_ORDER,
    
    /**
     * Nothing to repeat. Since 2.16
     */
    NOTHING_TO_REPEAT,
    
    /**
     * Unrecognized character after "(?",
     *     "(?<" or "(?P". Since 2.16
     */
    UNRECOGNIZED_CHARACTER,
    
    /**
     * POSIX named classes are
     *     supported only within a class. Since 2.16
     */
    POSIX_NAMED_CLASS_OUTSIDE_CLASS,
    
    /**
     * Missing terminating ")" or ")"
     *     without opening "(". Since 2.16
     */
    UNMATCHED_PARENTHESIS,
    
    /**
     * Reference to non-existent
     *     subpattern. Since 2.16
     */
    INEXISTENT_SUBPATTERN_REFERENCE,
    
    /**
     * Missing terminating ")" after comment.
     *     Since 2.16
     */
    UNTERMINATED_COMMENT,
    
    /**
     * Regular expression too large.
     *     Since 2.16
     */
    EXPRESSION_TOO_LARGE,
    
    /**
     * Failed to get memory. Since 2.16
     */
    MEMORY_ERROR,
    
    /**
     * Lookbehind assertion is not
     *     fixed length. Since 2.16
     */
    VARIABLE_LENGTH_LOOKBEHIND,
    
    /**
     * Malformed number or name after "(?(".
     *     Since 2.16
     */
    MALFORMED_CONDITION,
    
    /**
     * Conditional group contains
     *     more than two branches. Since 2.16
     */
    TOO_MANY_CONDITIONAL_BRANCHES,
    
    /**
     * Assertion expected after "(?(".
     *     Since 2.16
     */
    ASSERTION_EXPECTED,
    
    /**
     * Unknown POSIX class name.
     *     Since 2.16
     */
    UNKNOWN_POSIX_CLASS_NAME,
    
    /**
     * POSIX collating
     *     elements are not supported. Since 2.16
     */
    POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED,
    
    /**
     * Character value in "\\\\x{...}" sequence
     *     is too large. Since 2.16
     */
    HEX_CODE_TOO_LARGE,
    
    /**
     * Invalid condition "(?(0)". Since 2.16
     */
    INVALID_CONDITION,
    
    /**
     * \\\\C not allowed in
     *     lookbehind assertion. Since 2.16
     */
    SINGLE_BYTE_MATCH_IN_LOOKBEHIND,
    
    /**
     * Recursive call could loop indefinitely.
     *     Since 2.16
     */
    INFINITE_LOOP,
    
    /**
     * Missing terminator
     *     in subpattern name. Since 2.16
     */
    MISSING_SUBPATTERN_NAME_TERMINATOR,
    
    /**
     * Two named subpatterns have
     *     the same name. Since 2.16
     */
    DUPLICATE_SUBPATTERN_NAME,
    
    /**
     * Malformed "\\\\P" or "\\\\p" sequence.
     *     Since 2.16
     */
    MALFORMED_PROPERTY,
    
    /**
     * Unknown property name after "\\\\P" or
     *     "\\\\p". Since 2.16
     */
    UNKNOWN_PROPERTY,
    
    /**
     * Subpattern name is too long
     *     (maximum 32 characters). Since 2.16
     */
    SUBPATTERN_NAME_TOO_LONG,
    
    /**
     * Too many named subpatterns (maximum
     *     10,000). Since 2.16
     */
    TOO_MANY_SUBPATTERNS,
    
    /**
     * Octal value is greater than "\\\\377".
     *     Since 2.16
     */
    INVALID_OCTAL_VALUE,
    
    /**
     * "DEFINE" group contains more
     *     than one branch. Since 2.16
     */
    TOO_MANY_BRANCHES_IN_DEFINE,
    
    /**
     * Repeating a "DEFINE" group is not allowed.
     *     This error is never raised. Since: 2.16 Deprecated: 2.34
     */
    DEFINE_REPETION,
    
    /**
     * Inconsistent newline options.
     *     Since 2.16
     */
    INCONSISTENT_NEWLINE_OPTIONS,
    
    /**
     * "\\\\g" is not followed by a braced,
     *      angle-bracketed, or quoted name or number, or by a plain number. Since: 2.16
     */
    MISSING_BACK_REFERENCE,
    
    /**
     * relative reference must not be zero. Since: 2.34
     */
    INVALID_RELATIVE_REFERENCE,
    
    /**
     * the backtracing
     *     control verb used does not allow an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN,
    
    /**
     * unknown backtracing
     *     control verb. Since: 2.34
     */
    UNKNOWN_BACKTRACKING_CONTROL_VERB,
    
    /**
     * number is too big in escape sequence. Since: 2.34
     */
    NUMBER_TOO_BIG,
    
    /**
     * Missing subpattern name. Since: 2.34
     */
    MISSING_SUBPATTERN_NAME,
    
    /**
     * Missing digit. Since 2.34
     */
    MISSING_DIGIT,
    
    /**
     * In JavaScript compatibility mode,
     *     "[" is an invalid data character. Since: 2.34
     */
    INVALID_DATA_CHARACTER,
    
    /**
     * different names for subpatterns of the
     *     same number are not allowed. Since: 2.34
     */
    EXTRA_SUBPATTERN_NAME,
    
    /**
     * the backtracing control
     *     verb requires an argument. Since: 2.34
     */
    BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED,
    
    /**
     * "\\\\c" must be followed by an ASCII
     *     character. Since: 2.34
     */
    INVALID_CONTROL_CHAR,
    
    /**
     * "\\\\k" is not followed by a braced, angle-bracketed, or
     *     quoted name. Since: 2.34
     */
    MISSING_NAME,
    
    /**
     * "\\\\N" is not supported in a class. Since: 2.34
     */
    NOT_SUPPORTED_IN_CLASS,
    
    /**
     * too many forward references. Since: 2.34
     */
    TOO_MANY_FORWARD_REFERENCES,
    
    /**
     * the name is too long in "(*MARK)", "(*PRUNE)",
     *     "(*SKIP)", or "(*THEN)". Since: 2.34
     */
    NAME_TOO_LONG,
    
    /**
     * the character value in the \\\\u sequence is
     *     too large. Since: 2.34
     */
    CHARACTER_VALUE_TOO_LARGE;
    
    public static RegexError fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case COMPILE -> 0;
            case OPTIMIZE -> 1;
            case REPLACE -> 2;
            case MATCH -> 3;
            case INTERNAL -> 4;
            case STRAY_BACKSLASH -> 101;
            case MISSING_CONTROL_CHAR -> 102;
            case UNRECOGNIZED_ESCAPE -> 103;
            case QUANTIFIERS_OUT_OF_ORDER -> 104;
            case QUANTIFIER_TOO_BIG -> 105;
            case UNTERMINATED_CHARACTER_CLASS -> 106;
            case INVALID_ESCAPE_IN_CHARACTER_CLASS -> 107;
            case RANGE_OUT_OF_ORDER -> 108;
            case NOTHING_TO_REPEAT -> 109;
            case UNRECOGNIZED_CHARACTER -> 112;
            case POSIX_NAMED_CLASS_OUTSIDE_CLASS -> 113;
            case UNMATCHED_PARENTHESIS -> 114;
            case INEXISTENT_SUBPATTERN_REFERENCE -> 115;
            case UNTERMINATED_COMMENT -> 118;
            case EXPRESSION_TOO_LARGE -> 120;
            case MEMORY_ERROR -> 121;
            case VARIABLE_LENGTH_LOOKBEHIND -> 125;
            case MALFORMED_CONDITION -> 126;
            case TOO_MANY_CONDITIONAL_BRANCHES -> 127;
            case ASSERTION_EXPECTED -> 128;
            case UNKNOWN_POSIX_CLASS_NAME -> 130;
            case POSIX_COLLATING_ELEMENTS_NOT_SUPPORTED -> 131;
            case HEX_CODE_TOO_LARGE -> 134;
            case INVALID_CONDITION -> 135;
            case SINGLE_BYTE_MATCH_IN_LOOKBEHIND -> 136;
            case INFINITE_LOOP -> 140;
            case MISSING_SUBPATTERN_NAME_TERMINATOR -> 142;
            case DUPLICATE_SUBPATTERN_NAME -> 143;
            case MALFORMED_PROPERTY -> 146;
            case UNKNOWN_PROPERTY -> 147;
            case SUBPATTERN_NAME_TOO_LONG -> 148;
            case TOO_MANY_SUBPATTERNS -> 149;
            case INVALID_OCTAL_VALUE -> 151;
            case TOO_MANY_BRANCHES_IN_DEFINE -> 154;
            case DEFINE_REPETION -> 155;
            case INCONSISTENT_NEWLINE_OPTIONS -> 156;
            case MISSING_BACK_REFERENCE -> 157;
            case INVALID_RELATIVE_REFERENCE -> 158;
            case BACKTRACKING_CONTROL_VERB_ARGUMENT_FORBIDDEN -> 159;
            case UNKNOWN_BACKTRACKING_CONTROL_VERB -> 160;
            case NUMBER_TOO_BIG -> 161;
            case MISSING_SUBPATTERN_NAME -> 162;
            case MISSING_DIGIT -> 163;
            case INVALID_DATA_CHARACTER -> 164;
            case EXTRA_SUBPATTERN_NAME -> 165;
            case BACKTRACKING_CONTROL_VERB_ARGUMENT_REQUIRED -> 166;
            case INVALID_CONTROL_CHAR -> 168;
            case MISSING_NAME -> 169;
            case NOT_SUPPORTED_IN_CLASS -> 171;
            case TOO_MANY_FORWARD_REFERENCES -> 172;
            case NAME_TOO_LONG -> 175;
            case CHARACTER_VALUE_TOO_LARGE -> 176;
        };
    }

}
