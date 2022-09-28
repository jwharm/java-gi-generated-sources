package org.gtk.gio;

/**
 * Flags used when starting a drive.
 */
public class DriveStartFlags {

    /**
     * No flags set.
     */
    public static final DriveStartFlags NONE = new DriveStartFlags(0);
    
    private int value;
    
    public DriveStartFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DriveStartFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DriveStartFlags combined(DriveStartFlags mask) {
        return new DriveStartFlags(this.getValue() | mask.getValue());
    }
    
    public static DriveStartFlags combined(DriveStartFlags mask, DriveStartFlags... masks) {
        int value = mask.getValue();
        for (DriveStartFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DriveStartFlags(value);
    }
    
}
