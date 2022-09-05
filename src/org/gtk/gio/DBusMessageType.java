package org.gtk.gio;

/**
 * Message types used in #GDBusMessage.
 */
public enum DBusMessageType {

    /**
     * Message is of invalid type.
     */
    INVALID,
    
    /**
     * Method call.
     */
    METHOD_CALL,
    
    /**
     * Method reply.
     */
    METHOD_RETURN,
    
    /**
     * Error reply.
     */
    ERROR,
    
    /**
     * Signal emission.
     */
    SIGNAL;
    
    public static DBusMessageType fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> METHOD_CALL;
            case 2 -> METHOD_RETURN;
            case 3 -> ERROR;
            case 4 -> SIGNAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case METHOD_CALL -> 1;
            case METHOD_RETURN -> 2;
            case ERROR -> 3;
            case SIGNAL -> 4;
        };
    }

}
