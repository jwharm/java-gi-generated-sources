package org.gtk.gio;

/**
 * Flags that can be used with g_file_measure_disk_usage().
 */
public class FileMeasureFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Report any error encountered
     *   while traversing the directory tree.  Normally errors are only
     *   reported for the toplevel file.
     */
    public static final int REPORT_ANY_ERROR = 2;
    
    /**
     * Tally usage based on apparent file
     *   sizes.  Normally, the block-size is used, if available, as this is a
     *   more accurate representation of disk space used.
     *   Compare with `du --apparent-size`.
     */
    public static final int APPARENT_SIZE = 4;
    
    /**
     * Do not cross mount point boundaries.
     *   Compare with `du -x`.
     */
    public static final int NO_XDEV = 8;
    
}
