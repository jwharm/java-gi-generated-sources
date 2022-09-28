package org.gtk.gio;

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final MountUnmountFlags NONE = new MountUnmountFlags(0);
    
    /**
     * Unmount even if there are outstanding
     *  file operations on the mount.
     */
    public static final MountUnmountFlags FORCE = new MountUnmountFlags(1);
    
    public MountUnmountFlags(int value) {
        super(value);
    }
    
}
