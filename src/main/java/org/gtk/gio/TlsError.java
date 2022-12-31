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
public enum TlsError implements io.github.jwharm.javagi.Enumeration {
    /**
     * No TLS provider is available
     */
    UNAVAILABLE(0),
    /**
     * Miscellaneous TLS error
     */
    MISC(1),
    /**
     * The certificate presented could not
     *   be parsed or failed validation.
     */
    BAD_CERTIFICATE(2),
    /**
     * The TLS handshake failed because the
     *   peer does not seem to be a TLS server.
     */
    NOT_TLS(3),
    /**
     * The TLS handshake failed because the
     *   peer's certificate was not acceptable.
     */
    HANDSHAKE(4),
    /**
     * The TLS handshake failed because
     *   the server requested a client-side certificate, but none was
     *   provided. See g_tls_connection_set_certificate().
     */
    CERTIFICATE_REQUIRED(5),
    /**
     * The TLS connection was closed without proper
     *   notice, which may indicate an attack. See
     *   g_tls_connection_set_require_close_notify().
     */
    EOF(6),
    /**
     * The TLS handshake failed
     *   because the client sent the fallback SCSV, indicating a protocol
     *   downgrade attack. Since: 2.60
     */
    INAPPROPRIATE_FALLBACK(7),
    /**
     * The certificate failed
     *   to load because a password was incorrect. Since: 2.72
     */
    BAD_CERTIFICATE_PASSWORD(8);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsError";
    
    private final int value;
    TlsError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TlsError of(int value) {
        return switch (value) {
            case 0 -> UNAVAILABLE;
            case 1 -> MISC;
            case 2 -> BAD_CERTIFICATE;
            case 3 -> NOT_TLS;
            case 4 -> HANDSHAKE;
            case 5 -> CERTIFICATE_REQUIRED;
            case 6 -> EOF;
            case 7 -> INAPPROPRIATE_FALLBACK;
            case 8 -> BAD_CERTIFICATE_PASSWORD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Gets the TLS error quark.
     * @return a {@link org.gtk.glib.Quark}.
     */
    public static org.gtk.glib.Quark quark() {
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
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
