package org.gtk.gobject;

/**
 * The connection flags are used to specify the behaviour of a signal's
 * connection.
 */
public class ConnectFlags {

    /**
     * whether the handler should be called before or after the
     *  default handler of the signal.
     */
    public static final ConnectFlags AFTER = new ConnectFlags(1);
    
    /**
     * whether the instance and data should be swapped when
     *  calling the handler; see g_signal_connect_swapped() for an example.
     */
    public static final ConnectFlags SWAPPED = new ConnectFlags(2);
    
    private int value;
    
    public ConnectFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ConnectFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ConnectFlags combined(ConnectFlags mask) {
        return new ConnectFlags(this.getValue() | mask.getValue());
    }
    
    public static ConnectFlags combined(ConnectFlags mask, ConnectFlags... masks) {
        int value = mask.getValue();
        for (ConnectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConnectFlags(value);
    }
    
}
