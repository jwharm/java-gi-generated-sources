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
public enum UnixSocketAddressType {

    /**
     * invalid
     */
    INVALID,
    
    /**
     * anonymous
     */
    ANONYMOUS,
    
    /**
     * a filesystem path
     */
    PATH,
    
    /**
     * an abstract name
     */
    ABSTRACT,
    
    /**
     * an abstract name, 0-padded
     *   to the full length of a unix socket name
     */
    ABSTRACT_PADDED;
    
    public static UnixSocketAddressType fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> ANONYMOUS;
            case 2 -> PATH;
            case 3 -> ABSTRACT;
            case 4 -> ABSTRACT_PADDED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case ANONYMOUS -> 1;
            case PATH -> 2;
            case ABSTRACT -> 3;
            case ABSTRACT_PADDED -> 4;
        };
    }

}
