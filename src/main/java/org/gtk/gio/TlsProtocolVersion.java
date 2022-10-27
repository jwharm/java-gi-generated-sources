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
public class TlsProtocolVersion extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No protocol version or unknown protocol version
     */
    public static final TlsProtocolVersion UNKNOWN = new TlsProtocolVersion(0);
    
    /**
     * SSL 3.0, which is insecure and should not be used
     */
    public static final TlsProtocolVersion SSL_3_0 = new TlsProtocolVersion(1);
    
    /**
     * TLS 1.0, which is insecure and should not be used
     */
    public static final TlsProtocolVersion TLS_1_0 = new TlsProtocolVersion(2);
    
    /**
     * TLS 1.1, which is insecure and should not be used
     */
    public static final TlsProtocolVersion TLS_1_1 = new TlsProtocolVersion(3);
    
    /**
     * TLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc5246">RFC 5246</a>
     */
    public static final TlsProtocolVersion TLS_1_2 = new TlsProtocolVersion(4);
    
    /**
     * TLS 1.3, defined by <a href="https://datatracker.ietf.org/doc/html/rfc8446">RFC 8446</a>
     */
    public static final TlsProtocolVersion TLS_1_3 = new TlsProtocolVersion(5);
    
    /**
     * DTLS 1.0, which is insecure and should not be used
     */
    public static final TlsProtocolVersion DTLS_1_0 = new TlsProtocolVersion(201);
    
    /**
     * DTLS 1.2, defined by <a href="https://datatracker.ietf.org/doc/html/rfc6347">RFC 6347</a>
     */
    public static final TlsProtocolVersion DTLS_1_2 = new TlsProtocolVersion(202);
    
    public TlsProtocolVersion(int value) {
        super(value);
    }
}
