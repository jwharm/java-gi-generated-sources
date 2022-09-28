package org.gtk.gio;

/**
 * Priority levels for {@code GNotifications}.
 */
public class NotificationPriority {

    /**
     * the default priority, to be used for the
     *   majority of notifications (for example email messages, software updates,
     *   completed download/sync operations)
     */
    public static final NotificationPriority NORMAL = new NotificationPriority(0);
    
    /**
     * for notifications that do not require
     *   immediate attention - typically used for contextual background
     *   information, such as contact birthdays or local weather
     */
    public static final NotificationPriority LOW = new NotificationPriority(1);
    
    /**
     * for events that require more attention,
     *   usually because responses are time-sensitive (for example chat and SMS
     *   messages or alarms)
     */
    public static final NotificationPriority HIGH = new NotificationPriority(2);
    
    /**
     * for urgent notifications, or notifications
     *   that require a response in a short space of time (for example phone calls
     *   or emergency warnings)
     */
    public static final NotificationPriority URGENT = new NotificationPriority(3);
    
    private int value;
    
    public NotificationPriority(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(NotificationPriority[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
