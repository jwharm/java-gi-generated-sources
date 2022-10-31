package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An error code used with {@code G_TLS_ERROR} in a {@link org.gtk.glib.Error} returned from a
 * TLS-related routine.
 * @version 2.28
 */
public class TlsError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsError";
    
    /**
     * No TLS provider is available
     */
    public static final TlsError UNAVAILABLE = new TlsError(0);
    
    /**
     * Miscellaneous TLS error
     */
    public static final TlsError MISC = new TlsError(1);
    
    /**
     * The certificate presented could not
     *   be parsed or failed validation.
     */
    public static final TlsError BAD_CERTIFICATE = new TlsError(2);
    
    /**
     * The TLS handshake failed because the
     *   peer does not seem to be a TLS server.
     */
    public static final TlsError NOT_TLS = new TlsError(3);
    
    /**
     * The TLS handshake failed because the
     *   peer's certificate was not acceptable.
     */
    public static final TlsError HANDSHAKE = new TlsError(4);
    
    /**
     * The TLS handshake failed because
     *   the server requested a client-side certificate, but none was
     *   provided. See g_tls_connection_set_certificate().
     */
    public static final TlsError CERTIFICATE_REQUIRED = new TlsError(5);
    
    /**
     * The TLS connection was closed without proper
     *   notice, which may indicate an attack. See
     *   g_tls_connection_set_require_close_notify().
     */
    public static final TlsError EOF = new TlsError(6);
    
    /**
     * The TLS handshake failed
     *   because the client sent the fallback SCSV, indicating a protocol
     *   downgrade attack. Since: 2.60
     */
    public static final TlsError INAPPROPRIATE_FALLBACK = new TlsError(7);
    
    /**
     * The certificate failed
     *   to load because a password was incorrect. Since: 2.72
     */
    public static final TlsError BAD_CERTIFICATE_PASSWORD = new TlsError(8);
    
    public TlsError(int value) {
        super(value);
    }
    
    /**
     * Gets the TLS error quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_tls_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tls_error_quark = Interop.downcallHandle(
            "g_tls_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
