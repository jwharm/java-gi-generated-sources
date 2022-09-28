package org.gtk.glib;

/**
 * {@link IOError} is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public class IOError extends io.github.jwharm.javagi.Enumeration {

    /**
     * no error
     */
    public static final IOError NONE = new IOError(0);
    
    /**
     * an EAGAIN error occurred
     */
    public static final IOError AGAIN = new IOError(1);
    
    /**
     * an EINVAL error occurred
     */
    public static final IOError INVAL = new IOError(2);
    
    /**
     * another error occurred
     */
    public static final IOError UNKNOWN = new IOError(3);
    
    public IOError(int value) {
        super(value);
    }
    
}
