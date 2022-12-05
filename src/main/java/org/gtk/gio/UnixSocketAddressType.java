package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.26
 */
public enum UnixSocketAddressType implements io.github.jwharm.javagi.Enumeration {
    /**
     * invalid
     */
    INVALID(0),
    /**
     * anonymous
     */
    ANONYMOUS(1),
    /**
     * a filesystem path
     */
    PATH(2),
    /**
     * an abstract name
     */
    ABSTRACT(3),
    /**
     * an abstract name, 0-padded
     *   to the full length of a unix socket name
     */
    ABSTRACT_PADDED(4);
    
    private static final java.lang.String C_TYPE_NAME = "GUnixSocketAddressType";
    
    private final int value;
    UnixSocketAddressType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static UnixSocketAddressType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> ANONYMOUS;
            case 2 -> PATH;
            case 3 -> ABSTRACT;
            case 4 -> ABSTRACT_PADDED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
