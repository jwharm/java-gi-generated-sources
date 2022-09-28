package org.gtk.gtk;

/**
 * Describes the state of a {@code Gesture}.
 */
public class EventSequenceState {

    /**
     * The sequence is handled, but not grabbed.
     */
    public static final EventSequenceState NONE = new EventSequenceState(0);
    
    /**
     * The sequence is handled and grabbed.
     */
    public static final EventSequenceState CLAIMED = new EventSequenceState(1);
    
    /**
     * The sequence is denied.
     */
    public static final EventSequenceState DENIED = new EventSequenceState(2);
    
    private int value;
    
    public EventSequenceState(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EventSequenceState[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
