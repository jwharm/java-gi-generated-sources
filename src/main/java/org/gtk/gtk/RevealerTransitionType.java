package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These enumeration values describe the possible transitions
 * when the child of a {@code GtkRevealer} widget is shown or hidden.
 */
public class RevealerTransitionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkRevealerTransitionType";
    
    /**
     * No transition
     */
    public static final RevealerTransitionType NONE = new RevealerTransitionType(0);
    
    /**
     * Fade in
     */
    public static final RevealerTransitionType CROSSFADE = new RevealerTransitionType(1);
    
    /**
     * Slide in from the left
     */
    public static final RevealerTransitionType SLIDE_RIGHT = new RevealerTransitionType(2);
    
    /**
     * Slide in from the right
     */
    public static final RevealerTransitionType SLIDE_LEFT = new RevealerTransitionType(3);
    
    /**
     * Slide in from the bottom
     */
    public static final RevealerTransitionType SLIDE_UP = new RevealerTransitionType(4);
    
    /**
     * Slide in from the top
     */
    public static final RevealerTransitionType SLIDE_DOWN = new RevealerTransitionType(5);
    
    /**
     * Floop in from the left
     */
    public static final RevealerTransitionType SWING_RIGHT = new RevealerTransitionType(6);
    
    /**
     * Floop in from the right
     */
    public static final RevealerTransitionType SWING_LEFT = new RevealerTransitionType(7);
    
    /**
     * Floop in from the bottom
     */
    public static final RevealerTransitionType SWING_UP = new RevealerTransitionType(8);
    
    /**
     * Floop in from the top
     */
    public static final RevealerTransitionType SWING_DOWN = new RevealerTransitionType(9);
    
    public RevealerTransitionType(int value) {
        super(value);
    }
}
