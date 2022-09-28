package org.gtk.gtk;

/**
 * Describes which edge of a widget a certain feature is positioned at.
 * <p>
 * For examples, see the tabs of a {@link Notebook}, or the label
 * of a {@link Scale}.
 */
public class PositionType extends io.github.jwharm.javagi.Enumeration {

    /**
     * The feature is at the left edge.
     */
    public static final PositionType LEFT = new PositionType(0);
    
    /**
     * The feature is at the right edge.
     */
    public static final PositionType RIGHT = new PositionType(1);
    
    /**
     * The feature is at the top edge.
     */
    public static final PositionType TOP = new PositionType(2);
    
    /**
     * The feature is at the bottom edge.
     */
    public static final PositionType BOTTOM = new PositionType(3);
    
    public PositionType(int value) {
        super(value);
    }
    
}
