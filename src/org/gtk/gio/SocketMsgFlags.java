package org.gtk.gio;

/**
 * Flags used in g_socket_receive_message() and g_socket_send_message().
 * The flags listed in the enum are some commonly available flags, but the
 * values used for them are the same as on the platform, and any other flags
 * are passed in/out as is. So to use a platform specific flag, just include
 * the right system header and pass in the flag.
 */
public class SocketMsgFlags {

    /**
     * No flags.
     */
    public static final int NONE = 0;
    
    /**
     * Request to send/receive out of band data.
     */
    public static final int OOB = 1;
    
    /**
     * Read data from the socket without removing it from
     *     the queue.
     */
    public static final int PEEK = 2;
    
    /**
     * Don&#39;t use a gateway to send out the packet,
     *     only send to hosts on directly connected networks.
     */
    public static final int DONTROUTE = 4;
    
}
