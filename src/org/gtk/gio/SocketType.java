package org.gtk.gio;

/**
 * Flags used when creating a {@link Socket}. Some protocols may not implement
 * all the socket types.
 */
public class SocketType {

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
    
    private int value;
    
    public SocketType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SocketType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
