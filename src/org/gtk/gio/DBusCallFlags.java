package org.gtk.gio;

/**
 * Flags used in g_dbus_connection_call() and similar APIs.
 */
public class DBusCallFlags {

    /**
     * No flags set.
     */
    public static final DBusCallFlags NONE = new DBusCallFlags(0);
    
    /**
     * The bus must not launch
     * an owner for the destination name in response to this method
     * invocation.
     */
    public static final DBusCallFlags NO_AUTO_START = new DBusCallFlags(1);
    
    /**
     * the caller is prepared to
     * wait for interactive authorization. Since 2.46.
     */
    public static final DBusCallFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusCallFlags(2);
    
    private int value;
    
    public DBusCallFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusCallFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusCallFlags combined(DBusCallFlags mask) {
        return new DBusCallFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusCallFlags combined(DBusCallFlags mask, DBusCallFlags... masks) {
        int value = mask.getValue();
        for (DBusCallFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusCallFlags(value);
    }
    
}
