package org.gtk.gio;

/**
 * The TLS or DTLS protocol version used by a {@link TlsConnection} or
 * {@link DtlsConnection}. The integer values of these versions are sequential
 * to ensure newer known protocol versions compare greater than older
 * known versions. Any known DTLS protocol version will compare greater
 * than any SSL or TLS protocol version. The protocol version may be
 * {@link TlsProtocolVersion#UNKNOWN} if the TLS backend supports a newer
 * protocol version that GLib does not yet know about. This means that
 * it's possible for an unknown DTLS protocol version to compare less
 * than the TLS protocol versions.
 */
public enum TlsProtocolVersion {

    /**
     * No protocol version or unknown protocol version
     */
    UNKNOWN,
    
    /**
     * SSL 3.0, which is insecure and should not be used
     */
    SSL_3_0,
    
    /**
     * TLS 1.0, which is insecure and should not be used
     */
    TLS_1_0,
    
    /**
     * TLS 1.1, which is insecure and should not be used
     */
    TLS_1_1,
    
    /**
     * TLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc5246">RFC 5246</a>
     */
    TLS_1_2,
    
    /**
     * TLS 1.3, defined by <a href="https://datatracker.ietf.org/doc/html/rfc8446">RFC 8446</a>
     */
    TLS_1_3,
    
    /**
     * DTLS 1.0, which is insecure and should not be used
     */
    DTLS_1_0,
    
    /**
     * DTLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc6347">RFC 6347</a>
     */
    DTLS_1_2;
    
    public static TlsProtocolVersion fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> SSL_3_0;
            case 2 -> TLS_1_0;
            case 3 -> TLS_1_1;
            case 4 -> TLS_1_2;
            case 5 -> TLS_1_3;
            case 201 -> DTLS_1_0;
            case 202 -> DTLS_1_2;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case SSL_3_0 -> 1;
            case TLS_1_0 -> 2;
            case TLS_1_1 -> 3;
            case TLS_1_2 -> 4;
            case TLS_1_3 -> 5;
            case DTLS_1_0 -> 201;
            case DTLS_1_2 -> 202;
        };
    }

}
