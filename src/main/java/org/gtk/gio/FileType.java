package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Indicates the file's on-disk type.
 * <p>
 * On Windows systems a file will never have {@link FileType#SYMBOLIC_LINK} type;
 * use {@link FileInfo} and {@code G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK} to determine
 * whether a file is a symlink or not. This is due to the fact that NTFS does
 * not have a single filesystem object type for symbolic links - it has
 * files that symlink to files, and directories that symlink to directories.
 * {@link FileType} enumeration cannot precisely represent this important distinction,
 * which is why all Windows symlinks will continue to be reported as
 * {@link FileType#REGULAR} or {@link FileType#DIRECTORY}.
 */
public enum FileType implements io.github.jwharm.javagi.Enumeration {
    /**
     * File's type is unknown.
     */
    UNKNOWN(0),
    /**
     * File handle represents a regular file.
     */
    REGULAR(1),
    /**
     * File handle represents a directory.
     */
    DIRECTORY(2),
    /**
     * File handle represents a symbolic link
     *    (Unix systems).
     */
    SYMBOLIC_LINK(3),
    /**
     * File is a "special" file, such as a socket, fifo,
     *    block device, or character device.
     */
    SPECIAL(4),
    /**
     * File is a shortcut (Windows systems).
     */
    SHORTCUT(5),
    /**
     * File is a mountable location.
     */
    MOUNTABLE(6);
    
    private static final java.lang.String C_TYPE_NAME = "GFileType";
    
    private final int value;
    FileType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FileType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> REGULAR;
            case 2 -> DIRECTORY;
            case 3 -> SYMBOLIC_LINK;
            case 4 -> SPECIAL;
            case 5 -> SHORTCUT;
            case 6 -> MOUNTABLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
