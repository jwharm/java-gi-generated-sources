package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The protocol family of a {@link SocketAddress}. (These values are
 * identical to the system defines {@code AF_INET}, {@code AF_INET6} and {@code AF_UNIX},
 * if available.)
 * @version 2.22
 */
public enum SocketFamily implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no address family
     */
    INVALID(0),
    
    /**
     * the UNIX domain family
     */
    UNIX(1),
    
    /**
     * the IPv4 family
     */
    IPV4(2),
    
    /**
     * the IPv6 family
     */
    IPV6(10);
    
    private static final java.lang.String C_TYPE_NAME = "GSocketFamily";
    
    private final int value;
    
    /**
     * Create a new SocketFamily for the provided value
     * @param numeric value the enum value
     */
    SocketFamily(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new SocketFamily for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SocketFamily of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> UNIX;
            case 2 -> IPV4;
            case 10 -> IPV6;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
