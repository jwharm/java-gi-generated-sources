package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when querying a {@link FileInfo}.
 */
public class FileQueryInfoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileQueryInfoFlags";
    
    /**
     * No flags set.
     */
    public static final FileQueryInfoFlags NONE = new FileQueryInfoFlags(0);
    
    /**
     * Don't follow symlinks.
     */
    public static final FileQueryInfoFlags NOFOLLOW_SYMLINKS = new FileQueryInfoFlags(1);
    
    public FileQueryInfoFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileQueryInfoFlags or(FileQueryInfoFlags mask) {
        return new FileQueryInfoFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileQueryInfoFlags combined(FileQueryInfoFlags mask, FileQueryInfoFlags... masks) {
        int value = mask.getValue();        for (FileQueryInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileQueryInfoFlags(value);
    }
}
