package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class GLDisplayType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstGLDisplayType";
    
    /**
     * no display type
     */
    public static final GLDisplayType NONE = new GLDisplayType(0);
    
    /**
     * X11 display
     */
    public static final GLDisplayType X11 = new GLDisplayType(1);
    
    /**
     * Wayland display
     */
    public static final GLDisplayType WAYLAND = new GLDisplayType(2);
    
    /**
     * Cocoa display
     */
    public static final GLDisplayType COCOA = new GLDisplayType(4);
    
    /**
     * Win32 display
     */
    public static final GLDisplayType WIN32 = new GLDisplayType(8);
    
    /**
     * Dispmanx display
     */
    public static final GLDisplayType DISPMANX = new GLDisplayType(16);
    
    /**
     * EGL display
     */
    public static final GLDisplayType EGL = new GLDisplayType(32);
    
    /**
     * Vivante Framebuffer display
     */
    public static final GLDisplayType VIV_FB = new GLDisplayType(64);
    
    /**
     * Mesa3D GBM display
     */
    public static final GLDisplayType GBM = new GLDisplayType(128);
    
    /**
     * EGLDevice display.
     */
    public static final GLDisplayType EGL_DEVICE = new GLDisplayType(256);
    
    /**
     * EAGL display.
     */
    public static final GLDisplayType EAGL = new GLDisplayType(512);
    
    /**
     * WinRT display.
     */
    public static final GLDisplayType WINRT = new GLDisplayType(1024);
    
    /**
     * Android display.
     */
    public static final GLDisplayType ANDROID = new GLDisplayType(2048);
    
    /**
     * any display type
     */
    public static final GLDisplayType ANY = new GLDisplayType(-1);
    
    public GLDisplayType(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public GLDisplayType or(GLDisplayType mask) {
        return new GLDisplayType(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static GLDisplayType combined(GLDisplayType mask, GLDisplayType... masks) {
        int value = mask.getValue();        for (GLDisplayType arg : masks) {
            value |= arg.getValue();
        }
        return new GLDisplayType(value);
    }
}
