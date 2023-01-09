package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by {@link Uri} methods.
 * @version 2.66
 */
public enum UriError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Generic error if no more specific error is available.
     *     See the error message for details.
     */
    FAILED(0),
    
    /**
     * The scheme of a URI could not be parsed.
     */
    BAD_SCHEME(1),
    
    /**
     * The user/userinfo of a URI could not be parsed.
     */
    BAD_USER(2),
    
    /**
     * The password of a URI could not be parsed.
     */
    BAD_PASSWORD(3),
    
    /**
     * The authentication parameters of a URI could not be parsed.
     */
    BAD_AUTH_PARAMS(4),
    
    /**
     * The host of a URI could not be parsed.
     */
    BAD_HOST(5),
    
    /**
     * The port of a URI could not be parsed.
     */
    BAD_PORT(6),
    
    /**
     * The path of a URI could not be parsed.
     */
    BAD_PATH(7),
    
    /**
     * The query of a URI could not be parsed.
     */
    BAD_QUERY(8),
    
    /**
     * The fragment of a URI could not be parsed.
     */
    BAD_FRAGMENT(9);
    
    private static final java.lang.String C_TYPE_NAME = "GUriError";
    
    private final int value;
    
    /**
     * Create a new UriError for the provided value
     * @param numeric value the enum value
     */
    UriError(int value) {
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
     * Create a new UriError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static UriError of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
