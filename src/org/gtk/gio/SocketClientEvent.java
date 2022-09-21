package org.gtk.gio;

/**
 * Describes an event occurring on a {@link SocketClient}. See the
 * {@link SocketClient}::event signal for more details.
 * <p>
 * Additional values may be added to this type in the future.
 */
public enum SocketClientEvent {

    /**
     * The client is doing a DNS lookup.
     */
    RESOLVING,
    
    /**
     * The client has completed a DNS lookup.
     */
    RESOLVED,
    
    /**
     * The client is connecting to a remote
     *   host (either a proxy or the destination server).
     */
    CONNECTING,
    
    /**
     * The client has connected to a remote
     *   host.
     */
    CONNECTED,
    
    /**
     * The client is negotiating
     *   with a proxy to connect to the destination server.
     */
    PROXY_NEGOTIATING,
    
    /**
     * The client has negotiated
     *   with the proxy server.
     */
    PROXY_NEGOTIATED,
    
    /**
     * The client is performing a
     *   TLS handshake.
     */
    TLS_HANDSHAKING,
    
    /**
     * The client has performed a
     *   TLS handshake.
     */
    TLS_HANDSHAKED,
    
    /**
     * The client is done with a particular
     *   {@link SocketConnectable}.
     */
    COMPLETE;
    
    public static SocketClientEvent fromValue(int value) {
        return switch(value) {
            case 0 -> RESOLVING;
            case 1 -> RESOLVED;
            case 2 -> CONNECTING;
            case 3 -> CONNECTED;
            case 4 -> PROXY_NEGOTIATING;
            case 5 -> PROXY_NEGOTIATED;
            case 6 -> TLS_HANDSHAKING;
            case 7 -> TLS_HANDSHAKED;
            case 8 -> COMPLETE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case RESOLVING -> 0;
            case RESOLVED -> 1;
            case CONNECTING -> 2;
            case CONNECTED -> 3;
            case PROXY_NEGOTIATING -> 4;
            case PROXY_NEGOTIATED -> 5;
            case TLS_HANDSHAKING -> 6;
            case TLS_HANDSHAKED -> 7;
            case COMPLETE -> 8;
        };
    }

}
