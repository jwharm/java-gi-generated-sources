package org.gtk.gdk;

/**
 * Used in {@code GdkDrag} to the reason of a cancelled DND operation.
 */
public class DragCancelReason {

    /**
     * There is no suitable drop target.
     */
    public static final DragCancelReason NO_TARGET = new DragCancelReason(0);
    
    /**
     * Drag cancelled by the user
     */
    public static final DragCancelReason USER_CANCELLED = new DragCancelReason(1);
    
    /**
     * Unspecified error.
     */
    public static final DragCancelReason ERROR = new DragCancelReason(2);
    
    private int value;
    
    public DragCancelReason(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DragCancelReason[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
