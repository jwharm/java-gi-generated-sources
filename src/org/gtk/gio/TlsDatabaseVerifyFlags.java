package org.gtk.gio;

/**
 * Flags for g_tls_database_verify_chain().
 */
public class TlsDatabaseVerifyFlags {

    /**
     * No verification flags
     */
    public static final TlsDatabaseVerifyFlags NONE = new TlsDatabaseVerifyFlags(0);
    
    private int value;
    
    public TlsDatabaseVerifyFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TlsDatabaseVerifyFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TlsDatabaseVerifyFlags combined(TlsDatabaseVerifyFlags mask) {
        return new TlsDatabaseVerifyFlags(this.getValue() | mask.getValue());
    }
    
    public static TlsDatabaseVerifyFlags combined(TlsDatabaseVerifyFlags mask, TlsDatabaseVerifyFlags... masks) {
        int value = mask.getValue();
        for (TlsDatabaseVerifyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TlsDatabaseVerifyFlags(value);
    }
    
}
