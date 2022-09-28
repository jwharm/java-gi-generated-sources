package org.gtk.glib;

/**
 * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
 * of a {@link MainContext}.
 */
public class MainContextFlags {

    /**
     * Default behaviour.
     */
    public static final MainContextFlags NONE = new MainContextFlags(0);
    
    /**
     * Assume that polling for events will
     * free the thread to process other jobs. That's useful if you're using
     * {@code g_main_context_{prepare,query,check,dispatch}} to integrate GMainContext in
     * other event loops.
     */
    public static final MainContextFlags OWNERLESS_POLLING = new MainContextFlags(1);
    
    private int value;
    
    public MainContextFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MainContextFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public MainContextFlags combined(MainContextFlags mask) {
        return new MainContextFlags(this.getValue() | mask.getValue());
    }
    
    public static MainContextFlags combined(MainContextFlags mask, MainContextFlags... masks) {
        int value = mask.getValue();
        for (MainContextFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MainContextFlags(value);
    }
    
}
