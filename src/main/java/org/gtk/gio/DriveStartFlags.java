package org.gtk.gio;

/**
 * Flags used when starting a drive.
 */
public class DriveStartFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DriveStartFlags NONE = new DriveStartFlags(0);
    
    public DriveStartFlags(int value) {
        super(value);
    }
    
}
