package org.gtk.glib;

/**
 * Specifies properties of a {@link IOChannel}. Some of the flags can only be
 * read with g_io_channel_get_flags(), but not changed with
 * g_io_channel_set_flags().
 */
public class IOFlags {

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
    
    private int value;
    
    public IOFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public IOFlags combined(IOFlags mask) {
        return new IOFlags(this.getValue() | mask.getValue());
    }
    
    public static IOFlags combined(IOFlags mask, IOFlags... masks) {
        int value = mask.getValue();
        for (IOFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IOFlags(value);
    }
    
}
