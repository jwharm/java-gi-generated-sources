package org.gtk.gdk;

/**
 * Possible errors that can be returned by {@code GdkTexture} constructors.
 */
public class TextureError {

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
    
    private int value;
    
    public TextureError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextureError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
