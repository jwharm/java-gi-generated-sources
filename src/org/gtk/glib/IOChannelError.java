package org.gtk.glib;

/**
 * Error codes returned by {@link org.gtk.glib.IOChannel} operations.
 */
public enum IOChannelError {

    /**
     * File too large.
     */
    FBIG,
    
    /**
     * Invalid argument.
     */
    INVAL,
    
    /**
     * IO error.
     */
    IO,
    
    /**
     * File is a directory.
     */
    ISDIR,
    
    /**
     * No space left on device.
     */
    NOSPC,
    
    /**
     * No such device or address.
     */
    NXIO,
    
    /**
     * Value too large for defined datatype.
     */
    OVERFLOW,
    
    /**
     * Broken pipe.
     */
    PIPE,
    
    /**
     * Some other error.
     */
    FAILED;
    
    public static IOChannelError fromValue(int value) {
        return switch(value) {
            case 0 -> FBIG;
            case 1 -> INVAL;
            case 2 -> IO;
            case 3 -> ISDIR;
            case 4 -> NOSPC;
            case 5 -> NXIO;
            case 6 -> OVERFLOW;
            case 7 -> PIPE;
            case 8 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FBIG -> 0;
            case INVAL -> 1;
            case IO -> 2;
            case ISDIR -> 3;
            case NOSPC -> 4;
            case NXIO -> 5;
            case OVERFLOW -> 6;
            case PIPE -> 7;
            case FAILED -> 8;
        };
    }

}
