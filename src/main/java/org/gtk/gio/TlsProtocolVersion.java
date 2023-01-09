package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.70
 */
public enum TlsProtocolVersion implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No protocol version or unknown protocol version
     */
    UNKNOWN(0),
    
    /**
     * SSL 3.0, which is insecure and should not be used
     */
    SSL_3_0(1),
    
    /**
     * TLS 1.0, which is insecure and should not be used
     */
    TLS_1_0(2),
    
    /**
     * TLS 1.1, which is insecure and should not be used
     */
    TLS_1_1(3),
    
    /**
     * TLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc5246">RFC 5246</a>
     */
    TLS_1_2(4),
    
    /**
     * TLS 1.3, defined by <a href="https://datatracker.ietf.org/doc/html/rfc8446">RFC 8446</a>
     */
    TLS_1_3(5),
    
    /**
     * DTLS 1.0, which is insecure and should not be used
     */
    DTLS_1_0(201),
    
    /**
     * DTLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc6347">RFC 6347</a>
     */
    DTLS_1_2(202);
    
    private static final java.lang.String C_TYPE_NAME = "GTlsProtocolVersion";
    
    private final int value;
    
    /**
     * Create a new TlsProtocolVersion for the provided value
     * @param numeric value the enum value
     */
    TlsProtocolVersion(int value) {
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
     * Create a new TlsProtocolVersion for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TlsProtocolVersion of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> SSL_3_0;
            case 2 -> TLS_1_0;
            case 3 -> TLS_1_1;
            case 4 -> TLS_1_2;
            case 5 -> TLS_1_3;
            case 201 -> DTLS_1_0;
            case 202 -> DTLS_1_2;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
