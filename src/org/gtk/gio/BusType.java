package org.gtk.gio;

/**
 * An enumeration for well-known message buses.
 */
public enum BusType {

    /**
     * An alias for the message bus that activated the process, if any.
     */
    STARTER,
    
    /**
     * Not a message bus.
     */
    NONE,
    
    /**
     * The system-wide message bus.
     */
    SYSTEM,
    
    /**
     * The login session message bus.
     */
    SESSION;
    
    public static BusType fromValue(int value) {
        return switch(value) {
            case -1 -> STARTER;
            case 0 -> NONE;
            case 1 -> SYSTEM;
            case 2 -> SESSION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case STARTER -> -1;
            case NONE -> 0;
            case SYSTEM -> 1;
            case SESSION -> 2;
        };
    }

}
