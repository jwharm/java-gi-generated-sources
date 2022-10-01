package org.gtk.gio;

/**
 * Capabilities negotiated with the remote peer.
 */
public class DBusCapabilityFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusCapabilityFlags NONE = new DBusCapabilityFlags(0);
    
    /**
     * The connection
     * supports exchanging UNIX file descriptors with the remote peer.
     */
    public static final DBusCapabilityFlags UNIX_FD_PASSING = new DBusCapabilityFlags(1);
    
    public DBusCapabilityFlags(int value) {
        super(value);
    }
    
}
