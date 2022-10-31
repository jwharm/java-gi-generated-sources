package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Scrolling types.
 */
public class ScrollType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkScrollType";
    
    /**
     * No scrolling.
     */
    public static final ScrollType NONE = new ScrollType(0);
    
    /**
     * Jump to new location.
     */
    public static final ScrollType JUMP = new ScrollType(1);
    
    /**
     * Step backward.
     */
    public static final ScrollType STEP_BACKWARD = new ScrollType(2);
    
    /**
     * Step forward.
     */
    public static final ScrollType STEP_FORWARD = new ScrollType(3);
    
    /**
     * Page backward.
     */
    public static final ScrollType PAGE_BACKWARD = new ScrollType(4);
    
    /**
     * Page forward.
     */
    public static final ScrollType PAGE_FORWARD = new ScrollType(5);
    
    /**
     * Step up.
     */
    public static final ScrollType STEP_UP = new ScrollType(6);
    
    /**
     * Step down.
     */
    public static final ScrollType STEP_DOWN = new ScrollType(7);
    
    /**
     * Page up.
     */
    public static final ScrollType PAGE_UP = new ScrollType(8);
    
    /**
     * Page down.
     */
    public static final ScrollType PAGE_DOWN = new ScrollType(9);
    
    /**
     * Step to the left.
     */
    public static final ScrollType STEP_LEFT = new ScrollType(10);
    
    /**
     * Step to the right.
     */
    public static final ScrollType STEP_RIGHT = new ScrollType(11);
    
    /**
     * Page to the left.
     */
    public static final ScrollType PAGE_LEFT = new ScrollType(12);
    
    /**
     * Page to the right.
     */
    public static final ScrollType PAGE_RIGHT = new ScrollType(13);
    
    /**
     * Scroll to start.
     */
    public static final ScrollType START = new ScrollType(14);
    
    /**
     * Scroll to end.
     */
    public static final ScrollType END = new ScrollType(15);
    
    public ScrollType(int value) {
        super(value);
    }
}
