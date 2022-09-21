package org.gtk.gio;

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a {@link org.gtk.glib.Error}.
 * <p>
 * This enum exists to be able to return errors to callers without having to
 * allocate a {@link org.gtk.glib.Error}. Allocating {@code GErrors} can be quite expensive for
 * regularly happening errors like {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * In case of {@link PollableReturn#FAILED} a {@link org.gtk.glib.Error} should be set for the
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
