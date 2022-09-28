package org.gtk.gdk;

/**
 * A pad feature.
 */
public class DevicePadFeature {

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
    
    private int value;
    
    public DevicePadFeature(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DevicePadFeature[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
