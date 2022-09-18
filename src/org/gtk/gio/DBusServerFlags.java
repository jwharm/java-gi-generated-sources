package org.gtk.gio;

/**
 * Flags used when creating a {@link org.gtk.gio.DBusServer}
 */
public class DBusServerFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * All {@link org.gtk.gio.DBusServer} :new-connection
     * signals will run in separated dedicated threads (see signal for
     * details).
     */
    public static final int RUN_IN_THREAD = 1;
    
    /**
     * Allow the anonymous
     * authentication method.
     */
    public static final int AUTHENTICATION_ALLOW_ANONYMOUS = 2;
    
    /**
     * Require the UID of the
     * peer to be the same as the UID of the server when authenticating. (Since: 2.68)
     */
    public static final int AUTHENTICATION_REQUIRE_SAME_USER = 4;
    
}
