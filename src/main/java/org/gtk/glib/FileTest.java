package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A test to perform on a file using g_file_test().
 */
public class FileTest extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GFileTest";
    
    /**
     * {@code true} if the file is a regular file
     *     (not a directory). Note that this test will also return {@code true}
     *     if the tested file is a symlink to a regular file.
     */
    public static final FileTest IS_REGULAR = new FileTest(1);
    
    /**
     * {@code true} if the file is a symlink.
     */
    public static final FileTest IS_SYMLINK = new FileTest(2);
    
    /**
     * {@code true} if the file is a directory.
     */
    public static final FileTest IS_DIR = new FileTest(4);
    
    /**
     * {@code true} if the file is executable.
     */
    public static final FileTest IS_EXECUTABLE = new FileTest(8);
    
    /**
     * {@code true} if the file exists. It may or may not
     *     be a regular file.
     */
    public static final FileTest EXISTS = new FileTest(16);
    
    public FileTest(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public FileTest combined(FileTest mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static FileTest combined(FileTest mask, FileTest... masks) {
        for (FileTest arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
