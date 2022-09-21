package org.gtk.gio;

/**
 * Enumeration describing how a drive can be started/stopped.
 */
public enum DriveStartStopType {

    /**
     * Unknown or drive doesn't support
     *    start/stop.
     */
    UNKNOWN,
    
    /**
     * The stop method will physically
     *    shut down the drive and e.g. power down the port the drive is
     *    attached to.
     */
    SHUTDOWN,
    
    /**
     * The start/stop methods are used
     *    for connecting/disconnect to the drive over the network.
     */
    NETWORK,
    
    /**
     * The start/stop methods will
     *    assemble/disassemble a virtual drive from several physical
     *    drives.
     */
    MULTIDISK,
    
    /**
     * The start/stop methods will
     *    unlock/lock the disk (for example using the ATA &lt;quote&gt;SECURITY
     *    UNLOCK DEVICE&lt;/quote&gt; command)
     */
    PASSWORD;
    
    public static DriveStartStopType fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> SHUTDOWN;
            case 2 -> NETWORK;
            case 3 -> MULTIDISK;
            case 4 -> PASSWORD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case SHUTDOWN -> 1;
            case NETWORK -> 2;
            case MULTIDISK -> 3;
            case PASSWORD -> 4;
        };
    }

}
