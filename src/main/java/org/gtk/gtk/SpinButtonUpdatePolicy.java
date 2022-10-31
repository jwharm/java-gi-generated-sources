package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines whether the spin button displays values outside the adjustment
 * bounds.
 * <p>
 * See {@link SpinButton#setUpdatePolicy}.
 */
public class SpinButtonUpdatePolicy extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkSpinButtonUpdatePolicy";
    
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
