package org.gtk.gdk;

/**
 * A pad feature.
 */
public class DevicePadFeature extends io.github.jwharm.javagi.Enumeration {

    /**
     * a button
     */
    public static final DevicePadFeature BUTTON = new DevicePadFeature(0);
    
    /**
     * a ring-shaped interactive area
     */
    public static final DevicePadFeature RING = new DevicePadFeature(1);
    
    /**
     * a straight interactive area
     */
    public static final DevicePadFeature STRIP = new DevicePadFeature(2);
    
    public DevicePadFeature(int value) {
        super(value);
    }
    
}
