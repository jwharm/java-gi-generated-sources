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
public class FileType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GFileType";
    
    /**
     * File's type is unknown.
     */
    public static final FileType UNKNOWN = new FileType(0);
    
    /**
     * File handle represents a regular file.
     */
    public static final FileType REGULAR = new FileType(1);
    
    /**
     * File handle represents a directory.
     */
    public static final FileType DIRECTORY = new FileType(2);
    
    /**
     * File handle represents a symbolic link
     *    (Unix systems).
     */
    public static final FileType SYMBOLIC_LINK = new FileType(3);
    
    /**
     * File is a "special" file, such as a socket, fifo,
     *    block device, or character device.
     */
    public static final FileType SPECIAL = new FileType(4);
    
    /**
     * File is a shortcut (Windows systems).
     */
    public static final FileType SHORTCUT = new FileType(5);
    
    /**
     * File is a mountable location.
     */
    public static final FileType MOUNTABLE = new FileType(6);
    
    public FileType(int value) {
        super(value);
    }
}
