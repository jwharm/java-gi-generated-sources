package org.gtk.gdk;

/**
 * Possible errors that can be returned by `GdkTexture` constructors.
 */
public enum TextureError {

    /**
     * Not enough memory to handle this image
     */
    TOO_LARGE,
    
    /**
     * The image data appears corrupted
     */
    CORRUPT_IMAGE,
    
    /**
     * The image contains features
     *   that cannot be loaded
     */
    UNSUPPORTED_CONTENT,
    
    /**
     * The image format is not supported
     */
    UNSUPPORTED_FORMAT;
    
    public static TextureError fromValue(int value) {
        return switch(value) {
            case 0 -> TOO_LARGE;
            case 1 -> CORRUPT_IMAGE;
            case 2 -> UNSUPPORTED_CONTENT;
            case 3 -> UNSUPPORTED_FORMAT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TOO_LARGE -> 0;
            case CORRUPT_IMAGE -> 1;
            case UNSUPPORTED_CONTENT -> 2;
            case UNSUPPORTED_FORMAT -> 3;
        };
    }

}
