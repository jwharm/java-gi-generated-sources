package org.gtk.gio;

/**
 * Flags for g_tls_database_lookup_certificate_for_handle(),
 * g_tls_database_lookup_certificate_issuer(),
 * and g_tls_database_lookup_certificates_issued_by().
 */
public class TlsDatabaseLookupFlags {

    /**
     * No lookup flags
     */
    public static final TlsDatabaseLookupFlags NONE = new TlsDatabaseLookupFlags(0);
    
    /**
     * Restrict lookup to certificates that have
     *     a private key.
     */
    public static final TlsDatabaseLookupFlags KEYPAIR = new TlsDatabaseLookupFlags(1);
    
    private int value;
    
    public TlsDatabaseLookupFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsDatabaseLookupFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
