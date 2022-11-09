package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in g_socket_receive_message() and g_socket_send_message().
 * The flags listed in the enum are some commonly available flags, but the
 * values used for them are the same as on the platform, and any other flags
 * are passed in/out as is. So to use a platform specific flag, just include
 * the right system header and pass in the flag.
 * @version 2.22
 */
public class SocketMsgFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GSocketMsgFlags";
    
    /**
     * No flags.
     */
    public static final SocketMsgFlags NONE = new SocketMsgFlags(0);
    
    /**
     * Request to send/receive out of band data.
     */
    public static final SocketMsgFlags OOB = new SocketMsgFlags(1);
    
    /**
     * Read data from the socket without removing it from
     *     the queue.
     */
    public static final SocketMsgFlags PEEK = new SocketMsgFlags(2);
    
    /**
     * Don't use a gateway to send out the packet,
     *     only send to hosts on directly connected networks.
     */
    public static final SocketMsgFlags DONTROUTE = new SocketMsgFlags(4);
    
    public SocketMsgFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public SocketMsgFlags combined(SocketMsgFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static SocketMsgFlags combined(SocketMsgFlags mask, SocketMsgFlags... masks) {
        for (SocketMsgFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
