package org.gtk.gio;

/**
 * An enumeration for well-known message buses.
 */
public class BusType {

    /**
     * An alias for the message bus that activated the process, if any.
     */
    public static final BusType STARTER = new BusType(-1);
    
    /**
     * Not a message bus.
     */
    public static final BusType NONE = new BusType(0);
    
    /**
     * The system-wide message bus.
     */
    public static final BusType SYSTEM = new BusType(1);
    
    /**
     * The login session message bus.
     */
    public static final BusType SESSION = new BusType(2);
    
    private int value;
    
    public BusType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BusType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
