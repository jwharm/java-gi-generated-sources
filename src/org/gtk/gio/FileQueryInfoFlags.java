package org.gtk.gio;

/**
 * Flags used when querying a {@link FileInfo}.
 */
public class FileQueryInfoFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Don't follow symlinks.
     */
    public static final int NOFOLLOW_SYMLINKS = 1;
    
}
