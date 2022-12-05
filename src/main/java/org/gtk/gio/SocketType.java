package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when creating a {@link Socket}. Some protocols may not implement
 * all the socket types.
 * @version 2.22
 */
public enum SocketType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Type unknown or wrong
     */
    INVALID(0),
    /**
     * Reliable connection-based byte streams (e.g. TCP).
     */
    STREAM(1),
    /**
     * Connectionless, unreliable datagram passing.
     *     (e.g. UDP)
     */
    DATAGRAM(2),
    /**
     * Reliable connection-based passing of datagrams
     *     of fixed maximum length (e.g. SCTP).
     */
    SEQPACKET(3);
    
    private static final java.lang.String C_TYPE_NAME = "GSocketType";
    
    private final int value;
    SocketType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SocketType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> STREAM;
            case 2 -> DATAGRAM;
            case 3 -> SEQPACKET;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
