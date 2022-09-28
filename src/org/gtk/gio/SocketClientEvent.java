package org.gtk.gio;

/**
 * Describes an event occurring on a {@link SocketClient}. See the
 * {@link SocketClient}::event signal for more details.
 * <p>
 * Additional values may be added to this type in the future.
 */
public class SocketClientEvent {

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
    
    private int value;
    
    public SocketClientEvent(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SocketClientEvent[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
