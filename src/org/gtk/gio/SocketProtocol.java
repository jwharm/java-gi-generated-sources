package org.gtk.gio;

/**
 * A protocol identifier is specified when creating a {@link Socket}, which is a
 * family/type specific identifier, where 0 means the default protocol for
 * the particular family/type.
 * <p>
 * This enum contains a set of commonly available and used protocols. You
 * can also pass any other identifiers handled by the platform in order to
 * use protocols not listed here.
 */
public class SocketProtocol {

    /**
     * The protocol type is unknown
     */
    public static final SocketProtocol UNKNOWN = new SocketProtocol(-1);
    
    /**
     * The default protocol for the family/type
     */
    public static final SocketProtocol DEFAULT = new SocketProtocol(0);
    
    /**
     * TCP over IP
     */
    public static final SocketProtocol TCP = new SocketProtocol(6);
    
    /**
     * UDP over IP
     */
    public static final SocketProtocol UDP = new SocketProtocol(17);
    
    /**
     * SCTP over IP
     */
    public static final SocketProtocol SCTP = new SocketProtocol(132);
    
    private int value;
    
    public SocketProtocol(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SocketProtocol[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
