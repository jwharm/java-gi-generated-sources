package org.gtk.gio;

/**
 * Used by g_file_set_attributes_from_info() when setting file attributes.
 */
public class FileAttributeStatus {

    /**
     * Attribute value is unset (empty).
     */
    public static final FileAttributeStatus UNSET = new FileAttributeStatus(0);
    
    /**
     * Attribute value is set.
     */
    public static final FileAttributeStatus SET = new FileAttributeStatus(1);
    
    /**
     * Indicates an error in setting the value.
     */
    public static final FileAttributeStatus ERROR_SETTING = new FileAttributeStatus(2);
    
    private int value;
    
    public FileAttributeStatus(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileAttributeStatus[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
