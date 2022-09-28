package org.gtk.gtk;

/**
 * The possible accessible states of a {@code Accessible}.
 */
public class AccessibleState {

    /**
     * A “busy” state. This state has boolean values
     */
    public static final AccessibleState BUSY = new AccessibleState(0);
    
    /**
     * A “checked” state; indicates the current
     *   state of a {@code AccessibleTristate}
     */
    public static final AccessibleState CHECKED = new AccessibleState(1);
    
    /**
     * A “disabled” state; corresponds to the
     *   {@code Widget:sensitive} property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    public static final AccessibleState DISABLED = new AccessibleState(2);
    
    /**
     * An “expanded” state; corresponds to the
     *   {@code Expander:expanded} property. Value type: boolean
     *   or undefined
     */
    public static final AccessibleState EXPANDED = new AccessibleState(3);
    
    /**
     * A “hidden” state; corresponds to the
     *   {@code Widget:visible} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: {@link AccessibleState#DISABLED}
     */
    public static final AccessibleState HIDDEN = new AccessibleState(4);
    
    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: {@code AccessibleInvalidState}
     */
    public static final AccessibleState INVALID = new AccessibleState(5);
    
    /**
     * A “pressed” state; indicates the current
     *   state of a {@code AccessibleTristate}
     *   enumeration
     */
    public static final AccessibleState PRESSED = new AccessibleState(6);
    
    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    public static final AccessibleState SELECTED = new AccessibleState(7);
    
    private int value;
    
    public AccessibleState(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AccessibleState[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
