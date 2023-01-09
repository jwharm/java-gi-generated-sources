package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when copying or moving files.
 */
public class FileCopyFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileCopyFlags";
    
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
    
    /**
     * Create a new FileCopyFlags with the provided value
     */
    public FileCopyFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileCopyFlags or(FileCopyFlags... masks) {
        int value = this.getValue();
        for (FileCopyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileCopyFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileCopyFlags combined(FileCopyFlags mask, FileCopyFlags... masks) {
        int value = mask.getValue();
        for (FileCopyFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileCopyFlags(value);
    }
}
