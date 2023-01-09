package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that can be used with g_file_measure_disk_usage().
 * @version 2.38
 */
public class FileMeasureFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileMeasureFlags";
    
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
    
    /**
     * Create a new FileMeasureFlags with the provided value
     */
    public FileMeasureFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileMeasureFlags or(FileMeasureFlags... masks) {
        int value = this.getValue();
        for (FileMeasureFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileMeasureFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileMeasureFlags combined(FileMeasureFlags mask, FileMeasureFlags... masks) {
        int value = mask.getValue();
        for (FileMeasureFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileMeasureFlags(value);
    }
}
