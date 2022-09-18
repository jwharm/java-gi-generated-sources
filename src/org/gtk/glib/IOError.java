package org.gtk.glib;

/**
 * {@link org.gtk.glib.IOError} is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public enum IOError {

    /**
     * no error
     */
    NONE,
    
    /**
     * an EAGAIN error occurred
     */
    AGAIN,
    
    /**
     * an EINVAL error occurred
     */
    INVAL,
    
    /**
     * another error occurred
     */
    UNKNOWN;
    
    public static IOError fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> AGAIN;
            case 2 -> INVAL;
            case 3 -> UNKNOWN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case AGAIN -> 1;
            case INVAL -> 2;
            case UNKNOWN -> 3;
        };
    }

}
