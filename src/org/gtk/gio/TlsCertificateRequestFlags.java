package org.gtk.gio;

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 */
public enum TlsCertificateRequestFlags {

    /**
     * No flags
     */
    NONE;
    
    public static TlsCertificateRequestFlags fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
        };
    }

}
