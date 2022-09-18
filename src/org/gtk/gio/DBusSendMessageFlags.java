package org.gtk.gio;

/**
 * Flags used when sending <code>#GDBusMessages</code> on a {@link org.gtk.gio.DBusConnection}
 */
public class DBusSendMessageFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Do not automatically
     * assign a serial number from the {@link org.gtk.gio.DBusConnection} object when
     * sending a message.
     */
    public static final int PRESERVE_SERIAL = 1;
    
}
