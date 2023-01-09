package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags specifying the behaviour of an attribute.
 */
public class FileAttributeInfoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeInfoFlags";
    
    /**
     * no flags set.
     */
    public static final FileAttributeInfoFlags NONE = new FileAttributeInfoFlags(0);
    
    /**
     * copy the attribute values when the file is copied.
     */
    public static final FileAttributeInfoFlags COPY_WITH_FILE = new FileAttributeInfoFlags(1);
    
    /**
     * copy the attribute values when the file is moved.
     */
    public static final FileAttributeInfoFlags COPY_WHEN_MOVED = new FileAttributeInfoFlags(2);
    
    /**
     * Create a new FileAttributeInfoFlags with the provided value
     */
    public FileAttributeInfoFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileAttributeInfoFlags or(FileAttributeInfoFlags... masks) {
        int value = this.getValue();
        for (FileAttributeInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileAttributeInfoFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileAttributeInfoFlags combined(FileAttributeInfoFlags mask, FileAttributeInfoFlags... masks) {
        int value = mask.getValue();
        for (FileAttributeInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new FileAttributeInfoFlags(value);
    }
}
