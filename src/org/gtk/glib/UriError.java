package org.gtk.glib;

/**
 * Error codes returned by {@link Uri} methods.
 */
public enum UriError {

    /**
     * Generic error if no more specific error is available.
     *     See the error message for details.
     */
    FAILED,
    
    /**
     * The scheme of a URI could not be parsed.
     */
    BAD_SCHEME,
    
    /**
     * The user/userinfo of a URI could not be parsed.
     */
    BAD_USER,
    
    /**
     * The password of a URI could not be parsed.
     */
    BAD_PASSWORD,
    
    /**
     * The authentication parameters of a URI could not be parsed.
     */
    BAD_AUTH_PARAMS,
    
    /**
     * The host of a URI could not be parsed.
     */
    BAD_HOST,
    
    /**
     * The port of a URI could not be parsed.
     */
    BAD_PORT,
    
    /**
     * The path of a URI could not be parsed.
     */
    BAD_PATH,
    
    /**
     * The query of a URI could not be parsed.
     */
    BAD_QUERY,
    
    /**
     * The fragment of a URI could not be parsed.
     */
    BAD_FRAGMENT;
    
    public static UriError fromValue(int value) {
        return switch(value) {
            case 0 -> FAILED;
            case 1 -> BAD_SCHEME;
            case 2 -> BAD_USER;
            case 3 -> BAD_PASSWORD;
            case 4 -> BAD_AUTH_PARAMS;
            case 5 -> BAD_HOST;
            case 6 -> BAD_PORT;
            case 7 -> BAD_PATH;
            case 8 -> BAD_QUERY;
            case 9 -> BAD_FRAGMENT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case BAD_SCHEME -> 1;
            case BAD_USER -> 2;
            case BAD_PASSWORD -> 3;
            case BAD_AUTH_PARAMS -> 4;
            case BAD_HOST -> 5;
            case BAD_PORT -> 6;
            case BAD_PATH -> 7;
            case BAD_QUERY -> 8;
            case BAD_FRAGMENT -> 9;
        };
    }

}
