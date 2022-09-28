package org.gtk.gio;

/**
 * Flags for g_tls_interaction_request_certificate(),
 * g_tls_interaction_request_certificate_async(), and
 * g_tls_interaction_invoke_request_certificate().
 */
public class TlsCertificateRequestFlags {

    /**
     * No flags
     */
    public static final TlsCertificateRequestFlags NONE = new TlsCertificateRequestFlags(0);
    
    private int value;
    
    public TlsCertificateRequestFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsCertificateRequestFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
