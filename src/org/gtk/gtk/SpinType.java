package org.gtk.gtk;

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public class SpinType {

    /**
     * Increment by the adjustments step increment.
     */
    public static final SpinType STEP_FORWARD = new SpinType(0);
    
    /**
     * Decrement by the adjustments step increment.
     */
    public static final SpinType STEP_BACKWARD = new SpinType(1);
    
    /**
     * Increment by the adjustments page increment.
     */
    public static final SpinType PAGE_FORWARD = new SpinType(2);
    
    /**
     * Decrement by the adjustments page increment.
     */
    public static final SpinType PAGE_BACKWARD = new SpinType(3);
    
    /**
     * Go to the adjustments lower bound.
     */
    public static final SpinType HOME = new SpinType(4);
    
    /**
     * Go to the adjustments upper bound.
     */
    public static final SpinType END = new SpinType(5);
    
    /**
     * Change by a specified amount.
     */
    public static final SpinType USER_DEFINED = new SpinType(6);
    
    private int value;
    
    public SpinType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SpinType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
