package org.gtk.glib;

/**
 * Flags describing what parts of the URI to hide in
 * g_uri_to_string_partial(). Note that {@link UriHideFlags#PASSWORD} and
 * {@link UriHideFlags#AUTH_PARAMS} will only work if the {@link Uri} was parsed with
 * the corresponding flags.
 */
public class UriHideFlags {

    /**
     * No flags set.
     */
    public static final UriHideFlags NONE = new UriHideFlags(0);
    
    /**
     * Hide the userinfo.
     */
    public static final UriHideFlags USERINFO = new UriHideFlags(1);
    
    /**
     * Hide the password.
     */
    public static final UriHideFlags PASSWORD = new UriHideFlags(2);
    
    /**
     * Hide the auth_params.
     */
    public static final UriHideFlags AUTH_PARAMS = new UriHideFlags(4);
    
    /**
     * Hide the query.
     */
    public static final UriHideFlags QUERY = new UriHideFlags(8);
    
    /**
     * Hide the fragment.
     */
    public static final UriHideFlags FRAGMENT = new UriHideFlags(16);
    
    private int value;
    
    public UriHideFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UriHideFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public UriHideFlags combined(UriHideFlags mask) {
        return new UriHideFlags(this.getValue() | mask.getValue());
    }
    
    public static UriHideFlags combined(UriHideFlags mask, UriHideFlags... masks) {
        int value = mask.getValue();
        for (UriHideFlags arg : masks) {
            value |= arg.getValue();
        }
        return new UriHideFlags(value);
    }
    
}
