package org.gtk.gio;

/**
 * Flags passed to g_dbus_connection_register_subtree().
 */
public class DBusSubtreeFlags {

    /**
     * No flags set.
     */
    public static final DBusSubtreeFlags NONE = new DBusSubtreeFlags(0);
    
    /**
     * Method calls to objects not in the enumerated range
     *                                                       will still be dispatched. This is useful if you want
     *                                                       to dynamically spawn objects in the subtree.
     */
    public static final DBusSubtreeFlags DISPATCH_TO_UNENUMERATED_NODES = new DBusSubtreeFlags(1);
    
    private int value;
    
    public DBusSubtreeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusSubtreeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusSubtreeFlags combined(DBusSubtreeFlags mask) {
        return new DBusSubtreeFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusSubtreeFlags combined(DBusSubtreeFlags mask, DBusSubtreeFlags... masks) {
        int value = mask.getValue();
        for (DBusSubtreeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusSubtreeFlags(value);
    }
    
}
