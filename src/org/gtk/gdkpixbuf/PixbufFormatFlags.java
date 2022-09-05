package org.gtk.gdkpixbuf;

/**
 * Flags which allow a module to specify further details about the supported
 * operations.
 */
public class PixbufFormatFlags {

    /**
     * the module can write out images in the format.
     */
    public static final int WRITABLE = 1;
    
    /**
     * the image format is scalable
     */
    public static final int SCALABLE = 2;
    
    /**
     * the module is threadsafe. gdk-pixbuf
     *     ignores modules that are not marked as threadsafe. (Since 2.28).
     */
    public static final int THREADSAFE = 4;
    
}
