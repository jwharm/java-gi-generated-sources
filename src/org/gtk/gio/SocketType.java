package org.gtk.gio;

/**
 * Flags used when creating a {@link Socket}. Some protocols may not implement
 * all the socket types.
 */
public class SocketType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Type unknown or wrong
     */
    public static final SocketType INVALID = new SocketType(0);
    
    /**
     * Reliable connection-based byte streams (e.g. TCP).
     */
    public static final SocketType STREAM = new SocketType(1);
    
    /**
     * Connectionless, unreliable datagram passing.
     *     (e.g. UDP)
     */
    public static final SocketType DATAGRAM = new SocketType(2);
    
    /**
     * Reliable connection-based passing of datagrams
     *     of fixed maximum length (e.g. SCTP).
     */
    public static final SocketType SEQPACKET = new SocketType(3);
    
    public SocketType(int value) {
        super(value);
    }
    
}
