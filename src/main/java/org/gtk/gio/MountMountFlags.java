package org.gtk.gio;

/**
 * Flags used when mounting a mount.
 */
public class MountMountFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final MountMountFlags NONE = new MountMountFlags(0);
    
    public MountMountFlags(int value) {
        super(value);
    }
    
}
