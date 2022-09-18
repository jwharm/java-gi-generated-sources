package org.gtk.gio;

/**
 * Describes an event occurring on a {@link org.gtk.gio.SocketListener}  See the
 * {@link org.gtk.gio.SocketListener} :event signal for more details.
 * 
 * Additional values may be added to this type in the future.
 */
public enum SocketListenerEvent {

    /**
     * The listener is about to bind a socket.
     */
    BINDING,
    
    /**
     * The listener has bound a socket.
     */
    BOUND,
    
    /**
     * The listener is about to start
     *    listening on this socket.
     */
    LISTENING,
    
    /**
     * The listener is now listening on
     *   this socket.
     */
    LISTENED;
    
    public static SocketListenerEvent fromValue(int value) {
        return switch(value) {
            case 0 -> BINDING;
            case 1 -> BOUND;
            case 2 -> LISTENING;
            case 3 -> LISTENED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BINDING -> 0;
            case BOUND -> 1;
            case LISTENING -> 2;
            case LISTENED -> 3;
        };
    }

}
