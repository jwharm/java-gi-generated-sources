package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags which allow a module to specify further details about the supported
 * operations.
 * @version 2.2
 */
public class PixbufFormatFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GdkPixbufFormatFlags";
    
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
    
    /**
     * Create a new PixbufFormatFlags with the provided value
     */
    public PixbufFormatFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PixbufFormatFlags or(PixbufFormatFlags... masks) {
        int value = this.getValue();
        for (PixbufFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PixbufFormatFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PixbufFormatFlags combined(PixbufFormatFlags mask, PixbufFormatFlags... masks) {
        int value = mask.getValue();
        for (PixbufFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PixbufFormatFlags(value);
    }
}
