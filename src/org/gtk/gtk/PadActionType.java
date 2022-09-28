package org.gtk.gtk;

/**
 * The type of a pad action.
 */
public class PadActionType {

    /**
     * Action is triggered by a pad button
     */
    public static final PadActionType BUTTON = new PadActionType(0);
    
    /**
     * Action is triggered by a pad ring
     */
    public static final PadActionType RING = new PadActionType(1);
    
    /**
     * Action is triggered by a pad strip
     */
    public static final PadActionType STRIP = new PadActionType(2);
    
    private int value;
    
    public PadActionType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PadActionType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
