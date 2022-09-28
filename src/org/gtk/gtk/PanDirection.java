package org.gtk.gtk;

/**
 * Describes the panning direction of a {@link GesturePan}.
 */
public class PanDirection extends io.github.jwharm.javagi.Enumeration {

    /**
     * panned towards the left
     */
    public static final PanDirection LEFT = new PanDirection(0);
    
    /**
     * panned towards the right
     */
    public static final PanDirection RIGHT = new PanDirection(1);
    
    /**
     * panned upwards
     */
    public static final PanDirection UP = new PanDirection(2);
    
    /**
     * panned downwards
     */
    public static final PanDirection DOWN = new PanDirection(3);
    
    public PanDirection(int value) {
        super(value);
    }
    
}
