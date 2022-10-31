package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enum for determining where a dropped item goes.
 */
public class IconViewDropPosition extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconViewDropPosition";
    
    /**
     * no drop possible
     */
    public static final IconViewDropPosition NO_DROP = new IconViewDropPosition(0);
    
    /**
     * dropped item replaces the item
     */
    public static final IconViewDropPosition DROP_INTO = new IconViewDropPosition(1);
    
    /**
     * dropped item is inserted to the left
     */
    public static final IconViewDropPosition DROP_LEFT = new IconViewDropPosition(2);
    
    /**
     * dropped item is inserted to the right
     */
    public static final IconViewDropPosition DROP_RIGHT = new IconViewDropPosition(3);
    
    /**
     * dropped item is inserted above
     */
    public static final IconViewDropPosition DROP_ABOVE = new IconViewDropPosition(4);
    
    /**
     * dropped item is inserted below
     */
    public static final IconViewDropPosition DROP_BELOW = new IconViewDropPosition(5);
    
    public IconViewDropPosition(int value) {
        super(value);
    }
}
