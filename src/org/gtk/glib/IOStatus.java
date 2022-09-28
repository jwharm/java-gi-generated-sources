package org.gtk.glib;

/**
 * Statuses returned by most of the {@link IOFuncs} functions.
 */
public class IOStatus {

    /**
     * An error occurred.
     */
    public static final IOStatus ERROR = new IOStatus(0);
    
    /**
     * Success.
     */
    public static final IOStatus NORMAL = new IOStatus(1);
    
    /**
     * End of file.
     */
    public static final IOStatus EOF = new IOStatus(2);
    
    /**
     * Resource temporarily unavailable.
     */
    public static final IOStatus AGAIN = new IOStatus(3);
    
    private int value;
    
    public IOStatus(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOStatus[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
