package org.gnome.adw;

/**
 * Describes the direction of a swipe navigation gesture.
 */
public class NavigationDirection extends io.github.jwharm.javagi.Enumeration {

    /**
     * Corresponds to start or top, depending on orientation and text direction
     */
    public static final NavigationDirection BACK = new NavigationDirection(0);
    
    /**
     * Corresponds to end or bottom, depending on orientation and text direction
     */
    public static final NavigationDirection FORWARD = new NavigationDirection(1);
    
    public NavigationDirection(int value) {
        super(value);
    }
    
}
