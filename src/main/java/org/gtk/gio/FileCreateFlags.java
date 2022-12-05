package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when an operation may create a file.
 */
public class FileCreateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileCreateFlags";
    
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
    
    public FileCreateFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileCreateFlags or(FileCreateFlags mask) {
        return new FileCreateFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileCreateFlags combined(FileCreateFlags mask, FileCreateFlags... masks) {
        int value = mask.getValue();        for (FileCreateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileCreateFlags(value);
    }
}
