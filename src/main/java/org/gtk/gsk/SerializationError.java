package org.gtk.gsk;

/**
 * Errors that can happen during (de)serialization.
 */
public class SerializationError extends io.github.jwharm.javagi.Enumeration {

    /**
     * The format can not be identified
     */
    public static final SerializationError UNSUPPORTED_FORMAT = new SerializationError(0);
    
    /**
     * The version of the data is not
     *   understood
     */
    public static final SerializationError UNSUPPORTED_VERSION = new SerializationError(1);
    
    /**
     * The given data may not exist in
     *   a proper serialization
     */
    public static final SerializationError INVALID_DATA = new SerializationError(2);
    
    public SerializationError(int value) {
        super(value);
    }
    
}
