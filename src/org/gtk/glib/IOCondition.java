package org.gtk.glib;

/**
 * A bitwise combination representing a condition to watch for on an
 * event source.
 */
public class IOCondition {

    /**
     * There is data to read.
     */
    public static final IOCondition IN = new IOCondition(1);
    
    /**
     * Data can be written (without blocking).
     */
    public static final IOCondition OUT = new IOCondition(4);
    
    /**
     * There is urgent data to read.
     */
    public static final IOCondition PRI = new IOCondition(2);
    
    /**
     * Error condition.
     */
    public static final IOCondition ERR = new IOCondition(8);
    
    /**
     * Hung up (the connection has been broken, usually for
     *            pipes and sockets).
     */
    public static final IOCondition HUP = new IOCondition(16);
    
    /**
     * Invalid request. The file descriptor is not open.
     */
    public static final IOCondition NVAL = new IOCondition(32);
    
    private int value;
    
    public IOCondition(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOCondition[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public IOCondition combined(IOCondition mask) {
        return new IOCondition(this.getValue() | mask.getValue());
    }
    
    public static IOCondition combined(IOCondition mask, IOCondition... masks) {
        int value = mask.getValue();
        for (IOCondition arg : masks) {
            value |= arg.getValue();
        }
        return new IOCondition(value);
    }
    
}
