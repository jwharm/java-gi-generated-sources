package org.cairographics;

public enum SurfaceType {

    IMAGE,
    
    PDF,
    
    PS,
    
    XLIB,
    
    XCB,
    
    GLITZ,
    
    QUARTZ,
    
    WIN32,
    
    BEOS,
    
    DIRECTFB,
    
    SVG,
    
    OS2,
    
    WIN32_PRINTING,
    
    QUARTZ_IMAGE,
    
    SCRIPT,
    
    QT,
    
    RECORDING,
    
    VG,
    
    GL,
    
    DRM,
    
    TEE,
    
    XML,
    
    SKIA,
    
    SUBSURFACE,
    
    COGL;
    
    public static SurfaceType fromValue(int value) {
        return switch(value) {
            case 0 -> IMAGE;
            case 1 -> PDF;
            case 2 -> PS;
            case 3 -> XLIB;
            case 4 -> XCB;
            case 5 -> GLITZ;
            case 6 -> QUARTZ;
            case 7 -> WIN32;
            case 8 -> BEOS;
            case 9 -> DIRECTFB;
            case 10 -> SVG;
            case 11 -> OS2;
            case 12 -> WIN32_PRINTING;
            case 13 -> QUARTZ_IMAGE;
            case 14 -> SCRIPT;
            case 15 -> QT;
            case 16 -> RECORDING;
            case 17 -> VG;
            case 18 -> GL;
            case 19 -> DRM;
            case 20 -> TEE;
            case 21 -> XML;
            case 22 -> SKIA;
            case 23 -> SUBSURFACE;
            case 24 -> COGL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IMAGE -> 0;
            case PDF -> 1;
            case PS -> 2;
            case XLIB -> 3;
            case XCB -> 4;
            case GLITZ -> 5;
            case QUARTZ -> 6;
            case WIN32 -> 7;
            case BEOS -> 8;
            case DIRECTFB -> 9;
            case SVG -> 10;
            case OS2 -> 11;
            case WIN32_PRINTING -> 12;
            case QUARTZ_IMAGE -> 13;
            case SCRIPT -> 14;
            case QT -> 15;
            case RECORDING -> 16;
            case VG -> 17;
            case GL -> 18;
            case DRM -> 19;
            case TEE -> 20;
            case XML -> 21;
            case SKIA -> 22;
            case SUBSURFACE -> 23;
            case COGL -> 24;
        };
    }

}
