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
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DriveStartFlags or(DriveStartFlags... masks) {
        int value = this.getValue();
        for (DriveStartFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DriveStartFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DriveStartFlags combined(DriveStartFlags mask, DriveStartFlags... masks) {
        int value = mask.getValue();
        for (DriveStartFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DriveStartFlags(value);
    }
}
