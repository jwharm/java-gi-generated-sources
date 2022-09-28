package org.gtk.gio;

/**
 * The type of name used by a {@link UnixSocketAddress}.
 * {@link UnixSocketAddressType#PATH} indicates a traditional unix domain
 * socket bound to a filesystem path. {@link UnixSocketAddressType#ANONYMOUS}
 * indicates a socket not bound to any name (eg, a client-side socket,
 * or a socket created with socketpair()).
 * <p>
 * For abstract sockets, there are two incompatible ways of naming
 * them; the man pages suggest using the entire {@code struct sockaddr_un}
 * as the name, padding the unused parts of the {@code sun_path} field with
 * zeroes; this corresponds to {@link UnixSocketAddressType#ABSTRACT_PADDED}.
 * However, many programs instead just use a portion of {@code sun_path}, and
 * pass an appropriate smaller length to bind() or connect(). This is
 * {@link UnixSocketAddressType#ABSTRACT}.
 */
public class UnixSocketAddressType {

    /**
     * invalid
     */
    public static final UnixSocketAddressType INVALID = new UnixSocketAddressType(0);
    
    /**
     * anonymous
     */
    public static final UnixSocketAddressType ANONYMOUS = new UnixSocketAddressType(1);
    
    /**
     * a filesystem path
     */
    public static final UnixSocketAddressType PATH = new UnixSocketAddressType(2);
    
    /**
     * an abstract name
     */
    public static final UnixSocketAddressType ABSTRACT = new UnixSocketAddressType(3);
    
    /**
     * an abstract name, 0-padded
     *   to the full length of a unix socket name
     */
    public static final UnixSocketAddressType ABSTRACT_PADDED = new UnixSocketAddressType(4);
    
    private int value;
    
    public UnixSocketAddressType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(UnixSocketAddressType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
