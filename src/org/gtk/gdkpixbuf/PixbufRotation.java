package org.gtk.gdkpixbuf;

/**
 * The possible rotations which can be passed to gdk_pixbuf_rotate_simple().
 * <p>
 * To make them easier to use, their numerical values are the actual degrees.
 */
public enum PixbufRotation {

    /**
     * No rotation.
     */
    NONE,
    
    /**
     * Rotate by 90 degrees.
     */
    COUNTERCLOCKWISE,
    
    /**
     * Rotate by 180 degrees.
     */
    UPSIDEDOWN,
    
    /**
     * Rotate by 270 degrees.
     */
    CLOCKWISE;
    
    public static PixbufRotation fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 90 -> COUNTERCLOCKWISE;
            case 180 -> UPSIDEDOWN;
            case 270 -> CLOCKWISE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case COUNTERCLOCKWISE -> 90;
            case UPSIDEDOWN -> 180;
            case CLOCKWISE -> 270;
        };
    }

}
