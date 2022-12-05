package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes an event occurring on a {@link SocketListener}. See the
 * {@link SocketListener}::event signal for more details.
 * <p>
 * Additional values may be added to this type in the future.
 * @version 2.46
 */
public enum SocketListenerEvent implements io.github.jwharm.javagi.Enumeration {
    /**
     * The listener is about to bind a socket.
     */
    BINDING(0),
    /**
     * The listener has bound a socket.
     */
    BOUND(1),
    /**
     * The listener is about to start
     *    listening on this socket.
     */
    LISTENING(2),
    /**
     * The listener is now listening on
     *   this socket.
     */
    LISTENED(3);
    
    private static final java.lang.String C_TYPE_NAME = "GSocketListenerEvent";
    
    private final int value;
    SocketListenerEvent(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SocketListenerEvent of(int value) {
        return switch (value) {
            case 0 -> BINDING;
            case 1 -> BOUND;
            case 2 -> LISTENING;
            case 3 -> LISTENED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
