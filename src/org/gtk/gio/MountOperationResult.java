package org.gtk.gio;

/**
 * {@link org.gtk.gio.MountOperationResult} is returned as a result when a request for
 * information is send by the mounting operation.
 */
public enum MountOperationResult {

    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    HANDLED,
    
    /**
     * The user requested the mount operation
     *     to be aborted
     */
    ABORTED,
    
    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    UNHANDLED;
    
    public static MountOperationResult fromValue(int value) {
        return switch(value) {
            case 0 -> HANDLED;
            case 1 -> ABORTED;
            case 2 -> UNHANDLED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case HANDLED -> 0;
            case ABORTED -> 1;
            case UNHANDLED -> 2;
        };
    }

}
