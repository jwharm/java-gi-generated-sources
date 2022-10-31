package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible transitions between pages in a {@code GtkStack} widget.
 * <p>
 * New values may be added to this enumeration over time.
 */
public class StackTransitionType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkStackTransitionType";
    
    /**
     * No transition
     */
    public static final StackTransitionType NONE = new StackTransitionType(0);
    
    /**
     * A cross-fade
     */
    public static final StackTransitionType CROSSFADE = new StackTransitionType(1);
    
    /**
     * Slide from left to right
     */
    public static final StackTransitionType SLIDE_RIGHT = new StackTransitionType(2);
    
    /**
     * Slide from right to left
     */
    public static final StackTransitionType SLIDE_LEFT = new StackTransitionType(3);
    
    /**
     * Slide from bottom up
     */
    public static final StackTransitionType SLIDE_UP = new StackTransitionType(4);
    
    /**
     * Slide from top down
     */
    public static final StackTransitionType SLIDE_DOWN = new StackTransitionType(5);
    
    /**
     * Slide from left or right according to the children order
     */
    public static final StackTransitionType SLIDE_LEFT_RIGHT = new StackTransitionType(6);
    
    /**
     * Slide from top down or bottom up according to the order
     */
    public static final StackTransitionType SLIDE_UP_DOWN = new StackTransitionType(7);
    
    /**
     * Cover the old page by sliding up
     */
    public static final StackTransitionType OVER_UP = new StackTransitionType(8);
    
    /**
     * Cover the old page by sliding down
     */
    public static final StackTransitionType OVER_DOWN = new StackTransitionType(9);
    
    /**
     * Cover the old page by sliding to the left
     */
    public static final StackTransitionType OVER_LEFT = new StackTransitionType(10);
    
    /**
     * Cover the old page by sliding to the right
     */
    public static final StackTransitionType OVER_RIGHT = new StackTransitionType(11);
    
    /**
     * Uncover the new page by sliding up
     */
    public static final StackTransitionType UNDER_UP = new StackTransitionType(12);
    
    /**
     * Uncover the new page by sliding down
     */
    public static final StackTransitionType UNDER_DOWN = new StackTransitionType(13);
    
    /**
     * Uncover the new page by sliding to the left
     */
    public static final StackTransitionType UNDER_LEFT = new StackTransitionType(14);
    
    /**
     * Uncover the new page by sliding to the right
     */
    public static final StackTransitionType UNDER_RIGHT = new StackTransitionType(15);
    
    /**
     * Cover the old page sliding up or uncover the new page sliding down, according to order
     */
    public static final StackTransitionType OVER_UP_DOWN = new StackTransitionType(16);
    
    /**
     * Cover the old page sliding down or uncover the new page sliding up, according to order
     */
    public static final StackTransitionType OVER_DOWN_UP = new StackTransitionType(17);
    
    /**
     * Cover the old page sliding left or uncover the new page sliding right, according to order
     */
    public static final StackTransitionType OVER_LEFT_RIGHT = new StackTransitionType(18);
    
    /**
     * Cover the old page sliding right or uncover the new page sliding left, according to order
     */
    public static final StackTransitionType OVER_RIGHT_LEFT = new StackTransitionType(19);
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left
     */
    public static final StackTransitionType ROTATE_LEFT = new StackTransitionType(20);
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the right
     */
    public static final StackTransitionType ROTATE_RIGHT = new StackTransitionType(21);
    
    /**
     * Pretend the pages are sides of a cube and rotate that cube to the left or right according to the children order
     */
    public static final StackTransitionType ROTATE_LEFT_RIGHT = new StackTransitionType(22);
    
    public StackTransitionType(int value) {
        super(value);
    }
}
