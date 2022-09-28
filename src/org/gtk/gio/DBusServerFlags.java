package org.gtk.gio;

/**
 * Flags used when creating a {@link DBusServer}.
 */
public class DBusServerFlags {

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
    
    private int value;
    
    public DBusServerFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusServerFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusServerFlags combined(DBusServerFlags mask) {
        return new DBusServerFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusServerFlags combined(DBusServerFlags mask, DBusServerFlags... masks) {
        int value = mask.getValue();
        for (DBusServerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusServerFlags(value);
    }
    
}
