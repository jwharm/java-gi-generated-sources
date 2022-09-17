package org.gtk.gio;

/**
 * Indicates the file&#39;s on-disk type.
 * 
 * On Windows systems a file will never have {@link org.gtk.gio.FileType#SYMBOLIC_LINK} type;
 * use #GFileInfo and <code>G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK</code> to determine
 * whether a file is a symlink or not. This is due to the fact that NTFS does
 * not have a single filesystem object type for symbolic links - it has
 * files that symlink to files, and directories that symlink to directories.
 * #GFileType enumeration cannot precisely represent this important distinction,
 * which is why all Windows symlinks will continue to be reported as
 * {@link org.gtk.gio.FileType#REGULAR} or or %G_FILE_TYPE_DIRECTORY.
 */
public enum FileType {

    /**
     * File&#39;s type is unknown.
     */
    UNKNOWN,
    
    /**
     * File handle represents a regular file.
     */
    REGULAR,
    
    /**
     * File handle represents a directory.
     */
    DIRECTORY,
    
    /**
     * File handle represents a symbolic link
     *    (Unix systems).
     */
    SYMBOLIC_LINK,
    
    /**
     * File is a &#34;special&#34; file, such as a socket, fifo,
     *    block device, or character device.
     */
    SPECIAL,
    
    /**
     * File is a shortcut (Windows systems).
     */
    SHORTCUT,
    
    /**
     * File is a mountable location.
     */
    MOUNTABLE;
    
    public static FileType fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> REGULAR;
            case 2 -> DIRECTORY;
            case 3 -> SYMBOLIC_LINK;
            case 4 -> SPECIAL;
            case 5 -> SHORTCUT;
            case 6 -> MOUNTABLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case REGULAR -> 1;
            case DIRECTORY -> 2;
            case SYMBOLIC_LINK -> 3;
            case SPECIAL -> 4;
            case SHORTCUT -> 5;
            case MOUNTABLE -> 6;
        };
    }

}
