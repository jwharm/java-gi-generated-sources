package org.gtk.gtk;

/**
 * The relation between two terms of a constraint.
 */
public enum ConstraintRelation {

    /**
     * Less than, or equal
     */
    LE,
    
    /**
     * Equal
     */
    EQ,
    
    /**
     * Greater than, or equal
     */
    GE;
    
    public static ConstraintRelation fromValue(int value) {
        return switch(value) {
            case -1 -> LE;
            case 0 -> EQ;
            case 1 -> GE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LE -> -1;
            case EQ -> 0;
            case GE -> 1;
        };
    }

}
