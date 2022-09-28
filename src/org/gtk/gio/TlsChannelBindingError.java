package org.gtk.gio;

/**
 * An error code used with {@code G_TLS_CHANNEL_BINDING_ERROR} in a {@link org.gtk.glib.Error} to
 * indicate a TLS channel binding retrieval error.
 */
public class TlsChannelBindingError {

    /**
     * Either entire binding
     *    retrieval facility or specific binding type is not implemented in the
     *    TLS backend.
     */
    public static final TlsChannelBindingError NOT_IMPLEMENTED = new TlsChannelBindingError(0);
    
    /**
     * The handshake is not yet
     *    complete on the connection which is a strong requirement for any existing
     *    binding type.
     */
    public static final TlsChannelBindingError INVALID_STATE = new TlsChannelBindingError(1);
    
    /**
     * Handshake is complete but
     *    binding data is not available. That normally indicates the TLS
     *    implementation failed to provide the binding data. For example, some
     *    implementations do not provide a peer certificate for resumed connections.
     */
    public static final TlsChannelBindingError NOT_AVAILABLE = new TlsChannelBindingError(2);
    
    /**
     * Binding type is not supported
     *    on the current connection. This error could be triggered when requesting
     *    {@code tls-server-end-point} binding data for a certificate which has no hash
     *    function or uses multiple hash functions.
     */
    public static final TlsChannelBindingError NOT_SUPPORTED = new TlsChannelBindingError(3);
    
    /**
     * Any other backend error
     *    preventing binding data retrieval.
     */
    public static final TlsChannelBindingError GENERAL_ERROR = new TlsChannelBindingError(4);
    
    private int value;
    
    public TlsChannelBindingError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsChannelBindingError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
