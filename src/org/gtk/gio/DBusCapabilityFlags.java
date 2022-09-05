package org.gtk.gio;

/**
 * Capabilities negotiated with the remote peer.
 */
public class DBusCapabilityFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * The connection
     * supports exchanging UNIX file descriptors with the remote peer.
     */
    public static final int UNIX_FD_PASSING = 1;
    
}
