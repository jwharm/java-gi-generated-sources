package org.gtk.gdkpixbuf;

/**
 * An error code in the {@code GDK_PIXBUF_ERROR} domain.
 * <p>
 * Many gdk-pixbuf operations can cause errors in this domain, or in
 * the {@code G_FILE_ERROR} domain.
 */
public class PixbufError {

    /**
     * An image file was broken somehow.
     */
    public static final PixbufError CORRUPT_IMAGE = new PixbufError(0);
    
    /**
     * Not enough memory.
     */
    public static final PixbufError INSUFFICIENT_MEMORY = new PixbufError(1);
    
    /**
     * A bad option was passed to a pixbuf save module.
     */
    public static final PixbufError BAD_OPTION = new PixbufError(2);
    
    /**
     * Unknown image type.
     */
    public static final PixbufError UNKNOWN_TYPE = new PixbufError(3);
    
    /**
     * Don't know how to perform the
     *  given operation on the type of image at hand.
     */
    public static final PixbufError UNSUPPORTED_OPERATION = new PixbufError(4);
    
    /**
     * Generic failure code, something went wrong.
     */
    public static final PixbufError FAILED = new PixbufError(5);
    
    /**
     * Only part of the animation was loaded.
     */
    public static final PixbufError INCOMPLETE_ANIMATION = new PixbufError(6);
    
    private int value;
    
    public PixbufError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PixbufError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
