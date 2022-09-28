package org.gtk.gio;

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 */
public class TlsDatabaseLookupFlags extends io.github.jwharm.javagi.Enumeration {

    /**
     * No lookup flags
     */
    public static final TlsDatabaseLookupFlags NONE = new TlsDatabaseLookupFlags(0);
    
    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    public static final TlsDatabaseLookupFlags KEYPAIR = new TlsDatabaseLookupFlags(1);
    
    public TlsDatabaseLookupFlags(int value) {
        super(value);
    }
    
}
