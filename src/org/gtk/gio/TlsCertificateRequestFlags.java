package org.gtk.gio;

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 */
public class TlsCertificateRequestFlags extends io.github.jwharm.javagi.Enumeration {

    /**
     * No flags
     */
    public static final TlsCertificateRequestFlags NONE = new TlsCertificateRequestFlags(0);
    
    public TlsCertificateRequestFlags(int value) {
        super(value);
    }
    
}
