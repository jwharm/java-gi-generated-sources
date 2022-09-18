package org.gtk.gio;

/**
 * Priority levels for <code>#GNotifications</code>
 */
public enum NotificationPriority {

    /**
     * the default priority, to be used for the
     *   majority of notifications (for example email messages, software updates,
     *   completed download/sync operations)
     */
    NORMAL,
    
    /**
     * for notifications that do not require
     *   immediate attention - typically used for contextual background
     *   information, such as contact birthdays or local weather
     */
    LOW,
    
    /**
     * for events that require more attention,
     *   usually because responses are time-sensitive (for example chat and SMS
     *   messages or alarms)
     */
    HIGH,
    
    /**
     * for urgent notifications, or notifications
     *   that require a response in a short space of time (for example phone calls
     *   or emergency warnings)
     */
    URGENT;
    
    public static NotificationPriority fromValue(int value) {
        return switch(value) {
            case 0 -> NORMAL;
            case 1 -> LOW;
            case 2 -> HIGH;
            case 3 -> URGENT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORMAL -> 0;
            case LOW -> 1;
            case HIGH -> 2;
            case URGENT -> 3;
        };
    }

}
