package org.gtk.gdkpixbuf;

/**
 * Flags which allow a module to specify further details about the supported
 * operations.
 */
public class PixbufFormatFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public PixbufFormatFlags(int value) {
        super(value);
    }
    
}
