package org.gtk.glib;

/**
 * Possible errors of thread related functions.
 */
public class ThreadError {

    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    public static final ThreadError THREAD_ERROR_AGAIN = new ThreadError(0);
    
    private int value;
    
    public ThreadError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ThreadError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
