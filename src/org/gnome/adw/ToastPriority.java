package org.gnome.adw;

/**
 * {@link Toast} behavior when another toast is already displayed.
 */
public enum ToastPriority {

    /**
     * the toast will be queued if another toast is
     *   already displayed.
     */
    NORMAL,
    
    /**
     * the toast will be displayed immediately, pushing
     *   the previous toast into the queue instead.
     */
    HIGH;
    
    public static ToastPriority fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> HIGH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case HIGH -> 1;
        };
    }

}
