package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public class SpinType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
    
    public SpinType(int value) {
        super(value);
    }
}
