package org.gtk.gtk;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * 
 * See {@link org.gtk.gtk.SpinButton<code>#setUpdatePolicy</code> .
 */
public enum SpinButtonUpdatePolicy {

    /**
     * When refreshing your <code>GtkSpinButton</code>, the value is
     *   always displayed
     */
    ALWAYS,
    
    /**
     * When refreshing your <code>GtkSpinButton</code>, the value is
     *   only displayed if it is valid within the bounds of the spin button&<code>#39</code> s
     *   adjustment
     */
    IF_VALID;
    
    public static SpinButtonUpdatePolicy fromValue(int value) {
        return switch(value) {
            case 0 -> ALWAYS;
            case 1 -> IF_VALID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALWAYS -> 0;
            case IF_VALID -> 1;
        };
    }

}
