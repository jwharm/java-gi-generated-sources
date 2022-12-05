package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Priority levels for {@code GNotifications}.
 * @version 2.42
 */
public enum NotificationPriority implements io.github.jwharm.javagi.Enumeration {
    /**
     * the default priority, to be used for the
     *   majority of notifications (for example email messages, software updates,
     *   completed download/sync operations)
     */
    NORMAL(0),
    /**
     * for notifications that do not require
     *   immediate attention - typically used for contextual background
     *   information, such as contact birthdays or local weather
     */
    LOW(1),
    /**
     * for events that require more attention,
     *   usually because responses are time-sensitive (for example chat and SMS
     *   messages or alarms)
     */
    HIGH(2),
    /**
     * for urgent notifications, or notifications
     *   that require a response in a short space of time (for example phone calls
     *   or emergency warnings)
     */
    URGENT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GNotificationPriority";
    
    private final int value;
    NotificationPriority(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NotificationPriority of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> LOW;
            case 2 -> HIGH;
            case 3 -> URGENT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
