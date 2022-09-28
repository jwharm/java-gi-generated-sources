package org.cairographics;

public class DeviceType extends io.github.jwharm.javagi.Enumeration {

    public static final DeviceType DRM = new DeviceType(0);
    
    public static final DeviceType GL = new DeviceType(1);
    
    public static final DeviceType SCRIPT = new DeviceType(2);
    
    public static final DeviceType XCB = new DeviceType(3);
    
    public static final DeviceType XLIB = new DeviceType(4);
    
    public static final DeviceType XML = new DeviceType(5);
    
    public static final DeviceType COGL = new DeviceType(6);
    
    public static final DeviceType WIN32 = new DeviceType(7);
    
    public static final DeviceType INVALID = new DeviceType(-1);
    
    public DeviceType(int value) {
        super(value);
    }
    
}
