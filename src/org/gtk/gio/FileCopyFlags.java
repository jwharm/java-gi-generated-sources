package org.gtk.gio;

/**
 * Flags used when copying or moving files.
 */
public class FileCopyFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Overwrite any existing files
     */
    public static final int OVERWRITE = 1;
    
    /**
     * Make a backup of any existing files.
     */
    public static final int BACKUP = 2;
    
    /**
     * Don&#39;t follow symlinks.
     */
    public static final int NOFOLLOW_SYMLINKS = 4;
    
    /**
     * Copy all file metadata instead of just default set used for copy (see #GFileInfo).
     */
    public static final int ALL_METADATA = 8;
    
    /**
     * Don&#39;t use copy and delete fallback if native move not supported.
     */
    public static final int NO_FALLBACK_FOR_MOVE = 16;
    
    /**
     * Leaves target file with default perms, instead of setting the source file perms.
     */
    public static final int TARGET_DEFAULT_PERMS = 32;
    
}
