package org.gtk.gio;

/**
 * Flags that can be used with g_file_measure_disk_usage().
 */
public class FileMeasureFlags {

    /**
     * No flags set.
     */
    public static final FileMeasureFlags NONE = new FileMeasureFlags(0);
    
    /**
     * Report any error encountered
     *   while traversing the directory tree.  Normally errors are only
     *   reported for the toplevel file.
     */
    public static final FileMeasureFlags REPORT_ANY_ERROR = new FileMeasureFlags(2);
    
    /**
     * Tally usage based on apparent file
     *   sizes.  Normally, the block-size is used, if available, as this is a
     *   more accurate representation of disk space used.
     *   Compare with {@code du --apparent-size}.
     */
    public static final FileMeasureFlags APPARENT_SIZE = new FileMeasureFlags(4);
    
    /**
     * Do not cross mount point boundaries.
     *   Compare with {@code du -x}.
     */
    public static final FileMeasureFlags NO_XDEV = new FileMeasureFlags(8);
    
    private int value;
    
    public FileMeasureFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(FileMeasureFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public FileMeasureFlags combined(FileMeasureFlags mask) {
        return new FileMeasureFlags(this.getValue() | mask.getValue());
    }
    
    public static FileMeasureFlags combined(FileMeasureFlags mask, FileMeasureFlags... masks) {
        int value = mask.getValue();
        for (FileMeasureFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileMeasureFlags(value);
    }
    
}
