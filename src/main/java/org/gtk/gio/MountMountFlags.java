package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when mounting a mount.
 */
public class MountMountFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GMountMountFlags";
    
    /**
     * No flags set.
     */
    public static final MountMountFlags NONE = new MountMountFlags(0);
    
    /**
     * Create a new MountMountFlags with the provided value
     */
    public MountMountFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MountMountFlags or(MountMountFlags... masks) {
        int value = this.getValue();
        for (MountMountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountMountFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MountMountFlags combined(MountMountFlags mask, MountMountFlags... masks) {
        int value = mask.getValue();
        for (MountMountFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MountMountFlags(value);
    }
}
