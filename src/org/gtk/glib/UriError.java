package org.gtk.glib;

/**
 * Error codes returned by {@link Uri} methods.
 */
public class UriError {

    /**
     * Generic error if no more specific error is available.
     *     See the error message for details.
     */
    public static final UriError FAILED = new UriError(0);
    
    /**
     * The scheme of a URI could not be parsed.
     */
    public static final UriError BAD_SCHEME = new UriError(1);
    
    /**
     * The user/userinfo of a URI could not be parsed.
     */
    public static final UriError BAD_USER = new UriError(2);
    
    /**
     * The password of a URI could not be parsed.
     */
    public static final UriError BAD_PASSWORD = new UriError(3);
    
    /**
     * The authentication parameters of a URI could not be parsed.
     */
    public static final UriError BAD_AUTH_PARAMS = new UriError(4);
    
    /**
     * The host of a URI could not be parsed.
     */
    public static final UriError BAD_HOST = new UriError(5);
    
    /**
     * The port of a URI could not be parsed.
     */
    public static final UriError BAD_PORT = new UriError(6);
    
    /**
     * The path of a URI could not be parsed.
     */
    public static final UriError BAD_PATH = new UriError(7);
    
    /**
     * The query of a URI could not be parsed.
     */
    public static final UriError BAD_QUERY = new UriError(8);
    
    /**
     * The fragment of a URI could not be parsed.
     */
    public static final UriError BAD_FRAGMENT = new UriError(9);
    
    private int value;
    
    public UriError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UriError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
