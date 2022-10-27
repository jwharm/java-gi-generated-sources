package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DeviceType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
