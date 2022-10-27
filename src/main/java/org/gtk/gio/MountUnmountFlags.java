package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when an unmounting a mount.
 */
public class MountUnmountFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
