package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The strength of a constraint, expressed as a symbolic constant.
 * <p>
 * The strength of a {@link Constraint} can be expressed with any positive
 * integer; the values of this enumeration can be used for readability.
 */
public class ConstraintStrength extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintStrength";
    
    /**
     * The constraint is required towards solving the layout
     */
    public static final ConstraintStrength REQUIRED = new ConstraintStrength(1001001000);
    
    /**
     * A strong constraint
     */
    public static final ConstraintStrength STRONG = new ConstraintStrength(1000000000);
    
    /**
     * A medium constraint
     */
    public static final ConstraintStrength MEDIUM = new ConstraintStrength(1000);
    
    /**
     * A weak constraint
     */
    public static final ConstraintStrength WEAK = new ConstraintStrength(1);
    
    public ConstraintStrength(int value) {
        super(value);
    }
}
