package org.gtk.gtk;

/**
 * The strength of a constraint, expressed as a symbolic constant.
 * 
 * The strength of a {@link [class@Constraint]} can be expressed with any positive
 * integer; the values of this enumeration can be used for readability.
 */
public enum ConstraintStrength {

    /**
     * The constraint is required towards solving the layout
     */
    REQUIRED,
    
    /**
     * A strong constraint
     */
    STRONG,
    
    /**
     * A medium constraint
     */
    MEDIUM,
    
    /**
     * A weak constraint
     */
    WEAK;
    
    public static ConstraintStrength fromValue(int value) {
        return switch(value) {
            case 1001001000 -> REQUIRED;
            case 1000000000 -> STRONG;
            case 1000 -> MEDIUM;
            case 1 -> WEAK;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case REQUIRED -> 1001001000;
            case STRONG -> 1000000000;
            case MEDIUM -> 1000;
            case WEAK -> 1;
        };
    }

}
