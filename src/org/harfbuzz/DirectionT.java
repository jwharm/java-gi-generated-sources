package org.harfbuzz;

/**
 * The direction of a text segment or buffer.
 * <p>
 * A segment can also be tested for horizontal or vertical
 * orientation (irrespective of specific direction) with
 * HB_DIRECTION_IS_HORIZONTAL() or HB_DIRECTION_IS_VERTICAL().
 */
public class DirectionT {

    /**
     * Initial, unset direction.
     */
    public static final DirectionT INVALID = new DirectionT(0);
    
    /**
     * Text is set horizontally from left to right.
     */
    public static final DirectionT LTR = new DirectionT(4);
    
    /**
     * Text is set horizontally from right to left.
     */
    public static final DirectionT RTL = new DirectionT(5);
    
    /**
     * Text is set vertically from top to bottom.
     */
    public static final DirectionT TTB = new DirectionT(6);
    
    /**
     * Text is set vertically from bottom to top.
     */
    public static final DirectionT BTT = new DirectionT(7);
    
    private int value;
    
    public DirectionT(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(DirectionT[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
