package org.gtk.gdkpixbuf;

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 * <p>
 * To make them easier to use, their numerical values are the actual degrees.
 */
public class PixbufRotation extends io.github.jwharm.javagi.Enumeration {

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
