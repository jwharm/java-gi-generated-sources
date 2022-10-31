package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 * <p>
 * To make them easier to use, their numerical values are the actual degrees.
 */
public class PixbufRotation extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufRotation";
    
    /**
     * No rotation.
     */
    public static final PixbufRotation NONE = new PixbufRotation(0);
    
    /**
     * Rotate by 90 degrees.
     */
    public static final PixbufRotation COUNTERCLOCKWISE = new PixbufRotation(90);
    
    /**
     * Rotate by 180 degrees.
     */
    public static final PixbufRotation UPSIDEDOWN = new PixbufRotation(180);
    
    /**
     * Rotate by 270 degrees.
     */
    public static final PixbufRotation CLOCKWISE = new PixbufRotation(270);
    
    public PixbufRotation(int value) {
        super(value);
    }
}
