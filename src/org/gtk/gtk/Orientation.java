package org.gtk.gtk;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@code GesturePan}.
 */
public class Orientation extends io.github.jwharm.javagi.Enumeration {

    /**
     * The element is in horizontal orientation.
     */
    public static final Orientation HORIZONTAL = new Orientation(0);
    
    /**
     * The element is in vertical orientation.
     */
    public static final Orientation VERTICAL = new Orientation(1);
    
    public Orientation(int value) {
        super(value);
    }
    
}
