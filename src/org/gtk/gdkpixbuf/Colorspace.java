package org.gtk.gdkpixbuf;

/**
 * This enumeration defines the color spaces that are supported by
 * the gdk-pixbuf library.
 * 
 * Currently only RGB is supported.
 */
public enum Colorspace {

    /**
     * Indicates a red/green/blue additive color space.
     */
    RGB;
    
    public static Colorspace fromValue(int value) {
        return switch(value) {
            case 0 -> RGB;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case RGB -> 0;
        };
    }

}
