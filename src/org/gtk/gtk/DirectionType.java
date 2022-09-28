package org.gtk.gtk;

/**
 * Focus movement types.
 */
public class DirectionType {

    /**
     * Move forward.
     */
    public static final DirectionType TAB_FORWARD = new DirectionType(0);
    
    /**
     * Move backward.
     */
    public static final DirectionType TAB_BACKWARD = new DirectionType(1);
    
    /**
     * Move up.
     */
    public static final DirectionType UP = new DirectionType(2);
    
    /**
     * Move down.
     */
    public static final DirectionType DOWN = new DirectionType(3);
    
    /**
     * Move left.
     */
    public static final DirectionType LEFT = new DirectionType(4);
    
    /**
     * Move right.
     */
    public static final DirectionType RIGHT = new DirectionType(5);
    
    private int value;
    
    public DirectionType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DirectionType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
