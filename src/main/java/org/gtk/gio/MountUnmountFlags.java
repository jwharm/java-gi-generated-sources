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
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MountUnmountFlags or(MountUnmountFlags... masks) {
        int value = this.getValue();
        for (MountUnmountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountUnmountFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MountUnmountFlags combined(MountUnmountFlags mask, MountUnmountFlags... masks) {
        int value = mask.getValue();
        for (MountUnmountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountUnmountFlags(value);
    }
}
