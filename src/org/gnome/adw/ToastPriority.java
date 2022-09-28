package org.gnome.adw;

/**
 * {@link Toast} behavior when another toast is already displayed.
 */
public class ToastPriority {

    /**
     * the toast will be queued if another toast is
     *   already displayed.
     */
    public static final ToastPriority NORMAL = new ToastPriority(0);
    
    /**
     * the toast will be displayed immediately, pushing
     *   the previous toast into the queue instead.
     */
    public static final ToastPriority HIGH = new ToastPriority(1);
    
    private int value;
    
    public ToastPriority(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ToastPriority[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
