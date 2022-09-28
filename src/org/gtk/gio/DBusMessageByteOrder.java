package org.gtk.gio;

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 */
public class DBusMessageByteOrder {

    /**
     * The byte order is big endian.
     */
    public static final DBusMessageByteOrder BIG_ENDIAN = new DBusMessageByteOrder(66);
    
    /**
     * The byte order is little endian.
     */
    public static final DBusMessageByteOrder LITTLE_ENDIAN = new DBusMessageByteOrder(108);
    
    private int value;
    
    public DBusMessageByteOrder(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusMessageByteOrder[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
