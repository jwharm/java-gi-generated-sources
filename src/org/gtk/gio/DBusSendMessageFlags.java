package org.gtk.gio;

/**
 * Flags used when sending {@code GDBusMessages} on a {@link DBusConnection}.
 */
public class DBusSendMessageFlags {

    /**
     * No flags set.
     */
    public static final DBusSendMessageFlags NONE = new DBusSendMessageFlags(0);
    
    /**
     * Do not automatically
     * assign a serial number from the {@link DBusConnection} object when
     * sending a message.
     */
    public static final DBusSendMessageFlags PRESERVE_SERIAL = new DBusSendMessageFlags(1);
    
    private int value;
    
    public DBusSendMessageFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusSendMessageFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusSendMessageFlags combined(DBusSendMessageFlags mask) {
        return new DBusSendMessageFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusSendMessageFlags combined(DBusSendMessageFlags mask, DBusSendMessageFlags... masks) {
        int value = mask.getValue();
        for (DBusSendMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusSendMessageFlags(value);
    }
    
}
