package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleState#INVALID}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleInvalidState#FALSE} and
 * {@link AccessibleInvalidState#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public class AccessibleInvalidState {

    /**
     * There are no detected errors in the value
     */
    public static final AccessibleInvalidState FALSE = new AccessibleInvalidState(0);
    
    /**
     * The value entered by the user has failed validation
     */
    public static final AccessibleInvalidState TRUE = new AccessibleInvalidState(1);
    
    /**
     * A grammatical error was detected
     */
    public static final AccessibleInvalidState GRAMMAR = new AccessibleInvalidState(2);
    
    /**
     * A spelling error was detected
     */
    public static final AccessibleInvalidState SPELLING = new AccessibleInvalidState(3);
    
    private int value;
    
    public AccessibleInvalidState(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AccessibleInvalidState[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
