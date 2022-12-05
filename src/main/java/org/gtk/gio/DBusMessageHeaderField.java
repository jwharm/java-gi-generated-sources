package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Header fields used in {@link DBusMessage}.
 * @version 2.26
 */
public enum DBusMessageHeaderField implements io.github.jwharm.javagi.Enumeration {
    /**
     * Not a valid header field.
     */
    INVALID(0),
    /**
     * The object path.
     */
    PATH(1),
    /**
     * The interface name.
     */
    INTERFACE(2),
    /**
     * The method or signal name.
     */
    MEMBER(3),
    /**
     * The name of the error that occurred.
     */
    ERROR_NAME(4),
    /**
     * The serial number the message is a reply to.
     */
    REPLY_SERIAL(5),
    /**
     * The name the message is intended for.
     */
    DESTINATION(6),
    /**
     * Unique name of the sender of the message (filled in by the bus).
     */
    SENDER(7),
    /**
     * The signature of the message body.
     */
    SIGNATURE(8),
    /**
     * The number of UNIX file descriptors that accompany the message.
     */
    NUM_UNIX_FDS(9);
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessageHeaderField";
    
    private final int value;
    DBusMessageHeaderField(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DBusMessageHeaderField of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> PATH;
            case 2 -> INTERFACE;
            case 3 -> MEMBER;
            case 4 -> ERROR_NAME;
            case 5 -> REPLY_SERIAL;
            case 6 -> DESTINATION;
            case 7 -> SENDER;
            case 8 -> SIGNATURE;
            case 9 -> NUM_UNIX_FDS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
