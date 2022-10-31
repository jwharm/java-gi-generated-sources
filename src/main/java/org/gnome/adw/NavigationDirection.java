package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the direction of a swipe navigation gesture.
 * @version 1.0
 */
public class NavigationDirection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwNavigationDirection";
    
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
