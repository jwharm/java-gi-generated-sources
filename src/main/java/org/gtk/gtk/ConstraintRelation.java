package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The relation between two terms of a constraint.
 */
public class ConstraintRelation extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintRelation";
    
    /**
     * Less than, or equal
     */
    public static final ConstraintRelation LE = new ConstraintRelation(-1);
    
    /**
     * Equal
     */
    public static final ConstraintRelation EQ = new ConstraintRelation(0);
    
    /**
     * Greater than, or equal
     */
    public static final ConstraintRelation GE = new ConstraintRelation(1);
    
    public ConstraintRelation(int value) {
        super(value);
    }
}
