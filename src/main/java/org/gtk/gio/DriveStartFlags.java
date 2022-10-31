package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when starting a drive.
 * @version 2.22
 */
public class DriveStartFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDriveStartFlags";
    
    /**
     * No flags set.
     */
    public static final DriveStartFlags NONE = new DriveStartFlags(0);
    
    public DriveStartFlags(int value) {
        super(value);
    }
}
