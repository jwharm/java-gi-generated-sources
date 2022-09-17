package org.gtk.glib;

/**
 * Specifies properties of a #GIOChannel. Some of the flags can only be
 * read with g_io_channel_get_flags(), but not changed with
 * g_io_channel_set_flags().
 */
public class IOFlags {

    /**
     * turns on append mode, corresponds to <code>O_APPEND
     * </code>    (see the documentation of the UNIX open() syscall)
     */
    public static final int APPEND = 1;
    
    /**
     * turns on nonblocking mode, corresponds to
     *     <code>O_NONBLOCK/%O_NDELAY</code> (see the documentation of the UNIX open()
     *     syscall)
     */
    public static final int NONBLOCK = 2;
    
    /**
     * indicates that the io channel is readable.
     *     This flag cannot be changed.
     */
    public static final int IS_READABLE = 4;
    
    /**
     * indicates that the io channel is writable.
     *     This flag cannot be changed.
     */
    public static final int IS_WRITABLE = 8;
    
    /**
     * a misspelled version of @G_IO_FLAG_IS_WRITABLE
     *     that existed before the spelling was fixed in GLib 2.30. It is kept
     *     here for compatibility reasons. Deprecated since 2.30
     */
    public static final int IS_WRITEABLE = 8;
    
    /**
     * indicates that the io channel is seekable,
     *     i.e. that g_io_channel_seek_position() can be used on it.
     *     This flag cannot be changed.
     */
    public static final int IS_SEEKABLE = 16;
    
    /**
     * the mask that specifies all the valid flags.
     */
    public static final int MASK = 31;
    
    /**
     * the mask of the flags that are returned from
     *     g_io_channel_get_flags()
     */
    public static final int GET_MASK = 31;
    
    /**
     * the mask of the flags that the user can modify
     *     with g_io_channel_set_flags()
     */
    public static final int SET_MASK = 3;
    
}
