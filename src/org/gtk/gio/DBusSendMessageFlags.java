package org.gtk.gio;

/**
 * Flags used when sending #GDBusMessages on a #GDBusConnection.
 */
public class DBusSendMessageFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Do not automatically
     * assign a serial number from the #GDBusConnection object when
     * sending a message.
     */
    public static final int PRESERVE_SERIAL = 1;
    
}
