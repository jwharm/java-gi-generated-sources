package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum DeviceType implements io.github.jwharm.javagi.Enumeration {
    DRM(0),
    GL(1),
    SCRIPT(2),
    XCB(3),
    XLIB(4),
    XML(5),
    COGL(6),
    WIN32(7),
    INVALID(-1);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_device_type_t";
    
    private final int value;
    DeviceType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DeviceType of(int value) {
        return switch (value) {
            case 0 -> DRM;
            case 1 -> GL;
            case 2 -> SCRIPT;
            case 3 -> XCB;
            case 4 -> XLIB;
            case 5 -> XML;
            case 6 -> COGL;
            case 7 -> WIN32;
            case -1 -> INVALID;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
