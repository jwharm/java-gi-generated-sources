package org.gtk.gtk;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * <p>
 * See {@link SpinButton#setUpdatePolicy}.
 */
public class SpinButtonUpdatePolicy extends io.github.jwharm.javagi.Enumeration {

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
    
    public SpinButtonUpdatePolicy(int value) {
        super(value);
    }
    
}