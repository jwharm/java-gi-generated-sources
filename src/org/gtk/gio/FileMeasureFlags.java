package org.gtk.gio;

/**
 * Flags that can be used with g_file_measure_disk_usage().
 */
public class FileMeasureFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public FileMeasureFlags(int value) {
        super(value);
    }
    
}
