package org.gtk.gio;

/**
 * Flags used when creating a {@link DBusServer}.
 */
public class DBusServerFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusServerFlags NONE = new DBusServerFlags(0);
    
    /**
     * All {@link DBusServer}::new-connection
     * signals will run in separated dedicated threads (see signal for
     * details).
     */
    public static final DBusServerFlags RUN_IN_THREAD = new DBusServerFlags(1);
    
    /**
     * Allow the anonymous
     * authentication method.
     */
    public static final DBusServerFlags AUTHENTICATION_ALLOW_ANONYMOUS = new DBusServerFlags(2);
    
    /**
     * Require the UID of the
     * peer to be the same as the UID of the server when authenticating. (Since: 2.68)
     */
    public static final DBusServerFlags AUTHENTICATION_REQUIRE_SAME_USER = new DBusServerFlags(4);
    
    public DBusServerFlags(int value) {
        super(value);
    }
    
}
