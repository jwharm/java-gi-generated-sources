package org.gtk.gio;

/**
 * Message types used in {@link DBusMessage}.
 */
public class DBusMessageType {

    /**
     * Message is of invalid type.
     */
    public static final DBusMessageType INVALID = new DBusMessageType(0);
    
    /**
     * Method call.
     */
    public static final DBusMessageType METHOD_CALL = new DBusMessageType(1);
    
    /**
     * Method reply.
     */
    public static final DBusMessageType METHOD_RETURN = new DBusMessageType(2);
    
    /**
     * Error reply.
     */
    public static final DBusMessageType ERROR = new DBusMessageType(3);
    
    /**
     * Signal emission.
     */
    public static final DBusMessageType SIGNAL = new DBusMessageType(4);
    
    private int value;
    
    public DBusMessageType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusMessageType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
