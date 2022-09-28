package org.gtk.gtk;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * <p>
 * See {@link SpinButton#setUpdatePolicy}.
 */
public class SpinButtonUpdatePolicy {

    /**
     * When refreshing your {@code GtkSpinButton}, the value is
     *   always displayed
     */
    public static final SpinButtonUpdatePolicy ALWAYS = new SpinButtonUpdatePolicy(0);
    
    /**
     * When refreshing your {@code GtkSpinButton}, the value is
     *   only displayed if it is valid within the bounds of the spin button's
     *   adjustment
     */
    public static final SpinButtonUpdatePolicy IF_VALID = new SpinButtonUpdatePolicy(1);
    
    private int value;
    
    public SpinButtonUpdatePolicy(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SpinButtonUpdatePolicy[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
