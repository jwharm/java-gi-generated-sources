package org.gtk.gio;

/**
 * Message flags used in {@link DBusMessage}.
 */
public class DBusMessageFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusMessageFlags NONE = new DBusMessageFlags(0);
    
    /**
     * A reply is not expected.
     */
    public static final DBusMessageFlags NO_REPLY_EXPECTED = new DBusMessageFlags(1);
    
    /**
     * The bus must not launch an
     * owner for the destination name in response to this message.
     */
    public static final DBusMessageFlags NO_AUTO_START = new DBusMessageFlags(2);
    
    /**
     * If set on a method
     * call, this flag means that the caller is prepared to wait for interactive
     * authorization. Since 2.46.
     */
    public static final DBusMessageFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusMessageFlags(4);
    
    public DBusMessageFlags(int value) {
        super(value);
    }
    
}