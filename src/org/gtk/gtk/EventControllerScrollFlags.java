package org.gtk.gtk;

/**
 * Describes the behavior of a {@code GtkEventControllerScroll}.
 */
public class EventControllerScrollFlags {

    /**
     * Don't emit scroll.
     */
    public static final EventControllerScrollFlags NONE = new EventControllerScrollFlags(0);
    
    /**
     * Emit scroll with vertical deltas.
     */
    public static final EventControllerScrollFlags VERTICAL = new EventControllerScrollFlags(1);
    
    /**
     * Emit scroll with horizontal deltas.
     */
    public static final EventControllerScrollFlags HORIZONTAL = new EventControllerScrollFlags(2);
    
    /**
     * Only emit deltas that are multiples of 1.
     */
    public static final EventControllerScrollFlags DISCRETE = new EventControllerScrollFlags(4);
    
    /**
     * Emit ::decelerate after continuous scroll finishes.
     */
    public static final EventControllerScrollFlags KINETIC = new EventControllerScrollFlags(8);
    
    /**
     * Emit scroll on both axes.
     */
    public static final EventControllerScrollFlags BOTH_AXES = new EventControllerScrollFlags(3);
    
    private int value;
    
    public EventControllerScrollFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(EventControllerScrollFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public EventControllerScrollFlags combined(EventControllerScrollFlags mask) {
        return new EventControllerScrollFlags(this.getValue() | mask.getValue());
    }
    
    public static EventControllerScrollFlags combined(EventControllerScrollFlags mask, EventControllerScrollFlags... masks) {
        int value = mask.getValue();
        for (EventControllerScrollFlags arg : masks) {
            value |= arg.getValue();
        }
        return new EventControllerScrollFlags(value);
    }
    
}
