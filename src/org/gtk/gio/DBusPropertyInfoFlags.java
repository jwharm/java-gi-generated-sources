package org.gtk.gio;

/**
 * Flags describing the access control of a D-Bus property.
 */
public class DBusPropertyInfoFlags {

    /**
     * No flags set.
     */
    public static final DBusPropertyInfoFlags NONE = new DBusPropertyInfoFlags(0);
    
    /**
     * Property is readable.
     */
    public static final DBusPropertyInfoFlags READABLE = new DBusPropertyInfoFlags(1);
    
    /**
     * Property is writable.
     */
    public static final DBusPropertyInfoFlags WRITABLE = new DBusPropertyInfoFlags(2);
    
    private int value;
    
    public DBusPropertyInfoFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusPropertyInfoFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusPropertyInfoFlags combined(DBusPropertyInfoFlags mask) {
        return new DBusPropertyInfoFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusPropertyInfoFlags combined(DBusPropertyInfoFlags mask, DBusPropertyInfoFlags... masks) {
        int value = mask.getValue();
        for (DBusPropertyInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusPropertyInfoFlags(value);
    }
    
}
