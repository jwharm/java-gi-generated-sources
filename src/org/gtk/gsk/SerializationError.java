package org.gtk.gsk;

/**
 * Errors that can happen during (de)serialization.
 */
public class SerializationError {

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
    
    private int value;
    
    public SerializationError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SerializationError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
