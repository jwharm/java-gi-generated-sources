package org.gtk.gio;

/**
 * Flags used when querying a {@link FileInfo}.
 */
public class FileQueryInfoFlags extends io.github.jwharm.javagi.Bitfield {

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
    
}
