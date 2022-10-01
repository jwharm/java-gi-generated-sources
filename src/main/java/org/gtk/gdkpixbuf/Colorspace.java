package org.gtk.gdkpixbuf;

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 * <p>
 * Currently only RGB is supported.
 */
public class Colorspace extends io.github.jwharm.javagi.Enumeration {

    /**
     * Indicates a red/green/blue additive color space.
     */
    public static final Colorspace RGB = new Colorspace(0);
    
    public Colorspace(int value) {
        super(value);
    }
    
}
