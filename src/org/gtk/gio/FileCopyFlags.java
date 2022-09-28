package org.gtk.gio;

/**
 * Flags used when copying or moving files.
 */
public class FileCopyFlags {

    /**
     * No flags set.
     */
    public static final FileCopyFlags NONE = new FileCopyFlags(0);
    
    /**
     * Overwrite any existing files
     */
    public static final FileCopyFlags OVERWRITE = new FileCopyFlags(1);
    
    /**
     * Make a backup of any existing files.
     */
    public static final FileCopyFlags BACKUP = new FileCopyFlags(2);
    
    /**
     * Don't follow symlinks.
     */
    public static final FileCopyFlags NOFOLLOW_SYMLINKS = new FileCopyFlags(4);
    
    /**
     * Copy all file metadata instead of just default set used for copy (see {@link FileInfo}).
     */
    public static final FileCopyFlags ALL_METADATA = new FileCopyFlags(8);
    
    /**
     * Don't use copy and delete fallback if native move not supported.
     */
    public static final FileCopyFlags NO_FALLBACK_FOR_MOVE = new FileCopyFlags(16);
    
    /**
     * Leaves target file with default perms, instead of setting the source file perms.
     */
    public static final FileCopyFlags TARGET_DEFAULT_PERMS = new FileCopyFlags(32);
    
    private int value;
    
    public FileCopyFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileCopyFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FileCopyFlags combined(FileCopyFlags mask) {
        return new FileCopyFlags(this.getValue() | mask.getValue());
    }
    
    public static FileCopyFlags combined(FileCopyFlags mask, FileCopyFlags... masks) {
        int value = mask.getValue();
        for (FileCopyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileCopyFlags(value);
    }
    
}
