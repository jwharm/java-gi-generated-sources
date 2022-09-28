package org.gtk.gio;

/**
 * Flags used in g_bus_own_name().
 */
public class BusNameOwnerFlags {

    /**
     * No flags set.
     */
    public static final BusNameOwnerFlags NONE = new BusNameOwnerFlags(0);
    
    /**
     * Allow another message bus connection to claim the name.
     */
    public static final BusNameOwnerFlags ALLOW_REPLACEMENT = new BusNameOwnerFlags(1);
    
    /**
     * If another message bus connection owns the name and have
     * specified {@link BusNameOwnerFlags#ALLOW_REPLACEMENT}, then take the name from the other connection.
     */
    public static final BusNameOwnerFlags REPLACE = new BusNameOwnerFlags(2);
    
    /**
     * If another message bus connection owns the name, immediately
     * return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)
     */
    public static final BusNameOwnerFlags DO_NOT_QUEUE = new BusNameOwnerFlags(4);
    
    private int value;
    
    public BusNameOwnerFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BusNameOwnerFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public BusNameOwnerFlags combined(BusNameOwnerFlags mask) {
        return new BusNameOwnerFlags(this.getValue() | mask.getValue());
    }
    
    public static BusNameOwnerFlags combined(BusNameOwnerFlags mask, BusNameOwnerFlags... masks) {
        int value = mask.getValue();
        for (BusNameOwnerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameOwnerFlags(value);
    }
    
}
