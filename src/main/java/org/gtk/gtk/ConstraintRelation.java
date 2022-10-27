package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The relation between two terms of a constraint.
 */
public class ConstraintRelation extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
