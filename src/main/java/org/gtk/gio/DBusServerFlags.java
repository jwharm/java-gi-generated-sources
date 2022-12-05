package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when creating a {@link DBusServer}.
 * @version 2.26
 */
public class DBusServerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusServerFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusServerFlags or(DBusServerFlags mask) {
        return new DBusServerFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusServerFlags combined(DBusServerFlags mask, DBusServerFlags... masks) {
        int value = mask.getValue();        for (DBusServerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusServerFlags(value);
    }
}
