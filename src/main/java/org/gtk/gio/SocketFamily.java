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
public class SocketFamily extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GSocketFamily";
    
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
    
    public SocketFamily(int value) {
        super(value);
    }
}
