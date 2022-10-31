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
    
    public MountMountFlags(int value) {
        super(value);
    }
}
