package org.gtk.glib;

/**
 * {@link IOError} is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public class IOError {

    /**
     * no error
     */
    public static final IOError NONE = new IOError(0);
    
    /**
     * an EAGAIN error occurred
     */
    public static final IOError AGAIN = new IOError(1);
    
    /**
     * an EINVAL error occurred
     */
    public static final IOError INVAL = new IOError(2);
    
    /**
     * another error occurred
     */
    public static final IOError UNKNOWN = new IOError(3);
    
    private int value;
    
    public IOError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(IOError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
