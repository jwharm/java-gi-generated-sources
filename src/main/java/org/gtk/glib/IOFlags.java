package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies properties of a {@link IOChannel}. Some of the flags can only be
 * read with g_io_channel_get_flags(), but not changed with
 * g_io_channel_set_flags().
 */
public class IOFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GIOFlags";
    
    /**
     * no special flags set. Since: 2.74
     */
    public static final IOFlags NONE = new IOFlags(0);
    
    /**
     * turns on append mode, corresponds to {@code O_APPEND}
     *     (see the documentation of the UNIX open() syscall)
     */
    public static final IOFlags APPEND = new IOFlags(1);
    
    /**
     * turns on nonblocking mode, corresponds to
     *     {@code O_NONBLOCK}/{@code O_NDELAY} (see the documentation of the UNIX open()
     *     syscall)
     */
    public static final IOFlags NONBLOCK = new IOFlags(2);
    
    /**
     * indicates that the io channel is readable.
     *     This flag cannot be changed.
     */
    public static final IOFlags IS_READABLE = new IOFlags(4);
    
    /**
     * indicates that the io channel is writable.
     *     This flag cannot be changed.
     */
    public static final IOFlags IS_WRITABLE = new IOFlags(8);
    
    /**
     * a misspelled version of {@code G_IO_FLAG_IS_WRITABLE}
     *     that existed before the spelling was fixed in GLib 2.30. It is kept
     *     here for compatibility reasons. Deprecated since 2.30
     */
    public static final IOFlags IS_WRITEABLE = new IOFlags(8);
    
    /**
     * indicates that the io channel is seekable,
     *     i.e. that g_io_channel_seek_position() can be used on it.
     *     This flag cannot be changed.
     */
    public static final IOFlags IS_SEEKABLE = new IOFlags(16);
    
    /**
     * the mask that specifies all the valid flags.
     */
    public static final IOFlags MASK = new IOFlags(31);
    
    /**
     * the mask of the flags that are returned from
     *     g_io_channel_get_flags()
     */
    public static final IOFlags GET_MASK = new IOFlags(31);
    
    /**
     * the mask of the flags that the user can modify
     *     with g_io_channel_set_flags()
     */
    public static final IOFlags SET_MASK = new IOFlags(3);
    
    /**
     * Create a new IOFlags with the provided value
     */
    public IOFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public IOFlags or(IOFlags... masks) {
        int value = this.getValue();
        for (IOFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IOFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static IOFlags combined(IOFlags mask, IOFlags... masks) {
        int value = mask.getValue();
        for (IOFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IOFlags(value);
    }
}
