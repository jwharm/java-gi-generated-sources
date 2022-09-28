package org.gtk.gtk;

/**
 * Focus movement types.
 */
public class DirectionType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Move forward.
     */
    public static final DirectionType TAB_FORWARD = new DirectionType(0);
    
    /**
     * Move backward.
     */
    public static final DirectionType TAB_BACKWARD = new DirectionType(1);
    
    /**
     * Move up.
     */
    public static final DirectionType UP = new DirectionType(2);
    
    /**
     * Move down.
     */
    public static final DirectionType DOWN = new DirectionType(3);
    
    /**
     * Move left.
     */
    public static final DirectionType LEFT = new DirectionType(4);
    
    /**
     * Move right.
     */
    public static final DirectionType RIGHT = new DirectionType(5);
    
    public DirectionType(int value) {
        super(value);
    }
    
}
