package org.gtk.gdk;

/**
 * Used in {@code GdkDrop} and {@code GdkDrag} to indicate the actions that the
 * destination can and should do with the dropped data.
 */
public class DragAction {

    /**
     * Copy the data.
     */
    public static final DragAction COPY = new DragAction(1);
    
    /**
     * Move the data, i.e. first copy it, then delete
     *   it from the source using the DELETE target of the X selection protocol.
     */
    public static final DragAction MOVE = new DragAction(2);
    
    /**
     * Add a link to the data. Note that this is only
     *   useful if source and destination agree on what it means, and is not
     *   supported on all platforms.
     */
    public static final DragAction LINK = new DragAction(4);
    
    /**
     * Ask the user what to do with the data.
     */
    public static final DragAction ASK = new DragAction(8);
    
    private int value;
    
    public DragAction(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DragAction[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public DragAction combined(DragAction mask) {
        return new DragAction(this.getValue() | mask.getValue());
    }
    
    public static DragAction combined(DragAction mask, DragAction... masks) {
        int value = mask.getValue();
        for (DragAction arg : masks) {
            value |= arg.getValue();
        }
        return new DragAction(value);
    }
    
}
