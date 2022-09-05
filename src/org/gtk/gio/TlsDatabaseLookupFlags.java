package org.gtk.gio;

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 */
public enum TlsDatabaseLookupFlags {

    /**
     * No lookup flags
     */
    NONE,
    
    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    KEYPAIR;
    
    public static TlsDatabaseLookupFlags fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> KEYPAIR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case KEYPAIR -> 1;
        };
    }

}
