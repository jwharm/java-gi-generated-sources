package org.gtk.gio;

/**
 * The client authentication mode for a #GTlsServerConnection.
 */
public enum TlsAuthenticationMode {

    /**
     * client authentication not required
     */
    NONE,
    
    /**
     * client authentication is requested
     */
    REQUESTED,
    
    /**
     * client authentication is required
     */
    REQUIRED;
    
    public static TlsAuthenticationMode fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> REQUESTED;
            case 2 -> REQUIRED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case REQUESTED -> 1;
            case REQUIRED -> 2;
        };
    }

}
