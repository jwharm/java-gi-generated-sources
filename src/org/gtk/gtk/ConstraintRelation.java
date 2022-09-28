package org.gtk.gtk;

/**
 * The relation between two terms of a constraint.
 */
public class ConstraintRelation {

    /**
     * Less than, or equal
     */
    public static final ConstraintRelation LE = new ConstraintRelation(-1);
    
    /**
     * Equal
     */
    public static final ConstraintRelation EQ = new ConstraintRelation(0);
    
    /**
     * Greater than, or equal
     */
    public static final ConstraintRelation GE = new ConstraintRelation(1);
    
    private int value;
    
    public ConstraintRelation(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ConstraintRelation[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
