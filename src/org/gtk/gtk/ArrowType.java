package org.gtk.gtk;

/**
 * Used to indicate the direction in which an arrow should point.
 */
public class ArrowType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Represents an upward pointing arrow.
     */
    public static final ArrowType UP = new ArrowType(0);
    
    /**
     * Represents a downward pointing arrow.
     */
    public static final ArrowType DOWN = new ArrowType(1);
    
    /**
     * Represents a left pointing arrow.
     */
    public static final ArrowType LEFT = new ArrowType(2);
    
    /**
     * Represents a right pointing arrow.
     */
    public static final ArrowType RIGHT = new ArrowType(3);
    
    /**
     * No arrow.
     */
    public static final ArrowType NONE = new ArrowType(4);
    
    public ArrowType(int value) {
        super(value);
    }
    
}
