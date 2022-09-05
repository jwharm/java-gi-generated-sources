package org.gtk.gtk;

/**
 * Domain for VFL parsing errors.
 */
public enum ConstraintVflParserError {

    /**
     * Invalid or unknown symbol
     */
    SYMBOL,
    
    /**
     * Invalid or unknown attribute
     */
    ATTRIBUTE,
    
    /**
     * Invalid or unknown view
     */
    VIEW,
    
    /**
     * Invalid or unknown metric
     */
    METRIC,
    
    /**
     * Invalid or unknown priority
     */
    PRIORITY,
    
    /**
     * Invalid or unknown relation
     */
    RELATION;
    
    public static ConstraintVflParserError fromValue(int value) {
        return switch(value) {
            case 0 -> SYMBOL;
            case 1 -> ATTRIBUTE;
            case 2 -> VIEW;
            case 3 -> METRIC;
            case 4 -> PRIORITY;
            case 5 -> RELATION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SYMBOL -> 0;
            case ATTRIBUTE -> 1;
            case VIEW -> 2;
            case METRIC -> 3;
            case PRIORITY -> 4;
            case RELATION -> 5;
        };
    }

}
