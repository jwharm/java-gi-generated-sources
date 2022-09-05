package org.gtk.gio;

/**
 * A protocol identifier is specified when creating a #GSocket, which is a
 * family/type specific identifier, where 0 means the default protocol for
 * the particular family/type.
 * 
 * This enum contains a set of commonly available and used protocols. You
 * can also pass any other identifiers handled by the platform in order to
 * use protocols not listed here.
 */
public enum SocketProtocol {

    /**
     * The protocol type is unknown
     */
    UNKNOWN,
    
    /**
     * The default protocol for the family/type
     */
    DEFAULT,
    
    /**
     * TCP over IP
     */
    TCP,
    
    /**
     * UDP over IP
     */
    UDP,
    
    /**
     * SCTP over IP
     */
    SCTP;
    
    public static SocketProtocol fromValue(int value) {
        return switch(value) {
            case -1 -> UNKNOWN;
            case 0 -> DEFAULT;
            case 6 -> TCP;
            case 17 -> UDP;
            case 132 -> SCTP;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> -1;
            case DEFAULT -> 0;
            case TCP -> 6;
            case UDP -> 17;
            case SCTP -> 132;
        };
    }

}
