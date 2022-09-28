package org.gtk.glib;

/**
 * Flags modifying the way parameters are handled by g_uri_parse_params() and
 * {@link UriParamsIter}.
 */
public class UriParamsFlags {

    /**
     * No flags set.
     */
    public static final UriParamsFlags NONE = new UriParamsFlags(0);
    
    /**
     * Parameter names are case insensitive.
     */
    public static final UriParamsFlags CASE_INSENSITIVE = new UriParamsFlags(1);
    
    /**
     * Replace {@code +} with space character. Only useful for
     *     URLs on the web, using the {@code https} or {@code http} schemas.
     */
    public static final UriParamsFlags WWW_FORM = new UriParamsFlags(2);
    
    /**
     * See {@link UriFlags#PARSE_RELAXED}.
     */
    public static final UriParamsFlags PARSE_RELAXED = new UriParamsFlags(4);
    
    private int value;
    
    public UriParamsFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UriParamsFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public UriParamsFlags combined(UriParamsFlags mask) {
        return new UriParamsFlags(this.getValue() | mask.getValue());
    }
    
    public static UriParamsFlags combined(UriParamsFlags mask, UriParamsFlags... masks) {
        int value = mask.getValue();
        for (UriParamsFlags arg : masks) {
            value |= arg.getValue();
        }
        return new UriParamsFlags(value);
    }
    
}
