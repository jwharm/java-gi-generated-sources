package org.gtk.gio;

/**
 * Flags used when querying a {@link FileInfo}.
 */
public class FileQueryInfoFlags {

    /**
     * No flags set.
     */
    public static final FileQueryInfoFlags NONE = new FileQueryInfoFlags(0);
    
    /**
     * Don't follow symlinks.
     */
    public static final FileQueryInfoFlags NOFOLLOW_SYMLINKS = new FileQueryInfoFlags(1);
    
    private int value;
    
    public FileQueryInfoFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileQueryInfoFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FileQueryInfoFlags combined(FileQueryInfoFlags mask) {
        return new FileQueryInfoFlags(this.getValue() | mask.getValue());
    }
    
    public static FileQueryInfoFlags combined(FileQueryInfoFlags mask, FileQueryInfoFlags... masks) {
        int value = mask.getValue();
        for (FileQueryInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileQueryInfoFlags(value);
    }
    
}
