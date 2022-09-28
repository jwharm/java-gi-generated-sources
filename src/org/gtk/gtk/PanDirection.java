package org.gtk.gtk;

/**
 * Describes the panning direction of a {@link GesturePan}.
 */
public class PanDirection {

    /**
     * panned towards the left
     */
    public static final PanDirection LEFT = new PanDirection(0);
    
    /**
     * panned towards the right
     */
    public static final PanDirection RIGHT = new PanDirection(1);
    
    /**
     * panned upwards
     */
    public static final PanDirection UP = new PanDirection(2);
    
    /**
     * panned downwards
     */
    public static final PanDirection DOWN = new PanDirection(3);
    
    private int value;
    
    public PanDirection(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(PanDirection[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
