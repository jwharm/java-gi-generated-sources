package org.gtk.gio;

/**
 * Message flags used in {@link org.gtk.gio.DBusMessage}
 */
public class DBusMessageFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * A reply is not expected.
     */
    public static final int NO_REPLY_EXPECTED = 1;
    
    /**
     * The bus must not launch an
     * owner for the destination name in response to this message.
     */
    public static final int NO_AUTO_START = 2;
    
    /**
     * If set on a method
     * call, this flag means that the caller is prepared to wait for interactive
     * authorization. Since 2.46.
     */
    public static final int ALLOW_INTERACTIVE_AUTHORIZATION = 4;
    
}
