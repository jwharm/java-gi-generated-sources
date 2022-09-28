package org.gtk.gio;

/**
 * Flags used when constructing a {@link DBusObjectManagerClient}.
 */
public class DBusObjectManagerClientFlags {

    /**
     * No flags set.
     */
    public static final DBusObjectManagerClientFlags NONE = new DBusObjectManagerClientFlags(0);
    
    /**
     * If not set and the
     *   manager is for a well-known name, then request the bus to launch
     *   an owner for the name if no-one owns the name. This flag can only
     *   be used in managers for well-known names.
     */
    public static final DBusObjectManagerClientFlags DO_NOT_AUTO_START = new DBusObjectManagerClientFlags(1);
    
    private int value;
    
    public DBusObjectManagerClientFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusObjectManagerClientFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusObjectManagerClientFlags combined(DBusObjectManagerClientFlags mask) {
        return new DBusObjectManagerClientFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusObjectManagerClientFlags combined(DBusObjectManagerClientFlags mask, DBusObjectManagerClientFlags... masks) {
        int value = mask.getValue();
        for (DBusObjectManagerClientFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusObjectManagerClientFlags(value);
    }
    
}
