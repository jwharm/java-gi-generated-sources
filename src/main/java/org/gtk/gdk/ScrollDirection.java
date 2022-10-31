package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the direction for scroll events.
 */
public class ScrollDirection extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GdkScrollDirection";
    
    /**
     * the surface is scrolled up.
     */
    public static final ScrollDirection UP = new ScrollDirection(0);
    
    /**
     * the surface is scrolled down.
     */
    public static final ScrollDirection DOWN = new ScrollDirection(1);
    
    /**
     * the surface is scrolled to the left.
     */
    public static final ScrollDirection LEFT = new ScrollDirection(2);
    
    /**
     * the surface is scrolled to the right.
     */
    public static final ScrollDirection RIGHT = new ScrollDirection(3);
    
    /**
     * the scrolling is determined by the delta values
     *   in scroll events. See gdk_scroll_event_get_deltas()
     */
    public static final ScrollDirection SMOOTH = new ScrollDirection(4);
    
    public ScrollDirection(int value) {
        super(value);
    }
}
