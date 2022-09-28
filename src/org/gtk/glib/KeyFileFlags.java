package org.gtk.glib;

/**
 * Flags which influence the parsing.
 */
public class KeyFileFlags {

    /**
     * No flags, default behaviour
     */
    public static final KeyFileFlags NONE = new KeyFileFlags(0);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise all comments will be lost when the key file is
     *   written back.
     */
    public static final KeyFileFlags KEEP_COMMENTS = new KeyFileFlags(1);
    
    /**
     * Use this flag if you plan to write the
     *   (possibly modified) contents of the key file back to a file;
     *   otherwise only the translations for the current language will be
     *   written back.
     */
    public static final KeyFileFlags KEEP_TRANSLATIONS = new KeyFileFlags(2);
    
    private int value;
    
    public KeyFileFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(KeyFileFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public KeyFileFlags combined(KeyFileFlags mask) {
        return new KeyFileFlags(this.getValue() | mask.getValue());
    }
    
    public static KeyFileFlags combined(KeyFileFlags mask, KeyFileFlags... masks) {
        int value = mask.getValue();
        for (KeyFileFlags arg : masks) {
            value |= arg.getValue();
        }
        return new KeyFileFlags(value);
    }
    
}
