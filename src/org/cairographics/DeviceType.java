package org.cairographics;

public class DeviceType {

    public static final DeviceType DRM = new DeviceType(0);
    
    public static final DeviceType GL = new DeviceType(1);
    
    public static final DeviceType SCRIPT = new DeviceType(2);
    
    public static final DeviceType XCB = new DeviceType(3);
    
    public static final DeviceType XLIB = new DeviceType(4);
    
    public static final DeviceType XML = new DeviceType(5);
    
    public static final DeviceType COGL = new DeviceType(6);
    
    public static final DeviceType WIN32 = new DeviceType(7);
    
    public static final DeviceType INVALID = new DeviceType(-1);
    
    private int value;
    
    public DeviceType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DeviceType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
