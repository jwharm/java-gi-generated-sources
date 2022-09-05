package org.gtk.gio;

/**
 * Header fields used in #GDBusMessage.
 */
public enum DBusMessageHeaderField {

    /**
     * Not a valid header field.
     */
    INVALID,
    
    /**
     * The object path.
     */
    PATH,
    
    /**
     * The interface name.
     */
    INTERFACE,
    
    /**
     * The method or signal name.
     */
    MEMBER,
    
    /**
     * The name of the error that occurred.
     */
    ERROR_NAME,
    
    /**
     * The serial number the message is a reply to.
     */
    REPLY_SERIAL,
    
    /**
     * The name the message is intended for.
     */
    DESTINATION,
    
    /**
     * Unique name of the sender of the message (filled in by the bus).
     */
    SENDER,
    
    /**
     * The signature of the message body.
     */
    SIGNATURE,
    
    /**
     * The number of UNIX file descriptors that accompany the message.
     */
    NUM_UNIX_FDS;
    
    public static DBusMessageHeaderField fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case PATH -> 1;
            case INTERFACE -> 2;
            case MEMBER -> 3;
            case ERROR_NAME -> 4;
            case REPLY_SERIAL -> 5;
            case DESTINATION -> 6;
            case SENDER -> 7;
            case SIGNATURE -> 8;
            case NUM_UNIX_FDS -> 9;
        };
    }

}
