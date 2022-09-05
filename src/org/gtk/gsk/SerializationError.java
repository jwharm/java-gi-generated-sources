package org.gtk.gsk;

/**
 * Errors that can happen during (de)serialization.
 */
public enum SerializationError {

    /**
     * The format can not be identified
     */
    UNSUPPORTED_FORMAT,
    
    /**
     * The version of the data is not
     *   understood
     */
    UNSUPPORTED_VERSION,
    
    /**
     * The given data may not exist in
     *   a proper serialization
     */
    INVALID_DATA;
    
    public static SerializationError fromValue(int value) {
        return switch(value) {
            case 0 -> UNSUPPORTED_FORMAT;
            case 1 -> UNSUPPORTED_VERSION;
            case 2 -> INVALID_DATA;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNSUPPORTED_FORMAT -> 0;
            case UNSUPPORTED_VERSION -> 1;
            case INVALID_DATA -> 2;
        };
    }

}
