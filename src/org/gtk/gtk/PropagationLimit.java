package org.gtk.gtk;

/**
 * Describes limits of a {@link EventController} for handling events
 * targeting other widgets.
 */
public class PropagationLimit {

    /**
     * Events are handled regardless of what their
     *   target is.
     */
    public static final PropagationLimit NONE = new PropagationLimit(0);
    
    /**
     * Events are only handled if their target
     *   is in the same {@code Native} as the event controllers widget. Note
     *   that some event types have two targets (origin and destination).
     */
    public static final PropagationLimit SAME_NATIVE = new PropagationLimit(1);
    
    private int value;
    
    public PropagationLimit(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PropagationLimit[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
