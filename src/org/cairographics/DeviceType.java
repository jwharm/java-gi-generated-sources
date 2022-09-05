package org.cairographics;

public enum DeviceType {

    DRM,
    
    GL,
    
    SCRIPT,
    
    XCB,
    
    XLIB,
    
    XML,
    
    COGL,
    
    WIN32,
    
    INVALID;
    
    public static DeviceType fromValue(int value) {
        return switch(value) {
            case 0 -> DRM;
            case 1 -> GL;
            case 2 -> SCRIPT;
            case 3 -> XCB;
            case 4 -> XLIB;
            case 5 -> XML;
            case 6 -> COGL;
            case 7 -> WIN32;
            case -1 -> INVALID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DRM -> 0;
            case GL -> 1;
            case SCRIPT -> 2;
            case XCB -> 3;
            case XLIB -> 4;
            case XML -> 5;
            case COGL -> 6;
            case WIN32 -> 7;
            case INVALID -> -1;
        };
    }

}
