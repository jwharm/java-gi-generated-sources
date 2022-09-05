package org.gtk.glib;

/**
 * A test to perform on a file using g_file_test().
 */
public class FileTest {

    /**
     * %TRUE if the file is a regular file
     *     (not a directory). Note that this test will also return %TRUE
     *     if the tested file is a symlink to a regular file.
     */
    public static final int IS_REGULAR = 1;
    
    /**
     * %TRUE if the file is a symlink.
     */
    public static final int IS_SYMLINK = 2;
    
    /**
     * %TRUE if the file is a directory.
     */
    public static final int IS_DIR = 4;
    
    /**
     * %TRUE if the file is executable.
     */
    public static final int IS_EXECUTABLE = 8;
    
    /**
     * %TRUE if the file exists. It may or may not
     *     be a regular file.
     */
    public static final int EXISTS = 16;
    
}
