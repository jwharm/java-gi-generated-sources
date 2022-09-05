package org.gtk.gio;

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Unmount even if there are outstanding
     *  file operations on the mount.
     */
    public static final int FORCE = 1;
    
}
