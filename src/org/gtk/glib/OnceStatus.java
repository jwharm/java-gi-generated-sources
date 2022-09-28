package org.gtk.glib;

/**
 * The possible statuses of a one-time initialization function
 * controlled by a {@link Once} struct.
 */
public class OnceStatus {

    /**
     * the function has not been called yet.
     */
    public static final OnceStatus NOTCALLED = new OnceStatus(0);
    
    /**
     * the function call is currently in progress.
     */
    public static final OnceStatus PROGRESS = new OnceStatus(1);
    
    /**
     * the function has been called.
     */
    public static final OnceStatus READY = new OnceStatus(2);
    
    private int value;
    
    public OnceStatus(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(OnceStatus[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
