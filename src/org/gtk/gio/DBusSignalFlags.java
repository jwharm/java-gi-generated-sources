package org.gtk.gio;

/**
 * Flags used when subscribing to signals via g_dbus_connection_signal_subscribe().
 */
public class DBusSignalFlags {

    /**
     * No flags set.
     */
    public static final DBusSignalFlags NONE = new DBusSignalFlags(0);
    
    /**
     * Don't actually send the AddMatch
     * D-Bus call for this signal subscription.  This gives you more control
     * over which match rules you add (but you must add them manually).
     */
    public static final DBusSignalFlags NO_MATCH_RULE = new DBusSignalFlags(1);
    
    /**
     * Match first arguments that
     * contain a bus or interface name with the given namespace.
     */
    public static final DBusSignalFlags MATCH_ARG0_NAMESPACE = new DBusSignalFlags(2);
    
    /**
     * Match first arguments that
     * contain an object path that is either equivalent to the given path,
     * or one of the paths is a subpath of the other.
     */
    public static final DBusSignalFlags MATCH_ARG0_PATH = new DBusSignalFlags(4);
    
    private int value;
    
    public DBusSignalFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusSignalFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusSignalFlags combined(DBusSignalFlags mask) {
        return new DBusSignalFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusSignalFlags combined(DBusSignalFlags mask, DBusSignalFlags... masks) {
        int value = mask.getValue();
        for (DBusSignalFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusSignalFlags(value);
    }
    
}
