package org.gtk.glib;

/**
 * Error codes returned by parsing text-format GVariants.
 */
public enum VariantParseError {

    /**
     * generic error (unused)
     */
    FAILED,
    
    /**
     * a non-basic #GVariantType was given where a basic type was expected
     */
    BASIC_TYPE_EXPECTED,
    
    /**
     * cannot infer the #GVariantType
     */
    CANNOT_INFER_TYPE,
    
    /**
     * an indefinite #GVariantType was given where a definite type was expected
     */
    DEFINITE_TYPE_EXPECTED,
    
    /**
     * extra data after parsing finished
     */
    INPUT_NOT_AT_END,
    
    /**
     * invalid character in number or unicode escape
     */
    INVALID_CHARACTER,
    
    /**
     * not a valid #GVariant format string
     */
    INVALID_FORMAT_STRING,
    
    /**
     * not a valid object path
     */
    INVALID_OBJECT_PATH,
    
    /**
     * not a valid type signature
     */
    INVALID_SIGNATURE,
    
    /**
     * not a valid #GVariant type string
     */
    INVALID_TYPE_STRING,
    
    /**
     * could not find a common type for array entries
     */
    NO_COMMON_TYPE,
    
    /**
     * the numerical value is out of range of the given type
     */
    NUMBER_OUT_OF_RANGE,
    
    /**
     * the numerical value is out of range for any type
     */
    NUMBER_TOO_BIG,
    
    /**
     * cannot parse as variant of the specified type
     */
    TYPE_ERROR,
    
    /**
     * an unexpected token was encountered
     */
    UNEXPECTED_TOKEN,
    
    /**
     * an unknown keyword was encountered
     */
    UNKNOWN_KEYWORD,
    
    /**
     * unterminated string constant
     */
    UNTERMINATED_STRING_CONSTANT,
    
    /**
     * no value given
     */
    VALUE_EXPECTED,
    
    /**
     * variant was too deeply nested; #GVariant is only guaranteed to handle nesting up to 64 levels (Since: 2.64)
     */
    RECURSION;
    
    public static VariantParseError fromValue(int value) {
        return switch(value) {
            case 0 -> FAILED;
            case 1 -> BASIC_TYPE_EXPECTED;
            case 2 -> CANNOT_INFER_TYPE;
            case 3 -> DEFINITE_TYPE_EXPECTED;
            case 4 -> INPUT_NOT_AT_END;
            case 5 -> INVALID_CHARACTER;
            case 6 -> INVALID_FORMAT_STRING;
            case 7 -> INVALID_OBJECT_PATH;
            case 8 -> INVALID_SIGNATURE;
            case 9 -> INVALID_TYPE_STRING;
            case 10 -> NO_COMMON_TYPE;
            case 11 -> NUMBER_OUT_OF_RANGE;
            case 12 -> NUMBER_TOO_BIG;
            case 13 -> TYPE_ERROR;
            case 14 -> UNEXPECTED_TOKEN;
            case 15 -> UNKNOWN_KEYWORD;
            case 16 -> UNTERMINATED_STRING_CONSTANT;
            case 17 -> VALUE_EXPECTED;
            case 18 -> RECURSION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case BASIC_TYPE_EXPECTED -> 1;
            case CANNOT_INFER_TYPE -> 2;
            case DEFINITE_TYPE_EXPECTED -> 3;
            case INPUT_NOT_AT_END -> 4;
            case INVALID_CHARACTER -> 5;
            case INVALID_FORMAT_STRING -> 6;
            case INVALID_OBJECT_PATH -> 7;
            case INVALID_SIGNATURE -> 8;
            case INVALID_TYPE_STRING -> 9;
            case NO_COMMON_TYPE -> 10;
            case NUMBER_OUT_OF_RANGE -> 11;
            case NUMBER_TOO_BIG -> 12;
            case TYPE_ERROR -> 13;
            case UNEXPECTED_TOKEN -> 14;
            case UNKNOWN_KEYWORD -> 15;
            case UNTERMINATED_STRING_CONSTANT -> 16;
            case VALUE_EXPECTED -> 17;
            case RECURSION -> 18;
        };
    }

}
