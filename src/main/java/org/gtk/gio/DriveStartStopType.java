package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration describing how a drive can be started/stopped.
 * @version 2.22
 */
public enum DriveStartStopType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Unknown or drive doesn't support
     *    start/stop.
     */
    UNKNOWN(0),
    /**
     * The stop method will physically
     *    shut down the drive and e.g. power down the port the drive is
     *    attached to.
     */
    SHUTDOWN(1),
    /**
     * The start/stop methods are used
     *    for connecting/disconnect to the drive over the network.
     */
    NETWORK(2),
    /**
     * The start/stop methods will
     *    assemble/disassemble a virtual drive from several physical
     *    drives.
     */
    MULTIDISK(3),
    /**
     * The start/stop methods will
     *    unlock/lock the disk (for example using the ATA &lt;quote&gt;SECURITY
     *    UNLOCK DEVICE&lt;/quote&gt; command)
     */
    PASSWORD(4);
    
    private static final java.lang.String C_TYPE_NAME = "GDriveStartStopType";
    
    private final int value;
    DriveStartStopType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DriveStartStopType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 1 -> SHUTDOWN;
            case 2 -> NETWORK;
            case 3 -> MULTIDISK;
            case 4 -> PASSWORD;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
