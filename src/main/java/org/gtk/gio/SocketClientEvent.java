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
public class SocketClientEvent extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * The client is doing a DNS lookup.
     */
    public static final SocketClientEvent RESOLVING = new SocketClientEvent(0);
    
    /**
     * The client has completed a DNS lookup.
     */
    public static final SocketClientEvent RESOLVED = new SocketClientEvent(1);
    
    /**
     * The client is connecting to a remote
     *   host (either a proxy or the destination server).
     */
    public static final SocketClientEvent CONNECTING = new SocketClientEvent(2);
    
    /**
     * The client has connected to a remote
     *   host.
     */
    public static final SocketClientEvent CONNECTED = new SocketClientEvent(3);
    
    /**
     * The client is negotiating
     *   with a proxy to connect to the destination server.
     */
    public static final SocketClientEvent PROXY_NEGOTIATING = new SocketClientEvent(4);
    
    /**
     * The client has negotiated
     *   with the proxy server.
     */
    public static final SocketClientEvent PROXY_NEGOTIATED = new SocketClientEvent(5);
    
    /**
     * The client is performing a
     *   TLS handshake.
     */
    public static final SocketClientEvent TLS_HANDSHAKING = new SocketClientEvent(6);
    
    /**
     * The client has performed a
     *   TLS handshake.
     */
    public static final SocketClientEvent TLS_HANDSHAKED = new SocketClientEvent(7);
    
    /**
     * The client is done with a particular
     *   {@link SocketConnectable}.
     */
    public static final SocketClientEvent COMPLETE = new SocketClientEvent(8);
    
    public SocketClientEvent(int value) {
        super(value);
    }
}
