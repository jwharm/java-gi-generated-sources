package org.gtk.gtk;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * 
 * See [method@Gtk.SpinButton.set_update_policy].
 */
public enum SpinButtonUpdatePolicy {

    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   always displayed
     */
    ALWAYS,
    
    /**
     * When refreshing your `GtkSpinButton`, the value is
     *   only displayed if it is valid within the bounds of the spin button's
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
