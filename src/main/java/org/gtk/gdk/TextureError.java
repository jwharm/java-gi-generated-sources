package org.gtk.gdk;

/**
 * Possible errors that can be returned by {@code GdkTexture} constructors.
 */
public class TextureError extends io.github.jwharm.javagi.Enumeration {

    /**
     * Not enough memory to handle this image
     */
    public static final TextureError TOO_LARGE = new TextureError(0);
    
    /**
     * The image data appears corrupted
     */
    public static final TextureError CORRUPT_IMAGE = new TextureError(1);
    
    /**
     * The image contains features
     *   that cannot be loaded
     */
    public static final TextureError UNSUPPORTED_CONTENT = new TextureError(2);
    
    /**
     * The image format is not supported
     */
    public static final TextureError UNSUPPORTED_FORMAT = new TextureError(3);
    
    public TextureError(int value) {
        super(value);
    }
    
}
