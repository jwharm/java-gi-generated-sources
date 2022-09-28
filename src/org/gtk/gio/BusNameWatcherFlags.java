package org.gtk.gio;

/**
 * Flags used in g_bus_watch_name().
 */
public class BusNameWatcherFlags {

    /**
     * No flags set.
     */
    public static final BusNameWatcherFlags NONE = new BusNameWatcherFlags(0);
    
    /**
     * If no-one owns the name when
     * beginning to watch the name, ask the bus to launch an owner for the
     * name.
     */
    public static final BusNameWatcherFlags AUTO_START = new BusNameWatcherFlags(1);
    
    private int value;
    
    public BusNameWatcherFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BusNameWatcherFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BusNameWatcherFlags combined(BusNameWatcherFlags mask) {
        return new BusNameWatcherFlags(this.getValue() | mask.getValue());
    }
    
    public static BusNameWatcherFlags combined(BusNameWatcherFlags mask, BusNameWatcherFlags... masks) {
        int value = mask.getValue();
        for (BusNameWatcherFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameWatcherFlags(value);
    }
    
}
