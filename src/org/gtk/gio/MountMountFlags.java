package org.gtk.gio;

/**
 * Flags used when mounting a mount.
 */
public class MountMountFlags {

    /**
     * No flags set.
     */
    public static final MountMountFlags NONE = new MountMountFlags(0);
    
    private int value;
    
    public MountMountFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MountMountFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public MountMountFlags combined(MountMountFlags mask) {
        return new MountMountFlags(this.getValue() | mask.getValue());
    }
    
    public static MountMountFlags combined(MountMountFlags mask, MountMountFlags... masks) {
        int value = mask.getValue();
        for (MountMountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountMountFlags(value);
    }
    
}
