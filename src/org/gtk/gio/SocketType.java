package org.gtk.gio;

/**
 * Flags used when creating a {@link org.gtk.gio.Socket}  Some protocols may not implement
 * all the socket types.
 */
public enum SocketType {

    /**
     * Type unknown or wrong
     */
    INVALID,
    
    /**
     * Reliable connection-based byte streams (e.g. TCP).
     */
    STREAM,
    
    /**
     * Connectionless, unreliable datagram passing.
     *     (e.g. UDP)
     */
    DATAGRAM,
    
    /**
     * Reliable connection-based passing of datagrams
     *     of fixed maximum length (e.g. SCTP).
     */
    SEQPACKET;
    
    public static SocketType fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> STREAM;
            case 2 -> DATAGRAM;
            case 3 -> SEQPACKET;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case STREAM -> 1;
            case DATAGRAM -> 2;
            case SEQPACKET -> 3;
        };
    }

}
