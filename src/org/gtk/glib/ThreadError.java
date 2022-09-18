package org.gtk.glib;

/**
 * Possible errors of thread related functions.
 */
public enum ThreadError {

    /**
     * a thread couldn&<code>#39</code> t be created due to resource
     *                        shortage. Try again later.
     */
    THREAD_ERROR_AGAIN;
    
    public static ThreadError fromValue(int value) {
        return switch(value) {
            case 0 -> THREAD_ERROR_AGAIN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case THREAD_ERROR_AGAIN -> 0;
        };
    }

}
