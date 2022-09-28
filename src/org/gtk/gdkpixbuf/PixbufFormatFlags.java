package org.gtk.gdkpixbuf;

/**
 * Flags which allow a module to specify further details about the supported
 * operations.
 */
public class PixbufFormatFlags {

    /**
     * the module can write out images in the format.
     */
    public static final PixbufFormatFlags WRITABLE = new PixbufFormatFlags(1);
    
    /**
     * the image format is scalable
     */
    public static final PixbufFormatFlags SCALABLE = new PixbufFormatFlags(2);
    
    /**
     * the module is threadsafe. gdk-pixbuf
     *     ignores modules that are not marked as threadsafe. (Since 2.28).
     */
    public static final PixbufFormatFlags THREADSAFE = new PixbufFormatFlags(4);
    
    private int value;
    
    public PixbufFormatFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PixbufFormatFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public PixbufFormatFlags combined(PixbufFormatFlags mask) {
        return new PixbufFormatFlags(this.getValue() | mask.getValue());
    }
    
    public static PixbufFormatFlags combined(PixbufFormatFlags mask, PixbufFormatFlags... masks) {
        int value = mask.getValue();
        for (PixbufFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PixbufFormatFlags(value);
    }
    
}
