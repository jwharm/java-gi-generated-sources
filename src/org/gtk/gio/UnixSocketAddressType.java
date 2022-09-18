package org.gtk.gio;

/**
 * The type of name used by a {@link org.gtk.gio.UnixSocketAddress} 
 * {@link org.gtk.gio.UnixSocketAddressType<code>#PATH</code>  indicates a traditional unix domain
 * socket bound to a filesystem path. {@link org.gtk.gio.UnixSocketAddressType<code>#ANONYMOUS</code>  indicates a socket not bound to any name (eg, a client-side socket,
 * or a socket created with socketpair()).
 * <p>
 * For abstract sockets, there are two incompatible ways of naming
 * them; the man pages suggest using the entire <code>struct sockaddr_un</code>
 * as the name, padding the unused parts of the <code>sun_path</code> field with
 * zeroes; this corresponds to {@link org.gtk.gio.UnixSocketAddressType<code>#ABSTRACT_PADDED</code>  
 * However, many programs instead just use a portion of <code>sun_path</code>  and
 * pass an appropriate smaller length to bind() or connect(). This is
 * {@link org.gtk.gio.UnixSocketAddressType<code>#ABSTRACT</code>
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
