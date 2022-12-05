package org.cairographics;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum SurfaceType implements io.github.jwharm.javagi.Enumeration {
    IMAGE(0),
    PDF(1),
    PS(2),
    XLIB(3),
    XCB(4),
    GLITZ(5),
    QUARTZ(6),
    WIN32(7),
    BEOS(8),
    DIRECTFB(9),
    SVG(10),
    OS2(11),
    WIN32_PRINTING(12),
    QUARTZ_IMAGE(13),
    SCRIPT(14),
    QT(15),
    RECORDING(16),
    VG(17),
    GL(18),
    DRM(19),
    TEE(20),
    XML(21),
    SKIA(22),
    SUBSURFACE(23),
    COGL(24);
    
    private static final java.lang.String C_TYPE_NAME = "cairo_surface_type_t";
    
    private final int value;
    SurfaceType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static SurfaceType of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
