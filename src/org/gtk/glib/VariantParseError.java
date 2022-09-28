package org.gtk.glib;

/**
 * Error codes returned by parsing text-format GVariants.
 */
public class VariantParseError {

    /**
     * generic error (unused)
     */
    public static final VariantParseError FAILED = new VariantParseError(0);
    
    /**
     * a non-basic {@link VariantType} was given where a basic type was expected
     */
    public static final VariantParseError BASIC_TYPE_EXPECTED = new VariantParseError(1);
    
    /**
     * cannot infer the {@link VariantType}
     */
    public static final VariantParseError CANNOT_INFER_TYPE = new VariantParseError(2);
    
    /**
     * an indefinite {@link VariantType} was given where a definite type was expected
     */
    public static final VariantParseError DEFINITE_TYPE_EXPECTED = new VariantParseError(3);
    
    /**
     * extra data after parsing finished
     */
    public static final VariantParseError INPUT_NOT_AT_END = new VariantParseError(4);
    
    /**
     * invalid character in number or unicode escape
     */
    public static final VariantParseError INVALID_CHARACTER = new VariantParseError(5);
    
    /**
     * not a valid {@link Variant} format string
     */
    public static final VariantParseError INVALID_FORMAT_STRING = new VariantParseError(6);
    
    /**
     * not a valid object path
     */
    public static final VariantParseError INVALID_OBJECT_PATH = new VariantParseError(7);
    
    /**
     * not a valid type signature
     */
    public static final VariantParseError INVALID_SIGNATURE = new VariantParseError(8);
    
    /**
     * not a valid {@link Variant} type string
     */
    public static final VariantParseError INVALID_TYPE_STRING = new VariantParseError(9);
    
    /**
     * could not find a common type for array entries
     */
    public static final VariantParseError NO_COMMON_TYPE = new VariantParseError(10);
    
    /**
     * the numerical value is out of range of the given type
     */
    public static final VariantParseError NUMBER_OUT_OF_RANGE = new VariantParseError(11);
    
    /**
     * the numerical value is out of range for any type
     */
    public static final VariantParseError NUMBER_TOO_BIG = new VariantParseError(12);
    
    /**
     * cannot parse as variant of the specified type
     */
    public static final VariantParseError TYPE_ERROR = new VariantParseError(13);
    
    /**
     * an unexpected token was encountered
     */
    public static final VariantParseError UNEXPECTED_TOKEN = new VariantParseError(14);
    
    /**
     * an unknown keyword was encountered
     */
    public static final VariantParseError UNKNOWN_KEYWORD = new VariantParseError(15);
    
    /**
     * unterminated string constant
     */
    public static final VariantParseError UNTERMINATED_STRING_CONSTANT = new VariantParseError(16);
    
    /**
     * no value given
     */
    public static final VariantParseError VALUE_EXPECTED = new VariantParseError(17);
    
    /**
     * variant was too deeply nested; {@link Variant} is only guaranteed to handle nesting up to 64 levels (Since: 2.64)
     */
    public static final VariantParseError RECURSION = new VariantParseError(18);
    
    private int value;
    
    public VariantParseError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(VariantParseError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
