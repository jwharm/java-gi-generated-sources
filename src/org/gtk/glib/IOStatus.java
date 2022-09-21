package org.gtk.glib;

/**
 * Statuses returned by most of the {@link IOFuncs} functions.
 */
public enum IOStatus {

    /**
     * An error occurred.
     */
    ERROR,
    
    /**
     * Success.
     */
    NORMAL,
    
    /**
     * End of file.
     */
    EOF,
    
    /**
     * Resource temporarily unavailable.
     */
    AGAIN;
    
    public static IOStatus fromValue(int value) {
        return switch(value) {
            case 0 -> ERROR;
            case 1 -> NORMAL;
            case 2 -> EOF;
            case 3 -> AGAIN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ERROR -> 0;
            case NORMAL -> 1;
            case EOF -> 2;
            case AGAIN -> 3;
        };
    }

}
