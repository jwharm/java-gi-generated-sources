package org.gtk.gdkpixbuf;

/**
 * An error code in the {@code GDK_PIXBUF_ERROR} domain.
 * <p>
 * Many gdk-pixbuf operations can cause errors in this domain, or in
 * the {@code G_FILE_ERROR} domain.
 */
public enum PixbufError {

    /**
     * An image file was broken somehow.
     */
    CORRUPT_IMAGE,
    
    /**
     * Not enough memory.
     */
    INSUFFICIENT_MEMORY,
    
    /**
     * A bad option was passed to a pixbuf save module.
     */
    BAD_OPTION,
    
    /**
     * Unknown image type.
     */
    UNKNOWN_TYPE,
    
    /**
     * Don't know how to perform the
     *  given operation on the type of image at hand.
     */
    UNSUPPORTED_OPERATION,
    
    /**
     * Generic failure code, something went wrong.
     */
    FAILED,
    
    /**
     * Only part of the animation was loaded.
     */
    INCOMPLETE_ANIMATION;
    
    public static PixbufError fromValue(int value) {
        return switch(value) {
            case 0 -> CORRUPT_IMAGE;
            case 1 -> INSUFFICIENT_MEMORY;
            case 2 -> BAD_OPTION;
            case 3 -> UNKNOWN_TYPE;
            case 4 -> UNSUPPORTED_OPERATION;
            case 5 -> FAILED;
            case 6 -> INCOMPLETE_ANIMATION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CORRUPT_IMAGE -> 0;
            case INSUFFICIENT_MEMORY -> 1;
            case BAD_OPTION -> 2;
            case UNKNOWN_TYPE -> 3;
            case UNSUPPORTED_OPERATION -> 4;
            case FAILED -> 5;
            case INCOMPLETE_ANIMATION -> 6;
        };
    }

}
