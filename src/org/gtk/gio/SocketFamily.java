package org.gtk.gio;

/**
 * The protocol family of a {@link SocketAddress}. (These values are
 * identical to the system defines {@code AF_INET}, {@code AF_INET6} and {@code AF_UNIX},
 * if available.)
 */
public enum SocketFamily {

    /**
     * no address family
     */
    INVALID,
    
    /**
     * the UNIX domain family
     */
    UNIX,
    
    /**
     * the IPv4 family
     */
    IPV4,
    
    /**
     * the IPv6 family
     */
    IPV6;
    
    public static SocketFamily fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> UNIX;
            case 2 -> IPV4;
            case 10 -> IPV6;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case UNIX -> 1;
            case IPV4 -> 2;
            case IPV6 -> 10;
        };
    }

}
