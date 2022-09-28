package org.gtk.gio;

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags {

    /**
     * No flags set.
     */
    public static final MountUnmountFlags NONE = new MountUnmountFlags(0);
    
    /**
     * Unmount even if there are outstanding
     *  file operations on the mount.
     */
    public static final MountUnmountFlags FORCE = new MountUnmountFlags(1);
    
    private int value;
    
    public MountUnmountFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MountUnmountFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public MountUnmountFlags combined(MountUnmountFlags mask) {
        return new MountUnmountFlags(this.getValue() | mask.getValue());
    }
    
    public static MountUnmountFlags combined(MountUnmountFlags mask, MountUnmountFlags... masks) {
        int value = mask.getValue();
        for (MountUnmountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountUnmountFlags(value);
    }
    
}
