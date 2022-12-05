package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The relation between two terms of a constraint.
 */
public enum ConstraintRelation implements io.github.jwharm.javagi.Enumeration {
    /**
     * Less than, or equal
     */
    LE(-1),
    /**
     * Equal
     */
    EQ(0),
    /**
     * Greater than, or equal
     */
    GE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintRelation";
    
    private final int value;
    ConstraintRelation(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ConstraintRelation of(int value) {
        return switch (value) {
            case -1 -> LE;
            case 0 -> EQ;
            case 1 -> GE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
