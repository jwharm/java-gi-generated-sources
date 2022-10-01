package org.cairographics;

public class SurfaceType extends io.github.jwharm.javagi.Enumeration {

    public static final SurfaceType IMAGE = new SurfaceType(0);
    
    public static final SurfaceType PDF = new SurfaceType(1);
    
    public static final SurfaceType PS = new SurfaceType(2);
    
    public static final SurfaceType XLIB = new SurfaceType(3);
    
    public static final SurfaceType XCB = new SurfaceType(4);
    
    public static final SurfaceType GLITZ = new SurfaceType(5);
    
    public static final SurfaceType QUARTZ = new SurfaceType(6);
    
    public static final SurfaceType WIN32 = new SurfaceType(7);
    
    public static final SurfaceType BEOS = new SurfaceType(8);
    
    public static final SurfaceType DIRECTFB = new SurfaceType(9);
    
    public static final SurfaceType SVG = new SurfaceType(10);
    
    public static final SurfaceType OS2 = new SurfaceType(11);
    
    public static final SurfaceType WIN32_PRINTING = new SurfaceType(12);
    
    public static final SurfaceType QUARTZ_IMAGE = new SurfaceType(13);
    
    public static final SurfaceType SCRIPT = new SurfaceType(14);
    
    public static final SurfaceType QT = new SurfaceType(15);
    
    public static final SurfaceType RECORDING = new SurfaceType(16);
    
    public static final SurfaceType VG = new SurfaceType(17);
    
    public static final SurfaceType GL = new SurfaceType(18);
    
    public static final SurfaceType DRM = new SurfaceType(19);
    
    public static final SurfaceType TEE = new SurfaceType(20);
    
    public static final SurfaceType XML = new SurfaceType(21);
    
    public static final SurfaceType SKIA = new SurfaceType(22);
    
    public static final SurfaceType SUBSURFACE = new SurfaceType(23);
    
    public static final SurfaceType COGL = new SurfaceType(24);
    
    public SurfaceType(int value) {
        super(value);
    }
    
}
