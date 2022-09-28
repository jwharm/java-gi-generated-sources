package org.gtk.gio;

/**
 * Enumeration describing how a drive can be started/stopped.
 */
public class DriveStartStopType {

    /**
     * Unknown or drive doesn't support
     *    start/stop.
     */
    public static final DriveStartStopType UNKNOWN = new DriveStartStopType(0);
    
    /**
     * The stop method will physically
     *    shut down the drive and e.g. power down the port the drive is
     *    attached to.
     */
    public static final DriveStartStopType SHUTDOWN = new DriveStartStopType(1);
    
    /**
     * The start/stop methods are used
     *    for connecting/disconnect to the drive over the network.
     */
    public static final DriveStartStopType NETWORK = new DriveStartStopType(2);
    
    /**
     * The start/stop methods will
     *    assemble/disassemble a virtual drive from several physical
     *    drives.
     */
    public static final DriveStartStopType MULTIDISK = new DriveStartStopType(3);
    
    /**
     * The start/stop methods will
     *    unlock/lock the disk (for example using the ATA &lt;quote&gt;SECURITY
     *    UNLOCK DEVICE&lt;/quote&gt; command)
     */
    public static final DriveStartStopType PASSWORD = new DriveStartStopType(4);
    
    private int value;
    
    public DriveStartStopType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DriveStartStopType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
