package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by {@link Uri} methods.
 * @version 2.66
 */
public class UriError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public UriError(int value) {
        super(value);
    }
}
