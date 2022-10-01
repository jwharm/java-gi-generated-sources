package org.gtk.glib;

/**
 * A test to perform on a file using g_file_test().
 */
public class FileTest extends io.github.jwharm.javagi.Bitfield {

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
    
}
