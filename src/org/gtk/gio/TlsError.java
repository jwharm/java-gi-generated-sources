package org.gtk.gio;

/**
 * An error code used with <code>G_TLS_ERROR</code> in a {@link org.gtk.glib.Error} returned from a
 * TLS-related routine.
 */
public enum TlsError {

    /**
     * No TLS provider is available
     */
    UNAVAILABLE,
    
    /**
     * Miscellaneous TLS error
     */
    MISC,
    
    /**
     * The certificate presented could not
     *   be parsed or failed validation.
     */
    BAD_CERTIFICATE,
    
    /**
     * The TLS handshake failed because the
     *   peer does not seem to be a TLS server.
     */
    NOT_TLS,
    
    /**
     * The TLS handshake failed because the
     *   peer&<code>#39</code> s certificate was not acceptable.
     */
    HANDSHAKE,
    
    /**
     * The TLS handshake failed because
     *   the server requested a client-side certificate, but none was
     *   provided. See g_tls_connection_set_certificate().
     */
    CERTIFICATE_REQUIRED,
    
    /**
     * The TLS connection was closed without proper
     *   notice, which may indicate an attack. See
     *   g_tls_connection_set_require_close_notify().
     */
    EOF,
    
    /**
     * The TLS handshake failed
     *   because the client sent the fallback SCSV, indicating a protocol
     *   downgrade attack. Since: 2.60
     */
    INAPPROPRIATE_FALLBACK,
    
    /**
     * The certificate failed
     *   to load because a password was incorrect. Since: 2.72
     */
    BAD_CERTIFICATE_PASSWORD;
    
    public static TlsError fromValue(int value) {
        return switch(value) {
            case 0 -> UNAVAILABLE;
            case 1 -> MISC;
            case 2 -> BAD_CERTIFICATE;
            case 3 -> NOT_TLS;
            case 4 -> HANDSHAKE;
            case 5 -> CERTIFICATE_REQUIRED;
            case 6 -> EOF;
            case 7 -> INAPPROPRIATE_FALLBACK;
            case 8 -> BAD_CERTIFICATE_PASSWORD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNAVAILABLE -> 0;
            case MISC -> 1;
            case BAD_CERTIFICATE -> 2;
            case NOT_TLS -> 3;
            case HANDSHAKE -> 4;
            case CERTIFICATE_REQUIRED -> 5;
            case EOF -> 6;
            case INAPPROPRIATE_FALLBACK -> 7;
            case BAD_CERTIFICATE_PASSWORD -> 8;
        };
    }

}
