package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by parsing text-format GVariants.
 */
public enum VariantParseError implements io.github.jwharm.javagi.Enumeration {
    /**
     * generic error (unused)
     */
    FAILED(0),
    /**
     * a non-basic {@link VariantType} was given where a basic type was expected
     */
    BASIC_TYPE_EXPECTED(1),
    /**
     * cannot infer the {@link VariantType}
     */
    CANNOT_INFER_TYPE(2),
    /**
     * an indefinite {@link VariantType} was given where a definite type was expected
     */
    DEFINITE_TYPE_EXPECTED(3),
    /**
     * extra data after parsing finished
     */
    INPUT_NOT_AT_END(4),
    /**
     * invalid character in number or unicode escape
     */
    INVALID_CHARACTER(5),
    /**
     * not a valid {@link Variant} format string
     */
    INVALID_FORMAT_STRING(6),
    /**
     * not a valid object path
     */
    INVALID_OBJECT_PATH(7),
    /**
     * not a valid type signature
     */
    INVALID_SIGNATURE(8),
    /**
     * not a valid {@link Variant} type string
     */
    INVALID_TYPE_STRING(9),
    /**
     * could not find a common type for array entries
     */
    NO_COMMON_TYPE(10),
    /**
     * the numerical value is out of range of the given type
     */
    NUMBER_OUT_OF_RANGE(11),
    /**
     * the numerical value is out of range for any type
     */
    NUMBER_TOO_BIG(12),
    /**
     * cannot parse as variant of the specified type
     */
    TYPE_ERROR(13),
    /**
     * an unexpected token was encountered
     */
    UNEXPECTED_TOKEN(14),
    /**
     * an unknown keyword was encountered
     */
    UNKNOWN_KEYWORD(15),
    /**
     * unterminated string constant
     */
    UNTERMINATED_STRING_CONSTANT(16),
    /**
     * no value given
     */
    VALUE_EXPECTED(17),
    /**
     * variant was too deeply nested; {@link Variant} is only guaranteed to handle nesting up to 64 levels (Since: 2.64)
     */
    RECURSION(18);
    
    private static final java.lang.String C_TYPE_NAME = "GVariantParseError";
    
    private final int value;
    VariantParseError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VariantParseError of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
