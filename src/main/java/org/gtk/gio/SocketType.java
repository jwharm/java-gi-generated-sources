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
public class SocketType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Type unknown or wrong
     */
    public static final SocketType INVALID = new SocketType(0);
    
    /**
     * Reliable connection-based byte streams (e.g. TCP).
     */
    public static final SocketType STREAM = new SocketType(1);
    
    /**
     * Connectionless, unreliable datagram passing.
     *     (e.g. UDP)
     */
    public static final SocketType DATAGRAM = new SocketType(2);
    
    /**
     * Reliable connection-based passing of datagrams
     *     of fixed maximum length (e.g. SCTP).
     */
    public static final SocketType SEQPACKET = new SocketType(3);
    
    public SocketType(int value) {
        super(value);
    }
}
