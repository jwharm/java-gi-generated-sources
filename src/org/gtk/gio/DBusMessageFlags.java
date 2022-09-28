package org.gtk.gio;

/**
 * Message flags used in {@link DBusMessage}.
 */
public class DBusMessageFlags {

    /**
     * No flags set.
     */
    public static final DBusMessageFlags NONE = new DBusMessageFlags(0);
    
    /**
     * A reply is not expected.
     */
    public static final DBusMessageFlags NO_REPLY_EXPECTED = new DBusMessageFlags(1);
    
    /**
     * The bus must not launch an
     * owner for the destination name in response to this message.
     */
    public static final DBusMessageFlags NO_AUTO_START = new DBusMessageFlags(2);
    
    /**
     * If set on a method
     * call, this flag means that the caller is prepared to wait for interactive
     * authorization. Since 2.46.
     */
    public static final DBusMessageFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusMessageFlags(4);
    
    private int value;
    
    public DBusMessageFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DBusMessageFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DBusMessageFlags combined(DBusMessageFlags mask) {
        return new DBusMessageFlags(this.getValue() | mask.getValue());
    }
    
    public static DBusMessageFlags combined(DBusMessageFlags mask, DBusMessageFlags... masks) {
        int value = mask.getValue();
        for (DBusMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusMessageFlags(value);
    }
    
}
