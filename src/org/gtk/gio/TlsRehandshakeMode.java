package org.gtk.gio;

/**
 * When to allow rehandshaking. See
 * g_tls_connection_set_rehandshake_mode().
 */
public enum TlsRehandshakeMode {

    /**
     * Never allow rehandshaking
     */
    NEVER,
    
    /**
     * Allow safe rehandshaking only
     */
    SAFELY,
    
    /**
     * Allow unsafe rehandshaking
     */
    UNSAFELY;
    
    public static TlsRehandshakeMode fromValue(int value) {
        return switch(value) {
            case 0 -> NEVER;
            case 1 -> SAFELY;
            case 2 -> UNSAFELY;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NEVER -> 0;
            case SAFELY -> 1;
            case UNSAFELY -> 2;
        };
    }

}
