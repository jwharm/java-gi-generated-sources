package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes an event occurring on a {@link SocketClient}. See the
 * {@link SocketClient}::event signal for more details.
 * <p>
 * Additional values may be added to this type in the future.
 * @version 2.32
 */
public enum SocketClientEvent implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The client is doing a DNS lookup.
     */
    RESOLVING(0),
    
    /**
     * The client has completed a DNS lookup.
     */
    RESOLVED(1),
    
    /**
     * The client is connecting to a remote
     *   host (either a proxy or the destination server).
     */
    CONNECTING(2),
    
    /**
     * The client has connected to a remote
     *   host.
     */
    CONNECTED(3),
    
    /**
     * The client is negotiating
     *   with a proxy to connect to the destination server.
     */
    PROXY_NEGOTIATING(4),
    
    /**
     * The client has negotiated
     *   with the proxy server.
     */
    PROXY_NEGOTIATED(5),
    
    /**
     * The client is performing a
     *   TLS handshake.
     */
    TLS_HANDSHAKING(6),
    
    /**
     * The client has performed a
     *   TLS handshake.
     */
    TLS_HANDSHAKED(7),
    
    /**
     * The client is done with a particular
     *   {@link SocketConnectable}.
     */
    COMPLETE(8);
    
    private static final java.lang.String C_TYPE_NAME = "GSocketClientEvent";
    
    private final int value;
    
    /**
     * Create a new SocketClientEvent for the provided value
     * @param numeric value the enum value
     */
    SocketClientEvent(int value) {
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
     * Create a new SocketClientEvent for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SocketClientEvent of(int value) {
        return switch (value) {
            case 0 -> RESOLVING;
            case 1 -> RESOLVED;
            case 2 -> CONNECTING;
            case 3 -> CONNECTED;
            case 4 -> PROXY_NEGOTIATING;
            case 5 -> PROXY_NEGOTIATED;
            case 6 -> TLS_HANDSHAKING;
            case 7 -> TLS_HANDSHAKED;
            case 8 -> COMPLETE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
