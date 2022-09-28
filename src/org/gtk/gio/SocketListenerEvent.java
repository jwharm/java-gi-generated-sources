package org.gtk.gio;

/**
 * Describes an event occurring on a {@link SocketListener}. See the
 * {@link SocketListener}::event signal for more details.
 * <p>
 * Additional values may be added to this type in the future.
 */
public class SocketListenerEvent {

    /**
     * The listener is about to bind a socket.
     */
    public static final SocketListenerEvent BINDING = new SocketListenerEvent(0);
    
    /**
     * The listener has bound a socket.
     */
    public static final SocketListenerEvent BOUND = new SocketListenerEvent(1);
    
    /**
     * The listener is about to start
     *    listening on this socket.
     */
    public static final SocketListenerEvent LISTENING = new SocketListenerEvent(2);
    
    /**
     * The listener is now listening on
     *   this socket.
     */
    public static final SocketListenerEvent LISTENED = new SocketListenerEvent(3);
    
    private int value;
    
    public SocketListenerEvent(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SocketListenerEvent[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
