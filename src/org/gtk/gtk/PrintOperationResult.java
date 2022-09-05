package org.gtk.gtk;

/**
 * The result of a print operation.
 * 
 * A value of this type is returned by [method@Gtk.PrintOperation.run].
 */
public enum PrintOperationResult {

    /**
     * An error has occurred.
     */
    ERROR,
    
    /**
     * The print settings should be stored.
     */
    APPLY,
    
    /**
     * The print operation has been canceled,
     *   the print settings should not be stored.
     */
    CANCEL,
    
    /**
     * The print operation is not complete
     *   yet. This value will only be returned when running asynchronously.
     */
    IN_PROGRESS;
    
    public static PrintOperationResult fromValue(int value) {
        return switch(value) {
            case 0 -> ERROR;
            case 1 -> APPLY;
            case 2 -> CANCEL;
            case 3 -> IN_PROGRESS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ERROR -> 0;
            case APPLY -> 1;
            case CANCEL -> 2;
            case IN_PROGRESS -> 3;
        };
    }

}
