package org.gtk.gio;

/**
 * Capabilities negotiated with the remote peer.
 */
public class DBusCapabilityFlags {

    /**
     * No flags set.
     */
    public static final DBusCapabilityFlags NONE = new DBusCapabilityFlags(0);
    
    /**
     * The connection
     * supports exchanging UNIX file descriptors with the remote peer.
     */
    public static final DBusCapabilityFlags UNIX_FD_PASSING = new DBusCapabilityFlags(1);
    
    private int value;
    
    public DBusCapabilityFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusCapabilityFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusCapabilityFlags combined(DBusCapabilityFlags mask) {
        return new DBusCapabilityFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusCapabilityFlags combined(DBusCapabilityFlags mask, DBusCapabilityFlags... masks) {
        int value = mask.getValue();
        for (DBusCapabilityFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusCapabilityFlags(value);
    }
    
}
