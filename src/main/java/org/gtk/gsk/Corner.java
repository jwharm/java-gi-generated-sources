package org.gtk.gsk;

/**
 * The corner indices used by {@code GskRoundedRect}.
 */
public class Corner extends io.github.jwharm.javagi.Enumeration {

    /**
     * The top left corner
     */
    public static final Corner TOP_LEFT = new Corner(0);
    
    /**
     * The top right corner
     */
    public static final Corner TOP_RIGHT = new Corner(1);
    
    /**
     * The bottom right corner
     */
    public static final Corner BOTTOM_RIGHT = new Corner(2);
    
    /**
     * The bottom left corner
     */
    public static final Corner BOTTOM_LEFT = new Corner(3);
    
    public Corner(int value) {
        super(value);
    }
    
}
