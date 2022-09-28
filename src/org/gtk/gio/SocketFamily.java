package org.gtk.gio;

/**
 * The protocol family of a {@link SocketAddress}. (These values are
 * identical to the system defines {@code AF_INET}, {@code AF_INET6} and {@code AF_UNIX},
 * if available.)
 */
public class SocketFamily {

    /**
     * no address family
     */
    public static final SocketFamily INVALID = new SocketFamily(0);
    
    /**
     * the UNIX domain family
     */
    public static final SocketFamily UNIX = new SocketFamily(1);
    
    /**
     * the IPv4 family
     */
    public static final SocketFamily IPV4 = new SocketFamily(2);
    
    /**
     * the IPv6 family
     */
    public static final SocketFamily IPV6 = new SocketFamily(10);
    
    private int value;
    
    public SocketFamily(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SocketFamily[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
