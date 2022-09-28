package org.gtk.gio;

/**
 * Flags used when an operation may create a file.
 */
public class FileCreateFlags {

    /**
     * No flags set.
     */
    public static final FileCreateFlags NONE = new FileCreateFlags(0);
    
    /**
     * Create a file that can only be
     *    accessed by the current user.
     */
    public static final FileCreateFlags PRIVATE = new FileCreateFlags(1);
    
    /**
     * Replace the destination
     *    as if it didn't exist before. Don't try to keep any old
     *    permissions, replace instead of following links. This
     *    is generally useful if you're doing a "copy over"
     *    rather than a "save new version of" replace operation.
     *    You can think of it as "unlink destination" before
     *    writing to it, although the implementation may not
     *    be exactly like that. This flag can only be used with
     *    g_file_replace() and its variants, including g_file_replace_contents().
     *    Since 2.20
     */
    public static final FileCreateFlags REPLACE_DESTINATION = new FileCreateFlags(2);
    
    private int value;
    
    public FileCreateFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileCreateFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FileCreateFlags combined(FileCreateFlags mask) {
        return new FileCreateFlags(this.getValue() | mask.getValue());
    }
    
    public static FileCreateFlags combined(FileCreateFlags mask, FileCreateFlags... masks) {
        int value = mask.getValue();
        for (FileCreateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileCreateFlags(value);
    }
    
}
