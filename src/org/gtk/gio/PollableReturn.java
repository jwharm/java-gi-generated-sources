package org.gtk.gio;

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a #GError.
 * 
 * This enum exists to be able to return errors to callers without having to
 * allocate a #GError. Allocating #GErrors can be quite expensive for
 * regularly happening errors like <code>G_IO_ERROR_WOULD_BLOCK.
 * 
 * In</code> case of {@link org.gtk.gio.PollableReturn#FAILED} a #GError should be set for the
 * operation to give details about the error that happened.
 */
public enum PollableReturn {

    /**
     * Generic error condition for when an operation fails.
     */
    FAILED,
    
    /**
     * The operation was successfully finished.
     */
    OK,
    
    /**
     * The operation would block.
     */
    WOULD_BLOCK;
    
    public static PollableReturn fromValue(int value) {
        return switch(value) {
            case 0 -> FAILED;
            case 1 -> OK;
            case -27 -> WOULD_BLOCK;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FAILED -> 0;
            case OK -> 1;
            case WOULD_BLOCK -> -27;
        };
    }

}
