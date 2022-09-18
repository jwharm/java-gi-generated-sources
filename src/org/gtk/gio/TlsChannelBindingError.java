package org.gtk.gio;

/**
 * An error code used with <code>G_TLS_CHANNEL_BINDING_ERROR</code> in a {@link org.gtk.glib.Error} to
 * indicate a TLS channel binding retrieval error.
 */
public enum TlsChannelBindingError {

    /**
     * Either entire binding
     *    retrieval facility or specific binding type is not implemented in the
     *    TLS backend.
     */
    NOT_IMPLEMENTED,
    
    /**
     * The handshake is not yet
     *    complete on the connection which is a strong requirement for any existing
     *    binding type.
     */
    INVALID_STATE,
    
    /**
     * Handshake is complete but
     *    binding data is not available. That normally indicates the TLS
     *    implementation failed to provide the binding data. For example, some
     *    implementations do not provide a peer certificate for resumed connections.
     */
    NOT_AVAILABLE,
    
    /**
     * Binding type is not supported
     *    on the current connection. This error could be triggered when requesting
     *    <code>tls-server-end-point</code> binding data for a certificate which has no hash
     *    function or uses multiple hash functions.
     */
    NOT_SUPPORTED,
    
    /**
     * Any other backend error
     *    preventing binding data retrieval.
     */
    GENERAL_ERROR;
    
    public static TlsChannelBindingError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_IMPLEMENTED;
            case 1 -> INVALID_STATE;
            case 2 -> NOT_AVAILABLE;
            case 3 -> NOT_SUPPORTED;
            case 4 -> GENERAL_ERROR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_IMPLEMENTED -> 0;
            case INVALID_STATE -> 1;
            case NOT_AVAILABLE -> 2;
            case NOT_SUPPORTED -> 3;
            case GENERAL_ERROR -> 4;
        };
    }

}
