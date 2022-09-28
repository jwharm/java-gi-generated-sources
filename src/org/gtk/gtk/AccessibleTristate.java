package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleState#PRESSED}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleTristate#FALSE} and
 * {@link AccessibleTristate#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public class AccessibleTristate {

    /**
     * The state is {@code false}
     */
    public static final AccessibleTristate FALSE = new AccessibleTristate(0);
    
    /**
     * The state is {@code true}
     */
    public static final AccessibleTristate TRUE = new AccessibleTristate(1);
    
    /**
     * The state is {@code mixed}
     */
    public static final AccessibleTristate MIXED = new AccessibleTristate(2);
    
    private int value;
    
    public AccessibleTristate(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AccessibleTristate[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
