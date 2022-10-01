package org.gtk.gio;

/**
 * Flags used when sending {@code GDBusMessages} on a {@link DBusConnection}.
 */
public class DBusSendMessageFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusSendMessageFlags NONE = new DBusSendMessageFlags(0);
    
    /**
     * Do not automatically
     * assign a serial number from the {@link DBusConnection} object when
     * sending a message.
     */
    public static final DBusSendMessageFlags PRESERVE_SERIAL = new DBusSendMessageFlags(1);
    
    public DBusSendMessageFlags(int value) {
        super(value);
    }
    
}
