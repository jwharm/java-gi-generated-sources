package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GMountUnmountFlags";
    
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
